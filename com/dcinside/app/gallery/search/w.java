package com.dcinside.app.gallery.search;

import A3.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.Y;
import com.dcinside.app.util.Xk;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nMajorHotPageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MajorHotPageAdapter.kt\ncom/dcinside/app/gallery/search/MajorHotPageAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1872#2,3:52\n1872#2,3:55\n*S KotlinDebug\n*F\n+ 1 MajorHotPageAdapter.kt\ncom/dcinside/app/gallery/search/MajorHotPageAdapter\n*L\n32#1:52,3\n40#1:55,3\n*E\n"})
public final class w extends Adapter {
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w w0) {
        }
    }

    @l
    private List a;
    @l
    public static final a b = null;
    private static final int c = 10;

    static {
        w.b = new a(null);
    }

    public w() {
        this.a = u.H();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size() / 10;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((x)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
    }

    @l
    public final List v() {
        return this.a;
    }

    public void w(@l x x0, int v) {
        @f(c = "com.dcinside.app.gallery.search.MajorHotPageAdapter$onBindViewHolder$1$1$1", f = "MajorHotPageAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final AppCompatActivity l;
            final Y m;

            b(AppCompatActivity appCompatActivity0, Y y0, d d0) {
                this.l = appCompatActivity0;
                this.m = y0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, this.m, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                String s = this.m.h();
                Xk.i(this.l, s);
                return S0.a;
            }
        }

        L.p(x0, "holder");
        int v1 = 0;
        for(Object object0: x0.e()) {
            if(v1 < 0) {
                u.Z();
            }
            Y y0 = (Y)this.a.get(v % 10 * 10 + v1);
            ((TextView)object0).setText(y0.l());
            ViewParent viewParent0 = ((TextView)object0).getParent();
            View view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
            if(view0 != null) {
                Context context0 = view0.getContext();
                AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
                if(appCompatActivity0 != null) {
                    r.M(view0, null, new b(appCompatActivity0, y0, null), 1, null);
                }
            }
            ++v1;
        }
        int v2 = 0;
        for(Object object1: x0.f()) {
            if(v2 < 0) {
                u.Z();
            }
            ((TextView)object1).setText(((TextView)object1).getContext().getString(0x7F150844, new Object[]{((Y)this.a.get(v % 10 * 10 + v2)).m()}));  // string:ranking_dot_text "%d."
            ++v2;
        }
    }

    @l
    public x x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E020E, viewGroup0, false);  // layout:view_major_hot_page
        L.o(view0, "inflate(...)");
        return new x(view0);
    }

    public final void y(@l List list0) {
        L.p(list0, "<set-?>");
        this.a = list0;
    }
}

