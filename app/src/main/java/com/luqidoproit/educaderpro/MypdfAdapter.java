//package com.luqidoproit.educaderpro;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//
//import java.util.ArrayList;
//
//public class MypdfAdapter extends ArrayAdapter<Integer> implements View.OnClickListener {
//
//    private final Activity context;
//    private  ArrayList<Integer> arrayList;
//    private int lastPosition = -1;
//    public MypdfAdapter(Activity context, ArrayList<Integer> arrayList) {
//
//        super(context, R.layout.customlayout, arrayList);
//        // TODO Auto-generated constructor stub
//
//        this.context = context;
//        this.arrayList=arrayList;
//
//    }
//
//    public View getView(int position, View view, ViewGroup parent) {
//        LayoutInflater inflater = context.getLayoutInflater();
//        View rowView = inflater.inflate(R.layout.custom, null, true);
//
//        ImageView subject = (ImageView) rowView.findViewById(R.id.pdfimage);
//        lastPosition = position;
//subject.setBackgroundResource(arrayList.get(position));
//        subject.setOnClickListener(this);
//       subject.setTag(position);
//        return rowView;
//
//    }
//
//    @Override
//    public void onClick(View v) {
//        int position=(Integer) v.getTag();
//        Object object= getItem(position);
//        //pojoSubject dataModel=(pojoSubject) object;
//
//        switch (v.getId())
//        {
//            case R.id.text1:
//                Intent i=new Intent(getContext(),insubjects.class);
//                i.putExtra("subjectCode",dataModel.getSubjectCode());
//                getContext().startActivity(i);
//
//                break;
//        }
//    }
//
//    ;
//}