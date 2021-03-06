package com.nguyenminh.learn_english.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nguyenminh.learn_english.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hieph on 6/26/2018.
 */

public class ItemAdapter extends BaseAdapter {
    private List<ItemHome> item;

    public ItemAdapter(List<ItemHome> item) {
        this.item = item;
    }

    @Override
    public int getCount() {
        if (item == null) {
            return 0;
        }
        return item.size();
    }

    @Override
    public Object getItem(int position) {
        return item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){

            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.item_menu,parent,false);

        }
        ImageView imvstar = (ImageView)convertView.findViewById(R.id.imv_item);
        TextView tvstar=(TextView)convertView.findViewById(R.id.tv_text);
        ItemHome itemHome =item.get(position);
        imvstar.setImageResource(itemHome.getId());
        tvstar.setText(itemHome.getName());
        return convertView;
    }
}
