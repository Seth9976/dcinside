package com.bytedance.sdk.openadsdk.Lrd.Zh;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.Qf;

public class cz {
    public static boolean PjT(View view0, int v) {
        return cz.PjT(view0, false, v);
    }

    public static boolean PjT(View view0, boolean z, int v) {
        if(view0 == null) {
            return false;
        }
        return z ? Qf.PjT(view0, 30, v) : Qf.PjT(view0, 50, v);
    }
}

