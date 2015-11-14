package com.example.jubaed.profile;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go(View view){
        Button button = (Button) view;
        String link = button.getText().toString();
        startWebView(link);
    }

    public void startWebView(String link){
        String url ="";
        switch (link){
            case "Tw":
                url = "http://twitter.com/jubaedprince";
                break;

            case "Fb":
                url = "http://facebook.com/jubaedprince";
                break;

            case "Ln":
                url = "http://linkedin.com/jubaedprince";
                break;

        }
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }
}
