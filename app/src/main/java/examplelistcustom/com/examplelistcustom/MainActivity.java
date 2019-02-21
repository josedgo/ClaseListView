package examplelistcustom.com.examplelistcustom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button ir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ir=findViewById(R.id.button_ir_lista);

        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voy=new Intent(MainActivity.this,ListCustomActivity.class);
                startActivity(voy);
            }
        });


    }
}
