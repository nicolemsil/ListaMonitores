package br.unicamp.listamonitores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //fun. callback
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reconhecer o list view de monitor (que vai receber o outro lv)
        ListView listView = (ListView) findViewById(R.id.LvMonitor);

        List<Monitor> listaMonitor = gerarMonitores();

        ListaMonitorAdapter listaMonitorAdapter = new ListaMonitorAdapter(this, listaMonitor); //instanciando o adpter passando como parametro o contexto e o que vai ser passado com informação - lista de monitores
        listView.setAdapter(listaMonitorAdapter); //setando o adapter que montei na listView
    }

    private List<Monitor> gerarMonitores(){
        List<Monitor> listaMonitoria = new ArrayList<>();

        //colocando coisa dentro da lista
        listaMonitoria.add(criarMonitor("Nouani", "Segunda-feira: 7:30 - 9:10",  R.drawable.menina));
        listaMonitoria.add(criarMonitor("Rafael", "Terça-feira: 13:00 - 13:50", R.drawable.menino1));
        listaMonitoria.add(criarMonitor("Gabriel", "Quarta-feira: 18:15 - 19:00", R.drawable.menino2));
        listaMonitoria.add(criarMonitor("Nicolas", "Quinta-feira: 8:90 - 9:10", R.drawable.menino3));
        listaMonitoria.add(criarMonitor("Ricardo",  "Segunda-feira: 16:35 - 19:00", R.drawable.menino4));

        return listaMonitoria;
    }

    private  Monitor criarMonitor(String nome, String horario, int imagem)
    {
        Monitor monitor = new Monitor(nome, horario, imagem);
        return monitor;
    }


}