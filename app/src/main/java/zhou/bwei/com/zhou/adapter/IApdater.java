package zhou.bwei.com.zhou.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import zhou.bwei.com.zhou.DataBean;
import zhou.bwei.com.zhou.EventBean;
import zhou.bwei.com.zhou.Main2Activity;
import zhou.bwei.com.zhou.R;
import zhou.bwei.com.zhou.bean.Bean;

/**
 * Created by muhanxi on 17/12/1.
 */

public class IApdater extends RecyclerView.Adapter<IApdater.IViewHolder> {

    Context context;

    List<DataBean> list ;


    public IApdater(Context context) {
        this.context = context;
    }


    public void addData(Bean bean){
        if(list == null){
            list = new ArrayList<>();
        }
        list.addAll(bean.getResult().getData());
        notifyDataSetChanged();
    }

    @Override
    public IViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = View.inflate(context, R.layout.list_item, null);

        return new IViewHolder(view);
    }

    @Override
    public void onBindViewHolder(IViewHolder holder, final int position) {


        holder.adapterSimpledraweeview.setImageURI(list.get(position).getThumbnail_pic_s());
        holder.adapterTextview.setText(list.get(position).getTitle());
        RoundingParams roundingParams = RoundingParams.fromCornersRadius(5f);
        roundingParams.setRoundAsCircle(true);
        holder.adapterSimpledraweeview.getHierarchy().setRoundingParams(roundingParams);
        holder.adapterSimpledraweeview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

           EventBus.getDefault().postSticky(new EventBean(list.get(position).getThumbnail_pic_s(),list.get(position).getTitle()));


               context.startActivity(new Intent(context, Main2Activity.class));

            }
        });


    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    static class IViewHolder  extends RecyclerView.ViewHolder{
        @BindView(R.id.adapter_simpledraweeview)
        SimpleDraweeView adapterSimpledraweeview;
        @BindView(R.id.adapter_textview)
        TextView adapterTextview;

        IViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
