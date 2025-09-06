package com.bytedance.sdk.openadsdk.cr.PjT;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public class Zh {
    public AtomicInteger JQp;
    public AtomicInteger PjT;
    public AtomicLong ReZ;
    public AtomicBoolean XX;
    public AtomicInteger Zh;
    public int cr;
    public Map cz;

    public Zh(int v) {
        this.PjT = new AtomicInteger(0);
        this.Zh = new AtomicInteger(0);
        this.ReZ = new AtomicLong(0L);
        this.JQp = new AtomicInteger(0);
        this.cz = new HashMap();
        this.XX = new AtomicBoolean(false);
        this.cr = v;
    }

    JSONObject PjT() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("success", this.PjT.get());
            jSONObject0.put("fail", this.Zh.get());
            jSONObject0.put("type", this.cr);
            jSONObject0.put("duration", this.ReZ.get() / ((long)this.PjT.get()));
            JSONObject jSONObject1 = new JSONObject();
            if(this.cz.size() > 0) {
                for(Object object0: this.cz.entrySet()) {
                    jSONObject1.put(String.valueOf(((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
                }
            }
            jSONObject0.put("fail_error_code", jSONObject1);
            return jSONObject0;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    JSONObject Zh() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("success", this.PjT.get());
            jSONObject0.put("fail", this.Zh.get());
            jSONObject0.put("type", this.cr);
            jSONObject0.put("time", this.JQp.get());
            return jSONObject0;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

