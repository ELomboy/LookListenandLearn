package com.prjucu.preschoollearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class signup extends AppCompatActivity {

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://look-listen-and-learn-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView signupopen = findViewById(R.id.gotologin);
        signupopen.setOnClickListener(v->{
            startActivity(new Intent(this, MainActivity.class));
        });

        final EditText username = findViewById(R.id.usernameSignup);
        final EditText password = findViewById(R.id.passwordSignup);

        Button signup = findViewById(R.id.signup);


        
        signup.setOnClickListener(v->{
            final String usernameStr = username.getText().toString();
            final String passwordStr = password.getText().toString();

            if (usernameStr.isEmpty() || passwordStr.isEmpty()){
                Toast.makeText(this, "Fill up", Toast.LENGTH_SHORT).show();
            }else{
                databaseReference.child("accounts").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.child(usernameStr).exists()){
                            Toast.makeText(signup.this, "Account Exist", Toast.LENGTH_SHORT).show();
                        }else{
                            databaseReference.child("accounts").child(usernameStr).child("username").setValue(usernameStr);
                            databaseReference.child("accounts").child(usernameStr).child("password").setValue(passwordStr);
                            finish();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });



    }
}