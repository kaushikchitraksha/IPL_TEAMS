package com.example.ipl_teams;

import android.app.Activity;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class PlayersAdapter extends ArrayAdapter<Players> {

    private int mColorValue;

    public PlayersAdapter(Activity context, ArrayList<Players> player,int colorId){
        super(context,0,player);
        mColorValue = colorId;
    }
    @Override
    public View getView(int position, android.view.View convertView, ViewGroup parent) {
        View listItemView = convertView; // listItemView is currently referring the root LinerLayout for the list_item layout
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listiteam, parent, false);
        }
        Players player = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.playerImageId);
        imageView.setImageResource(player.getmImageRecId());

        View textContainer = listItemView.findViewById(R.id.textContainer);

        int color = ContextCompat.getColor(getContext(),mColorValue);

        textContainer.setBackgroundColor(color);


        TextView textView = (TextView) listItemView.findViewById(R.id.playerNameId);
        textView.setText(player.getmPlayerName());

        return listItemView;
    }
}
