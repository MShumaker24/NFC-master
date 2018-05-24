package com.example.shumi.nfc;

import android.nfc.NfcAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    NfcAdapter nfcAdapter = NfcAdapter.getDefaultAdapter(this);

    public void setNfcAdapter() {
        if (nfcAdapter != null && nfcAdapter.isEnabled()) {
            Toast toast = Toast.makeText(this, "NFC Availible", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "NFC not availible", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
