package com.bytedance.sdk.openadsdk.cr.PjT;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.cz.PjT.JQp.ReZ;
import com.bytedance.sdk.component.cz.PjT.JQp;
import com.bytedance.sdk.component.cz.PjT.cr.PjT;
import com.bytedance.sdk.component.cz.PjT.cz.cr;
import com.bytedance.sdk.component.cz.PjT.cz;
import com.bytedance.sdk.component.utils.Au;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class qj implements JQp {
    private final String PjT;

    public qj() {
        this.PjT = "[7104]";
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public boolean Au() {
        return true;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public ReZ DWo() {
        return new XX();
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public Executor JQp() {
        return Jo.Au();
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public HandlerThread PjT(String s, int v) {
        return Au.PjT(s, v);
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public PjT PjT(JSONObject jSONObject0) {
        return null;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public String PjT(String s) {
        return com.bytedance.sdk.component.cr.PjT.Zh(s, com.bytedance.sdk.openadsdk.core.PjT.PjT());
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public void PjT(boolean z) {
        com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.cz, z);
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public void PjT(boolean z, int v, long v1, cr cr0) {
        if(cr0 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.ReZ, z, v, v1);
        if(z) {
            com.bytedance.sdk.openadsdk.qla.ReZ.PjT("track_link_result", false, new xs(true, cr0));
            return;
        }
        fDm fDm0 = com.bytedance.sdk.openadsdk.core.settings.xs.Gr().uQg();
        if(fDm0 == null || cr0.cr() >= fDm0.PjT(cr0.cz())) {
            com.bytedance.sdk.openadsdk.qla.ReZ.PjT("track_link_result", false, new xs(false, cr0));
        }
        else if(fDm0.PjT()) {
            Runnable runnable0 = cr0.PjT(xf.PjT(ub.PjT()), null);
            if(runnable0 != null) {
                Jo.PjT().schedule(runnable0, ((long)fDm0.Zh(cr0.cz())), TimeUnit.SECONDS);
            }
        }
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public boolean PjT() {
        return false;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public boolean PjT(Context context0) {
        return ltE.PjT(context0);
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public int ReZ(String s) {
        return com.bytedance.sdk.openadsdk.core.settings.xs.Gr().uQg().PjT(s);
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public boolean ReZ() {
        return true;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public String SM() {
        return wN.ReZ();
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public boolean XX() {
        return false;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public String Zh(String s) {
        return com.bytedance.sdk.component.cr.PjT.PjT(s, com.bytedance.sdk.openadsdk.core.PjT.PjT());
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public boolean Zh() {
        return false;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public Executor cr() {
        return Jo.cr();
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public int cz() {
        return 1;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public boolean fDm() {
        return false;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public cz qj() {
        synchronized(this) {
            return com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT());
        }
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public long qla() {
        long v = (long)com.bytedance.sdk.openadsdk.RD.PjT.PjT("log_queue_timeout", 40000);
        return v >= 30000L && v <= 120000L ? v : 40000L;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public com.bytedance.sdk.component.cz.PjT.XX xf() {
        return null;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.JQp
    public void xs() {
        com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.cz);
    }
}

