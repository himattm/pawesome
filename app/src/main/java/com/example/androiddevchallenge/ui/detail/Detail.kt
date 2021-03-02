package com.example.androiddevchallenge.ui.detail

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.androiddevchallenge.data.AdoptionCenter
import com.example.androiddevchallenge.data.Dog

@Composable
fun DogDetail(
	navController: NavController,
	dogName: String? = AdoptionCenter.dogs.first().name
) {
	Log.d("mcm", "All dogs " + AdoptionCenter.dogs.toString())
	Log.d("mcm", "CUrrent Dog Name = $dogName")
	val dog = AdoptionCenter.dogs.first { it.name == dogName }
	Details(dog)
}

@Composable
fun Details(dog: Dog) {
	Image(
		painter = painterResource(id = dog.images.first()),
		contentDescription = dog.name
	)
}

@Preview
@Composable
fun Preview_Details() {
	Details(AdoptionCenter.dogs[3])
}