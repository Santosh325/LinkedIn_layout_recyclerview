package com.example.linkedin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class LinkedIn extends RecyclerView.Adapter<LinkedIn.LinkedInHolder> {

    private String[] data;
    private int[] images;
    private String[] profile;

    public LinkedIn(String[] data ,String[] profile,int[] images) {
        this.data = data;
        this.images = images;
        this.profile = profile;
    }

    @NonNull
    @Override
    public LinkedInHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item,parent,false);
        return new LinkedInHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LinkedInHolder holder, int position) {
         String title = data[position];
         holder.mTextView.setText(title);
         int photos = images[position];
         holder.mImageView.setImageResource(photos);
         String jobProfile = profile[position];
         holder.mProfile.setText(jobProfile);
    }


    @Override
    public int getItemCount() {
        return data.length;
    }

    public class LinkedInHolder extends RecyclerView.ViewHolder{
        ImageView mImageView;
        TextView mTextView;
        TextView mProfile;
        public LinkedInHolder(View itemview){
            super(itemview);
            mImageView = itemview.findViewById(R.id.imageview);
            mTextView = itemview.findViewById(R.id.text);
            mProfile = itemview.findViewById(R.id.profile);
        }
    }
}
