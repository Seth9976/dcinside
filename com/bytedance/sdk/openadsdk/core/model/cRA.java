package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import org.json.JSONException;
import org.json.JSONObject;
import v.c;

public class cRA {
    private int Au;
    private boolean DWo;
    private String JQp;
    private int PjT;
    private boolean ReZ;
    private int SM;
    private int XX;
    private int Zh;
    private int cr;
    private String cz;

    public cRA(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        this.ReZ = jSONObject0.optBoolean("is_playable");
        boolean z = false;
        this.cr = jSONObject0.optInt("playable_type", 0);
        this.JQp = jSONObject0.optString("playable_style");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("playable");
        if(jSONObject1 != null) {
            this.cz = jSONObject1.optString("playable_url", "");
            this.XX = jSONObject1.optInt("playable_orientation", 0);
            this.Zh = jSONObject1.optInt("new_style", 0);
            this.PjT = jSONObject1.optInt("close_2_app", 0);
            int v = cRA.Zh(this.cr);
            this.Au = jSONObject1.optInt("playable_webview_timeout", v);
            this.SM = jSONObject1.optInt("playable_js_timeout", v);
            if(jSONObject1.optInt("playable_backup_enable", 0) == 1) {
                z = true;
            }
            this.DWo = z;
        }
    }

    public static boolean Au(Owx owx0) {
        cRA cRA0 = owx0.Owx();
        return cRA0 != null && !owx0.fc() && cRA0.ReZ && cRA0.Zh == 1;
    }

    public static boolean DWo(Owx owx0) {
        cRA cRA0 = owx0.Owx();
        return cRA0 != null && owx0.fc() && cRA0.ReZ && cRA0.Zh == 1;
    }

    public static boolean JQp(Owx owx0) {
        cRA cRA0 = cRA.Lrd(owx0);
        return cRA0 != null && owx0.fc() && cRA0.ReZ && !TextUtils.isEmpty(cRA.xs(owx0));
    }

    private static cRA Lrd(Owx owx0) {
        return owx0 == null ? null : owx0.Owx();
    }

    public static long Owx(Owx owx0) {
        return Math.max(cRA.RD(owx0), cRA.Sks(owx0));
    }

    public static int PjT(int v) [...] // Inlined contents

    public static int PjT(Owx owx0) {
        cRA cRA0 = owx0.Owx();
        if(cRA0 == null) {
            return 0;
        }
        return cRA0.PjT < 0 || cRA0.PjT > 100 ? 0 : cRA0.PjT;
    }

    public int PjT() {
        return this.Au;
    }

    public void PjT(JSONObject jSONObject0) {
        try {
            jSONObject0.put("is_playable", this.ReZ);
        }
        catch(JSONException jSONException0) {
            RD.Zh("PlayableModel", jSONException0.getMessage());
        }
        if(!TextUtils.isEmpty(this.cz)) {
            JSONObject jSONObject1 = new JSONObject();
            try {
                jSONObject1.put("playable_url", this.cz);
                jSONObject1.put("playable_orientation", this.XX);
                jSONObject1.put("new_style", this.Zh);
                jSONObject1.put("close_2_app", this.PjT);
                jSONObject1.put("playable_webview_timeout", this.Au);
                jSONObject1.put("playable_js_timeout", this.SM);
                jSONObject1.put("playable_backup_enable", ((int)this.DWo));
                jSONObject0.put("playable", jSONObject1);
            }
            catch(Exception exception0) {
                RD.Zh("PlayableModel", exception0.getMessage());
            }
        }
        try {
            jSONObject0.put("playable_type", this.cr);
        }
        catch(JSONException jSONException1) {
            RD.Zh("PlayableModel", jSONException1.getMessage());
        }
        try {
            jSONObject0.put("playable_style", this.JQp);
        }
        catch(JSONException jSONException2) {
            RD.Zh("PlayableModel", jSONException2.getMessage());
        }
    }

    public static long RD(Owx owx0) {
        cRA cRA0 = cRA.Lrd(owx0);
        return cRA0 == null ? 5L : ((long)cRA0.PjT());
    }

    public static boolean ReZ(Owx owx0) {
        return cRA.Zh(owx0) && cRA.cRA(owx0) == 1;
    }

    public boolean ReZ() {
        return this.DWo;
    }

    public static boolean SM(Owx owx0) {
        cRA cRA0 = owx0.Owx();
        return cRA0 == null ? false : cRA0.ReZ && cRA0.Zh == 1;
    }

    public static long Sks(Owx owx0) {
        cRA cRA0 = cRA.Lrd(owx0);
        return cRA0 == null ? 5L : ((long)cRA0.Zh());
    }

    public static boolean XX(Owx owx0) {
        cRA cRA0 = cRA.Lrd(owx0);
        return cRA0 != null && !owx0.fc() && cRA0.ReZ && !TextUtils.isEmpty(cRA.xs(owx0));
    }

    private static int Zh(int v) {
        return v == 1 ? 10 : 5;
    }

    public static boolean Zh(Owx owx0) {
        cRA cRA0 = cRA.Lrd(owx0);
        return cRA0 == null ? false : cRA0.ReZ && !TextUtils.isEmpty(cRA.xs(owx0));
    }

    public int Zh() {
        return this.SM;
    }

    private static int cRA(Owx owx0) {
        cRA cRA0 = cRA.Lrd(owx0);
        return cRA0 == null ? 0 : cRA0.cr;
    }

    // 去混淆评级： 低(20)
    public static boolean cr(Owx owx0) {
        return cRA.ReZ(owx0) && !cRA.SM(owx0);
    }

    public static boolean cz(Owx owx0) {
        return cRA.JQp(owx0) && cRA.cRA(owx0) == 1;
    }

    public static boolean fDm(Owx owx0) [...] // Inlined contents

    public static boolean gK(Owx owx0) {
        return cRA.XX(owx0) && cRA.cRA(owx0) == 1;
    }

    public static boolean ltE(Owx owx0) {
        return cRA.XX(owx0) && cRA.cRA(owx0) == 0;
    }

    public static String qj(Owx owx0) {
        cRA cRA0 = cRA.Lrd(owx0);
        return cRA0 == null ? null : cRA0.JQp;
    }

    public static boolean qla(Owx owx0) {
        return (owx0 == null || owx0.MWx() == null ? 0 : owx0.MWx().h()) != 1;
    }

    public static boolean tT(Owx owx0) {
        cRA cRA0 = cRA.Lrd(owx0);
        return cRA0 != null && cRA0.ReZ();
    }

    public static int ub(Owx owx0) {
        cRA cRA0 = cRA.Lrd(owx0);
        return cRA0 == null ? 0 : cRA0.XX;
    }

    public static boolean xE(Owx owx0) {
        c c0 = owx0.MWx();
        return c0 == null ? false : c0.h() == 1;
    }

    public static String xf(Owx owx0) {
        cRA cRA0 = cRA.Lrd(owx0);
        return cRA0 == null ? null : cRA0.cz;
    }

    public static String xs(Owx owx0) {
        if(owx0 == null) {
            return null;
        }
        cRA cRA0 = owx0.Owx();
        if(cRA0 != null && cRA0.ReZ) {
            String s = cRA0.cz;
            if(!TextUtils.isEmpty(s)) {
                return s;
            }
        }
        if(owx0.RD() == 20) {
            return owx0.xu();
        }
        return owx0.MWx() == null ? null : owx0.MWx().M();
    }
}

