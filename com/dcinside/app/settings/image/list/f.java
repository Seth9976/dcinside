package com.dcinside.app.settings.image.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.n;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.target.p;
import com.dcinside.app.settings.image.AutoImageData;
import com.dcinside.app.settings.image.auto.S;
import com.dcinside.app.settings.image.model.AutoImage;
import com.dcinside.app.util.vk;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nDefaultImageListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageListAdapter.kt\ncom/dcinside/app/settings/image/list/DefaultImageListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
public final class f extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final ArrayList a;
    @l
    public static final a b = null;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;

    static {
        f.b = new a(null);
    }

    public f() {
        this.a = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        return object0 instanceof Integer ? ((Number)object0).intValue() : 2;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        public static final class b implements h {
            final f a;
            final ViewHolder b;

            b(f f0, ViewHolder recyclerView$ViewHolder0) {
                this.a = f0;
                this.b = recyclerView$ViewHolder0;
                super();
            }

            public boolean a(@l Drawable drawable0, @l Object object0, @m p p0, @l com.bumptech.glide.load.a a0, boolean z) {
                L.p(drawable0, "resource");
                L.p(object0, "model");
                L.p(a0, "dataSource");
                this.a.x(((com.dcinside.app.settings.image.list.h)this.b));
                return false;
            }

            @Override  // com.bumptech.glide.request.h
            public boolean onLoadFailed(@m q q0, @m Object object0, @l p p0, boolean z) {
                L.p(p0, "target");
                return false;
            }

            @Override  // com.bumptech.glide.request.h
            public boolean onResourceReady(Object object0, Object object1, p p0, com.bumptech.glide.load.a a0, boolean z) {
                return this.a(((Drawable)object0), object1, p0, a0, z);
            }
        }

        L.p(recyclerView$ViewHolder0, "h");
        recyclerView$ViewHolder0.itemView.getContext();
        if(recyclerView$ViewHolder0 instanceof S) {
            ((S)recyclerView$ViewHolder0).e().setText("내 자짤");
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.settings.image.list.h) {
            Object object0 = this.a.get(v);
            String s = null;
            AutoImageData autoImageData0 = object0 instanceof AutoImageData ? ((AutoImageData)object0) : null;
            if(autoImageData0 == null) {
                return;
            }
            ((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0).f().setText("");
            if(L.g("", "기본")) {
                ((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0).h().setBackgroundResource(0x7F0800FF);  // drawable:auto_thumb_border
                ((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0).f().setTypeface(((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0).f().getTypeface(), 1);
            }
            else {
                ((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0).h().setBackgroundResource(0);
                ((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0).f().setTypeface(((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0).f().getTypeface(), 0);
            }
            if(autoImageData0.w()) {
                s = "";
                if(((AutoImage)u.W2(autoImageData0.o(), 0)) == null) {
                }
            }
            else {
                Object object1 = null;
                for(Object object2: autoImageData0.o()) {
                    if(((AutoImage)object2).l() == autoImageData0.t()) {
                        object1 = object2;
                        break;
                    }
                }
                if(((AutoImage)object1) != null) {
                    s = "";
                }
            }
            if(m0.a.a.h(s)) {
                com.dcinside.app.glide.a.l(((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0).e()).p(((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0).e());
                this.y(((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0));
                return;
            }
            this.y(((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0));
            com.dcinside.app.glide.a.l(((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0).e()).t0(s).Q1(com.dcinside.app.glide.b.G2(true).I1(j.b)).X2(new n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(0)}).o2(new b(this, recyclerView$ViewHolder0)).q1(((com.dcinside.app.settings.image.list.h)recyclerView$ViewHolder0).e());
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        switch(v) {
            case 0: {
                View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E021B, viewGroup0, false);  // layout:view_my_image_list_item
                L.m(view1);
                return new S(view1);
            }
            case 1: {
                View view2 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01CA, viewGroup0, false);  // layout:view_def_img_list_item_guide
                L.m(view2);
                return new g(view2);
            }
            default: {
                View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01CB, viewGroup0, false);  // layout:view_def_img_list_item_image
                L.m(view0);
                return new com.dcinside.app.settings.image.list.h(view0);
            }
        }
    }

    @l
    public final Object w(int v) {
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        return object0;
    }

    private final void x(com.dcinside.app.settings.image.list.h h0) {
        Context context0 = h0.e().getContext();
        L.m(context0);
        h0.e().setBackgroundColor(vk.b(context0, 0x1010054));
        h0.e().setImageDrawable(null);
        h0.e().setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    private final void y(com.dcinside.app.settings.image.list.h h0) {
        com.dcinside.app.glide.a.l(h0.e()).r0(0x7F08041D).X2(new n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(0)}).q1(h0.e());  // drawable:minor_image_error
    }

    public final void z(@l List list0) {
        L.p(list0, "list");
        this.a.clear();
        this.a.add(0);
        this.a.add(1);
        this.a.addAll(list0);
        this.notifyDataSetChanged();
    }
}

