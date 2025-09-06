package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;

public class PjT {
    public static void PjT(Owx owx0, boolean z, boolean z1) {
        fDm.Zh().post(new Runnable() {
            @Override
            public void run() {
                if(owx0 != null && !owx0.zq()) {
                    try {
                        Context context0 = ub.PjT();
                        AdSlot adSlot0 = owx0.ig();
                        if(adSlot0 != null) {
                            switch(JQp.Zh()) {
                                case 0: 
                                case 2: {
                                    if(z1) {
                                        xs.PjT(context0).PjT(adSlot0.getCodeId(), owx0);
                                    }
                                    else {
                                        JQp.PjT(context0).PjT(adSlot0.getCodeId(), owx0);
                                    }
                                }
                            }
                            if(z) {
                                if(z1) {
                                    xs.PjT(context0).PjT(adSlot0);
                                    return;
                                }
                                JQp.PjT(context0).PjT(adSlot0);
                            }
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        });
    }

    public static void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, int v, boolean z) {
        if(pjT0 != null && pjT0.cr() != null && pjT0.cr().size() > 0) {
            if(v >= pjT0.cr().size()) {
                v = 0;
            }
            Owx owx0 = (Owx)pjT0.cr().get(v);
            Context context0 = ub.PjT();
            PjT.PjT(owx0, !TextUtils.isEmpty((z ? xf.PjT(context0).PjT(owx0) : cr.PjT(context0).PjT(owx0))), z);
        }
    }
}

