package de.bfw.slk_aufgabe;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FABActivity extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slk2_layout);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == fab.getId()) {
            Log.i("FAB", "geklickt");
            Toast.makeText(getApplicationContext(), "FAB GEKLICKT WOOOOO", Toast.LENGTH_SHORT).show();
        }
    }
}