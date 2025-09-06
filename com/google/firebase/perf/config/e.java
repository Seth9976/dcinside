package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.h;
import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.util.f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@VisibleForTesting(otherwise = 3)
public class e {
    private volatile SharedPreferences a;
    private final ExecutorService b;
    private static final a c = null;
    private static final String d = "FirebasePerfSharedPrefs";
    private static e e;

    static {
        e.c = a.e();
    }

    @VisibleForTesting
    public e(ExecutorService executorService0) {
        this.b = executorService0;
    }

    public void b(String s) {
        if(s == null) {
            e.c.a("Key is null. Cannot clear nullable key");
            return;
        }
        this.a.edit().remove(s).apply();
    }

    @VisibleForTesting
    public static void c() {
        e.e = null;
    }

    public boolean d(String s) {
        return this.a != null && s != null && this.a.contains(s);
    }

    public f e(String s) {
        if(s == null) {
            e.c.a("Key is null when getting boolean value on device cache.");
            return f.a();
        }
        if(this.a == null) {
            this.l(this.g());
            if(this.a == null) {
                return f.a();
            }
        }
        if(!this.a.contains(s)) {
            return f.a();
        }
        try {
            return f.e(Boolean.valueOf(this.a.getBoolean(s, false)));
        }
        catch(ClassCastException classCastException0) {
            e.c.b("Key %s from sharedPreferences has type other than long: %s", new Object[]{s, classCastException0.getMessage()});
            return f.a();
        }
    }

    public f f(String s) {
        if(s == null) {
            e.c.a("Key is null when getting double value on device cache.");
            return f.a();
        }
        if(this.a == null) {
            this.l(this.g());
            if(this.a == null) {
                return f.a();
            }
        }
        if(!this.a.contains(s)) {
            return f.a();
        }
        try {
            return f.e(Double.longBitsToDouble(this.a.getLong(s, 0L)));
        }
        catch(ClassCastException unused_ex) {
            try {
                return f.e(this.a.getFloat(s, 0.0f).doubleValue());
            }
            catch(ClassCastException classCastException0) {
                e.c.b("Key %s from sharedPreferences has type other than double: %s", new Object[]{s, classCastException0.getMessage()});
                return f.a();
            }
        }
    }

    @Nullable
    private Context g() {
        try {
            h.p();
            return h.p().n();
        }
        catch(IllegalStateException unused_ex) {
            return null;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static e h() {
        synchronized(e.class) {
            if(e.e == null) {
                e.e = new e(Executors.newSingleThreadExecutor());
            }
            return e.e;
        }
    }

    public f i(String s) {
        if(s == null) {
            e.c.a("Key is null when getting long value on device cache.");
            return f.a();
        }
        if(this.a == null) {
            this.l(this.g());
            if(this.a == null) {
                return f.a();
            }
        }
        if(!this.a.contains(s)) {
            return f.a();
        }
        try {
            return f.e(this.a.getLong(s, 0L));
        }
        catch(ClassCastException classCastException0) {
            e.c.b("Key %s from sharedPreferences has type other than long: %s", new Object[]{s, classCastException0.getMessage()});
            return f.a();
        }
    }

    public f j(String s) {
        if(s == null) {
            e.c.a("Key is null when getting String value on device cache.");
            return f.a();
        }
        if(this.a == null) {
            this.l(this.g());
            if(this.a == null) {
                return f.a();
            }
        }
        if(!this.a.contains(s)) {
            return f.a();
        }
        try {
            return f.e(this.a.getString(s, ""));
        }
        catch(ClassCastException classCastException0) {
            e.c.b("Key %s from sharedPreferences has type other than String: %s", new Object[]{s, classCastException0.getMessage()});
            return f.a();
        }
    }

    // 检测为 Lambda 实现
    private void k(Context context0) [...]

    public void l(Context context0) {
        synchronized(this) {
            if(this.a == null && context0 != null) {
                d d0 = () -> if(this.a == null && context0 != null) {
                    this.a = context0.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                };
                this.b.execute(d0);
            }
        }
    }

    public boolean m(String s, double f) {
        if(s == null) {
            e.c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if(this.a == null) {
            this.l(this.g());
            if(this.a == null) {
                return false;
            }
        }
        this.a.edit().putLong(s, Double.doubleToRawLongBits(f)).apply();
        return true;
    }

    public boolean n(String s, long v) {
        if(s == null) {
            e.c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if(this.a == null) {
            this.l(this.g());
            if(this.a == null) {
                return false;
            }
        }
        this.a.edit().putLong(s, v).apply();
        return true;
    }

    public boolean o(String s, String s1) {
        if(s == null) {
            e.c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if(this.a == null) {
            this.l(this.g());
            if(this.a == null) {
                return false;
            }
        }
        if(s1 == null) {
            this.a.edit().remove(s).apply();
            return true;
        }
        this.a.edit().putString(s, s1).apply();
        return true;
    }

    public boolean p(String s, boolean z) {
        if(s == null) {
            e.c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if(this.a == null) {
            this.l(this.g());
            if(this.a == null) {
                return false;
            }
        }
        this.a.edit().putBoolean(s, z).apply();
        return true;
    }
}

