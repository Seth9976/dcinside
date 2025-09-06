package rx.internal.schedulers;

import rx.exceptions.c;
import rx.functions.a;

class m implements a {
    private final a a;
    private final rx.j.a b;
    private final long c;

    public m(a a0, rx.j.a j$a0, long v) {
        this.a = a0;
        this.b = j$a0;
        this.c = v;
    }

    @Override  // rx.functions.a
    public void call() {
        if(this.b.j()) {
            return;
        }
        long v = this.c - this.b.a();
        if(v > 0L) {
            try {
                Thread.sleep(v);
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                c.c(interruptedException0);
            }
        }
        if(this.b.j()) {
            return;
        }
        this.a.call();
    }
}

