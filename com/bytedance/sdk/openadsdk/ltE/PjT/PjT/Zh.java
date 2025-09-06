package com.bytedance.sdk.openadsdk.ltE.PjT.PjT;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.xf;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class Zh {
    private static Intent PjT(Context context0, String s) {
        try {
            Uri uri0 = Uri.parse(s);
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setData(uri0);
            if(!(context0 instanceof Activity)) {
                intent0.addFlags(0x10000000);
                return intent0;
            }
            return intent0;
        }
        catch(Throwable throwable0) {
            RD.Zh("DeepLinkUtils", throwable0.getMessage());
            return null;
        }
    }

    private static void PjT(Context context0, Owx owx0, Map map0) {
        if(owx0 != null && owx0.cyr() == 0) {
            map0.put("auto_click", Boolean.valueOf(!owx0.Au()));
        }
        map0.put("can_query_install", 0);
    }

    public static boolean PjT(Context context0, String s, Owx owx0) {
        String s1 = wN.PjT(owx0);
        cr.PjT(owx0, s1, 1, null);
        Intent intent0 = Zh.PjT(context0, s);
        if(!TextUtils.isEmpty(s) && intent0 != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("url", s);
            try {
                ReZ.PjT(owx0, s1, "open_url_app", hashMap0);
                context0.startActivity(intent0);
                xf.PjT().PjT(hashMap0).PjT(owx0, s1);
                ReZ.PjT("dp_start_act_success", owx0, s1, hashMap0);
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

