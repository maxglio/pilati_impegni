package it.istitutopilati.pilati_impegni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView ListViewImpegni;
    private EditText editImpegni;

    private ArrayList <String> listaImpegni;
    private ArrayAdapter <String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewImpegni = (ListView) findViewById(R.id.ListViewImpegni);
        editImpegni = (EditText) findViewById(R.id.editTextImpegni);

        listaImpegni = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        ListViewImpegni.setAdapter(adapter);

        ListViewImpegni.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

            }
        });


    }
    ArrayList<String> elenco = new  ArrayList<String>();

    public void aggiungiImpegno(View v){
        String nuovoImpegno = editImpegni.getText().toString();
        if(nuovoImpegno.length() > 0){
            listaImpegni.add(0, nuovoImpegno);
        }
        Log.d("MainActivity", editImpegni.getText().toString());
        adapter.notifyDataSetChanged();

        editImpegni.setText("");
    }
}