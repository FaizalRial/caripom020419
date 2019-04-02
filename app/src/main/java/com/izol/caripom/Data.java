package com.izol.caripom;
import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Avin on 08/08/2018.
 */

public class Data {
    public String nama;
    public String jenis;
    public String jam;
    public String pertamax;
    public String pertalite;
    public String solar;

    public Data() {
    }

    public Data(String nama, String jenis, String jam, String pertamax, String pertalite, String solar) {
        this.nama = nama;
        this.jenis = jenis;
        this.jam = jam;
        this.pertamax = pertamax;
        this.pertalite = pertalite;
        this.solar = solar;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("Nama", nama);
        result.put("Jenis", jenis);
        result.put("Jam", jam);
        result.put("Pertamax", pertamax);
        result.put("Pertalite", pertalite);
        result.put("Solar", solar);
        return result;
    }

}