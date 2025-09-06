package com.dcinside.app.recent;

import A3.p;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
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

@s0({"SMAP\nRecentPageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentPageHolder.kt\ncom/dcinside/app/recent/RecentPageHolder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,88:1\n13411#2,3:89\n1#3:92\n25#4:93\n25#4:94\n25#4:95\n*S KotlinDebug\n*F\n+ 1 RecentPageHolder.kt\ncom/dcinside/app/recent/RecentPageHolder\n*L\n48#1:89,3\n70#1:93\n77#1:94\n84#1:95\n*E\n"})
public final class j extends ViewHolder {
    @l
    private final ViewGroup[] a;
    @l
    private final ViewGroup b;
    @l
    private final TextView c;
    @l
    private final TextView d;
    @l
    private final ViewGroup e;
    @l
    private final ViewGroup f;
    @l
    private final TextView[] g;
    @l
    private final ImageView[] h;
    @l
    private final View[] i;

    public j(@l View view0) {
        @f(c = "com.dcinside.app.recent.RecentPageHolder$1", f = "RecentPageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final j l;

            a(j j0, d d0) {
                this.l = j0;
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
                this.l.u();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.recent.RecentPageHolder$2$1", f = "RecentPageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final j l;
            final int m;

            b(j j0, int v, d d0) {
                this.l = j0;
                this.m = v;
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
                this.l.t(this.m);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.recent.RecentPageHolder$2$2", f = "RecentPageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final j l;
            final int m;

            c(j j0, int v, d d0) {
                this.l = j0;
                this.m = v;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new c(this.l, this.m, d0).invokeSuspend(S0.a);
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
                this.l.v(this.m);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.recent.RecentPageHolder$3$1", f = "RecentPageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.recent.j.d extends o implements p {
            int k;
            final j l;
            final int m;

            com.dcinside.app.recent.j.d(j j0, int v, d d0) {
                this.l = j0;
                this.m = v;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.recent.j.d(this.l, this.m, d0).invokeSuspend(S0.a);
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
                this.l.t(this.m);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.recent.RecentPageHolder$3$2", f = "RecentPageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements p {
            int k;
            final j l;
            final int m;

            e(j j0, int v, d d0) {
                this.l = j0;
                this.m = v;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new e(this.l, this.m, d0).invokeSuspend(S0.a);
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
                this.l.v(this.m);
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0CB7);  // id:recent_visit_empty_group
        L.o(view1, "findViewById(...)");
        this.b = (ViewGroup)view1;
        View view2 = view0.findViewById(0x7F0B0CB6);  // id:recent_visit_empty
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0CCD);  // id:recent_visit_retry
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B0CC2);  // id:recent_visit_left
        L.o(view4, "findViewById(...)");
        this.e = (ViewGroup)view4;
        View view5 = view0.findViewById(0x7F0B0CCE);  // id:recent_visit_right
        L.o(view5, "findViewById(...)");
        this.f = (ViewGroup)view5;
        r.M(((TextView)view3), null, new a(this, null), 1, null);
        this.g = new TextView[10];
        this.h = new ImageView[10];
        this.i = new View[10];
        this.a = new ViewGroup[10];
        int v = 0;
        for(int v1 = 0; v1 < 5; ++v1) {
            int v2 = v1 * 2 + 1;
            this.a[v1 * 2] = this.e.getChildAt(v1);
            this.a[v2] = this.f.getChildAt(v1);
            ViewGroup viewGroup0 = this.a[v1 * 2];
            if(viewGroup0 != null) {
                r.M(viewGroup0, null, new b(this, v1 * 2, null), 1, null);
                r.S(viewGroup0, null, false, new c(this, v1 * 2, null), 3, null);
            }
            ViewGroup viewGroup1 = this.a[v2];
            if(viewGroup1 != null) {
                r.M(viewGroup1, null, new com.dcinside.app.recent.j.d(this, v2, null), 1, null);
                r.S(viewGroup1, null, false, new e(this, v2, null), 3, null);
            }
        }
        ViewGroup[] arr_viewGroup = this.a;
        for(int v3 = 0; v < arr_viewGroup.length; ++v3) {
            ViewGroup viewGroup2 = arr_viewGroup[v];
            this.g[v3] = this.n(viewGroup2);
            this.h[v3] = this.j(viewGroup2);
            this.i[v3] = this.p(viewGroup2);
            ++v;
        }
    }

    @l
    public final TextView i() {
        return this.c;
    }

    private final ImageView j(ViewGroup viewGroup0) {
        View view0 = viewGroup0 == null ? null : viewGroup0.getChildAt(2);
        return view0 instanceof ImageView ? ((ImageView)view0) : null;
    }

    @l
    public final ImageView[] k() {
        return this.h;
    }

    @l
    public final ViewGroup l() {
        return this.e;
    }

    @l
    public final ViewGroup m() {
        return this.b;
    }

    private final TextView n(ViewGroup viewGroup0) {
        View view0 = viewGroup0 == null ? null : viewGroup0.getChildAt(1);
        return view0 instanceof TextView ? ((TextView)view0) : null;
    }

    @l
    public final View[] o() {
        return this.i;
    }

    private final View p(ViewGroup viewGroup0) {
        return viewGroup0 == null ? null : viewGroup0.getChildAt(0);
    }

    @l
    public final TextView q() {
        return this.d;
    }

    @l
    public final ViewGroup r() {
        return this.f;
    }

    @l
    public final TextView[] s() {
        return this.g;
    }

    private final void t(int v) {
        Integer integer0 = this.getAdapterPosition();
        Adapter recyclerView$Adapter0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v1 = (int)integer0;
            ViewParent viewParent0 = this.itemView.getParent();
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof i) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((i)recyclerView$Adapter0) == null) {
                return;
            }
            ((i)recyclerView$Adapter0).B(v1, v);
        }
    }

    private final void u() {
        Integer integer0 = this.getAdapterPosition();
        Adapter recyclerView$Adapter0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            ViewParent viewParent0 = this.itemView.getParent();
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof i) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((i)recyclerView$Adapter0) == null) {
                return;
            }
            ((i)recyclerView$Adapter0).C(v);
        }
    }

    private final void v(int v) {
        Integer integer0 = this.getAdapterPosition();
        Adapter recyclerView$Adapter0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v1 = (int)integer0;
            ViewParent viewParent0 = this.itemView.getParent();
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof i) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((i)recyclerView$Adapter0) == null) {
                return;
            }
            ((i)recyclerView$Adapter0).E(v1, v);
        }
    }
}

