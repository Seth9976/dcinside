package com.bytedance.sdk.openadsdk.cr;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.WorkerThread;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.openadsdk.XX.Zh;
import com.bytedance.sdk.openadsdk.core.model.DWo;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.Yo;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.tT;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.cr.PjT.cr;
import com.bytedance.sdk.openadsdk.utils.Co;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReZ {
    public static class PjT {
        public static void PjT(int v, int v1, int v2, int v3, Owx owx0, String s, int v4) {
            if(s != null && !TextUtils.isEmpty(owx0.MN())) {
                ReZ.PjT(System.currentTimeMillis(), owx0, s, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                    @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                    public JSONObject PjT() {
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            JSONObject jSONObject1 = new JSONObject();
                            jSONObject1.put("next_url", owx0.xu());
                            jSONObject1.put("channel_name", owx0.MN());
                            jSONObject1.put("preload_status", (v > 0 ? 2 : 0));
                            jSONObject1.put("first_page", v4);
                            jSONObject1.put("preload_h5_type", owx0.Uo());
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("channel_response", v);
                            jSONObject2.put("failResourceCount", v1);
                            jSONObject2.put("successCount", v2);
                            jSONObject2.put("failCount", v3);
                            jSONObject1.put("resource_info", jSONObject2);
                            jSONObject0.put("ad_extra_data", jSONObject1.toString());
                        }
                        catch(Throwable throwable0) {
                            Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", throwable0);
                        }
                        return jSONObject0;
                    }
                });
            }
        }

        public static void PjT(int v, int v1, Owx owx0) {
            String s = wN.PjT(owx0);
            if(s == null) {
                return;
            }
            ReZ.PjT(System.currentTimeMillis(), owx0, s + "_landingpage", "local_res_hit_rate", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        JSONObject jSONObject1 = new JSONObject();
                        jSONObject1.put("all_times", v1);
                        jSONObject1.put("hit_times", v);
                        jSONObject0.put("ad_extra_data", jSONObject1.toString());
                    }
                    catch(Throwable throwable0) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", throwable0);
                    }
                    return jSONObject0;
                }
            });
        }

        public static void PjT(long v, Owx owx0, String s, ILoader iLoader0, String s1) {
            if(s == null) {
                return;
            }
            ReZ.PjT(System.currentTimeMillis(), owx0, s, "landingpage_init", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        int v = Zh.PjT().PjT(iLoader0, s1);
                        JSONObject jSONObject1 = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        int v1 = 0;
                        jSONObject2.put("is_arbitrage", ((int)owx0.HG()));
                        jSONObject1.put("pag_json_data", jSONObject2.toString());
                        jSONObject1.put("url", owx0.xu());
                        jSONObject1.put("channel_name", owx0.MN());
                        if(!TextUtils.isEmpty(owx0.MN()) && v > 0) {
                            v1 = 1;
                        }
                        jSONObject1.put("interceptor_status", v1);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("resource_count", v);
                        jSONObject1.put("resource_info", jSONObject3);
                        jSONObject0.put("ad_extra_data", jSONObject1.toString());
                        jSONObject0.put("duration", v);
                    }
                    catch(Throwable throwable0) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", throwable0);
                    }
                    return jSONObject0;
                }
            });
        }

        public static void PjT(String s, JSONObject jSONObject0, Owx owx0) {
            String s1 = wN.PjT(owx0);
            if(s1 == null) {
                return;
            }
            ReZ.PjT(System.currentTimeMillis(), owx0, s1 + "_landingpage", s, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("ad_extra_data", jSONObject0.toString());
                    }
                    catch(Throwable throwable0) {
                        Log.d("TTAD.AdEvent", "Gecko.loadEvent error", throwable0);
                    }
                    return jSONObject0;
                }
            });
        }
    }

    public static void JQp(Owx owx0, com.bytedance.sdk.openadsdk.qla.PjT.PjT pjT0, String s) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "web_behavior_click", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("arbi_current_url", pjT0.ReZ());
                    jSONObject1.put("current_url_index", pjT0.cr());
                    jSONObject1.put("arbi_start_x", ((double)pjT0.JQp()));
                    jSONObject1.put("arbi_start_y", ((double)pjT0.cz()));
                    jSONObject1.put("click_duration", ((double)pjT0.XX()));
                    jSONObject1.put("is_trigger_jump", pjT0.Au());
                    jSONObject1.put("click_type", String.valueOf(pjT0.ltE()));
                    if(pjT0.PjT() != -1) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("hit_type", pjT0.PjT());
                        jSONObject2.put("hit_extra", "");
                        jSONObject1.put("pag_json_data", jSONObject2.toString());
                    }
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                    return jSONObject0;
                }
                catch(Throwable throwable0) {
                }
                RD.Zh("TTAD.AdEvent", new Object[]{"onWebBehaviorClick", throwable0.getMessage()});
                return jSONObject0;
            }
        });
    }

    public static void JQp(Owx owx0, String s, JSONObject jSONObject0) {
        ReZ.cr(owx0, "activity_recreate", s, jSONObject0);
    }

    @WorkerThread
    public static void PjT() {
        try {
            Class.forName("com.bytedance.sdk.openadsdk.cr.ReZ");
        }
        catch(ClassNotFoundException unused_ex) {
        }
    }

    public static void PjT(int v, JSONObject jSONObject0) {
        try {
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("ad_show_order", v);
            jSONObject0.put("pag_json_data", jSONObject1.toString());
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(long v, Owx owx0, String s) {
        if(owx0 == null) {
            return;
        }
        if(Owx.ReZ(owx0) && owx0.BPY() != null) {
            ReZ.PjT(System.currentTimeMillis(), owx0, s, "endcard_close", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        JSONObject jSONObject1 = new JSONObject();
                        jSONObject1.putOpt("url", owx0.BPY().ReZ());
                        jSONObject1.putOpt("id", owx0.BPY().PjT());
                        jSONObject1.putOpt("md5", owx0.BPY().Zh());
                        if(owx0.MWx() != null) {
                            jSONObject1.putOpt("render_type", owx0.MWx().z());
                        }
                        jSONObject0.put("ad_extra_data", jSONObject1.toString());
                        jSONObject0.put("duration", v);
                        return jSONObject0;
                    }
                    catch(Exception exception0) {
                    }
                    RD.Zh(exception0.getMessage(), new Object[0]);
                    return jSONObject0;
                }
            });
        }
    }

    @DungeonFlag
    public static void PjT(long v, Owx owx0, String s, String s1) {
        ReZ.PjT(v, owx0, s, s1, null);
    }

    @DungeonFlag
    public static void PjT(long v, Owx owx0, String s, String s1, com.bytedance.sdk.openadsdk.qla.ReZ.PjT pjT0) {
        if(owx0 == null || TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) || ReZ.PjT(owx0.za(), s1)) {
            return;
        }
        ReZ.PjT(new Au(s1) {
            @Override
            public void run() {
                JSONObject jSONObject0;
                try {
                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT pjT0 = pjT0;
                    if(pjT0 == null) {
                        goto label_6;
                    }
                    else {
                        jSONObject0 = pjT0.PjT();
                        if(jSONObject0 == null) {
                            jSONObject0 = new JSONObject();
                        }
                    }
                    goto label_10;
                }
                catch(Exception unused_ex) {
                    jSONObject0 = null;
                    new com.bytedance.sdk.openadsdk.cr.PjT.PjT(v, owx0).Zh(s).ReZ(s1).JQp(owx0.dIF()).Au(owx0.Ey()).PjT(owx0.hN()).PjT(jSONObject0).XX(owx0.ydj()).PjT(null);
                    return;
                }
                try {
                    jSONObject0 = new JSONObject();
                    goto label_10;
                }
                catch(Exception unused_ex) {
                    new com.bytedance.sdk.openadsdk.cr.PjT.PjT(v, owx0).Zh(s).ReZ(s1).JQp(owx0.dIF()).Au(owx0.Ey()).PjT(owx0.hN()).PjT(jSONObject0).XX(owx0.ydj()).PjT(null);
                    return;
                }
                try {
                label_6:
                    jSONObject0 = new JSONObject();
                }
                catch(Exception unused_ex) {
                    jSONObject0 = null;
                    new com.bytedance.sdk.openadsdk.cr.PjT.PjT(v, owx0).Zh(s).ReZ(s1).JQp(owx0.dIF()).Au(owx0.Ey()).PjT(owx0.hN()).PjT(jSONObject0).XX(owx0.ydj()).PjT(null);
                    return;
                }
                try {
                label_10:
                    jSONObject0.putOpt("log_extra", owx0.xR());
                    jSONObject0.putOpt("ua_policy", owx0.OMu());
                }
                catch(Exception unused_ex) {
                }
                new com.bytedance.sdk.openadsdk.cr.PjT.PjT(v, owx0).Zh(s).ReZ(s1).JQp(owx0.dIF()).Au(owx0.Ey()).PjT(owx0.hN()).PjT(jSONObject0).XX(owx0.ydj()).PjT(null);
            }
        });
    }

    public static void PjT(long v, Owx owx0, String s, String s1, JSONObject jSONObject0, XX xX0, com.bytedance.sdk.openadsdk.cr.Zh.PjT pjT0) {
        ReZ.PjT(v, owx0, s, s1, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                return jSONObject0;
            }
        });
    }

    public static void PjT(Au au0) {
        if(au0 == null) {
            return;
        }
        if(Jo.cz()) {
            SM.PjT().post(new Runnable() {
                @Override
                public void run() {
                    Jo.Zh(au0, 10);
                }
            });
            return;
        }
        if(!Jo.XX()) {
            Jo.Zh(au0, 10);
            return;
        }
        au0.run();
    }

    public static void PjT(Owx owx0) {
        if(!TextUtils.isEmpty(xf.PjT(ub.PjT()))) {
            cr.PjT(com.bytedance.sdk.openadsdk.Lrd.PjT.PjT(owx0.zYH(), true), 1, owx0.dIF());
        }
    }

    public static void PjT(Owx owx0, com.bytedance.sdk.openadsdk.qla.PjT.PjT pjT0, String s) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("arbi_current_url", pjT0.ReZ());
                    jSONObject1.put("keyword", pjT0.ub());
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh("TTAD.AdEvent", new Object[]{"onWebBehaviorKeyword", throwable0.getMessage()});
                }
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "endcard_load_start", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    if(Owx.ReZ(owx0)) {
                        if(owx0.BPY() != null) {
                            jSONObject1.putOpt("url", owx0.BPY().ReZ());
                            jSONObject1.putOpt("id", owx0.BPY().PjT());
                            jSONObject1.putOpt("md5", owx0.BPY().Zh());
                        }
                        if(owx0.MWx() != null) {
                            jSONObject1.putOpt("render_type", 7);
                        }
                    }
                    else {
                        jSONObject1.putOpt("url", owx0.MWx().M());
                        jSONObject1.putOpt("style_id", owx0.Yr());
                        if(owx0.MWx() != null) {
                            jSONObject1.putOpt("render_type", 0);
                        }
                    }
                    jSONObject0.putOpt("ad_extra_data", jSONObject1.toString());
                    return jSONObject0;
                }
                catch(Exception exception0) {
                }
                RD.Zh(exception0.getMessage(), new Object[0]);
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s, int v) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "open_url_h5", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.putOpt("render_type", "h5");
                    jSONObject1.putOpt("render_type_2", 0);
                    jSONObject1.putOpt("preload_status", v);
                    jSONObject0.putOpt("ad_extra_data", jSONObject1.toString());
                }
                catch(Exception unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s, int v, long v1) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "video_choose", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("video_choose", v);
                    jSONObject1.put("video_choose_duration", v1);
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh(throwable0.toString(), new Object[0]);
                }
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s, int v, String s1, float f) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "arbitrage_load_finish", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject0.put("index", v);
                    jSONObject0.put("arbi_current_url", s1);
                    jSONObject0.put("arbi_load_duration", ((double)f));
                    jSONObject1.put("ad_extra_data", jSONObject0.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh(throwable0.toString(), new Object[0]);
                }
                return jSONObject1;
            }
        });
    }

    public static void PjT(Owx owx0, String s, int v, String s1, int v1) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "arbitrage_load_start", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject0.put("index", v);
                    jSONObject0.put("arbi_current_url", s1);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("new_index", v1);
                    jSONObject0.put("pag_json_data", jSONObject2.toString());
                    jSONObject1.put("ad_extra_data", jSONObject0.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh(throwable0.toString(), new Object[0]);
                }
                return jSONObject1;
            }
        });
    }

    public static void PjT(Owx owx0, String s, int v, String s1, long v1, boolean z, int v2, long v3) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "arbitrage_loading", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject0.put("invisible_scene", v);
                    jSONObject0.put("arbi_current_url", s1);
                    jSONObject0.put("loading_visible_time", v1);
                    jSONObject0.put("arbi_trigger_start", z);
                    jSONObject0.put("arbi_convert_count", v2);
                    jSONObject0.put("loading_start_timestamp", v3);
                    jSONObject1.put("ad_extra_data", jSONObject0.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh(throwable0.toString(), new Object[0]);
                }
                return jSONObject1;
            }
        });
    }

    public static void PjT(Owx owx0, String s, int v, String s1, String s2, int v1) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "arbitrage_load_url", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject0.put("index", v);
                    jSONObject0.put("arbi_current_url", s1);
                    jSONObject0.put("load_url", s2);
                    jSONObject0.put("url_flag", v1);
                    jSONObject1.put("ad_extra_data", jSONObject0.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh(throwable0.toString(), new Object[0]);
                }
                return jSONObject1;
            }
        });
    }

    public static void PjT(Owx owx0, String s, int v, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        try {
            jSONObject0.put("type", v);
        }
        catch(JSONException unused_ex) {
        }
        ReZ.Zh(owx0, s, "open_ad_land_page_links", jSONObject0);
    }

    public static void PjT(Owx owx0, String s, long v) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "endcard_load_finish", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    if(Owx.ReZ(owx0)) {
                        if(owx0.BPY() != null) {
                            jSONObject1.putOpt("url", owx0.BPY().ReZ());
                            jSONObject1.putOpt("id", owx0.BPY().PjT());
                            jSONObject1.putOpt("md5", owx0.BPY().Zh());
                        }
                        if(owx0.MWx() != null) {
                            jSONObject1.putOpt("render_type", 7);
                        }
                    }
                    else {
                        jSONObject1.putOpt("url", owx0.MWx().M());
                        jSONObject1.putOpt("style_id", owx0.Yr());
                        if(owx0.MWx() != null) {
                            jSONObject1.putOpt("render_type", 0);
                        }
                    }
                    jSONObject0.putOpt("ad_extra_data", jSONObject1.toString());
                    jSONObject0.put("duration", v);
                    return jSONObject0;
                }
                catch(Exception exception0) {
                }
                RD.Zh(exception0.getMessage(), new Object[0]);
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s, long v, int v1, int v2) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "load", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.putOpt("render_type", "h5");
                    jSONObject1.putOpt("render_type_2", 0);
                    jSONObject1.putOpt("interaction_method", owx0.Sks());
                    jSONObject1.put("first_page", v2);
                    jSONObject1.put("preload_h5_type", owx0.Uo());
                    int v = v1;
                    if(v >= 0) {
                        jSONObject1.putOpt("preload_status", v);
                    }
                    jSONObject0.putOpt("ad_extra_data", jSONObject1.toString());
                    jSONObject0.put("duration", Math.min(v, 600000L));
                }
                catch(Exception unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s, long v, int v1, String s1, String s2) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "endcard_load_fail", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    if(Owx.ReZ(owx0)) {
                        if(owx0.BPY() != null) {
                            jSONObject1.putOpt("url", owx0.BPY().ReZ());
                            jSONObject1.putOpt("id", owx0.BPY().PjT());
                            jSONObject1.putOpt("md5", owx0.BPY().Zh());
                        }
                        if(owx0.MWx() != null) {
                            jSONObject1.putOpt("render_type", 7);
                        }
                    }
                    else {
                        jSONObject1.putOpt("url", owx0.MWx().M());
                        jSONObject1.putOpt("style_id", owx0.Yr());
                        if(!TextUtils.isEmpty(s2)) {
                            jSONObject1.putOpt("error_url", s2);
                        }
                        if(owx0.MWx() != null) {
                            jSONObject1.putOpt("render_type", 0);
                        }
                    }
                    jSONObject1.put("error_code", v1);
                    jSONObject1.put("error_msg", s1);
                    jSONObject0.putOpt("ad_extra_data", jSONObject1.toString());
                    jSONObject0.put("duration", v);
                    return jSONObject0;
                }
                catch(Exception exception0) {
                }
                RD.Zh(exception0.getMessage(), new Object[0]);
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s, long v, JSONObject jSONObject0) {
        ReZ.PjT(System.currentTimeMillis(), owx0, "open_ad", s, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    long v = v;
                    if(v != -1L) {
                        jSONObject0.put("duration", v);
                    }
                    JSONObject jSONObject1 = jSONObject0;
                    if(jSONObject1 != null) {
                        jSONObject0.put("ad_extra_data", jSONObject1.toString());
                        return jSONObject0;
                    }
                    jSONObject0.put("ad_extra_data", "{}");
                    return jSONObject0;
                }
                catch(Exception exception0) {
                }
                RD.Zh("TTAD.AdEvent", exception0.getMessage());
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s, long v, boolean z) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "lp_loading", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject0.put("if_lp_loading_success", (z ? 1 : 2));
                    jSONObject1.put("ad_extra_data", jSONObject0.toString());
                    jSONObject1.put("duration", v);
                }
                catch(Throwable throwable0) {
                    RD.Zh(throwable0.toString(), new Object[0]);
                }
                return jSONObject1;
            }
        });
    }

    public static void PjT(Owx owx0, String s, Co co0) {
        if(owx0 == null) {
            return;
        }
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "stay_duration", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject0.put("click_stay_time", co0.cr());
                    jSONObject0.put("click_time", co0.PjT);
                    if(s.equals("open_ad")) {
                        jSONObject0.put("is_icon_only", ((int)owx0.Pv()));
                    }
                    jSONObject1.put("ad_extra_data", jSONObject0.toString());
                }
                catch(Throwable unused_ex) {
                }
                return jSONObject1;
            }
        });
    }

    public static void PjT(Owx owx0, String s, String s1) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "show_error", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject1.putOpt("error_msg", s1);
                    jSONObject0.putOpt("ad_extra_data", jSONObject1.toString());
                }
                catch(Exception unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s, String s1, long v, int v1, JSONObject jSONObject0, XX xX0) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, s1, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("duration", v);
                    jSONObject0.put("percent", v1);
                    if("feed_break".equals(s1) || "feed_over".equals(s1)) {
                        XX xX0 = xX0;
                        if(xX0 != null) {
                            xX0.PjT((jSONObject0 == null ? new JSONObject() : jSONObject0));
                        }
                    }
                    jSONObject0.put("ad_extra_data", (jSONObject0 == null ? new JSONObject() : jSONObject0).toString());
                }
                catch(Throwable unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s, String s1, long v, JSONObject jSONObject0) {
        if(owx0 != null && jSONObject0 != null) {
            ReZ.PjT(System.currentTimeMillis(), owx0, s, s1, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("duration", v);
                        jSONObject0.put("ad_extra_data", jSONObject0.toString());
                    }
                    catch(Exception exception0) {
                        RD.Zh("TTAD.AdEvent", exception0.getMessage());
                    }
                    return jSONObject0;
                }
            });
        }
    }

    public static void PjT(Owx owx0, String s, String s1, com.bytedance.sdk.openadsdk.qla.ReZ.PjT pjT0) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "playable_track", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject1;
                JSONObject jSONObject0 = new JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT pjT0 = pjT0;
                    if(pjT0 == null) {
                        jSONObject1 = new JSONObject();
                    }
                    else {
                        jSONObject1 = pjT0.PjT();
                        if(jSONObject1 == null) {
                            jSONObject1 = new JSONObject();
                        }
                    }
                    jSONObject1.put("is_new_playable", 1);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("pag_json_data", jSONObject1.toString());
                    jSONObject2.put("playable_event", s1);
                    jSONObject0.put("ad_extra_data", jSONObject2.toString());
                }
                catch(Exception unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    @DungeonFlag
    public static void PjT(Owx owx0, String s, String s1, String s2, long v, long v1, JSONObject jSONObject0, boolean z) {
        if(owx0 == null) {
            return;
        }
        if(ReZ.PjT(owx0.za(), s2)) {
            return;
        }
        ReZ.PjT(new Au("sendJsAdEvent") {
            @Override
            public void run() {
                String s = owx0.hN();
                if(jSONObject0 != null) {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        String s1 = jSONObject0.optString("ad_extra_data");
                        if(!TextUtils.isEmpty(s1)) {
                            jSONObject0 = new JSONObject(s1);
                        }
                        if(!"click".equals(s2)) {
                            jSONObject0.put("device", DeviceUtils.XX(ub.PjT()).toString());
                        }
                        if("click".equals(s2)) {
                            if(z) {
                                jSONObject0.put("click_scence", 1);
                            }
                            else if(cRA.Zh(owx0)) {
                                jSONObject0.put("click_scence", 3);
                            }
                        }
                        if(owx0.fc()) {
                            try {
                                JSONObject jSONObject1 = jSONObject0.optJSONObject("pag_json_data");
                                if(jSONObject1 == null) {
                                    jSONObject1 = new JSONObject();
                                }
                                jSONObject1.put("is_new_playable", 1);
                                if(owx0.Fx()) {
                                    jSONObject1.put("is_pre_render", 1);
                                }
                                jSONObject0.put("pag_json_data", jSONObject1.toString());
                            }
                            catch(Throwable unused_ex) {
                            }
                        }
                        int v = 0;
                        if(com.bytedance.sdk.openadsdk.xs.PjT.ReZ(owx0)) {
                            JSONObject jSONObject2 = jSONObject0.optJSONObject("pag_json_data");
                            if(jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                            }
                            jSONObject2.put("is_lp_pre_render", ((int)owx0.AK()));
                            jSONObject0.put("pag_json_data", jSONObject2.toString());
                        }
                        jSONObject0.put("ad_extra_data", jSONObject0.toString());
                        jSONObject0.put("tag", s1);
                        int v1 = jSONObject0.optInt("agg_request_type", -1);
                        if(z && v1 == 2) {
                            s = jSONObject0.optString("app_log_url");
                        }
                        if("click".equals(s2)) {
                            tT.ReZ(owx0);
                            float f = ((double)(((double)(System.currentTimeMillis() / 1000L)) - Owx.Zh(jSONObject0.optString("log_extra")))).floatValue();
                            JSONObject jSONObject3 = jSONObject0;
                            if(f <= 0.0f) {
                                f = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", f);
                            if(!TextUtils.isEmpty(xf.PjT(ub.PjT()))) {
                                if(!z || v1 != 2) {
                                    Owx owx0 = owx0;
                                    if(owx0 != null) {
                                        cr.PjT(com.bytedance.sdk.openadsdk.Lrd.PjT.PjT(owx0.wKV(), true), 2, owx0.dIF());
                                    }
                                }
                                else {
                                    JSONArray jSONArray0 = jSONObject0.optJSONArray("click_tracking_url");
                                    if(jSONArray0 != null) {
                                        ArrayList arrayList0 = new ArrayList();
                                        while(v < jSONArray0.length()) {
                                            arrayList0.add(jSONArray0.optString(v));
                                            ++v;
                                        }
                                        cr.PjT(com.bytedance.sdk.openadsdk.Lrd.PjT.PjT(arrayList0, true), 2, String.valueOf(v));
                                    }
                                }
                            }
                        }
                        else if("show".equals(s2) && !TextUtils.isEmpty(xf.PjT(ub.PjT())) && z && v1 == 2) {
                            JSONArray jSONArray1 = jSONObject0.optJSONArray("show_tracking_url");
                            if(jSONArray1 != null) {
                                ArrayList arrayList1 = new ArrayList();
                                while(v < jSONArray1.length()) {
                                    arrayList1.add(jSONArray1.optString(v));
                                    ++v;
                                }
                                cr.PjT(com.bytedance.sdk.openadsdk.Lrd.PjT.PjT(arrayList1, true), 1, String.valueOf(v));
                            }
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                }
                new com.bytedance.sdk.openadsdk.cr.PjT.PjT(System.currentTimeMillis(), owx0).cr(s).Zh(s1).ReZ(s2).JQp(String.valueOf(v)).cz(String.valueOf(v1)).PjT(s).PjT(jSONObject0).Au(owx0.Ey()).XX(owx0.ydj()).PjT(null);
            }
        });
    }

    public static void PjT(Owx owx0, String s, String s1, Map map0) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, s1, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    Map map0 = map0;
                    if(map0 != null) {
                        for(Object object0: map0.entrySet()) {
                            jSONObject1.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
                        }
                        Object object1 = map0.get("duration");
                        if(object1 instanceof Long) {
                            jSONObject0.put("duration", object1);
                        }
                    }
                    jSONObject1.put("dp_creative_type", owx0.cyr());
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
                catch(Exception unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s, String s1, JSONObject jSONObject0) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, s1, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                if(jSONObject0 != null) {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("ad_extra_data", jSONObject0.toString());
                        if(jSONObject0.has("duration")) {
                            jSONObject0.put("duration", jSONObject0.get("duration"));
                            return jSONObject0;
                        }
                    }
                    catch(Exception exception0) {
                        RD.Zh("TTAD.AdEvent", exception0.getMessage());
                    }
                    return jSONObject0;
                }
                return null;
            }
        });
        if("click".equals(s1)) {
            tT.ReZ(owx0);
        }
    }

    public static void PjT(Owx owx0, String s, String s1, JSONObject jSONObject0, long v) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, s1, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = jSONObject0;
                    if(jSONObject1 != null) {
                        jSONObject0.put("ad_extra_data", jSONObject1.toString());
                    }
                    jSONObject0.put("duration", v);
                }
                catch(Exception unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    @DungeonFlag
    public static void PjT(Owx owx0, String s, JSONObject jSONObject0) {
        ReZ.cr(owx0, "show", s, jSONObject0);
    }

    public static void PjT(Owx owx0, String s, boolean z, boolean z1, boolean z2, boolean z3, int v, Map map0) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "start_show_plb", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("isSkip", z);
                    jSONObject1.put("force", z1);
                    jSONObject1.put("isFromLandingPage", z2);
                    jSONObject1.put("finishing", z3);
                    jSONObject1.put("from", v);
                    Map map0 = map0;
                    if(map0 != null) {
                        for(Object object0: map0.entrySet()) {
                            jSONObject1.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
                        }
                    }
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
                catch(Throwable unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, boolean z, String s, String s1, long v, String s2, String s3, int v1, String s4) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "load_ugen_template", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    switch(s3) {
                        case "ad": {
                            com.bytedance.sdk.openadsdk.core.model.Owx.PjT owx$PjT0 = owx0.VY();
                            if(owx$PjT0 != null) {
                                jSONObject1.putOpt("url", owx$PjT0.qla());
                                jSONObject1.putOpt("id", owx$PjT0.cz());
                                jSONObject1.putOpt("md5", owx$PjT0.xE());
                            }
                            break;
                        }
                        case "adv3": {
                            Yo yo0 = owx0.xH();
                            if(yo0 != null) {
                                jSONObject1.putOpt("url", yo0.ReZ());
                                jSONObject1.putOpt("id", yo0.PjT());
                                jSONObject1.putOpt("md5", yo0.Zh());
                            }
                            break;
                        }
                        case "endcard": {
                            if(z) {
                                com.bytedance.sdk.openadsdk.core.DWo.XX.PjT pjT0 = owx0.Ohg();
                                if(pjT0 != null) {
                                    jSONObject1.putOpt("url", pjT0.ReZ());
                                    jSONObject1.putOpt("id", pjT0.PjT());
                                    jSONObject1.putOpt("md5", pjT0.Zh());
                                }
                            }
                            else {
                                com.bytedance.sdk.openadsdk.core.DWo.XX.PjT pjT1 = owx0.BPY();
                                if(pjT1 != null) {
                                    jSONObject1.putOpt("url", pjT1.ReZ());
                                    jSONObject1.putOpt("id", pjT1.PjT());
                                    jSONObject1.putOpt("md5", pjT1.Zh());
                                }
                            }
                        }
                    }
                    jSONObject1.put("ugen_status", s1);
                    jSONObject1.put("from", s2);
                    jSONObject1.put("ugen_scene", s3);
                    if("fail".equals(s1)) {
                        jSONObject1.put("error_code", v1);
                        jSONObject1.put("error_msg", s4);
                    }
                    jSONObject0.put("duration", v);
                    goto label_39;
                }
                catch(Throwable throwable0) {
                }
                try {
                    jSONObject1.put("error_code", 0x85);
                    jSONObject1.put("error_msg", "send template error " + throwable0.getMessage());
                }
                catch(Throwable unused_ex) {
                }
                try {
                label_39:
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
                catch(Throwable unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void PjT(com.bytedance.sdk.openadsdk.qla.PjT.Zh zh0) {
        if(zh0 != null && zh0.Zh() != null) {
            Owx owx0 = zh0.Zh();
            int v = owx0.cI();
            if(v == 2 || v == 8 || wN.cr(owx0) && "saLandingPageLinks".equals(zh0.PjT())) {
                ReZ.PjT(System.currentTimeMillis(), owx0, zh0.ReZ(), "open_browser", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                    @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                    public JSONObject PjT() {
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            int v = zh0.cr();
                            JSONObject jSONObject1 = new JSONObject();
                            jSONObject1.put("count", wN.fDm(ub.PjT()));
                            jSONObject1.put("interceptor", v);
                            jSONObject1.put("success", zh0.JQp());
                            jSONObject1.put("link", zh0.PjT());
                            jSONObject1.put("interaction_type", v);
                            jSONObject1.put("real_interaction_type", zh0.XX());
                            if(zh0.cr() == 9) {
                                jSONObject1.put("is_act_signals_api_available", zh0.Au());
                                jSONObject1.put("is_act_signals_callback", zh0.SM());
                            }
                            if(!TextUtils.isEmpty(zh0.cz())) {
                                jSONObject1.put("exception_msg", zh0.cz());
                            }
                            if(v == 2 || v == 5) {
                                jSONObject1.put("meta", owx0.dDm().toString());
                            }
                            jSONObject0.put("ad_extra_data", jSONObject1.toString());
                            return jSONObject0;
                        }
                        catch(Exception exception0) {
                        }
                        RD.Zh("TTAD.AdEvent", exception0.getMessage());
                        return jSONObject0;
                    }
                });
            }
        }
    }

    public static void PjT(String s, long v) {
        com.bytedance.sdk.openadsdk.core.XX.ReZ.PjT(s, v);
    }

    @DungeonFlag
    public static void PjT(String s, Owx owx0, DWo dWo0, String s1, boolean z, Map map0, int v) {
        ReZ.PjT(new Au("onClick") {
            @Override
            public void run() {
                Owx owx0 = owx0;
                if(owx0 == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.cr.ReZ.15.1 reZ$15$10 = new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                    final com.bytedance.sdk.openadsdk.cr.ReZ.15 PjT;

                    @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                    public JSONObject PjT() {
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            DWo dWo0 = com.bytedance.sdk.openadsdk.cr.ReZ.15.this.JQp;
                            if(dWo0 != null) {
                                JSONObject jSONObject1 = dWo0.PjT();
                                jSONObject1.put("is_valid", com.bytedance.sdk.openadsdk.cr.ReZ.15.this.cz);
                                int v = com.bytedance.sdk.openadsdk.cr.ReZ.15.this.XX;
                                if(v > 0 && v <= 2) {
                                    jSONObject1.put("user_behavior_type", v);
                                }
                                Map map0 = com.bytedance.sdk.openadsdk.cr.ReZ.15.this.Au;
                                if(map0 != null) {
                                    if(map0.containsKey("duration")) {
                                        jSONObject0.put("duration", com.bytedance.sdk.openadsdk.cr.ReZ.15.this.Au.get("duration"));
                                    }
                                    for(Object object0: com.bytedance.sdk.openadsdk.cr.ReZ.15.this.Au.entrySet()) {
                                        Map.Entry map$Entry0 = (Map.Entry)object0;
                                        if(!"duration".equals(map$Entry0.getKey())) {
                                            jSONObject1.put(((String)map$Entry0.getKey()), map$Entry0.getValue());
                                        }
                                    }
                                }
                                jSONObject1.put("interaction_method", com.bytedance.sdk.openadsdk.cr.ReZ.15.this.PjT.Sks());
                                if(com.bytedance.sdk.openadsdk.cr.ReZ.15.this.ReZ.equals("open_ad")) {
                                    jSONObject1.put("is_icon_only", ((int)com.bytedance.sdk.openadsdk.cr.ReZ.15.this.PjT.Pv()));
                                }
                                jSONObject0.put("ad_extra_data", jSONObject1.toString());
                            }
                            jSONObject0.putOpt("log_extra", com.bytedance.sdk.openadsdk.cr.ReZ.15.this.PjT.xR());
                            float f = ((double)(((double)(System.currentTimeMillis() / 1000L)) - com.bytedance.sdk.openadsdk.cr.ReZ.15.this.PjT.kNB())).floatValue();
                            if(f <= 0.0f) {
                                f = 0.0f;
                            }
                            jSONObject0.putOpt("show_time", f);
                            jSONObject0.putOpt("ua_policy", com.bytedance.sdk.openadsdk.cr.ReZ.15.this.PjT.OMu());
                        }
                        catch(Exception unused_ex) {
                        }
                        return jSONObject0;
                    }
                };
                ReZ.PjT(System.currentTimeMillis(), owx0, s1, s, reZ$15$10);
                if(!TextUtils.isEmpty(xf.PjT(ub.PjT())) && "click".equals(s)) {
                    cr.PjT(com.bytedance.sdk.openadsdk.Lrd.PjT.PjT(owx0.wKV(), true), 2, owx0.dIF());
                }
                if("click".equals(s)) {
                    tT.ReZ(owx0);
                }
            }
        });
    }

    @DungeonFlag
    public static void PjT(String s, Owx owx0, String s1, XX xX0) {
        if(owx0 != null && xX0 != null && xX0.PjT()) {
            ReZ.PjT(System.currentTimeMillis(), owx0, s1, "ad_show_time", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("duration", s);
                        if(xX0 != null && xX0.Zh() != null) {
                            JSONObject jSONObject1 = xX0.Zh();
                            if(s1.equals("open_ad")) {
                                jSONObject1.put("is_icon_only", ((int)owx0.Pv()));
                            }
                            jSONObject0.put("ad_extra_data", jSONObject1.toString());
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    return jSONObject0;
                }
            });
        }
    }

    public static void PjT(String s, Owx owx0, String s1, Map map0) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s1, s, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    if(map0 != null) {
                        JSONObject jSONObject1 = new JSONObject();
                        for(Object object0: map0.entrySet()) {
                            jSONObject1.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
                        }
                        jSONObject0.put("ad_extra_data", jSONObject1.toString());
                    }
                }
                catch(Exception unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    private static boolean PjT(int v, String s) {
        int v1;
        try {
            Set set0 = xs.Gr().OL();
            if(v == 1 && set0 != null && set0.contains(s)) {
                return true;
            }
            v1 = xs.Gr().KM(s);
            if(v1 == 0) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAD.AdEvent", throwable0.getMessage());
            return false;
        }
        return v1 == 100 ? false : ((int)(Math.random() * 100.0 + 1.0)) > v1;
    }

    public static void ReZ(Owx owx0, com.bytedance.sdk.openadsdk.qla.PjT.PjT pjT0, String s) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "web_behavior_stay", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("arbi_current_url", pjT0.ReZ());
                    jSONObject1.put("current_url_index", pjT0.cr());
                    jSONObject1.put("arbi_stay_duration", ((double)pjT0.fDm()));
                    jSONObject1.put("browsing_percentage", pjT0.qla());
                    jSONObject1.put("out_focus_scene", pjT0.xE());
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh("TTAD.AdEvent", new Object[]{"onWebBehaviorStay", throwable0.getMessage()});
                }
                return jSONObject0;
            }
        });
    }

    public static void ReZ(Owx owx0, String s) {
        if(owx0 == null) {
            return;
        }
        if(Owx.ReZ(owx0) && owx0.BPY() != null) {
            ReZ.PjT(System.currentTimeMillis(), owx0, s, "endcard_show", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        JSONObject jSONObject1 = new JSONObject();
                        jSONObject1.putOpt("url", owx0.BPY().ReZ());
                        jSONObject1.putOpt("id", owx0.BPY().PjT());
                        jSONObject1.putOpt("md5", owx0.BPY().Zh());
                        if(owx0.MWx() != null) {
                            jSONObject1.putOpt("render_type", owx0.MWx().z());
                        }
                        jSONObject0.put("ad_extra_data", jSONObject1.toString());
                    }
                    catch(Exception unused_ex) {
                    }
                    return jSONObject0;
                }
            });
        }
    }

    public static void ReZ(Owx owx0, String s, int v) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "check_meta_more", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject0.put("error_code", v);
                    jSONObject0.put("check_url", xs.Gr().Vs());
                    jSONObject1.put("ad_extra_data", jSONObject0.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh(throwable0.toString(), new Object[0]);
                }
                return jSONObject1;
            }
        });
    }

    public static void ReZ(Owx owx0, String s, long v) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "load_feeling_duration", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("duration", v);
                }
                catch(Throwable throwable0) {
                    RD.Zh("TTAD.AdEvent", throwable0.getMessage());
                }
                return jSONObject0;
            }
        });
    }

    public static void ReZ(Owx owx0, String s, String s1, JSONObject jSONObject0) {
        if(owx0 != null && jSONObject0 != null) {
            ReZ.PjT(System.currentTimeMillis(), owx0, s, s1, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("ad_extra_data", jSONObject0.toString());
                    }
                    catch(JSONException unused_ex) {
                    }
                    return jSONObject0;
                }
            });
        }
    }

    public static void ReZ(Owx owx0, String s, JSONObject jSONObject0) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "arbitrage_loading_progress", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject1.put("pag_json_data", jSONObject0);
                    jSONObject0.put("ad_extra_data", jSONObject1);
                }
                catch(JSONException unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void Zh(long v, Owx owx0, String s, String s1) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject0.put("duration", v);
                    if(Owx.ReZ(owx0)) {
                        if(owx0.BPY() != null) {
                            jSONObject1.putOpt("url", owx0.BPY().ReZ());
                            jSONObject1.putOpt("id", owx0.BPY().PjT());
                            jSONObject1.putOpt("md5", owx0.BPY().Zh());
                        }
                        jSONObject1.putOpt("from", s1);
                        if(owx0.MWx() != null) {
                            jSONObject1.putOpt("render_type", 7);
                        }
                    }
                    else {
                        jSONObject1.put("url", owx0.MWx().M());
                        jSONObject1.put("style_id", owx0.Yr());
                        if(owx0.MWx() != null) {
                            jSONObject1.putOpt("render_type", 0);
                        }
                    }
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                    return jSONObject0;
                }
                catch(Exception exception0) {
                }
                RD.Zh(exception0.getMessage(), new Object[0]);
                return jSONObject0;
            }
        });
    }

    public static void Zh(Owx owx0, com.bytedance.sdk.openadsdk.qla.PjT.PjT pjT0, String s) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "web_behavior_load", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("arbi_current_url", pjT0.ReZ());
                    jSONObject1.put("current_url_index", pjT0.cr());
                    jSONObject1.put("arbi_load_duration", ((double)pjT0.gK()));
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh("TTAD.AdEvent", new Object[]{"onWebBehaviorLoad", throwable0.getMessage()});
                }
                return jSONObject0;
            }
        });
    }

    public static void Zh(Owx owx0, String s) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "picture_click", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject0.put("ad_slot_type", owx0.ig().getNativeAdType());
                    jSONObject0.put("interaction_method", owx0.Sks());
                    jSONObject1.put("ad_extra_data", jSONObject0.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh(throwable0.toString(), new Object[0]);
                }
                return jSONObject1;
            }
        });
    }

    public static void Zh(Owx owx0, String s, int v) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "check_meta", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject0.put("error_code", v);
                    jSONObject0.put("check_url", xs.Gr().Vs());
                    jSONObject1.put("ad_extra_data", jSONObject0.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh(throwable0.toString(), new Object[0]);
                }
                return jSONObject1;
            }
        });
    }

    public static void Zh(Owx owx0, String s, int v, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        try {
            jSONObject0.put("type", v);
        }
        catch(JSONException unused_ex) {
        }
        ReZ.Zh(owx0, s, "download_app_ad_track", jSONObject0);
    }

    public static void Zh(Owx owx0, String s, long v) {
        if(owx0 == null) {
            return;
        }
        if(v > 0L && v < 200000L) {
            ReZ.PjT(System.currentTimeMillis(), owx0, s, "video_click_duration", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    JSONObject jSONObject1 = new JSONObject();
                    try {
                        jSONObject0.put("video_click_duration_time", v);
                        jSONObject1.put("ad_extra_data", jSONObject0.toString());
                    }
                    catch(Throwable unused_ex) {
                    }
                    return jSONObject1;
                }
            });
        }
    }

    public static void Zh(Owx owx0, String s, String s1, JSONObject jSONObject0) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, s1, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = jSONObject0;
                    if(jSONObject1 != null) {
                        jSONObject0.put("ad_extra_data", jSONObject1.toString());
                    }
                }
                catch(Exception unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void Zh(Owx owx0, String s, String s1, JSONObject jSONObject0, long v) {
        if(owx0 != null && jSONObject0 != null) {
            ReZ.PjT(System.currentTimeMillis(), owx0, s, s1, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("ad_extra_data", jSONObject0.toString());
                        jSONObject0.put("duration", v);
                    }
                    catch(Throwable unused_ex) {
                    }
                    return jSONObject0;
                }
            });
        }
    }

    public static void Zh(Owx owx0, String s, JSONObject jSONObject0) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "arbitrage_loading_show", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject1.put("pag_json_data", jSONObject0);
                    jSONObject0.put("ad_extra_data", jSONObject1);
                }
                catch(JSONException unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void cr(Owx owx0, com.bytedance.sdk.openadsdk.qla.PjT.PjT pjT0, String s) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("arbi_current_url", pjT0.ReZ());
                    jSONObject1.put("current_url_index", pjT0.cr());
                    jSONObject1.put("trigger_scroll_x", ((double)pjT0.SM()));
                    jSONObject1.put("trigger_scroll_y", ((double)pjT0.DWo()));
                    jSONObject1.put("arbi_offset_y", ((double)pjT0.qj()));
                    jSONObject1.put("scroll_type", pjT0.xf());
                    jSONObject1.put("scroll_duration", ((double)pjT0.xs()));
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
                catch(Throwable throwable0) {
                    RD.Zh("TTAD.AdEvent", new Object[]{"onWebBehaviorScroll", throwable0.getMessage()});
                }
                return jSONObject0;
            }
        });
    }

    public static void cr(Owx owx0, String s, int v) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "material_status", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trigger_type", v);
                    jSONObject2.put("image_mode", owx0.fK());
                    jSONObject0.put("pag_json_data", jSONObject2.toString());
                    jSONObject1.put("ad_extra_data", jSONObject0.toString());
                }
                catch(Throwable unused_ex) {
                }
                return jSONObject1;
            }
        });
    }

    @DungeonFlag
    private static void cr(Owx owx0, String s, String s1, JSONObject jSONObject0) {
        if(owx0 != null && !TextUtils.isEmpty(s) && (!owx0.bop() || !"show".equals(s))) {
            if("show".equals(s)) {
                owx0.Au(true);
            }
            ReZ.PjT(new Au("onShow") {
                @Override
                public void run() {
                    String s;
                    if(ub.cr().fA()) {
                        int v = owx0.joj();
                        s = com.bytedance.sdk.openadsdk.core.SM.PjT.PjT.PjT(((Application)ub.PjT())).PjT(s1, 0x1991AAE361FL, v);
                    }
                    else {
                        s = "none";
                    }
                    com.bytedance.sdk.openadsdk.cr.ReZ.49.1 reZ$49$10 = new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                        final com.bytedance.sdk.openadsdk.cr.ReZ.49 Zh;

                        @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                        public JSONObject PjT() {
                            JSONObject jSONObject0;
                            try {
                                tT.Zh(com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT);
                                jSONObject0 = null;
                                jSONObject0 = new JSONObject();
                                com.bytedance.sdk.openadsdk.cr.ReZ.49 reZ$490 = com.bytedance.sdk.openadsdk.cr.ReZ.49.this;
                                JSONObject jSONObject1 = reZ$490.JQp;
                                if(jSONObject1 == null) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("interaction_method", com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.Sks());
                                    jSONObject2.put("real_interaction_method", com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.RD());
                                    jSONObject2.put("video_skip_result", ub.cr().xs(String.valueOf(com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.joj())));
                                    jSONObject2.put("au_show", s);
                                    com.bytedance.sdk.openadsdk.Owx.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT, jSONObject2);
                                    jSONObject0.put("ad_extra_data", jSONObject2.toString());
                                }
                                else {
                                    jSONObject1.put("interaction_method", reZ$490.PjT.Sks());
                                    int v = com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.RD();
                                    com.bytedance.sdk.openadsdk.cr.ReZ.49.this.JQp.put("real_interaction_method", v);
                                    int v1 = ub.cr().xs(String.valueOf(com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.joj()));
                                    com.bytedance.sdk.openadsdk.cr.ReZ.49.this.JQp.put("video_skip_result", v1);
                                    com.bytedance.sdk.openadsdk.cr.ReZ.49.this.JQp.put("au_show", s);
                                    com.bytedance.sdk.openadsdk.Owx.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT, com.bytedance.sdk.openadsdk.cr.ReZ.49.this.JQp);
                                    jSONObject0.put("ad_extra_data", com.bytedance.sdk.openadsdk.cr.ReZ.49.this.JQp.toString());
                                }
                                jSONObject0.putOpt("log_extra", com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.xR());
                                float f = ((double)(((double)(System.currentTimeMillis() / 1000L)) - com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.kNB())).floatValue();
                                if(f <= 0.0f) {
                                    f = 0.0f;
                                }
                                jSONObject0.putOpt("show_time", f);
                                jSONObject0.putOpt("ua_policy", com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.OMu());
                                String s = com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.Co();
                                if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s)) {
                                    try {
                                        jSONObject0.put("ttdsp_price", Math.round(Float.parseFloat(s) * 100000.0f));
                                    }
                                    catch(Throwable throwable0) {
                                        jSONObject0.put("ttdsp_price", 0);
                                        RD.Zh("TTAD.AdEvent", throwable0.getMessage());
                                    }
                                }
                                if(com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.Vs() != null) {
                                    try {
                                        Object object0 = com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.Vs().get("sdk_bidding_type");
                                        if(object0 != null && Integer.parseInt(object0.toString()) == 2) {
                                            Object object1 = com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT.Vs().get("price");
                                            if(object1 != null) {
                                                jSONObject0.put("ttdsp_price", Math.round(Double.parseDouble(object1.toString()) * 100000.0));
                                                return jSONObject0;
                                            }
                                        }
                                    }
                                    catch(Throwable throwable1) {
                                        RD.PjT("TTAD.AdEvent", "client bidding price error: ", throwable1);
                                    }
                                }
                            }
                            catch(Exception unused_ex) {
                            }
                            return jSONObject0;
                        }
                    };
                    ReZ.PjT(System.currentTimeMillis(), owx0, s1, s, reZ$49$10);
                    if("show".equals(s)) {
                        if(!owx0.VZ()) {
                            if(owx0.es()) {
                                com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(owx0.zYH(), new com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.Zh("show_urls", owx0));
                            }
                            else {
                                ReZ.PjT(owx0);
                            }
                        }
                        JSONObject jSONObject0 = jSONObject0;
                        if(jSONObject0 != null) {
                            int v1 = jSONObject0.optInt("dynamic_show_type");
                            if(owx0.uLf() == 1 && (v1 == 7 || v1 == 10)) {
                                int v2 = xs.Gr().hN();
                                SM.PjT().postDelayed(new Runnable() {
                                    final com.bytedance.sdk.openadsdk.cr.ReZ.49 PjT;

                                    @Override
                                    public void run() {
                                        JSONObject jSONObject0 = new JSONObject();
                                        try {
                                            jSONObject0.put("auto_click", true);
                                            ReZ.Zh(com.bytedance.sdk.openadsdk.cr.ReZ.49.this.PjT, com.bytedance.sdk.openadsdk.cr.ReZ.49.this.Zh, "click", jSONObject0);
                                        }
                                        catch(Exception unused_ex) {
                                            RD.Zh("TTAD.AdEvent", "ugen click exception");
                                        }
                                    }
                                }, ((long)v2));
                            }
                        }
                        com.bytedance.sdk.openadsdk.core.SM.ReZ.PjT(owx0, s);
                    }
                }
            });
        }
    }

    public static void cr(Owx owx0, String s, JSONObject jSONObject0) {
        if(owx0 == null) {
            return;
        }
        ReZ.PjT(owx0, s, -1L, jSONObject0);
    }
}

