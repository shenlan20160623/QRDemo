package com.industry.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.netease.scan.IScanModuleCallBack;
import com.netease.scan.QrScan;
import com.netease.scan.QrScanConfiguration;

public class MainActivity extends Activity implements View.OnClickListener{
    private final String TAG = "MainActivity";
    private final static int SCANNIN_GREQUEST_CODE = 1;
    private Button bt_scanner;
    private TextView mTextView;
    private QrScan qrScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_scanner = (Button) findViewById(R.id.bt_scanner);
        mTextView = (TextView) findViewById(R.id.tv_show);
        bt_scanner.setOnClickListener(this);
        qrScan = QrScan.getInstance();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_scanner:
                QrScanConfiguration.Builder builder = new QrScanConfiguration.Builder(this);
                QrScanConfiguration qrScanConfiguration = new QrScanConfiguration(builder);
                qrScan.init(qrScanConfiguration);
                qrScan.launchScan(this, new IScanModuleCallBack() {
                    @Override
                    public void OnReceiveDecodeResult(Context context, String result) {
                        Log.d(TAG,"OnReceiveDecodeResult-->result:"+result);
                    }
                });
                break;
        }
    }

}
