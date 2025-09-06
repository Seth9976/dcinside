package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.t;
import kotlin.jvm.internal.L;

public final class b extends t {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public b(char c, char c1, int v) {
        this.a = v;
        this.b = c1;
        boolean z = false;
        if(v <= 0) {
            if(L.t(c, c1) >= 0) {
                z = true;
            }
        }
        else if(L.t(c, c1) <= 0) {
            z = true;
        }
        this.c = z;
        if(!z) {
            c = c1;
        }
        this.d = c;
    }

    @Override  // kotlin.collections.t
    public char b() {
        int v = this.d;
        if(v == this.b) {
            if(!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
            return (char)v;
        }
        this.d = this.a + v;
        return (char)v;
    }

    public final int c() {
        return this.a;
    }

    @Override
    public boolean hasNext() {
        return this.c;
    }
}

