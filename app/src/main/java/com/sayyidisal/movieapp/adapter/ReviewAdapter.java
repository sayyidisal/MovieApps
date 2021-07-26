package com.sayyidisal.movieapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.sayyidisal.movieapp.R;
import com.sayyidisal.movieapp.activities.DetailMovieActivity;
import com.sayyidisal.movieapp.model.ModelTrailer;
import com.sayyidisal.movieapp.model.ReviewData;
import com.sayyidisal.movieapp.networking.ApiEndPoint;

import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {

    private List<ReviewData> items;
    private Context mContext;

    public ReviewAdapter(Context context, List<ReviewData> items) {
        this.mContext = context;
        this.items = items;
    }

    @Override
    public ReviewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_review, parent, false);
        return new ReviewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReviewAdapter.ViewHolder holder, int position) {
        final ReviewData data = items.get(position);

        holder.reviewers.setText(data.getAuthor());
        holder.content.setText(data.getContent());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //Class Holder
    class ViewHolder extends RecyclerView.ViewHolder {

//        public Button btnTrailer;
        public TextView reviewers, content;

        public ViewHolder(View itemView) {
            super(itemView);
            reviewers = itemView.findViewById(R.id.reviewers);
            content = itemView.findViewById(R.id.content);
        }
    }
}
