package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzeq implements Iterator {
    private int pos;
    private Iterator zzor;
    private final zzei zzos;
    private boolean zzow;

    private zzeq(zzei zzei0) {
        this.zzos = zzei0;
        super();
        this.pos = -1;
    }

    zzeq(zzei zzei0, zzej zzej0) {
        this(zzei0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.pos + 1 < this.zzos.zzom.size() || !this.zzos.zzon.isEmpty() && this.zzdw().hasNext();
    }

    @Override
    public final Object next() {
        this.zzow = true;
        int v = this.pos + 1;
        this.pos = v;
        return v < this.zzos.zzom.size() ? ((Map.Entry)this.zzos.zzom.get(this.pos)) : this.zzdw().next();
    }

    @Override
    public final void remove() {
        if(!this.zzow) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzow = false;
        this.zzos.zzdu();
        if(this.pos < this.zzos.zzom.size()) {
            int v = this.pos;
            this.pos = v - 1;
            this.zzos.zzal(v);
            return;
        }
        this.zzdw().remove();
    }

    private final Iterator zzdw() {
        if(this.zzor == null) {
            this.zzor = this.zzos.zzon.entrySet().iterator();
        }
        return this.zzor;
    }
}

