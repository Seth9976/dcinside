package com.bytedance.sdk.openadsdk.cr.JQp.PjT;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.cr.JQp.Zh.Au;
import com.bytedance.sdk.openadsdk.cr.JQp.Zh.JQp;
import com.bytedance.sdk.openadsdk.cr.JQp.Zh.cz;
import com.bytedance.sdk.openadsdk.cr.JQp.Zh.fDm;
import com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla;
import com.bytedance.sdk.openadsdk.cr.JQp.Zh.xs;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.qla.Zh;
import com.bytedance.sdk.openadsdk.utils.wN;
import j..util.DesugarCollections;
import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import v.b;
import v.c;
import w.a;

public class PjT {
    private static final Map PjT;

    static {
        PjT.PjT = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public static void JQp(a a0, com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0) {
        if(a0 == null || qla$PjT0 == null || qla$PjT0.SM() <= 0) {
            return;
        }
        qla qla0 = (qla)PjT.PjT.get(a0);
        if(qla0 == null) {
            return;
        }
        b b0 = qla0.cr();
        Owx owx0 = qla0.JQp();
        if(b0 != null && owx0 != null) {
            xs xs0 = new xs();
            xs0.PjT(qla$PjT0.Zh());
            xs0.Zh(qla$PjT0.ReZ());
            xs0.PjT(qla$PjT0.SM());
            JSONObject jSONObject0 = PjT.PjT(owx0, qla0.Zh(), qla0.ReZ(), b0);
            int v = b0.cr;
            if(v > 0) {
                try {
                    jSONObject0.put("play_time", v);
                }
                catch(JSONException jSONException0) {
                    RD.PjT("TTAD.VideoEventManager", "", jSONException0);
                }
            }
            com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, wN.PjT(owx0), jSONObject0, xs0);
            pjT0.PjT(qla$PjT0.DWo());
            PjT.PjT(pjT0, "play_buffer");
        }
    }

    public static JSONObject PjT(Owx owx0, String s, int v, b b0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("session_id", s);
            }
            if(v > 0) {
                jSONObject0.put("play_type", String.valueOf(v));
            }
            if(owx0 != null) {
                c c0 = owx0.MWx();
                if(c0 != null) {
                    jSONObject0.put("video_resolution", c0.r());
                    jSONObject0.put("video_size", c0.e());
                    jSONObject0.put("video_url", c0.I());
                    jSONObject0.put("player_type", b0.qla());
                    jSONObject0.put("video_encode_type", ((int)b0.qj()));
                }
                jSONObject0.put("dp_creative_type", owx0.cyr());
                return jSONObject0;
            }
        }
        catch(JSONException jSONException0) {
            RD.PjT("TTAD.VideoEventManager", "", jSONException0);
        }
        return jSONObject0;
    }

    public static void PjT(Context context0, a a0, com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0, XX xX0) {
        if(context0 != null && a0 != null && qla$PjT0 != null) {
            qla qla0 = (qla)PjT.PjT.get(a0);
            if(qla0 == null) {
                return;
            }
            b b0 = qla0.cr();
            Owx owx0 = qla0.JQp();
            if(b0 != null && owx0 != null) {
                if(!qla$PjT0.DWo()) {
                    PjT.PjT(owx0, b0, qla$PjT0);
                }
                Au au0 = new Au();
                au0.PjT(((int)qla$PjT0.qj()));
                au0.Zh(CacheDirFactory.getICacheDir(owx0.hx()).Zh(b0));
                au0.PjT(SystemClock.elapsedRealtime() - qla0.PjT());
                JSONObject jSONObject0 = PjT.PjT(owx0, qla0.Zh(), qla0.ReZ(), b0);
                int v = b0.cr;
                if(v > 0) {
                    try {
                        jSONObject0.put("play_time", v);
                    }
                    catch(JSONException jSONException0) {
                        RD.PjT("TTAD.VideoEventManager", "", jSONException0);
                    }
                }
                com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, wN.PjT(owx0), jSONObject0, au0);
                pjT0.PjT(qla$PjT0.DWo());
                PjT.PjT(pjT0, "feed_play", xX0);
            }
        }
    }

    private static void PjT(Owx owx0, b b0, com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0) {
        ReZ.PjT();
        ReZ.PjT("pangle_video_play_state", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("service_duration", PjT.ReZ(b0));
                jSONObject0.put("player_duration", qla$PjT0.ReZ());
                jSONObject0.put("cache_path_type", 1);
                jSONObject0.put("url", b0.xs());
                jSONObject0.put("path", PjT.cr(b0));
                jSONObject0.put("player_type", b0.qla());
                cr cr0 = cr.Zh().PjT("pangle_video_play_state");
                return owx0 == null ? cr0.PjT(0).Zh(jSONObject0.toString()) : cr0.PjT(owx0.XWz()).Zh(jSONObject0.toString());
            }
        });
    }

    public static void PjT(Owx owx0, a a0, b b0) {
        boolean z = true;
        if(owx0 != null && a0 != null && b0 != null) {
            int v = CacheDirFactory.getICacheDir(owx0.hx()).PjT(b0) ? 1 : 2;
            qla qla0 = new qla(SystemClock.elapsedRealtime(), "31f08919-0107-46b0-8880-2a411115feec", v, b0, owx0);
            PjT.PjT.put(a0, qla0);
            JSONObject jSONObject0 = PjT.PjT(owx0, "31f08919-0107-46b0-8880-2a411115feec", v, b0);
            String s = wN.PjT(owx0);
            try {
                int v1 = b0.cr;
                if(v1 > 0) {
                    jSONObject0.put("play_time", v1);
                }
                jSONObject0.put("is_mute", ((int)b0.Au()));
            }
            catch(JSONException jSONException0) {
                RD.PjT("TTAD.VideoEventManager", "", jSONException0);
            }
            com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, s, jSONObject0, null);
            if(b0.qla() != -1) {
                z = false;
            }
            pjT0.PjT(z);
            PjT.PjT(pjT0, "play_start");
        }
    }

    public static void PjT(com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0) {
        ReZ.PjT("load_video_error", pjT0);
    }

    private static void PjT(com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0, String s) {
        PjT.PjT(pjT0, s, null, null);
    }

    private static void PjT(com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0, String s, XX xX0) {
        PjT.PjT(pjT0, s, null, xX0);
    }

    private static void PjT(com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0, String s, JSONObject jSONObject0) {
        PjT.PjT(pjT0, s, jSONObject0, null);
    }

    private static void PjT(com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0, String s, JSONObject jSONObject0, XX xX0) {
        if(pjT0 == null) {
            return;
        }
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        if(pjT0.JQp() && !TextUtils.isEmpty(pjT0.Zh())) {
            String s1 = pjT0.Zh();
            s1.hashCode();
            if(s1.equals("stream") || s1.equals("embeded_ad")) {
                s = "customer_" + s;
            }
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(System.currentTimeMillis(), pjT0.PjT(), pjT0.Zh(), s, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                try {
                    JSONObject jSONObject0 = pjT0.ReZ();
                    if(pjT0.cr() != null) {
                        pjT0.cr().PjT(jSONObject0);
                    }
                    if("feed_play".equals(s) || "feed_over".equals(s) || "feed_break".equals(s)) {
                        XX xX0 = xX0;
                        if(xX0 != null) {
                            xX0.PjT(jSONObject0);
                        }
                    }
                    jSONObject0.put("ad_extra_data", jSONObject0.toString());
                }
                catch(Throwable unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void PjT(a a0, com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0) {
        if(a0 != null && qla$PjT0 != null) {
            qla qla0 = (qla)PjT.PjT.get(a0);
            if(qla0 == null) {
                return;
            }
            b b0 = qla0.cr();
            Owx owx0 = qla0.JQp();
            if(b0 != null && owx0 != null) {
                long v = qla$PjT0.PjT();
                long v1 = qla$PjT0.ReZ();
                if(v1 > 0L && v > 0L) {
                    com.bytedance.sdk.openadsdk.cr.JQp.Zh.XX xX0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.XX();
                    xX0.PjT(qla$PjT0.Zh());
                    xX0.Zh(v1);
                    JSONObject jSONObject0 = PjT.PjT(owx0, qla0.Zh(), qla0.ReZ(), b0);
                    int v2 = b0.cr;
                    if(v2 > 0) {
                        try {
                            jSONObject0.put("play_time", v2);
                        }
                        catch(JSONException jSONException0) {
                            RD.PjT("TTAD.VideoEventManager", "", jSONException0);
                        }
                    }
                    com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, wN.PjT(owx0), jSONObject0, xX0);
                    pjT0.PjT(qla$PjT0.DWo());
                    try {
                        JSONObject jSONObject1 = new JSONObject();
                        jSONObject1.put("duration", v);
                        jSONObject1.put("percent", qla$PjT0.cz());
                        PjT.PjT(pjT0, "feed_pause", jSONObject1);
                    }
                    catch(JSONException jSONException1) {
                        RD.PjT("TTAD.VideoEventManager", "", jSONException1);
                    }
                }
            }
        }
    }

    public static void PjT(a a0, com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0, XX xX0) {
        if(a0 != null && qla$PjT0 != null) {
            qla qla0 = (qla)PjT.PjT.get(a0);
            if(qla0 == null) {
                return;
            }
            b b0 = qla0.cr();
            Owx owx0 = qla0.JQp();
            if(b0 != null && owx0 != null) {
                long v = qla$PjT0.PjT();
                com.bytedance.sdk.openadsdk.cr.JQp.Zh.cr cr0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.cr();
                cr0.Zh(qla$PjT0.Zh());
                cr0.PjT(qla$PjT0.ReZ());
                cr0.PjT(qla$PjT0.XX());
                cr0.Zh(qla$PjT0.Au());
                JSONObject jSONObject0 = PjT.PjT(owx0, qla0.Zh(), qla0.ReZ(), b0);
                int v1 = b0.cr;
                if(v1 > 0) {
                    try {
                        jSONObject0.put("play_time", v1);
                    }
                    catch(JSONException jSONException0) {
                        RD.PjT("TTAD.VideoEventManager", "", jSONException0);
                    }
                }
                com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, wN.PjT(owx0), jSONObject0, cr0);
                pjT0.PjT(qla$PjT0.DWo());
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("duration", v);
                    jSONObject1.put("percent", qla$PjT0.cz());
                    PjT.PjT(pjT0, "feed_break", jSONObject1, xX0);
                }
                catch(JSONException jSONException1) {
                    RD.PjT("TTAD.VideoEventManager", "", jSONException1);
                }
            }
        }
    }

    public static void PjT(a a0, boolean z, String s) {
        if(a0 == null) {
            return;
        }
        qla qla0 = (qla)PjT.PjT.get(a0);
        if(qla0 == null) {
            return;
        }
        b b0 = qla0.cr();
        Owx owx0 = qla0.JQp();
        if(b0 != null && owx0 != null) {
            JSONObject jSONObject0 = PjT.PjT(owx0, qla0.Zh(), qla0.ReZ(), b0);
            try {
                int v = b0.cr;
                if(v > 0) {
                    jSONObject0.put("play_time", v);
                }
                jSONObject0.put("is_mute", ((int)z));
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("from", s);
                jSONObject0.put("pag_json_data", jSONObject1);
            }
            catch(JSONException jSONException0) {
                RD.PjT("TTAD.VideoEventManager", "", jSONException0);
            }
            PjT.PjT(new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, wN.PjT(owx0), jSONObject0, null), "mute_state_change");
        }
    }

    private static long ReZ(b b0) {
        if(b0 == null) {
            return 0L;
        }
        c c0 = b0.qj() ? b0.RD() : b0.Owx();
        return c0 == null ? 0L : ((double)(c0.C() * 1000.0)).longValue();
    }

    public static void ReZ(a a0, com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0) {
        if(a0 != null && qla$PjT0 != null) {
            qla qla0 = (qla)PjT.PjT.get(a0);
            if(qla0 == null) {
                return;
            }
            b b0 = qla0.cr();
            Owx owx0 = qla0.JQp();
            if(b0 != null && owx0 != null) {
                long v = qla$PjT0.PjT();
                fDm fDm0 = new fDm(qla$PjT0.xf());
                fDm0.PjT(qla$PjT0.Zh());
                fDm0.Zh(qla$PjT0.ReZ());
                JSONObject jSONObject0 = PjT.PjT(owx0, qla0.Zh(), qla0.ReZ(), b0);
                int v1 = b0.cr;
                if(v1 > 0) {
                    try {
                        jSONObject0.put("play_time", v1);
                    }
                    catch(JSONException jSONException0) {
                        RD.PjT("TTAD.VideoEventManager", "", jSONException0);
                    }
                }
                com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, wN.PjT(owx0), jSONObject0, fDm0);
                pjT0.PjT(qla$PjT0.DWo());
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("duration", v);
                    jSONObject1.put("percent", qla$PjT0.cz());
                    PjT.PjT(pjT0, "play_error", jSONObject1);
                }
                catch(JSONException jSONException1) {
                    RD.PjT("TTAD.VideoEventManager", "", jSONException1);
                }
                PjT.PjT.remove(a0);
            }
        }
    }

    public static void Zh(com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0) {
        ReZ.PjT("load_video_cancel", pjT0);
    }

    public static void Zh(a a0, com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0) {
        if(a0 != null && qla$PjT0 != null) {
            qla qla0 = (qla)PjT.PjT.get(a0);
            if(qla0 == null) {
                return;
            }
            b b0 = qla0.cr();
            Owx owx0 = qla0.JQp();
            if(b0 != null && owx0 != null) {
                long v = qla$PjT0.PjT();
                long v1 = qla$PjT0.ReZ();
                if(v1 > 0L && v > 0L) {
                    JQp jQp0 = new JQp();
                    jQp0.PjT(qla$PjT0.Zh());
                    jQp0.Zh(v1);
                    JSONObject jSONObject0 = PjT.PjT(owx0, qla0.Zh(), qla0.ReZ(), b0);
                    int v2 = b0.cr;
                    if(v2 > 0) {
                        try {
                            jSONObject0.put("play_time", v2);
                        }
                        catch(JSONException jSONException0) {
                            RD.PjT("TTAD.VideoEventManager", "", jSONException0);
                        }
                    }
                    com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, wN.PjT(owx0), jSONObject0, jQp0);
                    pjT0.PjT(qla$PjT0.DWo());
                    try {
                        JSONObject jSONObject1 = new JSONObject();
                        jSONObject1.put("duration", v);
                        jSONObject1.put("percent", qla$PjT0.cz());
                        PjT.PjT(pjT0, "feed_continue", jSONObject1);
                    }
                    catch(JSONException jSONException1) {
                        RD.PjT("TTAD.VideoEventManager", "", jSONException1);
                    }
                }
            }
        }
    }

    public static void Zh(a a0, com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0, XX xX0) {
        if(a0 != null && qla$PjT0 != null) {
            PjT.JQp(a0, qla$PjT0);
            qla qla0 = (qla)PjT.PjT.get(a0);
            if(qla0 == null) {
                return;
            }
            b b0 = qla0.cr();
            Owx owx0 = qla0.JQp();
            if(b0 != null && owx0 != null) {
                long v = qla$PjT0.PjT();
                cz cz0 = new cz();
                cz0.Zh(qla$PjT0.Zh());
                cz0.PjT(qla$PjT0.ReZ());
                cz0.PjT(qla$PjT0.Au());
                JSONObject jSONObject0 = PjT.PjT(owx0, qla0.Zh(), qla0.ReZ(), b0);
                int v1 = b0.cr;
                if(v1 > 0) {
                    try {
                        jSONObject0.put("play_time", v1);
                    }
                    catch(JSONException jSONException0) {
                        RD.PjT("TTAD.VideoEventManager", "", jSONException0);
                    }
                }
                com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, wN.PjT(owx0), jSONObject0, cz0);
                pjT0.PjT(qla$PjT0.DWo());
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("duration", v);
                    jSONObject1.put("percent", qla$PjT0.cz());
                    PjT.PjT(pjT0, "feed_over", jSONObject1, xX0);
                }
                catch(JSONException jSONException1) {
                    RD.PjT("TTAD.VideoEventManager", "", jSONException1);
                }
                PjT.PjT.remove(a0);
            }
        }
    }

    private static String cr(b b0) {
        return new File(b0.Zh(), b0.fDm()).getAbsolutePath();
    }

    public static void cr(a a0, com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0) {
        if(a0 != null && qla$PjT0 != null) {
            qla qla0 = (qla)PjT.PjT.get(a0);
            if(qla0 == null) {
                return;
            }
            b b0 = qla0.cr();
            Owx owx0 = qla0.JQp();
            if(b0 != null && owx0 != null) {
                long v = qla$PjT0.PjT();
                com.bytedance.sdk.openadsdk.cr.JQp.Zh.Zh zh0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.Zh();
                zh0.PjT(qla$PjT0.Zh());
                zh0.Zh(qla$PjT0.ReZ());
                zh0.PjT(qla$PjT0.cr());
                zh0.Zh(qla$PjT0.JQp());
                JSONObject jSONObject0 = PjT.PjT(owx0, qla0.Zh(), qla0.ReZ(), b0);
                com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, wN.PjT(owx0), jSONObject0, zh0);
                pjT0.PjT(qla$PjT0.DWo());
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("duration", v);
                    jSONObject1.put("percent", qla$PjT0.cz());
                    PjT.PjT(pjT0, "endcard_skip", jSONObject1);
                }
                catch(JSONException jSONException0) {
                    RD.PjT("TTAD.VideoEventManager", "", jSONException0);
                }
            }
        }
    }
}

