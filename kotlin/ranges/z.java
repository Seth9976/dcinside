package kotlin.ranges;

import B3.a;
import androidx.collection.b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.H0;
import kotlin.h0;
import kotlin.jvm.internal.w;

@h0(version = "1.3")
final class z implements a, Iterator {
    private final long a;
    private boolean b;
    private final long c;
    private long d;

    private z(long v, long v1, long v2) {
        this.a = v1;
        boolean z = false;
        int v3 = b.a(v, v1);
        if(Long.compare(v2, 0L) <= 0) {
            if(v3 >= 0) {
                z = true;
            }
        }
        else if(v3 <= 0) {
            z = true;
        }
        this.b = z;
        this.c = v2;
        if(!this.b) {
            v = v1;
        }
        this.d = v;
    }

    public z(long v, long v1, long v2, w w0) {
        this(v, v1, v2);
    }

    public long a() {
        long v = this.d;
        if(v == this.a) {
            if(!this.b) {
                throw new NoSuchElementException();
            }
            this.b = false;
            return v;
        }
        this.d = this.c + v;
        return v;
    }

    @Override
    public boolean hasNext() {
        return this.b;
    }

    @Override
    public Object next() {
        return H0.b(this.a());
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

