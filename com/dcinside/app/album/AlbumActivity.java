package com.dcinside.app.album;

import A3.p;
import Y.S;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.album.picker.PickerActivity;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.dl;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/dcinside/app/album/AlbumActivity\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,241:1\n35#2:242\n25#3:243\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/dcinside/app/album/AlbumActivity\n*L\n47#1:242\n178#1:243\n*E\n"})
public final class AlbumActivity extends d {
    static final class a extends SpanSizeLookup {
        private int e;

        public a(int v) {
            this.e = v;
        }

        @Override  // androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup
        public int f(int v) {
            return v == 0 ? this.e : 1;
        }

        public final void m(int v) {
            this.e = v;
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    @m
    private ActivityResultLauncher A;
    private a B;
    @l
    public static final b C = null;
    @l
    public static final String D = "extra_enter_gif";
    @l
    public static final String E = "extra_upload_video";
    @l
    public static final String F = "extra_take_image_from_android";
    @l
    public static final String G = "extra_user_nickname";
    @l
    public static final String H = "AlbumActivity.extra_auto_image";
    private S u;
    @m
    private I0 v;
    @m
    private String w;
    private boolean x;
    private boolean y;
    @m
    private ActivityResultLauncher z;

    static {
        AlbumActivity.C = new b(null);
    }

    private final void K1() {
        S s0 = this.u;
        a albumActivity$a0 = null;
        if(s0 == null) {
            L.S("binding");
            s0 = null;
        }
        RecyclerView recyclerView0 = s0.h;
        L.o(recyclerView0, "photoAlbumRecycler");
        LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
        GridLayoutManager gridLayoutManager0 = recyclerView$LayoutManager0 instanceof GridLayoutManager ? ((GridLayoutManager)recyclerView$LayoutManager0) : null;
        if(gridLayoutManager0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(!(recyclerView$Adapter0 instanceof c)) {
            recyclerView$Adapter0 = null;
        }
        boolean z = true;
        if(((c)recyclerView$Adapter0) == null) {
            return;
        }
        if(gridLayoutManager0.b4() == 1) {
            gridLayoutManager0.l4(this.L1());
        }
        else {
            gridLayoutManager0.l4(1);
        }
        a albumActivity$a1 = this.B;
        if(albumActivity$a1 == null) {
            L.S("albumSpanSizeLookUp");
        }
        else {
            albumActivity$a0 = albumActivity$a1;
        }
        albumActivity$a0.m(gridLayoutManager0.b4());
        recyclerView0.setLayoutManager(gridLayoutManager0);
        ((c)recyclerView$Adapter0).A(gridLayoutManager0.b4());
        dl dl0 = dl.a;
        if(gridLayoutManager0.b4() == 1) {
            z = false;
        }
        dl0.l3(z);
    }

    private final int L1() {
        Configuration configuration0 = this.getResources().getConfiguration();
        L.o(configuration0, "getConfiguration(...)");
        return Math.max(((int)Math.ceil(((double)configuration0.screenWidthDp) / 150.0)), 3);
    }

    public final void M1() {
        Intent intent0 = new Intent();
        intent0.setType("image/*");
        intent0.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent0.setAction("android.intent.action.GET_CONTENT");
        L.o("사진을 가져올 때 사용할 앱을 선택해주세요.", "getString(...)");
        Intent intent1 = Intent.createChooser(intent0, "사진을 가져올 때 사용할 앱을 선택해주세요.");
        L.o(intent1, "createChooser(...)");
        ActivityResultLauncher activityResultLauncher0 = this.A;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.b(intent1);
        }
    }

    public final void N1(@l Album album0) {
        L.p(album0, "item");
        boolean z = this.getIntent().getBooleanExtra("AlbumActivity.extra_auto_image", false);
        Intent intent0 = new Intent(this, PickerActivity.class);
        intent0.putExtra("album", album0);
        intent0.putExtra("gif", this.x);
        intent0.putExtra("extra_upload_image", this.y);
        intent0.putExtra("extra_user_nickname", this.w);
        intent0.putExtra("PickerActivity.extra_auto_image", z);
        intent0.setAction(this.getIntent().getAction());
        ActivityResultLauncher activityResultLauncher0 = this.z;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.b(intent0);
        }
    }

    // 检测为 Lambda 实现
    private static final void O1(AlbumActivity albumActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void P1(AlbumActivity albumActivity0, ActivityResult activityResult0) [...]

    public final void Q1() {
        @f(c = "com.dcinside.app.album.AlbumActivity$showListAsync$1", f = "AlbumActivity.kt", i = {}, l = {0x93, 0xA2}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/dcinside/app/album/AlbumActivity$showListAsync$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n774#2:242\n865#2,2:243\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/dcinside/app/album/AlbumActivity$showListAsync$1\n*L\n153#1:242\n153#1:243,2\n*E\n"})
        static final class e extends o implements A3.o {
            int k;
            final AlbumActivity l;

            e(AlbumActivity albumActivity0, kotlin.coroutines.d d0) {
                this.l = albumActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new e(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.album.AlbumActivity$showListAsync$1$1", f = "AlbumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.album.AlbumActivity.e.a extends o implements A3.o {
                    int k;
                    final AlbumActivity l;

                    com.dcinside.app.album.AlbumActivity.e.a(AlbumActivity albumActivity0, kotlin.coroutines.d d0) {
                        this.l = albumActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.album.AlbumActivity.e.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.album.AlbumActivity.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        S s0 = this.l.u;
                        S s1 = null;
                        if(s0 == null) {
                            L.S("binding");
                            s0 = null;
                        }
                        s0.g.setVisibility(0);
                        S s2 = this.l.u;
                        if(s2 == null) {
                            L.S("binding");
                        }
                        else {
                            s1 = s2;
                        }
                        s1.b.setVisibility(8);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.album.AlbumActivity$showListAsync$1$2", f = "AlbumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/dcinside/app/album/AlbumActivity$showListAsync$1$2\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,241:1\n25#2:242\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/dcinside/app/album/AlbumActivity$showListAsync$1$2\n*L\n163#1:242\n*E\n"})
                static final class com.dcinside.app.album.AlbumActivity.e.b extends o implements A3.o {
                    int k;
                    final AlbumActivity l;
                    final List m;

                    com.dcinside.app.album.AlbumActivity.e.b(AlbumActivity albumActivity0, List list0, kotlin.coroutines.d d0) {
                        this.l = albumActivity0;
                        this.m = list0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.album.AlbumActivity.e.b(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.album.AlbumActivity.e.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        S s0 = this.l.u;
                        S s1 = null;
                        if(s0 == null) {
                            L.S("binding");
                            s0 = null;
                        }
                        L.o(s0.h, "photoAlbumRecycler");
                        Adapter recyclerView$Adapter0 = s0.h.getAdapter();
                        if(!(recyclerView$Adapter0 instanceof c)) {
                            recyclerView$Adapter0 = null;
                        }
                        if(((c)recyclerView$Adapter0) != null) {
                            ((c)recyclerView$Adapter0).y(this.m);
                        }
                        S s2 = this.l.u;
                        if(s2 == null) {
                            L.S("binding");
                            s2 = null;
                        }
                        int v = 8;
                        s2.g.setVisibility(8);
                        S s3 = this.l.u;
                        if(s3 == null) {
                            L.S("binding");
                        }
                        else {
                            s1 = s3;
                        }
                        LinearLayout linearLayout0 = s1.b;
                        if(this.m.isEmpty()) {
                            v = 0;
                        }
                        linearLayout0.setVisibility(v);
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        com.dcinside.app.album.AlbumActivity.e.a albumActivity$e$a0 = new com.dcinside.app.album.AlbumActivity.e.a(this.l, null);
                        this.k = 1;
                        if(i.h(h0.e(), albumActivity$e$a0, this) == object1) {
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
                Iterable iterable0 = com.dcinside.app.album.l.a.i();
                AlbumActivity albumActivity0 = this.l;
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: iterable0) {
                    Album album0 = (Album)object2;
                    if(!albumActivity0.y) {
                        if(albumActivity0.x || album0.g() > 0) {
                            goto label_22;
                        }
                        continue;
                    }
                    else if(album0.i() <= 0) {
                        continue;
                    }
                label_22:
                    arrayList0.add(object2);
                }
                com.dcinside.app.album.AlbumActivity.e.b albumActivity$e$b0 = new com.dcinside.app.album.AlbumActivity.e.b(this.l, arrayList0, null);
                this.k = 2;
                return i.h(h0.e(), albumActivity$e$b0, this) == object1 ? object1 : S0.a;
            }
        }

        this.v = k.f(LifecycleOwnerKt.a(this), h0.c(), null, new e(this, null), 2, null);
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void onConfigurationChanged(@l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        S s0 = this.u;
        a albumActivity$a0 = null;
        if(s0 == null) {
            L.S("binding");
            s0 = null;
        }
        LayoutManager recyclerView$LayoutManager0 = s0.h.getLayoutManager();
        GridLayoutManager gridLayoutManager0 = recyclerView$LayoutManager0 instanceof GridLayoutManager ? ((GridLayoutManager)recyclerView$LayoutManager0) : null;
        if(gridLayoutManager0 == null) {
            return;
        }
        if(gridLayoutManager0.b4() == 1) {
            return;
        }
        gridLayoutManager0.l4(this.L1());
        a albumActivity$a1 = this.B;
        if(albumActivity$a1 == null) {
            L.S("albumSpanSizeLookUp");
        }
        else {
            albumActivity$a0 = albumActivity$a1;
        }
        albumActivity$a0.m(this.L1());
    }

    @Override  // com.dcinside.app.base.d
    public void onCreate(@m Bundle bundle0) {
        static final class com.dcinside.app.album.AlbumActivity.c extends N implements A3.a {
            final AlbumActivity e;

            com.dcinside.app.album.AlbumActivity.c(AlbumActivity albumActivity0) {
                this.e = albumActivity0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.K1();
            }
        }


        @f(c = "com.dcinside.app.album.AlbumActivity$onCreate$2", f = "AlbumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.album.AlbumActivity.d extends o implements p {
            int k;
            final AlbumActivity l;

            com.dcinside.app.album.AlbumActivity.d(AlbumActivity albumActivity0, kotlin.coroutines.d d0) {
                this.l = albumActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.album.AlbumActivity.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.M1();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        S s0 = S.c(this.getLayoutInflater());
        L.o(s0, "inflate(...)");
        this.u = s0;
        if(s0 == null) {
            L.S("binding");
            s0 = null;
        }
        this.setContentView(s0.b());
        S s1 = this.u;
        if(s1 == null) {
            L.S("binding");
            s1 = null;
        }
        this.S0(s1.i);
        kr.bhbfhfb.designcompat.a.d(this);
        this.w = this.getIntent().getStringExtra("extra_user_nickname");
        this.x = this.getIntent().getBooleanExtra("extra_enter_gif", false);
        this.y = this.getIntent().getBooleanExtra("extra_upload_video", false);
        dl dl0 = dl.a;
        int v = dl0.G2() ? this.L1() : 1;
        GridLayoutManager gridLayoutManager0 = new GridLayoutManager(this, v, 1, false);
        a albumActivity$a0 = new a(v);
        this.B = albumActivity$a0;
        gridLayoutManager0.m4(albumActivity$a0);
        S s2 = this.u;
        if(s2 == null) {
            L.S("binding");
            s2 = null;
        }
        s2.h.setLayoutManager(gridLayoutManager0);
        S s3 = this.u;
        if(s3 == null) {
            L.S("binding");
            s3 = null;
        }
        s3.h.setItemAnimator(null);
        c c0 = new c(this, this.x, this.y);
        c0.A(v);
        c0.z(new com.dcinside.app.album.AlbumActivity.c(this));
        S s4 = this.u;
        if(s4 == null) {
            L.S("binding");
            s4 = null;
        }
        s4.h.setAdapter(c0);
        S s5 = this.u;
        if(s5 == null) {
            L.S("binding");
            s5 = null;
        }
        com.dcinside.app.view.f f0 = new com.dcinside.app.view.f();
        s5.c.setViewProvider(f0);
        S s6 = this.u;
        if(s6 == null) {
            L.S("binding");
            s6 = null;
        }
        FastScroller fastScroller0 = s6.c;
        S s7 = this.u;
        if(s7 == null) {
            L.S("binding");
            s7 = null;
        }
        fastScroller0.setRecyclerView(s7.h);
        S s8 = this.u;
        if(s8 == null) {
            L.S("binding");
            s8 = null;
        }
        L.o(s8.e, "photoAlbumPictureImport");
        com.dcinside.app.album.AlbumActivity.d albumActivity$d0 = new com.dcinside.app.album.AlbumActivity.d(this, null);
        r.M(s8.e, null, albumActivity$d0, 1, null);
        this.Q1();
        dl0.n6(false);
        this.z = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                this.setResult(-1, activityResult0.a());
                this.finish();
                return;
            }
            if(this.v != null && this.v.k()) {
                this.Q1();
            }
        });
        this.A = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() != -1) {
                return;
            }
            Intent intent0 = activityResult0.a();
            if(intent0 != null) {
                intent0.putExtra("extra_take_image_from_android", true);
            }
            if(intent0 != null) {
                intent0.setAction(this.getIntent().getAction());
            }
            this.setResult(-1, intent0);
            this.finish();
        });
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@m Menu menu0) {
        S s0 = null;
        if(this.x) {
            S s1 = this.u;
            if(s1 == null) {
                L.S("binding");
                s1 = null;
            }
            s1.e.setVisibility(8);
            S s2 = this.u;
            if(s2 == null) {
                L.S("binding");
            }
            else {
                s0 = s2;
            }
            s0.d.setVisibility(0);
            this.setTitle("");
            return super.onCreateOptionsMenu(menu0);
        }
        if(this.y) {
            S s3 = this.u;
            if(s3 == null) {
                L.S("binding");
                s3 = null;
            }
            s3.e.setVisibility(8);
            S s4 = this.u;
            if(s4 == null) {
                L.S("binding");
            }
            else {
                s0 = s4;
            }
            s0.d.setVisibility(8);
            this.setTitle(0x7F150091);  // string:album "앨범"
            return super.onCreateOptionsMenu(menu0);
        }
        S s5 = this.u;
        if(s5 == null) {
            L.S("binding");
        }
        else {
            s0 = s5;
        }
        s0.e.setVisibility(0);
        this.setTitle(0x7F150091);  // string:album "앨범"
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        I0 i00 = this.v;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.v = null;
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
}

