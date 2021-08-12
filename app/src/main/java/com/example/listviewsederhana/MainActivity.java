package com.example.listviewsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listItem;
    private String[] namaNegara = new String[]{"Indonesia", "Malaysia", "Singapore", "Italia", "Inggris", "Belanda", "Argentina", "Chile", "Mesir", "Uganda", "Japan", "Prancis", "Jerman", "Rusia", "Portugal", "Uruguay", "Brazil", "Australia", "Belgia", "Ceko"};
    private String[] namaIbukota = new String[]{"Jakarta", "Kuala Lumpur", "Singapore", "Roma", "London", "Amsterdam", "Buenos Aires", "Santiago de Chile", "Cairo", "Kampala", "Tokyo", "Paris", "Berlin", "Moskow", "Lisboa", "Montevideo", "Brasília", "Canberra", "Brussel", "Praha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("List View Sederhana");

        listItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.negara_view, R.id.txtNegara, namaNegara);
        listItem.setAdapter(adapter);

        listItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Negara yang dipilih: " + namaNegara[position] + "\nIbukota: " + namaIbukota[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}