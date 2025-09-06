package com.bytedance.adsdk.ugeno.Zh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import com.bytedance.adsdk.ugeno.core.Au;
import com.bytedance.adsdk.ugeno.core.DWo;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.XX;
import com.bytedance.adsdk.ugeno.core.Zh.JQp;
import com.bytedance.adsdk.ugeno.core.cz;
import com.bytedance.adsdk.ugeno.core.qj;
import com.bytedance.adsdk.ugeno.core.qla;
import com.bytedance.adsdk.ugeno.core.xf.PjT;
import com.bytedance.adsdk.ugeno.core.xf.Zh;
import com.bytedance.adsdk.ugeno.core.xf;
import com.bytedance.adsdk.ugeno.core.xs;
import com.bytedance.adsdk.ugeno.cr.SM;
import com.bytedance.adsdk.ugeno.cr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ReZ implements View.OnTouchListener, PjT, Zh, cr {
    protected com.bytedance.adsdk.ugeno.core.JQp.PjT Au;
    protected xs CD;
    protected float CY;
    protected boolean Co;
    protected boolean DWo;
    private boolean GP;
    private boolean Gr;
    protected boolean HG;
    protected boolean IJ;
    private boolean It;
    protected View JQp;
    private JSONObject JU;
    protected boolean Jo;
    private boolean KLT;
    protected float KM;
    private String KP;
    protected boolean Ld;
    private boolean Lmo;
    protected boolean Lrd;
    private boolean Lx;
    protected cz MN;
    protected float MWx;
    private XX NR;
    protected float Nv;
    private boolean OL;
    protected boolean OMu;
    private boolean OnL;
    private com.bytedance.adsdk.ugeno.cr.PjT.PjT Os;
    protected float Owx;
    private boolean PjT;
    private String QB;
    protected float Qf;
    protected SM Qtm;
    protected float RD;
    protected float RV;
    private boolean RXa;
    protected JSONObject ReZ;
    protected Au SM;
    protected boolean Sks;
    private float Tn;
    protected xf UR;
    protected float VY;
    @Deprecated
    private com.bytedance.adsdk.ugeno.core.Zh.ReZ.PjT VZ;
    protected Map Vs;
    private qla WHM;
    protected boolean Wo;
    protected com.bytedance.adsdk.ugeno.Zh.PjT XX;
    protected int Xe;
    protected float Xtz;
    protected float Yo;
    protected boolean ZX;
    protected int Zd;
    protected Context Zh;
    private boolean ZsT;
    protected boolean cI;
    protected boolean cRA;
    protected JSONObject cr;
    protected com.bytedance.adsdk.ugeno.Zh.PjT cz;
    private boolean dDm;
    @Deprecated
    private com.bytedance.adsdk.ugeno.core.Zh.PjT dG;
    protected float dIF;
    protected float dwk;
    protected boolean fA;
    protected float fDm;
    protected float fK;
    private boolean fU;
    private boolean gH;
    protected float gK;
    @Deprecated
    private com.bytedance.adsdk.ugeno.core.Zh.cr hLk;
    protected float hN;
    private boolean hx;
    protected float iZZ;
    protected String ig;
    protected float ix;
    protected com.bytedance.adsdk.ugeno.XX.PjT.PjT jK;
    private boolean jp;
    protected String kFP;
    private boolean kWj;
    protected float kph;
    protected float ltE;
    protected float na;
    protected boolean oG;
    private boolean oMU;
    private com.bytedance.adsdk.ugeno.core.PjT pBJ;
    protected boolean qZS;
    protected String qj;
    protected float qla;
    protected ImageView.ScaleType rds;
    @Deprecated
    private JQp sjb;
    protected boolean tT;
    protected float tY;
    protected float uQg;
    protected float ub;
    private GradientDrawable uvo;
    @Deprecated
    private com.bytedance.adsdk.ugeno.core.Zh.Zh vSp;
    protected com.bytedance.adsdk.ugeno.PjT.PjT wKV;
    protected boolean wN;
    protected float xE;
    protected float xH;
    protected float xR;
    protected String xf;
    private boolean xi;
    protected float xs;
    protected int xu;
    protected float yIW;
    protected float yks;
    protected ViewGroup.LayoutParams zYH;
    protected float zZ;

    public ReZ(Context context0) {
        this(context0, null);
    }

    public ReZ(Context context0, com.bytedance.adsdk.ugeno.Zh.PjT pjT0) {
        this.xs = -2.0f;
        this.fDm = -2.0f;
        this.kFP = "solid";
        this.xu = 0;
        this.fA = true;
        this.yks = 0.0f;
        this.Xtz = 0.0f;
        this.ix = 0.0f;
        this.Nv = 1.0f;
        this.dIF = 1.0f;
        this.hN = 1.0f;
        this.uQg = 0.0f;
        this.RV = 0.0f;
        this.xR = 0.0f;
        this.fK = 0.0f;
        this.na = 1.0f;
        this.fU = true;
        this.It = true;
        this.GP = false;
        this.OnL = false;
        this.Tn = 12.0f;
        this.Zh = context0;
        this.cz = pjT0;
        this.Vs = new HashMap();
        this.uvo = new GradientDrawable();
        this.JQp = this.PjT();
    }

    // 去混淆评级： 低(30)
    private boolean Au(String s) {
        return TextUtils.isEmpty(s) ? true : !TextUtils.equals(s, "hidden");
    }

    @Override  // com.bytedance.adsdk.ugeno.cr
    public void Au() {
        XX xX0 = this.NR;
        if(xX0 != null) {
            xX0.Zh();
        }
        com.bytedance.adsdk.ugeno.PjT.PjT pjT0 = this.wKV;
        if(pjT0 != null) {
            pjT0.Zh();
        }
    }

    public String Co() {
        return this.xf;
    }

    private void DWo() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.qj);
        this.JQp.setContentDescription(stringBuilder0);
    }

    protected void IJ() {
    }

    @Override  // com.bytedance.adsdk.ugeno.cr
    public void JQp() {
        if(this.WHM != null && !this.KLT) {
            this.KLT = true;
        }
    }

    public void JQp(int v) {
        if(this.Qf()) {
            View view0 = this.JQp;
            if(view0 instanceof com.bytedance.adsdk.ugeno.Zh.Zh) {
                ((com.bytedance.adsdk.ugeno.Zh.Zh)view0).PjT(v);
                return;
            }
            ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
            if(viewGroup0 instanceof com.bytedance.adsdk.ugeno.Zh.Zh) {
                ((com.bytedance.adsdk.ugeno.Zh.Zh)viewGroup0).PjT(this.JQp, v);
            }
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.JQp.getLayoutParams();
        viewGroup$LayoutParams0.width = v;
        this.JQp.setLayoutParams(viewGroup$LayoutParams0);
    }

    public void JQp(String s) {
        this.qj = s;
    }

    public String Jo() {
        return this.qj;
    }

    public com.bytedance.adsdk.ugeno.core.JQp.PjT KM() {
        return this.Au;
    }

    private void Ld() {
        if(TextUtils.equals("dashed", this.kFP)) {
            this.uvo.setStroke(((int)this.zZ), this.Xe, 3.0f * this.zZ, this.zZ);
            return;
        }
        if(TextUtils.equals("dotted", this.kFP)) {
            this.uvo.setStroke(((int)this.zZ), this.Xe, this.zZ / 2.0f, this.zZ);
            return;
        }
        this.uvo.setStroke(((int)this.zZ), this.Xe);
    }

    public JSONObject Lrd() {
        return this.ReZ;
    }

    public boolean MWx() {
        return this.Lx;
    }

    public boolean OMu() {
        return this.CY > 0.0f;
    }

    public float Owx() {
        return this.fK;
    }

    public View PjT() {
        return null;
    }

    // 去混淆评级： 低(20)
    protected ReZ PjT(String s) {
        return TextUtils.isEmpty(this.qj) || !TextUtils.equals(this.qj, s) ? null : this;
    }

    @Override  // com.bytedance.adsdk.ugeno.cr
    public void PjT(int v, int v1, int v2, int v3) {
        if(this.WHM != null && !this.gH) {
            this.gH = true;
        }
    }

    @Deprecated
    protected void PjT(int v, JSONObject jSONObject0, DWo dWo0) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("success");
        if(jSONObject1 != null) {
            DWo dWo1 = new DWo();
            dWo1.PjT(jSONObject1);
            dWo1.PjT(this);
            dWo0.PjT(dWo1);
        }
        JSONObject jSONObject2 = jSONObject0.optJSONObject("fail");
        if(jSONObject2 != null) {
            DWo dWo2 = new DWo();
            dWo2.PjT(jSONObject2);
            dWo2.PjT(this);
            dWo0.Zh(dWo2);
        }
        dWo0.PjT(jSONObject0);
        this.Vs.put(v, dWo0);
    }

    @Override  // com.bytedance.adsdk.ugeno.cr
    public void PjT(Canvas canvas0) {
        com.bytedance.adsdk.ugeno.PjT.PjT pjT0 = this.wKV;
        if(pjT0 != null) {
            pjT0.PjT(canvas0);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.cr
    public void PjT(Canvas canvas0, IAnimation iAnimation0) {
        XX xX0 = this.NR;
        if(xX0 != null) {
            xX0.PjT(canvas0, iAnimation0);
        }
    }

    protected void PjT(Drawable drawable0) {
        this.JQp.setBackground(drawable0);
    }

    public void PjT(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        View view0 = this.JQp;
        if(view0 != null) {
            view0.setLayoutParams(viewGroup$LayoutParams0);
        }
        this.zYH = viewGroup$LayoutParams0;
    }

    protected void PjT(com.bytedance.adsdk.ugeno.XX.PjT.PjT pjT$PjT0) {
        if(pjT$PjT0 == null) {
            return;
        }
        this.uvo.setShape(0);
        this.uvo.setOrientation(pjT$PjT0.PjT);
        if(Build.VERSION.SDK_INT >= 29) {
            this.uvo.setColors(pjT$PjT0.Zh, pjT$PjT0.ReZ);
        }
        else {
            this.uvo.setColors(pjT$PjT0.Zh);
        }
        this.cI();
        this.Ld();
        this.JQp.setBackground(this.uvo);
    }

    public void PjT(com.bytedance.adsdk.ugeno.Zh.PjT pjT0) {
        this.cz = pjT0;
    }

    public void PjT(Au au0) {
        this.SM = au0;
    }

    @Override  // com.bytedance.adsdk.ugeno.core.xf$Zh
    public void PjT(DWo dWo0) {
        if(dWo0 != null && dWo0.ReZ() != null && TextUtils.equals(dWo0.ReZ().optString("type"), "onDismiss")) {
            String s = dWo0.ReZ().optString("nodeId");
            this.ReZ(8);
            this.XX = (com.bytedance.adsdk.ugeno.Zh.PjT)this.Zh(this);
            if(!TextUtils.isEmpty(s)) {
                com.bytedance.adsdk.ugeno.Zh.PjT pjT0 = this.XX;
                if(pjT0 != null) {
                    ReZ reZ0 = pjT0.ReZ(s);
                    if(reZ0 != null) {
                        reZ0.ReZ(8);
                    }
                }
            }
        }
    }

    public void PjT(com.bytedance.adsdk.ugeno.core.JQp.PjT jQp$PjT0) {
        this.Au = jQp$PjT0;
    }

    public void PjT(cz cz0) {
        this.MN = cz0;
    }

    public void PjT(qla qla0) {
        this.WHM = qla0;
    }

    public void PjT(xf xf0) {
        this.UR = xf0;
    }

    public void PjT(xs xs0) {
        this.CD = xs0;
    }

    public void PjT(com.bytedance.adsdk.ugeno.cr.PjT.PjT pjT0) {
        this.Os = pjT0;
    }

    public void PjT(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        s.hashCode();
        switch(s) {
            case "animation": {
                try {
                    com.bytedance.adsdk.ugeno.PjT.Zh zh0 = com.bytedance.adsdk.ugeno.PjT.ReZ.PjT(new JSONObject(s1));
                    this.wKV = new com.bytedance.adsdk.ugeno.PjT.PjT(this.Zh, this, zh0);
                }
                catch(JSONException unused_ex) {
                }
                return;
            }
            case "animatorSet": {
                this.pBJ = com.bytedance.adsdk.ugeno.core.PjT.PjT(s1, this);
                return;
            }
            case "availability": {
                this.fA = !TextUtils.equals(s1, "unavailable");
                return;
            }
            case "background": 
            case "backgroundColor": {
                if(com.bytedance.adsdk.ugeno.XX.PjT.ReZ(s1)) {
                    this.Wo = true;
                    this.jK = com.bytedance.adsdk.ugeno.XX.PjT.Zh(s1);
                    return;
                }
                this.Zd = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1, 0);
                this.Wo = false;
                return;
            }
            case "backgroundDrawable": 
            case "backgroundImage": {
                this.ig = s1;
                return;
            }
            case "backgroundImageBlur": {
                float f = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                this.kph = f;
                if(f > 0.0f) {
                    this.IJ = true;
                    return;
                }
                return;
            }
            case "backgroundScale": {
                this.OMu = true;
                this.rds = this.XX(s1);
                return;
            }
            case "borderBottomLeftRadius": {
                this.xH = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.oG = true;
                return;
            }
            case "borderBottomRightRadius": {
                this.MWx = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.HG = true;
                return;
            }
            case "borderColor": {
                this.Xe = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1);
                return;
            }
            case "borderRadius": {
                this.VY = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                return;
            }
            case "borderStyle": {
                this.kFP = s1;
                return;
            }
            case "borderTopLeftRadius": {
                this.tY = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.Ld = true;
                return;
            }
            case "borderTopRightRadius": {
                this.dwk = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.cI = true;
                return;
            }
            case "borderWidth": {
                this.zZ = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                return;
            }
            case "click": {
                this.QB = s1;
                return;
            }
            case "clickable": {
                this.It = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, true);
                return;
            }
            case "disable": {
                this.Lx = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, false);
                return;
            }
            case "events": {
                this.Qtm = SM.PjT(this, s1);
                return;
            }
            case "height": {
                if(!TextUtils.equals(s1, "match_parent")) {
                    this.fDm = TextUtils.equals(s1, "wrap_content") ? -2.0f : com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                }
                else if(this.Qf() && (this.cz != null && this.cz.qZS() == -2)) {
                    this.fDm = -2.0f;
                }
                else {
                    this.fDm = -1.0f;
                }
                this.OnL = true;
                return;
            }
            case "i18n": {
                this.JU = com.bytedance.adsdk.ugeno.XX.Zh.PjT(s1, null);
                return;
            }
            case "id": {
                this.qj = s1;
                return;
            }
            case "margin": {
                this.qla = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                return;
            }
            case "marginBottom": {
                this.ltE = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.cRA = true;
                return;
            }
            case "marginLeft": {
                this.xE = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.Sks = true;
                return;
            }
            case "marginRight": {
                this.ub = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.tT = true;
                return;
            }
            case "marginTop": {
                this.gK = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.Lrd = true;
                return;
            }
            case "minHeight": {
                this.RD = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "minWidth": {
                this.Owx = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "name": {
                this.xf = s1;
                return;
            }
            case "onAnimation": {
                break;
            }
            case "onDelay": {
                break;
            }
            case "onDown": {
                break;
            }
            case "onExposure": {
                break;
            }
            case "onLoadMore": {
                break;
            }
            case "onLongTap": 
            case "onPullToRefresh": 
            case "onScroll": {
                break;
            }
            case "onRenderSuccess": {
                break;
            }
            case "onShake": {
                break;
            }
            case "onSlide": {
                break;
            }
            case "onTap": {
                break;
            }
            case "onTimer": {
                break;
            }
            case "onTwist": {
                break;
            }
            case "opacity": {
                this.Gr = true;
                this.na = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 1.0f);
                return;
            }
            case "overflow": {
                this.fU = this.Au(s1);
                return;
            }
            case "padding": {
                this.yIW = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.ZX = true;
                return;
            }
            case "paddingBottom": {
                this.Qf = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.qZS = true;
                return;
            }
            case "paddingLeft": {
                this.iZZ = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.Jo = true;
                return;
            }
            case "paddingRight": {
                this.Yo = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.Co = true;
                return;
            }
            case "paddingTop": {
                this.KM = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                this.wN = true;
                return;
            }
            case "ratio": {
                this.CY = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "rotate": {
                this.oMU = true;
                this.uQg = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "rotateX": {
                this.ZsT = true;
                this.RV = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "rotateY": {
                this.kWj = true;
                this.xR = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "rotateZ": {
                this.fK = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "scale": {
                this.jp = true;
                this.dDm = true;
                float[] arr_f = com.bytedance.adsdk.ugeno.PjT.ReZ.ReZ(s1);
                this.dIF = arr_f[0];
                this.hN = arr_f[1];
                return;
            }
            case "scaleX": {
                this.jp = true;
                this.dIF = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "scaleY": {
                this.dDm = true;
                this.hN = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "translate": {
                this.PjT = true;
                this.OL = true;
                float[] arr_f1 = com.bytedance.adsdk.ugeno.PjT.ReZ.ReZ(s1);
                this.Xtz = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, arr_f1[0]);
                this.ix = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, arr_f1[1]);
                return;
            }
            case "translateX": {
                this.PjT = true;
                this.Xtz = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f));
                return;
            }
            case "translateY": {
                this.OL = true;
                this.ix = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f));
                return;
            }
            case "triggerFunc": {
                this.KP = s1;
                return;
            }
            case "visibility": {
                if(TextUtils.equals("visible", s1)) {
                    this.xu = 0;
                }
                else if(TextUtils.equals("invisible", s1)) {
                    this.xu = 4;
                }
                else if(TextUtils.equals("gone", s1) || TextUtils.equals("hidden", s1)) {
                    this.xu = 8;
                }
                this.JQp.setVisibility(this.xu);
                return;
            }
            case "width": {
                if(!TextUtils.equals(s1, "match_parent")) {
                    this.xs = TextUtils.equals(s1, "wrap_content") ? -2.0f : com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, s1);
                }
                else if(this.Qf() && (this.cz != null && this.cz.wN() == -2)) {
                    this.xs = -2.0f;
                }
                else {
                    this.xs = -1.0f;
                }
                this.GP = true;
                return;
            }
            default: {
                return;
            }
        }
        this.Zh(s, s1);
    }

    public void PjT(JSONObject jSONObject0) {
        this.cr = jSONObject0;
        JSONObject jSONObject1 = this.ReZ;
        if(jSONObject1 == null) {
            return;
        }
        Iterator iterator0 = jSONObject1.keys();
        com.bytedance.adsdk.ugeno.Zh.PjT.PjT pjT$PjT0 = this.cz instanceof com.bytedance.adsdk.ugeno.Zh.PjT ? this.cz.DWo() : null;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            String s1 = com.bytedance.adsdk.ugeno.ReZ.Zh.PjT(this.ReZ.optString(s), jSONObject0);
            this.PjT(s, s1);
            if(pjT$PjT0 != null) {
                pjT$PjT0.PjT(this.Zh, s, s1);
            }
        }
        if(pjT$PjT0 != null) {
            this.PjT(pjT$PjT0.PjT());
        }
        if(this.JU != null && this.cr != null) {
            try {
                if(this.Qf()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("i18n", this.JU);
                    this.cr.put("xNode", jSONObject2);
                    return;
                }
                this.cr.put("i18n", this.JU);
            }
            catch(JSONException unused_ex) {
            }
        }
    }

    public void PjT(boolean z) {
        this.DWo = z;
    }

    @Override  // com.bytedance.adsdk.ugeno.cr
    public int[] PjT(int v, int v1) {
        if(this.CY > 0.0f) {
            if(this.GP) {
                int v2 = View.MeasureSpec.getSize(v);
                float f = this.CY;
                if(f != 0.0f) {
                    v1 = View.MeasureSpec.makeMeasureSpec(((int)(((float)v2) / f)), 0x40000000);
                }
            }
            else if(this.OnL) {
                int v3 = View.MeasureSpec.getSize(v1);
                float f1 = this.CY;
                if(f1 != 0.0f) {
                    v = View.MeasureSpec.makeMeasureSpec(((int)(((float)v3) * f1)), 0x40000000);
                }
            }
        }
        if(this.WHM != null && !this.RXa) {
            this.RXa = true;
        }
        return new int[]{v, v1};
    }

    public boolean Qf() {
        return this.DWo;
    }

    public float RD() {
        return this.na;
    }

    private void ReZ() {
        if(this.PjT) {
            this.JQp.setTranslationX(this.Xtz);
        }
        if(this.OL) {
            this.JQp.setTranslationY(this.ix);
        }
        if(this.jp) {
            this.JQp.setScaleX(this.dIF);
        }
        if(this.dDm) {
            this.JQp.setScaleY(this.hN);
        }
        if(this.oMU) {
            this.JQp.setRotation(this.uQg);
        }
        if(this.ZsT) {
            this.JQp.setRotationX(this.RV);
        }
        if(this.kWj) {
            this.JQp.setRotationY(this.xR);
        }
        if(this.Gr) {
            this.JQp.setAlpha(this.na);
        }
        float f = this.fK;
        if(f != 0.0f) {
            this.JQp.setRotation(f);
        }
    }

    public ReZ ReZ(String s) {
        return this.PjT(s);
    }

    public void ReZ(int v) {
        ViewGroup viewGroup0 = (ViewGroup)this.JQp.getParent();
        if(viewGroup0 instanceof com.bytedance.adsdk.ugeno.Zh.Zh) {
            ((com.bytedance.adsdk.ugeno.Zh.Zh)viewGroup0).ReZ(this.JQp, v);
            return;
        }
        this.JQp.setVisibility(v);
    }

    public void ReZ(JSONObject jSONObject0) {
        this.ReZ = jSONObject0;
    }

    private void SM() {
        if(this.UR == null) {
            return;
        }
        if(!this.Zh(18)) {
            return;
        }
        DWo dWo0 = (DWo)this.Vs.get(18);
        if(dWo0 == null) {
            return;
        }
        JSONObject jSONObject0 = dWo0.ReZ();
        if(jSONObject0 != null) {
            String s = jSONObject0.optString("rotateZ");
            try {
                jSONObject0.put("rotateZ", com.bytedance.adsdk.ugeno.ReZ.Zh.PjT(s, this.cr));
            }
            catch(JSONException unused_ex) {
            }
        }
        this.UR.PjT(dWo0, this, this);
    }

    public float Sks() {
        return this.VY;
    }

    // 去混淆评级： 低(20)
    public float VY() {
        return this.JQp instanceof com.bytedance.adsdk.ugeno.PjT.JQp ? ((com.bytedance.adsdk.ugeno.PjT.JQp)this.JQp).getRipple() : 0.0f;
    }

    private ImageView.ScaleType XX(String s) {
        s.hashCode();
        switch(s) {
            case "center": {
                this.rds = ImageView.ScaleType.CENTER;
                return this.rds;
            }
            case "crop": {
                this.rds = ImageView.ScaleType.CENTER_CROP;
                return this.rds;
            }
            case "fit": {
                this.rds = ImageView.ScaleType.FIT_CENTER;
                return this.rds;
            }
            default: {
                this.rds = ImageView.ScaleType.FIT_XY;
                return this.rds;
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.cr
    public void XX() {
        com.bytedance.adsdk.ugeno.core.PjT pjT0 = this.pBJ;
        if(pjT0 != null) {
            XX xX0 = new XX(this.JQp, pjT0);
            this.NR = xX0;
            xX0.PjT();
        }
        com.bytedance.adsdk.ugeno.PjT.PjT pjT1 = this.wKV;
        if(pjT1 != null) {
            pjT1.PjT();
        }
        SM sM0 = this.Qtm;
        if(sM0 != null) {
            sM0.cr();
        }
        if(this.dG != null && this.Zh(10)) {
            this.dG.PjT();
        }
        if(this.sjb != null && this.Zh(9)) {
            this.sjb.PjT();
        }
    }

    public void Yo() {
        if(this.JQp != null) {
            this.PjT(this.zYH);
            this.JQp(((int)this.xs));
            this.cz(((int)this.fDm));
        }
    }

    public com.bytedance.adsdk.ugeno.Zh.PjT ZX() {
        return this.cz;
    }

    public boolean Zd() {
        return this.fA;
    }

    public ReZ Zh(ReZ reZ0) {
        return reZ0.ZX() != null || !(reZ0 instanceof com.bytedance.adsdk.ugeno.Zh.PjT) ? this.Zh(reZ0.ZX()) : reZ0;
    }

    // 去混淆评级： 低(20)
    protected ReZ Zh(String s) {
        return TextUtils.isEmpty(this.xf) || !TextUtils.equals(this.xf, s) ? null : this;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Zh() {
        this.cRA();
        this.xs();
        this.ReZ(this.xu);
        this.ReZ();
        this.cr();
        SM sM0 = this.Qtm;
        if(sM0 != null) {
            sM0.PjT();
            this.Qtm.Zh();
            this.Qtm.ReZ();
        }
        this.JQp.setOnTouchListener(this);
        this.DWo();
        ViewGroup viewGroup0 = (ViewGroup)this.JQp.getParent();
        if(viewGroup0 != null) {
            viewGroup0.setClipChildren(!this.fU);
        }
        com.bytedance.adsdk.ugeno.PjT.PjT pjT0 = this.wKV;
        if(pjT0 != null) {
            pjT0.ReZ();
        }
        if(this.UR != null && this.Zh(22)) {
            this.UR.PjT(((DWo)this.Vs.get(22)), this, this);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.cr
    public void Zh(int v, int v1, int v2, int v3) {
        XX xX0 = this.NR;
        if(xX0 != null) {
            xX0.PjT(v, v1);
        }
        com.bytedance.adsdk.ugeno.PjT.PjT pjT0 = this.wKV;
        if(pjT0 != null) {
            pjT0.PjT(v, v1);
        }
    }

    protected void Zh(String s, String s1) {
        if(!TextUtils.isEmpty(s1) && this.Vs != null) {
            try {
                int v = qj.PjT(s).PjT();
                DWo dWo0 = new DWo();
                dWo0.PjT(v);
                dWo0.PjT(this);
                JSONObject jSONObject0 = new JSONObject(s1);
                if(v == 3) {
                    String s2 = jSONObject0.optString("shakeAmplitude");
                    try {
                        this.Tn = Float.parseFloat(com.bytedance.adsdk.ugeno.ReZ.Zh.PjT(s2, this.cr));
                    }
                    catch(NumberFormatException unused_ex) {
                        this.Tn = 12.0f;
                    }
                }
                if(this.UR instanceof com.bytedance.adsdk.ugeno.core.PjT.Zh) {
                    throw null;
                }
                this.PjT(v, jSONObject0, dWo0);
            }
            catch(JSONException unused_ex) {
            }
        }
    }

    public void Zh(JSONObject jSONObject0) {
        this.cr = jSONObject0;
    }

    public boolean Zh(int v) {
        return this.Vs != null && this.Vs.containsKey(v);
    }

    private void cI() {
        float f = this.Ld ? this.tY : this.VY;
        float f1 = this.cI ? this.dwk : this.VY;
        float f2 = this.oG ? this.xH : this.VY;
        float f3 = this.HG ? this.MWx : this.VY;
        this.uvo.setCornerRadii(new float[]{f, f, f1, f1, f3, f3, f2, f2});
    }

    protected void cRA() {
        BitmapDrawable bitmapDrawable0;
        if(TextUtils.isEmpty(this.ig)) {
            if(this.Wo) {
                this.PjT(this.jK);
                return;
            }
            this.uvo.setColor(this.Zd);
            this.cr(this.Zd);
            return;
        }
        if(this.ig.startsWith("local://")) {
            String s = this.ig.replace("local://", "");
            try {
                BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                bitmapFactory$Options0.inPreferredConfig = this.IJ ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
                bitmapFactory$Options0.inPurgeable = true;
                bitmapFactory$Options0.inInputShareable = true;
                Bitmap bitmap0 = BitmapFactory.decodeStream(this.Zh.getResources().openRawResource(com.bytedance.adsdk.ugeno.XX.cr.PjT(this.Zh, s)), null, bitmapFactory$Options0);
                if(this.IJ) {
                    Bitmap bitmap1 = com.bytedance.adsdk.ugeno.XX.Au.PjT(this.Zh, bitmap0, ((int)this.kph));
                    bitmapDrawable0 = bitmap1 == null ? new BitmapDrawable(this.Zh.getResources(), bitmap0) : new BitmapDrawable(this.Zh.getResources(), bitmap1);
                }
                else {
                    bitmapDrawable0 = new BitmapDrawable(this.Zh.getResources(), bitmap0);
                }
                this.PjT(bitmapDrawable0);
            }
            catch(Throwable unused_ex) {
            }
            return;
        }
        this.yIW();
    }

    @Deprecated
    private void cr() {
        this.JQp.setVisibility(this.xu);
        float f = this.fK;
        if(f != 0.0f) {
            this.JQp.setRotation(f);
        }
        if(this.Au != null && TextUtils.isEmpty(this.Au.Zh())) {
            this.JQp.setOnClickListener(new View.OnClickListener() {
                final ReZ PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                }
            });
        }
        else if(this.Zh(1) && !this.Lmo) {
            this.JQp.setOnClickListener(new View.OnClickListener() {
                final ReZ PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    if(ReZ.this.UR != null && ReZ.this.It) {
                        ReZ.this.UR.PjT(((DWo)ReZ.this.Vs.get(1)), ReZ.this, ReZ.this);
                    }
                }
            });
        }
        if(this.UR != null && this.Zh(4)) {
            if(this.Zh(1)) {
                this.xi = true;
                this.hLk = new com.bytedance.adsdk.ugeno.core.Zh.cr(this.Zh, ((DWo)this.Vs.get(4)), ((DWo)this.Vs.get(1)), this.xi);
            }
            else {
                this.hLk = new com.bytedance.adsdk.ugeno.core.Zh.cr(this.Zh, ((DWo)this.Vs.get(4)), this.xi);
            }
        }
        if(this.UR != null && this.Zh(1) && this.Lmo) {
            this.vSp = new com.bytedance.adsdk.ugeno.core.Zh.Zh(this.Zh, ((DWo)this.Vs.get(1)));
        }
        this.SM();
        if(this.UR != null && this.Zh(3)) {
            com.bytedance.adsdk.ugeno.core.Zh.ReZ reZ0 = com.bytedance.adsdk.ugeno.JQp.PjT().cr();
            if(reZ0 != null) {
                this.VZ = reZ0.PjT(this.Zh, this);
                new Object() {
                    final ReZ PjT;

                };
            }
        }
        if(this.UR != null && this.Zh(9)) {
            JQp jQp0 = new JQp(this.Zh, ((DWo)this.Vs.get(9)), this);
            this.sjb = jQp0;
            jQp0.PjT(this.UR);
        }
        if(this.Zh(10)) {
            com.bytedance.adsdk.ugeno.core.Zh.PjT pjT0 = new com.bytedance.adsdk.ugeno.core.Zh.PjT(this.Zh, ((DWo)this.Vs.get(10)), this);
            this.dG = pjT0;
            pjT0.PjT(this.UR);
        }
    }

    public ReZ cr(String s) {
        return this.Zh(s);
    }

    protected void cr(int v) {
        this.uvo.setShape(0);
        this.uvo.setColor(v);
        this.cI();
        this.Ld();
        this.JQp.setBackground(this.uvo);
    }

    @Override  // com.bytedance.adsdk.ugeno.cr
    public void cz() {
        if(this.WHM != null && !this.hx) {
            this.hx = true;
        }
    }

    public void cz(int v) {
        if(this.Qf()) {
            View view0 = this.JQp;
            if(view0 instanceof com.bytedance.adsdk.ugeno.Zh.Zh) {
                ((com.bytedance.adsdk.ugeno.Zh.Zh)view0).Zh(v);
                return;
            }
            ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
            if(viewGroup0 instanceof com.bytedance.adsdk.ugeno.Zh.Zh) {
                ((com.bytedance.adsdk.ugeno.Zh.Zh)viewGroup0).Zh(this.JQp, v);
            }
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.JQp.getLayoutParams();
        viewGroup$LayoutParams0.height = v;
        this.JQp.setLayoutParams(viewGroup$LayoutParams0);
    }

    public void cz(String s) {
        this.xf = s;
    }

    // 去混淆评级： 低(20)
    public float dwk() {
        return this.JQp instanceof com.bytedance.adsdk.ugeno.PjT.JQp ? ((com.bytedance.adsdk.ugeno.PjT.JQp)this.JQp).getRubIn() : 0.0f;
    }

    public float fDm() {
        return this.Xtz;
    }

    public float gK() {
        return this.RV;
    }

    public ViewGroup.LayoutParams iZZ() {
        return this.zYH;
    }

    public int ig() {
        return this.Zd;
    }

    protected void kph() {
    }

    public float ltE() {
        return this.xR;
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        switch(v) {
            case 0: {
                this.kph();
                break;
            }
            case 1: {
                this.IJ();
                break;
            }
            default: {
                if(v == 3) {
                    this.IJ();
                }
            }
        }
        xs xs0 = this.CD;
        if(xs0 != null) {
            xs0.PjT(this, motionEvent0);
        }
        if(this.Zh(17) && motionEvent0.getAction() == 0) {
            this.UR.PjT(((DWo)this.Vs.get(17)), this, this);
        }
        if(this.Zh(1) && this.Lmo) {
            xf xf0 = this.UR;
            if(xf0 != null) {
                com.bytedance.adsdk.ugeno.core.Zh.Zh zh0 = this.vSp;
                if(zh0 != null) {
                    return zh0.PjT(xf0, this, motionEvent0);
                }
            }
        }
        xf xf1 = this.UR;
        if(xf1 != null) {
            com.bytedance.adsdk.ugeno.core.Zh.cr cr0 = this.hLk;
            if(cr0 != null) {
                return cr0.PjT(xf1, this, motionEvent0);
            }
        }
        return this.Qtm == null ? false : this.Qtm.PjT(motionEvent0);
    }

    public int qZS() {
        return (int)this.fDm;
    }

    public View qj() {
        return this.JQp;
    }

    public float qla() {
        return this.ix;
    }

    public com.bytedance.adsdk.ugeno.cr.PjT.PjT rds() {
        return this.Os;
    }

    public xf tT() {
        return this.UR;
    }

    // 去混淆评级： 低(20)
    public float tY() {
        return this.JQp instanceof com.bytedance.adsdk.ugeno.PjT.JQp ? ((com.bytedance.adsdk.ugeno.PjT.JQp)this.JQp).getShine() : 0.0f;
    }

    public float ub() {
        return this.hN;
    }

    public int wN() {
        return (int)this.xs;
    }

    public float xE() {
        return this.dIF;
    }

    // 去混淆评级： 低(20)
    public float xH() {
        return this.JQp instanceof com.bytedance.adsdk.ugeno.PjT.JQp ? ((com.bytedance.adsdk.ugeno.PjT.JQp)this.JQp).getStretch() : 0.0f;
    }

    public JSONObject xf() {
        return this.cr;
    }

    // 去混淆评级： 低(40)
    protected void xs() {
        this.JQp.setPadding(((int)(this.Jo ? this.iZZ : this.yIW)), ((int)(this.wN ? this.KM : this.yIW)), ((int)(this.Co ? this.Yo : this.yIW)), ((int)(this.qZS ? this.Qf : this.yIW)));
    }

    protected void yIW() {
        com.bytedance.adsdk.ugeno.JQp.PjT().Zh().PjT(this.SM, this.ig, new com.bytedance.adsdk.ugeno.PjT.PjT() {
            final ReZ PjT;

            @Override  // com.bytedance.adsdk.ugeno.PjT$PjT
            public void PjT(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    ReZ reZ0 = ReZ.this;
                    if(reZ0.IJ) {
                        Bitmap bitmap1 = com.bytedance.adsdk.ugeno.XX.Au.PjT(reZ0.Zh, bitmap0, ((int)reZ0.kph));
                        if(bitmap1 != null) {
                            com.bytedance.adsdk.ugeno.XX.Au.PjT(new Runnable() {
                                final com.bytedance.adsdk.ugeno.Zh.ReZ.4 Zh;

                                @Override
                                public void run() {
                                    BitmapDrawable bitmapDrawable0 = new BitmapDrawable(bitmap1);
                                    ReZ.this.PjT(bitmapDrawable0);
                                }
                            });
                        }
                        return;
                    }
                    com.bytedance.adsdk.ugeno.XX.Au.PjT(new Runnable() {
                        final com.bytedance.adsdk.ugeno.Zh.ReZ.4 Zh;

                        @Override
                        public void run() {
                            BitmapDrawable bitmapDrawable0 = new BitmapDrawable(bitmap0);
                            ReZ.this.PjT(bitmapDrawable0);
                        }
                    });
                }
            }
        });
    }
}

