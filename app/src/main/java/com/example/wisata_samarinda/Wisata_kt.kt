package com.example.wisata_samarinda

import java.io.Serializable

data class Wisata(
    val name: String,
    val description: String,
    val photo: String
) : Serializable