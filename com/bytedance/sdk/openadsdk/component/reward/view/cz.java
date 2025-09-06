package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.PjT.ltE;
import com.bytedance.sdk.openadsdk.component.reward.PjT.ub;
import com.bytedance.sdk.openadsdk.core.Zh.JQp;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class cz {
    private boolean JQp;
    private final PjT PjT;
    private boolean ReZ;
    @Nullable
    private RFEndCardBackUpLayout Zh;
    private ltE cr;

    public cz(PjT pjT0) {
        this.PjT = pjT0;
    }

    public boolean JQp() {
        return this.cr == null ? false : this.cr.ReZ();
    }

    public void PjT() {
        if(this.ReZ) {
            return;
        }
        this.ReZ = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout0 = (RFEndCardBackUpLayout)this.PjT.ig.findViewById(qla.MN);
        this.Zh = rFEndCardBackUpLayout0;
        if(rFEndCardBackUpLayout0 != null) {
            rFEndCardBackUpLayout0.init(this.PjT);
        }
        if(this.PjT.Zh.uvo()) {
            this.cr = new ltE(this.PjT);
        }
    }

    public void PjT(int v) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout0 = this.Zh;
        if(rFEndCardBackUpLayout0 == null) {
            return;
        }
        rFEndCardBackUpLayout0.setShownAdCount(v);
    }

    public void PjT(JQp jQp0) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout0 = this.Zh;
        if(rFEndCardBackUpLayout0 == null) {
            return;
        }
        qZS.PjT(rFEndCardBackUpLayout0, new View.OnClickListener() {
            final cz PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        ltE ltE0 = this.cr;
        if(ltE0 != null) {
            ltE0.PjT(jQp0);
        }
    }

    public boolean PjT(ub ub0) {
        this.JQp = true;
        ltE ltE0 = this.cr;
        if(ltE0 == null) {
            return false;
        }
        if(ltE0.PjT(ub0)) {
            qZS.PjT(this.Zh, 0);
            return true;
        }
        return false;
    }

    public void ReZ() {
        ltE ltE0 = this.cr;
        if(ltE0 != null) {
            ltE0.PjT();
        }
    }

    public void Zh() {
        this.JQp = true;
        qZS.PjT(this.Zh, 0);
    }

    public void cr() {
        ltE ltE0 = this.cr;
        if(ltE0 != null) {
            ltE0.Zh();
        }
    }

    public boolean cz() {
        return this.JQp;
    }
}

