package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.T;

public final class k extends T {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public k(int v, int v1, int v2) {
        this.a = v2;
        this.b = v1;
        boolean z = false;
        if(v2 <= 0) {
            if(v >= v1) {
                z = true;
            }
        }
        else if(v <= v1) {
            z = true;
        }
        this.c = z;
        if(!z) {
            v = v1;
        }
        this.d = v;
    }

    @Override  // kotlin.collections.T
    public int b() {
        int v = this.d;
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

    public final int c() {
        return this.a;
    }

    @Override
    public boolean hasNext() {
        return this.c;
    }
}

