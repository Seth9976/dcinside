package com.lsjwzh.widget.recyclerviewpager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class e {
    public static View a(RecyclerView recyclerView0) {
        int v = recyclerView0.getChildCount();
        if(v > 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = recyclerView0.getChildAt(v1);
                if(e.e(recyclerView0, view0)) {
                    return view0;
                }
            }
        }
        return null;
    }

    public static int b(RecyclerView recyclerView0) {
        int v = recyclerView0.getChildCount();
        if(v > 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = recyclerView0.getChildAt(v1);
                if(e.e(recyclerView0, view0)) {
                    return recyclerView0.getChildAdapterPosition(view0);
                }
            }
        }
        return v;
    }

    public static View c(RecyclerView recyclerView0) {
        int v = recyclerView0.getChildCount();
        if(v > 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = recyclerView0.getChildAt(v1);
                if(e.f(recyclerView0, view0)) {
                    return view0;
                }
            }
        }
        return null;
    }

    public static int d(RecyclerView recyclerView0) {
        int v = recyclerView0.getChildCount();
        if(v > 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = recyclerView0.getChildAt(v1);
                if(e.f(recyclerView0, view0)) {
                    return recyclerView0.getChildAdapterPosition(view0);
                }
            }
        }
        return v;
    }

    public static boolean e(RecyclerView recyclerView0, View view0) {
        int v = recyclerView0.getChildCount();
        int[] arr_v = new int[2];
        int[] arr_v1 = new int[2];
        recyclerView0.getLocationOnScreen(arr_v);
        int v1 = arr_v[0] + recyclerView0.getWidth() / 2;
        if(v > 0) {
            view0.getLocationOnScreen(arr_v1);
            int v2 = arr_v1[0];
            return v2 <= v1 && v2 + view0.getWidth() >= v1;
        }
        return false;
    }

    public static boolean f(RecyclerView recyclerView0, View view0) {
        int v = recyclerView0.getChildCount();
        int[] arr_v = new int[2];
        int[] arr_v1 = new int[2];
        recyclerView0.getLocationOnScreen(arr_v);
        int v1 = arr_v[1] + recyclerView0.getHeight() / 2;
        if(v > 0) {
            view0.getLocationOnScreen(arr_v1);
            int v2 = arr_v1[1];
            return v2 <= v1 && v2 + view0.getHeight() >= v1;
        }
        return false;
    }
}

