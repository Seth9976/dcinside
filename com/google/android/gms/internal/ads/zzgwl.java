package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

final class zzgwl extends zzgwp {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    zzgwl(Iterable iterable0, int v, boolean z, zzgwo zzgwo0) {
        super(null);
        this.zzj = 0x7FFFFFFF;
        this.zzh = v;
        this.zze = iterable0;
        this.zzf = iterable0.iterator();
        this.zzl = 0;
        if(v == 0) {
            this.zzg = zzgye.zzc;
            this.zzm = 0L;
            this.zzn = 0L;
            this.zzo = 0L;
            return;
        }
        this.zzM();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzA() throws IOException {
        return ((long)this.zzl) + this.zzm - this.zzn == ((long)this.zzh);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzB() throws IOException {
        return this.zzr() != 0L;
    }

    final long zzC() throws IOException {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.zzh();
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw new zzgyg("CodedInputStream encountered a malformed varint.");
    }

    private final int zzI() {
        return (int)(((long)(this.zzh - this.zzl)) - this.zzm + this.zzn);
    }

    private final void zzJ() throws zzgyg {
        if(!this.zzf.hasNext()) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzM();
    }

    private final void zzK(byte[] arr_b, int v, int v1) throws IOException {
        if(v1 <= this.zzI()) {
            int v2 = v1;
            while(v2 > 0) {
                if(this.zzo - this.zzm == 0L) {
                    this.zzJ();
                }
                int v3 = Math.min(v2, ((int)(this.zzo - this.zzm)));
                zzhao.zzo(this.zzm, arr_b, v1 - v2, v3);
                v2 -= v3;
                this.zzm += (long)v3;
            }
            return;
        }
        if(v1 > 0) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzL() {
        int v = this.zzh + this.zzi;
        this.zzh = v;
        int v1 = this.zzj;
        if(v > v1) {
            int v2 = v - v1;
            this.zzi = v2;
            this.zzh = v - v2;
            return;
        }
        this.zzi = 0;
    }

    private final void zzM() {
        Object object0 = this.zzf.next();
        this.zzg = (ByteBuffer)object0;
        this.zzl += (int)(this.zzm - this.zzn);
        long v = (long)((ByteBuffer)object0).position();
        this.zzm = v;
        this.zzn = v;
        this.zzo = (long)this.zzg.limit();
        long v1 = zzhao.zze(this.zzg);
        this.zzm += v1;
        this.zzn += v1;
        this.zzo += v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final double zza() throws IOException {
        return Double.longBitsToDouble(this.zzq());
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(this.zzi());
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzc() {
        return (int)(((long)this.zzl) + this.zzm - this.zzn);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzd(int v) throws zzgyg {
        if(v < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v1 = v + this.zzc();
        int v2 = this.zzj;
        if(v1 > v2) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = v1;
        this.zzL();
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zze() throws IOException {
        return this.zzp();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzf() throws IOException {
        return this.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzg() throws IOException {
        return this.zzp();
    }

    public final byte zzh() throws IOException {
        if(this.zzo - this.zzm == 0L) {
            this.zzJ();
        }
        long v = this.zzm;
        this.zzm = v + 1L;
        return zzhao.zza(v);
    }

    public final int zzi() throws IOException {
        long v = this.zzm;
        if(this.zzo - v >= 4L) {
            this.zzm = v + 4L;
            return zzhao.zza(v) & 0xFF | (zzhao.zza(v + 1L) & 0xFF) << 8 | (zzhao.zza(v + 2L) & 0xFF) << 16 | (zzhao.zza(v + 3L) & 0xFF) << 24;
        }
        return this.zzh() & 0xFF | (this.zzh() & 0xFF) << 8 | (this.zzh() & 0xFF) << 16 | (this.zzh() & 0xFF) << 24;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzj() throws IOException {
        return this.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzk() throws IOException {
        return zzgwp.zzD(this.zzp());
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzl() throws IOException {
        if(this.zzA()) {
            this.zzk = 0;
            return 0;
        }
        int v = this.zzp();
        this.zzk = v;
        if(v >>> 3 == 0) {
            throw new zzgyg("Protocol message contained an invalid tag (zero).");
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzm() throws IOException {
        return this.zzp();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final long zzn() throws IOException {
        return this.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final long zzo() throws IOException {
        return this.zzr();
    }

    public final int zzp() throws IOException {
        int v4;
        long v = this.zzm;
        if(this.zzo != v) {
            int v1 = zzhao.zza(v);
            if(v1 >= 0) {
                ++this.zzm;
                return v1;
            }
            if(this.zzo - this.zzm >= 10L) {
                long v2 = v + 2L;
                int v3 = zzhao.zza(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = v3 ^ 0xFFFFFF80;
                    this.zzm = v2;
                    return v4;
                }
                long v5 = v + 3L;
                int v6 = zzhao.zza(v2) << 14 ^ v3;
                if(v6 >= 0) {
                    v4 = v6 ^ 0x3F80;
                    v2 = v5;
                    this.zzm = v2;
                    return v4;
                }
                long v7 = v + 4L;
                int v8 = v6 ^ zzhao.zza(v5) << 21;
                if(v8 < 0) {
                    v4 = 0xFFE03F80 ^ v8;
                    v2 = v7;
                    this.zzm = v2;
                    return v4;
                }
                v5 = v + 5L;
                int v9 = zzhao.zza(v7);
                int v10 = v8 ^ v9 << 28 ^ 0xFE03F80;
                if(v9 >= 0) {
                    v2 = v5;
                    this.zzm = v2;
                    return v10;
                }
                v7 = v + 6L;
                if(zzhao.zza(v5) >= 0) {
                    v2 = v7;
                    this.zzm = v2;
                    return v10;
                }
                v5 = v + 7L;
                if(zzhao.zza(v7) >= 0) {
                    v2 = v5;
                    this.zzm = v2;
                    return v10;
                }
                v7 = v + 8L;
                if(zzhao.zza(v5) >= 0) {
                    v2 = v7;
                    this.zzm = v2;
                    return v10;
                }
                v5 = v + 9L;
                if(zzhao.zza(v7) >= 0) {
                    v2 = v5;
                    this.zzm = v2;
                    return v10;
                }
                else if(zzhao.zza(v5) >= 0) {
                    v2 = v + 10L;
                    this.zzm = v2;
                    return v10;
                }
            }
        }
        return (int)this.zzC();
    }

    public final long zzq() throws IOException {
        long v = this.zzm;
        if(this.zzo - v >= 8L) {
            this.zzm = v + 8L;
            return ((long)zzhao.zza(v)) & 0xFFL | (((long)zzhao.zza(v + 1L)) & 0xFFL) << 8 | (((long)zzhao.zza(v + 2L)) & 0xFFL) << 16 | (((long)zzhao.zza(v + 3L)) & 0xFFL) << 24 | (((long)zzhao.zza(v + 4L)) & 0xFFL) << 0x20 | (((long)zzhao.zza(v + 5L)) & 0xFFL) << 40 | (((long)zzhao.zza(v + 6L)) & 0xFFL) << 0x30 | (((long)zzhao.zza(v + 7L)) & 0xFFL) << 56;
        }
        return ((long)this.zzh()) & 0xFFL | (((long)this.zzh()) & 0xFFL) << 8 | (((long)this.zzh()) & 0xFFL) << 16 | (((long)this.zzh()) & 0xFFL) << 24 | (((long)this.zzh()) & 0xFFL) << 0x20 | (((long)this.zzh()) & 0xFFL) << 40 | (((long)this.zzh()) & 0xFFL) << 0x30 | (((long)this.zzh()) & 0xFFL) << 56;
    }

    public final long zzr() throws IOException {
        long v11;
        long v4;
        long v = this.zzm;
        if(this.zzo != v) {
            int v1 = zzhao.zza(v);
            if(v1 >= 0) {
                ++this.zzm;
                return (long)v1;
            }
            if(this.zzo - this.zzm >= 10L) {
                long v2 = v + 2L;
                int v3 = zzhao.zza(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = (long)(v3 ^ 0xFFFFFF80);
                    this.zzm = v2;
                    return v4;
                }
                long v5 = v + 3L;
                int v6 = zzhao.zza(v2) << 14 ^ v3;
                if(v6 >= 0) {
                    v4 = (long)(v6 ^ 0x3F80);
                    v2 = v5;
                    this.zzm = v2;
                    return v4;
                }
                int v7 = v6 ^ zzhao.zza(v5) << 21;
                if(v7 < 0) {
                    v4 = (long)(0xFFE03F80 ^ v7);
                    v2 = v + 4L;
                    this.zzm = v2;
                    return v4;
                }
                v5 = v + 5L;
                long v8 = ((long)zzhao.zza(v + 4L)) << 28 ^ ((long)v7);
                if(v8 >= 0L) {
                    v4 = 0xFE03F80L ^ v8;
                    v2 = v5;
                    this.zzm = v2;
                    return v4;
                }
                long v9 = v + 6L;
                long v10 = v8 ^ ((long)zzhao.zza(v5)) << 35;
                if(v10 < 0L) {
                    v11 = 0xFFFFFFF80FE03F80L;
                    v4 = v11 ^ v10;
                    v2 = v9;
                    this.zzm = v2;
                    return v4;
                }
                long v12 = v + 7L;
                long v13 = v10 ^ ((long)zzhao.zza(v9)) << 42;
                if(v13 >= 0L) {
                    v4 = 0x3F80FE03F80L ^ v13;
                    v2 = v12;
                    this.zzm = v2;
                    return v4;
                }
                v9 = v + 8L;
                v10 = v13 ^ ((long)zzhao.zza(v12)) << 49;
                if(v10 < 0L) {
                    v11 = 0xFFFE03F80FE03F80L;
                    v4 = v11 ^ v10;
                    v2 = v9;
                    this.zzm = v2;
                    return v4;
                }
                v12 = v + 9L;
                long v14 = v10 ^ ((long)zzhao.zza(v9)) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    v2 = v12;
                    this.zzm = v2;
                    return v14;
                }
                else if(((long)zzhao.zza(v12)) >= 0L) {
                    v2 = v + 10L;
                    this.zzm = v2;
                    return v14;
                }
            }
        }
        return this.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final long zzs() throws IOException {
        return this.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final long zzt() throws IOException {
        return zzgwp.zzF(this.zzr());
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final long zzu() throws IOException {
        return this.zzr();
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final zzgwj zzv() throws IOException {
        int v = this.zzp();
        if(v > 0) {
            long v1 = this.zzm;
            if(((long)v) <= this.zzo - v1) {
                byte[] arr_b = new byte[v];
                zzhao.zzo(v1, arr_b, 0L, v);
                this.zzm += (long)v;
                return new zzgwg(arr_b);
            }
        }
        if(v > 0 && v <= this.zzI()) {
            byte[] arr_b1 = new byte[v];
            this.zzK(arr_b1, 0, v);
            return new zzgwg(arr_b1);
        }
        if(v != 0) {
            throw v >= 0 ? new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        return zzgwj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final String zzw() throws IOException {
        int v = this.zzp();
        if(v > 0) {
            long v1 = this.zzm;
            if(((long)v) <= this.zzo - v1) {
                byte[] arr_b = new byte[v];
                zzhao.zzo(v1, arr_b, 0L, v);
                this.zzm += (long)v;
                return new String(arr_b, zzgye.zza);
            }
        }
        if(v > 0 && v <= this.zzI()) {
            byte[] arr_b1 = new byte[v];
            this.zzK(arr_b1, 0, v);
            return new String(arr_b1, zzgye.zza);
        }
        if(v != 0) {
            throw v >= 0 ? new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final String zzx() throws IOException {
        int v = this.zzp();
        if(v > 0) {
            long v1 = this.zzm;
            if(((long)v) <= this.zzo - v1) {
                String s = zzhat.zzg(this.zzg, ((int)(v1 - this.zzn)), v);
                this.zzm += (long)v;
                return s;
            }
        }
        if(v >= 0 && v <= this.zzI()) {
            byte[] arr_b = new byte[v];
            this.zzK(arr_b, 0, v);
            return zzhat.zzh(arr_b, 0, v);
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
        this.zzj = v;
        this.zzL();
    }
}

