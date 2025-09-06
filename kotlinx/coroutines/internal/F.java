package kotlinx.coroutines.internal;

import A3.o;
import androidx.concurrent.futures.a;
import com.google.common.util.concurrent.Z0;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,265:1\n42#1,8:280\n103#2,7:266\n103#2,7:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n70#1:280,8\n23#1:266,7\n81#1:273,7\n*E\n"})
public final class f {
    private static final int a = 16;
    @l
    private static final V b;

    static {
        f.b = new V("CLOSED");
    }

    private static final boolean b(Object object0, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0, int v, Function1 function10) {
        do {
            int v1 = atomicIntegerFieldUpdater0.get(object0);
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                return false;
            }
        }
        while(!atomicIntegerFieldUpdater0.compareAndSet(object0, v1, v1 + v));
        return true;
    }

    private static final boolean c(AtomicIntegerArray atomicIntegerArray0, int v, int v1, Function1 function10) {
        do {
            int v2 = atomicIntegerArray0.get(v);
            if(!((Boolean)function10.invoke(v2)).booleanValue()) {
                return false;
            }
        }
        while(!atomicIntegerArray0.compareAndSet(v, v2, v2 + v1));
        return true;
    }

    @l
    public static final g d(@l g g0) {
        while(true) {
            Object object0 = g0.g();
            if(object0 == f.b) {
                return g0;
            }
            if(((g)object0) == null) {
                if(!g0.o()) {
                    continue;
                }
                return g0;
            }
            g0 = (g)object0;
        }
    }

    public static final Object e(Object object0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, long v, S s0, o o0) {
        Object object1;
    alab1:
        while(true) {
            object1 = f.g(s0, v, o0);
            if(T.h(object1)) {
                break;
            }
            S s1 = T.f(object1);
            while(true) {
                S s2 = (S)atomicReferenceFieldUpdater0.get(object0);
                if(s2.c >= s1.c) {
                    break alab1;
                }
                if(!s1.C()) {
                    break;
                }
                if(a.a(atomicReferenceFieldUpdater0, object0, s2, s1)) {
                    if(!s2.v()) {
                        break alab1;
                    }
                    s2.q();
                    return object1;
                }
                if(s1.v()) {
                    s1.q();
                }
            }
        }
        return object1;
    }

    public static final Object f(AtomicReferenceArray atomicReferenceArray0, int v, long v1, S s0, o o0) {
        Object object0;
    alab1:
        while(true) {
            object0 = f.g(s0, v1, o0);
            if(T.h(object0)) {
                break;
            }
            S s1 = T.f(object0);
            while(true) {
                S s2 = (S)atomicReferenceArray0.get(v);
                if(s2.c >= s1.c) {
                    break alab1;
                }
                if(!s1.C()) {
                    break;
                }
                if(Z0.a(atomicReferenceArray0, v, s2, s1)) {
                    if(!s2.v()) {
                        break alab1;
                    }
                    s2.q();
                    return object0;
                }
                if(s1.v()) {
                    s1.q();
                }
            }
        }
        return object0;
    }

    @l
    public static final Object g(@l S s0, long v, @l o o0) {
        while(true) {
            if(s0.c >= v && !s0.m()) {
                return s0;
            }
            Object object0 = s0.g();
            if(object0 == f.b) {
                return f.b;
            }
            S s1 = (S)(((g)object0));
            if(s1 == null) {
                s1 = (S)o0.invoke(((long)(s0.c + 1L)), s0);
                if(!s0.t(s1)) {
                    continue;
                }
                if(s0.m()) {
                    s0.q();
                }
            }
            s0 = s1;
        }
    }

    private static final void h(Object object0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, Function1 function10) {
        while(true) {
            function10.invoke(atomicReferenceFieldUpdater0.get(object0));
        }
    }

    private static final void i(AtomicReferenceArray atomicReferenceArray0, int v, Function1 function10) {
        while(true) {
            function10.invoke(atomicReferenceArray0.get(v));
        }
    }

    public static final boolean j(Object object0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, S s0) {
        while(true) {
            S s1 = (S)atomicReferenceFieldUpdater0.get(object0);
            if(s1.c >= s0.c) {
                return true;
            }
            if(!s0.C()) {
                return false;
            }
            if(a.a(atomicReferenceFieldUpdater0, object0, s1, s0)) {
                if(s1.v()) {
                    s1.q();
                }
                return true;
            }
            if(s0.v()) {
                s0.q();
            }
        }
    }

    public static final boolean k(AtomicReferenceArray atomicReferenceArray0, int v, S s0) {
        while(true) {
            S s1 = (S)atomicReferenceArray0.get(v);
            if(s1.c >= s0.c) {
                return true;
            }
            if(!s0.C()) {
                return false;
            }
            if(Z0.a(atomicReferenceArray0, v, s1, s0)) {
                if(s1.v()) {
                    s1.q();
                }
                return true;
            }
            if(s0.v()) {
                s0.q();
            }
        }
    }
}

