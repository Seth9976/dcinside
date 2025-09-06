package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzgxl extends zzgvr {
    protected zzgxr zza;
    private final zzgxr zzb;

    protected zzgxl(zzgxr zzgxr0) {
        this.zzb = zzgxr0;
        if(zzgxr0.zzcd()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = this.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzgvr
    public Object clone() throws CloneNotSupportedException {
        return this.zzbh();
    }

    private zzgxr zza() {
        return this.zzb.zzbj();
    }

    @Override  // com.google.android.gms.internal.ads.zzgvr
    public zzgvr zzaC() {
        return this.zzbh();
    }

    @Override  // com.google.android.gms.internal.ads.zzgvr
    protected zzgvr zzaD(zzgvs zzgvs0) {
        this.zzbi(((zzgxr)zzgvs0));
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvr
    public zzgvr zzaK(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        this.zzbk(zzgwp0, zzgxb0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvr
    public zzgvr zzaN(byte[] arr_b, int v, int v1) throws zzgyg {
        this.zzbl(arr_b, v, v1);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvr
    public zzgvr zzaO(byte[] arr_b, int v, int v1, zzgxb zzgxb0) throws zzgyg {
        this.zzbm(arr_b, v, v1, zzgxb0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvr
    public zzgzb zzaP() {
        return this.zzbh();
    }

    @Override  // com.google.android.gms.internal.ads.zzgvr
    public zzgzb zzaW(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        this.zzbk(zzgwp0, zzgxb0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvr
    public zzgzb zzaZ(byte[] arr_b, int v, int v1) throws zzgyg {
        this.zzbl(arr_b, v, v1);
        return this;
    }

    private static void zzb(Object object0, Object object1) {
        zzgzm.zza().zzb(object0.getClass()).zzg(object0, object1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgvr
    public zzgzb zzba(byte[] arr_b, int v, int v1, zzgxb zzgxb0) throws zzgyg {
        this.zzbm(arr_b, v, v1, zzgxb0);
        return this;
    }

    public final zzgxl zzbg() {
        if(this.zzb.zzcd()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = this.zza();
        return this;
    }

    public zzgxl zzbh() {
        zzgxl zzgxl0 = this.zzbp().zzbb();
        zzgxl0.zza = this.zzbo();
        return zzgxl0;
    }

    protected zzgxl zzbi(zzgxr zzgxr0) {
        this.zzbj(zzgxr0);
        return this;
    }

    public zzgxl zzbj(zzgxr zzgxr0) {
        if(this.zzbp().equals(zzgxr0)) {
            return this;
        }
        this.zzbu();
        zzgxl.zzb(this.zza, zzgxr0);
        return this;
    }

    public zzgxl zzbk(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        this.zzbu();
        try {
            zzgzm.zza().zzb(this.zza.getClass()).zzh(this.zza, zzgwq.zzq(zzgwp0), zzgxb0);
            return this;
        }
        catch(RuntimeException runtimeException0) {
            if(runtimeException0.getCause() instanceof IOException) {
                throw (IOException)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
    }

    public zzgxl zzbl(byte[] arr_b, int v, int v1) throws zzgyg {
        this.zzbm(arr_b, v, v1, zzgxb.zza);
        return this;
    }

    public zzgxl zzbm(byte[] arr_b, int v, int v1, zzgxb zzgxb0) throws zzgyg {
        this.zzbu();
        try {
            zzgzm.zza().zzb(this.zza.getClass()).zzi(this.zza, arr_b, v, v + v1, new zzgvx(zzgxb0));
            return this;
        }
        catch(zzgyg zzgyg0) {
            throw zzgyg0;
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
        }
    }

    public final zzgxr zzbn() {
        zzgxr zzgxr0 = this.zzbo();
        if(!zzgxr0.zzbw()) {
            throw zzgvr.zzbb(zzgxr0);
        }
        return zzgxr0;
    }

    public zzgxr zzbo() {
        if(!this.zza.zzcd()) {
            return this.zza;
        }
        this.zza.zzbU();
        return this.zza;
    }

    public zzgxr zzbp() {
        return this.zzb;
    }

    public zzgzb zzbq() {
        this.zzbg();
        return this;
    }

    public zzgzc zzbr() {
        return this.zzbn();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzb
    public zzgzc zzbs() {
        return this.zzbo();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzd
    public zzgzc zzbt() {
        return this.zzbp();
    }

    protected final void zzbu() {
        if(!this.zza.zzcd()) {
            this.zzbv();
        }
    }

    protected void zzbv() {
        zzgxr zzgxr0 = this.zza();
        zzgxl.zzb(zzgxr0, this.zza);
        this.zza = zzgxr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzd
    public final boolean zzbw() {
        return zzgxr.zzk(this.zza, false);
    }
}

