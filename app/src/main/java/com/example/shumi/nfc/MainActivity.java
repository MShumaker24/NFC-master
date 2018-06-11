package com.example.shumi.nfc;

import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    NdefRecord rtfUriRecord1 = NdefRecord.createUri("http://example.com");

/*
    NfcAdapter nfcAdapter = NfcAdapter.getDefaultAdapter(this);

    public void setNfcAdapter() {
        if (nfcAdapter != null && nfcAdapter.isEnabled()) {
            Toast toast = Toast.makeText(this, "NFC Available", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "NFC not available", Toast.LENGTH_LONG);
            toast.show();
        }
    }
*/



    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        if (intent != null && NfcAdapter.ACTION_NDEF_DISCOVERED.equals(intent.getAction())) {
            Parcelable[] rawMessages =
                    intent.getParcelableArrayExtra(NfcAdapter.EXTRA_NDEF_MESSAGES);
            if (rawMessages != null) {
                NdefMessage[] messages = new NdefMessage[rawMessages.length];
                for (int i = 0; i < rawMessages.length; i++) {
                    messages[i] = (NdefMessage) rawMessages[i];
                }
                // Process the messages array.
            }
        }
    }

    //Tag tag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG

    int myVariable = 1;
    public double myMethod(int numberOfIceCream) {
        double iceCreamPrice = 4.50;
        double total = iceCreamPrice * numberOfIceCream;
        return total;
    }
}