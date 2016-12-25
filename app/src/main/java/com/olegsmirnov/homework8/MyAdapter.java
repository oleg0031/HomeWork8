package com.olegsmirnov.homework8;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private String cityName;
    private String info;
    private String temp;
    private String humidity;
    private String wind_speed;


    MyAdapter(String cityName, String main, String temperature, String humidity, String wind_speed) {
        this.cityName = cityName;
        info = main;
        temp = temperature;
        this.humidity = humidity;
        this.wind_speed = wind_speed;
    }

        @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText("City: " + cityName);
        holder.info.setText("Sky status: " + info);
        holder.temperature.setText("Temperature: " + temp);
        holder.humidity.setText("Humidity: " + humidity + "%");
        holder.wind_speed.setText("Wind speed: " + wind_speed + "m/s");
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView info;
        private TextView temperature;
        private TextView humidity;
        private TextView wind_speed;

        MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.RV_item_name);
            info = (TextView) view.findViewById(R.id.RV_item_info);
            temperature = (TextView) view.findViewById(R.id.RV_item_temp);
            humidity = (TextView) view.findViewById(R.id.RV_item_humidity);
            wind_speed = (TextView) view.findViewById(R.id.RV_item_speed);
        }
    }
}
