package bd.edu.ibaisuniv.ibaisuniversity.ibaisuniversity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        text1 = (TextView)findViewById(R.id.text1);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "opensans.ttf");
        text1.setTypeface(custom_font);

        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(intent);
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(intent);
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity7.class);
                startActivity(intent);
            }
        });

        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity8.class);
                startActivity(intent);
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity9.class);
                startActivity(intent);
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity10.class);
                startActivity(intent);
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity11.class);
                startActivity(intent);
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(intent);
            }
        });

        button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity13.class);
                startActivity(intent);
            }
        });

        button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity14.class);
                startActivity(intent);
            }
        });

        button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity15.class);
                startActivity(intent);
            }
        });

        button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity16.class);
                startActivity(intent);
            }
        });

        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity17.class);
                startActivity(intent);
            }
        });

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity18.class);
                startActivity(intent);
            }
        });

        button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity19.class);
                startActivity(intent);
            }
        });

        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity20.class);
                startActivity(intent);
            }
        });

        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity21.class);
                startActivity(intent);
            }
        });

        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity22.class);
                startActivity(intent);
            }
        });

        button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity23.class);
                startActivity(intent);
            }
        });

        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity24.class);
                startActivity(intent);
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity7.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(R.drawable.icona).setTitle("Exit")
                .setMessage("Are you sure You Want To Exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                }).setNegativeButton("No", null).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
