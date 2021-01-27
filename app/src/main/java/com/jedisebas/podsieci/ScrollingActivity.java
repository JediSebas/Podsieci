package com.jedisebas.podsieci;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {

    EditText adres, masc, divi;
    TextView adbin, mcbin;
    TextView as1, as2, as3, as4, as5, as6, as7, as8, as9, as10, as11, as12, as13, as14, as15, as16;
    TextView ar1, ar2, ar3, ar4, ar5, ar6, ar7, ar8, ar9, ar10, ar11, ar12, ar13, ar14, ar15, ar16;
    TextView pz1, pz2, pz3, pz4, pz5, pz6, pz7, pz8, pz9, pz10, pz11, pz12, pz13, pz14, pz15, pz16;
    TextView kz1, kz2, kz3, kz4, kz5, kz6, kz7, kz8, kz9, kz10, kz11, kz12, kz13, kz14, kz15, kz16;
    TextView lhtv;
    TextView[] as = new TextView[16];
    TextView[] ar = new TextView[16];
    TextView[] pz = new TextView[16];
    TextView[] kz = new TextView[16];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        adres = (EditText) findViewById(R.id.adresipEt);
        masc = (EditText) findViewById(R.id.mascEt);
        divi = (EditText) findViewById(R.id.divideEt);

        adbin = (TextView) findViewById(R.id.adbinTv);
        mcbin = (TextView) findViewById(R.id.mcbinTv);

        lhtv = (TextView) findViewById(R.id.lhtv);

        as[0] = as1 = (TextView) findViewById(R.id.as1);
        as[1] = as2 = (TextView) findViewById(R.id.as2);
        as[2] = as3 = (TextView) findViewById(R.id.as3);
        as[3] = as4 = (TextView) findViewById(R.id.as4);
        as[4] = as5 = (TextView) findViewById(R.id.as5);
        as[5] = as6 = (TextView) findViewById(R.id.as6);
        as[6] = as7 = (TextView) findViewById(R.id.as7);
        as[7] = as8 = (TextView) findViewById(R.id.as8);
        as[8] = as9 = (TextView) findViewById(R.id.as9);
        as[9] = as10 = (TextView) findViewById(R.id.as10);
        as[10] = as11 = (TextView) findViewById(R.id.as11);
        as[11] = as12 = (TextView) findViewById(R.id.as12);
        as[12] = as13 = (TextView) findViewById(R.id.as13);
        as[13] = as14 = (TextView) findViewById(R.id.as14);
        as[14] = as15 = (TextView) findViewById(R.id.as15);
        as[15] = as16 = (TextView) findViewById(R.id.as16);

        ar[0] = ar1 = (TextView) findViewById(R.id.ar1);
        ar[1] = ar2 = (TextView) findViewById(R.id.ar2);
        ar[2] = ar3 = (TextView) findViewById(R.id.ar3);
        ar[3] = ar4 = (TextView) findViewById(R.id.ar4);
        ar[4] = ar5 = (TextView) findViewById(R.id.ar5);
        ar[5] = ar6 = (TextView) findViewById(R.id.ar6);
        ar[6] = ar7 = (TextView) findViewById(R.id.ar7);
        ar[7] = ar8 = (TextView) findViewById(R.id.ar8);
        ar[8] = ar9 = (TextView) findViewById(R.id.ar9);
        ar[9] = ar10 = (TextView) findViewById(R.id.ar10);
        ar[10] = ar11 = (TextView) findViewById(R.id.ar11);
        ar[11] = ar12 = (TextView) findViewById(R.id.ar12);
        ar[12] = ar13 = (TextView) findViewById(R.id.ar13);
        ar[13] = ar14 = (TextView) findViewById(R.id.ar14);
        ar[14] = ar15 = (TextView) findViewById(R.id.ar15);
        ar[15] = ar16 = (TextView) findViewById(R.id.ar16);

        pz[0] = pz1 = (TextView) findViewById(R.id.pz1);
        pz[1] = pz2 = (TextView) findViewById(R.id.pz2);
        pz[2] = pz3 = (TextView) findViewById(R.id.pz3);
        pz[3] = pz4 = (TextView) findViewById(R.id.pz4);
        pz[4] = pz5 = (TextView) findViewById(R.id.pz5);
        pz[5] = pz6 = (TextView) findViewById(R.id.pz6);
        pz[6] = pz7 = (TextView) findViewById(R.id.pz7);
        pz[7] = pz8 = (TextView) findViewById(R.id.pz8);
        pz[8] = pz9 = (TextView) findViewById(R.id.pz9);
        pz[9] = pz10 = (TextView) findViewById(R.id.pz10);
        pz[10] = pz11 = (TextView) findViewById(R.id.pz11);
        pz[11] = pz12 = (TextView) findViewById(R.id.pz12);
        pz[12] = pz13 = (TextView) findViewById(R.id.pz13);
        pz[13] = pz14 = (TextView) findViewById(R.id.pz14);
        pz[14] = pz15 = (TextView) findViewById(R.id.pz15);
        pz[15] = pz16 = (TextView) findViewById(R.id.pz16);

        kz[0] = kz1 = (TextView) findViewById(R.id.kz1);
        kz[1] = kz2 = (TextView) findViewById(R.id.kz2);
        kz[2] = kz3 = (TextView) findViewById(R.id.kz3);
        kz[3] = kz4 = (TextView) findViewById(R.id.kz4);
        kz[4] = kz5 = (TextView) findViewById(R.id.kz5);
        kz[5] = kz6 = (TextView) findViewById(R.id.kz6);
        kz[6] = kz7 = (TextView) findViewById(R.id.kz7);
        kz[7] = kz8 = (TextView) findViewById(R.id.kz8);
        kz[8] = kz9 = (TextView) findViewById(R.id.kz9);
        kz[9] = kz10 = (TextView) findViewById(R.id.kz10);
        kz[10] = kz11 = (TextView) findViewById(R.id.kz11);
        kz[11] = kz12 = (TextView) findViewById(R.id.kz12);
        kz[12] = kz13 = (TextView) findViewById(R.id.kz13);
        kz[13] = kz14 = (TextView) findViewById(R.id.kz14);
        kz[14] = kz15 = (TextView) findViewById(R.id.kz15);
        kz[15] = kz16 = (TextView) findViewById(R.id.kz16);

        invis();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adres.setText("");
                masc.setText("");
                divi.setText("");
                Snackbar.make(view, "Wyczyszczono pole tekstowe", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    void invis() {
        for (int i = 0; i < as.length; i++) {
            as[i].setVisibility(View.GONE);
            ar[i].setVisibility(View.GONE);
            pz[i].setVisibility(View.GONE);
            kz[i].setVisibility(View.GONE);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    void division(int d, AdresIP ad, Maska mc) {
        int am = d;
        if (am > 64) {
            mc.ones_amount += 7;
        } else if (am > 32) {
            mc.ones_amount += 6;
        } else if (am > 16) {
            mc.ones_amount += 5;
        } else if (am > 8) {
            mc.ones_amount += 4;
        } else if (am > 4) {
            mc.ones_amount += 3;
        } else if (am > 2) {
            mc.ones_amount += 2;
        } else if (am > 1) {
            mc.ones_amount++;
        }

        AdresIP[] adresy = new AdresIP[4 * am];
        for (int i = 0; i < (4*am); i++) { //przypisanie wszystkim adresom tej samej wartości
            adresy[i] = new AdresIP(ad.adres);
        }

        int num = mc.ones_amount % 8;

        for (int i = 1; i < am; i++) { //przypisanie wartości adresom sieciowym oprocz pierwszego
            for (int j = 0; j < i; j++) {
                adresy[i].decAdres[mc.ones_amount/8] += (int) Math.pow(2, (8-num));
            }
        }

        for (int i = am; i <= ((2*am)-1); i++) { //przypisanie wartości adresom broadcast
            adresy[i].decAdres[mc.ones_amount/8] = (int) (adresy[i-am].decAdres[mc.ones_amount/8] + (Math.pow(2, (8-num))-1));
        }

        if (mc.ones_amount < 8) {
            for (int i = (2*am); i < ((2*am)+am); i++) { //przypisanie wartości początkom zakresu
                adresy[i].decAdres[0] = adresy[i-(2*am)].decAdres[0];
            }

            for (int i = ((2*am)+am); i < (4*am); i++) { //przypisanie wartości końcom zakresu
                adresy[i].decAdres[1] = 255;
                adresy[i].decAdres[2] = 255;
                adresy[i].decAdres[0] = adresy[i-(2*am)].decAdres[0];
            }

            for (int i = am; i <= ((2 * am) - 1); i++) { //przypisanie wartości adresom broadcast
                adresy[i].decAdres[1] = 255;
                adresy[i].decAdres[2] = 255;
                adresy[i].decAdres[3] = 255;
            }
        }

        if (mc.ones_amount < 16) {
            for (int i = (2*am); i < ((2*am)+am); i++) { //przypisanie wartości początkom zakresu
                adresy[i].decAdres[1] = adresy[i-(2*am)].decAdres[1];
            }

            for (int i = ((2*am)+am); i < (4*am); i++) { //przypisanie wartości końcom zakresu
                adresy[i].decAdres[2] = 255;
                adresy[i].decAdres[1] = adresy[i-(2*am)].decAdres[1];
            }

            for (int i = am; i <= ((2 * am) - 1); i++) { //przypisanie wartości adresom broadcast
                adresy[i].decAdres[2] = 255;
                adresy[i].decAdres[3] = 255;
           }
        }

        if (mc.ones_amount < 24) {
            for (int i = (2*am); i < ((2*am)+am); i++) { //przypisanie wartości początkom zakresu
                adresy[i].decAdres[2] = adresy[i-(2*am)].decAdres[2];
            }

            for (int i = ((2*am)+am); i < (4*am); i++) { //przypisanie wartości końcom zakresu
                adresy[i].decAdres[2] = adresy[i-(2*am)].decAdres[2];
            }

            for (int i = am; i <= ((2 * am) - 1); i++) { //przypisanie wartości adresom broadcast
                adresy[i].decAdres[3] = 255;
            }
        }


        for (int i = (2*am); i < ((2*am)+am); i++) { //przypisanie wartości początkom zakresu
            adresy[i].decAdres[3] = adresy[i-(2*am)].decAdres[3] + 1;
        }

        for (int i = ((2*am)+am); i < (4*am); i++) { //przypisanie wartości końcom zakresu
            adresy[i].decAdres[3] = adresy[i-(2*am)].decAdres[3] - 1;
        }

        for (int i = 0; i < (4*am); i++) {
            System.out.println("[" + i + "] " + adresy[i].decAdres[mc.ones_amount/8]);
        }

        for (int i = 0; i < am; i++) {
            as[i].setVisibility(View.VISIBLE);
            as[i].setText(adresy[i].decAdres[0]+"."+adresy[i].decAdres[1]+"."+
                    adresy[i].decAdres[2]+"."+adresy[i].decAdres[3]);
        }

        int iiii = am;
        for (int j = 0; j < am; j++) {
            ar[j].setVisibility(View.VISIBLE);
            ar[j].setText(adresy[iiii].decAdres[0]+"."+adresy[iiii].decAdres[1]+"."+
                        adresy[iiii].decAdres[2]+"."+adresy[iiii].decAdres[3]);
            iiii++;
        }

        int pppp = 2*am;
        for (int j = 0; j < am; j++) {
            pz[j].setVisibility(View.VISIBLE);
            pz[j].setText(adresy[pppp].decAdres[0]+"."+adresy[pppp].decAdres[1]+"."+
                    adresy[pppp].decAdres[2]+"."+adresy[pppp].decAdres[3]);
            pppp++;
        }

        int kkkk = ((2*am)+am);
        for (int j = 0; j < am; j++) {
            kz[j].setVisibility(View.VISIBLE);
            kz[j].setText(adresy[kkkk].decAdres[0]+"."+adresy[kkkk].decAdres[1]+"."+
                    adresy[kkkk].decAdres[2]+"."+adresy[kkkk].decAdres[3]);
            kkkk++;
        }

        int lhi = (int) Math.pow(2, 32 - mc.ones_amount);
        String lh = Integer.toString(lhi-2);
        lhtv.setText(lh);
    }

    public void click(View view) {
        invis();
        AdresIP ip;
        Maska mc;
        int amm;
        try {
            ip = new AdresIP(adres.getText().toString().trim());
        } catch (Exception e) { ip = new AdresIP("192.168.1.10"); adres.setText("192.168.1.10");
            Snackbar.make(view, "Błędny adres IP", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();}
        try {
            mc = new Maska(masc.getText().toString().trim());
        } catch (Exception e) { mc = new Maska("/25"); masc.setText("/25");
            Snackbar.make(view, "Błędna maska", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();}
        try {
            amm = Integer.parseInt(divi.getText().toString().trim());
        } catch (NumberFormatException e) { divi.setText("1"); amm = 1;
            Snackbar.make(view, "Nie podano ilości podsieci lub nic nie podano", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();}

        if (mc.ones_amount + amm > 32) {
            mc = new Maska("/25");
            masc.setText("/25");
            divi.setText("1");
            amm = 1;
            Snackbar.make(view, "Zbyt duża maska lub ilość sieci do podzielenia", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }

        division(amm, ip, mc);

        adbin.setText(ip.binary[0]+"."+ip.binary[1] +"."+ip.binary[2]+"."+ip.binary[3]);
        mcbin.setText(mc.binary[0]+"."+mc.binary[1] +"."+mc.binary[2]+"."+mc.binary[3]);
    }
}
