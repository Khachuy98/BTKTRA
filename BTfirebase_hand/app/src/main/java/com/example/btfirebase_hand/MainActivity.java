package com.example.btfirebase_hand;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    Button btnDangky;
    EditText edtEmail, edtPassWord;
    FirebaseAuth mAuthencation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuthencation = FirebaseAuth.getInstance();

        Anhxa();
        btnDangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dangky();
            }
        });
    }
    private void dangky()
    {
        String email = edtEmail.getText().toString();
        String password = edtPassWord.getText().toString();

        mAuthencation.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(MainActivity.this,"Đăng ký thành công",Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(MainActivity.this,"Đăng ký thất bại",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void Anhxa(){
        btnDangky = (Button) findViewById(R.id.btn_dangky);
        edtEmail = (EditText) findViewById(R.id.editTextEmail);
        edtPassWord = (EditText) findViewById(R.id.editTextPassWord);
    }


    }

