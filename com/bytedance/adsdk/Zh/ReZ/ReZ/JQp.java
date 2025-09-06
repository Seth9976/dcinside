package com.bytedance.adsdk.Zh.ReZ.ReZ;

import com.bytedance.adsdk.Zh.JQp.DWo;
import com.bytedance.adsdk.Zh.ReZ.PjT.qj;
import com.bytedance.adsdk.Zh.ReZ.PjT.xf;
import com.bytedance.adsdk.Zh.XX;
import java.util.List;
import java.util.Locale;

public class JQp {
    public static enum PjT {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN;

    }

    public static enum Zh {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN;

    }

    private final List Au;
    private final int DWo;
    private final PjT JQp;
    private final DWo Lrd;
    private final List Owx;
    private final List PjT;
    private final Zh RD;
    private final String ReZ;
    private final xf SM;
    private final boolean Sks;
    private final String XX;
    private final XX Zh;
    private final long cr;
    private final long cz;
    private final float fDm;
    private final qj gK;
    private final com.bytedance.adsdk.Zh.ReZ.PjT.Zh ltE;
    private final int qj;
    private final float qla;
    private final com.bytedance.adsdk.Zh.ReZ.Zh.PjT tT;
    private final com.bytedance.adsdk.Zh.ReZ.PjT.DWo ub;
    private final float xE;
    private final int xf;
    private final float xs;

    public JQp(List list0, XX xX0, String s, long v, PjT jQp$PjT0, long v1, String s1, List list1, xf xf0, int v2, int v3, int v4, float f, float f1, float f2, float f3, com.bytedance.adsdk.Zh.ReZ.PjT.DWo dWo0, qj qj0, List list2, Zh jQp$Zh0, com.bytedance.adsdk.Zh.ReZ.PjT.Zh zh0, boolean z, com.bytedance.adsdk.Zh.ReZ.Zh.PjT pjT0, DWo dWo1) {
        this.PjT = list0;
        this.Zh = xX0;
        this.ReZ = s;
        this.cr = v;
        this.JQp = jQp$PjT0;
        this.cz = v1;
        this.XX = s1;
        this.Au = list1;
        this.SM = xf0;
        this.DWo = v2;
        this.qj = v3;
        this.xf = v4;
        this.xs = f;
        this.fDm = f1;
        this.qla = f2;
        this.xE = f3;
        this.ub = dWo0;
        this.gK = qj0;
        this.Owx = list2;
        this.RD = jQp$Zh0;
        this.ltE = zh0;
        this.Sks = z;
        this.tT = pjT0;
        this.Lrd = dWo1;
    }

    float Au() {
        return this.qla;
    }

    List DWo() {
        return this.Au;
    }

    public long JQp() {
        return this.cr;
    }

    public DWo Lrd() {
        return this.Lrd;
    }

    qj Owx() {
        return this.gK;
    }

    XX PjT() {
        return this.Zh;
    }

    public String PjT(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        stringBuilder0.append(this.cz());
        stringBuilder0.append("\n");
        JQp jQp0 = this.Zh.PjT(this.xs());
        if(jQp0 != null) {
            stringBuilder0.append("\t\tParents: ");
            stringBuilder0.append(jQp0.cz());
            for(JQp jQp1 = this.Zh.PjT(jQp0.xs()); jQp1 != null; jQp1 = this.Zh.PjT(jQp1.xs())) {
                stringBuilder0.append("->");
                stringBuilder0.append(jQp1.cz());
            }
            stringBuilder0.append(s);
            stringBuilder0.append("\n");
        }
        if(!this.DWo().isEmpty()) {
            stringBuilder0.append(s);
            stringBuilder0.append("\tMasks: ");
            stringBuilder0.append(this.DWo().size());
            stringBuilder0.append("\n");
        }
        if(this.gK() != 0 && this.ub() != 0) {
            stringBuilder0.append(s);
            stringBuilder0.append("\tBackground: ");
            stringBuilder0.append(String.format(Locale.US, "%dx%d %X\n", this.gK(), this.ub(), this.xE()));
        }
        if(!this.PjT.isEmpty()) {
            stringBuilder0.append(s);
            stringBuilder0.append("\tShapes:\n");
            for(Object object0: this.PjT) {
                stringBuilder0.append(s);
                stringBuilder0.append("\t\t");
                stringBuilder0.append(object0);
                stringBuilder0.append("\n");
            }
        }
        return stringBuilder0.toString();
    }

    com.bytedance.adsdk.Zh.ReZ.PjT.Zh RD() {
        return this.ltE;
    }

    float ReZ() {
        return this.fDm / this.Zh.ub();
    }

    float SM() {
        return this.xE;
    }

    public boolean Sks() {
        return this.Sks;
    }

    public String XX() {
        return this.XX;
    }

    float Zh() {
        return this.xs;
    }

    List cr() {
        return this.Owx;
    }

    public String cz() {
        return this.ReZ;
    }

    List fDm() {
        return this.PjT;
    }

    int gK() {
        return this.DWo;
    }

    com.bytedance.adsdk.Zh.ReZ.PjT.DWo ltE() {
        return this.ub;
    }

    public PjT qj() {
        return this.JQp;
    }

    xf qla() {
        return this.SM;
    }

    public com.bytedance.adsdk.Zh.ReZ.Zh.PjT tT() {
        return this.tT;
    }

    @Override
    public String toString() {
        return this.PjT("");
    }

    int ub() {
        return this.qj;
    }

    int xE() {
        return this.xf;
    }

    Zh xf() {
        return this.RD;
    }

    long xs() {
        return this.cz;
    }
}

