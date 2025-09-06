package com.bytedance.sdk.component.PjT;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class PjT {
    private final Map Au;
    protected String JQp;
    protected Context PjT;
    protected Au ReZ;
    XX XX;
    protected xs Zh;
    protected Handler cr;
    protected volatile boolean cz;

    protected PjT() {
        this.cr = new Handler(Looper.getMainLooper());
        this.cz = false;
        this.Au = new HashMap();
    }

    private xE PjT(JSONObject jSONObject0) {
        String s3;
        if(this.cz) {
            return null;
        }
        String s = jSONObject0.optString("__callback_id");
        String s1 = jSONObject0.optString("func");
        if(this.PjT() == null) {
            return null;
        }
        try {
            String s2 = jSONObject0.getString("__msg_type");
            try {
                Object object0 = jSONObject0.opt("params");
                if(object0 == null) {
                    s3 = "";
                }
                else if(!(object0 instanceof JSONObject)) {
                    s3 = object0 instanceof String ? ((String)object0) : String.valueOf(object0);
                }
                else {
                    s3 = String.valueOf(((JSONObject)object0));
                }
            }
            catch(Throwable unused_ex) {
                s3 = jSONObject0.optString("params");
            }
            String s4 = jSONObject0.getString("JSSDK");
            String s5 = jSONObject0.optString("namespace");
            String s6 = jSONObject0.optString("__iframe_url");
            return xE.PjT().PjT(s4).Zh(s2).ReZ(s1).cr(s3).JQp(s).cz(s5).XX(s6).PjT();
        }
        catch(JSONException unused_ex) {
            return xE.PjT(s, -1);
        }
    }

    protected abstract Context PjT(DWo arg1);

    protected abstract String PjT();

    final void PjT(DWo dWo0, RD rD0) {
        this.PjT = this.PjT(dWo0);
        this.ReZ = dWo0.cr;
        this.Zh = dWo0.SM;
        this.XX = new XX(dWo0, this, rD0);
        this.JQp = dWo0.qj;
        this.Zh(dWo0);
    }

    protected final void PjT(xE xE0) {
        if(this.cz) {
            return;
        }
        String s = this.PjT();
        if(s == null) {
            return;
        }
        XX xX0 = this.Zh(xE0.XX);
        if(xX0 == null) {
            xE0.toString();
            if(this.Zh != null) {
                this.PjT();
            }
            this.Zh(Lrd.PjT(new gK(-4, "Namespace " + xE0.XX + " unknown.")), xE0);
            return;
        }
        cz cz0 = new cz();
        cz0.Zh = s;
        cz0.PjT = this.PjT;
        cz0.ReZ = xX0;
        try {
            com.bytedance.sdk.component.PjT.XX.PjT xX$PjT0 = xX0.PjT(xE0, cz0);
            if(xX$PjT0 == null) {
                xE0.toString();
                if(this.Zh != null) {
                    this.PjT();
                }
                this.Zh(Lrd.PjT(new gK(-2, "Function " + xE0.cr + " is not registered.")), xE0);
                return;
            }
            if(xX$PjT0.PjT) {
                this.Zh(xX$PjT0.Zh, xE0);
            }
            if(this.Zh != null) {
                this.PjT();
            }
            return;
        }
        catch(Exception exception0) {
        }
        xE0.toString();
        this.Zh(Lrd.PjT(exception0), xE0);
    }

    protected abstract void PjT(String arg1);

    protected void PjT(String s, xE xE0) {
        this.PjT(s);
    }

    // 去混淆评级： 低(20)
    private XX Zh(String s) {
        return TextUtils.equals(s, this.JQp) || TextUtils.isEmpty(s) ? this.XX : ((XX)this.Au.get(s));
    }

    protected void Zh() {
        this.XX.PjT();
        for(Object object0: this.Au.values()) {
            ((XX)object0).PjT();
        }
        this.cr.removeCallbacksAndMessages(null);
        this.cz = true;
    }

    protected abstract void Zh(DWo arg1);

    final void Zh(String s, xE xE0) {
        if(this.cz) {
            return;
        }
        if(TextUtils.isEmpty(xE0.cz)) {
            return;
        }
        if(!s.startsWith("{") || !s.endsWith("}")) {
            SM.PjT(new IllegalArgumentException("Illegal callback data: " + s));
        }
        try {
            new JSONObject(s);
        }
        catch(Exception unused_ex) {
            new JSONObject();
        }
        this.PjT("{}", xE0);
    }

    protected void invokeMethod(String s) {
        if(this.cz) {
            return;
        }
        this.cr.post(new Runnable() {
            final PjT Zh;

            @Override
            public void run() {
                xE xE0;
                if(PjT.this.cz) {
                    return;
                }
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    xE0 = null;
                    xE0 = PjT.this.PjT(jSONObject0);
                }
                catch(Exception unused_ex) {
                }
                if(xE.PjT(xE0)) {
                    if(xE0 != null) {
                        String s = Lrd.PjT(new gK(xE0.PjT, "Failed to parse invocation."));
                        PjT.this.Zh(s, xE0);
                    }
                    return;
                }
                PjT.this.PjT(xE0);
            }
        });
    }
}

