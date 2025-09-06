package com.fsn.cauly.Y;

import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;

public class n extends v0 {
    i0 s;
    j0 t;
    String u;

    public n(i0 i00, j0 j00, String s) {
        this.a(i00.p);
        this.s = i00;
        this.t = j00;
        this.u = s;
    }

    public static void a(i0 i00, j0 j00, String s) {
        if(s == null && !"Y".equalsIgnoreCase(j00.r)) {
            return;
        }
        if(i00.a == a.b || i00.a == a.d) {
            i00.X = System.currentTimeMillis();
        }
        new n(i00, j00, s).execute();
    }

    @Override  // com.fsn.cauly.Y.v0
    public void c() {
        if(this.t != null && this.t.a != null) {
            String s = this.d();
            u0 u00 = new u0();
            u00.b(s);
            u00.c();
            return;
        }
        g.a(b.f, "Not a vaild check AdInfo");
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
        if(this.u != null) {
            stringBuffer0.append("&inform_type=" + this.u);
        }
        if(this.t.f != null) {
            stringBuffer0.append("&ad_shape=" + this.t.f);
        }
        a i0$a0 = this.s.a;
        if(i0$a0 == a.a) {
            stringBuffer0.append("&ad_form=banner");
        }
        else if(i0$a0 == a.b) {
            stringBuffer0.append("&ad_form=ext_interstitial");
        }
        else if(i0$a0 == a.c || i0$a0 == a.g) {
            stringBuffer0.append("&ad_form=nativead");
        }
        else {
            stringBuffer0.append("&ad_form=closead");
        }
        if(l00.n) {
            stringBuffer0.append("&unique_app_id=com.dcinside.app.android");
        }
        return stringBuffer0.toString();
    }
}

