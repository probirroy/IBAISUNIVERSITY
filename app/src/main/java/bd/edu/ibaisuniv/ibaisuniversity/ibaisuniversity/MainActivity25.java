package bd.edu.ibaisuniv.ibaisuniversity.ibaisuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity25 extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity27.class);
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity28.class);
                startActivity(intent);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity29.class);
                startActivity(intent);
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity30.class);
                startActivity(intent);
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
