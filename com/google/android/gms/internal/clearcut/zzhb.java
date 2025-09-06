package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public final class zzhb extends zzfu implements Cloneable {
    private String value;
    private static volatile zzhb[] zzbkd;
    private String zzbke;

    public zzhb() {
        this.zzbke = "";
        this.value = "";
        this.zzrj = null;
        this.zzrs = -1;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final Object clone() throws CloneNotSupportedException {
        return this.zzgf();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzhb)) {
            return false;
        }
        String s = this.zzbke;
        if(s == null) {
            if(((zzhb)object0).zzbke != null) {
                return false;
            }
        }
        else if(!s.equals(((zzhb)object0).zzbke)) {
            return false;
        }
        String s1 = this.value;
        if(s1 == null) {
            if(((zzhb)object0).value != null) {
                return false;
            }
        }
        else if(!s1.equals(((zzhb)object0).value)) {
            return false;
        }
        if(this.zzrj != null && !this.zzrj.isEmpty()) {
            return this.zzrj.equals(((zzhb)object0).zzrj);
        }
        zzfw zzfw0 = ((zzhb)object0).zzrj;
        return zzfw0 == null || zzfw0.isEmpty();
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zzbke == null ? 0 : this.zzbke.hashCode();
        int v2 = this.value == null ? 0 : this.value.hashCode();
        if(this.zzrj != null && !this.zzrj.isEmpty()) {
            v = this.zzrj.hashCode();
        }
        return ((v1 + 0x20FA9787) * 0x1F + v2) * 0x1F + v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final void zza(zzfs zzfs0) throws IOException {
        if(this.zzbke != null && !this.zzbke.equals("")) {
            zzfs0.zza(1, this.zzbke);
        }
        if(this.value != null && !this.value.equals("")) {
            zzfs0.zza(2, this.value);
        }
        super.zza(zzfs0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    protected final int zzen() {
        int v = super.zzen();
        if(this.zzbke != null && !this.zzbke.equals("")) {
            v += zzfs.zzb(1, this.zzbke);
        }
        return this.value == null || this.value.equals("") ? v : v + zzfs.zzb(2, this.value);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final zzfu zzeo() throws CloneNotSupportedException {
        return (zzhb)this.clone();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final zzfz zzep() throws CloneNotSupportedException {
        return (zzhb)this.clone();
    }

    public static zzhb[] zzge() {
        if(zzhb.zzbkd == null) {
            Object object0 = zzfy.zzrr;
            synchronized(object0) {
                if(zzhb.zzbkd == null) {
                    zzhb.zzbkd = new zzhb[0];
                }
            }
        }
        return zzhb.zzbkd;
    }

    private final zzhb zzgf() {
        try {
            return (zzhb)super.zzeo();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }
}

