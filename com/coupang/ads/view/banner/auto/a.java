package com.coupang.ads.view.banner.auto;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.coupang.ads.tools.d;
import java.util.ArrayList;
import kotlin.jvm.internal.L;
import y4.l;

public final class a extends PagerAdapter {
    @l
    private final ArrayList e;
    @l
    private Context f;
    public Drawable[] g;

    public a(@l ArrayList arrayList0, @l Context context0) {
        L.p(arrayList0, "data");
        L.p(context0, "context");
        super();
        this.e = arrayList0;
        this.f = context0;
    }

    public final void A(@l Drawable[] arr_drawable) {
        L.p(arr_drawable, "<set-?>");
        this.g = arr_drawable;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void b(@l ViewGroup viewGroup0, int v, @l Object object0) {
        L.p(viewGroup0, "container");
        L.p(object0, "object");
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public int e() {
        return 0x7FFFFFFF;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    @l
    public Object j(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "container");
        int v1 = this.w(v);
        Object object0 = this.e.get(v1);
        L.o(object0, "data[getCurrentIndex(position)]");
        BannerItemView bannerItemView0 = new BannerItemView(this.f, null, 0, 6, null);
        bannerItemView0.d(((e)object0).a());
        ((e)object0).c(bannerItemView0);
        viewGroup0.addView(bannerItemView0, new ViewGroup.LayoutParams(-1, d.b(bannerItemView0.getContext(), 150)));
        if(this.g != null) {
            bannerItemView0.setBackground(((Drawable)kotlin.collections.l.Pe(this.y(), 0)));
        }
        return bannerItemView0;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public boolean k(@l View view0, @l Object object0) {
        L.p(view0, "view");
        L.p(object0, "object");
        return L.g(view0, object0);
    }

    @l
    public final Context v() {
        return this.f;
    }

    private final int w(int v) {
        return v % this.e.size();
    }

    @l
    public final ArrayList x() {
        return this.e;
    }

    @l
    public final Drawable[] y() {
        Drawable[] arr_drawable = this.g;
        if(arr_drawable != null) {
            return arr_drawable;
        }
        L.S("extBackground");
        return null;
    }

    public final void z(@l Context context0) {
        L.p(context0, "<set-?>");
        this.f = context0;
    }
}

