package com.bytedance.sdk.openadsdk.component.reward.Zh;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.RD;
import com.bytedance.sdk.openadsdk.core.model.cRA;

public class XX {
    @NonNull
    public static Zh PjT(PjT pjT0) {
        Owx owx0 = pjT0.Zh;
        if(owx0 instanceof RD && ((RD)owx0).ELH()) {
            return new cz(pjT0);
        }
        if(cRA.gK(owx0)) {
            return new DWo(pjT0);
        }
        if(Au.PjT(owx0) && !ReZ.PjT(owx0)) {
            return new Au(pjT0);
        }
        if(SM.PjT(owx0)) {
            return new SM(pjT0);
        }
        if(DWo.PjT(owx0)) {
            return new DWo(pjT0);
        }
        if(cr.PjT(owx0)) {
            return new cr(pjT0);
        }
        return ReZ.PjT(owx0) ? new ReZ(pjT0) : new JQp(pjT0);
    }
}

