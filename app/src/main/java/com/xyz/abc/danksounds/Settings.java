package com.xyz.abc.danksounds;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    String str[] = {"abc","def"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        str = getResources().getStringArray(R.array.settings);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list, str);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 2:
                        Toast.makeText(getApplicationContext(),"touch me",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(),about_dev.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }


}

