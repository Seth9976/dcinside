package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import o3.a;

public abstract class zzfvo extends zzfzt {
    @a
    private Object zza;
    private int zzb;

    protected zzfvo() {
        this.zzb = 2;
    }

    @Override
    public final boolean hasNext() {
        zzfun.zzl(this.zzb != 4);
        int v = this.zzb - 1;
        if(this.zzb == 0) {
            throw null;
        }
        switch(v) {
            case 0: {
                return true;
            label_6:
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
                goto label_6;
            }
        }
        return false;
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

    @a
    protected abstract Object zza();

    @a
    protected final Object zzb() {
        this.zzb = 3;
        return null;
    }
}

