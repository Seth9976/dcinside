package com.dcinside.app.wv;

import android.content.Context;
import android.os.Build.VERSION;
import com.dcinside.app.type.A;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.vk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import org.jsoup.nodes.f;
import org.jsoup.nodes.o;
import y4.m;

final class l {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[r.values().length];
            try {
                arr_v[r.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[r.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[r.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @y4.l
    private final String A;
    private int B;
    private int C;
    @m
    private o D;
    @m
    private o E;
    @y4.l
    private final D F;
    @y4.l
    private final D G;
    private final boolean H;
    private final boolean I;
    @y4.l
    private final Context a;
    @y4.l
    private final f b;
    private final boolean c;
    private final boolean d;
    private final int e;
    @y4.l
    private final r f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    @y4.l
    private final String j;
    @y4.l
    private String k;
    @y4.l
    private final String l;
    @y4.l
    private final String m;
    @y4.l
    private final String n;
    @y4.l
    private final String o;
    private final float p;
    private final int q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    @y4.l
    private final ArrayList v;
    @y4.l
    private final Map w;
    private int x;
    private int y;
    private int z;

    public l(@y4.l Context context0, @y4.l f f0, boolean z, boolean z1, boolean z2, int v, @y4.l r r0, boolean z3, @m Float float0, boolean z4, boolean z5, boolean z6) {
        static final class b extends N implements A3.a {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(0);
            }

            // 去混淆评级： 低(40)
            @y4.l
            public final Integer b() {
                return 0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class c extends N implements A3.a {
            final l e;

            c(l l0) {
                this.e = l0;
                super(0);
            }

            @y4.l
            public final g b() {
                return new g(this.e.e());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(context0, "context");
        L.p(f0, "document");
        L.p(r0, "captureForm");
        super();
        this.a = context0;
        this.b = f0;
        this.c = z;
        this.d = z2;
        this.e = v;
        this.f = r0;
        this.g = z3;
        this.h = z5;
        dl dl0 = dl.a;
        boolean z7 = dl0.q2().m();
        this.i = z7;
        String s = com.dcinside.app.internal.c.i(vk.b(context0, 0x1010036));
        this.j = s;
        this.k = com.dcinside.app.internal.c.i(vk.b(context0, 0x7F0401F8));  // attr:dcBodyLinkColor
        String s1 = com.dcinside.app.internal.c.i(vk.b(context0, 0x7F040573));  // attr:seriesListContentBg
        this.l = s1;
        int v1 = vk.b(context0, 0x7F040241);  // attr:divColor
        String s2 = Build.VERSION.SDK_INT < 26 ? com.dcinside.app.internal.c.i(v1) : com.dcinside.app.internal.c.k(v1);
        this.m = s2;
        this.n = "#ABABAB";
        String s3 = com.dcinside.app.internal.c.i(vk.b(context0, 0x7F0406F6));  // attr:windowBackgroundInverse
        this.o = s3;
        float f1 = float0 == null ? ((float)dl0.M1().c()) : ((float)float0);
        this.p = f1;
        this.q = z1 ? 10 : 0;
        this.r = dl0.N();
        this.s = dl0.O();
        this.t = dl0.L();
        this.u = dl0.M();
        this.v = new ArrayList();
        this.w = new LinkedHashMap();
        this.A = z7 ? "ico_img_note_line_w.png" : "ico_img_note_line_b.png";
        this.F = E.a(new c(this));
        this.G = E.a(b.e);
        this.H = A.c.a();
        this.I = A.c.b();
        o o0 = f0.p3();
        o o1 = o0.C0("<meta http-equiv=\'Content-Type\' content=\'text/html; charset=utf-8\' /><meta name=\'viewport\' content=\'user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width\' /><meta name=\'format-detection\' content=\'telephone=no\' /><link rel=\'icon\' type=\'image/png\' href=\'data:image/png;base64,iVBORw0KGgo=\' />").D0(f0.j3("link").L0("href", "file:///android_asset/content_body.css").L0("type", "text/css").L0("rel", "stylesheet")).D0(f0.j3("script").L0("src", "file:///android_asset/content_body.js").L0("type", "text/javascript"));
        String s4 = String.format("<style>:root {--dc-series-bg: %s;--dc-body-txt-color: %s;--dc-body-link-color: %s;--dc-og-border-color: %s;--dc-og-link-color: %s;--dc-img-note-line: %s}</style>", Arrays.copyOf(new Object[]{s1, s, this.k, s2, "#ABABAB", "url(file:///android_asset/" + (z7 ? "ico_img_note_line_w.png" : "ico_img_note_line_b.png") + ")"}, 6));
        L.o(s4, "format(...)");
        o o2 = o1.C0(s4);
        String s5 = String.format("<style>span > a:active {color: %s;background-color: %s;}</style>", Arrays.copyOf(new Object[]{this.k, s3}, 2));
        L.o(s5, "format(...)");
        o2.C0(s5);
        if(z4) {
            o0.D0(f0.j3("script").L0("src", "https://wcs.naver.net/wcslog.js").L0("type", "text/javascript")).D0(f0.j3("script").L0("src", "file:///android_asset/naver_analytics.js").L0("type", "text/javascript"));
        }
        if(a.a[r0.ordinal()] == 3) {
            o0.D0(f0.j3("link").L0("href", "file:///android_asset/content_pdf_ext.css").L0("type", "text/css").L0("rel", "stylesheet"));
        }
        String s6 = String.format(("margin:0;padding:" + (z1 ? 10 : 0) + "px;color:" + s + ";font-size:" + f1 + "px;max-width:100%%;word-wrap:break-word;"), Arrays.copyOf(new Object[0], 0));
        L.o(s6, "format(...)");
        Map map0 = f0.c3().L0("style", s6).f1();
        L.m(map0);
        map0.put("rid", String.valueOf(v));
        o0.D0(f0.j3("script").L0("src", "file:///android_asset/content_drag_disable.js").L0("type", "text/javascript"));
        if(z6) {
            int v2 = dl0.k2();
            if(com.dcinside.app.settings.spoiler.c.d.a(v2).e()) {
                f0.c3().z0("dc_blurred_on");
            }
        }
    }

    @y4.l
    public final String A() {
        return this.j;
    }

    public final int B() {
        return this.x;
    }

    public final boolean C() {
        return this.i;
    }

    public final boolean D() {
        return this.t;
    }

    public final boolean E() {
        return this.u;
    }

    public final boolean F() {
        return this.r;
    }

    public final boolean G() {
        return this.s;
    }

    public final boolean H() {
        return this.H;
    }

    public final boolean I() {
        return this.I;
    }

    public final boolean J() {
        return this.h;
    }

    public final void K(int v) {
        this.C = v;
    }

    public final void L(@m o o0) {
        this.D = o0;
    }

    public final void M(@m o o0) {
        this.E = o0;
    }

    public final void N(int v) {
        this.B = v;
    }

    public final void O(int v) {
        this.z = v;
    }

    public final void P(int v) {
        this.y = v;
    }

    public final void Q(@y4.l String s) {
        L.p(s, "<set-?>");
        this.k = s;
    }

    public final void R(int v) {
        this.x = v;
    }

    @y4.l
    public final String a() {
        return this.o;
    }

    public final int b() {
        return this.C;
    }

    @y4.l
    public final r c() {
        return this.f;
    }

    @y4.l
    public final e d() {
        return new e(this.b, this.v, this.w, false, false);
    }

    @y4.l
    public final Context e() {
        return this.a;
    }

    @m
    public final o f() {
        return this.D;
    }

    @y4.l
    public final f g() {
        return this.b;
    }

    public final int h() {
        return ((Number)this.G.getValue()).intValue();
    }

    @m
    public final o i() {
        return this.E;
    }

    public final float j() {
        return this.p;
    }

    @y4.l
    public final Map k() {
        return this.w;
    }

    public final boolean l() {
        return this.g;
    }

    public final int m() {
        return this.B;
    }

    public final boolean n() {
        return this.c;
    }

    public final boolean o() {
        return this.d;
    }

    @y4.l
    public final ArrayList p() {
        return this.v;
    }

    public final int q() {
        return this.z;
    }

    @y4.l
    public final String r() {
        return this.A;
    }

    public final int s() {
        return this.y;
    }

    @y4.l
    public final String t() {
        return this.k;
    }

    @y4.l
    public final String u() {
        return this.m;
    }

    @y4.l
    public final String v() {
        return this.n;
    }

    @y4.l
    public final g w() {
        return (g)this.F.getValue();
    }

    public final int x() {
        return this.q;
    }

    public final int y() {
        return this.e;
    }

    @y4.l
    public final String z() {
        return this.l;
    }
}

