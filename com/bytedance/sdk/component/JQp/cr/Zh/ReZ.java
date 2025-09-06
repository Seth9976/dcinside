package com.bytedance.sdk.component.JQp.cr.Zh;

import com.bytedance.sdk.component.JQp.Zh;
import com.bytedance.sdk.component.JQp.cr.ReZ.PjT;
import com.bytedance.sdk.component.JQp.cr;
import com.bytedance.sdk.component.JQp.gK;
import com.bytedance.sdk.component.JQp.ltE;
import java.util.Collection;

public class ReZ implements cz {
    private void PjT(Zh zh0, com.bytedance.sdk.component.JQp.cr.ReZ.cz cz0, String s, byte[] arr_b) {
        if(zh0 != null && zh0.cz()) {
            cz0.Zh(zh0).PjT(s, arr_b);
        }
    }

    private byte[] PjT(Zh zh0, com.bytedance.sdk.component.JQp.cr.ReZ.cz cz0, String s) {
        cz0.ReZ(zh0);
        Collection collection0 = cz0.Zh();
        if(collection0 == null) {
            return null;
        }
        for(Object object0: collection0) {
            byte[] arr_b = (byte[])((com.bytedance.sdk.component.JQp.ReZ)object0).PjT(s);
            if(arr_b != null) {
                return arr_b;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    private byte[] PjT(com.bytedance.sdk.component.JQp.cr.ReZ.cz cz0, com.bytedance.sdk.component.JQp.cr.ReZ.ReZ reZ0, PjT pjT0) {
        cr cr0 = cz0.ReZ();
        reZ0.PjT(false);
        try {
            com.bytedance.sdk.component.JQp.cz cz1 = cr0.PjT(new com.bytedance.sdk.component.JQp.Zh.Zh(reZ0.PjT(), false, false, reZ0.ltE()));
            if(cz1 == null) {
                pjT0.PjT(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int v = cz1.Zh();
            if(v == 200) {
                byte[] arr_b = (byte[])cz1.ReZ();
                if(arr_b == null) {
                    pjT0.PjT(200, cz1.cr(), new Exception("net data is empty"));
                    return null;
                }
                this.PjT(reZ0.gK(), cz0, reZ0.SM(), arr_b);
                this.Zh(reZ0.gK(), cz0, reZ0.SM(), arr_b);
                return arr_b;
            }
            Object object0 = cz1.ReZ();
            pjT0.PjT(v, cz1.cr(), (object0 instanceof Throwable ? ((Throwable)object0) : null));
            return null;
        }
        catch(Throwable throwable0) {
        }
        pjT0.PjT(1004, "net request failed!", throwable0);
        return null;
    }

    @Override  // com.bytedance.sdk.component.JQp.cr.Zh.cz
    public String PjT() {
        return "data_intercept";
    }

    @Override  // com.bytedance.sdk.component.JQp.cr.Zh.cz
    public boolean PjT(com.bytedance.sdk.component.JQp.cr.ReZ.ReZ reZ0, ltE ltE0, PjT pjT0) {
        Zh zh0 = reZ0.gK();
        com.bytedance.sdk.component.JQp.cr.ReZ.cz cz0 = reZ0.ub();
        byte[] arr_b = null;
        if(zh0 != null && cz0 != null) {
            if(zh0.cz()) {
                if(ltE0 != null) {
                    ltE0.PjT("data_cache", reZ0);
                }
                gK gK0 = cz0.Zh(zh0);
                if(gK0 != null) {
                    arr_b = (byte[])gK0.PjT(reZ0.SM());
                }
                if(ltE0 != null) {
                    ltE0.Zh("data_cache", reZ0);
                }
            }
            if(zh0.XX() && arr_b == null) {
                if(ltE0 != null) {
                    ltE0.PjT("disk_cache", reZ0);
                }
                byte[] arr_b1 = this.PjT(zh0, cz0, reZ0.SM());
                if(arr_b1 != null) {
                    this.PjT(reZ0.gK(), cz0, reZ0.SM(), arr_b1);
                }
                if(ltE0 != null) {
                    ltE0.Zh("disk_cache", reZ0);
                }
                arr_b = arr_b1;
            }
        }
        if(cz0 != null && arr_b == null) {
            if(ltE0 != null) {
                ltE0.PjT("net_request", reZ0);
            }
            arr_b = this.PjT(cz0, reZ0, pjT0);
            if(ltE0 != null) {
                ltE0.Zh("net_request", reZ0);
            }
        }
        if(arr_b == null) {
            return false;
        }
        reZ0.PjT(arr_b);
        return true;
    }

    private void Zh(Zh zh0, com.bytedance.sdk.component.JQp.cr.ReZ.cz cz0, String s, byte[] arr_b) {
        if(zh0 != null && zh0.XX()) {
            cz0.cz().submit(new Runnable() {
                final ReZ JQp;

                @Override
                public void run() {
                    cz0.ReZ(zh0).PjT(s, arr_b);
                }
            });
        }
    }
}

