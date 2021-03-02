package com.example.androiddevchallenge.nav

sealed class Route(
	prefix: String,
	val token: String = ""
) {
	val route = if (token.isNotEmpty()) "$prefix/{$token}" else prefix

	fun withArg(arg: String) = route.replace("{$token}", arg, ignoreCase = true)

	object Feed : Route("feed")
	object Detail : Route("detail", "dogName")
}
