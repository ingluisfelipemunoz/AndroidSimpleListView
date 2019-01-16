package projects.luisfelipe.android.com.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    List<String> names;
    GridView gridView;
    MyAdapter myAdapter;
    private int count = 0;
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



        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        //listView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long rowId) {
                Toast.makeText(GridActivity.this, "Click en "+names.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        //Enlace con el adaptador personalizado.
        myAdapter = new MyAdapter(this, R.layout.grid_item, names);
        gridView.setAdapter(myAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                this.names.add("Added nro: "+(++count));
                this.myAdapter.notifyDataSetChanged();
                return true;

                default:
                    return super.onOptionsItemSelected(item);
        }


    }


}
