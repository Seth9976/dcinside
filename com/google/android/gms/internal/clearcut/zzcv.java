package com.google.android.gms.internal.clearcut;

public class zzcv {
    private static final zzbt zzez;
    private zzbb zzln;
    private volatile zzdo zzlo;
    private volatile zzbb zzlp;

    static {
        zzcv.zzez = zzbt.zzan();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzcv)) {
            return false;
        }
        zzdo zzdo0 = this.zzlo;
        zzdo zzdo1 = ((zzcv)object0).zzlo;
        if(zzdo0 == null && zzdo1 == null) {
            return this.zzr().equals(((zzcv)object0).zzr());
        }
        if(zzdo0 != null && zzdo1 != null) {
            return zzdo0.equals(zzdo1);
        }
        return zzdo0 == null ? this.zzh(zzdo1.zzbe()).equals(zzdo1) : zzdo0.equals(((zzcv)object0).zzh(zzdo0.zzbe()));
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public final int zzas() {
        if(this.zzlp != null) {
            return this.zzlp.size();
        }
        return this.zzlo == null ? 0 : this.zzlo.zzas();
    }

    private final zzdo zzh(zzdo zzdo0) {
        if(this.zzlo == null) {
            synchronized(this) {
                if(this.zzlo == null) {
                    this.zzlo = zzdo0;
                    this.zzlp = zzbb.zzfi;
                }
            }
            return this.zzlo;
        }
        return this.zzlo;
    }

    public final zzdo zzi(zzdo zzdo0) {
        zzdo zzdo1 = this.zzlo;
        this.zzln = null;
        this.zzlp = null;
        this.zzlo = zzdo0;
        return zzdo1;
    }

    public final zzbb zzr() {
        if(this.zzlp != null) {
            return this.zzlp;
        }
        synchronized(this) {
            if(this.zzlp != null) {
                return this.zzlp;
            }
            this.zzlp = this.zzlo == null ? zzbb.zzfi : this.zzlo.zzr();
            return this.zzlp;
        }
    }
}

