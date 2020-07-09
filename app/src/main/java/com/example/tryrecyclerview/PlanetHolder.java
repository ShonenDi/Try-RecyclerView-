package com.example.tryrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Locale;

public class PlanetHolder extends RecyclerView.ViewHolder {
    private TextView txtName, txtDistance, txtGravity, txtDiameter;

    public PlanetHolder(@NonNull View itemView) {
        super(itemView);
        txtName = itemView.findViewById(R.id.txtName);
        txtDistance = itemView.findViewById(R.id.txtDistance);
        txtGravity = itemView.findViewById(R.id.txtGravity);
        txtDiameter = itemView.findViewById(R.id.txtDiameter);
    }
    public void setDetail(Planet planet){
        txtName.setText(planet.getPlanetName());
        txtDistance.setText(String.format(Locale.US,"Distance from Sun: %d Million km",planet.getDistanceFromSun()));
        txtGravity.setText(String.format(Locale.US, "Surface Gravity : %d N/kg", planet.getGravity()));
        txtDiameter.setText(String.format(Locale.US, "Diameter : %d KM", planet.getDiameter()));
    }
}
