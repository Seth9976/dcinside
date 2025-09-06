package com.dcinside.app.settings.block;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.dcinside.app.settings.block.dccon.m;
import com.dcinside.app.settings.block.post.D;
import com.dcinside.app.settings.block.report.h;
import kotlin.jvm.internal.L;
import y4.l;

public final class b extends FragmentStateAdapter {
    @l
    private final Bundle m;
    @l
    private final Class[] n;

    public b(@l FragmentActivity fragmentActivity0, @l Bundle bundle0) {
        L.p(fragmentActivity0, "activity");
        L.p(bundle0, "bundle");
        super(fragmentActivity0);
        this.m = bundle0;
        this.n = new Class[]{D.class, com.dcinside.app.settings.block.image.l.class, m.class, h.class};
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.n.length;
    }

    @Override  // androidx.viewpager2.adapter.FragmentStateAdapter
    @l
    public Fragment x(int v) {
        Fragment fragment0;
        switch(v) {
            case 0: {
                fragment0 = new D();
                fragment0.setArguments(this.m);
                return fragment0;
            }
            case 1: {
                return new com.dcinside.app.settings.block.image.l();
            }
            case 2: {
                return new m();
            }
            case 3: {
                return new h();
            }
            default: {
                fragment0 = new D();
                fragment0.setArguments(this.m);
                return fragment0;
            }
        }
    }
}

