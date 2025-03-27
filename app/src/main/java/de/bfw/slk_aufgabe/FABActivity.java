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

/**
 * erstellt am 27.03.2025
 *
 * @author t07
 *
 * Diese Klasse enthält die Logik für den FAB
 */
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

    /**
     * ABC gibt einen nicht zusammengesetzten String zurück
     * @param a Name des Autors
     * @param b ID des Autors
     * @return zusammengesetzer String aus a und b
     */
    public String getABC(String a, int b) {
        return a + b;
    }
}