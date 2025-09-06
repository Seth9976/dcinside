package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.ReZ.Zh;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT {
    public static class com.bytedance.adsdk.ugeno.core.PjT.PjT {
        private float[] Au;
        private String DWo;
        private String JQp;
        private long PjT;
        private String ReZ;
        private String SM;
        private float XX;
        private float Zh;
        private long cr;
        private float cz;

        public float[] Au() {
            return this.Au;
        }

        public String DWo() {
            return this.DWo;
        }

        public String JQp() {
            return this.JQp;
        }

        public static com.bytedance.adsdk.ugeno.core.PjT.PjT PjT(JSONObject jSONObject0, ReZ reZ0) {
            Context context0 = null;
            if(jSONObject0 == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.core.PjT.PjT pjT$PjT0 = new com.bytedance.adsdk.ugeno.core.PjT.PjT();
            pjT$PjT0.PjT(jSONObject0.optLong("duration"));
            String s = jSONObject0.optString("loop");
            if(TextUtils.equals("infinite", s)) {
                pjT$PjT0.PjT(-1.0f);
            }
            else {
                try {
                    pjT$PjT0.PjT(Float.parseFloat(s));
                }
                catch(NumberFormatException unused_ex) {
                    pjT$PjT0.PjT(0.0f);
                }
            }
            pjT$PjT0.PjT(jSONObject0.optString("loopMode"));
            pjT$PjT0.Zh(jSONObject0.optString("type"));
            if(TextUtils.equals(pjT$PjT0.JQp(), "ripple")) {
                pjT$PjT0.ReZ(jSONObject0.optString("rippleColor"));
            }
            View view0 = reZ0.qj();
            if(view0 != null) {
                context0 = view0.getContext();
            }
            if(TextUtils.equals(pjT$PjT0.JQp(), "backgroundColor")) {
                String s1 = Zh.PjT(jSONObject0.optString("valueTo"), reZ0.xf());
                int v = com.bytedance.adsdk.ugeno.XX.PjT.PjT(jSONObject0.optString("valueFrom"));
                int v1 = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1);
                pjT$PjT0.Zh(((float)v));
                pjT$PjT0.ReZ(((float)v1));
            }
            else if(!TextUtils.equals(pjT$PjT0.JQp(), "translateX") && !TextUtils.equals(pjT$PjT0.JQp(), "translateY") || context0 == null) {
                pjT$PjT0.Zh(((float)jSONObject0.optDouble("valueFrom")));
                pjT$PjT0.ReZ(((float)jSONObject0.optDouble("valueTo")));
            }
            else {
                try {
                    float f = Au.PjT(context0, ((float)jSONObject0.optDouble("valueFrom")));
                    float f1 = Au.PjT(context0, ((float)jSONObject0.optDouble("valueTo")));
                    pjT$PjT0.Zh(f);
                    pjT$PjT0.ReZ(f1);
                }
                catch(Exception unused_ex) {
                    Log.e("animation", "animation ");
                }
            }
            pjT$PjT0.cr(jSONObject0.optString("interpolator"));
            String s2 = Zh.PjT(jSONObject0.optString("startDelay"), reZ0.xf());
            Log.d("TAG", "createAnimationModel: ");
            pjT$PjT0.Zh(com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s2, 0L));
            JSONArray jSONArray0 = jSONObject0.optJSONArray("values");
            if(jSONArray0 != null && jSONArray0.length() > 0) {
                float[] arr_f = new float[jSONArray0.length()];
                int v2 = 0;
                if(!TextUtils.equals(pjT$PjT0.JQp(), "translateX") && !TextUtils.equals(pjT$PjT0.JQp(), "translateY") || context0 == null) {
                    while(v2 < jSONArray0.length()) {
                        arr_f[v2] = (float)PjT.PjT(jSONArray0.optString(v2), reZ0.xf());
                        ++v2;
                    }
                }
                else {
                    while(v2 < jSONArray0.length()) {
                        arr_f[v2] = Au.PjT(context0, ((float)PjT.PjT(jSONArray0.optString(v2), reZ0.xf())));
                        ++v2;
                    }
                }
                pjT$PjT0.PjT(arr_f);
            }
            return pjT$PjT0;
        }

        public long PjT() {
            return this.PjT;
        }

        public void PjT(float f) {
            this.Zh = f;
        }

        public void PjT(long v) {
            this.PjT = v;
        }

        public void PjT(String s) {
            this.ReZ = s;
        }

        public void PjT(float[] arr_f) {
            this.Au = arr_f;
        }

        public String ReZ() {
            return this.ReZ;
        }

        public void ReZ(float f) {
            this.XX = f;
        }

        public void ReZ(String s) {
            this.DWo = s;
        }

        public String SM() {
            return this.SM;
        }

        public float XX() {
            return this.XX;
        }

        public float Zh() {
            return this.Zh;
        }

        public void Zh(float f) {
            this.cz = f;
        }

        public void Zh(long v) {
            this.cr = v;
        }

        public void Zh(String s) {
            this.JQp = s;
        }

        public long cr() {
            return this.cr;
        }

        public void cr(String s) {
            this.SM = s;
        }

        public float cz() {
            return this.cz;
        }
    }

    private long JQp;
    private String PjT;
    private List ReZ;
    private float Zh;
    private long cr;
    private String cz;

    public long JQp() {
        return this.JQp;
    }

    public static double PjT(Object object0, JSONObject jSONObject0) {
        if(object0 instanceof String) {
            return com.bytedance.adsdk.ugeno.XX.ReZ.PjT(Zh.PjT(((String)object0), jSONObject0), 0.0);
        }
        if(object0 instanceof Double) {
            return (double)(((Double)object0));
        }
        if(object0 instanceof Long) {
            return (double)(((Double)object0));
        }
        return object0 instanceof Integer ? ((double)(((Double)object0))) : 0.0;
    }

    public static PjT PjT(String s, ReZ reZ0) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            return PjT.PjT(new JSONObject(s), reZ0);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public static PjT PjT(JSONObject jSONObject0, ReZ reZ0) {
        return PjT.PjT(jSONObject0, null, reZ0);
    }

    public static PjT PjT(JSONObject jSONObject0, JSONObject jSONObject1, ReZ reZ0) {
        if(jSONObject0 == null) {
            return null;
        }
        PjT pjT0 = new PjT();
        pjT0.PjT(jSONObject0.optString("ordering"));
        String s = jSONObject0.optString("loop");
        if(TextUtils.equals("infinite", s)) {
            pjT0.PjT(-1.0f);
        }
        else {
            try {
                pjT0.PjT(Float.parseFloat(s));
            }
            catch(NumberFormatException unused_ex) {
                pjT0.PjT(0.0f);
            }
        }
        pjT0.PjT(jSONObject0.optLong("duration", 0L));
        pjT0.Zh(com.bytedance.adsdk.ugeno.XX.ReZ.PjT(Zh.PjT(jSONObject0.optString("startDelay"), reZ0.xf()), 0L));
        pjT0.Zh(jSONObject0.optString("loopMode"));
        JSONArray jSONArray0 = jSONObject0.optJSONArray("animators");
        if(jSONArray0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject2 = jSONArray0.optJSONObject(v);
                if(jSONObject1 != null) {
                    com.bytedance.adsdk.ugeno.XX.Zh.PjT(jSONObject1, jSONObject2);
                }
                arrayList0.add(com.bytedance.adsdk.ugeno.core.PjT.PjT.PjT(jSONObject2, reZ0));
            }
            pjT0.PjT(arrayList0);
        }
        return pjT0;
    }

    public String PjT() {
        return this.PjT;
    }

    public void PjT(float f) {
        this.Zh = f;
    }

    public void PjT(long v) {
        this.cr = v;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public void PjT(List list0) {
        this.ReZ = list0;
    }

    public List ReZ() {
        return this.ReZ;
    }

    public float Zh() {
        return this.Zh;
    }

    public void Zh(long v) {
        this.JQp = v;
    }

    public void Zh(String s) {
        this.cz = s;
    }

    public long cr() {
        return this.cr;
    }

    public String cz() {
        return this.cz;
    }
}

