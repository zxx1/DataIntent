package a.aataintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    private TextView s_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        s_name= (TextView) findViewById(R.id.s_name);
        Intent in2 =getIntent();
        String name=in2.getStringExtra("name");
        s_name.setText("用户名："+name);
    }
}
