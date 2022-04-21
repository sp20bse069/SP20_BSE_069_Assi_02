package com.masub.sp20_bse_069_assi_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements actionFragment.changefrag{
    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction fTrans = fm.beginTransaction();
    inputDataFragment inputdata;
    calculateFragment calcfrag;
    Button inputDataBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            messageFragment msg = new messageFragment();
            actionFragment act = new actionFragment();
            inputdata=inputDataFragment.newInstance();
            calcfrag = calculateFragment.newInstance();
            fTrans.add(R.id.frameLayout1,act);
            fTrans.add(R.id.frameLayout2,msg);
            fTrans.commit();
        }



    }
    @Override
    public void changef() {
        FragmentTransaction fragmentTransaction;
        fragmentTransaction= fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout2,inputdata);
        fragmentTransaction.commit();
    }

    @Override
    public void calculatefrag() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout2,calcfrag);
        fragmentTransaction.commit();

    }
}