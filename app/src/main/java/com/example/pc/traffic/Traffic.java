package com.example.pc.traffic;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Traffic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);
    }//main metod
public void  clickAbout_Me(View view) {
    Intent objInten = new Intent(Intent.ACTION_VIEW);
    objInten.setData(Uri.parse("http://www.csclub.ssru.ac.th/s56122201066/GB"));
    startActivity(objInten);

}    //Click
}
