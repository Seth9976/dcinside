package com.dcinside.app.gallery.search;

import A3.p;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.gallery.info.MinorMoreActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.uk;
import com.dcinside.app.view.StateAnnounceView;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.lsjwzh.widget.recyclerviewpager.LoopRecyclerViewPager;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import rx.g;
import rx.o;
import y4.l;
import y4.m;

public final class v extends ViewHolder {
    @l
    private TextView a;
    @l
    private ImageView b;
    @l
    private ImageView c;
    @l
    private LoopRecyclerViewPager d;
    @l
    private final StateAnnounceView e;
    @l
    private w f;
    @l
    private g g;
    @m
    private o h;
    private boolean i;

    public v(@l View view0) {
        @f(c = "com.dcinside.app.gallery.search.MajorHotHolder$1", f = "MajorHotHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final v l;

            a(v v0, d d0) {
                this.l = v0;
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
                this.l.w();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.search.MajorHotHolder$2", f = "MajorHotHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final v l;

            b(v v0, d d0) {
                this.l = v0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.v();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.search.MajorHotHolder$3", f = "MajorHotHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final v m;

            c(v v0, d d0) {
                this.m = v0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                c v$c0 = new c(this.m, d0);
                v$c0.l = view0;
                return v$c0.invokeSuspend(S0.a);
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
                this.m.u(((View)this.l));
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0290);  // id:category_hot_major_more
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0292);  // id:category_hot_major_previous
        L.o(view2, "findViewById(...)");
        this.b = (ImageView)view2;
        View view3 = view0.findViewById(0x7F0B0291);  // id:category_hot_major_next
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
        View view4 = view0.findViewById(0x7F0B028F);  // id:category_hot_major_list
        L.o(view4, "findViewById(...)");
        this.d = (LoopRecyclerViewPager)view4;
        View view5 = view0.findViewById(0x7F0B028D);  // id:category_hot_major_announce
        L.o(view5, "findViewById(...)");
        this.e = (StateAnnounceView)view5;
        this.f = new w();
        g g0 = uk.Ok(com.dcinside.app.type.m.g);
        L.o(g0, "hotGallery(...)");
        this.g = g0;
        r.M(this.b, null, new a(this, null), 1, null);
        r.M(this.c, null, new b(this, null), 1, null);
        r.M(this.a, null, new c(this, null), 1, null);
        ((StateAnnounceView)view5).setOnRetryListener(() -> {
            L.p(this, "this$0");
            this.q();
        });
    }

    // 检测为 Lambda 实现
    private static final void i(v v0) [...]

    public final void q() {
        static final class com.dcinside.app.gallery.search.v.d extends N implements Function1 {
            final v e;

            com.dcinside.app.gallery.search.v.d(v v0) {
                this.e = v0;
                super(1);
            }

            public final void a(List list0) {
                w w0 = this.e.f;
                L.m(list0);
                w0.y(list0);
                this.e.d.setLayoutManager(new NonPredictiveLayoutManager(0, false));
                this.e.d.setAdapter(this.e.f);
                this.e.f.notifyDataSetChanged();
                this.e.i = true;
                this.e.e.e(k0.d.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((List)object0));
                return S0.a;
            }
        }

        if(this.i) {
            return;
        }
        k0.d d0 = k0.d.e();
        this.e.e(d0);
        this.h = this.g.y5((Object object0) -> {
            L.p(new com.dcinside.app.gallery.search.v.d(this), "$tmp0");
            new com.dcinside.app.gallery.search.v.d(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            k0.d d0 = k0.d.g(throwable0);
            this.e.e(d0);
        });
    }

    // 检测为 Lambda 实现
    private static final void r(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s(v v0, Throwable throwable0) [...]

    @m
    public final o t() {
        return this.h;
    }

    private final void u(View view0) {
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        MinorMoreActivity.A.b(context0, com.dcinside.app.type.m.g);
    }

    private final void v() {
        this.d.smoothScrollToPosition(this.d.getCurrentPosition() + 1);
    }

    private final void w() {
        this.d.smoothScrollToPosition(this.d.getCurrentPosition() - 1);
    }

    public final void x(@m o o0) {
        this.h = o0;
    }
}

