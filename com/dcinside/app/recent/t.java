package com.dcinside.app.recent;

import A3.p;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.codewaves.stickyheadergrid.a.b;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.vk;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class t extends b {
    @l
    private TextView a;
    @l
    private View b;
    @l
    private ImageView c;

    public t(@l View view0) {
        @f(c = "com.dcinside.app.recent.RecentSearchItemHolder$1", f = "RecentSearchItemHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nRecentSearchItemHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentSearchItemHolder.kt\ncom/dcinside/app/recent/RecentSearchItemHolder$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n25#2:32\n1#3:33\n*S KotlinDebug\n*F\n+ 1 RecentSearchItemHolder.kt\ncom/dcinside/app/recent/RecentSearchItemHolder$1\n*L\n22#1:32\n*E\n"})
        static final class a extends o implements p {
            int k;
            final View l;
            final t m;

            a(View view0, t t0, d d0) {
                this.l = view0;
                this.m = t0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, this.m, d0).invokeSuspend(S0.a);
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
                ViewParent viewParent0 = this.l.getParent();
                Integer integer0 = null;
                RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
                if(recyclerView0 == null) {
                    return S0.a;
                }
                Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
                if(!(recyclerView$Adapter0 instanceof s)) {
                    recyclerView$Adapter0 = null;
                }
                if(((s)recyclerView$Adapter0) == null) {
                    return S0.a;
                }
                Integer integer1 = kotlin.coroutines.jvm.internal.b.f(this.m.getAdapterPosition());
                if(integer1.intValue() >= 0) {
                    integer0 = integer1;
                }
                if(integer0 != null) {
                    ((s)recyclerView$Adapter0).t0(((int)integer0));
                    return S0.a;
                }
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0FAB);  // id:total_recent_subject
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0FA9);  // id:total_recent_delete_ic_wrap
        L.o(view2, "findViewById(...)");
        this.b = view2;
        View view3 = view0.findViewById(0x7F0B0FA8);  // id:total_recent_delete_ic
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
        r.M(this.a, null, new a(view0, this, null), 1, null);
        vk.h(0x7F04032A, new View[]{this.c});  // attr:icTintNormal
    }

    @l
    public final View h() {
        return this.b;
    }

    @l
    public final ImageView i() {
        return this.c;
    }

    @l
    public final TextView j() {
        return this.a;
    }

    public final void k(@l View view0) {
        L.p(view0, "<set-?>");
        this.b = view0;
    }

    public final void l(@l ImageView imageView0) {
        L.p(imageView0, "<set-?>");
        this.c = imageView0;
    }

    public final void m(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.a = textView0;
    }
}

