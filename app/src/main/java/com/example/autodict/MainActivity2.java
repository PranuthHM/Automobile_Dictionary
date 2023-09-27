package com.example.autodict;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity2 extends AppCompatActivity {

    EditText usr, pswd1;
    Button login;
    TextView txt;
    Button si;
    int counter = 3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        usr = (EditText) findViewById(R.id.Us);
        pswd1 = (EditText) findViewById(R.id.Ps);
        login = (Button) findViewById(R.id.log);
        si = (Button) findViewById(R.id.signup);
        txt = (TextView) findViewById(R.id.textView3);
        String reusername = getIntent().getStringExtra("username");
        String repassword = getIntent().getStringExtra("password");
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String username1 = usr.getText().toString();
                String password1 = pswd1.getText().toString();
                if (reusername.equals(username1) &&
                        repassword.equals(password1)) {

                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);

                    txt.setVisibility(View.VISIBLE);
                    txt.setBackgroundColor(Color.RED);
                    counter--;

                    txt.setText(Integer.toString(counter));

                } else {
                    Toast.makeText(MainActivity2.this, "Invalid Cerdentials",
                            Toast.LENGTH_LONG).show();
                    txt.setVisibility(View.VISIBLE);
                    txt.setBackgroundColor(Color.RED);
                    counter--;

                    txt.setText(Integer.toString(counter));

                }
                if (counter == 0) {
                    Toast.makeText(MainActivity2.this, "FAILED LOGIN ATTEMPTS",
                            Toast.LENGTH_LONG).show();
                    login.setEnabled(false);

                }
            }
        });

    }

}

