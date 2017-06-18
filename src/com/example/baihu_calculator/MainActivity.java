package com.example.baihu_calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    
    
        
    }
    public void four(View v)
    {
    	Intent intent =new Intent(this,four_game.class);
    	startActivity(intent);
    }

    public void three(View v)
    {
    	Intent intent =new Intent(this,three_game.class);
    	startActivity(intent);
    }
}
