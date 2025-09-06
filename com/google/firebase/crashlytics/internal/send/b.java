package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.k;
import com.google.android.datatransport.m;
import com.google.android.datatransport.runtime.w;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.T;
import com.google.firebase.crashlytics.internal.model.F;
import com.google.firebase.crashlytics.internal.model.serialization.j;
import java.nio.charset.Charset;

public class b {
    private final e a;
    private final k b;
    private static final j c = null;
    private static final String d = null;
    private static final String e = null;
    private static final String f = "FIREBASE_CRASHLYTICS_REPORT";
    private static final k g;

    static {
        b.c = new j();
        b.d = "https://crashlyticsreports-pa.googleapis.com/v1/firelog/legacy/batchlog";
        b.e = "AIzaSyBrpSYT4FFL09reHJi6H9FYdeiSnUTOv2M";
        b.g = (F f0) -> b.c.O(f0).getBytes(Charset.forName("UTF-8"));
    }

    b(e e0, k k0) {
        this.a = e0;
        this.b = k0;
    }

    public static b b(Context context0, com.google.firebase.crashlytics.internal.settings.k k0, T t0) {
        w.f(context0);
        m m0 = w.c().g(new a("https://crashlyticsreports-pa.googleapis.com/v1/firelog/legacy/batchlog", "AIzaSyBrpSYT4FFL09reHJi6H9FYdeiSnUTOv2M"));
        com.google.android.datatransport.e e0 = com.google.android.datatransport.e.b("json");
        return new b(new e(m0.b("FIREBASE_CRASHLYTICS_REPORT", F.class, e0, b.g), k0.a(), t0), b.g);
    }

    @NonNull
    public Task c(@NonNull com.google.firebase.crashlytics.internal.common.F f0, boolean z) {
        return this.a.i(f0, z).getTask();
    }

    // 检测为 Lambda 实现
    private static byte[] d(F f0) [...]

    private static String e(String s, String s1) {
        int v = s.length() - s1.length();
        if(v < 0 || v > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + s1.length());
        for(int v1 = 0; v1 < s.length(); ++v1) {
            stringBuilder0.append(s.charAt(v1));
            if(s1.length() > v1) {
                stringBuilder0.append(s1.charAt(v1));
            }
        }
        return stringBuilder0.toString();
    }
}

