package com.jsassociate.earncredits;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by a on 10/11/2014.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] mDataset;
    public MyAdapter(String[] myDataset){
        mDataset=myDataset;
    }
@Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
    View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_listapps,null);
    MyAdapter.ViewHolder viewHolder = new ViewHolder(itemLayoutView);
    return  viewHolder;
}
    @Override
    public void onBindViewHolder(ViewHolder viewHolder,int position){
        viewHolder.mTextView.setText(mDataset[position]);
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;

        public ViewHolder(View v) {
            super(v);
            mTextView =(TextView) v.findViewById(R.id.text1);
        }
    }
@Override
    public int getItemCount(){
    return mDataset.length;
}

/*
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_listapps,parent,false);
        ViewHolder vh = new ViewHolder((TextView) v);
        return  vh;
    }
*/
}
