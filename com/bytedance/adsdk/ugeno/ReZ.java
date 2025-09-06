package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.Zh.PjT;
import com.bytedance.adsdk.ugeno.core.SM;
import com.bytedance.adsdk.ugeno.cz.Zh;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class ReZ extends PjT {
    private boolean Gr;
    private int Lx;
    private String OL;
    private JSONArray QB;
    private float ZsT;
    private boolean dDm;
    private float dG;
    private int fU;
    private boolean jp;
    private String kWj;
    private float oMU;
    private com.bytedance.adsdk.ugeno.Zh.ReZ pBJ;
    private float sjb;
    private float uvo;
    private float vSp;

    public ReZ(Context context0) {
        super(context0);
        this.jp = true;
        this.dDm = true;
        this.oMU = 0.0f;
        this.ZsT = 2000.0f;
        this.kWj = "normal";
        this.Gr = true;
        this.fU = Color.parseColor("#666666");
        this.Lx = Color.parseColor("#ffffff");
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public View PjT() {
        Zh zh0 = new Zh(this.Zh);
        this.JQp = zh0;
        zh0.PjT(this);
        return this.JQp;
    }

    public void PjT(int v) {
        View view0 = this.JQp;
        if(view0 != null) {
            ((Zh)view0).xf(v);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public void PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0) {
        this.pBJ = reZ0;
    }

    public void PjT(com.bytedance.adsdk.ugeno.cz.ReZ reZ0) {
        View view0 = this.JQp;
        if(view0 != null) {
            ((Zh)view0).setOnPageChangeListener(reZ0);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void PjT(String s, String s1) {
        super.PjT(s, s1);
        if(TextUtils.isEmpty(s)) {
            return;
        }
        s.hashCode();
        switch(s) {
            case "autoplay": {
                this.dDm = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, true);
                return;
            }
            case "dataList": {
                this.QB = com.bytedance.adsdk.ugeno.XX.Zh.PjT(s1, null);
                return;
            }
            case "delayStart": {
                this.oMU = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "direction": {
                this.OL = s1;
                return;
            }
            case "effect": {
                this.kWj = s1;
                return;
            }
            case "indicator": {
                this.Gr = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, true);
                return;
            }
            case "indicatorColor": {
                this.fU = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1);
                return;
            }
            case "indicatorSelectedColor": {
                this.Lx = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1);
                return;
            }
            case "loop": {
                this.jp = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, true);
                return;
            }
            case "nextMargin": {
                this.vSp = Au.PjT(this.Zh, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f));
                return;
            }
            case "pageCount": {
                this.uvo = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 1.0f);
                return;
            }
            case "pageMargin": {
                this.sjb = Au.PjT(this.Zh, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f));
                return;
            }
            case "previousMargin": {
                this.dG = Au.PjT(this.Zh, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f));
                return;
            }
            case "speed": {
                this.ZsT = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 500.0f);
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void PjT(JSONObject jSONObject0) {
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public void Zh() {
        super.Zh();
        if(this.QB != null && this.QB.length() > 0) {
            ((Zh)this.JQp).cz(((int)this.sjb)).XX(((int)this.dG)).Au(((int)this.vSp)).Zh(this.Gr).cr(this.Lx).JQp(this.fU).PjT(this.kWj).ReZ(this.jp).PjT(this.uvo).PjT(this.dDm).ReZ(((int)this.ZsT)).Zh(this.Gr);
            for(int v = 0; v < this.QB.length(); ++v) {
                SM sM0 = new SM(this.Zh);
                sM0.PjT(this.UR);
                com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = sM0.Zh(this.pBJ.KM(), null);
                sM0.Zh(this.QB.optJSONObject(v));
                ((Zh)this.JQp).PjT(reZ0);
            }
            if(this.dDm) {
                ((Zh)this.JQp).Zh();
            }
        }
    }
}

