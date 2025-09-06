package com.bytedance.sdk.component.adexpress.dynamic.cr;

import com.bytedance.sdk.component.adexpress.cr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class cz {
    private float Au;
    private int CD;
    private boolean CY;
    private String Co;
    private float DWo;
    private boolean Gr;
    private boolean HG;
    private int IJ;
    private boolean JQp;
    private String Jo;
    private String KLT;
    private double KM;
    private int KP;
    private String Ld;
    private int Lmo;
    private String Lrd;
    private int Lx;
    private int MN;
    private int MWx;
    private boolean NR;
    private String Nv;
    private boolean OL;
    private double OMu;
    private String Owx;
    private float PjT;
    private int QB;
    private String Qf;
    private int Qtm;
    private String RD;
    private int RV;
    private long RXa;
    private float ReZ;
    private float SM;
    private String Sks;
    private int UR;
    private int VY;
    private String VZ;
    private boolean Vs;
    private String WHM;
    private boolean Wo;
    private float XX;
    private String Xe;
    private int Xtz;
    private double Yo;
    private String ZX;
    private int Zd;
    private float Zh;
    private int ZsT;
    private boolean cI;
    private boolean cRA;
    private float cr;
    private float cz;
    private JSONObject dDm;
    private String dG;
    private String dIF;
    private boolean dwk;
    private int fA;
    private String fDm;
    private List fK;
    private JSONObject fU;
    private String gH;
    private String gK;
    private boolean hLk;
    private boolean hN;
    private String hx;
    private int iZZ;
    private int ig;
    private int ix;
    private boolean jK;
    private double jp;
    private JSONObject kFP;
    private String kWj;
    private int kph;
    private String ltE;
    private int na;
    private boolean oG;
    private JSONObject oMU;
    private int pBJ;
    private boolean qZS;
    private double qj;
    private String qla;
    private int rds;
    private int sjb;
    private String tT;
    private boolean tY;
    private int uQg;
    private String ub;
    private int uvo;
    private int vSp;
    private int wKV;
    private String wN;
    private String xE;
    private int xH;
    private int xR;
    private double xf;
    private int xi;
    private String xs;
    private int xu;
    private int yIW;
    private int yks;
    private int zYH;
    private boolean zZ;

    public cz() {
        this.RXa = -1L;
    }

    public double Au() {
        return this.jp;
    }

    public void Au(float f) {
        this.SM = f;
    }

    public void Au(int v) {
        this.iZZ = v;
    }

    public void Au(String s) {
        this.ltE = s;
    }

    public void Au(boolean z) {
        this.oG = z;
    }

    public String CD() {
        return this.VZ;
    }

    public boolean CY() {
        return this.oG;
    }

    public int Co() {
        return this.iZZ;
    }

    public void Co(int v) {
        this.UR = v;
    }

    public String DWo() {
        return this.gH;
    }

    public void DWo(int v) {
        this.ig = v;
    }

    public void DWo(String s) {
        this.RD = s;
    }

    public void DWo(boolean z) {
        this.zZ = z;
    }

    public int Gr() {
        List list0 = this.fK;
        if(list0 != null) {
            for(Object object0: list0) {
                PjT pjT0 = (PjT)object0;
                if("translate".equals(pjT0.SM()) && pjT0.XX() < 0) {
                    return -pjT0.XX();
                }
                if(false) {
                    break;
                }
            }
        }
        return 0;
    }

    public int HG() {
        return this.xH;
    }

    public String IJ() {
        return this.wN;
    }

    public int JQp() {
        return this.sjb;
    }

    public void JQp(double f) {
        this.KM = f;
    }

    public void JQp(float f) {
        this.cz = f;
    }

    public void JQp(int v) {
        this.ZsT = v;
    }

    public void JQp(String s) {
        this.xE = s;
    }

    public void JQp(JSONObject jSONObject0) {
        this.fU = jSONObject0;
    }

    public void JQp(boolean z) {
        this.tY = z;
    }

    public int Jo() {
        return this.yIW;
    }

    public void Jo(int v) {
        this.MN = v;
    }

    public long KLT() {
        return this.RXa;
    }

    public String KM() {
        return this.tT;
    }

    public void KM(int v) {
        this.xR = v;
    }

    public String KP() {
        return this.WHM;
    }

    public double Ld() {
        return this.OMu;
    }

    public void Lmo() {
        this.PjT(this, this.dDm);
    }

    public String Lrd() {
        return this.gK;
    }

    public void Lrd(int v) {
        this.uQg = v;
    }

    public void Lrd(String s) {
        this.dG = s;
    }

    public int Lx() {
        return this.MN;
    }

    public int MN() {
        return this.uQg;
    }

    public int MWx() {
        return this.IJ;
    }

    public JSONObject NR() {
        return this.oMU;
    }

    public int Nv() {
        return this.fA;
    }

    public boolean OL() {
        return this.hLk;
    }

    public boolean OMu() {
        return this.qZS;
    }

    public double Owx() {
        return this.xf;
    }

    public void Owx(int v) {
        this.wKV = v;
    }

    public void Owx(String s) {
        this.Xe = s;
    }

    public static cz PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        cz cz0 = new cz();
        cz0.Zh(jSONObject0.optString("adType", "embeded"));
        cz0.qla(jSONObject0.optString("clickArea", "creative"));
        cz0.xE(jSONObject0.optString("clickTigger", "click"));
        cz0.ReZ(jSONObject0.optString("fontFamily", "PingFangSC"));
        cz0.cr(jSONObject0.optString("textAlign", "left"));
        cz0.JQp(jSONObject0.optString("color", "#999999"));
        cz0.cz(jSONObject0.optString("bgColor", "transparent"));
        cz0.XX(jSONObject0.optString("bgImgUrl", ""));
        cz0.iZZ(jSONObject0.optString("bgImgData", ""));
        cz0.Au(jSONObject0.optString("borderColor", "#000000"));
        cz0.SM(jSONObject0.optString("borderStyle", "solid"));
        cz0.DWo(jSONObject0.optString("heightMode", "auto"));
        cz0.qj(jSONObject0.optString("widthMode", "fixed"));
        cz0.xf(jSONObject0.optString("interactText", ""));
        cz0.ReZ(jSONObject0.optBoolean("isShowBgControl", false));
        cz0.xs(jSONObject0.optString("interactBgColor", ""));
        JSONObject jSONObject1 = jSONObject0.optJSONObject("interactPosition");
        if(jSONObject1 != null) {
            cz0.XX(jSONObject1.optInt("translateY", 0));
            cz0.Au(jSONObject1.optInt("translateX", 0));
            cz0.cr(jSONObject1.optDouble("scaleX", 0.0));
            cz0.JQp(jSONObject1.optDouble("scaleY", 0.0));
        }
        cz0.fDm(jSONObject0.optString("interactType", ""));
        cz0.JQp(jSONObject0.optInt("interactSlideDirection", -1));
        cz0.ub(jSONObject0.optString("justifyHorizontal", "space-around"));
        cz0.gK(jSONObject0.optString("justifyVertical", "flex-start"));
        cz0.Zh(jSONObject0.optDouble("timingStart"));
        cz0.ReZ(jSONObject0.optDouble("timingEnd"));
        cz0.cr(((float)jSONObject0.optDouble("width", 0.0)));
        cz0.ReZ(((float)jSONObject0.optDouble("height", 0.0)));
        cz0.PjT(((float)jSONObject0.optDouble("borderRadius", 0.0)));
        cz0.Zh(((float)jSONObject0.optDouble("borderSize", 0.0)));
        cz0.Zh(jSONObject0.optBoolean("interactValidate", false));
        cz0.SM(((float)jSONObject0.optDouble("fontSize", 0.0)));
        cz0.JQp(((float)jSONObject0.optDouble("paddingBottom", 0.0)));
        cz0.cz(((float)jSONObject0.optDouble("paddingLeft", 0.0)));
        cz0.XX(((float)jSONObject0.optDouble("paddingRight", 0.0)));
        cz0.Au(((float)jSONObject0.optDouble("paddingTop", 0.0)));
        cz0.cr(jSONObject0.optBoolean("lineFeed", false));
        cz0.SM(jSONObject0.optInt("lineCount", 0));
        cz0.cz(jSONObject0.optDouble("lineHeight", 1.2));
        cz0.fDm(jSONObject0.optInt("letterSpacing", 0));
        cz0.JQp(jSONObject0.optBoolean("isDataFixed", false));
        cz0.qla(jSONObject0.optInt("fontWeight"));
        cz0.cz(jSONObject0.optBoolean("lineLimit"));
        cz0.xE(jSONObject0.optInt("position"));
        cz0.ltE(jSONObject0.optString("align"));
        cz0.XX(jSONObject0.optBoolean("useLeft"));
        cz0.Au(jSONObject0.optBoolean("useRight"));
        cz0.SM(jSONObject0.optBoolean("useTop"));
        cz0.DWo(jSONObject0.optBoolean("useBottom"));
        cz0.Owx(jSONObject0.optString("data"));
        cz0.Zh(jSONObject0.optJSONObject("i18n"));
        cz0.xf(jSONObject0.optInt("marginLeft"));
        cz0.xs(jSONObject0.optInt("marginRight"));
        cz0.DWo(jSONObject0.optInt("marginTop"));
        cz0.qj(jSONObject0.optInt("marginBottom"));
        cz0.ub(jSONObject0.optInt("tagMaxCount"));
        cz0.qj(jSONObject0.optBoolean("allowTextFlow"));
        cz0.gK(jSONObject0.optInt("textFlowType"));
        cz0.ltE(jSONObject0.optInt("textFlowDuration"));
        cz0.Owx(jSONObject0.optInt("left"));
        cz0.RD(jSONObject0.optInt("right"));
        cz0.Sks(jSONObject0.optInt("top"));
        cz0.tT(jSONObject0.optInt("bottom"));
        cz0.RD(jSONObject0.optString("alignItems", "flex-start"));
        cz0.Sks(jSONObject0.optString("direction", ""));
        cz0.PjT(jSONObject0.optBoolean("loop", false));
        cz0.Lrd(jSONObject0.optInt("zIndex"));
        cz0.KM(jSONObject0.optInt("interactVisibleTime"));
        cz0.cRA(jSONObject0.optInt("interactHiddenTime"));
        cz0.xs(jSONObject0.optBoolean("interactEnableMask"));
        cz0.fDm(jSONObject0.optBoolean("interactWontHide"));
        cz0.PjT(jSONObject0.optString("bgGradient"));
        cz0.ZX(jSONObject0.optInt("areaType"));
        cz0.Jo(jSONObject0.optInt("interactSlideThreshold", 0));
        cz0.qZS(jSONObject0.optInt("interactBottomDistance", (cr.Zh() ? 0 : 120)));
        cz0.gK(jSONObject0.optBoolean("openPlayableLandingPage", false));
        cz0.ReZ(jSONObject0.optJSONObject("video"));
        cz0.cr(jSONObject0.optJSONObject("image"));
        cz0.Co(jSONObject0.optInt("borderShadowExtent"));
        cz0.qla(jSONObject0.optBoolean("bgGauseBlur"));
        cz0.wN(jSONObject0.optInt("bgGauseBlurRadius"));
        cz0.xE(jSONObject0.optBoolean("showTimeProgress", false));
        cz0.ub(jSONObject0.optBoolean("showPlayButton", false));
        cz0.PjT(jSONObject0.optDouble("bgColorCg", 0.0));
        cz0.cz(jSONObject0.optInt("bgMaterialCenterCalcColor", 0));
        cz0.Zh(jSONObject0.optInt("borderTopLeftRadius", 0));
        cz0.PjT(jSONObject0.optInt("borderTopRightRadius", 0));
        cz0.cr(jSONObject0.optInt("borderBottomLeftRadius", 0));
        cz0.ReZ(jSONObject0.optInt("borderBottomRightRadius", 0));
        cz0.JQp(jSONObject0.optJSONObject("interactI18n"));
        cz0.Lrd(jSONObject0.optString("imageObjectFit"));
        cz0.cRA(jSONObject0.optString("interactTitle"));
        cz0.Qf(jSONObject0.optInt("interactTextPositionTop"));
        cz0.tT(jSONObject0.optString("imageLottieTosPath"));
        cz0.xf(jSONObject0.optBoolean("animationsLoop"));
        cz0.yIW(jSONObject0.optInt("lottieAppNameMaxLength"));
        cz0.Yo(jSONObject0.optInt("lottieAdDescMaxLength"));
        cz0.iZZ(jSONObject0.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArray0 = jSONObject0.optJSONArray("animations");
            if(jSONArray0 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject2 = jSONArray0.getJSONObject(v);
                    PjT pjT0 = new PjT();
                    pjT0.ReZ(jSONObject2.optString("animationType"));
                    pjT0.PjT(jSONObject2.optDouble("animationDuration"));
                    pjT0.Zh(jSONObject2.optDouble("animationScaleX"));
                    pjT0.ReZ(jSONObject2.optDouble("animationScaleY"));
                    pjT0.cr(jSONObject2.optString("animationTimeFunction"));
                    pjT0.cr(jSONObject2.optDouble("animationDelay"));
                    pjT0.cz(jSONObject2.optInt("animationIterationCount"));
                    pjT0.JQp(jSONObject2.optString("animationDirection"));
                    pjT0.JQp(jSONObject2.optDouble("animationInterval"));
                    pjT0.PjT(jSONObject2.optInt("animationBorderWidth"));
                    pjT0.PjT(jSONObject2.optLong("key"));
                    pjT0.Zh(jSONObject2.optInt("animationEffectWidth"));
                    pjT0.ReZ(jSONObject2.optInt("animationSwing", 1));
                    pjT0.cr(jSONObject2.optInt("animationTranslateX"));
                    pjT0.JQp(jSONObject2.optInt("animationTranslateY"));
                    pjT0.Zh(jSONObject2.optString("animationRippleBackgroundColor"));
                    pjT0.PjT(jSONObject2.optString("animationScaleDirection"));
                    pjT0.XX(jSONObject2.optInt("animationFadeStart"));
                    pjT0.Au(jSONObject2.optInt("animationFadeEnd"));
                    pjT0.cz(jSONObject2.optString("animationFillMode"));
                    pjT0.SM(jSONObject2.optInt("animationBounceHeight"));
                    if(cz0.ltE() > 0.0) {
                        pjT0.cr(pjT0.fDm() + cz0.ltE());
                    }
                    arrayList0.add(pjT0);
                }
                cz0.PjT(arrayList0);
            }
            if(jSONObject0.has("triggerSlideMinDistance")) {
                cz0.yIW(jSONObject0.optString("triggerSlideDirection", "0"));
                cz0.PjT(jSONObject0.optLong("triggerSlideMinDistance", 0L));
            }
        }
        catch(Exception unused_ex) {
        }
        return cz0;
    }

    private void PjT(cz cz0, JSONObject jSONObject0) {
        if(cz0 != null && jSONObject0 != null) {
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                s.hashCode();
                switch(s) {
                    case "adType": {
                        cz0.Zh(jSONObject0.optString(s));
                        break;
                    }
                    case "align": {
                        cz0.ltE(jSONObject0.optString(s));
                        break;
                    }
                    case "alignItems": {
                        cz0.RD(jSONObject0.optString(s));
                        break;
                    }
                    case "allowTextFlow": {
                        cz0.qj(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "bgColor": {
                        cz0.cz(jSONObject0.optString(s));
                        break;
                    }
                    case "bgImgUrl": {
                        cz0.XX(jSONObject0.optString(s));
                        break;
                    }
                    case "borderColor": {
                        cz0.Au(jSONObject0.optString(s));
                        break;
                    }
                    case "borderRadius": {
                        cz0.PjT(((float)jSONObject0.optDouble(s)));
                        break;
                    }
                    case "borderSize": {
                        cz0.Zh(((float)jSONObject0.optDouble(s)));
                        break;
                    }
                    case "borderStyle": {
                        cz0.SM(jSONObject0.optString(s));
                        break;
                    }
                    case "bottom": {
                        cz0.tT(jSONObject0.optInt(s));
                        break;
                    }
                    case "clickArea": {
                        cz0.qla(jSONObject0.optString(s));
                        break;
                    }
                    case "clickTigger": {
                        cz0.xE(jSONObject0.optString(s));
                        break;
                    }
                    case "color": {
                        cz0.JQp(jSONObject0.optString(s));
                        break;
                    }
                    case "data": {
                        cz0.Owx(jSONObject0.optString(s));
                        break;
                    }
                    case "direction": {
                        cz0.Sks(jSONObject0.optString(s));
                        break;
                    }
                    case "fontFamily": {
                        cz0.ReZ(jSONObject0.optString(s));
                        break;
                    }
                    case "fontSize": {
                        cz0.SM(((float)jSONObject0.optDouble(s)));
                        break;
                    }
                    case "fontWeight": {
                        cz0.qla(jSONObject0.optInt(s));
                        break;
                    }
                    case "height": {
                        cz0.ReZ(((float)jSONObject0.optDouble(s)));
                        break;
                    }
                    case "heightMode": {
                        cz0.DWo(jSONObject0.optString(s));
                        break;
                    }
                    case "interactBgColor": {
                        cz0.xs(jSONObject0.optString(s));
                        break;
                    }
                    case "interactHiddenTime": {
                        cz0.cRA(jSONObject0.optInt(s));
                        break;
                    }
                    case "interactPosition": {
                        JSONObject jSONObject1 = jSONObject0.optJSONObject(s);
                        if(jSONObject1 == null) {
                            continue;
                        }
                        cz0.XX(jSONObject1.optInt("translateY", 0));
                        cz0.Au(jSONObject1.optInt("translateX", 0));
                        cz0.cr(jSONObject1.optDouble("scaleX", 0.0));
                        cz0.JQp(jSONObject1.optDouble("scaleY", 0.0));
                        break;
                    }
                    case "interactText": {
                        cz0.xf(jSONObject0.optString(s));
                        break;
                    }
                    case "interactType": {
                        cz0.fDm(jSONObject0.optString(s));
                        break;
                    }
                    case "interactValidate": {
                        cz0.Zh(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "interactVisibleTime": {
                        cz0.KM(jSONObject0.optInt(s));
                        break;
                    }
                    case "interactWontHide": {
                        cz0.fDm(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "isDataFixed": {
                        cz0.JQp(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "isShowBgControl": {
                        cz0.ReZ(jSONObject0.optBoolean(s, false));
                        break;
                    }
                    case "justifyHorizontal": {
                        cz0.ub(jSONObject0.optString(s));
                        break;
                    }
                    case "justifyVertical": {
                        cz0.gK(jSONObject0.optString(s));
                        break;
                    }
                    case "left": {
                        cz0.Owx(jSONObject0.optInt(s));
                        break;
                    }
                    case "letterSpacing": {
                        cz0.fDm(jSONObject0.optInt(s));
                        break;
                    }
                    case "lineCount": {
                        cz0.SM(jSONObject0.optInt(s));
                        break;
                    }
                    case "lineFeed": {
                        cz0.cr(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "lineHeight": {
                        cz0.cz(jSONObject0.optDouble(s));
                        break;
                    }
                    case "lineLimit": {
                        cz0.cz(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "loop": {
                        cz0.PjT(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "marginBottom": {
                        cz0.qj(jSONObject0.optInt(s));
                        break;
                    }
                    case "marginLeft": {
                        cz0.xf(jSONObject0.optInt(s));
                        break;
                    }
                    case "marginRight": {
                        cz0.xs(jSONObject0.optInt(s));
                        break;
                    }
                    case "marginTop": {
                        cz0.DWo(jSONObject0.optInt(s));
                        break;
                    }
                    case "openPlayableLandingPage": {
                        cz0.gK(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "paddingBottom": {
                        cz0.JQp(((float)jSONObject0.optDouble(s)));
                        break;
                    }
                    case "paddingLeft": {
                        cz0.cz(((float)jSONObject0.optDouble(s)));
                        break;
                    }
                    case "paddingRight": {
                        cz0.XX(((float)jSONObject0.optDouble(s)));
                        break;
                    }
                    case "paddingTop": {
                        cz0.Au(((float)jSONObject0.optDouble(s)));
                        break;
                    }
                    case "position": {
                        cz0.xE(jSONObject0.optInt(s));
                        break;
                    }
                    case "right": {
                        cz0.RD(jSONObject0.optInt(s));
                        break;
                    }
                    case "tagMaxCount": {
                        cz0.ub(jSONObject0.optInt(s));
                        break;
                    }
                    case "textAlign": {
                        cz0.cr(jSONObject0.optString(s));
                        break;
                    }
                    case "textFlowDuration": {
                        cz0.ltE(jSONObject0.optInt(s));
                        break;
                    }
                    case "textFlowType": {
                        cz0.gK(jSONObject0.optInt(s));
                        break;
                    }
                    case "timingEnd": {
                        cz0.ReZ(jSONObject0.optDouble(s));
                        break;
                    }
                    case "timingStart": {
                        cz0.Zh(jSONObject0.optDouble(s));
                        break;
                    }
                    case "top": {
                        cz0.Sks(jSONObject0.optInt(s));
                        break;
                    }
                    case "triggerSlideDirection": {
                        cz0.yIW(jSONObject0.optString(s));
                        break;
                    }
                    case "triggerSlideMinDistance": {
                        cz0.PjT(jSONObject0.optLong(s));
                        break;
                    }
                    case "useBottom": {
                        cz0.DWo(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "useLeft": {
                        cz0.XX(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "useRight": {
                        cz0.Au(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "useTop": {
                        cz0.SM(jSONObject0.optBoolean(s));
                        break;
                    }
                    case "width": {
                        cz0.cr(((float)jSONObject0.optDouble(s)));
                        break;
                    }
                    case "widthMode": {
                        cz0.qj(jSONObject0.optString(s));
                        break;
                    }
                    case "zIndex": {
                        cz0.Lrd(jSONObject0.optInt(s));
                    }
                }
            }
        }
    }

    public void PjT(double f) {
        this.jp = f;
    }

    public void PjT(float f) {
        this.PjT = f;
    }

    public void PjT(int v) {
        this.uvo = v;
    }

    public void PjT(long v) {
        this.RXa = v;
    }

    public void PjT(String s) {
        this.gH = s;
    }

    public void PjT(List list0) {
        this.fK = list0;
    }

    public void PjT(boolean z) {
        this.hN = z;
    }

    public boolean PjT() {
        return this.hN;
    }

    public boolean QB() {
        return this.Vs;
    }

    public String Qf() {
        return this.Lrd;
    }

    public void Qf(int v) {
        this.vSp = v;
    }

    public int Qtm() {
        return this.xi;
    }

    public String RD() {
        return this.qla;
    }

    public void RD(int v) {
        this.yks = v;
    }

    public void RD(String s) {
        this.Nv = s;
    }

    public int RV() {
        return this.Xtz;
    }

    public int ReZ() {
        return this.QB;
    }

    public void ReZ(double f) {
        this.xf = f;
    }

    public void ReZ(float f) {
        this.ReZ = f;
    }

    public void ReZ(int v) {
        this.pBJ = v;
    }

    public void ReZ(String s) {
        this.fDm = s;
    }

    public void ReZ(JSONObject jSONObject0) {
        this.dDm = jSONObject0;
    }

    public void ReZ(boolean z) {
        this.cRA = z;
    }

    public int SM() {
        return this.Lx;
    }

    public void SM(float f) {
        this.DWo = f;
    }

    public void SM(int v) {
        this.Zd = v;
    }

    public void SM(String s) {
        this.Owx = s;
    }

    public void SM(boolean z) {
        this.HG = z;
    }

    public String Sks() {
        return this.xE;
    }

    public void Sks(int v) {
        this.Xtz = v;
    }

    public void Sks(String s) {
        this.dIF = s;
    }

    public int UR() {
        return this.RV;
    }

    public int VY() {
        return this.Zd;
    }

    public boolean VZ() {
        return this.OL;
    }

    public boolean Vs() {
        return this.NR;
    }

    public String WHM() {
        return this.KLT;
    }

    public int Wo() {
        return this.KP;
    }

    public int XX() {
        return this.ZsT;
    }

    public void XX(float f) {
        this.Au = f;
    }

    public void XX(int v) {
        this.yIW = v;
    }

    public void XX(String s) {
        this.gK = s;
    }

    public void XX(boolean z) {
        this.cI = z;
    }

    public int Xe() {
        return this.MWx;
    }

    public int Xtz() {
        return this.xu;
    }

    public String Yo() {
        return this.Sks;
    }

    public void Yo(int v) {
        this.xi = v;
    }

    public void ZX(int v) {
        this.na = v;
    }

    public boolean ZX() {
        return this.cRA;
    }

    public String Zd() {
        return this.Qf;
    }

    public int Zh() {
        return this.uvo;
    }

    public void Zh(double f) {
        this.qj = f;
    }

    public void Zh(float f) {
        this.Zh = f;
    }

    public void Zh(int v) {
        this.QB = v;
    }

    public void Zh(String s) {
        this.xs = s;
    }

    public void Zh(JSONObject jSONObject0) {
        this.kFP = jSONObject0;
    }

    public void Zh(boolean z) {
        this.JQp = z;
    }

    public int ZsT() {
        return this.vSp;
    }

    public int cI() {
        return this.VY;
    }

    public String cRA() {
        return this.hx;
    }

    public void cRA(int v) {
        this.RV = v;
    }

    public void cRA(String s) {
        this.WHM = s;
    }

    public int cr() {
        return this.pBJ;
    }

    public void cr(double f) {
        this.Yo = f;
    }

    public void cr(float f) {
        this.cr = f;
    }

    public void cr(int v) {
        this.sjb = v;
    }

    public void cr(String s) {
        this.qla = s;
    }

    public void cr(JSONObject jSONObject0) {
        this.oMU = jSONObject0;
    }

    public void cr(boolean z) {
        this.qZS = z;
    }

    public JSONObject cz() {
        return this.fU;
    }

    public void cz(double f) {
        this.OMu = f;
    }

    public void cz(float f) {
        this.XX = f;
    }

    public void cz(int v) {
        this.Lx = v;
    }

    public void cz(String s) {
        this.ub = s;
    }

    public void cz(boolean z) {
        this.dwk = z;
    }

    public boolean dDm() {
        return this.Gr;
    }

    public boolean dG() {
        return this.jK;
    }

    public int dIF() {
        return this.zYH;
    }

    public int dwk() {
        return this.kph;
    }

    public boolean fA() {
        return this.HG;
    }

    public float fDm() {
        return this.cz;
    }

    public void fDm(int v) {
        this.VY = v;
    }

    public void fDm(String s) {
        this.Qf = s;
    }

    public void fDm(boolean z) {
        this.Gr = z;
    }

    public String fK() {
        return this.Nv;
    }

    public int fU() {
        return this.na;
    }

    public float gK() {
        return this.DWo;
    }

    public void gK(int v) {
        this.fA = v;
    }

    public void gK(String s) {
        this.wN = s;
    }

    public void gK(boolean z) {
        this.OL = z;
    }

    public String hLk() {
        return this.kWj;
    }

    public int hN() {
        return this.wKV;
    }

    private void iZZ(String s) {
        this.hx = s;
    }

    public String iZZ() {
        return this.RD;
    }

    public void iZZ(int v) {
        this.Lmo = v;
    }

    public String ig() {
        return this.ZX;
    }

    public boolean ix() {
        return this.CY;
    }

    public int jK() {
        return this.Lmo;
    }

    public int jp() {
        return this.xR;
    }

    public String kFP() {
        return this.Ld;
    }

    public List kWj() {
        return this.fK;
    }

    public String kph() {
        return this.Co;
    }

    public double ltE() {
        return this.qj;
    }

    public void ltE(int v) {
        this.zYH = v;
    }

    public void ltE(String s) {
        this.Ld = s;
    }

    public String na() {
        return this.dIF;
    }

    public boolean oG() {
        return this.tY;
    }

    public String oMU() {
        return this.dG;
    }

    public int pBJ() {
        return this.CD;
    }

    public double qZS() {
        return this.KM;
    }

    public void qZS(int v) {
        this.Qtm = v;
    }

    public float qj() {
        return this.PjT;
    }

    public void qj(int v) {
        this.rds = v;
    }

    public void qj(String s) {
        this.Sks = s;
    }

    public void qj(boolean z) {
        this.CY = z;
    }

    public float qla() {
        return this.XX;
    }

    public void qla(int v) {
        this.xH = v;
    }

    public void qla(String s) {
        this.ZX = s;
    }

    public void qla(boolean z) {
        this.Vs = z;
    }

    public String rds() {
        return this.Jo;
    }

    public boolean sjb() {
        return this.Wo;
    }

    public String tT() {
        return this.ub;
    }

    public void tT(int v) {
        this.ix = v;
    }

    public void tT(String s) {
        this.VZ = s;
    }

    public int tY() {
        return this.ig;
    }

    public int uQg() {
        return this.yks;
    }

    public float ub() {
        return this.SM;
    }

    public void ub(int v) {
        this.xu = v;
    }

    public void ub(String s) {
        this.Co = s;
    }

    public void ub(boolean z) {
        this.jK = z;
    }

    public int uvo() {
        return this.UR;
    }

    public int vSp() {
        return this.Qtm;
    }

    public String wKV() {
        return this.Xe;
    }

    public double wN() {
        return this.Yo;
    }

    public void wN(int v) {
        this.CD = v;
    }

    public float xE() {
        return this.Au;
    }

    public void xE(int v) {
        this.MWx = v;
    }

    public void xE(String s) {
        this.Jo = s;
    }

    public void xE(boolean z) {
        this.Wo = z;
    }

    public int xH() {
        return this.rds;
    }

    public int xR() {
        return this.ix;
    }

    public float xf() {
        return this.Zh;
    }

    public void xf(int v) {
        this.kph = v;
    }

    public void xf(String s) {
        this.tT = s;
    }

    public void xf(boolean z) {
        this.NR = z;
    }

    public void xi() {
        this.PjT(this, this.oMU);
    }

    public void xs(int v) {
        this.IJ = v;
    }

    public void xs(String s) {
        this.Lrd = s;
    }

    public void xs(boolean z) {
        this.hLk = z;
    }

    public boolean xs() {
        return this.JQp;
    }

    public boolean xu() {
        return this.cI;
    }

    public String yIW() {
        return this.ltE;
    }

    public void yIW(int v) {
        this.KP = v;
    }

    public void yIW(String s) {
        this.KLT = s;
    }

    public JSONObject yks() {
        return this.kFP;
    }

    public boolean zYH() {
        return this.zZ;
    }

    public boolean zZ() {
        return this.dwk;
    }
}

