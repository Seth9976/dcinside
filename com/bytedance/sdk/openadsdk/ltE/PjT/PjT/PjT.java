package com.bytedance.sdk.openadsdk.ltE.PjT.PjT;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.xf;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class PjT extends cr {
    public PjT(Context context0, Owx owx0, String s) {
        super(context0, owx0, s);
    }

    private static void PjT(Owx owx0, Map map0) {
        if(map0 == null) {
            return;
        }
        if(owx0 != null && owx0.cyr() == 0) {
            map0.put("auto_click", Boolean.valueOf(!owx0.Au()));
        }
        map0.put("can_query_install", 0);
    }

    public static boolean PjT(Owx owx0, String s, Context context0, String s1, Map map0) {
        if(owx0 != null && owx0.ZsT() == 0) {
            return false;
        }
        try {
            if(!TextUtils.isEmpty(s)) {
                Intent intent0 = wN.PjT(context0, s);
                if(intent0 == null) {
                    return false;
                }
                intent0.putExtra("START_ONLY_FOR_ANDROID", true);
                if(!(context0 instanceof Activity)) {
                    intent0.addFlags(0x10000000);
                }
                context0.startActivity(intent0);
                if(map0 == null) {
                    map0 = new HashMap();
                }
                PjT.PjT(owx0, map0);
                ReZ.PjT(owx0, s1, "click_open", map0);
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public static boolean PjT(String s, Context context0, String s1, Owx owx0, Map map0) {
        Intent intent1;
        Uri uri0;
        Intent intent0 = null;
        try {
            if(TextUtils.isEmpty(s)) {
                com.bytedance.sdk.openadsdk.core.cr.PjT(owx0, s1, -2, null);
                return false;
            }
            uri0 = Uri.parse(s);
            intent1 = new Intent("android.intent.action.VIEW");
        }
        catch(Throwable throwable0) {
            goto label_23;
        }
        try {
            intent1.setData(uri0);
            if(!(context0 instanceof Activity)) {
                intent1.addFlags(0x10000000);
            }
            if(map0 == null) {
                map0 = new HashMap();
            }
            PjT.PjT(owx0, map0);
            map0.put("url", s);
            ReZ.PjT(owx0, s1, "open_url_app", map0);
            context0.startActivity(intent1);
            xf.PjT().PjT(map0).PjT(owx0, s1);
            ReZ.PjT("dp_start_act_success", owx0, s1, map0);
            return true;
        }
        catch(Throwable throwable0) {
            intent0 = intent1;
        }
    label_23:
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("exception", throwable0.getMessage());
            if(intent0 != null) {
                jSONObject0.put("intent", intent0.toString());
            }
            jSONObject0.put("can_query_install", 0);
        }
        catch(Exception unused_ex) {
        }
        com.bytedance.sdk.openadsdk.core.cr.PjT(owx0, s1, -4, jSONObject0);
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cr
    public boolean PjT() {
        boolean z = false;
        if(this.PjT == null) {
            return false;
        }
        if(this.Zh != null && this.Zh.cyr() == 0) {
            HashMap hashMap0 = new HashMap();
            if(this.cz >= 11) {
                z = true;
            }
            hashMap0.put("dpl_probability_jump", Boolean.valueOf(z));
            return PjT.PjT(this.Zh, "", this.ReZ(), this.ReZ, hashMap0);
        }
        return PjT.PjT(this.Zh, "", this.ReZ(), this.ReZ, null);
    }

    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cr
    public boolean Zh() {
        com.bytedance.sdk.openadsdk.core.cr.PjT(this.Zh, this.ReZ, 1, null);
        if(this.Zh.RV() == null) {
            com.bytedance.sdk.openadsdk.core.cr.PjT(this.Zh, this.ReZ, -1, null);
        }
        else {
            HashMap hashMap0 = new HashMap();
            if(this.Zh != null && this.Zh.cyr() == 0) {
                hashMap0.put("dpl_probability_jump", Boolean.valueOf(this.cz >= 11));
            }
            if(PjT.PjT(this.Zh.RV().PjT(), this.ReZ(), this.ReZ, this.Zh, hashMap0)) {
                return true;
            }
            if(!this.cr || this.JQp.get()) {
                this.cr = true;
                PjT.PjT(this.Zh, hashMap0);
                ReZ.PjT(this.Zh, this.ReZ, "open_fallback_url", hashMap0);
                return false;
            }
        }
        return false;
    }
}

