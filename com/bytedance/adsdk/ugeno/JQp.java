package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.ReZ.PjT;
import com.bytedance.adsdk.ugeno.core.ReZ;
import com.bytedance.adsdk.ugeno.cr.Au;
import com.bytedance.adsdk.ugeno.cr.DWo;
import com.bytedance.adsdk.ugeno.cr.cr;
import java.util.ArrayList;
import java.util.List;

public class JQp {
    private PjT JQp;
    private static volatile JQp PjT;
    private ReZ ReZ;
    private com.bytedance.adsdk.ugeno.core.PjT.PjT XX;
    private List Zh;
    private com.bytedance.adsdk.ugeno.PjT cr;
    private com.bytedance.adsdk.ugeno.core.Zh.ReZ cz;

    static {
    }

    public com.bytedance.adsdk.ugeno.core.PjT.PjT JQp() {
        return this.XX;
    }

    public static JQp PjT() {
        if(JQp.PjT == null) {
            Class class0 = JQp.class;
            __monitor_enter(class0);
            try {
                if(JQp.PjT == null) {
                    JQp.PjT = new JQp();
                }
                __monitor_exit(class0);
                return JQp.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return JQp.PjT;
    }

    public void PjT(Context context0, ReZ reZ0, com.bytedance.adsdk.ugeno.PjT pjT0) {
        this.ReZ = reZ0;
        this.cr = pjT0;
        this.cz();
    }

    public void PjT(PjT pjT0) {
        this.JQp = pjT0;
    }

    public void PjT(Au au0) {
        ArrayList arrayList0 = new ArrayList(new com.bytedance.adsdk.ugeno.cr.PjT().PjT());
        if(au0 != null) {
            arrayList0.addAll(au0.PjT());
        }
        DWo.PjT(arrayList0);
    }

    public void PjT(com.bytedance.adsdk.ugeno.cr.ReZ reZ0) {
        ArrayList arrayList0 = new ArrayList(new com.bytedance.adsdk.ugeno.cr.JQp().PjT());
        if(reZ0 != null) {
            arrayList0.addAll(reZ0.PjT());
        }
        cr.PjT(arrayList0);
    }

    public PjT ReZ() {
        return this.JQp;
    }

    public com.bytedance.adsdk.ugeno.PjT Zh() {
        return this.cr;
    }

    public com.bytedance.adsdk.ugeno.core.Zh.ReZ cr() {
        return this.cz;
    }

    private void cz() {
        ArrayList arrayList0 = new ArrayList();
        this.Zh = arrayList0;
        ReZ reZ0 = this.ReZ;
        if(reZ0 != null) {
            arrayList0.addAll(reZ0.PjT());
        }
        com.bytedance.adsdk.ugeno.core.cr.PjT(this.Zh);
    }
}

