package com.benkim.fun_camera_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform