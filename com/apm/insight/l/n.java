package com.apm.insight.l;

import android.os.Environment;
import android.os.StatFs;
import com.apm.insight.e;
import java.io.File;
import org.json.JSONObject;

public final class n {
    private static long a(File file0) {
        try {
            return new StatFs(file0.getPath()).getTotalBytes();
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }

    public static JSONObject a() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("inner_free", n.b());
            jSONObject0.put("inner_total", n.c());
            jSONObject0.put("sdcard_free", n.f());
            jSONObject0.put("sdcard_total", n.g());
            jSONObject0.put("inner_free_real", n.d());
            jSONObject0.put("inner_total_real", n.e());
        }
        catch(Throwable unused_ex) {
        }
        return jSONObject0;
    }

    private static long b() {
        try {
            return n.b(Environment.getRootDirectory());
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }

    private static long b(File file0) {
        try {
            return new StatFs(file0.getPath()).getFreeBytes();
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }

    private static long c() {
        try {
            return n.a(Environment.getRootDirectory());
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }

    private static long d() {
        try {
            return n.b(e.g().getFilesDir());
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }

    private static long e() {
        try {
            return n.a(e.g().getFilesDir());
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }

    private static long f() {
        try {
            return n.h() ? Environment.getExternalStorageDirectory().getFreeSpace() : 0L;
        }
        catch(Throwable unused_ex) {
        }
        return 0L;
    }

    private static long g() {
        try {
            return n.h() ? Environment.getExternalStorageDirectory().getTotalSpace() : 0L;
        }
        catch(Throwable unused_ex) {
        }
        return 0L;
    }

    private static boolean h() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}

