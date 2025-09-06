package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.m;
import java.security.MessageDigest;

public final class i {
    class a implements b {
        a() {
            super();
        }

        @Override  // com.bumptech.glide.load.i$b
        public void a(@NonNull byte[] arr_b, @NonNull Object object0, @NonNull MessageDigest messageDigest0) {
        }
    }

    public interface b {
        void a(@NonNull byte[] arg1, @NonNull Object arg2, @NonNull MessageDigest arg3);
    }

    private final Object a;
    private final b b;
    private final String c;
    private volatile byte[] d;
    private static final b e;

    static {
        i.e = new a();
    }

    private i(@NonNull String s, @Nullable Object object0, @NonNull b i$b0) {
        this.c = m.c(s);
        this.a = object0;
        this.b = (b)m.e(i$b0);
    }

    @NonNull
    public static i a(@NonNull String s, @NonNull b i$b0) {
        return new i(s, null, i$b0);
    }

    @NonNull
    public static i b(@NonNull String s, @Nullable Object object0, @NonNull b i$b0) {
        return new i(s, object0, i$b0);
    }

    @NonNull
    private static b c() {
        return i.e;
    }

    @Nullable
    public Object d() {
        return this.a;
    }

    @NonNull
    private byte[] e() {
        if(this.d == null) {
            this.d = this.c.getBytes(g.b);
        }
        return this.d;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof i ? this.c.equals(((i)object0).c) : false;
    }

    @NonNull
    public static i f(@NonNull String s) {
        return new i(s, null, i.c());
    }

    @NonNull
    public static i g(@NonNull String s, @NonNull Object object0) {
        return new i(s, object0, i.c());
    }

    public void h(@NonNull Object object0, @NonNull MessageDigest messageDigest0) {
        byte[] arr_b = this.e();
        this.b.a(arr_b, object0, messageDigest0);
    }

    @Override
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override
    public String toString() {
        return "Option{key=\'" + this.c + '\'' + '}';
    }
}

