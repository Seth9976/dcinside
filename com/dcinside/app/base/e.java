package com.dcinside.app.base;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nIdViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,23:1\n25#2:24\n*S KotlinDebug\n*F\n+ 1 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n*L\n20#1:24\n*E\n"})
public class e extends ViewHolder {
    public e(@l ViewGroup viewGroup0, @LayoutRes int v) {
        L.p(viewGroup0, "parent");
        super(LayoutInflater.from(viewGroup0.getContext()).inflate(v, viewGroup0, false));
    }

    @m
    public final RecyclerView e() {
        ViewParent viewParent0 = this.itemView.getParent();
        return viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
    }

    public final Adapter f() {
        RecyclerView recyclerView0 = this.e();
        if(recyclerView0 != null) {
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            L.y(2, "T");
            return recyclerView$Adapter0;
        }
        return null;
    }
}

