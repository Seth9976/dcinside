package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import j..util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class WebMessageCompat {
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    @Nullable
    private final WebMessagePortCompat[] a;
    @Nullable
    private final String b;
    @Nullable
    private final byte[] c;
    private final int d;
    public static final int e = 0;
    public static final int f = 1;

    public WebMessageCompat(@Nullable String s) {
        this(s, null);
    }

    public WebMessageCompat(@Nullable String s, @Nullable WebMessagePortCompat[] arr_webMessagePortCompat) {
        this.b = s;
        this.c = null;
        this.a = arr_webMessagePortCompat;
        this.d = 0;
    }

    public WebMessageCompat(@NonNull byte[] arr_b) {
        this(arr_b, null);
    }

    public WebMessageCompat(@NonNull byte[] arr_b, @Nullable WebMessagePortCompat[] arr_webMessagePortCompat) {
        Objects.requireNonNull(arr_b);
        this.c = arr_b;
        this.b = null;
        this.a = arr_webMessagePortCompat;
        this.d = 1;
    }

    private void a(int v) {
        if(v != this.d) {
            throw new IllegalStateException("Wrong data accessor type detected. " + this.f(this.d) + " expected, but got " + this.f(v));
        }
    }

    @NonNull
    public byte[] b() {
        this.a(1);
        Objects.requireNonNull(this.c);
        return this.c;
    }

    @Nullable
    public String c() {
        this.a(0);
        return this.b;
    }

    @Nullable
    public WebMessagePortCompat[] d() {
        return this.a;
    }

    public int e() {
        return this.d;
    }

    @NonNull
    private String f(int v) {
        switch(v) {
            case 0: {
                return "String";
            }
            case 1: {
                return "ArrayBuffer";
            }
            default: {
                return "Unknown";
            }
        }
    }
}

