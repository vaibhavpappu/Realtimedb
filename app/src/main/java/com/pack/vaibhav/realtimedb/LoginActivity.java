package com.pack.vaibhav.realtimedb;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    public static final String USER="user";

    public String msg="failed";
    EditText t1,t2;
    Button btn;
    TextView lbtn;
    ProgressBar progressBar;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        t1 = (EditText) findViewById(R.id.email);
        t2 = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.signup1);
        lbtn = (TextView) findViewById(R.id.lbtn);
        progressBar= (ProgressBar) findViewById(R.id.progress);


        lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
           Intent i=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        mAuth = FirebaseAuth.getInstance();

        btn.setOnClickListener(new View.OnClickListener() {
            public static final String TAG ="MainActivity" ;

            @Override
            public void onClick(View v) {
                final String email = t1.getText().toString().trim();
                final String pass = t2.getText().toString().trim();
                if (email.isEmpty()) {
                    t1.setError("This Field can not be Blank");
                    t1.requestFocus();
                }

                if (pass.isEmpty()) {

                    t2.setError("This Field can not be Blank");
                    t2.requestFocus();
                } else {


                }
            }
        });
    }
}