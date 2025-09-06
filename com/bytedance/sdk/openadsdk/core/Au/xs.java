package com.bytedance.sdk.openadsdk.core.Au;

import com.bytedance.adsdk.ugeno.core.fDm;
import com.bytedance.adsdk.ugeno.core.qla;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.adexpress.Zh.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.cr.JQp;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class xs implements qla, SM {
    private long JQp;
    private final JQp PjT;
    private final Owx ReZ;
    private final String Zh;
    private final String cr;

    public xs(JQp jQp0, String s, Owx owx0, String s1) {
        this.PjT = jQp0;
        this.Zh = s;
        this.cr = s1;
        this.ReZ = owx0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void Au() {
        this.PjT.fDm();
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void DWo() {
        this.PjT.Zh();
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void JQp() {
        this.PjT.Zh();
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void JQp(int v) {
        if(v == 3) {
            this.PjT.cr("dynamic_sub_render2_end");
            return;
        }
        this.PjT.cr("dynamic_sub_render_end");
    }

    @Override  // com.bytedance.adsdk.ugeno.core.qla
    public void PjT() {
        this.PjT.JQp("ugen_render_start");
        this.PjT.JQp("ugen_sub_analysis_start");
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void PjT(int v) {
        this.JQp = System.currentTimeMillis();
        if(v == 3) {
            this.PjT.ReZ("dynamic_render2_start");
            return;
        }
        this.PjT.ReZ("dynamic_render_start");
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void PjT(int v, int v1, String s, boolean z) {
        if(!z) {
            this.PjT.PjT(true);
        }
        if(v == 3) {
            this.PjT.Zh(v1, "dynamic_render2_error");
        }
        else {
            this.PjT.Zh(v1, "dynamic_render_error");
        }
        qj.PjT("NDR", v1, s, this.Zh, this.cr, this.ReZ);
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void PjT(int v, String s) {
        this.PjT.PjT(v, s);
        qj.PjT("Web", v, s, this.Zh, this.cr, this.ReZ);
    }

    @Override  // com.bytedance.adsdk.ugeno.core.qla
    public void PjT(fDm fDm0) {
        if(fDm0.PjT() == 0) {
            this.PjT.JQp("ugen_sub_render_end");
            this.PjT.cz("ugen_render_success");
        }
        else {
            this.PjT.ReZ(fDm0.PjT(), "ugen_render_error");
            qj.PjT("UGen", fDm0.PjT(), fDm0.Zh(), this.Zh, this.cr, this.ReZ);
        }
        this.PjT.PjT(true);
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void PjT(boolean z) {
        this.PjT.PjT(((int)z));
    }

    @Override  // com.bytedance.adsdk.ugeno.core.qla
    public void ReZ() {
        this.PjT.JQp("ugen_sub_render_start");
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void ReZ(int v) {
        if(v == 3) {
            this.PjT.cr("dynamic_sub_analysis2_end");
            return;
        }
        this.PjT.cr("dynamic_sub_analysis_end");
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void SM() {
        this.PjT.qla();
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void XX() {
        this.PjT.PjT(true);
        this.PjT.xs();
        Jo.Zh(new Au("native_success") {
            final xs PjT;

            @Override
            public void run() {
                ReZ.Zh(xs.this.ReZ, xs.this.Zh, "dynamic_backup_render", null);
            }
        }, 10);
    }

    @Override  // com.bytedance.adsdk.ugeno.core.qla
    public void Zh() {
        this.PjT.JQp("ugen_sub_analysis_end");
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void Zh(int v) {
        if(v == 3) {
            this.PjT.cr("dynamic_sub_analysis2_start");
            return;
        }
        this.PjT.cr("dynamic_sub_analysis_start");
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void cr() {
        this.PjT.PjT();
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void cr(int v) {
        if(v == 3) {
            this.PjT.cr("dynamic_sub_render2_start");
            return;
        }
        this.PjT.cr("dynamic_sub_render_start");
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void cz() {
        this.PjT.ReZ();
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.SM
    public void cz(int v) {
        String s;
        if(v == 3) {
            this.PjT.XX("dynamic_render2_success");
            s = "dynamic2_render";
        }
        else {
            this.PjT.XX("dynamic_render_success");
            s = "dynamic_backup_native_render";
        }
        this.PjT.PjT(true);
        Jo.Zh(new Au("dynamic_success") {
            final xs Zh;

            @Override
            public void run() {
                ReZ.Zh(xs.this.ReZ, xs.this.Zh, s, null);
            }
        }, 10);
    }

    public void qj() {
        this.PjT.qj();
        this.PjT.xf();
    }
}

