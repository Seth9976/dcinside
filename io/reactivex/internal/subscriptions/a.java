package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.e;

public final class a extends AtomicReferenceArray implements c {
    private static final long a = 0x261D229F8C0B4B20L;

    public a(int v) {
        super(v);
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.get(0) == j.a;
    }

    public e b(int v, e e0) {
        e e1;
        do {
            e1 = (e)this.get(v);
            if(e1 == j.a) {
                if(e0 != null) {
                    e0.cancel();
                }
                return null;
            }
        }
        while(!this.compareAndSet(v, e1, e0));
        return e1;
    }

    public boolean c(int v, e e0) {
        e e1;
        do {
            e1 = (e)this.get(v);
            if(e1 == j.a) {
                if(e0 != null) {
                    e0.cancel();
                }
                return false;
            }
        }
        while(!this.compareAndSet(v, e1, e0));
        if(e1 != null) {
            e1.cancel();
        }
        return true;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        if(this.get(0) != j.a) {
            int v1 = this.length();
            for(int v = 0; v < v1; ++v) {
                e e0 = (e)this.get(v);
                j j0 = j.a;
                if(e0 != j0) {
                    e e1 = (e)this.getAndSet(v, j0);
                    if(e1 != j0 && e1 != null) {
                        e1.cancel();
                    }
                }
            }
        }
    }
}

