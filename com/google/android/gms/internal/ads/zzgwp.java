package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

public abstract class zzgwp {
    int zza;
    final int zzb;
    zzgwq zzc;
    public static final int zzd = 0;
    private static volatile int zze = 100;

    static {
    }

    private zzgwp() {
        this.zzb = zzgwp.zze;
    }

    zzgwp(zzgwo zzgwo0) {
        this.zzb = zzgwp.zze;
    }

    public abstract boolean zzA() throws IOException;

    public abstract boolean zzB() throws IOException;

    public static int zzD(int v) [...] // Inlined contents

    public static int zzE(int v, InputStream inputStream0) throws IOException {
        if((v & 0x80) == 0) {
            return v;
        }
        int v1 = v & 0x7F;
        int v2;
        for(v2 = 7; v2 < 0x20; v2 += 7) {
            int v3 = inputStream0.read();
            if(v3 == -1) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            v1 |= (v3 & 0x7F) << v2;
            if((v3 & 0x80) == 0) {
                return v1;
            }
        }
        while(v2 < 0x40) {
            int v4 = inputStream0.read();
            if(v4 == -1) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if((v4 & 0x80) == 0) {
                return v1;
            }
            v2 += 7;
        }
        throw new zzgyg("CodedInputStream encountered a malformed varint.");
    }

    public static long zzF(long v) [...] // Inlined contents

    public static zzgwp zzG(InputStream inputStream0, int v) {
        return inputStream0 == null ? zzgwp.zzH(zzgye.zzb, 0, 0, false) : new zzgwm(inputStream0, 0x1000, null);
    }

    static zzgwp zzH(byte[] arr_b, int v, int v1, boolean z) {
        zzgwp zzgwp0 = new zzgwk(arr_b, v, v1, z, null);
        try {
            ((zzgwk)zzgwp0).zzd(v1);
            return zzgwp0;
        }
        catch(zzgyg zzgyg0) {
            throw new IllegalArgumentException(zzgyg0);
        }
    }

    public abstract double zza() throws IOException;

    public abstract float zzb() throws IOException;

    public abstract int zzc();

    public abstract int zzd(int arg1) throws zzgyg;

    public abstract int zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract zzgwj zzv() throws IOException;

    public abstract String zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract void zzy(int arg1) throws zzgyg;

    public abstract void zzz(int arg1);
}

