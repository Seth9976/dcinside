package com.bytedance.sdk.openadsdk.qla.PjT;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.Zh.PjT.fDm.PjT;
import com.bytedance.sdk.component.Zh.PjT.fDm;

public class JQp {
    private boolean Au;
    private int DWo;
    private long JQp;
    public static int PjT = -10;
    private String ReZ;
    private String SM;
    private int XX;
    private final int Zh;
    private long cr;
    private int cz;

    static {
    }

    public JQp(int v) {
        this.Zh = v;
    }

    public JQp PjT(int v) {
        this.DWo = v;
        return this;
    }

    public JQp PjT(fDm fDm0) {
        if(fDm0 != null) {
            if(fDm0.cz == PjT.PjT && !TextUtils.isEmpty(fDm0.PjT())) {
                this.cz = fDm0.PjT().getBytes().length;
            }
            if(fDm0.cz == PjT.Zh) {
                byte[] arr_b = fDm0.JQp;
                if(arr_b != null) {
                    this.cz = arr_b.length;
                }
            }
        }
        return this;
    }

    public JQp PjT(String s) {
        this.ReZ = s;
        return this;
    }

    public JQp PjT(boolean z) {
        this.Au = z;
        return this;
    }

    public void PjT() {
        this.cr = SystemClock.elapsedRealtime();
    }

    public static void ReZ() {
    }

    public JQp ReZ(String s) {
        if(!TextUtils.isEmpty(s)) {
            byte[] arr_b = s.getBytes();
            if(arr_b != null) {
                this.XX = arr_b.length;
            }
        }
        return this;
    }

    public JQp Zh(String s) {
        if(!TextUtils.isEmpty(s)) {
            byte[] arr_b = s.getBytes();
            if(arr_b != null) {
                this.cz = arr_b.length;
            }
        }
        return this;
    }

    public void Zh() {
        this.JQp = SystemClock.elapsedRealtime() - this.cr;
    }

    public JQp cr(String s) {
        this.SM = s;
        return this;
    }
}

