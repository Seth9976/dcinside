package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.multipro.cr.PjT;

public class Zh {
    public static Boolean PjT;

    public static void PjT() {
        Zh.PjT = Boolean.TRUE;
        PjT.PjT("sp_multi_info", "is_support_multi_process", Boolean.TRUE);
    }

    public static boolean ReZ() {
        Boolean boolean0 = Zh.PjT;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        if(!fDm.JQp()) {
            return false;
        }
        if(Zh.PjT == null) {
            Zh.PjT = Boolean.valueOf(PjT.PjT("sp_multi_info", "is_support_multi_process", false));
        }
        return Zh.PjT.booleanValue();
    }

    public static void Zh() {
        Zh.PjT = Boolean.FALSE;
        BinderPoolService.PjT = true;
    }
}

