package br.unicamp.listamonitores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

class ListaMonitorAdapter extends ArrayAdapter<Monitor> {
    private Context context;
    private List<Monitor> listaMonitor = null;

    public ListaMonitorAdapter(Context context, List<Monitor> listaMonitor)
    {
        super(context, 0, listaMonitor);

        this.context = context;
        this.listaMonitor = listaMonitor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

        Monitor monitor = listaMonitor.get(position);
        if(view == null)
            view = LayoutInflater.from(context).inflate(R.layout.listamonitores,null);

        ImageView imageViewMonitor = (ImageView) view.findViewById(R.id.imgMonitor);
        TextView tvNomeMonitor = (TextView) view.findViewById(R.id.tvNome);
        TextView tvHorarioMonitor = (TextView) view.findViewById(R.id.tvHorario);

        imageViewMonitor.setImageResource(monitor.getImagem());
        tvNomeMonitor.setText(monitor.getNome());
        tvHorarioMonitor.setText(monitor.getHorario());

        return view;

    }
}
