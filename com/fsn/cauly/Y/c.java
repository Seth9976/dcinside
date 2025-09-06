package com.fsn.cauly.Y;

import android.app.Activity;
import android.graphics.Point;
import android.text.TextUtils;
import com.fsn.cauly.blackdragoncore.utils.d;
import com.fsn.cauly.blackdragoncore.utils.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends u0 {
    int s;
    String t;
    String u;
    ArrayList v;
    String w;
    i0 x;
    Map y;

    public c(i0 i00, int v, int v1, boolean z, boolean z1, int v2, boolean z2) {
        this.a(i00.p);
        this.u = m0.d(i00.b);
        l0 l00 = i00.r == null ? new l0() : i00.r;
        int v3 = i00.L;
        int v4 = l00.A;
        if(v3 <= v4) {
            v3 = v4;
        }
        int v5 = 3;
        if(v3 < 3) {
            v3 = 3;
        }
        this.b(v3);
        this.x = i00;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("code=" + i00.f);
        if(l00.c) {
            stringBuilder0.append("&gender=" + i00.g.toString());
        }
        if(l00.d) {
            stringBuilder0.append("&age=" + i00.h.toString());
        }
        if(i00.i) {
            stringBuilder0.append("&coppa=y");
        }
        else {
            stringBuilder0.append("&coppa=n");
        }
        if(i00.k) {
            stringBuilder0.append("&gdpr_consent=y");
        }
        else {
            stringBuilder0.append("&gdpr_consent=n");
        }
        stringBuilder0.append("&scode=" + m0.i(i00.b));
        stringBuilder0.append("&origin_code=" + m0.h(i00.b));
        stringBuilder0.append("&scode_type=" + m0.j(i00.b));
        if(m0.n(i00.b)) {
            stringBuilder0.append("&gaid=" + m0.i(i00.b));
        }
        else {
            stringBuilder0.append("&app_set_id=" + m0.i(i00.b));
            stringBuilder0.append("&app_set_id_scope=" + m0.c(i00.b));
        }
        stringBuilder0.append("&version=" + m0.d());
        a i0$a0 = i00.a;
        if(i0$a0 == a.a) {
            stringBuilder0.append("&ad_form=banner");
        }
        else if(i0$a0 == a.b) {
            stringBuilder0.append("&ad_form=ext_interstitial");
        }
        else if(i0$a0 == a.c || i0$a0 == a.g) {
            stringBuilder0.append("&ad_form=nativead");
        }
        else if(i0$a0 == a.e) {
            stringBuilder0.append("&ad_form=banner");
        }
        else {
            stringBuilder0.append("&ad_form=closead");
        }
        stringBuilder0.append("&sdk_version=3.5.30");
        stringBuilder0.append("&platform=Android");
        if(l00.g) {
            stringBuilder0.append("&lang=" + m0.b());
        }
        if(l00.e) {
            stringBuilder0.append("&manufacturer=" + m0.c());
        }
        if(l00.f) {
            stringBuilder0.append("&model=" + m0.a());
        }
        if(l00.j) {
            stringBuilder0.append("&network=" + m0.g(i00.b));
        }
        stringBuilder0.append("&sdk_type=3d-na");
        if(z) {
            stringBuilder0.append("&visible=Y");
        }
        else {
            stringBuilder0.append("&visible=N");
        }
        String s = "&ad_size=" + v + "x" + v1;
        i00.W = s;
        stringBuilder0.append(s);
        Point point0 = d.b(i00.b);
        stringBuilder0.append("&screen_size=" + point0.x + "x" + point0.y);
        stringBuilder0.append("&pe_mode=none");
        if(!d.b(i00.b, -1)) {
            stringBuilder0.append("&option=no_config_orientation");
        }
        if(i00.b instanceof Activity) {
            stringBuilder0.append("&page=" + m0.a(((Activity)i00.b)));
        }
        stringBuilder0.append("&reload=" + (i00.n ? l00.m : i00.o) + "");
        stringBuilder0.append("&except=" + com.fsn.cauly.blackdragoncore.d.a().a(i00.b));
        stringBuilder0.append("&except_retry=" + v2);
        stringBuilder0.append("&content_type=json");
        if(i00.I > 0) {
            stringBuilder0.append("&ad_count=" + i00.I);
        }
        if(!TextUtils.isEmpty(i00.G)) {
            stringBuilder0.append("&ad_ratio=" + i00.G);
        }
        if(!TextUtils.isEmpty(i00.H)) {
            stringBuilder0.append("&ad_dim=" + i00.H);
        }
        if(z2) {
            stringBuilder0.append("&api_type=data");
        }
        HashMap hashMap0 = i00.C;
        if(hashMap0 != null) {
            int v6 = hashMap0.get("icon_image_id") == null ? 0 : 1;
            if(i00.C.get("main_image_id") == null) {
                v5 = v6;
            }
            else if(v6 == 0) {
                v5 = 2;
            }
            stringBuilder0.append("&components=" + v5);
        }
        int v7 = i00.t;
        int v8 = i00.u;
        if(v7 != 0 || v8 != 0) {
            if(l00.h) {
                stringBuilder0.append("&reuse_seq=" + v7);
            }
            if(l00.i) {
                stringBuilder0.append("&request_seq=" + v8);
            }
        }
        else {
            stringBuilder0.append("&reuse_seq=" + 0);
            stringBuilder0.append("&request_seq=" + 0);
        }
        i00.b();
        if(l00.n) {
            stringBuilder0.append("&unique_app_id=com.dcinside.app.android");
        }
        stringBuilder0.append("&allow=" + com.fsn.cauly.blackdragoncore.a.a().d(i00.b));
        stringBuilder0.append("&apt_serial=" + com.fsn.cauly.blackdragoncore.a.a().f(i00.b));
        String s1 = "N";
        String s2 = m0.l(i00.b) ? "Y" : "N";
        if(m0.a(i00.b)) {
            s1 = "Y";
        }
        stringBuilder0.append("&hw_on=" + s2);
        stringBuilder0.append("&ac_on=" + s1);
        if(!TextUtils.isEmpty(i00.N)) {
            stringBuilder0.append("&sdk_viewtype=" + i00.N);
        }
        if(i00.C.containsKey("banner_corner_round")) {
            stringBuilder0.append("&bg_shape=round_" + i00.C.get("banner_corner_round"));
        }
        if(i00.R > 0L) {
            stringBuilder0.append("&req_timestamp=" + i00.R);
        }
        if(l00.a) {
            this.b(true);
            this.m = "https://ad.cauly.co.kr/caulyImpress?" + stringBuilder0.toString();
            return;
        }
        this.b(false);
        this.m = "http://ad.cauly.co.kr/caulyImpress?" + stringBuilder0.toString();
    }

    public j0 a(JSONObject jSONObject0, String s) {
        try {
            j0 j00 = new j0();
            j00.b = this.a("code", jSONObject0, "" + s);
            j00.k = this.a("pay_type", jSONObject0, "");
            j00.l = this.a("ad_type", jSONObject0, "");
            j00.f = this.a("ad_shape", jSONObject0, "");
            j00.g = this.a("sub_ad_shape", jSONObject0, "");
            j00.h = this.a("shape_info", jSONObject0, "");
            j00.e = this.a("link", jSONObject0, "");
            j00.a = this.a("id", jSONObject0, "");
            j00.c = this.a("title", jSONObject0, "");
            j00.d = this.a("description", jSONObject0, "");
            j00.i = this.a("img", jSONObject0, "");
            j00.j = this.a("market", jSONObject0, "");
            j00.m = this.a("color", jSONObject0, "");
            j00.n = this.a("iserial", jSONObject0, "");
            j00.q = this.a("stict_level", jSONObject0, "1");
            j00.r = this.a("send_inform", jSONObject0, "Y");
            j00.s = this.a("cycle", jSONObject0, "4");
            j00.n = this.a("iserial", jSONObject0, "");
            int v = (int)Integer.valueOf(this.a("border_click_level", jSONObject0, "0"));
            j00.u = v;
            if(v < 0 || v > 5) {
                j00.u = 0;
            }
            j00.t = this.a("swipe_ratio", jSONObject0, "1");
            j00.v = this.a("landing_effect", jSONObject0, "");
            j00.w = this.a("fit_to_screen", jSONObject0, "Y");
            j00.y = this.a("loading_logo", jSONObject0, "");
            j00.z = this.a("bg_autofill", jSONObject0, "N");
            j00.A = this.a("orientation_control", jSONObject0, "current_fix");
            j00.B = (int)Integer.valueOf(this.a("ad_width", jSONObject0, "0"));
            j00.C = (int)Integer.valueOf(this.a("ad_height", jSONObject0, "0"));
            j00.F = this.a("check_scheme", jSONObject0, "");
            j00.K = this.a("subtitle", jSONObject0, "");
            j00.N = this.a("scycle", jSONObject0, "1");
            j00.Q = "Y".equalsIgnoreCase(this.a("reload_xconf", jSONObject0, ""));
            j00.R = (int)Integer.valueOf(this.a("crop_x", jSONObject0, "0"));
            j00.S = (int)Integer.valueOf(this.a("crop_y", jSONObject0, "0"));
            j00.T = "Y".equalsIgnoreCase(this.a("close_landing", jSONObject0, ""));
            String s1 = this.a("cond", jSONObject0, "");
            j00.U = s1;
            if(!TextUtils.isEmpty(s1)) {
                if(!"plain".equalsIgnoreCase(this.a("cond_type", jSONObject0, ""))) {
                    j00.U = o.a(this.a("cond", jSONObject0, ""), true);
                }
                j00.V = (int)Integer.valueOf(this.a("cond_act", jSONObject0, "0"));
            }
            j00.b0 = this.a("ptype", jSONObject0, "");
            j00.a0 = this.a("price", jSONObject0, "");
            j00.W = this.a("ad_charge_type", jSONObject0, "0");
            if(this.x.a == a.a) {
                j00.d0 = this.a("banner_r_img", jSONObject0, "");
                j00.c0 = this.a("banner_l_img", jSONObject0, "");
                j00.f0 = this.a("optout_url", jSONObject0, "");
                j00.g0 = this.a("optout_img_url", jSONObject0, "");
            }
            if(this.x.a == a.c) {
                j00.d0 = this.a("nativead_r_img", jSONObject0, "");
                j00.c0 = this.a("nativead_l_img", jSONObject0, "");
                j00.f0 = this.a("optout_url", jSONObject0, "");
                j00.g0 = this.a("optout_img_url", jSONObject0, "");
            }
            j00.k0 = "Y".equalsIgnoreCase(this.a("use_hw", jSONObject0, "N"));
            j00.l0 = "Y".equalsIgnoreCase(this.a("use_ac", jSONObject0, "N"));
            j00.m0 = this.a("spread_type", jSONObject0, "");
            j00.e0 = this.a("bg_color", jSONObject0, "");
            j00.n0 = this.a("opt", jSONObject0, "Y").equalsIgnoreCase("Y");
            j00.p0 = this.a("view_type", jSONObject0, "");
            j00.o0 = this.a("close_btn_control", jSONObject0, "Y").equalsIgnoreCase("Y");
            j00.t0 = Float.parseFloat(this.a("click_valid_sec", jSONObject0, "-1"));
            l0 l00 = this.x.r;
            if(l00 != null) {
                j00.v0 = l00.C;
                j00.u0 = l00.B;
            }
            j00.w0 = this.a("use_priority_browser", jSONObject0, "Y").equalsIgnoreCase("Y");
            j00.x0 = this.a("textscale_webview", jSONObject0, "N").equalsIgnoreCase("Y");
            j00.o = Integer.parseInt(this.a("retcode", jSONObject0, j00.W));
            return j00;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    // 去混淆评级： 低(20)
    public String a(String s, JSONObject jSONObject0, String s1) {
        return !jSONObject0.has(s) || TextUtils.isEmpty(jSONObject0.getString(s)) ? s1 : jSONObject0.getString(s);
    }

    @Override  // com.fsn.cauly.Y.r0
    public void a() {
        super.a();
        if(this.y != null && this.y.size() > 0) {
            com.fsn.cauly.blackdragoncore.a.a().a(this.x.b, this.y, null);
        }
    }

    public ArrayList c(String s) {
        ArrayList arrayList0 = new ArrayList();
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            this.s = Integer.parseInt(this.a("retcode", jSONObject0, "200"));
            this.w = this.a("custom_params", jSONObject0, "");
            this.t = this.a("retmsg", jSONObject0, "");
            String s1 = this.a("code", jSONObject0, "");
            this.y = com.fsn.cauly.blackdragoncore.a.a().a(this.x.b, jSONObject0);
            String s2 = this.a("spread_type", jSONObject0, "");
            if(jSONObject0.has("ads")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("ads");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    j0 j00 = this.a(((JSONObject)jSONArray0.get(v)), s1);
                    if(!TextUtils.isEmpty(s2)) {
                        j00.m0 = s2;
                    }
                    if(j00 != null && (j00.o == 0 || j00.o == 100)) {
                        arrayList0.add(j00);
                    }
                }
                return arrayList0;
            }
            j0 j01 = this.a(jSONObject0, s1);
            if(!TextUtils.isEmpty(s2)) {
                j01.m0 = s2;
            }
            if(j01 != null && (j01.o == 0 || j01.o == 100)) {
                arrayList0.add(j01);
                return arrayList0;
            }
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        return arrayList0;
    }

    @Override  // com.fsn.cauly.Y.u0
    protected void g() {
        try {
            this.v = this.c(this.f());
        }
        catch(Throwable throwable0) {
            this.c = -100;
            this.q = throwable0.toString();
        }
    }

    public String i() {
        return this.w;
    }

    public ArrayList j() {
        return this.v;
    }
}

