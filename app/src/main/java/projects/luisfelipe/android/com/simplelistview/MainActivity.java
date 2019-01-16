package projects.luisfelipe.android.com.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    List<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);

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


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long rowId) {
                Toast.makeText(MainActivity.this, "Click en "+names.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        //Enlace con el adaptador personalizado.
        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, names);
        listView.setAdapter(myAdapter);

    }
}

