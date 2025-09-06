package com.fsn.cauly.Y;

import android.content.Context;
import android.text.TextUtils;

public class k extends v0 {
    Context s;
    String t;
    String u;
    String v;

    public k(Context context0, String s, String s1, String s2) {
        this.s = context0;
        this.t = s;
        this.u = s1;
        this.v = s2;
    }

    public static void a(Context context0, String s, String s1, String s2) {
        new k(context0, s, s1, s2).execute();
    }

    @Override  // com.fsn.cauly.Y.v0
    public void c() {
        String s = this.d();
        u0 u00 = new u0();
        u00.b(s);
        u00.c();
    }

    String d() {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append("https://ad.cauly.co.kr/caulyAptResearch?");
        stringBuffer0.append("sdk_type=3d-na");
        stringBuffer0.append("&version=" + m0.d());
        stringBuffer0.append("&sdk_version=3.5.30");
        stringBuffer0.append("&platform=Android");
        stringBuffer0.append("&model=" + m0.a());
        stringBuffer0.append("&scode=" + m0.i(this.s));
        stringBuffer0.append("&origin_code=" + m0.h(this.s));
        stringBuffer0.append("&scode_type=" + m0.j(this.s));
        if(m0.n(this.s)) {
            stringBuffer0.append("&gaid=" + m0.i(this.s));
        }
        else {
            stringBuffer0.append("&app_set_id=" + m0.i(this.s));
            stringBuffer0.append("&app_set_id_scope=" + m0.c(this.s));
        }
        if(!TextUtils.isEmpty(this.t)) {
            stringBuffer0.append("&rsc_succ=" + this.t);
        }
        if(!TextUtils.isEmpty(this.u)) {
            stringBuffer0.append("&rsc_fail=" + this.u);
        }
        if(!TextUtils.isEmpty(this.v)) {
            stringBuffer0.append("&iserial=" + this.v);
        }
        stringBuffer0.append("&unique_app_id=com.dcinside.app.android");
        return stringBuffer0.toString();
    }
}

