package com.igaworks.ssp;

import android.os.Handler;

public class x {
    static abstract class a {
    }

    class b implements Runnable {
        private boolean a;
        final x b;

        private b() {
            this.a = false;
        }

        b(a x$a0) {
        }

        public void a(boolean z) {
            this.a = z;
        }

        @Override
        public void run() {
            if(!this.a && x.this.b != null) {
                x.this.b.a();
            }
        }
    }

    private b a;
    private z b;
    private Handler c;
    private long d;
    private long e;
    private long f;

    public x() {
        this.d = 0L;
        this.e = 0L;
        this.f = 12000L;
    }

    public void a() {
        Handler handler0 = this.c;
        if(handler0 != null) {
            try {
                handler0.removeCallbacks(this.a);
                this.c = null;
            }
            catch(Exception exception0) {
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            }
        }
        b x$b0 = this.a;
        if(x$b0 != null) {
            try {
                x$b0.a(true);
                this.a = null;
            }
            catch(Exception exception1) {
                exception1.printStackTrace();
            }
        }
        if(this.b != null) {
            this.b = null;
        }
        this.e = 0L;
        this.f = 0L;
        this.d = 0L;
    }

    public void a(long v, z z0) {
        try {
            this.f = v;
            this.d = System.currentTimeMillis();
            this.b = z0;
            b x$b0 = new b(this, null);
            this.a = x$b0;
            x$b0.a(false);
            Handler handler0 = new Handler();
            this.c = handler0;
            handler0.postDelayed(this.a, v);
        }
        catch(Exception exception0) {
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        }
    }
}

