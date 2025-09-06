package com.bytedance.sdk.openadsdk.core;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.AdSlot.Builder;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.Lrd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.SM;
import com.bytedance.sdk.openadsdk.core.model.Sks;
import com.bytedance.sdk.openadsdk.core.model.Yo;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.cr;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.ltE;
import com.bytedance.sdk.openadsdk.core.model.qj;
import com.bytedance.sdk.openadsdk.core.model.qla;
import com.bytedance.sdk.openadsdk.core.model.tT;
import com.bytedance.sdk.openadsdk.core.model.ub;
import com.bytedance.sdk.openadsdk.core.model.xE;
import com.bytedance.sdk.openadsdk.core.model.xf;
import com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.JQp;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v.c;

public class Zh {
    static class PjT {
        public String PjT;
        public int Zh;

        public PjT(String s, int v) {
            this.PjT = s;
            this.Zh = v;
        }
    }

    private static ub Au(JSONObject jSONObject0) {
        ub ub0 = new ub();
        if(jSONObject0 == null) {
            ub0.cr(5);
            ub0.JQp(30);
            ub0.cz(70);
            ub0.XX(1);
            ub0.Au(ub.PjT);
            ub0.ReZ(0);
            ub0.Zh(0);
            ub0.PjT(3);
            return ub0;
        }
        ub0.cr(jSONObject0.optInt("ceiling_time", 5));
        ub0.JQp(jSONObject0.optInt("ceiling_ratio", 30));
        ub0.cz(jSONObject0.optInt("expand_ratio", 70));
        ub0.XX(jSONObject0.optInt("back_type", 1));
        ub0.Au(jSONObject0.optInt("boc_return_type", ub.PjT));
        ub0.ReZ(jSONObject0.optInt("pre_render_status", 0));
        ub0.Zh(jSONObject0.optInt("pre_render_use_gecko", 0));
        ub0.PjT(jSONObject0.optInt("pre_render_add_type", 3));
        return ub0;
    }

    @Nullable
    private static xf DWo(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        xf xf0 = new xf();
        xf0.PjT(jSONObject0.optInt("if_send_click", 0));
        return xf0;
    }

    private static FilterWord JQp(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        try {
            FilterWord filterWord0 = new FilterWord();
            filterWord0.setId(jSONObject0.optString("id"));
            filterWord0.setName(jSONObject0.optString("name"));
            filterWord0.setIsSelected(jSONObject0.optBoolean("is_selected"));
            JSONArray jSONArray0 = jSONObject0.optJSONArray("options");
            if(jSONArray0 != null && jSONArray0.length() > 0) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    FilterWord filterWord1 = Zh.JQp(jSONArray0.optJSONObject(v));
                    if(filterWord1 != null && filterWord1.isValid()) {
                        filterWord0.addOption(filterWord1);
                    }
                }
            }
            return filterWord0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static int PjT(Owx owx0) {
        if(owx0 == null) {
            ReZ.ReZ(null, "", 401);
            return 401;
        }
        String s = wN.ReZ(owx0.kW());
        if(!TextUtils.isEmpty(owx0.dIF()) && owx0.dIF().length() > 1) {
            if(owx0.pBJ()) {
                if(owx0.kW() < 0) {
                    if(owx0.ig() == null) {
                        owx0.XWz();
                    }
                    else {
                        owx0.ig().getDurationSlotType();
                    }
                }
                if(owx0.es()) {
                    s = "fullscreen_interstitial_ad";
                }
                if(TextUtils.isEmpty(owx0.sjb())) {
                    ReZ.Zh(owx0, s, "load_html_fail", null);
                    return 401;
                }
                ReZ.Zh(owx0, s, "load_html_success", null);
            }
            if(owx0.cyr() == 0) {
                switch(owx0.fK()) {
                    case 2: 
                    case 3: 
                    case 4: 
                    case 16: {
                        int v1 = Zh.PjT(owx0.CY());
                        if(v1 != 200) {
                            ReZ.ReZ(owx0, s, v1);
                            return v1;
                        }
                        break;
                    }
                    case 5: 
                    case 15: 
                    case 50: {
                        int v = Zh.PjT(owx0.MWx(), owx0.uvo());
                        if(v != 200) {
                            ReZ.ReZ(owx0, s, v);
                            return v;
                        }
                        break;
                    }
                    default: {
                        return xs.Gr().Vs() ? Zh.ReZ(owx0) : Zh.Zh(owx0);
                    }
                }
            }
            return xs.Gr().Vs() ? Zh.ReZ(owx0) : Zh.Zh(owx0);
        }
        ReZ.ReZ(owx0, s, 402);
        return 402;
    }

    // 去混淆评级： 中等(90)
    private static int PjT(cr cr0) {
        return cr0 == null ? 407 : 408;
    }

    private static int PjT(qj qj0) {
        if(qj0 == null) {
            return 200;
        }
        if(TextUtils.isEmpty(qj0.PjT())) {
            return 403;
        }
        if(TextUtils.isEmpty(qj0.Zh())) {
            return 404;
        }
        return qj0.ReZ() == 1 || qj0.ReZ() == 2 ? 200 : 405;
    }

    private static int PjT(List list0) {
        if(list0 == null) {
            return 409;
        }
        if(list0.size() <= 0) {
            return 410;
        }
        for(Object object0: list0) {
            if(((xE)object0) == null) {
                return 411;
            }
            if(TextUtils.isEmpty(((xE)object0).PjT())) {
                return 412;
            }
            if(false) {
                break;
            }
        }
        return 200;
    }

    private static int PjT(c c0, boolean z) {
        if(c0 == null) {
            return 413;
        }
        if(TextUtils.isEmpty(c0.I())) {
            return 414;
        }
        return z || !TextUtils.isEmpty(c0.c()) ? 200 : 0x19F;
    }

    private static Pair PjT(String s, int v, int v1) {
        int v3;
        int v2;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(v1 == 1 || v1 == 5) {
            v2 = 0;
            v3 = 0;
        }
        else {
            v2 = qZS.ReZ(com.bytedance.sdk.openadsdk.core.ub.PjT());
            v3 = qZS.JQp(com.bytedance.sdk.openadsdk.core.ub.PjT());
            if(v == 2) {
                int v4 = v3;
                v3 = v2;
                v2 = v4;
            }
        }
        JQp jQp0 = new JQp(com.bytedance.sdk.openadsdk.core.ub.PjT(), v2, v3);
        return new Pair(jQp0.PjT(s, new ArrayList()), jQp0.cz);
    }

    @Nullable
    public static Pair PjT(JSONObject jSONObject0, AdSlot adSlot0, tT tT0, com.bytedance.sdk.openadsdk.core.model.ReZ reZ0) {
        if(jSONObject0 == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.model.PjT();
            pjT0.PjT(jSONObject0.optString("request_id"));
            pjT0.PjT(jSONObject0.optInt("ret"));
            int v = 0;
            pjT0.Zh(jSONObject0.optInt("multi_ad_style", 0));
            pjT0.Zh(jSONObject0.optString("message"));
            String s = jSONObject0.optString("gdid_encrypted");
            if(jSONObject0.has("choose_ui_data")) {
                pjT0.Zh(jSONObject0.optJSONObject("choose_ui_data"));
                pjT0.PjT(true);
            }
            String s1 = jSONObject0.optString("auction_price");
            if(pjT0.ReZ() != 0) {
                return null;
            }
            JSONArray jSONArray0 = jSONObject0.optJSONArray("creatives");
            ArrayList arrayList0 = new ArrayList();
            if(jSONArray0 != null) {
                int v1 = jSONArray0.length();
                ArrayList arrayList1 = pjT0.xf() ? new ArrayList() : null;
                for(int v2 = 0; v2 < jSONArray0.length(); ++v2) {
                    Owx owx0 = Zh.PjT(jSONArray0.optJSONObject(v2), adSlot0, tT0);
                    if(owx0 != null && pjT0.xf()) {
                        switch(owx0.RD()) {
                            case 30: 
                            case 39: {
                                owx0.SM(true);
                                break;
                            }
                            default: {
                                pjT0.Zh(0);
                                arrayList1 = null;
                            }
                        }
                    }
                    int v3 = Zh.PjT(owx0);
                    if(v3 == 200) {
                        owx0.SM(s1);
                        if(!TextUtils.isEmpty(s)) {
                            owx0.yIW(s);
                        }
                        pjT0.PjT(owx0);
                    }
                    else {
                        if(owx0 == null) {
                            ReZ.Zh(null, "", v3);
                        }
                        else {
                            ReZ.Zh(owx0, wN.ReZ(owx0.kW()), v3);
                        }
                        arrayList0.add(v3);
                        if(arrayList1 != null && owx0 != null) {
                            arrayList1.add(new PjT(owx0.Ey(), v3));
                        }
                        if(owx0 != null && owx0.RD() == 39) {
                            pjT0.Zh(0);
                        }
                    }
                }
                if(arrayList1 != null && !arrayList1.isEmpty()) {
                    Zh.PjT(arrayList1);
                }
                v = v1;
            }
            Zh.PjT(v, pjT0, arrayList0, reZ0);
            return new Pair(pjT0, arrayList0);
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("TTAD.AdInfoFactory", throwable0.getMessage());
        return null;
    }

    @Nullable
    public static Owx PjT(JSONObject jSONObject0) {
        return jSONObject0 == null ? null : Zh.PjT(jSONObject0, null, null);
    }

    @Nullable
    private static Owx PjT(JSONObject jSONObject0, AdSlot adSlot0, tT tT0) {
        com.bytedance.sdk.openadsdk.core.qj.PjT.Zh.PjT zh$PjT0;
        com.bytedance.sdk.openadsdk.core.qj.PjT pjT0;
        c c1;
        c c0;
        if(jSONObject0 == null) {
            return null;
        }
        Owx owx0 = Owx.cz();
        Zh.PjT(jSONObject0, owx0);
        JSONObject jSONObject1 = jSONObject0.optJSONObject("multi_ad_scene");
        if(jSONObject1 != null) {
            owx0.PjT(Sks.PjT(jSONObject1));
        }
        owx0.Au(jSONObject0.optInt("proportion_watching", -1));
        owx0.qj(jSONObject0.optBoolean("mate_disable_cache", false));
        owx0.tT(jSONObject0.optInt("interaction_type"));
        owx0.Sks(jSONObject0.optInt("is_arbitrage_sample", 0));
        owx0.Lrd(jSONObject0.optInt("is_arbitrage", 0));
        owx0.cRA(jSONObject0.optInt("arbitrage_strategy", 0));
        owx0.xs(jSONObject0.optString("target_url"));
        owx0.gK(jSONObject0.optString("ad_id"));
        owx0.ltE(jSONObject0.optString("app_log_url"));
        owx0.qj(jSONObject0.optString("source"));
        owx0.xf(jSONObject0.optString("app_name"));
        owx0.KM(jSONObject0.optInt("dislike_control", 0));
        owx0.ub(jSONObject0.optInt("play_bar_show_time", -200));
        owx0.RD(jSONObject0.optString("gecko_id"));
        if(jSONObject0.has("set_click_type")) {
            JSONObject jSONObject2 = jSONObject0.optJSONObject("set_click_type");
            owx0.Zh(jSONObject2.optDouble("cta", 2.0));
            owx0.PjT(jSONObject2.optDouble("other", 1.0));
        }
        JSONObject jSONObject3 = jSONObject0.optJSONObject("extension");
        owx0.JQp(jSONObject3);
        if(jSONObject3 != null) {
            owx0.PjT(new qla(jSONObject3));
        }
        JSONObject jSONObject4 = jSONObject0.optJSONObject("icon");
        owx0.cr(jSONObject0.optBoolean("screenshot", false));
        owx0.qla(jSONObject0.optInt("play_bar_style", 0));
        owx0.Sks(jSONObject0.optString("market_url", ""));
        owx0.xs(jSONObject0.optInt("video_adaptation", 0));
        owx0.DWo(jSONObject0.optInt("feed_video_opentype", 0));
        owx0.ReZ(jSONObject0.optJSONObject("session_params"));
        owx0.SM(jSONObject0.optString("auction_price", ""));
        owx0.wN(jSONObject0.optInt("mrc_report", 0));
        if(jSONObject0.optBoolean("isMrcReportFinish", false)) {
            owx0.NR();
        }
        JSONObject jSONObject5 = jSONObject0.optJSONObject("render");
        if(jSONObject5 != null) {
            owx0.qj(jSONObject5.optInt("render_sequence", 0));
            owx0.xf(jSONObject5.optInt("backup_render_control", 1));
            owx0.qZS(jSONObject5.optInt("reserve_time", 100));
            owx0.Zd(jSONObject5.optInt("render_thread", 0));
        }
        owx0.XX(jSONObject0.optInt("render_control", (tT0 == null ? 1 : tT0.Au)));
        if(jSONObject4 != null) {
            xE xE0 = new xE();
            xE0.PjT(jSONObject4.optString("url"));
            xE0.Zh(jSONObject4.optInt("height"));
            xE0.PjT(jSONObject4.optInt("width"));
            owx0.PjT(xE0);
        }
        JSONObject jSONObject6 = jSONObject0.optJSONObject("reward_data");
        if(jSONObject6 != null) {
            owx0.cz(jSONObject6.optInt("reward_amount", 0));
            owx0.XX(jSONObject6.optString("reward_name", ""));
        }
        JSONObject jSONObject7 = jSONObject0.optJSONObject("cover_image");
        if(jSONObject7 != null) {
            xE xE1 = new xE();
            xE1.PjT(jSONObject7.optString("url"));
            xE1.Zh(jSONObject7.optInt("height"));
            xE1.PjT(jSONObject7.optInt("width"));
            owx0.Zh(xE1);
        }
        JSONArray jSONArray0 = jSONObject0.optJSONArray("image");
        if(jSONArray0 != null) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                xE xE2 = new xE();
                JSONObject jSONObject8 = jSONArray0.optJSONObject(v);
                xE2.PjT(jSONObject8.optString("url"));
                xE2.Zh(jSONObject8.optInt("height"));
                xE2.PjT(jSONObject8.optInt("width"));
                xE2.PjT(jSONObject8.optBoolean("image_preview"));
                xE2.Zh(jSONObject8.optString("image_key"));
                owx0.ReZ(xE2);
            }
        }
        JSONArray jSONArray1 = jSONObject0.optJSONArray("show_url");
        if(jSONArray1 != null) {
            for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                owx0.zYH().add(jSONArray1.optString(v1));
            }
        }
        JSONArray jSONArray2 = jSONObject0.optJSONArray("click_url");
        if(jSONArray2 != null) {
            for(int v2 = 0; v2 < jSONArray2.length(); ++v2) {
                owx0.wKV().add(jSONArray2.optString(v2));
            }
        }
        JSONArray jSONArray3 = jSONObject0.optJSONArray("play_start");
        if(jSONArray3 != null) {
            for(int v3 = 0; v3 < jSONArray3.length(); ++v3) {
                owx0.yks().add(jSONArray3.optString(v3));
            }
        }
        JSONObject jSONObject9 = jSONObject0.optJSONObject("click_area");
        if(jSONObject9 != null) {
            SM sM0 = new SM();
            sM0.PjT = jSONObject9.optBoolean("click_upper_content_area", true);
            sM0.Zh = jSONObject9.optBoolean("click_upper_non_content_area", true);
            sM0.ReZ = jSONObject9.optBoolean("click_lower_content_area", true);
            sM0.cr = jSONObject9.optBoolean("click_lower_non_content_area", true);
            sM0.JQp = jSONObject9.optBoolean("click_button_area", true);
            sM0.cz = jSONObject9.optBoolean("click_video_area", true);
            owx0.PjT(sM0);
        }
        JSONObject jSONObject10 = jSONObject0.optJSONObject("adslot");
        if(jSONObject10 == null) {
            owx0.PjT(adSlot0);
        }
        else {
            owx0.PjT(Zh.Zh(jSONObject10));
        }
        if(adSlot0 == null) {
            owx0.iZZ(jSONObject0.optString("identificationOverlayContent"));
        }
        else {
            Map map0 = adSlot0.getRequestExtraMap();
            if(map0 != null && map0.containsKey("admob_watermark")) {
                owx0.iZZ(String.valueOf(map0.get("admob_watermark")));
            }
        }
        owx0.xE(jSONObject0.optInt("intercept_flag", 0));
        owx0.fDm(jSONObject0.optString("phone_num"));
        owx0.qla(jSONObject0.optString("title"));
        owx0.xE(jSONObject0.optString("description"));
        owx0.ub(jSONObject0.optString("button_text"));
        owx0.fDm(jSONObject0.optInt("ad_logo", 1));
        owx0.Owx(jSONObject0.optString("ext"));
        owx0.Owx(jSONObject0.optInt("cover_click_area", 0));
        owx0.yIW(jSONObject0.optInt("image_mode"));
        owx0.Yo(jSONObject0.optInt("orientation", 1));
        owx0.PjT(((float)jSONObject0.optDouble("aspect_ratio", 100.0)));
        owx0.Owx(jSONObject0.optInt("cover_click_area", 0));
        JSONObject jSONObject11 = jSONObject0.optJSONObject("app");
        JSONObject jSONObject12 = jSONObject0.optJSONObject("deep_link");
        JSONObject jSONObject13 = jSONObject0.optJSONObject("oem");
        owx0.ReZ(jSONObject0.optInt("is_web_jump_ip", 0));
        owx0.PjT(Lrd.PjT(jSONObject13));
        owx0.PjT(Zh.cz(jSONObject11));
        JSONObject jSONObject14 = jSONObject0.optJSONObject("interaction_method_params");
        owx0.PjT(Zh.SM(jSONObject0.optJSONObject("arbitrage_interceptor_params")));
        owx0.PjT(Zh.XX(jSONObject14));
        owx0.PjT(Zh.Au(jSONObject14));
        owx0.PjT(Zh.qj(jSONObject12));
        owx0.PjT(new cRA(jSONObject0));
        JSONArray jSONArray4 = jSONObject0.optJSONArray("filter_words");
        if(jSONArray4 != null) {
            for(int v4 = 0; v4 < jSONArray4.length(); ++v4) {
                FilterWord filterWord0 = Zh.JQp(jSONArray4.optJSONObject(v4));
                if(filterWord0 != null && filterWord0.isValid()) {
                    owx0.PjT(filterWord0);
                }
            }
        }
        owx0.iZZ(jSONObject0.optInt("count_down"));
        owx0.Zh(jSONObject0.optLong("expiration_time"));
        owx0.kph(jSONObject0.optInt("video_encode_type", 0));
        owx0.rds(0);
        JSONObject jSONObject15 = jSONObject0.optJSONObject("video");
        if(jSONObject15 == null) {
            c0 = null;
        }
        else {
            c0 = Zh.PjT(jSONObject15, owx0, true);
            owx0.Zh(c0);
            owx0.xH(jSONObject15.optInt("multi_played_percent", 50));
        }
        JSONObject jSONObject16 = jSONObject0.optJSONObject("h265_video");
        if(jSONObject16 == null) {
            c1 = null;
        }
        else {
            c1 = Zh.PjT(jSONObject16, owx0, false);
            owx0.ReZ(c1);
        }
        if(Build.VERSION.SDK_INT < 26 || owx0.gH() == 0) {
            owx0.PjT(c0);
            owx0.kph(0);
        }
        else {
            if(c1 != null && c0 != null) {
                if(TextUtils.isEmpty(c1.M())) {
                    c1.B(c0.M());
                }
                if(TextUtils.isEmpty(c1.N())) {
                    c1.g(c0.N());
                }
                if(c1.z() == -1) {
                    c1.A(c0.z());
                }
            }
            if(c1 == null) {
                owx0.PjT(c0);
            }
            else {
                owx0.PjT(c1);
            }
        }
        JSONObject jSONObject17 = jSONObject0.optJSONObject("download_conf");
        if(jSONObject17 != null) {
            owx0.PjT(Zh.DWo(jSONObject17));
        }
        owx0.PjT(Zh.xf(jSONObject0.optJSONObject("media_ext")));
        JSONObject jSONObject18 = jSONObject0.optJSONObject("tpl_info");
        if(jSONObject18 != null) {
            com.bytedance.sdk.openadsdk.core.model.Owx.PjT owx$PjT0 = new com.bytedance.sdk.openadsdk.core.model.Owx.PjT();
            owx$PjT0.ReZ(jSONObject18.optString("id"));
            owx$PjT0.cr(jSONObject18.optString("md5"));
            owx$PjT0.JQp(jSONObject18.optString("url"));
            owx$PjT0.cz(jSONObject18.optString("data"));
            owx$PjT0.XX(jSONObject18.optString("diff_data"));
            String s = jSONObject18.optString("dynamic_creative");
            owx$PjT0.Au(s);
            owx$PjT0.Zh(jSONObject18.optString("version"));
            owx$PjT0.SM(jSONObject18.optString("media_view"));
            try {
                ArrayList arrayList0 = new ArrayList();
                JSONObject jSONObject19 = new JSONObject(s);
                JSONArray jSONArray5 = jSONObject19.optJSONArray("tag_ids");
                if(jSONArray5 != null) {
                    for(int v5 = 0; v5 < jSONArray5.length(); ++v5) {
                        arrayList0.add(jSONArray5.optInt(v5));
                    }
                }
                String s1 = jSONObject19.optString("music_url");
                owx$PjT0.PjT(arrayList0);
                owx$PjT0.PjT(s1);
            }
            catch(JSONException jSONException0) {
                RD.Zh("TTAD.AdInfoFactory", jSONException0.getMessage());
            }
            owx$PjT0.DWo(jSONObject18.optString("engine_version"));
            owx$PjT0.qj(jSONObject18.optString("ugen_url"));
            owx$PjT0.xf(jSONObject18.optString("ugen_md5"));
            owx$PjT0.xs(jSONObject18.optString("ugen_data"));
            owx0.PjT(owx$PjT0);
        }
        JSONObject jSONObject20 = jSONObject0.optJSONObject("tpl_info_v3");
        if(jSONObject20 != null) {
            owx0.PjT(Yo.PjT(jSONObject20));
        }
        JSONObject jSONObject21 = jSONObject0.optJSONObject("dynamic_creative");
        if(jSONObject21 != null) {
            owx0.Zh(jSONObject21);
        }
        owx0.DWo(jSONObject0.optString("creative_extra"));
        owx0.SM(jSONObject0.optInt("if_block_lp", 0));
        owx0.gK(jSONObject0.optInt("cache_sort", 1));
        owx0.ltE(jSONObject0.optInt("if_sp_cache", 0));
        JSONObject jSONObject22 = jSONObject0.optJSONObject("splash_control");
        if(jSONObject22 != null) {
            owx0.PjT(Zh.cr(jSONObject22));
        }
        owx0.Qf(jSONObject0.optInt("is_package_open", 1));
        owx0.Au(jSONObject0.optString("ad_info", null));
        int v6 = 2;
        owx0.RD(jSONObject0.optInt("ua_policy", 2));
        owx0.ZX(jSONObject0.optInt("playable_duration_time", 20));
        owx0.Jo(jSONObject0.optInt("playable_endcard_close_time", -1));
        owx0.Co(jSONObject0.optInt("endcard_close_time", -1));
        owx0.cr(jSONObject0.optInt("interaction_method"));
        owx0.MWx(jSONObject0.optInt("lp_click_type", -1));
        owx0.cr(((long)jSONObject0.optInt("lp_click_interval", -1)));
        owx0.tT(jSONObject0.optString("dsp_html"));
        owx0.dwk(jSONObject0.optInt("image_stay", 0));
        int v7 = jSONObject0.optInt("dsp_material_type", 0);
        if(v7 < 0 || v7 > 3) {
            v7 = 0;
        }
        if(v7 == 0) {
            if(jSONObject0.optBoolean("is_vast", false)) {
                v7 = 1;
            }
            if(!jSONObject0.optBoolean("is_html", false)) {
                v6 = v7;
            }
        }
        else {
            v6 = v7;
        }
        owx0.OMu(v6);
        if(v6 == 1 || v6 == 3) {
            int v8 = owx0.kW();
            if(v8 < 0) {
                v8 = owx0.ig() == null ? owx0.XWz() : owx0.ig().getDurationSlotType();
            }
            String s2 = wN.ReZ(v8);
            if(jSONObject0.has("vast_json")) {
                pjT0 = com.bytedance.sdk.openadsdk.core.qj.PjT.PjT(jSONObject0.optJSONObject("vast_json"));
            }
            else {
                String s3 = jSONObject0.optString("dsp_vast");
                if(TextUtils.isEmpty(s3)) {
                    Zh.PjT(owx0, s2);
                    return null;
                }
                long v9 = System.currentTimeMillis();
                Pair pair0 = Zh.PjT(s3, owx0.jK(), v8);
                if(pair0 == null) {
                    pjT0 = null;
                    zh$PjT0 = null;
                }
                else {
                    com.bytedance.sdk.openadsdk.core.qj.PjT pjT1 = (com.bytedance.sdk.openadsdk.core.qj.PjT)pair0.first;
                    zh$PjT0 = (com.bytedance.sdk.openadsdk.core.qj.PjT.Zh.PjT)pair0.second;
                    pjT0 = pjT1;
                }
                Zh.PjT(owx0, s2, pjT0, v9, zh$PjT0);
            }
            if(pjT0 != null) {
                pjT0.cz(s2);
            }
            if(pjT0 == null) {
                return null;
            }
            Zh.PjT(pjT0, owx0);
        }
        owx0.Lrd(jSONObject0.optString("deep_link_appname", ""));
        owx0.IJ(jSONObject0.optInt("landing_page_download_clicktype", 1));
        JSONObject jSONObject23 = jSONObject0.optJSONObject("dsp_style");
        if(jSONObject23 != null) {
            owx0.PjT(new com.bytedance.sdk.openadsdk.core.model.xs(jSONObject23));
        }
        JSONObject jSONObject24 = jSONObject0.optJSONObject("dsp_adchoices");
        if(jSONObject24 != null) {
            owx0.JQp(jSONObject24.optString("adchoices_icon", ""));
            owx0.cz(jSONObject24.optString("adchoices_url", ""));
        }
        String s4 = jSONObject0.optString("gdid_encrypted");
        if(!TextUtils.isEmpty(s4)) {
            owx0.yIW(s4);
        }
        int v10 = jSONObject0.optInt("jump_probability", 0);
        if(v10 < 0 || v10 > 100) {
            v10 = 0;
        }
        owx0.VY(v10);
        owx0.Lrs();
        JSONObject jSONObject25 = jSONObject0.optJSONObject("ugen");
        if(jSONObject25 != null) {
            JSONObject jSONObject26 = jSONObject25.optJSONObject("endcard");
            if(jSONObject26 != null) {
                owx0.PjT(Zh.ReZ(jSONObject26));
                JSONObject jSONObject27 = jSONObject26.optJSONObject("overlay");
                if(jSONObject27 != null) {
                    owx0.Zh(Zh.ReZ(jSONObject27));
                }
            }
        }
        owx0.tY(jSONObject0.optInt("preload_h5_type", 0));
        owx0.Au(jSONObject0.optBoolean("hasReportShow", false));
        owx0.Yo(jSONObject0.optString("endcard_creative", ""));
        owx0.cz(jSONObject0.optJSONObject("ad_label"));
        JSONObject jSONObject28 = jSONObject0.optJSONObject("ev");
        if(jSONObject28 != null) {
            owx0.xf(jSONObject28.optBoolean("enable", com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT));
            owx0.Ld(jSONObject28.optInt("wait_time", com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.Zh));
            owx0.KM(jSONObject28.optString("label", "engaged_view"));
            owx0.PjT(new com.bytedance.sdk.openadsdk.Lrd.PjT.Zh(owx0));
        }
        if(jSONObject0.has("banner")) {
            JSONObject jSONObject29 = jSONObject0.optJSONObject("banner");
            if(jSONObject29 != null) {
                owx0.PjT(new PAGBannerSize(jSONObject29.optInt("width", 0), jSONObject29.optInt("height", 0)));
            }
        }
        return owx0;
    }

    @Nullable
    private static c PjT(JSONObject jSONObject0, Owx owx0, boolean z) {
        if(jSONObject0 == null) {
            return null;
        }
        c c0 = new c();
        c0.x(jSONObject0.optInt("cover_height"));
        c0.p(jSONObject0.optInt("cover_width"));
        c0.m(jSONObject0.optString("resolution"));
        c0.l(jSONObject0.optLong("size"));
        double f = jSONObject0.optDouble("video_duration", 0.0);
        c0.j(f);
        int v = 1;
        int v1 = jSONObject0.optInt("replay_time", 1);
        if(f <= 15.0 && owx0.iZZ() != 1 && Owx.JQp(owx0)) {
            v = v1;
        }
        c0.d(v);
        c0.y(jSONObject0.optString("cover_url"));
        c0.q(jSONObject0.optString("video_url"));
        c0.B(jSONObject0.optString("endcard"));
        c0.g(jSONObject0.optString("playable_download_url"));
        c0.E(jSONObject0.optString("file_hash"));
        c0.b(jSONObject0.optInt("if_playable_loading_show", 0));
        c0.s(jSONObject0.optInt("remove_loading_page_type", 0));
        c0.k(jSONObject0.optInt("fallback_endcard_judge", 0));
        c0.f(jSONObject0.optInt("video_preload_size", 0x4B000));
        c0.D(jSONObject0.optInt("reward_video_cached_type", 0));
        c0.v(jSONObject0.optInt("execute_cached_type", 0));
        c0.A((z ? jSONObject0.optInt("endcard_render", 0) : jSONObject0.optInt("endcard_render", -1)));
        return c0;
    }

    private static void PjT(int v, com.bytedance.sdk.openadsdk.core.model.PjT pjT0, ArrayList arrayList0, com.bytedance.sdk.openadsdk.core.model.ReZ reZ0) {
        if(pjT0 != null && v >= 2 && pjT0.Au()) {
            int v1 = v - (pjT0.cr() == null ? 0 : pjT0.cr().size());
            boolean z = pjT0.SM() == null;
            if(v1 > 0 || z) {
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT();
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT("choose_ad_parsing_error", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                    @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                    public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("req_id", "");
                        jSONObject0.put("material_error", v1);
                        jSONObject0.put("choose_ui_error", ((int)z));
                        if(arrayList0 != null && !arrayList0.isEmpty()) {
                            jSONObject0.put("mate_unavailable_code_list", new JSONArray(arrayList0).toString());
                        }
                        com.bytedance.sdk.openadsdk.core.model.ReZ reZ0 = reZ0;
                        if(reZ0 != null) {
                            jSONObject0.put("server_res_str", reZ0.PjT());
                        }
                        return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("choose_ad_parsing_error").Zh(jSONObject0.toString());
                    }
                });
            }
        }
    }

    private static void PjT(Owx owx0, String s) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("reason_code", -1);
            jSONObject0.put("error_code", -1);
            ReZ.Zh(owx0, s, "load_vast_fail", jSONObject0);
        }
        catch(Exception unused_ex) {
        }
    }

    private static void PjT(Owx owx0, String s, com.bytedance.sdk.openadsdk.core.qj.PjT pjT0, long v, com.bytedance.sdk.openadsdk.core.qj.PjT.Zh.PjT zh$PjT0) {
        ReZ.PjT(new Au("vast_parser") {
            @Override
            public void run() {
                JSONObject jSONObject1;
                try {
                    String s = "load_vast_fail";
                    JSONObject jSONObject0 = new JSONObject();
                    com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = pjT0;
                    if(pjT0 == null) {
                        jSONObject0.put("reason_code", -2);
                        com.bytedance.sdk.openadsdk.core.qj.PjT.Zh.PjT zh$PjT1 = zh$PjT0;
                        if(zh$PjT1 != null) {
                            jSONObject0.put("error_code", zh$PjT1.PjT);
                        }
                    }
                    else if(!TextUtils.isEmpty(pjT0.SM()) && !TextUtils.isEmpty(pjT0.cz()) && pjT0.Au() > 0.0) {
                        jSONObject0.put("duration", System.currentTimeMillis() - v);
                        com.bytedance.sdk.openadsdk.core.qj.PjT.Zh.PjT zh$PjT0 = zh$PjT0;
                        if(zh$PjT0 != null) {
                            jSONObject0.put("wrapper_count", zh$PjT0.Zh);
                            jSONObject0.put("impression_links_null", zh$PjT0.ReZ);
                        }
                        s = "load_vast_success";
                    }
                    else {
                        jSONObject0.put("reason_code", -3);
                        jSONObject0.put("error_code", -3);
                    }
                    ReZ.Zh(owx0, s, s, jSONObject0);
                    if(pjT0 != null && pjT0.Zh() != null && TextUtils.isEmpty(pjT0.Zh().cz())) {
                        jSONObject1 = new JSONObject();
                        goto label_22;
                    }
                }
                catch(Exception unused_ex) {
                }
                return;
                try {
                label_22:
                    jSONObject1.put("error_code", 1000);
                    jSONObject1.put("description", "1000:Image url is null");
                }
                catch(Throwable unused_ex) {
                }
                try {
                    ReZ.Zh(owx0, s, "load_vast_icon_fail", jSONObject1);
                    pjT0.PjT(null);
                }
                catch(Exception unused_ex) {
                }
            }
        });
    }

    private static void PjT(com.bytedance.sdk.openadsdk.core.qj.PjT pjT0, Owx owx0) {
        pjT0.PjT(owx0);
        if(!Zh.PjT(owx0.cI())) {
            owx0.tT(2);
        }
        owx0.XX(1);
        owx0.PjT(pjT0);
        if(!TextUtils.isEmpty(pjT0.cr())) {
            owx0.qla(pjT0.cr());
        }
        if(!TextUtils.isEmpty(pjT0.JQp())) {
            owx0.xE(pjT0.JQp());
        }
        owx0.xs(pjT0.cz());
        owx0.PjT(null);
        c c0 = owx0.MWx();
        if(c0 == null) {
            c0 = new c();
        }
        c0.q(pjT0.XX());
        c0.j(pjT0.Au());
        c0.E(null);
        c0.y(null);
        c0.B(null);
        owx0.PjT(c0);
        if(pjT0.Zh() != null && !TextUtils.isEmpty(pjT0.Zh().JQp())) {
            xE xE0 = new xE();
            xE0.PjT(pjT0.Zh().JQp());
            xE0.PjT(pjT0.Zh().Zh());
            xE0.Zh(pjT0.Zh().ReZ());
            owx0.PjT(xE0);
            return;
        }
        if(owx0.Xe() == null) {
            xE xE1 = new xE();
            xE1.PjT("https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg");
            xE1.PjT(98);
            xE1.Zh(98);
            owx0.PjT(xE1);
        }
    }

    private static void PjT(ArrayList arrayList0) {
        com.bytedance.sdk.openadsdk.qla.ReZ.PjT("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("material_error", arrayList0.size());
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: arrayList0) {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("cid", ((PjT)object0).PjT);
                    jSONObject1.put("error_msg", ((PjT)object0).Zh);
                    jSONArray0.put(jSONObject1);
                }
                jSONObject0.put("error_cid_list", jSONArray0);
                return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("multiple_ads_parsing_error").Zh(jSONObject0.toString());
            }
        });
    }

    private static void PjT(JSONObject jSONObject0, Owx owx0) {
        if(jSONObject0 != null) {
            int v = jSONObject0.optInt("iv_skip_time", -1);
            int v1 = jSONObject0.optInt("rv_skip_time", -1);
            if(v != -1) {
                owx0.PjT(v);
            }
            if(v1 != -1) {
                owx0.Zh(v1);
            }
        }
    }

    private static boolean PjT(int v) {
        return v == 2 || v == 3 || v == 8;
    }

    private static int ReZ(Owx owx0) {
        int v;
        String s = wN.ReZ(owx0.kW());
        if(owx0.cyr() == 0) {
            v = Zh.PjT(owx0.RV());
            if(v != 200) {
                ReZ.ReZ(owx0, s, v);
                return v;
            }
        }
        switch(owx0.cI()) {
            case 4: {
                v = Zh.PjT(owx0.uQg());
                if(v != 200) {
                    ReZ.ReZ(owx0, s, v);
                    return v;
                }
                break;
            }
            case 2: 
            case 3: 
            case 8: {
                if(Zh.cr(owx0) && TextUtils.isEmpty(owx0.xu())) {
                    ReZ.ReZ(owx0, s, 406);
                    return 406;
                }
                break;
            }
            default: {
                return 200;
            }
        }
        return 200;
    }

    private static com.bytedance.sdk.openadsdk.core.DWo.XX.PjT ReZ(JSONObject jSONObject0) {
        com.bytedance.sdk.openadsdk.core.DWo.XX.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.DWo.XX.PjT();
        pjT0.PjT(jSONObject0.optString("id"));
        pjT0.Zh(jSONObject0.optString("md5"));
        pjT0.ReZ(jSONObject0.optString("url"));
        return pjT0;
    }

    private static cz SM(JSONObject jSONObject0) {
        cz cz0 = new cz();
        if(jSONObject0 == null) {
            cz0.ReZ(0);
            cz0.cr(0);
            cz0.Zh(new ArrayList());
            cz0.JQp(0);
            cz0.PjT(new ArrayList());
            cz0.Zh(0);
            cz0.PjT(0);
            return cz0;
        }
        cz0.ReZ(jSONObject0.optInt("interceptor_x", 0));
        cz0.cr(jSONObject0.optInt("interceptor_y", 0));
        JSONArray jSONArray0 = jSONObject0.optJSONArray("interceptor_page");
        ArrayList arrayList0 = new ArrayList();
        if(jSONArray0 != null) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                arrayList0.add(jSONArray0.optInt(v));
            }
        }
        cz0.Zh(arrayList0);
        cz0.JQp(jSONObject0.optInt("interceptor_interval_time", 0));
        JSONArray jSONArray1 = jSONObject0.optJSONArray("url_regular");
        ArrayList arrayList1 = new ArrayList();
        if(jSONArray1 != null) {
            for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                arrayList1.add(jSONArray1.optString(v1));
            }
        }
        cz0.PjT(arrayList1);
        cz0.Zh(jSONObject0.optInt("boc_index", 0));
        cz0.PjT(jSONObject0.optInt("is_act", 0));
        return cz0;
    }

    @Nullable
    private static ltE XX(JSONObject jSONObject0) {
        ltE ltE0 = new ltE();
        if(jSONObject0 == null) {
            ltE0.PjT(10L);
            ltE0.Zh(20L);
            ltE0.ReZ(10L);
            ltE0.cr(20L);
            ltE0.PjT("");
            return ltE0;
        }
        ltE0.PjT(jSONObject0.optLong("onlylp_loading_maxtime", 10L));
        ltE0.Zh(jSONObject0.optLong("straight_lp_showtime", 20L));
        ltE0.ReZ(jSONObject0.optLong("onlyagg_loading_maxtime", 10L));
        ltE0.cr(jSONObject0.optLong("straight_agg_showtime", 20L));
        ltE0.PjT(jSONObject0.optString("loading_text", ""));
        return ltE0;
    }

    private static int Zh(Owx owx0) {
        int v;
        String s = wN.ReZ(owx0.kW());
        if(owx0.cyr() == 0) {
            v = Zh.PjT(owx0.RV());
            ReZ.ReZ(owx0, s, v);
        }
        else {
            v = 200;
        }
        switch(owx0.cI()) {
            case 4: {
                if(owx0.uQg() == null) {
                    ReZ.ReZ(owx0, s, 407);
                    v = 407;
                }
                else {
                    ReZ.ReZ(owx0, s, 417);
                    v = 417;
                }
                break;
            }
            case 2: 
            case 3: 
            case 8: {
                if(Zh.cr(owx0) && TextUtils.isEmpty(owx0.xu())) {
                    ReZ.ReZ(owx0, s, 406);
                    v = 406;
                }
            }
        }
        if(v != 406 && v != 407 && v != 417) {
            if(v != 200) {
                ReZ.Zh(owx0, s, v);
            }
            return 200;
        }
        return v;
    }

    public static AdSlot Zh(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        String s = jSONObject0.optString("mCodeId", "");
        int v = jSONObject0.optInt("mImgAcceptedWidth", 0);
        int v1 = jSONObject0.optInt("mImgAcceptedHeight", 0);
        float f = (float)jSONObject0.optDouble("mExpressViewAcceptedWidth", 0.0);
        float f1 = (float)jSONObject0.optDouble("mExpressViewAcceptedHeight", 0.0);
        int v2 = jSONObject0.optInt("mAdCount", 6);
        boolean z = jSONObject0.optBoolean("mSupportDeepLink", true);
        String s1 = jSONObject0.optString("mRewardName", "");
        int v3 = jSONObject0.optInt("mRewardAmount", 0);
        String s2 = jSONObject0.optString("mMediaExtra", "");
        String s3 = jSONObject0.optString("mUserID", "");
        jSONObject0.optInt("mOrientation", 2);
        int v4 = jSONObject0.optInt("mNativeAdType", 0);
        boolean z1 = jSONObject0.optBoolean("mIsAutoPlay", false);
        boolean z2 = jSONObject0.optBoolean("mIsExpressAd", false);
        String s4 = jSONObject0.optString("mBidAdm", "");
        int v5 = jSONObject0.optInt("mDurationSlotType", 0);
        return new Builder().setCodeId(s).setImageAcceptedSize(v, v1).setExpressViewAcceptedSize(f, f1).setAdCount(v2).setSupportDeepLink(z).setRewardName(s1).setRewardAmount(v3).setMediaExtra(s2).setUserID(s3).setNativeAdType(v4).setIsAutoPlay(z1).isExpressAd(z2).withBid(s4).setDurationSlotType(v5).build();
    }

    private static com.bytedance.sdk.openadsdk.core.model.JQp cr(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        int v = jSONObject0.optInt("splash_clickarea", 2);
        int v1 = jSONObject0.optInt("splash_layout_id", 1);
        long v2 = 0L;
        long v3 = jSONObject0.optLong("load_wait_time", 0L);
        if(v3 >= 0L) {
            v2 = v3;
        }
        int v4 = jSONObject0.optInt("skip_time", -1);
        com.bytedance.sdk.openadsdk.core.model.JQp jQp0 = new com.bytedance.sdk.openadsdk.core.model.JQp();
        jQp0.Zh(v);
        jQp0.ReZ(v1);
        jQp0.PjT(v2);
        jQp0.PjT(v4);
        return jQp0;
    }

    // 去混淆评级： 低(20)
    private static boolean cr(Owx owx0) {
        return !owx0.uvo() && !owx0.pBJ();
    }

    @Nullable
    private static cr cz(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        cr cr0 = new cr();
        cr0.Zh(jSONObject0.optString("app_name"));
        cr0.ReZ(jSONObject0.optString("package_name"));
        cr0.PjT(jSONObject0.optString("download_url"));
        cr0.PjT(jSONObject0.optDouble("score", -1.0));
        cr0.PjT(jSONObject0.optInt("comment_num", -1));
        cr0.Zh(jSONObject0.optInt("app_size", 0));
        cr0.cr(jSONObject0.optString("app_category"));
        return cr0;
    }

    @Nullable
    private static qj qj(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        qj qj0 = new qj();
        qj0.PjT(jSONObject0.optString("deeplink_url"));
        qj0.Zh(jSONObject0.optString("fallback_url"));
        qj0.PjT(jSONObject0.optInt("fallback_type"));
        return qj0;
    }

    private static Map xf(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        Map map0 = new HashMap();
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            if(!TextUtils.isEmpty(s)) {
                map0.put(s, jSONObject0.opt(s));
            }
        }
        return map0;
    }
}

