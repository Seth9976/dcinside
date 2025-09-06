package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzek implements Iterator {
    private int pos;
    private Iterator zzor;
    private final zzei zzos;

    private zzek(zzei zzei0) {
        this.zzos = zzei0;
        super();
        this.pos = zzei0.zzom.size();
    }

    zzek(zzei zzei0, zzej zzej0) {
        this(zzei0);
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean hasNext() {
        return this.pos > 0 && this.pos <= this.zzos.zzom.size() || this.zzdw().hasNext();
    }

    @Override
    public final Object next() {
        if(this.zzdw().hasNext()) {
            return this.zzdw().next();
        }
        int v = this.pos - 1;
        this.pos = v;
        return (Map.Entry)this.zzos.zzom.get(v);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator zzdw() {
        if(this.zzor == null) {
            this.zzor = this.zzos.zzop.entrySet().iterator();
        }
        return this.zzor;
    }
}

