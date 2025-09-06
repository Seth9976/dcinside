package com.dcinside.app.view.colorpicker;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.dcinside.app.internal.t;
import com.dcinside.app.rx.bus.X;
import com.dcinside.app.rx.bus.Y;
import com.dcinside.app.rx.bus.n;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.dl;
import com.google.android.material.tabs.TabLayout.f;
import com.google.android.material.tabs.TabLayout.i;
import com.google.android.material.tabs.TabLayout;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import rx.g;
import rx.o;
import rx.subscriptions.b;
import top.defaults.colorpicker.e;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nDcColorPickerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcColorPickerView.kt\ncom/dcinside/app/view/colorpicker/DcColorPickerView\n+ 2 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 8 Color.kt\nandroidx/core/graphics/ColorKt\n+ 9 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,238:1\n60#2:239\n60#2:241\n60#2:242\n1#3:240\n1#3:269\n257#4,2:243\n11132#5:245\n11467#5,3:246\n1611#6,9:249\n1863#6:258\n1864#6:270\n1620#6:271\n1872#6,3:273\n1872#6,3:277\n177#7,6:259\n183#7,3:266\n404#8:265\n25#9:272\n25#9:276\n*S KotlinDebug\n*F\n+ 1 DcColorPickerView.kt\ncom/dcinside/app/view/colorpicker/DcColorPickerView\n*L\n50#1:239\n53#1:241\n56#1:242\n84#1:269\n68#1:243,2\n76#1:245\n76#1:246,3\n84#1:249,9\n84#1:258\n84#1:270\n84#1:271\n98#1:273,3\n113#1:277,3\n84#1:259,6\n84#1:266,3\n84#1:265\n97#1:272\n112#1:276\n*E\n"})
public final class DcColorPickerView extends FrameLayout {
    @s0({"SMAP\nDcColorPickerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcColorPickerView.kt\ncom/dcinside/app/view/colorpicker/DcColorPickerView$ColorChangeCallback\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n147#2:239\n278#3,2:240\n25#4:242\n1872#5,3:243\n*S KotlinDebug\n*F\n+ 1 DcColorPickerView.kt\ncom/dcinside/app/view/colorpicker/DcColorPickerView$ColorChangeCallback\n*L\n172#1:239\n177#1:240,2\n192#1:242\n194#1:243,3\n*E\n"})
    static final class d extends AdapterDataObserver implements f, e {
        @l
        private final t a;

        public d(@l DcColorPickerView dcColorPickerView0) {
            L.p(dcColorPickerView0, "view");
            super();
            this.a = new t(dcColorPickerView0);
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void N(@m i tabLayout$i0) {
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void R(@m i tabLayout$i0) {
        }

        @Override  // top.defaults.colorpicker.e
        public void e(int v, boolean z, boolean z1) {
            DcColorPickerView dcColorPickerView0 = (DcColorPickerView)this.a.a();
            if(dcColorPickerView0 == null) {
                return;
            }
            dcColorPickerView0.d.setCurrentColor(v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void f() {
            DcColorPickerView dcColorPickerView0 = (DcColorPickerView)this.a.a();
            if(dcColorPickerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = dcColorPickerView0.e.getAdapter();
            int v = 0;
            SpringDotsIndicator springDotsIndicator0 = dcColorPickerView0.f;
            if((recyclerView$Adapter0 == null ? 0 : recyclerView$Adapter0.getItemCount()) <= 1) {
                v = 4;
            }
            springDotsIndicator0.setVisibility(v);
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void j(@m i tabLayout$i0) {
            Adapter recyclerView$Adapter0 = null;
            DcColorPickerView dcColorPickerView0 = (DcColorPickerView)this.a.a();
            if(dcColorPickerView0 == null) {
                return;
            }
            Integer integer0 = tabLayout$i0 == null ? null : tabLayout$i0.k();
            if(integer0 != null && ((int)integer0) == 0) {
                dcColorPickerView0.a.setVisibility(0);
                dcColorPickerView0.b.setVisibility(4);
                dcColorPickerView0.c.setVisibility(4);
                Adapter recyclerView$Adapter1 = dcColorPickerView0.a.getAdapter();
                if(recyclerView$Adapter1 instanceof a) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                if(((a)recyclerView$Adapter0) == null) {
                    return;
                }
                Integer integer1 = dcColorPickerView0.d.getCurrentColor();
                int v = integer1 == null ? dcColorPickerView0.d.getDefaultColor() : ((int)integer1);
                int v1 = 0;
                for(Object object0: ((a)recyclerView$Adapter0).v()) {
                    if(v1 < 0) {
                        u.Z();
                    }
                    int v2 = ((Number)object0).intValue();
                    if(v2 == v) {
                        ((a)recyclerView$Adapter0).B(v2);
                        Integer integer2 = ((a)recyclerView$Adapter0).x();
                        if(integer2 != null) {
                            ((a)recyclerView$Adapter0).notifyItemChanged(((int)integer2));
                        }
                        ((a)recyclerView$Adapter0).C(v1);
                        ((a)recyclerView$Adapter0).notifyItemChanged(v1);
                    }
                    ++v1;
                }
                dl.a.H3(0);
                return;
            }
            if(integer0 != null && ((int)integer0) == 1) {
                dcColorPickerView0.a.setVisibility(4);
                dcColorPickerView0.b.setVisibility(0);
                dcColorPickerView0.c.setVisibility(4);
                Integer integer3 = dcColorPickerView0.d.getCurrentColor();
                dcColorPickerView0.b.setInitialColor((integer3 == null ? dcColorPickerView0.d.getDefaultColor() : ((int)integer3)));
                dl.a.H3(1);
                return;
            }
            if(integer0 != null && ((int)integer0) == 2) {
                dcColorPickerView0.a.setVisibility(4);
                dcColorPickerView0.b.setVisibility(4);
                dcColorPickerView0.c.setVisibility(0);
                Integer integer4 = dcColorPickerView0.d.getCurrentColor();
                dcColorPickerView0.c.setColor((integer4 == null ? dcColorPickerView0.d.getDefaultColor() : ((int)integer4)));
                dl.a.H3(2);
                return;
            }
            dcColorPickerView0.a.setVisibility(4);
            dcColorPickerView0.b.setVisibility(0);
            dcColorPickerView0.c.setVisibility(4);
            Integer integer5 = dcColorPickerView0.d.getCurrentColor();
            dcColorPickerView0.b.setInitialColor((integer5 == null ? dcColorPickerView0.d.getDefaultColor() : ((int)integer5)));
            dl.a.H3(1);
        }
    }

    public static final class com.dcinside.app.view.colorpicker.DcColorPickerView.e {
        private com.dcinside.app.view.colorpicker.DcColorPickerView.e() {
        }

        public com.dcinside.app.view.colorpicker.DcColorPickerView.e(w w0) {
        }
    }

    @l
    private final RecyclerView a;
    @l
    private final ColorPickerSpectrumView b;
    @l
    private final ColorSlidersRgbView c;
    @l
    private final SelectedColorView d;
    @l
    private final ViewPager2 e;
    @l
    private final SpringDotsIndicator f;
    @l
    private final TabLayout g;
    @l
    private final d h;
    @m
    private b i;
    @l
    public static final com.dcinside.app.view.colorpicker.DcColorPickerView.e j = null;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 10;

    static {
        DcColorPickerView.j = new com.dcinside.app.view.colorpicker.DcColorPickerView.e(null);
    }

    @j
    public DcColorPickerView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public DcColorPickerView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public DcColorPickerView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class com.dcinside.app.view.colorpicker.DcColorPickerView.a extends N implements Function1 {
            final DcColorPickerView e;

            com.dcinside.app.view.colorpicker.DcColorPickerView.a(DcColorPickerView dcColorPickerView0) {
                this.e = dcColorPickerView0;
                super(1);
            }

            public final void a(X x0) {
                Integer integer0 = x0.a();
                this.e.q(integer0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((X)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.view.colorpicker.DcColorPickerView.b extends N implements Function1 {
            final DcColorPickerView e;

            com.dcinside.app.view.colorpicker.DcColorPickerView.b(DcColorPickerView dcColorPickerView0) {
                this.e = dcColorPickerView0;
                super(1);
            }

            public final void a(Y y0) {
                int v = y0.a();
                this.e.r(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Y)object0));
                return S0.a;
            }
        }


        static final class c extends N implements Function1 {
            final DcColorPickerView e;

            c(DcColorPickerView dcColorPickerView0) {
                this.e = dcColorPickerView0;
                super(1);
            }

            public final void a(n n0) {
                this.e.p(n0.a(), n0.b());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((n)object0));
                return S0.a;
            }
        }

        L.p(context0, "context");
        Integer integer0;
        o o2;
        o o1;
        o o0;
        super(context0, attributeSet0, v);
        d dcColorPickerView$d0 = new d(this);
        this.h = dcColorPickerView$d0;
        View.inflate(context0, 0x7F0E01AD, this);  // layout:view_color_picker
        Context context1 = Al.h(context0);
        b b0 = this.i;
        if(b0 != null) {
            b0.c();
        }
        if(context1 == null) {
            o0 = null;
        }
        else {
            g g0 = com.dcinside.app.rx.bus.c.c(context1, X.class);
            o0 = g0 == null ? null : g0.x5((Object object0) -> {
                L.p(new com.dcinside.app.view.colorpicker.DcColorPickerView.a(this), "$tmp0");
                new com.dcinside.app.view.colorpicker.DcColorPickerView.a(this).invoke(object0);
            });
        }
        b b1 = this.i;
        if(b1 != null) {
            b1.a(o0);
        }
        if(context1 == null) {
            o1 = null;
        }
        else {
            g g1 = com.dcinside.app.rx.bus.c.c(context1, Y.class);
            o1 = g1 == null ? null : g1.x5((Object object0) -> {
                L.p(new com.dcinside.app.view.colorpicker.DcColorPickerView.b(this), "$tmp0");
                new com.dcinside.app.view.colorpicker.DcColorPickerView.b(this).invoke(object0);
            });
        }
        b b2 = this.i;
        if(b2 != null) {
            b2.a(o1);
        }
        if(context1 == null) {
            o2 = null;
        }
        else {
            g g2 = com.dcinside.app.rx.bus.c.c(context1, n.class);
            o2 = g2 == null ? null : g2.x5((Object object0) -> {
                L.p(new c(this), "$tmp0");
                new c(this).invoke(object0);
            });
        }
        b b3 = this.i;
        if(b3 != null) {
            b3.a(o2);
        }
        View view0 = this.findViewById(0x7F0B02CD);  // id:color_picker_grid
        L.o(view0, "findViewById(...)");
        this.a = (RecyclerView)view0;
        View view1 = this.findViewById(0x7F0B02D7);  // id:color_picker_spectrum
        L.o(view1, "findViewById(...)");
        this.b = (ColorPickerSpectrumView)view1;
        View view2 = this.findViewById(0x7F0B02D6);  // id:color_picker_slider
        L.o(view2, "findViewById(...)");
        this.c = (ColorSlidersRgbView)view2;
        View view3 = this.findViewById(0x7F0B02C9);  // id:color_picker_color_selected
        L.o(view3, "findViewById(...)");
        this.d = (SelectedColorView)view3;
        View view4 = this.findViewById(0x7F0B02D4);  // id:color_picker_recent_list_pager
        L.o(view4, "findViewById(...)");
        this.e = (ViewPager2)view4;
        View view5 = this.findViewById(0x7F0B02CC);  // id:color_picker_dots_indicator
        L.o(view5, "findViewById(...)");
        this.f = (SpringDotsIndicator)view5;
        View view6 = this.findViewById(0x7F0B02D8);  // id:color_picker_tab
        L.o(view6, "findViewById(...)");
        this.g = (TabLayout)view6;
        ((TabLayout)view6).h(dcColorPickerView$d0);
        int v1 = dl.a.Q();
        ((RecyclerView)view0).setVisibility((v1 == 0 ? 8 : 0));
        i tabLayout$i0 = ((TabLayout)view6).D(v1);
        if(tabLayout$i0 != null) {
            tabLayout$i0.r();
        }
        ((ColorSlidersRgbView)view2).I(((SelectedColorView)view3));
        a a0 = new a();
        ((RecyclerView)view0).setLayoutManager(new GridLayoutManager(context0, 12));
        ((RecyclerView)view0).setAdapter(a0);
        ((RecyclerView)view0).setItemAnimator(null);
        int[] arr_v = this.getResources().getIntArray(0x7F030003);  // array:colorPickerGirdColors
        L.o(arr_v, "getIntArray(...)");
        ArrayList arrayList0 = new ArrayList(arr_v.length);
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            arrayList0.add(((int)arr_v[v2]));
        }
        a0.A(arrayList0);
        a0.notifyItemRangeInserted(0, a0.getItemCount());
        com.dcinside.app.view.colorpicker.i i0 = new com.dcinside.app.view.colorpicker.i();
        this.e.setAdapter(i0);
        this.f.g(this.e);
        i0.registerAdapterDataObserver(this.h);
        Iterable iterable0 = v.V4(dl.a.R(), new String[]{"|"}, false, 0, 6, null);
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: iterable0) {
            String s = (String)object0;
            try {
                integer0 = null;
                integer0 = Color.parseColor(s);
            }
            catch(Exception unused_ex) {
            }
            if(integer0 != null) {
                arrayList1.add(integer0);
            }
        }
        i0.y(arrayList1);
        this.b.m(this.h);
    }

    public DcColorPickerView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    // 检测为 Lambda 实现
    private static final void d(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void e(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void f(Function1 function10, Object object0) [...]

    @m
    public final Integer getColor() {
        return this.d.getCurrentColor();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g.N(this.h);
        Adapter recyclerView$Adapter0 = this.e.getAdapter();
        if(recyclerView$Adapter0 != null) {
            recyclerView$Adapter0.unregisterAdapterDataObserver(this.h);
        }
        this.b.c(this.h);
        b b0 = this.i;
        if(b0 != null) {
            b0.l();
        }
        this.i = null;
    }

    private final void p(int v, int v1) {
        Adapter recyclerView$Adapter0 = this.a.getAdapter();
        a a0 = recyclerView$Adapter0 instanceof a ? ((a)recyclerView$Adapter0) : null;
        if(a0 == null) {
            return;
        }
        a0.B(v);
        Integer integer0 = a0.x();
        if(integer0 != null) {
            a0.notifyItemChanged(((int)integer0));
        }
        a0.C(v1);
        a0.notifyItemChanged(v1);
        this.d.setCurrentColor(a0.w());
    }

    private final void q(Integer integer0) {
        if(integer0 == null) {
            return;
        }
        this.b.setInitialColor(((int)integer0));
        this.c.setColor(((int)integer0));
        Adapter recyclerView$Adapter0 = this.a.getAdapter();
        if(!(recyclerView$Adapter0 instanceof a)) {
            recyclerView$Adapter0 = null;
        }
        if(((a)recyclerView$Adapter0) == null) {
            return;
        }
        int v = 0;
        for(Object object0: ((a)recyclerView$Adapter0).v()) {
            if(v < 0) {
                u.Z();
            }
            int v1 = ((Number)object0).intValue();
            if(v1 == ((int)integer0)) {
                ((a)recyclerView$Adapter0).B(v1);
                Integer integer1 = ((a)recyclerView$Adapter0).x();
                if(integer1 != null) {
                    ((a)recyclerView$Adapter0).notifyItemChanged(((int)integer1));
                }
                ((a)recyclerView$Adapter0).C(v);
                ((a)recyclerView$Adapter0).notifyItemChanged(v);
            }
            ++v;
        }
    }

    private final void r(int v) {
        static final class com.dcinside.app.view.colorpicker.DcColorPickerView.f extends N implements Function1 {
            public static final com.dcinside.app.view.colorpicker.DcColorPickerView.f e;

            static {
                com.dcinside.app.view.colorpicker.DcColorPickerView.f.e = new com.dcinside.app.view.colorpicker.DcColorPickerView.f();
            }

            com.dcinside.app.view.colorpicker.DcColorPickerView.f() {
                super(1);
            }

            @l
            public final CharSequence a(int v) {
                return com.dcinside.app.internal.c.i(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

        Adapter recyclerView$Adapter0 = this.e.getAdapter();
        com.dcinside.app.view.colorpicker.i i0 = recyclerView$Adapter0 instanceof com.dcinside.app.view.colorpicker.i ? ((com.dcinside.app.view.colorpicker.i)recyclerView$Adapter0) : null;
        if(i0 == null) {
            return;
        }
        List list0 = u.Y5(i0.v());
        if(list0.size() <= v) {
            return;
        }
        list0.remove(v);
        i0.y(list0);
        String s = u.m3(list0, "|", null, null, 0, null, com.dcinside.app.view.colorpicker.DcColorPickerView.f.e, 30, null);
        dl.a.I3(s);
    }

    public final void setInitialColor(int v) {
        if(v == 0) {
            v = this.d.getDefaultColor();
        }
        this.b.setInitialColor(v);
        this.d.setCurrentColor(v);
        Adapter recyclerView$Adapter0 = this.a.getAdapter();
        if(!(recyclerView$Adapter0 instanceof a)) {
            recyclerView$Adapter0 = null;
        }
        if(((a)recyclerView$Adapter0) == null) {
            return;
        }
        int v1 = 0;
        for(Object object0: ((a)recyclerView$Adapter0).v()) {
            if(v1 < 0) {
                u.Z();
            }
            int v2 = ((Number)object0).intValue();
            if(v2 == v) {
                ((a)recyclerView$Adapter0).B(v2);
                ((a)recyclerView$Adapter0).C(v1);
                ((a)recyclerView$Adapter0).notifyItemChanged(v1);
            }
            ++v1;
        }
    }
}

