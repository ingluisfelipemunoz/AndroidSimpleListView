package projects.luisfelipe.android.com.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);

        List<String> names = new ArrayList<String>();

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


    }
}
