package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

final class zzgzu extends zzgwj {
    static final int[] zza;
    private final int zzc;
    private final zzgwj zzd;
    private final zzgwj zze;
    private final int zzf;
    private final int zzg;

    static {
        zzgzu.zza = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 0x90, 0xE9, 377, 610, 987, 0x63D, 0xA18, 0x1055, 6765, 10946, 0x452F, 0x6FF1, 0xB520, 75025, 0x1DA31, 0x2FF42, 0x4D973, 0x7D8B5, 832040, 0x148ADD, 0x213D05, 0x35C7E2, 0x5704E7, 0x8CCCC9, 0xE3D1B0, 0x1709E79, 0x2547029, 0x3C50EA2, 102334155, 165580141, 0xFF80C38, 0x19D699A5, 701408733, 1134903170, 0x6D73E55F, 0x7FFFFFFF};
    }

    private zzgzu(zzgwj zzgwj0, zzgwj zzgwj1) {
        this.zzd = zzgwj0;
        this.zze = zzgwj1;
        int v = zzgwj0.zzd();
        this.zzf = v;
        this.zzc = v + zzgwj1.zzd();
        this.zzg = Math.max(zzgwj0.zzf(), zzgwj1.zzf()) + 1;
    }

    zzgzu(zzgwj zzgwj0, zzgwj zzgwj1, zzgzt zzgzt0) {
        this(zzgwj0, zzgwj1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzgwj)) {
            return false;
        }
        int v = ((zzgwj)object0).zzd();
        if(this.zzc != v) {
            return false;
        }
        if(this.zzc == 0) {
            return true;
        }
        int v1 = this.zzr();
        int v2 = ((zzgwj)object0).zzr();
        if(v1 != 0 && v2 != 0 && v1 != v2) {
            return false;
        }
        zzgzs zzgzs0 = new zzgzs(this, null);
        zzgwf zzgwf0 = zzgzs0.zza();
        zzgzs zzgzs1 = new zzgzs(((zzgwj)object0), null);
        zzgwf zzgwf1 = zzgzs1.zza();
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(true) {
            int v6 = zzgwf0.zzd() - v3;
            int v7 = zzgwf1.zzd() - v4;
            int v8 = Math.min(v6, v7);
            if(!(v3 == 0 ? zzgwf0.zzg(zzgwf1, v4, v8) : zzgwf1.zzg(zzgwf0, v3, v8))) {
                return false;
            }
            v5 += v8;
            int v9 = this.zzc;
            if(v5 >= v9) {
                if(v5 != v9) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if(v8 == v6) {
                zzgwf0 = zzgzs0.zza();
                v3 = 0;
            }
            else {
                v3 += v8;
            }
            if(v8 == v7) {
                zzgwf1 = zzgzs1.zza();
                v4 = 0;
            }
            else {
                v4 += v8;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final Iterator iterator() {
        return new zzgzq(this);
    }

    static zzgwj zzC(zzgwj zzgwj0, zzgwj zzgwj1) {
        if(zzgwj1.zzd() == 0) {
            return zzgwj0;
        }
        if(zzgwj0.zzd() == 0) {
            return zzgwj1;
        }
        int v = zzgwj0.zzd() + zzgwj1.zzd();
        if(v < 0x80) {
            return zzgzu.zzD(zzgwj0, zzgwj1);
        }
        if(zzgwj0 instanceof zzgzu) {
            if(((zzgzu)zzgwj0).zze.zzd() + zzgwj1.zzd() < 0x80) {
                zzgwj zzgwj2 = zzgzu.zzD(((zzgzu)zzgwj0).zze, zzgwj1);
                return new zzgzu(((zzgzu)zzgwj0).zzd, zzgwj2);
            }
            if(((zzgzu)zzgwj0).zzd.zzf() > ((zzgzu)zzgwj0).zze.zzf()) {
                int v1 = zzgwj1.zzf();
                if(((zzgzu)zzgwj0).zzg > v1) {
                    zzgzu zzgzu0 = new zzgzu(((zzgzu)zzgwj0).zze, zzgwj1);
                    return new zzgzu(((zzgzu)zzgwj0).zzd, zzgzu0);
                }
            }
        }
        return v >= zzgzu.zzc(Math.max(zzgwj0.zzf(), zzgwj1.zzf()) + 1) ? new zzgzu(zzgwj0, zzgwj1) : zzgzr.zza(new zzgzr(null), zzgwj0, zzgwj1);
    }

    private static zzgwj zzD(zzgwj zzgwj0, zzgwj zzgwj1) {
        int v = zzgwj0.zzd();
        int v1 = zzgwj1.zzd();
        byte[] arr_b = new byte[v + v1];
        zzgwj0.zzz(arr_b, 0, 0, v);
        zzgwj1.zzz(arr_b, 0, v, v1);
        return new zzgwg(arr_b);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final byte zza(int v) {
        zzgwj.zzy(v, this.zzc);
        return this.zzb(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    final byte zzb(int v) {
        return v >= this.zzf ? this.zze.zzb(v - this.zzf) : this.zzd.zzb(v);
    }

    static int zzc(int v) {
        return v < 0x2F ? zzgzu.zza[v] : 0x7FFFFFFF;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final int zzd() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    protected final void zze(byte[] arr_b, int v, int v1, int v2) {
        int v3 = this.zzf;
        if(v + v2 <= v3) {
            this.zzd.zze(arr_b, v, v1, v2);
            return;
        }
        if(v >= v3) {
            this.zze.zze(arr_b, v - v3, v1, v2);
            return;
        }
        int v4 = v3 - v;
        this.zzd.zze(arr_b, v, v1, v4);
        this.zze.zze(arr_b, 0, v1 + v4, v2 - v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    protected final int zzf() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    protected final boolean zzh() {
        int v = zzgzu.zzc(this.zzg);
        return this.zzc >= v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    protected final int zzi(int v, int v1, int v2) {
        int v3 = this.zzf;
        if(v1 + v2 <= v3) {
            return this.zzd.zzi(v, v1, v2);
        }
        if(v1 >= v3) {
            return this.zze.zzi(v, v1 - v3, v2);
        }
        int v4 = v3 - v1;
        int v5 = this.zzd.zzi(v, v1, v4);
        return this.zze.zzi(v5, 0, v2 - v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    protected final int zzj(int v, int v1, int v2) {
        int v3 = this.zzf;
        if(v1 + v2 <= v3) {
            return this.zzd.zzj(v, v1, v2);
        }
        if(v1 >= v3) {
            return this.zze.zzj(v, v1 - v3, v2);
        }
        int v4 = v3 - v1;
        int v5 = this.zzd.zzj(v, v1, v4);
        return this.zze.zzj(v5, 0, v2 - v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final zzgwj zzk(int v, int v1) {
        int v2 = zzgwj.zzq(v, v1, this.zzc);
        if(v2 == 0) {
            return zzgwj.zzb;
        }
        if(v2 == this.zzc) {
            return this;
        }
        int v3 = this.zzf;
        if(v1 <= v3) {
            return this.zzd.zzk(v, v1);
        }
        if(v >= v3) {
            return this.zze.zzk(v - v3, v1 - v3);
        }
        int v4 = this.zzd.zzd();
        return new zzgzu(this.zzd.zzk(v, v4), this.zze.zzk(0, v1 - this.zzf));
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final zzgwp zzl() {
        ArrayList arrayList0 = new ArrayList();
        zzgzs zzgzs0 = new zzgzs(this, null);
        while(zzgzs0.hasNext()) {
            arrayList0.add(zzgzs0.zza().zzn());
        }
        int v = 0;
        int v1 = 0;
        for(Object object0: arrayList0) {
            ByteBuffer byteBuffer0 = (ByteBuffer)object0;
            v1 += byteBuffer0.remaining();
            if(byteBuffer0.hasArray()) {
                v |= 1;
            }
            else {
                v |= (byteBuffer0.isDirect() ? 2 : 4);
            }
        }
        return v == 2 ? new zzgwl(arrayList0, v1, true, null) : zzgwp.zzG(new zzgyh(arrayList0), 0x1000);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    protected final String zzm(Charset charset0) {
        return new String(this.zzA(), charset0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    final void zzo(zzgwa zzgwa0) throws IOException {
        this.zzd.zzo(zzgwa0);
        this.zze.zzo(zzgwa0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final boolean zzp() {
        int v = this.zzd.zzj(0, 0, this.zzf);
        int v1 = this.zze.zzd();
        return this.zze.zzj(v, 0, v1) == 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwj
    public final zzgwe zzs() {
        return new zzgzq(this);
    }
}

