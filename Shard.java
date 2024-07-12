package com.example.android_S;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bankapplication.R;

public class Shard extends AppCompatActivity {
SharedPreferences sharedPreferences;
SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shard);
//        this step to save(Write In ShardPreferences)
//        setup ShardPreferences                   file name       security in file
        sharedPreferences=getSharedPreferences("shard_name",MODE_PRIVATE);

    }
    public void writeInShardPreferences(){

        //instance from ShardPreferences Editor to put/remove/clear to ShardPreferences
        editor = sharedPreferences.edit();
          //    put       key   value
        editor.putString("Key1", "Value1");
        editor.putString("Key2", "Value2");
            //  remove key
         editor.remove("key2");
        //        to take listener from sharedPreferences

//        SharedPreferences.OnSharedPreferenceChangeListener listener = new SharedPreferences.OnSharedPreferenceChangeListener() {
//            @Override
//            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
//
//                if (key.equals("your_preference_key")) {
//                    TODO any thing
//                    String newValue = sharedPreferences.getString(key, "default");
//                    TODO new action
//                }
//            }
//        };
//              TODO execute listener
//        sharedPreferences.registerOnSharedPreferenceChangeListener(listener);

        //  execute changes
        editor.apply();
    }
    public  void readInShardPreferences(){
//        get Instance shardPreferences by key
        sharedPreferences.getString("key","defaultValue");




    }
}