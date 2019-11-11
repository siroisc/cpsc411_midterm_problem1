package com.example.problem1_triangle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class GetLevelsActivity extends Activity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_a);

        Button btScreena = (Button) findViewById(R.id.button_user);
        btScreena.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(GetLevelsActivity.this, TriangleActivity.class);
                EditText edit = (EditText) findViewById(R.id.editText_user);
                String result = edit.getText().toString();
                intent.putExtra("triangleCount", result);
                startActivity(intent);
            }
        });
    }


}
