package com.dcinside.app.post;

import A3.p;
import Y.L2;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.IntRange;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dcinside.app.Application;
import com.dcinside.app.archive.main.ArchiveMainActivity;
import com.dcinside.app.auth.LoginActivity;
import com.dcinside.app.base.g;
import com.dcinside.app.best.e;
import com.dcinside.app.gallery.search.CategoryHotActivity;
import com.dcinside.app.gallery.status.MyGalleryStatusActivity;
import com.dcinside.app.history.PostHistoryActivity;
import com.dcinside.app.msg.NotificationDeleteReceiver;
import com.dcinside.app.post.fragments.C;
import com.dcinside.app.post.fragments.N3;
import com.dcinside.app.post.fragments.O;
import com.dcinside.app.post.fragments.PostContainerChildInsets;
import com.dcinside.app.post.fragments.S0;
import com.dcinside.app.post.fragments.V;
import com.dcinside.app.post.view.DrawerLayout.d;
import com.dcinside.app.push.PushNoticeListActivity;
import com.dcinside.app.read.ArchiveQuickManager;
import com.dcinside.app.read.K0;
import com.dcinside.app.rx.bus.I;
import com.dcinside.app.rx.bus.K;
import com.dcinside.app.rx.bus.S;
import com.dcinside.app.rx.bus.U;
import com.dcinside.app.rx.bus.d0;
import com.dcinside.app.rx.bus.w0;
import com.dcinside.app.rx.bus.x0;
import com.dcinside.app.settings.SettingActivity;
import com.dcinside.app.settings.image.AutoImageData;
import com.dcinside.app.settings.j0;
import com.dcinside.app.type.o;
import com.dcinside.app.util.Ak;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.gl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.pl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.AutoRotateLayout;
import com.dcinside.app.view.ContentProgressBar;
import com.dcinside.app.view.HackyDrawerLayout;
import com.dcinside.app.wv.s.a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar;
import io.realm.F0;
import io.realm.P0;
import io.realm.g1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.v;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.k;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nPostContainerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 8 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 9 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1926:1\n75#2,13:1927\n1#3:1940\n1#3:1987\n1#3:1997\n1#3:2007\n1#3:2017\n1#3:2027\n1#3:2037\n1#3:2047\n1#3:2057\n1#3:2067\n1#3:2077\n1#3:2087\n1#3:2097\n1#3:2107\n1#3:2117\n1#3:2127\n1#3:2137\n177#4,9:1941\n177#4,9:1952\n177#4,9:1961\n177#4,6:2148\n192#4,7:2154\n183#4,3:2161\n192#4,7:2164\n257#5,2:1950\n257#5,2:2174\n257#5,2:2176\n183#6,2:1970\n38#7:1972\n305#7:1986\n306#7:1988\n307#7:1995\n305#7:1996\n306#7:1998\n307#7:2005\n305#7:2006\n306#7:2008\n307#7:2015\n305#7:2016\n306#7:2018\n307#7:2025\n305#7:2026\n306#7:2028\n307#7:2035\n305#7:2036\n306#7:2038\n307#7:2045\n305#7:2046\n306#7:2048\n307#7:2055\n305#7:2056\n306#7:2058\n307#7:2065\n305#7:2066\n306#7:2068\n307#7:2075\n305#7:2076\n306#7:2078\n307#7:2085\n305#7:2086\n306#7:2088\n307#7:2095\n305#7:2096\n306#7:2098\n307#7:2105\n305#7:2106\n306#7:2108\n307#7:2115\n305#7:2116\n306#7:2118\n307#7:2125\n305#7:2126\n306#7:2128\n307#7:2135\n305#7:2136\n306#7:2138\n307#7:2145\n38#7:2146\n147#7:2147\n38#7:2173\n60#8:1973\n60#8:1974\n60#8:1975\n60#8:1976\n60#8:1977\n60#8:1978\n60#8:1979\n60#8:1980\n60#8:1981\n60#8:1982\n60#8:1983\n60#8:1984\n60#8:1985\n11132#9:1989\n11467#9,3:1990\n11132#9:1999\n11467#9,3:2000\n11132#9:2009\n11467#9,3:2010\n11132#9:2019\n11467#9,3:2020\n11132#9:2029\n11467#9,3:2030\n11132#9:2039\n11467#9,3:2040\n11132#9:2049\n11467#9,3:2050\n11132#9:2059\n11467#9,3:2060\n11132#9:2069\n11467#9,3:2070\n11132#9:2079\n11467#9,3:2080\n11132#9:2089\n11467#9,3:2090\n11132#9:2099\n11467#9,3:2100\n11132#9:2109\n11467#9,3:2110\n11132#9:2119\n11467#9,3:2120\n11132#9:2129\n11467#9,3:2130\n11132#9:2139\n11467#9,3:2140\n1863#10,2:1993\n1863#10,2:2003\n1863#10,2:2013\n1863#10,2:2023\n1863#10,2:2033\n1863#10,2:2043\n1863#10,2:2053\n1863#10,2:2063\n1863#10,2:2073\n1863#10,2:2083\n1863#10,2:2093\n1863#10,2:2103\n1863#10,2:2113\n1863#10,2:2123\n1863#10,2:2133\n1863#10,2:2143\n295#10,2:2171\n*S KotlinDebug\n*F\n+ 1 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n198#1:1927,13\n1190#1:1987\n1191#1:1997\n1192#1:2007\n1193#1:2017\n1194#1:2027\n1195#1:2037\n1196#1:2047\n1197#1:2057\n1200#1:2067\n1204#1:2077\n1205#1:2087\n1206#1:2097\n1207#1:2107\n1208#1:2117\n1209#1:2127\n1210#1:2137\n380#1:1941,9\n529#1:1952,9\n690#1:1961,9\n1538#1:2148,6\n1539#1:2154,7\n1538#1:2161,3\n1547#1:2164,7\n461#1:1950,2\n1920#1:2174,2\n488#1:2176,2\n1085#1:1970,2\n1143#1:1972\n1190#1:1986\n1190#1:1988\n1190#1:1995\n1191#1:1996\n1191#1:1998\n1191#1:2005\n1192#1:2006\n1192#1:2008\n1192#1:2015\n1193#1:2016\n1193#1:2018\n1193#1:2025\n1194#1:2026\n1194#1:2028\n1194#1:2035\n1195#1:2036\n1195#1:2038\n1195#1:2045\n1196#1:2046\n1196#1:2048\n1196#1:2055\n1197#1:2056\n1197#1:2058\n1197#1:2065\n1200#1:2066\n1200#1:2068\n1200#1:2075\n1204#1:2076\n1204#1:2078\n1204#1:2085\n1205#1:2086\n1205#1:2088\n1205#1:2095\n1206#1:2096\n1206#1:2098\n1206#1:2105\n1207#1:2106\n1207#1:2108\n1207#1:2115\n1208#1:2116\n1208#1:2118\n1208#1:2125\n1209#1:2126\n1209#1:2128\n1209#1:2135\n1210#1:2136\n1210#1:2138\n1210#1:2145\n1344#1:2146\n1420#1:2147\n1876#1:2173\n1144#1:1973\n1147#1:1974\n1150#1:1975\n1153#1:1976\n1156#1:1977\n1159#1:1978\n1162#1:1979\n1165#1:1980\n1168#1:1981\n1171#1:1982\n1174#1:1983\n1177#1:1984\n1180#1:1985\n1190#1:1989\n1190#1:1990,3\n1191#1:1999\n1191#1:2000,3\n1192#1:2009\n1192#1:2010,3\n1193#1:2019\n1193#1:2020,3\n1194#1:2029\n1194#1:2030,3\n1195#1:2039\n1195#1:2040,3\n1196#1:2049\n1196#1:2050,3\n1197#1:2059\n1197#1:2060,3\n1200#1:2069\n1200#1:2070,3\n1204#1:2079\n1204#1:2080,3\n1205#1:2089\n1205#1:2090,3\n1206#1:2099\n1206#1:2100,3\n1207#1:2109\n1207#1:2110,3\n1208#1:2119\n1208#1:2120,3\n1209#1:2129\n1209#1:2130,3\n1210#1:2139\n1210#1:2140,3\n1190#1:1993,2\n1191#1:2003,2\n1192#1:2013,2\n1193#1:2023,2\n1194#1:2033,2\n1195#1:2043,2\n1196#1:2053,2\n1197#1:2063,2\n1200#1:2073,2\n1204#1:2083,2\n1205#1:2093,2\n1206#1:2103,2\n1207#1:2113,2\n1208#1:2123,2\n1209#1:2133,2\n1210#1:2143,2\n1809#1:2171,2\n*E\n"})
public abstract class c0 extends g implements ViewGroup.OnHierarchyChangeListener, O, h0, n, d, a {
    static final class T implements Observer, D {
        private final Function1 a;

        T(Function1 function10) {
            L.p(function10, "function");
            super();
            this.a = function10;
        }

        // 去混淆评级： 低(20)
        @Override
        public final boolean equals(@m Object object0) {
            return !(object0 instanceof Observer) || !(object0 instanceof D) ? false : L.g(this.getFunctionDelegate(), ((D)object0).getFunctionDelegate());
        }

        @Override  // kotlin.jvm.internal.D
        @l
        public final v getFunctionDelegate() {
            return this.a;
        }

        @Override
        public final int hashCode() {
            return this.getFunctionDelegate().hashCode();
        }

        @Override  // androidx.lifecycle.Observer
        public final void onChanged(Object object0) {
            this.a.invoke(object0);
        }
    }

    public final class com.dcinside.app.post.c0.a {
        public static final int[] a;

        static {
            int[] arr_v = new int[o.values().length];
            try {
                arr_v[o.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[o.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[o.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.post.c0.a.a = arr_v;
        }
    }

    @m
    private I0 A;
    @m
    private I0 B;
    private boolean C;
    @m
    private x0 D;
    @l
    private o E;
    @m
    private b F;
    @m
    private AlertDialog G;
    @m
    private PostContainerChildInsets H;
    @m
    private ViewGroup I;
    @m
    private ViewGroup J;
    @m
    private ViewGroup K;
    @m
    private ViewGroup L;
    @m
    private View M;
    @l
    private final P0 M8;
    @m
    private com.dcinside.app.post.fragments.g N;
    @l
    private final X N8;
    @m
    private e O;
    @l
    private SharedPreferences.OnSharedPreferenceChangeListener O8;
    @m
    private rx.o P;
    @m
    private TextView P8;
    @m
    private rx.o Q;
    @l
    private final J Q8;
    @m
    private ViewGroup R8;
    @m
    private C X;
    @l
    private final kotlin.D Y;
    @m
    private g1 Z;
    private g0 w;
    @m
    private pl x;
    @m
    private Toolbar y;
    @m
    private f z;

    public c0() {
        @s0({"SMAP\nPostContainerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity$onBackPressedCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1926:1\n1#2:1927\n*E\n"})
        public static final class J extends OnBackPressedCallback {
            public final class com.dcinside.app.post.c0.J.a {
                public static final int[] a;

                static {
                    int[] arr_v = new int[o.values().length];
                    try {
                        arr_v[o.d.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[o.c.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    com.dcinside.app.post.c0.J.a.a = arr_v;
                }
            }

            final c0 d;

            J(c0 c00) {
                this.d = c00;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                if(this.d.c4()) {
                    c0.h4(this.d, true, false, 2, null);
                    return;
                }
                FragmentManager fragmentManager0 = this.d.getSupportFragmentManager();
                if(fragmentManager0.d1()) {
                    fragmentManager0 = null;
                }
                if(fragmentManager0 == null) {
                    return;
                }
                switch(this.d.E) {
                    case 1: {
                        N3 n31 = this.d.y3();
                        if(n31 != null && n31.w5()) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        N3 n32 = this.d.y3();
                        if(n32 != null) {
                            if(n32.w5()) {
                                return;
                            }
                            N3.Z4(n32, false, 1, null);
                            return;
                        }
                        V v1 = this.d.x3();
                        if(v1 != null) {
                            FragmentTransaction fragmentTransaction1 = fragmentManager0.u();
                            L.o(fragmentTransaction1, "beginTransaction(...)");
                            fragmentTransaction1.B(v1);
                            fragmentTransaction1.q();
                            this.d.v4();
                            return;
                        }
                        S0 s01 = this.d.w3();
                        if(s01 != null && s01.i3()) {
                            return;
                        }
                        break;
                    }
                    default: {
                        V v0 = this.d.x3();
                        if(v0 != null) {
                            FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
                            L.o(fragmentTransaction0, "beginTransaction(...)");
                            fragmentTransaction0.B(v0);
                            fragmentTransaction0.q();
                            return;
                        }
                        if(this.d.e4()) {
                            N3 n30 = this.d.y3();
                            if(n30 != null) {
                                if(n30.w5()) {
                                    return;
                                }
                                N3.Z4(n30, false, 1, null);
                                return;
                            }
                        }
                        S0 s00 = this.d.w3();
                        if(s00 != null && s00.i3()) {
                            return;
                        }
                    }
                }
                this.d.finish();
            }
        }


        public static final class X implements d {
            final c0 a;

            X(c0 c00) {
                this.a = c00;
                super();
            }

            @Override  // com.dcinside.app.post.view.DrawerLayout$d
            public void c(@l View view0, float f) {
                L.p(view0, "drawerView");
            }

            @Override  // com.dcinside.app.post.view.DrawerLayout$d
            public void o(int v, int v1) {
            }

            @Override  // com.dcinside.app.post.view.DrawerLayout$d
            public void onDrawerClosed(@l View view0) {
                L.p(view0, "drawerView");
            }

            @Override  // com.dcinside.app.post.view.DrawerLayout$d
            public void onDrawerOpened(@l View view0) {
                L.p(view0, "drawerView");
                S0 s00 = this.a.w3();
                if(s00 != null) {
                    s00.l3();
                }
            }
        }


        @s0({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
        public static final class Y extends N implements A3.a {
            final ComponentActivity e;

            public Y(ComponentActivity componentActivity0) {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final Factory b() {
                return this.e.getDefaultViewModelProviderFactory();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        @s0({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
        public static final class Z extends N implements A3.a {
            final ComponentActivity e;

            public Z(ComponentActivity componentActivity0) {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                return this.e.getViewModelStore();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        @s0({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
        public static final class a0 extends N implements A3.a {
            final A3.a e;
            final ComponentActivity f;

            public a0(A3.a a0, ComponentActivity componentActivity0) {
                this.e = a0;
                this.f = componentActivity0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                A3.a a0 = this.e;
                if(a0 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)a0.invoke();
                    return creationExtras0 == null ? this.f.getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return this.f.getDefaultViewModelCreationExtras();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        this.E = o.b;
        Y c0$Y0 = new Y(this);
        this.Y = new ViewModelLazy(m0.d(com.dcinside.app.post.fragments.N.class), new Z(this), c0$Y0, new a0(null, this));
        this.M8 = (g1 g10) -> {
            L.p(this, "this$0");
            L.m(g10);
            this.J4(g10);
        };
        this.N8 = new X(this);
        this.O8 = (SharedPreferences sharedPreferences0, String s) -> {
            L.p(this, "this$0");
            if(s != null) {
                switch(s) {
                    case "SwipeSensitivity": {
                        ((HackyDrawerLayout)this.findViewById(0x7F0B0A3C)).g0();  // id:post_container_slide_right
                        return;
                    }
                    case "readLogOption": {
                        S0 s00 = this.w3();
                        if(s00 != null) {
                            s00.C4();
                            return;
                        }
                        break;
                    }
                    case "spoilerWarnType": {
                        S0 s01 = this.w3();
                        if(s01 != null) {
                            S0.A4(s01, false, 1, null);
                            return;
                        }
                        break;
                    }
                }
            }
        };
        this.Q8 = new J(this);
    }

    private final String A3() {
        S0 s00 = this.w3();
        if(s00 != null) {
            Bundle bundle0 = s00.getArguments();
            return bundle0 == null ? null : bundle0.getString("com.dcinside.app.extra.GALLERY_ID");
        }
        return null;
    }

    private final void A4(I i0) {
        String s = i0.a();
        if(s == null) {
            return;
        }
        com.dcinside.app.rx.bus.I.a i$a0 = i0.b();
        new com.dcinside.app.util.Xk.a(s, i0.c(), 0, null, i$a0.c(this.E), false, i$a0.d(this.E), i$a0.b(), false, false, null, false, null, null, 0x3F2C, null).a(this);
        if(i$a0.a(this.E)) {
            this.finish();
        }
    }

    public final void A5() {
        static final class com.dcinside.app.post.c0.V extends N implements Function1 {
            public static final com.dcinside.app.post.c0.V e;

            static {
                com.dcinside.app.post.c0.V.e = new com.dcinside.app.post.c0.V();
            }

            com.dcinside.app.post.c0.V() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15095B);  // string:setting_apply_warn "변경 사항 중 재시작이 필요한 설정이 있습니다. 저장을 누르면 자동으로 앱이 재시작됩니다. 재시작하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class W extends N implements Function1 {
            final c0 e;

            W(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(Integer integer0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$showSettingChangedDialog$2$1", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.post.c0.W.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final c0 l;

                    com.dcinside.app.post.c0.W.a(c0 c00, kotlin.coroutines.d d0) {
                        this.l = c00;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.post.c0.W.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((kotlinx.coroutines.O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l kotlinx.coroutines.O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.post.c0.W.a)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        gl.c(this.l);
                        this.l.recreate();
                        return kotlin.S0.a;
                    }
                }

                if(integer0 != null && ((int)integer0) == -1) {
                    k.f(LifecycleOwnerKt.a(this.e), kotlinx.coroutines.h0.e(), null, new com.dcinside.app.post.c0.W.a(this.e, null), 2, null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return kotlin.S0.a;
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.post.c0.V.e).z(0x7F1508E1).x(0x1040000).d().x5((Object object0) -> {
            L.p(new W(this), "$tmp0");
            new W(this).invoke(object0);
        });
    }

    private final com.dcinside.app.post.fragments.N B3() {
        return (com.dcinside.app.post.fragments.N)this.Y.getValue();
    }

    private final void B4(com.dcinside.app.rx.bus.J j0) {
        V v0 = this.x3();
        if(v0 == null) {
            return;
        }
        FragmentTransaction fragmentTransaction0 = this.getSupportFragmentManager().u();
        L.o(fragmentTransaction0, "beginTransaction(...)");
        fragmentTransaction0.B(v0);
        fragmentTransaction0.q();
    }

    // 检测为 Lambda 实现
    private static final void B5(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.post.h0
    public void C(@l K0 k00) {
        L.p(k00, "helper");
        if(k00.c()) {
            this.k3();
            return;
        }
        this.j3();
    }

    @m
    public final TextView C3() {
        return this.P8;
    }

    private final void C4(S s0) {
        if(this.getSupportFragmentManager().d1()) {
            return;
        }
        String s1 = s0.a();
        String s2 = this.A3();
        if(s2 == null) {
            s2 = s1;
        }
        Bundle bundle0 = BundleKt.b(new kotlin.V[]{r0.a("com.dcinside.app.extra.VISIT_GALLERY_ID", s2), r0.a("com.dcinside.app.extra.SEARCH_GALLERY_ID", s1), r0.a("com.dcinside.app.extra.IN_CONTAINER", Boolean.TRUE), r0.a("com.dcinside.app.extra.POST_CONTAINER_INSET", this.H)});
        if(s0.c() != null) {
            bundle0.putString("com.dcinside.app.extra.LAST_TEXT", s0.b());
            bundle0.putInt("com.dcinside.app.extra.LAST_TYPE", s0.c().ordinal());
        }
        if(this.E == o.d) {
            Intent intent0 = new Intent(this, PostSearchActivity.class);
            intent0.putExtras(bundle0);
            intent0.setFlags(0x4000000);
            this.startActivity(intent0);
            return;
        }
        V v0 = this.x3();
        if(v0 instanceof com.dcinside.app.post.S0) {
            ((com.dcinside.app.post.S0)v0).r1(bundle0);
            return;
        }
        com.dcinside.app.post.S0 s00 = new com.dcinside.app.post.S0();
        s00.setArguments(bundle0);
        this.n3(s00);
    }

    public final void C5(@l String s, int v, @m A3.a a0) {
        L.p(s, "message");
        if(s.length() == 0) {
            return;
        }
        if(this.G != null && this.G.isShowing()) {
            return;
        }
        AlertDialog alertDialog0 = new Builder(this).l(Dl.c(s)).setPositiveButton(0x7F15034A, (DialogInterface dialogInterface0, int v) -> if(a0 != null) {
            a0.invoke();
        }).create();
        this.G = alertDialog0;
        if(alertDialog0 != null) {
            Window window0 = alertDialog0.getWindow();
            if(window0 != null) {
                window0.setGravity(17);
                WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                if(windowManager$LayoutParams0 != null) {
                    windowManager$LayoutParams0.y = -v;
                }
                window0.setAttributes(windowManager$LayoutParams0);
            }
        }
        AlertDialog alertDialog1 = this.G;
        if(alertDialog1 != null) {
            alertDialog1.show();
        }
    }

    public final void D3(int v) {
        switch(v) {
            case 0: {
                this.q5(0);
                return;
            }
            case 1: {
                this.q5(1);
            }
        }
    }

    private final void D4(d0 d00) {
        N3 n30 = this.y3();
        if(n30 != null) {
            n30.n8(d00.a());
        }
    }

    // 检测为 Lambda 实现
    private static final void D5(A3.a a0, DialogInterface dialogInterface0, int v) [...]

    @SuppressLint({"ClickableViewAccessibility"})
    private final void E3() {
        static final class A extends N implements Function1 {
            final c0 e;

            A(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(K k0) {
                L.m(k0);
                this.e.p4(k0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((K)object0));
                return kotlin.S0.a;
            }
        }


        static final class B extends N implements Function1 {
            final c0 e;

            B(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(I i0) {
                L.m(i0);
                this.e.A4(i0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((I)object0));
                return kotlin.S0.a;
            }
        }


        static final class com.dcinside.app.post.c0.C extends N implements Function1 {
            final c0 e;

            com.dcinside.app.post.c0.C(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(S s0) {
                L.m(s0);
                this.e.C4(s0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((S)object0));
                return kotlin.S0.a;
            }
        }


        static final class com.dcinside.app.post.c0.D extends N implements Function1 {
            final c0 e;

            com.dcinside.app.post.c0.D(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.Z z0) {
                L.m(z0);
                this.e.G4(z0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.Z)object0));
                return kotlin.S0.a;
            }
        }


        static final class E extends N implements Function1 {
            final c0 e;

            E(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.J j0) {
                L.m(j0);
                this.e.B4(j0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.J)object0));
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$10", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1204#2:337\n*E\n"})
        public static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public c(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                c c0$c0 = new c(d0, this.m);
                c0$c0.l = view0;
                return c0$c0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.V4();
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$11", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1205#2:337\n*E\n"})
        public static final class com.dcinside.app.post.c0.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public com.dcinside.app.post.c0.d(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.post.c0.d c0$d0 = new com.dcinside.app.post.c0.d(d0, this.m);
                c0$d0.l = view0;
                return c0$d0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.Q4();
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$12", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1206#2:337\n*E\n"})
        public static final class com.dcinside.app.post.c0.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public com.dcinside.app.post.c0.e(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.post.c0.e c0$e0 = new com.dcinside.app.post.c0.e(d0, this.m);
                c0$e0.l = view0;
                return c0$e0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.R4();
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$13", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1207#2:337\n*E\n"})
        public static final class com.dcinside.app.post.c0.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public com.dcinside.app.post.c0.f(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.post.c0.f c0$f0 = new com.dcinside.app.post.c0.f(d0, this.m);
                c0$f0.l = view0;
                return c0$f0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.N4();
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$14", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1208#2:337\n*E\n"})
        public static final class com.dcinside.app.post.c0.g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public com.dcinside.app.post.c0.g(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.post.c0.g c0$g0 = new com.dcinside.app.post.c0.g(d0, this.m);
                c0$g0.l = view0;
                return c0$g0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.b5();
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$15", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1209#2:337\n*E\n"})
        public static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public h(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                h c0$h0 = new h(d0, this.m);
                c0$h0.l = view0;
                return c0$h0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.X4();
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$16", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1210#2:337\n*E\n"})
        public static final class i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public i(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                i c0$i0 = new i(d0, this.m);
                c0$i0.l = view0;
                return c0$i0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.U4();
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$1", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1190#2:337\n*E\n"})
        public static final class j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public j(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                j c0$j0 = new j(d0, this.m);
                c0$j0.l = view0;
                return c0$j0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.T4();
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$2", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1191#2:337\n*E\n"})
        public static final class com.dcinside.app.post.c0.k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public com.dcinside.app.post.c0.k(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.post.c0.k c0$k0 = new com.dcinside.app.post.c0.k(d0, this.m);
                c0$k0.l = view0;
                return c0$k0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.S4();
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$3", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1192#2:337\n*E\n"})
        public static final class com.dcinside.app.post.c0.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public com.dcinside.app.post.c0.l(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.post.c0.l c0$l0 = new com.dcinside.app.post.c0.l(d0, this.m);
                c0$l0.l = view0;
                return c0$l0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.M4(com.dcinside.app.type.m.g);
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$4", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1193#2:337\n*E\n"})
        public static final class com.dcinside.app.post.c0.m extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public com.dcinside.app.post.c0.m(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.post.c0.m c0$m0 = new com.dcinside.app.post.c0.m(d0, this.m);
                c0$m0.l = view0;
                return c0$m0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.M4(com.dcinside.app.type.m.g);
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$5", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1194#2:337\n*E\n"})
        public static final class com.dcinside.app.post.c0.n extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public com.dcinside.app.post.c0.n(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.post.c0.n c0$n0 = new com.dcinside.app.post.c0.n(d0, this.m);
                c0$n0.l = view0;
                return c0$n0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.M4(com.dcinside.app.type.m.h);
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$6", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1195#2:337\n*E\n"})
        public static final class com.dcinside.app.post.c0.o extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public com.dcinside.app.post.c0.o(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.post.c0.o c0$o0 = new com.dcinside.app.post.c0.o(d0, this.m);
                c0$o0.l = view0;
                return c0$o0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.M4(com.dcinside.app.type.m.i);
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$7", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1196#2:337\n*E\n"})
        public static final class com.dcinside.app.post.c0.p extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public com.dcinside.app.post.c0.p(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.post.c0.p c0$p0 = new com.dcinside.app.post.c0.p(d0, this.m);
                c0$p0.l = view0;
                return c0$p0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.M4(com.dcinside.app.type.m.j);
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$8", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1199#2:337\n*E\n"})
        public static final class q extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public q(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                q c0$q0 = new q(d0, this.m);
                c0$q0.l = view0;
                return c0$q0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.O4(((View)this.l));
                return kotlin.S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$initCallbacks$$inlined$applyClicks$9", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n+ 2 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity\n*L\n1#1,336:1\n1203#2:337\n*E\n"})
        public static final class r extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final c0 m;

            public r(kotlin.coroutines.d d0, c0 c00) {
                this.m = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l kotlinx.coroutines.O o0, @l View view0, @m kotlin.coroutines.d d0) {
                r c0$r0 = new r(d0, this.m);
                c0$r0.l = view0;
                return c0$r0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.L4(((View)this.l));
                return kotlin.S0.a;
            }
        }


        static final class s extends N implements Function1 {
            final c0 e;

            s(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.V v0) {
                L.m(v0);
                this.e.E4(v0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.V)object0));
                return kotlin.S0.a;
            }
        }


        static final class t extends N implements Function1 {
            final c0 e;

            t(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.W w0) {
                L.m(w0);
                this.e.F4(w0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.W)object0));
                return kotlin.S0.a;
            }
        }


        static final class u extends N implements Function1 {
            final c0 e;

            u(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(d0 d00) {
                L.m(d00);
                this.e.D4(d00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((d0)object0));
                return kotlin.S0.a;
            }
        }


        static final class com.dcinside.app.post.c0.v extends N implements Function1 {
            final c0 e;

            com.dcinside.app.post.c0.v(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.i i0) {
                L.m(i0);
                this.e.H4(i0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.i)object0));
                return kotlin.S0.a;
            }
        }


        static final class w extends N implements Function1 {
            final c0 e;

            w(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.k k0) {
                L.m(k0);
                this.e.z4(k0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.k)object0));
                return kotlin.S0.a;
            }
        }


        static final class x extends N implements Function1 {
            final c0 e;

            x(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(w0 w00) {
                L.m(w00);
                this.e.I4(w00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((w0)object0));
                return kotlin.S0.a;
            }
        }


        static final class y extends N implements Function1 {
            final c0 e;

            y(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.j j0) {
                this.e.y4();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.j)object0));
                return kotlin.S0.a;
            }
        }


        static final class z extends N implements Function1 {
            final c0 e;

            z(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(U u0) {
                L.m(u0);
                this.e.a5(u0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((U)object0));
                return kotlin.S0.a;
            }
        }

        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x1020002);
        this.D = new x0((viewGroup0 == null ? null : viewGroup0.getChildAt(0)));
        rx.o o0 = com.dcinside.app.rx.bus.c.c(this, w0.class).x5((Object object0) -> {
            L.p(new x(this), "$tmp0");
            new x(this).invoke(object0);
        });
        b b0 = this.F;
        if(b0 != null) {
            b0.a(o0);
        }
        rx.o o1 = com.dcinside.app.rx.bus.c.c(this, I.class).x5((Object object0) -> {
            L.p(new B(this), "$tmp0");
            new B(this).invoke(object0);
        });
        b b1 = this.F;
        if(b1 != null) {
            b1.a(o1);
        }
        rx.o o2 = com.dcinside.app.rx.bus.c.c(this, S.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.post.c0.C(this), "$tmp0");
            new com.dcinside.app.post.c0.C(this).invoke(object0);
        });
        b b2 = this.F;
        if(b2 != null) {
            b2.a(o2);
        }
        rx.o o3 = com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.Z.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.post.c0.D(this), "$tmp0");
            new com.dcinside.app.post.c0.D(this).invoke(object0);
        });
        b b3 = this.F;
        if(b3 != null) {
            b3.a(o3);
        }
        rx.o o4 = com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.J.class).x5((Object object0) -> {
            L.p(new E(this), "$tmp0");
            new E(this).invoke(object0);
        });
        b b4 = this.F;
        if(b4 != null) {
            b4.a(o4);
        }
        rx.o o5 = com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.V.class).x5((Object object0) -> {
            L.p(new s(this), "$tmp0");
            new s(this).invoke(object0);
        });
        b b5 = this.F;
        if(b5 != null) {
            b5.a(o5);
        }
        rx.o o6 = com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.W.class).x5((Object object0) -> {
            L.p(new t(this), "$tmp0");
            new t(this).invoke(object0);
        });
        b b6 = this.F;
        if(b6 != null) {
            b6.a(o6);
        }
        rx.o o7 = com.dcinside.app.rx.bus.c.c(this, d0.class).x5((Object object0) -> {
            L.p(new u(this), "$tmp0");
            new u(this).invoke(object0);
        });
        b b7 = this.F;
        if(b7 != null) {
            b7.a(o7);
        }
        rx.o o8 = com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.i.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.post.c0.v(this), "$tmp0");
            new com.dcinside.app.post.c0.v(this).invoke(object0);
        });
        b b8 = this.F;
        if(b8 != null) {
            b8.a(o8);
        }
        rx.o o9 = com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.k.class).x5((Object object0) -> {
            L.p(new w(this), "$tmp0");
            new w(this).invoke(object0);
        });
        b b9 = this.F;
        if(b9 != null) {
            b9.a(o9);
        }
        rx.o o10 = com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.j.class).x5((Object object0) -> {
            L.p(new y(this), "$tmp0");
            new y(this).invoke(object0);
        });
        b b10 = this.F;
        if(b10 != null) {
            b10.a(o10);
        }
        rx.o o11 = com.dcinside.app.rx.bus.c.c(this, U.class).x5((Object object0) -> {
            L.p(new z(this), "$tmp0");
            new z(this).invoke(object0);
        });
        b b11 = this.F;
        if(b11 != null) {
            b11.a(o11);
        }
        rx.o o12 = com.dcinside.app.rx.bus.c.c(this, K.class).w1(1L, TimeUnit.SECONDS).x5((Object object0) -> {
            L.p(new A(this), "$tmp0");
            new A(this).invoke(object0);
        });
        b b12 = this.F;
        if(b12 != null) {
            b12.a(o12);
        }
        F0 f00 = this.F1();
        g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        g00.g().N.r(f00);
        g0 g01 = this.w;
        if(g01 == null) {
            L.S("binding");
            g01 = null;
        }
        g01.g().M.o(f00);
        g0 g02 = this.w;
        if(g02 == null) {
            L.S("binding");
            g02 = null;
        }
        g02.g().L.v(f00);
        c0 c00 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c00 != null) {
            ArrayList arrayList0 = new ArrayList(1);
            arrayList0.add(c00.findViewById(0x7F0B0760));  // id:main_menu_history
            for(Object object0: arrayList0) {
                L.m(((View)object0));
                com.dcinside.app.internal.r.M(((View)object0), null, new j(null, this), 1, null);
            }
        }
        c0 c01 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c01 != null) {
            ArrayList arrayList1 = new ArrayList(1);
            arrayList1.add(c01.findViewById(0x7F0B075C));  // id:main_menu_archive
            for(Object object1: arrayList1) {
                L.m(((View)object1));
                com.dcinside.app.internal.r.M(((View)object1), null, new com.dcinside.app.post.c0.k(null, this), 1, null);
            }
        }
        c0 c02 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c02 != null) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(c02.findViewById(0x7F0B075E));  // id:main_menu_galleries
            for(Object object2: arrayList2) {
                L.m(((View)object2));
                com.dcinside.app.internal.r.M(((View)object2), null, new com.dcinside.app.post.c0.l(null, this), 1, null);
            }
        }
        c0 c03 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c03 != null) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(c03.findViewById(0x7F0B0819));  // id:menu_main_gall
            for(Object object3: arrayList3) {
                L.m(((View)object3));
                com.dcinside.app.internal.r.M(((View)object3), null, new com.dcinside.app.post.c0.m(null, this), 1, null);
            }
        }
        c0 c04 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c04 != null) {
            ArrayList arrayList4 = new ArrayList(1);
            arrayList4.add(c04.findViewById(0x7F0B081F));  // id:menu_minor_gall
            for(Object object4: arrayList4) {
                L.m(((View)object4));
                com.dcinside.app.internal.r.M(((View)object4), null, new com.dcinside.app.post.c0.n(null, this), 1, null);
            }
        }
        c0 c05 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c05 != null) {
            ArrayList arrayList5 = new ArrayList(1);
            arrayList5.add(c05.findViewById(0x7F0B081C));  // id:menu_mini_gall
            for(Object object5: arrayList5) {
                L.m(((View)object5));
                com.dcinside.app.internal.r.M(((View)object5), null, new com.dcinside.app.post.c0.o(null, this), 1, null);
            }
        }
        c0 c06 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c06 != null) {
            ArrayList arrayList6 = new ArrayList(1);
            arrayList6.add(c06.findViewById(0x7F0B0826));  // id:menu_person_gall
            for(Object object6: arrayList6) {
                L.m(((View)object6));
                com.dcinside.app.internal.r.M(((View)object6), null, new com.dcinside.app.post.c0.p(null, this), 1, null);
            }
        }
        c0 c07 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c07 != null) {
            ArrayList arrayList7 = new ArrayList(4);
            for(int v = 0; v < 4; ++v) {
                arrayList7.add(c07.findViewById(new int[]{0x7F0B0301, 0x7F0B0302, 0x7F0B0303, 0x7F0B0304}[v]));  // id:copyright_term2
            }
            for(Object object7: arrayList7) {
                L.m(((View)object7));
                com.dcinside.app.internal.r.M(((View)object7), null, new q(null, this), 1, null);
            }
        }
        c0 c08 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c08 != null) {
            ArrayList arrayList8 = new ArrayList(4);
            for(int v1 = 0; v1 < 4; ++v1) {
                arrayList8.add(c08.findViewById(new int[]{0x7F0B0761, 0x7F0B0086, 0x7F0B0087, 0x7F0B0088}[v1]));  // id:main_menu_tip
            }
            for(Object object8: arrayList8) {
                L.m(((View)object8));
                com.dcinside.app.internal.r.M(((View)object8), null, new r(null, this), 1, null);
            }
        }
        c0 c09 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c09 != null) {
            ArrayList arrayList9 = new ArrayList(2);
            for(int v2 = 0; v2 < 2; ++v2) {
                arrayList9.add(c09.findViewById(new int[]{0x7F0B075D, 0x7F0B1037}[v2]));  // id:main_menu_config
            }
            for(Object object9: arrayList9) {
                L.m(((View)object9));
                com.dcinside.app.internal.r.M(((View)object9), null, new c(null, this), 1, null);
            }
        }
        c0 c010 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c010 != null) {
            ArrayList arrayList10 = new ArrayList(1);
            arrayList10.add(c010.findViewById(0x7F0B0300));  // id:copyright_term1
            for(Object object10: arrayList10) {
                L.m(((View)object10));
                com.dcinside.app.internal.r.M(((View)object10), null, new com.dcinside.app.post.c0.d(null, this), 1, null);
            }
        }
        c0 c011 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c011 != null) {
            ArrayList arrayList11 = new ArrayList(1);
            arrayList11.add(c011.findViewById(0x7F0B02FF));  // id:copyright_pc
            for(Object object11: arrayList11) {
                L.m(((View)object11));
                com.dcinside.app.internal.r.M(((View)object11), null, new com.dcinside.app.post.c0.e(null, this), 1, null);
            }
        }
        c0 c012 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c012 != null) {
            ArrayList arrayList12 = new ArrayList(1);
            arrayList12.add(c012.findViewById(0x7F0B1000));  // id:user_logo
            for(Object object12: arrayList12) {
                L.m(((View)object12));
                com.dcinside.app.internal.r.M(((View)object12), null, new com.dcinside.app.post.c0.f(null, this), 1, null);
            }
        }
        c0 c013 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c013 != null) {
            ArrayList arrayList13 = new ArrayList(1);
            arrayList13.add(c013.findViewById(0x7F0B0FFA));  // id:user_dark_icon
            for(Object object13: arrayList13) {
                L.m(((View)object13));
                com.dcinside.app.internal.r.M(((View)object13), null, new com.dcinside.app.post.c0.g(null, this), 1, null);
            }
        }
        c0 c014 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c014 != null) {
            ArrayList arrayList14 = new ArrayList(1);
            arrayList14.add(c014.findViewById(0x7F0B075F));  // id:main_menu_gallery_status
            for(Object object14: arrayList14) {
                L.m(((View)object14));
                com.dcinside.app.internal.r.M(((View)object14), null, new h(null, this), 1, null);
            }
        }
        c0 c015 = com.dcinside.app.internal.c.o(this) ? null : this;
        if(c015 != null) {
            ArrayList arrayList15 = new ArrayList(1);
            arrayList15.add(c015.findViewById(0x7F0B1034));  // id:user_notification_push
            for(Object object15: arrayList15) {
                L.m(((View)object15));
                com.dcinside.app.internal.r.M(((View)object15), null, new i(null, this), 1, null);
            }
        }
        ViewGroup viewGroup1 = this.K;
        if(viewGroup1 != null) {
            viewGroup1.setOnHierarchyChangeListener(this);
        }
        ViewGroup viewGroup2 = this.L;
        if(viewGroup2 != null) {
            viewGroup2.setOnHierarchyChangeListener(this);
        }
        ViewGroup viewGroup3 = this.J;
        if(viewGroup3 != null) {
            viewGroup3.setOnHierarchyChangeListener(this);
        }
        if(this.E == o.d) {
            ViewGroup viewGroup4 = this.I;
            if(viewGroup4 != null) {
                viewGroup4.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    view0.setOnTouchListener(null);
                    this.finish();
                    return false;
                });
            }
        }
    }

    private final void E4(com.dcinside.app.rx.bus.V v0) {
        switch(this.E) {
            case 1: {
                this.p5();
                break;
            }
            case 2: {
                this.finish();
                return;
            label_4:
                c0.n5(this, true, false, 2, null);
                if(!v0.c()) {
                    this.p5();
                    return;
                }
                break;
            }
            default: {
                goto label_4;
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void E5(c0 c00, g1 g10) [...]

    // 检测为 Lambda 实现
    private static final void F3(Function1 function10, Object object0) [...]

    private final void F4(com.dcinside.app.rx.bus.W w0) {
        S0 s00 = this.w3();
        if(s00 != null) {
            s00.U3(w0);
        }
        V v0 = this.x3();
        com.dcinside.app.post.S0 s01 = v0 instanceof com.dcinside.app.post.S0 ? ((com.dcinside.app.post.S0)v0) : null;
        if(s01 != null) {
            s01.N1(w0);
        }
        N3 n30 = this.y3();
        if(n30 != null) {
            n30.Z6(w0);
        }
    }

    // 检测为 Lambda 实现
    private static final void G3(Function1 function10, Object object0) [...]

    private final void G4(com.dcinside.app.rx.bus.Z z0) {
        this.j3();
    }

    // 检测为 Lambda 实现
    private static final void H3(Function1 function10, Object object0) [...]

    private final void H4(com.dcinside.app.rx.bus.i i0) {
        com.dcinside.app.post.fragments.g g1;
        if(!this.isDestroyed() && !this.isFinishing()) {
            String s = i0.b();
            String s1 = i0.a();
            com.dcinside.app.post.fragments.g g0 = this.N;
            if(g0 != null) {
                g0.dismissAllowingStateLoss();
            }
            try {
                kotlin.V[] arr_v = {r0.a("vpnBanMessage", s), r0.a("vpnBanGalleryId", s1)};
                FragmentManager fragmentManager0 = this.getSupportFragmentManager();
                L.o(fragmentManager0, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                ClassLoader classLoader0 = com.dcinside.app.post.fragments.g.class.getClassLoader();
                L.m(classLoader0);
                Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.post.fragments.g");
                if(fragment0 == null) {
                    g1 = null;
                }
                else {
                    g1 = (com.dcinside.app.post.fragments.g)fragment0;
                    g1.setArguments(BundleKt.b(((kotlin.V[])Arrays.copyOf(arr_v, 2))));
                    g1.show(fragmentManager0, "com.dcinside.app.post.fragments.g");
                }
            }
            catch(Exception unused_ex) {
                g1 = null;
                this.N = g1;
                return;
            }
            this.N = g1;
        }
    }

    // 检测为 Lambda 实现
    private static final void I3(Function1 function10, Object object0) [...]

    private final void I4(w0 w00) {
        this.k1().M(w00);
    }

    // 检测为 Lambda 实现
    private static final void J3(Function1 function10, Object object0) [...]

    private final void J4(g1 g10) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$onChangeUser$1", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.c0.K extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final c0 l;

            com.dcinside.app.post.c0.K(c0 c00, kotlin.coroutines.d d0) {
                this.l = c00;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.c0.K(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((kotlinx.coroutines.O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l kotlinx.coroutines.O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.post.c0.K)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                S0 s00 = this.l.w3();
                if(s00 != null) {
                    s00.W3();
                }
                N3 n30 = this.l.y3();
                if(n30 != null) {
                    n30.j7();
                }
                return kotlin.S0.a;
            }
        }

        k.f(LifecycleOwnerKt.a(this), kotlinx.coroutines.h0.e(), null, new com.dcinside.app.post.c0.K(this, null), 2, null);
    }

    // 检测为 Lambda 实现
    private static final void K3(Function1 function10, Object object0) [...]

    private final void K4() {
        Dl.B(this);
    }

    @Override  // com.dcinside.app.wv.s$a
    @m
    public AppCompatActivity L() {
        return this;
    }

    // 检测为 Lambda 实现
    private static final void L3(Function1 function10, Object object0) [...]

    private final void L4(View view0) {
        Object object0 = view0.getTag();
        L.n(object0, "null cannot be cast to non-null type kotlin.String");
        com.dcinside.app.main.a.i(this, ((String)object0));
    }

    // 检测为 Lambda 实现
    private static final void M3(Function1 function10, Object object0) [...]

    private final void M4(com.dcinside.app.type.m m0) {
        CategoryHotActivity.y.a(this, m0);
    }

    // 检测为 Lambda 实现
    private static final void N3(Function1 function10, Object object0) [...]

    private final void N4() {
        Xk.h(this, null, null, 6, null);
    }

    // 检测为 Lambda 实现
    private static final void O3(Function1 function10, Object object0) [...]

    private final void O4(View view0) {
        Object object0 = view0.getTag();
        L.n(object0, "null cannot be cast to non-null type kotlin.String");
        com.dcinside.app.main.a.j(this, ((String)object0));
    }

    // 检测为 Lambda 实现
    private static final void P3(Function1 function10, Object object0) [...]

    private final void P4() {
        if(this.j4() == 1) {
            this.onBackPressed();
            return;
        }
        if(this.c4()) {
            c0.h4(this, true, false, 2, null);
            return;
        }
        c0.m4(this, true, false, 2, null);
    }

    // 检测为 Lambda 实现
    private static final void Q3(Function1 function10, Object object0) [...]

    private final void Q4() {
        Xk.i(this, "know");
    }

    // 检测为 Lambda 实现
    private static final void R3(Function1 function10, Object object0) [...]

    private final void R4() {
        String s = this.A3();
        if(s == null) {
            return;
        }
        com.dcinside.app.browser.AwesomeWebView.Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(this);
        if(awesomeWebView$Builder0 == null) {
            return;
        }
        com.dcinside.app.browser.AwesomeWebView.Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.J6(true).s7("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        String s1 = uk.VG(s, com.dcinside.app.type.m.d.b(s));
        L.o(s1, "url(...)");
        awesomeWebView$Builder1.y5(s1);
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void S0(@m Toolbar toolbar0) {
        super.S0(toolbar0);
        this.y = toolbar0;
        kr.bhbfhfb.designcompat.a.d(this);
        pl pl0 = this.x;
        if(pl0 != null) {
            pl0.release();
        }
        g0 g00 = this.w;
        g0 g01 = null;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        this.x = pl.s(g00.f(), toolbar0).w(new com.dcinside.app.util.pl.d(this.L));
        g0 g02 = this.w;
        if(g02 == null) {
            L.S("binding");
            g02 = null;
        }
        HackyDrawerLayout hackyDrawerLayout0 = g02.f();
        hackyDrawerLayout0.Q(this.N8);
        hackyDrawerLayout0.a(this.N8);
        g0 g03 = this.w;
        if(g03 == null) {
            L.S("binding");
        }
        else {
            g01 = g03;
        }
        HackyDrawerLayout hackyDrawerLayout1 = g01.j();
        hackyDrawerLayout1.Q(this);
        hackyDrawerLayout1.a(this);
        if(toolbar0 != null) {
            toolbar0.setNavigationOnClickListener((View view0) -> {
                L.p(this, "this$0");
                this.P4();
            });
        }
    }

    // 检测为 Lambda 实现
    private static final boolean S3(c0 c00, View view0, MotionEvent motionEvent0) [...]

    private final void S4() {
        this.startActivity(new Intent(this, ArchiveMainActivity.class));
    }

    private final void T3(Bundle bundle0, Intent intent0, boolean z) {
        g0 g00 = null;
        if(bundle0 == null) {
            Bundle bundle1 = intent0.getExtras();
            if(bundle1 == null) {
                bundle1 = BundleKt.a();
            }
            L.m(bundle1);
            switch(this.E) {
                case 1: {
                    this.l3(bundle1);
                    c0.p3(this, bundle1, false, 2, null);
                    return;
                }
                case 2: {
                    goto label_11;
                }
                case 3: {
                    goto label_20;
                }
            }
            return;
        label_11:
            S0 s00 = this.w3();
            if(s00 != null) {
                FragmentTransaction fragmentTransaction0 = this.getSupportFragmentManager().u();
                L.o(fragmentTransaction0, "beginTransaction(...)");
                fragmentTransaction0.B(s00);
                fragmentTransaction0.q();
            }
            c0.p3(this, bundle1, false, 2, null);
            c0.s5(this, false, false, 3, null);
            return;
        label_20:
            this.l3(bundle1);
            c0.p3(this, bundle1, false, 2, null);
            if(z) {
                c0.s5(this, true, false, 2, null);
            }
        }
        else {
            int v = com.dcinside.app.post.c0.a.a[this.E.ordinal()];
            if(v == 1) {
                int v1 = bundle0.getInt("com.dcinside.app.extra.GALLERY_MODE", -1);
                o o0 = o.a.a(v1);
                if(o0 == null) {
                    o0 = o.b;
                }
                if(o0 == o.d) {
                    Bundle bundle2 = intent0.getExtras();
                    if(bundle2 != null && !bundle2.isEmpty()) {
                        g00 = bundle2;
                    }
                    if(g00 != null) {
                        this.l3(((Bundle)g00));
                    }
                }
            }
            else {
                switch(v) {
                    case 2: {
                        goto label_29;
                    }
                    case 3: {
                        goto label_36;
                    }
                }
                return;
            label_29:
                g0 g01 = this.w;
                if(g01 == null) {
                    L.S("binding");
                }
                else {
                    g00 = g01;
                }
                g00.j().post(() -> {
                    L.p(this, "this$0");
                    c0.s5(this, false, false, 3, null);
                });
                return;
            label_36:
                if(this.x3() == null && z) {
                    g0 g02 = this.w;
                    if(g02 == null) {
                        L.S("binding");
                    }
                    else {
                        g00 = g02;
                    }
                    g00.j().post(() -> {
                        L.p(this, "this$0");
                        c0.s5(this, false, false, 3, null);
                    });
                }
            }
        }
    }

    private final void T4() {
        if(Application.e.f().o()) {
            Dl.D(this, 0x7F15045D);  // string:history_delete_running "최근 본 글 정리중입니다. 잠시 후 다시 시도해주세요."
            return;
        }
        this.startActivity(new Intent(this, PostHistoryActivity.class));
    }

    // 检测为 Lambda 实现
    private static final void U3(c0 c00) [...]

    private final void U4() {
        PushNoticeListActivity.D.a(this);
    }

    // 检测为 Lambda 实现
    private static final void V3(c0 c00) [...]

    private final void V4() {
        this.startActivityForResult(new Intent(this, SettingActivity.class), 1007);
    }

    private final void W3(Bundle bundle0, Intent intent0) {
        o o0;
        if(bundle0 == null) {
            o0 = null;
        }
        else {
            int v = bundle0.getInt("com.dcinside.app.extra.GALLERY_MODE", -1);
            o0 = o.a.a(v);
            if(o0 == null) {
                o0 = o.b;
            }
        }
        int v1 = intent0.getIntExtra("com.dcinside.app.extra.GALLERY_MODE", -1);
        boolean z = intent0.getBooleanExtra("com.dcinside.app.extra.PUSH_ALERT_TOUCHED", false);
        int v2 = intent0.getIntExtra("com.dcinside.app.extra.POST_NUMBER", 0);
        o o1 = o.a.a(v1);
        if(o1 == null) {
            if(Al.a.v(this)) {
                o1 = o.c;
            }
            else {
                o1 = z || v2 <= 0 ? o.b : o.d;
            }
        }
        if(o0 != null && (com.dcinside.app.post.c0.a.a[o0.ordinal()] == 1 && com.dcinside.app.post.c0.a.a[o1.ordinal()] == 2)) {
            o1 = o.b;
        }
        this.E = o1;
    }

    private final void W4(Bundle bundle0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$onFcmChecker$1", f = "PostContainerActivity.kt", i = {}, l = {0x6C3}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.c0.O extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final Bundle l;
            final c0 m;

            com.dcinside.app.post.c0.O(Bundle bundle0, c0 c00, kotlin.coroutines.d d0) {
                this.l = bundle0;
                this.m = c00;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.c0.O(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((kotlinx.coroutines.O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l kotlinx.coroutines.O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.post.c0.O)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$onFcmChecker$1$1", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.post.c0.O.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final c0 l;
                    final Intent m;

                    com.dcinside.app.post.c0.O.a(c0 c00, Intent intent0, kotlin.coroutines.d d0) {
                        this.l = c00;
                        this.m = intent0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.post.c0.O.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((kotlinx.coroutines.O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l kotlinx.coroutines.O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.post.c0.O.a)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.C = true;
                        this.l.sendBroadcast(this.m);
                        return kotlin.S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        if(this.l != null && this.l.getBoolean("com.dcinside.app.extra.PUSH_ALERT_TOUCHED", false)) {
                            String s = this.l.getString("com.dcinside.app.extra.GALLERY_ID");
                            if(s == null) {
                                return kotlin.S0.a;
                            }
                            if(s.length() == 0) {
                                return kotlin.S0.a;
                            }
                            Intent intent0 = new Intent(this.m, NotificationDeleteReceiver.class).setAction("com.dcinside.app.action.POST_REPLIED").putExtras(this.l);
                            L.o(intent0, "putExtras(...)");
                            com.dcinside.app.post.c0.O.a c0$O$a0 = new com.dcinside.app.post.c0.O.a(this.m, intent0, null);
                            this.k = 1;
                            return kotlinx.coroutines.i.h(kotlinx.coroutines.h0.e(), c0$O$a0, this) == object1 ? object1 : kotlin.S0.a;
                        }
                        return kotlin.S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return kotlin.S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        k.f(LifecycleOwnerKt.a(this), kotlinx.coroutines.h0.a(), null, new com.dcinside.app.post.c0.O(bundle0, this, null), 2, null);
    }

    private final void X3() {
        static final class F extends N implements Function1 {
            final c0 e;

            F(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(Boolean boolean0) {
                Boolean boolean1 = (Boolean)this.e.B3().q().f();
                if(boolean1 == null) {
                    boolean1 = Boolean.FALSE;
                }
                L.m(boolean0);
                if(boolean0.booleanValue() && !boolean1.booleanValue()) {
                    this.e.z5();
                    return;
                }
                this.e.g5();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return kotlin.S0.a;
            }
        }

        Transformations.a(this.B3().o()).k(this, new T(new F(this)));
    }

    private final void X4() {
        static final class P extends N implements Function1 {
            public static final P e;

            static {
                P.e = new P();
            }

            P() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.m(0x7F150517);  // string:join_mini_need_login "로그인이 필요합니다. 로그인하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class Q extends N implements Function1 {
            public static final Q e;

            static {
                Q.e = new Q();
            }

            Q() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class R extends N implements Function1 {
            final c0 e;

            R(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.q4();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return kotlin.S0.a;
            }
        }

        String s = com.dcinside.app.realm.B.E.k0();
        if(m0.a.a.h(s)) {
            com.dcinside.app.perform.e.e.a(this).n(P.e).z(0x7F15034A).x(0x7F1509CD).b().Z1((Object object0) -> {
                L.p(Q.e, "$tmp0");
                return (Boolean)Q.e.invoke(object0);
            }).x5((Object object0) -> {
                L.p(new R(this), "$tmp0");
                new R(this).invoke(object0);
            });
            return;
        }
        MyGalleryStatusActivity.A.a(this);
    }

    private final void Y3() {
        this.L = (ViewGroup)this.findViewById(0x7F0B0A35);  // id:post_container_fragment_list
        this.J = (ViewGroup)this.findViewById(0x7F0B0A36);  // id:post_container_fragment_others
        this.K = (ViewGroup)this.findViewById(0x7F0B0A37);  // id:post_container_fragment_read
        this.M = this.findViewById(0x7F0B0A39);  // id:post_container_read_dummy_bar
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x7F0B0A38);  // id:post_container_fragments
        this.I = viewGroup0;
        g0 g00 = null;
        if(viewGroup0 != null) {
            if(this.E == o.c) {
                Object object0 = null;
                for(Object object1: ViewGroupKt.e(viewGroup0)) {
                    if(((View)object1) instanceof LinearLayout) {
                        object0 = object1;
                        break;
                    }
                }
                LinearLayout linearLayout0 = object0 instanceof LinearLayout ? ((LinearLayout)object0) : null;
                if(linearLayout0 != null && linearLayout0.getChildCount() == 2) {
                    kotlin.V v0 = Al.a.H(this);
                    float f = ((Number)v0.a()).floatValue();
                    float f1 = ((Number)v0.b()).floatValue();
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = linearLayout0.getChildAt(0).getLayoutParams();
                    LinearLayout.LayoutParams linearLayout$LayoutParams0 = viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams ? ((LinearLayout.LayoutParams)viewGroup$LayoutParams0) : null;
                    if(linearLayout$LayoutParams0 != null) {
                        linearLayout$LayoutParams0.weight = f;
                    }
                    ViewGroup.LayoutParams viewGroup$LayoutParams1 = linearLayout0.getChildAt(1).getLayoutParams();
                    LinearLayout.LayoutParams linearLayout$LayoutParams1 = viewGroup$LayoutParams1 instanceof LinearLayout.LayoutParams ? ((LinearLayout.LayoutParams)viewGroup$LayoutParams1) : null;
                    if(linearLayout$LayoutParams1 != null) {
                        linearLayout$LayoutParams1.weight = f1;
                    }
                }
            }
            else {
                g0 g01 = this.w;
                if(g01 == null) {
                    L.S("binding");
                    g01 = null;
                }
                L2 l20 = g01.g();
                M m0 = (View view0, WindowInsetsCompat windowInsetsCompat0) -> WindowInsetsCompat.c;
                ViewCompat.m2(l20.p, m0);
            }
            ViewCompat.m2(viewGroup0, (View view0, WindowInsetsCompat windowInsetsCompat0) -> {
                L.p(this, "this$0");
                L.m(windowInsetsCompat0);
                this.c5(windowInsetsCompat0);
                return windowInsetsCompat0;
            });
        }
        g0 g02 = this.w;
        if(g02 == null) {
            L.S("binding");
            g02 = null;
        }
        this.P8 = (TextView)g02.g().N.findViewById(0x7F0B1033);  // id:user_notification_new_count
        g0 g03 = this.w;
        if(g03 == null) {
            L.S("binding");
            g03 = null;
        }
        g03.f().setStatusBarBackgroundColor(vk.b(this, 0x7F040219));  // attr:dcToolbarColor
        g0 g04 = this.w;
        if(g04 == null) {
            L.S("binding");
        }
        else {
            g00 = g04;
        }
        g00.j().setStatusBarBackgroundColor(vk.b(this, 0x7F040219));  // attr:dcToolbarColor
    }

    // 检测为 Lambda 实现
    private static final Boolean Y4(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final WindowInsetsCompat Z3(View view0, WindowInsetsCompat windowInsetsCompat0) [...]

    // 检测为 Lambda 实现
    private static final void Z4(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final WindowInsetsCompat a4(c0 c00, View view0, WindowInsetsCompat windowInsetsCompat0) [...]

    private final void a5(U u0) {
        S0 s00 = this.w3();
        if(s00 != null) {
            s00.h4(u0.b());
        }
        this.p5();
    }

    public final boolean b4() {
        if(this.s1()) {
            return false;
        }
        g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        return g00.d().a();
    }

    private final void b5() {
        com.dcinside.app.type.P.b.j(this);
    }

    @Override  // com.dcinside.app.post.view.DrawerLayout$d
    public void c(@l View view0, float f) {
        L.p(view0, "drawerView");
    }

    @SuppressLint({"RtlHardcoded"})
    private final boolean c4() {
        g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        return g00.f().C(3);
    }

    private final void c5(WindowInsetsCompat windowInsetsCompat0) {
        PostContainerChildInsets postContainerChildInsets0;
        if(this.E == o.c) {
            postContainerChildInsets0 = PostContainerChildInsets.f.a();
        }
        else {
            Insets insets0 = windowInsetsCompat0.f(9);
            postContainerChildInsets0 = new PostContainerChildInsets(9, 0, insets0.b, 0, insets0.d);
        }
        if(!L.g(postContainerChildInsets0, this.H)) {
            this.H = postContainerChildInsets0;
            g0 g00 = this.w;
            if(g00 == null) {
                L.S("binding");
                g00 = null;
            }
            L2 l20 = g00.g();
            L.o(l20.N, "sideMenuUser");
            com.dcinside.app.internal.r.g0(l20.N, postContainerChildInsets0.q(), null, null, null, 14, null);
            S0 s00 = this.w3();
            if(s00 != null) {
                s00.q0(postContainerChildInsets0);
            }
            N3 n30 = this.y3();
            if(n30 != null) {
                n30.q0(postContainerChildInsets0);
            }
            V v0 = this.x3();
            if(v0 != null) {
                v0.q0(postContainerChildInsets0);
            }
        }
        Insets insets1 = windowInsetsCompat0.f(9);
        N3 n31 = this.y3();
        if(n31 != null) {
            L.m(insets1);
            n31.l7(insets1);
        }
    }

    private final boolean d4() {
        return L.g(this.B3().r().f(), Boolean.TRUE);
    }

    // 检测为 Lambda 实现
    private static final void d5(c0 c00, SharedPreferences sharedPreferences0, String s) [...]

    @SuppressLint({"RtlHardcoded"})
    private final boolean e4() {
        g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        return g00.j().C(5);
    }

    public final void e5() {
        S0 s00 = this.w3();
        if(s00 != null) {
            S0.A4(s00, false, 1, null);
        }
    }

    @Override  // com.dcinside.app.post.fragments.O
    public void f(@l Insets insets0) {
        L.p(insets0, "insets");
        N3 n30 = this.y3();
        if(n30 != null) {
            n30.l7(insets0);
        }
    }

    public final boolean f4() {
        return this.E == o.c;
    }

    private final void f5() {
        if(this.s1()) {
            return;
        }
        switch(this.E) {
            case 1: {
                N3 n30 = this.y3();
                if(n30 != null) {
                    n30.i0();
                    return;
                }
                V v0 = this.x3();
                if(v0 != null) {
                    v0.i0();
                    return;
                }
                S0 s00 = this.w3();
                if(s00 != null) {
                    s00.i0();
                    return;
                }
                break;
            }
            case 2: {
                N3 n31 = this.y3();
                if(n31 != null) {
                    n31.i0();
                    return;
                }
                break;
            }
            case 3: {
                V v1 = this.x3();
                if(v1 != null) {
                    v1.i0();
                    return;
                }
                N3 n32 = this.y3();
                if(n32 != null) {
                    if(!this.e4()) {
                        n32 = null;
                    }
                    if(n32 != null) {
                        n32.i0();
                        return;
                    }
                }
                S0 s01 = this.w3();
                if(s01 != null) {
                    s01.i0();
                    return;
                }
                break;
            }
        }
    }

    @Override  // android.app.Activity
    public void finish() {
        if(this.isFinishing()) {
            return;
        }
        super.finish();
        if(this.E == o.d) {
            if(this.e4()) {
                this.overridePendingTransition(0x7F010055, 0x7F010053);  // anim:read_stay
                return;
            }
            this.overridePendingTransition(0, 0);
            return;
        }
        this.overridePendingTransition(0x7F010055, 0x7F010053);  // anim:read_stay
    }

    @SuppressLint({"RtlHardcoded"})
    private final void g4(boolean z, boolean z1) {
        g0 g00 = null;
        if(z1) {
            g0 g01 = this.w;
            if(g01 == null) {
                L.S("binding");
            }
            else {
                g00 = g01;
            }
            g00.f().post(() -> {
                L.p(this, "this$0");
                g0 g00 = this.w;
                if(g00 == null) {
                    L.S("binding");
                    g00 = null;
                }
                g00.f().e(3, z);
            });
            return;
        }
        g0 g02 = this.w;
        if(g02 == null) {
            L.S("binding");
        }
        else {
            g00 = g02;
        }
        g00.f().e(3, z);
    }

    private final void g5() {
        g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        g00.k().setVisibility(8);
        g0 g01 = this.w;
        if(g01 == null) {
            L.S("binding");
            g01 = null;
        }
        g01.k().removeAllViews();
        C c0 = this.X;
        if(c0 != null) {
            c0.release();
        }
        this.X = null;
    }

    static void h4(c0 c00, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: leftClose");
        }
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        c00.g4(z, z1);
    }

    public final void h5(boolean z) {
        int v;
        boolean z1;
        WindowInsetsControllerCompat windowInsetsControllerCompat0 = new WindowInsetsControllerCompat(this.getWindow(), this.getWindow().getDecorView());
        if(!z) {
            z1 = this.i1();
        }
        else if(!dl.a.q2().m()) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        windowInsetsControllerCompat0.i(z1);
        if(!z) {
            v = vk.b(this, 0x7F040219);  // attr:dcToolbarColor
        }
        else if(dl.a.q2().m()) {
            v = vk.b(this, 0x7F040219);  // attr:dcToolbarColor
        }
        else {
            v = ContextCompat.getColor(this, 0x7F0605B8);  // color:white
        }
        this.getWindow().setStatusBarColor(v);
    }

    // 检测为 Lambda 实现
    private static final void i4(c0 c00, boolean z) [...]

    public final void i5(@m String s, @m View view0, @l Function1 function10) {
        @s0({"SMAP\nPostContainerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity$requestAutoImageData$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1926:1\n257#2,2:1927\n*S KotlinDebug\n*F\n+ 1 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity$requestAutoImageData$1\n*L\n465#1:1927,2\n*E\n"})
        static final class com.dcinside.app.post.c0.S extends N implements Function1 {
            final View e;
            final String f;
            final Function1 g;

            com.dcinside.app.post.c0.S(View view0, String s, Function1 function10) {
                this.e = view0;
                this.f = s;
                this.g = function10;
                super(1);
            }

            public final void a(com.dcinside.app.settings.image.e e0) {
                View view0 = this.e;
                if(view0 != null) {
                    view0.setVisibility(8);
                }
                AutoImageData autoImageData0 = null;
                if(e0 instanceof com.dcinside.app.settings.image.e.b) {
                    com.dcinside.app.settings.image.d d0 = ((com.dcinside.app.settings.image.e.b)e0).d();
                    AutoImageData autoImageData1 = (AutoImageData)d0.f().get(this.f);
                    if(autoImageData1 == null) {
                        autoImageData0 = d0.e();
                    }
                    else if(autoImageData1.v()) {
                        autoImageData0 = autoImageData1.o().isEmpty() ? d0.e() : autoImageData1;
                    }
                    this.g.invoke(autoImageData0);
                    return;
                }
                if(e0 instanceof com.dcinside.app.settings.image.e.a) {
                    this.g.invoke(null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.settings.image.e)object0));
                return kotlin.S0.a;
            }
        }

        L.p(function10, "doOnAfter");
        if(s == null || s.length() == 0) {
            s = "X";
        }
        rx.o o0 = this.Q;
        if(o0 != null) {
            o0.l();
        }
        if(view0 != null) {
            view0.setVisibility(0);
        }
        this.Q = com.dcinside.app.settings.image.i.g().M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.post.c0.S(view0, s, function10), "$tmp0");
            new com.dcinside.app.post.c0.S(view0, s, function10).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(function10, "$doOnAfter");
            if(view0 != null) {
                view0.setVisibility(8);
            }
            function10.invoke(null);
        });
    }

    private final void j3() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$applyDrawerMode$2", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.c0.b extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final c0 l;

            com.dcinside.app.post.c0.b(c0 c00, kotlin.coroutines.d d0) {
                this.l = c00;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.c0.b(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((kotlinx.coroutines.O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l kotlinx.coroutines.O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.post.c0.b)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.k3();
                return kotlin.S0.a;
            }
        }

        I0 i00 = this.A;
        if(i00 != null) {
            try {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            catch(Exception unused_ex) {
            }
        }
        this.A = k.f(LifecycleOwnerKt.a(this), kotlinx.coroutines.h0.e(), null, new com.dcinside.app.post.c0.b(this, null), 2, null);
    }

    @SuppressLint({"RtlHardcoded"})
    private final int j4() {
        g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        return g00.f().q(3);
    }

    public static void j5(c0 c00, String s, View view0, Function1 function10, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestAutoImageData");
        }
        if((v & 2) != 0) {
            view0 = null;
        }
        c00.i5(s, view0, function10);
    }

    @SuppressLint({"PrivateResource"})
    private final void k3() {
        boolean z;
        com.dcinside.app.type.v v0 = null;
        switch(this.E) {
            case 1: {
                this.q5(1);
                S0 s02 = this.w3();
                if(s02 != null) {
                    v0 = s02.k1();
                }
                if(v0 == com.dcinside.app.type.v.e) {
                    if((this.J == null ? 0 : this.J.getChildCount()) > 0) {
                        this.k4(1);
                        this.f1();
                        return;
                    }
                    this.k4(0);
                    this.f1();
                }
                else {
                    this.k4(1);
                    Toolbar toolbar1 = this.y;
                    if(toolbar1 != null) {
                        toolbar1.setNavigationIcon(0x7F08003D);  // drawable:abc_ic_ab_back_material
                        return;
                    }
                }
                break;
            }
            case 2: {
                this.k4(1);
                N3 n30 = this.y3();
                if(n30 == null) {
                    this.q5(0);
                    return;
                }
                if(!n30.s6() && !n30.m6() && !this.d4()) {
                    this.q5(0);
                    return;
                }
                this.q5(2);
                return;
            label_13:
                V v1 = this.x3();
                N3 n31 = this.y3();
                if(v1 != null) {
                    this.q5(0);
                    z = false;
                }
                else if(n31 == null) {
                    this.q5(1);
                    z = false;
                }
                else if(this.e4()) {
                    if(n31.s6() || n31.m6() || n31.o6() || this.d4()) {
                        this.q5(2);
                    }
                    else {
                        this.q5(0);
                    }
                    z = true;
                }
                else {
                    S0 s00 = this.w3();
                    if(s00 == null || !s00.r3()) {
                        this.q5(0);
                    }
                    else {
                        this.q5(1);
                    }
                    z = false;
                }
                if(v1 != null) {
                    this.k4(1);
                    this.f1();
                    return;
                }
                S0 s01 = this.w3();
                if(s01 != null) {
                    v0 = s01.k1();
                }
                if(v0 == com.dcinside.app.type.v.e) {
                    goto label_49;
                }
                this.k4(1);
                Toolbar toolbar0 = this.y;
                if(toolbar0 != null) {
                    toolbar0.setNavigationIcon(0x7F08003D);  // drawable:abc_ic_ab_back_material
                    return;
                label_49:
                    if(z) {
                        this.k4(1);
                        this.f1();
                        return;
                    }
                    this.k4(0);
                    this.f1();
                    return;
                }
                break;
            }
            default: {
                goto label_13;
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    private final void k4(int v) {
        g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        g00.f().V(v, 3);
    }

    // 检测为 Lambda 实现
    private static final void k5(Function1 function10, Object object0) [...]

    private final void l3(Bundle bundle0) {
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        S0 s00 = this.w3();
        if(s00 != null) {
            String s = bundle0.getString("com.dcinside.app.extra.GALLERY_ID");
            Bundle bundle1 = s00.getArguments();
            if(L.g(s, (bundle1 == null ? null : bundle1.getString("com.dcinside.app.extra.GALLERY_ID")))) {
                return;
            }
        }
        bundle0.putParcelable("com.dcinside.app.extra.POST_CONTAINER_INSET", this.H);
        S0 s01 = new S0();
        s01.setArguments(bundle0);
        FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
        L.o(fragmentTransaction0, "beginTransaction(...)");
        fragmentTransaction0.C(0x7F0B0A35, s01);  // id:post_container_fragment_list
        fragmentTransaction0.q();
    }

    @SuppressLint({"RtlHardcoded"})
    private final void l4(boolean z, boolean z1) {
        g0 g00 = null;
        if(z1) {
            g0 g01 = this.w;
            if(g01 == null) {
                L.S("binding");
            }
            else {
                g00 = g01;
            }
            g00.f().post(() -> {
                L.p(this, "this$0");
                g0 g00 = this.w;
                if(g00 == null) {
                    L.S("binding");
                    g00 = null;
                }
                g00.f().N(3, z);
            });
            return;
        }
        g0 g02 = this.w;
        if(g02 == null) {
            L.S("binding");
        }
        else {
            g00 = g02;
        }
        g00.f().N(3, z);
    }

    // 检测为 Lambda 实现
    private static final void l5(View view0, Function1 function10, Throwable throwable0) [...]

    public final void m3(@m Intent intent0) {
        try {
            Boolean boolean0 = null;
            boolean0 = Boolean.valueOf(this.getSupportFragmentManager().d1());
        }
        catch(Exception unused_ex) {
        }
        if(!L.g(boolean0, Boolean.FALSE)) {
            return;
        }
        if(intent0 != null) {
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 != null) {
                String s = bundle0.getString("com.dcinside.app.extra.GALLERY_ID");
                int v = bundle0.getInt("com.dcinside.app.extra.POST_NUMBER");
                if(s == null) {
                    return;
                }
                this.W4(bundle0);
                int v1 = com.dcinside.app.post.c0.a.a[this.E.ordinal()];
                switch(v1) {
                    case 1: {
                        if(v > 0) {
                            this.o3(bundle0, true);
                            c0.h4(this, true, false, 2, null);
                            return;
                        }
                        String s2 = this.A3();
                        if(s2 == null || L.g(s2, s)) {
                            c0.h4(this, true, false, 2, null);
                        }
                        else {
                            this.l3(bundle0);
                            c0.h4(this, true, false, 2, null);
                            N3 n31 = this.y3();
                            if(n31 != null) {
                                n31.Y4(false);
                                return;
                            }
                        }
                        break;
                    }
                    case 2: {
                        if(v >= 0) {
                            c0.p3(this, bundle0, false, 2, null);
                            c0.h4(this, true, false, 2, null);
                            return;
                        }
                        new com.dcinside.app.util.Xk.a(s, 0, 0, null, true, false, false, false, false, false, null, false, null, null, 0x3FEE, null).a(this);
                        this.finish();
                        return;
                    label_22:
                        if(v1 == 3) {
                            if(v > 0) {
                                this.o3(bundle0, !this.e4());
                                c0.s5(this, true, false, 2, null);
                                c0.h4(this, true, false, 2, null);
                                return;
                            }
                            String s1 = this.A3();
                            if(s1 == null || L.g(s1, s)) {
                                c0.h4(this, true, false, 2, null);
                                c0.n5(this, true, false, 2, null);
                                return;
                            }
                            this.l3(bundle0);
                            c0.h4(this, true, false, 2, null);
                            N3 n30 = this.y3();
                            if(n30 != null) {
                                n30.Y4(false);
                                return;
                            }
                        }
                        break;
                    }
                    default: {
                        goto label_22;
                    }
                }
            }
        }
    }

    static void m4(c0 c00, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: leftOpen");
        }
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        c00.l4(z, z1);
    }

    @SuppressLint({"RtlHardcoded"})
    private final void m5(boolean z, boolean z1) {
        g0 g00 = null;
        if(z1) {
            g0 g01 = this.w;
            if(g01 == null) {
                L.S("binding");
            }
            else {
                g00 = g01;
            }
            g00.j().post(() -> {
                L.p(this, "this$0");
                g0 g00 = this.w;
                if(g00 == null) {
                    L.S("binding");
                    g00 = null;
                }
                g00.j().e(5, z);
            });
            return;
        }
        g0 g02 = this.w;
        if(g02 == null) {
            L.S("binding");
        }
        else {
            g00 = g02;
        }
        g00.j().e(5, z);
    }

    private final void n3(Fragment fragment0) {
        FragmentTransaction fragmentTransaction0 = this.getSupportFragmentManager().u();
        L.o(fragmentTransaction0, "beginTransaction(...)");
        if(this.E == o.b) {
            fragmentTransaction0.M(0x7F02002A, 0);  // animator:read_enter
        }
        fragmentTransaction0.C(0x7F0B0A36, fragment0);  // id:post_container_fragment_others
        fragmentTransaction0.q();
    }

    // 检测为 Lambda 实现
    private static final void n4(c0 c00, boolean z) [...]

    static void n5(c0 c00, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rightClose");
        }
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        c00.m5(z, z1);
    }

    @Override  // com.dcinside.app.post.view.DrawerLayout$d
    public void o(int v, int v1) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$onDrawerStateChanged$1", f = "PostContainerActivity.kt", i = {}, l = {0x58F, 0x590}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.c0.N extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final com.dcinside.app.internal.t l;

            com.dcinside.app.post.c0.N(com.dcinside.app.internal.t t0, kotlin.coroutines.d d0) {
                this.l = t0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.c0.N(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((kotlinx.coroutines.O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l kotlinx.coroutines.O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.post.c0.N)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$onDrawerStateChanged$1$1", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.post.c0.N.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final com.dcinside.app.internal.t l;

                    com.dcinside.app.post.c0.N.a(com.dcinside.app.internal.t t0, kotlin.coroutines.d d0) {
                        this.l = t0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.post.c0.N.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((kotlinx.coroutines.O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l kotlinx.coroutines.O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.post.c0.N.a)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        c0 c00 = (c0)this.l.a();
                        if(c00 != null) {
                            c00.z3();
                            return kotlin.S0.a;
                        }
                        return null;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                try {
                    switch(this.k) {
                        case 0: {
                            goto label_5;
                        }
                        case 1: {
                            goto label_9;
                        }
                        case 2: {
                            goto label_3;
                        }
                    }
                }
                catch(Exception exception0) {
                    timber.log.b.a.y(exception0);
                    return kotlin.S0.a;
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                try {
                label_3:
                    f0.n(object0);
                }
                catch(Exception exception0) {
                    timber.log.b.a.y(exception0);
                }
                return kotlin.S0.a;
            label_5:
                f0.n(object0);
                try {
                    this.k = 1;
                    if(kotlinx.coroutines.a0.b(200L, this) == object1) {
                        return object1;
                    label_9:
                        f0.n(object0);
                    }
                    com.dcinside.app.post.c0.N.a c0$N$a0 = new com.dcinside.app.post.c0.N.a(this.l, null);
                    this.k = 2;
                    if(kotlinx.coroutines.i.h(kotlinx.coroutines.h0.e(), c0$N$a0, this) == object1) {
                        return object1;
                    }
                }
                catch(Exception exception0) {
                    timber.log.b.a.y(exception0);
                }
                return kotlin.S0.a;
            }
        }

        if(this.s1()) {
            return;
        }
        if(v == 2 && this.E == o.d && (v1 > 0 || !this.e4())) {
            com.dcinside.app.internal.t t0 = new com.dcinside.app.internal.t(this);
            k.f(LifecycleOwnerKt.a(this), kotlinx.coroutines.h0.a(), null, new com.dcinside.app.post.c0.N(t0, null), 2, null);
        }
    }

    private final void o3(Bundle bundle0, boolean z) {
        String s = bundle0.getString("com.dcinside.app.extra.GALLERY_ID");
        if(s == null) {
            return;
        }
        int v = bundle0.getInt("com.dcinside.app.extra.POST_NUMBER");
        boolean z1 = bundle0.getBoolean("com.dcinside.app.extra.TITLE_TO_GALLERY_NAME");
        int v1 = bundle0.getInt("com.dcinside.app.extra.COMMENT_NUMBER", 0);
        String s1 = bundle0.getString("com.dcinside.app.extra.EXTRA_SEARCH_KEYWORD");
        boolean z2 = bundle0.getBoolean("com.dcinside.app.extra.EXTRA_PUSH_ALERT_LIKE_POST", false);
        boolean z3 = bundle0.getBoolean("com.dcinside.app.extra.EXTRA_IS_REPLY_ONLY", false);
        String s2 = bundle0.getString("com.dcinside.app.extra.EXTRA_SECRET_PW", null);
        boolean z4 = bundle0.getBoolean("com.dcinside.app.extra.EXTRA_SHOW_TITLE", false);
        String s3 = bundle0.getString("com.dcinside.app.extra.EXTRA_LIST_HEAD_ID");
        String s4 = bundle0.getString("com.dcinside.app.extra.IMG_NO");
        if(v == 0) {
            return;
        }
        this.setResult(-1);
        N3 n30 = this.y3();
        if(n30 != null) {
            n30.r7(s, v, z1, z, v1, s1, z2, z3, s2, z4, s3, s4);
            return;
        }
        bundle0.putParcelable("com.dcinside.app.extra.POST_CONTAINER_INSET", this.H);
        N3 n31 = new N3();
        n31.setArguments(bundle0);
        FragmentTransaction fragmentTransaction0 = this.getSupportFragmentManager().u();
        L.o(fragmentTransaction0, "beginTransaction(...)");
        fragmentTransaction0.C(0x7F0B0A37, n31);  // id:post_container_fragment_read
        fragmentTransaction0.q();
    }

    public final void o4() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$miniMemberStateChanged$1", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class G extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final c0 l;

            G(c0 c00, kotlin.coroutines.d d0) {
                this.l = c00;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new G(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((kotlinx.coroutines.O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l kotlinx.coroutines.O o0, @m kotlin.coroutines.d d0) {
                return ((G)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.setResult(-1);
                S0 s00 = this.l.w3();
                if(s00 != null) {
                    s00.z4(true);
                }
                return kotlin.S0.a;
            }
        }

        k.f(LifecycleOwnerKt.a(this), kotlinx.coroutines.h0.e(), null, new G(this, null), 2, null);
    }

    // 检测为 Lambda 实现
    private static final void o5(c0 c00, boolean z) [...]

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        switch(v) {
            case 1006: {
                this.u4(v1);
                return;
            }
            case 1007: {
                this.v4();
                return;
            }
            case 1010: {
                S0 s00 = this.w3();
                if(s00 != null) {
                    s00.onActivityResult(1010, v1, intent0);
                    return;
                }
                break;
            }
            case 1020: {
                this.t4(v1, intent0);
                return;
            }
            case 1030: {
                if(intent0 != null && intent0.getBooleanExtra("com.dcinside.app.EXTRA_DC_REPORT_RESULT", false)) {
                    N3 n30 = this.y3();
                    if(n30 != null) {
                        n30.onActivityResult(1030, v1, intent0);
                        return;
                    }
                }
                else if(intent0 != null && intent0.getBooleanExtra("com.dcinside.app.EXTRA_DC_ADULT_RESULT", false)) {
                    this.x4(intent0);
                    return;
                }
                break;
            }
            case 0x407: {
                this.r4(v1);
                return;
            }
            case 0x408: {
                this.s4(v1);
                return;
            }
            case 0x40F: {
                if(v1 == -1) {
                    this.o4();
                    return;
                }
                break;
            }
            case 1045: {
                if(v1 == -1) {
                    this.o4();
                    return;
                }
                break;
            }
            case 1049: {
                N3 n31 = this.y3();
                if(n31 != null) {
                    n31.onActivityResult(1049, v1, intent0);
                    return;
                }
                break;
            }
            default: {
                this.w4(v, v1, intent0);
            }
        }
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public void onChildViewAdded(@m View view0, @m View view1) {
        I0 i00 = this.B;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.B = k.f(LifecycleOwnerKt.a(this), kotlinx.coroutines.h0.e(), null, new c0.L(this, null), 2, null);
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public void onChildViewRemoved(@m View view0, @m View view1) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$onChildViewRemoved$1", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.c0.M extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final c0 l;

            com.dcinside.app.post.c0.M(c0 c00, kotlin.coroutines.d d0) {
                this.l = c00;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.c0.M(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((kotlinx.coroutines.O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l kotlinx.coroutines.O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.post.c0.M)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.j3();
                this.l.f5();
                return kotlin.S0.a;
            }
        }

        if(this.E == o.c) {
            if(L.g(view0, this.J) && view1 != null) {
                Fragment fragment0 = FragmentManager.q0(view1);
                L.o(fragment0, "findFragment(...)");
                if(((V)fragment0) instanceof j0) {
                    this.v4();
                }
            }
            else if(L.g(view0, this.K)) {
                com.dcinside.app.rx.bus.c.a(this, new com.dcinside.app.rx.bus.W(1, null, 0, 0, 14, null));
            }
        }
        I0 i00 = this.B;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.B = k.f(LifecycleOwnerKt.a(this), kotlinx.coroutines.h0.e(), null, new com.dcinside.app.post.c0.M(this, null), 2, null);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        g0 g00 = null;
        Intent intent0 = this.getIntent();
        if(intent0 != null) {
            if(intent0.getExtras() == null) {
                intent0 = null;
            }
            if(intent0 != null) {
                this.W3(bundle0, intent0);
                super.onCreate(bundle0);
                this.getOnBackPressedDispatcher().i(this, this.Q8);
                dl dl0 = dl.a;
                dl0.i(this.O8);
                if(bundle0 != null) {
                    ArchiveQuickManager.g.a(this);
                }
                if(com.dcinside.app.post.c0.a.a[this.E.ordinal()] == 1) {
                    Y.W w0 = Y.W.c(this.getLayoutInflater());
                    L.o(w0, "inflate(...)");
                    this.w = new i0(w0);
                }
                else {
                    Y.V v0 = Y.V.c(this.getLayoutInflater());
                    L.o(v0, "inflate(...)");
                    this.w = new com.dcinside.app.post.f0(v0);
                }
                g0 g01 = this.w;
                if(g01 == null) {
                    L.S("binding");
                    g01 = null;
                }
                this.setContentView(g01.getRoot());
                b b0 = this.F;
                if(b0 != null) {
                    b0.l();
                }
                this.F = new b();
                boolean z = bundle0 == null ? intent0.getBooleanExtra("com.dcinside.app.extra.RIGHT_OPEN", false) : bundle0.getBoolean("com.dcinside.app.extra.RIGHT_OPEN", false);
                this.Y3();
                this.E3();
                this.x5();
                this.W4(intent0.getExtras());
                this.S0(null);
                F0 f00 = this.F1();
                L.m(f00);
                g1 g10 = f00.C4(com.dcinside.app.realm.B.class).b0("flagChoose", Boolean.TRUE).p0();
                g10.l(this.M8);
                this.Z = g10;
                this.T3(bundle0, intent0, z);
                if(this.E == o.c && dl0.T2()) {
                    dl0.U5(false);
                    Dl.D(this, 0x7F1509DA);  // string:split_mode_guide "분할 모드로 사용 중입니다.\n설정 > 화면 설정에서 ON/OFF 가능"
                }
                Ak ak0 = Ak.a;
                g0 g02 = this.w;
                if(g02 == null) {
                    L.S("binding");
                    g02 = null;
                }
                ak0.f(this, g02.j());
                if(Al.a.s(this)) {
                    g0 g03 = this.w;
                    if(g03 == null) {
                        L.S("binding");
                    }
                    else {
                        g00 = g03;
                    }
                    g00.k().getLayoutParams().width = 0;
                    this.X3();
                }
            }
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        this.u3();
        this.v3();
        dl.a.s(this.O8);
        g1 g10 = this.Z;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.Z = null;
        I0 i00 = this.B;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.B = null;
        I0 i01 = this.A;
        if(i01 != null) {
            kotlinx.coroutines.I0.a.b(i01, null, 1, null);
        }
        this.A = null;
        pl pl0 = this.x;
        if(pl0 != null) {
            pl0.release();
        }
        try {
            this.x = null;
            if(this.C && ll.B()) {
                g0 g00 = this.w;
                if(g00 == null) {
                    L.S("binding");
                    g00 = null;
                }
                Dl.J(g00.h().findViewById(0x7F0B0AEB), 0x7F150429);  // id:post_read_toolbar
                ll.A(false);
            }
        }
        catch(Exception unused_ex) {
        }
        x0 x00 = this.D;
        if(x00 != null) {
            x00.release();
        }
        this.D = null;
        f f0 = this.z;
        if(f0 != null) {
            f0.release();
        }
        this.z = null;
        com.dcinside.app.post.fragments.g g0 = this.N;
        if(g0 != null) {
            g0.dismissAllowingStateLoss();
        }
        this.N = null;
        e e0 = this.O;
        if(e0 != null) {
            e0.dismissAllowingStateLoss();
        }
        this.O = null;
        rx.o o0 = this.P;
        if(o0 != null) {
            o0.l();
        }
        this.P = null;
        rx.o o1 = this.Q;
        if(o1 != null) {
            o1.l();
        }
        this.Q = null;
        AlertDialog alertDialog0 = this.G;
        if(alertDialog0 != null) {
            try {
                alertDialog0.dismiss();
            }
            catch(Exception unused_ex) {
            }
        }
        this.G = null;
        this.g5();
        this.B3().clear();
        super.onDestroy();
    }

    @Override  // com.dcinside.app.post.view.DrawerLayout$d
    public void onDrawerClosed(@l View view0) {
        L.p(view0, "drawerView");
        if(this.s1()) {
            return;
        }
        boolean z = true;
        switch(this.E) {
            case 1: {
                this.j3();
                return;
            }
            case 2: {
                this.z3();
                return;
            }
            case 3: {
                Nk.a.a(this);
                V v0 = this.x3();
                S0 s00 = this.w3();
                this.j3();
                if(v0 != null) {
                    v0.n0(true);
                }
                if(s00 != null) {
                    if(v0 != null) {
                        z = false;
                    }
                    s00.n0(z);
                }
                N3 n30 = this.y3();
                if(n30 != null) {
                    n30.n0(false);
                }
                this.f5();
            }
        }
    }

    @Override  // com.dcinside.app.post.view.DrawerLayout$d
    public void onDrawerOpened(@l View view0) {
        L.p(view0, "drawerView");
        if(this.s1()) {
            return;
        }
        switch(this.E) {
            case 1: {
                this.j3();
                return;
            }
            case 2: {
                this.j3();
                return;
            }
            case 3: {
                this.j3();
                V v0 = this.x3();
                if(v0 != null) {
                    v0.n0(false);
                }
                S0 s00 = this.w3();
                if(s00 != null) {
                    s00.J3();
                    s00.n0(false);
                }
                N3 n30 = this.y3();
                if(n30 != null) {
                    n30.n0(true);
                }
                this.f5();
            }
        }
    }

    @Override  // androidx.activity.ComponentActivity
    @SuppressLint({"MissingSuperCall"})
    protected void onNewIntent(@l Intent intent0) {
        L.p(intent0, "intent");
        super.onNewIntent(intent0);
        this.m3(intent0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onPause() {
        super.onPause();
        Ak.a.b();
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    protected void onPostCreate(@m Bundle bundle0) {
        super.onPostCreate(bundle0);
        f f0 = this.z;
        if(f0 != null) {
            f0.release();
        }
        this.z = f.b.a(this);
    }

    @Override  // com.dcinside.app.base.d
    protected void onResume() {
        super.onResume();
        com.dcinside.app.settings.image.i.a.h();
        g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        g00.g().N.s();
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("com.dcinside.app.extra.GALLERY_MODE", this.E.ordinal());
        boolean z = true;
        switch(this.E) {
            case 1: {
                if(this.y3() == null) {
                    z = false;
                }
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                z = this.e4();
                break;
            }
            default: {
                throw new kotlin.J();
            }
        }
        bundle0.putBoolean("com.dcinside.app.extra.RIGHT_OPEN", z);
    }

    static void p3(c0 c00, Bundle bundle0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyReadFragment");
        }
        if((v & 2) != 0) {
            z = false;
        }
        c00.o3(bundle0, z);
    }

    private final void p4(K k0) {
        Xk.i(this, k0.a());
    }

    private final void p5() {
        N3 n30 = this.y3();
        if(n30 == null) {
            return;
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
        L.o(fragmentTransaction0, "beginTransaction(...)");
        fragmentTransaction0.B(n30);
        if(fragmentManager0.d1()) {
            fragmentTransaction0.r();
            return;
        }
        fragmentTransaction0.q();
    }

    public final void q3(@IntRange(from = 0L, to = 100L) int v) {
        if(this.s1()) {
            return;
        }
        g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        g00.d().c(v);
    }

    private final void q4() {
        static final class H extends N implements p {
            public static final H e;

            static {
                H.e = new H();
            }

            H() {
                super(3);
            }

            public final void a(int v, int v1, @m Intent intent0) {
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return kotlin.S0.a;
            }
        }

        if(com.dcinside.app.main.login.g.a.p()) {
            com.dcinside.app.base.d.y1(this, 0, null, null, 0, false, 0x1F, null);
            return;
        }
        Intent intent0 = LoginActivity.x.b(this, false);
        com.dcinside.app.base.d.t.a(this, intent0, 0x403, H.e);
    }

    @SuppressLint({"RtlHardcoded"})
    private final void q5(int v) {
        g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        g00.j().V(v, 5);
    }

    public final void r3() {
        if(this.s1()) {
            return;
        }
        g0 g00 = this.w;
        AppBarLayout appBarLayout0 = null;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        ContentProgressBar contentProgressBar0 = g00.d();
        N3 n30 = this.y3();
        if(n30 != null) {
            appBarLayout0 = n30.a5();
        }
        contentProgressBar0.setAppBarLayout(appBarLayout0);
        contentProgressBar0.b();
    }

    private final void r4(int v) {
        if(v == -1) {
            N3 n30 = this.y3();
            if(n30 != null) {
                n30.X7(true);
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    private final void r5(boolean z, boolean z1) {
        g0 g00 = null;
        if(z1) {
            g0 g01 = this.w;
            if(g01 == null) {
                L.S("binding");
            }
            else {
                g00 = g01;
            }
            g00.j().post(() -> {
                L.p(this, "this$0");
                g0 g00 = this.w;
                if(g00 == null) {
                    L.S("binding");
                    g00 = null;
                }
                g00.j().N(5, z);
            });
            return;
        }
        try {
            g0 g02 = this.w;
            if(g02 == null) {
                L.S("binding");
            }
            else {
                g00 = g02;
            }
            g00.j().N(5, z);
        }
        catch(IllegalArgumentException unused_ex) {
        }
    }

    public final void s3(@l String s) {
        String s1;
        long v2;
        L.p(s, "gallId");
        kotlin.V v0 = this.t3(s, jl.a.O0());
        com.dcinside.app.model.m0 m00 = (com.dcinside.app.model.m0)v0.b();
        if(((Boolean)v0.a()).booleanValue()) {
            com.dcinside.app.realm.q.a q$a0 = com.dcinside.app.realm.q.o;
            long v1 = q$a0.d(s);
            if(m00 == null) {
                v2 = 0L;
            }
            else {
                Long long0 = m00.b();
                v2 = long0 == null ? 0L : TimeUnit.SECONDS.toMillis(long0.longValue());
            }
            if(v1 + v2 < System.currentTimeMillis()) {
                q$a0.j(s);
                if(m00 == null) {
                    s1 = "";
                }
                else {
                    s1 = m00.c();
                    if(s1 == null) {
                        s1 = "";
                    }
                }
                this.C5(s1, 0, null);
            }
        }
    }

    private final void s4(int v) {
        if(v == -1) {
            N3 n30 = this.y3();
            if(n30 != null) {
                n30.g8();
            }
        }
    }

    static void s5(c0 c00, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rightOpen");
        }
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        c00.r5(z, z1);
    }

    @Override  // com.dcinside.app.wv.s$a
    public void setFullScreenView(@m View view0) {
        ViewGroup viewGroup0 = null;
        if(view0 == null) {
            ViewGroup viewGroup1 = this.R8;
            if(viewGroup1 == null) {
                return;
            }
            viewGroup1.removeAllViews();
            ViewParent viewParent0 = viewGroup1.getParent();
            ViewGroup viewGroup2 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
            if(viewGroup2 != null) {
                viewGroup2.removeView(viewGroup1);
            }
            this.R8 = null;
            return;
        }
        ViewGroup viewGroup3 = (ViewGroup)this.findViewById(0x1020002);
        View view1 = viewGroup3 == null ? null : viewGroup3.getChildAt(0);
        if(this.R8 == null) {
            viewGroup0 = view1 instanceof ViewGroup ? ((ViewGroup)view1) : null;
        }
        if(viewGroup0 == null) {
            return;
        }
        AutoRotateLayout autoRotateLayout0 = new AutoRotateLayout(this, null, 0, 6, null);
        autoRotateLayout0.setClickable(true);
        autoRotateLayout0.setLongClickable(true);
        autoRotateLayout0.setFitsSystemWindows(true);
        autoRotateLayout0.setBackgroundColor(0xFF000000);
        autoRotateLayout0.setLayoutParams(new LayoutParams(-1, -1));
        this.R8 = autoRotateLayout0;
        viewGroup0.addView(autoRotateLayout0);
        autoRotateLayout0.addView(view0);
    }

    @l
    public final kotlin.V t3(@m String s, @l List list0) {
        L.p(list0, "warningList");
        Object object0 = null;
        if(s == null) {
            return r0.a(Boolean.FALSE, null);
        }
        for(Object object1: list0) {
            List list1 = ((com.dcinside.app.model.m0)object1).a();
            if(list1 != null && list1.contains(s)) {
                object0 = object1;
                break;
            }
            if(false) {
                break;
            }
        }
        if(((com.dcinside.app.model.m0)object0) != null) {
            String s1 = ((com.dcinside.app.model.m0)object0).c();
            return s1 != null && s1.length() > 0 ? r0.a(Boolean.TRUE, ((com.dcinside.app.model.m0)object0)) : r0.a(Boolean.FALSE, ((com.dcinside.app.model.m0)object0));
        }
        return r0.a(Boolean.FALSE, ((com.dcinside.app.model.m0)object0));
    }

    private final void t4(int v, Intent intent0) {
        if(v == -1 && intent0 != null) {
            String s = intent0.getStringExtra("source");
            if(s != null) {
                N3 n30 = this.y3();
                if(n30 != null) {
                    n30.Q7(s);
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void t5(c0 c00, boolean z) [...]

    private final void u3() {
        b b0 = this.F;
        if(b0 != null) {
            b0.l();
        }
        this.F = null;
        g0 g00 = this.w;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        g00.g().N.release();
        g0 g01 = this.w;
        if(g01 == null) {
            L.S("binding");
            g01 = null;
        }
        g01.g().M.release();
        g0 g02 = this.w;
        if(g02 == null) {
            L.S("binding");
            g02 = null;
        }
        g02.g().L.release();
        g0 g03 = this.w;
        if(g03 == null) {
            L.S("binding");
            g03 = null;
        }
        g03.g().t.setOnClickListener(null);
        g0 g04 = this.w;
        if(g04 == null) {
            L.S("binding");
            g04 = null;
        }
        g04.g().u.setOnClickListener(null);
        g0 g05 = this.w;
        if(g05 == null) {
            L.S("binding");
            g05 = null;
        }
        g05.g().q.setOnClickListener(null);
        g0 g06 = this.w;
        if(g06 == null) {
            L.S("binding");
            g06 = null;
        }
        g06.g().s.setOnClickListener(null);
        g0 g07 = this.w;
        if(g07 == null) {
            L.S("binding");
            g07 = null;
        }
        g07.g().h.setOnClickListener(null);
        g0 g08 = this.w;
        if(g08 == null) {
            L.S("binding");
            g08 = null;
        }
        g08.g().i.setOnClickListener(null);
        g0 g09 = this.w;
        if(g09 == null) {
            L.S("binding");
            g09 = null;
        }
        g09.g().j.setOnClickListener(null);
        g0 g010 = this.w;
        if(g010 == null) {
            L.S("binding");
            g010 = null;
        }
        g010.g().k.setOnClickListener(null);
        g0 g011 = this.w;
        if(g011 == null) {
            L.S("binding");
            g011 = null;
        }
        g011.g().l.setOnClickListener(null);
        g0 g012 = this.w;
        if(g012 == null) {
            L.S("binding");
            g012 = null;
        }
        g012.g().v.setOnClickListener(null);
        g0 g013 = this.w;
        if(g013 == null) {
            L.S("binding");
            g013 = null;
        }
        g013.g().c.setOnClickListener(null);
        g0 g014 = this.w;
        if(g014 == null) {
            L.S("binding");
            g014 = null;
        }
        g014.g().d.setOnClickListener(null);
        g0 g015 = this.w;
        if(g015 == null) {
            L.S("binding");
            g015 = null;
        }
        g015.g().e.setOnClickListener(null);
        g0 g016 = this.w;
        if(g016 == null) {
            L.S("binding");
            g016 = null;
        }
        g016.g().g.setOnClickListener(null);
        g0 g017 = this.w;
        if(g017 == null) {
            L.S("binding");
            g017 = null;
        }
        g017.g().r.setOnClickListener(null);
        g0 g018 = this.w;
        if(g018 == null) {
            L.S("binding");
            g018 = null;
        }
        g018.g().N.findViewById(0x7F0B1037).setOnClickListener(null);  // id:user_setting_icon
        g0 g019 = this.w;
        if(g019 == null) {
            L.S("binding");
            g019 = null;
        }
        g019.g().N.findViewById(0x7F0B1000).setOnClickListener(null);  // id:user_logo
        ViewGroup viewGroup0 = this.K;
        if(viewGroup0 != null) {
            viewGroup0.setOnHierarchyChangeListener(null);
        }
        ViewGroup viewGroup1 = this.L;
        if(viewGroup1 != null) {
            viewGroup1.setOnHierarchyChangeListener(null);
        }
        ViewGroup viewGroup2 = this.J;
        if(viewGroup2 != null) {
            viewGroup2.setOnHierarchyChangeListener(null);
        }
    }

    private final void u4(int v) {
        if(v == -1) {
            this.setResult(-1);
            S0 s00 = this.w3();
            if(s00 != null) {
                s00.C4();
            }
            V v1 = this.x3();
            com.dcinside.app.post.S0 s01 = v1 instanceof com.dcinside.app.post.S0 ? ((com.dcinside.app.post.S0)v1) : null;
            if(s01 != null) {
                s01.l2();
            }
        }
    }

    public final void u5(boolean z) {
        if(z) {
            this.q5(0);
            return;
        }
        this.q5(2);
    }

    private final void v3() {
        this.I = null;
        this.L = null;
        this.J = null;
        this.K = null;
        this.M = null;
    }

    private final void v4() {
        V v0 = this.x3();
        com.dcinside.app.post.S0 s00 = v0 instanceof com.dcinside.app.post.S0 ? ((com.dcinside.app.post.S0)v0) : null;
        if(s00 != null) {
            s00.l2();
        }
    }

    // 检测为 Lambda 实现
    private static final void v5(c0 c00, View view0) [...]

    private final S0 w3() {
        Fragment fragment0 = this.getSupportFragmentManager().r0(0x7F0B0A35);  // id:post_container_fragment_list
        return fragment0 instanceof S0 ? ((S0)fragment0) : null;
    }

    private final void w4(int v, int v1, Intent intent0) {
        if(intent0 != null && intent0.getBooleanExtra("com.dcinside.app.extra.POST_CONTAINER_REFRESH", false)) {
            N3 n30 = this.y3();
            if(n30 != null) {
                n30.onActivityResult(v, v1, intent0);
            }
            S0 s00 = this.w3();
            if(s00 != null) {
                s00.onActivityResult(v, v1, intent0);
            }
        }
    }

    public final void w5(@m TextView textView0) {
        this.P8 = textView0;
    }

    @Override  // com.dcinside.app.post.n
    @m
    public o x() {
        return this.E;
    }

    private final V x3() {
        Fragment fragment0 = this.getSupportFragmentManager().r0(0x7F0B0A36);  // id:post_container_fragment_others
        return fragment0 instanceof V ? ((V)fragment0) : null;
    }

    private final void x4(Intent intent0) {
        static final class com.dcinside.app.post.c0.I extends N implements A3.a {
            final String e;
            final String f;
            final String g;
            final boolean h;
            final boolean i;
            final c0 j;

            com.dcinside.app.post.c0.I(String s, String s1, String s2, boolean z, boolean z1, c0 c00) {
                this.e = s;
                this.f = s1;
                this.g = s2;
                this.h = z;
                this.i = z1;
                this.j = c00;
                super(0);
            }

            @l
            public final rx.o c() {
                static final class com.dcinside.app.post.c0.I.a extends N implements Function1 {
                    final boolean e;
                    final boolean f;
                    final c0 g;

                    com.dcinside.app.post.c0.I.a(boolean z, boolean z1, c0 c00) {
                        this.e = z;
                        this.f = z1;
                        this.g = c00;
                        super(1);
                    }

                    public final void a(com.dcinside.app.realm.B b0) {
                        com.dcinside.app.realm.B.E.L(b0, this.e, this.f);
                        rx.o o0 = this.g.P;
                        if(o0 != null) {
                            o0.l();
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((com.dcinside.app.realm.B)object0));
                        return kotlin.S0.a;
                    }
                }

                Context context0 = Application.e.c();
                Account account0 = new Account(this.e, "com.dcinside.app.android");
                String s = AccountManager.get(context0).getPassword(account0);
                rx.o o0 = uk.IF(this.e, s, null, null, null, this.f, this.g).y5((Object object0) -> {
                    L.p(new com.dcinside.app.post.c0.I.a(this.h, this.i, this.j), "$tmp0");
                    new com.dcinside.app.post.c0.I.a(this.h, this.i, this.j).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this.j, "this$0");
                    Dl.D(this.j, 0x7F150148);  // string:best_galler_fail_login "갤러콘 조회를 위한 로그인 정보를 찾을 수 없습니다.\n다시 로그인해주세요."
                    rx.o o0 = this.j.P;
                    if(o0 != null) {
                        o0.l();
                    }
                });
                L.o(o0, "subscribe(...)");
                return o0;
            }

            // 检测为 Lambda 实现
            private static final void d(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void e(c0 c00, Throwable throwable0) [...]

            @Override  // A3.a
            public Object invoke() {
                return this.c();
            }
        }

        com.dcinside.app.realm.B b0 = com.dcinside.app.realm.B.E.V(this.F1());
        if(b0 == null) {
            String s = intent0.getStringExtra("com.dcinside.app.EXTRA_DC_ADULT_CODE");
            if(s == null) {
                com.hjq.toast.s.A(0x7F150BCB);  // string:wrong_adult_data "성인 인증 정보가 잘못되었습니다."
                return;
            }
            String s1 = intent0.getStringExtra("com.dcinside.app.EXTRA_DC_ADULT_EXPIRE_DATE");
            if(s1 == null) {
                com.hjq.toast.s.A(0x7F150BCB);  // string:wrong_adult_data "성인 인증 정보가 잘못되었습니다."
                return;
            }
            Date date0 = Bk.j(s1);
            if(date0 == null) {
                com.hjq.toast.s.A(0x7F150BCB);  // string:wrong_adult_data "성인 인증 정보가 잘못되었습니다."
                return;
            }
            dl.a.d4(s);
            long v = date0.getTime();
            dl.a.e4(v);
            S0 s00 = this.w3();
            if(s00 != null) {
                S0.A4(s00, false, 1, null);
            }
            N3 n30 = this.y3();
            if(n30 != null) {
                N3.Y7(n30, false, 1, null);
            }
        }
        else {
            boolean z = b0.e6();
            boolean z1 = b0.g6();
            String s2 = b0.r6();
            String s3 = b0.n6();
            String s4 = b0.Z5();
            if(s2 == null) {
                com.hjq.toast.s.A(0x7F15032D);  // string:failed_refresh_login_info "계정 정보 갱신을 실패했습니다."
                return;
            }
            rx.o o0 = this.P;
            if(o0 != null) {
                o0.l();
            }
            this.P = com.dcinside.app.perform.e.e.a(this).m().A(new com.dcinside.app.post.c0.I(s2, s3, s4, z, z1, this)).b().t5();
        }
    }

    private final void x5() {
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            return;
        }
        if(!intent0.getBooleanExtra("com.dcinside.app.extra.FROM_BROWSER", false)) {
            return;
        }
        if(!ll.L()) {
            return;
        }
        ll.l0();
        intent0.putExtra("com.dcinside.app.extra.FROM_BROWSER", false);
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x1020002);
        ViewGroup viewGroup1 = null;
        View view0 = viewGroup0 == null ? null : viewGroup0.getChildAt(0);
        if(view0 instanceof ViewGroup) {
            viewGroup1 = (ViewGroup)view0;
        }
        if(viewGroup1 == null) {
            return;
        }
        Snackbar.D0(viewGroup1, 0x7F1500C3, 0).G0(0x7F1500C2, (View view0) -> {
            L.p(this, "this$0");
            this.K4();
        }).m0();
    }

    private final N3 y3() {
        Fragment fragment0 = this.getSupportFragmentManager().r0(0x7F0B0A37);  // id:post_container_fragment_read
        return fragment0 instanceof N3 ? ((N3)fragment0) : null;
    }

    private final void y4() {
        rx.o o0 = this.P;
        if(o0 != null) {
            o0.l();
        }
        this.P = com.dcinside.app.realm.B.E.h0(this.F1(), this);
    }

    // 检测为 Lambda 实现
    private static final void y5(c0 c00, View view0) [...]

    private final void z3() {
        if(this.isFinishing()) {
            return;
        }
        super.finish();
        this.overridePendingTransition(0x7F010055, 0x7F010054);  // anim:read_stay
    }

    private final void z4(com.dcinside.app.rx.bus.k k0) {
        kotlin.V[] arr_v = {r0.a("com.dcinside.app.hit.BestGallerConSettingDialogFragment_EXTRA_IS_GO_NICK", Boolean.valueOf(k0.b())), r0.a("com.dcinside.app.hit.BestGallerConSettingDialogFragment_EXTRA_IS_ENABLE_GALLER_CON", Boolean.valueOf(k0.a()))};
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = e.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.best.e");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.best.BestGallerConSettingDialogFragment");
        }
        ((e)fragment0).setArguments(BundleKt.b(((kotlin.V[])Arrays.copyOf(arr_v, 2))));
        ((e)fragment0).show(fragmentManager0, "com.dcinside.app.best.e");
        this.O = (e)fragment0;
    }

    private final void z5() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.PostContainerActivity$showImageNoteInputView$1", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostContainerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity$showImageNoteInputView$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1926:1\n257#2,2:1927\n*S KotlinDebug\n*F\n+ 1 PostContainerActivity.kt\ncom/dcinside/app/post/PostContainerActivity$showImageNoteInputView$1\n*L\n1914#1:1927,2\n*E\n"})
        static final class com.dcinside.app.post.c0.U extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final c0 l;

            com.dcinside.app.post.c0.U(c0 c00, kotlin.coroutines.d d0) {
                this.l = c00;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.c0.U(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((kotlinx.coroutines.O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l kotlinx.coroutines.O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.post.c0.U)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                com.dcinside.app.model.Q q0 = null;
                if(this.l.X == null) {
                    C c0 = new C(this.l);
                    this.l.X = c0;
                    g0 g00 = this.l.w;
                    if(g00 == null) {
                        L.S("binding");
                        g00 = null;
                    }
                    g00.k().addView(this.l.X);
                }
                g0 g01 = this.l.w;
                if(g01 == null) {
                    L.S("binding");
                    g01 = null;
                }
                g01.k().setVisibility(0);
                C c1 = this.l.X;
                if(c1 != null) {
                    N3 n30 = this.l.y3();
                    if(n30 != null) {
                        q0 = n30.m5();
                    }
                    c1.e0(q0);
                }
                return kotlin.S0.a;
            }
        }

        k.f(LifecycleOwnerKt.a(this), kotlinx.coroutines.h0.e(), null, new com.dcinside.app.post.c0.U(this, null), 2, null);
    }
}

