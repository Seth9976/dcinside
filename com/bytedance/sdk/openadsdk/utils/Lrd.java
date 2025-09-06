package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.ub;

public class Lrd {
    public static boolean PjT;

    static {
        Lrd.PjT = Lrd.PjT();
    }

    public static void PjT(int v) {
        try {
            SharedPreferences.Editor sharedPreferences$Editor0 = ub.PjT().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            sharedPreferences$Editor0.putInt("perf_con_use_prop", v);
            sharedPreferences$Editor0.apply();
        }
        catch(Throwable throwable0) {
            RD.Zh(throwable0.getMessage(), new Object[0]);
        }
    }

    private static boolean PjT() {
        try {
            if(ub.PjT() != null) {
                SharedPreferences sharedPreferences0 = ub.PjT().getSharedPreferences("pag_sp_prop_switch", 0);
                return sharedPreferences0 == null || sharedPreferences0.getInt("perf_con_use_prop", 1) == 1;
            }
        }
        catch(Throwable throwable0) {
            RD.Zh(throwable0.getMessage(), new Object[0]);
        }
        return true;
    }
}

