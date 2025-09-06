package com.gomfactory.adpie.sdk.util;

import android.util.Log;

public class MemUtil {
    public static final float BYTES_IN_MB = 1048576.0f;
    public static final String TAG = "MemUtil";
    private static boolean isMemoryError;

    static {
    }

    public static boolean isMemoryError() [...] // 潜在的解密器

    public static float megabytesAvailable() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static float megabytesFree() [...] // 潜在的解密器

    public static void printMemoryLog() {
        Runtime runtime0 = Runtime.getRuntime();
        long v = runtime0.totalMemory();
        long v1 = runtime0.freeMemory();
        Log.e("MemUtil", "--------------------------------------");
        Log.e("MemUtil", "max memory: " + runtime0.maxMemory() / 0x400L + " KB, total memory: " + v / 0x400L + " KB");
        Log.e("MemUtil", "free memory: " + v1 / 0x400L + " KB, alloc memory: " + (v - v1) / 0x400L + " KB");
        Log.e("MemUtil", "++++++++++++++++++++++++++++++++++++++");
    }

    public static void setMemoryError(boolean z) {
        MemUtil.isMemoryError = z;
    }
}

