package com.example.intent_advanced;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BTN_Phone_Trig(View view) {
        //Intent intent = new Intent(Intent.ACTION_DIAL);//到撥號介面
        Intent intent = new Intent(Intent.ACTION_CALL);//直接撥出電話
        Uri data = Uri.parse("tel:104");
        intent.setData(data);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void BTN_Google_Map_Trig(View view) {
        //參考自Google Maps Platform (geo:latitude,longitude?z=zoom)
        Uri gmmIntentUri = Uri.parse("geo:24.1462,120.7335?z=13");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void BTN_Google_Chrome_Trig(View view) {
        Uri uri = Uri.parse("https://www.google.com/");
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(uri);
        MainActivity.this.startActivity(intent);
    }
}