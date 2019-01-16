package projects.luisfelipe.android.com.simplelistview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<String> names;

    public MyAdapter(Context context, int layout, List<String> names){
        this.context = context;
        this.layout = layout;
        this.names = names;
    }


    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {


        //view holder pattern
        ViewHolder holder;
        if(convertView == null){
            //Se toma del contexto un objeto de tipo LayoutInflater para volcar la vista inflada hacia un view
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(this.layout, null);

            holder = new ViewHolder();

            //Referencia hacia el elemento a modificar (se obtiene una vez el view este inflado)
            holder.nameTextView =(TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);

        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        String currentName = names.get(position);
        holder.nameTextView.setText(currentName);
        //retorna el view modificado
        return convertView;
    }

    static class ViewHolder{
        private TextView nameTextView;

    }
}
