package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzcu implements Iterator {
    private Iterator zzlm;

    public zzcu(Iterator iterator0) {
        this.zzlm = iterator0;
    }

    @Override
    public final boolean hasNext() {
        return this.zzlm.hasNext();
    }

    @Override
    public final Object next() {
        Object object0 = this.zzlm.next();
        return ((Map.Entry)object0).getValue() instanceof zzcr ? new zzct(((Map.Entry)object0), null) : ((Map.Entry)object0);
    }

    @Override
    public final void remove() {
        this.zzlm.remove();
    }
}

