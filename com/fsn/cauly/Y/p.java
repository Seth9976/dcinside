package com.fsn.cauly.Y;

public class p extends u0 {
    public p(i0 i00, String s) {
        this.a(i00.p);
        l0 l00 = i00.r == null ? new l0() : i00.r;
        StringBuffer stringBuffer0 = new StringBuffer();
        if(l00.a) {
            stringBuffer0.append("https://tracker.cauly.co.kr/reporting?");
        }
        else {
            stringBuffer0.append("http://tracker.cauly.co.kr/reporting?");
        }
        stringBuffer0.append("code=" + i00.f);
        stringBuffer0.append("&scode=" + m0.i(i00.b));
        stringBuffer0.append("&scode_type=" + m0.j(i00.b));
        if(m0.n(i00.b)) {
            stringBuffer0.append("&gaid=" + m0.i(i00.b));
        }
        else {
            stringBuffer0.append("&app_set_id=" + m0.i(i00.b));
            stringBuffer0.append("&app_set_id_scope=" + m0.c(i00.b));
        }
        stringBuffer0.append("&platform=Android");
        stringBuffer0.append("&sdk_version=3.5.30");
        stringBuffer0.append("&version=" + m0.d());
        stringBuffer0.append("&model=" + m0.a());
        stringBuffer0.append("&unique_app_id=com.dcinside.app.android");
        if(s != null) {
            stringBuffer0.append("&" + s);
        }
        this.m = stringBuffer0.toString();
    }

    public static void a(i0 i00, String s, String s1, String s2, String s3, String s4) {
        StringBuffer stringBuffer0 = new StringBuffer();
        if(s != null) {
            stringBuffer0.append("event_name=" + s);
        }
        if(s1 != null) {
            stringBuffer0.append("&event_type=" + s1);
        }
        if(s2 != null) {
            stringBuffer0.append("&event_param1=" + s2);
        }
        if(s3 != null) {
            stringBuffer0.append("&event_param2=" + s3);
        }
        stringBuffer0.append("&event_param3=");
        stringBuffer0.append("&event_param4=");
        stringBuffer0.append("&event_etc=");
        stringBuffer0.append(s4);
        new p(i00, stringBuffer0.toString()).execute();
    }
}

