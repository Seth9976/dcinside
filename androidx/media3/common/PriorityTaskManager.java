package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

@UnstableApi
public final class PriorityTaskManager {
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int v, int v1) {
            super("Priority too low [priority=" + v + ", highest=" + v1 + "]");
        }
    }

    private final Object a;
    private final PriorityQueue b;
    private int c;

    public PriorityTaskManager() {
        this.a = new Object();
        this.b = new PriorityQueue(10, Collections.reverseOrder());
        this.c = 0x80000000;
    }

    public void a(int v) {
        synchronized(this.a) {
            this.b.add(v);
            this.c = Math.max(this.c, v);
        }
    }

    public void b(int v) throws InterruptedException {
        synchronized(this.a) {
            while(this.c != v) {
                this.a.wait();
            }
        }
    }

    public boolean c(int v) {
        synchronized(this.a) {
        }
        return this.c == v;
    }

    public void d(int v) throws PriorityTooLowException {
        synchronized(this.a) {
            if(this.c == v) {
                return;
            }
        }
        throw new PriorityTooLowException(v, this.c);
    }

    public void e(int v) {
        synchronized(this.a) {
            this.b.remove(v);
            this.c = this.b.isEmpty() ? 0x80000000 : ((int)(((Integer)Util.o(((Integer)this.b.peek())))));
            this.a.notifyAll();
        }
    }
}

