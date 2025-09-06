package com.dcinside.app.gallery.info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentTransaction;
import com.dcinside.app.base.g;
import com.dcinside.app.model.MinorInfo;
import com.dcinside.app.type.m;
import com.dcinside.app.util.uk;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;

public final class MinorMoreActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @l String s, @l m m0, boolean z, boolean z1) {
            L.p(appCompatActivity0, "activity");
            L.p(s, "galleryId");
            L.p(m0, "grade");
            Intent intent0 = new Intent(appCompatActivity0, MinorMoreActivity.class);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", s);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_GRADE", m0.c());
            intent0.putExtra("isMember", z);
            intent0.putExtra("canAccessList", z1);
            appCompatActivity0.startActivityForResult(intent0, 1045);
        }

        public final void b(@l Context context0, @l m m0) {
            L.p(context0, "context");
            L.p(m0, "grade");
            Intent intent0 = new Intent(context0, MinorMoreActivity.class);
            intent0.setAction("actionSkipGalleryInfo");
            intent0.putExtra("com.dcinside.app.extra.GALLERY_GRADE", m0.c());
            context0.startActivity(intent0);
        }
    }

    @l
    public static final a A = null;
    @l
    public static final String B = "actionSkipGalleryInfo";
    @l
    public static final String C = "isMember";
    @l
    public static final String D = "canAccessList";
    @y4.m
    private String w;
    @l
    private com.dcinside.app.rx.g x;
    @l
    private com.dcinside.app.rx.g y;
    private boolean z;

    static {
        MinorMoreActivity.A = new a(null);
    }

    public MinorMoreActivity() {
        static final class b extends N implements A3.a {
            final MinorMoreActivity e;

            b(MinorMoreActivity minorMoreActivity0) {
                this.e = minorMoreActivity0;
                super(0);
            }

            @l
            public final rx.g b() {
                rx.g g0 = uk.Ok(this.e.O1());
                L.o(g0, "hotGallery(...)");
                return g0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            @l
            public final List a(@l Throwable throwable0) {
                L.p(throwable0, "it");
                return u.H();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }


        static final class d extends N implements A3.a {
            final MinorMoreActivity e;

            d(MinorMoreActivity minorMoreActivity0) {
                this.e = minorMoreActivity0;
                super(0);
            }

            @l
            public final rx.g b() {
                rx.g g0 = uk.tk(this.e.U1(), this.e.P1());
                L.o(g0, "galleryInfo(...)");
                return g0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(1);
            }

            @l
            public final MinorInfo a(@l Throwable throwable0) {
                L.p(throwable0, "it");
                return new MinorInfo(null, null, null, null, null, null, null, null, false, null, null, null, null, null, 0x3FFF, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        TimeUnit timeUnit0 = TimeUnit.DAYS;
        this.x = new com.dcinside.app.rx.g(timeUnit0.toMillis(1L), new d(this), e.e);
        this.y = new com.dcinside.app.rx.g(timeUnit0.toMillis(1L), new b(this), c.e);
    }

    public final void N1() {
        this.x.c();
    }

    @l
    public final m O1() {
        int v = this.getIntent().getIntExtra("com.dcinside.app.extra.GALLERY_GRADE", -1);
        return m.d.a(v);
    }

    @y4.m
    public final String P1() {
        return this.w;
    }

    @l
    public final rx.g Q1() {
        static final class f extends N implements Function1 {
            public static final f e;

            static {
                f.e = new f();
            }

            f() {
                super(1);
            }

            // 去混淆评级： 低(20)
            public final rx.g a(List list0) {
                return list0.isEmpty() ? rx.g.X1(new com.dcinside.app.http.f(0x7F1502FD)) : rx.g.Q2(list0);  // string:failed_access_server2 "서버에 연결할 수 없습니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }

        rx.g g0 = this.y.d().f2((Object object0) -> {
            L.p(f.e, "$tmp0");
            return (rx.g)f.e.invoke(object0);
        });
        L.o(g0, "flatMap(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final rx.g R1(Function1 function10, Object object0) [...]

    @l
    public final rx.g S1() {
        static final class com.dcinside.app.gallery.info.MinorMoreActivity.g extends N implements Function1 {
            public static final com.dcinside.app.gallery.info.MinorMoreActivity.g e;

            static {
                com.dcinside.app.gallery.info.MinorMoreActivity.g.e = new com.dcinside.app.gallery.info.MinorMoreActivity.g();
            }

            com.dcinside.app.gallery.info.MinorMoreActivity.g() {
                super(1);
            }

            public final rx.g a(MinorInfo minorInfo0) {
                return minorInfo0.F() == null ? rx.g.X1(new com.dcinside.app.http.f(0x7F1502FD)) : rx.g.Q2(minorInfo0);  // string:failed_access_server2 "서버에 연결할 수 없습니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((MinorInfo)object0));
            }
        }

        rx.g g0 = this.x.d().f2((Object object0) -> {
            L.p(com.dcinside.app.gallery.info.MinorMoreActivity.g.e, "$tmp0");
            return (rx.g)com.dcinside.app.gallery.info.MinorMoreActivity.g.e.invoke(object0);
        });
        L.o(g0, "flatMap(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final rx.g T1(Function1 function10, Object object0) [...]

    private final boolean U1() {
        int v = this.getIntent().getIntExtra("com.dcinside.app.extra.GALLERY_GRADE", -1);
        return m.d.a(v) == m.g;
    }

    public final void V1(@l m m0) {
        L.p(m0, "galleryGrade");
        FragmentTransaction fragmentTransaction0 = this.getSupportFragmentManager().u();
        com.dcinside.app.gallery.info.u u0 = new com.dcinside.app.gallery.info.u();
        u0.setArguments(BundleKt.b(new V[]{r0.a("KEY_GALLERY_GRADE_TYPE", m0.c())}));
        fragmentTransaction0.C(0x7F0B086E, u0).o(null).q();  // id:minor_more_container
    }

    public final void W1(@y4.m String s) {
        this.w = s;
    }

    public final void X1() {
        this.setResult(-1);
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        if(this.z) {
            this.finish();
            return;
        }
        super.onBackPressed();
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@y4.m Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0E0043);  // layout:activity_minor_more
        this.S0(((Toolbar)this.findViewById(0x7F0B086F)));  // id:minor_more_toolbar
        kr.bhbfhfb.designcompat.a.d(this);
        if(this.F1() == null) {
            this.finish();
            return;
        }
        if(L.g("actionSkipGalleryInfo", this.getIntent().getAction())) {
            this.V1(this.O1());
            this.z = true;
            return;
        }
        this.w = this.getIntent().getStringExtra("com.dcinside.app.extra.GALLERY_ID");
        if(bundle0 == null) {
            H h0 = new H();
            boolean z = this.getIntent().getBooleanExtra("isMember", false);
            boolean z1 = this.getIntent().getBooleanExtra("canAccessList", false);
            h0.setArguments(BundleKt.b(new V[]{r0.a("isMember", Boolean.valueOf(z)), r0.a("canAccessList", Boolean.valueOf(z1))}));
            this.getSupportFragmentManager().u().C(0x7F0B086E, h0).q();  // id:minor_more_container
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        this.x.release();
        this.y.release();
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
}

