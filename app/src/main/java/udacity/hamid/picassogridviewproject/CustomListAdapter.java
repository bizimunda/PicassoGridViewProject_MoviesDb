package udacity.hamid.picassogridviewproject;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by temp on 25/01/2017.
 */

public class CustomListAdapter extends ArrayAdapter<Product> {

    ArrayList<Product> products;
    Context context;
    int resource;

    public CustomListAdapter(Context context, int resource, ArrayList<Product> products) {
        super(context, resource, products);
        this.products = products;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater layoutInflater= (LayoutInflater)getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.custom_list_layout, null, false);
        }

        Product product= getItem(position);
        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageViewProduct);
        TextView txtName=(TextView)convertView.findViewById(R.id.txtName);
        TextView txtPrice=(TextView)convertView.findViewById(R.id.txtPrice);

        Picasso.with(context).load(product.getImage()).into(imageView);
        txtName.setText(product.getName());
        txtPrice.setText(product.getPrice());



        return convertView;
    }
}
