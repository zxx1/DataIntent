package a.aataintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText e_name;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e_name = (EditText) findViewById(R.id.e_name);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passDate();
            }


        });

        }

    private void passDate() {
        Intent in1=new Intent(MainActivity.this,ShowActivity.class);
        in1.putExtra("name",e_name.getText().toString().trim());
        startActivity(in1);
    }



    }

