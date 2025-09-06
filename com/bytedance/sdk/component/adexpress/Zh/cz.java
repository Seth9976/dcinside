package com.bytedance.sdk.component.adexpress.Zh;

import android.content.Context;
import android.view.View;

public class cz implements DWo {
    private Context PjT;
    private xs ReZ;
    private PjT Zh;

    public cz(Context context0, xs xs0, PjT pjT0) {
        this.PjT = context0;
        this.Zh = pjT0;
        this.ReZ = xs0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo
    public void PjT() {
    }

    public void PjT(ReZ reZ0) {
        this.Zh.PjT(reZ0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo
    public boolean PjT(com.bytedance.sdk.component.adexpress.Zh.DWo.PjT dWo$PjT0) {
        this.ReZ.JQp().cz();
        this.Zh.PjT(new XX() {
            final cz Zh;

            @Override  // com.bytedance.sdk.component.adexpress.Zh.XX
            public void PjT(int v, String s) {
                qla qla0 = dWo$PjT0.Zh();
                if(qla0 != null) {
                    qla0.a_(v);
                }
            }

            @Override  // com.bytedance.sdk.component.adexpress.Zh.XX
            public void PjT(View view0, fDm fDm0) {
                if(dWo$PjT0.ReZ()) {
                    return;
                }
                qla qla0 = dWo$PjT0.Zh();
                if(qla0 != null) {
                    qla0.PjT(cz.this.Zh, fDm0);
                }
                dWo$PjT0.PjT(true);
            }
        });
        return true;
    }
}

