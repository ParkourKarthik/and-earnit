package com.jsassociate.earncredits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SimpleAdapter;

public class Listapps extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listapps);
		ArrayList<Map<String, String>> list = buildData();
	    String[] from = { "name", "purpose" };
	    int[] to = { android.R.id.text1, android.R.id.text2 };

	    SimpleAdapter adapter = new SimpleAdapter(this, list,
	        android.R.layout.simple_list_item_2, from, to);
	  setListAdapter(adapter);
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

}
