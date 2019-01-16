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

        View v = convertView;


        //Se toma del contexto un objeto de tipo LayoutInflater para volcar la vista inflada hacia un view
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.list_item, null);

        String currentName = names.get(position);
        //currentName = (String)getItem(position);

        //Referencia hacia el elemento a modificar (se obtiene una vez el view este inflado)
        TextView textView = v.findViewById(R.id.textView);
        textView.setText(currentName);


        //retorna el view modificado
        return v;
    }
}
