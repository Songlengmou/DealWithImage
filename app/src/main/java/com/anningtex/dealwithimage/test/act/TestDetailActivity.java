package com.anningtex.dealwithimage.test.act;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anningtex.base.weight.tab.FlowLayout;
import com.anningtex.base.weight.tab.TagAdapter;
import com.anningtex.base.weight.tab.TagFlowLayout;
import com.anningtex.dealwithimage.R;
import com.anningtex.dealwithimage.test.adapter.CommentAdapter;
import com.anningtex.dealwithimage.test.bean.CommentBean;
import com.anningtex.dealwithimage.test.bean.TestBean;
import com.anningtex.dealwithimage.test.manger.GalleryLayoutManager;
import com.anningtex.dealwithimage.test.other.ListViewForScrollView;
import com.anningtex.dealwithimage.test.other.ScaleTransformer;
import com.anningtex.dealwithimage.test.utils.ToolClass;
import com.anningtex.dealwithimage.utils.CropWhiteSpace;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Administrator
 */
public class TestDetailActivity extends AppCompatActivity {
    @BindView(R.id.iv_product_list)
    RecyclerView recyclerView;
    @BindView(R.id.empty)
    View emptyView;
    @BindView(R.id.tv_product_details_name)
    TextView tvProductDetailsName;
    @BindView(R.id.tv_product_details_country)
    TextView tvProductDetailsCountry;
    @BindView(R.id.tv_product_details_designer)
    TextView tvProductDetailsDesigner;
    @BindView(R.id.tv_product_details_update_time)
    TextView tvProductDetailsUpdateTime;
    @BindView(R.id.tv_product_details_category)
    TextView tvProductDetailsCategory;
    @BindView(R.id.tv_product_details_speclist)
    TextView tvProductDetailsSpeclist;
    @BindView(R.id.tag_layout)
    TagFlowLayout tagFlowLayout;
    @BindView(R.id.tv_product_details_comment_count)
    TextView tvProductDetailsCommentCount;
    @BindView(R.id.listview_product_details_comment)
    ListViewForScrollView listView;

    @BindView(R.id.et_product_list)
    TextView editText;
    @BindView(R.id.iv_product_details_all)
    TextView ivProductDetailsAll;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.iv_product_shopping_car)
    ImageView ivProductShoppingCar;
    @BindView(R.id.iv_product_attention)
    ImageView ivProductAttention;

    private List<TestBean.DataBean.ImglistBean> datas;
    private int mPosition;
    private List<CommentBean> commentData = new ArrayList<>();
    private CommentAdapter commentAdapter;

    private List<String> specList;
    private TagAdapter<String> tagAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_detail);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        datas = (List<TestBean.DataBean.ImglistBean>) getIntent().getSerializableExtra("list");
        mPosition = Integer.parseInt(getIntent().getStringExtra("position"));
        GalleryLayoutManager galleryLayoutManager = new GalleryLayoutManager(GalleryLayoutManager.HORIZONTAL);
        galleryLayoutManager.attach(recyclerView, mPosition);
        galleryLayoutManager.setItemTransformer(new ScaleTransformer());
        galleryLayoutManager.setOnItemSelectedListener(((recycler, item, position) -> {
            specList = datas.get(position).getImg_spec();
            tagAdapter = new TagAdapter<String>(specList) {
                @Override
                public View getView(FlowLayout parent, int position, String s) {
                    TextView tv = (TextView) getLayoutInflater().inflate(R.layout.item_tag_flow_layout_of_spec, tagFlowLayout, false);
                    tv.setTextColor(Color.WHITE);
                    if (position % 2 == 0) {
                        tv.setBackgroundColor(getResources().getColor(R.color.common_orange));
                    } else {
                        tv.setBackgroundColor(getResources().getColor(R.color.leave_add_btn_submit_pressed));
                    }
                    tv.setText(s);
                    return tv;
                }
            };
            tagFlowLayout.setAdapter(tagAdapter);
            tagFlowLayout.onChanged();
            tagAdapter.notifyDataChanged();

            boolean attention = datas.get(position).isAttention();
            if (attention) {
                Glide.with(this).load(R.mipmap.attention).into(ivProductAttention);
            } else {
                Glide.with(this).load(R.mipmap.unattention).into(ivProductAttention);
            }
            if (datas.get(position).getCommentCount() != 0) {
                commentData.clear();
                if (commentAdapter == null) {
                    commentAdapter = new CommentAdapter(this, commentData);
                    listView.setAdapter(commentAdapter);
                }
                commentAdapter.notifyDataSetChanged();
            } else {
                commentData.clear();
                if (commentAdapter != null) {
                    commentAdapter.notifyDataSetChanged();
                }
            }
            final TestBean.DataBean.ImglistBean imglistBean = datas.get(position);
            tvProductDetailsName.setText(imglistBean.getShow_name());
            tvProductDetailsCountry.setText(imglistBean.getImg_country() != null ? imglistBean.getImg_country().getName() : "");
            tvProductDetailsDesigner.setText(imglistBean.getCreate_user());
            tvProductDetailsUpdateTime.setText(imglistBean.getCreate_time());
            tvProductDetailsCategory.setText(imglistBean.getImg_category() != null ? imglistBean.getImg_category().getName() : "");
            tvProductDetailsSpeclist.setText("所属标签");

            tvProductDetailsCommentCount.setText("评论(" + datas.get(position).getCommentCount() + ")");
            if (position == datas.size() - 1) {
                emptyView.setVisibility(View.VISIBLE);
            } else {
                emptyView.setVisibility(View.GONE);
            }
        }));

        Adapter adapter = new Adapter(datas);
        recyclerView.setLayoutManager(galleryLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
        private final List<TestBean.DataBean.ImglistBean> datas;
        private int index = 0;

        public Adapter(List<TestBean.DataBean.ImglistBean> datas) {
            this.datas = datas;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card, viewGroup, false);
            view.setTag(++index);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
            viewHolder.tv.setText(datas.get(position).getShow_name());
            Glide.with(TestDetailActivity.this)
                    .load(ToolClass.testUrl + datas.get(position).getMini())
                    .bitmapTransform(new CropWhiteSpace(TestDetailActivity.this))
                    .into(viewHolder.iv);
        }

        @Override
        public int getItemCount() {
            return datas == null ? 0 : datas.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            CardView cardView;
            TextView tv;
            ImageView iv;

            public ViewHolder(@NonNull final View itemView) {
                super(itemView);
                cardView = itemView.findViewById(R.id.cardV);
                tv = itemView.findViewById(R.id.item_tv);
                iv = itemView.findViewById(R.id.item_iv);
            }
        }
    }
}