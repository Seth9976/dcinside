package kotlin.sequences;

import B3.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class n extends o implements a, Iterator, d {
    private int a;
    @m
    private Object b;
    @m
    private Iterator c;
    @m
    private d d;

    @Override  // kotlin.sequences.o
    @m
    public Object a(Object object0, @l d d0) {
        this.b = object0;
        this.a = 3;
        this.d = d0;
        Object object1 = b.l();
        if(object1 == b.l()) {
            h.c(d0);
        }
        return object1 == b.l() ? object1 : S0.a;
    }

    @Override  // kotlin.sequences.o
    @m
    public Object d(@l Iterator iterator0, @l d d0) {
        if(!iterator0.hasNext()) {
            return S0.a;
        }
        this.c = iterator0;
        this.a = 2;
        this.d = d0;
        Object object0 = b.l();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0 == b.l() ? object0 : S0.a;
    }

    private final Throwable g() {
        switch(this.a) {
            case 4: {
                return new NoSuchElementException();
            }
            case 5: {
                return new IllegalStateException("Iterator has failed.");
            }
            default: {
                return new IllegalStateException("Unexpected state of the iterator: " + this.a);
            }
        }
    }

    @Override  // kotlin.coroutines.d
    @l
    public g getContext() {
        return i.a;
    }

    @m
    public final d h() {
        return this.d;
    }

    @Override
    public boolean hasNext() {
        while(true) {
            int v = this.a;
            if(v != 0) {
                switch(v) {
                    case 1: {
                        Iterator iterator0 = this.c;
                        L.m(iterator0);
                        if(iterator0.hasNext()) {
                            this.a = 2;
                            return true;
                        }
                        this.c = null;
                        break;
                    }
                    case 2: 
                    case 3: {
                        return true;
                    }
                    case 4: {
                        return false;
                    }
                    default: {
                        throw this.g();
                    }
                }
            }
            this.a = 5;
            d d0 = this.d;
            L.m(d0);
            this.d = null;
            d0.resumeWith(S0.a);
        }
    }

    private final Object i() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.next();
    }

    public final void j(@m d d0) {
        this.d = d0;
    }

    @Override
    public Object next() {
        switch(this.a) {
            case 0: 
            case 1: {
                return this.i();
            }
            case 2: {
                this.a = 1;
                Iterator iterator0 = this.c;
                L.m(iterator0);
                return iterator0.next();
            }
            case 3: {
                this.a = 0;
                Object object1 = this.b;
                this.b = null;
                return object1;
            }
            default: {
                throw this.g();
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // kotlin.coroutines.d
    public void resumeWith(@l Object object0) {
        f0.n(object0);
        this.a = 4;
    }
}

