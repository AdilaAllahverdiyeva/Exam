package com.example.exam

data class Customer(
    val id: Int,
    val imageView: String,
    val title: String,
    val address: String,
    var isActive: Boolean = false

)
