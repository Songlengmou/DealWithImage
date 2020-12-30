package com.anningtex.dealwithimage.test.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.anningtex.dealwithimage.R;
import com.anningtex.dealwithimage.test.bean.TestBean;
import com.anningtex.dealwithimage.test.utils.ToolClass;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * @Author: Administrator
 */
public class TestAdapter extends BaseAdapter {
    private Context context;
    private List<TestBean.DataBean.ImglistBean> list;

    public TestAdapter(Context context, List<TestBean.DataBean.ImglistBean> list) {
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
            view = LayoutInflater.from(context).inflate(R.layout.item_test, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.tvName.setText(list.get(i).getShow_name());
        if (list.get(i).getMini() != null) {
            Glide.with(context).load(ToolClass.testUrl + list.get(i).getMini()).into(viewHolder.ivTest);
        }
        return view;
    }

    class ViewHolder {
        TextView tvName;
        ImageView ivTest;

        ViewHolder(View view) {
            tvName = view.findViewById(R.id.tv_name);
            ivTest = view.findViewById(R.id.iv_test);
        }
    }
}
