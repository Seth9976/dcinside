package com.bytedance.sdk.openadsdk.Owx.PjT;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.xf.cz;

public class Zh extends PjT {
    private FrameLayout JQp;
    private cz ReZ;
    private volatile boolean Zh;
    private final FrameLayout cr;
    private String cz;

    public Zh(Context context0, Owx owx0, int v, boolean z, FrameLayout frameLayout0, String s) {
        super(context0, owx0, v, z, frameLayout0);
        this.cr = frameLayout0;
        this.cz = s;
        this.Zh(false);
        int v1 = qZS.ReZ(context0);
        int v2 = qZS.JQp(context0);
        if(v == 1) {
            if(v1 <= v2) {
                this.PjT.layout(0, 0, v1, v2);
                return;
            }
            this.PjT.layout(0, 0, v2, v1);
            return;
        }
        if(v == 2) {
            if(v1 > v2) {
                this.PjT.layout(0, 0, v1, v2);
                return;
            }
            this.PjT.layout(0, 0, v2, v1);
        }
    }

    public String Au() {
        return this.cz;
    }

    @Override  // com.bytedance.sdk.openadsdk.Owx.PjT.PjT
    public void PjT() {
        this.JQp.setVisibility(0);
        super.PjT();
    }

    public void PjT(FrameLayout frameLayout0, cz cz0) {
        this.JQp = frameLayout0;
        frameLayout0.addView(this.cr);
        this.ReZ = cz0;
        if(this.Zh) {
            this.ReZ.PjT();
        }
    }

    public void XX() {
        super.PjT(true, new cz() {
            final Zh PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.cz
            public void PjT() {
                if(Zh.this.ReZ != null) {
                    Zh.this.ReZ.PjT();
                    return;
                }
                Zh.this.Zh = true;
            }
        });
    }
}

