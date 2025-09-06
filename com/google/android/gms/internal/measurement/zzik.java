package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzik implements Serializable, Iterable {
    public static final zzik zza;
    private static final zzir zzb;
    private int zzc;

    static {
        zzik.zza = new zziv(zzjv.zzb);
        zzik.zzb = new zziu(null);
    }

    zzik() {
        this.zzc = 0;
    }

    @Override
    public abstract boolean equals(Object arg1);

    @Override
    public final int hashCode() {
        int v = this.zzc;
        if(v == 0) {
            int v1 = this.zzb();
            v = this.zzb(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.zzc = v;
        }
        return v;
    }

    @Override
    public Iterator iterator() {
        return new zzin(this);
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        String s = Integer.toHexString(System.identityHashCode(this));
        Integer integer0 = this.zzb();
        return this.zzb() > 50 ? String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, zzmg.zza(this.zza(0, 0x2F)) + "...") : String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, zzmg.zza(this));
    }

    static int zza(byte b) {
        return b & 0xFF;
    }

    static int zza(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + v + " < 0");
            }
            throw v1 >= v ? new IndexOutOfBoundsException("End index: " + v1 + " >= " + v2) : new IndexOutOfBoundsException("Beginning index larger than ending index: " + v + ", " + v1);
        }
        return v3;
    }

    public static zzik zza(String s) {
        return new zziv(s.getBytes(zzjv.zza));
    }

    public static zzik zza(byte[] arr_b) {
        return zzik.zza(arr_b, 0, arr_b.length);
    }

    public static zzik zza(byte[] arr_b, int v, int v1) {
        zzik.zza(v, v + v1, arr_b.length);
        return new zziv(zzik.zzb.zza(arr_b, v, v1));
    }

    public abstract byte zza(int arg1);

    protected final int zza() {
        return this.zzc;
    }

    public abstract zzik zza(int arg1, int arg2);

    abstract void zza(zzil arg1) throws IOException;

    static zzik zzb(byte[] arr_b) {
        return new zziv(arr_b);
    }

    abstract byte zzb(int arg1);

    public abstract int zzb();

    protected abstract int zzb(int arg1, int arg2, int arg3);

    static zzit zzc(int v) {
        return new zzit(v, null);
    }
}

