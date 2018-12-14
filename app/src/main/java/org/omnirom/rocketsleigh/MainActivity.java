package org.omnirom.rocketsleigh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, com.google.android.apps.santatracker.rocketsleigh.RocketSleighActivity.class));
        finish();
    }
}
