package com.bytedance.sdk.openadsdk.core.SM;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.JQp;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ReZ {
    private static boolean PjT = false;

    static {
    }

    // 去混淆评级： 低(40)
    public static int JQp() {
        return ub.cr().OMu() ? 1 : 6;
    }

    public static Map PjT(String s, String s1) {
        if(ub.cr().OMu()) {
            Zh zh0 = Zh.Zh();
            return s1 == null ? zh0.PjT(s, new byte[0]) : zh0.PjT(s, s1.getBytes());
        }
        return new HashMap();
    }

    public static void PjT() {
        if(ReZ.PjT) {
            return;
        }
        if(ub.cr().OMu()) {
            ReZ.PjT = false;
        }
    }

    public static void PjT(MotionEvent motionEvent0) {
        if(ub.cr().OMu()) {
            Zh.Zh().PjT(motionEvent0);
        }
    }

    public static void PjT(Owx owx0, String s) {
        long v3;
        long v2;
        long v1;
        if(ub.cr().OMu()) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("ad_sdk_version", "7.1.0.4");
            hashMap0.put("au_show", s);
            if(owx0 != null) {
                String s1 = owx0.ydj();
                String s2 = "-1";
                if(TextUtils.isEmpty(s1)) {
                    hashMap0.put("request_id", "-1");
                }
                else {
                    hashMap0.put("request_id", s1);
                }
                try {
                    long v = -1L;
                    if(owx0.Tn() == null) {
                        v1 = -1L;
                        v2 = -1L;
                        v3 = -1L;
                    }
                    else {
                        v1 = owx0.Tn().optLong("ad_id", -1L);
                        v2 = owx0.Tn().optLong("rit", -1L);
                        v3 = owx0.Tn().optLong("ad_slot_type", -1L);
                        s2 = owx0.Tn().optString("ad_type", "-1");
                    }
                    hashMap0.put("ad_id", v1);
                    hashMap0.put("rit", v2);
                    hashMap0.put("ad_slot_type", v3);
                    hashMap0.put("ad_type", s2);
                    Map map0 = owx0.Vs();
                    if(map0 != null) {
                        Object object0 = map0.get("sdk_bidding_type");
                        if(object0 != null) {
                            v = Long.parseLong(object0.toString());
                        }
                    }
                    hashMap0.put("sdk_bidding_type", v);
                    Zh.Zh().PjT("AdShow", hashMap0);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    public static void PjT(String s) {
        if(TextUtils.isEmpty(s) && ub.cr().OMu()) {
            Zh.Zh().PjT(s);
        }
    }

    public static void PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        try {
            if(ub.cr().OMu()) {
                ReZ.PjT();
                if(ReZ.JQp() == 0) {
                    jSONObject0.put("sec_did", "");
                    String s = JQp.PjT(jSONObject0.toString());
                    Map map0 = Zh.Zh().PjT("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", (s == null ? new byte[0] : s.getBytes()));
                    if(map0 == null || map0.size() <= 0) {
                        jSONObject0.put("pglx", "8");
                    }
                    else {
                        for(Object object0: map0.keySet()) {
                            jSONObject0.put(((String)object0), map0.get(((String)object0)));
                        }
                        jSONObject0.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject0.put("pangle_m", s);
                    }
                    jSONObject0.put("ec", Zh.Zh().cz());
                    return;
                }
                jSONObject0.put("pglx", String.valueOf(ReZ.JQp()));
                return;
            }
            jSONObject0.put("pglx", "6");
            return;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("SecSdkHelperUtil", throwable0.getMessage());
        try {
            jSONObject0.put("pglx", "7");
        }
        catch(JSONException unused_ex) {
        }
    }

    // 去混淆评级： 低(40)
    public static String ReZ() {
        return ub.cr().OMu() ? "" : "";
    }

    public static void Zh() {
        if(ub.cr().OMu()) {
            Zh.Zh().PjT();
        }
    }

    public static void Zh(String s) {
        if(!TextUtils.isEmpty(s) && ub.cr().OMu()) {
            Zh.Zh().Zh(s);
        }
    }

    // 去混淆评级： 低(20)
    public static long cr() {
        return ub.cr().OMu() ? Zh.Zh().cz() : 0L;
    }

    // 去混淆评级： 低(40)
    public static String cz() {
        return ub.cr().OMu() ? "" : null;
    }
}

