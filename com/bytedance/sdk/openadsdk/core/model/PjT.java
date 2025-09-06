package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.adexpress.PjT.Zh.Zh;
import com.bytedance.sdk.component.utils.RD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class PjT {
    public static class com.bytedance.sdk.openadsdk.core.model.PjT.PjT extends com.bytedance.sdk.openadsdk.core.model.Owx.PjT {
        private int PjT;

        public static com.bytedance.sdk.openadsdk.core.model.PjT.PjT PjT(JSONObject jSONObject0) {
            if(jSONObject0 == null) {
                return null;
            }
            com.bytedance.sdk.openadsdk.core.model.PjT.PjT pjT$PjT0 = new com.bytedance.sdk.openadsdk.core.model.PjT.PjT();
            pjT$PjT0.ReZ(jSONObject0.optString("id"));
            pjT$PjT0.cr(jSONObject0.optString("md5"));
            pjT$PjT0.JQp(jSONObject0.optString("url"));
            pjT$PjT0.cz(jSONObject0.optString("data"));
            pjT$PjT0.XX(jSONObject0.optString("diff_data"));
            pjT$PjT0.Zh(jSONObject0.optString("version"));
            pjT$PjT0.Au(jSONObject0.optString("dynamic_creative"));
            pjT$PjT0.PjT(jSONObject0.optInt("count_down_time"));
            return com.bytedance.sdk.openadsdk.core.model.PjT.PjT.PjT(pjT$PjT0) ? pjT$PjT0 : null;
        }

        private static boolean PjT(com.bytedance.sdk.openadsdk.core.model.PjT.PjT pjT$PjT0) {
            if(pjT$PjT0 == null) {
                return false;
            }
            return TextUtils.isEmpty(pjT$PjT0.cz()) ? false : !TextUtils.isEmpty(pjT$PjT0.Au());
        }

        public int PjT() {
            return this.PjT;
        }

        public void PjT(int v) {
            this.PjT = v;
        }

        public JSONObject Zh() {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("id", this.cz());
                jSONObject0.put("md5", this.XX());
                jSONObject0.put("url", this.Au());
                jSONObject0.put("data", this.SM());
                jSONObject0.put("diff_data", this.DWo());
                jSONObject0.put("version", this.JQp());
                jSONObject0.put("dynamic_creative", this.qj());
                jSONObject0.put("count_down_time", this.PjT());
                return jSONObject0;
            }
            catch(Throwable unused_ex) {
                return null;
            }
        }
    }

    private long Au;
    private JSONObject DWo;
    private boolean JQp;
    private String PjT;
    private String ReZ;
    private boolean SM;
    private String XX;
    private int Zh;
    private com.bytedance.sdk.openadsdk.core.model.PjT.PjT cr;
    private List cz;
    private volatile boolean qj;
    private int xf;
    private String xs;

    public PjT() {
        this.cz = new ArrayList();
        this.DWo = new JSONObject();
        this.qj = false;
    }

    public boolean Au() {
        return this.SM;
    }

    public boolean DWo() {
        return this.qj;
    }

    public boolean JQp() {
        return this.cz != null && this.cz.size() > 0;
    }

    public static Map PjT(PjT pjT0) {
        if(pjT0 == null) {
            return null;
        }
        Map map0 = new HashMap();
        for(Object object0: pjT0.cr()) {
            Owx owx0 = (Owx)object0;
            if(!TextUtils.isEmpty(owx0.MN())) {
                map0.put(owx0.MN(), owx0);
            }
        }
        return map0.size() == 0 ? null : map0;
    }

    public JSONObject PjT() {
        return this.DWo;
    }

    public void PjT(int v) {
        this.Zh = v;
    }

    public void PjT(long v) {
        this.Au = v;
    }

    public void PjT(Owx owx0) {
        this.cz.add(owx0);
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.model.PjT.PjT pjT$PjT0) {
        this.cr = pjT$PjT0;
        if(pjT$PjT0 == null) {
            return;
        }
        Zh.PjT(com.bytedance.sdk.openadsdk.core.model.Owx.PjT.PjT(pjT$PjT0, ""));
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public void PjT(List list0) {
        this.cz = list0;
    }

    public void PjT(JSONObject jSONObject0) {
        this.DWo = jSONObject0;
    }

    public void PjT(boolean z) {
        this.SM = z;
    }

    public static PjT ReZ(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        try {
            PjT pjT0 = new PjT();
            JSONObject jSONObject1 = jSONObject0.optJSONObject("choose_ui_data");
            if(jSONObject1 != null) {
                pjT0.Zh(jSONObject1);
            }
            pjT0.Zh(jSONObject0.optInt("multi_ad_style", 0));
            JSONArray jSONArray0 = jSONObject0.optJSONArray("creatives");
            if(jSONArray0 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    Owx owx0 = com.bytedance.sdk.openadsdk.core.Zh.PjT(jSONArray0.optJSONObject(v));
                    if(owx0 != null) {
                        owx0.SM(pjT0.xf());
                        arrayList0.add(owx0);
                    }
                }
                pjT0.PjT(arrayList0);
            }
            pjT0.PjT(jSONObject0.optBoolean("is_choose_ad_original", false));
            pjT0.PjT(jSONObject0.optString("request_id", ""));
            return pjT0;
        }
        catch(Throwable throwable0) {
        }
        RD.PjT("AdInfo", "fromJson: ", throwable0);
        return null;
    }

    public int ReZ() {
        return this.Zh;
    }

    public void ReZ(String s) {
        this.XX = s;
    }

    public com.bytedance.sdk.openadsdk.core.model.PjT.PjT SM() {
        return this.cr;
    }

    public boolean XX() {
        if(this.SM() != null && this.cr() != null && this.cr().size() > 1) {
            this.JQp = true;
            return true;
        }
        this.JQp = false;
        this.PjT(null);
        return this.JQp;
    }

    public String Zh() [...] // 潜在的解密器

    public void Zh(int v) {
        this.xf = v;
    }

    public void Zh(String s) {
        this.ReZ = s;
    }

    public void Zh(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        this.PjT(com.bytedance.sdk.openadsdk.core.model.PjT.PjT.PjT(jSONObject0.optJSONObject("tpl_info")));
    }

    public List cr() {
        return this.cz;
    }

    public void cr(String s) {
        this.xs = s;
    }

    public Owx cz() {
        return this.cz.size() <= 0 ? null : ((Owx)this.cz.get(0));
    }

    public String fDm() {
        return this.xs;
    }

    public void qj() {
        this.qj = false;
    }

    public boolean xf() {
        return this.xf == 1;
    }

    @Nullable
    public JSONObject xs() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            com.bytedance.sdk.openadsdk.core.model.PjT.PjT pjT$PjT0 = this.SM();
            if(pjT$PjT0 != null) {
                JSONObject jSONObject1 = new JSONObject();
                JSONObject jSONObject2 = pjT$PjT0.Zh();
                if(jSONObject2 != null) {
                    jSONObject1.put("tpl_info", jSONObject2);
                    jSONObject0.put("choose_ui_data", jSONObject1);
                }
            }
            if(this.cz != null && this.cz.size() > 0) {
                JSONArray jSONArray0 = new JSONArray();
                for(int v = 0; v < this.cz.size(); ++v) {
                    jSONArray0.put(((Owx)this.cz.get(v)).dDm());
                }
                jSONObject0.put("creatives", jSONArray0);
            }
            jSONObject0.put("is_choose_ad_original", this.SM);
            jSONObject0.put("multi_ad_style", this.xf);
            jSONObject0.put("request_id", this.PjT);
            return jSONObject0;
        }
        catch(Throwable throwable0) {
        }
        RD.PjT("AdInfo", "toJsonObj: ", throwable0);
        return null;
    }
}

