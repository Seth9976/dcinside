package androidx.media3.common.util;

import jeb.synthetic.FIN;

@UnstableApi
public class ConditionVariable {
    private final Clock a;
    private boolean b;

    public ConditionVariable() {
        this(Clock.a);
    }

    public ConditionVariable(Clock clock0) {
        this.a = clock0;
    }

    public void a() throws InterruptedException {
        synchronized(this) {
            while(!this.b) {
                this.wait();
            }
        }
    }

    public boolean b(long v) throws InterruptedException {
        synchronized(this) {
            if(v <= 0L) {
                return this.b;
            }
            long v2 = this.a.elapsedRealtime();
            long v3 = v + v2;
            if(v3 < v2) {
                this.a();
            }
            else {
                while(!this.b && v2 < v3) {
                    this.wait(v3 - v2);
                    v2 = this.a.elapsedRealtime();
                }
            }
            return this.b;
        }
    }

    public void c() {
        int v;
        __monitor_enter(this);
        boolean z = false;
    alab1:
        while(true) {
            v = FIN.finallyOpen$NT();
            while(true) {
                if(this.b) {
                    break alab1;
                }
                try {
                    this.wait();
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                    break;
                }
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        FIN.finallyCodeBegin$NT(v);
        __monitor_exit(this);
        FIN.finallyCodeEnd$NT(v);
    }

    public boolean d() {
        boolean z;
        synchronized(this) {
            z = this.b;
            this.b = false;
        }
        return z;
    }

    public boolean e() {
        synchronized(this) {
        }
        return this.b;
    }

    public boolean f() {
        synchronized(this) {
            if(this.b) {
                return false;
            }
            this.b = true;
            this.notifyAll();
            return true;
        }
    }
}

