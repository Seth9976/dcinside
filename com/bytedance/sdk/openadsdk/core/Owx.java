package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.XX.Zh.cr;
import com.bytedance.sdk.component.Zh.PjT.DWo;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.JQp;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.KM;
import com.bytedance.sdk.openadsdk.core.model.ReZ;
import com.bytedance.sdk.openadsdk.core.model.tT;
import com.bytedance.sdk.openadsdk.core.model.xE;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.cr.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.Co;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Owx implements ltE {
    public static class PjT {
        @Nullable
        public final com.bytedance.sdk.openadsdk.core.model.PjT Au;
        final ArrayList DWo;
        final String JQp;
        final int PjT;
        final long ReZ;
        final String SM;
        final String XX;
        final long Zh;
        final int cr;
        final int cz;

        private PjT(String s, int v, int v1, String s1, int v2, String s2, @Nullable com.bytedance.sdk.openadsdk.core.model.PjT pjT0, long v3, long v4, ArrayList arrayList0) {
            this.PjT = v;
            this.cr = v1;
            this.JQp = s1;
            this.XX = s2;
            this.Au = pjT0;
            this.SM = s;
            this.cz = v2;
            this.Zh = v3;
            this.ReZ = v4;
            this.DWo = arrayList0;
        }

        public static PjT PjT(JSONObject jSONObject0, AdSlot adSlot0, tT tT0, ReZ reZ0) {
            String s = jSONObject0.optString("did");
            int v = jSONObject0.optInt("processing_time_ms");
            long v1 = jSONObject0.optLong("s_receive_ts");
            long v2 = jSONObject0.optLong("s_send_ts");
            int v3 = jSONObject0.optInt("status_code");
            String s1 = jSONObject0.optString("desc");
            String s2 = jSONObject0.optString("request_id");
            int v4 = jSONObject0.optInt("reason");
            Pair pair0 = Zh.PjT(jSONObject0, adSlot0, tT0, reZ0);
            if(pair0 != null) {
                Object object0 = pair0.first;
                if(object0 != null) {
                    ((com.bytedance.sdk.openadsdk.core.model.PjT)object0).PjT(jSONObject0.optLong("request_after"));
                }
            }
            return pair0 == null ? new PjT(s, v, v3, s1, v4, s2, null, v1, v2, null) : new PjT(s, v, v3, s1, v4, s2, ((com.bytedance.sdk.openadsdk.core.model.PjT)pair0.first), v1, v2, ((ArrayList)pair0.second));
        }
    }

    public static class com.bytedance.sdk.openadsdk.core.Owx.Zh {
        public final int PjT;
        public final KM ReZ;
        public final boolean Zh;

        private com.bytedance.sdk.openadsdk.core.Owx.Zh(int v, boolean z, KM kM0) {
            this.PjT = v;
            this.Zh = z;
            this.ReZ = kM0;
        }

        public static com.bytedance.sdk.openadsdk.core.Owx.Zh PjT(JSONObject jSONObject0) {
            if(jSONObject0 == null) {
                return null;
            }
            int v = jSONObject0.optInt("code");
            boolean z = jSONObject0.optBoolean("verify");
            JSONObject jSONObject1 = jSONObject0.optJSONObject("data");
            KM kM0 = new KM();
            if(jSONObject1 != null) {
                try {
                    kM0.PjT(jSONObject1.optInt("reason"));
                    kM0.Zh(jSONObject1.optInt("corp_type"));
                    kM0.ReZ(jSONObject1.optInt("reward_amount"));
                    kM0.PjT(jSONObject1.optString("reward_name"));
                    return new com.bytedance.sdk.openadsdk.core.Owx.Zh(v, z, kM0);
                }
                catch(Throwable throwable0) {
                    RD.Zh("NetApiImpl", throwable0.getMessage());
                    return new com.bytedance.sdk.openadsdk.core.Owx.Zh(v, z, kM0);
                }
            }
            return new com.bytedance.sdk.openadsdk.core.Owx.Zh(v, z, kM0);
        }
    }

    private final Context PjT;

    Owx(Context context0) {
        this.PjT = context0;
    }

    private boolean JQp(JSONObject jSONObject0) {
        if(jSONObject0 != null) {
            try {
                return jSONObject0.optString("message").equalsIgnoreCase("success");
            }
            catch(Throwable unused_ex) {
            }
        }
        return false;
    }

    private byte[] JQp(String s) {
        GZIPOutputStream gZIPOutputStream1;
        ByteArrayOutputStream byteArrayOutputStream0;
        byte[] arr_b;
        GZIPOutputStream gZIPOutputStream0 = null;
        if(s != null && s.length() != 0) {
            try {
                arr_b = new byte[0];
                byteArrayOutputStream0 = null;
                byteArrayOutputStream0 = new ByteArrayOutputStream();
                gZIPOutputStream1 = new GZIPOutputStream(byteArrayOutputStream0);
                goto label_9;
            }
            catch(IOException iOException0) {
                goto label_13;
                try {
                label_9:
                    gZIPOutputStream1.write(s.getBytes("utf-8"));
                    goto label_40;
                }
                catch(IOException iOException0) {
                }
                catch(Throwable throwable0) {
                    goto label_27;
                }
                gZIPOutputStream0 = gZIPOutputStream1;
                try {
                label_13:
                    RD.Zh("NetApiImpl", iOException0.toString());
                    goto label_17;
                }
                catch(Throwable throwable0) {
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
                goto label_28;
            }
        label_17:
            if(gZIPOutputStream0 != null) {
                try {
                    gZIPOutputStream0.close();
                }
                catch(IOException iOException1) {
                    RD.Zh("NetApiImpl", iOException1.toString());
                }
            }
            if(byteArrayOutputStream0 != null) {
                arr_b = byteArrayOutputStream0.toByteArray();
                try {
                    byteArrayOutputStream0.close();
                }
                catch(IOException iOException2) {
                    RD.Zh("NetApiImpl", iOException2.toString());
                    return arr_b;
                }
            }
            return arr_b;
        label_27:
            gZIPOutputStream0 = gZIPOutputStream1;
        label_28:
            if(gZIPOutputStream0 != null) {
                try {
                    gZIPOutputStream0.close();
                }
                catch(IOException iOException3) {
                    RD.Zh("NetApiImpl", iOException3.toString());
                }
            }
            if(byteArrayOutputStream0 != null) {
                byteArrayOutputStream0.toByteArray();
                try {
                    byteArrayOutputStream0.close();
                }
                catch(IOException iOException4) {
                    RD.Zh("NetApiImpl", iOException4.toString());
                }
            }
            throw throwable0;
            try {
            label_40:
                gZIPOutputStream1.close();
            }
            catch(IOException iOException5) {
                RD.Zh("NetApiImpl", iOException5.toString());
            }
            arr_b = byteArrayOutputStream0.toByteArray();
            try {
                byteArrayOutputStream0.close();
            }
            catch(IOException iOException2) {
                RD.Zh("NetApiImpl", iOException2.toString());
            }
            return arr_b;
        }
        return null;
    }

    private JSONArray PjT(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: list0) {
                jSONArray0.put(((FilterWord)object0).getId());
            }
            return jSONArray0;
        }
        return null;
    }

    private static JSONObject PjT(CryptDataScene pangleEncryptConstant$CryptDataScene0, JSONObject jSONObject0) {
        if(xs.Gr().PjT(pangleEncryptConstant$CryptDataScene0)) {
            JSONObject jSONObject1 = PangleEncryptManager.encryptType4(jSONObject0, new com.bytedance.sdk.openadsdk.core.RD(pangleEncryptConstant$CryptDataScene0));
            Sks.PjT(jSONObject1);
            return jSONObject1;
        }
        return com.bytedance.sdk.component.utils.PjT.PjT(jSONObject0);
    }

    public static JSONObject PjT(AdSlot adSlot0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("personalized_ad", ub.cr().kph());
            jSONObject0.put("lmt", DeviceUtils.ReZ());
            jSONObject0.put("gdpr", SM.Zh().DWo());
            jSONObject0.put("pa_consent", SM.Zh().qj());
            jSONObject0.put("is_gdpr_user", ub.cr().Zd());
            if(adSlot0 != null && com.bytedance.sdk.openadsdk.core.tT.PjT.containsKey(Integer.valueOf(adSlot0.getCodeId()))) {
                com.bytedance.sdk.openadsdk.core.tT tT0 = (com.bytedance.sdk.openadsdk.core.tT)com.bytedance.sdk.openadsdk.core.tT.PjT.get(Integer.valueOf(adSlot0.getCodeId()));
                if(tT0 != null) {
                    jSONObject0.put("lastadomain", tT0.Zh());
                    jSONObject0.put("lastbundle", "");
                    jSONObject0.put("lastclick", tT0.cr());
                    jSONObject0.put("lastskip", tT0.JQp());
                }
            }
            Owx.PjT(jSONObject0, "keywords", SM.Zh().fDm());
            Owx.PjT(jSONObject0, "data", Owx.Zh(adSlot0));
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    private JSONObject PjT(AdSlot adSlot0, int v, tT tT0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("id", adSlot0.getCodeId());
            jSONObject0.put("adtype", v);
            if(!TextUtils.isEmpty(adSlot0.getAdId()) || !TextUtils.isEmpty(adSlot0.getCreativeId()) || !TextUtils.isEmpty(adSlot0.getExt())) {
                JSONObject jSONObject1 = new JSONObject();
                if(!TextUtils.isEmpty(adSlot0.getAdId())) {
                    jSONObject1.put("ad_id", adSlot0.getAdId());
                }
                if(!TextUtils.isEmpty(adSlot0.getCreativeId())) {
                    jSONObject1.put("creative_id", adSlot0.getCreativeId());
                }
                if(adSlot0.getExt() != null) {
                    jSONObject1.put("ext", adSlot0.getExt());
                }
                jSONObject0.put("preview_ads", jSONObject1);
            }
            if(tT0 == null) {
                jSONObject0.put("render_method", 1);
                this.PjT(jSONObject0, "accepted_size", adSlot0.getImgAcceptedWidth(), adSlot0.getImgAcceptedHeight());
            }
            else {
                jSONObject0.put("render_method", tT0.Au);
                int v1 = tT0.Au;
                if(v1 == 1) {
                    this.PjT(jSONObject0, "accepted_size", adSlot0.getImgAcceptedWidth(), adSlot0.getImgAcceptedHeight());
                }
                else if(v1 == 2) {
                    this.PjT(jSONObject0, "accepted_size", adSlot0.getExpressViewAcceptedWidth(), adSlot0.getExpressViewAcceptedHeight());
                }
            }
            jSONObject0.put("ptpl_ids", Owx.Zh(adSlot0.getCodeId()));
            jSONObject0.put("ugen_ptpl_ids", Owx.ReZ(adSlot0.getCodeId()));
            jSONObject0.put("ptpl_ids_v3", Owx.ReZ((adSlot0.getCodeId() + "_v3")));
            jSONObject0.put("pos", AdSlot.getPosition(v));
            jSONObject0.put("is_support_dpl", adSlot0.isSupportDeepLink());
            if(adSlot0.getNativeAdType() > 0 || v == 5) {
                jSONObject0.put("is_origin_ad", true);
            }
            if(tT0 != null) {
                JSONObject jSONObject2 = tT0.XX;
                if(jSONObject2 != null) {
                    jSONObject0.put("session_params", jSONObject2);
                }
            }
            int v2 = adSlot0.getAdCount() > 0 ? adSlot0.getAdCount() : 1;
            if(v2 > 3) {
                v2 = 3;
            }
            if(v == 7 || v == 8) {
                v2 = 1;
            }
            if(tT0 != null && tT0.JQp != null) {
                v2 = adSlot0.getAdCount();
            }
            jSONObject0.put("ad_count", v2);
            if(v == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot0.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot0.getRotateTime());
                jSONObject3.put("rotate_order", adSlot0.getRotateOrder());
                jSONObject3.put("type", adSlot0.getBannerType());
                jSONObject0.put("banner", jSONObject3);
            }
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    @DungeonFlag
    private JSONObject PjT(AdSlot adSlot0, tT tT0, int v) {
        String s;
        JSONObject jSONObject1;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject1 = new JSONObject();
            s = tT0 == null || TextUtils.isEmpty(tT0.PjT) ? "70d753a5-6ee4-4306-8b6b-ccf1c0f7a774" : tT0.PjT;
            if(v != 7) {
                switch(v) {
                    case 3: {
                        if(tT0 != null) {
                            int v1 = tT0.cr;
                            if(v1 > 0) {
                                jSONObject1.put("req_type", v1);
                            }
                        }
                        break;
                    }
                    case 8: {
                        if(tT0 != null) {
                            int v2 = tT0.ReZ;
                            if(v2 > 0) {
                                jSONObject1.put("req_type", v2);
                            }
                        }
                    }
                }
            }
            else if(tT0 != null) {
                int v3 = tT0.Zh;
                if(v3 > 0) {
                    jSONObject1.put("req_type", v3);
                }
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("body data exception", new Object[]{throwable0});
            return jSONObject0;
        }
        try {
            String s1 = ub.cr().SM();
            String s2 = ub.cr().ltE();
            if(s1 != null && s2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", s1);
                jSONObject2.put("param", s2);
                jSONObject1.put("abtest", jSONObject2);
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            jSONObject1.put("request_id", s);
            wN.PjT(jSONObject1);
            jSONObject1.put("ad_sdk_version", "7.1.0.4");
            jSONObject1.put("rewardedfull_link", ((int)xs.Gr().UR()));
            jSONObject1.put("js_render_ver", "");
            jSONObject1.put("js_render_v3_ver", "");
            jSONObject1.put("source_type", "app");
            jSONObject1.put("app", this.ReZ());
            jSONObject1.put("device", DeviceUtils.PjT(this.PjT, true));
            jSONObject1.put("user", Owx.PjT(adSlot0));
            jSONObject1.put("ua", wN.ReZ());
            jSONObject1.put("channel", "main");
            JSONArray jSONArray0 = new JSONArray();
            jSONArray0.put(this.PjT(adSlot0, v, tT0));
            jSONObject1.put("adslots", jSONArray0);
            this.PjT(jSONObject1, tT0);
            long v4 = System.currentTimeMillis();
            jSONObject1.put("ts", v4 / 1000L);
            jSONObject1.put("req_sign", JQp.PjT((adSlot0.getCodeId() == null || s == null ? "" : v4 / 1000L + adSlot0.getCodeId() + s)));
            if(com.bytedance.sdk.openadsdk.core.SM.ReZ.JQp() != 0) {
                jSONObject1.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.SM.ReZ.JQp()));
            }
            jSONObject1.put("adx_id", SM.Zh().yIW());
            com.bytedance.sdk.openadsdk.cz.Zh.PjT().PjT(jSONObject1);
            jSONObject0 = Owx.PjT(CryptDataScene.GET_ADS, jSONObject1);
            if(jSONObject0 != null) {
                jSONObject0.put("ad_sdk_version", "7.1.0.4");
                jSONObject0.put("oversea_version_type", 1);
                return jSONObject0;
            }
            return jSONObject0;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("body data exception", new Object[]{throwable0});
        return jSONObject0;
    }

    private void PjT(cr cr0, JSONObject jSONObject0) {
        try {
            if(this.ReZ(jSONObject0) && jSONObject0.optInt("cypher") == 4) {
                cr0.Zh("x-pgli18n", "4");
                cr0.Zh("Content-Type", "application/json; charset=utf-8");
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void PjT(com.bytedance.sdk.component.XX.Zh zh0, com.bytedance.sdk.openadsdk.qla.PjT.JQp jQp0, boolean z, Map map0, Co co0, AdSlot adSlot0, ReZ reZ0, com.bytedance.sdk.openadsdk.core.ltE.PjT ltE$PjT0, tT tT0, int v) {
        String s2;
        Co co3;
        jQp0.Zh();
        if(z) {
            map0.put("pgad_end", co0);
        }
        if(zh0 != null) {
            if(zh0.cz()) {
                com.bytedance.sdk.openadsdk.ub.ReZ.Zh(new com.bytedance.sdk.openadsdk.ub.cr() {
                    final Owx Zh;

                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                        pjT0.Zh("get_ad");
                        pjT0.ReZ(adSlot0.getCodeId());
                        pjT0.cr(wN.ReZ(adSlot0.getDurationSlotType()));
                        pjT0.PjT("7.1.0.4");
                        return pjT0;
                    }
                });
                cz.Zh.incrementAndGet();
                cz.PjT.incrementAndGet();
                try {
                    Co co1 = Co.Zh();
                    String s = zh0.cr();
                    JSONObject jSONObject0 = new JSONObject(s);
                    if(ub.cr().tY() && iZZ.PjT().cr() == 1) {
                        wN.PjT("Pangle_Debug_Mode", jSONObject0.toString(), this.PjT);
                    }
                    reZ0.PjT(s);
                    JSONObject jSONObject1 = this.PjT(jSONObject0);
                    if(jSONObject1 == null) {
                        this.PjT(ltE$PjT0, reZ0);
                        cz.cz.incrementAndGet();
                        cz.ReZ();
                        jQp0.PjT(true).PjT(zh0.PjT()).ReZ(s);
                        return;
                    }
                    PjT owx$PjT0 = PjT.PjT(jSONObject1, adSlot0, tT0, reZ0);
                    reZ0.PjT(owx$PjT0.DWo);
                    xf.PjT(this.PjT, owx$PjT0.SM);
                    int v1 = owx$PjT0.cr;
                    if(v1 != 20000) {
                        reZ0.PjT(v1);
                        if(ub.cr().Yo() || owx$PjT0.cr != 40029) {
                            ltE$PjT0.PjT(owx$PjT0.cr, owx$PjT0.JQp);
                        }
                        else {
                            ltE$PjT0.PjT(-100, "");
                        }
                        ReZ.PjT(reZ0);
                        cz.cz.incrementAndGet();
                        cz.ReZ();
                        jQp0.PjT(true).PjT(zh0.PjT()).ReZ(s);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.model.PjT pjT0 = owx$PjT0.Au;
                    if(pjT0 == null) {
                        this.PjT(ltE$PjT0, reZ0);
                        cz.JQp.incrementAndGet();
                        cz.ReZ();
                        jQp0.PjT(true).PjT(zh0.PjT()).ReZ(s);
                        return;
                    }
                    if(this.PjT(pjT0, ltE$PjT0)) {
                        return;
                    }
                    owx$PjT0.Au.ReZ(jSONObject1.toString());
                    owx$PjT0.Au.cr(s);
                    Co co2 = Co.Zh();
                    if(tT0 != null) {
                        com.bytedance.sdk.openadsdk.core.model.iZZ iZZ0 = tT0.DWo;
                        if(iZZ0 != null) {
                            iZZ0.PjT(co0, co1, owx$PjT0.PjT, co2);
                        }
                    }
                    boolean z1 = com.bytedance.sdk.openadsdk.RD.PjT.cr() && v == 1;
                    if(!z1 || owx$PjT0.Au.cr() == null || owx$PjT0.Au.cr().isEmpty()) {
                        co3 = co1;
                    }
                    else {
                        long v2 = 0L;
                        com.bytedance.sdk.openadsdk.core.model.Owx owx0 = (com.bytedance.sdk.openadsdk.core.model.Owx)owx$PjT0.Au.cr().get(0);
                        String s1 = wN.ReZ(v);
                        boolean z2 = owx$PjT0.Au.Au();
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        if(tT0 == null) {
                            goto label_68;
                        }
                        else {
                            Co co4 = tT0.SM;
                            co3 = co1;
                            try {
                                if(co4.PjT > 0L) {
                                    v2 = co2.PjT(co4);
                                    goto label_69;
                                label_68:
                                    co3 = co1;
                                }
                            label_69:
                                if(owx0 != null) {
                                    boolean z3 = owx0.tY();
                                    jSONObject3.put("is_new_engine", ((int)z3));
                                    jSONObject3.put("webview_cache_size", (z3 ? com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().cr() : com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().ReZ()));
                                }
                                Owx.PjT(zh0.XX(), tT0, co0, co3, owx$PjT0.PjT, co2, owx0, s1, z2, jSONObject3, true);
                                jSONObject2.put("duration", v2);
                                jSONObject2.put("extra_data", jSONObject3);
                                jSONObject2.put("tag", s1);
                                jSONObject2.put("callback_start", co2.PjT());
                                owx$PjT0.Au.PjT(jSONObject2);
                            }
                            catch(Exception unused_ex) {
                            }
                            goto label_79;
                        }
                        goto label_69;
                    }
                label_79:
                    ltE$PjT0.PjT(owx$PjT0.Au, reZ0);
                    this.PjT(owx$PjT0.Au);
                    com.bytedance.sdk.openadsdk.core.cr.PjT.PjT().PjT(owx$PjT0.Au);
                    Map map1 = com.bytedance.sdk.openadsdk.core.model.PjT.PjT(owx$PjT0.Au);
                    if(map1 != null) {
                        com.bytedance.sdk.openadsdk.XX.Zh.PjT().PjT(map1);
                    }
                    if(owx$PjT0.Au.cr() == null || owx$PjT0.Au.cr().isEmpty()) {
                        s2 = s;
                    }
                    else {
                        if(z1) {
                            s2 = s;
                        }
                        else {
                            com.bytedance.sdk.openadsdk.core.model.Owx owx1 = (com.bytedance.sdk.openadsdk.core.model.Owx)owx$PjT0.Au.cr().get(0);
                            s2 = s;
                            this.PjT(zh0.XX(), tT0, co0, co3, owx$PjT0.PjT, co2, owx1, wN.ReZ(v), owx$PjT0.Au.Au());
                        }
                        cz.cr.incrementAndGet();
                    }
                    cz.ReZ();
                    jQp0.PjT(true).PjT(zh0.PjT()).ReZ(s2);
                    return;
                }
                catch(Throwable throwable0) {
                }
                RD.PjT("NetApiImpl", "get ad error: ", throwable0);
                this.PjT(ltE$PjT0, reZ0);
                cz.JQp.incrementAndGet();
                cz.ReZ();
                jQp0.PjT(zh0.cz()).PjT(zh0.PjT()).ReZ(zh0.cr()).cr(throwable0.getMessage());
                return;
            }
            com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                final Owx Zh;

                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                    com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                    pjT0.Zh("get_ad");
                    pjT0.ReZ(adSlot0.getCodeId());
                    pjT0.cr(wN.ReZ(adSlot0.getDurationSlotType()));
                    pjT0.PjT("7.1.0.4");
                    return pjT0;
                }
            });
            int v3 = zh0.PjT();
            String s3 = zh0.Zh();
            ltE$PjT0.PjT(v3, s3);
            reZ0.PjT(v3);
            ReZ.PjT(reZ0);
            cz.Au.incrementAndGet();
            cz.ReZ.incrementAndGet();
            cz.PjT.incrementAndGet();
            cz.JQp();
            cz.PjT(v3, s3);
            cz.ReZ();
            jQp0.PjT(false).PjT(v3).cr(s3).ReZ(zh0.cr());
        }
    }

    private void PjT(DWo dWo0, tT tT0, Co co0, Co co1, int v, Co co2, com.bytedance.sdk.openadsdk.core.model.Owx owx0, String s, boolean z) {
        if(!ub.cr().dwk()) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        long v1 = 0L;
        try {
            if(tT0 != null) {
                Co co3 = tT0.SM;
                if(co3.PjT > 0L) {
                    v1 = co2.PjT(co3);
                }
            }
            Owx.PjT(dWo0, tT0, co0, co1, v, co2, owx0, s, z, jSONObject0, false);
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, s, "load_ad_time", v1, jSONObject0);
        }
        catch(Exception unused_ex) {
        }
    }

    private static void PjT(DWo dWo0, tT tT0, Co co0, Co co1, int v, Co co2, com.bytedance.sdk.openadsdk.core.model.Owx owx0, String s, boolean z, JSONObject jSONObject0, boolean z1) throws JSONException {
        if(tT0 != null) {
            Co co3 = tT0.SM;
            if(co3.PjT > 0L) {
                jSONObject0.put("client_start_time", co0.PjT(co3));
            }
        }
        jSONObject0.put("network_time", co1.PjT(co0));
        jSONObject0.put("sever_time", v);
        jSONObject0.put("client_end_time", co2.PjT(co1));
        if(z) {
            jSONObject0.put("is_choose_ad", true);
        }
        if(s.equals("open_ad")) {
            jSONObject0.put("is_icon_only", ((int)owx0.Pv()));
        }
        if(owx0 != null) {
            jSONObject0.put("render_control_type", owx0.iZZ());
        }
        jSONObject0.put("webview_cache_size", com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().ReZ());
        jSONObject0.put("sync_barrier_open", ((int)z1));
        long v1 = dWo0.Zh;
        if(v1 > 0L) {
            jSONObject0.put("enqueue_2_run_ts", dWo0.ReZ - v1);
            jSONObject0.put("run_2_connect_end_ts", dWo0.JQp - dWo0.Zh);
            jSONObject0.put("connect_end_2_response_end_ts", dWo0.cz - dWo0.JQp);
            jSONObject0.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - dWo0.cz);
        }
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.ltE.PjT ltE$PjT0, ReZ reZ0) {
        ltE$PjT0.PjT(-1, "");
        reZ0.PjT(-1);
        ReZ.PjT(reZ0);
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.ltE.Zh ltE$Zh0) {
        ltE$Zh0.PjT(-1, "");
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.model.Owx owx0, xE xE0) {
        if(xE0 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.SM.cr.PjT(xE0).ReZ(2).PjT(new com.bytedance.sdk.openadsdk.SM.Zh(owx0, xE0.PjT(), new com.bytedance.sdk.component.JQp.xE() {
            final Owx PjT;

            @Override  // com.bytedance.sdk.component.JQp.xE
            public void PjT(int v, String s, @Nullable Throwable throwable0) {
            }

            @Override  // com.bytedance.sdk.component.JQp.xE
            public void PjT(qj qj0) {
            }
        }), 4);
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0) {
        List list0 = pjT0.cr();
        if(list0 != null && list0.size() != 0) {
            for(int v = 0; v < list0.size(); ++v) {
                com.bytedance.sdk.openadsdk.core.model.Owx owx0 = (com.bytedance.sdk.openadsdk.core.model.Owx)list0.get(v);
                if(owx0 != null && owx0.xE() == null) {
                    this.PjT("", 0, 0, owx0.Xe(), owx0);
                    this.PjT("", 0, 0, owx0.kFP(), owx0);
                    List list1 = owx0.CY();
                    if(list1 != null && list1.size() > 0) {
                        for(int v1 = 0; v1 < list1.size(); ++v1) {
                            this.PjT(owx0, ((xE)list1.get(v1)));
                        }
                    }
                    if(owx0.MWx() != null) {
                        this.PjT(owx0.MWx().c(), owx0.MWx().o(), owx0.MWx().w(), null, owx0);
                    }
                }
            }
        }
    }

    private void PjT(IOException iOException0, com.bytedance.sdk.component.XX.Zh zh0, AdSlot adSlot0, com.bytedance.sdk.openadsdk.qla.PjT.JQp jQp0, boolean z, Map map0, com.bytedance.sdk.openadsdk.core.ltE.PjT ltE$PjT0, ReZ reZ0) {
        int v;
        String s;
        com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
            final Owx Zh;

            @Override  // com.bytedance.sdk.openadsdk.ub.cr
            public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                pjT0.Zh("get_ad");
                pjT0.ReZ(adSlot0.getCodeId());
                pjT0.cr(wN.ReZ(adSlot0.getDurationSlotType()));
                pjT0.PjT("7.1.0.4");
                return pjT0;
            }
        });
        jQp0.Zh();
        if(zh0 == null) {
            s = iOException0 == null ? "" : iOException0.getMessage();
        }
        else {
            s = zh0.Zh();
        }
        Co co0 = Co.Zh();
        if(z) {
            map0.put("pgad_end", co0.PjT);
        }
        if(ub.cr().tY() && iZZ.PjT().cr() == 1) {
            wN.PjT("Pangle_Debug_Mode", (iOException0 == null ? null : iOException0.getMessage()), this.PjT);
        }
        if(zh0 == null) {
            v = iOException0 == null || !(iOException0 instanceof SocketTimeoutException) ? 601 : 602;
        }
        else {
            v = zh0.PjT();
        }
        if(ltE$PjT0 != null) {
            ltE$PjT0.PjT(v, s);
        }
        reZ0.PjT(v);
        ReZ.PjT(reZ0);
        cz.ReZ.incrementAndGet();
        cz.PjT.incrementAndGet();
        cz.XX.incrementAndGet();
        cz.JQp();
        cz.PjT(v, s);
        cz.ReZ();
        jQp0.cr(s).PjT(false);
    }

    private void PjT(String s, int v, int v1, xE xE0, com.bytedance.sdk.openadsdk.core.model.Owx owx0) {
        if(!TextUtils.isEmpty(s)) {
            com.bytedance.sdk.openadsdk.SM.cr.PjT(s).PjT(v).Zh(v1).JQp(qZS.JQp(ub.PjT())).cr(qZS.ReZ(ub.PjT())).ReZ(2).PjT(new com.bytedance.sdk.openadsdk.SM.Zh(owx0, s, null), 4);
            return;
        }
        if(xE0 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.SM.cr.PjT(xE0).ReZ(2).PjT(new com.bytedance.sdk.openadsdk.SM.Zh(owx0, xE0.PjT(), null), 4);
    }

    private void PjT(Map map0, cr cr0) {
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                try {
                    cr0.Zh(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue()));
                }
                catch(Exception exception0) {
                    RD.Zh("NetApiImpl", new Object[]{"ADD header exceptopn", exception0.getMessage()});
                }
            }
        }
        try {
            cr0.Zh("User-Agent", wN.ReZ());
        }
        catch(Exception exception1) {
            RD.Zh("NetApiImpl", new Object[]{"ADD header exceptopn", exception1.getMessage()});
        }
    }

    private void PjT(JSONObject jSONObject0, tT tT0) {
        if(tT0 != null) {
            JSONArray jSONArray0 = tT0.JQp;
            if(jSONArray0 != null) {
                try {
                    jSONObject0.put("source_temai_product_ids", jSONArray0);
                }
                catch(Exception unused_ex) {
                }
            }
        }
    }

    private void PjT(JSONObject jSONObject0, String s, float f, float f1) {
        if(f >= 0.0f && f1 >= 0.0f) {
            JSONObject jSONObject1 = new JSONObject();
            JSONArray jSONArray0 = new JSONArray();
            try {
                jSONObject1.put("width", ((int)f));
                jSONObject1.put("height", ((int)f1));
                jSONArray0.put(jSONObject1);
                jSONObject0.put(s, jSONArray0);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    private void PjT(JSONObject jSONObject0, String s, int v, int v1) {
        if(v > 0 && v1 > 0) {
            JSONObject jSONObject1 = new JSONObject();
            JSONArray jSONArray0 = new JSONArray();
            try {
                jSONObject1.put("width", v);
                jSONObject1.put("height", v1);
                jSONArray0.put(jSONObject1);
                jSONObject0.put(s, jSONArray0);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    private static void PjT(JSONObject jSONObject0, String s, String s1) throws JSONException {
        if(!TextUtils.isEmpty(s1)) {
            jSONObject0.put(s, s1);
        }
    }

    private void PjT(JSONObject jSONObject0, boolean z) {
        if(!SM.Zh().Owx()) {
            return;
        }
        try {
            jSONObject0.getJSONObject("header").put("aid", "4562");
        }
        catch(Exception exception0) {
            RD.Zh("NetApiImpl", new Object[]{"reportETEvent error", exception0.getMessage()});
        }
        cr cr0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().Zh();
        cr0.Zh("https://log.byteoversea.com/service/2/app_log_test/");
        byte[] arr_b = null;
        if(z) {
            com.bytedance.sdk.openadsdk.core.settings.cz cz0 = xs.Gr();
            CryptDataScene pangleEncryptConstant$CryptDataScene0 = CryptDataScene.APP_LOG;
            boolean z1 = cz0.PjT(pangleEncryptConstant$CryptDataScene0);
            byte[] arr_b1 = this.JQp(jSONObject0.toString());
            if(z1) {
                Pair pair0 = PangleEncryptManager.encryptType4WithoutBase64(arr_b1);
                if(pair0 == null) {
                label_22:
                    int v = pair0 == null ? 0 : ((int)(((Integer)pair0.first)));
                    Sks.Zh(false);
                    Sks.PjT(1, pangleEncryptConstant$CryptDataScene0, v);
                }
                else {
                    Object object0 = pair0.second;
                    if(object0 != null && ((byte[])object0).length > 0) {
                        arr_b = (byte[])object0;
                        Sks.Zh(true);
                        goto label_25;
                    }
                    goto label_22;
                }
            }
        label_25:
            if(arr_b == null) {
                arr_b = PangleEncryptManager.encryptV3(arr_b1);
                if(arr_b != null) {
                    this.PjT(this.Zh(), cr0);
                    cr0.PjT("application/octet-stream;tt-data=a", arr_b);
                }
            }
            else {
                cr0.Zh("Content-Encoding", "union_sdk_encode");
                cr0.Zh("x-pgli18n", "4");
                cr0.PjT("application/octet-stream;tt-data=a", arr_b);
            }
        }
        if(arr_b == null) {
            JSONObject jSONObject1 = com.bytedance.sdk.component.utils.PjT.PjT(jSONObject0);
            if(this.ReZ(jSONObject1)) {
                jSONObject0 = jSONObject1;
            }
            this.PjT(this.cr(jSONObject0), cr0);
            cr0.PjT(jSONObject0.toString(), ub.cr().xE());
        }
        cr0.PjT(7);
        cr0.PjT("et_applog");
        cr0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
            final Owx PjT;

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                if(zh0 != null) {
                    boolean z = !zh0.cz();
                }
            }

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                iOException0.getMessage();
            }
        });
    }

    private boolean PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, com.bytedance.sdk.openadsdk.core.ltE.PjT ltE$PjT0) {
        if(pjT0 == null) {
            ltE$PjT0.PjT(40053, "The material meta data was incorrect.");
            return true;
        }
        List list0 = pjT0.cr();
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                com.bytedance.sdk.openadsdk.core.model.Owx owx0 = (com.bytedance.sdk.openadsdk.core.model.Owx)object0;
                if(TextUtils.isEmpty(owx0.pz().Zh()) || TextUtils.isEmpty(owx0.pz().ReZ())) {
                    ltE$PjT0.PjT(40053, "The material meta data was incorrect.");
                    com.bytedance.sdk.openadsdk.cr.ReZ.PjT(System.currentTimeMillis(), owx0, wN.PjT(owx0), "material_error", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                        final Owx Zh;

                        @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                        public JSONObject PjT() {
                            JSONObject jSONObject0 = new JSONObject();
                            try {
                                JSONObject jSONObject1 = new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("ad_label", owx0.pz().cz());
                                jSONObject1.put("pag_json_data", jSONObject2.toString());
                                jSONObject0.putOpt("ad_extra_data", jSONObject1.toString());
                            }
                            catch(Exception exception0) {
                                exception0.getMessage();
                            }
                            return jSONObject0;
                        }
                    });
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ltE
    public com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT PjT() {
        com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT pjT0 = null;
        if(!com.bytedance.sdk.openadsdk.core.settings.SM.PjT()) {
            return null;
        }
        long v = System.currentTimeMillis() / 1000L - com.bytedance.sdk.openadsdk.multipro.cr.cr.PjT("tpl_fetch_model", "date", 0L);
        String s = ub.cr().wN();
        boolean z = v > ((long)ub.cr().yIW()) || v < 0L || !TextUtils.equals(s, "");
        try {
            com.bytedance.sdk.component.XX.Zh.Zh zh0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().ReZ();
            String s1 = com.bytedance.sdk.openadsdk.Au.cr.PjT(zh0, s);
            zh0.Zh(s1);
            com.bytedance.sdk.component.XX.Zh zh1 = zh0.PjT();
            if(zh1 != null && zh1.cz()) {
                JSONObject jSONObject0 = new JSONObject(zh1.cr());
                jSONObject0.put("template_fetch_url", s1);
                pjT0 = com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT(jSONObject0);
                com.bytedance.sdk.openadsdk.multipro.cr.cr.PjT("tpl_fetch_model", "date", ((long)(System.currentTimeMillis() / 1000L)));
                com.bytedance.sdk.openadsdk.multipro.cr.cr.PjT("tpl_fetch_model", "model", jSONObject0.toString());
                com.bytedance.sdk.openadsdk.multipro.cr.cr.PjT("tpl_fetch_model", "last_url", s);
                return pjT0;
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("NetApiImpl", throwable0.getMessage());
        }
        return pjT0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ltE
    @WorkerThread
    @DungeonFlag
    public com.bytedance.sdk.openadsdk.cr.JQp PjT(JSONObject jSONObject0, String s, boolean z) {
        boolean z4;
        JSONObject jSONObject1;
        byte[] arr_b1;
        try {
            long v = System.currentTimeMillis();
            String s1 = null;
            if(!com.bytedance.sdk.openadsdk.core.settings.SM.PjT()) {
                return null;
            }
            cr cr0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().Zh();
            cr0.Zh(s);
            if(xs.Gr().wKV()) {
                cr0.Zh("_disable_retry", "1");
            }
            boolean z1 = true;
            if(z) {
                com.bytedance.sdk.openadsdk.core.settings.cz cz0 = xs.Gr();
                CryptDataScene pangleEncryptConstant$CryptDataScene0 = CryptDataScene.APP_LOG;
                boolean z2 = cz0.PjT(pangleEncryptConstant$CryptDataScene0);
                byte[] arr_b = this.JQp(jSONObject0.toString());
                if(z2) {
                    Pair pair0 = PangleEncryptManager.encryptType4WithoutBase64(arr_b);
                    if(pair0 == null) {
                    label_22:
                        int v1 = pair0 == null ? 0 : ((int)(((Integer)pair0.first)));
                        Sks.Zh(false);
                        Sks.PjT(1, pangleEncryptConstant$CryptDataScene0, v1);
                        goto label_25;
                    }
                    else {
                        Object object0 = pair0.second;
                        if(object0 != null && ((byte[])object0).length > 0) {
                            arr_b1 = (byte[])object0;
                            Sks.Zh(true);
                            goto label_26;
                        }
                        goto label_22;
                    }
                }
                else {
                label_25:
                    arr_b1 = null;
                }
            label_26:
                if(arr_b1 == null) {
                    arr_b1 = PangleEncryptManager.encryptV3(arr_b);
                    if(arr_b1 != null) {
                        this.PjT(this.Zh(), cr0);
                        cr0.PjT("application/octet-stream;tt-data=a", arr_b1);
                    }
                }
                else {
                    cr0.Zh("Content-Encoding", "union_sdk_encode");
                    cr0.Zh("x-pgli18n", "4");
                    cr0.PjT("application/octet-stream;tt-data=a", arr_b1);
                }
            }
            else {
                arr_b1 = null;
            }
            if(arr_b1 == null) {
                try {
                    jSONObject1 = com.bytedance.sdk.component.utils.PjT.PjT(jSONObject0);
                }
                catch(OutOfMemoryError outOfMemoryError0) {
                    RD.Zh("NetApiImpl", outOfMemoryError0.toString());
                    return new com.bytedance.sdk.openadsdk.cr.JQp(false, -2, "encrypt_error", false);
                }
                if(!this.ReZ(jSONObject1)) {
                    jSONObject1 = jSONObject0;
                }
                this.PjT(this.cr(jSONObject1), cr0);
                cr0.PjT(jSONObject1.toString(), ub.cr().xE());
            }
            com.bytedance.sdk.openadsdk.qla.PjT.JQp jQp0 = new com.bytedance.sdk.openadsdk.qla.PjT.JQp(3);
            jQp0.PjT(s).PjT(cr0.JQp()).PjT();
            com.bytedance.sdk.component.XX.Zh zh0 = cr0.PjT();
            boolean z3 = zh0 == null || !zh0.cz() || TextUtils.isEmpty(zh0.cr()) ? false : this.JQp(new JSONObject(zh0.cr()));
            String s2 = "error unknown";
            int v2 = zh0 == null ? 0 : zh0.PjT();
            if(z3 || v2 != 200) {
                if(zh0 != null && zh0.Zh() != null) {
                    s2 = zh0.Zh();
                }
                z4 = false;
            }
            else {
                s2 = "server say not success";
                z4 = true;
            }
            boolean z5 = zh0 == null;
            if(z5 || !zh0.cz()) {
                z1 = false;
            }
            com.bytedance.sdk.openadsdk.qla.PjT.JQp jQp1 = jQp0.PjT(z1).ReZ((z5 ? null : zh0.cr())).PjT((z5 ? com.bytedance.sdk.openadsdk.qla.PjT.JQp.PjT : v2));
            if(!z5) {
                s1 = zh0.Zh();
            }
            jQp1.cr(s1);
            this.PjT(jSONObject0, z);
            com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT, z3, v2, System.currentTimeMillis() - v);
            return new com.bytedance.sdk.openadsdk.cr.JQp(z3, v2, s2, z4);
        }
        catch(Throwable throwable0) {
        }
        RD.PjT("NetApiImpl", "uploadEvent error", throwable0);
        return new com.bytedance.sdk.openadsdk.cr.JQp(false, 509, "service_busy", false);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ltE
    public JSONObject PjT(JSONObject jSONObject0) {
        JSONObject jSONObject1;
        String s2;
        String s1;
        if(jSONObject0 == null) {
            return null;
        }
        try {
            int v = jSONObject0.optInt("cypher", -1);
            String s = jSONObject0.optString("message");
            s1 = jSONObject0.optString("auction_price", "");
            s2 = Owx.Zh(v, s);
            if(!TextUtils.isEmpty(s2)) {
                goto label_7;
            }
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
        try {
        label_7:
            jSONObject1 = new JSONObject(s2);
        }
        catch(Throwable unused_ex) {
            return jSONObject0;
        }
        try {
            jSONObject1.put("auction_price", s1);
        }
        catch(Throwable unused_ex) {
        }
        return jSONObject1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ltE
    public void PjT(AdSlot adSlot0, tT tT0, int v, com.bytedance.sdk.openadsdk.core.ltE.PjT ltE$PjT0) {
        com.bytedance.sdk.openadsdk.core.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.PjT.PjT(ltE$PjT0, adSlot0);
        if(tT0 != null && (tT0.Zh == 2 || tT0.ReZ == 2 || tT0.cr == 2)) {
            adSlot0.setPreload(true);
        }
        if(Looper.myLooper() == Looper.getMainLooper()) {
            fDm.Zh().post(new Au("getAd") {
                final Owx JQp;

                @Override
                public void run() {
                    Owx.this.Zh(adSlot0, tT0, v, pjT0);
                }
            });
        }
        else {
            this.Zh(adSlot0, tT0, v, pjT0);
        }
        if(com.bytedance.sdk.openadsdk.RD.PjT.ReZ()) {
            fDm.XX();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ltE
    public void PjT(String s) {
        com.bytedance.sdk.component.XX.Zh.Zh zh0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().ReZ();
        zh0.Zh(s);
        zh0.PjT("upload_bidding");
        zh0.PjT(7);
        zh0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
            final Owx PjT;

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
            }

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ltE
    public void PjT(@NonNull String s, List list0, String s1, String s2, String s3) {
        if(!com.bytedance.sdk.openadsdk.core.settings.SM.PjT()) {
            return;
        }
        JSONObject jSONObject0 = this.Zh(s, list0, s1, s2, s3);
        if(jSONObject0 == null) {
            return;
        }
        cr cr0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().Zh();
        String s4 = wN.cr("/api/ad/union/dislike_event/");
        JSONObject jSONObject1 = Owx.PjT(CryptDataScene.DISLIKE, jSONObject0);
        String s5 = jSONObject1 == null ? null : jSONObject1.toString();
        this.PjT(cr0, jSONObject1);
        cr0.Zh(s4);
        cr0.cr(s5);
        com.bytedance.sdk.openadsdk.qla.PjT.JQp jQp0 = new com.bytedance.sdk.openadsdk.qla.PjT.JQp(6);
        jQp0.PjT(s4).Zh(s5).PjT();
        cr0.PjT(7);
        cr0.PjT("dislike");
        com.bytedance.sdk.openadsdk.ub.ReZ.PjT(new com.bytedance.sdk.openadsdk.ub.cr() {
            final Owx PjT;

            @Override  // com.bytedance.sdk.openadsdk.ub.cr
            public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                pjT0.Zh("dislike");
                return pjT0;
            }
        });
        cr0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
            final Owx Zh;

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                if(zh0 != null) {
                    boolean z = zh0.cz();
                    jQp0.PjT(z).PjT(zh0.PjT()).cr(zh0.Zh()).ReZ(zh0.cr());
                    if(z) {
                        com.bytedance.sdk.openadsdk.ub.ReZ.Zh(new com.bytedance.sdk.openadsdk.ub.cr() {
                            final com.bytedance.sdk.openadsdk.core.Owx.3 PjT;

                            @Override  // com.bytedance.sdk.openadsdk.ub.cr
                            public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                pjT0.Zh("dislike");
                                return pjT0;
                            }
                        });
                        return;
                    }
                    com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                        final com.bytedance.sdk.openadsdk.core.Owx.3 PjT;

                        @Override  // com.bytedance.sdk.openadsdk.ub.cr
                        public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                            com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                            pjT0.Zh("dislike");
                            return pjT0;
                        }
                    });
                    return;
                }
                jQp0.PjT(false).PjT(com.bytedance.sdk.openadsdk.qla.PjT.JQp.PjT);
                com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                    final com.bytedance.sdk.openadsdk.core.Owx.3 PjT;

                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                        pjT0.Zh("dislike");
                        return pjT0;
                    }
                });
            }

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                jQp0.PjT(false).cr((iOException0 == null ? null : iOException0.getMessage()));
                if(reZ0 != null) {
                    com.bytedance.sdk.openadsdk.utils.Owx.PjT(reZ0.cr());
                }
                com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                    final com.bytedance.sdk.openadsdk.core.Owx.3 PjT;

                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                        pjT0.Zh("dislike");
                        return pjT0;
                    }
                });
            }
        });
        try {
            String s6 = new JSONObject(s).optString("cid", "");
            if(!TextUtils.isEmpty(s6)) {
                com.bytedance.sdk.openadsdk.cz.Zh.PjT().PjT("dislike", s6, null, null);
            }
        }
        catch(JSONException jSONException0) {
            RD.Zh(jSONException0.getMessage(), new Object[0]);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ltE
    public void PjT(JSONObject jSONObject0, com.bytedance.sdk.openadsdk.core.ltE.Zh ltE$Zh0) {
        if(!com.bytedance.sdk.openadsdk.core.settings.SM.PjT()) {
            if(ltE$Zh0 != null) {
                ltE$Zh0.PjT(1000, "Ad request is temporarily paused, Please contact your AM");
            }
            return;
        }
        if(jSONObject0 != null && ltE$Zh0 != null) {
            JSONObject jSONObject1 = Owx.PjT(CryptDataScene.REWARD_VERIFY, jSONObject0);
            com.bytedance.sdk.openadsdk.qla.PjT.JQp jQp0 = new com.bytedance.sdk.openadsdk.qla.PjT.JQp(5);
            cr cr0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().Zh();
            try {
                String s = com.bytedance.sdk.openadsdk.Au.cr.PjT(cr0, wN.cr("/api/ad/union/sdk/reward_video/reward/"));
                cr0.Zh(s);
                jQp0.PjT(s);
            }
            catch(Exception exception0) {
                RD.Zh("NetApiImpl", exception0.getMessage());
            }
            this.PjT(cr0, jSONObject1);
            cr0.cr((jSONObject1 == null ? "" : jSONObject1.toString()));
            jQp0.PjT(cr0.JQp()).PjT();
            cr0.PjT(10);
            cr0.PjT("reward");
            com.bytedance.sdk.openadsdk.ub.ReZ.PjT(new com.bytedance.sdk.openadsdk.ub.cr() {
                final Owx PjT;

                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                    com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                    pjT0.Zh("reward");
                    return pjT0;
                }
            });
            cr0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
                final Owx ReZ;

                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                    String s;
                    JSONObject jSONObject0;
                    if(zh0 != null) {
                        if(zh0.cz() && !TextUtils.isEmpty(zh0.cr())) {
                            jQp0.PjT(true).PjT(zh0.PjT()).ReZ(zh0.cr());
                            try {
                                jSONObject0 = new JSONObject(zh0.cr());
                                s = Owx.Zh(jSONObject0.optInt("cypher", -1), jSONObject0.optString("message"));
                                if(!TextUtils.isEmpty(s)) {
                                    goto label_6;
                                }
                                goto label_7;
                            }
                            catch(JSONException jSONException0) {
                                RD.Zh("NetApiImpl", jSONException0.getMessage());
                                Owx.this.PjT(ltE$Zh0);
                                com.bytedance.sdk.openadsdk.ub.ReZ.Zh(new com.bytedance.sdk.openadsdk.ub.cr() {
                                    final com.bytedance.sdk.openadsdk.core.Owx.5 PjT;

                                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                        pjT0.Zh("reward");
                                        return pjT0;
                                    }
                                });
                                return;
                            }
                            try {
                            label_6:
                                jSONObject0 = new JSONObject(s);
                            }
                            catch(Throwable unused_ex) {
                            }
                            try {
                            label_7:
                                com.bytedance.sdk.openadsdk.core.Owx.Zh owx$Zh0 = com.bytedance.sdk.openadsdk.core.Owx.Zh.PjT(jSONObject0);
                                int v = owx$Zh0.PjT;
                                if(v != 20000) {
                                    String s1 = com.bytedance.sdk.openadsdk.core.Au.PjT(v);
                                    ltE$Zh0.PjT(v, s1);
                                    return;
                                }
                                if(owx$Zh0.ReZ == null) {
                                    Owx.this.PjT(ltE$Zh0);
                                    return;
                                }
                                ltE$Zh0.PjT(owx$Zh0);
                            }
                            catch(JSONException jSONException0) {
                                RD.Zh("NetApiImpl", jSONException0.getMessage());
                                Owx.this.PjT(ltE$Zh0);
                            }
                            com.bytedance.sdk.openadsdk.ub.ReZ.Zh(new com.bytedance.sdk.openadsdk.ub.cr() {
                                final com.bytedance.sdk.openadsdk.core.Owx.5 PjT;

                                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                    com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                    pjT0.Zh("reward");
                                    return pjT0;
                                }
                            });
                            return;
                        }
                        jQp0.PjT(zh0.cz()).ReZ(zh0.cr()).PjT(zh0.PjT()).cr(zh0.Zh());
                        String s2 = "";
                        int v1 = zh0.PjT();
                        if(!zh0.cz() && !TextUtils.isEmpty(zh0.Zh())) {
                            s2 = zh0.Zh();
                        }
                        ltE$Zh0.PjT(v1, s2);
                        com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                            final com.bytedance.sdk.openadsdk.core.Owx.5 PjT;

                            @Override  // com.bytedance.sdk.openadsdk.ub.cr
                            public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                pjT0.Zh("reward");
                                return pjT0;
                            }
                        });
                        return;
                    }
                    com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                        final com.bytedance.sdk.openadsdk.core.Owx.5 PjT;

                        @Override  // com.bytedance.sdk.openadsdk.ub.cr
                        public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                            com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                            pjT0.Zh("reward");
                            return pjT0;
                        }
                    });
                    jQp0.PjT(false).PjT(com.bytedance.sdk.openadsdk.qla.PjT.JQp.PjT);
                    Owx.this.PjT(ltE$Zh0);
                }

                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                    String s = iOException0 == null ? "" : iOException0.getMessage();
                    jQp0.PjT(false).cr(s);
                    ltE$Zh0.PjT(-2, s);
                    if(reZ0 != null) {
                        com.bytedance.sdk.openadsdk.utils.Owx.PjT(reZ0.cr());
                    }
                    com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                        final com.bytedance.sdk.openadsdk.core.Owx.5 PjT;

                        @Override  // com.bytedance.sdk.openadsdk.ub.cr
                        public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                            com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                            pjT0.Zh("reward");
                            return pjT0;
                        }
                    });
                }
            });
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ltE
    public void PjT(JSONObject jSONObject0, String s) {
        cr cr0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().Zh();
        cr0.Zh(s);
        Pair pair0 = ApmHelper.generateRequestHeader();
        cr0.Zh("cypher", ((String)pair0.first));
        cr0.Zh("transfer-param", ((String)pair0.second));
        cr0.PjT(jSONObject0);
        cr0.PjT(5);
        cr0.PjT("apm_pv");
        cr0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
            final Owx PjT;

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
            }

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
            }
        });
    }

    public static JSONArray ReZ(String s) {
        try {
            Set set0 = com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh.PjT().PjT(s);
            if(set0 != null && set0.size() != 0) {
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: set0) {
                    com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT pjT0 = (com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT)object0;
                    if(pjT0 != null && !TextUtils.isEmpty(pjT0.JQp())) {
                        JSONObject jSONObject0 = new JSONObject();
                        String[] arr_s = pjT0.PjT().split("_");
                        if(arr_s.length == 2) {
                            jSONObject0.put("id", arr_s[1]);
                            jSONObject0.put("md5", pjT0.Zh());
                            jSONArray0.put(jSONObject0);
                        }
                    }
                }
                return jSONArray0;
            }
        }
        catch(Exception exception0) {
            RD.PjT("NetApiImpl", "getUgenParentTplIds: ", exception0);
        }
        return null;
    }

    @DungeonFlag
    private JSONObject ReZ() {
        String s;
        Context context0;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("appid", SM.Zh().cr());
            jSONObject0.put("name", "");
            this.cz(jSONObject0);
            context0 = ub.PjT();
            s = "";
            if(context0 != null) {
                s = context0.getPackageResourcePath();
            }
            goto label_11;
        }
        catch(JSONException unused_ex) {
            return jSONObject0;
        }
        try {
            s = context0.getPackageResourcePath();
            goto label_11;
        }
        catch(Throwable throwable0) {
            try {
                RD.Zh("NetApiImpl", "failed to get the application installation package path. error: " + throwable0.getMessage());
            label_11:
                jSONObject0.put("package_install_path", s);
                jSONObject0.put("is_paid_app", SM.Zh().xs());
                jSONObject0.put("apk_sign", "");
                jSONObject0.put("app_running_time", System.currentTimeMillis() / 1000L);
                jSONObject0.put("fmwname", DeviceUtils.qj(this.PjT));
                int v = 0;
                jSONObject0.put("is_init", 0);
                if(context0 != null) {
                    switch(((WindowManager)context0.getSystemService("window")).getDefaultDisplay().getRotation()) {
                        case 0: {
                            v = 1;
                            jSONObject0.put("orientation_support", new JSONArray().put(v));
                            return jSONObject0;
                        }
                        case 1: {
                            v = 3;
                            jSONObject0.put("orientation_support", new JSONArray().put(v));
                            return jSONObject0;
                        }
                        case 2: {
                            v = 2;
                            jSONObject0.put("orientation_support", new JSONArray().put(v));
                            return jSONObject0;
                        }
                        case 3: {
                            v = 4;
                            jSONObject0.put("orientation_support", new JSONArray().put(v));
                            return jSONObject0;
                        }
                    }
                    jSONObject0.put("orientation_support", new JSONArray().put(v));
                    return jSONObject0;
                }
            }
            catch(JSONException unused_ex) {
            }
            return jSONObject0;
        }
    }

    private boolean ReZ(JSONObject jSONObject0) {
        return jSONObject0 != null && jSONObject0.length() > 0;
    }

    @Nullable
    private static String Zh(int v, String s) {
        switch(v) {
            case 3: {
                return com.bytedance.sdk.component.utils.PjT.ReZ(s);
            }
            case 4: {
                Pair pair0 = PangleEncryptManager.decryptType4(s);
                if(pair0 != null) {
                    Object object0 = pair0.second;
                    if(object0 != null) {
                        Sks.PjT(true);
                        return (String)object0;
                    }
                }
                int v1 = 0;
                Sks.PjT(false);
                if(pair0 != null) {
                    v1 = (int)(((Integer)pair0.first));
                }
                Sks.PjT(2, CryptDataScene.GET_ADS, v1);
                return null;
            }
            default: {
                return null;
            }
        }
    }

    private static String Zh(AdSlot adSlot0) {
        JSONArray jSONArray0;
        String s = SM.Zh().qla();
        if(adSlot0 == null) {
            return TextUtils.isEmpty(s) ? "" : s;
        }
        String s1 = adSlot0.getUserData();
        if(TextUtils.isEmpty(s)) {
            return s1;
        }
        if(TextUtils.isEmpty(s1)) {
            return s;
        }
        HashSet hashSet0 = new HashSet();
        try {
            jSONArray0 = new JSONArray(s1);
            int v = jSONArray0.length();
            for(int v2 = 0; v2 < v; ++v2) {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v2);
                if(jSONObject0 != null) {
                    hashSet0.add(jSONObject0.optString("name", null));
                }
            }
        }
        catch(Throwable unused_ex) {
            return s;
        }
        try {
            JSONArray jSONArray1 = new JSONArray(s);
            int v3 = jSONArray1.length();
            for(int v1 = 0; v1 < v3; ++v1) {
                JSONObject jSONObject1 = jSONArray1.getJSONObject(v1);
                if(jSONObject1 != null && !hashSet0.contains(jSONObject1.optString("name", null))) {
                    jSONArray0.put(jSONObject1);
                }
            }
            return jSONArray0.toString();
        }
        catch(Throwable unused_ex) {
            return s1;
        }
    }

    @NonNull
    private Map Zh() {
        Map map0 = new HashMap();
        map0.put("Content-Type", "application/octet-stream;tt-data=a");
        return map0;
    }

    public static JSONArray Zh(String s) {
        try {
            Set set0 = com.bytedance.sdk.component.adexpress.PjT.Zh.Zh.Zh(s);
            if(set0 != null && set0.size() != 0) {
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: set0) {
                    com.bytedance.sdk.component.adexpress.PjT.ReZ.Zh zh0 = com.bytedance.sdk.component.adexpress.PjT.Zh.Zh.PjT(((String)object0));
                    if(zh0 != null) {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("id", zh0.Zh());
                        jSONObject0.put("md5", zh0.ReZ());
                        jSONArray0.put(jSONObject0);
                    }
                }
                return jSONArray0;
            }
        }
        catch(Exception exception0) {
            RD.PjT("NetApiImpl", "getParentTplIds: ", exception0);
        }
        return null;
    }

    @DungeonFlag
    private JSONObject Zh(@NonNull String s, List list0, String s1, String s2, String s3) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("timestamp", System.currentTimeMillis());
            jSONObject1.put("ad_sdk_version", "7.1.0.4");
            JSONObject jSONObject2 = new JSONObject(s);
            jSONObject2.put("gaid", com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh());
            jSONObject1.put("extra", jSONObject2.toString());
            jSONObject1.put("filter_words", this.PjT(list0));
            jSONObject1.put("dislike_source", s3);
            if(xs.Gr().VY() && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
                jSONObject1.put("creative_info", com.bytedance.sdk.component.utils.PjT.PjT(new JSONObject(s1)).toString());
                jSONObject1.put("feedback_type", 1);
                jSONObject1.put("user_description", s2);
            }
            JSONArray jSONArray0 = new JSONArray();
            jSONArray0.put(jSONObject1);
            jSONObject0.put("actions", jSONArray0);
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    private void Zh(AdSlot adSlot0, tT tT0, int v, com.bytedance.sdk.openadsdk.core.ltE.PjT ltE$PjT0) {
        com.bytedance.sdk.openadsdk.qla.PjT.JQp jQp1;
        Map map3;
        com.bytedance.sdk.component.XX.Zh zh0;
        if(!ub.cr().oMU()) {
            ltE$PjT0.PjT(40060, "Appid is not registered on pangle media platform");
            return;
        }
        boolean z = com.bytedance.sdk.openadsdk.RD.PjT.ReZ();
        if(!z) {
            fDm.cz();
        }
        ReZ reZ0 = new ReZ();
        reZ0.PjT(adSlot0);
        if(!com.bytedance.sdk.openadsdk.core.settings.SM.PjT()) {
            if(ltE$PjT0 != null) {
                ltE$PjT0.PjT(1000, "Ad request is temporarily paused, Please contact your AM");
                reZ0.PjT(1000);
                ReZ.PjT(reZ0);
            }
            return;
        }
        if(!ub.cr().rds()) {
            if(ltE$PjT0 != null) {
                ltE$PjT0.PjT(-16, "");
                reZ0.PjT(1001);
                ReZ.PjT(reZ0);
            }
            return;
        }
        if(ltE$PjT0 == null) {
            return;
        }
        if(this.cr(adSlot0.getCodeId())) {
            ltE$PjT0.PjT(-8, "");
            return;
        }
        if(!TextUtils.isEmpty(adSlot0.getBidAdm()) && !tT0.cz) {
            reZ0.Zh(2);
            reZ0.PjT(adSlot0.getBidAdm());
            if(ub.cr().tY() && iZZ.PjT().cr() == 1) {
                wN.PjT("Pangle_Debug_Mode", adSlot0.getBidAdm(), this.PjT);
            }
            try {
                JSONObject jSONObject0 = this.PjT(new JSONObject(adSlot0.getBidAdm()));
                if(jSONObject0 == null) {
                    this.PjT(ltE$PjT0, reZ0);
                    return;
                }
                PjT owx$PjT0 = PjT.PjT(jSONObject0, adSlot0, tT0, reZ0);
                reZ0.PjT(owx$PjT0.DWo);
                xf.PjT(this.PjT, owx$PjT0.SM);
                int v1 = owx$PjT0.cr;
                if(v1 != 20000) {
                    ltE$PjT0.PjT(v1, owx$PjT0.JQp);
                    reZ0.PjT(owx$PjT0.cr);
                    ReZ.PjT(reZ0);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.PjT pjT0 = owx$PjT0.Au;
                if(pjT0 == null) {
                    this.PjT(ltE$PjT0, reZ0);
                    return;
                }
                if(pjT0.cr() != null && owx$PjT0.Au.cr().size() > 0) {
                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT(((com.bytedance.sdk.openadsdk.core.model.Owx)owx$PjT0.Au.cr().get(0)));
                }
                if(this.PjT(owx$PjT0.Au, ltE$PjT0)) {
                    return;
                }
                owx$PjT0.Au.ReZ(jSONObject0.toString());
                ltE$PjT0.PjT(owx$PjT0.Au, reZ0);
                Map map0 = com.bytedance.sdk.openadsdk.core.model.PjT.PjT(owx$PjT0.Au);
                if(map0 != null) {
                    com.bytedance.sdk.openadsdk.XX.Zh.PjT().PjT(map0);
                }
                this.PjT(owx$PjT0.Au);
                com.bytedance.sdk.openadsdk.core.cr.PjT.PjT().PjT(owx$PjT0.Au);
                return;
            }
            catch(Throwable throwable0) {
            }
            RD.PjT("NetApiImpl", "get ad error: ", throwable0);
            this.PjT(ltE$PjT0, reZ0);
            return;
        }
        JSONObject jSONObject1 = this.PjT(adSlot0, tT0, v);
        if(jSONObject1 == null) {
            ltE$PjT0.PjT(-9, "");
            reZ0.PjT(-9);
            ReZ.PjT(reZ0);
            return;
        }
        if(ub.cr().tY() && iZZ.PjT().cr() == 1) {
            wN.PjT("Pangle_Debug_Mode", jSONObject1.toString(), this.PjT);
        }
        String s = wN.PjT("/api/ad/union/sdk/get_ads/", true, false);
        cr cr0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().Zh();
        com.bytedance.sdk.openadsdk.qla.PjT.JQp jQp0 = new com.bytedance.sdk.openadsdk.qla.PjT.JQp(2);
        try {
            String s1 = com.bytedance.sdk.openadsdk.Au.cr.PjT(cr0, s);
            cr0.Zh(s1);
            jQp0.PjT(s1);
        }
        catch(Exception unused_ex) {
        }
        cr0.PjT(jSONObject1.toString(), ub.cr().xE());
        jQp0.PjT(cr0.JQp()).PjT();
        Map map1 = com.bytedance.sdk.openadsdk.core.SM.ReZ.PjT(s, jSONObject1.toString());
        if(map1 != null && map1.size() > 0) {
            for(Object object0: map1.keySet()) {
                String s2 = (String)object0;
                try {
                    cr0.Zh(s2, ((String)map1.get(s2)));
                }
                catch(Exception exception0) {
                    RD.Zh("NetApiImpl", exception0.getMessage());
                }
            }
        }
        try {
            cr0.Zh("User-Agent", wN.ReZ());
            this.PjT(cr0, jSONObject1);
        }
        catch(Exception unused_ex) {
        }
        Co co0 = Co.Zh();
        Map map2 = adSlot0.getRequestExtraMap();
        boolean z1 = SM.Zh().ltE() && map2 != null;
        if(z1) {
            map2.put("pgad_start", co0);
        }
        cr0.PjT(10);
        cr0.PjT("get_ad");
        com.bytedance.sdk.openadsdk.ub.ReZ.PjT(new com.bytedance.sdk.openadsdk.ub.cr() {
            final Owx Zh;

            @Override  // com.bytedance.sdk.openadsdk.ub.cr
            public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                pjT0.Zh("get_ad");
                pjT0.ReZ(adSlot0.getCodeId());
                pjT0.cr(wN.ReZ(adSlot0.getDurationSlotType()));
                return pjT0;
            }
        });
        if(!z) {
            cr0.PjT(new com.bytedance.sdk.component.XX.PjT.Zh() {
                final Owx DWo;

                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                    Owx.this.PjT(zh0, jQp0, z1, map2, co0, adSlot0, reZ0, ltE$PjT0, tT0, v);
                }

                @Override  // com.bytedance.sdk.component.XX.PjT.Zh
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0, com.bytedance.sdk.component.XX.Zh zh0) {
                    Owx.this.PjT(iOException0, zh0, adSlot0, jQp0, z1, map2, ltE$PjT0, reZ0);
                    if(reZ0 != null) {
                        com.bytedance.sdk.openadsdk.utils.Owx.PjT(reZ0.cr());
                    }
                }
            });
            return;
        }
        try {
            zh0 = cr0.PjT();
            if(zh0 == null) {
                zh0 = new com.bytedance.sdk.component.XX.Zh(false, 5001, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L);
            }
            if(zh0.cz()) {
                goto label_112;
            }
            goto label_116;
        }
        catch(Throwable throwable1) {
            map3 = map2;
            jQp1 = jQp0;
            goto label_122;
        }
        try {
        label_112:
            map3 = map2;
            jQp1 = jQp0;
            this.PjT(zh0, jQp0, z1, map2, co0, adSlot0, reZ0, ltE$PjT0, tT0, v);
            return;
        label_116:
            map3 = map2;
            jQp1 = jQp0;
            this.PjT(new IOException(zh0.Zh()), zh0, adSlot0, jQp1, z1, map3, ltE$PjT0, reZ0);
            com.bytedance.sdk.openadsdk.utils.Owx.PjT(cr0.cr());
            return;
        }
        catch(Throwable throwable1) {
        }
    label_122:
        com.bytedance.sdk.component.XX.Zh zh1 = new com.bytedance.sdk.component.XX.Zh(false, 5002, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L);
        this.PjT(new IOException(throwable1.getMessage()), zh1, adSlot0, jQp1, z1, map3, ltE$PjT0, reZ0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ltE
    public com.bytedance.sdk.openadsdk.cr.JQp Zh(JSONObject jSONObject0) {
        int v2;
        boolean z2;
        boolean z1;
        String s = "error unknown";
        long v = System.currentTimeMillis();
        String s1 = null;
        if(com.bytedance.sdk.openadsdk.core.settings.SM.PjT() && ub.cr().oMU() && jSONObject0 != null && jSONObject0.length() > 0) {
            com.bytedance.sdk.openadsdk.qla.PjT.JQp jQp0 = new com.bytedance.sdk.openadsdk.qla.PjT.JQp(4);
            cr cr0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().Zh();
            boolean z = false;
            try {
                JSONObject jSONObject1 = Owx.PjT(CryptDataScene.STATS_LOG, jSONObject0);
                cr0.PjT(jSONObject1.toString(), ub.cr().xE());
                String s2 = wN.cr("/api/ad/union/sdk/stats/batch/");
                jQp0.PjT(s2).PjT(cr0.JQp()).PjT();
                cr0.Zh(s2);
                this.PjT(cr0, jSONObject1);
                cr0.Zh("User-Agent", wN.ReZ());
                if(xs.Gr().yks()) {
                    cr0.Zh("_disable_retry", "1");
                }
            }
            catch(Throwable unused_ex) {
                com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.Zh, false, 0, System.currentTimeMillis() - v);
                return new com.bytedance.sdk.openadsdk.cr.JQp(false, 0, "error unknown", false);
            }
            com.bytedance.sdk.component.XX.Zh zh0 = cr0.PjT();
            try {
                if(zh0 == null) {
                    return new com.bytedance.sdk.openadsdk.cr.JQp(false, 0, "error unknown", false);
                }
                if(!zh0.cz() || TextUtils.isEmpty(zh0.cr())) {
                    z1 = false;
                    goto label_39;
                }
                else {
                    JSONObject jSONObject2 = new JSONObject(zh0.cr());
                    int v1 = jSONObject2.optInt("code", -1);
                    s = jSONObject2.optString("data", "");
                    z1 = v1 == 20000;
                    if(v1 == 60005) {
                        z2 = true;
                    }
                    else {
                        goto label_39;
                    }
                }
                goto label_40;
            }
            catch(Throwable unused_ex) {
                z1 = false;
                z2 = false;
                v2 = 0;
                goto label_44;
            }
        label_39:
            z2 = false;
        label_40:
            v2 = zh0.PjT();
            if(!zh0.cz()) {
                try {
                    s = zh0.Zh();
                    com.bytedance.sdk.openadsdk.utils.Owx.PjT(cr0.cr());
                }
                catch(Throwable unused_ex) {
                }
            }
        label_44:
            boolean z3 = zh0 == null;
            if(!z3 && zh0.cz()) {
                z = true;
            }
            com.bytedance.sdk.openadsdk.qla.PjT.JQp jQp1 = jQp0.PjT(z).ReZ((z3 ? null : zh0.cr())).PjT((z3 ? com.bytedance.sdk.openadsdk.qla.PjT.JQp.PjT : v2));
            if(!z3) {
                s1 = zh0.Zh();
            }
            jQp1.cr(s1);
            com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.Zh, z1, v2, System.currentTimeMillis() - v);
            return new com.bytedance.sdk.openadsdk.cr.JQp(z1, v2, s, z2);
        }
        return null;
    }

    @NonNull
    private Map cr(JSONObject jSONObject0) {
        Map map0 = new HashMap();
        map0.put("Content-Type", "application/json; charset=utf-8");
        if(this.ReZ(jSONObject0)) {
            map0.put("Content-Encoding", "union_sdk_encode");
        }
        return map0;
    }

    private boolean cr(String s) {
        if(com.bytedance.sdk.openadsdk.core.XX.Zh.PjT()) {
            return true;
        }
        if(com.bytedance.sdk.openadsdk.core.XX.Zh.PjT(s)) {
            String s1 = com.bytedance.sdk.openadsdk.core.XX.Zh.Zh();
            if(!TextUtils.isEmpty(s1)) {
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(s1, System.currentTimeMillis());
            }
            return true;
        }
        return false;
    }

    @DungeonFlag
    private void cz(JSONObject jSONObject0) {
        try {
            jSONObject0.put("package_name", wN.JQp());
            jSONObject0.put("version_code", wN.cz());
            jSONObject0.put("version", wN.XX());
        }
        catch(Exception unused_ex) {
        }
    }
}

