package com.mobdeve.s12.lazaro.jose.exercise2;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class PostsViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivProfilePic, ivPostPic;
    private ImageButton ibHeart;
    private TextView tvUsername, tvUsername2, tvLocation, tvDate,tvCaption;

    public PostsViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);

        this.ibHeart = itemView.findViewById(R.id.ib_Heart);
        this.ivPostPic = itemView.findViewById(R.id.iv_PostPic);
        this.ivProfilePic = itemView.findViewById(R.id.iv_ProfilePic);
        this.tvCaption = itemView.findViewById(R.id.tv_Caption);
        this.tvDate = itemView.findViewById(R.id.tv_Date);
        this.tvLocation = itemView.findViewById(R.id.tv_Location);
        this.tvUsername = itemView.findViewById(R.id.tv_Username);
        this.tvUsername2 = itemView.findViewById(R.id.tv_Username2);
    }

    public void setProfilePic (int profilePic){
        this.ivProfilePic.setImageResource(profilePic);
    }

    public void setPostPic (int postPic){
        this.ivPostPic.setImageResource(postPic);
    }

    public void setTvDate (String date){
        this.tvDate.setText(date);
    }

    public void setTvLocation (String location){
        this.tvLocation.setText(location);
        if(location != null){
            this.tvLocation.setVisibility(View.VISIBLE);
        }
        else{
            this.tvLocation.setVisibility(View.GONE);
        }
    }
    public void setTvUsername (String username){
        this.tvUsername.setText(username);
    }

    public void setTvCaption (String caption){
        this.tvCaption.setText(caption);
        if(caption != null){
            this.tvUsername2.setVisibility(View.VISIBLE);
            this.tvCaption.setVisibility(View.VISIBLE);
        }
        else{
            this.tvUsername2.setVisibility(View.GONE);
            this.tvCaption.setVisibility(View.GONE);
        }
    }

    public void setTvUsername2 (String username){
        this.tvUsername2.setText(username);

    }

    public void setIbHeartOCL (View.OnClickListener onClickListener){
        this.ibHeart.setOnClickListener(onClickListener);
    }

    public void setIbHeart (boolean ibLiked){
        if (ibLiked){
            this.ibHeart.setImageResource(R.drawable.ic_action_heart_on);
        }
        else{
            this.ibHeart.setImageResource(R.drawable.ic_action_name);
        }
    }
}
