package com.bytedance.sdk.component.JQp.JQp;

import com.bytedance.sdk.component.JQp.ReZ.ReZ;
import com.bytedance.sdk.component.JQp.ReZ.cz;
import com.bytedance.sdk.component.JQp.Zh.Zh;
import com.bytedance.sdk.component.JQp.cr;

public class qj extends PjT {
    private void PjT(int v, String s, Throwable throwable0, ReZ reZ0) {
        reZ0.PjT(new Au(v, s, throwable0));
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public String PjT() {
        return "net_request";
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public void PjT(ReZ reZ0) {
        cz cz0 = reZ0.gK();
        cr cr0 = cz0.cr();
        reZ0.PjT(false);
        try {
            com.bytedance.sdk.component.JQp.cz cz1 = cr0.PjT(new Zh(reZ0.PjT(), reZ0.xs(), reZ0.fDm(), reZ0.RD()));
            int v = cz1.Zh();
            reZ0.PjT(cz1.PjT());
            if(cz1.Zh() == 200) {
                Object object0 = cz1.ReZ();
                reZ0.PjT(new com.bytedance.sdk.component.JQp.JQp.Zh(((byte[])object0), cz1));
                String s = reZ0.SM();
                com.bytedance.sdk.component.JQp.Zh zh0 = reZ0.ltE();
                if(zh0.JQp()) {
                    cz0.Zh(reZ0.ltE()).PjT(s, ((byte[])object0));
                }
                cz0.XX().submit(new Runnable() {
                    final qj cz;

                    @Override
                    public void run() {
                        if(zh0.XX()) {
                            cz0.ReZ(reZ0.ltE()).PjT(s, ((byte[])object0));
                        }
                    }
                });
                return;
            }
            Object object1 = cz1.ReZ();
            this.PjT(v, cz1.cr(), (object1 instanceof Throwable ? ((Throwable)object1) : null), reZ0);
            return;
        }
        catch(Throwable throwable0) {
        }
        this.PjT(1004, "net request failed!", throwable0, reZ0);
    }
}

