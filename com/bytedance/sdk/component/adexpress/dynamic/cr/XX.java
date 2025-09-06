package com.bytedance.sdk.component.adexpress.dynamic.cr;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.JQp.qj;
import org.json.JSONObject;

public class XX {
    private JQp JQp;
    public int PjT;
    public JSONObject ReZ;
    public String Zh;
    private cz cr;
    private String cz;

    public XX(JQp jQp0) {
        this.JQp = jQp0;
        this.PjT = jQp0.PjT();
        this.Zh = jQp0.ReZ();
        this.ReZ = jQp0.JQp().yks();
        this.cz = jQp0.cr();
        this.cr = cr.ReZ() == 1 ? jQp0.XX() : jQp0.JQp();
        if(cr.Zh()) {
            this.cr = jQp0.JQp();
        }
    }

    public int Au() {
        String s = this.cr.RD();
        if("left".equals(s)) {
            return 17;
        }
        if("center".equals(s)) {
            return 4;
        }
        return "right".equals(s) ? 3 : 2;
    }

    public int CY() {
        return this.cr.Co();
    }

    public int Co() {
        return this.cr.cr();
    }

    public String DWo() {
        return this.PjT == 2 || this.PjT == 13 ? this.Zh : "";
    }

    public String HG() {
        return this.cr.hLk();
    }

    public String IJ() {
        return this.cr.Zd();
    }

    public float JQp() {
        return this.cr.gK();
    }

    public int Jo() {
        return this.cr.JQp();
    }

    public double KM() {
        return this.cr.Au();
    }

    public boolean Ld() {
        return this.cr.dDm();
    }

    public String Lrd() {
        return this.cr.ig();
    }

    public int MWx() {
        return this.cr.UR();
    }

    public int Nv() {
        return this.cr.Qtm();
    }

    public boolean OMu() {
        return this.cr.OL();
    }

    public boolean Owx() {
        return this.cr.QB();
    }

    public static int PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return 0xFF000000;
        }
        if(s.equals("transparent")) {
            return 0;
        }
        if(s.charAt(0) == 35 && s.length() == 7) {
            return Color.parseColor(s);
        }
        if(s.charAt(0) == 35 && s.length() == 9) {
            return Color.parseColor(s);
        }
        if(!s.startsWith("rgba")) {
            return 0xFF000000;
        }
        String[] arr_s = s.substring(s.indexOf("(") + 1, s.indexOf(")")).split(",");
        if(arr_s == null) {
            return 0xFF000000;
        }
        else {
            try {
                if(arr_s.length == 4) {
                    float f = Float.parseFloat(arr_s[0]);
                    float f1 = Float.parseFloat(arr_s[1]);
                    float f2 = Float.parseFloat(arr_s[2]);
                    return ((int)(Float.parseFloat(arr_s[3]) * 255.0f + 0.5f)) << 24 | ((int)f) << 16 | ((int)f1) << 8 | ((int)f2);
                }
                return 0xFF000000;
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return 0;
    }

    public int PjT() {
        return (int)this.cr.fDm();
    }

    public void PjT(float f) {
        this.cr.PjT(f);
    }

    public boolean PjT(int v) {
        JQp jQp0 = this.JQp;
        if(jQp0 == null) {
            return false;
        }
        if(v == 1) {
            this.cr = jQp0.XX();
            return this.cr != null;
        }
        this.cr = jQp0.JQp();
        return this.cr != null;
    }

    public int Qf() {
        return this.cr.ReZ();
    }

    public String RD() {
        return this.cr.Lrd();
    }

    public String RV() {
        return this.cr.cRA();
    }

    public int ReZ() {
        return (int)this.cr.qla();
    }

    public int SM() {
        int v = this.Au();
        if(v == 4) {
            return 17;
        }
        return v == 3 ? 0x800005 : 0x800003;
    }

    public boolean Sks() {
        return this.cr.OMu();
    }

    public int VY() {
        return this.cr.XX();
    }

    public int XX() {
        return XX.PjT(this.cr.Sks());
    }

    public boolean Xe() {
        return this.cr.ZX();
    }

    public String Xtz() {
        return this.cr.CD();
    }

    public int Yo() {
        return XX.PjT(this.cr.tT());
    }

    public int ZX() {
        return this.cr.Zh();
    }

    public String Zd() {
        return this.cr.rds();
    }

    public static float[] Zh(String s) {
        String[] arr_s = s.substring(s.indexOf("(") + 1, s.indexOf(")")).split(",");
        return arr_s == null || arr_s.length != 4 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(arr_s[0]), Float.parseFloat(arr_s[1]), Float.parseFloat(arr_s[2]), Float.parseFloat(arr_s[3])};
    }

    public int Zh() {
        return (int)this.cr.ub();
    }

    public String cI() {
        return this.cr.KM();
    }

    public String cRA() {
        return this.cr.WHM();
    }

    public int cr() {
        return (int)this.cr.xE();
    }

    public String cz() {
        if(this.PjT == 0) {
            return TextUtils.isEmpty(this.Zh) ? this.ReZ.optString("") : this.Zh;
        }
        return "";
    }

    public int dIF() {
        return this.cr.jK();
    }

    public int dwk() {
        return this.cr.jp();
    }

    public double fA() {
        return this.cr.wN();
    }

    public double fDm() {
        return this.cr.ltE();
    }

    // 去混淆评级： 中等(50)
    private boolean fK() {
        return cr.Zh() ? false : !TextUtils.isEmpty(this.Zh) && this.Zh.contains("adx:") || qj.Zh();
    }

    public int gK() {
        return this.cr.uvo();
    }

    public int hN() {
        return this.cr.Wo();
    }

    public int iZZ() {
        String s = this.cr.ig();
        if(!"skip-with-time-skip-btn".equals(this.JQp.Zh()) && !"skip".equals(this.JQp.Zh()) && !TextUtils.equals("skip-with-countdowns-skip-btn", this.JQp.Zh())) {
            if(!"skip-with-time-countdown".equals(this.JQp.Zh()) && !"skip-with-time".equals(this.JQp.Zh())) {
                if(this.PjT == 10 && TextUtils.equals(this.cr.rds(), "click")) {
                    return 5;
                }
                if(this.xR() && this.fK()) {
                    return 0;
                }
                if(this.xR()) {
                    return 7;
                }
                if("feedback-dislike".equals(this.JQp.Zh())) {
                    return 3;
                }
                if(!TextUtils.isEmpty(s) && !s.equals("none")) {
                    if(!s.equals("video") && (this.JQp.PjT() != 7 || !TextUtils.equals(s, "normal"))) {
                        if(s.equals("normal")) {
                            return 1;
                        }
                        if(s.equals("creative")) {
                            return 2;
                        }
                        return "slide".equals(this.cr.rds()) ? 2 : 0;
                    }
                    return !cr.Zh() || this.JQp.JQp() == null || !this.JQp.JQp().dG() ? 4 : 11;
                }
            }
            return 0;
        }
        return 6;
    }

    public boolean ig() {
        return this.cr.ix();
    }

    public boolean ix() {
        return this.cr.Vs();
    }

    public String kFP() {
        return this.cr.Qf();
    }

    public int kph() {
        return this.cr.Nv();
    }

    public int ltE() {
        return this.cr.pBJ();
    }

    public String oG() {
        return this.cr.oMU();
    }

    public String qZS() {
        return this.cr.DWo();
    }

    public String qj() {
        return this.PjT == 1 ? this.Zh : "";
    }

    public float qla() {
        return this.cr.qj();
    }

    public int rds() {
        return this.cr.dIF();
    }

    public int tT() {
        return this.cr.VY();
    }

    public int tY() {
        return this.cr.Lx();
    }

    public boolean uQg() {
        return this.cr.dDm();
    }

    public float ub() {
        return this.cr.xf();
    }

    public int wKV() {
        return this.cr.ZsT();
    }

    public int wN() {
        return this.cr.SM();
    }

    public int xE() {
        return XX.PjT(this.cr.yIW());
    }

    public int xH() {
        return this.cr.vSp();
    }

    // 去混淆评级： 中等(70)
    private boolean xR() {
        return !cr.Zh() || !this.JQp.Zh().contains("logo-union") && !this.JQp.Zh().contains("logounion") && !this.JQp.Zh().contains("logoad") ? "logo-union".equals(this.JQp.Zh()) || "logounion".equals(this.JQp.Zh()) || "logoad".equals(this.JQp.Zh()) : true;
    }

    public String xf() {
        return this.cz;
    }

    public double xs() {
        if(this.PjT == 11) {
            try {
                double f = Double.parseDouble(this.Zh);
                return !cr.Zh() ? ((double)(((int)f))) : f;
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return -1.0;
    }

    public int xu() {
        return this.cr.Jo();
    }

    public long yIW() {
        return this.cr.KLT();
    }

    public String yks() {
        return this.cr.KP();
    }

    public double zYH() {
        return this.cr.qZS();
    }

    public boolean zZ() {
        return this.cr.xs();
    }
}

