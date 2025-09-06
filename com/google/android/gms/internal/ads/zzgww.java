package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzgww extends zzgwa {
    private static final Logger zza;
    private static final boolean zzb;
    zzgwx zze;
    public static final int zzf;

    static {
        zzgww.zza = Logger.getLogger("com.google.android.gms.internal.ads.zzgww");
        zzgww.zzb = false;
    }

    private zzgww() {
        throw null;
    }

    zzgww(zzgwv zzgwv0) {
    }

    static int zzA(zzgzc zzgzc0, zzgzv zzgzv0) {
        int v = ((zzgvs)zzgzc0).zzaM(zzgzv0);
        return zzgww.zzD(v) + v;
    }

    static int zzB(int v) {
        return v <= 0x1000 ? v : 0x1000;
    }

    public static int zzC(String s) {
        int v;
        try {
            v = zzhat.zze(s);
            return zzgww.zzD(v) + v;
        }
        catch(zzhas unused_ex) {
            v = s.getBytes(zzgye.zza).length;
            return zzgww.zzD(v) + v;
        }
    }

    public static int zzD(int v) [...] // 潜在的解密器

    public static int zzE(long v) {
        return 640 - Long.numberOfLeadingZeros(v) * 9 >>> 6;
    }

    public final void zzF() {
        if(this.zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzG(String s, zzhas zzhas0) throws IOException {
        zzgww.zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzhas0);
        byte[] arr_b = s.getBytes(zzgye.zza);
        try {
            this.zzu(arr_b.length);
            this.zza(arr_b, 0, arr_b.length);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgwt(indexOutOfBoundsException0);
        }
    }

    public abstract void zzK() throws IOException;

    public abstract void zzL(byte arg1) throws IOException;

    public abstract void zzM(int arg1, boolean arg2) throws IOException;

    public abstract void zzN(int arg1, zzgwj arg2) throws IOException;

    @Override  // com.google.android.gms.internal.ads.zzgwa
    public abstract void zza(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int arg1, int arg2) throws IOException;

    public abstract void zzi(int arg1) throws IOException;

    public abstract void zzj(int arg1, long arg2) throws IOException;

    public abstract void zzk(long arg1) throws IOException;

    public abstract void zzl(int arg1, int arg2) throws IOException;

    public abstract void zzm(int arg1) throws IOException;

    abstract void zzn(int arg1, zzgzc arg2, zzgzv arg3) throws IOException;

    public abstract void zzo(int arg1, zzgzc arg2) throws IOException;

    public abstract void zzp(int arg1, zzgwj arg2) throws IOException;

    public abstract void zzq(int arg1, String arg2) throws IOException;

    public abstract void zzs(int arg1, int arg2) throws IOException;

    public abstract void zzt(int arg1, int arg2) throws IOException;

    public abstract void zzu(int arg1) throws IOException;

    public abstract void zzv(int arg1, long arg2) throws IOException;

    public abstract void zzw(long arg1) throws IOException;

    @Deprecated
    static int zzy(int v, zzgzc zzgzc0, zzgzv zzgzv0) {
        int v1 = zzgww.zzD(v << 3);
        return v1 + v1 + ((zzgvs)zzgzc0).zzaM(zzgzv0);
    }

    public static int zzz(zzgzc zzgzc0) {
        int v = zzgzc0.zzaY();
        return zzgww.zzD(v) + v;
    }
}

