package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.Zh.PjT;
import com.bytedance.adsdk.ugeno.cr.SM;
import com.bytedance.adsdk.ugeno.cz.ReZ;
import org.json.JSONArray;
import org.json.JSONObject;

public class Zh extends PjT implements ReZ {
    private int Gr;
    private float Lx;
    private int NR;
    private int OL;
    private float QB;
    private boolean VZ;
    private String ZsT;
    private boolean dDm;
    private int dG;
    private int fU;
    private boolean hLk;
    private boolean jp;
    private boolean kWj;
    private float oMU;
    private float pBJ;
    private float sjb;
    private JSONArray uvo;
    private int vSp;

    public Zh(Context context0) {
        super(context0);
        this.OL = 0;
        this.jp = true;
        this.dDm = true;
        this.oMU = 2000.0f;
        this.ZsT = "normal";
        this.kWj = false;
        this.Gr = Color.parseColor("#666666");
        this.fU = Color.parseColor("#ffffff");
        this.Lx = 1.0f;
        this.QB = 0.0f;
        this.pBJ = 0.0f;
        this.sjb = 0.0f;
        this.dG = 0;
        this.vSp = 0;
        this.hLk = true;
    }

    private void Au(int v) {
        SM sM0 = this.Qtm;
        if(sM0 == null) {
            return;
        }
        sM0.PjT("SwiperView://slide", new Object[]{this.NR, v, ((int)(!this.VZ))});
    }

    private void Ld() {
        if(this.PjT != null && !this.PjT.isEmpty()) {
            com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = (com.bytedance.adsdk.ugeno.Zh.ReZ)this.PjT.get(0);
            if(this.uvo == null) {
                return;
            }
            for(int v = 0; v < this.uvo.length(); ++v) {
                com.bytedance.adsdk.ugeno.core.SM sM0 = new com.bytedance.adsdk.ugeno.core.SM(this.Zh);
                sM0.PjT(this.UR);
                try {
                    JSONObject jSONObject0 = this.uvo.optJSONObject(v);
                    if(jSONObject0 != null) {
                        if(jSONObject0.has("$chunk")) {
                            this.cr.put("$item", jSONObject0.optJSONArray("$chunk"));
                        }
                        else {
                            this.cr.put("$item", jSONObject0);
                        }
                        com.bytedance.adsdk.ugeno.Zh.ReZ reZ1 = sM0.PjT(reZ0.KM(), this.cr, null);
                        ((com.bytedance.adsdk.ugeno.cz.Zh)this.JQp).PjT(reZ1);
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    private void PjT(boolean z, int v, float f) {
        if(this.Qtm == null) {
            return;
        }
        if(!z && v == this.oG() - 1 && f == 0.0f && this.hLk) {
            this.Qtm.PjT("SwiperView://finish", new Object[0]);
            Log.d("BaseSwiper", "onPageScrolled: finish monitor");
            this.hLk = false;
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public View PjT() {
        com.bytedance.adsdk.ugeno.cz.Zh zh0 = new com.bytedance.adsdk.ugeno.cz.Zh(this.Zh);
        this.JQp = zh0;
        zh0.PjT(this);
        return this.JQp;
    }

    public void PjT(int v) {
        if(((com.bytedance.adsdk.ugeno.cz.Zh)this.JQp).getCurrentItem() != v) {
            ((com.bytedance.adsdk.ugeno.cz.Zh)this.JQp).xf(v);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public void PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0) {
        if(reZ0 == null) {
            return;
        }
        this.PjT.add(reZ0);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public void PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(reZ0 == null) {
            return;
        }
        this.PjT.add(reZ0);
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
                this.uvo = com.bytedance.adsdk.ugeno.XX.Zh.PjT(s1, null);
                return;
            }
            case "direction": {
                if(TextUtils.equals(s1, "vertical")) {
                    this.OL = 1;
                    return;
                }
                this.OL = 0;
                return;
            }
            case "driveMode": {
                this.dG = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0);
                return;
            }
            case "effect": {
                this.ZsT = s1;
                return;
            }
            case "indicator": {
                this.kWj = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, false);
                return;
            }
            case "indicatorColor": {
                this.Gr = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1, this.Gr);
                return;
            }
            case "indicatorSelectedColor": {
                this.fU = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1, this.fU);
                return;
            }
            case "loop": {
                this.jp = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, true);
                return;
            }
            case "nextMargin": {
                this.sjb = Au.PjT(this.Zh, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f));
                return;
            }
            case "pageCount": {
                this.Lx = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 1.0f);
                return;
            }
            case "pageMargin": {
                this.QB = Au.PjT(this.Zh, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f));
                return;
            }
            case "previousMargin": {
                this.pBJ = Au.PjT(this.Zh, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f));
                return;
            }
            case "speed": {
                this.oMU = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 2000.0f);
                return;
            }
            case "startIndex": {
                this.vSp = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0);
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.cz.ReZ
    public void PjT(boolean z, int v) {
        switch(v) {
            case 0: {
                if(!z) {
                    this.hLk = true;
                }
                this.VZ = false;
                break;
            }
            case 1: {
                this.VZ = true;
            }
        }
        Log.d("BaseSwiper", "onPageScrollStateChanged: loop=" + z + "; state=" + v);
    }

    @Override  // com.bytedance.adsdk.ugeno.cz.ReZ
    public void PjT(boolean z, int v, float f, int v1) {
        Log.d("BaseSwiper", "onPageScrolled: loop=" + z + "; position=" + v + "; positionOffset=" + f + "; positionOffsetPixels=" + v1);
        this.PjT(z, v, f);
    }

    @Override  // com.bytedance.adsdk.ugeno.cz.ReZ
    public void PjT(boolean z, int v, int v1, boolean z1, boolean z2) {
        if(this.NR != v) {
            this.XX(v);
            this.Au(v);
            this.NR = v;
        }
        Log.d("BaseSwiper", "onPageSelected: loop=" + z + "; position=" + v + "; loopPosition=" + v1 + "; isFirst=" + z1 + "; isLast=" + z2);
    }

    public void ReZ() {
        int v = ((com.bytedance.adsdk.ugeno.cz.Zh)this.JQp).getCurrentItem();
        ((com.bytedance.adsdk.ugeno.cz.Zh)this.JQp).xf(v + 1);
    }

    private void XX(int v) {
        if(this.Qtm == null) {
            return;
        }
        if(this.NR == 0 && v == this.oG() - 1) {
            this.Qtm.PjT("SwiperView://reloop", new Object[]{1});
            Log.d("BaseSwiper", "onPageSelected: reloop monitor FIRST_TO_LAST");
        }
        if(this.NR == this.oG() - 1 && v == 0) {
            this.Qtm.PjT("SwiperView://reloop", new Object[]{0});
            Log.d("BaseSwiper", "onPageSelected: reloop monitor LAST_TO_FIRST");
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public void Zh() {
        super.Zh();
        ((com.bytedance.adsdk.ugeno.cz.Zh)this.JQp).PjT(this.OL).ReZ(this.jp).PjT(this.dDm).Zh(((int)this.oMU)).Zh(this.kWj).JQp(this.Gr).cr(this.fU).XX(((int)this.pBJ)).Au(((int)this.sjb)).cz(((int)this.QB)).PjT(this.Lx).PjT(this.ZsT).xf(this.vSp);
        ((com.bytedance.adsdk.ugeno.cz.Zh)this.JQp).setOnPageChangeListener(this);
        if(this.dG == 1) {
            this.cI();
        }
        else {
            this.Ld();
        }
        ((com.bytedance.adsdk.ugeno.cz.Zh)this.JQp).Zh();
    }

    private void cI() {
        for(int v = 0; v < this.PjT.size(); ++v) {
            com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = (com.bytedance.adsdk.ugeno.Zh.ReZ)this.PjT.get(v);
            if(reZ0 != null) {
                com.bytedance.adsdk.ugeno.core.SM sM0 = new com.bytedance.adsdk.ugeno.core.SM(this.Zh);
                sM0.PjT(this.UR);
                com.bytedance.adsdk.ugeno.Zh.ReZ reZ1 = sM0.PjT(reZ0.KM(), this.cr, null);
                ((com.bytedance.adsdk.ugeno.cz.Zh)this.JQp).PjT(reZ1);
            }
        }
    }

    public void cr() {
        int v = ((com.bytedance.adsdk.ugeno.cz.Zh)this.JQp).getCurrentItem();
        ((com.bytedance.adsdk.ugeno.cz.Zh)this.JQp).xf(v - 1);
    }

    private int oG() {
        if(this.dG == 1) {
            return this.PjT == null ? 0 : this.PjT.size();
        }
        return this.uvo == null ? 0 : this.uvo.length();
    }
}

