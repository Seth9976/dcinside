package j$.util.stream;

import java.util.concurrent.CountedCompleter;

class y1 extends CountedCompleter {
    protected final J0 a;
    protected final int b;
    public final int c;
    private final Object d;

    public y1(J0 j00, Object object0, int v) {
        this.c = v;
        super();
        this.a = j00;
        this.b = 0;
        this.d = object0;
    }

    public y1(y1 y10, I0 i00, int v) {
        this.c = 0;
        this(y10, i00, v, 0);
        this.d = y10.d;
    }

    public y1(y1 y10, J0 j00, int v) {
        this.c = 1;
        this(y10, j00, v, 0);
        this.d = (Object[])y10.d;
    }

    y1(y1 y10, J0 j00, int v, byte b) {
        super(y10);
        this.a = j00;
        this.b = v;
    }

    final y1 a(int v, int v1) {
        return this.c == 0 ? new y1(this, ((I0)this.a).b(v), v1) : new y1(this, this.a.b(v), v1);
    }

    @Override
    public final void compute() {
        while(this.a.q() != 0) {
            this.setPendingCount(this.a.q() - 1);
            int v = 0;
            int v1 = 0;
            while(v < this.a.q() - 1) {
                y1 y10 = this.a(v, this.b + v1);
                v1 = (int)(((long)v1) + y10.a.count());
                y10.fork();
                ++v;
            }
            this = this.a(v, this.b + v1);
        }
        if(this.c == 0) {
            ((I0)this.a).r(this.b, this.d);
        }
        else {
            this.a.i(((Object[])this.d), this.b);
        }
        this.propagateCompletion();
    }
}

