package com.luqidoproit.educaderpro;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by acer on 10/25/2017.
 */

public class Recyle_offer_adapter  extends RecyclerView.Adapter<Recyle_offer_adapter.MyViewHolder>{

   Context context;
   ArrayList<pojoSubject> arrayList;
    Recyle_offer_adapter(Context context, ArrayList<pojoSubject> arrayList){

        this.arrayList=arrayList;
        this.context=context;


    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.customlayout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

holder.subject.setText(arrayList.get(position).getSubjectName());


        Log.d("MyApp",arrayList.get(position).getSubjectName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

       public TextView subject;

        public MyViewHolder(View itemView) {

            super(itemView);
subject=itemView.findViewById(R.id.text1);
        }
    }
}
