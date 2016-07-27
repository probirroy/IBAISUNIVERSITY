package bd.edu.ibaisuniv.ibaisuniversity.ibaisuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
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
                Intent intent = new Intent(getApplicationContext(), MainActivity26.class);
                startActivity(intent);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });





        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
