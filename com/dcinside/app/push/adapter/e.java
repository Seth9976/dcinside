package com.dcinside.app.push.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.dcinside.app.push.e0;
import com.dcinside.app.push.z0;
import kotlin.jvm.internal.L;
import y4.l;

public final class e extends FragmentStateAdapter {
    @l
    private final Class[] m;

    public e(@l FragmentActivity fragmentActivity0) {
        L.p(fragmentActivity0, "fragment");
        super(fragmentActivity0);
        this.m = new Class[]{e0.class, z0.class};
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.m.length;
    }

    @Override  // androidx.viewpager2.adapter.FragmentStateAdapter
    @l
    public Fragment x(int v) {
        Object object0 = this.m[v].newInstance();
        L.n(object0, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        return (Fragment)object0;
    }
}

