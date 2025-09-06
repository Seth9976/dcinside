package com.apm.insight.f;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.a;
import com.apm.insight.entity.c;
import com.apm.insight.k.g;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.m;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class b {
    private String a;
    private JSONObject b;
    private String c;
    private boolean d;
    private String e;
    private String f;
    private String g;
    private List h;

    public static void a(Object object0, Throwable throwable0, String s, String s1, @NonNull String s2) {
        try {
            m.a().a(() -> b.a(this.a, this.b, this.c, this.d, null, this.f, this.g));
        }
        catch(Throwable unused_ex) {
        }

        final class com.apm.insight.f.b.2 implements Runnable {
            private boolean d;
            private Map e;

            com.apm.insight.f.b.2(Object object0, Throwable throwable0, String s, String s1, String s2) {
            }

            @Override
            public final void run() {
                b.a(this.a, this.b, this.c, this.d, this.f, this.g);
            }
        }

    }

    // 检测为 Lambda 实现
    static void a(Object object0, Throwable throwable0, String s, boolean z, String s1, String s2) [...]

    private static void a(Object object0, Throwable throwable0, String s, boolean z, Map map0, String s1, @NonNull String s2) {
        if(throwable0 == null) {
            return;
        }
        try {
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[0];
            if(stackTraceElement0 == null) {
                return;
            }
            String s3 = com.apm.insight.l.m.a(throwable0);
            if(TextUtils.isEmpty(s3)) {
                return;
            }
            c c0 = c.a(stackTraceElement0, s3, s, "jeb-dexdec-sb-st-3656", z, s1, s2);
            if(object0 != null) {
                c0.a("exception_line_num", com.apm.insight.entity.b.a(object0, throwable0, arr_stackTraceElement));
            }
            b.a(null, c0);
            f.a().a(CrashType.ENSURE, c0);
            g.a(object0, c0);
            a.b(("[reportException] " + s));
            return;
        }
        catch(Throwable throwable1) {
        }
        a.b(throwable1);
    }

    public static void a(Throwable throwable0, String s, @NonNull String s1) {
        try {
            m.a().a(() -> b.a(null, this.a, this.b, this.c, null, "EnsureNotReachHere", this.e));
        }
        catch(Throwable unused_ex) {
        }

        final class com.apm.insight.f.b.1 implements Runnable {
            private boolean c;
            private Map d;

            com.apm.insight.f.b.1(Throwable throwable0, String s, String s1) {
            }

            @Override
            public final void run() {
                b.a(this.a, this.b, this.c, this.e);
            }
        }

    }

    // 检测为 Lambda 实现
    static void a(Throwable throwable0, String s, boolean z, String s1) [...]

    private static void a(Map map0, c c0) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            if(map0 != null) {
                for(Object object0: map0.keySet()) {
                    jSONObject0.put(((String)object0), map0.get(((String)object0)));
                }
                c0.a("custom", jSONObject0);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    // 检测为 Lambda 实现
    static void a(StackTraceElement[] arr_stackTraceElement, int v, String s, String s1, String s2, Map map0) [...]

    public static void a(StackTraceElement[] arr_stackTraceElement, @Nullable String s, String s1) {
        try {
            m.a().a(() -> {
                CharSequence charSequence0;
                if(this.a != null && this.a.length > this.b + 1) {
                    try {
                        StackTraceElement stackTraceElement0 = this.a[this.b];
                        if(stackTraceElement0 == null) {
                            return;
                        }
                        if(this.a.length <= 0) {
                            charSequence0 = null;
                        }
                        else {
                            StringBuilder stringBuilder0 = new StringBuilder();
                            while(this.b < this.a.length) {
                                com.apm.insight.l.m.a(this.a[this.b], stringBuilder0);
                                ++this.b;
                            }
                            charSequence0 = stringBuilder0.toString();
                        }
                        if(TextUtils.isEmpty(charSequence0)) {
                            return;
                        }
                        c c0 = c.a(stackTraceElement0, ((String)charSequence0), this.c, "jeb-dexdec-sb-st-3561", true, this.d, "core_exception_monitor");
                        b.a(null, c0);
                        f.a().a(CrashType.ENSURE, c0);
                        g.a(c0);
                        a.b(("[report] " + this.c));
                        return;
                    }
                    catch(Throwable throwable0) {
                    }
                    a.b(throwable0);
                }
            });
        }
        catch(Throwable unused_ex) {
        }

        final class com.apm.insight.f.b.3 implements Runnable {
            private int b;
            private Map e;

            com.apm.insight.f.b.3(StackTraceElement[] arr_stackTraceElement, String s, String s1) {
            }

            @Override
            public final void run() {
                b.a(this.a, this.b, this.c, this.d, "core_exception_monitor", null);
            }
        }

    }

    public final String a() {
        return this.a;
    }

    public final void a(String s) {
        this.a = s;
    }

    public final void a(List list0) {
        this.h = list0;
    }

    public final void a(JSONObject jSONObject0) {
        this.b = jSONObject0;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final JSONObject b() {
        return this.b;
    }

    public final void b(String s) {
        this.c = s;
    }

    public final String c() {
        return this.c;
    }

    public final void c(String s) {
        this.e = s;
    }

    public final String d() {
        return this.e;
    }

    public final void d(String s) {
        this.f = s;
    }

    public final String e() {
        return this.f;
    }

    public final void e(String s) {
        this.g = s;
    }

    public final String f() {
        return this.g;
    }

    public final List g() {
        return this.h;
    }
}

