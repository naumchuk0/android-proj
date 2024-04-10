package com.example.firstandroidproject.category;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstandroidproject.R;
import com.example.firstandroidproject.dto.category.CategoryItemDTO;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryCardViewHolder> {
    private List<CategoryItemDTO> items;

    public CategoryAdapter(List<CategoryItemDTO> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public CategoryCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.category_view, parent, false);
        return new CategoryCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryCardViewHolder holder, int position) {
        if (items != null && position < items.size()) {
            CategoryItemDTO item = items.get(position);
            holder.getCategoryName().setText(item.getName());
            holder.getCategoryDescription().setText(item.getDescription());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}