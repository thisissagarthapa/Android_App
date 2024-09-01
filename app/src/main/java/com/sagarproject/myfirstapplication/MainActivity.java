package com.sagarproject.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void sendNow(View view) {
        // Using the correct syntax for displaying a Toast message
        Toast.makeText(MainActivity.this, "send data", Toast.LENGTH_SHORT).show();
    }
    public void receiveNow(View view) {
        // Using the correct syntax for displaying a Toast message
        Toast.makeText(MainActivity.this, "receive data", Toast.LENGTH_SHORT).show();
    }
    public void deleteNow(View view) {
        // Using the correct syntax for displaying a Toast message
        Toast.makeText(MainActivity.this, "delete data", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
