package com.afollestad.dragselectrecyclerview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.DimenRes;
import androidx.annotation.Px;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.L;
import y4.l;

public final class d {
    @Px
    public static final int a(@l Context context0, @DimenRes int v) {
        L.p(context0, "<this>");
        return context0.getResources().getDimensionPixelSize(v);
    }

    public static final int b(@l RecyclerView recyclerView0, @l MotionEvent motionEvent0) {
        L.p(recyclerView0, "<this>");
        L.p(motionEvent0, "e");
        View view0 = recyclerView0.findChildViewUnder(motionEvent0.getX(), motionEvent0.getY());
        return view0 == null ? -1 : recyclerView0.getChildAdapterPosition(view0);
    }

    public static final boolean c(@l Adapter recyclerView$Adapter0) {
        L.p(recyclerView$Adapter0, "<this>");
        return recyclerView$Adapter0.getItemCount() == 0;
    }
}

