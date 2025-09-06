package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzgvr implements zzgzb {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zzaC();
    }

    private String zza(String s) [...] // 潜在的解密器

    public abstract zzgvr zzaC();

    protected abstract zzgvr zzaD(zzgvs arg1);

    public zzgvr zzaE(zzgwj zzgwj0) throws zzgyg {
        try {
            zzgwp zzgwp0 = zzgwj0.zzl();
            this.zzaF(zzgwp0);
            zzgwp0.zzy(0);
            return this;
        }
        catch(zzgyg zzgyg0) {
            throw zzgyg0;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading com.google.android.gms.internal.ads.zzgvr from a ByteString threw an IOException (should never happen).", iOException0);
        }
    }

    public zzgvr zzaF(zzgwp zzgwp0) throws IOException {
        return this.zzaK(zzgwp0, zzgxb.zza);
    }

    public zzgvr zzaG(zzgzc zzgzc0) {
        if(!this.zzbt().getClass().isInstance(zzgzc0)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return this.zzaD(((zzgvs)zzgzc0));
    }

    public zzgvr zzaH(InputStream inputStream0) throws IOException {
        zzgwp zzgwp0 = zzgwp.zzG(inputStream0, 0x1000);
        this.zzaF(zzgwp0);
        zzgwp0.zzy(0);
        return this;
    }

    public zzgvr zzaI(byte[] arr_b) throws zzgyg {
        return this.zzaN(arr_b, 0, arr_b.length);
    }

    public zzgvr zzaJ(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        try {
            zzgwp zzgwp0 = zzgwj0.zzl();
            this.zzaK(zzgwp0, zzgxb0);
            zzgwp0.zzy(0);
            return this;
        }
        catch(zzgyg zzgyg0) {
            throw zzgyg0;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading com.google.android.gms.internal.ads.zzgvr from a ByteString threw an IOException (should never happen).", iOException0);
        }
    }

    public abstract zzgvr zzaK(zzgwp arg1, zzgxb arg2) throws IOException;

    public zzgvr zzaL(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        zzgwp zzgwp0 = zzgwp.zzG(inputStream0, 0x1000);
        this.zzaK(zzgwp0, zzgxb0);
        zzgwp0.zzy(0);
        return this;
    }

    public zzgvr zzaM(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return this.zzaO(arr_b, 0, arr_b.length, zzgxb0);
    }

    public zzgvr zzaN(byte[] arr_b, int v, int v1) throws zzgyg {
        try {
            zzgwp zzgwp0 = zzgwp.zzH(arr_b, v, v1, false);
            this.zzaF(zzgwp0);
            zzgwp0.zzy(0);
            return this;
        }
        catch(zzgyg zzgyg0) {
            throw zzgyg0;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading com.google.android.gms.internal.ads.zzgvr from a byte array threw an IOException (should never happen).", iOException0);
        }
    }

    public zzgvr zzaO(byte[] arr_b, int v, int v1, zzgxb zzgxb0) throws zzgyg {
        try {
            zzgwp zzgwp0 = zzgwp.zzH(arr_b, v, v1, false);
            this.zzaK(zzgwp0, zzgxb0);
            zzgwp0.zzy(0);
            return this;
        }
        catch(zzgyg zzgyg0) {
            throw zzgyg0;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading com.google.android.gms.internal.ads.zzgvr from a byte array threw an IOException (should never happen).", iOException0);
        }
    }

    public zzgzb zzaP() {
        return this.zzaC();
    }

    public zzgzb zzaQ(zzgwj zzgwj0) throws zzgyg {
        this.zzaE(zzgwj0);
        return this;
    }

    public zzgzb zzaR(zzgwp zzgwp0) throws IOException {
        return this.zzaF(zzgwp0);
    }

    public zzgzb zzaS(zzgzc zzgzc0) {
        return this.zzaG(zzgzc0);
    }

    public zzgzb zzaT(InputStream inputStream0) throws IOException {
        this.zzaH(inputStream0);
        return this;
    }

    public zzgzb zzaU(byte[] arr_b) throws zzgyg {
        return this.zzaI(arr_b);
    }

    public zzgzb zzaV(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        this.zzaJ(zzgwj0, zzgxb0);
        return this;
    }

    public zzgzb zzaW(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return this.zzaK(zzgwp0, zzgxb0);
    }

    public zzgzb zzaX(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        this.zzaL(inputStream0, zzgxb0);
        return this;
    }

    public zzgzb zzaY(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return this.zzaM(arr_b, zzgxb0);
    }

    public zzgzb zzaZ(byte[] arr_b, int v, int v1) throws zzgyg {
        return this.zzaN(arr_b, v, v1);
    }

    private static void zzb(Iterable iterable0, List list0) {
        if(iterable0 instanceof Collection) {
            int v = ((Collection)iterable0).size();
            if(list0 instanceof ArrayList) {
                ((ArrayList)list0).ensureCapacity(list0.size() + v);
            }
            else if(list0 instanceof zzgzn) {
                ((zzgzn)list0).zze(list0.size() + v);
            }
        }
        int v1 = list0.size();
        if(iterable0 instanceof List && iterable0 instanceof RandomAccess) {
            int v2 = ((List)iterable0).size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = ((List)iterable0).get(v3);
                if(object0 == null) {
                    zzgvr.zzc(list0, v1);
                }
                list0.add(object0);
            }
            return;
        }
        for(Object object1: iterable0) {
            if(object1 == null) {
                zzgvr.zzc(list0, v1);
            }
            list0.add(object1);
        }
    }

    public zzgzb zzba(byte[] arr_b, int v, int v1, zzgxb zzgxb0) throws zzgyg {
        return this.zzaO(arr_b, v, v1, zzgxb0);
    }

    protected static zzhag zzbb(zzgzc zzgzc0) {
        return new zzhag(zzgzc0);
    }

    @Deprecated
    protected static void zzbc(Iterable iterable0, Collection collection0) {
        zzgvr.zzbd(iterable0, ((List)collection0));
    }

    protected static void zzbd(Iterable iterable0, List list0) {
        iterable0.getClass();
        if(iterable0 instanceof zzgyo) {
            List list1 = ((zzgyo)iterable0).zza();
            int v = list0.size();
            for(Object object0: list1) {
                if(object0 == null) {
                    String s = "Element at index " + (((zzgyo)list0).size() - v) + " is null.";
                    int v1 = ((zzgyo)list0).size();
                    while(true) {
                        --v1;
                        if(v1 < v) {
                            break;
                        }
                        ((zzgyo)list0).remove(v1);
                    }
                    throw new NullPointerException(s);
                }
                if(object0 instanceof zzgwj) {
                    zzgwj zzgwj0 = (zzgwj)object0;
                    ((zzgyo)list0).zzb();
                }
                else if(object0 instanceof byte[]) {
                    zzgwj.zzv(((byte[])object0), 0, ((byte[])object0).length);
                    ((zzgyo)list0).zzb();
                }
                else {
                    ((zzgyo)list0).add(((String)object0));
                }
            }
            return;
        }
        if(iterable0 instanceof zzgzl) {
            list0.addAll(((Collection)iterable0));
            return;
        }
        zzgvr.zzb(iterable0, list0);
    }

    public boolean zzbe(InputStream inputStream0) throws IOException {
        return this.zzbf(inputStream0, zzgxb.zza);
    }

    public boolean zzbf(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        int v = inputStream0.read();
        if(v == -1) {
            return false;
        }
        this.zzaL(new zzgvq(inputStream0, zzgwp.zzE(v, inputStream0)), zzgxb0);
        return true;
    }

    private static void zzc(List list0, int v) {
        String s = "Element at index " + (list0.size() - v) + " is null.";
        int v1 = list0.size();
        while(true) {
            --v1;
            if(v1 < v) {
                break;
            }
            list0.remove(v1);
        }
        throw new NullPointerException(s);
    }
}

