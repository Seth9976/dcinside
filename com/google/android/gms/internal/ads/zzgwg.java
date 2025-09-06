package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

class zzgwg extends zzgwf {
    protected final byte[] zza;

    zzgwg(byte[] arr_b) {
        super(null);
        arr_b.getClass();
        this.zza = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzgwj)) {
            return false;
        }
        if(this.zzd() != ((zzgwj)object0).zzd()) {
            return false;
        }
        if(this.zzd() == 0) {
            return true;
        }
        if(object0 instanceof zzgwg) {
            int v = this.zzr();
            int v1 = ((zzgwg)object0).zzr();
            return v == 0 || v1 == 0 || v == v1 ? this.zzg(((zzgwg)object0), 0, this.zzd()) : false;
        }
        return object0.equals(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public byte zza(int v) {
        return this.zza[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    byte zzb(int v) {
        return this.zza[v];
    }

    protected int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public int zzd() {
        return this.zza.length;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    protected void zze(byte[] arr_b, int v, int v1, int v2) {
        System.arraycopy(this.zza, v, arr_b, v1, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwf
    final boolean zzg(zzgwj zzgwj0, int v, int v1) {
        if(v1 > zzgwj0.zzd()) {
            throw new IllegalArgumentException("Length too large: " + v1 + this.zzd());
        }
        int v2 = v + v1;
        if(v2 > zzgwj0.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + v + ", " + v1 + ", " + zzgwj0.zzd());
        }
        if(zzgwj0 instanceof zzgwg) {
            byte[] arr_b = this.zza;
            byte[] arr_b1 = ((zzgwg)zzgwj0).zza;
            int v3 = this.zzc();
            int v4 = this.zzc();
            for(int v5 = ((zzgwg)zzgwj0).zzc() + v; v4 < v3 + v1; ++v5) {
                if(arr_b[v4] != arr_b1[v5]) {
                    return false;
                }
                ++v4;
            }
            return true;
        }
        return zzgwj0.zzk(v, v2).equals(this.zzk(0, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    protected final int zzi(int v, int v1, int v2) {
        return zzgye.zzb(v, this.zza, this.zzc() + v1, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    protected final int zzj(int v, int v1, int v2) {
        int v3 = this.zzc();
        return zzhat.zzf(v, this.zza, v3 + v1, v2 + (v3 + v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final zzgwj zzk(int v, int v1) {
        int v2 = zzgwj.zzq(v, v1, this.zzd());
        return v2 == 0 ? zzgwj.zzb : new zzgwd(this.zza, this.zzc() + v, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final zzgwp zzl() {
        int v = this.zzd();
        return zzgwp.zzH(this.zza, this.zzc(), v, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    protected final String zzm(Charset charset0) {
        int v = this.zzd();
        return new String(this.zza, this.zzc(), v, charset0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final ByteBuffer zzn() {
        int v = this.zzd();
        return ByteBuffer.wrap(this.zza, this.zzc(), v).asReadOnlyBuffer();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    final void zzo(zzgwa zzgwa0) throws IOException {
        int v = this.zzd();
        zzgwa0.zza(this.zza, this.zzc(), v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final boolean zzp() {
        int v = this.zzc();
        int v1 = this.zzd();
        return zzhat.zzi(this.zza, v, v1 + v);
    }
}

