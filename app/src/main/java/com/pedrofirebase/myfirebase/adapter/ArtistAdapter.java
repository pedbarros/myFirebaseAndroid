package com.pedrofirebase.myfirebase.adapter;

/**
 * Created by pedro on 23/09/2017.
 */

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.pedrofirebase.myfirebase.R;
import com.pedrofirebase.myfirebase.domain.Artist;

import java.util.List;

/**
 * Created by pedro.barros on 23/09/2017.
 */

public class ArtistAdapter extends ArrayAdapter<Artist> {
    private Activity context;
    List<Artist> artists;

    public ArtistAdapter(Activity context, List<Artist> artists) {
        super(context, R.layout.layout_artist_list, artists);
        this.context = context;
        this.artists = artists;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_artist_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewGenre = (TextView) listViewItem.findViewById(R.id.textViewGenre);

        Artist artist = artists.get(position);
        textViewName.setText(artist.getArtistName());
        textViewGenre.setText(artist.getArtistGenre());

        return listViewItem;
    }
}