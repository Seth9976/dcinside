package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzgwj implements Serializable, Iterable {
    private int zza;
    public static final zzgwj zzb;

    static {
        zzgwj.zzb = new zzgwg(zzgye.zzb);
    }

    zzgwj() {
        this.zza = 0;
    }

    @Override
    public abstract boolean equals(Object arg1);

    @Override
    public final int hashCode() {
        int v = this.zza;
        if(v == 0) {
            int v1 = this.zzd();
            v = this.zzi(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.zza = v;
        }
        return v;
    }

    @Override
    public Iterator iterator() {
        return this.zzs();
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        String s = Integer.toHexString(System.identityHashCode(this));
        Integer integer0 = this.zzd();
        return this.zzd() > 50 ? String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, zzhaf.zza(this.zzk(0, 0x2F)) + "...") : String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, zzhaf.zza(this));
    }

    public final byte[] zzA() {
        int v = this.zzd();
        if(v == 0) {
            return zzgye.zzb;
        }
        byte[] arr_b = new byte[v];
        this.zze(arr_b, 0, 0, v);
        return arr_b;
    }

    public abstract byte zza(int arg1);

    abstract byte zzb(int arg1);

    private static zzgwj zzc(Iterator iterator0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", v));
        }
        if(v == 1) {
            return iterator0.next();
        }
        zzgwj zzgwj0 = zzgwj.zzc(iterator0, v >>> 1);
        zzgwj zzgwj1 = zzgwj.zzc(iterator0, v - (v >>> 1));
        if(0x7FFFFFFF - zzgwj0.zzd() < zzgwj1.zzd()) {
            throw new IllegalArgumentException("ByteString would be too long: " + zzgwj0.zzd() + "+" + zzgwj1.zzd());
        }
        return zzgzu.zzC(zzgwj0, zzgwj1);
    }

    public abstract int zzd();

    protected abstract void zze(byte[] arg1, int arg2, int arg3, int arg4);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int arg1, int arg2, int arg3);

    protected abstract int zzj(int arg1, int arg2, int arg3);

    public abstract zzgwj zzk(int arg1, int arg2);

    public abstract zzgwp zzl();

    protected abstract String zzm(Charset arg1);

    public abstract ByteBuffer zzn();

    abstract void zzo(zzgwa arg1) throws IOException;

    public abstract boolean zzp();

    static int zzq(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + v + " < 0");
            }
            throw v1 >= v ? new IndexOutOfBoundsException("End index: " + v1 + " >= " + v2) : new IndexOutOfBoundsException("Beginning index larger than ending index: " + v + ", " + v1);
        }
        return v3;
    }

    protected final int zzr() {
        return this.zza;
    }

    public zzgwe zzs() {
        return new zzgwb(this);
    }

    public static zzgwh zzt() {
        return new zzgwh(0x80);
    }

    public static zzgwj zzu(Iterable iterable0) {
        int v;
        if(!(iterable0 instanceof Collection)) {
            v = 0;
            Iterator iterator0 = iterable0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                ++v;
            }
            return v == 0 ? zzgwj.zzb : zzgwj.zzc(iterable0.iterator(), v);
        }
        v = ((Collection)iterable0).size();
        return v == 0 ? zzgwj.zzb : zzgwj.zzc(iterable0.iterator(), v);
    }

    public static zzgwj zzv(byte[] arr_b, int v, int v1) {
        zzgwj.zzq(v, v + v1, arr_b.length);
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        return new zzgwg(arr_b1);
    }

    public static zzgwj zzw(String s) {
        return new zzgwg(s.getBytes(zzgye.zza));
    }

    public final String zzx() {
        return this.zzd() == 0 ? "" : this.zzm(zzgye.zza);
    }

    static void zzy(int v, int v1) {
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
    }

    @Deprecated
    public final void zzz(byte[] arr_b, int v, int v1, int v2) {
        zzgwj.zzq(0, v2, this.zzd());
        zzgwj.zzq(v1, v1 + v2, arr_b.length);
        if(v2 > 0) {
            this.zze(arr_b, 0, v1, v2);
        }
    }
}

