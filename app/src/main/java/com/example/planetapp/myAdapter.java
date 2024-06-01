package com.example.planetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class myAdapter extends ArrayAdapter<Contact_Model> {
    Context context;
    ArrayList<Contact_Model> arrayList;
    public myAdapter(Context context,ArrayList<Contact_Model> arrayList){
        super(context,R.layout.item_list,arrayList);
        this.arrayList=arrayList;
          this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        final View result;
        if(convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
            holder =new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.img);
            holder.textView=convertView.findViewById(R.id.t1);
            holder.textView1=convertView.findViewById(R.id.t2);
            result=convertView;
            convertView.setTag(holder);
        }
        else
        {
            holder=(ViewHolder) convertView.getTag();
        }
        holder.textView.setText(arrayList.get(position).name);
        holder.textView1.setText(arrayList.get(position).number);
        holder.imageView.setImageResource(arrayList.get(position).img);
        return convertView;
    }

    static class ViewHolder{
        ImageView imageView;
        TextView textView;
        TextView textView1;
    }
}
