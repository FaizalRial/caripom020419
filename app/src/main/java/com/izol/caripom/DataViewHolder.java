package com.izol.caripom;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


/**
 * Created by Avin on 08/08/2018.
 */

public class DataViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNama;
    public TextView tvJenis;
    public TextView tvJam;
    public TextView tvPertamax;
    public TextView tvPertalite;
    public TextView tvSolar;

    public DataViewHolder(View itemView) {
        super(itemView);
        tvNama = itemView.findViewById(R.id.tv_nama);
        tvJenis = itemView.findViewById(R.id.tv_jenis);
        tvJam = itemView.findViewById(R.id.tv_jam);
        tvPertamax = itemView.findViewById(R.id.tv_pertamax);
        tvPertalite = itemView.findViewById(R.id.tv_pertalite);
        tvSolar = itemView.findViewById(R.id.tv_solar);
    }

    public void bindToData(Data data, View.OnClickListener onClickListener) {
        tvNama.setText(data.nama);
        tvJenis.setText(data.jenis);
        tvJam.setText(data.jam);
        tvPertamax.setText(data.pertamax);
        tvPertalite.setText(data.pertalite);
        tvSolar.setText(data.solar);
    }
}