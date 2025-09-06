package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.webkit.DownloadListener;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.Zh.JQp;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.xf.cz;
import org.json.JSONObject;

public class Au {
    @Nullable
    private DWo JQp;
    public static int PjT = 0;
    public static int ReZ = 2;
    public static int Zh = 1;
    private final boolean cr;
    @Nullable
    private SM cz;

    static {
    }

    public Au(PjT pjT0, Owx owx0) {
        boolean z = owx0.fc();
        this.cr = z;
        if(z) {
            DWo dWo0 = cRA.cz(owx0) ? new XX(pjT0) : new DWo(pjT0);
            this.JQp = dWo0;
            return;
        }
        this.cz = new SM(pjT0);
    }

    public void Au() {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.Zh();
        }
    }

    public boolean Au(int v) {
        if(this.cr && v == Au.Zh) {
            return this.JQp == null ? false : this.JQp.DWo();
        }
        return this.cz == null ? false : this.cz.Au();
    }

    public void DWo() {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.JQp();
        }
    }

    public void JQp() {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.cz();
        }
    }

    public void JQp(int v) {
        if(this.cr) {
            DWo dWo0 = this.JQp;
            if(dWo0 != null) {
                dWo0.PjT(((long)v));
            }
        }
        else {
            SM sM0 = this.cz;
            if(sM0 != null) {
                sM0.PjT(((long)v));
            }
        }
    }

    public void JQp(boolean z) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.JQp(z);
        }
    }

    public void PjT(int v) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.PjT(v);
        }
    }

    public void PjT(int v, Owx owx0, boolean z) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.PjT(v, owx0, z);
        }
    }

    public void PjT(int v, String s, String s1) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.PjT(v, s, s1);
        }
    }

    public void PjT(DownloadListener downloadListener0) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.PjT(downloadListener0);
        }
    }

    public void PjT(JQp jQp0) {
        if(this.cr) {
            DWo dWo0 = this.JQp;
            if(dWo0 != null) {
                dWo0.PjT(jQp0);
            }
        }
        else {
            SM sM0 = this.cz;
            if(sM0 != null) {
                sM0.PjT(jQp0);
            }
        }
    }

    public void PjT(cz cz0, boolean z) {
        if(this.cr) {
            DWo dWo0 = this.JQp;
            if(dWo0 != null) {
                dWo0.Zh(z);
            }
        }
        else {
            SM sM0 = this.cz;
            if(sM0 != null) {
                sM0.PjT(cz0, z);
            }
        }
    }

    public void PjT(String s) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.ReZ(s);
        }
    }

    public void PjT(JSONObject jSONObject0) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.PjT(jSONObject0);
        }
    }

    public void PjT(boolean z) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.Zh(z);
        }
    }

    public void PjT(boolean z, String s, int v) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.PjT(z, s, v);
        }
    }

    public boolean PjT() {
        return this.cz != null && this.cz.ub();
    }

    public void ReZ(int v) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.Zh(v);
        }
    }

    public void ReZ(String s) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.PjT(s);
        }
    }

    public void ReZ(boolean z) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.PjT(z);
        }
    }

    public boolean ReZ() {
        return this.cz == null ? true : this.cz.xE();
    }

    public long SM() {
        return this.cz == null ? 0L : ((long)this.cz.SM());
    }

    public void XX(int v) {
        if(this.cr && v != Au.ReZ) {
            DWo dWo0 = this.JQp;
            if(dWo0 != null) {
                dWo0.cz();
                return;
            }
        }
        SM sM0 = this.cz;
        if(sM0 != null && v != Au.Zh) {
            sM0.ReZ();
        }
    }

    public boolean XX() {
        return this.cz == null ? false : this.cz.qla();
    }

    public float Zh() {
        return this.cz == null ? 0.0f : ((float)this.cz.DWo());
    }

    public int Zh(int v) {
        return this.cz == null ? 0 : this.cz.ReZ(v);
    }

    public void Zh(String s) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.Zh(s);
        }
    }

    public void Zh(boolean z) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.cz(z);
        }
    }

    public com.bytedance.sdk.openadsdk.Owx.Au cr() {
        return this.cz == null ? null : this.cz.gK();
    }

    public void cr(boolean z) {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.cr(z);
        }
    }

    public boolean cr(int v) {
        if(this.cr) {
            return this.JQp == null ? false : this.JQp.SM();
        }
        return this.cz != null && this.cz.SM() - this.cz.DWo() >= v;
    }

    public void cz() {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.XX();
        }
    }

    public void cz(int v) {
        if(this.cr) {
            DWo dWo0 = this.JQp;
            if(dWo0 != null) {
                dWo0.PjT(v);
            }
        }
        else {
            SM sM0 = this.cz;
            if(sM0 != null) {
                sM0.JQp(v);
            }
        }
    }

    public void cz(boolean z) {
        DWo dWo0 = this.JQp;
        if(dWo0 != null) {
            dWo0.ReZ(z);
        }
    }

    public void fDm() {
        if(this.cr) {
            DWo dWo0 = this.JQp;
            if(dWo0 != null) {
                dWo0.Au();
            }
        }
        else {
            SM sM0 = this.cz;
            if(sM0 != null) {
                sM0.xs();
            }
        }
    }

    public void gK() {
        DWo dWo0 = this.JQp;
        if(dWo0 != null) {
            dWo0.ReZ();
        }
    }

    public com.bytedance.sdk.openadsdk.xf.JQp qj() {
        return this.cz == null ? null : this.cz.fDm();
    }

    public void qla() {
        if(this.cr) {
            DWo dWo0 = this.JQp;
            if(dWo0 != null) {
                dWo0.PjT();
            }
        }
        else {
            SM sM0 = this.cz;
            if(sM0 != null) {
                sM0.PjT();
            }
        }
    }

    public void ub() {
        DWo dWo0 = this.JQp;
        if(dWo0 != null) {
            dWo0.qj();
        }
    }

    public void xE() {
        if(this.cr) {
            DWo dWo0 = this.JQp;
            if(dWo0 != null) {
                dWo0.JQp();
            }
        }
        else {
            SM sM0 = this.cz;
            if(sM0 != null) {
                sM0.xf();
            }
        }
    }

    public void xf() {
        SM sM0 = this.cz;
        if(sM0 != null) {
            sM0.cr();
        }
    }

    public void xs() {
        if(this.cr) {
            DWo dWo0 = this.JQp;
            if(dWo0 != null) {
                dWo0.cr();
            }
        }
        else {
            SM sM0 = this.cz;
            if(sM0 != null) {
                sM0.qj();
            }
        }
    }
}

