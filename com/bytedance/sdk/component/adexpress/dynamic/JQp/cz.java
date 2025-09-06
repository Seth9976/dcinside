package com.bytedance.sdk.component.adexpress.dynamic.JQp;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.adexpress.dynamic.cr.JQp;
import com.bytedance.sdk.component.adexpress.dynamic.cr.cr;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class cz {
    static class PjT {
        float PjT;
        boolean ReZ;
        float Zh;

        public static PjT PjT(JSONObject jSONObject0) {
            PjT cz$PjT0 = new PjT();
            if(jSONObject0 != null) {
                cz$PjT0.PjT = (float)jSONObject0.optDouble("width");
                cz$PjT0.Zh = (float)jSONObject0.optDouble("height");
                cz$PjT0.ReZ = jSONObject0.optBoolean("isLandscape");
            }
            return cz$PjT0;
        }
    }

    private ReZ JQp;
    private JSONObject PjT;
    private com.bytedance.sdk.component.adexpress.dynamic.cr.ReZ ReZ;
    private static HashMap XX;
    private JSONObject Zh;
    private PjT cr;
    private cr cz;

    static {
        HashMap hashMap0 = new HashMap();
        cz.XX = hashMap0;
        hashMap0.put("subtitle", "description");
        cz.XX.put("source", "source|app.app_name");
        cz.XX.put("screenshot", "dynamic_creative.screenshot");
    }

    public cz(JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.PjT = jSONObject0;
        this.Zh = jSONObject1;
        this.ReZ = new com.bytedance.sdk.component.adexpress.dynamic.cr.ReZ(jSONObject1);
        this.cr = PjT.PjT(jSONObject2);
        this.cz = cr.PjT(jSONObject3);
    }

    private String PjT() {
        com.bytedance.sdk.component.adexpress.dynamic.cr.ReZ reZ0 = this.ReZ;
        if(reZ0 == null) {
            return "";
        }
        Object object0 = reZ0.PjT("adx_name");
        return object0 == null ? "" : String.valueOf(object0);
    }

    private String PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String[] arr_s = s.split("\\|");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(this.ReZ.Zh(s1)) {
                String s2 = String.valueOf(this.ReZ.PjT(s1));
                if(!TextUtils.isEmpty(s2)) {
                    return s2;
                }
            }
        }
        return "";
    }

    private void PjT(Au au0) {
        if(au0 == null) {
            return;
        }
        int v = com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ() == null ? XX.PjT(com.bytedance.sdk.component.adexpress.cr.PjT()) : com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ().qla();
        int v1 = XX.Zh(com.bytedance.sdk.component.adexpress.cr.PjT(), ((float)v));
        float f = this.cr.ReZ ? this.cr.PjT : Math.min(this.cr.PjT, v1);
        if(this.cr.Zh == 0.0f) {
            au0.JQp(f);
            au0.DWo().JQp().DWo("auto");
            au0.cz(0.0f);
            return;
        }
        au0.JQp(f);
        int v2 = XX.Zh(com.bytedance.sdk.component.adexpress.cr.PjT(), ((float)XX.Zh(com.bytedance.sdk.component.adexpress.cr.PjT())));
        au0.cz((this.cr.ReZ ? this.cr.Zh : Math.min(this.cr.Zh, v2)));
        au0.DWo().JQp().DWo("fixed");
    }

    private void PjT(JQp jQp0, int v) {
        if(v != 5 && v != 15 && v != 50 && v != 0x9A) {
            jQp0.PjT("image");
            com.bytedance.sdk.component.adexpress.dynamic.cr.cz cz0 = jQp0.JQp();
            cz0.Owx("image.0.url");
            jQp0.XX().Owx("image.0.url");
            if(!TextUtils.isEmpty("creative")) {
                cz0.qla("creative");
                jQp0.XX().qla("creative");
            }
            JSONObject jSONObject0 = cz0.NR();
            if(jSONObject0 != null) {
                cz0.tT(jSONObject0.optString("imageLottieTosPath"));
                cz0.xf(jSONObject0.optBoolean("animationsLoop"));
                cz0.yIW(jSONObject0.optInt("lottieAppNameMaxLength"));
                cz0.Yo(jSONObject0.optInt("lottieAdDescMaxLength"));
                cz0.iZZ(jSONObject0.optInt("lottieAdTitleMaxLength"));
            }
            jQp0.Zh("image.0.url");
            JSONObject jSONObject1 = new JSONObject();
            try {
                jSONObject1.put("width", this.PjT("image.0.width"));
                jSONObject1.put("height", this.PjT("image.0.height"));
            }
            catch(JSONException unused_ex) {
            }
            jQp0.ReZ(jSONObject1.toString());
            cz0.xi();
            return;
        }
        jQp0.PjT("video");
        jQp0.JQp().Owx("video");
        if(!TextUtils.isEmpty("video")) {
            jQp0.JQp().qla("video");
            jQp0.XX().qla("video");
        }
        jQp0.XX().Owx("video");
        jQp0.Zh("video");
        jQp0.JQp().Lmo();
    }

    private void PjT(com.bytedance.sdk.component.adexpress.dynamic.cr.cz cz0) {
        if(cz0 == null) {
            return;
        }
        String s = cz0.KM();
        boolean z = !com.bytedance.sdk.component.adexpress.cr.Zh();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        int v = s.indexOf("{{");
        int v1 = s.indexOf("}}");
        if(v >= 0 && v1 >= 0 && v1 >= v) {
            String s1 = this.PjT(s.substring(v + 2, v1));
            StringBuilder stringBuilder0 = new StringBuilder(s.substring(0, v));
            if(!TextUtils.isEmpty(s1)) {
                stringBuilder0.append(s1);
            }
            stringBuilder0.append(s.substring(v1 + 2));
            cz0.xf(stringBuilder0.toString());
            return;
        }
        cz0.xf(s);
    }

    public Au PjT(double f, int v, double f1, String s, xs xs0) {
        JSONObject jSONObject0;
        this.ReZ.PjT();
        try {
            jSONObject0 = null;
            jSONObject0 = new JSONObject(this.cz.Zh);
        }
        catch(JSONException unused_ex) {
        }
        Au au0 = this.PjT(com.bytedance.sdk.component.adexpress.dynamic.JQp.cr.PjT(this.PjT, jSONObject0), null);
        this.PjT(au0);
        com.bytedance.sdk.component.adexpress.dynamic.JQp.JQp jQp0 = new com.bytedance.sdk.component.adexpress.dynamic.JQp.JQp(f, v, f1, s, xs0);
        com.bytedance.sdk.component.adexpress.dynamic.JQp.JQp.PjT jQp$PjT0 = new com.bytedance.sdk.component.adexpress.dynamic.JQp.JQp.PjT();
        jQp$PjT0.PjT = this.cr.PjT;
        jQp$PjT0.Zh = this.cr.Zh;
        jQp$PjT0.ReZ = 0.0f;
        jQp0.PjT(jQp$PjT0);
        jQp0.PjT(au0, 0.0f, 0.0f);
        jQp0.PjT();
        return jQp0.PjT.cr == 65536.0f ? null : jQp0.PjT.cz;
    }

    public Au PjT(JSONObject jSONObject0) {
        String s = jSONObject0.optString("type");
        String s1 = jSONObject0.optString("id");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("values");
        SM.PjT(s, jSONObject1);
        JSONObject jSONObject2 = SM.PjT(s, SM.PjT(jSONObject0.optJSONArray("sceneValues")), jSONObject1);
        Au au0 = new Au();
        if(TextUtils.isEmpty(s1)) {
            au0.Zh(String.valueOf(au0.hashCode()));
        }
        else {
            au0.Zh(s1);
        }
        if(jSONObject1 != null) {
            this.Zh(au0);
            au0.ReZ(((float)jSONObject1.optDouble("x")));
            au0.cr(((float)jSONObject1.optDouble("y")));
            au0.JQp(((float)jSONObject1.optDouble("width")));
            au0.cz(((float)jSONObject1.optDouble("height")));
            au0.XX(((float)jSONObject1.optInt("remainWidth")));
            JQp jQp0 = new JQp();
            jQp0.PjT(s);
            jQp0.Zh(jSONObject1.optString("data"));
            jQp0.ReZ(jSONObject1.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.cr.cz cz0 = com.bytedance.sdk.component.adexpress.dynamic.cr.cz.PjT(jSONObject1);
            jQp0.PjT(cz0);
            com.bytedance.sdk.component.adexpress.dynamic.cr.cz cz1 = com.bytedance.sdk.component.adexpress.dynamic.cr.cz.PjT(jSONObject2);
            if(cz1 == null) {
                jQp0.Zh(cz0);
            }
            else {
                jQp0.Zh(cz1);
            }
            this.PjT(cz0);
            this.PjT(cz1);
            if(TextUtils.equals(s, "video-image-budget")) {
                JSONObject jSONObject3 = this.Zh;
                if(jSONObject3 != null) {
                    this.PjT(jQp0, jSONObject3.optInt("image_mode"));
                }
            }
            String s2 = jQp0.Zh();
            com.bytedance.sdk.component.adexpress.dynamic.cr.cz cz2 = jQp0.JQp();
            if(cz.XX.containsKey(s2) && !cz2.oG()) {
                cz2.Owx(((String)cz.XX.get(s2)));
            }
            String s3 = cz2.oG() ? jQp0.ReZ() : this.PjT(jQp0.ReZ());
            if(com.bytedance.sdk.component.adexpress.cr.Zh()) {
                if(TextUtils.equals(s2, "star") || TextUtils.equals(s2, "text_star")) {
                    s3 = this.PjT("dynamic_creative.score_exact_i18n|");
                }
                if(TextUtils.equals(s2, "score-count") || TextUtils.equals(s2, "score-count-type-1") || TextUtils.equals(s2, "score-count-type-2")) {
                    s3 = this.PjT("dynamic_creative.comment_num_i18n|");
                }
                if("root".equals(s2) && cz0.QB()) {
                    s3 = this.PjT("image.0.url");
                }
            }
            if(TextUtils.isEmpty(this.PjT()) || !TextUtils.equals("logo-union", s) && !TextUtils.equals("logo", s)) {
                jQp0.Zh(s3);
            }
            else {
                jQp0.Zh(s3 + "adx:" + this.PjT());
            }
            au0.PjT(jQp0);
        }
        return au0;
    }

    public Au PjT(JSONObject jSONObject0, Au au0) {
        if(jSONObject0 == null) {
            return null;
        }
        String s = jSONObject0.optString("type");
        if(TextUtils.equals(s, "custom-component-vessel")) {
            int v = jSONObject0.optInt("componentId");
            if(this.cz != null) {
                ReZ reZ0 = new ReZ();
                this.JQp = reZ0;
                JSONObject jSONObject1 = reZ0.PjT(this.cz.PjT, v, jSONObject0);
                if(jSONObject1 != null) {
                    jSONObject0 = jSONObject1;
                }
            }
        }
        Au au1 = this.PjT(jSONObject0);
        au1.PjT(au0);
        JSONArray jSONArray0 = jSONObject0.optJSONArray("children");
        if(jSONArray0 == null) {
            au1.PjT(null);
            return au1;
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
            JSONArray jSONArray1 = jSONArray0.optJSONArray(v1);
            if(jSONArray1 != null) {
                ArrayList arrayList2 = new ArrayList();
                int v2 = TextUtils.equals(s, "tag-group") ? au1.DWo().JQp().Xtz() : jSONArray1.length();
                for(int v3 = 0; v3 < v2; ++v3) {
                    Au au2 = this.PjT(jSONArray1.optJSONObject(v3), au1);
                    if(com.bytedance.sdk.component.adexpress.cr.Zh() && "skip-with-time".equals(au1.DWo().Zh()) && !"transparent".equals(au1.tT()) && !TextUtils.isEmpty(au1.tT())) {
                        au2.ReZ(au1.tT());
                    }
                    arrayList0.add(au2);
                    arrayList2.add(au2);
                }
                arrayList1.add(arrayList2);
            }
        }
        if(arrayList0.size() > 0) {
            au1.PjT(arrayList0);
        }
        if(arrayList1.size() > 0) {
            au1.Zh(arrayList1);
        }
        return au1;
    }

    private void Zh(Au au0) {
        if(au0 == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.dynamic.cr.ReZ reZ0 = this.ReZ;
        if(reZ0 == null) {
            return;
        }
        Object object0 = reZ0.PjT("image.0.url");
        if(object0 == null) {
            return;
        }
        String s = String.valueOf(object0);
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Object object1 = this.ReZ.PjT("title");
        if(object1 == null) {
            return;
        }
        String s1 = String.valueOf(object1);
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        Object object2 = this.ReZ.PjT("description");
        if(object2 == null) {
            return;
        }
        String s2 = String.valueOf(object2);
        if(TextUtils.isEmpty(s2)) {
            return;
        }
        Object object3 = this.ReZ.PjT("icon");
        if(object3 == null) {
            return;
        }
        String s3 = String.valueOf(object3);
        if(TextUtils.isEmpty(s3)) {
            return;
        }
        Object object4 = this.ReZ.PjT("app.app_name");
        Object object5 = this.ReZ.PjT("source");
        if(object4 == null && object5 == null) {
            return;
        }
        if(object4 == null) {
            object4 = object5;
        }
        String s4 = String.valueOf(object4);
        if(TextUtils.isEmpty(s4)) {
            return;
        }
        au0.PjT("imageUrl", s);
        au0.PjT("title", s1);
        au0.PjT("description", s2);
        au0.PjT("icon", s3);
        au0.PjT("app_name", s4);
        au0.PjT(true);
    }
}

