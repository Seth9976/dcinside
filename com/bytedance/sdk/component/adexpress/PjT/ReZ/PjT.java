package com.bytedance.sdk.component.adexpress.PjT.ReZ;

import android.text.TextUtils;
import android.util.Pair;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class PjT {
    public static class com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT {
        private String PjT;
        private int ReZ;
        private String Zh;

        public String PjT() {
            return this.PjT;
        }

        public void PjT(int v) {
            this.ReZ = v;
        }

        public void PjT(String s) {
            this.PjT = s;
        }

        public int ReZ() {
            return this.ReZ;
        }

        public String Zh() {
            return this.Zh;
        }

        public void Zh(String s) {
            this.Zh = s;
        }

        // 去混淆评级： 低(40)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT ? this.PjT != null && this.PjT.equals(((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).PjT()) && (this.Zh != null && this.Zh.equals(((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).Zh())) : super.equals(object0);
        }
    }

    public static class Zh {
        private String PjT;
        private List ReZ;
        private String Zh;

        public String PjT() {
            return this.PjT;
        }

        public void PjT(String s) {
            this.PjT = s;
        }

        public void PjT(List list0) {
            this.ReZ = list0;
        }

        public List Zh() {
            return this.ReZ;
        }

        public void Zh(String s) {
            this.Zh = s;
        }
    }

    private Zh JQp;
    private String PjT;
    private String ReZ;
    private Map XX;
    private String Zh;
    private List cr;
    private String cz;

    public PjT() {
        this.XX = new ConcurrentHashMap();
    }

    // 去混淆评级： 低(30)
    public boolean Au() {
        return !TextUtils.isEmpty(this.cr()) && !TextUtils.isEmpty(this.ReZ()) && !TextUtils.isEmpty(this.Zh());
    }

    public String DWo() {
        if(this.Au()) {
            JSONObject jSONObject0 = this.SM();
            return jSONObject0 == null ? null : jSONObject0.toString();
        }
        return null;
    }

    public static PjT JQp(String s) {
        if(s == null) {
            return null;
        }
        try {
            return PjT.PjT(new JSONObject(s));
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public Zh JQp() {
        return this.JQp;
    }

    public static PjT PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        PjT pjT0 = new PjT();
        pjT0.PjT(jSONObject0.optString("name"));
        pjT0.Zh(jSONObject0.optString("version"));
        pjT0.ReZ(jSONObject0.optString("main"));
        pjT0.cr(jSONObject0.optString("template_fetch_url", ""));
        JSONArray jSONArray0 = jSONObject0.optJSONArray("resources");
        ArrayList arrayList0 = new ArrayList();
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject1 = jSONArray0.optJSONObject(v);
                com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT pjT$PjT0 = new com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT();
                pjT$PjT0.PjT(jSONObject1.optString("url"));
                pjT$PjT0.Zh(jSONObject1.optString("md5"));
                pjT$PjT0.PjT(jSONObject1.optInt("level"));
                arrayList0.add(pjT$PjT0);
            }
        }
        pjT0.PjT(arrayList0);
        try {
            JSONObject jSONObject2 = jSONObject0.optJSONObject("engines");
            if(jSONObject2 != null) {
                Iterator iterator0 = jSONObject2.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    PjT pjT1 = PjT.PjT(jSONObject2.optJSONObject(s));
                    if(pjT1 != null) {
                        pjT0.PjT().put(s, pjT1);
                    }
                }
            }
        }
        catch(Exception exception0) {
            exception0.getMessage();
        }
        if(jSONObject0.has("resources_archive")) {
            JSONObject jSONObject3 = jSONObject0.optJSONObject("resources_archive");
            if(jSONObject3 != null) {
                Zh pjT$Zh0 = new Zh();
                pjT$Zh0.PjT(jSONObject3.optString("url"));
                pjT$Zh0.Zh(jSONObject3.optString("md5"));
                JSONObject jSONObject4 = jSONObject3.optJSONObject("map");
                if(jSONObject4 != null) {
                    Iterator iterator1 = jSONObject4.keys();
                    ArrayList arrayList1 = new ArrayList();
                    while(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        arrayList1.add(new Pair(((String)object1), jSONObject4.optString(((String)object1))));
                    }
                    pjT$Zh0.PjT(arrayList1);
                }
                pjT0.PjT(pjT$Zh0);
            }
        }
        return pjT0.Au() ? pjT0 : null;
    }

    public Map PjT() {
        return this.XX;
    }

    public void PjT(Zh pjT$Zh0) {
        this.JQp = pjT$Zh0;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public void PjT(List list0) {
        if(list0 == null) {
            list0 = new ArrayList();
        }
        this.cr = list0;
    }

    public String ReZ() {
        return this.Zh;
    }

    public void ReZ(String s) {
        this.ReZ = s;
    }

    public JSONObject SM() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.putOpt("name", this.Zh());
            jSONObject0.putOpt("version", this.ReZ());
            jSONObject0.putOpt("main", this.cr());
            if(!TextUtils.isEmpty(this.cz)) {
                jSONObject0.put("template_fetch_url", this.cz);
            }
            JSONArray jSONArray0 = new JSONArray();
            if(this.cz() != null) {
                for(Object object0: this.cz()) {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.putOpt("url", ((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).PjT());
                    jSONObject1.putOpt("md5", ((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).Zh());
                    jSONObject1.putOpt("level", ((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).ReZ());
                    jSONArray0.put(jSONObject1);
                }
            }
            jSONObject0.putOpt("resources", jSONArray0);
            if(!this.XX.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                boolean z = false;
                for(Object object1: this.XX.keySet()) {
                    String s = (String)object1;
                    PjT pjT0 = (PjT)this.XX.get(s);
                    if(pjT0 != null) {
                        jSONObject2.put(s, pjT0.SM());
                        z = true;
                    }
                }
                if(z) {
                    jSONObject0.put("engines", jSONObject2);
                }
            }
            Zh pjT$Zh0 = this.JQp();
            if(pjT$Zh0 != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("url", pjT$Zh0.PjT);
                jSONObject3.put("md5", pjT$Zh0.Zh);
                JSONObject jSONObject4 = new JSONObject();
                List list0 = pjT$Zh0.Zh();
                if(list0 != null) {
                    for(Object object2: list0) {
                        jSONObject4.put(((String)((Pair)object2).first), ((Pair)object2).second);
                    }
                }
                jSONObject3.put("map", jSONObject4);
                jSONObject0.putOpt("resources_archive", jSONObject3);
            }
            return jSONObject0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public String XX() {
        return this.cz;
    }

    public String Zh() {
        return this.PjT;
    }

    public void Zh(String s) {
        this.Zh = s;
    }

    public String cr() {
        return this.ReZ;
    }

    public void cr(String s) {
        this.cz = s;
    }

    public List cz() {
        if(this.cr == null) {
            this.cr = new ArrayList();
        }
        return this.cr;
    }
}

