package com.example.android.mobiledevelopment7_2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class PresidentAdapter extends RecyclerView.Adapter<PresidentAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<President> mPresident;
    private LayoutInflater mInflater;

    public PresidentAdapter (Context context, List<President> presidents) {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        mPresident = (ArrayList<President>) presidents;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.item_list_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.mName.setText(mPresident.get(i).getName());
        viewHolder.mRemarks.setText(mPresident.get(i).getRemarks());
        Glide.with(mContext)
                .load(mPresident.get(i).getPhotoURL())
                .placeholder(R.drawable.ic_launcher_background)
                .into(viewHolder.mImage);
    }

    @Override
    public int getItemCount() {
        return mPresident.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mName, mRemarks;
        private ImageView mImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.item_name);
            mRemarks = itemView.findViewById(R.id.item_remarks);
            mImage = itemView.findViewById(R.id.item_photo);
        }
    }
}
