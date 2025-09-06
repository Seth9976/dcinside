package com.dcinside.app.write.menu.series;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.g0;
import com.dcinside.app.rx.bus.h0;
import com.dcinside.app.rx.bus.i0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import io.realm.P0;
import io.realm.g1;
import io.realm.r1;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nSeriesListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeriesListActivity.kt\ncom/dcinside/app/write/menu/series/SeriesListActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,270:1\n248#1,10:274\n1#2:271\n60#3:272\n60#3:273\n192#4,7:284\n*S KotlinDebug\n*F\n+ 1 SeriesListActivity.kt\ncom/dcinside/app/write/menu/series/SeriesListActivity\n*L\n189#1:274,10\n137#1:272\n140#1:273\n214#1:284,7\n*E\n"})
public final class SeriesListActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @m ActivityResultLauncher activityResultLauncher0) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, SeriesListActivity.class);
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }
    }

    @l
    private P0 A;
    @m
    private PopupWindow B;
    @m
    private f C;
    @m
    private g0 D;
    @m
    private b E;
    @l
    public static final a F;
    private Y.g0 w;
    @m
    private g1 x;
    @l
    private p y;
    @m
    private ActivityResultLauncher z;

    static {
        SeriesListActivity.F = new a(null);
    }

    public SeriesListActivity() {
        this.y = new p();
        this.A = (g1 g10) -> {
            L.p(this, "this$0");
            L.m(g10);
            this.l2(g10);
        };
    }

    private final void X1(AppCompatActivity appCompatActivity0, V[] arr_v) {
        FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        L.y(4, "T");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = Fragment.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "androidx.fragment.app.Fragment");
        L.y(1, "T");
        fragment0.setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, arr_v.length))));
        fragmentManager0.u().M(0x7F010016, 0x7F010017).C(0x7F0B0E21, fragment0).q();  // anim:archive_quick_enter
    }

    private final void Y1() {
        if(this.B != null && this.B.isShowing()) {
            this.c2();
            return;
        }
        com.dcinside.app.write.menu.series.SeriesManageActivity.a.c(SeriesManageActivity.E, this, this.z, null, 4, null);
    }

    private final void Z1(g0 g00) {
        this.D = g00;
        this.c2();
        V[] arr_v = {r0.a("extra_series_subject", g00.S5())};
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = f.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.write.menu.series.f");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.write.menu.series.SeriesCopyDialog");
        }
        ((f)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
        ((f)fragment0).show(fragmentManager0, "com.dcinside.app.write.menu.series.f");
        this.C = (f)fragment0;
    }

    private final void a2(g0 g00) {
        this.D = (g0)g00.D5().d2(g00);
        this.c2();
        g00.D5().Y3((F0 f00) -> {
            L.p(g00, "$item");
            g00.z5();
        });
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = com.dcinside.app.write.menu.series.g.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.write.menu.series.g");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.write.menu.series.SeriesDeleteQuickFragment");
        }
        ((com.dcinside.app.write.menu.series.g)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
        fragmentManager0.u().M(0x7F010016, 0x7F010017).C(0x7F0B0E21, ((com.dcinside.app.write.menu.series.g)fragment0)).q();  // anim:archive_quick_enter
    }

    // 检测为 Lambda 实现
    private static final void b2(g0 g00, F0 f00) [...]

    private final void c2() {
        PopupWindow popupWindow0 = this.B;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
        Y.g0 g00 = null;
        this.B = null;
        Y.g0 g01 = this.w;
        if(g01 == null) {
            L.S("binding");
        }
        else {
            g00 = g01;
        }
        g00.o.setVisibility(8);
    }

    private final void d2() {
        public static final class com.dcinside.app.write.menu.series.SeriesListActivity.b extends OnBackPressedCallback {
            final SeriesListActivity d;

            com.dcinside.app.write.menu.series.SeriesListActivity.b(SeriesListActivity seriesListActivity0) {
                this.d = seriesListActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                PopupWindow popupWindow0 = this.d.B;
                if(popupWindow0 != null && popupWindow0.isShowing()) {
                    this.d.c2();
                    return;
                }
                this.d.finish();
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.series.SeriesListActivity$initCallback$3", f = "SeriesListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements A3.p {
            int k;
            final SeriesListActivity l;

            c(SeriesListActivity seriesListActivity0, d d0) {
                this.l = seriesListActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.c2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.series.SeriesListActivity$initCallback$4", f = "SeriesListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.series.SeriesListActivity.d extends o implements A3.p {
            int k;
            final SeriesListActivity l;

            com.dcinside.app.write.menu.series.SeriesListActivity.d(SeriesListActivity seriesListActivity0, d d0) {
                this.l = seriesListActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.series.SeriesListActivity.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.c2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.series.SeriesListActivity$initCallback$5", f = "SeriesListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements A3.p {
            int k;
            final SeriesListActivity l;

            e(SeriesListActivity seriesListActivity0, d d0) {
                this.l = seriesListActivity0;
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
                this.l.Y1();
                return S0.a;
            }
        }


        static final class com.dcinside.app.write.menu.series.SeriesListActivity.f extends N implements Function1 {
            final SeriesListActivity e;

            com.dcinside.app.write.menu.series.SeriesListActivity.f(SeriesListActivity seriesListActivity0) {
                this.e = seriesListActivity0;
                super(1);
            }

            public final void a(i0 i00) {
                L.m(i00);
                this.e.k2(i00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((i0)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.write.menu.series.SeriesListActivity.g extends N implements Function1 {
            final SeriesListActivity e;

            com.dcinside.app.write.menu.series.SeriesListActivity.g(SeriesListActivity seriesListActivity0) {
                this.e = seriesListActivity0;
                super(1);
            }

            public final void a(h0 h00) {
                L.m(h00);
                this.e.j2(h00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((h0)object0));
                return S0.a;
            }
        }

        this.z = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                this.setResult(-1, activityResult0.a());
                this.finish();
                return;
            }
            if(this.x == null || this.x.isEmpty()) {
                this.finish();
            }
        });
        this.getOnBackPressedDispatcher().h(new com.dcinside.app.write.menu.series.SeriesListActivity.b(this));
        Y.g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        L.o(g00.g, "seriesCurrentCountWrap");
        c seriesListActivity$c0 = new c(this, null);
        r.M(g00.g, null, seriesListActivity$c0, 1, null);
        Y.g0 g01 = this.w;
        if(g01 == null) {
            L.S("binding");
            g01 = null;
        }
        L.o(g01.o, "seriesPopupMenuHider");
        com.dcinside.app.write.menu.series.SeriesListActivity.d seriesListActivity$d0 = new com.dcinside.app.write.menu.series.SeriesListActivity.d(this, null);
        r.M(g01.o, null, seriesListActivity$d0, 1, null);
        Y.g0 g02 = this.w;
        if(g02 == null) {
            L.S("binding");
            g02 = null;
        }
        L.o(g02.n, "seriesMakeNew");
        e seriesListActivity$e0 = new e(this, null);
        r.M(g02.n, null, seriesListActivity$e0, 1, null);
        rx.o o0 = com.dcinside.app.rx.bus.c.c(this, i0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.series.SeriesListActivity.f(this), "$tmp0");
            new com.dcinside.app.write.menu.series.SeriesListActivity.f(this).invoke(object0);
        });
        b b0 = this.E;
        if(b0 != null) {
            b0.a(o0);
        }
        rx.o o1 = com.dcinside.app.rx.bus.c.c(this, h0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.series.SeriesListActivity.g(this), "$tmp0");
            new com.dcinside.app.write.menu.series.SeriesListActivity.g(this).invoke(object0);
        });
        b b1 = this.E;
        if(b1 != null) {
            b1.a(o1);
        }
    }

    // 检测为 Lambda 实现
    private static final void e2(SeriesListActivity seriesListActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void f2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void g2(Function1 function10, Object object0) [...]

    private final void h2() {
        F0 f00 = this.F1();
        if(f00 == null) {
            return;
        }
        g1 g10 = f00.C4(g0.class).g2("saveDate", r1.c).q0();
        this.x = g10;
        if(g10 != null) {
            g10.l(this.A);
        }
    }

    private final void i2() {
        Y.g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        g00.h.setLayoutManager(nonPredictiveLayoutManager0);
        g00.h.setAdapter(this.y);
        this.setTitle("시리즈");
    }

    private final void j2(h0 h00) {
        String s1;
        g0 g00 = this.D;
        if(g00 != null) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(g00.R5());
            String s = h00.a();
            if(s == null) {
                s1 = null;
            }
            else {
                s1 = s.substring(0, Math.min(s.length(), 20));
                L.o(s1, "substring(...)");
            }
            g0.g.b(s1, arrayList0);
        }
    }

    private final void k2(i0 i00) {
        if(i00.a()) {
            g0 g00 = this.D;
            if(g00 != null) {
                L.m(g00);
                g0.g.a(g00);
            }
        }
    }

    private final void l2(g1 g10) {
        if(g10.isEmpty()) {
            com.dcinside.app.write.menu.series.SeriesManageActivity.a.c(SeriesManageActivity.E, this, this.z, null, 4, null);
        }
        String s = String.format("#%06X", Arrays.copyOf(new Object[]{((int)(vk.b(this, 0x7F04012E) & 0xFFFFFF))}, 1));  // attr:colorAccent
        L.o(s, "format(...)");
        String s1 = this.getString(0x7F150941, new Object[]{s, g10.size()});  // string:series_count_color "(<font color=%1$s>%2$d</font>)"
        L.o(s1, "getString(...)");
        Y.g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        Spanned spanned0 = Dl.c(s1);
        g00.e.setText(spanned0);
        this.y.y(g10);
    }

    public final void m2(@m Long long0) {
        if(this.B != null && this.B.isShowing()) {
            this.c2();
            return;
        }
        SeriesManageActivity.E.a(this, this.z, long0);
    }

    public final void n2(@l g0 g00, @l View view0) {
        PopupWindow popupWindow0;
        L.p(g00, "item");
        L.p(view0, "view");
        if(this.s1()) {
            return;
        }
        LayoutInflater layoutInflater0 = LayoutInflater.from(this);
        if(layoutInflater0 == null) {
            return;
        }
        Y.g0 g01 = this.w;
        Y.g0 g02 = null;
        if(g01 == null) {
            L.S("binding");
            g01 = null;
        }
        CoordinatorLayout coordinatorLayout0 = g01.j instanceof ViewGroup ? g01.j : null;
        if(coordinatorLayout0 == null) {
            return;
        }
        View view1 = layoutInflater0.inflate(0x7F0E0223, coordinatorLayout0, false);  // layout:view_popup_series_menu
        View view2 = view1.findViewById(0x7F0B0A03);  // id:popup_series_copy
        View view3 = view1.findViewById(0x7F0B0A04);  // id:popup_series_delete
        view2.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.p(g00, "$item");
            this.Z1(g00);
        });
        view3.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.p(g00, "$item");
            this.a2(g00);
        });
        view1.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.c2();
        });
        try {
            popupWindow0 = new PopupWindow(view1, 0, 0, false);
            popupWindow0.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow0.showAsDropDown(view0, 0, 0, 17);
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
            popupWindow0 = null;
        }
        PopupWindow popupWindow1 = this.B;
        if(popupWindow1 != null) {
            popupWindow1.dismiss();
        }
        this.B = popupWindow0;
        Y.g0 g03 = this.w;
        if(g03 == null) {
            L.S("binding");
        }
        else {
            g02 = g03;
        }
        g02.o.setVisibility(0);
    }

    // 检测为 Lambda 实现
    private static final void o2(SeriesListActivity seriesListActivity0, g0 g00, View view0) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        Y.g0 g00 = Y.g0.c(this.getLayoutInflater());
        L.o(g00, "inflate(...)");
        this.w = g00;
        Y.g0 g01 = null;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        this.setContentView(g00.b());
        Y.g0 g02 = this.w;
        if(g02 == null) {
            L.S("binding");
        }
        else {
            g01 = g02;
        }
        this.S0(g01.l);
        kr.bhbfhfb.designcompat.a.d(this);
        this.i2();
        this.d2();
        this.h2();
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        g1 g10 = this.x;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.x = null;
        PopupWindow popupWindow0 = this.B;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
        this.B = null;
        f f0 = this.C;
        if(f0 != null) {
            f0.dismissAllowingStateLoss();
        }
        this.C = null;
        b b0 = this.E;
        if(b0 != null) {
            b0.l();
        }
        this.E = null;
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    // 检测为 Lambda 实现
    private static final void p2(SeriesListActivity seriesListActivity0, g0 g00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void q2(SeriesListActivity seriesListActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void r2(SeriesListActivity seriesListActivity0, g1 g10) [...]
}

