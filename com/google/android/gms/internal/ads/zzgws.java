package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

final class zzgws extends zzgww {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzgws(byte[] arr_b, int v, int v1) {
        super(null);
        if((arr_b.length - v1 | v1) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), 0, v1));
        }
        this.zza = arr_b;
        this.zzc = 0;
        this.zzb = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzK() {
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzL(byte b) throws IOException {
        int v;
        try {
            v = this.zzc;
            this.zza[v] = b;
            this.zzc = v + 1;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgwt(((long)(v + 1)), ((long)this.zzb), 1, indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzM(int v, boolean z) throws IOException {
        this.zzu(v << 3);
        this.zzL(((byte)z));
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzN(int v, zzgwj zzgwj0) throws IOException {
        this.zzu(v << 3 | 2);
        this.zzu(zzgwj0.zzd());
        zzgwj0.zzo(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zza(byte[] arr_b, int v, int v1) throws IOException {
        this.zze(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] arr_b, int v, int v1) throws IOException {
        try {
            System.arraycopy(arr_b, v, this.zza, this.zzc, v1);
            this.zzc += v1;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgwt(((long)this.zzc), ((long)this.zzb), v1, indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzh(int v, int v1) throws IOException {
        this.zzu(v << 3 | 5);
        this.zzi(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzi(int v) throws IOException {
        int v1;
        try {
            v1 = this.zzc;
            this.zza[v1] = (byte)v;
            this.zza[v1 + 1] = (byte)(v >> 8);
            this.zza[v1 + 2] = (byte)(v >> 16);
            this.zza[v1 + 3] = (byte)(v >> 24);
            this.zzc = v1 + 4;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgwt(((long)v1), ((long)this.zzb), 4, indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzj(int v, long v1) throws IOException {
        this.zzu(v << 3 | 1);
        this.zzk(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzk(long v) throws IOException {
        int v1;
        try {
            v1 = this.zzc;
            this.zza[v1] = (byte)(((int)v));
            this.zza[v1 + 1] = (byte)(((int)(v >> 8)));
            this.zza[v1 + 2] = (byte)(((int)(v >> 16)));
            this.zza[v1 + 3] = (byte)(((int)(v >> 24)));
            this.zza[v1 + 4] = (byte)(((int)(v >> 0x20)));
            this.zza[v1 + 5] = (byte)(((int)(v >> 40)));
            this.zza[v1 + 6] = (byte)(((int)(v >> 0x30)));
            this.zza[v1 + 7] = (byte)(((int)(v >> 56)));
            this.zzc = v1 + 8;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgwt(((long)v1), ((long)this.zzb), 8, indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzl(int v, int v1) throws IOException {
        this.zzu(v << 3);
        this.zzm(v1);
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
        this.zzr(s);
    }

    public final void zzr(String s) throws IOException {
        int v;
        try {
            v = this.zzc;
            int v1 = zzgww.zzD(s.length());
            if(v1 == zzgww.zzD(s.length() * 3)) {
                int v2 = v + v1;
                this.zzc = v2;
                int v3 = zzhat.zzd(s, this.zza, v2, this.zzb - v2);
                this.zzc = v;
                this.zzu(v3 - v - v1);
                this.zzc = v3;
                return;
            }
            this.zzu(zzhat.zze(s));
            this.zzc = zzhat.zzd(s, this.zza, this.zzc, this.zzb - this.zzc);
            return;
        }
        catch(zzhas zzhas0) {
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgwt(indexOutOfBoundsException0);
        }
        this.zzc = v;
        this.zzG(s, zzhas0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzs(int v, int v1) throws IOException {
        this.zzu(v << 3 | v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzt(int v, int v1) throws IOException {
        this.zzu(v << 3);
        this.zzu(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzu(int v) throws IOException {
        int v2;
        int v1 = this.zzc;
        try {
            while(true) {
                if((v & 0xFFFFFF80) == 0) {
                    v2 = v1 + 1;
                    this.zza[v1] = (byte)v;
                    this.zzc = v2;
                    return;
                }
                v2 = v1 + 1;
                this.zza[v1] = (byte)(v | 0x80);
                v >>>= 7;
                v1 = v2;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgwt(((long)v2), ((long)this.zzb), 1, indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzv(int v, long v1) throws IOException {
        this.zzu(v << 3);
        this.zzw(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgww
    public final void zzw(long v) throws IOException {
        int v2;
        IndexOutOfBoundsException indexOutOfBoundsException1;
        for(int v1 = this.zzc; true; ++v1) {
            if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                try {
                    this.zza[v1] = (byte)(((int)v));
                    this.zzc = v1 + 1;
                    return;
                }
                catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                    indexOutOfBoundsException1 = indexOutOfBoundsException0;
                    v2 = v1 + 1;
                    break;
                }
            }
            try {
                this.zza[v1] = (byte)(((int)v) | 0x80);
                v >>>= 7;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException2) {
                v2 = v1 + 1;
                indexOutOfBoundsException1 = indexOutOfBoundsException2;
                break;
            }
        }
        throw new zzgwt(((long)v2), ((long)this.zzb), 1, indexOutOfBoundsException1);
    }
}

