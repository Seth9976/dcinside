package com.bytedance.sdk.openadsdk.DWo;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cr;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT implements ReZ {
    private final Owx PjT;
    private final Map ReZ;
    private final Zh Zh;

    private PjT(Zh zh0, Owx owx0) {
        this.ReZ = new HashMap();
        this.Zh = zh0;
        this.PjT = owx0;
    }

    public static PjT PjT(Zh zh0, Owx owx0) {
        return new PjT(zh0, owx0);
    }

    private Owx PjT(JSONObject jSONObject0, String s) {
        String s1 = null;
        if(jSONObject0 == null) {
            return null;
        }
        Owx owx0 = Owx.cz();
        owx0.cr(jSONObject0);
        if(!TextUtils.isEmpty(s)) {
            owx0.Owx(s);
        }
        if(this.PjT == null) {
            return owx0;
        }
        if(owx0.uQg() != null) {
            s1 = "";
        }
        if(TextUtils.isEmpty(s1)) {
            return this.PjT;
        }
        cr cr0 = this.PjT.uQg();
        if(cr0 != null && s1.equals("")) {
            return this.PjT;
        }
        JSONObject jSONObject1 = new JSONObject();
        try {
            jSONObject1.put("lu", (cr0 == null ? "null" : ""));
            jSONObject1.put("ju", s1);
        }
        catch(JSONException unused_ex) {
        }
        String s2 = wN.PjT(this.PjT);
        com.bytedance.sdk.openadsdk.core.cr.PjT(this.PjT, s2, -5, jSONObject1);
        if(cr0 != null && s1.contains("play.google.com/store") && !s1.contains("referrer")) {
            owx0.uQg().PjT("");
        }
        return owx0;
    }

    private cz PjT(@NonNull Context context0, @NonNull Owx owx0, @NonNull JSONObject jSONObject0, @NonNull String s, boolean z) {
        cz cz0 = XX.PjT(context0, owx0, s);
        cz0.PjT(true);
        return cz0;
    }

    private void PjT(Context context0, Owx owx0, JSONObject jSONObject0, int v, boolean z) {
        if(context0 == null || owx0 == null || owx0.uQg() == null || jSONObject0 == null || this.Zh == null || ((cz)this.ReZ.get("")) != null) {
            return;
        }
        String s = wN.Zh(v);
        if(TextUtils.isEmpty(s)) {
            return;
        }
        cz cz0 = this.PjT(context0, owx0, jSONObject0, s, z);
        this.ReZ.put("", cz0);
    }

    private void PjT(Owx owx0, JSONObject jSONObject0) {
        if(this.Zh != null && owx0 != null && owx0.uQg() != null && this.ReZ.containsKey("")) {
            this.ReZ.remove("");
            try {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("message", "success");
                jSONObject1.put("status", "unsubscribed");
                jSONObject1.put("appad", jSONObject0);
                this.Zh.PjT("app_ad_event", jSONObject1);
            }
            catch(JSONException jSONException0) {
                RD.Zh("JsAppAdDownloadManager", jSONException0.getMessage());
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.DWo.ReZ
    public void PjT() {
        this.ReZ.clear();
    }

    @Override  // com.bytedance.sdk.openadsdk.DWo.ReZ
    public void PjT(Context context0, JSONObject jSONObject0, String s) {
        if(context0 != null) {
            Owx owx0 = this.PjT;
            if(owx0 != null) {
                XX.PjT(context0, owx0, s).cr();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.DWo.ReZ
    public void PjT(Context context0, JSONObject jSONObject0, String s, int v, boolean z) {
        if(context0 != null && jSONObject0 != null) {
            JSONObject jSONObject1 = jSONObject0.optJSONObject("data");
            if(jSONObject1 != null) {
                this.PjT(context0, this.PjT(jSONObject1, s), jSONObject1, v, z);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.DWo.ReZ
    public void PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        JSONObject jSONObject1 = jSONObject0.optJSONObject("data");
        if(jSONObject1 != null) {
            this.PjT(this.PjT(jSONObject1, null), jSONObject1);
        }
    }
}

