/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.detail

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.AdoptionCenter
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.ui.theme.PawesomeColor
import com.example.androiddevchallenge.ui.theme.typography
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun DogDetail(
    dogName: String? = AdoptionCenter.dogs.first().name
) {
    Details(
        dog = AdoptionCenter.dogs.first { it.name == dogName }
    )
}

@Composable
fun Details(dog: Dog) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AutoScrollLazyRow(dog)
        DetailBody1(dog)
        DetailBody2(dog)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AdoptButton(
            dog = dog,
            onAdoptClicked = { /*TODO*/ }
        )
    }
}

@Composable
fun DetailBody1(dog: Dog) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Name(dog)
            Breed(dog)
            Age(dog)
            Sex(dog)
        }
    }
}

@Composable
fun DetailBody2(dog: Dog) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Location(dog)
            DogColor(dog)
            Weight(dog)
        }

        Description(
            dog,
            modifier = Modifier
        )
    }
}

@Composable
fun AutoScrollLazyRow(dog: Dog) {
    val scrollState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    val currentIndex = remember { mutableStateOf(0) }

    LazyRow(
        modifier = Modifier
            .fillMaxHeight(0.5F)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        state = scrollState,
        content = {
            items(items = dog.images) { imageResId ->
                Image(
                    alignment = Alignment.TopCenter,
                    modifier = Modifier
                        .width(450.dp)
                        .fillMaxHeight(),
                    painter = painterResource(id = imageResId),
                    contentDescription = dog.name,
                    contentScale = ContentScale.Crop
                )
            }

            coroutineScope.launch {
                while (true) {
                    scrollState.animateScrollToItem(currentIndex.value)
                    Log.d("mcm", "index = ${currentIndex.value}")
                    currentIndex.value += 1
                    if (currentIndex.value >= dog.images.size) {
                        currentIndex.value = 0
                    }
                    delay(2000L)
                }
            }
        }
    )
}

@Composable
fun Name(dog: Dog, modifier: Modifier = Modifier) {
    Text(text = dog.name, modifier = modifier, style = typography.h6)
}

@Composable
fun Breed(dog: Dog, modifier: Modifier = Modifier) {
    Text(text = dog.breed, modifier = modifier, style = typography.h6)
}

@Composable
fun Age(dog: Dog, modifier: Modifier = Modifier) {
    Text(text = dog.age.toString(), modifier = modifier, style = typography.h6)
}

@Composable
fun Weight(dog: Dog, modifier: Modifier = Modifier) {
    if (dog.weight > 0) {
        Text(text = "${dog.weight} lbs", modifier = modifier)
    }
}

@Composable
fun DogColor(dog: Dog, modifier: Modifier = Modifier) {
    Text(text = dog.color, modifier = modifier)
}

@Composable
fun Location(dog: Dog, modifier: Modifier = Modifier) {
    Text(text = dog.location, modifier = modifier)
}

@Composable
fun Sex(dog: Dog, modifier: Modifier = Modifier) {
    Text(text = dog.sex.toString(), modifier = modifier)
}

@Composable
fun Description(dog: Dog, modifier: Modifier = Modifier) {
    Text(text = dog.description, modifier = modifier, style = typography.body1)
}

@Composable
fun DogUrl(url: String, modifier: Modifier = Modifier) {
    Text(text = url, modifier = modifier)
}

@Composable
fun AdoptButton(
    dog: Dog,
    onAdoptClicked: (Dog) -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        modifier = modifier.fillMaxWidth(0.5F),
        onClick = { onAdoptClicked(dog) }
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(8.dp)),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Adopt",
                tint = PawesomeColor.brightOrange
            )
            Text(text = "Adopt", style = typography.button)
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun Preview_Details() {
    Details(AdoptionCenter.dogs[3])
}
