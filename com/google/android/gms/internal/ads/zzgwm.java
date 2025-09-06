package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class zzgwm extends zzgwp {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    zzgwm(InputStream inputStream0, int v, zzgwo zzgwo0) {
        super(null);
        this.zzl = 0x7FFFFFFF;
        this.zze = inputStream0;
        this.zzf = new byte[0x1000];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzA() throws IOException {
        return this.zzi == this.zzg && !this.zzL(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzB() throws IOException {
        return this.zzq() != 0L;
    }

    public final void zzC(int v) throws IOException {
        int v11;
        long v8;
        int v1 = this.zzi;
        int v2 = this.zzg - v1;
        if(v <= v2 && v >= 0) {
            this.zzi = v1 + v;
            return;
        }
        if(v < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v3 = this.zzk;
        int v4 = v3 + v1;
        int v5 = this.zzl;
        if(v4 + v <= v5) {
            this.zzk = v4;
            this.zzg = 0;
            this.zzi = 0;
            try {
                while(v2 < v) {
                    try {
                        long v7 = (long)(v - v2);
                        v8 = this.zze.skip(v7);
                        int v9 = Long.compare(v8, 0L);
                    }
                    catch(zzgyg zzgyg0) {
                        zzgyg0.zza();
                        throw zzgyg0;
                    }
                    if(v9 < 0 || v8 > v7) {
                        throw new IllegalStateException(this.zze.getClass() + "#skip returned invalid result: " + v8 + "\nThe InputStream implementation is buggy.");
                    }
                    if(v9 == 0) {
                        break;
                    }
                    v2 += (int)v8;
                }
            }
            finally {
                this.zzk += v2;
                this.zzJ();
            }
            if(v2 < v) {
                int v10 = this.zzg - this.zzi;
                this.zzi = this.zzg;
                this.zzK(1);
                while(true) {
                    v11 = v - v10;
                    int v12 = this.zzg;
                    if(v11 <= v12) {
                        break;
                    }
                    v10 += v12;
                    this.zzi = v12;
                    this.zzK(1);
                }
                this.zzi = v11;
            }
            return;
        }
        this.zzC(v5 - v3 - v1);
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final List zzI(int v) throws IOException {
        List list0 = new ArrayList();
        while(v > 0) {
            int v1 = Math.min(v, 0x1000);
            byte[] arr_b = new byte[v1];
            for(int v2 = 0; v2 < v1; v2 += v3) {
                int v3 = this.zze.read(arr_b, v2, v1 - v2);
                if(v3 == -1) {
                    throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += v3;
            }
            v -= v1;
            list0.add(arr_b);
        }
        return list0;
    }

    private final void zzJ() {
        int v = this.zzg + this.zzh;
        this.zzg = v;
        int v1 = this.zzk + v;
        int v2 = this.zzl;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.zzh = v3;
            this.zzg = v - v3;
            return;
        }
        this.zzh = 0;
    }

    private final void zzK(int v) throws IOException {
        if(!this.zzL(v)) {
            throw v <= 0x7FFFFFFF - this.zzk - this.zzi ? new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new zzgyg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
    }

    private final boolean zzL(int v) throws IOException {
        int v4;
        int v1 = this.zzi;
        int v2 = this.zzg;
        if(v1 + v <= v2) {
            throw new IllegalStateException("refillBuffer() called when " + v + " bytes were already available in buffer");
        }
        int v3 = this.zzk;
        if(v > 0x7FFFFFFF - v3 - v1) {
            return false;
        }
        if(v3 + v1 + v > this.zzl) {
            return false;
        }
        if(v1 > 0) {
            if(v2 > v1) {
                System.arraycopy(this.zzf, v1, this.zzf, 0, v2 - v1);
            }
            v3 = this.zzk + v1;
            this.zzk = v3;
            v2 = this.zzg - v1;
            this.zzg = v2;
            this.zzi = 0;
        }
        try {
            v4 = this.zze.read(this.zzf, v2, Math.min(0x1000 - v2, 0x7FFFFFFF - v3 - v2));
        }
        catch(zzgyg zzgyg0) {
            zzgyg0.zza();
            throw zzgyg0;
        }
        if(v4 == 0 || v4 < -1 || v4 > 0x1000) {
            throw new IllegalStateException(this.zze.getClass() + "#read(byte[]) returned invalid result: " + v4 + "\nThe InputStream implementation is buggy.");
        }
        if(v4 > 0) {
            this.zzg += v4;
            this.zzJ();
            return this.zzg < v ? this.zzL(v) : true;
        }
        return false;
    }

    private final byte[] zzM(int v, boolean z) throws IOException {
        byte[] arr_b = this.zzN(v);
        if(arr_b != null) {
            return arr_b;
        }
        int v1 = this.zzi;
        int v2 = this.zzg - v1;
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        List list0 = this.zzI(v - v2);
        byte[] arr_b1 = new byte[v];
        System.arraycopy(this.zzf, v1, arr_b1, 0, v2);
        for(Object object0: list0) {
            System.arraycopy(((byte[])object0), 0, arr_b1, v2, ((byte[])object0).length);
            v2 += ((byte[])object0).length;
        }
        return arr_b1;
    }

    private final byte[] zzN(int v) throws IOException {
        int v7;
        if(v == 0) {
            return zzgye.zzb;
        }
        int v1 = this.zzk;
        int v2 = this.zzi;
        int v3 = v1 + v2 + v;
        if(v3 - 0x7FFFFFFF > 0) {
            throw new zzgyg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int v4 = this.zzl;
        if(v3 <= v4) {
            int v5 = this.zzg - v2;
            int v6 = v - v5;
            if(v6 >= 0x1000) {
                try {
                    if(v6 > this.zze.available()) {
                        return null;
                    }
                }
                catch(zzgyg zzgyg0) {
                    zzgyg0.zza();
                    throw zzgyg0;
                }
            }
            byte[] arr_b = new byte[v];
            System.arraycopy(this.zzf, this.zzi, arr_b, 0, v5);
            this.zzk += this.zzg;
            this.zzi = 0;
            this.zzg = 0;
            while(v5 < v) {
                try {
                    v7 = this.zze.read(arr_b, v5, v - v5);
                }
                catch(zzgyg zzgyg1) {
                    zzgyg1.zza();
                    throw zzgyg1;
                }
                if(v7 == -1) {
                    throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += v7;
                v5 += v7;
            }
            return arr_b;
        }
        this.zzC(v4 - v1 - v2);
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        return this.zzk + this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final int zzd(int v) throws zzgyg {
        if(v < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v1 = v + (this.zzk + this.zzi);
        if(v1 < 0) {
            throw new zzgyg("Failed to parse the message.");
        }
        int v2 = this.zzl;
        if(v1 > v2) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = v1;
        this.zzJ();
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
        int v = this.zzi;
        if(this.zzg - v < 4) {
            this.zzK(4);
            v = this.zzi;
        }
        this.zzi = v + 4;
        return (this.zzf[v + 3] & 0xFF) << 24 | ((this.zzf[v + 1] & 0xFF) << 8 | this.zzf[v] & 0xFF | (this.zzf[v + 2] & 0xFF) << 16);
    }

    public final int zzi() throws IOException {
        int v5;
        int v = this.zzi;
        int v1 = this.zzg;
        if(v1 != v) {
            byte[] arr_b = this.zzf;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.zzi = v + 1;
                return v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = v4 ^ 0xFFFFFF80;
                    this.zzi = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = v7 ^ 0x3F80;
                    v3 = v6;
                    this.zzi = v3;
                    return v5;
                }
                int v8 = v + 4;
                int v9 = v7 ^ arr_b[v6] << 21;
                if(v9 < 0) {
                    v5 = 0xFFE03F80 ^ v9;
                    v3 = v8;
                    this.zzi = v3;
                    return v5;
                }
                v6 = v + 5;
                int v10 = arr_b[v8];
                int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                if(v10 >= 0) {
                    v3 = v6;
                    this.zzi = v3;
                    return v11;
                }
                v8 = v + 6;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.zzi = v3;
                    return v11;
                }
                v6 = v + 7;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.zzi = v3;
                    return v11;
                }
                v8 = v + 8;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.zzi = v3;
                    return v11;
                }
                v6 = v + 9;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.zzi = v3;
                    return v11;
                }
                else if(arr_b[v6] >= 0) {
                    v3 = v + 10;
                    this.zzi = v3;
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
        int v = this.zzi;
        if(this.zzg - v < 8) {
            this.zzK(8);
            v = this.zzi;
        }
        this.zzi = v + 8;
        return (((long)this.zzf[v + 7]) & 0xFFL) << 56 | (((long)this.zzf[v]) & 0xFFL | (((long)this.zzf[v + 1]) & 0xFFL) << 8 | (((long)this.zzf[v + 2]) & 0xFFL) << 16 | (((long)this.zzf[v + 3]) & 0xFFL) << 24 | (((long)this.zzf[v + 4]) & 0xFFL) << 0x20 | (((long)this.zzf[v + 5]) & 0xFFL) << 40 | (((long)this.zzf[v + 6]) & 0xFFL) << 0x30);
    }

    public final long zzq() throws IOException {
        long v11;
        long v5;
        int v = this.zzi;
        int v1 = this.zzg;
        if(v1 != v) {
            byte[] arr_b = this.zzf;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.zzi = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = (long)(v4 ^ 0xFFFFFF80);
                    this.zzi = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = (long)(v7 ^ 0x3F80);
                    v3 = v6;
                    this.zzi = v3;
                    return v5;
                }
                int v8 = v7 ^ arr_b[v6] << 21;
                if(v8 < 0) {
                    v3 = v + 4;
                    v5 = (long)(0xFFE03F80 ^ v8);
                    this.zzi = v3;
                    return v5;
                }
                v6 = v + 5;
                long v9 = ((long)arr_b[v + 4]) << 28 ^ ((long)v8);
                if(v9 >= 0L) {
                    v5 = v9 ^ 0xFE03F80L;
                    v3 = v6;
                    this.zzi = v3;
                    return v5;
                }
                v3 = v + 6;
                long v10 = ((long)arr_b[v6]) << 35 ^ v9;
                if(v10 < 0L) {
                    v11 = 0xFFFFFFF80FE03F80L;
                    v5 = v10 ^ v11;
                    this.zzi = v3;
                    return v5;
                }
                int v12 = v + 7;
                long v13 = v10 ^ ((long)arr_b[v3]) << 42;
                if(v13 >= 0L) {
                    v5 = v13 ^ 0x3F80FE03F80L;
                    v3 = v12;
                    this.zzi = v3;
                    return v5;
                }
                v3 = v + 8;
                v10 = v13 ^ ((long)arr_b[v12]) << 49;
                if(v10 < 0L) {
                    v11 = 0xFFFE03F80FE03F80L;
                    v5 = v10 ^ v11;
                    this.zzi = v3;
                    return v5;
                }
                v12 = v + 9;
                long v14 = v10 ^ ((long)arr_b[v3]) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    v3 = v12;
                    this.zzi = v3;
                    return v14;
                }
                v3 = v + 10;
                if(((long)arr_b[v12]) >= 0L) {
                    this.zzi = v3;
                    return v14;
                }
            }
        }
        return this.zzr();
    }

    final long zzr() throws IOException {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            if(this.zzi == this.zzg) {
                this.zzK(1);
            }
            int v2 = this.zzi;
            this.zzi = v2 + 1;
            int v3 = this.zzf[v2];
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
        int v1 = this.zzi;
        if(v <= this.zzg - v1 && v > 0) {
            zzgwj zzgwj0 = zzgwj.zzv(this.zzf, v1, v);
            this.zzi += v;
            return zzgwj0;
        }
        if(v == 0) {
            return zzgwj.zzb;
        }
        if(v < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] arr_b = this.zzN(v);
        if(arr_b != null) {
            return zzgwj.zzv(arr_b, 0, arr_b.length);
        }
        int v2 = this.zzi;
        int v3 = this.zzg - v2;
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        List list0 = this.zzI(v - v3);
        byte[] arr_b1 = new byte[v];
        System.arraycopy(this.zzf, v2, arr_b1, 0, v3);
        for(Object object0: list0) {
            System.arraycopy(((byte[])object0), 0, arr_b1, v3, ((byte[])object0).length);
            v3 += ((byte[])object0).length;
        }
        return new zzgwg(arr_b1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final String zzw() throws IOException {
        int v = this.zzi();
        if(v > 0) {
            int v1 = this.zzi;
            if(v <= this.zzg - v1) {
                String s = new String(this.zzf, v1, v, zzgye.zza);
                this.zzi += v;
                return s;
            }
        }
        if(v == 0) {
            return "";
        }
        if(v < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if(v <= this.zzg) {
            this.zzK(v);
            String s1 = new String(this.zzf, this.zzi, v, zzgye.zza);
            this.zzi += v;
            return s1;
        }
        return new String(this.zzM(v, false), zzgye.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final String zzx() throws IOException {
        int v = this.zzi();
        int v1 = this.zzi;
        int v2 = this.zzg;
        if(v <= v2 - v1 && v > 0) {
            this.zzi = v1 + v;
            return zzhat.zzh(this.zzf, v1, v);
        }
        if(v == 0) {
            return "";
        }
        if(v < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if(v <= v2) {
            this.zzK(v);
            this.zzi = v;
            return zzhat.zzh(this.zzf, v1, v);
        }
        return zzhat.zzh(this.zzM(v, false), v1, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final void zzy(int v) throws zzgyg {
        if(this.zzj != v) {
            throw new zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgwp
    public final void zzz(int v) {
        this.zzl = v;
        this.zzJ();
    }
}

