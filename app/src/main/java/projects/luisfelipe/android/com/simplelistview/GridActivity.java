package projects.luisfelipe.android.com.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    List<String> names;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = (GridView) findViewById(R.id.gridView);

        names = new ArrayList<String>();

        names.add("Felipe");
        names.add("Luis");
        names.add("Pedro");
        names.add("Jose");
        names.add("Fernando");
        names.add("Felipe");
        names.add("Luis");
        names.add("Pedro");
        names.add("Jose");
        names.add("Fernando");
        names.add("Felipe");
        names.add("Luis");
        names.add("Pedro");
        names.add("Jose");
        names.add("Fernando");
        names.add("Felipe");
        names.add("Luis");
        names.add("Pedro");
        names.add("Jose");
        names.add("Fernando");
        names.add("Felipe");
        names.add("Luis");
        names.add("Pedro");
        names.add("Jose");
        names.add("Fernando");
        names.add("Felipe");
        names.add("Luis");
        names.add("Pedro");
        names.add("Jose");
        names.add("Fernando");


        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        //listView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long rowId) {
                Toast.makeText(GridActivity.this, "Click en "+names.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        //Enlace con el adaptador personalizado.
        MyAdapter myAdapter = new MyAdapter(this, R.layout.grid_item, names);
        gridView.setAdapter(myAdapter);
    }
}
