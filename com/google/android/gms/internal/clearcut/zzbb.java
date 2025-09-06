package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class zzbb implements Serializable, Iterable {
    public static final zzbb zzfi;
    private static final zzbf zzfj;
    private int zzfk;

    static {
        zzbb.zzfi = new zzbi(zzci.zzkt);
        zzbb.zzfj = new zzbd(null);
    }

    zzbb() {
        this.zzfk = 0;
    }

    @Override
    public abstract boolean equals(Object arg1);

    @Override
    public final int hashCode() {
        int v = this.zzfk;
        if(v == 0) {
            int v1 = this.size();
            v = this.zza(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.zzfk = v;
        }
        return v;
    }

    @Override
    public Iterator iterator() {
        return new zzbc(this);
    }

    public abstract int size();

    @Override
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
    }

    protected abstract int zza(int arg1, int arg2, int arg3);

    public abstract zzbb zza(int arg1, int arg2);

    protected abstract String zza(Charset arg1);

    abstract void zza(zzba arg1) throws IOException;

    public abstract boolean zzaa();

    protected final int zzab() {
        return this.zzfk;
    }

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

    public static zzbb zzb(byte[] arr_b, int v, int v1) {
        return new zzbi(zzbb.zzfj.zzc(arr_b, v, v1));
    }

    public static zzbb zzf(String s) {
        return new zzbi(s.getBytes(zzci.UTF_8));
    }

    public abstract byte zzj(int arg1);

    static zzbg zzk(int v) {
        return new zzbg(v, null);
    }

    public final String zzz() {
        return this.size() == 0 ? "" : this.zza(zzci.UTF_8);
    }
}

