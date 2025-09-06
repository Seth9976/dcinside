package com.fsn.cauly.Y;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.fsn.cauly.blackdragoncore.utils.d;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.fsn.cauly.blackdragoncore.utils.j;

public class o extends v0 {
    i0 s;
    j0 t;
    String u;
    b0 v;
    boolean w;
    boolean x;

    public o(i0 i00, j0 j00, String s) {
        this.w = false;
        this.x = false;
        this.a(i00.p);
        this.s = i00;
        this.t = j00;
        this.u = s;
    }

    public o(i0 i00, j0 j00, String s, b0 b00) {
        this.w = false;
        this.x = false;
        this.a(i00.p);
        this.s = i00;
        this.t = j00;
        this.u = s;
        this.v = b00;
    }

    public o(i0 i00, j0 j00, String s, b0 b00, boolean z) {
        this.w = false;
        this.x = false;
        this.a(i00.p);
        this.s = i00;
        this.t = j00;
        this.u = s;
        this.v = b00;
        this.x = z;
    }

    public o(i0 i00, j0 j00, String s, boolean z) {
        this.w = false;
        this.x = false;
        this.a(i00.p);
        this.w = z;
        this.s = i00;
        this.t = j00;
        this.u = s;
    }

    public static void a(i0 i00) {
        if(i00.a == a.b || i00.a == a.d) {
            i00.X = System.currentTimeMillis();
        }
    }

    public static void a(i0 i00, j0 j00, String s) {
        if(s == null && !"Y".equalsIgnoreCase(j00.r)) {
            return;
        }
        o.a(i00);
        new o(i00, j00, s).execute();
    }

    public static void a(i0 i00, j0 j00, String s, b0 b00) {
        if(s == null && !"Y".equalsIgnoreCase(j00.r)) {
            return;
        }
        o.a(i00);
        new o(i00, j00, s, b00).execute();
    }

    public static void a(i0 i00, j0 j00, String s, b0 b00, boolean z) {
        if(s == null && !"Y".equalsIgnoreCase(j00.r)) {
            return;
        }
        o.a(i00);
        new o(i00, j00, s, b00, z).execute();
    }

    public static void a(i0 i00, j0 j00, String s, boolean z) {
        if(s == null && !"Y".equalsIgnoreCase(j00.r)) {
            return;
        }
        o.a(i00);
        new o(i00, j00, s, z).execute();
    }

    @Override  // com.fsn.cauly.Y.v0
    public void c() {
        int v = TextUtils.isEmpty(this.t.N) ? 10 : ((int)(((float)Float.valueOf(this.t.N)) * 10.0f));
        int v1 = 0;
        if(v < 0) {
            v = 0;
        }
        if(v > 100) {
            v = 100;
        }
        g.a(b.f, "impressCheck started with cycle:" + v + " " + d.a(this.s));
        if(this.w) {
            this.h();
            return;
        }
        i0 i00 = this.s;
        int v2 = i00.o;
        l0 l00 = i00.r;
        if(l00 != null) {
            if(i00.n) {
                v2 = l00.m;
            }
            v2 -= 2;
        }
        int v3 = 0;
        while(v1 < v2 * 10) {
            try {
                Thread.sleep(100L);
                if(d.a(this.s)) {
                    goto label_24;
                }
                goto label_26;
            }
            catch(InterruptedException unused_ex) {
                g.a(b.b, "impressCheck failed");
                continue;
            }
        label_24:
            ++v3;
            if(v3 >= v) {
                goto label_29;
            }
        label_26:
            ++v1;
        }
        if(this.s.a != a.a) {
        label_29:
            i0 i01 = this.s;
            if(i01.a == a.a && (i01.r != null && i01.r.v)) {
                String s = j.a(i01.b, "BANNERAD", "");
                if(!TextUtils.isEmpty(s)) {
                    if(!s.startsWith(this.t.n + "::")) {
                        g.a(b.f, "duplicate banner impression");
                        return;
                    }
                    j.b(this.s.b, "BANNERAD", s.replace(this.t.n + "::", this.t.n + "_clk::"));
                }
            }
            this.h();
            return;
        }
        g.a(b.f, "Not a valid impression");
    }

    String d() {
        l0 l00 = this.s.r == null ? new l0() : this.s.r;
        StringBuffer stringBuffer0 = new StringBuffer();
        if(l00.a) {
            stringBuffer0.append("https://ad.cauly.co.kr/CaulyImpressInform?");
        }
        else {
            stringBuffer0.append("http://ad.cauly.co.kr/CaulyImpressInform?");
        }
        stringBuffer0.append("sdk_type=3d-na");
        stringBuffer0.append("&ads_cd=" + this.t.a);
        stringBuffer0.append("&version=" + m0.d());
        stringBuffer0.append("&sdk_version=3.5.30");
        stringBuffer0.append("&platform=Android");
        stringBuffer0.append("&code=" + this.t.b);
        stringBuffer0.append("&model=" + m0.a());
        stringBuffer0.append("&scode=" + m0.i(this.s.b));
        stringBuffer0.append("&origin_code=" + m0.h(this.s.b));
        stringBuffer0.append("&scode_type=" + m0.j(this.s.b));
        if(m0.n(this.s.b)) {
            stringBuffer0.append("&gaid=" + m0.i(this.s.b));
        }
        else {
            stringBuffer0.append("&app_set_id=" + m0.i(this.s.b));
            stringBuffer0.append("&app_set_id_scope=" + m0.c(this.s.b));
        }
        if(l00.j) {
            stringBuffer0.append("&network=" + m0.g(this.s.b));
        }
        String s = this.t.n;
        if(s == null || s.length() == 0) {
            stringBuffer0.append("&iserial=000000000000000000000000000000");
        }
        else {
            stringBuffer0.append("&iserial=" + this.t.n);
        }
        if(this.u == null) {
            a i0$a0 = this.s.a;
            if(i0$a0 != a.b && i0$a0 != a.d) {
                stringBuffer0.append("&visible=Y");
            }
            else if(this.x) {
                stringBuffer0.append("&visible=" + (d.a(this.s) ? "Y" : "N"));
            }
            else if(this.v == null || !this.v.isShowing()) {
                stringBuffer0.append("&visible=N");
            }
            else {
                stringBuffer0.append("&visible=Y");
            }
        }
        else {
            stringBuffer0.append("&inform_type=" + this.u);
        }
        if(this.t.f != null) {
            stringBuffer0.append("&ad_shape=" + this.t.f);
        }
        a i0$a1 = this.s.a;
        if(i0$a1 == a.a) {
            stringBuffer0.append("&ad_form=banner");
        }
        else if(i0$a1 == a.b) {
            stringBuffer0.append("&ad_form=ext_interstitial");
        }
        else if(i0$a1 == a.c || i0$a1 == a.g) {
            stringBuffer0.append("&ad_form=nativead");
        }
        else if(i0$a1 == a.h) {
            stringBuffer0.append("&ad_form=video_ad");
        }
        else {
            stringBuffer0.append("&ad_form=closead");
        }
        Context context0 = this.s.b;
        if(context0 != null && context0 instanceof Activity) {
            try {
                stringBuffer0.append("&winfocused=" + ((Activity)context0).hasWindowFocus());
            }
            catch(Exception unused_ex) {
            }
        }
        if(!TextUtils.isEmpty(this.t.m0)) {
            stringBuffer0.append("&spread_type=" + this.t.m0);
        }
        if(l00.n) {
            stringBuffer0.append("&unique_app_id=com.dcinside.app.android");
        }
        stringBuffer0.append("&emul=" + m0.m(this.s.b));
        return stringBuffer0.toString();
    }

    void h() {
        if(this.t != null && this.t.a != null) {
            String s = this.d();
            u0 u00 = new u0();
            u00.b(s);
            u00.c();
            return;
        }
        g.a(b.f, "Not a vaild AdInfo");
    }
}

