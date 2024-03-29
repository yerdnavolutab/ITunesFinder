package com.github.batulovandrey.itunesfinder.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.batulovandrey.itunesfinder.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Andrey Batulov on 02/08/2017
 */

public class TrackViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    @BindView(R.id.cover_image_view)
    ImageView mCoverImageView;

    @BindView(R.id.artist_name_text_view)
    TextView mArtistNameTextView;

    @BindView(R.id.track_name_text_view)
    TextView mTrackNameTextView;

    private TrackClickListener mClickListener;

    public TrackViewHolder(View itemView, TrackClickListener listener) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        itemView.setOnClickListener(this);
        mClickListener = listener;
    }

    @Override
    public void onClick(View v) {
        mClickListener.onClick(getLayoutPosition());
    }
}