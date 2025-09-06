package com.bytedance.sdk.component.adexpress.Zh;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.JQp.XX;
import com.bytedance.sdk.component.adexpress.dynamic.PjT.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.cr;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

public class Zh implements DWo {
    private xs JQp;
    private Context PjT;
    private ThemeStatusBroadcastReceiver ReZ;
    private PjT Zh;
    private Au cr;
    private int cz;

    public Zh(Context context0, xs xs0, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver0, boolean z, com.bytedance.sdk.component.adexpress.dynamic.JQp.Au au0, Au au1, com.bytedance.sdk.component.adexpress.dynamic.cz.PjT pjT0, PjT pjT1) {
        this.PjT = context0;
        this.JQp = xs0;
        this.ReZ = themeStatusBroadcastReceiver0;
        this.cr = au1;
        this.Zh = pjT1 == null ? new PjT(context0, themeStatusBroadcastReceiver0, z, au0, xs0, pjT0) : pjT1;
        this.Zh.PjT(this.cr);
        if(au0 instanceof XX) {
            this.cz = 3;
            return;
        }
        this.cz = 2;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo
    public void PjT() {
        PjT pjT0 = this.Zh;
        if(pjT0 != null) {
            pjT0.Zh();
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo
    public boolean PjT(com.bytedance.sdk.component.adexpress.Zh.DWo.PjT dWo$PjT0) {
        this.JQp.JQp().PjT(this.cz);
        this.Zh.PjT(new com.bytedance.sdk.component.adexpress.Zh.XX() {
            final Zh Zh;

            @Override  // com.bytedance.sdk.component.adexpress.Zh.XX
            public void PjT(int v, String s) {
                Zh.this.JQp.JQp().PjT(Zh.this.cz, v, s, dWo$PjT0.Zh(Zh.this));
                if(dWo$PjT0.Zh(Zh.this)) {
                    dWo$PjT0.PjT(Zh.this);
                    return;
                }
                qla qla0 = dWo$PjT0.Zh();
                if(qla0 == null) {
                    return;
                }
                qla0.a_(v);
            }

            @Override  // com.bytedance.sdk.component.adexpress.Zh.XX
            public void PjT(View view0, fDm fDm0) {
                if(dWo$PjT0.ReZ()) {
                    return;
                }
                Zh.this.JQp.JQp().JQp(Zh.this.cz);
                Zh.this.JQp.JQp().cz(Zh.this.cz);
                Zh.this.JQp.JQp().DWo();
                qla qla0 = dWo$PjT0.Zh();
                if(qla0 == null) {
                    return;
                }
                qla0.PjT(Zh.this.Zh, fDm0);
                dWo$PjT0.PjT(true);
            }
        });
        return true;
    }

    public cr Zh() {
        PjT pjT0 = this.Zh;
        return pjT0 != null ? pjT0.cr() : null;
    }
}

