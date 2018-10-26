package com.xyz.abc.danksounds;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class about_dev extends AppCompatActivity {
    String maintitle[] = {"Name","Email","Bio"};
    String info[] = {"Vaibhav Sharma ","17532va@gmail.com","Vaibhav is a chakka at NIT Hamirpur , he made this app in first year"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_dev);
        //ArrayAdapter adapter = new ArrayAdapter<String>(this,
          //      R.layout.list, str);
        MydevAdapter adapter = new MydevAdapter(this,maintitle,info);
        ListView listView = (ListView) findViewById(R.id.dev_list);
        listView.setAdapter(adapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Dont Touch Me Soo Hard",Toast.LENGTH_LONG).show();
                return false;
            }


        });
    }
    void dontTouchme(View view){

        Toast.makeText(getApplicationContext(),"Dont touch me, I am sensitive ",Toast.LENGTH_SHORT).show();
    }

        /*


        final ListView lv = findViewById(R.id.dev_list);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String s = (String) lv.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
            }
        });*/

    }
    class MydevAdapter extends ArrayAdapter<String> {
        private  Activity context;
        private String maintitle[];
        private String info[];
        public MydevAdapter(Activity context,String maintitle[],String info[]){
            super(context, R.layout.list_dev,maintitle);
            this.context = context;
            this.maintitle = maintitle;
            this.info = info;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater Li = context.getLayoutInflater();
            View rowView = Li.inflate(R.layout.list_dev,null,true);

            TextView title = rowView.findViewById(R.id.textView_dev_title);
            TextView infoo = rowView.findViewById(R.id.textView_dev_info);

            title.setText(maintitle[position]);
            infoo.setText(info[position]);

            return rowView;


        }
    }

