package com.yundin.styleruhw2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText surnameEditText;
    private EditText groupEditText;
    private Button bottomButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        findViews();

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String surname = surnameEditText.getText().toString();
                String group = groupEditText.getText().toString();

                storeProfile(name, surname, group);
                goToMain();
            }
        });
    }

    private void storeProfile(String name, String surname, String group) {
        // storing data somehow
    }

    private void goToMain() {

        // starting Main

        // finishing RegisterActivity to be unable to return here by back button
        finish();
    }

    private void findViews() {
        nameEditText = findViewById(R.id.name_et);
        surnameEditText = findViewById(R.id.surname_et);
        groupEditText = findViewById(R.id.group_et);
        bottomButton = findViewById(R.id.bottom_btn);
    }
}
