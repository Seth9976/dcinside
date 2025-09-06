package com.dcinside.app.image;

import A3.p;
import Y.z;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.dcinside.app.Application;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.mod.DirectoryChooserConfig;
import com.dcinside.app.mod.h.c;
import com.dcinside.app.mod.h;
import com.dcinside.app.model.PostImage;
import com.dcinside.app.model.PostImageInfo;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.U;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Fk;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.gl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.nl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.util.xk;
import com.dcinside.app.util.zk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.g1;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import rx.o;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nImageViewerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerActivity.kt\ncom/dcinside/app/image/ImageViewerActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,978:1\n1557#2:979\n1628#2,3:980\n774#2:994\n865#2,2:995\n774#2:997\n865#2,2:998\n1611#2,9:1002\n1863#2:1011\n1864#2:1013\n1620#2:1014\n774#2:1015\n865#2,2:1016\n13367#3,2:983\n257#4,2:985\n257#4,2:987\n257#4,2:989\n257#4,2:1018\n327#4,4:1022\n38#5:991\n38#5:993\n147#5:1000\n147#5:1001\n1#6:992\n1#6:1012\n37#7,2:1020\n*S KotlinDebug\n*F\n+ 1 ImageViewerActivity.kt\ncom/dcinside/app/image/ImageViewerActivity\n*L\n194#1:979\n194#1:980,3\n480#1:994\n480#1:995,2\n498#1:997\n498#1:998,2\n699#1:1002,9\n699#1:1011\n699#1:1013\n699#1:1014\n718#1:1015\n718#1:1016,2\n207#1:983,2\n225#1:985,2\n231#1:987,2\n240#1:989,2\n725#1:1018,2\n968#1:1022,4\n271#1:991\n393#1:993\n559#1:1000\n612#1:1001\n699#1:1012\n775#1:1020,2\n*E\n"})
public final class ImageViewerActivity extends g implements c, PermissionListener {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private String A;
    @m
    private String B;
    private boolean C;
    private int D;
    @m
    private List E;
    @m
    private List F;
    @l
    private final Map G;
    @l
    private final g0 H;
    @l
    private final r0 I;
    @l
    private final com.dcinside.app.image.s0 J;
    @m
    private g1 K;
    @l
    private final P0 L;
    @m
    private h M;
    @l
    private final n M8;
    @m
    private ActivityResultLauncher N;
    @l
    public static final a N8 = null;
    @m
    private I0 O;
    @l
    public static final String O8 = "imageViewerSelectedPosition";
    @l
    private Set P;
    @l
    public static final String P8 = "imageViewerSelectedPositions";
    private int Q;
    @m
    private o X;
    @m
    private b Y;
    @m
    private o Z;
    private z w;
    @m
    private Cursor x;
    private int y;
    @m
    private String z;

    static {
        ImageViewerActivity.N8 = new a(null);
    }

    public ImageViewerActivity() {
        public static final class n extends OnBackPressedCallback {
            final ImageViewerActivity d;

            n(ImageViewerActivity imageViewerActivity0) {
                this.d = imageViewerActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                if(this.d.Q == f0.d.ordinal()) {
                    Intent intent0 = new Intent();
                    intent0.putExtra("imageViewerSelectedPositions", u.U5(this.d.P));
                    this.d.setResult(-1, intent0);
                    this.d.finish();
                    return;
                }
                z z0 = this.d.w;
                if(z0 == null) {
                    L.S("binding");
                    z0 = null;
                }
                BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.x0(z0.o.h);
                L.o(bottomSheetBehavior0, "from(...)");
                switch(bottomSheetBehavior0.getState()) {
                    case 3: {
                        bottomSheetBehavior0.g(4);
                        return;
                    }
                    case 5: {
                        this.d.D3();
                        return;
                    }
                    default: {
                        this.d.finish();
                    }
                }
            }
        }

        this.G = new LinkedHashMap();
        this.H = new g0();
        this.I = new r0();
        this.J = new com.dcinside.app.image.s0(this);
        this.L = (g1 g10) -> {
            L.p(this, "this$0");
            L.p(g10, "results");
            this.w3(g10);
        };
        this.P = new LinkedHashSet();
        this.M8 = new n(this);
    }

    public final void A3(float f) {
        int v = Color.argb(((int)s.A(255.0f * s.A(s.t(0.3f * f + 0.7f, 0.0f), 1.0f) + 0.5f, 255.0f)), 0, 0, 0);
        z z0 = this.w;
        z z1 = null;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        z0.b.setBackgroundColor(v);
        z z2 = this.w;
        if(z2 == null) {
            L.S("binding");
            z2 = null;
        }
        z2.o.b.setBackgroundColor(v);
        z z3 = this.w;
        if(z3 == null) {
            L.S("binding");
            z3 = null;
        }
        float f1 = s.A(s.t(1.0f - f, 0.0f), 1.0f);
        z3.o.d.setAlpha(f1);
        z z4 = this.w;
        if(z4 == null) {
            L.S("binding");
        }
        else {
            z1 = z4;
        }
        View view0 = z1.o.e;
        L.o(view0, "imageViewerDownloadingIc");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin = Dk.d(((int)(f == 0.0f ? 10.0f : 10.0f + f * 20.0f)));
        view0.setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
    }

    public final void B3(int v) {
    }

    private final void C3(Intent intent0) {
        try {
            Uri uri0 = intent0.getData();
            if(uri0 != null && Gk.e(uri0).b()) {
                ContentResolver contentResolver0 = this.getContentResolver();
                this.grantUriPermission("com.dcinside.app.android", uri0, 3);
                contentResolver0.takePersistableUriPermission(uri0, 3);
                ll.j(uri0.toString());
                this.J2();
                return;
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        com.dcinside.app.internal.c.v(this, 0x7F150B27);  // string:unknown_dir_path "이 경로는 다운로드 기능을 지원할 수 없습니다.\n\n일시적인 문제이거나, 해당 경로 쓰기 권한을 
                                                          // 지원하지 않는 안드로이드 버전입니다."
    }

    public final void D3() {
        z z0 = this.w;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        CoordinatorLayout coordinatorLayout0 = z0.b;
        L.o(coordinatorLayout0, "imageViewerAppbar");
        z z1 = this.w;
        if(z1 == null) {
            L.S("binding");
            z1 = null;
        }
        ConstraintLayout constraintLayout0 = z1.k;
        L.o(constraintLayout0, "imageViewerOverlays");
        t t0 = new t(constraintLayout0);
        z z2 = this.w;
        if(z2 == null) {
            L.S("binding");
            z2 = null;
        }
        BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.x0(z2.o.h);
        L.o(bottomSheetBehavior0, "from(...)");
        if(bottomSheetBehavior0.getState() == 5) {
            bottomSheetBehavior0.g(4);
            bottomSheetBehavior0.l1(false);
            coordinatorLayout0.animate().cancel();
            coordinatorLayout0.animate().setDuration(150L).translationY(0.0f);
            constraintLayout0.animate().cancel();
            constraintLayout0.animate().setDuration(150L).alpha(1.0f).setListener(new nl((Animator animator0) -> {
                L.p(t0, "$weakOverlays");
                ConstraintLayout constraintLayout0 = (ConstraintLayout)t0.a();
                if(constraintLayout0 != null) {
                    constraintLayout0.setVisibility(0);
                }
            }, null, null, null));
            constraintLayout0.setVisibility(0);
            return;
        }
        bottomSheetBehavior0.l1(true);
        bottomSheetBehavior0.g(5);
        coordinatorLayout0.animate().cancel();
        coordinatorLayout0.animate().setDuration(150L).translationY(-0.0f);
        constraintLayout0.animate().cancel();
        constraintLayout0.animate().setDuration(150L).alpha(0.0f).setListener(new nl(null, (Animator animator0) -> {
            L.p(t0, "$weakOverlays");
            ConstraintLayout constraintLayout0 = (ConstraintLayout)t0.a();
            if(constraintLayout0 != null) {
                constraintLayout0.setVisibility(4);
            }
        }, null, null));
    }

    // 检测为 Lambda 实现
    private static final void E3(t t0, Animator animator0) [...]

    // 检测为 Lambda 实现
    private static final void F3(t t0, Animator animator0) [...]

    private final void G3(PostImageInfo postImageInfo0) {
        static final class y extends N implements Function1 {
            final boolean e;
            final ImageViewerActivity f;
            final String g;
            final String h;

            y(boolean z, ImageViewerActivity imageViewerActivity0, String s, String s1) {
                this.e = z;
                this.f = imageViewerActivity0;
                this.g = s;
                this.h = s1;
                super(1);
            }

            public final void a(com.dcinside.app.model.f0 f00) {
                if(f00.f()) {
                    String s = this.f.getString((this.e ? 0x7F1504D0 : 0x7F1504CF));  // string:image_manager_unblock_success "차단이 해제되었습니다.\n(해제 적용까지 최대 10분 소요)"
                    L.o(s, "getString(...)");
                    this.f.L3(s, true);
                    U.g.b(this.g, this.h, ((boolean)(true ^ this.e)));
                    return;
                }
                String s1 = f00.a();
                if(s1 == null) {
                    s1 = "잠시 후 다시 시도해주세요.";
                    L.o("잠시 후 다시 시도해주세요.", "getString(...)");
                }
                this.f.L3(s1, false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.f0)object0));
                return S0.a;
            }
        }

        String s = this.z;
        if(s == null) {
            return;
        }
        o o0 = this.Z;
        if(o0 != null) {
            o0.l();
        }
        String s1 = String.valueOf(this.D);
        String s2 = this.A;
        boolean z = postImageInfo0.f();
        String s3 = postImageInfo0.a();
        String s4 = postImageInfo0.c();
        com.dcinside.app.type.m m0 = com.dcinside.app.type.m.d.b(s);
        this.Z = (z ? uk.SF(s, s3, s4, m0) : uk.OF(postImageInfo0.d(), s, s1, s3, s4, s2, m0)).A5(rx.schedulers.c.e()).M3(rx.android.schedulers.a.c()).R1(() -> {
            L.p(this, "this$0");
            gl.c(this);
        }).T1(() -> {
            L.p(this, "this$0");
            gl.j(this);
        }).y5((Object object0) -> {
            L.p(new y(z, this, s3, s4), "$tmp0");
            new y(z, this, s3, s4).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            String s = throwable0.getMessage();
            if(s == null) {
                s = "잠시 후 다시 시도해주세요.";
                L.o("잠시 후 다시 시도해주세요.", "getString(...)");
            }
            this.L3(s, false);
        });
    }

    private final void H2() {
        this.getWindow().setStatusBarColor(0);
    }

    // 检测为 Lambda 实现
    private static final void H3(ImageViewerActivity imageViewerActivity0) [...]

    private final void I2() {
        z z0 = this.w;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        L.o(z0.m, "imageViewerRecycler");
        int v = z0.m.getCurrentPosition();
        List list0 = this.E;
        if(list0 == null) {
            Dl.D(this, 0x7F150475);  // string:image_block_is_impossible "이 이미지는 차단할 수 없습니다."
            return;
        }
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(((PostImageInfo)object0).g()) {
                    arrayList0.add(object0);
                }
            }
            if(v >= arrayList0.size()) {
                Dl.D(this, 0x7F150475);  // string:image_block_is_impossible "이 이미지는 차단할 수 없습니다."
                return;
            }
            PostImageInfo postImageInfo0 = (PostImageInfo)arrayList0.get(v);
            com.dcinside.app.realm.h.h.a(this, postImageInfo0.d(), postImageInfo0.a(), postImageInfo0.c());
            this.setResult(-1);
        }
    }

    // 检测为 Lambda 实现
    private static final void I3(ImageViewerActivity imageViewerActivity0) [...]

    private final void J2() {
        String s1;
        long v1;
        long v;
        g1 g10 = this.K;
        if(g10 == null) {
            v1 = 0L;
            v = 0L;
        }
        else {
            L.m(g10);
            if(g10.s()) {
                g1 g11 = this.K;
                L.m(g11);
                com.dcinside.app.realm.z z0 = (com.dcinside.app.realm.z)g11.x4().f0("state", 1).d2().f0("state", 2).r0();
                if(z0 == null) {
                    v1 = 0L;
                    v = 0L;
                }
                else {
                    g1 g12 = this.K;
                    L.m(g12);
                    RealmQuery realmQuery0 = g12.x4().g0("group", z0.S5());
                    v = realmQuery0.N();
                    v1 = realmQuery0.f0("state", 1).d2().f0("state", 2).N();
                }
            }
            else {
                v1 = 0L;
                v = 0L;
            }
        }
        z z1 = null;
        if(v1 == 0L) {
            String s = ll.i();
            try {
                L.m(s);
                s1 = Gk.r(Gk.f(s).n());
            }
            catch(Exception unused_ex) {
                if(Build.VERSION.SDK_INT >= 26) {
                    ll.j(null);
                }
                s1 = null;
            }
            z z2 = this.w;
            if(z2 == null) {
                L.S("binding");
            }
            else {
                z1 = z2;
            }
            TextView textView0 = z1.o.g;
            if(s1 != null) {
                s = s1;
            }
            textView0.setText(Fk.i(s));
            return;
        }
        z z3 = this.w;
        if(z3 == null) {
            L.S("binding");
        }
        else {
            z1 = z3;
        }
        String s2 = this.getString(0x7F150299, new Object[]{((long)(v - v1)), v});  // string:download_in_progress_count "이미지 저장 %1$d/%2$d"
        z1.o.g.setText(s2);
    }

    // 检测为 Lambda 实现
    private static final void J3(Function1 function10, Object object0) [...]

    private final void K2() {
        F0 f00 = this.F1();
        if(f00 == null) {
            return;
        }
        if(f00.C4(com.dcinside.app.realm.z.class).f0("state", 1).N() > 0L) {
            com.dcinside.app.image.ImageDownloadWorker.a.b(ImageDownloadWorker.a, null, 1, null);
        }
    }

    // 检测为 Lambda 实现
    private static final void K3(ImageViewerActivity imageViewerActivity0, Throwable throwable0) [...]

    private final void L2() {
        static final class com.dcinside.app.image.ImageViewerActivity.b extends N implements Function1 {
            public static final com.dcinside.app.image.ImageViewerActivity.b e;

            static {
                com.dcinside.app.image.ImageViewerActivity.b.e = new com.dcinside.app.image.ImageViewerActivity.b();
            }

            com.dcinside.app.image.ImageViewerActivity.b() {
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


        static final class com.dcinside.app.image.ImageViewerActivity.c extends N implements Function1 {
            public static final com.dcinside.app.image.ImageViewerActivity.c e;

            static {
                com.dcinside.app.image.ImageViewerActivity.c.e = new com.dcinside.app.image.ImageViewerActivity.c();
            }

            com.dcinside.app.image.ImageViewerActivity.c() {
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


        static final class d extends N implements Function1 {
            final ImageViewerActivity e;

            d(ImageViewerActivity imageViewerActivity0) {
                this.e = imageViewerActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.I2();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        e.e.a(this).n(com.dcinside.app.image.ImageViewerActivity.b.e).z(0x7F15034A).x(0x7F1501C1).b().Z1((Object object0) -> {
            L.p(com.dcinside.app.image.ImageViewerActivity.c.e, "$tmp0");
            return (Boolean)com.dcinside.app.image.ImageViewerActivity.c.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new d(this), "$tmp0");
            new d(this).invoke(object0);
        });
    }

    private final void L3(String s, boolean z) {
        static final class A extends N implements Function1 {
            final boolean e;
            final ImageViewerActivity f;

            A(boolean z, ImageViewerActivity imageViewerActivity0) {
                this.e = z;
                this.f = imageViewerActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                if(this.e) {
                    this.f.setResult(-1);
                    this.f.finish();
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.image.ImageViewerActivity.z extends N implements Function1 {
            final String e;

            com.dcinside.app.image.ImageViewerActivity.z(String s) {
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

        e.e.a(this).n(new com.dcinside.app.image.ImageViewerActivity.z(s)).z(0x7F15034A).b().x5((Object object0) -> {
            L.p(new A(z, this), "$tmp0");
            new A(z, this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean M2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void M3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void N2(Function1 function10, Object object0) [...]

    public final void N3(@m b b0) {
        this.Y = b0;
    }

    // 检测为 Lambda 实现
    private static final void O2(ImageViewerActivity imageViewerActivity0, g1 g10) [...]

    private final void O3() {
        List list1;
        if(this.F != null && !this.F.isEmpty() == 1) {
            z z0 = this.w;
            if(z0 == null) {
                L.S("binding");
                z0 = null;
            }
            z0.l.setVisibility(8);
            List list0 = this.F;
            if(list0 == null) {
                list1 = u.H();
            }
            else {
                list1 = new ArrayList();
                for(Object object0: list0) {
                    String s = ((PostImage)object0).l();
                    if(s == null) {
                        s = "";
                    }
                    list1.add(new PostImage(null, null, s, ((PostImage)object0).i(), 3, null));
                }
            }
            this.H.E(list1);
            this.a3(this.B);
        }
    }

    private final void P2(int v, int[] arr_v) {
        static final class com.dcinside.app.image.ImageViewerActivity.e extends N implements Function1 {
            public static final com.dcinside.app.image.ImageViewerActivity.e e;

            static {
                com.dcinside.app.image.ImageViewerActivity.e.e = new com.dcinside.app.image.ImageViewerActivity.e();
            }

            com.dcinside.app.image.ImageViewerActivity.e() {
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


        static final class f extends N implements Function1 {
            public static final f e;

            static {
                f.e = new f();
            }

            f() {
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


        static final class com.dcinside.app.image.ImageViewerActivity.g extends N implements Function1 {
            final ImageViewerActivity e;

            com.dcinside.app.image.ImageViewerActivity.g(ImageViewerActivity imageViewerActivity0) {
                this.e = imageViewerActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.d3();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        if(cl.i(this, this)) {
            this.y = v;
            return;
        }
        try {
            if(Gk.f(ll.i()).b()) {
                String s = this.z;
                int v1 = this.D;
                String s1 = this.A;
                int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
                com.dcinside.app.realm.z[] arr_z = (com.dcinside.app.realm.z[])this.H.G(s, v1, s1, arr_v1).toArray(new com.dcinside.app.realm.z[0]);
                com.dcinside.app.realm.z[] arr_z1 = (com.dcinside.app.realm.z[])Arrays.copyOf(arr_z, arr_z.length);
                j.a.l(arr_z1);
                return;
            }
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
        }
        e.e.a(this).n(com.dcinside.app.image.ImageViewerActivity.e.e).z(0x7F1501D6).x(0x1040000).b().Z1((Object object0) -> {
            L.p(f.e, "$tmp0");
            return (Boolean)f.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.image.ImageViewerActivity.g(this), "$tmp0");
            new com.dcinside.app.image.ImageViewerActivity.g(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean Q2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void R2(Function1 function10, Object object0) [...]

    @m
    public final b S2() {
        return this.Y;
    }

    private final void T2() {
        this.N = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            Intent intent0 = activityResult0.a();
            if(-1 == activityResult0.c() && intent0 != null) {
                this.C3(intent0);
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void U2(ImageViewerActivity imageViewerActivity0, ActivityResult activityResult0) [...]

    private final void V2() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.image.ImageViewerActivity$initViews$4", f = "ImageViewerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.ImageViewerActivity.h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final ImageViewerActivity l;

            com.dcinside.app.image.ImageViewerActivity.h(ImageViewerActivity imageViewerActivity0, kotlin.coroutines.d d0) {
                this.l = imageViewerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.ImageViewerActivity.h(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.f3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.image.ImageViewerActivity$initViews$5", f = "ImageViewerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final ImageViewerActivity l;

            i(ImageViewerActivity imageViewerActivity0, kotlin.coroutines.d d0) {
                this.l = imageViewerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new i(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.v3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.image.ImageViewerActivity$initViews$6", f = "ImageViewerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.ImageViewerActivity.j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final ImageViewerActivity l;

            com.dcinside.app.image.ImageViewerActivity.j(ImageViewerActivity imageViewerActivity0, kotlin.coroutines.d d0) {
                this.l = imageViewerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.ImageViewerActivity.j(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.y3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.image.ImageViewerActivity$initViews$7", f = "ImageViewerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final ImageViewerActivity l;

            k(ImageViewerActivity imageViewerActivity0, kotlin.coroutines.d d0) {
                this.l = imageViewerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new k(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.d3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.image.ImageViewerActivity$initViews$8", f = "ImageViewerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.ImageViewerActivity.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final ImageViewerActivity l;

            com.dcinside.app.image.ImageViewerActivity.l(ImageViewerActivity imageViewerActivity0, kotlin.coroutines.d d0) {
                this.l = imageViewerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.ImageViewerActivity.l(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.L2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.image.ImageViewerActivity$initViews$9", f = "ImageViewerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.ImageViewerActivity.m extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final ImageViewerActivity l;

            com.dcinside.app.image.ImageViewerActivity.m(ImageViewerActivity imageViewerActivity0, kotlin.coroutines.d d0) {
                this.l = imageViewerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.ImageViewerActivity.m(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.Z2();
                return S0.a;
            }
        }

        z z0 = this.w;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        z0.n.setBackgroundColor(0);
        z z1 = this.w;
        if(z1 == null) {
            L.S("binding");
            z1 = null;
        }
        z1.b.setSelected(true);
        z z2 = this.w;
        if(z2 == null) {
            L.S("binding");
            z2 = null;
        }
        boolean z3 = ll.l();
        this.H.F(z3);
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        z2.m.setLayoutManager(nonPredictiveLayoutManager0);
        z2.m.setAdapter(this.H);
        com.dcinside.app.image.N n0 = (int v, int v1) -> {
            L.p(this, "this$0");
            this.z3(v1);
        };
        z2.m.U(n0);
        z z4 = this.w;
        if(z4 == null) {
            L.S("binding");
            z4 = null;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager1 = new NonPredictiveLayoutManager();
        z4.o.f.setLayoutManager(nonPredictiveLayoutManager1);
        z4.o.f.setAdapter(this.I);
        com.dcinside.app.util.ql.b.d(z4.o.f);
        com.dcinside.app.image.O o0 = (View view0, int v) -> {
            L.p(this, "this$0");
            return this.x3(v);
        };
        com.dcinside.app.util.ql.b.e(z4.o.f, o0);
        z z5 = this.w;
        if(z5 == null) {
            L.S("binding");
            z5 = null;
        }
        ConstraintLayout constraintLayout0 = z5.o.h;
        BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.x0(constraintLayout0);
        L.o(bottomSheetBehavior0, "from(...)");
        bottomSheetBehavior0.h0(this.J);
        if(ll.x()) {
            float f = this.getResources().getDimension(0x7F07010F);  // dimen:image_viewer_panel_peek_height
            ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x1020002);
            View view0 = viewGroup0 == null ? null : viewGroup0.getChildAt(0);
            if(view0 != null) {
                view0.setOnApplyWindowInsetsListener((View view0, WindowInsets windowInsets0) -> {
                    L.p(constraintLayout0, "$it");
                    L.p(this, "this$0");
                    L.p(view0, "<anonymous parameter 0>");
                    L.p(windowInsets0, "insets");
                    BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.x0(constraintLayout0);
                    L.o(bottomSheetBehavior0, "from(...)");
                    bottomSheetBehavior0.p1(((int)(f + ((float)windowInsets0.getSystemWindowInsetTop()))));
                    if(Build.VERSION.SDK_INT < 30) {
                        z z0 = this.w;
                        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = null;
                        if(z0 == null) {
                            L.S("binding");
                            z0 = null;
                        }
                        ViewGroup.LayoutParams viewGroup$LayoutParams0 = z0.k.getLayoutParams();
                        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                            viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0;
                        }
                        if(viewGroup$MarginLayoutParams0 != null) {
                            viewGroup$MarginLayoutParams0.bottomMargin = bottomSheetBehavior0.H0();
                        }
                    }
                    return windowInsets0;
                });
            }
        }
        z z6 = this.w;
        if(z6 == null) {
            L.S("binding");
            z6 = null;
        }
        L.o(z6.o.b, "imageViewerDownloadingBg");
        com.dcinside.app.image.ImageViewerActivity.h imageViewerActivity$h0 = new com.dcinside.app.image.ImageViewerActivity.h(this, null);
        r.M(z6.o.b, null, imageViewerActivity$h0, 1, null);
        z z7 = this.w;
        if(z7 == null) {
            L.S("binding");
            z7 = null;
        }
        L.o(z7.d, "imageViewerDownAll");
        i imageViewerActivity$i0 = new i(this, null);
        r.M(z7.d, null, imageViewerActivity$i0, 1, null);
        z z8 = this.w;
        if(z8 == null) {
            L.S("binding");
            z8 = null;
        }
        L.o(z8.f, "imageViewerDownOne");
        com.dcinside.app.image.ImageViewerActivity.j imageViewerActivity$j0 = new com.dcinside.app.image.ImageViewerActivity.j(this, null);
        r.M(z8.f, null, imageViewerActivity$j0, 1, null);
        z z9 = this.w;
        if(z9 == null) {
            L.S("binding");
            z9 = null;
        }
        L.o(z9.o.c, "imageViewerDownloadingChange");
        k imageViewerActivity$k0 = new k(this, null);
        r.M(z9.o.c, null, imageViewerActivity$k0, 1, null);
        z z10 = this.w;
        if(z10 == null) {
            L.S("binding");
            z10 = null;
        }
        L.o(z10.c, "imageViewerBlockImage");
        com.dcinside.app.image.ImageViewerActivity.l imageViewerActivity$l0 = new com.dcinside.app.image.ImageViewerActivity.l(this, null);
        r.M(z10.c, null, imageViewerActivity$l0, 1, null);
        z z11 = this.w;
        if(z11 == null) {
            L.S("binding");
            z11 = null;
        }
        L.o(z11.j, "imageViewerManagerBlockImage");
        com.dcinside.app.image.ImageViewerActivity.m imageViewerActivity$m0 = new com.dcinside.app.image.ImageViewerActivity.m(this, null);
        r.M(z11.j, null, imageViewerActivity$m0, 1, null);
    }

    // 检测为 Lambda 实现
    private static final void W2(ImageViewerActivity imageViewerActivity0, int v, int v1) [...]

    // 检测为 Lambda 实现
    private static final boolean X2(ImageViewerActivity imageViewerActivity0, View view0, int v) [...]

    // 检测为 Lambda 实现
    private static final WindowInsets Y2(ConstraintLayout constraintLayout0, float f, ImageViewerActivity imageViewerActivity0, View view0, WindowInsets windowInsets0) [...]

    private final void Z2() {
        z z0 = this.w;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        L.o(z0.m, "imageViewerRecycler");
        int v = z0.m.getCurrentPosition();
        List list0 = this.E;
        if(list0 == null) {
            Dl.D(this, 0x7F150475);  // string:image_block_is_impossible "이 이미지는 차단할 수 없습니다."
            return;
        }
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(((PostImageInfo)object0).g()) {
                    arrayList0.add(object0);
                }
            }
            if(v >= arrayList0.size()) {
                Dl.D(this, 0x7F150475);  // string:image_block_is_impossible "이 이미지는 차단할 수 없습니다."
                return;
            }
            this.G3(((PostImageInfo)arrayList0.get(v)));
        }
    }

    private final void a3(String s) {
        z z0 = this.w;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        RecyclerViewPager recyclerViewPager0 = z0.m;
        L.o(recyclerViewPager0, "imageViewerRecycler");
        t t0 = new t(recyclerViewPager0);
        int v = this.H.v(s);
        if(v >= 0) {
            this.z3(v);
            recyclerViewPager0.post(() -> {
                L.p(t0, "$weakPager");
                RecyclerViewPager recyclerViewPager0 = (RecyclerViewPager)t0.a();
                if(recyclerViewPager0 != null) {
                    recyclerViewPager0.scrollToPosition(v);
                }
            });
            return;
        }
        int v1 = s.u(s.B(this.H.getItemCount() - 1, recyclerViewPager0.getCurrentPosition()), 0);
        this.z3(v1);
        recyclerViewPager0.post(() -> {
            L.p(t0, "$weakPager");
            RecyclerViewPager recyclerViewPager0 = (RecyclerViewPager)t0.a();
            if(recyclerViewPager0 != null) {
                recyclerViewPager0.scrollToPosition(v1);
            }
        });
    }

    @Override  // com.dcinside.app.mod.h$c
    public void b0() {
        h h0 = this.M;
        if(h0 != null) {
            h0.dismiss();
        }
    }

    // 检测为 Lambda 实现
    private static final void b3(t t0, int v) [...]

    // 检测为 Lambda 实现
    private static final void c3(t t0, int v) [...]

    private final void d3() {
        if(cl.i(this, this)) {
            this.y = 106;
            return;
        }
        try {
            Intent intent0 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            intent0.addFlags(67);
            ActivityResultLauncher activityResultLauncher0 = this.N;
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }
        catch(Exception unused_ex) {
            int v = dl.a.q2().j();
            h h0 = h.E0(DirectoryChooserConfig.f().d("새폴더").c(ll.i()).a(true).b());
            h0.J0(vk.b(this, 0x1010036));
            h0.setStyle(1, v);
            h0.show(this.getSupportFragmentManager(), null);
            this.M = h0;
        }
    }

    private final void e3(View view0) {
        z z0 = this.w;
        z z1 = null;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        L.o(z0.m, "imageViewerRecycler");
        int v = z0.m.getCurrentPosition();
        if(view0.isSelected()) {
            view0.setBackgroundResource(0x106000D);
            this.P.remove(v);
            view0.setSelected(false);
            return;
        }
        int v1 = U.a.b;
        if(this.P.size() >= v1) {
            ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x1020002);
            View view1 = viewGroup0 == null ? null : viewGroup0.getChildAt(0);
            if(view1 instanceof ViewGroup) {
                z1 = (ViewGroup)view1;
            }
            if(z1 == null) {
                return;
            }
            Snackbar.E0(((View)z1), this.getString(0x7F1507FE, new Object[]{v1}), 0).m0();  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
            return;
        }
        String s = (String)this.H.x().get(v).a().e();
        if(s == null) {
            s = "";
        }
        com.dcinside.app.album.l l0 = com.dcinside.app.album.l.a;
        z z2 = this.w;
        if(z2 == null) {
            L.S("binding");
        }
        else {
            z1 = z2;
        }
        CoordinatorLayout coordinatorLayout0 = z1.b();
        L.o(coordinatorLayout0, "getRoot(...)");
        if(!com.dcinside.app.album.l.p(l0, coordinatorLayout0, this, s, false, false, 16, null)) {
            return;
        }
        view0.setBackgroundResource(0x7F08046C);  // drawable:oval_accent0
        this.P.add(v);
        view0.setSelected(true);
    }

    private final void f3() {
        z z0 = this.w;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.x0(z0.o.h);
        L.o(bottomSheetBehavior0, "from(...)");
        if(bottomSheetBehavior0.getState() != 3) {
            bottomSheetBehavior0.g(3);
            return;
        }
        bottomSheetBehavior0.g(4);
    }

    // 检测为 Lambda 实现
    private static final void g3(ImageViewerActivity imageViewerActivity0, CompoundButton compoundButton0, boolean z) [...]

    @Override  // com.dcinside.app.base.d
    protected boolean h1() {
        return false;
    }

    // 检测为 Lambda 实现
    private static final boolean h3(ImageViewerActivity imageViewerActivity0, View view0, MotionEvent motionEvent0) [...]

    @Override  // com.dcinside.app.base.d
    protected boolean i1() {
        return false;
    }

    private final void i3() {
        @s0({"SMAP\nImageViewerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerActivity.kt\ncom/dcinside/app/image/ImageViewerActivity$onDisplayImages$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,978:1\n774#2:979\n865#2,2:980\n*S KotlinDebug\n*F\n+ 1 ImageViewerActivity.kt\ncom/dcinside/app/image/ImageViewerActivity$onDisplayImages$1\n*L\n667#1:979\n667#1:980,2\n*E\n"})
        static final class q extends N implements p {
            final ImageViewerActivity e;

            q(ImageViewerActivity imageViewerActivity0) {
                this.e = imageViewerActivity0;
                super(3);
            }

            public final List a(List list0, List list1, List list2) {
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator0 = list1.iterator();
            label_2:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    PostImage postImage0 = (PostImage)object0;
                    for(Object object1: list0) {
                        PostImage postImage1 = (PostImage)object1;
                        if(PostImage.e.a(postImage1.l(), postImage0, this.e.G)) {
                            postImage1.s(postImage0.l());
                            continue label_2;
                        }
                        if(false) {
                            break;
                        }
                    }
                    arrayList0.add(postImage0);
                }
                if(arrayList0.size() > 0) {
                    list0.addAll(arrayList0);
                }
                L.m(list0);
                List list3 = new ArrayList();
                for(Object object2: list0) {
                    int v = list2.indexOf(new PostImageInfo(((PostImage)object2).i(), null, null, false, false, false, 62, null));
                    if((v < 0 ? true : ((PostImageInfo)list2.get(v)).g())) {
                        list3.add(object2);
                    }
                }
                return list3;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((List)object0), ((List)object1), ((List)object2));
            }
        }


        static final class com.dcinside.app.image.ImageViewerActivity.r extends N implements Function1 {
            final ImageViewerActivity e;
            final String f;

            com.dcinside.app.image.ImageViewerActivity.r(ImageViewerActivity imageViewerActivity0, String s) {
                this.e = imageViewerActivity0;
                this.f = s;
                super(1);
            }

            public final void a(@l List list0) {
                L.p(list0, "postImages");
                if(list0.isEmpty()) {
                    throw new com.dcinside.app.http.f(0x7F150728);  // string:origin_empty "원본 첨부파일이 없습니다."
                }
                z z0 = this.e.w;
                if(z0 == null) {
                    L.S("binding");
                    z0 = null;
                }
                z0.l.setVisibility(8);
                this.e.H.E(list0);
                this.e.a3(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((List)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.image.ImageViewerActivity.s extends N implements Function1 {
            final String e;

            com.dcinside.app.image.ImageViewerActivity.s(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.image.ImageViewerActivity.t extends N implements Function1 {
            public static final com.dcinside.app.image.ImageViewerActivity.t e;

            static {
                com.dcinside.app.image.ImageViewerActivity.t.e = new com.dcinside.app.image.ImageViewerActivity.t();
            }

            com.dcinside.app.image.ImageViewerActivity.t() {
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


        static final class com.dcinside.app.image.ImageViewerActivity.u extends N implements Function1 {
            final ImageViewerActivity e;

            com.dcinside.app.image.ImageViewerActivity.u(ImageViewerActivity imageViewerActivity0) {
                this.e = imageViewerActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.i3();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }


        static final class v extends N implements Function1 {
            public static final v e;

            static {
                v.e = new v();
            }

            v() {
                super(1);
            }

            public final List a(Throwable throwable0) {
                return u.H();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }


        static final class com.dcinside.app.image.ImageViewerActivity.w extends N implements Function1 {
            public static final com.dcinside.app.image.ImageViewerActivity.w e;

            static {
                com.dcinside.app.image.ImageViewerActivity.w.e = new com.dcinside.app.image.ImageViewerActivity.w();
            }

            com.dcinside.app.image.ImageViewerActivity.w() {
                super(1);
            }

            public final PostImageInfo a(PostImageInfo postImageInfo0) {
                return postImageInfo0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((PostImageInfo)object0));
            }
        }


        static final class x extends N implements Function1 {
            public static final x e;

            static {
                x.e = new x();
            }

            x() {
                super(1);
            }

            public final PostImage a(PostImageInfo postImageInfo0) {
                String s = postImageInfo0.d();
                if(s == null) {
                    s = "";
                }
                return new PostImage(s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((PostImageInfo)object0));
            }
        }

        if(!kl.a(new o[]{this.X})) {
            return;
        }
        String s = this.B;
        z z0 = null;
        this.B = null;
        rx.g g0 = rx.g.y2(this.E).g3((Object object0) -> {
            L.p(x.e, "$tmp0");
            return (PostImage)x.e.invoke(object0);
        }).z6();
        rx.g g1 = rx.g.y2(this.E).g3((Object object0) -> {
            L.p(com.dcinside.app.image.ImageViewerActivity.w.e, "$tmp0");
            return (PostImageInfo)com.dcinside.app.image.ImageViewerActivity.w.e.invoke(object0);
        }).z6();
        rx.g g2 = rx.g.v1(new J(this));
        z z1 = this.w;
        if(z1 == null) {
            L.S("binding");
        }
        else {
            z0 = z1;
        }
        z0.l.setVisibility(0);
        this.X = rx.g.t0(g0, g2, g1, (Object object0, Object object1, Object object2) -> {
            L.p(new q(this), "$tmp0");
            return (List)new q(this).invoke(object0, object1, object2);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.image.ImageViewerActivity.r(this, s), "$tmp0");
            new com.dcinside.app.image.ImageViewerActivity.r(this, s).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(throwable0, "error");
            if(!this.isFinishing() && !this.isDestroyed()) {
                e.e.a(this).n(new com.dcinside.app.image.ImageViewerActivity.s((xk.i(throwable0.getMessage()) ? "원본 첨부파일이 없습니다." : throwable0.getMessage()))).z(0x7F1508D7).x(0x1040000).b().Z1((Object object0) -> {
                    L.p(com.dcinside.app.image.ImageViewerActivity.t.e, "$tmp0");
                    return (Boolean)com.dcinside.app.image.ImageViewerActivity.t.e.invoke(object0);
                }).y5((Object object0) -> {
                    L.p(new com.dcinside.app.image.ImageViewerActivity.u(imageViewerActivity0), "$tmp0");
                    new com.dcinside.app.image.ImageViewerActivity.u(imageViewerActivity0).invoke(object0);
                }, (Throwable throwable0) -> timber.log.b.a.y(throwable0));
            }
        });
    }

    @Override  // com.dcinside.app.base.d
    protected int j1() {
        return ContextCompat.getColor(this, 0x7F06008C);  // color:black
    }

    // 检测为 Lambda 实现
    private static final PostImage j3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final PostImageInfo k3(Function1 function10, Object object0) [...]

    private static final rx.g l3(ImageViewerActivity imageViewerActivity0) {
        L.p(imageViewerActivity0, "this$0");
        return imageViewerActivity0.F == null || !imageViewerActivity0.F.isEmpty() != 1 ? uk.hG(imageViewerActivity0.z, imageViewerActivity0.D).a4((Object object0) -> {
            L.p(v.e, "$tmp0");
            return (List)v.e.invoke(object0);
        }) : rx.g.Q2(imageViewerActivity0.F);
    }

    // 检测为 Lambda 实现
    private static final List m3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final List n3(p p0, Object object0, Object object1, Object object2) [...]

    // 检测为 Lambda 实现
    private static final void o3(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.image.ImageViewerActivity$onCreate$4", f = "ImageViewerActivity.kt", i = {}, l = {0xD6}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.ImageViewerActivity.o extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final long l;
            final ImageViewerActivity m;
            final int n;

            com.dcinside.app.image.ImageViewerActivity.o(long v, ImageViewerActivity imageViewerActivity0, int v1, kotlin.coroutines.d d0) {
                this.l = v;
                this.m = imageViewerActivity0;
                this.n = v1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.ImageViewerActivity.o(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.image.ImageViewerActivity.o)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.image.ImageViewerActivity$onCreate$4$1", f = "ImageViewerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.ImageViewerActivity.o.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final ImageViewerActivity l;
                    final Cursor m;
                    final int n;

                    com.dcinside.app.image.ImageViewerActivity.o.a(ImageViewerActivity imageViewerActivity0, Cursor cursor0, int v, kotlin.coroutines.d d0) {
                        this.l = imageViewerActivity0;
                        this.m = cursor0;
                        this.n = v;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.image.ImageViewerActivity.o.a(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.ImageViewerActivity.o.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        kotlin.f0.n(object0);
                        this.l.H.C(this.m);
                        this.l.z3(this.n);
                        z z0 = this.l.w;
                        if(z0 == null) {
                            L.S("binding");
                            z0 = null;
                        }
                        z0.m.scrollToPosition(this.n);
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        kotlin.f0.n(object0);
                        Cursor cursor0 = com.dcinside.app.album.l.a.g(this.l, false);
                        if(cursor0 == null) {
                            return S0.a;
                        }
                        Cursor cursor1 = this.m.x;
                        if(cursor1 != null) {
                            cursor1.close();
                        }
                        this.m.x = cursor0;
                        com.dcinside.app.image.ImageViewerActivity.o.a imageViewerActivity$o$a0 = new com.dcinside.app.image.ImageViewerActivity.o.a(this.m, cursor0, this.n, null);
                        this.k = 1;
                        return kotlinx.coroutines.i.h(h0.e(), imageViewerActivity$o$a0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        kotlin.f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        List list0;
        super.onCreate(bundle0);
        this.H2();
        this.Y = new b();
        this.getOnBackPressedDispatcher().i(this, this.M8);
        z z0 = z.c(this.getLayoutInflater());
        L.o(z0, "inflate(...)");
        this.w = z0;
        z z1 = null;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        this.setContentView(z0.b());
        z z2 = this.w;
        if(z2 == null) {
            L.S("binding");
            z2 = null;
        }
        this.S0(z2.n);
        kr.bhbfhfb.designcompat.a.d(this);
        Intent intent0 = this.getIntent();
        this.z = intent0.getStringExtra("com.dcinside.app.extra.GALLERY_ID");
        int v = 0;
        this.D = intent0.getIntExtra("com.dcinside.app.extra.POST_NUMBER", 0);
        this.A = intent0.getStringExtra("com.dcinside.app.extra.POST_SUBJECT");
        this.E = IntentCompat.c(intent0, "com.dcinside.app.extra.RESIZE_IMAGE_LIST", PostImageInfo.class);
        this.F = IntentCompat.c(intent0, "com.dcinside.app.extra.ORIGIN_IMAGE_LIST", PostImage.class);
        this.B = intent0.getStringExtra("com.dcinside.app.extra.IMAGE_SELECTED");
        this.C = intent0.getBooleanExtra("com.dcinside.app.extra.EXTRA_CAN_BLOCK", false);
        boolean z3 = intent0.getBooleanExtra("com.dcinside.app.extra.SHOW_PATH_CHANGE", false);
        F0 f00 = this.F1();
        if(f00 != null) {
            g1 g10 = f00.C4(com.dcinside.app.realm.z.class).q0();
            g10.l(this.L);
            this.K = g10;
        }
        this.V2();
        this.T2();
        this.A3(0.0f);
        int v1 = intent0.getIntExtra("com.dcinside.app.extra.EXTRA_SHOW_IMAGE_MODE", f0.a.ordinal());
        this.Q = v1;
        if(v1 == f0.b.ordinal()) {
            z z4 = this.w;
            if(z4 == null) {
                L.S("binding");
                z4 = null;
            }
            z4.l.setVisibility(8);
            z z5 = this.w;
            if(z5 == null) {
                L.S("binding");
            }
            else {
                z1 = z5;
            }
            z1.c.setVisibility(8);
            g0 g00 = this.H;
            String s = this.B;
            String s1 = s == null ? "" : s;
            if(s == null) {
                s = "";
            }
            g00.E(u.k(new PostImage(s1, s)));
        }
        else if(v1 == f0.c.ordinal()) {
            z z6 = this.w;
            if(z6 == null) {
                L.S("binding");
                z6 = null;
            }
            z6.c.setVisibility(8);
            z z7 = this.w;
            if(z7 == null) {
                L.S("binding");
                z7 = null;
            }
            z7.l.setVisibility(8);
            z z8 = this.w;
            if(z8 == null) {
                L.S("binding");
                z8 = null;
            }
            z8.o.h.setVisibility(8);
            z z9 = this.w;
            if(z9 == null) {
                L.S("binding");
            }
            else {
                z1 = z9;
            }
            z1.i.setVisibility(8);
            ArrayList arrayList0 = intent0.getStringArrayListExtra("com.dcinside.app.extra.EXTRA_VIDEO_THUMBNAIL_LIST");
            g0 g01 = this.H;
            if(arrayList0 == null) {
                list0 = u.H();
            }
            else {
                list0 = new ArrayList(u.b0(arrayList0, 10));
                for(Object object0: arrayList0) {
                    L.m(((String)object0));
                    list0.add(new PostImage(((String)object0), ((String)object0)));
                }
            }
            g01.E(list0);
            this.a3(this.B);
        }
        else if(v1 == f0.d.ordinal()) {
            z z10 = this.w;
            if(z10 == null) {
                L.S("binding");
                z10 = null;
            }
            z10.c.setVisibility(8);
            z z11 = this.w;
            if(z11 == null) {
                L.S("binding");
                z11 = null;
            }
            z11.l.setVisibility(8);
            z z12 = this.w;
            if(z12 == null) {
                L.S("binding");
                z12 = null;
            }
            z12.o.h.setVisibility(8);
            z z13 = this.w;
            if(z13 == null) {
                L.S("binding");
                z13 = null;
            }
            z13.i.setVisibility(8);
            long v2 = intent0.getLongExtra("com.dcinside.app.extra.EXTRA_ALBUM_BUCKET_ID", 0L);
            int v3 = intent0.getIntExtra("com.dcinside.app.extra.EXTRA_CURSOR_POSITION", 0);
            int[] arr_v = intent0.getIntArrayExtra("com.dcinside.app.extra.EXTRA_SELECTED_IMAGE_POSITIONS");
            if(arr_v != null && ((arr_v.length == 0 ? 1 : 0) ^ 1) == 1) {
                while(v < arr_v.length) {
                    this.P.add(((int)arr_v[v]));
                    ++v;
                }
            }
            I0 i00 = this.O;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            this.O = kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.image.ImageViewerActivity.o(v2, this, v3, null), 2, null);
        }
        else if(v1 == f0.e.ordinal()) {
            this.i3();
            z z14 = this.w;
            if(z14 == null) {
                L.S("binding");
                z14 = null;
            }
            z14.c.setVisibility(0);
            z z15 = this.w;
            if(z15 == null) {
                L.S("binding");
                z15 = null;
            }
            Spanned spanned0 = Dl.c("<u>차단</u>");
            z15.c.setText(spanned0);
            z z16 = this.w;
            if(z16 == null) {
                L.S("binding");
            }
            else {
                z1 = z16;
            }
            TextView textView0 = z1.j;
            L.o(textView0, "imageViewerManagerBlockImage");
            if(!this.C) {
                v = 8;
            }
            textView0.setVisibility(v);
            this.v3();
        }
        else if(v1 == f0.f.ordinal()) {
            z z17 = this.w;
            if(z17 == null) {
                L.S("binding");
                z17 = null;
            }
            z17.c.setVisibility(8);
            z z18 = this.w;
            if(z18 == null) {
                L.S("binding");
            }
            else {
                z1 = z18;
            }
            TextView textView1 = z1.j;
            L.o(textView1, "imageViewerManagerBlockImage");
            if(!this.C) {
                v = 8;
            }
            textView1.setVisibility(v);
            this.O3();
        }
        else {
            this.i3();
            z z19 = this.w;
            if(z19 == null) {
                L.S("binding");
                z19 = null;
            }
            z19.c.setVisibility(0);
            z z20 = this.w;
            if(z20 == null) {
                L.S("binding");
                z20 = null;
            }
            Spanned spanned1 = Dl.c("<u>차단</u>");
            z20.c.setText(spanned1);
            z z21 = this.w;
            if(z21 == null) {
                L.S("binding");
            }
            else {
                z1 = z21;
            }
            TextView textView2 = z1.j;
            L.o(textView2, "imageViewerManagerBlockImage");
            if(!this.C) {
                v = 8;
            }
            textView2.setVisibility(v);
        }
        if(z3) {
            this.d3();
        }
        this.K2();
    }

    @Override  // android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.image.ImageViewerActivity$onCreateOptionsMenu$3", f = "ImageViewerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.ImageViewerActivity.p extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final ImageViewerActivity m;

            com.dcinside.app.image.ImageViewerActivity.p(ImageViewerActivity imageViewerActivity0, kotlin.coroutines.d d0) {
                this.m = imageViewerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.image.ImageViewerActivity.p imageViewerActivity$p0 = new com.dcinside.app.image.ImageViewerActivity.p(this.m, d0);
                imageViewerActivity$p0.l = view0;
                return imageViewerActivity$p0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.e3(((View)this.l));
                return S0.a;
            }
        }

        L.p(menu0, "menu");
        int v = this.Q;
        CheckBox checkBox0 = null;
        if(v == f0.a.ordinal()) {
            this.getMenuInflater().inflate(0x7F100006, menu0);  // mipmap:ic_launcher10
            MenuItem menuItem0 = menu0.findItem(0x7F0B006D);  // id:action_original
            if(menuItem0 == null) {
                return super.onCreateOptionsMenu(menu0);
            }
            View view0 = menuItem0.getActionView();
            if(view0 != null) {
                checkBox0 = (CheckBox)view0.findViewById(0x7F0B0825);  // id:menu_original
            }
            if(checkBox0 != null) {
                checkBox0.setChecked(ll.l());
            }
            if(checkBox0 != null) {
                checkBox0.setOnCheckedChangeListener((CompoundButton compoundButton0, boolean z) -> {
                    L.p(this, "this$0");
                    this.t3(z);
                });
            }
            if(checkBox0 == null) {
                return super.onCreateOptionsMenu(menu0);
            }
            checkBox0.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
                L.p(this, "this$0");
                return this.u3();
            });
            return super.onCreateOptionsMenu(menu0);
        }
        if(v == f0.d.ordinal()) {
            this.getMenuInflater().inflate(0x7F100017, menu0);  // mipmap:ic_launcher26
            MenuItem menuItem1 = menu0.findItem(0x7F0B0073);  // id:action_select_images
            if(menuItem1 != null) {
                View view1 = menuItem1.getActionView();
                ImageView imageView0 = view1 == null ? null : ((ImageView)view1.findViewById(0x7F0B0813));  // id:menu_check
                if(imageView0 == null) {
                    return true;
                }
                z z0 = this.w;
                if(z0 == null) {
                    L.S("binding");
                    z0 = null;
                }
                L.o(z0.m, "imageViewerRecycler");
                Integer integer0 = z0.m.getCurrentPosition();
                imageView0.setSelected(this.P.contains(integer0));
                if(imageView0.isSelected()) {
                    imageView0.setBackgroundResource(0x7F08046C);  // drawable:oval_accent0
                }
                else {
                    imageView0.setBackgroundResource(0x106000D);
                }
                r.M(imageView0, null, new com.dcinside.app.image.ImageViewerActivity.p(this, null), 1, null);
            }
            return super.onCreateOptionsMenu(menu0);
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        kl.b(new o[]{this.Y, this.X, this.Z});
        this.Y = null;
        this.X = null;
        this.Z = null;
        I0 i00 = this.O;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.O = null;
        Cursor cursor0 = this.x;
        if(cursor0 != null) {
            cursor0.close();
        }
        this.x = null;
        g1 g10 = this.K;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.K = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.M8.g();
            return true;
        }
        if(menuItem0.getItemId() == 0x7F0B0075) {  // id:action_write
            z z0 = this.w;
            if(z0 == null) {
                L.S("binding");
                z0 = null;
            }
            L.o(z0.m, "imageViewerRecycler");
            int v = z0.m.getCurrentPosition();
            Intent intent0 = new Intent();
            intent0.putExtra("imageViewerSelectedPosition", v);
            this.setResult(-1, intent0);
            this.M8.g();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@m PermissionDeniedResponse permissionDeniedResponse0) {
        String s = permissionDeniedResponse0 == null ? null : permissionDeniedResponse0.getPermissionName();
        Dl.D(Application.e.c(), cl.b(s));
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@m PermissionGrantedResponse permissionGrantedResponse0) {
        String s = permissionGrantedResponse0 == null ? null : permissionGrantedResponse0.getPermissionName();
        Dl.D(Application.e.c(), cl.c(s));
        switch(this.y) {
            case 104: {
                this.y3();
                return;
            }
            case 105: {
                this.v3();
                return;
            }
            case 106: {
                this.d3();
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l PermissionRequest permissionRequest0, @m PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    // 检测为 Lambda 实现
    private static final void p3(ImageViewerActivity imageViewerActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final Boolean q3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void r3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s3(Throwable throwable0) [...]

    private final void t3(boolean z) {
        ll.k(z);
        this.H.F(z);
    }

    private final boolean u3() {
        return !kl.a(new o[]{this.X});
    }

    private final void v3() {
        this.P2(105, new int[0]);
    }

    private final void w3(g1 g10) {
        this.I.I(g10);
        this.J2();
    }

    private final boolean x3(int v) {
        Object object0 = this.I.D(v);
        com.dcinside.app.realm.z z0 = object0 instanceof com.dcinside.app.realm.z ? ((com.dcinside.app.realm.z)object0) : null;
        if(z0 == null) {
            return false;
        }
        switch(z0.V5()) {
            case 0: {
                try {
                    String s = z0.Y5();
                    String s1 = z0.T5();
                    try {
                        s1 = URLDecoder.decode(z0.T5(), "UTF-8");
                    }
                    catch(UnsupportedEncodingException unused_ex) {
                    }
                    Intent intent0 = Dl.m(s, s1);
                    if(intent0 != null) {
                        this.startActivity(intent0);
                        return true;
                    }
                }
                catch(Exception exception0) {
                    timber.log.b.a.y(exception0);
                    zk.a(exception0);
                }
                Dl.D(this, 0x7F150344);  // string:file_not_found "파일을 찾을 수 없거나, 해당 경로에 대한 읽기 권한이 없습니다."
                return true;
            }
            case 3: {
                j.a.l(new com.dcinside.app.realm.z[]{z0});
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.dcinside.app.mod.h$c
    public void y(@l String s) {
        L.p(s, "path");
        try {
            File file0 = new File(s, "access_dcinside_save_validate_text_file.txt");
            Gk.J("1", file0);
            if(!file0.delete()) {
                Dl.D(this, 0x7F150B27);  // string:unknown_dir_path "이 경로는 다운로드 기능을 지원할 수 없습니다.\n\n일시적인 문제이거나, 해당 경로 쓰기 권한을 
                                         // 지원하지 않는 안드로이드 버전입니다."
                return;
            }
            ll.j(s);
            this.J2();
        }
        catch(Exception unused_ex) {
            Dl.D(this, 0x7F150B27);  // string:unknown_dir_path "이 경로는 다운로드 기능을 지원할 수 없습니다.\n\n일시적인 문제이거나, 해당 경로 쓰기 권한을 
                                     // 지원하지 않는 안드로이드 버전입니다."
        }
        h h0 = this.M;
        if(h0 != null) {
            h0.dismiss();
        }
    }

    private final void y3() {
        z z0 = this.w;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        this.P2(104, new int[]{z0.m.getCurrentPosition()});
    }

    private final void z3(int v) {
        String s;
        int v1 = 0;
        if(this.H.getItemCount() == 0) {
            s = "0 / 0";
            L.o("0 / 0", "format(...)");
        }
        else {
            s = String.format(Locale.ENGLISH, "%s / %s", Arrays.copyOf(new Object[]{((int)(v + 1)), this.H.getItemCount()}, 2));
            L.o(s, "format(...)");
        }
        this.setTitle(s);
        List list0 = this.E;
        z z0 = null;
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(((PostImageInfo)object0).g()) {
                    arrayList0.add(object0);
                }
            }
            if(v >= arrayList0.size()) {
                z z1 = this.w;
                if(z1 == null) {
                    L.S("binding");
                    z1 = null;
                }
                z1.c.setVisibility(8);
            }
            else {
                PostImageInfo postImageInfo0 = (PostImageInfo)arrayList0.get(v);
                if(PostImageInfo.g.a(postImageInfo0)) {
                    z z2 = this.w;
                    if(z2 == null) {
                        L.S("binding");
                        z2 = null;
                    }
                    z2.c.setVisibility(0);
                    z z3 = this.w;
                    if(z3 == null) {
                        L.S("binding");
                        z3 = null;
                    }
                    TextView textView0 = z3.j;
                    L.o(textView0, "imageViewerManagerBlockImage");
                    if(!this.C) {
                        v1 = 8;
                    }
                    textView0.setVisibility(v1);
                    int v2 = postImageInfo0.f() ? 0x7F1504F2 : 0x7F1504F1;  // string:image_viewer_manager_unblock "<u>매니저 - 이미지 차단 해제</u>"
                    z z4 = this.w;
                    if(z4 == null) {
                        L.S("binding");
                        z4 = null;
                    }
                    Spanned spanned0 = Dl.c(this.getString(v2));
                    z4.j.setText(spanned0);
                }
                else {
                    z z5 = this.w;
                    if(z5 == null) {
                        L.S("binding");
                        z5 = null;
                    }
                    z5.c.setVisibility(8);
                    z z6 = this.w;
                    if(z6 == null) {
                        L.S("binding");
                        z6 = null;
                    }
                    z6.j.setVisibility(8);
                }
            }
        }
        z z7 = this.w;
        if(z7 == null) {
            L.S("binding");
            z7 = null;
        }
        MenuItem menuItem0 = z7.n.getMenu().findItem(0x7F0B0073);  // id:action_select_images
        if(menuItem0 != null) {
            View view0 = menuItem0.getActionView();
            ImageView imageView0 = view0 == null ? null : ((ImageView)view0.findViewById(0x7F0B0813));  // id:menu_check
            if(imageView0 == null) {
                return;
            }
            z z8 = this.w;
            if(z8 == null) {
                L.S("binding");
            }
            else {
                z0 = z8;
            }
            L.o(z0.m, "imageViewerRecycler");
            Integer integer0 = z0.m.getCurrentPosition();
            imageView0.setSelected(this.P.contains(integer0));
            if(imageView0.isSelected()) {
                imageView0.setBackgroundResource(0x7F08046C);  // drawable:oval_accent0
                return;
            }
            imageView0.setBackgroundResource(0x106000D);
        }
    }
}

