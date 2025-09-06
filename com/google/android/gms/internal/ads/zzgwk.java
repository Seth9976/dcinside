package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

final class zzgwk extends zzgwp {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    zzgwk(byte[] arr_b, int v, int v1, boolean z, zzgwo zzgwo0) {
        super(null);
        this.zzk = 0x7FFFFFFF;
        this.zze = arr_b;
        this.zzf = v1 + v;
        this.zzh = v;
        this.zzi = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzA() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzB() throws IOException {
        return this.zzq() != 0L;
    }

    private final void zzC() {
        int v = this.zzf + this.zzg;
        this.zzf = v;
        int v1 = v - this.zzi;
        int v2 = this.zzk;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.zzg = v3;
            this.zzf = v - v3;
            return;
        }
        this.zzg = 0;
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
        return this.zzh - this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzd(int v) throws zzgyg {
        if(v < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v1 = v + (this.zzh - this.zzi);
        if(v1 < 0) {
            throw new zzgyg("Failed to parse the message.");
        }
        int v2 = this.zzk;
        if(v1 > v2) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = v1;
        this.zzC();
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
        int v = this.zzh;
        if(this.zzf - v < 4) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzh = v + 4;
        return (this.zze[v + 3] & 0xFF) << 24 | ((this.zze[v + 1] & 0xFF) << 8 | this.zze[v] & 0xFF | (this.zze[v + 2] & 0xFF) << 16);
    }

    public final int zzi() throws IOException {
        int v5;
        int v = this.zzh;
        int v1 = this.zzf;
        if(v1 != v) {
            byte[] arr_b = this.zze;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.zzh = v + 1;
                return v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = v4 ^ 0xFFFFFF80;
                    this.zzh = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = v7 ^ 0x3F80;
                    v3 = v6;
                    this.zzh = v3;
                    return v5;
                }
                int v8 = v + 4;
                int v9 = v7 ^ arr_b[v6] << 21;
                if(v9 < 0) {
                    v5 = 0xFFE03F80 ^ v9;
                    v3 = v8;
                    this.zzh = v3;
                    return v5;
                }
                v6 = v + 5;
                int v10 = arr_b[v8];
                int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                if(v10 >= 0) {
                    v3 = v6;
                    this.zzh = v3;
                    return v11;
                }
                v8 = v + 6;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.zzh = v3;
                    return v11;
                }
                v6 = v + 7;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.zzh = v3;
                    return v11;
                }
                v8 = v + 8;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.zzh = v3;
                    return v11;
                }
                v6 = v + 9;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.zzh = v3;
                    return v11;
                }
                else if(arr_b[v6] >= 0) {
                    v3 = v + 10;
                    this.zzh = v3;
                    return v11;
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
            this.zzj = 0;
            return 0;
        }
        int v = this.zzi();
        this.zzj = v;
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
        int v = this.zzh;
        if(this.zzf - v < 8) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzh = v + 8;
        return (((long)this.zze[v + 7]) & 0xFFL) << 56 | (((long)this.zze[v]) & 0xFFL | (((long)this.zze[v + 1]) & 0xFFL) << 8 | (((long)this.zze[v + 2]) & 0xFFL) << 16 | (((long)this.zze[v + 3]) & 0xFFL) << 24 | (((long)this.zze[v + 4]) & 0xFFL) << 0x20 | (((long)this.zze[v + 5]) & 0xFFL) << 40 | (((long)this.zze[v + 6]) & 0xFFL) << 0x30);
    }

    public final long zzq() throws IOException {
        long v11;
        long v5;
        int v = this.zzh;
        int v1 = this.zzf;
        if(v1 != v) {
            byte[] arr_b = this.zze;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.zzh = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = (long)(v4 ^ 0xFFFFFF80);
                    this.zzh = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = (long)(v7 ^ 0x3F80);
                    v3 = v6;
                    this.zzh = v3;
                    return v5;
                }
                int v8 = v7 ^ arr_b[v6] << 21;
                if(v8 < 0) {
                    v3 = v + 4;
                    v5 = (long)(0xFFE03F80 ^ v8);
                    this.zzh = v3;
                    return v5;
                }
                v6 = v + 5;
                long v9 = ((long)arr_b[v + 4]) << 28 ^ ((long)v8);
                if(v9 >= 0L) {
                    v5 = v9 ^ 0xFE03F80L;
                    v3 = v6;
                    this.zzh = v3;
                    return v5;
                }
                v3 = v + 6;
                long v10 = ((long)arr_b[v6]) << 35 ^ v9;
                if(v10 < 0L) {
                    v11 = 0xFFFFFFF80FE03F80L;
                    v5 = v10 ^ v11;
                    this.zzh = v3;
                    return v5;
                }
                int v12 = v + 7;
                long v13 = v10 ^ ((long)arr_b[v3]) << 42;
                if(v13 >= 0L) {
                    v5 = v13 ^ 0x3F80FE03F80L;
                    v3 = v12;
                    this.zzh = v3;
                    return v5;
                }
                v3 = v + 8;
                v10 = v13 ^ ((long)arr_b[v12]) << 49;
                if(v10 < 0L) {
                    v11 = 0xFFFE03F80FE03F80L;
                    v5 = v10 ^ v11;
                    this.zzh = v3;
                    return v5;
                }
                v12 = v + 9;
                long v14 = v10 ^ ((long)arr_b[v3]) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    v3 = v12;
                    this.zzh = v3;
                    return v14;
                }
                v3 = v + 10;
                if(((long)arr_b[v12]) >= 0L) {
                    this.zzh = v3;
                    return v14;
                }
            }
        }
        return this.zzr();
    }

    final long zzr() throws IOException {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.zzh;
            if(v2 == this.zzf) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.zzh = v2 + 1;
            int v3 = this.zze[v2];
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
        if(v > 0) {
            int v1 = this.zzh;
            if(v <= this.zzf - v1) {
                zzgwj zzgwj0 = zzgwj.zzv(this.zze, v1, v);
                this.zzh += v;
                return zzgwj0;
            }
        }
        if(v != 0) {
            if(v > 0) {
                int v2 = this.zzh;
                if(v <= this.zzf - v2) {
                    int v3 = v + v2;
                    this.zzh = v3;
                    return new zzgwg(Arrays.copyOfRange(this.zze, v2, v3));
                }
            }
            throw v > 0 ? new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        return zzgwj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final String zzw() throws IOException {
        int v = this.zzi();
        if(v > 0) {
            int v1 = this.zzh;
            if(v <= this.zzf - v1) {
                String s = new String(this.zze, v1, v, zzgye.zza);
                this.zzh += v;
                return s;
            }
        }
        if(v != 0) {
            throw v >= 0 ? new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final String zzx() throws IOException {
        int v = this.zzi();
        if(v > 0) {
            int v1 = this.zzh;
            if(v <= this.zzf - v1) {
                String s = zzhat.zzh(this.zze, v1, v);
                this.zzh += v;
                return s;
            }
        }
        if(v != 0) {
            throw v > 0 ? new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final void zzy(int v) throws zzgyg {
        if(this.zzj != v) {
            throw new zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final void zzz(int v) {
        this.zzk = v;
        this.zzC();
    }
}

