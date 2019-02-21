package examplelistcustom.com.examplelistcustom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import examplelistcustom.com.examplelistcustom.R;
import examplelistcustom.com.examplelistcustom.model.Edificios;

public class CustomAdapter extends ArrayAdapter<Edificios> {

    public List<Edificios> edificiosList;
    public Context context;

    private static class ViewHolder {
        ImageView imageBuilding;
        TextView nameBuilding;
    }

    public CustomAdapter(Context context, List<Edificios> edificios) {
        super(context,0);
        this.edificiosList=edificios;
        this.context=context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){

       //Edificios edificios=getItem(position);
        ViewHolder viewHolder;
        View result;

        if(convertView==null){
            viewHolder=new ViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.items,parent,false);
            viewHolder.imageBuilding=convertView.findViewById(R.id.image_item);
            viewHolder.nameBuilding=convertView.findViewById(R.id.name_item);

            viewHolder.imageBuilding.setImageBitmap(edificiosList.get(position).getImagBuilding());
            viewHolder.nameBuilding.setText(edificiosList.get(position).getNameBulding());

         /*   viewHolder.imageBuilding.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,edificiosList.get(position).getNameBulding(),Toast.LENGTH_LONG).show();
                }
            });

            viewHolder.nameBuilding.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,edificiosList.get(position).getNameBulding(),Toast.LENGTH_LONG).show();
                }
            });*/

            result=convertView;
            convertView.setTag(viewHolder);

        }else{
            viewHolder=(ViewHolder) convertView.getTag();
            result=convertView;

        }

        return convertView;

    }
    @Override
    public int getCount(){
        return edificiosList.size();
    }

}
