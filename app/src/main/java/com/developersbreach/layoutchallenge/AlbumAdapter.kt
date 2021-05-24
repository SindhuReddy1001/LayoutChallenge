package com.developersbreach.layoutchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.developersbreach.layoutchallenge.AlbumAdapter.*

class AlbumAdapter(
    private val albumList : List<Album>
) : RecyclerView.Adapter<AlbumViewHolder>() {

    class AlbumViewHolder(
        itemView : View
    ) : RecyclerView.ViewHolder(itemView){

        private val albumName: TextView = itemView.findViewById(R.id.music_dark_background)
        private val artistName: TextView = itemView.findViewById(R.id.music_dark_background)

        fun bind(
            album: Album
        ){
            albumName.text = album.name
            artistName.text = album.artist
            albumName.setOnClickListener {
                Toast.makeText(albumName.context, album.artist, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AlbumViewHolder{
        return AlbumViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.music_dark_background, parent,false
            )
        )
    }
    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int){
        val album: Album = albumList[position]
        holder.bind(album)
    }
    override fun getItemCount(): Int {
        return albumList.size
    }
}