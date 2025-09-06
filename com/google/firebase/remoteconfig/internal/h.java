package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class h {
    static class a {
    }

    public static class b {
        private JSONObject a;
        private Date b;
        private JSONArray c;
        private JSONObject d;
        private long e;
        private JSONArray f;

        private b() {
            this.a = new JSONObject();
            this.b = h.q;
            this.c = new JSONArray();
            this.d = new JSONObject();
            this.e = 0L;
            this.f = new JSONArray();
        }

        b(a h$a0) {
        }

        public b(h h0) {
            this.a = h0.g();
            this.b = h0.h();
            this.c = h0.e();
            this.d = h0.i();
            this.e = h0.k();
            this.f = h0.j();
        }

        public h a() throws JSONException {
            return new h(this.a, this.b, this.c, this.d, this.e, this.f, null);
        }

        public b b(Map map0) {
            this.a = new JSONObject(map0);
            return this;
        }

        public b c(JSONObject jSONObject0) {
            try {
                this.a = new JSONObject(jSONObject0.toString());
            }
            catch(JSONException unused_ex) {
            }
            return this;
        }

        public b d(JSONArray jSONArray0) {
            try {
                this.c = new JSONArray(jSONArray0.toString());
            }
            catch(JSONException unused_ex) {
            }
            return this;
        }

        public b e(Date date0) {
            this.b = date0;
            return this;
        }

        public b f(JSONObject jSONObject0) {
            try {
                this.d = new JSONObject(jSONObject0.toString());
            }
            catch(JSONException unused_ex) {
            }
            return this;
        }

        public b g(JSONArray jSONArray0) {
            try {
                this.f = new JSONArray(jSONArray0.toString());
            }
            catch(JSONException unused_ex) {
            }
            return this;
        }

        public b h(long v) {
            this.e = v;
            return this;
        }
    }

    private JSONObject a;
    private JSONObject b;
    private Date c;
    private JSONArray d;
    private JSONObject e;
    private long f;
    private JSONArray g;
    static final String h = "configs_key";
    static final String i = "fetch_time_key";
    static final String j = "abt_experiments_key";
    static final String k = "personalization_metadata_key";
    static final String l = "template_version_number_key";
    static final String m = "rollout_metadata_key";
    public static final String n = "affectedParameterKeys";
    public static final String o = "rolloutId";
    public static final String p = "variantId";
    private static final Date q;

    static {
        h.q = new Date(0L);
    }

    private h(JSONObject jSONObject0, Date date0, JSONArray jSONArray0, JSONObject jSONObject1, long v, JSONArray jSONArray1) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs_key", jSONObject0);
        jSONObject2.put("fetch_time_key", date0.getTime());
        jSONObject2.put("abt_experiments_key", jSONArray0);
        jSONObject2.put("personalization_metadata_key", jSONObject1);
        jSONObject2.put("template_version_number_key", v);
        jSONObject2.put("rollout_metadata_key", jSONArray1);
        this.b = jSONObject0;
        this.c = date0;
        this.d = jSONArray0;
        this.e = jSONObject1;
        this.f = v;
        this.g = jSONArray1;
        this.a = jSONObject2;
    }

    h(JSONObject jSONObject0, Date date0, JSONArray jSONArray0, JSONObject jSONObject1, long v, JSONArray jSONArray1, a h$a0) throws JSONException {
        this(jSONObject0, date0, jSONArray0, jSONObject1, v, jSONArray1);
    }

    static h b(JSONObject jSONObject0) throws JSONException {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("personalization_metadata_key");
        if(jSONObject1 == null) {
            jSONObject1 = new JSONObject();
        }
        JSONArray jSONArray0 = jSONObject0.optJSONArray("rollout_metadata_key");
        if(jSONArray0 == null) {
            jSONArray0 = new JSONArray();
        }
        return new h(jSONObject0.getJSONObject("configs_key"), new Date(jSONObject0.getLong("fetch_time_key")), jSONObject0.getJSONArray("abt_experiments_key"), jSONObject1, jSONObject0.optLong("template_version_number_key"), jSONArray0);
    }

    private Map c() throws JSONException {
        Map map0 = new HashMap();
        for(int v = 0; v < this.j().length(); ++v) {
            JSONObject jSONObject0 = this.j().getJSONObject(v);
            String s = jSONObject0.getString("rolloutId");
            String s1 = jSONObject0.getString("variantId");
            JSONArray jSONArray0 = jSONObject0.getJSONArray("affectedParameterKeys");
            for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                String s2 = jSONArray0.getString(v1);
                if(!map0.containsKey(s2)) {
                    map0.put(s2, new HashMap());
                }
                Map map1 = (Map)map0.get(s2);
                if(map1 != null) {
                    map1.put(s, s1);
                }
            }
        }
        return map0;
    }

    private static h d(JSONObject jSONObject0) throws JSONException {
        return h.b(new JSONObject(jSONObject0.toString()));
    }

    public JSONArray e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h ? this.a.toString().equals(((h)object0).toString()) : false;
    }

    public Set f(h h0) throws JSONException {
        JSONObject jSONObject0 = h.d(h0.a).g();
        Map map0 = this.c();
        Map map1 = h0.c();
        Set set0 = new HashSet();
        Iterator iterator0 = this.g().keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            if(!h0.g().has(s)) {
                set0.add(s);
            }
            else if(!this.g().get(s).equals(h0.g().get(s))) {
                set0.add(s);
            }
            else if(this.i().has(s) && !h0.i().has(s) || !this.i().has(s) && h0.i().has(s)) {
                set0.add(s);
            }
            else if(this.i().has(s) && h0.i().has(s) && !this.i().getJSONObject(s).toString().equals(h0.i().getJSONObject(s).toString())) {
                set0.add(s);
            }
            else if(map0.containsKey(s) != map1.containsKey(s)) {
                set0.add(s);
            }
            else if(map0.containsKey(s) && map1.containsKey(s) && !((Map)map0.get(s)).equals(map1.get(s))) {
                set0.add(s);
            }
            else {
                jSONObject0.remove(s);
            }
        }
        Iterator iterator1 = jSONObject0.keys();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            set0.add(((String)object1));
        }
        return set0;
    }

    public JSONObject g() {
        return this.b;
    }

    public Date h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public JSONObject i() {
        return this.e;
    }

    public JSONArray j() {
        return this.g;
    }

    public long k() {
        return this.f;
    }

    public static b l() {
        return new b(null);
    }

    public static b m(h h0) {
        return new b(h0);
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

