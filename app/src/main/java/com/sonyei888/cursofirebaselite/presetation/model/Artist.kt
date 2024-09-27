package com.sonyei888.cursofirebaselite.presetation.model

data class Artist(
    val name:String,
    val description:String,
    val image:String,
    val songs:List<Song>
)