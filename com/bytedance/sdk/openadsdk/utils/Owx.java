package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.qla.Zh;
import java.util.HashMap;
import org.json.JSONObject;

public class Owx {
    public static int PjT = 0x80000000;
    public static final String[] ReZ = null;
    public static int Zh = 0x80000000;

    static {
        Owx.ReZ = new String[]{"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    }

    public static String PjT() [...] // 潜在的解密器

    public static void PjT(cz cz0, String s) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("Referer", "https://www.pangleglobal.com/");
        cz0.PjT(s, hashMap0);
    }

    public static void PjT(String s) {
        Class class0 = Owx.class;
        __monitor_enter(class0);
        if(s == null) {
            __monitor_exit(class0);
            return;
        }
        try {
            for(int v = 0; true; ++v) {
                String[] arr_s = Owx.ReZ;
                if(v >= arr_s.length) {
                    break;
                }
                if(s.contains(arr_s[v])) {
                    int v1 = Owx.PjT + 1;
                    Owx.PjT = v1;
                    SM.PjT(v1);
                    break;
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            if(s.contains("/api/ad/union/sdk/settings/") || s.contains("/api/ad/union/sdk/strategies/adn")) {
                if(Owx.Zh == 0x80000000) {
                    Owx.Zh = SM.cz();
                }
                int v2 = Owx.Zh + 1;
                Owx.Zh = v2;
                if(v2 >= 3) {
                    String s1 = xs.Gr().Qf();
                    int v3 = Owx.Zh;
                    xs.Gr().jp();
                    Owx.Zh = 0;
                    ReZ.PjT();
                    ReZ.PjT("clear_domain", false, new Zh() {
                        @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                        public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                            JSONObject jSONObject0 = new JSONObject();
                            try {
                                jSONObject0.put("domain", s1);
                                jSONObject0.put("times", v3);
                            }
                            catch(Exception unused_ex) {
                            }
                            return cr.Zh().PjT("clear_domain").Zh(jSONObject0.toString());
                        }
                    });
                }
                SM.Zh(Owx.Zh);
            }
        }
        catch(Throwable throwable0) {
            __monitor_exit(class0);
            throw throwable0;
        }
        __monitor_exit(class0);
    }

    public static void Zh() {
        synchronized(Owx.class) {
            if(Owx.Zh == 0) {
                return;
            }
            Owx.Zh = 0;
            SM.Zh(0);
        }
    }
}

