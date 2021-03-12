package com.luqidoproit.educaderpro;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class fragproject_csfirst extends Fragment {
    TextView unit1,unit2,unit3,unit4,unit5;
    String year,branch,subjectCode;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragproject_csfirst,null);
        SharedPreferences prefs =getActivity().getSharedPreferences("mypref", Context.MODE_PRIVATE);
        subjectCode=prefs.getString("subjectCode","");
        year=prefs.getString("name","");
        branch=prefs.getString("branch","");

        unit1=v.findViewById(R.id.unit1);
        unit2=v.findViewById(R.id.unit2);
        unit3=v.findViewById(R.id.unit3);
        unit4=v.findViewById(R.id.unit4);
        unit5=v.findViewById(R.id.unit5);


        getSyllbus();
        return v;
    }


    public void getSyllbus(){
       // Toast.makeText(getContext(), "please wait.....", Toast.LENGTH_SHORT).show();

           ProgressBarUtil.show(getContext(),"Wait....",false);
        try {

            StringRequest sr = new StringRequest(Request.Method.POST,"http://api.luqidoproit.com/index2.php?x=Getproject", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {

                         ProgressBarUtil.dismiss();
                   // Toast.makeText(getContext(), "responce " + response.toString(), Toast.LENGTH_SHORT).show();
                    Log.d("MyApp", "response " + response);
                    try {
                        JSONObject jsonObject = new JSONObject(response);
                        String status = jsonObject.getString("status");


                        if (status.equals("succcess")) {
                           // Toast.makeText(getContext(), "success " + response.toString(), Toast.LENGTH_SHORT).show();


                            JSONArray jsonArray = jsonObject.getJSONArray("data");

                            ArrayList<String> levelList = new ArrayList<>();
                            for (int i = 0; i < jsonArray.length(); i++) {

                                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                                unit1.setText(jsonObject1.getString("project1"));
                                unit2.setText(jsonObject1.getString("project2"));
                                unit3.setText(jsonObject1.getString("project3"));
                                unit4.setText(jsonObject1.getString("project4"));
                                unit5.setText(jsonObject1.getString("project5"));
                                //  Log.d("MyApp",bal+" with draw");


                                Log.d("MyApp", response.toString() + " with draw");


                            }

                        }
                    } catch (Exception e) {
                        Log.d("MyApp", "status" + e.toString());
                        // Toast.makeText(getContext(),e.getMessage().toString(),Toast.LENGTH_LONG).show();
                    }

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                      ProgressBarUtil.dismiss();
                }
            }){
                @Override
                protected Map<String,String> getParams(){
                    Map<String,String> params = new HashMap<String, String>();
                    //SharedPreferences sharedPreferences = getActivity().getSharedPreferences(MyPREFERENCES,getActivity().MODE_PRIVATE);

                   params.put("subjectCode",subjectCode);
                    params.put("year",year);
                    params.put("branchCode",branch);


                    return params;

                }
                @Override
                public Map<String, String> getHeaders() throws AuthFailureError {
                    HashMap<String, String> headers = new HashMap<String, String>();
                    headers.put("Login", "admin");
                    headers.put("Password", "admin@12345");
                    return headers;
                }

            };
            RequestQueue requestQueue = Volley.newRequestQueue(getContext());
            sr.setRetryPolicy(new DefaultRetryPolicy(0,
                    DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                    DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            requestQueue.add(sr);
        }
        catch (Exception e) {
           // Toast.makeText(getContext(), e.getMessage().toString(), Toast.LENGTH_LONG).show();
        }
    }
}
