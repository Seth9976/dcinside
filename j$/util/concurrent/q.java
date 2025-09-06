package j$.util.concurrent;

import j..sun.misc.a;
import java.util.concurrent.locks.LockSupport;

final class q extends l {
    r e;
    volatile r f;
    volatile Thread g;
    private static final a h;
    private static final long i;
    volatile int lockState;

    static {
        a a0 = a.h();
        q.h = a0;
        q.i = a0.j(q.class, "lockState");
    }

    q(r r0) {
        super(-2, null, null);
        int v2;
        this.f = r0;
        r r1 = null;
        while(r0 != null) {
            r r2 = (r)r0.d;
            r0.g = null;
            r0.f = null;
            if(r1 == null) {
                r0.e = null;
                r0.i = false;
            }
            else {
                Object object0 = r0.b;
                int v = r0.a;
                r r3 = r1;
                Class class0 = null;
                while(true) {
                    Object object1 = r3.b;
                    int v1 = r3.a;
                    if(v1 > v) {
                        v2 = -1;
                    }
                    else if(v1 < v) {
                        v2 = 1;
                    }
                    else {
                        if(class0 == null) {
                            class0 = ConcurrentHashMap.c(object0);
                            if(class0 == null) {
                                v2 = q.i(object0, object1);
                                goto label_30;
                            }
                        }
                        int v3 = object1 == null || object1.getClass() != class0 ? 0 : ((Comparable)object0).compareTo(object1);
                        v2 = v3 == 0 ? q.i(object0, object1) : v3;
                    }
                label_30:
                    r r4 = v2 > 0 ? r3.g : r3.f;
                    if(r4 == null) {
                        break;
                    }
                    r3 = r4;
                }
                r0.e = r3;
                if(v2 <= 0) {
                    r3.f = r0;
                }
                else {
                    r3.g = r0;
                }
                r0 = q.c(r1, r0);
            }
            r1 = r0;
            r0 = r2;
        }
        this.e = r1;
    }

    @Override  // j$.util.concurrent.l
    final l a(int v, Object object0) {
        l l0 = this.f;
        while(true) {
            l l1 = null;
            if(l0 == null) {
                break;
            }
            int v1 = this.lockState;
            if((v1 & 3) == 0) {
                a a0 = q.h;
                long v2 = q.i;
                if(a0.c(this, v2, v1, v1 + 4)) {
                    r r0 = this.e;
                    if(r0 != null) {
                        try {
                            l1 = r0.b(v, object0, null);
                        }
                        catch(Throwable throwable0) {
                            if(q.h.f(this, q.i) == 6) {
                                Thread thread0 = this.g;
                                if(thread0 != null) {
                                    LockSupport.unpark(thread0);
                                }
                            }
                            throw throwable0;
                        }
                    }
                    if(a0.f(this, v2) == 6) {
                        Thread thread1 = this.g;
                        if(thread1 != null) {
                            LockSupport.unpark(thread1);
                        }
                    }
                    return l1;
                }
            }
            else {
                if(l0.a == v && (l0.b == object0 || l0.b != null && object0.equals(l0.b))) {
                    return l0;
                }
                l0 = l0.d;
            }
        }
        return null;
    }

    static r b(r r0, r r1) {
        while(r1 != null && r1 != r0) {
            r r2 = r1.e;
            if(r2 == null) {
                r1.i = false;
                return r1;
            }
            if(r1.i) {
                r1.i = false;
                return r0;
            }
            r r3 = r2.f;
            r r4 = null;
            if(r3 == r1) {
                r r5 = r2.g;
                if(r5 != null && r5.i) {
                    r5.i = false;
                    r2.i = true;
                    r0 = q.g(r0, r2);
                    r2 = r1.e;
                    r5 = r2 == null ? null : r2.g;
                }
                if(r5 != null) {
                    r r6 = r5.f;
                    r r7 = r5.g;
                    if((r7 == null || !r7.i) && (r6 == null || !r6.i)) {
                        r5.i = true;
                        goto label_73;
                    }
                    else {
                        if(r7 == null || !r7.i) {
                            if(r6 != null) {
                                r6.i = false;
                            }
                            r5.i = true;
                            r0 = q.h(r0, r5);
                            r2 = r1.e;
                            if(r2 != null) {
                                r4 = r2.g;
                            }
                            r5 = r4;
                        }
                        if(r5 != null) {
                            r5.i = r2 == null ? false : r2.i;
                            r r8 = r5.g;
                            if(r8 != null) {
                                r8.i = false;
                            }
                        }
                        if(r2 != null) {
                            r2.i = false;
                            r0 = q.g(r0, r2);
                        }
                        r1 = r0;
                        continue;
                    }
                    goto label_43;
                }
            }
            else {
            label_43:
                if(r3 != null && r3.i) {
                    r3.i = false;
                    r2.i = true;
                    r0 = q.h(r0, r2);
                    r2 = r1.e;
                    r3 = r2 == null ? null : r2.f;
                }
                if(r3 != null) {
                    r r9 = r3.f;
                    r r10 = r3.g;
                    if((r9 == null || !r9.i) && (r10 == null || !r10.i)) {
                        r3.i = true;
                    }
                    else {
                        if(r9 == null || !r9.i) {
                            if(r10 != null) {
                                r10.i = false;
                            }
                            r3.i = true;
                            r0 = q.g(r0, r3);
                            r2 = r1.e;
                            if(r2 != null) {
                                r4 = r2.f;
                            }
                            r3 = r4;
                        }
                        if(r3 != null) {
                            r3.i = r2 == null ? false : r2.i;
                            r r11 = r3.f;
                            if(r11 != null) {
                                r11.i = false;
                            }
                        }
                        if(r2 != null) {
                            r2.i = false;
                            r0 = q.h(r0, r2);
                        }
                        r1 = r0;
                        continue;
                    }
                }
            }
        label_73:
            r1 = r2;
        }
        return r0;
    }

    static r c(r r0, r r1) {
        r1.i = true;
        while(true) {
            r r2 = r1.e;
            if(r2 == null) {
                r1.i = false;
                return r1;
            }
            if(!r2.i) {
                break;
            }
            r r3 = r2.e;
            if(r3 == null) {
                break;
            }
            r r4 = r3.f;
            if(r2 == r4) {
                r r5 = r3.g;
                if(r5 == null || !r5.i) {
                    if(r1 == r2.g) {
                        r0 = q.g(r0, r2);
                        r3 = r2.e == null ? null : r2.e.e;
                        r r6 = r2;
                        r2 = r2.e;
                        r1 = r6;
                    }
                    if(r2 == null) {
                        continue;
                    }
                    r2.i = false;
                    if(r3 == null) {
                        continue;
                    }
                    r3.i = true;
                    r0 = q.h(r0, r3);
                }
                else {
                    r5.i = false;
                    r2.i = false;
                    r3.i = true;
                    r1 = r3;
                }
                continue;
            }
            else if(r4 == null || !r4.i) {
                goto label_34;
            }
            else {
                r4.i = false;
                r2.i = false;
                r3.i = true;
            }
            r1 = r3;
            continue;
        label_34:
            if(r1 == r2.f) {
                r0 = q.h(r0, r2);
                r3 = r2.e == null ? null : r2.e.e;
                r r7 = r2;
                r2 = r2.e;
                r1 = r7;
            }
            if(r2 != null) {
                r2.i = false;
                if(r3 != null) {
                    r3.i = true;
                    r0 = q.g(r0, r3);
                }
            }
        }
        return r0;
    }

    private final void d() {
        if(!q.h.c(this, q.i, 0, 1)) {
            boolean z = false;
            while(true) {
            alab1:
                while(true) {
                    do {
                    label_2:
                        int v = this.lockState;
                        if((v & -3) == 0) {
                            break alab1;
                        }
                        if((v & 2) != 0) {
                            goto label_9;
                        }
                    }
                    while(!q.h.c(this, q.i, v, v | 2));
                    this.g = Thread.currentThread();
                    z = true;
                    goto label_2;
                label_9:
                    if(z) {
                        LockSupport.park(this);
                    }
                }
                if(!q.h.c(this, q.i, v, 1)) {
                    goto label_2;
                }
                break;
            }
            if(z) {
                this.g = null;
            }
        }
    }

    final r e(int v, Object object0, Object object1) {
        int v2;
        r r0 = this.e;
        Class class0 = null;
        boolean z = false;
        while(true) {
            if(r0 == null) {
                r r1 = new r(v, object0, object1, null, null);
                this.e = r1;
                this.f = r1;
                return null;
            }
            int v1 = r0.a;
            if(v1 > v) {
                v2 = -1;
            }
            else if(v1 < v) {
                v2 = 1;
            }
            else {
                Object object2 = r0.b;
                if(object2 == object0 || object2 != null && object0.equals(object2)) {
                    break;
                }
                if(class0 == null) {
                    class0 = ConcurrentHashMap.c(object0);
                    if(class0 != null) {
                        goto label_20;
                    }
                    goto label_22;
                }
            label_20:
                int v3 = object2 == null || object2.getClass() != class0 ? 0 : ((Comparable)object0).compareTo(object2);
                if(v3 == 0) {
                label_22:
                    if(!z) {
                        r r2 = r0.f;
                        if(r2 != null) {
                            r r3 = r2.b(v, object0, class0);
                            if(r3 != null) {
                                return r3;
                            }
                        }
                        r r4 = r0.g;
                        if(r4 != null) {
                            r r5 = r4.b(v, object0, class0);
                            if(r5 != null) {
                                return r5;
                            }
                        }
                        z = true;
                    }
                    v2 = q.i(object0, object2);
                }
                else {
                    v2 = v3;
                }
            }
            r r6 = v2 > 0 ? r0.g : r0.f;
            if(r6 == null) {
                r r7 = this.f;
                r r8 = new r(v, object0, object1, r7, r0);
                this.f = r8;
                if(r7 != null) {
                    r7.h = r8;
                }
                if(v2 <= 0) {
                    r0.f = r8;
                }
                else {
                    r0.g = r8;
                }
                if(!r0.i) {
                    r8.i = true;
                    return null;
                }
                this.d();
                try {
                    this.e = q.c(this.e, r8);
                    this.lockState = 0;
                    return null;
                }
                catch(Throwable throwable0) {
                    this.lockState = 0;
                    throw throwable0;
                }
            }
            r0 = r6;
        }
        return r0;
    }

    final boolean f(r r0) {
        r r1 = (r)r0.d;
        r r2 = r0.h;
        if(r2 == null) {
            this.f = r1;
        }
        else {
            r2.d = r1;
        }
        if(r1 != null) {
            r1.h = r2;
        }
        if(this.f == null) {
            this.e = null;
            return true;
        }
        r r3 = this.e;
        if(r3 != null && r3.g != null && (r3.f != null && r3.f.f != null)) {
            this.d();
            try {
                r r4 = r0.f;
                r r5 = r0.g;
                if(r4 != null && r5 != null) {
                    r r6 = r5;
                    r r7;
                    while((r7 = r6.f) != null) {
                        r6 = r7;
                    }
                    boolean z = r6.i;
                    r6.i = r0.i;
                    r0.i = z;
                    r r8 = r6.g;
                    r r9 = r0.e;
                    if(r6 == r5) {
                        r0.e = r6;
                        r6.g = r0;
                    }
                    else {
                        r r10 = r6.e;
                        r0.e = r10;
                        if(r10 != null) {
                            if(r6 == r10.f) {
                                r10.f = r0;
                            }
                            else {
                                r10.g = r0;
                            }
                        }
                        r6.g = r5;
                        r5.e = r6;
                    }
                    r0.f = null;
                    r0.g = r8;
                    if(r8 != null) {
                        r8.e = r0;
                    }
                    r6.f = r4;
                    r4.e = r6;
                    r6.e = r9;
                    if(r9 == null) {
                        r3 = r6;
                    }
                    else if(r0 == r9.f) {
                        r9.f = r6;
                    }
                    else {
                        r9.g = r6;
                    }
                    r4 = r8 == null ? r0 : r8;
                }
                else if(r4 == null) {
                    r4 = r5 == null ? r0 : r5;
                }
                if(r4 != r0) {
                    r r11 = r0.e;
                    r4.e = r11;
                    if(r11 == null) {
                        r3 = r4;
                    }
                    else if(r0 == r11.f) {
                        r11.f = r4;
                    }
                    else {
                        r11.g = r4;
                    }
                    r0.e = null;
                    r0.g = null;
                    r0.f = null;
                }
                if(!r0.i) {
                    r3 = q.b(r3, r4);
                }
                this.e = r3;
                if(r0 == r4) {
                    r r12 = r0.e;
                    if(r12 != null) {
                        if(r0 == r12.f) {
                            r12.f = null;
                        }
                        else if(r0 == r12.g) {
                            r12.g = null;
                        }
                        r0.e = null;
                    }
                }
                return false;
            }
            finally {
                this.lockState = 0;
            }
        }
        return true;
    }

    static r g(r r0, r r1) {
        if(r1 != null) {
            r r2 = r1.g;
            if(r2 != null) {
                r r3 = r2.f;
                r1.g = r3;
                if(r3 != null) {
                    r3.e = r1;
                }
                r r4 = r1.e;
                r2.e = r4;
                if(r4 == null) {
                    r2.i = false;
                    r0 = r2;
                }
                else if(r4.f == r1) {
                    r4.f = r2;
                }
                else {
                    r4.g = r2;
                }
                r2.f = r1;
                r1.e = r2;
            }
        }
        return r0;
    }

    static r h(r r0, r r1) {
        if(r1 != null) {
            r r2 = r1.f;
            if(r2 != null) {
                r r3 = r2.g;
                r1.f = r3;
                if(r3 != null) {
                    r3.e = r1;
                }
                r r4 = r1.e;
                r2.e = r4;
                if(r4 == null) {
                    r2.i = false;
                    r0 = r2;
                }
                else if(r4.g == r1) {
                    r4.g = r2;
                }
                else {
                    r4.f = r2;
                }
                r2.g = r1;
                r1.e = r2;
            }
        }
        return r0;
    }

    static int i(Object object0, Object object1) {
        if(object0 != null && object1 != null) {
            int v = object0.getClass().getName().compareTo(object1.getClass().getName());
            if(v != 0) {
                return v;
            }
        }
        return System.identityHashCode(object0) > System.identityHashCode(object1) ? 1 : -1;
    }
}

