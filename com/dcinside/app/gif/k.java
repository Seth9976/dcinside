package com.dcinside.app.gif;

import A3.p;
import Y.S1;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.gif.frame.Frame;
import com.dcinside.app.gif.maker.d;
import com.dcinside.app.gif.maker.e;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.X;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

@s0({"SMAP\nGifImageSelectFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifImageSelectFragment.kt\ncom/dcinside/app/gif/GifImageSelectFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"})
public final class k extends Fragment {
    @m
    private S1 a;
    @m
    private c b;
    @m
    private I0 c;
    @m
    private X d;
    @m
    private I0 e;
    @m
    private I0 f;
    @m
    private d g;
    private boolean h;
    private long i;
    @l
    private List j;
    @l
    private List k;
    @l
    private e l;
    @m
    private pl.droidsonroids.gif.e m;
    private float n;
    private boolean o;
    private boolean p;
    @m
    private I0 q;

    public k() {
        this.i = 200L;
        this.j = u.H();
        this.k = u.O(new Float[]{0.2f, 0.5f, 1.0f, 1.5f, 2.0f, 2.5f, 3.0f});
        this.l = new e();
        this.n = 1.0f;
    }

    private final S1 V0() {
        S1 s10 = this.a;
        L.m(s10);
        return s10;
    }

    private final Object W0(kotlin.coroutines.d d0) {
        @f(c = "com.dcinside.app.gif.GifImageSelectFragment", f = "GifImageSelectFragment.kt", i = {0, 0, 1, 2}, l = {0xAE, 180, 0xB6, 0xC3}, m = "makeAndShowGif", n = {"this", "$this$makeAndShowGif_u24lambda_u240", "this", "this"}, s = {"L$0", "L$2", "L$0", "L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            final k o;
            int p;

            a(k k0, kotlin.coroutines.d d0) {
                this.o = k0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.p |= 0x80000000;
                return this.o.W0(this);
            }
        }


        @f(c = "com.dcinside.app.gif.GifImageSelectFragment$makeAndShowGif$2$1", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements A3.o {
            int k;
            final k l;

            b(k k0, kotlin.coroutines.d d0) {
                this.l = k0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new b(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.p1(0.0f);
                this.l.V0().v.setVisibility(0);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gif.GifImageSelectFragment$makeAndShowGif$2$2", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gif.k.c extends o implements A3.o {
            int k;
            final k l;

            com.dcinside.app.gif.k.c(k k0, kotlin.coroutines.d d0) {
                this.l = k0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.gif.k.c(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.k.c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                pl.droidsonroids.gif.e e0 = this.l.m;
                if(e0 != null) {
                    e0.K(this.l.l);
                    e0.stop();
                }
                this.l.V0().e.setImageDrawable(this.l.m);
                this.l.o1();
                this.l.s1();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gif.GifImageSelectFragment$makeAndShowGif$2$3", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gif.k.d extends o implements A3.o {
            int k;
            final k l;

            com.dcinside.app.gif.k.d(k k0, kotlin.coroutines.d d0) {
                this.l = k0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.gif.k.d(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.k.d)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                c c0 = this.l.b;
                if(c0 != null) {
                    c0.D(this.l.h, this.l.g);
                }
                this.l.V0().v.setVisibility(8);
                return S0.a;
            }
        }


        static final class com.dcinside.app.gif.k.e extends N implements A3.o {
            final k e;

            com.dcinside.app.gif.k.e(k k0) {
                this.e = k0;
                super(2);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.invoke(((Number)object0).intValue(), ((Number)object1).intValue());
                return S0.a;
            }

            public final void invoke(int v, int v1) {
                @f(c = "com.dcinside.app.gif.GifImageSelectFragment$makeAndShowGif$2$gifPath$1$1", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.k.e.a extends o implements A3.o {
                    int k;
                    final k l;
                    final int m;
                    final int n;

                    com.dcinside.app.gif.k.e.a(k k0, int v, int v1, kotlin.coroutines.d d0) {
                        this.l = k0;
                        this.m = v;
                        this.n = v1;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.k.e.a(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.k.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.p1((((float)this.m) + 1.0f) / ((float)this.n));
                        return S0.a;
                    }
                }

                LifecycleOwner lifecycleOwner0 = this.e.getViewLifecycleOwner();
                L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
                kotlinx.coroutines.k.f(LifecycleOwnerKt.a(lifecycleOwner0), h0.e(), null, new com.dcinside.app.gif.k.e.a(this.e, v, v1, null), 2, null);
            }
        }

        k k0;
        d d2;
        k k2;
        d d5;
        d d3;
        a k$a0;
        if(d0 instanceof a) {
            k$a0 = (a)d0;
            int v = k$a0.p;
            if((v & 0x80000000) == 0) {
                k$a0 = new a(this, d0);
            }
            else {
                k$a0.p = v ^ 0x80000000;
            }
        }
        else {
            k$a0 = new a(this, d0);
        }
        Object object0 = k$a0.n;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        boolean z = true;
        switch(k$a0.p) {
            case 0: {
                f0.n(object0);
                d d6 = this.g;
                if(d6 != null) {
                    b k$b0 = new b(this, null);
                    k$a0.k = this;
                    k$a0.l = d6;
                    k$a0.m = d6;
                    k$a0.p = 1;
                    if(i.h(h0.e(), k$b0, k$a0) == object1) {
                        return object1;
                    }
                    k2 = this;
                    d5 = d6;
                    d3 = d5;
                label_45:
                    if(!k2.p && !k2.h) {
                        z = false;
                    }
                    boolean z1 = k2.o;
                    long v1 = k2.i;
                    com.dcinside.app.gif.k.e k$e0 = new com.dcinside.app.gif.k.e(k2);
                    k$a0.k = k2;
                    k$a0.l = d5;
                    k$a0.m = null;
                    k$a0.p = 2;
                    Object object2 = d3.q(z, z1, v1, k$e0, k$a0);
                    if(object2 == object1) {
                        return object1;
                    }
                    k0 = k2;
                    d2 = d5;
                    object0 = object2;
                label_60:
                    k$a0.k = k0;
                    k$a0.l = d2;
                    k$a0.p = 3;
                    object0 = ((X)object0).o(k$a0);
                    if(object0 == object1) {
                        return object1;
                    }
                label_66:
                    k0.m = new pl.droidsonroids.gif.e(((String)object0));
                    LifecycleOwner lifecycleOwner0 = k0.getViewLifecycleOwner();
                    L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
                    kotlinx.coroutines.k.f(LifecycleOwnerKt.a(lifecycleOwner0), h0.e(), null, new com.dcinside.app.gif.k.c(k0, null), 2, null);
                    com.dcinside.app.gif.k.d k$d0 = new com.dcinside.app.gif.k.d(k0, null);
                    k$a0.k = d2;
                    k$a0.l = null;
                    k$a0.p = 4;
                    return i.h(h0.e(), k$d0, k$a0) == object1 ? object1 : d2;
                }
                return null;
            }
            case 1: {
                d3 = (d)k$a0.m;
                d d4 = (d)k$a0.l;
                k k1 = (k)k$a0.k;
                f0.n(object0);
                d5 = d4;
                k2 = k1;
                goto label_45;
            }
            case 2: {
                d2 = (d)k$a0.l;
                k0 = (k)k$a0.k;
                f0.n(object0);
                goto label_60;
            }
            case 3: {
                d2 = (d)k$a0.l;
                k0 = (k)k$a0.k;
                f0.n(object0);
                goto label_66;
            }
            case 4: {
                d d1 = (d)k$a0.k;
                f0.n(object0);
                return d1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final void X0() {
        this.V0().s.swapAdapter(null, true);
        S1 s10 = this.V0();
        com.dcinside.app.gif.d d0 = (View view0) -> {
            L.p(this, "this$0");
            this.g1();
        };
        s10.f.setOnClickListener(d0);
        S1 s11 = this.V0();
        com.dcinside.app.gif.e e0 = (View view0) -> {
            L.p(this, "this$0");
            this.k1();
        };
        s11.p.setOnClickListener(e0);
        S1 s12 = this.V0();
        com.dcinside.app.gif.f f0 = (View view0) -> {
            L.p(this, "this$0");
            this.i1();
        };
        s12.k.setOnClickListener(f0);
        S1 s13 = this.V0();
        g g0 = (View view0) -> {
            L.p(this, "this$0");
            this.j1(-90);
        };
        s13.o.setOnClickListener(g0);
        S1 s14 = this.V0();
        h h0 = (View view0) -> {
            L.p(this, "this$0");
            this.j1(90);
        };
        s14.n.setOnClickListener(h0);
        S1 s15 = this.V0();
        com.dcinside.app.gif.i i0 = (View view0) -> {
            L.p(this, "this$0");
            this.h1(false);
        };
        s15.i.setOnClickListener(i0);
        S1 s16 = this.V0();
        j j0 = (View view0) -> {
            L.p(this, "this$0");
            this.h1(true);
        };
        s16.j.setOnClickListener(j0);
    }

    // 检测为 Lambda 实现
    private static final void Y0(k k0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void Z0(k k0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void a1(k k0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void b1(k k0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void c1(k k0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void d1(k k0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void e1(k k0, View view0) [...]

    private final void f1() {
        TabLayout tabLayout0 = this.V0().d;
        L.o(tabLayout0, "gifFrameOptionTab");
        if(!tabLayout0.isSelected()) {
            Adapter recyclerView$Adapter0 = this.V0().s.getAdapter();
            if(recyclerView$Adapter0 == null) {
                return;
            }
            com.dcinside.app.gif.maker.a a0 = com.dcinside.app.gif.maker.a.values()[tabLayout0.getSelectedTabPosition()];
            d d0 = this.g;
            if(d0 != null) {
                d0.d(a0, false);
            }
            this.s1();
            recyclerView$Adapter0.notifyItemRangeChanged(0, recyclerView$Adapter0.getItemCount());
        }
    }

    private final void g1() {
        @f(c = "com.dcinside.app.gif.GifImageSelectFragment$onClickFit$1", f = "GifImageSelectFragment.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gif.k.f extends o implements A3.o {
            int k;
            final k l;

            com.dcinside.app.gif.k.f(k k0, kotlin.coroutines.d d0) {
                this.l = k0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.gif.k.f(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.k.f)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.l.W0(this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        if(this.f != null && !this.f.k()) {
            return;
        }
        boolean z = this.p;
        this.p = !z;
        if(z) {
            this.V0().g.setImageResource(0x7F080206);  // drawable:gif_img_minimize
            S1 s11 = this.V0();
            L.o(s11.h, "gifOptionFitText");
            r.o0(s11.h, 0x7F1503F6);  // string:gif_option_fit_wrap "원래 비율"
        }
        else {
            this.V0().g.setImageResource(0x7F080204);  // drawable:gif_img_expand
            S1 s10 = this.V0();
            L.o(s10.h, "gifOptionFitText");
            r.o0(s10.h, 0x7F1503F5);  // string:gif_option_fit_match "화면 맞춤"
        }
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        this.f = kotlinx.coroutines.k.f(LifecycleOwnerKt.a(lifecycleOwner0), null, null, new com.dcinside.app.gif.k.f(this, null), 3, null);
    }

    private final void h1(boolean z) {
        if(this.f != null && !this.f.k()) {
            return;
        }
        if(z) {
            this.l.h(!this.l.e());
            return;
        }
        this.l.g(!this.l.d());
    }

    private final void i1() {
        @f(c = "com.dcinside.app.gif.GifImageSelectFragment$onClickOrder$1", f = "GifImageSelectFragment.kt", i = {}, l = {420}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gif.k.g extends o implements A3.o {
            int k;
            final k l;

            com.dcinside.app.gif.k.g(k k0, kotlin.coroutines.d d0) {
                this.l = k0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.gif.k.g(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.k.g)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.l.W0(this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        if(this.f != null && !this.f.k()) {
            return;
        }
        boolean z = this.o;
        this.o = !z;
        if(z) {
            this.V0().l.setImageResource(0x7F080207);  // drawable:gif_img_right
            S1 s11 = this.V0();
            L.o(s11.m, "gifOptionOrderText");
            r.o0(s11.m, 0x7F1503F9);  // string:gif_option_order_forward "정방향"
        }
        else {
            this.V0().l.setImageResource(0x7F080205);  // drawable:gif_img_left
            S1 s10 = this.V0();
            L.o(s10.m, "gifOptionOrderText");
            r.o0(s10.m, 0x7F1503FA);  // string:gif_option_order_reverse "역방향"
        }
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        this.f = kotlinx.coroutines.k.f(LifecycleOwnerKt.a(lifecycleOwner0), null, null, new com.dcinside.app.gif.k.g(this, null), 3, null);
    }

    private final void j1(int v) {
        if(this.f != null && !this.f.k()) {
            return;
        }
        e e0 = this.l;
        int v1 = (e0.f() + v) % 360;
        if(v1 < 0) {
            v1 += 360;
        }
        e0.i(v1);
    }

    private final void k1() {
        if(this.f != null && !this.f.k()) {
            return;
        }
        int v = this.k.indexOf(this.n);
        this.n = ((Number)this.k.get((v + 1) % this.k.size())).floatValue();
        S1 s10 = this.V0();
        L.o("%.1f", "toString(...)");
        String s = String.format("%.1f", Arrays.copyOf(new Object[]{this.n}, 1));
        L.o(s, "format(...)");
        s10.q.setText(s);
    }

    private final void l1() {
        @f(c = "com.dcinside.app.gif.GifImageSelectFragment$onReleaseSave$1", f = "GifImageSelectFragment.kt", i = {1}, l = {0xFF, 260, 0x109, 274, 276, 285, 0x120}, m = "invokeSuspend", n = {"maker"}, s = {"L$0"})
        static final class com.dcinside.app.gif.k.h extends o implements A3.o {
            Object k;
            int l;
            final k m;

            com.dcinside.app.gif.k.h(k k0, kotlin.coroutines.d d0) {
                this.m = k0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.gif.k.h(this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.k.h)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.gif.GifImageSelectFragment$onReleaseSave$1$1", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.k.h.a extends o implements A3.o {
                    int k;
                    final k l;

                    com.dcinside.app.gif.k.h.a(k k0, kotlin.coroutines.d d0) {
                        this.l = k0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.k.h.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.k.h.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Dl.D(this.l.requireContext(), 0x7F1503E3);  // string:gif_make_image_least "최소 2장 이상의 파일은 선택되어야합니다."
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.gif.GifImageSelectFragment$onReleaseSave$1$2", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.k.h.b extends o implements A3.o {
                    int k;
                    final k l;

                    com.dcinside.app.gif.k.h.b(k k0, kotlin.coroutines.d d0) {
                        this.l = k0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.k.h.b(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.k.h.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.V0().v.setVisibility(0);
                        this.l.p1(0.0f);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.gif.GifImageSelectFragment$onReleaseSave$1$3", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.k.h.c extends o implements A3.o {
                    int k;
                    final k l;
                    final String m;

                    com.dcinside.app.gif.k.h.c(k k0, String s, kotlin.coroutines.d d0) {
                        this.l = k0;
                        this.m = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.k.h.c(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.k.h.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.V0().v.setVisibility(8);
                        k k0 = this.l;
                        Bundle bundle0 = new Bundle();
                        bundle0.putString("extra_gif_path", this.m);
                        FragmentActivity fragmentActivity0 = this.l.getActivity();
                        GifMakeActivity gifMakeActivity0 = fragmentActivity0 instanceof GifMakeActivity ? ((GifMakeActivity)fragmentActivity0) : null;
                        if(gifMakeActivity0 != null) {
                            gifMakeActivity0.M1(k0, bundle0);
                        }
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.gif.k.h.d extends N implements A3.o {
                    final k e;

                    com.dcinside.app.gif.k.h.d(k k0) {
                        this.e = k0;
                        super(2);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        this.invoke(((Number)object0).intValue(), ((Number)object1).intValue());
                        return S0.a;
                    }

                    public final void invoke(int v, int v1) {
                        @f(c = "com.dcinside.app.gif.GifImageSelectFragment$onReleaseSave$1$path$1$1", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class com.dcinside.app.gif.k.h.d.a extends o implements A3.o {
                            int k;
                            final k l;
                            final int m;
                            final int n;

                            com.dcinside.app.gif.k.h.d.a(k k0, int v, int v1, kotlin.coroutines.d d0) {
                                this.l = k0;
                                this.m = v;
                                this.n = v1;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                                return new com.dcinside.app.gif.k.h.d.a(this.l, this.m, this.n, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                                return ((com.dcinside.app.gif.k.h.d.a)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.k != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                this.l.p1((((float)this.m) + 1.0f) / ((float)this.n));
                                return S0.a;
                            }
                        }

                        kotlinx.coroutines.k.f(P.a(h0.e()), null, null, new com.dcinside.app.gif.k.h.d.a(this.e, v, v1, null), 3, null);
                    }
                }


                static final class com.dcinside.app.gif.k.h.e extends N implements A3.o {
                    final k e;

                    com.dcinside.app.gif.k.h.e(k k0) {
                        this.e = k0;
                        super(2);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        this.invoke(((Number)object0).intValue(), ((Number)object1).intValue());
                        return S0.a;
                    }

                    public final void invoke(int v, int v1) {
                        @f(c = "com.dcinside.app.gif.GifImageSelectFragment$onReleaseSave$1$path$2$1", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class com.dcinside.app.gif.k.h.e.a extends o implements A3.o {
                            int k;
                            final k l;
                            final int m;
                            final int n;

                            com.dcinside.app.gif.k.h.e.a(k k0, int v, int v1, kotlin.coroutines.d d0) {
                                this.l = k0;
                                this.m = v;
                                this.n = v1;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                                return new com.dcinside.app.gif.k.h.e.a(this.l, this.m, this.n, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                                return ((com.dcinside.app.gif.k.h.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.k != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                this.l.p1((((float)this.m) + 1.0f) / ((float)this.n));
                                return S0.a;
                            }
                        }

                        kotlinx.coroutines.k.f(P.a(h0.e()), null, null, new com.dcinside.app.gif.k.h.e.a(this.e, v, v1, null), 3, null);
                    }
                }

                String s;
                d d0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        d0 = this.m.g;
                        if(d0 == null) {
                            return S0.a;
                        }
                        I0 i00 = this.m.q;
                        if(i00 != null) {
                            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                        }
                        this.m.q = null;
                        I0 i01 = this.m.f;
                        if(i01 != null) {
                            kotlinx.coroutines.I0.a.b(i01, null, 1, null);
                        }
                        this.m.f = null;
                        I0 i02 = this.m.e;
                        if(i02 != null) {
                            kotlinx.coroutines.I0.a.b(i02, null, 1, null);
                        }
                        this.m.e = null;
                        X x0 = this.m.d;
                        if(x0 != null) {
                            kotlinx.coroutines.I0.a.b(x0, null, 1, null);
                        }
                        this.m.d = null;
                        if(d0.l().size() < 2) {
                            com.dcinside.app.gif.k.h.a k$h$a0 = new com.dcinside.app.gif.k.h.a(this.m, null);
                            this.l = 1;
                            return i.h(h0.e(), k$h$a0, this) == object1 ? object1 : S0.a;
                        }
                        com.dcinside.app.gif.k.h.b k$h$b0 = new com.dcinside.app.gif.k.h.b(this.m, null);
                        this.k = d0;
                        this.l = 2;
                        if(i.h(h0.e(), k$h$b0, this) == object1) {
                            return object1;
                        }
                        goto label_40;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        d0 = (d)this.k;
                        f0.n(object0);
                    label_40:
                        if(Build.VERSION.SDK_INT == 29) {
                            com.dcinside.app.gif.k.h.d k$h$d0 = new com.dcinside.app.gif.k.h.d(this.m);
                            this.k = null;
                            this.l = 3;
                            object0 = d0.s(this.m.p, this.m.o, this.m.l.f(), this.m.l.d(), this.m.l.e(), ((long)(((float)this.m.i) / this.m.n)), k$h$d0, this);
                            if(object0 != object1) {
                                goto label_54;
                            }
                            return object1;
                        }
                        else {
                            com.dcinside.app.gif.k.h.e k$h$e0 = new com.dcinside.app.gif.k.h.e(this.m);
                            this.k = null;
                            this.l = 5;
                            object0 = d0.u(this.m.p, this.m.o, this.m.l.f(), this.m.l.d(), this.m.l.e(), ((long)(((float)this.m.i) / this.m.n)), k$h$e0, this);
                            if(object0 == object1) {
                                return object1;
                            }
                            goto label_64;
                        }
                        break;
                    }
                    case 3: {
                        f0.n(object0);
                    label_54:
                        this.l = 4;
                        object0 = ((X)object0).o(this);
                        if(object0 == object1) {
                            return object1;
                        }
                        s = (String)object0;
                        break;
                    }
                    case 4: {
                        f0.n(object0);
                        s = (String)object0;
                        break;
                    }
                    case 5: {
                        f0.n(object0);
                    label_64:
                        this.l = 6;
                        object0 = ((X)object0).o(this);
                        if(object0 == object1) {
                            return object1;
                        }
                        s = (String)object0;
                        break;
                    }
                    case 6: {
                        f0.n(object0);
                        s = (String)object0;
                        break;
                    }
                    case 7: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                com.dcinside.app.gif.k.h.c k$h$c0 = new com.dcinside.app.gif.k.h.c(this.m, s, null);
                this.l = 7;
                return i.h(h0.e(), k$h$c0, this) == object1 ? object1 : S0.a;
            }
        }

        if(this.c != null && this.c.isActive()) {
            return;
        }
        this.c = kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.gif.k.h(this, null), 2, null);
    }

    public final void m1(@l TabLayout tabLayout0) {
        L.p(tabLayout0, "tabLayout");
        tabLayout0.setSelected(false);
        this.f1();
    }

    private final void n1() {
        @f(c = "com.dcinside.app.gif.GifImageSelectFragment$otherOptionPrepare$1", f = "GifImageSelectFragment.kt", i = {0, 1, 2, 3}, l = {303, 304, 306, 307, 308, 309}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$this$invokeSuspend_u24lambda_u240", "$this$invokeSuspend_u24lambda_u240", "$this$invokeSuspend_u24lambda_u240"}, s = {"L$2", "L$2", "L$2", "L$2"})
        static final class com.dcinside.app.gif.k.k extends o implements A3.o {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;
            final k p;

            com.dcinside.app.gif.k.k(k k0, kotlin.coroutines.d d0) {
                this.p = k0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.gif.k.k(this.p, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.k.k)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                k k7;
                d d13;
                d d11;
                k k5;
                d d10;
                d d12;
                k k6;
                d d9;
                d d8;
                k k4;
                d d5;
                k k2;
                d d4;
                d d7;
                k k3;
                d d6;
                d d3;
                k k1;
                d d2;
                k k0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.o) {
                    case 0: {
                        f0.n(object0);
                        d d1 = this.p.g;
                        if(d1 != null) {
                            k0 = this.p;
                            this.k = d1;
                            this.l = k0;
                            this.m = d1;
                            this.n = k0;
                            this.o = 1;
                            Object object2 = d.r(d1, k0.h, true, k0.i, null, this, 8, null);
                            if(object2 == object1) {
                                return object1;
                            }
                            d2 = d1;
                            k1 = k0;
                            object0 = object2;
                            d3 = d2;
                            goto label_28;
                        }
                        break;
                    }
                    case 1: {
                        k0 = (k)this.n;
                        d3 = (d)this.m;
                        k1 = (k)this.l;
                        d2 = (d)this.k;
                        f0.n(object0);
                    label_28:
                        k0.d = (X)object0;
                        X x0 = k1.d;
                        if(x0 == null) {
                            d6 = d3;
                            k3 = k1;
                            d7 = d2;
                        }
                        else {
                            this.k = d2;
                            this.l = k1;
                            this.m = d3;
                            this.n = null;
                            this.o = 2;
                            if(x0.c1(this) == object1) {
                                return object1;
                            }
                            d4 = d3;
                            k2 = k1;
                            d5 = d2;
                            goto label_50;
                        }
                        goto label_53;
                    }
                    case 2: {
                        d4 = (d)this.m;
                        k2 = (k)this.l;
                        d5 = (d)this.k;
                        f0.n(object0);
                    label_50:
                        d6 = d4;
                        k3 = k2;
                        d7 = d5;
                    label_53:
                        if(!k3.h) {
                            this.k = d7;
                            this.l = k3;
                            this.m = d6;
                            this.n = k3;
                            this.o = 3;
                            Object object3 = d.r(d6, true, false, k3.i, null, this, 8, null);
                            if(object3 == object1) {
                                return object1;
                            }
                            k4 = k3;
                            d8 = d7;
                            d9 = d6;
                            object0 = object3;
                            goto label_72;
                        }
                        break;
                    }
                    case 3: {
                        k3 = (k)this.n;
                        d9 = (d)this.m;
                        k4 = (k)this.l;
                        d8 = (d)this.k;
                        f0.n(object0);
                    label_72:
                        k3.d = (X)object0;
                        X x1 = k4.d;
                        if(x1 == null) {
                            k6 = k4;
                            d12 = d8;
                        }
                        else {
                            this.k = d8;
                            this.l = k4;
                            this.m = d9;
                            this.n = null;
                            this.o = 4;
                            if(x1.c1(this) == object1) {
                                return object1;
                            }
                            d10 = d9;
                            k5 = k4;
                            d11 = d8;
                            goto label_93;
                        }
                        goto label_96;
                    }
                    case 4: {
                        d10 = (d)this.m;
                        k5 = (k)this.l;
                        d11 = (d)this.k;
                        f0.n(object0);
                    label_93:
                        d12 = d11;
                        d9 = d10;
                        k6 = k5;
                    label_96:
                        this.k = d12;
                        this.l = k6;
                        this.m = k6;
                        this.n = null;
                        this.o = 5;
                        Object object4 = d.r(d9, true, true, k6.i, null, this, 8, null);
                        if(object4 == object1) {
                            return object1;
                        }
                        d13 = d12;
                        object0 = object4;
                        k7 = k6;
                        goto label_112;
                    }
                    case 5: {
                        k6 = (k)this.m;
                        k7 = (k)this.l;
                        d13 = (d)this.k;
                        f0.n(object0);
                    label_112:
                        k6.d = (X)object0;
                        X x2 = k7.d;
                        if(x2 != null) {
                            this.k = d13;
                            this.l = null;
                            this.m = null;
                            this.o = 6;
                            if(x2.c1(this) == object1) {
                                return object1;
                            }
                        }
                        break;
                    }
                    case 6: {
                        d d0 = (d)this.k;
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        }

        I0 i00 = this.e;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        X x0 = this.d;
        if(x0 != null) {
            kotlinx.coroutines.I0.a.b(x0, null, 1, null);
        }
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(lifecycleOwner0), null, null, new com.dcinside.app.gif.k.k(this, null), 3, null);
    }

    private final void o1() {
        @f(c = "com.dcinside.app.gif.GifImageSelectFragment$processFrameLoopAsync$1", f = "GifImageSelectFragment.kt", i = {0, 0, 1, 1}, l = {0xD4, 0xD5}, m = "invokeSuspend", n = {"$this$launch", "old", "$this$launch", "old"}, s = {"L$0", "I$0", "L$0", "I$0"})
        static final class com.dcinside.app.gif.k.l extends o implements A3.o {
            int k;
            int l;
            private Object m;
            final k n;

            com.dcinside.app.gif.k.l(k k0, kotlin.coroutines.d d0) {
                this.n = k0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.dcinside.app.gif.k.l(this.n, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.k.l)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.gif.GifImageSelectFragment$processFrameLoopAsync$1$1", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.k.l.a extends o implements A3.o {
                    int k;
                    final k l;
                    final int m;

                    com.dcinside.app.gif.k.l.a(k k0, int v, kotlin.coroutines.d d0) {
                        this.l = k0;
                        this.m = v;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.k.l.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.k.l.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        pl.droidsonroids.gif.e e0 = this.l.m;
                        if(e0 != null) {
                            e0.E(this.m);
                            return S0.a;
                        }
                        return null;
                    }
                }

                O o1;
                int v1;
                int v;
                O o0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        o0 = (O)this.m;
                        this.n.V0().s.setAdapter(this.n.b);
                        pl.droidsonroids.gif.e e0 = this.n.m;
                        v = 0;
                        if(((long)(e0 == null ? 0 : e0.s())) > 0L) {
                            goto label_19;
                        }
                        return S0.a;
                    }
                    case 1: {
                        v1 = this.k;
                        o1 = (O)this.m;
                        f0.n(object0);
                        goto label_30;
                    }
                    case 2: {
                        v1 = this.k;
                        o1 = (O)this.m;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                do {
                    o0 = o1;
                    v = v1;
                label_19:
                    if(!P.k(o0) || this.n.m == null) {
                        return S0.a;
                    }
                    c c0 = this.n.b;
                    if(c0 == null) {
                        return S0.a;
                    }
                    v1 = c0.z(v);
                    com.dcinside.app.gif.k.l.a k$l$a0 = new com.dcinside.app.gif.k.l.a(this.n, v1, null);
                    this.m = o0;
                    this.k = v1;
                    this.l = 1;
                    if(i.h(h0.e(), k$l$a0, this) == object1) {
                        return object1;
                    }
                    o1 = o0;
                label_30:
                    this.m = o1;
                    this.k = v1;
                    this.l = 2;
                }
                while(a0.b(((long)(((float)this.n.i) / this.n.n)), this) != object1);
                return object1;
            }
        }

        I0 i00 = this.q;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        this.q = kotlinx.coroutines.k.f(LifecycleOwnerKt.a(lifecycleOwner0), null, null, new com.dcinside.app.gif.k.l(this, null), 3, null);
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = S1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.V0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        I0 i00 = this.c;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.c = null;
        I0 i01 = this.e;
        if(i01 != null) {
            kotlinx.coroutines.I0.a.b(i01, null, 1, null);
        }
        this.e = null;
        X x0 = this.d;
        if(x0 != null) {
            kotlinx.coroutines.I0.a.b(x0, null, 1, null);
        }
        this.d = null;
        I0 i02 = this.q;
        if(i02 != null) {
            kotlinx.coroutines.I0.a.b(i02, null, 1, null);
        }
        this.q = null;
        d d0 = this.g;
        if(d0 != null) {
            d0.w();
        }
        this.g = null;
        I0 i03 = this.f;
        if(i03 != null) {
            kotlinx.coroutines.I0.a.b(i03, null, 1, null);
        }
        this.f = null;
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        public static final class com.dcinside.app.gif.k.i implements com.google.android.material.tabs.TabLayout.f {
            final k a;

            com.dcinside.app.gif.k.i(k k0) {
                this.a = k0;
                super();
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void N(@m com.google.android.material.tabs.TabLayout.i tabLayout$i0) {
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void R(@m com.google.android.material.tabs.TabLayout.i tabLayout$i0) {
                S1 s10 = this.a.V0();
                L.o(s10.d, "gifFrameOptionTab");
                this.a.m1(s10.d);
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void j(@m com.google.android.material.tabs.TabLayout.i tabLayout$i0) {
                S1 s10 = this.a.V0();
                L.o(s10.d, "gifFrameOptionTab");
                this.a.m1(s10.d);
            }
        }


        @f(c = "com.dcinside.app.gif.GifImageSelectFragment$onViewCreated$2", f = "GifImageSelectFragment.kt", i = {}, l = {94, 0x71, 120, 0x88}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nGifImageSelectFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifImageSelectFragment.kt\ncom/dcinside/app/gif/GifImageSelectFragment$onViewCreated$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,425:1\n774#2:426\n865#2,2:427\n*S KotlinDebug\n*F\n+ 1 GifImageSelectFragment.kt\ncom/dcinside/app/gif/GifImageSelectFragment$onViewCreated$2\n*L\n109#1:426\n109#1:427,2\n*E\n"})
        static final class com.dcinside.app.gif.k.j extends o implements A3.o {
            Object k;
            int l;
            final k m;

            com.dcinside.app.gif.k.j(k k0, kotlin.coroutines.d d0) {
                this.m = k0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.gif.k.j(this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.k.j)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.gif.GifImageSelectFragment$onViewCreated$2$1", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.k.j.a extends o implements A3.o {
                    int k;
                    final k l;

                    com.dcinside.app.gif.k.j.a(k k0, kotlin.coroutines.d d0) {
                        this.l = k0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.k.j.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.k.j.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.p1(0.0f);
                        this.l.V0().v.setVisibility(0);
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.gif.k.j.b extends N implements Function1 {
                    final k e;

                    com.dcinside.app.gif.k.j.b(k k0) {
                        this.e = k0;
                        super(1);
                    }

                    public final void a(@l d d0) {
                        L.p(d0, "it");
                        this.e.s1();
                        this.e.V0().d.setSelected(true);
                        this.e.f1();
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((d)object0));
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.gif.GifImageSelectFragment$onViewCreated$2$4", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.k.j.c extends o implements A3.o {
                    int k;
                    final k l;

                    com.dcinside.app.gif.k.j.c(k k0, kotlin.coroutines.d d0) {
                        this.l = k0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.k.j.c(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.k.j.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        List list0;
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.V0().f.setVisibility((this.l.h ? 8 : 0));
                        S1 s10 = this.l.V0();
                        L.o("%.1f", "toString(...)");
                        String s = String.format("%.1f", Arrays.copyOf(new Object[]{kotlin.coroutines.jvm.internal.b.e(this.l.n)}, 1));
                        L.o(s, "format(...)");
                        s10.q.setText(s);
                        if(this.l.h) {
                            d d0 = this.l.g;
                            if(d0 != null) {
                                d0.d(com.dcinside.app.gif.maker.a.a, false);
                            }
                            com.google.android.material.tabs.TabLayout.i tabLayout$i0 = this.l.V0().d.D(0);
                            if(tabLayout$i0 != null) {
                                tabLayout$i0.r();
                            }
                        }
                        else {
                            this.l.V0().d.setVisibility(8);
                        }
                        c c0 = this.l.b;
                        if(c0 != null) {
                            d d1 = this.l.g;
                            if(d1 == null) {
                                list0 = u.H();
                            }
                            else {
                                TreeSet treeSet0 = d1.g();
                                if(treeSet0 == null) {
                                    list0 = u.H();
                                }
                                else {
                                    list0 = u.V5(treeSet0);
                                    if(list0 == null) {
                                        list0 = u.H();
                                    }
                                }
                            }
                            c0.C(list0);
                        }
                        return S0.a;
                    }
                }

                List list0;
                Object object2;
                k k1;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                GifMakeActivity gifMakeActivity0 = null;
                try {
                    switch(this.l) {
                        case 0: {
                            goto label_15;
                        }
                        case 1: {
                            goto label_13;
                        }
                        case 2: {
                            goto label_8;
                        }
                        case 3: {
                            goto label_6;
                        }
                        case 4: {
                            goto label_4;
                        }
                    }
                }
                catch(Exception exception0) {
                    goto label_63;
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                try {
                label_4:
                    f0.n(object0);
                    goto label_60;
                label_6:
                    f0.n(object0);
                    goto label_57;
                }
                catch(Exception exception0) {
                    goto label_63;
                }
            label_8:
                k k0 = (k)this.k;
                try {
                    f0.n(object0);
                    k1 = k0;
                    object2 = object0;
                    goto label_50;
                label_13:
                    f0.n(object0);
                    goto label_20;
                }
                catch(Exception exception0) {
                    goto label_63;
                }
            label_15:
                f0.n(object0);
                try {
                    com.dcinside.app.gif.k.j.a k$j$a0 = new com.dcinside.app.gif.k.j.a(this.m, null);
                    this.l = 1;
                    if(i.h(h0.e(), k$j$a0, this) == object1) {
                        return object1;
                    }
                label_20:
                    Bundle bundle0 = this.m.getArguments();
                    if(bundle0 != null) {
                        k k2 = this.m;
                        k2.h = bundle0.getBoolean("extra_from_video");
                        k2.i = bundle0.getLong("extra_frame_interval_ms", 200L);
                        if(Build.VERSION.SDK_INT >= 33) {
                            list0 = bundle0.getParcelableArrayList("extra_image_frames", Frame.class);
                            if(list0 == null) {
                                throw new NullPointerException("images not found.");
                            }
                        }
                        else {
                            list0 = bundle0.getParcelableArrayList("extra_image_frames");
                            if(list0 == null) {
                                list0 = u.H();
                            }
                        }
                        k2.j = list0;
                        Iterable iterable0 = u.O(new Float[]{kotlin.coroutines.jvm.internal.b.e(0.2f), kotlin.coroutines.jvm.internal.b.e(0.5f), kotlin.coroutines.jvm.internal.b.e(1.0f), kotlin.coroutines.jvm.internal.b.e(1.5f), kotlin.coroutines.jvm.internal.b.e(2.0f), kotlin.coroutines.jvm.internal.b.e(2.5f), kotlin.coroutines.jvm.internal.b.e(3.0f)});
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object3: iterable0) {
                            if(((float)k2.i) / ((Number)object3).floatValue() > 25.0f) {
                                arrayList0.add(object3);
                            }
                        }
                        k2.k = arrayList0;
                        k2.n = k2.h ? 1.0f : 0.5f;
                    }
                    d.f.j(this.m.j);
                    k1 = this.m;
                    this.k = k1;
                    this.l = 2;
                    object2 = d.f.h(k1.j, this);
                    if(object2 == object1) {
                        return object1;
                    }
                label_50:
                    ((d)object2).z(new com.dcinside.app.gif.k.j.b(this.m));
                    k1.g = (d)object2;
                    com.dcinside.app.gif.k.j.c k$j$c0 = new com.dcinside.app.gif.k.j.c(this.m, null);
                    this.k = null;
                    this.l = 3;
                    if(i.h(h0.e(), k$j$c0, this) == object1) {
                        return object1;
                    }
                label_57:
                    this.l = 4;
                    if(this.m.W0(this) == object1) {
                        return object1;
                    }
                label_60:
                    this.m.n1();
                }
                catch(Exception exception0) {
                label_63:
                    timber.log.b.a.e(exception0);
                    String s = exception0.getMessage();
                    if(s == null) {
                        s = this.m.getString(0x7F1503E4);  // string:gif_make_img_fail "이미지를 생성할 수 없습니다."
                        L.o(s, "getString(...)");
                    }
                    FragmentActivity fragmentActivity0 = this.m.getActivity();
                    if(fragmentActivity0 instanceof GifMakeActivity) {
                        gifMakeActivity0 = (GifMakeActivity)fragmentActivity0;
                    }
                    if(gifMakeActivity0 != null) {
                        gifMakeActivity0.L1(s);
                    }
                }
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.r1();
        this.q1();
        this.X0();
        S1 s10 = this.V0();
        com.dcinside.app.gif.k.i k$i0 = new com.dcinside.app.gif.k.i(this);
        s10.d.h(k$i0);
        I0 i00 = this.f;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        this.f = kotlinx.coroutines.k.f(LifecycleOwnerKt.a(lifecycleOwner0), h0.c(), null, new com.dcinside.app.gif.k.j(this, null), 2, null);
    }

    private final void p1(float f) {
        if(f >= 1.0f) {
            this.V0().t.setVisibility(8);
            this.V0().u.setVisibility(0);
            return;
        }
        this.V0().t.setVisibility(0);
        this.V0().u.setVisibility(8);
        S1 s10 = this.V0();
        int v = (int)(((float)this.V0().t.getMax()) * f);
        s10.t.setProgress(v);
    }

    private final void q1() {
        public static final class com.dcinside.app.gif.k.m implements MenuProvider {
            final k a;

            com.dcinside.app.gif.k.m(k k0) {
                this.a = k0;
                super();
            }

            @Override  // androidx.core.view.MenuProvider
            public void a(@l Menu menu0, @l MenuInflater menuInflater0) {
                @f(c = "com.dcinside.app.gif.GifImageSelectFragment$setMenuProvider$1$onCreateMenu$1", f = "GifImageSelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.k.m.a extends o implements p {
                    int k;
                    final com.dcinside.app.gif.k.m l;
                    final MenuItem m;

                    com.dcinside.app.gif.k.m.a(com.dcinside.app.gif.k.m k$m0, MenuItem menuItem0, kotlin.coroutines.d d0) {
                        this.l = k$m0;
                        this.m = menuItem0;
                        super(3, d0);
                    }

                    @m
                    public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.k.m.a(this.l, this.m, d0).invokeSuspend(S0.a);
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
                        L.o(this.m, "$item");
                        this.l.d(this.m);
                        return S0.a;
                    }
                }

                L.p(menu0, "menu");
                L.p(menuInflater0, "menuInflater");
                menuInflater0.inflate(0x7F100008, menu0);  // mipmap:ic_launcher12
                MenuItem menuItem0 = menu0.findItem(0x7F0B0061);  // id:action_gif_next
                if(menuItem0 != null) {
                    View view0 = menuItem0.getActionView();
                    Button button0 = view0 == null ? null : ((Button)view0.findViewById(0x7F0B0818));  // id:menu_gif_next
                    if(button0 != null) {
                        r.M(button0, null, new com.dcinside.app.gif.k.m.a(this, menuItem0, null), 1, null);
                    }
                }
            }

            @Override  // androidx.core.view.MenuProvider
            public void b(Menu menu0) {
            }

            @Override  // androidx.core.view.MenuProvider
            public void c(Menu menu0) {
            }

            @Override  // androidx.core.view.MenuProvider
            public boolean d(@l MenuItem menuItem0) {
                L.p(menuItem0, "menuItem");
                if(menuItem0.getItemId() == 0x7F0B0061) {  // id:action_gif_next
                    this.a.l1();
                }
                return true;
            }
        }

        FragmentActivity fragmentActivity0 = this.requireActivity();
        L.o(fragmentActivity0, "requireActivity(...)");
        fragmentActivity0.addMenuProvider(new com.dcinside.app.gif.k.m(this), this.getViewLifecycleOwner());
    }

    private final void r1() {
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        this.b = new c(LifecycleOwnerKt.a(lifecycleOwner0));
        S1 s10 = this.V0();
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(this.getContext(), 0, false);
        s10.s.setLayoutManager(nonPredictiveLayoutManager0);
        this.V0().s.setAdapter(this.b);
    }

    private final void s1() {
        int v;
        d d0 = this.g;
        if(d0 == null) {
            v = 0;
        }
        else {
            TreeSet treeSet0 = d0.l();
            v = treeSet0 == null ? 0 : treeSet0.size();
        }
        S1 s10 = this.V0();
        String s = this.getString(0x7F1503E1, new Object[]{v});  // string:gif_frame_count "%1$d 프레임"
        s10.b.setText(s);
    }
}

