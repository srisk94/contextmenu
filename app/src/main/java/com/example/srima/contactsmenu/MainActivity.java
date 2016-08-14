package com.example.srima.contactsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String contacts[]={"ajay","vijay","ramesh","suresh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list,contacts);
        listview.setAdapter(adapter);
        registerForContextMenu(listview);
    }
public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
    super.onCreateContextMenu(menu,v,menuInfo);
    getMenuInflater().inflate(R.menu.menu_textview, menu);
}
    public boolean onContextItemSelected(MenuItem item){
        switch(item.getItemId()) {
            case R.id.sms:
                Toast.makeText(this, "you are selected sms options", Toast.LENGTH_LONG).show();
                break;
            case R.id.call:
                Toast.makeText(this, "you are selected call options", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
        return true;
    }
}
