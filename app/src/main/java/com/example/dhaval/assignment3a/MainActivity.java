package com.example.dhaval.assignment3a;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bt;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editText);
        bt=(Button)findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String s=editText.getText().toString();
              Intent intent=new Intent(Intent.ACTION_WEB_SEARCH,
                        Uri.parse("http://www.google.com/"));
                intent.putExtra(SearchManager.QUERY,s);

                startActivity(intent);
            }
        });
    }
}
