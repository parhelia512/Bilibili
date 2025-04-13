package com.ke.biliblli.common

import kotlinx.serialization.Serializable

sealed interface Screen {

    @Serializable
    data object Splash : Screen

    @Serializable
    data object Main : Screen

    @Serializable
    data class VideoDetail(val bvid: String) : Screen

    @Serializable
    data object Login : Screen
}