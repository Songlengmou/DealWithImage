package com.anningtex.dealwithimage.test.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.anningtex.dealwithimage.R;
import com.anningtex.dealwithimage.test.bean.CommentBean;

import java.util.List;

/**
 * @Author: Administrator
 */
public class CommentAdapter extends BaseAdapter {
    private Context context;
    private List<CommentBean> list;

    public CommentAdapter(Context context, List<CommentBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_comment, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        if (list.get(i).getScore() > 0) {
            viewHolder.ratingBar.setVisibility(View.VISIBLE);
            viewHolder.ratingBar.setRating(list.get(i).getScore());
        } else {
            viewHolder.ratingBar.setVisibility(View.GONE);
        }

        viewHolder.tvName.setText(list.get(i).getCommentName());
        viewHolder.tvTime.setText(list.get(i).getCommentTime());
        viewHolder.tvContent.setText(list.get(i).getCommentContent());
        return view;
    }

    class ViewHolder {
        TextView tvName, tvTime, tvContent;
        RatingBar ratingBar;

        ViewHolder(View view) {
            tvName = view.findViewById(R.id.tv_item_comment_name);
            tvTime = view.findViewById(R.id.tv_item_comment_time);
            tvContent = view.findViewById(R.id.tv_item_comment_content);
            ratingBar = view.findViewById(R.id.item_ratingBar);
        }
    }
}
