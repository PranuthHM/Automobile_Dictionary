package com.example.autodict;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;
public class MainActivity3 extends AppCompatActivity {
    EditText un,pswd;
    Button signup;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        un=(EditText)findViewById(R.id.u);
        pswd=(EditText)findViewById(R.id.p);
        signup=(Button)findViewById(R.id.sig);
        signup.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String user=un.getText().toString();
                String password = pswd.getText().toString();
                if(user.length()==0)
                {
                    un.setError("USername is empty");
                    un.requestFocus();
                }
                else if(password.length()==0)
                {
                    pswd.setError("password is empty");
                    pswd.requestFocus();
                }
                else
                {
                    if(!isValidpassword(password))

                    {Toast.makeText(MainActivity3.this, "Password dosenot match with pattern",Toast.LENGTH_LONG).show();
                    }
                    else
                    {

                        Intent intent = new
                                Intent(MainActivity3.this,MainActivity2.class);
                        intent.putExtra("username", user);
                        intent.putExtra("password", password);

                        startActivity(intent);

                    }
                }
            }
        });
    }
    Pattern lowercase=Pattern.compile("^.*[a-z].*$");
    Pattern uppercase=Pattern.compile("^.*[A-Z].*$");
    Pattern number=Pattern.compile("^.*[0-9].*$");
    Pattern specialch=Pattern.compile("^.*[^a-zA-Z0-9].*$");
    public Boolean isValidpassword(String password)
    {

        if(password.length()<8)
        {
            Toast.makeText(MainActivity3.this, "Password is small in length",Toast.LENGTH_LONG).show();

                return false;
        }
        if(!lowercase.matcher(password).matches())
        {
            Toast.makeText(MainActivity3.this, "Password is in lowercase",Toast.LENGTH_LONG).show();

                return false;
        }
        if(!uppercase.matcher(password).matches())
        {
            Toast.makeText(MainActivity3.this, "Password is in uppercase",Toast.LENGTH_LONG).show();

            return false;
        }
        if(!number.matcher(password).matches())
        {
            Toast.makeText(MainActivity3.this, "Password must contain number",Toast.LENGTH_LONG).show();

            return false;
        }
        if(!specialch.matcher(password).matches())
        {
            Toast.makeText(MainActivity3.this, "Password must contain special charecter",Toast.LENGTH_LONG).show();

            return false;
        }
        return true;
    }
}