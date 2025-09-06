package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o3.a;
import z4.b;

@b
abstract class zzm implements Iterator {
    @a
    private Object zza;
    private int zzb;

    protected zzm() {
        this.zzb = 2;
    }

    @Override
    public final boolean hasNext() {
        int v = this.zzb;
        switch(v) {
            case 0: {
                throw null;
            }
            case 4: {
                throw new IllegalStateException();
            }
            default: {
                switch(v - 1) {
                    case 0: {
                        return true;
                    label_5:
                        this.zzb = 4;
                        this.zza = this.zza();
                        if(this.zzb != 3) {
                            this.zzb = 1;
                            return true;
                        }
                        break;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        goto label_5;
                    }
                }
                return false;
            }
        }
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.zzb = 2;
        Object object0 = this.zza;
        this.zza = null;
        return object0;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @a
    protected abstract Object zza();

    @a
    protected final Object zzb() {
        this.zzb = 3;
        return null;
    }
}

