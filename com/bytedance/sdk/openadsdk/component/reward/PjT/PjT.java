package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.openadsdk.component.reward.view.SM;
import com.bytedance.sdk.openadsdk.component.reward.view.XX;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.xf.cr.Zh;
import com.bytedance.sdk.openadsdk.utils.xs;
import com.bytedance.sdk.openadsdk.xf.DWo;
import java.util.concurrent.atomic.AtomicBoolean;

public class PjT {
    public int Au;
    public long CY;
    public final qla Co;
    public final AtomicBoolean DWo;
    public int HG;
    public final Context IJ;
    public final String JQp;
    public final gK Jo;
    public final cz KM;
    public boolean Ld;
    public final cr Lrd;
    public int MWx;
    public boolean Nv;
    public final KM OMu;
    public final AtomicBoolean Owx;
    public final int PjT;
    public final ReZ Qf;
    public final AtomicBoolean RD;
    private long RV;
    public final boolean ReZ;
    public int SM;
    public final AtomicBoolean Sks;
    public final boolean VY;
    public final boolean XX;
    public boolean Xe;
    public xs Xtz;
    public final qj Yo;
    public DWo ZX;
    public final com.bytedance.sdk.openadsdk.component.reward.view.DWo Zd;
    public final Owx Zh;
    public int cI;
    public final Au cRA;
    public final boolean cr;
    public final int cz;
    public com.bytedance.sdk.openadsdk.component.reward.top.ReZ dIF;
    public boolean dwk;
    public com.bytedance.sdk.openadsdk.common.xs fA;
    public final AtomicBoolean fDm;
    public final AtomicBoolean gK;
    @Nullable
    public com.bytedance.sdk.openadsdk.activity.cz hN;
    public final xf iZZ;
    public final XX ig;
    public boolean ix;
    public boolean kFP;
    public final Zh kph;
    public final AtomicBoolean ltE;
    public float oG;
    public final JQp qZS;
    public final AtomicBoolean qj;
    public final AtomicBoolean qla;
    @NonNull
    public final Activity rds;
    @NonNull
    public final ub tT;
    public String tY;
    public com.bytedance.sdk.openadsdk.component.reward.qj uQg;
    public final AtomicBoolean ub;
    public com.bytedance.sdk.openadsdk.component.reward.Zh.Zh wKV;
    @NonNull
    public final fDm wN;
    public final AtomicBoolean xE;
    public boolean xH;
    private long xR;
    public final AtomicBoolean xf;
    public final AtomicBoolean xs;
    public boolean xu;
    public final com.bytedance.sdk.openadsdk.component.reward.view.Au yIW;
    public boolean yks;
    public boolean zYH;
    public int zZ;

    public PjT(@NonNull Activity activity0, KM kM0, @NonNull Owx owx0, Zh zh0, int v) {
        com.bytedance.sdk.openadsdk.component.reward.view.DWo dWo0;
        boolean z = false;
        this.Au = 0;
        this.SM = 0;
        this.DWo = new AtomicBoolean(false);
        this.qj = new AtomicBoolean(false);
        this.xf = new AtomicBoolean(false);
        this.xs = new AtomicBoolean(false);
        this.fDm = new AtomicBoolean(false);
        this.qla = new AtomicBoolean(false);
        this.xE = new AtomicBoolean(false);
        this.ub = new AtomicBoolean(false);
        this.gK = new AtomicBoolean(false);
        this.ltE = new AtomicBoolean(false);
        this.Owx = new AtomicBoolean(false);
        this.RD = new AtomicBoolean(false);
        this.Sks = new AtomicBoolean(false);
        this.dwk = false;
        this.cI = 1;
        this.CY = 0L;
        this.rds = activity0;
        this.kph = zh0;
        Context context0 = com.bytedance.sdk.openadsdk.core.ub.PjT();
        this.IJ = context0;
        this.Zh = owx0;
        this.PjT = v;
        this.VY = v == 0 || v == 2;
        this.yks = v == 0 || v == 1;
        this.OMu = kM0;
        if(owx0.ig().getDurationSlotType() == 7) {
            z = true;
        }
        this.cr = z;
        this.JQp = z ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.zYH = owx0.cr();
        this.XX = com.bytedance.sdk.openadsdk.core.model.gK.DWo(owx0);
        int v1 = owx0.joj();
        this.cz = v1;
        this.xH = com.bytedance.sdk.openadsdk.core.ub.cr().ub(String.valueOf(v1));
        this.ReZ = com.bytedance.sdk.openadsdk.core.settings.xs.Gr().fDm(String.valueOf(v1));
        xf xf0 = v == 2 ? new com.bytedance.sdk.openadsdk.component.reward.PjT.xs(this) : new xf(this);
        this.iZZ = xf0;
        if(v == 2) {
            dWo0 = new com.bytedance.sdk.openadsdk.component.reward.view.qj(this);
        }
        else if(owx0.cr()) {
            dWo0 = new com.bytedance.sdk.openadsdk.component.reward.view.DWo(this);
        }
        else {
            dWo0 = new SM(this);
        }
        this.Zd = dWo0;
        this.ig = new XX(this);
        this.tT = new ub(this);
        this.Lrd = new cr(this);
        this.cRA = new Au(this, owx0);
        this.yIW = new com.bytedance.sdk.openadsdk.component.reward.view.Au(this);
        this.Jo = new gK(this);
        this.Co = new qla(this);
        this.wN = new fDm(this);
        this.qZS = new JQp(this);
        this.Yo = new qj(this);
        this.KM = new cz(this);
        this.Qf = new ReZ(this);
        this.ZX = new DWo(context0);
        this.Xtz = com.bytedance.sdk.openadsdk.utils.Au.PjT(activity0, new com.bytedance.sdk.openadsdk.utils.Au.PjT() {
            final PjT PjT;

            @Override  // com.bytedance.sdk.openadsdk.utils.Au$PjT
            public View PjT() {
                com.bytedance.sdk.openadsdk.component.reward.view.DWo dWo0 = PjT.this.Zd;
                return dWo0 == null ? null : dWo0.DWo();
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.Au$PjT
            public void Zh() {
                fDm fDm0 = PjT.this.wN;
                if(fDm0 != null) {
                    fDm0.JQp();
                }
            }
        });
    }

    public void PjT() {
        this.RV = SystemClock.elapsedRealtime();
    }

    public void PjT(boolean z) {
        this.kFP = z;
        this.wN.cr(z);
    }

    public long ReZ() {
        return this.xR + (SystemClock.elapsedRealtime() - this.RV);
    }

    public void Zh() {
        if(this.RV <= 0L) {
            this.RV = SystemClock.elapsedRealtime();
        }
        this.xR += SystemClock.elapsedRealtime() - this.RV;
    }
}

