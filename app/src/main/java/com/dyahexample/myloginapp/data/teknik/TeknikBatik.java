package com.dyahexample.myloginapp.data.teknik;

import com.dyahexample.myloginapp.R;
import com.dyahexample.myloginapp.data.batik.BatikEntity;

import java.util.ArrayList;

public class TeknikBatik {
    private static String[] teknikBatik = {
            "Teknik Canting Tulis",
            "Teknik Celup ikat",
            "Teknik Cap",
            "Teknik Colet",
    };

    private static String[] teknikDeskripsi ={
            "Teknik canting tulis adalah teknik membatik dengan menggunakan alat yang disebut canting. Canting berfungsi untuk menorehkan cairan malam atau lilin pada sebagian pola di kain mori. Teknik ini membutuhkan ketelitian dan keuletan yang tinggi, sehingga tak heran harga batik tulis cukup mahal. Jadi, saat kain dimasukkan ke dalam larutan pewarna, bagian yang tertutup malam tidak terkena warna. Membatik dengan canting tulis disebut juga teknik membatik tradisional yang banyak ditemukan di Jawa. Teknik ini dapat dikatakan sebagai salah satu yang termudah. Teknik celup ikat merupakan pembuatan motif pada kain dengan cara mengikat sebagian kain, lalu dicelupkan ke dalam larutan pewarna. Setelah diangkat dari larutan pewarna, ikatan dibuka sehingga bagian yang diikat tidak terkena warna.",
            "Teknik ini dapat dikatakan sebagai salah satu yang termudah. Teknik celup ikat merupakan pembuatan motif pada kain dengan cara mengikat sebagian kain, lalu dicelupkan ke dalam larutan pewarna. Setelah diangkat dari larutan pewarna, ikatan dibuka sehingga bagian yang diikat tidak terkena warna. Teknik celup ikat ini menggunakan tali, benang, dan karet sebagai bahan penghambat atau perintang warna. Celup ikat dikenal di beberapa daerah di Indonesia dengan nama jumputan, tritik (Jawa Tengah dan Yogyakarta) , Sasirangan (Banjarmasin), dan Pelangi (Palembang)",
            "Teknik batik cap dilakukan dengan menggunakan alat canting cap. Caranya, canting cap dicelupkan pada cairan malam, lalu ditorehkan di atas kain mori. Teknik membatik satu ini memiliki kelebihan, yaitu menjadi teknik yang pembuatannya relatif cepat selesai.",
            "Teknik membatik colet biasa disebut juga dengan teknik lukis. Melalui teknik colet, pembatik dapat mengoleskan pewarna kain dengan kuas, lalu melukis motif di atas kain mori. Teknik ini membutuhkan jiwa seni yang tinggi, karena pembuatnya harus jeli dan kreatif. Langkah demi langkah harus dilakukan dengan tepat agar warnanya menyatu dan tidak ada kesenjangan. Dalam batik colet, semakin bagus motifnya, maka harganya juga akan semakin tinggi.",};

    private static int[] teknikGambar ={
            R.drawable.cantingg,
            R.drawable.celupikat,
            R.drawable.teknikcap,
            R.drawable.teknikcolet,
    };


    private static int length;

    public static ArrayList<TeknikEntity>getListBatik() {
        ArrayList<TeknikEntity> list = new ArrayList<>();
        for (int position = 0; position < teknikBatik.length; position++) {
            TeknikEntity teknikEntity = new TeknikEntity();
            teknikEntity.setTeknikBatik(teknikBatik[position]);
            teknikEntity.setTeknikDeskripsi(teknikDeskripsi[position]);
            teknikEntity.setTeknikGambar(teknikGambar[position]);
            list.add(teknikEntity);
        }
        return list;
    }
    };

