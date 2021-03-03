package com.example.androiddevchallenge.ui.feed

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.AdoptionCenter
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.ui.theme.PawesomeColor
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun FavoriteHeart() {
	val isFavorite = remember { mutableStateOf(false) }
	val color = animateColorAsState(
		if (isFavorite.value) {
			PawesomeColor.brightOrange
		} else {
			if (isSystemInDarkTheme()) {
				Color.White
			} else {
				Color.Black
			}
		}
	)

	IconButton(
		modifier = Modifier,
		onClick = { isFavorite.value = isFavorite.value.not() }
	) {
		Icon(
			imageVector = if (isFavorite.value) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
			contentDescription = "Favorite",
			tint = color.value
		)
	}
}

@Preview("Item", widthDp = 360)
@Composable
fun FeedItem(
	dog: Dog = AdoptionCenter.dogs.first(),
	onNavigateToDog: (Dog) -> Unit = {}
) {
	Card(
		modifier = Modifier
			.padding(8.dp)
			.fillMaxWidth()
			.clip(RoundedCornerShape(8.dp))
			.clickable { onNavigateToDog(dog) }
	) {
		Column(
			verticalArrangement = Arrangement.SpaceBetween,
			horizontalAlignment = Alignment.CenterHorizontally
		) {
			Image(
				alignment = Alignment.TopCenter,
				modifier = Modifier
					.height(250.dp)
					.fillMaxWidth()
					.clip(RoundedCornerShape(8.dp)),
				painter = painterResource(id = dog.images.first()),
				contentDescription = dog.name,
				contentScale = ContentScale.Crop
			)
			Row(
				modifier = Modifier
					.fillMaxWidth()
					.padding(16.dp),
				horizontalArrangement = Arrangement.SpaceBetween,
				verticalAlignment = Alignment.CenterVertically
			) {
				Text(
					text = "${dog.name} from ${dog.location}",
					style = typography.body1
				)
				FavoriteHeart()
			}
		}
	}
}