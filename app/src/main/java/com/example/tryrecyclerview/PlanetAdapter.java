package com.example.tryrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetHolder> {
    @NonNull
    private Context context;
    private ArrayList<Planet> planets;
    public PlanetAdapter(Context context, ArrayList<Planet> planets) {
        this.context = context;
        this.planets = planets;
    }
    @Override
    public PlanetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row,parent,false);
        return new PlanetHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetHolder holder, int position) {
        Planet planet = planets.get(position);
        holder.setDetail(planet);
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }
}
