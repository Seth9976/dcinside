package com.lsjwzh.widget.recyclerviewpager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment.SavedState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@TargetApi(12)
public abstract class a extends Adapter {
    class com.lsjwzh.widget.recyclerviewpager.a.a implements c {
        private Random a;

        com.lsjwzh.widget.recyclerviewpager.a.a() {
            this.a = new Random();
        }

        @Override  // com.lsjwzh.widget.recyclerviewpager.a$c
        public int a(Set set0) {
            return Math.abs(this.a.nextInt());
        }
    }

    public class b extends ViewHolder implements View.OnAttachStateChangeListener {
        final a a;

        public b(View view0) {
            super(view0);
            view0.addOnAttachStateChangeListener(this);
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view0) {
            if(a.this.b == null) {
                FragmentTransaction fragmentTransaction0 = a.this.a.u();
                a.this.b = fragmentTransaction0;
            }
            int v = this.getLayoutPosition();
            int v1 = a.this.z(v);
            int v2 = this.getLayoutPosition();
            SavedState fragment$SavedState0 = (SavedState)a.this.c.get(v1);
            Fragment fragment0 = a.this.A(v2, fragment$SavedState0);
            if(fragment0 != null) {
                int v3 = this.itemView.getId();
                a.this.b.D(v3, fragment0, v1 + "");
                a.this.b.r();
                a.this.b = null;
                a.this.a.n0();
            }
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view0) {
            int v = this.getLayoutPosition();
            int v1 = a.this.z(v);
            Fragment fragment0 = a.this.a.s0(v1 + "");
            if(fragment0 == null) {
                return;
            }
            if(a.this.b == null) {
                FragmentTransaction fragmentTransaction0 = a.this.a.u();
                a.this.b = fragmentTransaction0;
            }
            a.this.c.put(v1, a.this.a.T1(fragment0));
            a.this.b.B(fragment0);
            a.this.b.r();
            a.this.b = null;
            a.this.a.n0();
            int v2 = this.getLayoutPosition();
            a.this.D(v2, fragment0);
        }
    }

    public interface c {
        int a(Set arg1);
    }

    private final FragmentManager a;
    private FragmentTransaction b;
    private SparseArray c;
    private Set d;
    private c e;
    private static final String f = "FragmentStatePagerAdapter";

    public a(FragmentManager fragmentManager0) {
        this.b = null;
        this.c = new SparseArray();
        this.d = new HashSet();
        this.e = new com.lsjwzh.widget.recyclerviewpager.a.a(this);
        this.a = fragmentManager0;
    }

    public abstract Fragment A(int arg1, SavedState arg2);

    public final void B(b a$b0, int v) {
    }

    public final b C(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E017E, viewGroup0, false);  // layout:rvp_fragment_container
        int v1 = this.e.a(this.d);
        if(viewGroup0.getContext() instanceof Activity) {
            while(((Activity)viewGroup0.getContext()).getWindow().getDecorView().findViewById(v1) != null) {
                v1 = this.e.a(this.d);
            }
        }
        view0.findViewById(0x7F0B0D98).setId(v1);  // id:rvp_fragment_container
        this.d.add(v1);
        return new b(this, view0);
    }

    public abstract void D(int arg1, Fragment arg2);

    public void E(b a$b0) {
        if(this.b == null) {
            this.b = this.a.u();
        }
        int v = this.z(a$b0.getBindingAdapterPosition());
        Fragment fragment0 = this.a.s0(v + "");
        if(fragment0 != null) {
            this.c.put(v, this.a.T1(fragment0));
            this.b.B(fragment0);
            this.b.r();
            this.b = null;
            this.a.n0();
        }
        View view0 = a$b0.itemView;
        if(view0 instanceof ViewGroup) {
            ((ViewGroup)view0).removeAllViews();
        }
        super.onViewRecycled(a$b0);
    }

    public void F(@NonNull c a$c0) {
        this.e = a$c0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.C(viewGroup0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(ViewHolder recyclerView$ViewHolder0) {
        this.E(((b)recyclerView$ViewHolder0));
    }

    protected int z(int v) {
        long v1 = this.getItemId(v);
        return v1 == -1L ? v + 1 : ((int)v1);
    }
}

