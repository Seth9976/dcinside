package com.dcinside.app.post;

import A3.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.u0;
import com.dcinside.app.rx.bus.c0;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.wv.f;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.g1;
import io.realm.r1;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nSearchRecentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchRecentAdapter.kt\ncom/dcinside/app/post/SearchRecentAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,114:1\n1#2:115\n177#3,9:116\n177#3,9:125\n163#3:135\n155#3:136\n129#3,15:137\n164#3:152\n37#4:134\n*S KotlinDebug\n*F\n+ 1 SearchRecentAdapter.kt\ncom/dcinside/app/post/SearchRecentAdapter\n*L\n80#1:116,9\n88#1:125,9\n93#1:135\n93#1:136\n93#1:137,15\n93#1:152\n90#1:134\n*E\n"})
public final class e1 extends Adapter implements f, P0 {
    @l
    private final F0 a;
    @l
    private List b;
    @m
    private g1 c;
    @m
    private WeakReference d;

    public e1(@l F0 f00) {
        L.p(f00, "realm");
        super();
        this.a = f00;
        this.b = u.H();
    }

    private final void A(View view0) {
        u0 u01;
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                ViewHolder recyclerView$ViewHolder0 = recyclerView0.findContainingViewHolder(view0);
                if(recyclerView$ViewHolder0 == null) {
                    return;
                }
                Integer integer0 = recyclerView$ViewHolder0.getBindingAdapterPosition();
                u0 u00 = null;
                if(integer0.intValue() < 0) {
                    integer0 = null;
                }
                if(integer0 != null) {
                    int v = (int)integer0;
                    try {
                        u01 = null;
                        u01 = (u0)this.b.get(v);
                    }
                    catch(Exception unused_ex) {
                    }
                    if(u01 != null) {
                        if(u01.s()) {
                            u00 = u01;
                        }
                        if(u00 != null) {
                            Context context0 = recyclerView0.getContext();
                            L.o(context0, "getContext(...)");
                            c.a(context0, new c0(1, u00));
                        }
                    }
                }
            }
        }
    }

    private final void B(View view0) {
        u0 u00;
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                ViewHolder recyclerView$ViewHolder0 = recyclerView0.findContainingViewHolder(view0);
                if(recyclerView$ViewHolder0 == null) {
                    return;
                }
                Integer integer0 = recyclerView$ViewHolder0.getBindingAdapterPosition();
                F0 f00 = null;
                if(integer0.intValue() < 0) {
                    integer0 = null;
                }
                if(integer0 != null) {
                    int v = (int)integer0;
                    try {
                        u00 = null;
                        u00 = (u0)this.b.get(v);
                    }
                    catch(Exception unused_ex) {
                    }
                    if(u00 != null) {
                        if(!u00.s()) {
                            u00 = null;
                        }
                        if(u00 != null) {
                            F0 f01 = this.a;
                            if(!f01.isClosed()) {
                                f00 = f01;
                            }
                            if(f00 == null) {
                                return;
                            }
                            RealmQuery realmQuery0 = f00.C4(u0.class);
                            L.o(realmQuery0, "this.where(T::class.java)");
                            u0 u01 = (u0)realmQuery0.i0("key", u00.R5()).r0();
                            if(u01 == null) {
                                return;
                            }
                            F0 f02 = u01.D5();
                            L.o(f02, "getRealm(...)");
                            if(f02.E0()) {
                                u01.z5();
                                return;
                            }
                            f02.beginTransaction();
                            try {
                                u01.z5();
                                f02.p();
                            }
                            catch(Throwable throwable0) {
                                if(f02.E0()) {
                                    f02.e();
                                }
                                throw throwable0;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.y(((g1)object0));
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return false;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return 5;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.d = new WeakReference(recyclerView0);
        g1 g10 = this.a.C4(u0.class).f0("type", 0).g2("time", r1.c).q0();
        this.c = g10;
        if(g10 != null) {
            g10.l(this);
        }
        g1 g11 = this.c;
        if(g11 != null) {
            this.y(g11);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.x(((f1)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.z(viewGroup0, v);
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        g1 g10 = this.c;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.c = null;
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.d = null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        g1 g10 = this.c;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.c = null;
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.d = null;
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
    }

    public void x(@l f1 f10, int v) {
        L.p(f10, "holder");
        f10.h().setText(((u0)this.b.get(v)).T5());
    }

    public void y(@l g1 g10) {
        L.p(g10, "results");
        List list0 = g10.h().g2(g10);
        L.o(list0, "copyFromRealm(...)");
        this.b = list0;
        this.notifyDataSetChanged();
    }

    @l
    public f1 z(@l ViewGroup viewGroup0, int v) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.SearchRecentAdapter$onCreateViewHolder$1", f = "SearchRecentAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            Object l;
            final e1 m;

            a(e1 e10, d d0) {
                this.m = e10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                a e1$a0 = new a(this.m, d0);
                e1$a0.l = view0;
                return e1$a0.invokeSuspend(S0.a);
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
                this.m.A(((View)this.l));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.SearchRecentAdapter$onCreateViewHolder$2", f = "SearchRecentAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            Object l;
            final e1 m;

            b(e1 e10, d d0) {
                this.m = e10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                b e1$b0 = new b(this.m, d0);
                e1$b0.l = view0;
                return e1$b0.invokeSuspend(S0.a);
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
                this.m.B(((View)this.l));
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01CC, viewGroup0, false);  // layout:view_deletable_item
        L.m(view0);
        f1 f10 = new f1(view0);
        r.M(f10.h(), null, new a(this, null), 1, null);
        r.M(f10.e(), null, new b(this, null), 1, null);
        return f10;
    }
}

