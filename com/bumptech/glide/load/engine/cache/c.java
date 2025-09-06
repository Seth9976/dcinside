package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.m;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class c {
    static class a {
        final Lock a;
        int b;

        a() {
            this.a = new ReentrantLock();
        }
    }

    static class b {
        private final Queue a;
        private static final int b = 10;

        b() {
            this.a = new ArrayDeque();
        }

        a a() {
            a c$a0;
            synchronized(this.a) {
                c$a0 = (a)this.a.poll();
            }
            return c$a0 == null ? new a() : c$a0;
        }

        void b(a c$a0) {
            synchronized(this.a) {
                if(this.a.size() < 10) {
                    this.a.offer(c$a0);
                }
            }
        }
    }

    private final Map a;
    private final b b;

    c() {
        this.a = new HashMap();
        this.b = new b();
    }

    void a(String s) {
        a c$a0;
        synchronized(this) {
            c$a0 = (a)this.a.get(s);
            if(c$a0 == null) {
                c$a0 = this.b.a();
                this.a.put(s, c$a0);
            }
            ++c$a0.b;
        }
        c$a0.a.lock();
    }

    void b(String s) {
        a c$a0;
        synchronized(this) {
            c$a0 = (a)m.e(this.a.get(s));
            int v1 = c$a0.b;
            if(v1 >= 1) {
                c$a0.b = v1 - 1;
                if(v1 - 1 == 0) {
                    a c$a1 = (a)this.a.remove(s);
                    if(!c$a1.equals(c$a0)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c$a0 + ", but actually removed: " + c$a1 + ", safeKey: " + s);
                    }
                    this.b.b(c$a1);
                }
                c$a0.a.unlock();
                return;
            }
        }
        throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + s + ", interestedThreads: " + c$a0.b);
    }
}

