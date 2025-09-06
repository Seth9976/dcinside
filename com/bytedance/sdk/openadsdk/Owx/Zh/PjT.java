package com.bytedance.sdk.openadsdk.Owx.Zh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT {
    public static class com.bytedance.sdk.openadsdk.Owx.Zh.PjT.PjT {
        private String PjT;
        private int ReZ;
        private String Zh;

        public static com.bytedance.sdk.openadsdk.Owx.Zh.PjT.PjT PjT(JSONObject jSONObject0) {
            if(jSONObject0 == null) {
                return null;
            }
            com.bytedance.sdk.openadsdk.Owx.Zh.PjT.PjT pjT$PjT0 = new com.bytedance.sdk.openadsdk.Owx.Zh.PjT.PjT();
            pjT$PjT0.PjT = jSONObject0.optString("url");
            pjT$PjT0.Zh = jSONObject0.optString("md5");
            pjT$PjT0.ReZ = jSONObject0.optInt("type");
            return pjT$PjT0;
        }

        public String PjT() {
            return this.PjT;
        }

        // 去混淆评级： 低(40)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof com.bytedance.sdk.openadsdk.Owx.Zh.PjT.PjT ? this.PjT != null && this.PjT.equals(((com.bytedance.sdk.openadsdk.Owx.Zh.PjT.PjT)object0).PjT) && (this.Zh != null && this.Zh.equals(((com.bytedance.sdk.openadsdk.Owx.Zh.PjT.PjT)object0).Zh)) : super.equals(object0);
        }
    }

    private String PjT;
    private List ReZ;
    private List Zh;

    public String PjT() {
        return this.PjT;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public void PjT(List list0) {
        this.Zh = list0;
    }

    public List ReZ() {
        return this.ReZ;
    }

    public static PjT Zh(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            PjT pjT0 = new PjT();
            pjT0.PjT(jSONObject0.optString("version"));
            JSONArray jSONArray0 = jSONObject0.optJSONArray("resources");
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            if(jSONArray0 != null && jSONArray0.length() > 0) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    com.bytedance.sdk.openadsdk.Owx.Zh.PjT.PjT pjT$PjT0 = com.bytedance.sdk.openadsdk.Owx.Zh.PjT.PjT.PjT(jSONArray0.optJSONObject(v));
                    if(pjT$PjT0 != null) {
                        switch(pjT$PjT0.ReZ) {
                            case 1: {
                                arrayList0.add(pjT$PjT0);
                                break;
                            }
                            case 2: {
                                if(arrayList1.size() < 10) {
                                    arrayList1.add(pjT$PjT0);
                                }
                            }
                        }
                    }
                }
            }
            pjT0.PjT(arrayList0);
            pjT0.Zh(arrayList1);
            return pjT0;
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public List Zh() {
        return this.Zh;
    }

    public void Zh(List list0) {
        this.ReZ = list0;
    }
}

