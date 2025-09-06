package kotlin.ranges;

import B3.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.D0;
import kotlin.h0;
import kotlin.y0;

@h0(version = "1.3")
final class w implements a, Iterator {
    private final int a;
    private boolean b;
    private final int c;
    private int d;

    private w(int v, int v1, int v2) {
        this.a = v1;
        boolean z = false;
        int v3 = y0.a(v, v1);
        if(v2 <= 0) {
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

    public w(int v, int v1, int v2, kotlin.jvm.internal.w w0) {
        this(v, v1, v2);
    }

    public int a() {
        int v = this.d;
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
        return D0.b(this.a());
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

