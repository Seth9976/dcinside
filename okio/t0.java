package okio;

import A3.a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import y4.l;

public final class t0 {
    @l
    public static final byte[] a(@l String s) {
        L.p(s, "<this>");
        byte[] arr_b = s.getBytes(f.b);
        L.o(arr_b, "this as java.lang.String).getBytes(charset)");
        return arr_b;
    }

    @l
    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    @l
    public static final String c(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return new String(arr_b, f.b);
    }

    public static final Object d(@l ReentrantLock reentrantLock0, @l a a0) {
        L.p(reentrantLock0, "<this>");
        L.p(a0, "action");
        reentrantLock0.lock();
        try {
            return a0.invoke();
        }
        finally {
            reentrantLock0.unlock();
        }
    }
}

