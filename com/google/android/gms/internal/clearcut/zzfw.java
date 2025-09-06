package com.google.android.gms.internal.clearcut;

public final class zzfw implements Cloneable {
    private int mSize;
    private static final zzfx zzrl;
    private boolean zzrm;
    private int[] zzrn;
    private zzfx[] zzro;

    static {
        zzfw.zzrl = new zzfx();
    }

    zzfw() {
        this(10);
    }

    private zzfw(int v) {
        this.zzrm = false;
        int v1 = v << 2;
        for(int v2 = 4; v2 < 0x20; ++v2) {
            int v3 = (1 << v2) - 12;
            if(v1 <= v3) {
                v1 = v3;
                break;
            }
        }
        this.zzrn = new int[v1 / 4];
        this.zzro = new zzfx[v1 / 4];
        this.mSize = 0;
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        int v = this.mSize;
        zzfw zzfw0 = new zzfw(v);
        System.arraycopy(this.zzrn, 0, zzfw0.zzrn, 0, v);
        for(int v1 = 0; v1 < v; ++v1) {
            zzfx zzfx0 = this.zzro[v1];
            if(zzfx0 != null) {
                zzfx[] arr_zzfx = zzfw0.zzro;
                arr_zzfx[v1] = (zzfx)zzfx0.clone();
            }
        }
        zzfw0.mSize = v;
        return zzfw0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzfw)) {
            return false;
        }
        int v = this.mSize;
        if(v != ((zzfw)object0).mSize) {
            return false;
        }
        int[] arr_v = this.zzrn;
        int[] arr_v1 = ((zzfw)object0).zzrn;
        for(int v1 = 0; v1 < v; ++v1) {
            if(arr_v[v1] != arr_v1[v1]) {
                return false;
            }
        }
        zzfx[] arr_zzfx = this.zzro;
        zzfx[] arr_zzfx1 = ((zzfw)object0).zzro;
        int v2 = this.mSize;
        for(int v3 = 0; v3 < v2; ++v3) {
            if(!arr_zzfx[v3].equals(arr_zzfx1[v3])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int v = 17;
        for(int v1 = 0; v1 < this.mSize; ++v1) {
            v = (v * 0x1F + this.zzrn[v1]) * 0x1F + this.zzro[v1].hashCode();
        }
        return v;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    final int size() {
        return this.mSize;
    }

    final zzfx zzaq(int v) {
        return this.zzro[v];
    }
}

