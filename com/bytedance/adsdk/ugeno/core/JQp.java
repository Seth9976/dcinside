package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ReZ.Zh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JQp {
    public static class PjT {
        private String Au;
        private List JQp;
        private String PjT;
        private JSONObject ReZ;
        private String XX;
        private String Zh;
        private JSONObject cr;
        private PjT cz;

        public List JQp() {
            return this.JQp;
        }

        public String PjT() {
            return this.PjT;
        }

        public void PjT(PjT jQp$PjT0) {
            if(this.JQp == null) {
                this.JQp = new ArrayList();
            }
            this.JQp.add(jQp$PjT0);
        }

        public void PjT(String s) {
            this.Zh = s;
        }

        public String ReZ() {
            return this.Zh;
        }

        public String Zh() {
            return this.XX;
        }

        public JSONObject cr() {
            return this.ReZ;
        }

        public JSONObject cz() {
            return this.cr;
        }

        @Override
        public String toString() {
            return "UGNode{id=\'" + this.PjT + '\'' + ", name=\'" + this.Zh + '\'' + '}';
        }
    }

    private String JQp;
    private JSONObject PjT;
    private String ReZ;
    private boolean XX;
    private JSONObject Zh;
    private JSONObject cr;
    private JSONObject cz;

    public JQp(JSONObject jSONObject0, JSONObject jSONObject1) {
        this(jSONObject0, jSONObject1, null);
    }

    public JQp(JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2) {
        if(jSONObject0 != null) {
            this.PjT = jSONObject0.has("body") ? jSONObject0.optJSONObject("body") : jSONObject0.optJSONObject("main_template");
            this.Zh = jSONObject0.optJSONObject("sub_templates");
            JSONObject jSONObject3 = jSONObject0.has("meta") ? jSONObject0.optJSONObject("meta") : jSONObject0.optJSONObject("template_info");
            if(jSONObject3 != null) {
                if(jSONObject0.has("body")) {
                    this.XX = true;
                    String s = jSONObject3.optString("version");
                    this.ReZ = s;
                    if(TextUtils.isEmpty(s)) {
                        this.ReZ = "3.0";
                    }
                }
                else {
                    this.ReZ = jSONObject3.optString("sdk_version");
                }
                if(jSONObject3.has("adType")) {
                    this.JQp = jSONObject3.optString("adType");
                }
            }
            else if(jSONObject0.has("body")) {
                this.ReZ = "3.0";
                this.XX = true;
            }
            this.cr = jSONObject1;
            this.cz = jSONObject2;
        }
    }

    private PjT PjT(JSONObject jSONObject0, PjT jQp$PjT0) {
        PjT jQp$PjT2;
        if(jSONObject0 == null) {
            return null;
        }
        String s = jSONObject0.has("type") ? jSONObject0.optString("type") : jSONObject0.optString("name");
        String s1 = jSONObject0.optString("id");
        JSONObject jSONObject1 = new JSONObject();
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s2 = (String)object0;
            if(!TextUtils.equals(s2, "children")) {
                try {
                    jSONObject1.put(s2, jSONObject0.opt(s2));
                }
                catch(JSONException unused_ex) {
                }
            }
        }
        PjT jQp$PjT1 = new PjT();
        jQp$PjT1.PjT = s1;
        jQp$PjT1.Zh = !this.XX || !TextUtils.equals("Video", s) ? s : s + "V3";
        jQp$PjT1.ReZ = jSONObject1;
        jQp$PjT1.cz = jQp$PjT0;
        jQp$PjT1.XX = this.ReZ;
        jQp$PjT1.Au = this.JQp;
        if(jSONObject1.has("i18n")) {
            jQp$PjT1.cr = jSONObject1.optJSONObject("i18n");
        }
        if(TextUtils.equals(s, "CustomComponent")) {
            this.PjT(jSONObject0, jQp$PjT1.ReZ);
        }
        JSONArray jSONArray0 = jSONObject0.optJSONArray("children");
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject2 = jSONArray0.optJSONObject(v);
                String s3 = jSONObject0.has("type") ? jSONObject0.optString("type") : jSONObject0.optString("name");
                String s4 = Zh.PjT(jSONObject2.optString("id"), this.cr);
                if(TextUtils.equals(s3, "Template")) {
                    JSONObject jSONObject3 = this.Zh;
                    if(jSONObject3 == null) {
                        jQp$PjT2 = null;
                    }
                    else {
                        jSONObject2 = jSONObject3.optJSONObject(s4);
                        jQp$PjT2 = this.PjT(jSONObject2, jQp$PjT1);
                    }
                }
                else {
                    jQp$PjT2 = this.PjT(jSONObject2, jQp$PjT1);
                }
                if(jQp$PjT2 != null) {
                    jQp$PjT1.PjT(jQp$PjT2);
                }
            }
        }
        return jQp$PjT1;
    }

    private void PjT(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(this.cz != null && jSONObject1 != null) {
            String s = jSONObject1.optString("targetId");
            try {
                String s1 = this.cz.optString(s);
                if(TextUtils.isEmpty(s1)) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(s1);
                JSONObject jSONObject3 = jSONObject1.optJSONObject("targetProps");
                if(jSONObject3 != null) {
                    Iterator iterator0 = jSONObject3.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        String s2 = (String)object0;
                        Object object1 = jSONObject3.opt(s2);
                        if(!TextUtils.equals(s2, "events") || !jSONObject2.has("events")) {
                            jSONObject2.put(s2, object1);
                        }
                        else if(object1 instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.XX.Zh.PjT(jSONObject2.optJSONArray("events"), ((JSONArray)object1));
                        }
                    }
                    JSONArray jSONArray0 = jSONObject0.optJSONArray("children");
                    if(jSONArray0 == null) {
                        jSONArray0 = new JSONArray();
                    }
                    jSONArray0.put(jSONObject2);
                    if(!jSONObject0.has("children")) {
                        jSONObject0.put("children", jSONArray0);
                    }
                }
            }
            catch(JSONException unused_ex) {
            }
        }
    }

    public static boolean PjT(PjT jQp$PjT0) {
        return jQp$PjT0 != null && jQp$PjT0.ReZ != null;
    }

    public PjT PjT() {
        return this.PjT(this.PjT, null);
    }

    public List ReZ() {
        if(this.Zh == null) {
            return null;
        }
        List list0 = new ArrayList();
        Iterator iterator0 = this.Zh.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            PjT jQp$PjT0 = this.PjT(this.Zh.optJSONObject(((String)object0)), null);
            if(jQp$PjT0 != null) {
                list0.add(jQp$PjT0);
            }
        }
        return list0;
    }

    public String Zh() {
        return this.ReZ;
    }

    public boolean cr() {
        return this.XX;
    }
}

