package com.dcinside.app.push;

import A3.p;
import Y.q0;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.f0;
import com.dcinside.app.perform.e;
import com.dcinside.app.settings.NotificationSettingActivity;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.hjq.toast.s;
import g0.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nGalleryPushSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryPushSettingActivity.kt\ncom/dcinside/app/push/GalleryPushSettingActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,394:1\n774#2:395\n865#2,2:396\n25#3:398\n25#3:399\n*S KotlinDebug\n*F\n+ 1 GalleryPushSettingActivity.kt\ncom/dcinside/app/push/GalleryPushSettingActivity\n*L\n177#1:395\n177#1:396,2\n189#1:398\n264#1:399\n*E\n"})
public final class GalleryPushSettingActivity extends d implements i {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @l String s, @l String s1, @l String s2) {
            L.p(appCompatActivity0, "activity");
            L.p(s, "galleryId");
            L.p(s1, "galleryName");
            L.p(s2, "action");
            Intent intent0 = new Intent(appCompatActivity0, GalleryPushSettingActivity.class);
            intent0.putExtra("galleryId", s);
            intent0.putExtra("galleryName", s1);
            intent0.setAction(s2);
            appCompatActivity0.startActivityForResult(intent0, 1047);
        }
    }

    static final class b {
        private final boolean a;
        private final boolean b;
        @l
        private final List c;
        private final int d;
        private final int e;

        public b(boolean z, boolean z1, @l List list0, int v, int v1) {
            L.p(list0, "keywordList");
            super();
            this.a = z;
            this.b = z1;
            this.c = list0;
            this.d = v;
            this.e = v1;
        }

        public final boolean a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        @l
        public final List c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        public final int e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            if(this.a != ((b)object0).a) {
                return false;
            }
            if(this.b != ((b)object0).b) {
                return false;
            }
            if(!L.g(this.c, ((b)object0).c)) {
                return false;
            }
            return this.d == ((b)object0).d ? this.e == ((b)object0).e : false;
        }

        @l
        public final b f(boolean z, boolean z1, @l List list0, int v, int v1) {
            L.p(list0, "keywordList");
            return new b(z, z1, list0, v, v1);
        }

        public static b g(b galleryPushSettingActivity$b0, boolean z, boolean z1, List list0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                z = galleryPushSettingActivity$b0.a;
            }
            if((v2 & 2) != 0) {
                z1 = galleryPushSettingActivity$b0.b;
            }
            if((v2 & 4) != 0) {
                list0 = galleryPushSettingActivity$b0.c;
            }
            if((v2 & 8) != 0) {
                v = galleryPushSettingActivity$b0.d;
            }
            if((v2 & 16) != 0) {
                v1 = galleryPushSettingActivity$b0.e;
            }
            return galleryPushSettingActivity$b0.f(z, z1, list0, v, v1);
        }

        public final int h() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return (((c.a(this.a) * 0x1F + c.a(this.b)) * 0x1F + this.c.hashCode()) * 0x1F + this.d) * 0x1F + this.e;
        }

        public final boolean i() {
            return this.b;
        }

        public final boolean j() {
            return this.a;
        }

        @l
        public final List k() {
            return this.c;
        }

        public final int l() {
            return this.e;
        }

        @Override
        @l
        public String toString() {
            return "GalleryPushSettingData(enableRecommend=" + this.a + ", enableNotice=" + this.b + ", keywordList=" + this.c + ", articleCount=" + this.d + ", userCount=" + this.e + ")";
        }
    }

    @m
    private o A;
    @l
    public static final a B = null;
    @l
    public static final String C = "gallerySettingAction";
    @l
    public static final String D = "galleryKeywordAction";
    @l
    public static final String E = "galleryId";
    @l
    public static final String F = "galleryName";
    private q0 u;
    @l
    private String v;
    @l
    private String w;
    @m
    private o x;
    @m
    private o y;
    @m
    private o z;

    static {
        GalleryPushSettingActivity.B = new a(null);
    }

    public GalleryPushSettingActivity() {
        this.v = "";
        this.w = "";
    }

    // 检测为 Lambda 实现
    private static final void A2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void B2(GalleryPushSettingActivity galleryPushSettingActivity0, Throwable throwable0) [...]

    private final void C2(String s) {
        static final class t extends N implements Function1 {
            final String e;
            final GalleryPushSettingActivity f;

            t(String s, GalleryPushSettingActivity galleryPushSettingActivity0) {
                this.e = s;
                this.f = galleryPushSettingActivity0;
                super(1);
            }

            public final void a(f f0) {
                List list0;
                Map map0 = f0.a();
                if(map0 == null) {
                    list0 = u.H();
                }
                else {
                    g0.f.b f$b0 = (g0.f.b)map0.get(this.e);
                    if(f$b0 == null) {
                        list0 = u.H();
                    }
                    else {
                        list0 = f$b0.f();
                        if(list0 == null) {
                            list0 = u.H();
                        }
                    }
                }
                this.f.t2(true, true, list0, 0, 0);
                q0 q00 = this.f.u;
                if(q00 == null) {
                    L.S("binding");
                    q00 = null;
                }
                q00.y.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f)object0));
                return S0.a;
            }
        }

        q0 q00 = this.u;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        q00.y.setVisibility(0);
        this.x = uk.Ik(s).y5((Object object0) -> {
            L.p(new t(s, this), "$tmp0");
            new t(s, this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F150326);  // string:failed_notice_data "정보를 가져올 수 없습니다. 잠시 후 다시 시도해주세요."
            this.finish();
        });
    }

    // 检测为 Lambda 实现
    private static final void D2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void E2(GalleryPushSettingActivity galleryPushSettingActivity0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.push.i
    public void F(@l String s, @m String s1) {
        com.dcinside.app.push.i.a.a(this, s, s1);
    }

    private final void F2(boolean z, String s, String s1, A3.a a0) {
        @s0({"SMAP\nGalleryPushSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryPushSettingActivity.kt\ncom/dcinside/app/push/GalleryPushSettingActivity$updateKeyword$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,394:1\n25#2:395\n*S KotlinDebug\n*F\n+ 1 GalleryPushSettingActivity.kt\ncom/dcinside/app/push/GalleryPushSettingActivity$updateKeyword$1\n*L\n292#1:395\n*E\n"})
        static final class com.dcinside.app.push.GalleryPushSettingActivity.u extends N implements Function1 {
            final GalleryPushSettingActivity e;
            final boolean f;
            final String g;
            final A3.a h;

            com.dcinside.app.push.GalleryPushSettingActivity.u(GalleryPushSettingActivity galleryPushSettingActivity0, boolean z, String s, A3.a a0) {
                this.e = galleryPushSettingActivity0;
                this.f = z;
                this.g = s;
                this.h = a0;
                super(1);
            }

            public final void a(f0 f00) {
                q0 q00 = null;
                if(f00.f()) {
                    q0 q01 = this.e.u;
                    if(q01 == null) {
                        L.S("binding");
                        q01 = null;
                    }
                    L.o(q01.q, "galleryPushKeywordList");
                    Adapter recyclerView$Adapter0 = q01.q.getAdapter();
                    if(!(recyclerView$Adapter0 instanceof com.dcinside.app.push.adapter.b)) {
                        recyclerView$Adapter0 = null;
                    }
                    String s = "";
                    if(this.f) {
                        if(((com.dcinside.app.push.adapter.b)recyclerView$Adapter0) != null) {
                            String s1 = this.g;
                            if(s1 != null) {
                                s = s1;
                            }
                            ((com.dcinside.app.push.adapter.b)recyclerView$Adapter0).C(s);
                        }
                        q0 q02 = this.e.u;
                        if(q02 == null) {
                            L.S("binding");
                            q02 = null;
                        }
                        q02.e.setText(null);
                        A3.a a0 = this.h;
                        if(a0 != null) {
                            a0.invoke();
                        }
                    }
                    else {
                        if(((com.dcinside.app.push.adapter.b)recyclerView$Adapter0) != null) {
                            String s2 = this.g;
                            if(s2 != null) {
                                s = s2;
                            }
                            ((com.dcinside.app.push.adapter.b)recyclerView$Adapter0).A(s, true);
                        }
                        q0 q03 = this.e.u;
                        if(q03 == null) {
                            L.S("binding");
                        }
                        else {
                            q00 = q03;
                        }
                        q00.y.setVisibility(8);
                    }
                    this.e.l2();
                    this.e.setResult(-1);
                    return;
                }
                String s3 = f00.a();
                if(s3 != null && s3.length() > 0) {
                    s.F(f00.a());
                    q0 q04 = this.e.u;
                    if(q04 == null) {
                        L.S("binding");
                    }
                    else {
                        q00 = q04;
                    }
                    q00.y.setVisibility(8);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        if(s1 == null || s1.length() == 0) {
            s1 = this.v;
        }
        q0 q00 = this.u;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        q00.y.setVisibility(0);
        this.y = uk.JG(z, s1, this.w, s).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.GalleryPushSettingActivity.u(this, z, s, a0), "$tmp0");
            new com.dcinside.app.push.GalleryPushSettingActivity.u(this, z, s, a0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F15030E);  // string:failed_apply_notice "저장에 실패했습니다. 잠시 후 다시 시도해주세요."
            q0 q00 = this.u;
            if(q00 == null) {
                L.S("binding");
                q00 = null;
            }
            q00.y.setVisibility(8);
        });
    }

    static void G2(GalleryPushSettingActivity galleryPushSettingActivity0, boolean z, String s, String s1, A3.a a0, int v, Object object0) {
        if((v & 8) != 0) {
            a0 = null;
        }
        galleryPushSettingActivity0.F2(z, s, s1, a0);
    }

    // 检测为 Lambda 实现
    private static final void H2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void I2(GalleryPushSettingActivity galleryPushSettingActivity0, Throwable throwable0) [...]

    private final void J2(boolean z) {
        static final class v extends N implements Function1 {
            final GalleryPushSettingActivity e;
            final boolean f;

            v(GalleryPushSettingActivity galleryPushSettingActivity0, boolean z) {
                this.e = galleryPushSettingActivity0;
                this.f = z;
                super(1);
            }

            public final void a(f0 f00) {
                q0 q00 = null;
                if(f00.f()) {
                    q0 q01 = this.e.u;
                    if(q01 == null) {
                        L.S("binding");
                        q01 = null;
                    }
                    q01.n.setChecked(this.f);
                }
                else {
                    String s = f00.a();
                    if(s != null && s.length() > 0) {
                        Dl.G(this.e, f00.a());
                    }
                }
                q0 q02 = this.e.u;
                if(q02 == null) {
                    L.S("binding");
                }
                else {
                    q00 = q02;
                }
                q00.y.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        q0 q00 = this.u;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        q00.y.setVisibility(0);
        this.z = uk.LG(z, this.v, this.w).y5((Object object0) -> {
            L.p(new v(this, z), "$tmp0");
            new v(this, z).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F15030E);  // string:failed_apply_notice "저장에 실패했습니다. 잠시 후 다시 시도해주세요."
            q0 q00 = this.u;
            if(q00 == null) {
                L.S("binding");
                q00 = null;
            }
            q00.y.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void K2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void L2(GalleryPushSettingActivity galleryPushSettingActivity0, Throwable throwable0) [...]

    private final void M2(boolean z) {
        static final class com.dcinside.app.push.GalleryPushSettingActivity.w extends N implements Function1 {
            final GalleryPushSettingActivity e;
            final boolean f;

            com.dcinside.app.push.GalleryPushSettingActivity.w(GalleryPushSettingActivity galleryPushSettingActivity0, boolean z) {
                this.e = galleryPushSettingActivity0;
                this.f = z;
                super(1);
            }

            public final void a(f0 f00) {
                q0 q00 = null;
                if(f00.f()) {
                    q0 q01 = this.e.u;
                    if(q01 == null) {
                        L.S("binding");
                        q01 = null;
                    }
                    q01.u.setChecked(this.f);
                }
                else {
                    String s = f00.a();
                    if(s != null && s.length() > 0) {
                        Dl.G(this.e, f00.a());
                    }
                }
                q0 q02 = this.e.u;
                if(q02 == null) {
                    L.S("binding");
                }
                else {
                    q00 = q02;
                }
                q00.y.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        q0 q00 = this.u;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        q00.y.setVisibility(0);
        this.z = uk.NG(z, this.v, this.w).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.GalleryPushSettingActivity.w(this, z), "$tmp0");
            new com.dcinside.app.push.GalleryPushSettingActivity.w(this, z).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F15030E);  // string:failed_apply_notice "저장에 실패했습니다. 잠시 후 다시 시도해주세요."
            q0 q00 = this.u;
            if(q00 == null) {
                L.S("binding");
                q00 = null;
            }
            q00.y.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void N2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void O2(GalleryPushSettingActivity galleryPushSettingActivity0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.push.i
    public void h(@l String s, @m String s1) {
        static final class com.dcinside.app.push.GalleryPushSettingActivity.f extends N implements Function1 {
            public static final com.dcinside.app.push.GalleryPushSettingActivity.f e;

            static {
                com.dcinside.app.push.GalleryPushSettingActivity.f.e = new com.dcinside.app.push.GalleryPushSettingActivity.f();
            }

            com.dcinside.app.push.GalleryPushSettingActivity.f() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F15027C);  // string:delete_gallery_keyword "등록한 키워드를 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class g extends N implements Function1 {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
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


        static final class h extends N implements Function1 {
            final GalleryPushSettingActivity e;
            final String f;
            final String g;

            h(GalleryPushSettingActivity galleryPushSettingActivity0, String s, String s1) {
                this.e = galleryPushSettingActivity0;
                this.f = s;
                this.g = s1;
                super(1);
            }

            public final void a(Boolean boolean0) {
                GalleryPushSettingActivity.G2(this.e, false, this.f, this.g, null, 8, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(s, "dataValue");
        e.e.a(this).n(com.dcinside.app.push.GalleryPushSettingActivity.f.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(g.e, "$tmp0");
            return (Boolean)g.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new h(this, s, s1), "$tmp0");
            new h(this, s, s1).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    private final void i2() {
        static final class com.dcinside.app.push.GalleryPushSettingActivity.c extends N implements Function1 {
            public static final com.dcinside.app.push.GalleryPushSettingActivity.c e;

            static {
                com.dcinside.app.push.GalleryPushSettingActivity.c.e = new com.dcinside.app.push.GalleryPushSettingActivity.c();
            }

            com.dcinside.app.push.GalleryPushSettingActivity.c() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150271);  // string:delete_all_block "목록을 모두 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.push.GalleryPushSettingActivity.d extends N implements Function1 {
            public static final com.dcinside.app.push.GalleryPushSettingActivity.d e;

            static {
                com.dcinside.app.push.GalleryPushSettingActivity.d.e = new com.dcinside.app.push.GalleryPushSettingActivity.d();
            }

            com.dcinside.app.push.GalleryPushSettingActivity.d() {
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


        static final class com.dcinside.app.push.GalleryPushSettingActivity.e extends N implements Function1 {
            final GalleryPushSettingActivity e;

            com.dcinside.app.push.GalleryPushSettingActivity.e(GalleryPushSettingActivity galleryPushSettingActivity0) {
                this.e = galleryPushSettingActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.p2();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        e.e.a(this).n(com.dcinside.app.push.GalleryPushSettingActivity.c.e).z(0x7F15034A).x(0x7F1501C1).b().Z1((Object object0) -> {
            L.p(com.dcinside.app.push.GalleryPushSettingActivity.d.e, "$tmp0");
            return (Boolean)com.dcinside.app.push.GalleryPushSettingActivity.d.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.push.GalleryPushSettingActivity.e(this), "$tmp0");
            new com.dcinside.app.push.GalleryPushSettingActivity.e(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean j2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void k2(Function1 function10, Object object0) [...]

    private final void l2() {
        int v = 0;
        q0 q00 = this.u;
        q0 q01 = null;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        Adapter recyclerView$Adapter0 = q00.q.getAdapter();
        int v1 = recyclerView$Adapter0 == null ? 0 : recyclerView$Adapter0.getItemCount();
        q0 q02 = this.u;
        if(q02 == null) {
            L.S("binding");
            q02 = null;
        }
        String s = this.getString(0x7F1503C1, new Object[]{v1});  // string:gallery_keyword_count "(%d)"
        q02.h.setText(s);
        q0 q03 = this.u;
        if(q03 == null) {
            L.S("binding");
            q03 = null;
        }
        q03.o.setVisibility((v1 <= 0 ? 0 : 8));
        q0 q04 = this.u;
        if(q04 == null) {
            L.S("binding");
        }
        else {
            q01 = q04;
        }
        ImageView imageView0 = q01.i;
        if(v1 <= 0) {
            v = 8;
        }
        imageView0.setVisibility(v);
    }

    // 检测为 Lambda 实现
    private static final Boolean m2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void n2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void o2(GalleryPushSettingActivity galleryPushSettingActivity0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1047 && v1 == -1) {
            this.y2(this.v);
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        q0 q00 = q0.c(this.getLayoutInflater());
        L.o(q00, "inflate(...)");
        this.u = q00;
        q0 q01 = null;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        this.setContentView(q00.b());
        q0 q02 = this.u;
        if(q02 == null) {
            L.S("binding");
        }
        else {
            q01 = q02;
        }
        this.S0(q01.s);
        kr.bhbfhfb.designcompat.a.d(this);
        String s = this.getIntent().getStringExtra("galleryId");
        String s1 = "";
        if(s == null) {
            s = "";
        }
        this.v = s;
        String s2 = this.getIntent().getStringExtra("galleryName");
        if(s2 != null) {
            s1 = s2;
        }
        this.w = s1;
        this.u2();
        this.s2();
        if(L.g(this.getIntent().getAction(), "gallerySettingAction")) {
            this.y2(this.v);
            return;
        }
        if(L.g(this.getIntent().getAction(), "galleryKeywordAction")) {
            this.C2(this.v);
        }
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@m Menu menu0) {
        if(L.g(this.getIntent().getAction(), "gallerySettingAction")) {
            this.getMenuInflater().inflate(0x7F100002, menu0);  // mipmap:gall_base_icon3
            if(menu0 != null) {
                MenuItem menuItem0 = menu0.findItem(0x7F0B0056);  // id:action_config
                if(menuItem0 != null) {
                    View view0 = menuItem0.getActionView();
                    View view1 = view0 == null ? null : view0.findViewById(0x7F0B0814);  // id:menu_config
                    if(view1 != null) {
                        view1.setOnClickListener((View view0) -> {
                            L.p(this, "this$0");
                            L.p(menuItem0, "$it");
                            this.onOptionsItemSelected(menuItem0);
                        });
                    }
                }
            }
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        kl.b(new o[]{this.x, this.z, this.y, this.A});
        this.x = null;
        this.z = null;
        this.y = null;
        this.A = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.onBackPressed();
                return true;
            }
            case 0x7F0B0056: {  // id:action_config
                NotificationSettingActivity.z.a(this);
                return super.onOptionsItemSelected(menuItem0);
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    private final void p2() {
        @s0({"SMAP\nGalleryPushSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryPushSettingActivity.kt\ncom/dcinside/app/push/GalleryPushSettingActivity$deleteAll$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,394:1\n25#2:395\n*S KotlinDebug\n*F\n+ 1 GalleryPushSettingActivity.kt\ncom/dcinside/app/push/GalleryPushSettingActivity$deleteAll$1\n*L\n164#1:395\n*E\n"})
        static final class com.dcinside.app.push.GalleryPushSettingActivity.i extends N implements Function1 {
            final GalleryPushSettingActivity e;

            com.dcinside.app.push.GalleryPushSettingActivity.i(GalleryPushSettingActivity galleryPushSettingActivity0) {
                this.e = galleryPushSettingActivity0;
                super(1);
            }

            public final void a(f0 f00) {
                q0 q00 = this.e.u;
                Adapter recyclerView$Adapter0 = null;
                if(q00 == null) {
                    L.S("binding");
                    q00 = null;
                }
                q00.y.setVisibility(8);
                q0 q01 = this.e.u;
                if(q01 == null) {
                    L.S("binding");
                    q01 = null;
                }
                L.o(q01.q, "galleryPushKeywordList");
                Adapter recyclerView$Adapter1 = q01.q.getAdapter();
                if(recyclerView$Adapter1 instanceof com.dcinside.app.push.adapter.b) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                if(((com.dcinside.app.push.adapter.b)recyclerView$Adapter0) != null) {
                    ((com.dcinside.app.push.adapter.b)recyclerView$Adapter0).x();
                }
                this.e.setResult(-1);
                this.e.l2();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        q0 q00 = this.u;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        q00.y.setVisibility(0);
        this.A = uk.pG(this.v).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.GalleryPushSettingActivity.i(this), "$tmp0");
            new com.dcinside.app.push.GalleryPushSettingActivity.i(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F15030D);  // string:failed_apply_keyword_insert "키워드 알림을 설정할 수 없습니다."
            q0 q00 = this.u;
            if(q00 == null) {
                L.S("binding");
                q00 = null;
            }
            q00.y.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void q2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void r2(GalleryPushSettingActivity galleryPushSettingActivity0, Throwable throwable0) [...]

    private final void s2() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.push.GalleryPushSettingActivity$initCallback$1", f = "GalleryPushSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final GalleryPushSettingActivity l;

            j(GalleryPushSettingActivity galleryPushSettingActivity0, kotlin.coroutines.d d0) {
                this.l = galleryPushSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new j(this.l, d0).invokeSuspend(S0.a);
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
                GalleryPushSettingActivity galleryPushSettingActivity0 = this.l;
                q0 q00 = galleryPushSettingActivity0.u;
                if(q00 == null) {
                    L.S("binding");
                    q00 = null;
                }
                galleryPushSettingActivity0.M2(!q00.u.isChecked());
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.push.GalleryPushSettingActivity$initCallback$2", f = "GalleryPushSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final GalleryPushSettingActivity l;

            k(GalleryPushSettingActivity galleryPushSettingActivity0, kotlin.coroutines.d d0) {
                this.l = galleryPushSettingActivity0;
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
                GalleryPushSettingActivity galleryPushSettingActivity0 = this.l;
                q0 q00 = galleryPushSettingActivity0.u;
                if(q00 == null) {
                    L.S("binding");
                    q00 = null;
                }
                galleryPushSettingActivity0.J2(!q00.n.isChecked());
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.push.GalleryPushSettingActivity$initCallback$3", f = "GalleryPushSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.GalleryPushSettingActivity.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final GalleryPushSettingActivity l;

            com.dcinside.app.push.GalleryPushSettingActivity.l(GalleryPushSettingActivity galleryPushSettingActivity0, kotlin.coroutines.d d0) {
                this.l = galleryPushSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.push.GalleryPushSettingActivity.l(this.l, d0).invokeSuspend(S0.a);
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
                this.l.x2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.push.GalleryPushSettingActivity$initCallback$4", f = "GalleryPushSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.GalleryPushSettingActivity.m extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final GalleryPushSettingActivity l;

            com.dcinside.app.push.GalleryPushSettingActivity.m(GalleryPushSettingActivity galleryPushSettingActivity0, kotlin.coroutines.d d0) {
                this.l = galleryPushSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.push.GalleryPushSettingActivity.m(this.l, d0).invokeSuspend(S0.a);
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
                ArticlePostListActivity.y.a(this.l, this.l.v, this.l.w);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.push.GalleryPushSettingActivity$initCallback$5", f = "GalleryPushSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class n extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final GalleryPushSettingActivity l;

            n(GalleryPushSettingActivity galleryPushSettingActivity0, kotlin.coroutines.d d0) {
                this.l = galleryPushSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new n(this.l, d0).invokeSuspend(S0.a);
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
                KeywordListActivity.w.a(this.l, "com.dcinside.app.ArticlePostListActivity.ACTION_KEYWORD_LIST_TYPE");
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.push.GalleryPushSettingActivity$initCallback$6", f = "GalleryPushSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.GalleryPushSettingActivity.o extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final GalleryPushSettingActivity l;

            com.dcinside.app.push.GalleryPushSettingActivity.o(GalleryPushSettingActivity galleryPushSettingActivity0, kotlin.coroutines.d d0) {
                this.l = galleryPushSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.push.GalleryPushSettingActivity.o(this.l, d0).invokeSuspend(S0.a);
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
                SettingPushGalleryActivity.y.c(this.l, this.l.v, this.l.w);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.push.GalleryPushSettingActivity$initCallback$7", f = "GalleryPushSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.GalleryPushSettingActivity.p extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final GalleryPushSettingActivity l;

            com.dcinside.app.push.GalleryPushSettingActivity.p(GalleryPushSettingActivity galleryPushSettingActivity0, kotlin.coroutines.d d0) {
                this.l = galleryPushSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.push.GalleryPushSettingActivity.p(this.l, d0).invokeSuspend(S0.a);
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
                this.l.i2();
                return S0.a;
            }
        }

        q0 q00 = this.u;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        L.o(q00.t, "galleryRecommendPush");
        j galleryPushSettingActivity$j0 = new j(this, null);
        r.M(q00.t, null, galleryPushSettingActivity$j0, 1, null);
        q0 q01 = this.u;
        if(q01 == null) {
            L.S("binding");
            q01 = null;
        }
        L.o(q01.m, "galleryNoticePush");
        k galleryPushSettingActivity$k0 = new k(this, null);
        r.M(q01.m, null, galleryPushSettingActivity$k0, 1, null);
        q0 q02 = this.u;
        if(q02 == null) {
            L.S("binding");
            q02 = null;
        }
        L.o(q02.d, "galleryInputKeyword");
        com.dcinside.app.push.GalleryPushSettingActivity.l galleryPushSettingActivity$l0 = new com.dcinside.app.push.GalleryPushSettingActivity.l(this, null);
        r.M(q02.d, null, galleryPushSettingActivity$l0, 1, null);
        q0 q03 = this.u;
        if(q03 == null) {
            L.S("binding");
            q03 = null;
        }
        L.o(q03.b, "galleryArticlePushEnable");
        com.dcinside.app.push.GalleryPushSettingActivity.m galleryPushSettingActivity$m0 = new com.dcinside.app.push.GalleryPushSettingActivity.m(this, null);
        r.M(q03.b, null, galleryPushSettingActivity$m0, 1, null);
        q0 q04 = this.u;
        if(q04 == null) {
            L.S("binding");
            q04 = null;
        }
        L.o(q04.z, "keywordPushAll");
        n galleryPushSettingActivity$n0 = new n(this, null);
        r.M(q04.z, null, galleryPushSettingActivity$n0, 1, null);
        q0 q05 = this.u;
        if(q05 == null) {
            L.S("binding");
            q05 = null;
        }
        L.o(q05.v, "galleryUserPushEnable");
        com.dcinside.app.push.GalleryPushSettingActivity.o galleryPushSettingActivity$o0 = new com.dcinside.app.push.GalleryPushSettingActivity.o(this, null);
        r.M(q05.v, null, galleryPushSettingActivity$o0, 1, null);
        q0 q06 = this.u;
        if(q06 == null) {
            L.S("binding");
            q06 = null;
        }
        L.o(q06.i, "galleryKeywordCountRemoveAll");
        com.dcinside.app.push.GalleryPushSettingActivity.p galleryPushSettingActivity$p0 = new com.dcinside.app.push.GalleryPushSettingActivity.p(this, null);
        r.M(q06.i, null, galleryPushSettingActivity$p0, 1, null);
    }

    private final void t2(boolean z, boolean z1, List list0, int v, int v1) {
        q0 q00 = this.u;
        q0 q01 = null;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        q00.u.setChecked(z);
        q0 q02 = this.u;
        if(q02 == null) {
            L.S("binding");
            q02 = null;
        }
        q02.n.setChecked(z1);
        q0 q03 = this.u;
        if(q03 == null) {
            L.S("binding");
            q03 = null;
        }
        int v2 = 4;
        q03.c.setVisibility((v <= 0 ? 4 : 0));
        q03.c.setText(String.valueOf(v));
        q0 q04 = this.u;
        if(q04 == null) {
            L.S("binding");
            q04 = null;
        }
        TextView textView0 = q04.w;
        if(v1 > 0) {
            v2 = 0;
        }
        textView0.setVisibility(v2);
        textView0.setText(String.valueOf(v1));
        q0 q05 = this.u;
        if(q05 == null) {
            L.S("binding");
            q05 = null;
        }
        L.m(q05.q);
        Adapter recyclerView$Adapter0 = q05.q.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.push.adapter.b)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.push.adapter.b)recyclerView$Adapter0) != null) {
            ((com.dcinside.app.push.adapter.b)recyclerView$Adapter0).F(list0);
        }
        q0 q06 = this.u;
        if(q06 == null) {
            L.S("binding");
        }
        else {
            q01 = q06;
        }
        q01.r.setVisibility(0);
        this.l2();
    }

    private final void u2() {
        int v = 0;
        q0 q00 = this.u;
        q0 q01 = null;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        com.dcinside.app.push.adapter.b b0 = new com.dcinside.app.push.adapter.b();
        q00.q.setAdapter(b0);
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(q00.q.getContext(), 1, false);
        q00.q.setLayoutManager(linearLayoutManager0);
        if(!L.g(this.getIntent().getAction(), "gallerySettingAction")) {
            this.setTitle(this.getString(0x7F150980, new Object[]{this.w}));  // string:setting_keyword_gallery_title "키워드 - %s"
            v = 8;
        }
        q0 q02 = this.u;
        if(q02 == null) {
            L.S("binding");
            q02 = null;
        }
        q02.t.setVisibility(v);
        q0 q03 = this.u;
        if(q03 == null) {
            L.S("binding");
            q03 = null;
        }
        q03.m.setVisibility(v);
        q0 q04 = this.u;
        if(q04 == null) {
            L.S("binding");
            q04 = null;
        }
        q04.b.setVisibility(v);
        q0 q05 = this.u;
        if(q05 == null) {
            L.S("binding");
            q05 = null;
        }
        q05.k.setVisibility(v);
        q0 q06 = this.u;
        if(q06 == null) {
            L.S("binding");
            q06 = null;
        }
        q06.l.setVisibility(v);
        q0 q07 = this.u;
        if(q07 == null) {
            L.S("binding");
            q07 = null;
        }
        q07.v.setVisibility(v);
        q0 q08 = this.u;
        if(q08 == null) {
            L.S("binding");
        }
        else {
            q01 = q08;
        }
        q01.z.setVisibility(v);
    }

    private final void v2(ArrayList arrayList0) {
        static final class q extends N implements A3.a {
            final GalleryPushSettingActivity e;
            final ArrayList f;

            q(GalleryPushSettingActivity galleryPushSettingActivity0, ArrayList arrayList0) {
                this.e = galleryPushSettingActivity0;
                this.f = arrayList0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.v2(this.f);
            }
        }

        q0 q00 = this.u;
        q0 q01 = null;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        L.o(q00.q, "galleryPushKeywordList");
        Adapter recyclerView$Adapter0 = q00.q.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.push.adapter.b)) {
            recyclerView$Adapter0 = null;
        }
        if((((com.dcinside.app.push.adapter.b)recyclerView$Adapter0) == null ? 0 : ((com.dcinside.app.push.adapter.b)recyclerView$Adapter0).getItemCount()) >= 100) {
            Dl.G(this, this.getString(0x7F15051C, new Object[]{100}));  // string:keyword_limit_over "키워드는 총 %1$d개까지 등록 가능합니다."
            q0 q02 = this.u;
            if(q02 == null) {
                L.S("binding");
            }
            else {
                q01 = q02;
            }
            q01.y.setVisibility(8);
            return;
        }
        if(!arrayList0.isEmpty()) {
            Object object0 = arrayList0.remove(0);
            L.o(object0, "removeAt(...)");
            this.F2(true, ((String)object0), this.v, new q(this, arrayList0));
            return;
        }
        q0 q03 = this.u;
        if(q03 == null) {
            L.S("binding");
        }
        else {
            q01 = q03;
        }
        q01.y.setVisibility(8);
    }

    // 检测为 Lambda 实现
    private static final void w2(GalleryPushSettingActivity galleryPushSettingActivity0, MenuItem menuItem0, View view0) [...]

    private final void x2() {
        q0 q00 = this.u;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        String s = String.valueOf(q00.e.getText());
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(kotlin.text.v.V4(s, new String[]{"\n"}, false, 0, 6, null));
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            int v = ((String)object0).length();
            if(2 > v || v >= 16) {
                arrayList1.add(object0);
            }
        }
        if(arrayList1.size() > 0) {
            Dl.D(this, 0x7F150683);  // string:more_keyword_length "키워드는 2~15자 이내로 입력해 주세요."
            return;
        }
        this.v2(arrayList0);
    }

    private final void y2(String s) {
        @s0({"SMAP\nGalleryPushSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryPushSettingActivity.kt\ncom/dcinside/app/push/GalleryPushSettingActivity$requestGalleryPushData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,394:1\n1782#2,4:395\n1782#2,4:399\n1782#2,4:403\n*S KotlinDebug\n*F\n+ 1 GalleryPushSettingActivity.kt\ncom/dcinside/app/push/GalleryPushSettingActivity$requestGalleryPushData$1\n*L\n228#1:395,4\n229#1:399,4\n231#1:403,4\n*E\n"})
        static final class com.dcinside.app.push.GalleryPushSettingActivity.r extends N implements A3.r {
            final String e;

            com.dcinside.app.push.GalleryPushSettingActivity.r(String s) {
                this.e = s;
                super(5);
            }

            @Override  // A3.r
            public Object K0(Object object0, Object object1, Object object2, Object object3, Object object4) {
                return this.a(((g0.f.c)object0), ((g0.f.c)object1), ((f)object2), ((g0.f.c)object3), ((g0.f.c)object4));
            }

            public final b a(g0.f.c f$c0, g0.f.c f$c1, f f0, g0.f.c f$c2, g0.f.c f$c3) {
                List list2;
                int v2;
                int v1;
                List list0 = f$c0.a();
                int v = 0;
                if(list0 == null) {
                    v1 = 0;
                }
                else {
                    String s = this.e;
                    if(list0 instanceof Collection && list0.isEmpty()) {
                        v1 = 0;
                    }
                    else {
                        v1 = 0;
                        for(Object object0: list0) {
                            String s1 = ((g0.f.b)object0).d();
                            if(s1 != null && s1.contentEquals(s)) {
                                ++v1;
                                if(v1 < 0) {
                                    u.Y();
                                }
                            }
                        }
                    }
                }
                List list1 = f$c1.a();
                if(list1 == null) {
                    v2 = 0;
                }
                else {
                    String s2 = this.e;
                    if(list1 instanceof Collection && list1.isEmpty()) {
                        v2 = 0;
                    }
                    else {
                        v2 = 0;
                        for(Object object1: list1) {
                            String s3 = ((g0.f.b)object1).d();
                            if(s3 != null && s3.contentEquals(s2)) {
                                ++v2;
                                if(v2 < 0) {
                                    u.Y();
                                }
                            }
                        }
                    }
                }
                Map map0 = f0.a();
                if(map0 == null) {
                    list2 = u.H();
                }
                else {
                    g0.f.b f$b0 = (g0.f.b)map0.get(this.e);
                    if(f$b0 == null) {
                        list2 = u.H();
                    }
                    else {
                        list2 = f$b0.f();
                        if(list2 == null) {
                            list2 = u.H();
                        }
                    }
                }
                List list3 = f$c2.a();
                if(list3 != null) {
                    String s4 = this.e;
                    if(!(list3 instanceof Collection) || !list3.isEmpty()) {
                        int v3 = 0;
                        for(Object object2: list3) {
                            String s5 = ((g0.f.b)object2).d();
                            if(s5 != null && s5.contentEquals(s4)) {
                                ++v3;
                                if(v3 < 0) {
                                    u.Y();
                                }
                            }
                        }
                        v = v3;
                    }
                    return new b(v1 > 0, v2 > 0, list2, v, f$c3.b());
                }
                return new b(v1 > 0, v2 > 0, list2, 0, f$c3.b());
            }
        }


        static final class com.dcinside.app.push.GalleryPushSettingActivity.s extends N implements Function1 {
            final GalleryPushSettingActivity e;

            com.dcinside.app.push.GalleryPushSettingActivity.s(GalleryPushSettingActivity galleryPushSettingActivity0) {
                this.e = galleryPushSettingActivity0;
                super(1);
            }

            public final void a(b galleryPushSettingActivity$b0) {
                this.e.t2(galleryPushSettingActivity$b0.a(), galleryPushSettingActivity$b0.b(), galleryPushSettingActivity$b0.c(), galleryPushSettingActivity$b0.d(), galleryPushSettingActivity$b0.e());
                q0 q00 = this.e.u;
                if(q00 == null) {
                    L.S("binding");
                    q00 = null;
                }
                q00.y.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((b)object0));
                return S0.a;
            }
        }

        q0 q00 = this.u;
        if(q00 == null) {
            L.S("binding");
            q00 = null;
        }
        q00.y.setVisibility(0);
        this.x = rx.g.r0(uk.Kk(), uk.Jk(), uk.Ik(s), uk.xk(s, g0.b.c), uk.Mk(s), (Object object0, Object object1, Object object2, Object object3, Object object4) -> {
            L.p(new com.dcinside.app.push.GalleryPushSettingActivity.r(s), "$tmp0");
            return (b)new com.dcinside.app.push.GalleryPushSettingActivity.r(s).K0(object0, object1, object2, object3, object4);
        }).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.GalleryPushSettingActivity.s(this), "$tmp0");
            new com.dcinside.app.push.GalleryPushSettingActivity.s(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F150326);  // string:failed_notice_data "정보를 가져올 수 없습니다. 잠시 후 다시 시도해주세요."
            this.finish();
        });
    }

    // 检测为 Lambda 实现
    private static final b z2(A3.r r0, Object object0, Object object1, Object object2, Object object3, Object object4) [...]
}

