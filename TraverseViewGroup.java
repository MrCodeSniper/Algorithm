package com.lexj.test;

import android.view.View;
import android.view.ViewGroup;

public class TraverseViewGroup {



    public static View find(ViewGroup vg, int id){

        if(vg==null) return null;


        for(int i=0;i<vg.getChildCount();i++){

            View child=vg.getChildAt(i);

            if(child.getId()== id){
                return child;
            }


            if(child instanceof ViewGroup){
                View view=find((ViewGroup) child,id);
                if(view!=null) return view;
            }


        }

        return null;




    }
}
