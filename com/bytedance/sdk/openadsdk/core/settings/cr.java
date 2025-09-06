package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.google.android.gms.appset.AppSet;

public class cr {
    private static volatile String PjT = "";
    private static String ReZ = null;
    private static volatile String Zh = "";
    private static volatile int cr;

    static {
    }

    public static void PjT() {
        try {
            AppSet.getClient(ub.PjT()).getAppSetIdInfo().addOnSuccessListener(new AppSetIdAndScope.1());
        }
        catch(Throwable unused_ex) {
            cr.cr = 2;
        }
    }

    public static String ReZ() [...] // 潜在的解密器

    public static String Zh() [...] // 潜在的解密器

    public static String cr() {
        if(TextUtils.isEmpty(cr.ReZ)) {
            cr.ReZ = ub.PjT().getPackageManager().getInstallerPackageName(wN.JQp());
        }
        if(cr.ReZ == null) {
            cr.ReZ = "";
        }
        return cr.ReZ;
    }
}

