package bolts;

import java.io.Closeable;

public class e implements Closeable {
    private final Object a;
    private f b;
    private Runnable c;
    private boolean d;

    e(f f0, Runnable runnable0) {
        this.a = new Object();
        this.b = f0;
        this.c = runnable0;
    }

    void a() {
        synchronized(this.a) {
            this.b();
            this.c.run();
            this.close();
        }
    }

    private void b() {
        if(this.d) {
            throw new IllegalStateException("Object already closed");
        }
    }

    @Override
    public void close() {
        synchronized(this.a) {
            if(this.d) {
                return;
            }
            this.d = true;
            this.b.s(this);
            this.b = null;
            this.c = null;
        }
    }
}

