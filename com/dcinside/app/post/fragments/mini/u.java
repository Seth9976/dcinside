package com.dcinside.app.post.fragments.mini;

import A3.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.response.PostItem;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nMiniGallNoticeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniGallNoticeAdapter.kt\ncom/dcinside/app/post/fragments/mini/MiniGallNoticeAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n774#2:86\n865#2,2:87\n*S KotlinDebug\n*F\n+ 1 MiniGallNoticeAdapter.kt\ncom/dcinside/app/post/fragments/mini/MiniGallNoticeAdapter\n*L\n68#1:86\n68#1:87,2\n*E\n"})
public final class u extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private ArrayList a;
    @m
    private String b;
    @l
    public static final a c = null;
    private static final int d = 10;
    private static final int e = 1;
    private static final int f = 2;

    static {
        u.c = new a(null);
    }

    public u() {
        this.a = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return Math.min(this.a.size(), 10);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return this.getItemCount() == 1 ? 1 : 2;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((v)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
    }

    public void w(@l v v0, int v1) {
        @f(c = "com.dcinside.app.post.fragments.mini.MiniGallNoticeAdapter$onBindViewHolder$1", f = "MiniGallNoticeAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final AppCompatActivity l;
            final u m;
            final int n;

            b(AppCompatActivity appCompatActivity0, u u0, int v, d d0) {
                this.l = appCompatActivity0;
                this.m = u0;
                this.n = v;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                Xk.k(this.l, this.m.b, this.n, true, false, false, 0x30, null);
                return S0.a;
            }
        }

        L.p(v0, "holder");
        Object object0 = this.a.get(v1);
        L.o(object0, "get(...)");
        v0.e().setText(((PostItem)object0).K());
        int v2 = ((PostItem)object0).C();
        Context context0 = Dl.b(v0.itemView);
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        L.o(v0.itemView, "itemView");
        b u$b0 = new b(appCompatActivity0, this, v2, null);
        r.M(v0.itemView, null, u$b0, 1, null);
        if(v0 instanceof com.dcinside.app.post.fragments.mini.w) {
            return;
        }
        switch(this.getItemCount()) {
            case 1: {
                break;
            }
            case 2: {
                v0.itemView.getLayoutParams().width = 0;
                return;
            }
            default: {
                v0.itemView.getLayoutParams().width = 0;
                break;
            }
        }
    }

    @l
    public v x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v == 1) {
            View view0 = layoutInflater0.inflate(0x7F0E0218, viewGroup0, false);  // layout:view_mini_notice_single_item
            L.m(view0);
            return new com.dcinside.app.post.fragments.mini.w(view0);
        }
        View view1 = layoutInflater0.inflate(0x7F0E0217, viewGroup0, false);  // layout:view_mini_notice_multi_item
        L.m(view1);
        return new v(view1);
    }

    public final void y(@l List list0, long v, @l String s) {
        long v1;
        L.p(list0, "item");
        L.p(s, "gallId");
        this.b = s;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            String s1 = ((PostItem)object0).g();
            if(s1 == null) {
                v1 = 0L;
            }
            else {
                Date date0 = Bk.f(s1);
                v1 = date0 == null ? System.currentTimeMillis() : date0.getTime();
            }
            String s2 = ((PostItem)object0).A();
            if((s2 == null || s2.length() == 0) && v1 > v) {
                arrayList0.add(object0);
            }
        }
        this.a.clear();
        this.a.addAll(arrayList0);
        this.notifyDataSetChanged();
    }
}

