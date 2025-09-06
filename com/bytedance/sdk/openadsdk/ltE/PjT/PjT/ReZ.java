package com.bytedance.sdk.openadsdk.ltE.PjT.PjT;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.RD.PjT;
import com.bytedance.sdk.openadsdk.core.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.xf;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class ReZ {
    private static Intent PjT(Context context0, String s, Owx owx0) {
        try {
            Uri uri0 = Uri.parse(s);
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setData(uri0);
            if(owx0 != null && owx0.ceO() != null && !TextUtils.isEmpty(owx0.ceO().cr())) {
                intent0.setPackage(owx0.ceO().cr());
            }
            if(!(context0 instanceof Activity)) {
                intent0.addFlags(0x10000000);
            }
            return intent0;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("DeepLinkUtils", throwable0.getMessage());
        return null;
    }

    private static void PjT(Context context0, Owx owx0, Map map0) {
        if(owx0 != null && owx0.cyr() == 0) {
            map0.put("auto_click", Boolean.valueOf(!owx0.Au()));
        }
        map0.put("can_query_install", 0);
    }

    public static boolean PjT() {
        return PjT.PjT("deeplink_utils_new", 0) == 1;
    }

    public static boolean PjT(Context context0, String s, Owx owx0, int v, Map map0, boolean z) {
        String s1 = wN.PjT(owx0);
        cr.PjT(owx0, s1, 1, null);
        Intent intent0 = ReZ.PjT(context0, s, owx0);
        if(!TextUtils.isEmpty(s) && intent0 != null) {
            if(map0 == null) {
                map0 = new HashMap();
            }
            if(owx0 != null && owx0.cyr() == 0) {
                map0.put("auto_click", Boolean.valueOf(!owx0.Au()));
            }
            map0.put("can_query_install", 0);
            map0.put("url", s);
            if(ub.cr().Au()) {
                wN.PjT(owx0, s1);
            }
            try {
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, s1, "open_url_app", map0);
                context0.startActivity(intent0);
                xf.PjT().PjT(map0).PjT(owx0, s1);
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT("dp_start_act_success", owx0, s1, map0);
                return true;
            }
            catch(Throwable throwable0) {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("exception", throwable0.getMessage());
                    jSONObject0.put("intent", intent0.toString());
                    jSONObject0.put("can_query_install", 0);
                }
                catch(Exception unused_ex) {
                }
                cr.PjT(owx0, s1, -4, jSONObject0);
                return false;
            }
        }
        cr.PjT(owx0, s1, -2, owx0.RV().cr());
        return false;
    }
}

