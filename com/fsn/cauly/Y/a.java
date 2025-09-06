package com.fsn.cauly.Y;

import android.text.TextUtils;
import com.fsn.cauly.blackdragoncore.utils.o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends u0 {
    i0 s;
    String t;
    String u;
    int v;
    int w;
    Map x;
    Map y;

    public a(i0 i00) {
        this.a(i00.p);
        this.s = i00;
        l0 l00 = i00.r == null ? new l0() : i00.r;
        this.t = m0.d(i00.b);
        StringBuilder stringBuilder0 = new StringBuilder();
        this.x = com.fsn.cauly.blackdragoncore.a.a().g(i00.b);
        this.y = new HashMap();
        String s = "";
        for(Object object0: this.x.keySet()) {
            s = s + ((String)object0) + ":";
        }
        stringBuilder0.append("platform=Android");
        stringBuilder0.append("&content_type=json");
        stringBuilder0.append("&sdk_type=3d-na");
        stringBuilder0.append("&apt_serial=" + com.fsn.cauly.blackdragoncore.a.a().f(i00.b));
        stringBuilder0.append("&cond_list=" + s);
        stringBuilder0.append("&sdk_version=3.5.30");
        if(l00.a) {
            this.b(true);
            this.m = "https://ad.cauly.co.kr/checkCondition?" + stringBuilder0.toString();
            return;
        }
        this.b(false);
        this.m = "http://ad.cauly.co.kr/checkCondition?" + stringBuilder0.toString();
    }

    // 去混淆评级： 低(20)
    public String a(String s, JSONObject jSONObject0, String s1) {
        return !jSONObject0.has(s) || TextUtils.isEmpty(jSONObject0.getString(s)) ? s1 : jSONObject0.getString(s);
    }

    @Override  // com.fsn.cauly.Y.r0
    public void a() {
        super.a();
        if(this.s.b != null && (this.y != null && this.y.size() > 0)) {
            com.fsn.cauly.blackdragoncore.a.a().a(this.s.b, this.y, null);
        }
    }

    public void c(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            this.v = Integer.parseInt(this.a("retcode", jSONObject0, "200"));
            this.u = this.a("apt_serial", jSONObject0, "");
            this.w = Integer.parseInt(this.a("em", jSONObject0, "432"));
            if(jSONObject0.has("ckconds")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("ckconds");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject1 = (JSONObject)jSONArray0.get(v);
                    String s1 = this.a("id", jSONObject1, "");
                    String s2 = this.a("cond_type", jSONObject0, "encrypt");
                    String s3 = this.a("apt_cond", jSONObject1, "");
                    String s4 = this.a("act", jSONObject1, "");
                    if(!"plain".equalsIgnoreCase(s2)) {
                        s3 = o.a(s3, true);
                    }
                    if(!TextUtils.isEmpty(s4) && "1".equals(s4)) {
                        this.y.put(s1, s3);
                    }
                    this.x.put(s1, s3);
                }
            }
            String s5 = this.a("delconds", jSONObject0, "");
            com.fsn.cauly.blackdragoncore.a.a().a(this.s.b, s5, this.x);
            return;
        }
        catch(JSONException jSONException0) {
        }
        jSONException0.printStackTrace();
    }

    @Override  // com.fsn.cauly.Y.u0
    protected void g() {
        try {
            this.c(this.f());
        }
        catch(Throwable unused_ex) {
        }
    }

    public i0 i() {
        return this.s;
    }

    public String j() {
        return this.u;
    }

    public int k() {
        return this.w;
    }

    public int l() {
        return this.v;
    }
}

