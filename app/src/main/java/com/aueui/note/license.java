package com.aueui.note;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class license extends AppCompatActivity {
    private WebView license_webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.license);
        init();
        license_webview.loadUrl("http://www.apache.org/licenses/LICENSE-2.0.html");

    }

    public void init() {
        license_webview = (WebView) findViewById(R.id.license_webview);
    }
}