package ga.azsa.asizedpaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout a1, a2, a3, a4_1, a4_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1 = (LinearLayout)findViewById(R.id.a1paper);
        a2 = (LinearLayout)findViewById(R.id.a2paper);
        a3 = (LinearLayout)findViewById(R.id.a3paper);
        a4_1 = (LinearLayout)findViewById(R.id.a4paper1);
        a4_2 = (LinearLayout)findViewById(R.id.a4paper2);
        a1.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "A1", Toast.LENGTH_SHORT).show();
            }
        });
        a2.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "A2", Toast.LENGTH_SHORT).show();
            }
        });
        a3.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "A3", Toast.LENGTH_SHORT).show();
            }
        });
        a4_1.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "A4", Toast.LENGTH_SHORT).show();
            }
        });
        a4_2.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "A4", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
