package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzej extends zzeb implements Set {
    @NullableDecl
    private transient zzee zza;

    @Override
    public boolean equals(@NullableDecl Object object0) {
        if(object0 == this) {
            return true;
        }
        return !(object0 instanceof zzej) || !this.zzg() || !((zzej)object0).zzg() || this.hashCode() == object0.hashCode() ? zzey.zza(this, object0) : false;
    }

    @Override
    public int hashCode() {
        return zzey.zza(this);
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public Iterator iterator() {
        return this.zza();
    }

    static int zza(int v) {
        int v1 = Math.max(v, 2);
        boolean z = true;
        if(v1 < 0x2CCCCCCC) {
            int v2;
            for(v2 = Integer.highestOneBit(v1 - 1) << 1; ((double)v2) * 0.7 < ((double)v1); v2 <<= 1) {
            }
            return v2;
        }
        if(v1 >= 0x40000000) {
            z = false;
        }
        zzde.zza(z, "collection too large");
        return 0x40000000;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public zzee zze() {
        zzee zzee0 = this.zza;
        if(zzee0 == null) {
            zzee0 = this.zzh();
            this.zza = zzee0;
        }
        return zzee0;
    }

    boolean zzg() {
        return false;
    }

    zzee zzh() {
        return zzee.zza(this.toArray());
    }
}

