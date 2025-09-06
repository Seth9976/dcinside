package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DWo {
    public static class PjT {
        private float Au;
        private int[] DWo;
        private long JQp;
        private int Owx;
        float PjT;
        private JSONObject RD;
        float ReZ;
        private float SM;
        private JSONObject Sks;
        private float XX;
        int Zh;
        private long cr;
        private float cz;
        private int fDm;
        private int gK;
        private String ltE;
        private int[] qj;
        private int qla;
        private SparseArray ub;
        private int xE;
        private int[] xf;
        private int[] xs;

        public PjT JQp(float f) {
            this.Au = f;
            return this;
        }

        public PjT JQp(int v) {
            this.qla = v;
            return this;
        }

        public PjT PjT(float f) {
            this.PjT = f;
            return this;
        }

        public PjT PjT(int v) {
            this.Owx = v;
            return this;
        }

        public PjT PjT(long v) {
            this.cr = v;
            return this;
        }

        public PjT PjT(SparseArray sparseArray0) {
            this.ub = sparseArray0;
            return this;
        }

        public PjT PjT(String s) {
            this.ltE = s;
            return this;
        }

        public PjT PjT(JSONObject jSONObject0) {
            this.RD = jSONObject0;
            return this;
        }

        public PjT PjT(int[] arr_v) {
            this.DWo = arr_v;
            return this;
        }

        public DWo PjT() {
            return new DWo(this, null);
        }

        public PjT ReZ(float f) {
            this.cz = f;
            return this;
        }

        public PjT ReZ(int v) {
            this.Zh = v;
            return this;
        }

        public PjT ReZ(int[] arr_v) {
            this.xf = arr_v;
            return this;
        }

        public PjT Zh(float f) {
            this.ReZ = f;
            return this;
        }

        public PjT Zh(int v) {
            this.gK = v;
            return this;
        }

        public PjT Zh(long v) {
            this.JQp = v;
            return this;
        }

        public PjT Zh(JSONObject jSONObject0) {
            this.Sks = jSONObject0;
            return this;
        }

        public PjT Zh(int[] arr_v) {
            this.qj = arr_v;
            return this;
        }

        public PjT cr(float f) {
            this.XX = f;
            return this;
        }

        public PjT cr(int v) {
            this.fDm = v;
            return this;
        }

        public PjT cr(int[] arr_v) {
            this.xs = arr_v;
            return this;
        }

        public PjT cz(float f) {
            this.SM = f;
            return this;
        }

        public PjT cz(int v) {
            this.xE = v;
            return this;
        }
    }

    private final float Au;
    private final long DWo;
    private final float JQp;
    private final int[] PjT;
    private final int[] ReZ;
    private final long SM;
    private final float XX;
    private final int[] Zh;
    private final int[] cr;
    private final float cz;
    private final int fDm;
    private final String gK;
    private final JSONObject ltE;
    private final int qj;
    private final SparseArray qla;
    private final JSONObject ub;
    private final int xE;
    private final int xf;
    private final int xs;

    private DWo(@NonNull PjT dWo$PjT0) {
        this.PjT = dWo$PjT0.qj;
        this.Zh = dWo$PjT0.xf;
        this.cr = dWo$PjT0.xs;
        this.ReZ = dWo$PjT0.DWo;
        this.JQp = dWo$PjT0.SM;
        this.cz = dWo$PjT0.Au;
        this.XX = dWo$PjT0.XX;
        this.Au = dWo$PjT0.cz;
        this.SM = dWo$PjT0.JQp;
        this.DWo = dWo$PjT0.cr;
        this.qj = dWo$PjT0.fDm;
        this.xf = dWo$PjT0.qla;
        this.xs = dWo$PjT0.xE;
        this.fDm = dWo$PjT0.gK;
        this.qla = dWo$PjT0.ub;
        this.gK = dWo$PjT0.ltE;
        this.xE = dWo$PjT0.Owx;
        this.ub = dWo$PjT0.RD;
        this.ltE = dWo$PjT0.Sks;
    }

    DWo(PjT dWo$PjT0, com.bytedance.sdk.openadsdk.core.model.DWo.1 dWo$10) {
        this(dWo$PjT0);
    }

    public static JSONObject PjT(SparseArray sparseArray0, int v) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            JSONArray jSONArray0 = new JSONArray();
            if(sparseArray0 != null) {
                for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
                    com.bytedance.sdk.openadsdk.core.Zh.ReZ.PjT reZ$PjT0 = (com.bytedance.sdk.openadsdk.core.Zh.ReZ.PjT)sparseArray0.valueAt(v1);
                    if(reZ$PjT0 != null) {
                        JSONObject jSONObject1 = new JSONObject();
                        jSONObject1.putOpt("force", reZ$PjT0.ReZ).putOpt("mr", reZ$PjT0.Zh).putOpt("phase", reZ$PjT0.PjT).putOpt("ts", reZ$PjT0.cr);
                        jSONArray0.put(jSONObject1);
                        jSONObject0.putOpt("ftc", v).putOpt("info", jSONArray0);
                    }
                }
            }
            return jSONObject0;
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public JSONObject PjT() {
        JSONObject jSONObject1;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject1 = this.ltE;
            if(jSONObject1 != null) {
                goto label_3;
            }
            goto label_8;
        }
        catch(Exception unused_ex) {
            return jSONObject0;
        }
        try {
        label_3:
            Iterator iterator0 = jSONObject1.keys();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_8;
                }
                Object object0 = iterator0.next();
                jSONObject0.putOpt(((String)object0), this.ltE.opt(((String)object0)));
            }
        }
        catch(Exception unused_ex) {
            try {
            label_8:
                int[] arr_v = this.PjT;
                if(arr_v != null && arr_v.length == 2) {
                    jSONObject0.putOpt("ad_x", ((int)arr_v[0])).putOpt("ad_y", ((int)this.PjT[1]));
                }
                int[] arr_v1 = this.Zh;
                if(arr_v1 != null && arr_v1.length == 2) {
                    jSONObject0.putOpt("width", ((int)arr_v1[0])).putOpt("height", ((int)this.Zh[1]));
                }
                int[] arr_v2 = this.ReZ;
                if(arr_v2 != null && arr_v2.length == 2) {
                    jSONObject0.putOpt("button_x", ((int)arr_v2[0])).putOpt("button_y", ((int)this.ReZ[1]));
                }
                int[] arr_v3 = this.cr;
                if(arr_v3 != null && arr_v3.length == 2) {
                    jSONObject0.putOpt("button_width", ((int)arr_v3[0])).putOpt("button_height", ((int)this.cr[1]));
                }
                jSONObject0.putOpt("down_x", Float.toString(this.JQp)).putOpt("down_y", Float.toString(this.cz)).putOpt("up_x", Float.toString(this.XX)).putOpt("up_y", Float.toString(this.Au)).putOpt("down_time", this.SM).putOpt("up_time", this.DWo).putOpt("toolType", this.qj).putOpt("deviceId", this.xf).putOpt("source", this.xs).putOpt("ft", DWo.PjT(this.qla, this.fDm)).putOpt("click_area_type", this.gK);
                int v = this.xE;
                if(v > 0) {
                    jSONObject0.putOpt("areaType", v);
                }
                JSONObject jSONObject2 = this.ub;
                if(jSONObject2 != null) {
                    jSONObject0.putOpt("rectInfo", jSONObject2);
                }
            }
            catch(Exception unused_ex) {
            }
            return jSONObject0;
        }
    }

    class com.bytedance.sdk.openadsdk.core.model.DWo.1 {
    }

}

