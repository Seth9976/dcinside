package com.dcinside.app.totalsearch.post;

import A3.p;
import android.view.View;
import com.codewaves.stickyheadergrid.a.a;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.ll;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class v extends a {
    private final View a;
    private final View b;

    public v(@l View view0) {
        @f(c = "com.dcinside.app.totalsearch.post.TotalPostHeaderHolder$1", f = "TotalPostHeaderHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.totalsearch.post.v.a extends o implements p {
            int k;
            Object l;
            final v m;

            com.dcinside.app.totalsearch.post.v.a(v v0, d d0) {
                this.m = v0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.totalsearch.post.v.a v$a0 = new com.dcinside.app.totalsearch.post.v.a(this.m, d0);
                v$a0.l = view0;
                return v$a0.invokeSuspend(S0.a);
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
                this.m.i(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.totalsearch.post.TotalPostHeaderHolder$2", f = "TotalPostHeaderHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            Object l;
            final v m;

            b(v v0, d d0) {
                this.m = v0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                b v$b0 = new b(this.m, d0);
                v$b0.l = view0;
                return v$b0.invokeSuspend(S0.a);
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
                this.m.i(((View)this.l));
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0DE5);  // id:search_post_recency
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0DE4);  // id:search_post_rank
        this.b = view2;
        L.o(view1, "vwFilterRecency");
        r.M(view1, null, new com.dcinside.app.totalsearch.post.v.a(this, null), 1, null);
        L.o(view2, "vwFilterRank");
        r.M(view2, null, new b(this, null), 1, null);
    }

    private final void i(View view0) {
        ll.q0(view0.getId() == 0x7F0B0DE5);  // id:search_post_recency
        this.j();
    }

    public final void j() {
        boolean z = ll.M();
        this.a.setSelected(z);
        this.b.setSelected(!z);
    }
}

