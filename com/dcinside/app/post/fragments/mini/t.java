package com.dcinside.app.post.fragments.mini;

import A3.p;
import Y.r2;
import Y.r6;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.h;
import com.dcinside.app.Application;
import com.dcinside.app.auth.LoginActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.post.FullProfileActivity;
import com.dcinside.app.post.c0;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.q;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.response.PostItem;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.tool.j;
import com.google.android.material.appbar.AppBarLayout.f;
import com.google.android.material.appbar.AppBarLayout;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.W;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.V;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nGallHeadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GallHeadManager.kt\ncom/dcinside/app/post/fragments/mini/GallHeadManager\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 5 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,971:1\n257#2,2:972\n257#2,2:974\n257#2,2:976\n255#2:978\n1#3:979\n1#3:983\n1#3:989\n1#3:994\n120#4,3:980\n124#4:985\n120#4,3:986\n124#4:990\n120#4,3:991\n124#4:996\n37#5:984\n37#5:995\n37#5:997\n*S KotlinDebug\n*F\n+ 1 GallHeadManager.kt\ncom/dcinside/app/post/fragments/mini/GallHeadManager\n*L\n210#1:972,2\n231#1:974,2\n234#1:976,2\n244#1:978\n683#1:983\n758#1:989\n789#1:994\n683#1:980,3\n683#1:985\n758#1:986,3\n758#1:990\n789#1:991,3\n789#1:996\n685#1:984\n791#1:995\n760#1:997\n*E\n"})
public final class t extends OnScrollListener implements h, PermissionListener {
    public static final class d {
        private d() {
        }

        public d(w w0) {
        }
    }

    @l
    private final r2 a;
    @m
    private View b;
    @m
    private View c;
    @m
    private TextView d;
    @m
    private TextView e;
    @m
    private ProgressBar f;
    @m
    private TextView g;
    private final Context h;
    @m
    private o i;
    @m
    private o j;
    @m
    private o k;
    @m
    private o l;
    private r6 m;
    @l
    private final f n;
    @m
    private GalleryInfo o;
    private int p;
    private boolean q;
    @l
    public static final d r = null;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 1;
    public static final int x = 2;

    static {
        t.r = new d(null);
    }

    public t(@l r2 r20) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.mini.GallHeadManager$2", f = "GallHeadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final t l;

            a(t t0, kotlin.coroutines.d d0) {
                this.l = t0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.f0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.mini.GallHeadManager$3", f = "GallHeadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final t l;

            b(t t0, kotlin.coroutines.d d0) {
                this.l = t0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.I(false);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.mini.GallHeadManager$4", f = "GallHeadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final t l;

            c(t t0, kotlin.coroutines.d d0) {
                this.l = t0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.a.J.setVisibility(8);
                return S0.a;
            }
        }

        L.p(r20, "binding");
        super();
        this.a = r20;
        this.h = r20.b().getContext();
        this.n = new s(this);
        this.p = -1;
        this.q = true;
        j.h(r20.l, 0);
        this.b = r20.e.findViewById(0x7F0B070F);  // id:list_mini_private
        this.c = r20.e.findViewById(0x7F0B0711);  // id:list_mini_private_container
        this.d = (TextView)r20.e.findViewById(0x7F0B0715);  // id:list_mini_private_title
        this.e = (TextView)r20.e.findViewById(0x7F0B0710);  // id:list_mini_private_button
        this.f = (ProgressBar)r20.e.findViewById(0x7F0B0713);  // id:list_mini_private_progress
        this.g = (TextView)r20.e.findViewById(0x7F0B0714);  // id:list_mini_private_time_out
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(r20.r.getContext(), 0, false);
        r20.r.setLayoutManager(linearLayoutManager0);
        u u0 = new u();
        r20.r.setAdapter(u0);
        r20.r.addOnScrollListener(this);
        L.o(r20.f, "listCoverModify");
        a t$a0 = new a(this, null);
        r.M(r20.f, null, t$a0, 1, null);
        L.o(r20.m, "listMiniJoinButton");
        b t$b0 = new b(this, null);
        r.M(r20.m, null, t$b0, 1, null);
        L.o(r20.k, "listMiniContainer");
        c t$c0 = new c(this, null);
        r.M(r20.k, null, t$c0, 1, null);
    }

    // 检测为 Lambda 实现
    private static final void A0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void B0(Throwable throwable0) [...]

    public final void C0(@l Intent intent0) {
        L.p(intent0, "data");
        ArrayList arrayList0 = intent0.getStringArrayListExtra("intent_path");
        if(arrayList0 == null) {
            return;
        }
        if(arrayList0.size() > 0) {
            String s = (String)arrayList0.get(0);
            if(s != null && s.length() != 0) {
                this.E0(s);
                return;
            }
            Dl.D(this.h, 0x7F1504CE);  // string:image_load_fail "이미지를 불러올 수 없습니다."
        }
    }

    private final void D0() {
        AppCompatActivity appCompatActivity0 = this.h instanceof AppCompatActivity ? ((AppCompatActivity)this.h) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        if(cl.i(appCompatActivity0, this)) {
            this.p = 103;
            return;
        }
        com.dcinside.app.album.h.c(appCompatActivity0).f(1).e("이미지를 선택해주세요.").c(1010).a();
    }

    private final void E0(String s) {
        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 != null) {
            String s1 = galleryInfo0.r();
            if(s1 != null) {
                F0 f00 = F0.g4();
                try {
                    L.m(f00);
                    f00.Y3((F0 f01) -> {
                        L.p(f00, "$r");
                        L.p(s1, "$galleryId");
                        RealmQuery realmQuery0 = f00.C4(q.class);
                        L.o(realmQuery0, "this.where(T::class.java)");
                        q q0 = (q)realmQuery0.i0("galleryId", s1).r0();
                        if(q0 == null) {
                            q q1 = new q();
                            q1.e6(s1);
                            q1.i6(s);
                            f00.t2(q1, new W[0]);
                            return;
                        }
                        q0.i6(s);
                    });
                }
                catch(Throwable throwable0) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable0;
                }
                kotlin.io.c.a(f00, null);
                this.G();
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void F0(F0 f00, String s, String s1, F0 f01) [...]

    private final void G() {
        String s1;
        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 == null) {
            return;
        }
        String s = galleryInfo0.r();
        if(s == null) {
            return;
        }
        AppCompatActivity appCompatActivity0 = this.h instanceof AppCompatActivity ? ((AppCompatActivity)this.h) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        if(2 == appCompatActivity0.getResources().getConfiguration().orientation) {
            this.Z();
            return;
        }
        F0 f00 = F0.g4();
        try {
            L.m(f00);
            if(com.dcinside.app.internal.c.o(appCompatActivity0)) {
                s1 = null;
            }
            else {
                RealmQuery realmQuery0 = f00.C4(q.class);
                L.o(realmQuery0, "this.where(T::class.java)");
                q q0 = (q)realmQuery0.i0("galleryId", s).r0();
                if(q0 == null) {
                    f00.Y3((F0 f00) -> {
                        L.p(s, "$galleryId");
                        q q0 = new q();
                        q0.e6(s);
                        f00.t2(q0, new W[0]);
                    });
                    s1 = null;
                }
                else {
                    s1 = q0.X5();
                }
            }
            goto label_30;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable1;
        }
    label_30:
        kotlin.io.c.a(f00, null);
        if(s1 == null) {
            s1 = galleryInfo0.m();
        }
        ImageView imageView0 = this.a.l;
        if(s1 == null || s1.length() == 0) {
            imageView0.setVisibility(4);
        }
        else {
            imageView0.setVisibility(0);
            L.m(imageView0);
            com.dcinside.app.image.o.a.e(imageView0, s1).d().apply();
        }
        this.J0(true);
    }

    public final void G0(@m GalleryInfo galleryInfo0) {
        if(galleryInfo0 == null) {
            return;
        }
        this.o = galleryInfo0;
        this.X();
    }

    // 检测为 Lambda 实现
    private static final void H(String s, F0 f00) [...]

    private final void H0(boolean z) {
        if(this.q != z) {
            this.q = z;
            this.e0(z);
        }
    }

    private final void I(boolean z) {
        static final class e extends N implements A3.a {
            final t e;

            e(t t0) {
                this.e = t0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.g0();
            }
        }


        static final class com.dcinside.app.post.fragments.mini.t.f extends N implements A3.a {
            final t e;

            com.dcinside.app.post.fragments.mini.t.f(t t0) {
                this.e = t0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.L();
            }
        }

        this.a.J.setVisibility(8);
        String s = B.E.k0();
        if(m0.a.a.h(s)) {
            this.n0(0x7F150517, 0x7F150537, true, new e(this));  // string:join_mini_need_login "로그인이 필요합니다. 로그인하시겠습니까?"
            return;
        }
        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 == null) {
            return;
        }
        int v = galleryInfo0.F();
        switch(v) {
            case 0: {
                t.p0(this, 0x7F1501C2, 0, true, new com.dcinside.app.post.fragments.mini.t.f(this), 2, null);  // string:cancel_request_join "멤버 가입 신청을 취소하시겠습니까?"
                return;
            label_13:
                if(v != 3) {
                    this.T(z);
                    return;
                }
                break;
            }
            case 1: {
                break;
            }
            default: {
                goto label_13;
            }
        }
        if(galleryInfo0.a0()) {
            this.T(z);
            return;
        }
        t.p0(this, 0x7F150881, 0, false, null, 2, null);  // string:rejected_by_manager "매니저에 의해 가입 불가 처리되어 해당 갤러리에 가입하실 수 없습니다."
    }

    private final void I0(boolean z) {
        r6 r60 = this.m;
        GradientDrawable gradientDrawable0 = null;
        if(r60 == null) {
            L.S("postListPersonHeaderBinding");
            r60 = null;
        }
        Drawable drawable0 = r60.h.getBackground();
        if(drawable0 instanceof GradientDrawable) {
            gradientDrawable0 = (GradientDrawable)drawable0;
        }
        if(gradientDrawable0 == null) {
            return;
        }
        if(z) {
            int v = this.h.getResources().getDimensionPixelSize(0x7F0700BC);  // dimen:divider
            L.o(this.h, "context");
            gradientDrawable0.setStroke(v, vk.b(this.h, 0x7F040241));  // attr:divColor
            return;
        }
        gradientDrawable0.setStroke(0, 0);
    }

    private final void J() {
        V v0;
        String s1;
        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 == null) {
            return;
        }
        if(!galleryInfo0.J() && !galleryInfo0.f0()) {
            return;
        }
        if(galleryInfo0.J()) {
            this.a.p.setVisibility(0);
            if(galleryInfo0.a0() || galleryInfo0.F() >= 0) {
                this.a.m.setVisibility(0);
                this.a.o.setVisibility(8);
            }
            else {
                this.a.m.setVisibility(8);
                this.a.o.setVisibility(0);
            }
            String s = Dl.a.format(galleryInfo0.E());
            if(galleryInfo0.y() <= 0) {
                s1 = this.h.getString(0x7F15063D, new Object[]{s});  // string:member_amount "멤버 %s"
            }
            else {
                Object[] arr_object = {s, Dl.a.format(galleryInfo0.y())};
                s1 = this.h.getString(0x7F15063E, arr_object);  // string:member_amount_both_limit "멤버 %1$s/%2$s"
            }
            this.a.p.setText(s1);
            switch(galleryInfo0.F()) {
                case 0: {
                    v0 = r0.a(0x7F080418, 0x7F1508C9);  // drawable:mini_join_ready_round
                    break;
                }
                case 1: 
                case 3: {
                    v0 = galleryInfo0.a0() ? r0.a(0x7F08041A, 0x7F150516) : r0.a(0x7F080419, 0x7F150882);  // drawable:mini_join_round
                    break;
                }
                default: {
                    v0 = r0.a(0x7F08041A, 0x7F150516);  // drawable:mini_join_round
                }
            }
            this.a.m.setBackgroundResource(((Number)v0.e()).intValue());
            String s2 = this.h.getString(((Number)v0.f()).intValue());
            this.a.m.setText(s2);
            if(galleryInfo0.F() == 2) {
                this.a.m.setVisibility(8);
            }
            return;
        }
        this.a.m.setVisibility(8);
        this.a.o.setVisibility(8);
        this.a.p.setVisibility(8);
    }

    private final void J0(boolean z) {
        int v1;
        int v;
        AppCompatActivity appCompatActivity0 = this.h instanceof AppCompatActivity ? ((AppCompatActivity)this.h) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        if(appCompatActivity0 instanceof c0 && ((c0)appCompatActivity0).f4()) {
            return;
        }
        if(z) {
            if(dl.a.q2().l()) {
                v = ContextCompat.getColor(appCompatActivity0, 0x7F0605B8);  // color:white
            }
            else {
                L.o(this.h, "context");
                v = vk.b(this.h, 0x7F04021E);  // attr:dcToolbarTextColor
            }
            v1 = 0;
        }
        else {
            L.o(this.h, "context");
            int v2 = vk.b(this.h, 0x7F040219);  // attr:dcToolbarColor
            L.o(this.h, "context");
            v1 = v2;
            v = vk.b(this.h, 0x7F04021E);  // attr:dcToolbarTextColor
        }
        appCompatActivity0.getWindow().setStatusBarColor(v1);
        this.a.D.setBackgroundColor(v1);
        this.a.D.setToolbarTintColor(v);
    }

    private final void K() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.mini.GallHeadManager$applyPersonCover$1", f = "GallHeadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final t l;
            final GalleryInfo m;

            g(t t0, GalleryInfo galleryInfo0, kotlin.coroutines.d d0) {
                this.l = t0;
                this.m = galleryInfo0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g(this.l, this.m, d0).invokeSuspend(S0.a);
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
                this.l.k0(this.m);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.mini.GallHeadManager$applyPersonCover$2", f = "GallHeadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.mini.t.h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final t l;
            final GalleryInfo m;

            com.dcinside.app.post.fragments.mini.t.h(t t0, GalleryInfo galleryInfo0, kotlin.coroutines.d d0) {
                this.l = t0;
                this.m = galleryInfo0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.mini.t.h(this.l, this.m, d0).invokeSuspend(S0.a);
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
                this.l.h0(this.m);
                return S0.a;
            }
        }

        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 == null) {
            return;
        }
        List list0 = galleryInfo0.M();
        if(list0 == null) {
            return;
        }
        Resources resources0 = this.h.getResources();
        String s = galleryInfo0.L();
        int v = 0;
        if(s == null || s.length() == 0) {
            r6 r63 = this.m;
            if(r63 == null) {
                L.S("postListPersonHeaderBinding");
                r63 = null;
            }
            L.o(r63.h, "personHeaderProfileImg");
            r63.h.setVisibility(8);
        }
        else {
            this.I0(false);
            r6 r60 = this.m;
            if(r60 == null) {
                L.S("postListPersonHeaderBinding");
                r60 = null;
            }
            L.o(r60.h, "personHeaderProfileImg");
            r60.h.setVisibility(0);
            r6 r61 = this.m;
            if(r61 == null) {
                L.S("postListPersonHeaderBinding");
                r61 = null;
            }
            com.dcinside.app.glide.c c0 = com.dcinside.app.glide.a.l(r61.h).t0(galleryInfo0.L()).S1().o2(this);
            r6 r62 = this.m;
            if(r62 == null) {
                L.S("postListPersonHeaderBinding");
                r62 = null;
            }
            c0.q1(r62.h);
        }
        float f = resources0.getDimension(0x7F0703C2);  // dimen:person_header_image_width
        L.o(this.h, "context");
        int v1 = vk.b(this.h, 0x1010038);
        r6 r64 = this.m;
        if(r64 == null) {
            L.S("postListPersonHeaderBinding");
            r64 = null;
        }
        L.o(r64.h, "personHeaderProfileImg");
        if(r64.h.getVisibility() == 0) {
            v = resources0.getDimensionPixelSize(0x7F0703C4);  // dimen:person_header_text_padding_end
        }
        r6 r65 = this.m;
        if(r65 == null) {
            L.S("postListPersonHeaderBinding");
            r65 = null;
        }
        r65.b.A(galleryInfo0.W(), v, v1, f / 1.5f, list0);
        r6 r66 = this.m;
        if(r66 == null) {
            L.S("postListPersonHeaderBinding");
            r66 = null;
        }
        L.o(r66.e, "personHeaderGoProfile");
        g t$g0 = new g(this, galleryInfo0, null);
        r.M(r66.e, null, t$g0, 1, null);
        r6 r67 = this.m;
        if(r67 == null) {
            L.S("postListPersonHeaderBinding");
            r67 = null;
        }
        L.o(r67.g, "personHeaderPersonalConnection");
        com.dcinside.app.post.fragments.mini.t.h t$h0 = new com.dcinside.app.post.fragments.mini.t.h(this, galleryInfo0, null);
        r.M(r67.g, null, t$h0, 1, null);
    }

    public final void K0() {
        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 == null) {
            return;
        }
        com.dcinside.app.type.m m0 = com.dcinside.app.type.m.i;
        if(galleryInfo0.q() != m0 && galleryInfo0.q() != com.dcinside.app.type.m.j) {
            return;
        }
        AppCompatActivity appCompatActivity0 = this.h instanceof AppCompatActivity ? ((AppCompatActivity)this.h) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        if(2 == appCompatActivity0.getResources().getConfiguration().orientation) {
            return;
        }
        if(galleryInfo0.q() == m0) {
            this.a.k.setVisibility(0);
            this.J0(true);
        }
        else if(galleryInfo0.q() == com.dcinside.app.type.m.j) {
            this.a.K.setVisibility(0);
        }
        this.H0(false);
        this.a0();
    }

    private final void L() {
        static final class i extends N implements Function1 {
            final t e;

            i(t t0) {
                this.e = t0;
                super(1);
            }

            public final void a(com.dcinside.app.model.f0 f00) {
                String s = f00.a();
                if(s != null) {
                    Dl.G(this.e.h, s);
                }
                Context context0 = this.e.h;
                c0 c00 = context0 instanceof c0 ? ((c0)context0) : null;
                if(c00 != null) {
                    c00.o4();
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.f0)object0));
                return S0.a;
            }
        }

        if(!kl.a(new o[]{this.k})) {
            return;
        }
        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 != null) {
            String s = galleryInfo0.r();
            if(s != null) {
                this.k = uk.Sj(s).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
                    L.p(new i(this), "$tmp0");
                    new i(this).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this, "this$0");
                    timber.log.b.a.e(throwable0);
                    Dl.D(this.h, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
                });
            }
        }
    }

    private final void L0(GalleryInfo galleryInfo0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.mini.GallHeadManager$showJoinView$2", f = "GallHeadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class v extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final t l;

            v(t t0, kotlin.coroutines.d d0) {
                this.l = t0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new v(this.l, d0).invokeSuspend(S0.a);
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
                this.l.I(true);
                return S0.a;
            }
        }

        V v0;
        this.a.x.setVisibility(8);
        View view0 = this.c;
        if(view0 != null) {
            view0.setVisibility(0);
        }
        if(galleryInfo0.a0() || galleryInfo0.F() >= 0) {
            TextView textView2 = this.e;
            if(textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.g;
            if(textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        else {
            TextView textView0 = this.e;
            if(textView0 != null) {
                textView0.setVisibility(8);
            }
            TextView textView1 = this.g;
            if(textView1 != null) {
                textView1.setVisibility(0);
            }
        }
        this.a.m.setVisibility(8);
        this.a.o.setVisibility(8);
        TextView textView4 = this.d;
        if(textView4 != null) {
            textView4.setText("멤버 가입 후 이용할 수 있습니다.");
        }
        switch(galleryInfo0.F()) {
            case 0: {
                v0 = r0.a(0x7F080418, 0x7F1508C9);  // drawable:mini_join_ready_round
                break;
            }
            case 1: 
            case 3: {
                v0 = galleryInfo0.a0() ? r0.a(0x7F08041A, 0x7F150516) : r0.a(0x7F080419, 0x7F150882);  // drawable:mini_join_round
                break;
            }
            default: {
                v0 = r0.a(0x7F08041A, 0x7F150516);  // drawable:mini_join_round
            }
        }
        TextView textView5 = this.e;
        if(textView5 != null) {
            textView5.setBackgroundResource(((Number)v0.e()).intValue());
        }
        TextView textView6 = this.e;
        if(textView6 != null) {
            textView6.setText(this.h.getString(((Number)v0.f()).intValue()));
        }
        TextView textView7 = this.e;
        if(textView7 != null) {
            r.M(textView7, null, new v(this, null), 1, null);
        }
    }

    // 检测为 Lambda 实现
    private static final void M(Function1 function10, Object object0) [...]

    private final void M0(int v) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.mini.GallHeadManager$showLoginView$1", f = "GallHeadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.mini.t.w extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final t l;

            com.dcinside.app.post.fragments.mini.t.w(t t0, kotlin.coroutines.d d0) {
                this.l = t0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.mini.t.w(this.l, d0).invokeSuspend(S0.a);
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
                this.l.g0();
                return S0.a;
            }
        }

        this.a.x.setVisibility(8);
        TextView textView0 = this.g;
        if(textView0 != null) {
            textView0.setVisibility(8);
        }
        View view0 = this.c;
        if(view0 != null) {
            view0.setVisibility(0);
        }
        TextView textView1 = this.e;
        if(textView1 != null) {
            textView1.setVisibility(0);
        }
        TextView textView2 = this.d;
        if(textView2 != null) {
            textView2.setText(this.h.getString(v));
        }
        TextView textView3 = this.e;
        if(textView3 != null) {
            textView3.setText("로그인");
        }
        TextView textView4 = this.e;
        if(textView4 != null) {
            textView4.setBackgroundResource(0x7F08041A);  // drawable:mini_join_round
        }
        TextView textView5 = this.e;
        if(textView5 != null) {
            r.M(textView5, null, new com.dcinside.app.post.fragments.mini.t.w(this, null), 1, null);
        }
    }

    // 检测为 Lambda 实现
    private static final void N(t t0, Throwable throwable0) [...]

    private final void N0() {
        this.a.b.setVisibility(0);
    }

    private final void O() {
        static final class com.dcinside.app.post.fragments.mini.t.j extends N implements Function1 {
            final t e;

            com.dcinside.app.post.fragments.mini.t.j(t t0) {
                this.e = t0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                CoordinatorLayout coordinatorLayout0 = this.e.a.e instanceof ViewGroup ? this.e.a.e : null;
                if(coordinatorLayout0 == null) {
                    return p$a0;
                }
                p$a0.J(0x7F15022A);  // string:cover_select_title "갤러리 커버 이미지 등록"
                View view0 = LayoutInflater.from(this.e.h).inflate(0x7F0E0279, coordinatorLayout0, false);  // layout:view_select_cover_title
                View view1 = view0.findViewById(0x7F0B0E00);  // id:select_cover_title
                L.o(view1, "findViewById(...)");
                ((TextView)view1).setText(0x7F15022A);  // string:cover_select_title "갤러리 커버 이미지 등록"
                return p$a0.f(view0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class k extends N implements Function1 {
            final t e;

            k(t t0) {
                this.e = t0;
                super(1);
            }

            public final void a(Integer integer0) {
                if(integer0 != null && ((int)integer0) == 0) {
                    this.e.D0();
                    return;
                }
                if(integer0 != null && ((int)integer0) == 1) {
                    this.e.E0(null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        AppCompatActivity appCompatActivity0 = this.h instanceof AppCompatActivity ? ((AppCompatActivity)this.h) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.a.v(com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new com.dcinside.app.post.fragments.mini.t.j(this)), 0x7F030007, 0, 2, null).d().x5((Object object0) -> {
            L.p(new k(this), "$tmp0");
            new k(this).invoke(object0);
        });
    }

    private final void O0(String s) {
        if(L.g(s, "ok")) {
            Dl.D(this.h, 0x7F1509F3);  // string:success_join_mini_member "멤버 가입이 완료되었습니다."
        }
        else if(L.g(s, "wait")) {
            Dl.D(this.h, 0x7F1509F4);  // string:success_join_request "멤버 가입 신청이 완료되었습니다."
        }
        c0 c00 = this.h instanceof c0 ? ((c0)this.h) : null;
        if(c00 != null) {
            c00.o4();
        }
    }

    // 检测为 Lambda 实现
    private static final void P(Function1 function10, Object object0) [...]

    private final void Q() {
        dl dl0 = dl.a;
        if(dl0.U0()) {
            return;
        }
        this.a.J.setVisibility(0);
        dl0.N4(true);
    }

    private final void R() {
        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 == null) {
            return;
        }
        if(galleryInfo0.r() == null) {
            return;
        }
        if(galleryInfo0.K() == null) {
        }
    }

    private final void S() {
        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 == null) {
            return;
        }
        if(galleryInfo0.F() == 2) {
            View view0 = this.c;
            if(view0 != null) {
                view0.setVisibility(8);
            }
            this.a.x.setVisibility(0);
            return;
        }
        if(galleryInfo0.J()) {
            switch(galleryInfo0.G()) {
                case 1: {
                    String s = B.E.k0();
                    if(s != null && s.length() > 0) {
                        View view1 = this.c;
                        if(view1 != null) {
                            view1.setVisibility(8);
                        }
                        return;
                    }
                    this.M0(0x7F1506E9);  // string:need_login_private_mini "멤버 가입 후 이용할 수 있습니다."
                    return;
                }
                case 2: {
                    this.L0(galleryInfo0);
                    return;
                }
            }
            this.a.x.setVisibility(0);
            View view2 = this.c;
            if(view2 != null) {
                view2.setVisibility(8);
            }
        }
        else {
            TextView textView0 = this.g;
            if(textView0 != null) {
                textView0.setVisibility(8);
            }
            String s1 = B.E.k0();
            if(s1 == null || s1.length() <= 0) {
                this.M0(0x7F1506E8);  // string:need_login_mini "고정닉만 이용할 수 있습니다."
            }
            else {
                this.a.x.setVisibility(0);
                View view3 = this.c;
                if(view3 != null) {
                    view3.setVisibility(8);
                }
            }
        }
    }

    private final void T(boolean z) {
        static final class com.dcinside.app.post.fragments.mini.t.l extends N implements Function1 {
            final t e;

            com.dcinside.app.post.fragments.mini.t.l(t t0) {
                this.e = t0;
                super(1);
            }

            public final void a(com.dcinside.app.response.c c0) {
                if(c0.f()) {
                    String s = c0.g();
                    if(s != null && s.length() != 0) {
                        this.e.m0(c0.g());
                        return;
                    }
                    this.e.v0();
                    return;
                }
                t.q0(this.e, (c0.a() == null ? "" : c0.a()), 0, false, null, 2, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.response.c)object0));
                return S0.a;
            }
        }

        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 != null) {
            String s = galleryInfo0.r();
            if(s == null || !kl.a(new o[]{this.j})) {
                return;
            }
            if(z) {
                ProgressBar progressBar0 = this.f;
                if(progressBar0 != null) {
                    progressBar0.setVisibility(0);
                }
                TextView textView0 = this.e;
                if(textView0 != null) {
                    textView0.setVisibility(8);
                }
            }
            else {
                this.a.n.setVisibility(0);
                this.a.m.setVisibility(4);
            }
            this.j = uk.TF(s).M3(rx.android.schedulers.a.c()).T1(() -> {
                L.p(this, "this$0");
                if(z) {
                    ProgressBar progressBar0 = this.f;
                    if(progressBar0 != null) {
                        progressBar0.setVisibility(8);
                    }
                    TextView textView0 = this.e;
                    if(textView0 != null) {
                        textView0.setVisibility(0);
                    }
                }
                else {
                    this.a.n.setVisibility(8);
                    this.a.m.setVisibility(0);
                }
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.post.fragments.mini.t.l(this), "$tmp0");
                new com.dcinside.app.post.fragments.mini.t.l(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                timber.log.b.a.e(throwable0);
                Dl.D(this.h, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
            });
        }
    }

    // 检测为 Lambda 实现
    private static final void U(t t0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void V(boolean z, t t0) [...]

    // 检测为 Lambda 实现
    private static final void W(Function1 function10, Object object0) [...]

    private final void X() {
        if(this.o == null) {
            return;
        }
        this.a.k.setVisibility(8);
        this.a.K.setVisibility(8);
        this.H0(true);
        this.J0(false);
    }

    @m
    public final GalleryInfo Y() {
        return this.o;
    }

    private final void Z() {
        this.a.k.setVisibility(8);
        this.a.K.setVisibility(8);
        this.H0(true);
        this.N0();
        this.J0(false);
    }

    private final void a0() {
        this.a.b.setVisibility(8);
    }

    private final void b0() {
        r6 r60 = this.m;
        if(r60 != null) {
            if(r60 == null) {
                L.S("postListPersonHeaderBinding");
                r60 = null;
            }
            ConstraintLayout constraintLayout0 = r60.b();
            L.o(constraintLayout0, "getRoot(...)");
            constraintLayout0.setVisibility(0);
            j.h(this.a.K, -2);
            this.K();
            return;
        }
        com.dcinside.app.post.fragments.mini.m m0 = (ViewStub viewStub0, View view0) -> {
            L.p(this, "this$0");
            r6 r60 = r6.a(view0);
            L.o(r60, "bind(...)");
            this.m = r60;
            r6 r61 = null;
            if(r60 == null) {
                L.S("postListPersonHeaderBinding");
                r60 = null;
            }
            r60.h.setClipToOutline(true);
            r6 r62 = this.m;
            if(r62 == null) {
                L.S("postListPersonHeaderBinding");
            }
            else {
                r61 = r62;
            }
            r61.h.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            j.h(this.a.K, -2);
            this.K();
        };
        this.a.K.setOnInflateListener(m0);
        this.a.K.inflate();
    }

    // 检测为 Lambda 实现
    private static final void c0(t t0, ViewStub viewStub0, View view0) [...]

    private static final void d0(t t0, AppBarLayout appBarLayout0, int v) {
        L.p(t0, "this$0");
        if(appBarLayout0 == null) {
            return;
        }
        if(Math.abs(v) == appBarLayout0.getTotalScrollRange()) {
            t0.Z();
        }
    }

    private final void e0(boolean z) {
        if(z) {
            this.a.c.B(this.n);
            return;
        }
        this.a.c.e(this.n);
    }

    private final void f0() {
        String s1;
        AppCompatActivity appCompatActivity0 = this.h instanceof AppCompatActivity ? ((AppCompatActivity)this.h) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 != null) {
            String s = galleryInfo0.r();
            if(s != null) {
                F0 f00 = F0.g4();
                try {
                    L.m(f00);
                    if(com.dcinside.app.internal.c.o(appCompatActivity0)) {
                        s1 = null;
                    }
                    else {
                        RealmQuery realmQuery0 = f00.C4(q.class);
                        L.o(realmQuery0, "this.where(T::class.java)");
                        q q0 = (q)realmQuery0.i0("galleryId", s).r0();
                        s1 = q0 == null ? null : q0.X5();
                    }
                }
                catch(Throwable throwable0) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable0;
                }
                kotlin.io.c.a(f00, null);
                if(s1 != null && s1.length() != 0) {
                    this.O();
                    return;
                }
                this.D0();
            }
        }
    }

    private final void g0() {
        static final class com.dcinside.app.post.fragments.mini.t.m extends N implements p {
            public static final com.dcinside.app.post.fragments.mini.t.m e;

            static {
                com.dcinside.app.post.fragments.mini.t.m.e = new com.dcinside.app.post.fragments.mini.t.m();
            }

            com.dcinside.app.post.fragments.mini.t.m() {
                super(3);
            }

            public final void a(int v, int v1, @m Intent intent0) {
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return S0.a;
            }
        }

        com.dcinside.app.base.d d0 = this.h instanceof com.dcinside.app.base.d ? ((com.dcinside.app.base.d)this.h) : null;
        if(d0 == null) {
            return;
        }
        if(com.dcinside.app.main.login.g.a.p()) {
            com.dcinside.app.base.d.y1(d0, 0, null, null, 0, false, 0x1F, null);
            return;
        }
        Intent intent0 = LoginActivity.x.b(d0, false);
        com.dcinside.app.base.d.t.a(d0, intent0, 0x403, com.dcinside.app.post.fragments.mini.t.m.e);
    }

    private final void h0(GalleryInfo galleryInfo0) {
        static final class n extends N implements Function1 {
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
                return p$a0.m(0x7F150771);  // string:person_header_go_pr_network "인맥은 모바일 웹에서 확인 가능합니다. 이동하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.post.fragments.mini.t.o extends N implements Function1 {
            final AppCompatActivity e;
            final String f;

            com.dcinside.app.post.fragments.mini.t.o(AppCompatActivity appCompatActivity0, String s) {
                this.e = appCompatActivity0;
                this.f = s;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    com.dcinside.app.main.a.i(this.e, this.f);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.n(this.h, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.h;
        String s = galleryInfo0.r();
        String s1 = appCompatActivity0.getString(0x7F150B4D, new Object[]{(s == null ? null : kotlin.text.v.l2(s, "pr$", "", false, 4, null))});  // string:url_pr_network "https://m.dcinside.com/pr_network/%1$s"
        L.o(s1, "getString(...)");
        dl dl0 = dl.a;
        if(dl0.t1()) {
            com.dcinside.app.main.a.i(appCompatActivity0, s1);
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(n.e).z(0x7F1501D4).x(0x7F1501D3).b().y5((Object object0) -> {
            L.p(new com.dcinside.app.post.fragments.mini.t.o(appCompatActivity0, s1), "$tmp0");
            new com.dcinside.app.post.fragments.mini.t.o(appCompatActivity0, s1).invoke(object0);
        }, (Throwable throwable0) -> com.hjq.toast.s.C(throwable0.getMessage()));
        dl0.j5(true);
    }

    // 检测为 Lambda 实现
    private static final void i0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void j0(Throwable throwable0) [...]

    private final void k0(GalleryInfo galleryInfo0) {
        String s = galleryInfo0.r();
        if(s == null) {
            return;
        }
        L.o(this.h, "context");
        FullProfileActivity.w.a(this.h, s);
    }

    public boolean l0(@l Drawable drawable0, @l Object object0, @m com.bumptech.glide.request.target.p p0, @l com.bumptech.glide.load.a a0, boolean z) {
        L.p(drawable0, "resource");
        L.p(object0, "model");
        L.p(a0, "dataSource");
        return false;
    }

    private final void m0(String s) {
        AppCompatActivity appCompatActivity0 = this.h instanceof AppCompatActivity ? ((AppCompatActivity)this.h) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 != null) {
            String s1 = galleryInfo0.r();
            if(s1 != null) {
                MiniJoinQuestionActivity.z.a(appCompatActivity0, s1, s);
            }
        }
    }

    private final void n0(int v, int v1, boolean z, A3.a a0) {
        String s = this.h.getString(v);
        L.o(s, "getString(...)");
        this.o0(s, v1, z, a0);
    }

    private final void o0(String s, int v, boolean z, A3.a a0) {
        static final class com.dcinside.app.post.fragments.mini.t.p extends N implements Function1 {
            final String e;

            com.dcinside.app.post.fragments.mini.t.p(String s) {
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


        static final class com.dcinside.app.post.fragments.mini.t.q extends N implements Function1 {
            public static final com.dcinside.app.post.fragments.mini.t.q e;

            static {
                com.dcinside.app.post.fragments.mini.t.q.e = new com.dcinside.app.post.fragments.mini.t.q();
            }

            com.dcinside.app.post.fragments.mini.t.q() {
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


        static final class com.dcinside.app.post.fragments.mini.t.r extends N implements Function1 {
            final A3.a e;

            com.dcinside.app.post.fragments.mini.t.r(A3.a a0) {
                this.e = a0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                A3.a a0 = this.e;
                if(a0 != null) {
                    a0.invoke();
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        AppCompatActivity appCompatActivity0 = this.h instanceof AppCompatActivity ? ((AppCompatActivity)this.h) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.a e$a0 = com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new com.dcinside.app.post.fragments.mini.t.p(s)).z(v);
        if(z) {
            e$a0 = e$a0.x(0x7F1501C1);  // string:cancel_request "취소"
        }
        e$a0.b().Z1((Object object0) -> {
            L.p(com.dcinside.app.post.fragments.mini.t.q.e, "$tmp0");
            return (Boolean)com.dcinside.app.post.fragments.mini.t.q.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.post.fragments.mini.t.r(a0), "$tmp0");
            new com.dcinside.app.post.fragments.mini.t.r(a0).invoke(object0);
        });
    }

    @Override  // com.bumptech.glide.request.h
    public boolean onLoadFailed(@m com.bumptech.glide.load.engine.q q0, @m Object object0, @l com.bumptech.glide.request.target.p p0, boolean z) {
        L.p(p0, "target");
        this.I0(true);
        return false;
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
        if(this.p == 103) {
            this.D0();
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l PermissionRequest permissionRequest0, @m PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    @Override  // com.bumptech.glide.request.h
    public boolean onResourceReady(Object object0, Object object1, com.bumptech.glide.request.target.p p0, com.bumptech.glide.load.a a0, boolean z) {
        return this.l0(((Drawable)object0), object1, p0, a0, z);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public void onScrollStateChanged(@l RecyclerView recyclerView0, int v) {
        L.p(recyclerView0, "recyclerView");
        if(v == 0 || v == 1) {
            c0 c00 = this.h instanceof c0 ? ((c0)this.h) : null;
            if(c00 != null) {
                c00.D3(v);
            }
        }
    }

    static void p0(t t0, int v, int v1, boolean z, A3.a a0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0x7F15034A;  // string:filter_apply "확인"
        }
        t0.n0(v, v1, z, a0);
    }

    static void q0(t t0, String s, int v, boolean z, A3.a a0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x7F15034A;  // string:filter_apply "확인"
        }
        t0.o0(s, v, z, a0);
    }

    // 检测为 Lambda 实现
    private static final Boolean r0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s0(Function1 function10, Object object0) [...]

    public final void t0() {
        this.R();
    }

    public final void u0() {
        o o0 = this.i;
        if(o0 != null) {
            o0.l();
        }
        this.i = null;
        o o1 = this.k;
        if(o1 != null) {
            o1.l();
        }
        this.k = null;
        o o2 = this.l;
        if(o2 != null) {
            o2.l();
        }
        this.l = null;
        o o3 = this.j;
        if(o3 != null) {
            o3.l();
        }
        this.j = null;
        this.a.r.clearOnScrollListeners();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    private final void v0() {
        static final class com.dcinside.app.post.fragments.mini.t.s extends N implements Function1 {
            final t e;

            com.dcinside.app.post.fragments.mini.t.s(t t0) {
                this.e = t0;
                super(1);
            }

            public final void a(com.dcinside.app.response.d d0) {
                if(d0.g() == null) {
                    Dl.G(this.e.h, (d0.a() == null ? "" : d0.a()));
                    return;
                }
                this.e.O0(d0.g());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.response.d)object0));
                return S0.a;
            }
        }

        if(!kl.a(new o[]{this.k})) {
            return;
        }
        GalleryInfo galleryInfo0 = this.o;
        if(galleryInfo0 != null) {
            String s = galleryInfo0.r();
            if(s != null) {
                this.k = uk.Qk(s, null).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
                    L.p(new com.dcinside.app.post.fragments.mini.t.s(this), "$tmp0");
                    new com.dcinside.app.post.fragments.mini.t.s(this).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this, "this$0");
                    timber.log.b.a.e(throwable0);
                    Dl.D(this.h, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
                });
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void w0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void x0(t t0, Throwable throwable0) [...]

    private final void y0(String s) {
        @s0({"SMAP\nGallHeadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GallHeadManager.kt\ncom/dcinside/app/post/fragments/mini/GallHeadManager$requestNotice$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,971:1\n774#2:972\n865#2,2:973\n*S KotlinDebug\n*F\n+ 1 GallHeadManager.kt\ncom/dcinside/app/post/fragments/mini/GallHeadManager$requestNotice$1\n*L\n495#1:972\n495#1:973,2\n*E\n"})
        static final class com.dcinside.app.post.fragments.mini.t.t extends N implements Function1 {
            public static final com.dcinside.app.post.fragments.mini.t.t e;

            static {
                com.dcinside.app.post.fragments.mini.t.t.e = new com.dcinside.app.post.fragments.mini.t.t();
            }

            com.dcinside.app.post.fragments.mini.t.t() {
                super(1);
            }

            public final rx.g a(com.dcinside.app.response.i i0) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: i0.f()) {
                    if(!((PostItem)object0).W()) {
                        arrayList0.add(object0);
                    }
                }
                i0.o(arrayList0);
                return rx.g.Q2(i0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.response.i)object0));
            }
        }


        @s0({"SMAP\nGallHeadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GallHeadManager.kt\ncom/dcinside/app/post/fragments/mini/GallHeadManager$requestNotice$2\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,971:1\n25#2:972\n*S KotlinDebug\n*F\n+ 1 GallHeadManager.kt\ncom/dcinside/app/post/fragments/mini/GallHeadManager$requestNotice$2\n*L\n501#1:972\n*E\n"})
        static final class com.dcinside.app.post.fragments.mini.t.u extends N implements Function1 {
            final t e;
            final long f;
            final String g;

            com.dcinside.app.post.fragments.mini.t.u(t t0, long v, String s) {
                this.e = t0;
                this.f = v;
                this.g = s;
                super(1);
            }

            public final void a(com.dcinside.app.response.i i0) {
                this.e.a.r.setVisibility((i0.f().isEmpty() ? 8 : 0));
                r2 r20 = this.e.a;
                L.o(r20.r, "listMiniNoticeList");
                Adapter recyclerView$Adapter0 = r20.r.getAdapter();
                if(!(recyclerView$Adapter0 instanceof u)) {
                    recyclerView$Adapter0 = null;
                }
                if(((u)recyclerView$Adapter0) != null) {
                    ((u)recyclerView$Adapter0).y(i0.f(), this.f, this.g);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.response.i)object0));
                return S0.a;
            }
        }

        long v = TimeUnit.DAYS.toMillis(3L);
        this.l = uk.jG(s, null, 0, null, com.dcinside.app.type.v.b, null).f2((Object object0) -> {
            L.p(com.dcinside.app.post.fragments.mini.t.t.e, "$tmp0");
            return (rx.g)com.dcinside.app.post.fragments.mini.t.t.e.invoke(object0);
        }).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.post.fragments.mini.t.u(this, System.currentTimeMillis() - v, s), "$tmp0");
            new com.dcinside.app.post.fragments.mini.t.u(this, System.currentTimeMillis() - v, s).invoke(object0);
        }, (Throwable throwable0) -> timber.log.b.a.e(throwable0));
    }

    // 检测为 Lambda 实现
    private static final rx.g z0(Function1 function10, Object object0) [...]
}

