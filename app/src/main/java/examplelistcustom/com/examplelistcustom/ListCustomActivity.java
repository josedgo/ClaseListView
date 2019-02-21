package examplelistcustom.com.examplelistcustom;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import examplelistcustom.com.examplelistcustom.adapter.CustomAdapter;
import examplelistcustom.com.examplelistcustom.model.Edificios;

public class ListCustomActivity extends AppCompatActivity {

    public CustomAdapter customAdapter;
    public List<Edificios> edificiosList;
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_custom);

        listView=findViewById(R.id.list_item);

        Bitmap icon = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.edificios);
        Bitmap icon1 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.logo);
        Bitmap icon2 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.screen_data);
        Bitmap icon3 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.navheader);

        edificiosList=new ArrayList<Edificios>();

        edificiosList.add(new Edificios(icon,"SANTA ROSA"));
        edificiosList.add(new Edificios(icon1,"BUCARE"));
        edificiosList.add(new Edificios(icon2,"SANTA "));
        edificiosList.add(new Edificios(icon3,"ROSA"));

        customAdapter=new CustomAdapter(this,edificiosList);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),edificiosList.get(position).getNameBulding(),Toast.LENGTH_LONG).show();
            }
        });



    }
}
