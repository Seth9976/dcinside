package com.dcinside.app.totalsearch.post;

import A3.p;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.codewaves.stickyheadergrid.a.b;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Al;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nTotalPostContentHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalPostContentHolder.kt\ncom/dcinside/app/totalsearch/post/TotalPostContentHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class f extends b {
    @l
    @z3.f
    public TextView a;
    @l
    @z3.f
    public TextView b;
    @l
    @z3.f
    public TextView c;
    @l
    @z3.f
    public TextView d;
    @l
    @z3.f
    public View e;

    public f(@l View view0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.totalsearch.post.TotalPostContentHolder$1", f = "TotalPostContentHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final f l;

            a(f f0, d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.i();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0FA7);  // id:total_post_subject
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0FA3);  // id:total_post_content
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0FA4);  // id:total_post_date
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B0FA6);  // id:total_post_gallery
        L.o(view4, "findViewById(...)");
        this.d = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B0FA5);  // id:total_post_divider
        L.o(view5, "findViewById(...)");
        this.e = view5;
        r.M(view0, null, new a(this, null), 1, null);
    }

    private final void i() {
        try {
            Context context0 = Al.h(this.itemView.getContext());
            Integer integer0 = null;
            AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
            if(appCompatActivity0 == null) {
                return;
            }
            ViewParent viewParent0 = this.itemView.getParent();
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            e e0 = (e)recyclerView0.getAdapter();
            if(e0 == null) {
                return;
            }
            Integer integer1 = this.getAdapterPosition();
            if(integer1.intValue() >= 0) {
                integer0 = integer1;
            }
            if(integer0 != null) {
                int v = (int)integer0;
                int v1 = e0.z(v);
                w w0 = e0.j0(v1, e0.B(v1, v));
                if(w0 == null) {
                    return;
                }
                if(!e0.k0(w0)) {
                    return;
                }
                com.dcinside.app.totalsearch.a.f a$f0 = w0.a();
                String s = a$f0.f();
                int v2 = a$f0.i();
                if(s == null) {
                    return;
                }
                new com.dcinside.app.util.Xk.a(s, v2, 0, null, false, false, true, false, true, false, null, false, null, null, 16060, null).a(appCompatActivity0);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        timber.log.b.a.y(exception0);
    }
}

