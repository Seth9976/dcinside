package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.d;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import l2.a;
import l2.b;

public final class u {
    private final a a;
    public static final long b = 0L;
    private static final String c = ":";
    private static final Pattern d;
    private static u e;

    static {
        u.b = TimeUnit.HOURS.toSeconds(1L);
        u.d = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    private u(a a0) {
        this.a = a0;
    }

    public long a() {
        return this.a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(this.a());
    }

    public static u c() {
        return u.d(b.a());
    }

    public static u d(a a0) {
        if(u.e == null) {
            u.e = new u(a0);
        }
        return u.e;
    }

    public long e() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public boolean f(@NonNull d d0) {
        return TextUtils.isEmpty(d0.b()) ? true : d0.h() + d0.c() < this.b() + u.b;
    }

    static boolean g(@Nullable String s) {
        return u.d.matcher(s).matches();
    }

    static boolean h(@Nullable String s) {
        return s.contains(":");
    }
}

