package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

final class zzgwu extends zzgwr {
    private final OutputStream zzg;

    zzgwu(OutputStream outputStream0, int v) {
        super(v);
        if(outputStream0 == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream0;
    }

    private final void zzI() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzJ(int v) throws IOException {
        if(this.zzb - this.zzc < v) {
            this.zzI();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzK() throws IOException {
        if(this.zzc > 0) {
            this.zzI();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzL(byte b) throws IOException {
        if(this.zzc == this.zzb) {
            this.zzI();
        }
        this.zzc(b);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzM(int v, boolean z) throws IOException {
        this.zzJ(11);
        this.zzf(v << 3);
        this.zzc(((byte)z));
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzN(int v, zzgwj zzgwj0) throws IOException {
        this.zzu(v << 3 | 2);
        this.zzu(zzgwj0.zzd());
        zzgwj0.zzo(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zza(byte[] arr_b, int v, int v1) throws IOException {
        this.zzr(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzh(int v, int v1) throws IOException {
        this.zzJ(14);
        this.zzf(v << 3 | 5);
        this.zzd(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzi(int v) throws IOException {
        this.zzJ(4);
        this.zzd(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzj(int v, long v1) throws IOException {
        this.zzJ(18);
        this.zzf(v << 3 | 1);
        this.zze(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzk(long v) throws IOException {
        this.zzJ(8);
        this.zze(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzl(int v, int v1) throws IOException {
        this.zzJ(20);
        this.zzf(v << 3);
        if(v1 >= 0) {
            this.zzf(v1);
            return;
        }
        this.zzg(((long)v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzm(int v) throws IOException {
        if(v >= 0) {
            this.zzu(v);
            return;
        }
        this.zzw(((long)v));
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    final void zzn(int v, zzgzc zzgzc0, zzgzv zzgzv0) throws IOException {
        this.zzu(v << 3 | 2);
        this.zzu(((zzgvs)zzgzc0).zzaM(zzgzv0));
        zzgzv0.zzj(zzgzc0, this.zze);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzo(int v, zzgzc zzgzc0) throws IOException {
        this.zzu(11);
        this.zzt(2, v);
        this.zzu(26);
        this.zzu(zzgzc0.zzaY());
        zzgzc0.zzcY(this);
        this.zzu(12);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzp(int v, zzgwj zzgwj0) throws IOException {
        this.zzu(11);
        this.zzt(2, v);
        this.zzN(3, zzgwj0);
        this.zzu(12);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzq(int v, String s) throws IOException {
        this.zzu(v << 3 | 2);
        this.zzx(s);
    }

    public final void zzr(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.zzc;
        int v3 = this.zzb - v2;
        if(v3 >= v1) {
            System.arraycopy(arr_b, v, this.zza, v2, v1);
            this.zzc += v1;
            this.zzd += v1;
            return;
        }
        System.arraycopy(arr_b, v, this.zza, v2, v3);
        int v4 = v + v3;
        this.zzc = this.zzb;
        this.zzd += v3;
        this.zzI();
        int v5 = v1 - v3;
        if(v5 <= this.zzb) {
            System.arraycopy(arr_b, v4, this.zza, 0, v5);
            this.zzc = v5;
        }
        else {
            this.zzg.write(arr_b, v4, v5);
        }
        this.zzd += v5;
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzs(int v, int v1) throws IOException {
        this.zzu(v << 3 | v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzt(int v, int v1) throws IOException {
        this.zzJ(20);
        this.zzf(v << 3);
        this.zzf(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzu(int v) throws IOException {
        this.zzJ(5);
        this.zzf(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzv(int v, long v1) throws IOException {
        this.zzJ(20);
        this.zzf(v << 3);
        this.zzg(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzw(long v) throws IOException {
        this.zzJ(10);
        this.zzg(v);
    }

    public final void zzx(String s) throws IOException {
        int v9;
        int v6;
        int v5;
        try {
            int v = s.length();
            int v1 = zzgww.zzD(v * 3);
            int v2 = v1 + v * 3;
            int v3 = this.zzb;
            if(v2 > v3) {
                byte[] arr_b = new byte[v * 3];
                int v4 = zzhat.zzd(s, arr_b, 0, v * 3);
                this.zzu(v4);
                this.zzr(arr_b, 0, v4);
                return;
            }
            if(v2 > v3 - this.zzc) {
                this.zzI();
            }
            v5 = zzgww.zzD(s.length());
            v6 = this.zzc;
            if(v5 == v1) {
                goto label_15;
            }
            else {
                goto label_23;
            }
            this.zzd += v9;
        }
        catch(zzhas zzhas0) {
            this.zzG(s, zzhas0);
        }
        return;
        try {
        label_15:
            int v7 = v6 + v5;
            this.zzc = v7;
            int v8 = zzhat.zzd(s, this.zza, v7, this.zzb - v7);
            this.zzc = v6;
            v9 = v8 - v6 - v5;
            this.zzf(v9);
            this.zzc = v8;
            this.zzd += v9;
            return;
        label_23:
            v9 = zzhat.zze(s);
            this.zzf(v9);
            this.zzc = zzhat.zzd(s, this.zza, this.zzc, v9);
            this.zzd += v9;
            return;
        }
        catch(zzhas zzhas1) {
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw new zzgwt(arrayIndexOutOfBoundsException0);
        }
        try {
            this.zzd -= this.zzc - v6;
            this.zzc = v6;
            throw zzhas1;
        }
        catch(zzhas zzhas0) {
        }
        this.zzG(s, zzhas0);
    }
}

