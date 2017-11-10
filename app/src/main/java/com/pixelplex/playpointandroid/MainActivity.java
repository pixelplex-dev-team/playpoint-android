package com.pixelplex.playpointandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.pixelplex.playpointcore.Logger;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.gen_logs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logger.getInstance().writeLog(UUID.randomUUID().toString());
                Toast.makeText(MainActivity.this,"Generated",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
