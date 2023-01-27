package com.example.iman_tulenaliev_hw3_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AccessoriesAdapter extends RecyclerView.Adapter<AccessoriesAdapter.AccessoriesViewHolder>{

    ArrayList<Accessories> arrayList;
    public AccessoriesAdapter(ArrayList<Accessories> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public AccessoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AccessoriesViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_accessories, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AccessoriesViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class AccessoriesViewHolder extends RecyclerView.ViewHolder {

        private ImageView accessoriesIcon;
        private TextView accessoriesTitle;
        private TextView accessoriesPrice;

        public AccessoriesViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(Accessories accessories){
            accessoriesIcon = itemView.findViewById(R.id.Image_View_Icon);
            accessoriesTitle = itemView.findViewById(R.id.text_View_Title);
            accessoriesPrice = itemView.findViewById(R.id.text_View_Price);

            accessoriesIcon.setImageResource(accessories.getImage());
            accessoriesTitle.setText(accessories.getTitle());
            accessoriesPrice.setText(accessories.price);
        }
    }
}
