package com.bytedance.sdk.component.cz.PjT.cz;

import android.text.TextUtils;
import java.util.Map;

public class cr {
    private String Au;
    private String DWo;
    private final int JQp;
    private final String PjT;
    private final boolean ReZ;
    private int SM;
    private String XX;
    private final String Zh;
    private int cr;
    private final String cz;
    private boolean qj;

    cr(String s, String s1, boolean z, int v, String s2) {
        this.cr = -1;
        this.SM = 0;
        this.DWo = null;
        this.PjT = s;
        this.Zh = s1;
        this.ReZ = z;
        this.JQp = v;
        this.cz = s2;
    }

    public int Au() {
        return this.SM;
    }

    public boolean DWo() {
        return this.qj;
    }

    public int JQp() {
        return this.JQp;
    }

    public Runnable PjT(String s, Map map0) {
        return PjT.PjT().PjT(this, s, map0);
    }

    public String PjT() {
        return this.PjT;
    }

    public void PjT(int v) {
        this.cr = v;
    }

    public void PjT(String s) {
        this.XX = s;
    }

    public void PjT(boolean z) {
        this.qj = z;
    }

    public void ReZ(String s) {
        this.DWo = s;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(TextUtils.isEmpty(this.Au)) {
            this.Au = String.valueOf(this.DWo);
            return;
        }
        this.Au = this.Au + "," + this.DWo;
    }

    public boolean ReZ() {
        return this.ReZ;
    }

    public String SM() {
        return this.Au;
    }

    public String XX() {
        return this.XX;
    }

    public String Zh() {
        return this.Zh;
    }

    public void Zh(int v) {
        this.SM = v;
        if(v == 0) {
            return;
        }
        if(TextUtils.isEmpty(this.XX)) {
            this.XX = String.valueOf(this.SM);
            return;
        }
        this.XX = this.XX + "," + this.SM;
    }

    public void Zh(String s) {
        this.Au = s;
    }

    public int cr() {
        return this.cr;
    }

    public String cz() {
        return this.cz;
    }

    public boolean qj() {
        return this.cr == -1;
    }
}

