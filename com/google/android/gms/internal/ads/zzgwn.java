package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

final class zzgwn extends zzgwp {
    private final ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    zzgwn(ByteBuffer byteBuffer0, boolean z, zzgwo zzgwo0) {
        super(null);
        this.zzl = 0x7FFFFFFF;
        this.zze = byteBuffer0;
        long v = zzhao.zze(byteBuffer0);
        this.zzf = v;
        this.zzg = ((long)byteBuffer0.limit()) + v;
        long v1 = v + ((long)byteBuffer0.position());
        this.zzh = v1;
        this.zzi = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzA() throws IOException {
        return this.zzh == this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzB() throws IOException {
        return this.zzq() != 0L;
    }

    private final int zzC() {
        return (int)(this.zzg - this.zzh);
    }

    private final void zzI() {
        long v = this.zzg + ((long)this.zzj);
        this.zzg = v;
        int v1 = (int)(v - this.zzi);
        int v2 = this.zzl;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.zzj = v3;
            this.zzg = v - ((long)v3);
            return;
        }
        this.zzj = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final double zza() throws IOException {
        return Double.longBitsToDouble(this.zzp());
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(this.zzh());
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzc() {
        return (int)(this.zzh - this.zzi);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzd(int v) throws zzgyg {
        if(v < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v1 = v + this.zzc();
        int v2 = this.zzl;
        if(v1 > v2) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = v1;
        this.zzI();
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zze() throws IOException {
        return this.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzf() throws IOException {
        return this.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzg() throws IOException {
        return this.zzi();
    }

    public final int zzh() throws IOException {
        long v = this.zzh;
        if(this.zzg - v < 4L) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzh = v + 4L;
        int v1 = zzhao.zza(v);
        int v2 = zzhao.zza(v + 1L);
        int v3 = zzhao.zza(v + 2L);
        return (zzhao.zza(v + 3L) & 0xFF) << 24 | ((v2 & 0xFF) << 8 | v1 & 0xFF | (v3 & 0xFF) << 16);
    }

    public final int zzi() throws IOException {
        int v4;
        long v = this.zzh;
        if(this.zzg != v) {
            int v1 = zzhao.zza(v);
            if(v1 >= 0) {
                this.zzh = v + 1L;
                return v1;
            }
            if(this.zzg - (v + 1L) >= 9L) {
                long v2 = v + 2L;
                int v3 = zzhao.zza(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = v3 ^ 0xFFFFFF80;
                    this.zzh = v2;
                    return v4;
                }
                long v5 = v + 3L;
                int v6 = v3 ^ zzhao.zza(v2) << 14;
                if(v6 >= 0) {
                    v4 = v6 ^ 0x3F80;
                    v2 = v5;
                    this.zzh = v2;
                    return v4;
                }
                v2 = v + 4L;
                int v7 = v6 ^ zzhao.zza(v5) << 21;
                if(v7 < 0) {
                    v4 = 0xFFE03F80 ^ v7;
                    this.zzh = v2;
                    return v4;
                }
                v5 = v + 5L;
                int v8 = zzhao.zza(v2);
                int v9 = v7 ^ v8 << 28 ^ 0xFE03F80;
                if(v8 >= 0) {
                    v2 = v5;
                    this.zzh = v2;
                    return v9;
                }
                v2 = v + 6L;
                if(zzhao.zza(v5) >= 0) {
                    this.zzh = v2;
                    return v9;
                }
                v5 = v + 7L;
                if(zzhao.zza(v2) >= 0) {
                    v2 = v5;
                    this.zzh = v2;
                    return v9;
                }
                v2 = v + 8L;
                if(zzhao.zza(v5) >= 0) {
                    this.zzh = v2;
                    return v9;
                }
                v5 = v + 9L;
                if(zzhao.zza(v2) >= 0) {
                    v2 = v5;
                    this.zzh = v2;
                    return v9;
                }
                v2 = v + 10L;
                if(zzhao.zza(v5) >= 0) {
                    this.zzh = v2;
                    return v9;
                }
            }
        }
        return (int)this.zzr();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzj() throws IOException {
        return this.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzk() throws IOException {
        return zzgwp.zzD(this.zzi());
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzl() throws IOException {
        if(this.zzA()) {
            this.zzk = 0;
            return 0;
        }
        int v = this.zzi();
        this.zzk = v;
        if(v >>> 3 == 0) {
            throw new zzgyg("Protocol message contained an invalid tag (zero).");
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzm() throws IOException {
        return this.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final long zzn() throws IOException {
        return this.zzp();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final long zzo() throws IOException {
        return this.zzq();
    }

    public final long zzp() throws IOException {
        long v = this.zzh;
        if(this.zzg - v < 8L) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzh = v + 8L;
        long v1 = (long)zzhao.zza(v);
        long v2 = (long)zzhao.zza(v + 1L);
        long v3 = (long)zzhao.zza(v + 2L);
        long v4 = (long)zzhao.zza(v + 3L);
        long v5 = (long)zzhao.zza(v + 4L);
        long v6 = (long)zzhao.zza(v + 5L);
        long v7 = (long)zzhao.zza(v + 6L);
        return (((long)zzhao.zza(v + 7L)) & 0xFFL) << 56 | (v1 & 0xFFL | (v2 & 0xFFL) << 8 | (v3 & 0xFFL) << 16 | (v4 & 0xFFL) << 24 | (v5 & 0xFFL) << 0x20 | (v6 & 0xFFL) << 40 | (v7 & 0xFFL) << 0x30);
    }

    public final long zzq() throws IOException {
        long v12;
        long v7;
        int v4;
        long v = this.zzh;
        if(this.zzg != v) {
            int v1 = zzhao.zza(v);
            if(v1 >= 0) {
                this.zzh = v + 1L;
                return (long)v1;
            }
            if(this.zzg - (v + 1L) >= 9L) {
                long v2 = v + 2L;
                int v3 = zzhao.zza(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = v3 ^ 0xFFFFFF80;
                    this.zzh = v2;
                    return (long)v4;
                }
                long v5 = v + 3L;
                int v6 = v3 ^ zzhao.zza(v2) << 14;
                if(v6 >= 0) {
                    v7 = (long)(v6 ^ 0x3F80);
                    v2 = v5;
                    this.zzh = v2;
                    return v7;
                }
                v2 = v + 4L;
                int v8 = v6 ^ zzhao.zza(v5) << 21;
                if(v8 < 0) {
                    v4 = 0xFFE03F80 ^ v8;
                    this.zzh = v2;
                    return (long)v4;
                }
                v5 = v + 5L;
                long v9 = ((long)zzhao.zza(v2)) << 28 ^ ((long)v8);
                if(v9 >= 0L) {
                    v7 = 0xFE03F80L ^ v9;
                    v2 = v5;
                    this.zzh = v2;
                    return v7;
                }
                long v10 = v + 6L;
                long v11 = ((long)zzhao.zza(v5)) << 35 ^ v9;
                if(v11 < 0L) {
                    v12 = 0xFFFFFFF80FE03F80L;
                    v7 = v12 ^ v11;
                    v2 = v10;
                    this.zzh = v2;
                    return v7;
                }
                v2 = v + 7L;
                long v13 = v11 ^ ((long)zzhao.zza(v10)) << 42;
                if(v13 >= 0L) {
                    v7 = 0x3F80FE03F80L ^ v13;
                    this.zzh = v2;
                    return v7;
                }
                v10 = v + 8L;
                v11 = v13 ^ ((long)zzhao.zza(v2)) << 49;
                if(v11 < 0L) {
                    v12 = 0xFFFE03F80FE03F80L;
                    v7 = v12 ^ v11;
                    v2 = v10;
                    this.zzh = v2;
                    return v7;
                }
                v2 = v + 9L;
                long v14 = v11 ^ ((long)zzhao.zza(v10)) << 56 ^ 0xFE03F80FE03F80L;
                boolean z = false;
                if(v14 >= 0L) {
                    z = true;
                }
                else if(((long)zzhao.zza(v2)) >= 0L) {
                    z = true;
                    v2 = v + 10L;
                }
                if(z) {
                    this.zzh = v2;
                    return v14;
                }
            }
        }
        return this.zzr();
    }

    final long zzr() throws IOException {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            long v2 = this.zzh;
            if(v2 == this.zzg) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.zzh = v2 + 1L;
            int v3 = zzhao.zza(v2);
            v |= ((long)(v3 & 0x7F)) << v1;
            if((v3 & 0x80) == 0) {
                return v;
            }
        }
        throw new zzgyg("CodedInputStream encountered a malformed varint.");
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final long zzs() throws IOException {
        return this.zzp();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final long zzt() throws IOException {
        return zzgwp.zzF(this.zzq());
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final long zzu() throws IOException {
        return this.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final zzgwj zzv() throws IOException {
        int v = this.zzi();
        if(v > 0 && v <= this.zzC()) {
            byte[] arr_b = new byte[v];
            zzhao.zzo(this.zzh, arr_b, 0L, v);
            this.zzh += (long)v;
            return new zzgwg(arr_b);
        }
        if(v != 0) {
            throw v >= 0 ? new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        return zzgwj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final String zzw() throws IOException {
        int v = this.zzi();
        if(v > 0 && v <= this.zzC()) {
            byte[] arr_b = new byte[v];
            zzhao.zzo(this.zzh, arr_b, 0L, v);
            this.zzh += (long)v;
            return new String(arr_b, zzgye.zza);
        }
        if(v != 0) {
            throw v >= 0 ? new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final String zzx() throws IOException {
        int v = this.zzi();
        if(v > 0 && v <= this.zzC()) {
            String s = zzhat.zzg(this.zze, ((int)(this.zzh - this.zzf)), v);
            this.zzh += (long)v;
            return s;
        }
        if(v != 0) {
            throw v > 0 ? new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final void zzy(int v) throws zzgyg {
        if(this.zzk != v) {
            throw new zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final void zzz(int v) {
        this.zzl = v;
        this.zzI();
    }
}

