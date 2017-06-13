package com.edu.taruc.p22;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void visitTARUC(View view){
        String uri = "http://www.tarc.edu.my";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }
    public void ShowMain(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        startActivity(intent);
    }
    public void ShowDial(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + "0125844896"));
        startActivity(intent);

    }
    public void ShowSendTo(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"+ "lishaoming2009@live.com"));
        startActivity(intent);
    }
}
