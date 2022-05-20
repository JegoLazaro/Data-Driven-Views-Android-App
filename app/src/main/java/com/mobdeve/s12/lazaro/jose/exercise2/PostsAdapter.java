package com.mobdeve.s12.lazaro.jose.exercise2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class PostsAdapter extends RecyclerView.Adapter<PostsViewHolder> {
    private ArrayList<Post> dataPosts;

    public PostsAdapter(ArrayList<Post> dataPosts){
        this.dataPosts = dataPosts;
    }

    @NonNull
    @NotNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_post, parent, false);

        PostsViewHolder postsViewHolder = new PostsViewHolder(itemView);

        return postsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PostsViewHolder holder, int position) {
        holder.setPostPic(dataPosts.get(position).getImageId());
        holder.setProfilePic(dataPosts.get(position).getUserImageId());
        holder.setTvUsername(dataPosts.get(position).getUsername());
        holder.setTvUsername2(dataPosts.get(position).getUsername());
        holder.setTvDate(dataPosts.get(position).getDatePosted());

        holder.setTvCaption(dataPosts.get(position).getCaption());
        holder.setTvLocation(dataPosts.get(position).getLocation());

        holder.setIbHeart(dataPosts.get(position).getLiked());
        holder.setIbHeartOCL(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dataPosts.get(position).getLiked()){
                    ((ImageButton) view).setImageResource(R.drawable.ic_action_name);
                    dataPosts.get(position).setLiked(false);
                }
                else {
                    ((ImageButton) view).setImageResource(R.drawable.ic_action_heart_on);
                    dataPosts.get(position).setLiked(true);
                }
                holder.setIbHeart(dataPosts.get(position).getLiked());
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.dataPosts.size();
    }
}
