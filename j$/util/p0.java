package j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

class p0 implements Spliterator {
    private final Collection a;
    private Iterator b;
    private final int c;
    private long d;
    private int e;

    public p0(Collection collection0, int v) {
        this.a = collection0;
        this.b = null;
        if((v & 0x1000) == 0) {
            v |= 0x4040;
        }
        this.c = v;
    }

    public p0(Iterator iterator0, int v) {
        this.a = null;
        this.b = iterator0;
        this.d = 0x7FFFFFFFFFFFFFFFL;
        this.c = v & 0xFFFFBFBF;
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return this.c;
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        if(this.b == null) {
            this.b = this.a.iterator();
            long v = (long)this.a.size();
            this.d = v;
            return v;
        }
        return this.d;
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        consumer0.getClass();
        Iterator iterator0 = this.b;
        if(iterator0 == null) {
            Iterator iterator1 = this.a.iterator();
            this.b = iterator1;
            this.d = (long)this.a.size();
            iterator0 = iterator1;
        }
        P.q(iterator0, consumer0);
    }

    @Override  // j$.util.Spliterator
    public Comparator getComparator() {
        if(!P.e(this, 4)) {
            throw new IllegalStateException();
        }
        return null;
    }

    @Override  // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return P.d(this);
    }

    @Override  // j$.util.Spliterator
    public final boolean hasCharacteristics(int v) {
        return P.e(this, v);
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        consumer0.getClass();
        if(this.b == null) {
            this.b = this.a.iterator();
            this.d = (long)this.a.size();
        }
        if(this.b.hasNext()) {
            Object object0 = this.b.next();
            consumer0.accept(object0);
            return true;
        }
        return false;
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        long v;
        Iterator iterator0 = this.b;
        if(iterator0 == null) {
            Iterator iterator1 = this.a.iterator();
            this.b = iterator1;
            v = (long)this.a.size();
            this.d = v;
            iterator0 = iterator1;
        }
        else {
            v = this.d;
        }
        if(v > 1L && iterator0.hasNext()) {
            int v1 = ((long)(this.e + 0x400)) <= v ? this.e + 0x400 : ((int)v);
            if(v1 > 0x2000000) {
                v1 = 0x2000000;
            }
            Object[] arr_object = new Object[v1];
            int v2 = 0;
            do {
                Object object0 = iterator0.next();
                arr_object[v2] = object0;
                ++v2;
            }
            while(v2 < v1 && iterator0.hasNext());
            this.e = v2;
            long v3 = this.d;
            if(v3 != 0x7FFFFFFFFFFFFFFFL) {
                this.d = v3 - ((long)v2);
            }
            return new i0(arr_object, 0, v2, this.c);
        }
        return null;
    }
}

