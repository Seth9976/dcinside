package com.fsn.cauly.Y;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.fsn.cauly.Logger.LogLevel;
import com.fsn.cauly.Logger;
import com.fsn.cauly.blackdragoncore.utils.d;
import com.fsn.cauly.blackdragoncore.utils.e;
import com.fsn.cauly.blackdragoncore.utils.l;
import com.fsn.cauly.blackdragoncore.utils.o;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class b extends u0 {
    String s;
    j0 t;
    i0 u;

    public b(i0 i00, int v, int v1, boolean z, boolean z1, int v2) {
        this.a(i00.p);
        this.u = i00;
        this.s = m0.d(i00.b);
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
            stringBuilder0.append("&sdk_banner_type=" + i00.q.name().toLowerCase());
        }
        else if(i0$a0 == a.b) {
            stringBuilder0.append("&ad_form=ext_interstitial");
        }
        else if(i0$a0 == a.c || i0$a0 == a.g) {
            stringBuilder0.append("&ad_form=nativead");
            if(i00.C.containsKey("main_image_id")) {
                Integer integer0 = (Integer)i00.C.get("layout_id");
                i00.N = View.inflate(i00.b, ((int)integer0), null).findViewById(((int)(((Integer)i00.C.get("main_image_id"))))) instanceof WebView ? "all" : "img";
            }
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
        if(!TextUtils.isEmpty(i00.H)) {
            stringBuilder0.append("&ad_dim=" + i00.H);
        }
        Point point0 = d.b(i00.b);
        stringBuilder0.append("&screen_size=" + point0.x + "x" + point0.y);
        if(!i00.w || z1) {
            stringBuilder0.append("&pe_mode=none");
        }
        else {
            stringBuilder0.append("&pe_mode=" + this.i(i00));
        }
        if(!d.b(i00.b, -1)) {
            stringBuilder0.append("&option=no_config_orientation");
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
        if(i00.b instanceof Activity) {
            stringBuilder0.append("&page=" + m0.a(((Activity)i00.b)));
        }
        stringBuilder0.append("&reload=" + (i00.n ? l00.m : i00.o) + "");
        stringBuilder0.append("&except=" + com.fsn.cauly.blackdragoncore.d.a().a(i00.b));
        stringBuilder0.append("&except_retry=" + v2);
        if(!TextUtils.isEmpty(i00.G)) {
            stringBuilder0.append("&ad_ratio=" + i00.G);
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
        stringBuilder0.append("&emul=" + m0.m(i00.b));
        if(!TextUtils.isEmpty(i00.N)) {
            stringBuilder0.append("&sdk_viewtype=" + i00.N);
        }
        if(!TextUtils.isEmpty(i00.O)) {
            stringBuilder0.append("&custom_instl=" + i00.O);
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

    @RequiresApi(api = 19)
    public static j0 a(Context context0, String s) {
        Document document1;
        ByteArrayInputStream byteArrayInputStream0;
        j0 j00 = new j0();
        try {
            byteArrayInputStream0 = new ByteArrayInputStream(s.getBytes("UTF-8"));
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            unsupportedEncodingException0.printStackTrace();
            byteArrayInputStream0 = null;
        }
        Document document0 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(byteArrayInputStream0);
        Element element0 = document0.getDocumentElement();
        j00.k = l.a(element0, "pay_type");
        j00.l = l.a(element0, "ad_type");
        j00.f = l.a(element0, "ad_shape");
        j00.g = l.a(element0, "sub_ad_shape");
        String s1 = l.a(element0, "shape_info");
        j00.h = s1;
        try {
            if(!TextUtils.isEmpty(s1) && URLDecoder.decode(j00.h, "UTF-8").contains("cauly_x_button=1")) {
                j00.H = true;
            }
        }
        catch(Exception exception0) {
            j00.H = false;
            Logger.writeLog(LogLevel.Error, exception0.getMessage());
        }
        j00.e = l.a(element0, "link");
        j00.b = l.a(element0, "code");
        j00.a = l.a(element0, "id");
        j00.c = l.a(element0, "title");
        j00.d = l.a(element0, "description");
        j00.i = l.a(element0, "img");
        j00.j = l.a(element0, "market");
        j00.m = l.a(element0, "color");
        j00.n = l.a(element0, "iserial");
        String s2 = l.a(element0, "retcode");
        if(s2 != null && s2.length() != 0) {
            j00.o = (int)Integer.valueOf(s2);
        }
        j00.p = l.a(element0, "retmsg");
        String s3 = l.a(element0, "stict_level");
        j00.q = s3;
        if(s3 == null || s3.length() == 0) {
            j00.q = "1";
        }
        String s4 = l.a(element0, "send_inform");
        j00.r = s4;
        if(s4 == null || s4.length() == 0) {
            j00.r = "Y";
        }
        String s5 = l.a(element0, "cycle");
        j00.s = s5;
        if(s5 == null || s5.length() == 0) {
            j00.s = "4";
        }
        String s6 = l.a(element0, "border_click_level");
        j00.u = s6 == null || s6.length() <= 0 ? 0 : ((int)Integer.valueOf(s6));
        if(j00.u < 0 || j00.u > 5) {
            j00.u = 0;
        }
        String s7 = l.a(element0, "swipe_ratio");
        j00.t = s7;
        if(s7 == null || s7.length() == 0) {
            j00.t = "1";
        }
        String s8 = l.a(element0, "swipe_w_ratio");
        j00.r0 = s8;
        if(s8 == null || s8.length() == 0) {
            j00.r0 = "-1";
        }
        j00.v = l.a(element0, "landing_effect");
        String s9 = l.a(element0, "fit_to_screen");
        j00.w = s9;
        if(s9 == null || s9.length() == 0) {
            j00.w = "Y";
        }
        j00.x = l.a(element0, "url_scheme");
        j00.y = l.a(element0, "loading_logo");
        String s10 = l.a(element0, "bg_autofill");
        j00.z = s10;
        if(s10 == null) {
            j00.z = "N";
        }
        String s11 = l.a(element0, "orientation_control");
        j00.A = s11;
        if(s11 == null) {
            j00.A = "current_fix";
        }
        String s12 = l.a(element0, "ad_width");
        if(s12 == null || s12.length() <= 0) {
            j00.B = 640;
        }
        else {
            int v = (int)Integer.valueOf(s12);
            j00.B = v;
            if(v <= 0) {
                j00.B = 640;
            }
        }
        String s13 = l.a(element0, "ad_height");
        if(s13 == null || s13.length() <= 0) {
            j00.C = 0x60;
        }
        else {
            int v1 = (int)Integer.valueOf(s13);
            j00.C = v1;
            if(v1 <= 0) {
                j00.C = 0x60;
            }
        }
        NodeList nodeList0 = element0.getElementsByTagName("params");
        if(nodeList0.getLength() == 0) {
            document1 = document0;
        }
        else {
            Element element1 = (Element)nodeList0.item(0);
            c j0$c0 = new c(j00);
            j00.I = j0$c0;
            j0$c0.a = l.a(element1, "background");
            NodeList nodeList1 = element1.getElementsByTagName("button");
            int v2 = nodeList1.getLength();
            if(v2 > 0) {
                document1 = document0;
                j00.I.b = new com.fsn.cauly.Y.j0.a[v2];
                for(int v3 = 0; v3 < v2; ++v3) {
                    Element element2 = (Element)nodeList1.item(v3);
                    com.fsn.cauly.Y.j0.a j0$a0 = new com.fsn.cauly.Y.j0.a(j00);
                    j0$a0.a = Integer.parseInt(element2.getAttribute("order"));
                    j0$a0.c = element2.getAttribute("icon");
                    j0$a0.d = element2.getAttribute("target");
                    j0$a0.b = element2.getAttribute("text");
                    j00.I.b[v3] = j0$a0;
                }
            }
            else {
                document1 = document0;
            }
        }
        String s14 = l.a(element0, "silent_start");
        if(s14 != null && s14.equalsIgnoreCase("Y")) {
            j00.E = true;
        }
        String s15 = l.a(element0, "expand_direction");
        if(s15 != null) {
            if(s15.equalsIgnoreCase("downward")) {
                j00.D = "top";
            }
            else if(s15.equalsIgnoreCase("upward")) {
                j00.D = "bottom";
            }
            else {
                j00.D = "all";
            }
        }
        if(l.a(element0, "check_scheme") != null) {
            j00.F = l.a(element0, "check_scheme");
        }
        if(l.a(element0, "subtitle") != null) {
            j00.K = l.a(element0, "subtitle");
        }
        if(l.a(element0, "scycle") != null) {
            j00.N = l.a(element0, "scycle");
        }
        if(l.a(element0, "silence_loading") != null) {
            j00.P = l.a(element0, "silence_loading").equalsIgnoreCase("Y");
        }
        if(l.a(element0, "reload_xconf") != null) {
            j00.Q = l.a(element0, "reload_xconf").equalsIgnoreCase("Y");
        }
        if(l.a(element0, "crop_x") != null && !TextUtils.isEmpty(l.a(element0, "crop_x"))) {
            j00.R = (int)Integer.valueOf(l.a(element0, "crop_x"));
        }
        if(l.a(element0, "crop_y") != null && !TextUtils.isEmpty(l.a(element0, "crop_y"))) {
            j00.S = (int)Integer.valueOf(l.a(element0, "crop_y"));
        }
        j00.T = "Y".equalsIgnoreCase(l.a(element0, "close_landing"));
        if(l.a(element0, "selconds") != null && !TextUtils.isEmpty(l.a(element0, "selconds"))) {
            j00.X = l.a(element0, "selconds");
        }
        if(l.a(element0, "cond") != null && !TextUtils.isEmpty(l.a(element0, "cond"))) {
            j00.U = "plain".equalsIgnoreCase(l.a(element0, "cond", "type")) ? l.a(element0, "cond") : o.a(l.a(element0, "cond"), true);
            String s16 = l.a(element0, "cond", "act");
            if(!TextUtils.isEmpty(s16)) {
                j00.V = Integer.parseInt(s16);
            }
        }
        j00.Y = com.fsn.cauly.blackdragoncore.a.a().a(context0, document1);
        if(l.a(element0, "price") != null && !TextUtils.isEmpty(l.a(element0, "price"))) {
            j00.a0 = l.a(element0, "price");
        }
        if(l.a(element0, "ptype") != null && !TextUtils.isEmpty(l.a(element0, "ptype"))) {
            j00.b0 = l.a(element0, "ptype");
        }
        if(l.a(element0, "use_hw") != null) {
            j00.k0 = l.a(element0, "use_hw").equalsIgnoreCase("Y");
        }
        if(l.a(element0, "use_ac") != null) {
            j00.l0 = l.a(element0, "use_ac").equalsIgnoreCase("Y");
        }
        if(l.a(element0, "opt") != null) {
            j00.n0 = l.a(element0, "opt").equalsIgnoreCase("Y");
        }
        if(l.a(element0, "view_type") != null) {
            j00.p0 = l.a(element0, "view_type");
        }
        if(l.a(element0, "close_btn_control") != null) {
            j00.o0 = l.a(element0, "close_btn_control").equalsIgnoreCase("Y");
        }
        if(l.a(element0, "use_on_click_event") != null) {
            j00.q0 = l.a(element0, "use_on_click_event").equalsIgnoreCase("Y");
        }
        if(l.a(element0, "execute_scheme") != null) {
            j00.s0 = l.a(element0, "execute_scheme").equalsIgnoreCase("Y");
        }
        if(l.a(element0, "click_valid_sec") != null && !TextUtils.isEmpty(l.a(element0, "click_valid_sec"))) {
            j00.t0 = (float)Float.valueOf(l.a(element0, "click_valid_sec"));
        }
        if(l.a(element0, "use_priority_browser") != null) {
            j00.w0 = l.a(element0, "use_priority_browser").equalsIgnoreCase("Y");
        }
        if(l.a(element0, "textscale_webview") != null) {
            j00.x0 = l.a(element0, "textscale_webview").equalsIgnoreCase("Y");
        }
        if(!TextUtils.isEmpty(l.a(element0, "webview_back_close"))) {
            j00.G = l.a(element0, "webview_back_close").equalsIgnoreCase("Y");
        }
        return j00;
    }

    @Override  // com.fsn.cauly.Y.r0
    public void a() {
        super.a();
        if(this.t != null && (this.t.Y != null && this.t.Y.size() > 0)) {
            com.fsn.cauly.blackdragoncore.a.a().a(this.u.b, this.t.Y, null);
        }
    }

    @Override  // com.fsn.cauly.Y.u0
    @RequiresApi(api = 19)
    protected void g() {
        try {
            this.t = b.a(this.u.b, this.f());
        }
        catch(Throwable throwable0) {
            this.c = -100;
            this.q = throwable0.toString();
        }
        j0 j00 = this.t;
        if(j00 != null) {
            l0 l00 = this.u.r;
            if(l00 != null) {
                j00.v0 = l00.C;
                j00.u0 = l00.B;
            }
            if(j00.y != null && j00.y.length() > 0) {
                this.m();
            }
        }
    }

    String i(i0 i00) {
        if(i00 != null && i00.a() != null && i00.a() instanceof View) {
            View view0 = (View)i00.a();
            if(view0 != null && view0.getWidth() > 0 && view0.getWindowToken() != null) {
                try {
                    int[] arr_v = new int[2];
                    view0.getLocationOnScreen(arr_v);
                    return d.a(i00.b) / 2 > arr_v[1] + view0.getHeight() / 2 ? "top" : "bottom";
                }
                catch(Exception unused_ex) {
                }
            }
        }
        return "all";
    }

    public j0 j() {
        return this.t;
    }

    void m() {
        String s = m0.a(this.t.y, this.s);
        if(e.b(s)) {
            return;
        }
        u0.a(this.t.y, s, false);
    }
}

