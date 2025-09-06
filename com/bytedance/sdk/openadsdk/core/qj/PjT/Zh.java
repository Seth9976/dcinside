package com.bytedance.sdk.openadsdk.core.qj.PjT;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.List;
import org.json.JSONObject;

public abstract class Zh {
    public static class PjT {
        public int PjT;
        public boolean ReZ;
        public int Zh;

    }

    public int JQp;
    public int PjT;
    protected int ReZ;
    protected final Context Zh;
    protected double cr;
    public PjT cz;

    public Zh(Context context0, int v, int v1) {
        this.ReZ = 0;
        this.cr = 0.0;
        if(v1 > 0 && v > 0) {
            this.cr = ((double)v) / ((double)v1);
        }
        float f = qZS.XX(context0);
        if(f != 0.0f && v > 0) {
            this.ReZ = (int)(((float)v) / f);
        }
        this.Zh = context0.getApplicationContext();
    }

    public abstract com.bytedance.sdk.openadsdk.core.qj.PjT PjT(String arg1, List arg2);

    protected void PjT(Exception exception0, int v) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("exception", exception0.getMessage());
            jSONObject0.put("error_code", v);
            ReZ.PjT().PjT("load_vast", jSONObject0);
        }
        catch(Exception unused_ex) {
        }
    }

    protected boolean PjT(@Nullable String s) {
        if(TextUtils.isEmpty(s)) {
            return true;
        }
        try {
            return Integer.parseInt(s) < 2;
        }
        catch(NumberFormatException unused_ex) {
            return true;
        }
    }

    protected String Zh(String s, List list0) {
        int v = this.PjT;
        if(v >= 5) {
            return null;
        }
        this.PjT = v + 1;
        if(s == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.XX.Zh.Zh zh0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().ReZ();
            zh0.Zh(s);
            return zh0.PjT().cr();
        }
        catch(Exception exception0) {
            this.PjT(exception0, 0);
            if(!list0.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.Zh(list0, com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.ReZ, -1L, null);
            }
            return null;
        }
    }
}

