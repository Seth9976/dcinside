package com.bytedance.adsdk.ugeno.cr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class cz {
    public static class PjT {
        private Map JQp;
        private String PjT;
        private String ReZ;
        private String Zh;
        private String cr;
        private Map cz;

        public PjT() {
            this.ReZ = "global";
        }

        public String JQp() {
            return this.Zh;
        }

        public String PjT() [...] // 潜在的解密器

        public void PjT(String s) {
            this.ReZ = s;
        }

        public void PjT(Map map0) {
            this.JQp = map0;
        }

        public Map ReZ() {
            return this.JQp;
        }

        public void ReZ(String s) {
            this.PjT = s;
        }

        public String Zh() {
            return this.cr;
        }

        public void Zh(String s) {
            this.cr = s;
        }

        public void Zh(Map map0) {
            this.cz = map0;
        }

        public String cr() {
            return this.PjT;
        }

        public void cr(String s) {
            this.Zh = s;
        }

        @Override
        public String toString() {
            return "Action{scheme=\'" + this.ReZ + '\'' + ", name=\'" + this.cr + '\'' + ", params=" + this.JQp + ", host=\'" + this.Zh + '\'' + ", origin=\'" + this.PjT + '\'' + ", extra=" + this.cz + '}';
        }
    }

    private PjT PjT;
    private List Zh;

    public static cz PjT(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(jSONObject0 == null) {
            return null;
        }
        cz cz0 = new cz();
        String s = jSONObject0.optString("on");
        JSONArray jSONArray0 = jSONObject0.optJSONArray("handlers");
        cz0.PjT = xf.PjT(s, jSONObject1);
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                PjT cz$PjT0 = xf.PjT(jSONArray0.optString(v), jSONObject1);
                if(cz$PjT0 != null) {
                    arrayList0.add(cz$PjT0);
                }
            }
            cz0.Zh = arrayList0;
            return cz0;
        }
        return null;
    }

    public PjT PjT() {
        return this.PjT;
    }

    public List Zh() {
        return this.Zh;
    }
}

