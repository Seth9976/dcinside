package com.bytedance.sdk.openadsdk.core.Au;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import java.util.concurrent.atomic.AtomicBoolean;

public class RD implements ReZ {
    private String JQp;
    private long PjT;
    private int ReZ;
    private final AtomicBoolean XX;
    private long Zh;
    private String cr;
    private String cz;

    public RD() {
        this.PjT = 0L;
        this.Zh = 0L;
        this.ReZ = 0;
        this.cr = null;
        this.JQp = null;
        this.XX = new AtomicBoolean(false);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ
    public void PjT(int v, String s, String s1) {
        this.ReZ = v;
        this.cr = s;
        this.JQp = s1;
        this.Zh = SystemClock.elapsedRealtime();
        this.XX.set(false);
    }

    public void PjT(Owx owx0, String s) {
        if(this.XX.get()) {
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, false, s, "success", this.Zh - this.PjT, this.JQp, this.cz, 0, null);
            return;
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, false, s, "fail", this.Zh - this.PjT, this.JQp, this.cz, this.ReZ, this.cr);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ
    public void PjT(String s) {
        this.cz = s;
        this.PjT = SystemClock.elapsedRealtime();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ
    public void Zh(String s) {
        this.JQp = s;
        this.Zh = SystemClock.elapsedRealtime();
        this.XX.set(true);
    }
}

