package com.example.mobiledev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    public static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNameButtonClick(View view) {
        ((TextView) findViewById(R.id.res)).setText(R.string.user);
    }

    public void onGroupButtonClick(View view) {
        ((TextView) findViewById(R.id.res)).setText(R.string.group);
    }

    public void onIntentButtonClick(View view) {
        Intent intent = new Intent(this, SecondaryActivity.class);

        intent.putExtra(KEY, "Data");

        startActivity(intent);
    }

    public void onSetButtonClick(View view) {
        TextInputEditText textInputEditText = (TextInputEditText) findViewById(R.id.input);
        ((TextView) findViewById(R.id.res)).setText(textInputEditText.getText());
    }
}