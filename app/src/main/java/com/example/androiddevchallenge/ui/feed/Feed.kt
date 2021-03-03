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
package com.example.androiddevchallenge.ui.feed

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.AdoptionCenter
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.ui.theme.PawesomeTheme

@Composable
fun PawesomeFeed(
    onNavigateToDog: (Dog) -> Unit,
) {
    Scaffold(
        topBar = { PawesomeTopBar() },
    ) {
        Feed(
            dogs = AdoptionCenter.dogs,
            onNavigateToDog = onNavigateToDog
        )
    }
}

@Composable
fun PawesomeTopBar() {
    TopAppBar(
        title = {
            Text(text = "Pawesome")
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Search, contentDescription = "Search")
            }
        }
    )
}

@Composable
fun Feed(
    dogs: List<Dog>,
    onNavigateToDog: (Dog) -> Unit,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberLazyListState()

    LazyColumn(
        modifier = modifier,
        state = scrollState,
        content = {
            items(dogs) { dog ->
                FeedItem(
                    dog = dog,
                    onNavigateToDog = onNavigateToDog
                )
            }
        }
    )
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    PawesomeTheme {
        PawesomeFeed(
            onNavigateToDog = {}
        )
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    PawesomeTheme(darkTheme = true) {
        PawesomeFeed(
            onNavigateToDog = {}
        )
    }
}
