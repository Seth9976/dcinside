package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class NetworkRequestCompat {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        @l
        public final String a() [...] // 潜在的解密器
    }

    @m
    private final Object a;
    @l
    public static final Companion b;
    @l
    private static final String c;

    static {
        NetworkRequestCompat.b = new Companion(null);
        L.o("WM-NetworkRequestCompat", "tagWithPrefix(\"NetworkRequestCompat\")");
        NetworkRequestCompat.c = "WM-NetworkRequestCompat";
    }

    public NetworkRequestCompat() {
        this(null, 1, null);
    }

    public NetworkRequestCompat(@m Object object0) {
        this.a = object0;
    }

    public NetworkRequestCompat(Object object0, int v, w w0) {
        if((v & 1) != 0) {
            object0 = null;
        }
        this(object0);
    }

    // 去混淆评级： 低(20)
    public static final String a() [...] // 潜在的解密器

    @m
    public final Object b() {
        return this.a;
    }

    @l
    public final NetworkRequestCompat c(@m Object object0) {
        return new NetworkRequestCompat(object0);
    }

    public static NetworkRequestCompat d(NetworkRequestCompat networkRequestCompat0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = networkRequestCompat0.a;
        }
        return networkRequestCompat0.c(object0);
    }

    @RequiresApi(21)
    @m
    public final NetworkRequest e() {
        return (NetworkRequest)this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof NetworkRequestCompat ? L.g(this.a, ((NetworkRequestCompat)object0).a) : false;
    }

    @m
    public final Object f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }
}

