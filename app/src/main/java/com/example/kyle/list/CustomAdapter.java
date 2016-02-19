package com.example.kyle.list;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, String[] foods) {
        super(context,R.layout.listiem,foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater shweInfator=LayoutInflater.from(getContext());
        View customView =shweInfator.inflate(R.layout.listiem, parent, false);

        String singleFoodItem=getItem(position);
        TextView shweText=(TextView)customView.findViewById(R.id.textView);
        ImageView shweImage=(ImageView)customView.findViewById(R.id.imageView);

        shweText.setText(singleFoodItem);
        shweImage.setImageResource(R.mipmap.image);

        return customView;
    }
}
