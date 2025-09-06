package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzht implements Serializable, Iterable {
    public static final zzht zza;
    private static final zzhz zzb;
    private int zzc;
    private static final Comparator zzd;

    static {
        zzht.zza = new zzid(zzjf.zzb);
        zzht.zzb = new zzhx(null);
        zzht.zzd = new zzhv();
    }

    zzht() {
        this.zzc = 0;
    }

    @Override
    public abstract boolean equals(Object arg1);

    @Override
    public final int hashCode() {
        int v = this.zzc;
        if(v == 0) {
            int v1 = this.zza();
            v = this.zza(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.zzc = v;
        }
        return v;
    }

    @Override
    public Iterator iterator() {
        return new zzhs(this);
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        String s = Integer.toHexString(System.identityHashCode(this));
        Integer integer0 = this.zza();
        return this.zza() > 50 ? String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, zzlq.zza(this.zza(0, 0x2F)) + "...") : String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, zzlq.zza(this));
    }

    static int zza(byte b) {
        return b & 0xFF;
    }

    public static zzht zza(String s) {
        return new zzid(s.getBytes(zzjf.zza));
    }

    static zzht zza(byte[] arr_b) {
        return new zzid(arr_b);
    }

    public static zzht zza(byte[] arr_b, int v, int v1) {
        zzht.zzb(v, v + v1, arr_b.length);
        return new zzid(zzht.zzb.zza(arr_b, v, v1));
    }

    public abstract byte zza(int arg1);

    public abstract int zza();

    protected abstract int zza(int arg1, int arg2, int arg3);

    public abstract zzht zza(int arg1, int arg2);

    protected abstract String zza(Charset arg1);

    abstract void zza(zzhq arg1) throws IOException;

    protected abstract void zza(byte[] arg1, int arg2, int arg3, int arg4);

    private static int zzb(byte b) [...] // Inlined contents

    static int zzb(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + v + " < 0");
            }
            throw v1 >= v ? new IndexOutOfBoundsException("End index: " + v1 + " >= " + v2) : new IndexOutOfBoundsException("Beginning index larger than ending index: " + v + ", " + v1);
        }
        return v3;
    }

    static zzht zzb(byte[] arr_b, int v, int v1) {
        return new zzhw(arr_b, v, v1);
    }

    abstract byte zzb(int arg1);

    public final String zzb() {
        return this.zza() == 0 ? "" : this.zza(zzjf.zza);
    }

    static zzib zzc(int v) {
        return new zzib(v, null);
    }

    public abstract boolean zzc();

    protected final int zzd() {
        return this.zzc;
    }
}

