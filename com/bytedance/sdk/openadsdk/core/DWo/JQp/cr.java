package com.bytedance.sdk.openadsdk.core.DWo.JQp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.core.DWo;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.Zh;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.core.gK;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.JQp;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class cr {
    private final Owx Au;
    private JQp DWo;
    private ReZ JQp;
    private int PjT;
    private ReZ ReZ;
    private final String SM;
    private final Context XX;
    private int Zh;
    private ReZ cr;
    private final String cz;
    private boolean fDm;
    private JSONObject qj;
    private boolean qla;
    private JSONArray xE;
    private final JSONObject xf;
    private boolean xs;

    public cr(Context context0, Owx owx0, String s, JSONObject jSONObject0) {
        this.PjT = -1;
        this.Zh = -1;
        this.cz = "UGenSwiperEvent";
        this.XX = context0;
        this.Au = owx0;
        this.SM = s;
        this.xf = jSONObject0;
    }

    private Context PjT(View view0) {
        if(view0 != null) {
            Context context0 = Zh.PjT(view0);
            return context0 == null ? this.XX : context0;
        }
        return this.XX;
    }

    private void PjT(int v) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("index", v);
        }
        catch(Throwable unused_ex) {
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.Au, this.SM, "carousel_show", jSONObject0);
    }

    private void PjT(TextView textView0, int v) {
        int v1 = textView0.getCurrentTextColor();
        textView0.setTextColor(Color.argb(v, Color.red(v1), Color.green(v1), Color.blue(v1)));
    }

    private void PjT(JSONObject jSONObject0, View view0) {
        if(!this.PjT(jSONObject0.optInt("landingStyle"), jSONObject0.optString("url"), jSONObject0.optString("fallback_url"))) {
            return;
        }
        gK.PjT(this.PjT(view0), this.XX instanceof Activity, jSONObject0, this.Au, this.SM, wN.PjT(this.SM), null, this.DWo);
    }

    private void PjT(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(jSONObject0 != null && jSONObject1 != null) {
            JSONObject jSONObject2 = jSONObject0.optJSONObject("clickInfo");
            this.qj = jSONObject2;
            if(jSONObject2 != null) {
                Iterator iterator0 = jSONObject2.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    String s1 = (String)this.qj.opt(s);
                    try {
                        this.qj.putOpt(s, com.bytedance.adsdk.ugeno.ReZ.Zh.PjT(s1, jSONObject1));
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                try {
                    jSONObject0.putOpt("clickInfo", this.qj);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    private void PjT(boolean z, boolean z1, boolean z2) {
        ReZ reZ0 = this.ReZ;
        if(reZ0 != null && this.cr != null) {
            View view0 = reZ0.qj();
            View view1 = this.cr.qj();
            if(this.xE != null && this.xE.length() == 1) {
                view0.setVisibility(8);
                view1.setVisibility(8);
                return;
            }
            if(!z) {
                if(z1) {
                    if(view0 instanceof TextView) {
                        this.PjT(((TextView)view0), 90);
                    }
                    if(view1 instanceof TextView) {
                        this.PjT(((TextView)view1), 0xFF);
                    }
                }
                else if(z2) {
                    if(view0 instanceof TextView) {
                        this.PjT(((TextView)view0), 0xFF);
                    }
                    if(view1 instanceof TextView) {
                        this.PjT(((TextView)view1), 90);
                    }
                }
                else {
                    if(view0 instanceof TextView) {
                        this.PjT(((TextView)view0), 0xFF);
                    }
                    if(view1 instanceof TextView) {
                        this.PjT(((TextView)view1), 0xFF);
                    }
                }
            }
        }
    }

    private boolean PjT(int v, String s, String s1) {
        switch(v) {
            case 2: {
                return (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s1)) && ltE.PjT(s1);
            }
            case 1: 
            case 3: {
                return ltE.PjT(s);
            }
            default: {
                return true;
            }
        }
    }

    public void PjT() {
        this.PjT(this.xs, this.fDm, this.qla);
    }

    public void PjT(ReZ reZ0) {
        ReZ reZ1 = reZ0.ReZ("swiperLayout");
        this.JQp = reZ1;
        if(reZ1 instanceof com.bytedance.adsdk.ugeno.ReZ) {
            this.xE = this.xf.optJSONArray("dpa_data");
            this.ReZ = reZ0.ReZ("swiperLeftArrow");
            this.cr = reZ0.ReZ("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.ReZ)this.JQp).PjT(new com.bytedance.adsdk.ugeno.cz.ReZ() {
                final cr PjT;

                @Override  // com.bytedance.adsdk.ugeno.cz.ReZ
                public void PjT(boolean z, int v) {
                }

                @Override  // com.bytedance.adsdk.ugeno.cz.ReZ
                public void PjT(boolean z, int v, float f, int v1) {
                }

                @Override  // com.bytedance.adsdk.ugeno.cz.ReZ
                public void PjT(boolean z, int v, int v1, boolean z1, boolean z2) {
                    cr.this.Zh = v;
                    cr.this.PjT = v1;
                    cr.this.xs = z;
                    cr.this.fDm = z1;
                    cr.this.qla = z2;
                    cr.this.PjT(z, z1, z2);
                    cr.this.PjT(v);
                }
            });
        }
    }

    public void PjT(JQp jQp0) {
        this.DWo = jQp0;
    }

    public boolean PjT(DWo dWo0) {
        this.qj = null;
        if(this.Zh != -1 && this.Zh != 0) {
            try {
                JSONObject jSONObject0 = dWo0.ReZ();
                if(jSONObject0 != null) {
                    JSONObject jSONObject1 = jSONObject0.optJSONObject("related_dpa_click");
                    if(jSONObject1 != null && (jSONObject1.optBoolean("enableOpenExternalUrl") && jSONObject1.optInt("landingStyle") != -1)) {
                        if(this.xE != null) {
                            String s = com.bytedance.adsdk.ugeno.ReZ.Zh.PjT(jSONObject1.optString("url"), this.xE.optJSONObject(this.Zh));
                            String s1 = com.bytedance.adsdk.ugeno.ReZ.Zh.PjT(jSONObject1.optString("fallback_url"), this.xE.optJSONObject(this.Zh));
                            jSONObject1.put("url", s);
                            jSONObject1.put("fallback_url", s1);
                            this.PjT(jSONObject1, this.xE.optJSONObject(this.Zh));
                        }
                        this.PjT(jSONObject1, dWo0.PjT().qj());
                        return true;
                    }
                    return false;
                }
                return false;
            }
            catch(Throwable throwable0) {
            }
            RD.Zh("UGenSwiperEvent", throwable0.getMessage());
        }
        return false;
    }

    public void ReZ() {
        ReZ reZ0 = this.JQp;
        if(reZ0 instanceof com.bytedance.adsdk.ugeno.ReZ) {
            int v = this.PjT;
            if(v != -1) {
                ((com.bytedance.adsdk.ugeno.ReZ)reZ0).PjT(v + 1);
            }
        }
    }

    public void Zh() {
        ReZ reZ0 = this.JQp;
        if(reZ0 instanceof com.bytedance.adsdk.ugeno.ReZ) {
            int v = this.PjT;
            if(v != -1) {
                ((com.bytedance.adsdk.ugeno.ReZ)reZ0).PjT(v - 1);
            }
        }
    }

    public JSONObject cr() {
        return this.qj;
    }
}

