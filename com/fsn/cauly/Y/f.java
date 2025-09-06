package com.fsn.cauly.Y;

import android.app.Activity;
import android.graphics.Point;
import android.text.TextUtils;
import com.fsn.cauly.blackdragoncore.a;
import com.fsn.cauly.blackdragoncore.utils.d;
import com.fsn.cauly.blackdragoncore.utils.o;
import org.json.JSONException;
import org.json.JSONObject;

public class f extends u0 {
    int s;
    String t;
    String u;
    j0 v;
    i0 w;

    public f(i0 i00, int v, int v1, boolean z, boolean z1, int v2, boolean z2) {
        this.a(i00.p);
        this.w = i00;
        this.u = m0.d(i00.b);
        l0 l00 = i00.r == null ? new l0() : i00.r;
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
        stringBuilder0.append("&ad_form=video_ad");
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
        if(i00.C != null && i00.C.containsKey("keyword")) {
            stringBuilder0.append("&c_category=" + i00.C.get("keyword"));
        }
        if(i00.C != null && i00.C.containsKey("skip_count")) {
            stringBuilder0.append("&v_skip_count=" + i00.C.get("skip_count"));
        }
        if(i00.I > 0) {
            stringBuilder0.append("&ad_count=" + i00.I);
        }
        if(!TextUtils.isEmpty(i00.G)) {
            stringBuilder0.append("&ad_ratio=" + i00.G);
        }
        if(z2) {
            stringBuilder0.append("&api_type=data");
        }
        int v3 = i00.t;
        int v4 = i00.u;
        if(v3 != 0 || v4 != 0) {
            if(l00.h) {
                stringBuilder0.append("&reuse_seq=" + v3);
            }
            if(l00.i) {
                stringBuilder0.append("&request_seq=" + v4);
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
        stringBuilder0.append("&allow=" + a.a().d(i00.b));
        stringBuilder0.append("&apt_serial=" + a.a().f(i00.b));
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
            j00.U = this.a("cond", jSONObject0, "");
            if(jSONObject0.has("video_ad_param") && !TextUtils.isEmpty(jSONObject0.getString("video_ad_param"))) {
                j00.Z = new b(j00);
                JSONObject jSONObject1 = new JSONObject(jSONObject0.getString("video_ad_param"));
                b j0$b0 = j00.Z;
                j0$b0.e = this.a("skip_btn_img", jSONObject1, "");
                b j0$b1 = j00.Z;
                j0$b1.f = this.a("skip_btn_size", jSONObject1, "");
                b j0$b2 = j00.Z;
                j0$b2.g = this.a("skip_btn_location", jSONObject1, "");
                b j0$b3 = j00.Z;
                j0$b3.h = this.a("skip_btn_margin", jSONObject1, "");
                b j0$b4 = j00.Z;
                j0$b4.j = this.a("skip_count_size", jSONObject1, "");
                b j0$b5 = j00.Z;
                j0$b5.k = this.a("skip_count_location", jSONObject1, "");
                b j0$b6 = j00.Z;
                j0$b6.i = this.a("skip_count_margin", jSONObject1, "");
                b j0$b7 = j00.Z;
                j0$b7.s = this.a("land_fix_btn_img", jSONObject1, "");
                b j0$b8 = j00.Z;
                j0$b8.t = this.a("land_fix_btn_size", jSONObject1, "");
                b j0$b9 = j00.Z;
                j0$b9.u = this.a("land_fix_btn_location", jSONObject1, "");
                b j0$b10 = j00.Z;
                j0$b10.v = this.a("land_fix_btn_margin", jSONObject1, "");
                b j0$b11 = j00.Z;
                j0$b11.w = this.a("land_fix_btn_click_area", jSONObject1, "");
                b j0$b12 = j00.Z;
                j0$b12.x = this.a("land_fix_btn_link", jSONObject1, "");
                b j0$b13 = j00.Z;
                j0$b13.y = this.a("land_fix2_btn_img", jSONObject1, "");
                b j0$b14 = j00.Z;
                j0$b14.z = this.a("land_fix2_btn_size", jSONObject1, "");
                b j0$b15 = j00.Z;
                j0$b15.A = this.a("land_fix2_btn_location", jSONObject1, "");
                b j0$b16 = j00.Z;
                j0$b16.B = this.a("land_fix2_btn_margin", jSONObject1, "");
                b j0$b17 = j00.Z;
                j0$b17.C = this.a("land_fix2_btn_click_area", jSONObject1, "");
                b j0$b18 = j00.Z;
                j0$b18.D = this.a("land_fix2_btn_link", jSONObject1, "");
                b j0$b19 = j00.Z;
                j0$b19.E = this.a("land_fix3_btn_img", jSONObject1, "");
                b j0$b20 = j00.Z;
                j0$b20.F = this.a("land_fix3_btn_size", jSONObject1, "");
                b j0$b21 = j00.Z;
                j0$b21.G = this.a("land_fix3_btn_location", jSONObject1, "");
                b j0$b22 = j00.Z;
                j0$b22.H = this.a("land_fix3_btn_margin", jSONObject1, "");
                b j0$b23 = j00.Z;
                j0$b23.I = this.a("land_fix3_btn_click_area", jSONObject1, "");
                b j0$b24 = j00.Z;
                j0$b24.J = this.a("land_fix3_btn_link", jSONObject1, "");
                b j0$b25 = j00.Z;
                j0$b25.K = this.a("land_br_btn_img", jSONObject1, "");
                b j0$b26 = j00.Z;
                j0$b26.L = this.a("land_br_btn_size", jSONObject1, "");
                b j0$b27 = j00.Z;
                j0$b27.M = this.a("land_br_btn_location", jSONObject1, "");
                b j0$b28 = j00.Z;
                j0$b28.N = this.a("land_br_btn_margin", jSONObject1, "");
                b j0$b29 = j00.Z;
                j0$b29.O = this.a("land_br_btn_click_area", jSONObject1, "");
                b j0$b30 = j00.Z;
                j0$b30.P = this.a("land_br_btn_link", jSONObject1, "");
                b j0$b31 = j00.Z;
                j0$b31.Q = this.a("land_br2_btn_img", jSONObject1, "");
                b j0$b32 = j00.Z;
                j0$b32.R = this.a("land_br2_btn_size", jSONObject1, "");
                b j0$b33 = j00.Z;
                j0$b33.S = this.a("land_br2_btn_location", jSONObject1, "");
                b j0$b34 = j00.Z;
                j0$b34.T = this.a("land_br2_btn_margin", jSONObject1, "");
                b j0$b35 = j00.Z;
                j0$b35.U = this.a("land_br2_btn_click_area", jSONObject1, "");
                b j0$b36 = j00.Z;
                j0$b36.V = this.a("land_br2_btn_link", jSONObject1, "");
                b j0$b37 = j00.Z;
                j0$b37.d = !"device".equalsIgnoreCase(this.a("skip_count", jSONObject1, "device"));
                b j0$b38 = j00.Z;
                j0$b38.a = (int)Integer.valueOf(this.a("skip_count", jSONObject1, "5"));
                b j0$b39 = j00.Z;
                j0$b39.b = (int)Integer.valueOf(this.a("duration", jSONObject1, "0"));
                b j0$b40 = j00.Z;
                j0$b40.c = (int)Integer.valueOf(this.a("charge_duration", jSONObject1, "15"));
                b j0$b41 = j00.Z;
                j0$b41.m = (int)Integer.valueOf(this.a("skip_count_text_font_size", jSONObject1, "13"));
                b j0$b42 = j00.Z;
                j0$b42.r = (int)Integer.valueOf(this.a("gradation_height", jSONObject1, "0"));
                b j0$b43 = j00.Z;
                j0$b43.n = (int)Integer.valueOf(this.a("skip_count_type", jSONObject1, "0"));
                b j0$b44 = j00.Z;
                j0$b44.l = this.a("skip_count_text", jSONObject1, "");
                b j0$b45 = j00.Z;
                j0$b45.o = this.a("skip_count_text_bg_color", jSONObject1, "");
                b j0$b46 = j00.Z;
                j0$b46.p = this.a("skip_count_text_blink_color1", jSONObject1, "");
                b j0$b47 = j00.Z;
                j0$b47.q = this.a("skip_count_text_blink_color2", jSONObject1, "");
                b j0$b48 = j00.Z;
                j0$b48.W = this.a("land_shared1_btn_img", jSONObject1, "");
                b j0$b49 = j00.Z;
                j0$b49.X = this.a("land_shared1_btn_link", jSONObject1, "");
                b j0$b50 = j00.Z;
                j0$b50.Y = this.a("land_shared2_btn_img", jSONObject1, "");
                b j0$b51 = j00.Z;
                j0$b51.Z = this.a("land_shared2_btn_link", jSONObject1, "");
                b j0$b52 = j00.Z;
                j0$b52.a0 = this.a("land_shared3_btn_img", jSONObject1, "");
                b j0$b53 = j00.Z;
                j0$b53.b0 = this.a("land_shared3_btn_link", jSONObject1, "");
                b j0$b54 = j00.Z;
                j0$b54.c0 = this.a("land_shared4_btn_img", jSONObject1, "");
                b j0$b55 = j00.Z;
                j0$b55.d0 = this.a("land_shared4_btn_link", jSONObject1, "");
                b j0$b56 = j00.Z;
                j0$b56.e0 = this.a("land_shared5_btn_img", jSONObject1, "");
                b j0$b57 = j00.Z;
                j0$b57.f0 = this.a("land_shared5_btn_link", jSONObject1, "");
                b j0$b58 = j00.Z;
                j0$b58.h0 = this.a("land_shared_btn_close_img", jSONObject1, "");
                b j0$b59 = j00.Z;
                j0$b59.g0 = this.a("land_shared_btn_open_img", jSONObject1, "");
                b j0$b60 = j00.Z;
                j0$b60.i0 = this.a("land_shared_btn_location", jSONObject1, "");
                b j0$b61 = j00.Z;
                j0$b61.j0 = this.a("land_shared_btn_margin", jSONObject1, "");
                b j0$b62 = j00.Z;
                j0$b62.k0 = this.a("land_shared_btn_size", jSONObject1, "");
                b j0$b63 = j00.Z;
                j0$b63.l0 = this.a("land_shared_btn_space", jSONObject1, "");
            }
            if(!TextUtils.isEmpty(j00.U)) {
                if("plain".equalsIgnoreCase(this.a("cond_type", jSONObject0, ""))) {
                    j00.U = this.a("cond_type", jSONObject0, "");
                }
                else {
                    o.a(this.a("cond_type", jSONObject0, ""), true);
                }
                j00.V = (int)Integer.valueOf(this.a("cond_act", jSONObject0, "0"));
            }
            String s1 = this.a("ad_charge_type", jSONObject0, "0");
            j00.W = s1;
            j00.o = Integer.parseInt(this.a("retcode", jSONObject0, s1));
            j00.Y = a.a().a(this.w.b, jSONObject0);
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
        if(this.v != null && (this.v.Y != null && this.v.Y.size() > 0)) {
            a.a().a(this.w.b, this.v.Y, null);
        }
    }

    public j0 c(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            this.s = Integer.parseInt(this.a("retcode", jSONObject0, "200"));
            this.t = this.a("retmsg", jSONObject0, "");
            String s1 = this.a("code", jSONObject0, "");
            a.a().a(this.w.b, jSONObject0);
            j0 j00 = this.a(jSONObject0, s1);
            j00.o = this.s;
            return j00;
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
            return null;
        }
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

    public j0 i() {
        return this.v;
    }
}

