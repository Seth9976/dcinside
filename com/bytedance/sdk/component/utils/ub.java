package com.bytedance.sdk.component.utils;

import android.os.Environment;
import android.os.StatFs;

public class ub {
    public static long PjT() {
        try {
            StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
            long v = (long)statFs0.getBlockSize();
            return ((long)statFs0.getAvailableBlocks()) * v;
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }
}

