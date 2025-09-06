package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public abstract class zzgvs implements zzgzc {
    protected int zzq;

    public zzgvs() {
        this.zzq = 0;
    }

    int zzaL() {
        throw new UnsupportedOperationException();
    }

    int zzaM(zzgzv zzgzv0) {
        return this.zzaL();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzc
    public zzgwj zzaN() {
        try {
            int v = this.zzaY();
            byte[] arr_b = new byte[v];
            zzgws zzgws0 = new zzgws(arr_b, 0, v);
            this.zzcY(zzgws0);
            zzgws0.zzF();
            return new zzgwg(arr_b);
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing com.google.android.gms.internal.ads.zzgvs to a ByteString threw an IOException (should never happen).", iOException0);
        }
    }

    public zzgzh zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    zzhag zzaP() {
        return new zzhag(this);
    }

    protected static void zzaQ(Iterable iterable0, List list0) {
        zzgvr.zzbd(iterable0, list0);
    }

    protected static void zzaR(zzgwj zzgwj0) throws IllegalArgumentException {
        if(!zzgwj0.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    void zzaS(int v) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream0) throws IOException {
        int v = this.zzaY();
        zzgwu zzgwu0 = new zzgwu(outputStream0, zzgww.zzB(zzgww.zzD(v) + v));
        zzgwu0.zzu(v);
        this.zzcY(zzgwu0);
        zzgwu0.zzK();
    }

    public void zzaU(OutputStream outputStream0) throws IOException {
        zzgwu zzgwu0 = new zzgwu(outputStream0, zzgww.zzB(this.zzaY()));
        this.zzcY(zzgwu0);
        zzgwu0.zzK();
    }

    public byte[] zzaV() {
        try {
            int v = this.zzaY();
            byte[] arr_b = new byte[v];
            zzgws zzgws0 = new zzgws(arr_b, 0, v);
            this.zzcY(zzgws0);
            zzgws0.zzF();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing com.google.android.gms.internal.ads.zzgvs to a byte array threw an IOException (should never happen).", iOException0);
        }
    }

    private String zzdF(String s) [...] // 潜在的解密器
}

