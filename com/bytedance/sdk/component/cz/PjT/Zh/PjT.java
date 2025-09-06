package com.bytedance.sdk.component.cz.PjT.Zh;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.PjT.JQp;

public class PjT {
    public static boolean JQp() {
        JQp jQp0 = Au.XX().cr();
        return jQp0 != null && !TextUtils.isEmpty(jQp0.ReZ());
    }

    public static long PjT(int v, Context context0) {
        return PjT.Zh(v, context0);
    }

    public static boolean PjT() {
        JQp jQp0 = Au.XX().cr();
        return jQp0 != null && !TextUtils.isEmpty(jQp0.PjT());
    }

    public static boolean ReZ() {
        JQp jQp0 = Au.XX().cr();
        return jQp0 != null && !TextUtils.isEmpty(jQp0.cr());
    }

    private static long Zh(int v, Context context0) {
        if(context0 == null) {
            return (long)v;
        }
        Runtime runtime0 = Runtime.getRuntime();
        long v1 = runtime0.freeMemory();
        long v2 = runtime0.maxMemory() / 0x100000L - runtime0.totalMemory() / 0x100000L;
        if(v2 <= 0L) {
            if(v1 / 0x100000L <= 2L) {
                return 1L;
            }
            return v1 / 0x100000L > 10L ? Math.min(v1 / 0x100000L / 2L * 10L, v) : ((long)Math.min(v, 10));
        }
        long v3 = (v1 / 0x100000L + v2 - 10L) / 2L;
        if(v3 <= 2L) {
            return 1L;
        }
        return v3 > 10L ? Math.min(v3 * 10L, v) : ((long)Math.min(v, 10));
    }

    public static boolean Zh() {
        JQp jQp0 = Au.XX().cr();
        return jQp0 != null && !TextUtils.isEmpty(jQp0.Zh());
    }

    public static boolean cr() {
        JQp jQp0 = Au.XX().cr();
        return jQp0 != null && !TextUtils.isEmpty(jQp0.JQp());
    }

    public static boolean cz() {
        JQp jQp0 = Au.XX().cr();
        return jQp0 != null && !TextUtils.isEmpty(jQp0.cz());
    }
}

