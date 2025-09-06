package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class zzdy {
    private static final char[] zza;
    private static final char[] zzb;
    private static final zzfxs zzc;
    private byte[] zzd;
    private int zze;
    private int zzf;

    static {
        zzdy.zza = new char[]{'\r', '\n'};
        zzdy.zzb = new char[]{'\n'};
        zzdy.zzc = zzfxs.zzr(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    }

    public zzdy() {
        this.zzd = zzei.zzf;
    }

    public zzdy(int v) {
        this.zzd = new byte[v];
        this.zzf = v;
    }

    public zzdy(byte[] arr_b) {
        this.zzd = arr_b;
        this.zzf = arr_b.length;
    }

    public zzdy(byte[] arr_b, int v) {
        this.zzd = arr_b;
        this.zzf = v;
    }

    public final String zzA(int v) {
        if(v == 0) {
            return "";
        }
        int v1 = this.zze + v - 1;
        String s = zzei.zzC(this.zzd, this.zze, (v1 >= this.zzf || this.zzd[v1] != 0 ? v : v - 1));
        this.zze += v;
        return s;
    }

    public final String zzB(int v, Charset charset0) {
        int v1 = this.zze;
        String s = new String(this.zzd, v1, v, charset0);
        this.zze = v1 + v;
        return s;
    }

    @Nullable
    public final Charset zzC() {
        int v = this.zze;
        int v1 = this.zzf - v;
        if(v1 >= 3 && (this.zzd[v] == -17 && this.zzd[v + 1] == -69 && this.zzd[v + 2] == -65)) {
            this.zze = v + 3;
            return StandardCharsets.UTF_8;
        }
        if(v1 >= 2) {
            byte[] arr_b = this.zzd;
            int v2 = arr_b[v];
            if(v2 == -2) {
                if(arr_b[v + 1] == -1) {
                    this.zze = v + 2;
                    return StandardCharsets.UTF_16BE;
                }
            }
            else if(v2 == -1 && arr_b[v + 1] == -2) {
                this.zze = v + 2;
                return StandardCharsets.UTF_16LE;
            }
        }
        return null;
    }

    public final short zzD() {
        int v = this.zze;
        this.zze = v + 2;
        return (short)((this.zzd[v + 1] & 0xFF) << 8 | this.zzd[v] & 0xFF);
    }

    public final short zzE() {
        int v = this.zze;
        this.zze = v + 2;
        return (short)(this.zzd[v + 1] & 0xFF | (this.zzd[v] & 0xFF) << 8);
    }

    public final void zzF(int v) {
        byte[] arr_b = this.zzd;
        if(v > arr_b.length) {
            this.zzd = Arrays.copyOf(arr_b, v);
        }
    }

    public final void zzG(zzdx zzdx0, int v) {
        this.zzH(zzdx0.zza, 0, v);
        zzdx0.zzl(0);
    }

    public final void zzH(byte[] arr_b, int v, int v1) {
        System.arraycopy(this.zzd, this.zze, arr_b, v, v1);
        this.zze += v1;
    }

    public final void zzI(int v) {
        this.zzJ((this.zzd.length >= v ? this.zzd : new byte[v]), v);
    }

    public final void zzJ(byte[] arr_b, int v) {
        this.zzd = arr_b;
        this.zzf = v;
        this.zze = 0;
    }

    public final void zzK(int v) {
        zzcw.zzd(v >= 0 && v <= this.zzd.length);
        this.zzf = v;
    }

    public final void zzL(int v) {
        zzcw.zzd(v >= 0 && v <= this.zzf);
        this.zze = v;
    }

    public final void zzM(int v) {
        this.zzL(this.zze + v);
    }

    public final byte[] zzN() {
        return this.zzd;
    }

    private final char zzO(Charset charset0, char[] arr_c) {
        int v = this.zzP(charset0);
        if(v != 0) {
            for(int v1 = 0; v1 < arr_c.length; ++v1) {
                if(arr_c[v1] == ((char)(v >> 16))) {
                    this.zze += (char)v;
                    return (char)(v >> 16);
                }
            }
        }
        return '\u0000';
    }

    private final int zzP(Charset charset0) {
        if(charset0.equals(StandardCharsets.UTF_8) || charset0.equals(StandardCharsets.US_ASCII)) {
            int v = this.zze;
            if(this.zzf - v > 0) {
                return (zzgan.zza(((byte)zzgan.zza(this.zzd[v] & 0xFF))) << 16) + 1;
            }
        }
        if(charset0.equals(StandardCharsets.UTF_16) || charset0.equals(StandardCharsets.UTF_16BE)) {
            int v1 = this.zze;
            if(this.zzf - v1 >= 2) {
                return (zzgan.zza(((byte)zzgan.zzb(this.zzd[v1], this.zzd[v1 + 1]))) << 16) + 2;
            }
        }
        if(charset0.equals(StandardCharsets.UTF_16LE)) {
            return this.zzf - this.zze < 2 ? 0 : (zzgan.zza(((byte)zzgan.zzb(this.zzd[this.zze + 1], this.zzd[this.zze]))) << 16) + 2;
        }
        return 0;
    }

    public final char zza(Charset charset0) {
        zzcw.zze(zzdy.zzc.contains(charset0), "Unsupported charset: " + charset0);
        return (char)(this.zzP(charset0) >> 16);
    }

    public final int zzb() {
        return this.zzf - this.zze;
    }

    public final int zzc() {
        return this.zzd.length;
    }

    public final int zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 0xFF;
    }

    public final int zzg() {
        int v = this.zze;
        this.zze = v + 4;
        return this.zzd[v + 3] & 0xFF | ((this.zzd[v] & 0xFF) << 24 | (this.zzd[v + 1] & 0xFF) << 16 | (this.zzd[v + 2] & 0xFF) << 8);
    }

    public final int zzh() {
        int v = this.zze;
        this.zze = v + 3;
        return this.zzd[v + 2] & 0xFF | ((this.zzd[v] & 0xFF) << 24 >> 8 | (this.zzd[v + 1] & 0xFF) << 8);
    }

    public final int zzi() {
        int v = this.zze;
        this.zze = v + 4;
        return (this.zzd[v + 3] & 0xFF) << 24 | ((this.zzd[v + 1] & 0xFF) << 8 | this.zzd[v] & 0xFF | (this.zzd[v + 2] & 0xFF) << 16);
    }

    public final int zzj() {
        int v = this.zzi();
        if(v < 0) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public final int zzk() {
        int v = this.zze;
        this.zze = v + 2;
        return (this.zzd[v + 1] & 0xFF) << 8 | this.zzd[v] & 0xFF;
    }

    public final int zzl() {
        return this.zzm() << 21 | this.zzm() << 14 | this.zzm() << 7 | this.zzm();
    }

    public final int zzm() {
        int v = this.zze;
        this.zze = v + 1;
        return this.zzd[v] & 0xFF;
    }

    public final int zzn() {
        int v = this.zze;
        this.zze = v + 4;
        return this.zzd[v + 1] & 0xFF | (this.zzd[v] & 0xFF) << 8;
    }

    public final int zzo() {
        int v = this.zze;
        this.zze = v + 3;
        return this.zzd[v + 2] & 0xFF | ((this.zzd[v] & 0xFF) << 16 | (this.zzd[v + 1] & 0xFF) << 8);
    }

    public final int zzp() {
        int v = this.zzg();
        if(v < 0) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public final int zzq() {
        int v = this.zze;
        this.zze = v + 2;
        return this.zzd[v + 1] & 0xFF | (this.zzd[v] & 0xFF) << 8;
    }

    public final long zzr() {
        int v = this.zze;
        this.zze = v + 8;
        return (((long)this.zzd[v + 7]) & 0xFFL) << 56 | ((((long)this.zzd[v + 6]) & 0xFFL) << 0x30 | ((((long)this.zzd[v + 1]) & 0xFFL) << 8 | ((long)this.zzd[v]) & 0xFFL | (((long)this.zzd[v + 2]) & 0xFFL) << 16 | (((long)this.zzd[v + 3]) & 0xFFL) << 24 | (((long)this.zzd[v + 4]) & 0xFFL) << 0x20 | (((long)this.zzd[v + 5]) & 0xFFL) << 40));
    }

    public final long zzs() {
        int v = this.zze;
        this.zze = v + 4;
        return (((long)this.zzd[v + 3]) & 0xFFL) << 24 | (((long)this.zzd[v]) & 0xFFL | (((long)this.zzd[v + 1]) & 0xFFL) << 8 | (((long)this.zzd[v + 2]) & 0xFFL) << 16);
    }

    public final long zzt() {
        int v = this.zze;
        this.zze = v + 8;
        return ((long)this.zzd[v + 7]) & 0xFFL | ((((long)this.zzd[v]) & 0xFFL) << 56 | (((long)this.zzd[v + 1]) & 0xFFL) << 0x30 | (((long)this.zzd[v + 2]) & 0xFFL) << 40 | (((long)this.zzd[v + 3]) & 0xFFL) << 0x20 | (((long)this.zzd[v + 4]) & 0xFFL) << 24 | (((long)this.zzd[v + 5]) & 0xFFL) << 16 | (((long)this.zzd[v + 6]) & 0xFFL) << 8);
    }

    public final long zzu() {
        int v = this.zze;
        this.zze = v + 4;
        return ((long)this.zzd[v + 3]) & 0xFFL | ((((long)this.zzd[v]) & 0xFFL) << 24 | (((long)this.zzd[v + 1]) & 0xFFL) << 16 | (((long)this.zzd[v + 2]) & 0xFFL) << 8);
    }

    public final long zzv() {
        long v = 0L;
        for(int v1 = 0; v1 < 9; ++v1) {
            if(this.zze == this.zzf) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long v2 = (long)this.zzm();
            v |= (0x7FL & v2) << v1 * 7;
            if((v2 & 0x80L) == 0L) {
                break;
            }
        }
        return v;
    }

    public final long zzw() {
        long v = this.zzt();
        if(v < 0L) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public final long zzx() {
        int v3;
        int v2;
        long v = (long)this.zzd[this.zze];
        for(int v1 = 7; true; --v1) {
            v2 = 0;
            v3 = 1;
            if(v1 < 0) {
                break;
            }
            if((((long)(1 << v1)) & v) == 0L) {
                if(v1 < 6) {
                    v &= (long)((1 << v1) - 1);
                    v2 = 7 - v1;
                    break;
                }
                if(v1 != 7) {
                    break;
                }
                v2 = 1;
                break;
            }
        }
        if(v2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + v);
        }
        while(v3 < v2) {
            int v4 = this.zzd[this.zze + v3];
            if((v4 & 0xC0) != 0x80) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + v);
            }
            v = v << 6 | ((long)(v4 & 0x3F));
            ++v3;
        }
        this.zze += v2;
        return v;
    }

    @Nullable
    public final String zzy(char c) {
        int v = this.zze;
        if(this.zzf - v != 0) {
            while(v < this.zzf && this.zzd[v] != 0) {
                ++v;
            }
            String s = zzei.zzC(this.zzd, this.zze, v - this.zze);
            this.zze = v;
            if(v < this.zzf) {
                this.zze = v + 1;
            }
            return s;
        }
        return null;
    }

    @Nullable
    public final String zzz(Charset charset0) {
        zzcw.zze(zzdy.zzc.contains(charset0), "Unsupported charset: " + charset0);
        if(this.zzf - this.zze == 0) {
            return null;
        }
        Charset charset1 = StandardCharsets.US_ASCII;
        if(!charset0.equals(charset1)) {
            this.zzC();
        }
        if(!charset0.equals(StandardCharsets.UTF_8) && !charset0.equals(charset1) && (!charset0.equals(StandardCharsets.UTF_16) && !charset0.equals(StandardCharsets.UTF_16LE) && !charset0.equals(StandardCharsets.UTF_16BE))) {
            throw new IllegalArgumentException("Unsupported charset: " + charset0);
        }
        int v;
        for(v = this.zze; true; ++v) {
            int v1 = this.zzf;
            if(v >= v1) {
                v = v1;
                break;
            }
            if((charset0.equals(StandardCharsets.UTF_8) || charset0.equals(StandardCharsets.US_ASCII)) && zzei.zzL(this.zzd[v]) || (charset0.equals(StandardCharsets.UTF_16) || charset0.equals(StandardCharsets.UTF_16BE)) && (this.zzd[v] == 0 && zzei.zzL(this.zzd[v + 1])) || charset0.equals(StandardCharsets.UTF_16LE) && (this.zzd[v + 1] == 0 && zzei.zzL(this.zzd[v]))) {
                break;
            }
        }
        String s = this.zzB(v - this.zze, charset0);
        if(this.zze != this.zzf && this.zzO(charset0, zzdy.zza) == 13) {
            this.zzO(charset0, zzdy.zzb);
        }
        return s;
    }
}

