package com.facebook.drawee.components;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import java.util.ArrayList;
import k1.n.a;
import k1.n;

@n(a.a)
class b extends com.facebook.drawee.components.a {
    class com.facebook.drawee.components.b.a implements Runnable {
        final b a;

        @Override
        @MainThread
        public void run() {
            synchronized(b.this.b) {
                b.this.e = b.this.d;
                b.this.d = b.this.e;
            }
            int v1 = b.this.e.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((com.facebook.drawee.components.a.a)b.this.e.get(v2)).release();
            }
            b.this.e.clear();
        }
    }

    private final Object b;
    private final Handler c;
    private ArrayList d;
    private ArrayList e;
    private final Runnable f;

    public b() {
        this.b = new Object();
        this.f = new com.facebook.drawee.components.b.a(this);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.c = new Handler(Looper.getMainLooper());
    }

    @Override  // com.facebook.drawee.components.a
    @AnyThread
    public void a(com.facebook.drawee.components.a.a a$a0) {
        synchronized(this.b) {
            this.d.remove(a$a0);
        }
    }

    @Override  // com.facebook.drawee.components.a
    @AnyThread
    public void d(com.facebook.drawee.components.a.a a$a0) {
        if(!com.facebook.drawee.components.a.c()) {
            a$a0.release();
            return;
        }
        synchronized(this.b) {
            if(this.d.contains(a$a0)) {
                return;
            }
            this.d.add(a$a0);
            boolean z = this.d.size() == 1;
        }
        if(z) {
            this.c.post(this.f);
        }
    }
}

