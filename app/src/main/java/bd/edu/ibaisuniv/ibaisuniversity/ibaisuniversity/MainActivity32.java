package bd.edu.ibaisuniv.ibaisuniversity.ibaisuniversity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class MainActivity32 extends AppCompatActivity {

    WebView WebView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView v = (WebView) findViewById(R.id.WebView1);
        v.setVerticalScrollBarEnabled(true);
        v.setHorizontalScrollBarEnabled(true);
        String url="https://www.google.com.bd/maps/place/IBAIS+University/@23.7547885,90.371954,15.31z/data=!4m2!3m1!1s0x0:0x5a26d785b702369f/";
        WebView view= (WebView) findViewById(R.id.WebView1);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
