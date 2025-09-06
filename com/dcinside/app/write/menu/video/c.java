package com.dcinside.app.write.menu.video;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.glide.a;
import com.dcinside.app.image.f0;
import com.dcinside.app.rx.bus.m0;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@SuppressLint({"NotifyDataSetChanged"})
@s0({"SMAP\nThumbnailImageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbnailImageAdapter.kt\ncom/dcinside/app/write/menu/video/ThumbnailImageAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class c extends Adapter {
    @l
    private ArrayList a;
    private int b;

    public c() {
        this.a = new ArrayList();
    }

    public final void A(@m String[] arr_s) {
        this.a.clear();
        if(arr_s != null) {
            u.s0(this.a, arr_s);
        }
        this.notifyDataSetChanged();
    }

    public final void B(int v) {
        this.b = v;
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((d)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
    }

    @l
    public final String v() {
        Object object0 = this.a.get(this.b);
        L.o(object0, "get(...)");
        return (String)object0;
    }

    public void w(@l d d0, int v) {
        L.p(d0, "holder");
        ImageView imageView0 = d0.h();
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        a.l(imageView0).t0(((String)object0)).q1(imageView0);
        d0.i().setVisibility((v == this.b ? 0 : 8));
    }

    @l
    public d x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E028D, viewGroup0, false);  // layout:view_thumbnail_image_item
        L.m(view0);
        return new d(view0);
    }

    public final void y(int v, @l Context context0) {
        L.p(context0, "context");
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        com.dcinside.app.rx.bus.c.a(context0, new m0(null, 0, null, ((String)object0), null, null, false, f0.c.ordinal(), this.a, false, null, null, 0xE00, null));
    }

    public final void z(int v) {
        this.b = v;
        this.notifyDataSetChanged();
    }
}

