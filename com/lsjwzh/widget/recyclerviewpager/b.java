package com.lsjwzh.widget.recyclerviewpager;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.lang.reflect.Field;

public class b extends d {
    private Field c;
    private static final String d;

    static {
        b.d = "LoopRecyclerViewPager";
    }

    public b(RecyclerViewPager recyclerViewPager0, Adapter recyclerView$Adapter0) {
        super(recyclerViewPager0, recyclerView$Adapter0);
    }

    @Override  // com.lsjwzh.widget.recyclerviewpager.d
    public int getItemCount() {
        return 0x7FFFFFFF;
    }

    @Override  // com.lsjwzh.widget.recyclerviewpager.d
    public long getItemId(int v) {
        return super.getItemId(this.y(v));
    }

    @Override  // com.lsjwzh.widget.recyclerviewpager.d
    public int getItemViewType(int v) {
        return super.getItemViewType(this.y(v));
    }

    @Override  // com.lsjwzh.widget.recyclerviewpager.d
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        super.onBindViewHolder(recyclerView$ViewHolder0, this.y(v));
        if(this.c == null) {
            try {
                Field field0 = recyclerView$ViewHolder0.getClass().getDeclaredField("mPosition");
                this.c = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException unused_ex) {
                Log.i("LoopRecyclerViewPager", "The holder doesn\'t have a mPosition field.");
            }
        }
        Field field1 = this.c;
        if(field1 != null) {
            try {
                field1.set(recyclerView$ViewHolder0, v);
            }
            catch(Exception exception0) {
                Log.w("LoopRecyclerViewPager", "Error while updating holder\'s mPosition field", exception0);
            }
        }
    }

    public int v() {
        return super.getItemCount();
    }

    public long w(int v) {
        return super.getItemId(v);
    }

    public int x(int v) {
        return super.getItemViewType(v);
    }

    public int y(int v) {
        return v < this.v() ? v : v % this.v();
    }
}

