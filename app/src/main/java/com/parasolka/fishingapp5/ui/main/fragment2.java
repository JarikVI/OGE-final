package com.parasolka.fishingapp5.ui.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.parasolka.fishingapp5.CreateVideoPost;
import com.parasolka.fishingapp5.MyAdapter;
import com.parasolka.fishingapp5.MyAdapter2;
import com.parasolka.fishingapp5.OGEv1;
import com.parasolka.fishingapp5.OGEv2;
import com.parasolka.fishingapp5.OGEv3;
import com.parasolka.fishingapp5.OGEv4;
import com.parasolka.fishingapp5.ProfileActivity;
import com.parasolka.fishingapp5.R;
import com.parasolka.fishingapp5.upload;
import com.google.firebase.auth.FirebaseAuth;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class fragment2 extends Fragment {
    public DatabaseReference acc;
    CircleImageView c1;
    String final1;
    RecyclerView recycle2;
    List<upload> prolist2;
    FirebaseUser vapar;
    DatabaseReference acc2;
    private String userId, abc;
    MyAdapter myadapter2;
    private DatabaseReference refrence;
    private ValueEventListener eventListener;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout, container, false);
        btn =(Button) view.findViewById(R.id.button11);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager manager= (ConnectivityManager)
                        getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activenetwork = manager.getActiveNetworkInfo();
                if(null!=activenetwork){
                    Intent i6 = new Intent(getActivity(), OGEv4.class);
                    startActivity(i6);
                }
                else
                {
                    Toast.makeText(v.getContext(),"No Internet Connection",Toast.LENGTH_SHORT).show();
                }

            }
        });
        return view;
    }

    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}

