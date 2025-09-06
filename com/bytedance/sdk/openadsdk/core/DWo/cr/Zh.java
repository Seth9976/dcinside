package com.bytedance.sdk.openadsdk.core.DWo.cr;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.DWo;
import com.bytedance.adsdk.ugeno.core.xs;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.DWo.cz.cr;
import com.bytedance.sdk.openadsdk.core.ZX;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.wN;
import org.json.JSONException;
import org.json.JSONObject;

public class Zh implements xs, PjT {
    private String Au;
    private final com.bytedance.sdk.openadsdk.core.DWo.cz.Zh DWo;
    private final com.bytedance.sdk.openadsdk.core.DWo.XX.PjT JQp;
    private boolean Owx;
    protected static int PjT = 8;
    private final Activity ReZ;
    private JSONObject SM;
    private String XX;
    private com.bytedance.sdk.openadsdk.core.DWo.cr.PjT Zh;
    private final Owx cr;
    private String cz;
    private float fDm;
    private long gK;
    private long ltE;
    private com.bytedance.sdk.openadsdk.core.DWo.cz.PjT qj;
    private float qla;
    private float ub;
    private float xE;
    private String xf;
    private View xs;

    static {
    }

    public Zh(Activity activity0, Owx owx0, com.bytedance.sdk.openadsdk.core.DWo.XX.PjT pjT0, String s, com.bytedance.sdk.openadsdk.core.DWo.cz.Zh zh0) {
        this.Owx = true;
        this.ReZ = activity0;
        this.xf = s;
        this.cr = owx0;
        this.DWo = zh0;
        this.JQp = pjT0;
    }

    private void PjT(DWo dWo0, Owx owx0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            int v = 1;
            jSONObject0.put("down_x", ((double)this.fDm));
            jSONObject0.put("down_y", ((double)this.qla));
            jSONObject0.put("down_time", this.gK);
            jSONObject0.put("up_x", ((double)this.xE));
            jSONObject0.put("up_y", ((double)this.ub));
            jSONObject0.put("up_time", this.ltE);
            View view0 = dWo0.PjT().qj();
            if(view0 != null) {
                JSONObject jSONObject1 = new JSONObject();
                int[] arr_v = new int[2];
                float f = (float)view0.getWidth();
                float f1 = (float)view0.getHeight();
                view0.getLocationOnScreen(arr_v);
                float f2 = (float)arr_v[0];
                float f3 = (float)arr_v[1];
                jSONObject1.put("width", ((double)f));
                jSONObject1.put("height", ((double)f1));
                jSONObject1.put("left", ((double)f2));
                jSONObject1.put("top", ((double)f3));
                jSONObject0.put("rectInfo", jSONObject1);
            }
            View view1 = this.xs;
            if(view1 != null) {
                int[] arr_v1 = new int[2];
                view1.getLocationOnScreen(arr_v1);
                jSONObject0.put("button_x", arr_v1[0]);
                jSONObject0.put("button_y", arr_v1[1]);
                jSONObject0.put("button_width", this.xs.getWidth());
                jSONObject0.put("button_height", this.xs.getHeight());
            }
            View view2 = this.ReZ.findViewById(0x1020002);
            if(view2 != null) {
                int[] arr_v2 = new int[2];
                view2.getLocationOnScreen(arr_v2);
                jSONObject0.put("ad_x", arr_v2[0]);
                jSONObject0.put("ad_y", arr_v2[1]);
                jSONObject0.put("width", view2.getWidth());
                jSONObject0.put("height", view2.getHeight());
            }
            jSONObject0.put("click_area_type", dWo0.PjT().Co());
            jSONObject0.put("brick_id", dWo0.PjT().Jo());
            jSONObject0.put("endcard_id", this.cz);
            jSONObject0.put("click_scence", 2);
            if(!this.Owx) {
                v = 2;
            }
            jSONObject0.put("user_behavior_type", v);
            com.bytedance.sdk.openadsdk.core.DWo.cz.PjT pjT0 = this.qj;
            if(pjT0 != null) {
                jSONObject0.put("endcard_type", pjT0.PjT());
            }
            ReZ.PjT(owx0, this.xf, "click", jSONObject0);
        }
        catch(JSONException unused_ex) {
        }
    }

    private void PjT(JSONObject jSONObject0, JSONObject jSONObject1) {
        this.Zh.PjT(this);
        this.Zh.PjT(this);
        this.DWo.PjT();
        this.Zh.PjT(jSONObject0, jSONObject1, new cr() {
            final Zh PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.cr
            public void PjT(int v, String s) {
                if(Zh.this.DWo != null) {
                    Zh.this.DWo.PjT(v, s);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.cr
            public void PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0) {
                if(Zh.this.DWo != null) {
                    Zh.this.DWo.PjT(reZ0);
                }
            }
        });
    }

    public void PjT() {
        if(this.cr == null) {
            this.DWo.PjT(1, "material is null", "net");
            return;
        }
        if(this.JQp == null) {
            this.DWo.PjT(1, "material ugen template is null", "net");
            return;
        }
        this.Zh = new com.bytedance.sdk.openadsdk.core.DWo.cr.PjT(this.ReZ);
        this.Au = this.JQp.ReZ();
        this.cz = this.JQp.PjT();
        this.XX = this.JQp.Zh();
        this.SM = this.cr.dDm();
        this.DWo.PjT("endcard");
        com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh.PjT().PjT("endcard", this.Au, this.cz, this.XX, "", new com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh.PjT() {
            final Zh PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh$PjT
            public void PjT(int v, String s, String s1) {
                Zh.this.DWo.PjT(v, s, s1);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh$PjT
            public void PjT(JSONObject jSONObject0, String s) {
                JSONObject jSONObject1 = Zh.this.SM;
                Zh.this.PjT(jSONObject0, jSONObject1);
                Zh.this.DWo.Zh(s);
            }
        });
    }

    public void PjT(View view0) {
        this.xs = view0;
    }

    @Override  // com.bytedance.adsdk.ugeno.core.xs
    public void PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.gK = System.currentTimeMillis();
                this.fDm = motionEvent0.getRawX();
                this.qla = motionEvent0.getRawY();
                this.Owx = true;
                return;
            }
            case 1: {
                this.xE = motionEvent0.getRawX();
                this.ub = motionEvent0.getRawY();
                if(Math.abs(this.xE - this.fDm) >= ((float)Zh.PjT) || Math.abs(this.ub - this.qla) >= ((float)Zh.PjT)) {
                    this.Owx = false;
                }
                this.ltE = System.currentTimeMillis();
                return;
            }
            case 2: {
                if(Math.abs(motionEvent0.getRawX() - this.fDm) >= ((float)Zh.PjT) || Math.abs(motionEvent0.getRawY() - this.qla) >= ((float)Zh.PjT)) {
                    this.Owx = false;
                }
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.cr.PjT$PjT
    public void PjT(DWo dWo0) {
        String s = dWo0.ReZ().optString("type");
        s.hashCode();
        switch(s) {
            case "close": {
                com.bytedance.sdk.openadsdk.core.DWo.cz.PjT pjT0 = this.qj;
                if(pjT0 != null) {
                    pjT0.Zh();
                    return;
                }
                return;
            }
            case "creative": {
                if(this.ReZ != null && this.cr != null) {
                    this.Zh();
                    Activity activity0 = this.ReZ;
                    if(activity0 instanceof com.bytedance.sdk.openadsdk.core.xf.cr.Zh) {
                        ((com.bytedance.sdk.openadsdk.core.xf.cr.Zh)activity0).cr();
                    }
                    this.PjT(dWo0, this.cr);
                }
                return;
            }
            case "privacy": {
                if(this.ReZ == null || TextUtils.isEmpty(ub.cr().Jo())) {
                    return;
                }
                TTWebsiteActivity.PjT(this.ReZ, this.cr, this.xf);
            }
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.DWo.cz.PjT pjT0) {
        this.qj = pjT0;
    }

    private void Zh() {
        int v = this.cr.cI();
        switch(v) {
            case 2: 
            case 3: {
                if(v == 3) {
                    String s1 = this.cr.xu();
                    if(TextUtils.isEmpty(s1) || !s1.contains("play.google.com/store") || !com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cr.PjT(this.ReZ, s1, s1.substring(s1.indexOf("?id=") + 4), this.xf, this.cr)) {
                        goto label_12;
                    }
                }
                else {
                label_12:
                    int v1 = wN.PjT(this.xf);
                    String s2 = this.xf;
                    cz cz0 = XX.PjT(this.ReZ, this.cr, s2);
                    ZX.PjT(this.ReZ, this.cr, v1, null, null, s2, cz0, true, 0);
                }
                break;
            }
            case 4: {
                XX.PjT(this.ReZ, this.cr, this.xf).cr();
                return;
            label_5:
                if(v == 5) {
                    String s = this.cr.fA();
                    wN.Zh(this.ReZ, s);
                    return;
                }
                break;
            }
            default: {
                goto label_5;
            }
        }
    }
}

