package com.dcinside.app.write.menu.series;

import A3.p;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.rx.a;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.i0;
import com.dcinside.app.rx.h;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nSeriesDeleteQuickFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeriesDeleteQuickFragment.kt\ncom/dcinside/app/write/menu/series/SeriesDeleteQuickFragment\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,77:1\n177#2,9:78\n177#2,9:88\n147#3:87\n*S KotlinDebug\n*F\n+ 1 SeriesDeleteQuickFragment.kt\ncom/dcinside/app/write/menu/series/SeriesDeleteQuickFragment\n*L\n59#1:78,9\n73#1:88,9\n60#1:87\n*E\n"})
public final class g extends Fragment implements a {
    private final a a;
    @m
    private I0 b;

    public g() {
        this(null, 1, null);
    }

    public g(@l a a0) {
        L.p(a0, "scope");
        super();
        this.a = a0;
    }

    public g(a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new h(null, 1, null);
        }
        this(a0);
    }

    private final void dismiss() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 == null) {
            return;
        }
        FragmentManager fragmentManager0 = fragmentActivity0.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        if(fragmentManager0.d1()) {
            return;
        }
        fragmentManager0.u().B(this).q();
    }

    @Override  // kotlinx.coroutines.O
    @l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    private final void k0() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 == null) {
            return;
        }
        c.a(fragmentActivity0, new i0(true));
        this.dismiss();
    }

    @Override  // androidx.fragment.app.Fragment
    @m
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        return layoutInflater0.inflate(0x7F0E011B, viewGroup0, false);  // layout:fragment_series_delete_quick
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.t();
        try {
            I0 i00 = this.b;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
        }
        catch(Exception unused_ex) {
        }
        this.b = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onStart() {
        @f(c = "com.dcinside.app.write.menu.series.SeriesDeleteQuickFragment$onStart$2", f = "SeriesDeleteQuickFragment.kt", i = {}, l = {62, 0x3F}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.series.g.a extends o implements A3.o {
            int k;
            final t l;
            final g m;

            com.dcinside.app.write.menu.series.g.a(t t0, g g0, d d0) {
                this.l = t0;
                this.m = g0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.write.menu.series.g.a(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.write.menu.series.g.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.write.menu.series.SeriesDeleteQuickFragment$onStart$2$1", f = "SeriesDeleteQuickFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.write.menu.series.g.a.a extends o implements A3.o {
                    int k;
                    final t l;
                    final g m;

                    com.dcinside.app.write.menu.series.g.a.a(t t0, g g0, d d0) {
                        this.l = t0;
                        this.m = g0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.write.menu.series.g.a.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.write.menu.series.g.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        g g0 = (g)this.l.a();
                        if(g0 != null) {
                            g0.dismiss();
                        }
                        FragmentActivity fragmentActivity0 = this.m.getActivity();
                        if(fragmentActivity0 != null) {
                            c.a(fragmentActivity0, new i0(false));
                        }
                        return S0.a;
                    }
                }

                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        if(a0.b(3000L, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                com.dcinside.app.write.menu.series.g.a.a g$a$a0 = new com.dcinside.app.write.menu.series.g.a.a(this.l, this.m, null);
                this.k = 2;
                return i.h(h0.e(), g$a$a0, this) == object1 ? object1 : S0.a;
            }
        }

        super.onStart();
        I0 i00 = this.b;
        if(i00 != null) {
            try {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            catch(Exception unused_ex) {
            }
        }
        this.b = k.f(this, null, null, new com.dcinside.app.write.menu.series.g.a(new t(this), this, null), 3, null);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @f(c = "com.dcinside.app.write.menu.series.SeriesDeleteQuickFragment$onViewCreated$1", f = "SeriesDeleteQuickFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.series.g.b extends o implements p {
            int k;
            final g l;

            com.dcinside.app.write.menu.series.g.b(g g0, d d0) {
                this.l = g0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.series.g.b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.k0();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        View view1 = view0.findViewById(0x7F0B0E15);  // id:series_delete_undo
        L.o(view1, "findViewById(...)");
        r.M(((TextView)view1), null, new com.dcinside.app.write.menu.series.g.b(this, null), 1, null);
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.a.t();
    }
}

