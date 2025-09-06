package com.dcinside.app.recent;

import A3.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nRecentHeaderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentHeaderAdapter.kt\ncom/dcinside/app/recent/RecentHeaderAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,72:1\n147#2:73\n147#2:74\n*S KotlinDebug\n*F\n+ 1 RecentHeaderAdapter.kt\ncom/dcinside/app/recent/RecentHeaderAdapter\n*L\n20#1:73\n21#1:74\n*E\n"})
public final class d extends Adapter {
    private final int a;
    @l
    private final t b;
    @l
    private final t c;
    private boolean d;
    @m
    private List e;
    @m
    private List f;
    @m
    private List g;

    public d(int v, @m Function1 function10, @m Function1 function11) {
        this.a = v;
        this.b = new t(function10);
        this.c = new t(function11);
    }

    @m
    public final List A() {
        return this.f;
    }

    public final int B() {
        return this.a;
    }

    public void C(@l e e0, int v) {
        L.p(e0, "holder");
        h h0 = this.y(v);
        e0.e().setText((h0 == null ? null : h0.a()));
    }

    @l
    public e D(@l ViewGroup viewGroup0, int v) {
        @f(c = "com.dcinside.app.recent.RecentHeaderAdapter$onCreateViewHolder$1$1", f = "RecentHeaderAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nRecentHeaderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentHeaderAdapter.kt\ncom/dcinside/app/recent/RecentHeaderAdapter$onCreateViewHolder$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
        static final class a extends o implements p {
            int k;
            final e l;
            final d m;

            a(e e0, d d0, kotlin.coroutines.d d1) {
                this.l = e0;
                this.m = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new a(this.l, this.m, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Integer integer0 = b.f(this.l.getAdapterPosition());
                if(integer0.intValue() < 0) {
                    integer0 = null;
                }
                if(integer0 != null) {
                    h h0 = this.m.y(((int)integer0));
                    if(h0 == null) {
                        return S0.a;
                    }
                    Function1 function10 = (Function1)this.m.b.a();
                    if(function10 != null) {
                        function10.invoke(h0);
                    }
                    return S0.a;
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.recent.RecentHeaderAdapter$onCreateViewHolder$1$2", f = "RecentHeaderAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nRecentHeaderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentHeaderAdapter.kt\ncom/dcinside/app/recent/RecentHeaderAdapter$onCreateViewHolder$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
        static final class com.dcinside.app.recent.d.b extends o implements p {
            int k;
            final e l;
            final d m;

            com.dcinside.app.recent.d.b(e e0, d d0, kotlin.coroutines.d d1) {
                this.l = e0;
                this.m = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.recent.d.b(this.l, this.m, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Integer integer0 = b.f(this.l.getAdapterPosition());
                if(integer0.intValue() < 0) {
                    integer0 = null;
                }
                if(integer0 != null) {
                    h h0 = this.m.y(((int)integer0));
                    if(h0 == null) {
                        return S0.a;
                    }
                    Function1 function10 = (Function1)this.m.c.a();
                    if(function10 != null) {
                        function10.invoke(h0);
                    }
                    return S0.a;
                }
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(this.a, viewGroup0, false);
        L.m(view0);
        e e0 = new e(view0);
        r.M(e0.e(), null, new a(e0, this, null), 1, null);
        r.S(e0.e(), null, false, new com.dcinside.app.recent.d.b(e0, this, null), 3, null);
        return e0;
    }

    public final void E(boolean z) {
        this.d = z;
        this.e = z ? this.g : this.f;
        this.notifyDataSetChanged();
    }

    public final void F(@m List list0) {
        this.g = list0;
        if(this.d) {
            this.e = list0;
            this.notifyDataSetChanged();
        }
    }

    public final void G(@m List list0) {
        this.f = list0;
        if(!this.d) {
            this.e = list0;
            this.notifyDataSetChanged();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        List list0 = this.e;
        return list0 == null ? s.B(0, 100) : s.B(list0.size(), 100);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.C(((e)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.D(viewGroup0, v);
    }

    public final boolean x() {
        return this.d;
    }

    @m
    public final h y(int v) {
        return this.e == null ? null : ((h)this.e.get(v));
    }

    @m
    public final List z() {
        return this.g;
    }
}

