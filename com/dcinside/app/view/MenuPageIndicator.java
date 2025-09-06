package com.dcinside.app.view;

import A3.a;
import A3.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.R.styleable;
import com.dcinside.app.internal.r;
import com.dcinside.app.recent.i;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager.c;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;
import kotlin.S0;
import kotlin.coroutines.d;
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
import kotlinx.coroutines.k;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nMenuPageIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPageIndicator.kt\ncom/dcinside/app/view/MenuPageIndicator\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,273:1\n13346#2,2:274\n177#3,9:276\n1#4:285\n257#5,2:286\n*S KotlinDebug\n*F\n+ 1 MenuPageIndicator.kt\ncom/dcinside/app/view/MenuPageIndicator\n*L\n81#1:274,2\n103#1:276,9\n179#1:286,2\n*E\n"})
public final class MenuPageIndicator extends ConstraintLayout {
    private long a;
    @l
    private final ImageView b;
    @l
    private final ImageView c;
    @l
    private final ImageView d;
    @l
    private final TextView[] e;
    @l
    private final View f;
    @l
    private final View g;
    @m
    private I0 h;
    @m
    private Adapter i;
    @m
    private RecyclerViewPager j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    @l
    private final c o;
    @m
    private a p;
    @m
    private a q;
    private boolean r;
    private boolean s;

    @j
    public MenuPageIndicator(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public MenuPageIndicator(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public MenuPageIndicator(@l Context context0, @m AttributeSet attributeSet0, int v) {
        @f(c = "com.dcinside.app.view.MenuPageIndicator$1$1", f = "MenuPageIndicator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.MenuPageIndicator.a extends o implements p {
            int k;
            Object l;
            final MenuPageIndicator m;

            com.dcinside.app.view.MenuPageIndicator.a(MenuPageIndicator menuPageIndicator0, d d0) {
                this.m = menuPageIndicator0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.view.MenuPageIndicator.a menuPageIndicator$a0 = new com.dcinside.app.view.MenuPageIndicator.a(this.m, d0);
                menuPageIndicator$a0.l = view0;
                return menuPageIndicator$a0.invokeSuspend(S0.a);
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
                this.m.U(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.MenuPageIndicator$2", f = "MenuPageIndicator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final MenuPageIndicator l;

            b(MenuPageIndicator menuPageIndicator0, d d0) {
                this.l = menuPageIndicator0;
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
                this.l.X();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.MenuPageIndicator$3", f = "MenuPageIndicator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.MenuPageIndicator.c extends o implements p {
            int k;
            final MenuPageIndicator l;

            com.dcinside.app.view.MenuPageIndicator.c(MenuPageIndicator menuPageIndicator0, d d0) {
                this.l = menuPageIndicator0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.MenuPageIndicator.c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.V();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.MenuPageIndicator$4", f = "MenuPageIndicator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.MenuPageIndicator.d extends o implements p {
            int k;
            final MenuPageIndicator l;

            com.dcinside.app.view.MenuPageIndicator.d(MenuPageIndicator menuPageIndicator0, d d0) {
                this.l = menuPageIndicator0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.MenuPageIndicator.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.T();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.MenuPageIndicator$5", f = "MenuPageIndicator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements p {
            int k;
            final MenuPageIndicator l;

            e(MenuPageIndicator menuPageIndicator0, d d0) {
                this.l = menuPageIndicator0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.Z();
                return S0.a;
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.k = -1;
        this.l = -1;
        this.m = 5;
        this.o = (int v, int v1) -> {
            L.p(this, "this$0");
            this.S();
        };
        View.inflate(context0, 0x7F0E0213, this);  // layout:view_menu_page_indicator
        View view0 = this.findViewById(0x7F0B063D);  // id:indicator_prev
        L.o(view0, "findViewById(...)");
        this.b = (ImageView)view0;
        View view1 = this.findViewById(0x7F0B063C);  // id:indicator_next
        L.o(view1, "findViewById(...)");
        this.c = (ImageView)view1;
        View view2 = this.findViewById(0x7F0B063B);  // id:indicator_delete
        L.o(view2, "findViewById(...)");
        this.d = (ImageView)view2;
        TextView[] arr_textView = new TextView[5];
        View view3 = this.findViewById(0x7F0B0635);  // id:indicator0
        L.o(view3, "findViewById(...)");
        int v1 = 0;
        arr_textView[0] = view3;
        View view4 = this.findViewById(0x7F0B0636);  // id:indicator1
        L.o(view4, "findViewById(...)");
        arr_textView[1] = view4;
        View view5 = this.findViewById(0x7F0B0637);  // id:indicator2
        L.o(view5, "findViewById(...)");
        arr_textView[2] = view5;
        View view6 = this.findViewById(0x7F0B0638);  // id:indicator3
        L.o(view6, "findViewById(...)");
        arr_textView[3] = view6;
        View view7 = this.findViewById(0x7F0B0639);  // id:indicator4
        L.o(view7, "findViewById(...)");
        arr_textView[4] = view7;
        this.e = arr_textView;
        View view8 = this.findViewById(0x7F0B063A);  // id:indicator_config
        L.o(view8, "findViewById(...)");
        this.f = view8;
        View view9 = this.findViewById(0x7F0B063E);  // id:indicator_show_all
        L.o(view9, "findViewById(...)");
        this.g = view9;
        for(int v2 = 0; v2 < 5; ++v2) {
            r.M(arr_textView[v2], null, new com.dcinside.app.view.MenuPageIndicator.a(this, null), 1, null);
        }
        b menuPageIndicator$b0 = new b(this, null);
        r.M(this.b, null, menuPageIndicator$b0, 1, null);
        com.dcinside.app.view.MenuPageIndicator.c menuPageIndicator$c0 = new com.dcinside.app.view.MenuPageIndicator.c(this, null);
        r.M(this.c, null, menuPageIndicator$c0, 1, null);
        com.dcinside.app.view.MenuPageIndicator.d menuPageIndicator$d0 = new com.dcinside.app.view.MenuPageIndicator.d(this, null);
        r.M(this.d, null, menuPageIndicator$d0, 1, null);
        e menuPageIndicator$e0 = new e(this, null);
        r.M(this.g, null, menuPageIndicator$e0, 1, null);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.MenuPageIndicator);
        L.o(typedArray0, "obtainStyledAttributes(...)");
        boolean z = typedArray0.getBoolean(0, false);
        this.r = z;
        ImageView imageView0 = this.d;
        if(!z) {
            v1 = 8;
        }
        imageView0.setVisibility(v1);
        typedArray0.recycle();
    }

    public MenuPageIndicator(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @j
    public final void L(@m RecyclerViewPager recyclerViewPager0, int v, boolean z) {
        MenuPageIndicator.O(this, recyclerViewPager0, v, z, null, null, 24, null);
    }

    @j
    public final void M(@m RecyclerViewPager recyclerViewPager0, int v, boolean z, @m a a0) {
        MenuPageIndicator.O(this, recyclerViewPager0, v, z, a0, null, 16, null);
    }

    @j
    public final void N(@m RecyclerViewPager recyclerViewPager0, int v, boolean z, @m a a0, @m a a1) {
        this.m = v;
        this.n = z;
        this.p = a0;
        this.q = a1;
        boolean z1 = L.g(this.j, recyclerViewPager0);
        if(!z1) {
            RecyclerViewPager recyclerViewPager1 = this.j;
            if(recyclerViewPager1 != null) {
                recyclerViewPager1.c0(this.o);
            }
            this.j = recyclerViewPager0;
        }
        Adapter recyclerView$Adapter0 = recyclerViewPager0 == null ? null : recyclerViewPager0.getAdapter();
        if(!L.g(this.i, recyclerView$Adapter0)) {
            Adapter recyclerView$Adapter1 = this.i;
            if(recyclerView$Adapter1 != null) {
                com.dcinside.app.util.ql.b.a(recyclerView$Adapter1);
            }
            this.i = recyclerView$Adapter0;
            if(recyclerView$Adapter0 != null) {
                com.dcinside.app.util.ql.b.a(recyclerView$Adapter0);
                com.dcinside.app.util.ql.b.c(recyclerView$Adapter0, (int v, int v1, int v2, int v3) -> {
                    L.p(this, "this$0");
                    this.S();
                });
            }
        }
        if(!z1 && recyclerViewPager0 != null) {
            recyclerViewPager0.c0(this.o);
            recyclerViewPager0.U(this.o);
        }
        this.S();
        this.g.setVisibility((this.s ? 0 : 8));
    }

    public static void O(MenuPageIndicator menuPageIndicator0, RecyclerViewPager recyclerViewPager0, int v, boolean z, a a0, a a1, int v1, Object object0) {
        menuPageIndicator0.N(recyclerViewPager0, v, z, ((v1 & 8) == 0 ? a0 : null), ((v1 & 16) == 0 ? a1 : null));
    }

    // 检测为 Lambda 实现
    private static final void P(MenuPageIndicator menuPageIndicator0, int v, int v1, int v2, int v3) [...]

    private final void Q(int v, int v1) {
        int v2 = 4;
        int v3 = 0;
        int v4 = Math.max(v, 0);
        if(this.k == v4 && this.l == v1) {
            return;
        }
        if(v1 == 0) {
            this.setVisibility(4);
        }
        else {
            this.setVisibility(0);
            int v5 = this.m;
            int v6 = v4 / v5;
            this.b.setVisibility((v6 > 0 ? 0 : 4));
            ImageView imageView0 = this.c;
            if(v6 < (v1 - 1) / v5) {
                v2 = 0;
            }
            imageView0.setVisibility(v2);
            if(this.n) {
                this.f.setVisibility(0);
            }
            else {
                this.f.setVisibility(8);
            }
            if(this.r) {
                this.d.setVisibility(0);
            }
            else {
                this.d.setVisibility(8);
            }
            int v7 = this.m;
            for(int v8 = 0; v8 < v7; ++v8) {
                if(v4 / this.m != v1 / this.m || v8 <= v1 % this.m - 1) {
                    this.e[v8].setVisibility(0);
                    this.e[v8].setSelected(v4 % this.m == v8);
                    this.e[v8].setText(String.valueOf(this.m * v6 + v8 + 1));
                }
                else {
                    this.e[v8].setVisibility(8);
                }
            }
        }
        this.k = v4;
        this.l = v1;
        if(this.s) {
            View view0 = this.g;
            if(v1 <= 1) {
                v3 = 8;
            }
            view0.setVisibility(v3);
        }
    }

    public final boolean R() {
        return this.s;
    }

    private final void S() {
        @f(c = "com.dcinside.app.view.MenuPageIndicator$onChanged$1", f = "MenuPageIndicator.kt", i = {}, l = {0xF1}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.MenuPageIndicator.f extends o implements A3.o {
            int k;
            final MenuPageIndicator l;
            final long m;

            com.dcinside.app.view.MenuPageIndicator.f(MenuPageIndicator menuPageIndicator0, long v, d d0) {
                this.l = menuPageIndicator0;
                this.m = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.view.MenuPageIndicator.f(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.view.MenuPageIndicator.f)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        if(this.l.getVisibility() != 0) {
                            this.k = 1;
                            if(a0.b(100L, this) == object1) {
                                return object1;
                            }
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(this.m != this.l.a) {
                    return S0.a;
                }
                try {
                    RecyclerViewPager recyclerViewPager0 = this.l.j;
                    Adapter recyclerView$Adapter0 = this.l.i;
                    if(recyclerViewPager0 != null && recyclerView$Adapter0 != null) {
                        if(recyclerView$Adapter0 instanceof i) {
                            int v = recyclerViewPager0.getCurrentPosition();
                            int v1 = ((i)recyclerView$Adapter0).z(v);
                            int v2 = ((i)recyclerView$Adapter0).y(v);
                            this.l.Q(v1, v2);
                            return S0.a;
                        }
                        int v3 = recyclerViewPager0.getCurrentPosition();
                        int v4 = recyclerView$Adapter0.getItemCount();
                        this.l.Q(v3, v4);
                        return S0.a;
                    }
                    this.l.Q(0, 0);
                    return S0.a;
                }
                catch(Exception exception0) {
                }
                timber.log.b.a.y(exception0);
                return S0.a;
            }
        }

        long v = this.a + 1L;
        this.a = v;
        com.dcinside.app.view.MenuPageIndicator.f menuPageIndicator$f0 = new com.dcinside.app.view.MenuPageIndicator.f(this, v, null);
        this.h = k.f(() -> kotlin.coroutines.i.a, h0.e(), null, menuPageIndicator$f0, 2, null);
    }

    private final void T() {
        a a0 = this.p;
        if(a0 != null) {
            a0.invoke();
        }
    }

    private final void U(View view0) {
        RecyclerViewPager recyclerViewPager0 = this.j;
        if(recyclerViewPager0 == null) {
            return;
        }
        i i0 = this.i instanceof i ? ((i)this.i) : null;
        int v = 0;
        int v1 = i0 == null ? 0 : i0.x();
        int v2 = recyclerViewPager0.getCurrentPosition();
        boolean z = 1 <= v1 && v1 <= v2;
        if(z) {
            v2 -= v1;
        }
        int v3 = v2 / this.m;
        switch(view0.getId()) {
            case 0x7F0B0635: {  // id:indicator0
                break;
            }
            case 0x7F0B0636: {  // id:indicator1
                v = 1;
                break;
            }
            case 0x7F0B0637: {  // id:indicator2
                v = 2;
                break;
            }
            case 0x7F0B0638: {  // id:indicator3
                v = 3;
                break;
            }
            default: {
                v = 4;
            }
        }
        recyclerViewPager0.scrollToPosition((z ? v3 * this.m + v + v1 : v3 * this.m + v));
    }

    private final void V() {
        RecyclerViewPager recyclerViewPager0 = this.j;
        if(recyclerViewPager0 == null) {
            return;
        }
        i i0 = this.i instanceof i ? ((i)this.i) : null;
        int v = 0;
        int v1 = i0 == null ? 0 : i0.x();
        int v2 = recyclerViewPager0.getCurrentPosition();
        boolean z = 1 <= v1 && v1 <= v2;
        if(z) {
            v2 -= v1;
        }
        Adapter recyclerView$Adapter0 = recyclerViewPager0.getAdapter();
        if(recyclerView$Adapter0 != null) {
            v = recyclerView$Adapter0.getItemCount();
        }
        int v3 = (v2 + this.m) / this.m * this.m;
        if(z) {
            v3 += v1;
        }
        recyclerViewPager0.scrollToPosition(Math.min(v3, v - 1));
    }

    // 检测为 Lambda 实现
    private static final void W(MenuPageIndicator menuPageIndicator0, int v, int v1) [...]

    private final void X() {
        RecyclerViewPager recyclerViewPager0 = this.j;
        if(recyclerViewPager0 == null) {
            return;
        }
        i i0 = this.i instanceof i ? ((i)this.i) : null;
        int v = i0 == null ? 0 : i0.x();
        int v1 = recyclerViewPager0.getCurrentPosition();
        boolean z = 1 <= v && v <= v1;
        if(z) {
            v1 -= v;
        }
        int v2 = (v1 - this.m) / this.m * this.m + (this.m - 1);
        if(z) {
            v2 += v;
        }
        recyclerViewPager0.scrollToPosition(Math.max(v2, 0));
    }

    private final void Z() {
        a a0 = this.q;
        if(a0 != null) {
            a0.invoke();
        }
    }

    public final void a0() {
        RecyclerViewPager recyclerViewPager0 = this.j;
        if(recyclerViewPager0 != null) {
            Adapter recyclerView$Adapter0 = recyclerViewPager0.getAdapter();
            if(recyclerView$Adapter0 != null) {
                com.dcinside.app.util.ql.b.a(recyclerView$Adapter0);
            }
        }
        RecyclerViewPager recyclerViewPager1 = this.j;
        if(recyclerViewPager1 != null) {
            recyclerViewPager1.c0(this.o);
        }
        this.j = null;
    }

    @l
    public final View getConfigIcon() {
        return this.f;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ++this.a;
        try {
            I0 i00 = this.h;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
        }
        catch(Exception unused_ex) {
        }
        this.h = null;
    }

    public final void setMainPage(boolean z) {
        this.s = z;
    }
}

