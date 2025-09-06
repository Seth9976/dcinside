package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzbc implements Iterator {
    private final int limit;
    private int position;
    private final zzbb zzfl;

    zzbc(zzbb zzbb0) {
        this.zzfl = zzbb0;
        super();
        this.position = 0;
        this.limit = zzbb0.size();
    }

    @Override
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override
    public final Object next() {
        return this.nextByte();
    }

    private final byte nextByte() {
        try {
            int v = this.position;
            this.position = v + 1;
            return this.zzfl.zzj(v);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new NoSuchElementException(indexOutOfBoundsException0.getMessage());
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

