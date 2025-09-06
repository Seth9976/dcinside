package com.dcinside.app.memo;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class y extends FragmentStateAdapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private final String m;
    @l
    public static final a n = null;
    @l
    public static final String o = "com.dcinside.app.memo.UserMemoTargetPagerAdapter.EXTRA_USER_MEMO_LIST_MODE";

    static {
        y.n = new a(null);
    }

    public y(@l FragmentActivity fragmentActivity0, @m String s) {
        L.p(fragmentActivity0, "fragment");
        super(fragmentActivity0);
        this.m = s;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return 2;
    }

    @Override  // androidx.viewpager2.adapter.FragmentStateAdapter
    @l
    public Fragment x(int v) {
        Fragment fragment0 = new com.dcinside.app.memo.w();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("com.dcinside.app.memo.UserMemoTargetPagerAdapter.EXTRA_USER_MEMO_LIST_MODE", v);
        bundle0.putString("galleryId", this.m);
        fragment0.setArguments(bundle0);
        return fragment0;
    }
}

