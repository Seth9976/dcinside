package com.dcinside.app.read.tools;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.ContextMenu;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat.BigPictureStyle;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.Application;
import com.dcinside.app.base.i;
import com.dcinside.app.image.e;
import com.dcinside.app.model.PostImage;
import com.dcinside.app.model.PostImageInfo;
import com.dcinside.app.model.Q;
import com.dcinside.app.model.f0;
import com.dcinside.app.read.x;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.U;
import com.dcinside.app.realm.h;
import com.dcinside.app.realm.z;
import com.dcinside.app.rx.bus.m0;
import com.dcinside.app.rx.g;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Fk;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.Vk;
import com.dcinside.app.util.Zk;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.gl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.util.zk;
import com.dcinside.app.view.PostReadHeaderView;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.dcinside.app.wv.VideoEnabledWebView;
import com.dcinside.app.wv.f;
import com.dcinside.app.wv.j;
import com.dcinside.app.wv.y;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nReadWebControls.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWebControls.kt\ncom/dcinside/app/read/tools/ReadWebControls\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,585:1\n177#2,9:586\n177#2,9:595\n177#2,6:608\n192#2,7:614\n183#2,3:621\n192#2,7:624\n177#2,9:632\n1755#3,3:604\n295#3,2:642\n1#4:607\n25#5:631\n25#5:641\n*S KotlinDebug\n*F\n+ 1 ReadWebControls.kt\ncom/dcinside/app/read/tools/ReadWebControls\n*L\n116#1:586,9\n118#1:595,9\n158#1:608,6\n159#1:614,7\n158#1:621,3\n372#1:624,7\n506#1:632,9\n123#1:604,3\n529#1:642,2\n400#1:631\n519#1:641\n*E\n"})
public final class s implements i, a, PermissionListener {
    public static final class com.dcinside.app.read.tools.s.a {
        private com.dcinside.app.read.tools.s.a() {
        }

        public com.dcinside.app.read.tools.s.a(w w0) {
        }
    }

    private int a;
    @m
    private o b;
    @m
    private o c;
    @m
    private o d;
    @m
    private V e;
    @m
    private WeakReference f;
    @m
    private Q g;
    @m
    private List h;
    @m
    private Map i;
    @m
    private RecyclerView j;
    @m
    private I0 k;
    @m
    private f l;
    @m
    private I0 m;
    @m
    private e n;
    @m
    private com.dcinside.app.post.fragments.i o;
    @l
    private final g p;
    @l
    public static final com.dcinside.app.read.tools.s.a q = null;
    private static final int r = 1;
    private static final int s = 2;

    static {
        s.q = new com.dcinside.app.read.tools.s.a(null);
    }

    public s() {
        static final class c extends N implements A3.a {
            final s e;

            c(s s0) {
                this.e = s0;
                super(0);
            }

            @l
            public final rx.g b() {
                Q q0 = this.e.g;
                Q q1 = this.e.g;
                rx.g g0 = uk.hG((q0 == null ? null : q0.G0()), (q1 == null ? 0 : q1.c1()));
                L.o(g0, "postImages(...)");
                return g0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class d extends N implements Function1 {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
                super(1);
            }

            public final List a(@l Throwable throwable0) {
                L.p(throwable0, "it");
                return u.H();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        this.p = new g(TimeUnit.HOURS.toMillis(12L), new c(this), d.e);
    }

    private final void F(String s) {
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            AppCompatActivity appCompatActivity0 = (AppCompatActivity)weakReference0.get();
            if(appCompatActivity0 != null) {
                List list0 = this.h;
                if(list0 == null) {
                    return;
                }
                Object object0 = null;
                for(Object object1: list0) {
                    if(L.g(((PostImageInfo)object1).d(), s)) {
                        object0 = object1;
                        break;
                    }
                }
                if(((PostImageInfo)object0) == null) {
                    return;
                }
                String s1 = ((PostImageInfo)object0).c();
                if(s1 != null && s1.length() != 0) {
                    String s2 = ((PostImageInfo)object0).a();
                    if(s2 != null && s2.length() != 0) {
                        h.h.a(appCompatActivity0, ((PostImageInfo)object0).d(), ((PostImageInfo)object0).a(), ((PostImageInfo)object0).c());
                        com.dcinside.app.rx.bus.c.a(appCompatActivity0, new com.dcinside.app.rx.bus.u());
                        return;
                    }
                }
                Dl.D(appCompatActivity0, 0x7F150475);  // string:image_block_is_impossible "이 이미지는 차단할 수 없습니다."
            }
        }
    }

    public final void G(@l String s) {
        static final class b extends N implements Function1 {
            final boolean e;
            final s f;
            final AppCompatActivity g;
            final String h;
            final String i;

            b(boolean z, s s0, AppCompatActivity appCompatActivity0, String s1, String s2) {
                this.e = z;
                this.f = s0;
                this.g = appCompatActivity0;
                this.h = s1;
                this.i = s2;
                super(1);
            }

            public final void a(f0 f00) {
                if(f00.f()) {
                    String s = this.g.getString((this.e ? 0x7F1504D0 : 0x7F1504CF));  // string:image_manager_unblock_success "차단이 해제되었습니다.\n(해제 적용까지 최대 10분 소요)"
                    L.o(s, "getString(...)");
                    this.f.e0(s);
                    U.g.b(this.h, this.i, !this.e);
                    com.dcinside.app.rx.bus.u u0 = new com.dcinside.app.rx.bus.u();
                    com.dcinside.app.rx.bus.c.a(this.g, u0);
                    return;
                }
                String s1 = f00.a();
                if(s1 == null) {
                    s1 = "잠시 후 다시 시도해주세요.";
                    L.o("잠시 후 다시 시도해주세요.", "getString(...)");
                }
                this.f.e0(s1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        L.p(s, "imageUrl");
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            AppCompatActivity appCompatActivity0 = (AppCompatActivity)weakReference0.get();
            if(appCompatActivity0 != null) {
                o o0 = this.d;
                if(o0 != null) {
                    o0.l();
                }
                Q q0 = this.g;
                if(q0 == null) {
                    return;
                }
                List list0 = this.h;
                if(list0 != null) {
                    Object object0 = null;
                    for(Object object1: list0) {
                        if(L.g(((PostImageInfo)object1).d(), s)) {
                            object0 = object1;
                            break;
                        }
                    }
                    if(((PostImageInfo)object0) != null) {
                        String s1 = q0.G0();
                        String s2 = ((PostImageInfo)object0).a();
                        String s3 = ((PostImageInfo)object0).c();
                        com.dcinside.app.type.m m0 = com.dcinside.app.type.m.d.b(s1);
                        boolean z = ((PostImageInfo)object0).f();
                        this.d = (z ? uk.SF(s1, s2, s3, m0) : uk.OF(s, s1, String.valueOf(q0.c1()), s2, s3, q0.k1(), m0)).A5(rx.schedulers.c.e()).M3(rx.android.schedulers.a.c()).R1(() -> {
                            L.p(appCompatActivity0, "$activity");
                            gl.c(appCompatActivity0);
                        }).T1(() -> {
                            L.p(appCompatActivity0, "$activity");
                            gl.j(appCompatActivity0);
                        }).y5((Object object0) -> {
                            L.p(new b(z, this, appCompatActivity0, s2, s3), "$tmp0");
                            new b(z, this, appCompatActivity0, s2, s3).invoke(object0);
                        }, (Throwable throwable0) -> {
                            L.p(appCompatActivity0, "$activity");
                            L.p(this, "this$0");
                            String s1 = throwable0.getMessage();
                            if(s1 == null) {
                                s1 = "잠시 후 다시 시도해주세요.";
                                L.o("잠시 후 다시 시도해주세요.", "getString(...)");
                            }
                            this.e0(s1);
                        });
                    }
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void H(AppCompatActivity appCompatActivity0) [...]

    // 检测为 Lambda 实现
    private static final void I(AppCompatActivity appCompatActivity0) [...]

    // 检测为 Lambda 实现
    private static final void J(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void K(AppCompatActivity appCompatActivity0, s s0, Throwable throwable0) [...]

    private final void L() {
        RecyclerView recyclerView0 = this.j;
        if(recyclerView0 != null && (this.m != null && this.m.isActive() && recyclerView0.isLayoutSuppressed())) {
            recyclerView0.suppressLayout(false);
        }
        I0 i00 = this.m;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.m = null;
        f f0 = this.l;
        if(f0 != null) {
            f0.onDestroy();
        }
        this.l = null;
        I0 i01 = this.k;
        if(i01 != null) {
            kotlinx.coroutines.I0.a.b(i01, null, 1, null);
        }
        this.k = null;
    }

    public final void M(boolean z) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.tools.ReadWebControls$captureContent$1", f = "ReadWebControls.kt", i = {}, l = {385}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.tools.s.e extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final s l;
            final boolean m;

            com.dcinside.app.read.tools.s.e(s s0, boolean z, kotlin.coroutines.d d0) {
                this.l = s0;
                this.m = z;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.tools.s.e(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.read.tools.s.e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        kotlin.f0.n(object0);
                        try {
                            this.k = 1;
                            return this.l.N(this.m, this) == object1 ? object1 : S0.a;
                        label_8:
                            kotlin.f0.n(object0);
                            return S0.a;
                        }
                        catch(Exception unused_ex) {
                            goto label_10;
                        }
                    }
                    case 1: {
                        goto label_8;
                    label_10:
                        WeakReference weakReference0 = this.l.f;
                        if(weakReference0 != null) {
                            AppCompatActivity appCompatActivity0 = (AppCompatActivity)weakReference0.get();
                            if(appCompatActivity0 != null) {
                                Dl.D(appCompatActivity0, 0x7F1501CD);  // string:capture_view_fail "캡쳐에 실패했습니다. 내용이 긴 글은 저장이 어려울 수 있습니다."
                                return S0.a;
                            }
                        }
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        this.L();
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            AppCompatActivity appCompatActivity0 = (AppCompatActivity)weakReference0.get();
            if(appCompatActivity0 != null) {
                LifecycleCoroutineScope lifecycleCoroutineScope0 = LifecycleOwnerKt.a(appCompatActivity0);
                if(lifecycleCoroutineScope0 != null) {
                    I0 i00 = this.m;
                    if(i00 != null) {
                        kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                    }
                    this.m = k.f(lifecycleCoroutineScope0, h0.e(), null, new com.dcinside.app.read.tools.s.e(this, z, null), 2, null);
                }
            }
        }
    }

    private final Object N(boolean z, kotlin.coroutines.d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.tools.ReadWebControls", f = "ReadWebControls.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5}, l = {398, 418, 420, 425, 427, 429}, m = "captureContentWork", n = {"this", "rv", "ctx", "isAll", "this", "rv", "ctx", "adapter", "layoutManager", "header", "info", "webView", "jsCallback", "holders", "isAll", "this", "rv", "ctx", "adapter", "layoutManager", "header", "info", "webView", "jsCallback", "holders", "isAll", "this", "rv", "ctx", "adapter", "layoutManager", "header", "info", "webView", "jsCallback", "holders", "isAll", "captureDelayCount", "this", "rv", "ctx", "adapter", "layoutManager", "header", "info", "webView", "holders", "isAll", "this", "ctx", "adapter", "layoutManager"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "L$0", "L$1", "L$2", "L$3"})
        static final class com.dcinside.app.read.tools.s.f extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            Object p;
            Object q;
            Object r;
            Object s;
            Object t;
            boolean u;
            int v;
            Object w;
            final s x;
            int y;

            com.dcinside.app.read.tools.s.f(s s0, kotlin.coroutines.d d0) {
                this.x = s0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.w = object0;
                this.y |= 0x80000000;
                return this.x.N(false, this);
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.tools.ReadWebControls$captureContentWork$2", f = "ReadWebControls.kt", i = {}, l = {430}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.tools.s.g extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final Context l;
            final PostReadHeaderView m;
            final VideoEnabledWebView n;
            final SparseArray o;
            final x p;
            final RecyclerView q;
            final Q r;
            final boolean s;

            com.dcinside.app.read.tools.s.g(Context context0, PostReadHeaderView postReadHeaderView0, VideoEnabledWebView videoEnabledWebView0, SparseArray sparseArray0, x x0, RecyclerView recyclerView0, Q q0, boolean z, kotlin.coroutines.d d0) {
                this.l = context0;
                this.m = postReadHeaderView0;
                this.n = videoEnabledWebView0;
                this.o = sparseArray0;
                this.p = x0;
                this.q = recyclerView0;
                this.r = q0;
                this.s = z;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.tools.s.g(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.read.tools.s.g)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        kotlin.f0.n(object0);
                        L.o(this.l, "$ctx");
                        this.k = 1;
                        object0 = com.dcinside.app.read.capture.a.b(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this);
                        return object0 == object1 ? object1 : object0;
                    }
                    case 1: {
                        kotlin.f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        NonPredictiveLayoutManager nonPredictiveLayoutManager5;
        s s5;
        RecyclerView recyclerView5;
        x x3;
        Context context4;
        PostReadHeaderView postReadHeaderView4;
        Q q5;
        VideoEnabledWebView videoEnabledWebView5;
        SparseArray sparseArray4;
        boolean z6;
        j j2;
        PostReadHeaderView postReadHeaderView2;
        x x2;
        s s3;
        boolean z4;
        SparseArray sparseArray2;
        VideoEnabledWebView videoEnabledWebView3;
        Q q3;
        NonPredictiveLayoutManager nonPredictiveLayoutManager3;
        int v3;
        RecyclerView recyclerView3;
        j j1;
        RecyclerView recyclerView1;
        SparseArray sparseArray1;
        Context context1;
        boolean z3;
        x x0;
        Q q1;
        NonPredictiveLayoutManager nonPredictiveLayoutManager1;
        VideoEnabledWebView videoEnabledWebView1;
        s s1;
        PostReadHeaderView postReadHeaderView0;
        s s0;
        boolean z1;
        Context context0;
        RecyclerView recyclerView0;
        com.dcinside.app.read.tools.s.f s$f0;
        if(d0 instanceof com.dcinside.app.read.tools.s.f) {
            s$f0 = (com.dcinside.app.read.tools.s.f)d0;
            int v = s$f0.y;
            if((v & 0x80000000) == 0) {
                s$f0 = new com.dcinside.app.read.tools.s.f(this, d0);
            }
            else {
                s$f0.y = v ^ 0x80000000;
            }
        }
        else {
            s$f0 = new com.dcinside.app.read.tools.s.f(this, d0);
        }
        Object object0 = s$f0.w;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(s$f0.y) {
            case 0: {
                kotlin.f0.n(object0);
                recyclerView0 = this.j;
                if(recyclerView0 == null) {
                    return S0.a;
                }
                context0 = recyclerView0.getContext();
                recyclerView0.scrollToPosition(0);
                s$f0.k = this;
                s$f0.l = recyclerView0;
                s$f0.m = context0;
                z1 = z;
                s$f0.u = z1;
                s$f0.y = 1;
                if(a0.b(100L, s$f0) == object1) {
                    return object1;
                }
                s0 = this;
                goto label_35;
            }
            case 1: {
                boolean z2 = s$f0.u;
                context0 = (Context)s$f0.m;
                recyclerView0 = (RecyclerView)s$f0.l;
                s0 = (s)s$f0.k;
                kotlin.f0.n(object0);
                z1 = z2;
            label_35:
                Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
                if(!(recyclerView$Adapter0 instanceof x)) {
                    recyclerView$Adapter0 = null;
                }
                if(((x)recyclerView$Adapter0) == null) {
                    return S0.a;
                }
                LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
                NonPredictiveLayoutManager nonPredictiveLayoutManager0 = recyclerView$LayoutManager0 instanceof NonPredictiveLayoutManager ? ((NonPredictiveLayoutManager)recyclerView$LayoutManager0) : null;
                if(nonPredictiveLayoutManager0 == null) {
                    return S0.a;
                }
                int v1 = ((x)recyclerView$Adapter0).R().j0();
                int v2 = ((x)recyclerView$Adapter0).R().m0();
                ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(v1);
                com.dcinside.app.read.holder.b b0 = recyclerView$ViewHolder0 instanceof com.dcinside.app.read.holder.b ? ((com.dcinside.app.read.holder.b)recyclerView$ViewHolder0) : null;
                if(b0 == null) {
                    return S0.a;
                }
                postReadHeaderView0 = b0.itemView instanceof PostReadHeaderView ? ((PostReadHeaderView)b0.itemView) : null;
                if(postReadHeaderView0 == null) {
                    return S0.a;
                }
                ViewHolder recyclerView$ViewHolder1 = recyclerView0.findViewHolderForAdapterPosition(v2);
                com.dcinside.app.read.holder.c c0 = recyclerView$ViewHolder1 instanceof com.dcinside.app.read.holder.c ? ((com.dcinside.app.read.holder.c)recyclerView$ViewHolder1) : null;
                if(c0 == null) {
                    return S0.a;
                }
                Q q0 = s0.g;
                if(q0 == null) {
                    return S0.a;
                }
                VideoEnabledWebView videoEnabledWebView0 = c0.i();
                if(videoEnabledWebView0 == null) {
                    return S0.a;
                }
                j j0 = j.c(videoEnabledWebView0);
                if(j0 == null) {
                    return S0.a;
                }
                SparseArray sparseArray0 = new SparseArray();
                com.dcinside.app.read.capture.a.m(recyclerView0, sparseArray0, ((x)recyclerView$Adapter0));
                nonPredictiveLayoutManager0.H3(false);
                if(context0 instanceof AppCompatActivity) {
                    gl.c(((Activity)context0));
                }
                ((x)recyclerView$Adapter0).l0();
                s$f0.k = s0;
                s$f0.l = recyclerView0;
                s$f0.m = context0;
                s$f0.n = (x)recyclerView$Adapter0;
                s$f0.o = nonPredictiveLayoutManager0;
                s$f0.p = postReadHeaderView0;
                s$f0.q = q0;
                s$f0.r = videoEnabledWebView0;
                s$f0.s = j0;
                s$f0.t = sparseArray0;
                s$f0.u = z1;
                s$f0.y = 2;
                if(a0.b(100L, s$f0) == object1) {
                    return object1;
                }
                s1 = s0;
                videoEnabledWebView1 = videoEnabledWebView0;
                nonPredictiveLayoutManager1 = nonPredictiveLayoutManager0;
                q1 = q0;
                x0 = (x)recyclerView$Adapter0;
                z3 = z1;
                context1 = context0;
                sparseArray1 = sparseArray0;
                recyclerView1 = recyclerView0;
                j1 = j0;
                goto label_117;
            }
            case 2: {
                z3 = s$f0.u;
                sparseArray1 = (SparseArray)s$f0.t;
                j1 = (j)s$f0.s;
                VideoEnabledWebView videoEnabledWebView2 = (VideoEnabledWebView)s$f0.r;
                Q q2 = (Q)s$f0.q;
                PostReadHeaderView postReadHeaderView1 = (PostReadHeaderView)s$f0.p;
                NonPredictiveLayoutManager nonPredictiveLayoutManager2 = (NonPredictiveLayoutManager)s$f0.o;
                x x1 = (x)s$f0.n;
                Context context2 = (Context)s$f0.m;
                RecyclerView recyclerView2 = (RecyclerView)s$f0.l;
                s s2 = (s)s$f0.k;
                kotlin.f0.n(object0);
                q1 = q2;
                nonPredictiveLayoutManager1 = nonPredictiveLayoutManager2;
                context1 = context2;
                s1 = s2;
                videoEnabledWebView1 = videoEnabledWebView2;
                postReadHeaderView0 = postReadHeaderView1;
                x0 = x1;
                recyclerView1 = recyclerView2;
            label_117:
                x0.N();
                s$f0.k = s1;
                s$f0.l = recyclerView1;
                s$f0.m = context1;
                s$f0.n = x0;
                s$f0.o = nonPredictiveLayoutManager1;
                s$f0.p = postReadHeaderView0;
                s$f0.q = q1;
                s$f0.r = videoEnabledWebView1;
                s$f0.s = j1;
                s$f0.t = sparseArray1;
                s$f0.u = z3;
                s$f0.y = 3;
                if(a0.b(100L, s$f0) == object1) {
                    return object1;
                }
                goto label_144;
            }
            case 3: {
                z3 = s$f0.u;
                sparseArray1 = (SparseArray)s$f0.t;
                j1 = (j)s$f0.s;
                videoEnabledWebView1 = (VideoEnabledWebView)s$f0.r;
                q1 = (Q)s$f0.q;
                postReadHeaderView0 = (PostReadHeaderView)s$f0.p;
                nonPredictiveLayoutManager1 = (NonPredictiveLayoutManager)s$f0.o;
                x0 = (x)s$f0.n;
                context1 = (Context)s$f0.m;
                recyclerView1 = (RecyclerView)s$f0.l;
                s1 = (s)s$f0.k;
                kotlin.f0.n(object0);
            label_144:
                recyclerView3 = recyclerView1;
                v3 = 0;
                nonPredictiveLayoutManager3 = nonPredictiveLayoutManager1;
                q3 = q1;
                videoEnabledWebView3 = videoEnabledWebView1;
                sparseArray2 = sparseArray1;
                z4 = z3;
                s3 = s1;
                x2 = x0;
                postReadHeaderView2 = postReadHeaderView0;
                j2 = j1;
                goto label_177;
            }
            case 4: {
                int v4 = s$f0.v;
                boolean z5 = s$f0.u;
                SparseArray sparseArray3 = (SparseArray)s$f0.t;
                j2 = (j)s$f0.s;
                VideoEnabledWebView videoEnabledWebView4 = (VideoEnabledWebView)s$f0.r;
                Q q4 = (Q)s$f0.q;
                PostReadHeaderView postReadHeaderView3 = (PostReadHeaderView)s$f0.p;
                nonPredictiveLayoutManager3 = (NonPredictiveLayoutManager)s$f0.o;
                x2 = (x)s$f0.n;
                Context context3 = (Context)s$f0.m;
                RecyclerView recyclerView4 = (RecyclerView)s$f0.l;
                s3 = (s)s$f0.k;
                kotlin.f0.n(object0);
                v3 = v4;
                z4 = z5;
                sparseArray2 = sparseArray3;
                videoEnabledWebView3 = videoEnabledWebView4;
                q3 = q4;
                postReadHeaderView2 = postReadHeaderView3;
                context1 = context3;
                recyclerView3 = recyclerView4;
            label_177:
                while(!j2.e() && v3 < 100) {
                    s$f0.k = s3;
                    s$f0.l = recyclerView3;
                    s$f0.m = context1;
                    s$f0.n = x2;
                    s$f0.o = nonPredictiveLayoutManager3;
                    s$f0.p = postReadHeaderView2;
                    s$f0.q = q3;
                    s$f0.r = videoEnabledWebView3;
                    s$f0.s = j2;
                    s$f0.t = sparseArray2;
                    s$f0.u = z4;
                    s$f0.v = v3 + 1;
                    s$f0.y = 4;
                    if(a0.b(200L, s$f0) == object1) {
                        return object1;
                    }
                    ++v3;
                }
                s$f0.k = s3;
                s$f0.l = recyclerView3;
                s$f0.m = context1;
                s$f0.n = x2;
                s$f0.o = nonPredictiveLayoutManager3;
                s$f0.p = postReadHeaderView2;
                s$f0.q = q3;
                s$f0.r = videoEnabledWebView3;
                s$f0.s = sparseArray2;
                s$f0.t = null;
                s$f0.u = z4;
                s$f0.y = 5;
                if(a0.b(300L, s$f0) == object1) {
                    return object1;
                }
                z6 = z4;
                sparseArray4 = sparseArray2;
                videoEnabledWebView5 = videoEnabledWebView3;
                q5 = q3;
                postReadHeaderView4 = postReadHeaderView2;
                context4 = context1;
                x3 = x2;
                recyclerView5 = recyclerView3;
                goto label_239;
            }
            case 5: {
                boolean z7 = s$f0.u;
                SparseArray sparseArray5 = (SparseArray)s$f0.s;
                VideoEnabledWebView videoEnabledWebView6 = (VideoEnabledWebView)s$f0.r;
                Q q6 = (Q)s$f0.q;
                PostReadHeaderView postReadHeaderView5 = (PostReadHeaderView)s$f0.p;
                NonPredictiveLayoutManager nonPredictiveLayoutManager4 = (NonPredictiveLayoutManager)s$f0.o;
                x x4 = (x)s$f0.n;
                Context context5 = (Context)s$f0.m;
                RecyclerView recyclerView6 = (RecyclerView)s$f0.l;
                s s4 = (s)s$f0.k;
                kotlin.f0.n(object0);
                z6 = z7;
                sparseArray4 = sparseArray5;
                videoEnabledWebView5 = videoEnabledWebView6;
                s3 = s4;
                q5 = q6;
                postReadHeaderView4 = postReadHeaderView5;
                x3 = x4;
                context4 = context5;
                recyclerView5 = recyclerView6;
                nonPredictiveLayoutManager3 = nonPredictiveLayoutManager4;
            label_239:
                com.dcinside.app.read.tools.s.g s$g0 = new com.dcinside.app.read.tools.s.g(context4, postReadHeaderView4, videoEnabledWebView5, sparseArray4, x3, recyclerView5, q5, z6, null);
                s$f0.k = s3;
                s$f0.l = context4;
                s$f0.m = x3;
                s$f0.n = nonPredictiveLayoutManager3;
                s$f0.o = null;
                s$f0.p = null;
                s$f0.q = null;
                s$f0.r = null;
                s$f0.s = null;
                s$f0.y = 6;
                object0 = kotlinx.coroutines.i.h(h0.a(), s$g0, s$f0);
                if(object0 == object1) {
                    return object1;
                }
                s5 = s3;
                nonPredictiveLayoutManager5 = nonPredictiveLayoutManager3;
                break;
            }
            case 6: {
                nonPredictiveLayoutManager5 = (NonPredictiveLayoutManager)s$f0.n;
                x3 = (x)s$f0.m;
                context4 = (Context)s$f0.l;
                s5 = (s)s$f0.k;
                kotlin.f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Bitmap bitmap0 = ((com.dcinside.app.read.capture.a.a)object0).a();
        Uri uri0 = ((com.dcinside.app.read.capture.a.a)object0).b();
        Throwable throwable0 = ((com.dcinside.app.read.capture.a.a)object0).c();
        if(context4 instanceof com.dcinside.app.base.d && ((com.dcinside.app.base.d)context4).s1()) {
            return S0.a;
        }
        x3.notifyDataSetChanged();
        if(context4 instanceof AppCompatActivity) {
            gl.j(((Activity)context4));
        }
        nonPredictiveLayoutManager5.H3(true);
        if(throwable0 != null) {
            zk.a(throwable0);
            String s6 = throwable0.getMessage();
            if(s6 == null) {
                s6 = "캡쳐에 실패했습니다. 내용이 긴 글은 저장이 어려울 수 있습니다.";
                L.o("캡쳐에 실패했습니다. 내용이 긴 글은 저장이 어려울 수 있습니다.", "getString(...)");
            }
            Dl.G(context4, s6);
            return S0.a;
        }
        if(uri0 != null) {
            String s7 = Gk.s(uri0, kotlin.coroutines.jvm.internal.b.a(false));
            String s8 = Fk.i(s7);
            if(s7 != null && s7.length() != 0) {
                if(Build.VERSION.SDK_INT <= 28) {
                    String s9 = context4.getString(0x7F1501CE, new Object[]{s8});  // string:capture_view_success "[%1$s]에 저장되었습니다."
                    L.o(s9, "getString(...)");
                    Dl.G(context4, s9);
                    p p0 = (String s3, Uri uri0) -> {
                        L.p(s5, "this$0");
                        com.dcinside.app.scan.a.a.a(s7);
                        L.m(uri0);
                        s5.g0(bitmap0, s8, uri0);
                    };
                    MediaScannerConnection.scanFile(context4, new String[]{s7}, new String[]{"image/jpeg"}, p0);
                    return S0.a;
                }
                String s10 = context4.getString(0x7F1501CE, new Object[]{s8});  // string:capture_view_success "[%1$s]에 저장되었습니다."
                L.o(s10, "getString(...)");
                Dl.G(context4, s10);
                s5.g0(bitmap0, s8, uri0);
                return S0.a;
            }
            Dl.D(context4, 0x7F1502F3);  // string:fail_create_folder "저장 경로를 생성할 수 없습니다."
            return S0.a;
        }
        Dl.D(context4, 0x7F1501CD);  // string:capture_view_fail "캡쳐에 실패했습니다. 내용이 긴 글은 저장이 어려울 수 있습니다."
        return S0.a;
    }

    // 检测为 Lambda 实现
    private static final void O(String s, s s1, Bitmap bitmap0, String s2, String s3, Uri uri0) [...]

    public final void P(@m String s) {
        static final class com.dcinside.app.read.tools.s.h extends N implements Function1 {
            public static final com.dcinside.app.read.tools.s.h e;

            static {
                com.dcinside.app.read.tools.s.h.e = new com.dcinside.app.read.tools.s.h();
            }

            com.dcinside.app.read.tools.s.h() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150213);  // string:confirm_block_image "해당 이미지를 차단하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.read.tools.s.i extends N implements Function1 {
            public static final com.dcinside.app.read.tools.s.i e;

            static {
                com.dcinside.app.read.tools.s.i.e = new com.dcinside.app.read.tools.s.i();
            }

            com.dcinside.app.read.tools.s.i() {
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


        static final class com.dcinside.app.read.tools.s.j extends N implements Function1 {
            final s e;
            final String f;

            com.dcinside.app.read.tools.s.j(s s0, String s1) {
                this.e = s0;
                this.f = s1;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.F(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            AppCompatActivity appCompatActivity0 = (AppCompatActivity)weakReference0.get();
            if(appCompatActivity0 != null) {
                com.dcinside.app.perform.e.e.a(appCompatActivity0).n(com.dcinside.app.read.tools.s.h.e).z(0x7F15034A).x(0x7F1501C1).b().Z1((Object object0) -> {
                    L.p(com.dcinside.app.read.tools.s.i.e, "$tmp0");
                    return (Boolean)com.dcinside.app.read.tools.s.i.e.invoke(object0);
                }).x5((Object object0) -> {
                    L.p(new com.dcinside.app.read.tools.s.j(this, s), "$tmp0");
                    new com.dcinside.app.read.tools.s.j(this, s).invoke(object0);
                });
            }
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean Q(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void R(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void S(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final Boolean T(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void U(Function1 function10, Object object0) [...]

    private final o V(boolean z, String s, int v, String s1) {
        static final class com.dcinside.app.read.tools.s.p extends N implements Function1 {
            final String e;
            final Map f;
            final int g;

            com.dcinside.app.read.tools.s.p(String s, Map map0, int v) {
                this.e = s;
                this.f = map0;
                this.g = v;
                super(1);
            }

            public final V a(List list0) {
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    PostImage postImage0 = (PostImage)list0.get(v1);
                    L.m(postImage0);
                    if(PostImage.e.a(this.e, postImage0, this.f)) {
                        String s = postImage0.l();
                        L.m(s);
                        return r0.a(v1, s);
                    }
                }
                return r0.a(this.g, this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }


        static final class q extends N implements Function1 {
            final s e;
            final String f;
            final boolean g;

            q(s s0, String s1, boolean z) {
                this.e = s0;
                this.f = s1;
                this.g = z;
                super(1);
            }

            public final void a(V v0) {
                Q q0 = this.e.g;
                z[] arr_z = {z.m.a(((Number)v0.a()).intValue(), (q0 == null ? null : q0.G0()), (q0 == null ? 0 : q0.c1()), this.f, ((String)v0.b()), this.g)};
                com.dcinside.app.image.j.a.l(arr_z);
                Dl.D(Application.e.c(), 0x7F150849);  // string:read_download_image_start "이미지 다운로드 시작"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((V)object0));
                return S0.a;
            }
        }

        o o0 = rx.g.v1(new com.dcinside.app.read.tools.l(z, this, v, s)).T1(() -> {
            L.p(this, "this$0");
            kl.b(new o[]{this.c});
        }).y5((Object object0) -> {
            L.p(new q(this, s1, z), "$tmp0");
            new q(this, s1, z).invoke(object0);
        }, (Throwable throwable0) -> Dl.G(Application.e.c(), throwable0.getMessage()));
        L.o(o0, "subscribe(...)");
        return o0;
    }

    private static final rx.g W(boolean z, s s0, int v, String s1) {
        L.p(s0, "this$0");
        L.p(s1, "$selectedImgUrl");
        if(z) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            return s0.p.d().g3((Object object0) -> {
                L.p(new com.dcinside.app.read.tools.s.p(s1, linkedHashMap0, v), "$tmp0");
                return (V)new com.dcinside.app.read.tools.s.p(s1, linkedHashMap0, v).invoke(object0);
            });
        }
        return rx.g.Q2(r0.a(v, s1));
    }

    // 检测为 Lambda 实现
    private static final V X(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void Y(s s0) [...]

    // 检测为 Lambda 实现
    private static final void Z(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.read.tools.a
    @m
    public String a(int v) {
        List list0 = this.h;
        if(list0 == null) {
            return null;
        }
        return list0.isEmpty() || list0.size() < v ? null : ((PostImageInfo)list0.get(v)).d();
    }

    // 检测为 Lambda 实现
    private static final void a0(Throwable throwable0) [...]

    @Override  // com.dcinside.app.read.tools.a
    public void b(@l String s, boolean z) {
        static final class com.dcinside.app.read.tools.s.k extends N implements A3.a {
            final s e;
            final boolean f;
            final String g;
            final int h;
            final String i;

            com.dcinside.app.read.tools.s.k(s s0, boolean z, String s1, int v, String s2) {
                this.e = s0;
                this.f = z;
                this.g = s1;
                this.h = v;
                this.i = s2;
                super(0);
            }

            @l
            public final o b() {
                return this.e.V(this.f, this.g, this.h, this.i);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.dcinside.app.read.tools.s.l extends N implements Function1 {
            final AppCompatActivity e;

            com.dcinside.app.read.tools.s.l(AppCompatActivity appCompatActivity0) {
                this.e = appCompatActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(Throwable throwable0) {
                Dl.G(this.e, throwable0.getMessage());
            }
        }


        static final class com.dcinside.app.read.tools.s.m extends N implements Function1 {
            public static final com.dcinside.app.read.tools.s.m e;

            static {
                com.dcinside.app.read.tools.s.m.e = new com.dcinside.app.read.tools.s.m();
            }

            com.dcinside.app.read.tools.s.m() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15028E);  // string:down_permission_fail "지정된 다운로드 경로에 파일 쓰기 권한을 확인할 수 없습니다.\n\n같은 경로 또는 다른 경로를 
                                            // 다시 선택하여 권한을 설정할 수 있습니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class n extends N implements Function1 {
            public static final n e;

            static {
                n.e = new n();
            }

            n() {
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


        static final class com.dcinside.app.read.tools.s.o extends N implements Function1 {
            final s e;
            final String f;

            com.dcinside.app.read.tools.s.o(s s0, String s1) {
                this.e = s0;
                this.f = s1;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.c(this.f, true, com.dcinside.app.image.f0.a);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(s, "url");
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            Object object0 = weakReference0.get();
            if(((AppCompatActivity)object0) == null || !kl.a(new o[]{this.c})) {
                return;
            }
            if(cl.i(((AppCompatActivity)object0), this)) {
                this.a = 1;
                this.e = r0.a(s, Boolean.valueOf(z));
                return;
            }
            Integer integer0 = null;
            List list0 = this.h;
            if(list0 != null) {
                if(list0.isEmpty()) {
                    list0 = null;
                }
                if(list0 != null) {
                    Integer integer1 = list0.indexOf(new PostImageInfo(s, null, null, false, false, false, 62, null));
                    if(integer1.intValue() >= 0) {
                        integer0 = integer1;
                    }
                    if(integer0 != null) {
                        int v = (int)integer0;
                        Q q0 = this.g;
                        if(q0 != null) {
                            String s1 = q0.k1();
                            if(s1 != null) {
                                if(Gk.f(ll.i()).b()) {
                                    this.c = com.dcinside.app.perform.e.e.a(((AppCompatActivity)object0)).m().A(new com.dcinside.app.read.tools.s.k(this, z, s, v, s1)).b().O1((Object object0) -> {
                                        L.p(new com.dcinside.app.read.tools.s.l(((AppCompatActivity)object0)), "$tmp0");
                                        new com.dcinside.app.read.tools.s.l(((AppCompatActivity)object0)).invoke(object0);
                                    }).t5();
                                    return;
                                }
                                this.b = com.dcinside.app.perform.e.e.a(((AppCompatActivity)object0)).n(com.dcinside.app.read.tools.s.m.e).z(0x7F1501D6).x(0x1040000).b().Z1((Object object0) -> {
                                    L.p(n.e, "$tmp0");
                                    return (Boolean)n.e.invoke(object0);
                                }).x5((Object object0) -> {
                                    L.p(new com.dcinside.app.read.tools.s.o(this, s), "$tmp0");
                                    new com.dcinside.app.read.tools.s.o(this, s).invoke(object0);
                                });
                                return;
                            }
                        }
                        Dl.D(((AppCompatActivity)object0), 0x7F15031F);  // string:failed_image_list "게시물에 다운받을 수 있는 이미지가 없습니다."
                        return;
                    }
                    Dl.D(((AppCompatActivity)object0), 0x7F15031F);  // string:failed_image_list "게시물에 다운받을 수 있는 이미지가 없습니다."
                    return;
                }
            }
            if(this.h == null) {
                Dl.D(((AppCompatActivity)object0), 0x7F150853);  // string:read_image_parsing "이미지 목록 생성중입니다. 잠시 후 다시 시도해주세요."
                return;
            }
            Dl.D(((AppCompatActivity)object0), 0x7F15031F);  // string:failed_image_list "게시물에 다운받을 수 있는 이미지가 없습니다."
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean b0(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.read.tools.a
    public void c(@m String s, boolean z, @l com.dcinside.app.image.f0 f00) {
        static final class r extends N implements A3.a {
            final s e;
            final String f;
            final List g;
            final boolean h;
            final com.dcinside.app.image.f0 i;
            final AppCompatActivity j;

            r(s s0, String s1, List list0, boolean z, com.dcinside.app.image.f0 f00, AppCompatActivity appCompatActivity0) {
                this.e = s0;
                this.f = s1;
                this.g = list0;
                this.h = z;
                this.i = f00;
                this.j = appCompatActivity0;
                super(0);
            }

            @l
            public final o d() {
                static final class com.dcinside.app.read.tools.s.r.a extends N implements Function1 {
                    final s e;
                    final String f;
                    final List g;
                    final boolean h;
                    final com.dcinside.app.image.f0 i;

                    com.dcinside.app.read.tools.s.r.a(s s0, String s1, List list0, boolean z, com.dcinside.app.image.f0 f00) {
                        this.e = s0;
                        this.f = s1;
                        this.g = list0;
                        this.h = z;
                        this.i = f00;
                        super(1);
                    }

                    public final void a(List list0) {
                        L.m(list0);
                        this.e.i0(this.f, this.g, list0, this.h, this.i);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((List)object0));
                        return S0.a;
                    }
                }

                o o0 = this.e.p.d().T1(() -> {
                    L.p(this.e, "this$0");
                    kl.b(new o[]{this.e.c});
                }).y5((Object object0) -> {
                    L.p(new com.dcinside.app.read.tools.s.r.a(this.e, this.f, this.g, this.h, this.i), "$tmp0");
                    new com.dcinside.app.read.tools.s.r.a(this.e, this.f, this.g, this.h, this.i).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this.j, "$activity");
                    Dl.G(this.j, throwable0.getMessage());
                });
                L.o(o0, "subscribe(...)");
                return o0;
            }

            // 检测为 Lambda 实现
            private static final void e(s s0) [...]

            // 检测为 Lambda 实现
            private static final void f(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void g(AppCompatActivity appCompatActivity0, Throwable throwable0) [...]

            @Override  // A3.a
            public Object invoke() {
                return this.d();
            }
        }


        static final class com.dcinside.app.read.tools.s.s extends N implements Function1 {
            public static final com.dcinside.app.read.tools.s.s e;

            static {
                com.dcinside.app.read.tools.s.s.e = new com.dcinside.app.read.tools.s.s();
            }

            com.dcinside.app.read.tools.s.s() {
                super(1);
            }

            public final Boolean a(Throwable throwable0) {
                return false;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        L.p(f00, "imageViewerMode");
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            Object object0 = weakReference0.get();
            if(((AppCompatActivity)object0) == null || !kl.a(new o[]{this.c})) {
                return;
            }
            List list0 = this.h;
            if(list0 != null) {
                if(list0.isEmpty()) {
                    list0 = null;
                }
                if(list0 != null) {
                    this.c = com.dcinside.app.perform.e.e.a(((AppCompatActivity)object0)).m().A(new r(this, s, list0, z, f00, ((AppCompatActivity)object0))).b().a4((Object object0) -> {
                        L.p(com.dcinside.app.read.tools.s.s.e, "$tmp0");
                        return (Boolean)com.dcinside.app.read.tools.s.s.e.invoke(object0);
                    }).t5();
                    return;
                }
            }
            if(this.h == null) {
                Dl.D(((AppCompatActivity)object0), 0x7F150853);  // string:read_image_parsing "이미지 목록 생성중입니다. 잠시 후 다시 시도해주세요."
                return;
            }
            Dl.D(((AppCompatActivity)object0), 0x7F15031F);  // string:failed_image_list "게시물에 다운받을 수 있는 이미지가 없습니다."
        }
    }

    public final boolean c0() {
        List list0 = this.h;
        if(list0 != null && (!(list0 instanceof Collection) || !list0.isEmpty())) {
            for(Object object0: list0) {
                if(((PostImageInfo)object0).g()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // com.dcinside.app.read.tools.a
    public void d(@l ContextMenu contextMenu0, @l String s) {
        L.p(contextMenu0, "menu");
        L.p(s, "url");
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            AppCompatActivity appCompatActivity0 = (AppCompatActivity)weakReference0.get();
            if(appCompatActivity0 != null) {
                List list0 = this.h;
                if(list0 != null) {
                    List list1 = list0.isEmpty() ? null : list0;
                    if(list1 != null) {
                        String s1 = list1.indexOf(new PostImageInfo(s, null, null, false, false, false, 62, null)) < 0 ? null : s;
                        if(s1 == null) {
                            Map map0 = this.i;
                            if(map0 == null) {
                                s1 = null;
                            }
                            else {
                                s1 = (String)map0.get(s);
                                if(s1 == null || list1.indexOf(new PostImageInfo(s1, null, null, false, false, false, 62, null)) < 0) {
                                    s1 = null;
                                }
                            }
                            if(s1 == null) {
                                return;
                            }
                        }
                        if(y.q(s1)) {
                            return;
                        }
                        Q q0 = this.g;
                        String s2 = B.E.k0();
                        boolean z = Q.n0.b(q0, s2) && (this.g != null && this.g.y0());
                        Integer integer0 = list1.indexOf(new PostImageInfo(s, null, null, false, false, false, 62, null));
                        if(integer0.intValue() < 0) {
                            integer0 = null;
                        }
                        PostImageInfo postImageInfo0 = integer0 == null ? null : ((PostImageInfo)list1.get(integer0.intValue()));
                        try {
                            V[] arr_v = {r0.a("com.dcinside.app.image.ImageBlockSettingFragment_EXTRA_IS_MANAGER", Boolean.valueOf(z)), r0.a("com.dcinside.app.image.ImageBlockSettingFragment_EXTRA_IMAGE_DOWNLOAD_URL", s1), r0.a("com.dcinside.app.image.EXTRA_IS_MANAGER_BLOCKED", Boolean.valueOf(postImageInfo0 != null && postImageInfo0.f())), r0.a("com.dcinside.app.image.EXTRA_HAS_BLOCK_DATA", Boolean.valueOf(PostImageInfo.g.a(postImageInfo0)))};
                            FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
                            L.o(fragmentManager0, "getSupportFragmentManager(...)");
                            FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                            ClassLoader classLoader0 = e.class.getClassLoader();
                            L.m(classLoader0);
                            Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.image.e");
                            if(fragment0 != null) {
                                ((e)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 4))));
                                ((e)fragment0).show(fragmentManager0, "com.dcinside.app.image.e");
                                this.n = (e)fragment0;
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                }
            }
        }
    }

    public final boolean d0() {
        x x0 = null;
        Adapter recyclerView$Adapter0 = this.j == null ? null : this.j.getAdapter();
        if(recyclerView$Adapter0 instanceof x) {
            x0 = (x)recyclerView$Adapter0;
        }
        return x0 == null ? false : x0.T0();
    }

    private final void e0(String s) {
        static final class t extends N implements Function1 {
            final String e;

            t(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.read.tools.s.u extends N implements Function1 {
            public static final com.dcinside.app.read.tools.s.u e;

            static {
                com.dcinside.app.read.tools.s.u.e = new com.dcinside.app.read.tools.s.u();
            }

            com.dcinside.app.read.tools.s.u() {
                super(1);
            }

            public final void a(Boolean boolean0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            AppCompatActivity appCompatActivity0 = (AppCompatActivity)weakReference0.get();
            if(appCompatActivity0 != null) {
                com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new t(s)).z(0x7F15034A).b().x5((Object object0) -> {
                    L.p(com.dcinside.app.read.tools.s.u.e, "$tmp0");
                    com.dcinside.app.read.tools.s.u.e.invoke(object0);
                });
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void f0(Function1 function10, Object object0) [...]

    private final void g0(Bitmap bitmap0, String s, Uri uri0) {
        PendingIntent pendingIntent0;
        String s2;
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            AppCompatActivity appCompatActivity0 = (AppCompatActivity)weakReference0.get();
            if(appCompatActivity0 != null) {
                Intent intent0 = Dl.k(uri0);
                Q q0 = this.g;
                if(q0 == null) {
                    s2 = "디시인사이드doc";
                }
                else {
                    String s1 = q0.k1();
                    if(s1 == null || s1.length() <= 0) {
                        s2 = "디시인사이드doc";
                    }
                    else {
                        s2 = appCompatActivity0.getString(0x7F1501CC, new Object[]{q0.k1()});  // string:capture_success "전체 화면 캡쳐 : %1$s"
                        L.m(s2);
                    }
                }
                try {
                    pendingIntent0 = PendingIntent.getActivity(appCompatActivity0, 0, intent0, Zk.d.c());
                }
                catch(Exception exception0) {
                    timber.log.b.a.y(exception0);
                    pendingIntent0 = null;
                }
                if(s == null) {
                    s = "디시인사이드";
                    L.o("디시인사이드", "getString(...)");
                }
                com.dcinside.app.util.Vk.a vk$a0 = Vk.a;
                Builder notificationCompat$Builder0 = vk$a0.a(appCompatActivity0, "com.dcinside.app_channel_7").O(s2).N(s).B0(s).I(vk.b(appCompatActivity0, 0x7F040158)).t0(0x7F0802F1).C(true).M(pendingIntent0);  // attr:colorPrimary
                try {
                    if(bitmap0 != null) {
                        notificationCompat$Builder0.b0(bitmap0);
                        notificationCompat$Builder0.z0(new BigPictureStyle().D(bitmap0));
                    }
                    Notification notification0 = notificationCompat$Builder0.h();
                    L.o(notification0, "build(...)");
                    vk$a0.e(appCompatActivity0, 201, notification0);
                    goto label_36;
                label_33:
                    if(bitmap0 == null) {
                        throw throwable0;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_33;
                }
                try {
                    bitmap0.recycle();
                }
                catch(Exception unused_ex) {
                }
                throw throwable0;
            label_36:
                if(bitmap0 != null) {
                    try {
                        bitmap0.recycle();
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
        }
    }

    public final void h0(@l Q q0, @l List list0, @l Map map0) {
        L.p(q0, "postInfo");
        L.p(list0, "imageList");
        L.p(map0, "gifMap");
        this.g = q0;
        this.h = list0;
        this.i = map0;
        this.p.c();
    }

    private final void i0(String s, List list0, List list1, boolean z, com.dcinside.app.image.f0 f00) {
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            AppCompatActivity appCompatActivity0 = (AppCompatActivity)weakReference0.get();
            if(appCompatActivity0 != null) {
                Q q0 = this.g;
                if(q0 == null) {
                    return;
                }
                String s1 = B.E.k0();
                boolean z1 = Q.n0.b(q0, s1) && (this.g != null && this.g.y0());
                com.dcinside.app.rx.bus.c.a(appCompatActivity0, new m0(q0.G0(), q0.c1(), q0.k1(), s, new ArrayList(list0), new ArrayList(list1), z, f00.ordinal(), null, z1, null, null, 0xD00, null));
            }
        }
    }

    public final void j0() {
        this.L();
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            AppCompatActivity appCompatActivity0 = (AppCompatActivity)weakReference0.get();
            if(appCompatActivity0 != null) {
                Q q0 = this.g;
                if(q0 == null) {
                    return;
                }
                if(q0.B1()) {
                    return;
                }
                RecyclerView recyclerView0 = this.j;
                if(recyclerView0 != null) {
                    Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
                    if(!(recyclerView$Adapter0 instanceof x)) {
                        recyclerView$Adapter0 = null;
                    }
                    if(((x)recyclerView$Adapter0) != null) {
                        String s = uk.TG(q0.G0(), q0.c1(), q0.F0());
                        LifecycleCoroutineScope lifecycleCoroutineScope0 = LifecycleOwnerKt.a(appCompatActivity0);
                        L.m(s);
                        V v0 = com.dcinside.app.read.capture.b.m(appCompatActivity0, lifecycleCoroutineScope0, ((x)recyclerView$Adapter0), q0, s);
                        this.l = (f)v0.a();
                        this.k = (I0)v0.b();
                    }
                }
            }
        }
    }

    public final void k0(@l AppCompatActivity appCompatActivity0) {
        L.p(appCompatActivity0, "activity");
        this.f = new WeakReference(appCompatActivity0);
    }

    public final void l0(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "contentRecyclerView");
        this.j = recyclerView0;
    }

    public final void m0() {
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            AppCompatActivity appCompatActivity0 = (AppCompatActivity)weakReference0.get();
            if(appCompatActivity0 != null) {
                if(cl.i(appCompatActivity0, this)) {
                    this.a = 2;
                    return;
                }
                FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
                L.o(fragmentManager0, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                ClassLoader classLoader0 = com.dcinside.app.post.fragments.i.class.getClassLoader();
                L.m(classLoader0);
                Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.post.fragments.i");
                if(fragment0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.post.fragments.CaptureModeSelectDialogFragment");
                }
                ((com.dcinside.app.post.fragments.i)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
                ((com.dcinside.app.post.fragments.i)fragment0).show(fragmentManager0, "com.dcinside.app.post.fragments.i");
                this.o = (com.dcinside.app.post.fragments.i)fragment0;
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@m PermissionDeniedResponse permissionDeniedResponse0) {
        Dl.D(Application.e.c(), cl.b((permissionDeniedResponse0 == null ? null : permissionDeniedResponse0.getPermissionName())));
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@m PermissionGrantedResponse permissionGrantedResponse0) {
        switch(this.a) {
            case 1: {
                V v0 = this.e;
                if(v0 == null) {
                    return;
                }
                this.e = null;
                this.b(((String)v0.a()), ((Boolean)v0.b()).booleanValue());
                return;
            }
            case 2: {
                this.m0();
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@m PermissionRequest permissionRequest0, @m PermissionToken permissionToken0) {
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        this.L();
        this.j = null;
        kl.b(new o[]{this.c, this.b, this.d});
        this.c = null;
        this.b = null;
        try {
            com.dcinside.app.post.fragments.i i0 = this.o;
            if(i0 != null) {
                i0.dismissAllowingStateLoss();
            }
        }
        catch(Exception unused_ex) {
        }
        this.o = null;
        e e0 = this.n;
        if(e0 != null) {
            try {
                e0.dismissAllowingStateLoss();
            }
            catch(Exception unused_ex) {
            }
        }
        this.n = null;
        this.p.c();
    }

    public final void v(@m String s, @m String s1) {
        if(s == null) {
            return;
        }
        if(s1 == null) {
            return;
        }
        List list0 = this.h;
        PostImageInfo postImageInfo0 = null;
        if(list0 != null) {
            for(Object object0: list0) {
                if(L.g(((PostImageInfo)object0).a(), s) && L.g(((PostImageInfo)object0).c(), s1)) {
                    postImageInfo0 = object0;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        if(postImageInfo0 != null) {
            postImageInfo0.h(true);
        }
    }
}

