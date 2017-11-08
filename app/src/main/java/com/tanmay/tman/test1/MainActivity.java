package com.tanmay.tman.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView; //declaring the obj of the class ListView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.list); //initializing the object list

        final String[] dataSource = new String[] {  //data to be shown in the list
                "Physics",
                "Chemistry",
                "Maths",
                "English",
                "Computers"
        };
        final int[] dataSource2 = new int[] {  //data to be shown in the list
                100,
                88,
                44,
                33,
                22
        };

        //this is the adapter obj first arg is context(this), 2nd arg is the default xml
        //3rd arg is data source
        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
        //        android.R.layout.simple_list_item_1,dataSource);

        MyAdapter myAdapter = new MyAdapter(dataSource, dataSource2, this);



        // calling function setAdapter arg is adapter
        listView.setAdapter(myAdapter);

        //
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int i, long l) {

                Toast.makeText(MainActivity.this, "u have pressed "+dataSource[i],
                        Toast.LENGTH_SHORT).show();


            }
        });


    }
}
