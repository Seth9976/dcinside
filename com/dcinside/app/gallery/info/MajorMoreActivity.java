package com.dcinside.app.gallery.info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.ActivityKt;
import androidx.navigation.ui.AppBarConfiguration.Builder;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavControllerKt;
import com.dcinside.app.base.g;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.rx.d;
import com.dcinside.app.util.uk;
import io.realm.F0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;
import y4.m;

@s0({"SMAP\nMajorMoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MajorMoreActivity.kt\ncom/dcinside/app/gallery/info/MajorMoreActivity\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,91:1\n221#2,8:92\n*S KotlinDebug\n*F\n+ 1 MajorMoreActivity.kt\ncom/dcinside/app/gallery/info/MajorMoreActivity\n*L\n46#1:92,8\n*E\n"})
public final class MajorMoreActivity extends g implements a, com.dcinside.app.gallery.info.MajorInfoFragment.a {
    public static final class com.dcinside.app.gallery.info.MajorMoreActivity.a {
        private com.dcinside.app.gallery.info.MajorMoreActivity.a() {
        }

        public com.dcinside.app.gallery.info.MajorMoreActivity.a(w w0) {
        }

        public final void a(@l Context context0, @l GalleryInfo galleryInfo0) {
            L.p(context0, "context");
            L.p(galleryInfo0, "galleryInfo");
            Intent intent0 = new Intent(context0, MajorMoreActivity.class);
            intent0.putExtra("gallery_info", galleryInfo0);
            context0.startActivity(intent0);
        }
    }

    @l
    public static final com.dcinside.app.gallery.info.MajorMoreActivity.a A = null;
    @l
    public static final String B = "gallery_info";
    private AppBarConfiguration w;
    private NavController x;
    @m
    private GalleryInfo y;
    @l
    private com.dcinside.app.rx.g z;

    static {
        MajorMoreActivity.A = new com.dcinside.app.gallery.info.MajorMoreActivity.a(null);
    }

    public MajorMoreActivity() {
        this.z = this.L1();
    }

    private final com.dcinside.app.rx.g L1() {
        static final class b extends N implements A3.a {
            final MajorMoreActivity e;

            b(MajorMoreActivity majorMoreActivity0) {
                this.e = majorMoreActivity0;
                super(0);
            }

            @l
            public final rx.g b() {
                @s0({"SMAP\nMajorMoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MajorMoreActivity.kt\ncom/dcinside/app/gallery/info/MajorMoreActivity$createInfoCache$1$1\n+ 2 Optional.kt\ncom/dcinside/app/rx/OptionalKt\n*L\n1#1,91:1\n7#2:92\n*S KotlinDebug\n*F\n+ 1 MajorMoreActivity.kt\ncom/dcinside/app/gallery/info/MajorMoreActivity$createInfoCache$1$1\n*L\n75#1:92\n*E\n"})
                static final class com.dcinside.app.gallery.info.MajorMoreActivity.b.a extends N implements Function1 {
                    final MajorMoreActivity e;

                    com.dcinside.app.gallery.info.MajorMoreActivity.b.a(MajorMoreActivity majorMoreActivity0) {
                        this.e = majorMoreActivity0;
                        super(1);
                    }

                    public final d a(com.dcinside.app.response.g g0) {
                        GalleryInfo galleryInfo0 = this.e.y;
                        L.m(galleryInfo0);
                        return new d(r0.a(galleryInfo0, g0), null, 2, null);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((com.dcinside.app.response.g)object0));
                    }
                }

                GalleryInfo galleryInfo0 = this.e.y;
                L.m(galleryInfo0);
                String s = galleryInfo0.r();
                L.m(s);
                rx.g g0 = uk.QF(s).g3((Object object0) -> {
                    L.p(new com.dcinside.app.gallery.info.MajorMoreActivity.b.a(this.e), "$tmp0");
                    return (d)new com.dcinside.app.gallery.info.MajorMoreActivity.b.a(this.e).invoke(object0);
                });
                L.o(g0, "map(...)");
                return g0;
            }

            // 检测为 Lambda 实现
            private static final d c(Function1 function10, Object object0) [...]

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        @s0({"SMAP\nMajorMoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MajorMoreActivity.kt\ncom/dcinside/app/gallery/info/MajorMoreActivity$createInfoCache$2\n+ 2 Optional.kt\ncom/dcinside/app/rx/OptionalKt\n*L\n1#1,91:1\n8#2:92\n*S KotlinDebug\n*F\n+ 1 MajorMoreActivity.kt\ncom/dcinside/app/gallery/info/MajorMoreActivity$createInfoCache$2\n*L\n76#1:92\n*E\n"})
        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            public final d a(@l Throwable throwable0) {
                L.p(throwable0, "it");
                return new d(null, throwable0, 1, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        return new com.dcinside.app.rx.g(TimeUnit.DAYS.toMillis(1L), new b(this), c.e);
    }

    @Override  // com.dcinside.app.gallery.info.MajorInfoFragment$a
    @m
    public F0 Q() {
        return this.F1();
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public boolean Q0() {
        NavController navController0 = this.x;
        if(navController0 == null) {
            L.S("navController");
            navController0 = null;
        }
        AppBarConfiguration appBarConfiguration0 = this.w;
        if(appBarConfiguration0 == null) {
            L.S("appBarConfiguration");
            return NavControllerKt.b(navController0, null) || super.Q0();
        }
        return NavControllerKt.b(navController0, appBarConfiguration0) || super.Q0();
    }

    @Override  // com.dcinside.app.gallery.info.MajorEntrustFragment$a
    public void c0() {
        this.z.release();
        this.z = this.L1();
        this.Q0();
    }

    @Override  // com.dcinside.app.gallery.info.MajorInfoFragment$a
    @l
    public rx.g d0() {
        return this.z.d();
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        @s0({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt$AppBarConfiguration$1\n*L\n1#1,279:1\n*E\n"})
        public static final class com.dcinside.app.gallery.info.MajorMoreActivity.d extends N implements A3.a {
            public static final com.dcinside.app.gallery.info.MajorMoreActivity.d e;

            static {
                com.dcinside.app.gallery.info.MajorMoreActivity.d.e = new com.dcinside.app.gallery.info.MajorMoreActivity.d();
            }

            public com.dcinside.app.gallery.info.MajorMoreActivity.d() {
                super(0);
            }

            @l
            public final Boolean b() {
                return false;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        super.onCreate(bundle0);
        this.setContentView(0x7F0E0030);  // layout:activity_gallery_major_more
        this.S0(((Toolbar)this.findViewById(0x7F0B07A0)));  // id:major_more_toolbar
        GalleryInfo galleryInfo0 = (GalleryInfo)this.getIntent().getParcelableExtra("gallery_info");
        if(this.F1() != null && galleryInfo0 != null) {
            this.y = galleryInfo0;
            NavController navController0 = Navigation.j(this, 0x7F0B079F);  // id:major_more_host
            this.x = navController0;
            AppBarConfiguration appBarConfiguration0 = null;
            if(navController0 == null) {
                L.S("navController");
                navController0 = null;
            }
            this.w = new Builder(navController0.K()).d(null).c(new androidx.navigation.ui.AppBarConfigurationKt.a(com.dcinside.app.gallery.info.MajorMoreActivity.d.e)).a();
            NavController navController1 = this.x;
            if(navController1 == null) {
                L.S("navController");
                navController1 = null;
            }
            AppBarConfiguration appBarConfiguration1 = this.w;
            if(appBarConfiguration1 == null) {
                L.S("appBarConfiguration");
            }
            else {
                appBarConfiguration0 = appBarConfiguration1;
            }
            ActivityKt.b(this, navController1, appBarConfiguration0);
            return;
        }
        this.finish();
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        this.z.release();
        super.onDestroy();
    }
}

