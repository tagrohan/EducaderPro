package com.luqidoproit.educaderpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragcontentcomp extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view=inflater.inflate(R.layout.fragcontentcomp,null);
        final ListView pdflistcomp=view.findViewById(R.id.pdflistcomp);

        String[] pdffiles={"GATE PDF","CAT PDF","UPSC PDF","SAT PDF"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getContext(),R.layout.support_simple_spinner_dropdown_item,pdffiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view1= super.getView(position, convertView, parent);
                TextView textView=view1.findViewById(R.id.text1);
                return view1;
            }
        };

        pdflistcomp.setAdapter(adapter);
        pdflistcomp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item=pdflistcomp.getItemAtPosition(position).toString();

                Intent start=new Intent(getContext(),pdfopnercomp.class);
                start.putExtra("pdfcontentname",item);
                getActivity().startActivity(start);

            }
        });




        return view;
    }
}
