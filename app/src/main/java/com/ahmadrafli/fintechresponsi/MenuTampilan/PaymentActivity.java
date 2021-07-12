package com.ahmadrafli.fintechresponsi.MenuTampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.ahmadrafli.fintechresponsi.R;
import com.google.zxing.integration.android.IntentIntegrator;

public class PaymentActivity extends AppCompatActivity {
private Button btnScan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Button btnScan = findViewById(R.id.scan_btn);
        final Activity activity = this;

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrator.setPrompt("SCAN");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(true);
                integrator.setBarcodeImageEnabled(true);
                integrator.initiateScan();
            }
        });
    }
}