package com.dcinside.app.settings.image.auto;

import A3.q;
import Y.N;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.album.AlbumActivity;
import com.dcinside.app.base.g;
import com.dcinside.app.http.p;
import com.dcinside.app.image.ImageViewerActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.rx.bus.m0;
import com.dcinside.app.rx.bus.x;
import com.dcinside.app.settings.image.model.AutoImage;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.uk;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import rx.o;
import rx.subscriptions.f;
import y4.l;
import y4.m;

@s0({"SMAP\nMyAutoImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,644:1\n35#2:645\n257#3,2:646\n257#3,2:648\n257#3,2:650\n257#3,2:652\n257#3,2:655\n257#3,2:657\n257#3,2:659\n257#3,2:661\n257#3,2:663\n257#3,2:665\n257#3,2:667\n257#3,2:669\n257#3,2:671\n257#3,2:673\n257#3,2:675\n257#3,2:677\n257#3,2:679\n257#3,2:692\n257#3,2:694\n257#3,2:696\n257#3,2:700\n257#3,2:702\n257#3,2:704\n255#3:730\n257#3,2:731\n257#3,2:733\n257#3,2:735\n255#3:741\n257#3,2:746\n257#3,2:748\n25#4:654\n25#4:688\n25#4:698\n25#4:699\n25#4:706\n25#4:729\n25#4:737\n25#4:738\n25#4:742\n360#5,7:681\n827#5:713\n855#5,2:714\n1611#5,9:716\n1863#5:725\n1864#5:727\n1620#5:728\n774#5:743\n865#5,2:744\n1611#5,9:752\n1863#5:761\n1864#5:763\n1620#5:764\n60#6:689\n60#6:691\n1#7:690\n1#7:726\n1#7:762\n11102#8:707\n11437#8,3:708\n37#9,2:711\n37#9,2:739\n37#9,2:750\n*S KotlinDebug\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity\n*L\n64#1:645\n132#1:646,2\n133#1:648,2\n161#1:650,2\n168#1:652,2\n175#1:655,2\n176#1:657,2\n180#1:659,2\n181#1:661,2\n183#1:663,2\n184#1:665,2\n187#1:667,2\n189#1:669,2\n190#1:671,2\n191#1:673,2\n193#1:675,2\n194#1:677,2\n195#1:679,2\n308#1:692,2\n314#1:694,2\n321#1:696,2\n367#1:700,2\n371#1:702,2\n375#1:704,2\n425#1:730\n469#1:731,2\n470#1:733,2\n471#1:735,2\n516#1:741\n220#1:746,2\n267#1:748,2\n172#1:654\n221#1:688\n322#1:698\n346#1:699\n391#1:706\n415#1:729\n472#1:737\n506#1:738\n548#1:742\n201#1:681,7\n394#1:713\n394#1:714,2\n394#1:716,9\n394#1:725\n394#1:727\n394#1:728\n550#1:743\n550#1:744,2\n419#1:752,9\n419#1:761\n419#1:763\n419#1:764\n222#1:689\n225#1:691\n394#1:726\n419#1:762\n392#1:707\n392#1:708,3\n392#1:711,2\n512#1:739,2\n235#1:750,2\n*E\n"})
public final class MyAutoImageActivity extends g implements PermissionListener {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, boolean z, @m int[] arr_v, @m ActivityResultLauncher activityResultLauncher0) {
            L.p(context0, "context");
            Intent intent0 = new Intent(context0, MyAutoImageActivity.class);
            intent0.putExtra("MyAutoImageActivity_EXTRA_CAN_ADD_IMAGE", z);
            intent0.putExtra("MyAutoImageActivity_EXTRA_SELECTED_IMAGES", arr_v);
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
                return;
            }
            context0.startActivity(intent0);
        }

        public static void b(a myAutoImageActivity$a0, Context context0, boolean z, int[] arr_v, ActivityResultLauncher activityResultLauncher0, int v, Object object0) {
            if((v & 2) != 0) {
                z = false;
            }
            if((v & 4) != 0) {
                arr_v = null;
            }
            if((v & 8) != 0) {
                activityResultLauncher0 = null;
            }
            myAutoImageActivity$a0.a(context0, z, arr_v, activityResultLauncher0);
        }
    }

    static final class b extends SpanSizeLookup {
        private int e;

        public b(int v) {
            this.e = v;
        }

        @Override  // androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup
        public int f(int v) {
            return 1;
        }

        public final void m(int v) {
            this.e = v;
        }
    }

    @s0({"SMAP\nMyAutoImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$ProgressHandler\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,644:1\n147#2:645\n255#3:646\n257#3,2:647\n257#3,2:649\n257#3,2:651\n*S KotlinDebug\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$ProgressHandler\n*L\n620#1:645\n632#1:646\n633#1:647,2\n634#1:649,2\n635#1:651,2\n*E\n"})
    static final class c extends Handler {
        @l
        private final t a;

        public c(@l MyAutoImageActivity myAutoImageActivity0) {
            L.p(myAutoImageActivity0, "activity");
            super(Looper.getMainLooper());
            this.a = new t(myAutoImageActivity0);
        }

        @Override  // android.os.Handler
        public void handleMessage(@l Message message0) {
            L.p(message0, "msg");
            MyAutoImageActivity myAutoImageActivity0 = (MyAutoImageActivity)this.a.a();
            if(myAutoImageActivity0 == null) {
                return;
            }
            int v = message0.arg1;
            N n0 = myAutoImageActivity0.w;
            N n1 = null;
            if(n0 == null) {
                L.S("binding");
                n0 = null;
            }
            LinearLayout linearLayout0 = n0.u;
            L.o(linearLayout0, "myAutoImageProgressContainer");
            N n2 = myAutoImageActivity0.w;
            if(n2 == null) {
                L.S("binding");
                n2 = null;
            }
            ProgressBar progressBar0 = n2.w;
            L.o(progressBar0, "myAutoImageProgressUpload");
            N n3 = myAutoImageActivity0.w;
            if(n3 == null) {
                L.S("binding");
            }
            else {
                n1 = n3;
            }
            TextView textView0 = n1.v;
            L.o(textView0, "myAutoImageProgressText");
            if(v >= 1 && progressBar0.getMax() > v) {
                if(linearLayout0.getVisibility() != 0) {
                    linearLayout0.setVisibility(0);
                    progressBar0.setVisibility(0);
                    textView0.setVisibility(0);
                }
                String s = myAutoImageActivity0.getString(0x7F150124, new Object[]{((int)(v / 100))});  // string:auto_image_upload_progress "이미지 등록 중 (%1$d%%)"
                L.o(s, "getString(...)");
                textView0.setText(s);
                return;
            }
            L.o("이미지 썸네일 생성 중", "getString(...)");
            textView0.setText("이미지 썸네일 생성 중");
        }
    }

    private b A;
    private OnBackPressedCallback B;
    private o C;
    private o D;
    private o E;
    private o F;
    @m
    private rx.subscriptions.b G;
    private ActivityResultLauncher H;
    private com.afollestad.dragselectrecyclerview.b I;
    @l
    private c J;
    @m
    private p K;
    @l
    public static final a L = null;
    @l
    private static final String M = "MyAutoImageActivity_EXTRA_CAN_ADD_IMAGE";
    @l
    private static final String N = "MyAutoImageActivity_EXTRA_SELECTED_IMAGES";
    @l
    private static final String O = "auto_image";
    @l
    private static final String P = "내 자짤 이미지";
    private N w;
    private boolean x;
    private boolean y;
    private int z;

    static {
        MyAutoImageActivity.L = new a(null);
    }

    public MyAutoImageActivity() {
        this.C = f.e();
        this.D = f.e();
        this.E = f.e();
        this.F = f.e();
        this.J = new c(this);
    }

    private final void C2(boolean z) {
        N n0 = this.w;
        N n1 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        L.o(n0.m, "myAutoImageDeleteMenu");
        int v = 8;
        n0.m.setVisibility((z ? 8 : 0));
        N n2 = this.w;
        if(n2 == null) {
            L.S("binding");
            n2 = null;
        }
        L.o(n2.j, "myAutoImageCheckAllWrap");
        n2.j.setVisibility((z ? 0 : 8));
        N n3 = this.w;
        if(n3 == null) {
            L.S("binding");
            n3 = null;
        }
        ConstraintLayout constraintLayout0 = n3.B;
        L.o(constraintLayout0, "myAutoImageUploadWrap");
        if(!z) {
            v = 0;
        }
        constraintLayout0.setVisibility(v);
        N n4 = this.w;
        if(n4 == null) {
            L.S("binding");
            n4 = null;
        }
        L.o(n4.x, "myAutoImageRecycler");
        Adapter recyclerView$Adapter0 = n4.x.getAdapter();
        if(!(recyclerView$Adapter0 instanceof Q)) {
            recyclerView$Adapter0 = null;
        }
        if(((Q)recyclerView$Adapter0) == null) {
            return;
        }
        N n5 = this.w;
        if(n5 == null) {
            L.S("binding");
        }
        else {
            n1 = n5;
        }
        n1.h.setChecked(false);
        ((Q)recyclerView$Adapter0).A().clear();
        ((Q)recyclerView$Adapter0).notifyItemRangeChanged(0, ((Q)recyclerView$Adapter0).getItemCount());
        ((Q)recyclerView$Adapter0).v(z);
        this.w3();
    }

    private final int D2() {
        Configuration configuration0 = this.getResources().getConfiguration();
        L.o(configuration0, "getConfiguration(...)");
        return Math.max(((int)Math.ceil(((double)configuration0.screenWidthDp) / 150.0)), 3);
    }

    private final void E2() {
        static final class d extends kotlin.jvm.internal.N implements Function1 {
            final MyAutoImageActivity e;

            d(MyAutoImageActivity myAutoImageActivity0) {
                this.e = myAutoImageActivity0;
                super(1);
            }

            public final void a(m0 m00) {
                L.m(m00);
                this.e.Y2(m00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((m0)object0));
                return S0.a;
            }
        }


        static final class e extends kotlin.jvm.internal.N implements Function1 {
            final MyAutoImageActivity e;

            e(MyAutoImageActivity myAutoImageActivity0) {
                this.e = myAutoImageActivity0;
                super(1);
            }

            public final void a(x x0) {
                this.e.X2(x0.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((x)object0));
                return S0.a;
            }
        }


        @s0({"SMAP\nMyAutoImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$initCallbacks$14$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,644:1\n257#2,2:645\n*S KotlinDebug\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$initCallbacks$14$1\n*L\n249#1:645,2\n*E\n"})
        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.f extends kotlin.jvm.internal.N implements Function1 {
            final MyAutoImageActivity e;

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.f(MyAutoImageActivity myAutoImageActivity0) {
                this.e = myAutoImageActivity0;
                super(1);
            }

            public final void c(j0.e e0) {
                @s0({"SMAP\nMyAutoImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$initCallbacks$14$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,644:1\n257#2,2:645\n25#3:647\n1#4:648\n1#4:659\n1611#5,9:649\n1863#5:658\n1864#5:660\n1620#5:661\n*S KotlinDebug\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$initCallbacks$14$1$1\n*L\n242#1:645,2\n243#1:647\n245#1:659\n245#1:649,9\n245#1:658\n245#1:660\n245#1:661\n*E\n"})
                static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.f.a extends kotlin.jvm.internal.N implements Function1 {
                    final MyAutoImageActivity e;

                    com.dcinside.app.settings.image.auto.MyAutoImageActivity.f.a(MyAutoImageActivity myAutoImageActivity0) {
                        this.e = myAutoImageActivity0;
                        super(1);
                    }

                    public final void a(j0.e e0) {
                        int[] arr_v;
                        Integer integer0;
                        N n0 = this.e.w;
                        N n1 = null;
                        if(n0 == null) {
                            L.S("binding");
                            n0 = null;
                        }
                        L.o(n0.u, "myAutoImageProgressContainer");
                        n0.u.setVisibility(8);
                        N n2 = this.e.w;
                        if(n2 == null) {
                            L.S("binding");
                            n2 = null;
                        }
                        L.o(n2.x, "myAutoImageRecycler");
                        Adapter recyclerView$Adapter0 = n2.x.getAdapter();
                        if(!(recyclerView$Adapter0 instanceof Q)) {
                            recyclerView$Adapter0 = null;
                        }
                        List list0 = ((Q)recyclerView$Adapter0) == null ? null : ((Q)recyclerView$Adapter0).A();
                        if(list0 == null || list0.isEmpty()) {
                            list0 = null;
                        }
                        if(list0 == null) {
                            arr_v = null;
                        }
                        else {
                            ArrayList arrayList0 = new ArrayList();
                            for(Object object0: list0) {
                                int v = ((Number)object0).intValue();
                                if(((Q)recyclerView$Adapter0) == null) {
                                    integer0 = null;
                                }
                                else {
                                    AutoImage autoImage0 = ((Q)recyclerView$Adapter0).x(v);
                                    if(autoImage0 != null) {
                                        integer0 = autoImage0.l();
                                    }
                                }
                                if(integer0 != null) {
                                    arrayList0.add(integer0);
                                }
                            }
                            arr_v = u.U5(arrayList0);
                        }
                        L.m(e0);
                        MyAutoImageActivity.p3(this.e, e0, arr_v, false, 4, null);
                        N n3 = this.e.w;
                        if(n3 == null) {
                            L.S("binding");
                        }
                        else {
                            n1 = n3;
                        }
                        n1.x.scrollToPosition(0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((j0.e)object0));
                        return S0.a;
                    }
                }

                this.e.r3(true);
                o o0 = this.e.F;
                if(o0 != null) {
                    o0.l();
                }
                o o1 = this.e.D;
                if(o1 != null) {
                    o1.l();
                }
                o o2 = uk.Dk().y5((Object object0) -> {
                    L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.f.a(this.e), "$tmp0");
                    new com.dcinside.app.settings.image.auto.MyAutoImageActivity.f.a(this.e).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this.e, "this$0");
                    N n0 = this.e.w;
                    if(n0 == null) {
                        L.S("binding");
                        n0 = null;
                    }
                    L.o(n0.u, "myAutoImageProgressContainer");
                    n0.u.setVisibility(8);
                });
                this.e.D = o2;
            }

            // 检测为 Lambda 实现
            private static final void d(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void e(MyAutoImageActivity myAutoImageActivity0, Throwable throwable0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.c(((j0.e)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.g extends kotlin.jvm.internal.N implements Function1 {
            final Throwable e;

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.g(Throwable throwable0) {
                this.e = throwable0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.n(this.e.getMessage());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class h extends kotlin.jvm.internal.N implements Function1 {
            final MyAutoImageActivity e;

            h(MyAutoImageActivity myAutoImageActivity0) {
                this.e = myAutoImageActivity0;
                super(1);
            }

            public static void a(Throwable throwable0) {
            }

            public final void c(Boolean boolean0) {
                @s0({"SMAP\nMyAutoImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$initCallbacks$14$2$2$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,644:1\n25#2:645\n1#3:646\n1#3:657\n1611#4,9:647\n1863#4:656\n1864#4:658\n1620#4:659\n*S KotlinDebug\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$initCallbacks$14$2$2$1\n*L\n261#1:645\n263#1:657\n263#1:647,9\n263#1:656\n263#1:658\n263#1:659\n*E\n"})
                static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.h.a extends kotlin.jvm.internal.N implements Function1 {
                    final MyAutoImageActivity e;

                    com.dcinside.app.settings.image.auto.MyAutoImageActivity.h.a(MyAutoImageActivity myAutoImageActivity0) {
                        this.e = myAutoImageActivity0;
                        super(1);
                    }

                    public final void a(j0.e e0) {
                        Integer integer0;
                        N n0 = this.e.w;
                        int[] arr_v = null;
                        if(n0 == null) {
                            L.S("binding");
                            n0 = null;
                        }
                        L.o(n0.x, "myAutoImageRecycler");
                        Adapter recyclerView$Adapter0 = n0.x.getAdapter();
                        if(!(recyclerView$Adapter0 instanceof Q)) {
                            recyclerView$Adapter0 = null;
                        }
                        List list0 = ((Q)recyclerView$Adapter0) == null ? null : ((Q)recyclerView$Adapter0).A();
                        if(list0 == null || list0.isEmpty()) {
                            list0 = null;
                        }
                        if(list0 != null) {
                            ArrayList arrayList0 = new ArrayList();
                            for(Object object0: list0) {
                                int v = ((Number)object0).intValue();
                                if(((Q)recyclerView$Adapter0) == null) {
                                    integer0 = null;
                                }
                                else {
                                    AutoImage autoImage0 = ((Q)recyclerView$Adapter0).x(v);
                                    if(autoImage0 != null) {
                                        integer0 = autoImage0.l();
                                    }
                                }
                                if(integer0 != null) {
                                    arrayList0.add(integer0);
                                }
                            }
                            arr_v = u.U5(arrayList0);
                        }
                        L.m(e0);
                        MyAutoImageActivity.p3(this.e, e0, arr_v, false, 4, null);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((j0.e)object0));
                        return S0.a;
                    }
                }

                o o0 = this.e.D;
                if(o0 != null) {
                    o0.l();
                }
                o o1 = uk.Dk().y5((Object object0) -> {
                    L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.h.a(this.e), "$tmp0");
                    new com.dcinside.app.settings.image.auto.MyAutoImageActivity.h.a(this.e).invoke(object0);
                }, new H());
                this.e.D = o1;
            }

            // 检测为 Lambda 实现
            private static final void d(Function1 function10, Object object0) [...]

            private static final void e(Throwable throwable0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.c(((Boolean)object0));
                return S0.a;
            }
        }


        @s0({"SMAP\nMyAutoImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$initCallbacks$15\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,644:1\n255#2:645\n*S KotlinDebug\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$initCallbacks$15\n*L\n277#1:645\n*E\n"})
        public static final class i extends OnBackPressedCallback {
            final MyAutoImageActivity d;

            i(MyAutoImageActivity myAutoImageActivity0) {
                this.d = myAutoImageActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.a extends kotlin.jvm.internal.N implements Function1 {
                    public static final com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.a e;

                    static {
                        com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.a.e = new com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.a();
                    }

                    com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.a() {
                        super(1);
                    }

                    @m
                    public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                        L.p(p$a0, "it");
                        return p$a0.m(0x7F150120);  // string:auto_image_upload_cancel_confirm "\"확인\"을 누르면 이전 화면으로 돌아갑니다. 업로드 중인 이미지는 
                                                    // 취소됩니다."
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((com.dcinside.app.perform.p.a)object0));
                    }
                }


                static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.b extends kotlin.jvm.internal.N implements Function1 {
                    public static final com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.b e;

                    static {
                        com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.b.e = new com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.b();
                    }

                    com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.b() {
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


                static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.c extends kotlin.jvm.internal.N implements Function1 {
                    final MyAutoImageActivity e;

                    com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.c(MyAutoImageActivity myAutoImageActivity0) {
                        this.e = myAutoImageActivity0;
                        super(1);
                    }

                    public final void a(Boolean boolean0) {
                        this.e.finish();
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Boolean)object0));
                        return S0.a;
                    }
                }

                if(this.d.x) {
                    this.d.q3(false);
                    return;
                }
                N n0 = this.d.w;
                if(n0 == null) {
                    L.S("binding");
                    n0 = null;
                }
                L.o(n0.u, "myAutoImageProgressContainer");
                if(n0.u.getVisibility() == 0) {
                    com.dcinside.app.perform.e.e.a(this.d).n(com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.a.e).z(0x7F15034A).x(0x1040000).b().Z1((Object object0) -> {
                        L.p(com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.b.e, "$tmp0");
                        return (Boolean)com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.b.e.invoke(object0);
                    }).x5((Object object0) -> {
                        L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.c(this.d), "$tmp0");
                        new com.dcinside.app.settings.image.auto.MyAutoImageActivity.i.c(this.d).invoke(object0);
                    });
                    return;
                }
                Intent intent0 = new Intent();
                intent0.putExtra("DefaultImageSettingActivity_EXTRA_MY_IMAGE_CHANGED", this.d.y);
                this.d.setResult(-1, intent0);
                this.d.finish();
            }

            // 检测为 Lambda 实现
            private static final Boolean q(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void r(Function1 function10, Object object0) [...]
        }


        static final class j extends kotlin.jvm.internal.N implements A3.a {
            final MyAutoImageActivity e;

            j(MyAutoImageActivity myAutoImageActivity0) {
                this.e = myAutoImageActivity0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.l3();
            }
        }


        static final class k extends kotlin.jvm.internal.N implements Function1 {
            final MyAutoImageActivity e;

            k(MyAutoImageActivity myAutoImageActivity0) {
                this.e = myAutoImageActivity0;
                super(1);
            }

            public final void a(@l Integer[] arr_integer) {
                L.p(arr_integer, "it");
                this.e.s3(arr_integer);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer[])object0));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.image.auto.MyAutoImageActivity$initCallbacks$4", f = "MyAutoImageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.l extends kotlin.coroutines.jvm.internal.o implements q {
            int k;
            boolean l;
            final MyAutoImageActivity m;

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.l(MyAutoImageActivity myAutoImageActivity0, kotlin.coroutines.d d0) {
                this.m = myAutoImageActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.image.auto.MyAutoImageActivity.l myAutoImageActivity$l0 = new com.dcinside.app.settings.image.auto.MyAutoImageActivity.l(this.m, d0);
                myAutoImageActivity$l0.l = z;
                return myAutoImageActivity$l0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.Z2(this.l);
                return S0.a;
            }
        }

        N n0 = this.w;
        OnBackPressedCallback onBackPressedCallback0 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        z z0 = new z();
        n0.u.setOnClickListener(z0);
        N n1 = this.w;
        if(n1 == null) {
            L.S("binding");
            n1 = null;
        }
        B b0 = (View view0) -> {
            L.p(this, "this$0");
            N n0 = this.w;
            N n1 = null;
            if(n0 == null) {
                L.S("binding");
                n0 = null;
            }
            CheckBox checkBox0 = n0.h;
            N n2 = this.w;
            if(n2 == null) {
                L.S("binding");
            }
            else {
                n1 = n2;
            }
            checkBox0.setChecked(!n1.h.isChecked());
        };
        n1.j.setOnClickListener(b0);
        N n2 = this.w;
        if(n2 == null) {
            L.S("binding");
            n2 = null;
        }
        C c0 = (View view0) -> {
            L.p(this, "this$0");
            N n0 = this.w;
            N n1 = null;
            if(n0 == null) {
                L.S("binding");
                n0 = null;
            }
            CheckBox checkBox0 = n0.h;
            N n2 = this.w;
            if(n2 == null) {
                L.S("binding");
            }
            else {
                n1 = n2;
            }
            checkBox0.setChecked(!n1.h.isChecked());
        };
        n2.i.setOnClickListener(c0);
        N n3 = this.w;
        if(n3 == null) {
            L.S("binding");
            n3 = null;
        }
        L.o(n3.h, "myAutoImageCheckAll");
        com.dcinside.app.settings.image.auto.MyAutoImageActivity.l myAutoImageActivity$l0 = new com.dcinside.app.settings.image.auto.MyAutoImageActivity.l(this, null);
        r.J(n3.h, null, myAutoImageActivity$l0, 1, null);
        N n4 = this.w;
        if(n4 == null) {
            L.S("binding");
            n4 = null;
        }
        D d0 = (View view0) -> {
            L.p(this, "this$0");
            this.m3();
        };
        n4.A.setOnClickListener(d0);
        N n5 = this.w;
        if(n5 == null) {
            L.S("binding");
            n5 = null;
        }
        com.dcinside.app.settings.image.auto.h h0 = (View view0) -> {
            L.p(this, "this$0");
            this.i3();
        };
        n5.m.setOnClickListener(h0);
        N n6 = this.w;
        if(n6 == null) {
            L.S("binding");
            n6 = null;
        }
        com.dcinside.app.settings.image.auto.i i0 = (View view0) -> {
            L.p(this, "this$0");
            this.h3();
        };
        n6.l.setOnClickListener(i0);
        N n7 = this.w;
        if(n7 == null) {
            L.S("binding");
            n7 = null;
        }
        com.dcinside.app.settings.image.auto.j j0 = (View view0) -> {
            L.p(this, "this$0");
            this.a3();
        };
        n7.k.setOnClickListener(j0);
        N n8 = this.w;
        if(n8 == null) {
            L.S("binding");
            n8 = null;
        }
        com.dcinside.app.settings.image.auto.k k0 = (View view0) -> {
            L.m(view0);
            view0.setVisibility(8);
        };
        n8.o.setOnClickListener(k0);
        N n9 = this.w;
        if(n9 == null) {
            L.S("binding");
            n9 = null;
        }
        L.o(n9.x, "myAutoImageRecycler");
        Adapter recyclerView$Adapter0 = n9.x.getAdapter();
        if(!(recyclerView$Adapter0 instanceof Q)) {
            recyclerView$Adapter0 = null;
        }
        if(((Q)recyclerView$Adapter0) == null) {
            return;
        }
        o o0 = com.dcinside.app.rx.bus.c.c(this, m0.class).x5((Object object0) -> {
            L.p(new d(this), "$tmp0");
            new d(this).invoke(object0);
        });
        rx.subscriptions.b b1 = this.G;
        if(b1 != null) {
            b1.a(o0);
        }
        o o1 = com.dcinside.app.rx.bus.c.c(this, x.class).x5((Object object0) -> {
            L.p(new e(this), "$tmp0");
            new e(this).invoke(object0);
        });
        rx.subscriptions.b b2 = this.G;
        if(b2 != null) {
            b2.a(o1);
        }
        this.H = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "it");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 != null) {
                    ArrayList arrayList0 = intent0.getStringArrayListExtra("intent_path");
                    if(arrayList0 != null && !arrayList0.isEmpty()) {
                        this.C.l();
                        this.K = new p(arrayList0.size(), this.J);
                        this.C = uk.QG(((String[])arrayList0.toArray(new String[0])), this.K).y5((Object object0) -> {
                            L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.f(myAutoImageActivity0), "$tmp0");
                            new com.dcinside.app.settings.image.auto.MyAutoImageActivity.f(myAutoImageActivity0).invoke(object0);
                        }, (Throwable throwable0) -> {
                            L.p(myAutoImageActivity0, "this$0");
                            o o0 = myAutoImageActivity0.F;
                            if(o0 != null) {
                                o0.l();
                            }
                            myAutoImageActivity0.F = com.dcinside.app.perform.e.e.a(myAutoImageActivity0).n(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.g(throwable0)).z(0x7F15034A).b().x5((Object object0) -> {
                                L.p(new h(myAutoImageActivity0), "$tmp0");
                                new h(myAutoImageActivity0).invoke(object0);
                            });
                            N n0 = myAutoImageActivity0.w;
                            if(n0 == null) {
                                L.S("binding");
                                n0 = null;
                            }
                            L.o(n0.u, "myAutoImageProgressContainer");
                            n0.u.setVisibility(8);
                        });
                    }
                }
            }
        });
        this.B = new i(this);
        OnBackPressedDispatcher onBackPressedDispatcher0 = this.getOnBackPressedDispatcher();
        OnBackPressedCallback onBackPressedCallback1 = this.B;
        if(onBackPressedCallback1 == null) {
            L.S("onBackPressedCallback");
        }
        else {
            onBackPressedCallback0 = onBackPressedCallback1;
        }
        onBackPressedDispatcher0.i(this, onBackPressedCallback0);
        ((Q)recyclerView$Adapter0).I(new j(this));
        ((Q)recyclerView$Adapter0).H(new k(this));
    }

    // 检测为 Lambda 实现
    private static final void F2(View view0) [...]

    // 检测为 Lambda 实现
    private static final void G2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void H2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void I2(MyAutoImageActivity myAutoImageActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void J2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void K2(MyAutoImageActivity myAutoImageActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void L2(Function1 function10, Object object0) [...]

    private static final void M2(View view0) {
    }

    // 检测为 Lambda 实现
    private static final void N2(MyAutoImageActivity myAutoImageActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void O2(MyAutoImageActivity myAutoImageActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void P2(MyAutoImageActivity myAutoImageActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void Q2(MyAutoImageActivity myAutoImageActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void R2(MyAutoImageActivity myAutoImageActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void S2(MyAutoImageActivity myAutoImageActivity0, View view0) [...]

    private final void T2() {
        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.m extends kotlin.jvm.internal.N implements Function1 {
            final MyAutoImageActivity e;
            final boolean f;

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.m(MyAutoImageActivity myAutoImageActivity0, boolean z) {
                this.e = myAutoImageActivity0;
                this.f = z;
                super(1);
            }

            public final void a(j0.e e0) {
                this.e.n3(false);
                int[] arr_v = this.f ? this.e.getIntent().getIntArrayExtra("MyAutoImageActivity_EXTRA_SELECTED_IMAGES") : null;
                L.m(e0);
                MyAutoImageActivity.p3(this.e, e0, arr_v, false, 4, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((j0.e)object0));
                return S0.a;
            }
        }

        boolean z = this.getIntent().getBooleanExtra("MyAutoImageActivity_EXTRA_CAN_ADD_IMAGE", false);
        com.dcinside.app.realm.B b0 = com.dcinside.app.realm.B.E.V(this.F1());
        N n0 = null;
        if(b0 == null) {
            N n3 = this.w;
            if(n3 == null) {
                L.S("binding");
                n3 = null;
            }
            L.o(n3.s, "myAutoImageProfileName");
            n3.s.setVisibility(8);
            N n4 = this.w;
            if(n4 == null) {
                L.S("binding");
                n4 = null;
            }
            L.o(n4.r, "myAutoImageProfileIcon");
            n4.r.setVisibility(8);
        }
        else {
            com.dcinside.app.main.login.g g0 = com.dcinside.app.main.login.g.a;
            N n1 = this.w;
            if(n1 == null) {
                L.S("binding");
                n1 = null;
            }
            TextView textView0 = n1.s;
            L.o(textView0, "myAutoImageProfileName");
            N n2 = this.w;
            if(n2 == null) {
                L.S("binding");
                n2 = null;
            }
            L.o(n2.r, "myAutoImageProfileIcon");
            g0.u(textView0, n2.r, b0);
        }
        this.n3(true);
        Q q0 = new Q(z);
        GridLayoutManager gridLayoutManager0 = new GridLayoutManager(this, this.D2(), 1, false);
        com.dcinside.app.settings.image.auto.f f0 = new com.dcinside.app.settings.image.auto.f(q0);
        this.I = com.afollestad.dragselectrecyclerview.b.a.b(com.afollestad.dragselectrecyclerview.b.w, this, f0, null, 4, null);
        N n5 = this.w;
        if(n5 == null) {
            L.S("binding");
            n5 = null;
        }
        RecyclerView recyclerView0 = n5.x;
        com.afollestad.dragselectrecyclerview.b b1 = this.I;
        if(b1 == null) {
            L.S("touchListener");
            b1 = null;
        }
        recyclerView0.addOnItemTouchListener(b1);
        b myAutoImageActivity$b0 = new b(this.D2());
        this.A = myAutoImageActivity$b0;
        gridLayoutManager0.m4(myAutoImageActivity$b0);
        N n6 = this.w;
        if(n6 == null) {
            L.S("binding");
            n6 = null;
        }
        n6.x.setLayoutManager(gridLayoutManager0);
        N n7 = this.w;
        if(n7 == null) {
            L.S("binding");
            n7 = null;
        }
        n7.x.setItemAnimator(null);
        N n8 = this.w;
        if(n8 == null) {
            L.S("binding");
        }
        else {
            n0 = n8;
        }
        n0.x.setAdapter(q0);
        this.D = uk.Dk().y5((Object object0) -> {
            L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.m(this, z), "$tmp0");
            new com.dcinside.app.settings.image.auto.MyAutoImageActivity.m(this, z).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.n3(false);
        });
    }

    // 检测为 Lambda 实现
    private static final void U2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void V2(MyAutoImageActivity myAutoImageActivity0, Throwable throwable0) [...]

    private final void W2(boolean z) {
        N n0 = this.w;
        N n1 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        n0.k.setEnabled(z);
        N n2 = this.w;
        if(n2 == null) {
            L.S("binding");
        }
        else {
            n1 = n2;
        }
        n1.k.setAlpha((z ? 1.0f : 0.5f));
    }

    private final void X2(int v) {
        N n0 = this.w;
        com.afollestad.dragselectrecyclerview.b b0 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        L.o(n0.x, "myAutoImageRecycler");
        Adapter recyclerView$Adapter0 = n0.x.getAdapter();
        if(!(recyclerView$Adapter0 instanceof Q)) {
            recyclerView$Adapter0 = null;
        }
        if(((Q)recyclerView$Adapter0) != null) {
            ((Q)recyclerView$Adapter0).z().clear();
            ((Q)recyclerView$Adapter0).z().addAll(((Q)recyclerView$Adapter0).A());
        }
        com.afollestad.dragselectrecyclerview.b b1 = this.I;
        if(b1 == null) {
            L.S("touchListener");
        }
        else {
            b0 = b1;
        }
        b0.v(true, v);
    }

    private final void Y2(m0 m00) {
        Intent intent0 = new Intent(this, ImageViewerActivity.class);
        intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", "auto_image");
        intent0.putExtra("com.dcinside.app.extra.POST_NUMBER", m00.g());
        intent0.putExtra("com.dcinside.app.extra.POST_SUBJECT", "내 자짤 이미지");
        intent0.putExtra("com.dcinside.app.extra.IMAGE_SELECTED", m00.l());
        intent0.putExtra("com.dcinside.app.extra.SHOW_PATH_CHANGE", m00.j());
        intent0.putParcelableArrayListExtra("com.dcinside.app.extra.RESIZE_IMAGE_LIST", m00.h());
        intent0.putParcelableArrayListExtra("com.dcinside.app.extra.ORIGIN_IMAGE_LIST", m00.f());
        intent0.putExtra("com.dcinside.app.extra.EXTRA_SHOW_IMAGE_MODE", m00.e());
        intent0.putStringArrayListExtra("com.dcinside.app.extra.EXTRA_VIDEO_THUMBNAIL_LIST", m00.d());
        intent0.putExtra("com.dcinside.app.extra.EXTRA_CAN_BLOCK", m00.b());
        this.startActivity(intent0);
    }

    private final void Z2(boolean z) {
        if(!this.x) {
            return;
        }
        N n0 = this.w;
        Adapter recyclerView$Adapter0 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        L.o(n0.x, "myAutoImageRecycler");
        Adapter recyclerView$Adapter1 = n0.x.getAdapter();
        if(recyclerView$Adapter1 instanceof Q) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((Q)recyclerView$Adapter0) == null) {
            return;
        }
        if(z) {
            kotlin.ranges.l l0 = s.W1(0, ((Q)recyclerView$Adapter0).getItemCount());
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: l0) {
                if(!((Q)recyclerView$Adapter0).A().contains(((Number)object0).intValue())) {
                    arrayList0.add(object0);
                }
            }
            for(Object object1: arrayList0) {
                ((Q)recyclerView$Adapter0).A().add(((Number)object1).intValue());
            }
        }
        else if(((Q)recyclerView$Adapter0).A().size() > ((Q)recyclerView$Adapter0).getItemCount() - 1) {
            ((Q)recyclerView$Adapter0).A().clear();
        }
        ((Q)recyclerView$Adapter0).notifyItemRangeChanged(0, ((Q)recyclerView$Adapter0).getItemCount());
        this.w3();
    }

    private final void a3() {
        static final class n extends kotlin.jvm.internal.N implements Function1 {
            public static final n e;

            static {
                n.e = new n();
            }

            n() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F1501C0);  // string:cancel_auto_image_type_add "\"확인\"을 누르면 이전 화면으로 돌아갑니다.\n업로드 중인 이미지는 취소됩니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.o extends kotlin.jvm.internal.N implements Function1 {
            public static final com.dcinside.app.settings.image.auto.MyAutoImageActivity.o e;

            static {
                com.dcinside.app.settings.image.auto.MyAutoImageActivity.o.e = new com.dcinside.app.settings.image.auto.MyAutoImageActivity.o();
            }

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.o() {
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


        @s0({"SMAP\nMyAutoImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$onClickConfirm$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,644:1\n257#2,2:645\n*S KotlinDebug\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$onClickConfirm$3\n*L\n447#1:645,2\n*E\n"})
        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.p extends kotlin.jvm.internal.N implements Function1 {
            final MyAutoImageActivity e;
            final List f;
            final Q g;

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.p(MyAutoImageActivity myAutoImageActivity0, List list0, Q q0) {
                this.e = myAutoImageActivity0;
                this.f = list0;
                this.g = q0;
                super(1);
            }

            public final void c(Boolean boolean0) {
                @s0({"SMAP\nMyAutoImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$onClickConfirm$3$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,644:1\n257#2,2:645\n*S KotlinDebug\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$onClickConfirm$3$1\n*L\n440#1:645,2\n*E\n"})
                static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.p.a extends kotlin.jvm.internal.N implements Function1 {
                    final MyAutoImageActivity e;
                    final List f;
                    final Q g;

                    com.dcinside.app.settings.image.auto.MyAutoImageActivity.p.a(MyAutoImageActivity myAutoImageActivity0, List list0, Q q0) {
                        this.e = myAutoImageActivity0;
                        this.f = list0;
                        this.g = q0;
                        super(1);
                    }

                    public final void a(j0.e e0) {
                        N n0 = this.e.w;
                        if(n0 == null) {
                            L.S("binding");
                            n0 = null;
                        }
                        L.o(n0.u, "myAutoImageProgressContainer");
                        n0.u.setVisibility(8);
                        if(this.f.isEmpty()) {
                            this.e.finish();
                            return;
                        }
                        MyAutoImageActivity.b3(this.f, this.e, this.g);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((j0.e)object0));
                        return S0.a;
                    }
                }

                p p0 = this.e.K;
                if(p0 != null) {
                    p0.e();
                }
                this.e.K = null;
                this.e.C.l();
                o o0 = this.e.D;
                if(o0 != null) {
                    o0.l();
                }
                o o1 = uk.Dk().y5((Object object0) -> {
                    L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.p.a(this.e, this.f, this.g), "$tmp0");
                    new com.dcinside.app.settings.image.auto.MyAutoImageActivity.p.a(this.e, this.f, this.g).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this.e, "this$0");
                    N n0 = this.e.w;
                    if(n0 == null) {
                        L.S("binding");
                        n0 = null;
                    }
                    L.o(n0.u, "myAutoImageProgressContainer");
                    n0.u.setVisibility(8);
                });
                this.e.D = o1;
            }

            // 检测为 Lambda 实现
            private static final void d(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void e(MyAutoImageActivity myAutoImageActivity0, Throwable throwable0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.c(((Boolean)object0));
                return S0.a;
            }
        }

        N n0 = this.w;
        N n1 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        L.o(n0.x, "myAutoImageRecycler");
        Adapter recyclerView$Adapter0 = n0.x.getAdapter();
        if(!(recyclerView$Adapter0 instanceof Q)) {
            recyclerView$Adapter0 = null;
        }
        if(((Q)recyclerView$Adapter0) == null) {
            return;
        }
        List list0 = ((Q)recyclerView$Adapter0).A();
        N n2 = this.w;
        if(n2 == null) {
            L.S("binding");
        }
        else {
            n1 = n2;
        }
        L.o(n1.u, "myAutoImageProgressContainer");
        if(n1.u.getVisibility() == 0) {
            o o0 = this.F;
            if(o0 != null) {
                o0.l();
            }
            this.F = com.dcinside.app.perform.e.e.a(this).n(n.e).z(0x7F15034A).x(0x1040000).b().Z1((Object object0) -> {
                L.p(com.dcinside.app.settings.image.auto.MyAutoImageActivity.o.e, "$tmp0");
                return (Boolean)com.dcinside.app.settings.image.auto.MyAutoImageActivity.o.e.invoke(object0);
            }).x5((Object object0) -> {
                L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.p(this, list0, ((Q)recyclerView$Adapter0)), "$tmp0");
                new com.dcinside.app.settings.image.auto.MyAutoImageActivity.p(this, list0, ((Q)recyclerView$Adapter0)).invoke(object0);
            });
            return;
        }
        MyAutoImageActivity.b3(list0, this, ((Q)recyclerView$Adapter0));
    }

    private static final void b3(List list0, MyAutoImageActivity myAutoImageActivity0, Q q0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            AutoImage autoImage0 = q0.x(((Number)object0).intValue());
            Integer integer0 = autoImage0 == null ? null : autoImage0.l();
            if(integer0 != null) {
                arrayList0.add(integer0);
            }
        }
        int[] arr_v = u.U5(arrayList0);
        Intent intent0 = new Intent();
        intent0.putExtra("com.dcinside.app.extra.EXTRA_SELECTED_IMAGE_INDEXES", arr_v);
        myAutoImageActivity0.setResult(-1, intent0);
        myAutoImageActivity0.finish();
    }

    // 检测为 Lambda 实现
    private static final Boolean c3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void d3(Function1 function10, Object object0) [...]

    private final void e3(Integer[] arr_integer) {
        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.q extends kotlin.jvm.internal.N implements Function1 {
            final MyAutoImageActivity e;
            final int[] f;

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.q(MyAutoImageActivity myAutoImageActivity0, int[] arr_v) {
                this.e = myAutoImageActivity0;
                this.f = arr_v;
                super(1);
            }

            public final void c(com.dcinside.app.model.f0 f00) {
                static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.q.a extends kotlin.jvm.internal.N implements Function1 {
                    final MyAutoImageActivity e;
                    final int[] f;

                    com.dcinside.app.settings.image.auto.MyAutoImageActivity.q.a(MyAutoImageActivity myAutoImageActivity0, int[] arr_v) {
                        this.e = myAutoImageActivity0;
                        this.f = arr_v;
                        super(1);
                    }

                    public final void a(j0.e e0) {
                        this.e.n3(false);
                        L.m(e0);
                        this.e.o3(e0, this.f, true);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((j0.e)object0));
                        return S0.a;
                    }
                }

                this.e.r3(true);
                this.e.q3(false);
                o o0 = uk.Dk().y5((Object object0) -> {
                    L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.q.a(this.e, this.f), "$tmp0");
                    new com.dcinside.app.settings.image.auto.MyAutoImageActivity.q.a(this.e, this.f).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this.e, "this$0");
                    this.e.n3(false);
                });
                this.e.D = o0;
            }

            // 检测为 Lambda 实现
            private static final void d(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void e(MyAutoImageActivity myAutoImageActivity0, Throwable throwable0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.c(((com.dcinside.app.model.f0)object0));
                return S0.a;
            }
        }

        N n0 = this.w;
        int[] arr_v = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        L.o(n0.x, "myAutoImageRecycler");
        Adapter recyclerView$Adapter0 = n0.x.getAdapter();
        if(!(recyclerView$Adapter0 instanceof Q)) {
            recyclerView$Adapter0 = null;
        }
        if(((Q)recyclerView$Adapter0) == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList(arr_integer.length);
        for(int v = 0; v < arr_integer.length; ++v) {
            AutoImage autoImage0 = ((Q)recyclerView$Adapter0).x(arr_integer[v].intValue());
            arrayList0.add((autoImage0 == null ? null : autoImage0.l().toString()));
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        List list0 = ((Q)recyclerView$Adapter0).A();
        if(list0.isEmpty()) {
            list0 = null;
        }
        if(list0 != null) {
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: list0) {
                if(!kotlin.collections.l.s8(arr_integer, ((Number)object0).intValue())) {
                    arrayList1.add(object0);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object1: arrayList1) {
                AutoImage autoImage1 = ((Q)recyclerView$Adapter0).x(((Number)object1).intValue());
                Integer integer0 = autoImage1 == null ? null : autoImage1.l();
                if(integer0 != null) {
                    arrayList2.add(integer0);
                }
            }
            arr_v = u.U5(arrayList2);
        }
        o o0 = this.E;
        if(o0 != null) {
            o0.l();
        }
        this.n3(true);
        this.E = uk.jk(arr_s).y5((Object object0) -> {
            L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.q(this, arr_v), "$tmp0");
            new com.dcinside.app.settings.image.auto.MyAutoImageActivity.q(this, arr_v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.n3(false);
            com.hjq.toast.s.A(0x7F1502AB);  // string:error_auto_image "자동 짤방 정보를 불러오는데 실패했습니다."
        });
    }

    // 检测为 Lambda 实现
    private static final void f3(Function1 function10, Object object0) [...]

    public static void g2(View view0) {
    }

    // 检测为 Lambda 实现
    private static final void g3(MyAutoImageActivity myAutoImageActivity0, Throwable throwable0) [...]

    private final void h3() {
        N n0 = this.w;
        N n1 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        L.o(n0.x, "myAutoImageRecycler");
        Adapter recyclerView$Adapter0 = n0.x.getAdapter();
        if(!(recyclerView$Adapter0 instanceof Q)) {
            recyclerView$Adapter0 = null;
        }
        if(((Q)recyclerView$Adapter0) == null) {
            return;
        }
        List list0 = ((Q)recyclerView$Adapter0).A();
        if(list0.isEmpty()) {
            N n2 = this.w;
            if(n2 == null) {
                L.S("binding");
            }
            else {
                n1 = n2;
            }
            Snackbar.D0(n1.x, 0x7F150805, -1).m0();  // string:post_write_please_select_image "이미지를 선택해주세요."
            return;
        }
        this.s3(((Integer[])list0.toArray(new Integer[0])));
    }

    private final void i3() {
        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.r extends kotlin.jvm.internal.N implements Function1 {
            public static final com.dcinside.app.settings.image.auto.MyAutoImageActivity.r e;

            static {
                com.dcinside.app.settings.image.auto.MyAutoImageActivity.r.e = new com.dcinside.app.settings.image.auto.MyAutoImageActivity.r();
            }

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.r() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F1501BF);  // string:cancel_auto_image "이미지 업로드를 취소하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.s extends kotlin.jvm.internal.N implements Function1 {
            public static final com.dcinside.app.settings.image.auto.MyAutoImageActivity.s e;

            static {
                com.dcinside.app.settings.image.auto.MyAutoImageActivity.s.e = new com.dcinside.app.settings.image.auto.MyAutoImageActivity.s();
            }

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.s() {
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


        @s0({"SMAP\nMyAutoImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$onClickDeleteToolbarMenu$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,644:1\n257#2,2:645\n*S KotlinDebug\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$onClickDeleteToolbarMenu$3\n*L\n538#1:645,2\n*E\n"})
        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.t extends kotlin.jvm.internal.N implements Function1 {
            final MyAutoImageActivity e;

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.t(MyAutoImageActivity myAutoImageActivity0) {
                this.e = myAutoImageActivity0;
                super(1);
            }

            public final void c(Boolean boolean0) {
                @s0({"SMAP\nMyAutoImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$onClickDeleteToolbarMenu$3$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,644:1\n257#2,2:645\n25#3:647\n1#4:648\n1#4:659\n1611#5,9:649\n1863#5:658\n1864#5:660\n1620#5:661\n*S KotlinDebug\n*F\n+ 1 MyAutoImageActivity.kt\ncom/dcinside/app/settings/image/auto/MyAutoImageActivity$onClickDeleteToolbarMenu$3$1\n*L\n531#1:645,2\n532#1:647\n534#1:659\n534#1:649,9\n534#1:658\n534#1:660\n534#1:661\n*E\n"})
                static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.t.a extends kotlin.jvm.internal.N implements Function1 {
                    final MyAutoImageActivity e;

                    com.dcinside.app.settings.image.auto.MyAutoImageActivity.t.a(MyAutoImageActivity myAutoImageActivity0) {
                        this.e = myAutoImageActivity0;
                        super(1);
                    }

                    public final void a(j0.e e0) {
                        Integer integer0;
                        N n0 = this.e.w;
                        int[] arr_v = null;
                        if(n0 == null) {
                            L.S("binding");
                            n0 = null;
                        }
                        L.o(n0.u, "myAutoImageProgressContainer");
                        n0.u.setVisibility(8);
                        N n1 = this.e.w;
                        if(n1 == null) {
                            L.S("binding");
                            n1 = null;
                        }
                        L.o(n1.x, "myAutoImageRecycler");
                        Adapter recyclerView$Adapter0 = n1.x.getAdapter();
                        if(!(recyclerView$Adapter0 instanceof Q)) {
                            recyclerView$Adapter0 = null;
                        }
                        List list0 = ((Q)recyclerView$Adapter0) == null ? null : ((Q)recyclerView$Adapter0).A();
                        if(list0 == null || list0.isEmpty()) {
                            list0 = null;
                        }
                        if(list0 != null) {
                            ArrayList arrayList0 = new ArrayList();
                            for(Object object0: list0) {
                                int v = ((Number)object0).intValue();
                                if(((Q)recyclerView$Adapter0) == null) {
                                    integer0 = null;
                                }
                                else {
                                    AutoImage autoImage0 = ((Q)recyclerView$Adapter0).x(v);
                                    if(autoImage0 != null) {
                                        integer0 = autoImage0.l();
                                    }
                                }
                                if(integer0 != null) {
                                    arrayList0.add(integer0);
                                }
                            }
                            arr_v = u.U5(arrayList0);
                        }
                        L.m(e0);
                        MyAutoImageActivity.p3(this.e, e0, arr_v, false, 4, null);
                        this.e.q3(true);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((j0.e)object0));
                        return S0.a;
                    }
                }

                p p0 = this.e.K;
                if(p0 != null) {
                    p0.e();
                }
                this.e.K = null;
                this.e.C.l();
                o o0 = this.e.D;
                if(o0 != null) {
                    o0.l();
                }
                o o1 = uk.Dk().y5((Object object0) -> {
                    L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.t.a(this.e), "$tmp0");
                    new com.dcinside.app.settings.image.auto.MyAutoImageActivity.t.a(this.e).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this.e, "this$0");
                    N n0 = this.e.w;
                    if(n0 == null) {
                        L.S("binding");
                        n0 = null;
                    }
                    L.o(n0.u, "myAutoImageProgressContainer");
                    n0.u.setVisibility(8);
                });
                this.e.D = o1;
            }

            // 检测为 Lambda 实现
            private static final void d(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void e(MyAutoImageActivity myAutoImageActivity0, Throwable throwable0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.c(((Boolean)object0));
                return S0.a;
            }
        }

        N n0 = this.w;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        L.o(n0.u, "myAutoImageProgressContainer");
        if(n0.u.getVisibility() == 0) {
            o o0 = this.F;
            if(o0 != null) {
                o0.l();
            }
            this.F = com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.settings.image.auto.MyAutoImageActivity.r.e).z(0x7F15034A).x(0x1040000).b().Z1((Object object0) -> {
                L.p(com.dcinside.app.settings.image.auto.MyAutoImageActivity.s.e, "$tmp0");
                return (Boolean)com.dcinside.app.settings.image.auto.MyAutoImageActivity.s.e.invoke(object0);
            }).x5((Object object0) -> {
                L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.t(this), "$tmp0");
                new com.dcinside.app.settings.image.auto.MyAutoImageActivity.t(this).invoke(object0);
            });
            return;
        }
        this.q3(true);
    }

    // 检测为 Lambda 实现
    private static final Boolean j3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void k3(Function1 function10, Object object0) [...]

    private final void l3() {
        N n0 = this.w;
        N n1 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        L.o(n0.o, "myAutoImageGuide");
        n0.o.setVisibility(8);
        N n2 = this.w;
        if(n2 == null) {
            L.S("binding");
            n2 = null;
        }
        L.o(n2.x, "myAutoImageRecycler");
        Adapter recyclerView$Adapter0 = n2.x.getAdapter();
        if(!(recyclerView$Adapter0 instanceof Q)) {
            recyclerView$Adapter0 = null;
        }
        if(((Q)recyclerView$Adapter0) == null) {
            return;
        }
        int v = ((Q)recyclerView$Adapter0).A().size();
        N n3 = this.w;
        if(n3 == null) {
            L.S("binding");
        }
        else {
            n1 = n3;
        }
        boolean z = true;
        boolean z1 = v > ((Q)recyclerView$Adapter0).getItemCount() - 1;
        n1.h.setChecked(z1);
        if(v <= 0) {
            z = false;
        }
        this.W2(z);
        this.w3();
    }

    private final void m3() {
        if(cl.i(this, this)) {
            this.z = 103;
            return;
        }
        long v = jl.a.O();
        int v1 = jl.a.N();
        N n0 = this.w;
        ActivityResultLauncher activityResultLauncher0 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        Adapter recyclerView$Adapter0 = n0.x.getAdapter();
        int v2 = recyclerView$Adapter0 == null ? 0 : recyclerView$Adapter0.getItemCount();
        if(v1 <= v2) {
            String s = this.getString(0x7F1507FE, new Object[]{v1});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
            L.o(s, "getString(...)");
            com.hjq.toast.s.C(s);
            return;
        }
        com.dcinside.app.album.h.c(this).b(v).f(Math.min(v1 - v2, 20)).e("이미지를 선택해주세요.");
        Intent intent0 = new Intent(this, AlbumActivity.class);
        intent0.putExtra("AlbumActivity.extra_auto_image", true);
        ActivityResultLauncher activityResultLauncher1 = this.H;
        if(activityResultLauncher1 == null) {
            L.S("activityResultUploadImage");
        }
        else {
            activityResultLauncher0 = activityResultLauncher1;
        }
        activityResultLauncher0.b(intent0);
    }

    private final void n3(boolean z) {
        N n0 = this.w;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        L.o(n0.t, "myAutoImageProgress");
        n0.t.setVisibility((z ? 0 : 8));
    }

    private final void o3(j0.e e0, int[] arr_v, boolean z) {
        String s;
        boolean z1 = false;
        if(!e0.l().isEmpty()) {
            this.v3();
        }
        boolean z2 = this.getIntent().getBooleanExtra("MyAutoImageActivity_EXTRA_CAN_ADD_IMAGE", false);
        N n0 = this.w;
        N n1 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        L.o(n0.z, "myAutoImageTotalCount");
        n0.z.setVisibility(8);
        if(z2) {
            s = "내 자짤에서 이미지 추가";
        }
        else if(this.x) {
            s = "내 자짤 - 선택 삭제";
        }
        else {
            N n2 = this.w;
            if(n2 == null) {
                L.S("binding");
                n2 = null;
            }
            L.o(n2.z, "myAutoImageTotalCount");
            n2.z.setVisibility(0);
            N n3 = this.w;
            if(n3 == null) {
                L.S("binding");
                n3 = null;
            }
            String s1 = this.getString(0x7F1506DB, new Object[]{e0.l().size(), jl.a.N()});  // string:my_auto_image_total_count "전체 자짤 (%1$d/%2$d)"
            n3.z.setText(s1);
            s = "내 자짤 관리";
        }
        this.setTitle(s);
        N n4 = this.w;
        if(n4 == null) {
            L.S("binding");
            n4 = null;
        }
        L.o(n4.x, "myAutoImageRecycler");
        Adapter recyclerView$Adapter0 = n4.x.getAdapter();
        if(!(recyclerView$Adapter0 instanceof Q)) {
            recyclerView$Adapter0 = null;
        }
        if(z2) {
            N n5 = this.w;
            if(n5 == null) {
                L.S("binding");
                n5 = null;
            }
            L.o(n5.m, "myAutoImageDeleteMenu");
            n5.m.setVisibility(8);
            N n6 = this.w;
            if(n6 == null) {
                L.S("binding");
                n6 = null;
            }
            L.o(n6.k, "myAutoImageConfirmMenu");
            n6.k.setVisibility(0);
            this.W2(!e0.l().isEmpty() && arr_v != null && ((arr_v.length == 0 ? 1 : 0) ^ 1) == 1);
            if(e0.l().isEmpty()) {
                N n7 = this.w;
                if(n7 == null) {
                    L.S("binding");
                    n7 = null;
                }
                L.o(n7.f, "myAutoEmptyWrapTypeAdd");
                n7.f.setVisibility(0);
                N n8 = this.w;
                if(n8 == null) {
                    L.S("binding");
                }
                else {
                    n1 = n8;
                }
                L.o(n1.x, "myAutoImageRecycler");
                n1.x.setVisibility(8);
            }
            else {
                N n9 = this.w;
                if(n9 == null) {
                    L.S("binding");
                    n9 = null;
                }
                L.o(n9.f, "myAutoEmptyWrapTypeAdd");
                n9.f.setVisibility(8);
                N n10 = this.w;
                if(n10 == null) {
                    L.S("binding");
                }
                else {
                    n1 = n10;
                }
                L.o(n1.x, "myAutoImageRecycler");
                n1.x.setVisibility(0);
            }
        }
        else {
            N n11 = this.w;
            if(n11 == null) {
                L.S("binding");
                n11 = null;
            }
            L.o(n11.k, "myAutoImageConfirmMenu");
            n11.k.setVisibility(8);
            if(e0.l().isEmpty()) {
                N n12 = this.w;
                if(n12 == null) {
                    L.S("binding");
                    n12 = null;
                }
                L.o(n12.m, "myAutoImageDeleteMenu");
                n12.m.setVisibility(8);
                N n13 = this.w;
                if(n13 == null) {
                    L.S("binding");
                    n13 = null;
                }
                L.o(n13.g, "myAutoEmptyWrapTypeList");
                n13.g.setVisibility(0);
                N n14 = this.w;
                if(n14 == null) {
                    L.S("binding");
                }
                else {
                    n1 = n14;
                }
                L.o(n1.x, "myAutoImageRecycler");
                n1.x.setVisibility(8);
            }
            else {
                N n15 = this.w;
                if(n15 == null) {
                    L.S("binding");
                    n15 = null;
                }
                L.o(n15.m, "myAutoImageDeleteMenu");
                n15.m.setVisibility(0);
                N n16 = this.w;
                if(n16 == null) {
                    L.S("binding");
                    n16 = null;
                }
                L.o(n16.g, "myAutoEmptyWrapTypeList");
                n16.g.setVisibility(8);
                N n17 = this.w;
                if(n17 == null) {
                    L.S("binding");
                }
                else {
                    n1 = n17;
                }
                L.o(n1.x, "myAutoImageRecycler");
                n1.x.setVisibility(0);
            }
        }
        if(((Q)recyclerView$Adapter0) != null) {
            List list0 = ((Q)recyclerView$Adapter0).A();
            if(list0 != null) {
                list0.clear();
            }
        }
        if(!e0.l().isEmpty() && arr_v != null && ((arr_v.length == 0 ? 1 : 0) ^ 1) == 1) {
            int v = 0;
            while(v < arr_v.length) {
                int v1 = arr_v[v];
                int v2 = 0;
                Iterator iterator0 = e0.l().iterator();
                while(true) {
                    if(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        if(((AutoImage)object0).l() == v1) {
                            break;
                        }
                        else {
                            ++v2;
                            continue;
                        }
                    }
                    v2 = -1;
                    break;
                }
                if(v2 >= 0 && ((Q)recyclerView$Adapter0) != null) {
                    List list1 = ((Q)recyclerView$Adapter0).A();
                    if(list1 != null) {
                        list1.add(v2);
                    }
                }
                ++v;
            }
        }
        if(((Q)recyclerView$Adapter0) != null) {
            List list2 = e0.l();
            if(z && z2) {
                z1 = true;
            }
            ((Q)recyclerView$Adapter0).G(list2, z1);
        }
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void onConfigurationChanged(@l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        N n0 = this.w;
        b myAutoImageActivity$b0 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        LayoutManager recyclerView$LayoutManager0 = n0.x.getLayoutManager();
        GridLayoutManager gridLayoutManager0 = recyclerView$LayoutManager0 instanceof GridLayoutManager ? ((GridLayoutManager)recyclerView$LayoutManager0) : null;
        if(gridLayoutManager0 == null) {
            return;
        }
        gridLayoutManager0.l4(this.D2());
        b myAutoImageActivity$b1 = this.A;
        if(myAutoImageActivity$b1 == null) {
            L.S("spanSizeLookup");
        }
        else {
            myAutoImageActivity$b0 = myAutoImageActivity$b1;
        }
        myAutoImageActivity$b0.m(this.D2());
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        N n0 = N.c(this.getLayoutInflater());
        L.o(n0, "inflate(...)");
        this.w = n0;
        N n1 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        this.setContentView(n0.b());
        N n2 = this.w;
        if(n2 == null) {
            L.S("binding");
        }
        else {
            n1 = n2;
        }
        this.S0(n1.y);
        kr.bhbfhfb.designcompat.a.d(this);
        if(this.F1() == null) {
            this.finish();
            return;
        }
        this.T2();
        this.E2();
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        N n0 = this.w;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        RecyclerView recyclerView0 = n0.x;
        com.afollestad.dragselectrecyclerview.b b0 = this.I;
        if(b0 == null) {
            L.S("touchListener");
            b0 = null;
        }
        recyclerView0.removeOnItemTouchListener(b0);
        p p0 = this.K;
        if(p0 != null) {
            p0.e();
        }
        this.K = null;
        o o0 = this.F;
        if(o0 != null) {
            o0.l();
        }
        this.C.l();
        this.D.l();
        this.E.l();
        rx.subscriptions.b b1 = this.G;
        if(b1 != null) {
            b1.c();
        }
        this.G = null;
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@m PermissionDeniedResponse permissionDeniedResponse0) {
        Dl.D(this, cl.b((permissionDeniedResponse0 == null ? null : permissionDeniedResponse0.getPermissionName())));
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@m PermissionGrantedResponse permissionGrantedResponse0) {
        Dl.D(this, cl.c((permissionGrantedResponse0 == null ? null : permissionGrantedResponse0.getPermissionName())));
        if(this.z == 103) {
            this.m3();
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l PermissionRequest permissionRequest0, @m PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    static void p3(MyAutoImageActivity myAutoImageActivity0, j0.e e0, int[] arr_v, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        myAutoImageActivity0.o3(e0, arr_v, z);
    }

    private final void q3(boolean z) {
        if(this.x == z) {
            return;
        }
        this.x = z;
        this.C2(z);
    }

    private final void r3(boolean z) {
        if(z == this.y) {
            return;
        }
        this.y = z;
    }

    private final void s3(Integer[] arr_integer) {
        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.u extends kotlin.jvm.internal.N implements Function1 {
            public static final com.dcinside.app.settings.image.auto.MyAutoImageActivity.u e;

            static {
                com.dcinside.app.settings.image.auto.MyAutoImageActivity.u.e = new com.dcinside.app.settings.image.auto.MyAutoImageActivity.u();
            }

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.u() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F1506D2);  // string:my_auto_delete_confirm "선택한 자동 짤방 이미지를 삭제하시겠습니까?\n갤러리에 등록된 자동 짤방 이미지도 함께 
                                            // 삭제됩니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class v extends kotlin.jvm.internal.N implements Function1 {
            public static final v e;

            static {
                v.e = new v();
            }

            v() {
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


        static final class com.dcinside.app.settings.image.auto.MyAutoImageActivity.w extends kotlin.jvm.internal.N implements Function1 {
            final MyAutoImageActivity e;
            final Integer[] f;

            com.dcinside.app.settings.image.auto.MyAutoImageActivity.w(MyAutoImageActivity myAutoImageActivity0, Integer[] arr_integer) {
                this.e = myAutoImageActivity0;
                this.f = arr_integer;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.e3(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.settings.image.auto.MyAutoImageActivity.u.e).z(0x7F15034A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(v.e, "$tmp0");
            return (Boolean)v.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.settings.image.auto.MyAutoImageActivity.w(this, arr_integer), "$tmp0");
            new com.dcinside.app.settings.image.auto.MyAutoImageActivity.w(this, arr_integer).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean t3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void u3(Function1 function10, Object object0) [...]

    private final void v3() {
        N n0 = this.w;
        N n1 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        L.o(n0.o, "myAutoImageGuide");
        n0.o.setVisibility(8);
        dl dl0 = dl.a;
        if(dl0.H2()) {
            return;
        }
        if(!this.getIntent().getBooleanExtra("MyAutoImageActivity_EXTRA_CAN_ADD_IMAGE", false)) {
            return;
        }
        N n2 = this.w;
        if(n2 == null) {
            L.S("binding");
        }
        else {
            n1 = n2;
        }
        L.o(n1.o, "myAutoImageGuide");
        n1.o.setVisibility(0);
        dl0.p3(true);
    }

    private final void w3() {
        String s;
        N n0 = this.w;
        N n1 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        Adapter recyclerView$Adapter0 = n0.x.getAdapter();
        int v = recyclerView$Adapter0 == null ? 0 : recyclerView$Adapter0.getItemCount();
        boolean z = this.getIntent().getBooleanExtra("MyAutoImageActivity_EXTRA_CAN_ADD_IMAGE", false);
        N n2 = this.w;
        if(n2 == null) {
            L.S("binding");
            n2 = null;
        }
        L.o(n2.z, "myAutoImageTotalCount");
        n2.z.setVisibility(8);
        if(z) {
            s = "내 자짤에서 이미지 추가";
        }
        else if(this.x) {
            s = "내 자짤 - 선택 삭제";
        }
        else {
            N n3 = this.w;
            if(n3 == null) {
                L.S("binding");
                n3 = null;
            }
            L.o(n3.z, "myAutoImageTotalCount");
            n3.z.setVisibility(0);
            N n4 = this.w;
            if(n4 == null) {
                L.S("binding");
            }
            else {
                n1 = n4;
            }
            String s1 = this.getString(0x7F1506DB, new Object[]{v, jl.a.N()});  // string:my_auto_image_total_count "전체 자짤 (%1$d/%2$d)"
            n1.z.setText(s1);
            s = "내 자짤 관리";
        }
        this.setTitle(s);
    }
}

