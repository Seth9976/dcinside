package com.dcinside.app.settings.launchericon;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.n;
import com.dcinside.app.internal.t;
import com.dcinside.app.util.Al;
import java.util.ArrayList;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLauncherIconSettingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherIconSettingAdapter.kt\ncom/dcinside/app/settings/launchericon/LauncherIconSettingAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,105:1\n147#2:106\n257#3,2:107\n257#3,2:109\n257#3,2:111\n257#3,2:113\n*S KotlinDebug\n*F\n+ 1 LauncherIconSettingAdapter.kt\ncom/dcinside/app/settings/launchericon/LauncherIconSettingAdapter\n*L\n53#1:106\n87#1:107,2\n88#1:109,2\n90#1:111,2\n91#1:113,2\n*E\n"})
public final class b extends Adapter {
    public static final class a {
        @m
        private final Bitmap a;
        @m
        private final String b;

        public a(@m Bitmap bitmap0, @m String s) {
            this.a = bitmap0;
            this.b = s;
        }

        @m
        public final Bitmap a() {
            return this.a;
        }

        @m
        public final String b() {
            return this.b;
        }

        @l
        public final a c(@m Bitmap bitmap0, @m String s) {
            return new a(bitmap0, s);
        }

        public static a d(a b$a0, Bitmap bitmap0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                bitmap0 = b$a0.a;
            }
            if((v & 2) != 0) {
                s = b$a0.b;
            }
            return b$a0.c(bitmap0, s);
        }

        @m
        public final Bitmap e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            return L.g(this.a, ((a)object0).a) ? L.g(this.b, ((a)object0).b) : false;
        }

        @m
        public final String f() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            String s = this.b;
            if(s != null) {
                v = s.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "ImageData(bitmap=" + this.a + ", src=" + this.b + ")";
        }
    }

    @m
    private t a;
    @m
    private d b;
    private boolean c;
    private boolean d;
    @m
    private ArrayList e;
    @m
    private ArrayList f;
    private int g;

    public b() {
        this.g = -1;
    }

    private final void A(int v) {
        t t0 = this.a;
        if(t0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)t0.a();
            if(recyclerView0 != null) {
                ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(v);
                c c0 = recyclerView$ViewHolder0 instanceof c ? ((c)recyclerView$ViewHolder0) : null;
                if(c0 == null) {
                    return;
                }
                this.B(c0, v);
            }
        }
    }

    public void B(@l c c0, int v) {
        int v1 = 0;
        L.p(c0, "holder");
        Context context0 = c0.itemView.getContext();
        ArrayList arrayList0 = this.e;
        if(arrayList0 == null) {
            ArrayList arrayList1 = this.f;
            if(arrayList1 != null) {
                L.m(arrayList1);
                Object object0 = arrayList1.get(v);
                L.o(object0, "get(...)");
                Bitmap bitmap0 = ((a)object0).e();
                if(bitmap0 == null) {
                    String s1 = ((a)object0).f();
                    if(s1 == null) {
                        return;
                    }
                    ((com.bumptech.glide.m)com.bumptech.glide.c.F(context0).N(s1).Q0(new n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(24)})).q1(c0.i());
                }
                else {
                    ((com.bumptech.glide.m)com.bumptech.glide.c.F(context0).H(bitmap0).Q0(new n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(24)})).q1(c0.i());
                }
            }
        }
        else {
            L.m(arrayList0);
            String s = ((com.dcinside.app.settings.launchericon.a)arrayList0.get(v)).c();
            L.m(context0);
            c0.i().setImageResource(Al.a.n(context0, s));
        }
        if(this.c) {
            c0.h().setVisibility(8);
            View view0 = c0.j();
            if(v != this.g) {
                v1 = 8;
            }
            view0.setVisibility(v1);
            return;
        }
        View view1 = c0.h();
        if(v != this.g) {
            v1 = 8;
        }
        view1.setVisibility(v1);
        c0.j().setVisibility(8);
    }

    @l
    public c C(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new c(viewGroup0);
    }

    public final void D(@m Bitmap bitmap0) {
        if(this.f == null) {
            ArrayList arrayList0 = this.e;
            if(arrayList0 == null) {
                return;
            }
            L.m(arrayList0);
            Object object0 = arrayList0.get(this.g);
            L.o(object0, "get(...)");
            d d0 = this.b;
            if(d0 != null) {
                d0.p(((com.dcinside.app.settings.launchericon.a)object0));
            }
        }
        else {
            d d1 = this.b;
            if(d1 != null) {
                d1.A(bitmap0);
            }
        }
    }

    public final void E(int v) {
        int v1 = this.g;
        if(v1 != v) {
            this.g = v;
            if(v1 >= 0) {
                this.A(v1);
            }
            if(v >= 0) {
                this.A(v);
            }
        }
    }

    public final void F(@m ArrayList arrayList0) {
        this.f = arrayList0;
    }

    public final void G(@m ArrayList arrayList0) {
        this.e = arrayList0;
    }

    public final void H(@l d d0) {
        L.p(d0, "listener");
        this.b = d0;
    }

    public final void I(boolean z) {
        this.d = z;
    }

    public final void J(boolean z) {
        this.c = z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        ArrayList arrayList0 = this.e;
        if(arrayList0 != null) {
            return arrayList0.size();
        }
        return this.f == null ? 0 : this.f.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.a = new t(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.B(((c)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.C(viewGroup0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.a = null;
        this.b = null;
    }

    public final int v() {
        return this.g;
    }

    @m
    public final ArrayList w() {
        return this.f;
    }

    @m
    public final ArrayList x() {
        return this.e;
    }

    public final boolean y() {
        return this.d;
    }

    public final boolean z() {
        return this.c;
    }
}

