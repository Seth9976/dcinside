package com.bytedance.adsdk.PjT;

import com.bytedance.adsdk.ugeno.ReZ.PjT;
import org.json.JSONObject;

public class Zh implements PjT {
    static class com.bytedance.adsdk.PjT.Zh.PjT implements com.bytedance.adsdk.ugeno.ReZ.PjT.PjT {
        private com.bytedance.adsdk.PjT.Zh.PjT PjT;
        private String Zh;

        private com.bytedance.adsdk.PjT.Zh.PjT(String s) {
            this.Zh = s;
            this.PjT = com.bytedance.adsdk.PjT.Zh.PjT.PjT(s);
        }

        public static com.bytedance.adsdk.PjT.Zh.PjT PjT(String s) {
            return new com.bytedance.adsdk.PjT.Zh.PjT(s);
        }

        @Override  // com.bytedance.adsdk.ugeno.ReZ.PjT$PjT
        public Object PjT(JSONObject jSONObject0) {
            com.bytedance.adsdk.PjT.Zh.PjT pjT0 = this.PjT;
            if(pjT0 == null) {
                return this.Zh;
            }
            Object object0 = pjT0.PjT(jSONObject0);
            if(object0 instanceof String) {
                return object0;
            }
            return object0 instanceof com.bytedance.adsdk.PjT.Zh.PjT.PjT ? String.valueOf(Au.PjT(((com.bytedance.adsdk.PjT.Zh.PjT.PjT)object0))) : String.valueOf(object0);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.ReZ.PjT
    public com.bytedance.adsdk.ugeno.ReZ.PjT.PjT PjT(String s) {
        return com.bytedance.adsdk.PjT.Zh.PjT.PjT(s);
    }
}

