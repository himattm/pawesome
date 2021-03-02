package com.example.androiddevchallenge.ui.feed


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.androiddevchallenge.data.AdoptionCenter
import com.example.androiddevchallenge.data.Dog


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

//
//@Preview("Light Theme", widthDp = 360, heightDp = 640)
//@Composable
//fun LightPreview() {
//	PawesomeTheme {
//		PawesomeFeed(
//			NavHostController(),
//			onNavigateToDog = {}
//		)
//	}
//}
//
//@Preview("Dark Theme", widthDp = 360, heightDp = 640)
//@Composable
//fun DarkPreview() {
//	PawesomeTheme(darkTheme = true) {
//		PawesomeFeed(
//			onNavigateToDog = {}
//		)
//	}
//}