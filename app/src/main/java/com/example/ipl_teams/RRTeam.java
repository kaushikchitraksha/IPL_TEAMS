package com.example.ipl_teams;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RRTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayList<Players> player = new ArrayList<Players>();

        player.add(new Players(R.drawable.rr1,"Sanju Samson","https://www.iplt20.com/teams/rajasthan-royals/squad-details/258"));
        player.add(new Players(R.drawable.rr2,"Devdutt Padikkal","https://www.iplt20.com/teams/rajasthan-royals/squad-details/5430"));
        player.add(new Players(R.drawable.rr3,"Jos Buttler","https://www.iplt20.com/teams/rajasthan-royals/squad-details/509"));
        player.add(new Players(R.drawable.rr4,"Shimron Hetmyer","https://www.iplt20.com/teams/rajasthan-royals/squad-details/1705"));
        player.add(new Players(R.drawable.rr5,"Yashasvi Jaiswal","https://www.iplt20.com/teams/rajasthan-royals/squad-details/13538"));
        player.add(new Players(R.drawable.rr6,"Ravichandran Ashwin","https://www.iplt20.com/teams/rajasthan-royals/squad-details/8"));
        player.add(new Players(R.drawable.rr7,"Riyan Parag","https://www.iplt20.com/teams/rajasthan-royals/squad-details/4445"));
        player.add(new Players(R.drawable.rr8,"Kuldeep Sen","https://www.iplt20.com/teams/rajasthan-royals/squad-details/20616"));
        player.add(new Players(R.drawable.rr9,"Trent Boult","https://www.iplt20.com/teams/rajasthan-royals/squad-details/969"));
        player.add(new Players(R.drawable.rr10,"Obed McCoy","https://www.iplt20.com/teams/rajasthan-royals/squad-details/20618"));
        player.add(new Players(R.drawable.rr11,"Prasidh Krishna","https://www.iplt20.com/teams/rajasthan-royals/squad-details/5105"));
        player.add(new Players(R.drawable.rr12,"Yuzvendra Chahal","https://www.iplt20.com/teams/rajasthan-royals/squad-details/111"));

        PlayersAdapter adapter = new PlayersAdapter(RRTeam.this,player,R.color.Raj);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Players players = player.get(i);
                Intent intent = new Intent();
                intent.setData(Uri.parse(players.getmUrl()));
                startActivity(intent);
            }
        });



        listView.setAdapter(adapter);

    }
}