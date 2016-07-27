package bd.edu.ibaisuniv.ibaisuniversity.ibaisuniversity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

   TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        text3 = (TextView)findViewById(R.id.text3);
        text4 = (TextView)findViewById(R.id.text4);
        text5 = (TextView)findViewById(R.id.text5);
        text6 = (TextView)findViewById(R.id.text6);
        text7 = (TextView)findViewById(R.id.text7);
        text8 = (TextView)findViewById(R.id.text8);
        text9 = (TextView)findViewById(R.id.text9);
        text10 = (TextView)findViewById(R.id.text10);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "opensans.ttf");
        Typeface custom_font2 = Typeface.createFromAsset(getAssets(),  "kellyag.ttf");
        text2.setTypeface(custom_font);
        text4.setTypeface(custom_font);
        text6.setTypeface(custom_font);
        text8.setTypeface(custom_font);
        text10.setTypeface(custom_font);
        text1.setTypeface(custom_font2);
        text3.setTypeface(custom_font2);
        text5.setTypeface(custom_font2);
        text7.setTypeface(custom_font2);
        text9.setTypeface(custom_font2);
    }

}
