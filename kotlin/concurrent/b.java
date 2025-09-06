package kotlin.concurrent;

import A3.a;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
@i(name = "ThreadsKt")
public final class b {
    @f
    private static final Object a(ThreadLocal threadLocal0, a a0) {
        L.p(threadLocal0, "<this>");
        L.p(a0, "default");
        Object object0 = threadLocal0.get();
        if(object0 == null) {
            object0 = a0.invoke();
            threadLocal0.set(object0);
        }
        return object0;
    }

    @l
    public static final Thread b(boolean z, boolean z1, @m ClassLoader classLoader0, @m String s, int v, @l a a0) {
        public static final class kotlin.concurrent.b.a extends Thread {
            final a a;

            kotlin.concurrent.b.a(a a0) {
                this.a = a0;
                super();
            }

            @Override
            public void run() {
                this.a.invoke();
            }
        }

        L.p(a0, "block");
        Thread thread0 = new kotlin.concurrent.b.a(a0);
        if(z1) {
            thread0.setDaemon(true);
        }
        if(v > 0) {
            thread0.setPriority(v);
        }
        if(s != null) {
            thread0.setName(s);
        }
        if(classLoader0 != null) {
            thread0.setContextClassLoader(classLoader0);
        }
        if(z) {
            thread0.start();
        }
        return thread0;
    }

    public static Thread c(boolean z, boolean z1, ClassLoader classLoader0, String s, int v, a a0, int v1, Object object0) {
        boolean z2 = (v1 & 1) == 0 ? z : true;
        boolean z3 = (v1 & 2) == 0 ? z1 : false;
        ClassLoader classLoader1 = (v1 & 4) == 0 ? classLoader0 : null;
        String s1 = (v1 & 8) == 0 ? s : null;
        return (v1 & 16) == 0 ? b.b(z2, z3, classLoader1, s1, v, a0) : b.b(z2, z3, classLoader1, s1, -1, a0);
    }
}

