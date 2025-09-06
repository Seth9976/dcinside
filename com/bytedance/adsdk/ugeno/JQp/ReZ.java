package com.bytedance.adsdk.ugeno.JQp;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class ReZ {
    int Au;
    float DWo;
    int JQp;
    int PjT;
    int ReZ;
    int SM;
    int XX;
    int Zh;
    int cr;
    int cz;
    List fDm;
    boolean gK;
    float qj;
    int qla;
    boolean ub;
    int xE;
    int xf;
    int xs;

    ReZ() {
        this.PjT = 0x7FFFFFFF;
        this.Zh = 0x7FFFFFFF;
        this.ReZ = 0x80000000;
        this.cr = 0x80000000;
        this.fDm = new ArrayList();
    }

    public int PjT() {
        return this.XX;
    }

    void PjT(View view0, int v, int v1, int v2, int v3) {
        Zh zh0 = (Zh)view0.getLayoutParams();
        this.PjT = Math.min(this.PjT, view0.getLeft() - zh0.xs() - v);
        this.Zh = Math.min(this.Zh, view0.getTop() - zh0.fDm() - v1);
        this.ReZ = Math.max(this.ReZ, view0.getRight() + zh0.qla() + v2);
        this.cr = Math.max(this.cr, view0.getBottom() + zh0.xE() + v3);
    }

    public int Zh() {
        return this.Au - this.SM;
    }
}

