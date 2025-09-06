package com.bytedance.sdk.openadsdk.RD;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bykv.vk.openvk.PjT.PjT.Zh.cr.h;
import com.bytedance.sdk.component.utils.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.iZZ;
import com.bytedance.sdk.openadsdk.Sks.ReZ;
import com.bytedance.sdk.openadsdk.Sks.cr;
import com.bytedance.sdk.openadsdk.core.SM.Zh;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.settings.qj;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.Owx;
import com.bytedance.sdk.openadsdk.utils.wN;
import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class PjT {
    public static final ConcurrentHashMap PjT;
    private static volatile ReZ ReZ;
    public static String Zh;

    static {
        PjT.PjT = new ConcurrentHashMap();
    }

    // 去混淆评级： 低(20)
    public static int JQp() {
        return PjT.Zh() ? PjT.PjT("ad_load_and_render_opt", "webview_preload_cache", 0) : 0;
    }

    public static int PjT(String s, int v) {
        ReZ reZ0 = PjT.XX();
        return reZ0 == null ? v : reZ0.PjT(s, v);
    }

    public static int PjT(String s, String s1, int v) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            String s2 = s + "_" + s1;
            ConcurrentHashMap concurrentHashMap0 = PjT.PjT;
            Object object0 = concurrentHashMap0.get(s2);
            if(object0 != null && object0 instanceof Integer) {
                return (int)(((Integer)object0));
            }
            try {
                String s3 = PjT.XX().PjT(s, "");
                if(TextUtils.isEmpty(s3)) {
                    return v;
                }
                int v1 = new JSONObject(s3).optInt(s1, v);
                concurrentHashMap0.put(s2, v1);
                return v1;
            }
            catch(Throwable throwable0) {
                RD.Zh("StrategyUtils", throwable0.getMessage());
            }
        }
        return v;
    }

    public static ReZ PjT(Context context0, String s) {
        if(PjT.ReZ == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                if(PjT.ReZ == null) {
                    ReZ reZ0 = new ReZ(new cr() {
                        @Override  // com.bytedance.sdk.openadsdk.Sks.cr
                        public String JQp() {
                            String s = wN.PjT("/api/ad/union/sdk/strategies/adn", false, true);
                            PjT.Zh = s;
                            return s;
                        }

                        @Override  // com.bytedance.sdk.openadsdk.Sks.cr
                        public HandlerThread PjT(String s, int v) {
                            return Au.PjT(s, v);
                        }

                        @Override  // com.bytedance.sdk.openadsdk.Sks.cr
                        public ExecutorService PjT() {
                            return Jo.JQp();
                        }

                        @Override  // com.bytedance.sdk.openadsdk.Sks.cr
                        public JSONObject PjT(JSONObject jSONObject0) {
                            int v = jSONObject0.optInt("cypher", -1);
                            if(v == -1) {
                                return jSONObject0;
                            }
                            if(v == 3) {
                                String s = com.bytedance.sdk.component.utils.PjT.ReZ(jSONObject0.optString("message"));
                                if(!TextUtils.isEmpty(s)) {
                                    try {
                                        return new JSONObject(s);
                                    }
                                    catch(Throwable unused_ex) {
                                    }
                                }
                            }
                            return jSONObject0;
                        }

                        @Override  // com.bytedance.sdk.openadsdk.Sks.cr
                        public String ReZ() {
                            return "pag_adn_strategy_center";
                        }

                        // 去混淆评级： 低(20)
                        @Override  // com.bytedance.sdk.openadsdk.Sks.cr
                        public Map XX() {
                            Map map0 = new HashMap();
                            ((HashMap)map0).put("User-Agent", wN.ReZ());
                            return map0;
                        }

                        @Override  // com.bytedance.sdk.openadsdk.Sks.cr
                        public Context Zh() {
                            return context0 == null ? ub.PjT() : context0;
                        }

                        @Override  // com.bytedance.sdk.openadsdk.Sks.cr
                        public Handler cr() {
                            return fDm.Zh();
                        }

                        @Override  // com.bytedance.sdk.openadsdk.Sks.cr
                        public JSONObject cz() {
                            try {
                                JSONObject jSONObject0 = qj.PjT(iZZ.PjT(ub.PjT(), 0L));
                                if(!jSONObject0.has("app_id")) {
                                    if(TextUtils.isEmpty(s)) {
                                        if(!TextUtils.isEmpty(SM.Zh().cr())) {
                                            jSONObject0.put("app_id", SM.Zh().cr());
                                            return com.bytedance.sdk.component.utils.PjT.PjT(jSONObject0);
                                        }
                                        return null;
                                    }
                                    else {
                                        jSONObject0.put("app_id", s);
                                    }
                                }
                                return com.bytedance.sdk.component.utils.PjT.PjT(jSONObject0);
                            }
                            catch(Throwable throwable0) {
                            }
                            RD.Zh("StrategyUtils", throwable0.getMessage());
                            return null;
                        }
                    });
                    PjT.ReZ = reZ0;
                    reZ0.PjT(new com.bytedance.sdk.openadsdk.Sks.PjT() {
                        @Override  // com.bytedance.sdk.openadsdk.Sks.PjT
                        public void PjT() {
                            com.bytedance.sdk.openadsdk.ub.ReZ.PjT(new com.bytedance.sdk.openadsdk.ub.cr() {
                                final com.bytedance.sdk.openadsdk.RD.PjT.2 PjT;

                                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                    com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                    pjT0.Zh("strategy_fetch");
                                    return pjT0;
                                }
                            });
                        }

                        @Override  // com.bytedance.sdk.openadsdk.Sks.PjT
                        public void PjT(int v, String s) {
                            com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                                final com.bytedance.sdk.openadsdk.RD.PjT.2 PjT;

                                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                    com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                    pjT0.Zh("strategy_fetch");
                                    return pjT0;
                                }
                            });
                            Owx.PjT(PjT.Zh);
                        }

                        @Override  // com.bytedance.sdk.openadsdk.Sks.PjT
                        public void Zh() {
                            com.bytedance.sdk.openadsdk.ub.ReZ.Zh(new com.bytedance.sdk.openadsdk.ub.cr() {
                                final com.bytedance.sdk.openadsdk.RD.PjT.2 PjT;

                                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                    com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                    pjT0.Zh("strategy_fetch");
                                    return pjT0;
                                }
                            });
                            com.bytedance.sdk.openadsdk.cz.PjT.PjT().Zh();
                            com.bytedance.sdk.openadsdk.Owx.PjT.ReZ.PjT().Zh();
                            h.ReZ(!com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT());
                            Owx.Zh();
                            Zh.Zh().PjT(new HashMap());
                        }
                    });
                }
                goto label_10;
            }
            catch(Throwable throwable0) {
                try {
                    throwable0.getMessage();
                label_10:
                    __monitor_exit(class0);
                    return PjT.ReZ;
                }
                catch(Throwable throwable1) {
                }
            }
            __monitor_exit(class0);
            throw throwable1;
        }
        return PjT.ReZ;
    }

    public static String PjT(String s, String s1) [...] // 潜在的解密器

    public static String PjT(String s, String s1, String s2) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            String s3 = s + "_" + s1;
            ConcurrentHashMap concurrentHashMap0 = PjT.PjT;
            Object object0 = concurrentHashMap0.get(s3);
            if(object0 != null && object0 instanceof String) {
                return (String)object0;
            }
            try {
                String s4 = PjT.XX().PjT(s, "");
                if(TextUtils.isEmpty(s4)) {
                    return s2;
                }
                String s5 = new JSONObject(s4).optString(s1, s2);
                concurrentHashMap0.put(s3, s5);
                return s5;
            }
            catch(Throwable throwable0) {
                RD.Zh("StrategyUtils", throwable0.getMessage());
            }
        }
        return s2;
    }

    public static void PjT() {
        ReZ reZ0 = PjT.XX();
        if(reZ0 != null) {
            reZ0.PjT();
        }
    }

    public static boolean PjT(String s, boolean z) {
        ReZ reZ0 = PjT.XX();
        return reZ0 == null ? z : reZ0.PjT(s, z);
    }

    public static boolean ReZ() {
        return PjT.Zh() && PjT.PjT("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    private static ReZ XX() {
        return PjT.PjT(ub.PjT(), SM.Zh().cr());
    }

    public static boolean Zh() {
        return PjT.PjT("ad_load_and_render_opt", "enable", 0) == 1;
    }

    public static boolean cr() {
        return PjT.Zh() && PjT.PjT("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    // 去混淆评级： 低(20)
    public static int cz() {
        return PjT.Zh() ? PjT.PjT("ad_load_and_render_opt", "webview_preload_cache_v3", 0) : 0;
    }
}

