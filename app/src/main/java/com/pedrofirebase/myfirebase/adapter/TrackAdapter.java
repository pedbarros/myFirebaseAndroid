package com.pedrofirebase.myfirebase.adapter;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;

import com.pedrofirebase.myfirebase.R;
import com.pedrofirebase.myfirebase.domain.Track;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
/**
 * Created by pedro on 23/09/2017.
 */


public class TrackAdapter extends ArrayAdapter<Track> {

    private Activity context;
    private List<Track> tracks;

    public TrackAdapter(Activity context, List<Track> tracks) {
        super(context, R.layout.layout_artist_list, tracks);
        this.context = context;
        this.tracks = tracks;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_artist_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewRating = (TextView) listViewItem.findViewById(R.id.textViewGenre);

        Track track = tracks.get(position);
        textViewName.setText(track.getTrackName());
        textViewRating.setText(String.valueOf(track.getRating()));

        return listViewItem;
    }
}
