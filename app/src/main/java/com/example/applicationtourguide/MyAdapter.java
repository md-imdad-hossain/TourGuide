package com.example.applicationtourguide;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<ModelClass> mModelClass;
    private Context mContext;
    private RecyclerView mRecyclerV;


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView itemNameTxtV;
        public TextView itemAddressTxtV;
        public ImageView itemImageImgV;



        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            itemNameTxtV = (TextView) v.findViewById(R.id.itemName);
            itemAddressTxtV = (TextView) v.findViewById(R.id.itemAddress);
            itemImageImgV = (ImageView) v.findViewById(R.id.itemImage);





        }
    }

    public void add(int position, ModelClass modelClass) {
        mModelClass.add(position, modelClass);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        mModelClass.remove(position);
        notifyItemRemoved(position);
    }



    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<ModelClass> myDataset, Context context, RecyclerView recyclerView) {
        mModelClass = myDataset;
        mContext = context;
        mRecyclerV = recyclerView;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.custom_row, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        final ModelClass modelClass = mModelClass.get(position);
        holder.itemNameTxtV.setText(modelClass.getItemName());
        holder.itemAddressTxtV.setText("Address: " + modelClass.getItemAddress());

        holder.itemImageImgV.setImageResource(Integer.parseInt(modelClass.getItemImage()));

        //listen to single view layout click

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(mContext,DetailsActivity.class);
                Bundle extras = new Bundle();
                extras.putString("extra_name",modelClass.getItemName());
                extras.putString("extra_address",modelClass.getItemAddress());
                extras.putString("extra_image",modelClass.getItemImage());
                extras.putString("extra_details",modelClass.getItemDetails());
                extras.putString("extra_website",modelClass.getItemWebsite());
                extras.putString("extra_phone",modelClass.getItemPhone());

                intent.putExtras(extras);
                mContext.startActivity(intent);

            }

        });

        holder.layout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                builder.setTitle(modelClass.getItemName());
                //builder.setMessage("Update or delete user?");
                builder.setIcon(Integer.parseInt(modelClass.getItemImage()));
                builder.setMessage(modelClass.getItemAddress());
                builder.setMessage(modelClass.getItemDetails());

                builder.create().show();
                return false;
            }
        });


    }




    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mModelClass.size();
    }



}




























