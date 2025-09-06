package com.fsn.cauly.Y;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;

public class l extends u0 {
    public l(i0 i00, j0 j00, String s) {
        this.a(i00.p);
        l0 l00 = i00.r == null ? new l0() : i00.r;
        StringBuffer stringBuffer0 = new StringBuffer();
        if(l00.a) {
            stringBuffer0.append("https://click.cauly.co.kr/caulyClick?");
        }
        else {
            stringBuffer0.append("http://click.cauly.co.kr/caulyClick?");
        }
        stringBuffer0.append("code=" + i00.f);
        stringBuffer0.append("&id=" + j00.a);
        stringBuffer0.append("&scode=" + m0.i(i00.b));
        stringBuffer0.append("&origin_code=" + m0.h(i00.b));
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
        stringBuffer0.append("&pay_type=" + j00.k);
        stringBuffer0.append("&lang=" + m0.b());
        stringBuffer0.append("&version=" + m0.d());
        stringBuffer0.append("&manufacturer=" + m0.c());
        stringBuffer0.append("&model=" + m0.a());
        stringBuffer0.append("&iserial=" + j00.n);
        if(l00.n) {
            stringBuffer0.append("&unique_app_id=com.dcinside.app.android");
        }
        stringBuffer0.append("&sdk_type=3d-na");
        if(l00.j) {
            stringBuffer0.append("&network=" + m0.g(i00.b));
        }
        if(s != null) {
            stringBuffer0.append("&" + s);
        }
        if(i00.b instanceof Activity) {
            stringBuffer0.append("&page=" + m0.a(((Activity)i00.b)));
        }
        stringBuffer0.append("&reload=" + (i00.n ? l00.m : i00.o) + "");
        a i0$a0 = i00.a;
        if(i0$a0 == a.a) {
            stringBuffer0.append("&ad_form=banner");
        }
        else if(i0$a0 == a.b) {
            stringBuffer0.append("&ad_form=ext_interstitial");
        }
        else if(i0$a0 == a.c || i0$a0 == a.g) {
            stringBuffer0.append("&ad_form=nativead");
        }
        else if(i0$a0 == a.h) {
            stringBuffer0.append("&ad_form=video_ad");
        }
        else {
            stringBuffer0.append("&ad_form=closead");
        }
        if(j00.O > 0L) {
            stringBuffer0.append("&elapsed_time=" + (System.currentTimeMillis() - j00.O));
        }
        if(!TextUtils.isEmpty(j00.m0)) {
            stringBuffer0.append("&spread_type=" + j00.m0);
        }
        stringBuffer0.append("&emul=" + m0.m(i00.b));
        if(!TextUtils.isEmpty(i00.S)) {
            stringBuffer0.append("&touch_in=" + i00.S);
        }
        if(!TextUtils.isEmpty(i00.T)) {
            stringBuffer0.append("&touch_out=" + i00.T);
        }
        if(!TextUtils.isEmpty(i00.W)) {
            stringBuffer0.append(i00.W);
        }
        stringBuffer0.append("&imp_time=" + i00.X);
        stringBuffer0.append("&clk_time=" + System.currentTimeMillis());
        stringBuffer0.append("&ad_dim=" + i00.H);
        this.m = stringBuffer0.toString();
        Log.d("Cauly", "l: url=" + this.m.toString());
    }

    public static void a(i0 i00, j0 j00, String s, String s1) {
        if(j00 == null) {
            return;
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        if(s == null) {
            stringBuffer0.append("click_action=click");
        }
        else {
            stringBuffer0.append("click_action=" + s);
        }
        if(s1 != null) {
            stringBuffer0.append("&" + s1);
        }
        if(j00.a == null) {
            g.a(b.f, "Not a vaild click AdInfo");
            return;
        }
        new l(i00, j00, stringBuffer0.toString()).execute();
    }
}

