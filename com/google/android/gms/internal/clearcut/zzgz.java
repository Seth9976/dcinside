package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

public final class zzgz extends zzfu implements Cloneable {
    private byte[] zzbjb;
    private String zzbjc;
    private byte[][] zzbjd;
    private boolean zzbje;

    public zzgz() {
        this.zzbjb = zzgb.zzse;
        this.zzbjc = "";
        this.zzbjd = zzgb.zzsd;
        this.zzbje = false;
        this.zzrj = null;
        this.zzrs = -1;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final Object clone() throws CloneNotSupportedException {
        return this.zzgc();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzgz)) {
            return false;
        }
        if(!Arrays.equals(this.zzbjb, ((zzgz)object0).zzbjb)) {
            return false;
        }
        String s = this.zzbjc;
        if(s == null) {
            if(((zzgz)object0).zzbjc != null) {
                return false;
            }
        }
        else if(!s.equals(((zzgz)object0).zzbjc)) {
            return false;
        }
        if(!zzfy.zza(this.zzbjd, ((zzgz)object0).zzbjd)) {
            return false;
        }
        if(this.zzrj != null && !this.zzrj.isEmpty()) {
            return this.zzrj.equals(((zzgz)object0).zzrj);
        }
        zzfw zzfw0 = ((zzgz)object0).zzrj;
        return zzfw0 == null || zzfw0.isEmpty();
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzbjb);
        int v1 = 0;
        int v2 = this.zzbjc == null ? 0 : this.zzbjc.hashCode();
        int v3 = zzfy.zza(this.zzbjd);
        if(this.zzrj != null && !this.zzrj.isEmpty()) {
            v1 = this.zzrj.hashCode();
        }
        return v * 0xE1781 + v1 + v2 * 0x745F + v3 * 961 + 0x5F542579;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final void zza(zzfs zzfs0) throws IOException {
        if(!Arrays.equals(this.zzbjb, zzgb.zzse)) {
            zzfs0.zza(1, this.zzbjb);
        }
        if(this.zzbjd != null && this.zzbjd.length > 0) {
            for(int v = 0; true; ++v) {
                byte[][] arr2_b = this.zzbjd;
                if(v >= arr2_b.length) {
                    break;
                }
                byte[] arr_b = arr2_b[v];
                if(arr_b != null) {
                    zzfs0.zza(2, arr_b);
                }
            }
        }
        if(this.zzbjc != null && !this.zzbjc.equals("")) {
            zzfs0.zza(4, this.zzbjc);
        }
        super.zza(zzfs0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    protected final int zzen() {
        int v = super.zzen();
        if(!Arrays.equals(this.zzbjb, zzgb.zzse)) {
            v += zzfs.zzb(1, this.zzbjb);
        }
        if(this.zzbjd != null && this.zzbjd.length > 0) {
            int v2 = 0;
            int v3 = 0;
            for(int v1 = 0; true; ++v1) {
                byte[][] arr2_b = this.zzbjd;
                if(v1 >= arr2_b.length) {
                    break;
                }
                byte[] arr_b = arr2_b[v1];
                if(arr_b != null) {
                    ++v3;
                    v2 += zzfs.zzh(arr_b);
                }
            }
            v = v + v2 + v3;
        }
        return this.zzbjc == null || this.zzbjc.equals("") ? v : v + zzfs.zzb(4, this.zzbjc);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final zzfu zzeo() throws CloneNotSupportedException {
        return (zzgz)this.clone();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final zzfz zzep() throws CloneNotSupportedException {
        return (zzgz)this.clone();
    }

    private final zzgz zzgc() {
        byte[][] arr2_b;
        zzgz zzgz0;
        try {
            zzgz0 = (zzgz)super.zzeo();
            arr2_b = this.zzbjd;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
        if(arr2_b != null && arr2_b.length > 0) {
            zzgz0.zzbjd = (byte[][])arr2_b.clone();
        }
        return zzgz0;
    }
}

