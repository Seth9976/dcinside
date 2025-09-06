package rx.internal.util;

import java.util.concurrent.atomic.AtomicLong;
import rx.i;

public final class d extends AtomicLong implements i {
    public interface a {
        boolean accept(Object arg1);

        void o(Throwable arg1);

        Object peek();

        Object poll();
    }

    boolean a;
    volatile boolean b;
    Throwable c;
    final a d;
    private static final long e = 0x2738D34F11CD4869L;

    public d(a d$a0) {
        this.d = d$a0;
    }

    public void a() {
        boolean z1;
        boolean z;
        long v3;
        int v1;
        a d$a0;
        synchronized(this) {
            if(this.a) {
                return;
            }
            z = true;
            this.a = true;
            z1 = this.b;
        }
        long v = this.get();
        try {
            d$a0 = this.d;
        alab1:
            while(true) {
            label_10:
                v1 = 0;
                while(true) {
                    int v2 = Long.compare(v, 0L);
                    if(v2 <= 0 && !z1) {
                        goto label_25;
                    }
                    if(z1) {
                        if(d$a0.peek() == null) {
                            goto label_23;
                        }
                        if(v2 != 0) {
                            goto label_16;
                        }
                        goto label_25;
                    }
                label_16:
                    Object object0 = d$a0.poll();
                    if(object0 == null) {
                        goto label_25;
                    }
                    if(d$a0.accept(object0)) {
                        break alab1;
                    }
                    --v;
                    ++v1;
                }
            }
        }
        catch(Throwable throwable0) {
            z = false;
            goto label_56;
        }
        return;
        try {
        label_23:
            d$a0.o(this.c);
            return;
        }
        catch(Throwable throwable0) {
            goto label_56;
        }
        try {
        label_25:
            __monitor_enter(this);
        }
        catch(Throwable throwable0) {
            z = false;
            goto label_56;
        }
        try {
            z1 = this.b;
            boolean z2 = d$a0.peek() != null;
            if(this.get() == 0x7FFFFFFFFFFFFFFFL) {
                goto label_40;
            }
            else {
                v3 = this.addAndGet(((long)(-v1)));
                if((v3 == 0L || !z2) && (!z1 || z2)) {
                    goto label_35;
                }
                v = v3;
            }
            goto label_45;
        }
        catch(Throwable throwable1) {
            goto label_48;
        }
        try {
        label_35:
            this.a = false;
            __monitor_exit(this);
            return;
        }
        catch(Throwable throwable1) {
            goto label_49;
        }
        try {
            v = v3;
            goto label_45;
        }
        catch(Throwable throwable1) {
            goto label_48;
        }
    label_40:
        if(z2 || z1) {
            v = 0x7FFFFFFFFFFFFFFFL;
            try {
            label_45:
                __monitor_exit(this);
                goto label_10;
            }
            catch(Throwable throwable1) {
            label_48:
                z = false;
                while(true) {
                    try {
                    label_49:
                        __monitor_exit(this);
                        throw throwable1;
                    }
                    catch(Throwable throwable1) {
                    }
                }
            }
        }
        else {
            try {
                this.a = false;
                __monitor_exit(this);
                return;
            }
            catch(Throwable throwable1) {
            }
        }
        goto label_49;
        try {
            throw throwable1;
        }
        catch(Throwable throwable0) {
        }
    label_56:
        if(!z) {
            synchronized(this) {
                this.a = false;
            }
        }
        throw throwable0;
    }

    public boolean b() {
        return this.b;
    }

    public void c() {
        this.b = true;
    }

    public void d(Throwable throwable0) {
        if(!this.b) {
            this.c = throwable0;
            this.b = true;
        }
    }

    public void e() {
        this.b = true;
        this.a();
    }

    public void f(Throwable throwable0) {
        if(!this.b) {
            this.c = throwable0;
            this.b = true;
            this.a();
        }
    }

    @Override  // rx.i
    public void request(long v) {
        if(v == 0L) {
            return;
        }
        while(true) {
            long v1 = this.get();
            int v2 = 1;
            int v3 = v1 == 0L ? 1 : 0;
            long v4 = 0x7FFFFFFFFFFFFFFFL;
            if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                break;
            }
            if(v != 0x7FFFFFFFFFFFFFFFL) {
                if(v1 <= 0x7FFFFFFFFFFFFFFFL - v) {
                    v4 = v1 + v;
                }
                v2 = v3;
            }
            if(this.compareAndSet(v1, v4)) {
                v3 = v2;
                break;
            }
        }
        if(v3 != 0) {
            this.a();
        }
    }
}

