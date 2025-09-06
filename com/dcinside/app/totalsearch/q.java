package com.dcinside.app.totalsearch;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.dcinside.app.totalsearch.gallery.j;
import com.dcinside.app.totalsearch.post.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class q extends FragmentStateAdapter {
    @l
    private final Class[] m;

    public q(@l FragmentActivity fragmentActivity0) {
        L.p(fragmentActivity0, "activity");
        super(fragmentActivity0);
        this.m = new Class[]{com.dcinside.app.totalsearch.total.l.class, j.class, com.dcinside.app.totalsearch.video.q.class, u.class};
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.m.length;
    }

    @Override  // androidx.viewpager2.adapter.FragmentStateAdapter
    @l
    public Fragment x(int v) {
        switch(v) {
            case 0: {
                return new com.dcinside.app.totalsearch.total.l();
            }
            case 1: {
                return new j();
            }
            case 2: {
                return new com.dcinside.app.totalsearch.video.q();
            }
            case 3: {
                return new u();
            }
            default: {
                return new com.dcinside.app.totalsearch.total.l();
            }
        }
    }
}

