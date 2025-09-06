package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.U;

public final class n extends U {
    private final long a;
    private final long b;
    private boolean c;
    private long d;

    public n(long v, long v1, long v2) {
        this.a = v2;
        this.b = v1;
        boolean z = false;
        int v3 = Long.compare(v, v1);
        if(Long.compare(v2, 0L) <= 0) {
            if(v3 >= 0) {
                z = true;
            }
        }
        else if(v3 <= 0) {
            z = true;
        }
        this.c = z;
        if(!z) {
            v = v1;
        }
        this.d = v;
    }

    @Override  // kotlin.collections.U
    public long b() {
        long v = this.d;
        if(v == this.b) {
            if(!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
            return v;
        }
        this.d = this.a + v;
        return v;
    }

    public final long c() {
        return this.a;
    }

    @Override
    public boolean hasNext() {
        return this.c;
    }
}

