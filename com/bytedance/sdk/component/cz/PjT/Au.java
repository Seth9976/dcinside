package com.bytedance.sdk.component.cz.PjT;

import android.content.Context;
import com.bytedance.sdk.component.cz.PjT.JQp.PjT;
import com.bytedance.sdk.component.cz.PjT.JQp.Zh;
import com.bytedance.sdk.component.cz.PjT.Zh.ReZ;
import com.bytedance.sdk.component.cz.PjT.Zh.cr;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class Au {
    private volatile boolean Au;
    private static volatile PjT DWo;
    private volatile com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT JQp;
    private volatile Context PjT;
    private volatile com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT ReZ;
    private volatile JQp SM;
    private volatile com.bytedance.sdk.component.cz.PjT.PjT.JQp XX;
    private volatile com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT Zh;
    private volatile com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT cr;
    private volatile com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT cz;
    private final AtomicBoolean fDm;
    private volatile ReZ qj;
    private long qla;
    private volatile Map xf;
    private static Au xs;

    private Au() {
        this.fDm = new AtomicBoolean(false);
    }

    public ReZ Au() {
        return this.qj;
    }

    public com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT DWo() {
        return this.cz;
    }

    public static PjT JQp() {
        if(Au.DWo == null) {
            Class class0 = Au.class;
            __monitor_enter(class0);
            try {
                if(Au.DWo == null) {
                    Au.DWo = new Zh();
                }
                __monitor_exit(class0);
                return Au.DWo;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return Au.DWo;
    }

    public void JQp(com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT pjT0) {
        this.JQp = pjT0;
    }

    public void PjT(long v) {
        this.qla = v;
    }

    public void PjT(Context context0) {
        this.PjT = context0;
    }

    public void PjT(JQp jQp0) {
        this.SM = jQp0;
    }

    public void PjT(com.bytedance.sdk.component.cz.PjT.PjT.JQp jQp0) {
        this.XX = jQp0;
    }

    public void PjT(ReZ reZ0) {
        this.qj = reZ0;
    }

    public void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        if(pjT0 == null) {
            return;
        }
        pjT0.PjT(System.currentTimeMillis());
        int v = pjT0.cr();
        cr.PjT.PjT(pjT0, v);
    }

    public void PjT(com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT pjT0) {
        this.cz = pjT0;
    }

    public void PjT(String s, List list0, boolean z, Map map0, int v, String s1) {
        com.bytedance.sdk.component.cz.PjT.cz.PjT.PjT().PjT(s, list0, z, map0, v, s1);
    }

    public void PjT(String s, boolean z) {
        com.bytedance.sdk.component.cz.PjT.cz.PjT.PjT().PjT(s, z);
    }

    public void PjT(boolean z) {
        this.fDm.set(z);
    }

    public boolean PjT() {
        return this.fDm.get();
    }

    public Map ReZ() {
        return this.xf;
    }

    public void ReZ(com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT pjT0) {
        this.ReZ = pjT0;
    }

    public void SM() {
        cr.PjT.Zh();
    }

    public static Au XX() {
        synchronized(Au.class) {
            if(Au.xs == null) {
                Au.xs = new Au();
            }
            return Au.xs;
        }
    }

    public void Zh(com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT pjT0) {
        this.Zh = pjT0;
    }

    public void Zh(boolean z) {
        this.Au = z;
    }

    public boolean Zh() {
        return this.Au;
    }

    public com.bytedance.sdk.component.cz.PjT.PjT.JQp cr() {
        return this.XX;
    }

    public void cr(com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT pjT0) {
        this.cr = pjT0;
    }

    public Context cz() {
        return this.PjT;
    }

    public com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT fDm() {
        return this.cr;
    }

    public void qj() {
        cr.PjT.ReZ();
    }

    public com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT qla() {
        return this.JQp;
    }

    public long ub() {
        return this.qla * 86400000L;
    }

    public JQp xE() {
        return this.SM;
    }

    public com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT xf() {
        return this.Zh;
    }

    public com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT xs() {
        return this.ReZ;
    }
}

