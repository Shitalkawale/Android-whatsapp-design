package com.example.whatsappdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    ListView listView;
    Information information;

    int[] profile={
            R.drawable.nature1,
            R.drawable.nature2,
            R.drawable.nature3,
            R.drawable.nature4,
            R.drawable.nature5,
            R.drawable.nature6,
            R.drawable.nature7,
            R.drawable.nature8,
            R.drawable.nature1,
            R.drawable.nature2,
            R.drawable.nature3,
            R.drawable.nature4

    };


    String[] name={"Shital","Siddharth","Abhi","Supriya","Pooja","Sayali","Rutuja","Payal","Shital","Siddharth","Abhi","Supriya"};

    int [] delevermsg={
            R.drawable.ic_baseline_check_24,
            R.drawable.ic_baseline_done_all_24,
            R.drawable.ic_baseline_done_all1_24,
            R.drawable.ic_baseline_check_24,
            R.drawable.ic_baseline_done_all_24,
            R.drawable.ic_baseline_check_24,
            R.drawable.ic_baseline_done_all1_24,
            R.drawable.ic_baseline_done_all_24,
            R.drawable.ic_baseline_done_all_24,
            R.drawable.ic_baseline_check_24,
            R.drawable.ic_baseline_done_all1_24,
            R.drawable.ic_baseline_done_all_24

    };

    String[] msg={"Hii","What are you doing?","How are you?","I am Fine","Where are you?","How are you!","Good Morning","Where are you?","Hii","What are you doing?","How are you?","I am Fine"};
    String [] timing={"09:32AM","10:56AM","yesterday","12:30PM","22/3/20","08:02AM","Yesterday","22/5/21","09:32AM","10:56AM","yesterday","12:30PM"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar=findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);
        listView=findViewById(R.id.listview);

       information=new Information(this,profile,name,delevermsg,msg,timing);
       listView.setAdapter(information);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.search:
                Toast.makeText(getApplicationContext(), "select search", Toast.LENGTH_SHORT).show();
                break;

            case R.id.newgroup:
                Toast.makeText(getApplicationContext(), "select New group", Toast.LENGTH_SHORT).show();
                break;

            case R.id.newbroadcast:
                Toast.makeText(getApplicationContext(), "select New Broadcast", Toast.LENGTH_SHORT).show();
                break;

            case R.id.whatsappweb:
                Toast.makeText(getApplicationContext(), "select WhatsApp Web", Toast.LENGTH_SHORT).show();
                break;

            case R.id.starredmessage:
                Toast.makeText(getApplicationContext(), "select Starred Messages", Toast.LENGTH_SHORT).show();
                break;

            case R.id.payments:
                Toast.makeText(getApplicationContext(), "select Payments", Toast.LENGTH_SHORT).show();
                break;

            case R.id.setting:
                Toast.makeText(getApplicationContext(), "select setting", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}