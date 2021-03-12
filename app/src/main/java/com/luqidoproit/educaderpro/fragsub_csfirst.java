package com.luqidoproit.educaderpro;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class fragsub_csfirst extends Fragment {
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference,databaseReference_2CS,databaseReferenceme,databaseReference_2ME,databaseReference_2CIVIL,databaseReference_2EE,databaseReference_2ECE, databaseReference_3CS,databaseReference_3ME,databaseReference_3CIVIL,databaseReference_3EE,databaseReference_3ECE;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    private user user;
    private csecondpojo cssecondpojo;
    private CSthird cSthird;
    private MEsecond mEsecond;
    private MEthird mEthird;
    private  EEsecond eEsecond;
    private EEthird eEthird;
    private ECEsecond ecEsecond;
    private ECEthird ecEthird;
    private CIVILsecond civiLsecond;
    private CIVILthird civiLthird;
    private ListView listView;
    String key ,branch;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragsub_csfirst,null);
        listView=v.findViewById(R.id.list);


        SharedPreferences prefs =getActivity().getSharedPreferences("mypref", Context.MODE_PRIVATE);
         key=prefs.getString("name","");
       branch=prefs.getString("branch","");




getSyllbus();

        return v;
    }





    public void getSyllbus(){
       // Toast.makeText(getContext(),key+" "+branch,Toast.LENGTH_LONG).show();
      //  Toast.makeText(getContext(), "please wait.....", Toast.LENGTH_SHORT).show();

          ProgressBarUtil.show(getContext(),"Wait....",false);
        try {

            StringRequest sr = new StringRequest(Request.Method.POST,"http://api.luqidoproit.com/index2.php?x=Getsubject", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {

                         ProgressBarUtil.dismiss();
                 //   Toast.makeText(getContext(), "responce " + response.toString(), Toast.LENGTH_SHORT).show();
                    Log.d("MyApp", "response " + response);
                    try {
                        JSONObject jsonObject = new JSONObject(response);
                        String status = jsonObject.getString("status");


                        if (status.equals("succcess")) {
                           // Toast.makeText(getContext(), "success " + response.toString(), Toast.LENGTH_SHORT).show();


                            JSONArray jsonArray = jsonObject.getJSONArray("data");

                            ArrayList<pojoSubject> subject = new ArrayList<>();
                            for (int i = 0; i < jsonArray.length(); i++) {

                                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                                pojoSubject ps=new pojoSubject();
                                ps.setSubjectCode(jsonObject1.getString("subjectCode"));
                                ps.setSubjectName(jsonObject1.getString("subjectName"));
                                ps.setId(jsonObject1.getString("id"));
                                ps.setBranchCode(jsonObject1.getString("branchCode"));
                                ps.setYear(jsonObject1.getString("year"));



                               subject.add(ps);


                            }
                            Log.d("MyApp","Arry List Subject"+subject.toString());
                            listView.setAdapter(new MyListAdapter(getActivity(),subject));
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


                    params.put("year",key);
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






