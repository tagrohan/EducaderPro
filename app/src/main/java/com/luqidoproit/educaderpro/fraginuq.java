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

public class fraginuq extends Fragment {
    String year,branch,subjectCode;
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fraginuq,null);

        SharedPreferences prefs =getActivity().getSharedPreferences("mypref", Context.MODE_PRIVATE);
        subjectCode=prefs.getString("subjectCode","");
        year=prefs.getString("name","");
        branch=prefs.getString("branch","");
textView=v.findViewById(R.id.textuq);
getVideos();
        return v;
    }

    public void getVideos(){
        // Toast.makeText(getContext(), "please wait.....", Toast.LENGTH_SHORT).show();

        //   ProgressBarUtil.show(this,"Wait....",false);
        try {

            StringRequest sr = new StringRequest(Request.Method.POST,"http://api.luqidoproit.com/index2.php?x=Getrecord", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {

                    //     ProgressBarUtil.dismiss();
                    //  Toast.makeText(getContext(), "responce " + response.toString(), Toast.LENGTH_SHORT).show();
                    Log.d("MyApp", "response " + response);
                    try {
                        JSONObject jsonObject = new JSONObject(response);
                        String status = jsonObject.getString("status");


                        if (status.equals("succcess")) {
                            //   Toast.makeText(fraginsyllabus.this.getContext(), "success " + response.toString(), Toast.LENGTH_SHORT).show();


                            JSONArray jsonArray = jsonObject.getJSONArray("data");

                            ArrayList<String> levelList = new ArrayList<>();
                            for (int i = 0; i < jsonArray.length(); i++) {

                                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

textView.setText(jsonObject1.getString("qbank"));
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
                    //   ProgressBarUtil.dismiss();
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
            //  Toast.makeText(getContext(), e.getMessage().toString(), Toast.LENGTH_LONG).show();
        }
    }



    }

