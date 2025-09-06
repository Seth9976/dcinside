package kotlinx.coroutines.internal;

import kotlin.b0;
import kotlin.coroutines.g.c;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@b0
public final class d0 implements c {
    @l
    private final ThreadLocal a;

    public d0(@l ThreadLocal threadLocal0) {
        this.a = threadLocal0;
    }

    private final ThreadLocal a() {
        return this.a;
    }

    @l
    public final d0 b(@l ThreadLocal threadLocal0) {
        return new d0(threadLocal0);
    }

    public static d0 c(d0 d00, ThreadLocal threadLocal0, int v, Object object0) {
        if((v & 1) != 0) {
            threadLocal0 = d00.a;
        }
        return d00.b(threadLocal0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d0 ? L.g(this.a, ((d0)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}

