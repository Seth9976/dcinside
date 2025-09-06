package io.reactivex.internal.disposables;

import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class a extends AtomicReferenceArray implements c {
    private static final long a = 0x261D229F8C0B4B20L;

    public a(int v) {
        super(v);
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.get(0) == d.a;
    }

    public c b(int v, c c0) {
        c c1;
        do {
            c1 = (c)this.get(v);
            if(c1 == d.a) {
                c0.dispose();
                return null;
            }
        }
        while(!this.compareAndSet(v, c1, c0));
        return c1;
    }

    public boolean c(int v, c c0) {
        c c1;
        do {
            c1 = (c)this.get(v);
            if(c1 == d.a) {
                c0.dispose();
                return false;
            }
        }
        while(!this.compareAndSet(v, c1, c0));
        if(c1 != null) {
            c1.dispose();
        }
        return true;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        if(this.get(0) != d.a) {
            int v1 = this.length();
            for(int v = 0; v < v1; ++v) {
                c c0 = (c)this.get(v);
                d d0 = d.a;
                if(c0 != d0) {
                    c c1 = (c)this.getAndSet(v, d0);
                    if(c1 != d0 && c1 != null) {
                        c1.dispose();
                    }
                }
            }
        }
    }
}

