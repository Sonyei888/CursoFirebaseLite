package com.sonyei888.cursofirebaselite.presetation.home

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

@Composable
fun HomeScreen(db: FirebaseFirestore) {
    Button(onClick = {
        createArtist(db)
    }) {
        Text(text = "Añadir artista")
    }


}

data class Artist(
    val name: String, val numberOfSong: Int
)

fun createArtist(db: FirebaseFirestore) {
    val random = (1..10000).random()
    val artist = Artist(name = "Random $random", numberOfSong = random)

    db.collection("artists")
        .add(artist)
        .addOnSuccessListener {
            Log.i("Sonyei888", "Success")
        }
        .addOnFailureListener {
            Log.i("Sonyei888", "Failure")
        }
        .addOnCompleteListener {
            Log.i("Sonyei888", "Complete")
        }
}