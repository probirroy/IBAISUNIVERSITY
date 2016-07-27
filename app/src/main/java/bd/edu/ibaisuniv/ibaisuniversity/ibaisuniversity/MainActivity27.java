package bd.edu.ibaisuniv.ibaisuniversity.ibaisuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity27 extends AppCompatActivity {

    Button button1,button2;
    TextView TextView1,TextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity25.class);
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        TextView1 = (TextView) findViewById(R.id.TextView1);
        TextView1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity33.class);
                startActivity(intent);
            }
        });

        TextView3 = (TextView) findViewById(R.id.TextView3);
        TextView3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity34.class);
                startActivity(intent);
            }
        });



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
