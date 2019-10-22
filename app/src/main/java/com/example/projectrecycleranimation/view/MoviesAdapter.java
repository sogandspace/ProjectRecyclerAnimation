package com.example.projectrecycleranimation.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectrecycleranimation.R;
import com.example.projectrecycleranimation.model.Movies;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>{
    private List<Movies> mData;
    private OnItemClickListener<Integer> mMoviesOnItemClickListener;

    public MoviesAdapter(OnItemClickListener<Integer> listener) {
        mMoviesOnItemClickListener = listener;
    }

    public void setData(List<Movies> data) {
        mData = data;
        notifyDataSetChanged();
    }

    public List<Movies> getData() {
        return mData;
    }

    public void deleteItem(int position) {
        mData.remove(position);
        notifyItemRemoved(position);
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_item, parent, false);
        return new MoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
        holder.bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData != null ? mData.size() : 0;
    }


//    public void deleteItem(int position) {
////        mRecentlyDeletedItem = mData.get(position);
////        mRecentlyDeletedItemPosition = position;
//        mData.remove(position);
//        notifyItemRemoved(position);
////        showUndoSnackbar();
//    }

    public class MoviesViewHolder extends RecyclerView.ViewHolder {
        private TextView mTvTitle, mTvSub;
        private Movies mMovies;

        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);

            mTvTitle = itemView.findViewById(R.id.tvTitle);
            mTvSub = itemView.findViewById(R.id.tvSubtitle);
            mTvTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mMoviesOnItemClickListener.onItemClicked(getAdapterPosition());
                }
            });

            //<!-- TODO! add listener and animation here -->
        }

        public void bind(Movies movies) {
            mMovies = movies;
            mTvTitle.setText(movies.getTitle());
            mTvSub.setText(movies.getSub());
        }
    }
}
