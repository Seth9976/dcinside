package com.bytedance.sdk.openadsdk.Lrd.Zh;

import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.Zh;
import com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;
import org.json.JSONObject;

public class cr {
    public static void PjT(Owx owx0, PjT pjT0, com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT jQp$PjT0) {
        owx0.NR();
        Jo.ReZ(new Au("mrc_report") {
            @Override
            public void run() {
                if(owx0.VZ()) {
                    if(owx0.es()) {
                        ReZ.PjT(owx0.zYH(), new Zh("show_urls", owx0));
                    }
                    else {
                        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0);
                    }
                }
                String s = wN.PjT(owx0);
                JSONObject jSONObject0 = new JSONObject();
                PjT pjT0 = pjT0;
                if(pjT0 != null) {
                    try {
                        jSONObject0.put("root_view", PjT.PjT(pjT0));
                        com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT jQp$PjT0 = jQp$PjT0;
                        if(jQp$PjT0 != null) {
                            int v = jQp$PjT0.PjT;
                            if(v != -1) {
                                jSONObject0.put("dynamic_show_type", v);
                            }
                            int v1 = jQp$PjT0.Zh;
                            if(v1 != -1) {
                                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(v1 + 1, jSONObject0);
                            }
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                com.bytedance.sdk.openadsdk.cr.ReZ.Zh(owx0, s, "mrc_show", jSONObject0);
            }
        });
    }
}

