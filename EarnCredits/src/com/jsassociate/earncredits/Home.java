package com.jsassociate.earncredits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Home extends ActionBarActivity {
    private static final String TAG = "ApplicationsList";
    private List<Listapps> feedItemList = new ArrayList<Listapps>();

	private RecyclerView mRecyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
        mRecyclerView  = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);
//        ItemData itemsData[] = { new ItemData("Help",R.drawable.help),
//                new ItemData("Delete",R.drawable.content_discard),
//                new ItemData("Cloud",R.drawable.collections_cloud),
//                new ItemData("Favorite",R.drawable.rating_favorite),
//                new ItemData("Like",R.drawable.rating_good),
//                new ItemData("Rating",R.drawable.rating_important)};
        
        String[] itemsData = {"App 1","App 2", "App 3","App 1","App 2", "App 3","App 1","App 2", "App 3","App 1","App 2", "App 3","App 1","App 2", "App 3","App 1","App 2", "App 3","App 1","App 2", "App 3"};
        
        // 2. set layoutManger
        
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this);
        layoutmanager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutmanager);
        // 3. create an adapter 
        MyAdapter mAdapter = new MyAdapter(itemsData);
   String [] myDataset = new String[]{"App 1","App 2", "App 3","App 1","App 2", "App 3","App 1","App 2", "App 3","App 1","App 2", "App 3","App 1","App 2", "App 3","App 1","App 2", "App 3","App 1","App 2", "App 3"};

        adapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
//		ArrayList<Map<String, String>> list = buildData();
//	    String[] from = { "name", "purpose" };
//	    int[] to = { android.R.id.text1, android.R.id.text2 };
//
//	    SimpleAdapter adapter = new SimpleAdapter(this, list,
//	        android.R.layout.simple_list_item_2, from, to);
//	    ListView ls = (ListView) findViewById(R.layout.activity_listapps);
//	    
//	  ls.setAdapter(adapter);
		
		
	}
	
	
	private ArrayList<Map<String, String>> buildData() {
	    ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
	    list.add(putData("Android", "Mobile"));
	    list.add(putData("Windows7", "Windows7"));
	    list.add(putData("iPhone", "iPhone"));
	    return list;
	  }

	  private HashMap<String, String> putData(String name, String purpose) {
	    HashMap<String, String> item = new HashMap<String, String>();
	    item.put("name", name);
	    item.put("purpose", purpose);
	    return item;
	  }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
