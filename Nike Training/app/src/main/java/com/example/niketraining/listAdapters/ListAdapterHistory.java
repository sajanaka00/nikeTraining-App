package com.example.niketraining.listAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.listData.ListData_1imgView_2textViews;
import com.example.niketraining.R;

public class ListAdapterHistory extends RecyclerView.Adapter<ListAdapterHistory.ViewHolder> {

    private ListData_1imgView_2textViews[] listdata;

    // RecyclerView recyclerView;
    public ListAdapterHistory(ListData_1imgView_2textViews[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_history, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ListData_1imgView_2textViews myListData3args = listdata[position];
        holder.title.setText(listdata[position].getTitle());
        holder.description.setText(listdata[position].getDescription());

        holder.image.setImageResource(listdata[position].getImgId());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Clicked on item: " + myListData3args.getTitle(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView title;
        public TextView description;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.image = (ImageView) itemView.findViewById(R.id.imageHistory);
            this.title = (TextView) itemView.findViewById(R.id.titleHistory);
            this.description = (TextView) itemView.findViewById(R.id.descriptionHistory);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayoutHistory);
        }
    }
}