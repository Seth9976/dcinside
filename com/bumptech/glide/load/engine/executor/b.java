package com.bumptech.glide.load.engine.executor;

import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

final class b {
    private static final String a = "GlideRuntimeCompat";
    private static final String b = "cpu[0-9]+";
    private static final String c = "/sys/devices/system/cpu/";

    static int a() [...] // 潜在的解密器

    private static int b() {
        class a implements FilenameFilter {
            final Pattern a;

            a(Pattern pattern0) {
            }

            @Override
            public boolean accept(File file0, String s) {
                return this.a.matcher(s).matches();
            }
        }

        File[] arr_file;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            arr_file = new File("/sys/devices/system/cpu/").listFiles(new a(Pattern.compile("cpu[0-9]+")));
        }
        catch(Throwable unused_ex) {
            try {
                if(Log.isLoggable("GlideRuntimeCompat", 6)) {
                    Log.e("GlideRuntimeCompat", "Failed to calculate accurate cpu count", throwable0);
                }
            }
            finally {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
            throw new NullPointerException();
        }
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        return arr_file == null ? 1 : Math.max(1, arr_file.length);
    }
}

