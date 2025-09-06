package com.bytedance.sdk.openadsdk.qla.PjT;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.wN;

public class Zh {
    private int Au;
    private boolean JQp;
    private String PjT;
    private String ReZ;
    private int SM;
    private int XX;
    private Owx Zh;
    private int cr;
    private String cz;

    public Zh() {
        this.Au = 0;
        this.SM = 0;
    }

    public int Au() {
        return this.Au;
    }

    public boolean JQp() {
        return this.JQp;
    }

    public String PjT() {
        return this.PjT;
    }

    public void PjT(int v) {
        this.cr = v;
    }

    public void PjT(Owx owx0) {
        this.Zh = owx0;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public void PjT(boolean z) {
        this.JQp = z;
    }

    public String ReZ() {
        if(TextUtils.isEmpty(this.ReZ)) {
            Owx owx0 = this.Zh;
            if(owx0 != null) {
                this.ReZ = wN.PjT(owx0);
            }
        }
        return this.ReZ;
    }

    public void ReZ(int v) {
        this.Au = v;
    }

    public void ReZ(String s) {
        this.cz = s;
    }

    public int SM() {
        return this.SM;
    }

    public int XX() {
        return this.XX;
    }

    public Owx Zh() {
        return this.Zh;
    }

    public void Zh(int v) {
        this.XX = v;
    }

    public void Zh(String s) {
        this.ReZ = s;
    }

    public int cr() {
        return this.cr;
    }

    public void cr(int v) {
        this.SM = v;
    }

    public String cz() {
        return this.cz;
    }
}

