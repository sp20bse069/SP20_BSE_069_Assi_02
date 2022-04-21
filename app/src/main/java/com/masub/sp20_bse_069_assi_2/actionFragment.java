package com.masub.sp20_bse_069_assi_2;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link actionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class actionFragment extends Fragment {
    Button inputData,Calculate;
    View view;
    changefrag IF;

    public actionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment actionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static actionFragment newInstance() {
        actionFragment fragment = new actionFragment();

        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        IF=(MainActivity)context;
    }

    @Override
    public void onResume() {
        super.onResume();
        inputData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IF.changef();

            }
        });
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText((MainActivity)getContext(), "Hello", Toast.LENGTH_SHORT).show();
                IF.calculatefrag();
            }
        });
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_action, container, false);
        inputData = view.findViewById(R.id.inputDataBtn);
        Calculate = view.findViewById(R.id.calculateBtn);

        return view;
    }
    public interface changefrag{
        void changef();
        void calculatefrag();
    }
}