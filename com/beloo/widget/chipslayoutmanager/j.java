package com.beloo.widget.chipslayoutmanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller;
import androidx.recyclerview.widget.RecyclerView.State;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;

public interface j {
    SmoothScroller a(@NonNull Context arg1, int arg2, int arg3, AnchorViewState arg4);

    boolean b(Recycler arg1, State arg2);

    int c(State arg1);

    int d(State arg1);

    int e(State arg1);

    int f(int arg1, Recycler arg2, State arg3);

    int g(int arg1, Recycler arg2, State arg3);

    int h(State arg1);

    boolean i();

    int j(State arg1);

    boolean k();

    int l(State arg1);
}

