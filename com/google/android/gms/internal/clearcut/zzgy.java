package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public final class zzgy extends zzfu implements Cloneable {
    private String[] zzbiw;
    private String[] zzbix;
    private int[] zzbiy;
    private long[] zzbiz;
    private long[] zzbja;

    public zzgy() {
        this.zzbiw = zzgb.zzsc;
        this.zzbix = zzgb.zzsc;
        this.zzbiy = zzgb.zzrx;
        this.zzbiz = zzgb.zzry;
        this.zzbja = zzgb.zzry;
        this.zzrj = null;
        this.zzrs = -1;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final Object clone() throws CloneNotSupportedException {
        return this.zzgb();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzgy)) {
            return false;
        }
        if(!zzfy.equals(this.zzbiw, ((zzgy)object0).zzbiw)) {
            return false;
        }
        if(!zzfy.equals(this.zzbix, ((zzgy)object0).zzbix)) {
            return false;
        }
        if(!zzfy.equals(this.zzbiy, ((zzgy)object0).zzbiy)) {
            return false;
        }
        if(!zzfy.equals(this.zzbiz, ((zzgy)object0).zzbiz)) {
            return false;
        }
        if(!zzfy.equals(this.zzbja, ((zzgy)object0).zzbja)) {
            return false;
        }
        if(this.zzrj != null && !this.zzrj.isEmpty()) {
            return this.zzrj.equals(((zzgy)object0).zzrj);
        }
        zzfw zzfw0 = ((zzgy)object0).zzrj;
        return zzfw0 == null || zzfw0.isEmpty();
    }

    @Override
    public final int hashCode() {
        int v = zzfy.hashCode(this.zzbiw);
        int v1 = zzfy.hashCode(this.zzbix);
        int v2 = zzfy.hashCode(this.zzbiy);
        int v3 = zzfy.hashCode(this.zzbiz);
        int v4 = zzfy.hashCode(this.zzbja);
        return this.zzrj == null || this.zzrj.isEmpty() ? (((((v + 0x20FA968F) * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F : (((((v + 0x20FA968F) * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + this.zzrj.hashCode();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final void zza(zzfs zzfs0) throws IOException {
        if(this.zzbiw != null && this.zzbiw.length > 0) {
            for(int v1 = 0; true; ++v1) {
                String[] arr_s = this.zzbiw;
                if(v1 >= arr_s.length) {
                    break;
                }
                String s = arr_s[v1];
                if(s != null) {
                    zzfs0.zza(1, s);
                }
            }
        }
        if(this.zzbix != null && this.zzbix.length > 0) {
            for(int v2 = 0; true; ++v2) {
                String[] arr_s1 = this.zzbix;
                if(v2 >= arr_s1.length) {
                    break;
                }
                String s1 = arr_s1[v2];
                if(s1 != null) {
                    zzfs0.zza(2, s1);
                }
            }
        }
        if(this.zzbiy != null && this.zzbiy.length > 0) {
            for(int v3 = 0; true; ++v3) {
                int[] arr_v = this.zzbiy;
                if(v3 >= arr_v.length) {
                    break;
                }
                zzfs0.zzc(3, arr_v[v3]);
            }
        }
        if(this.zzbiz != null && this.zzbiz.length > 0) {
            for(int v4 = 0; true; ++v4) {
                long[] arr_v1 = this.zzbiz;
                if(v4 >= arr_v1.length) {
                    break;
                }
                zzfs0.zzi(4, arr_v1[v4]);
            }
        }
        if(this.zzbja != null && this.zzbja.length > 0) {
            for(int v = 0; true; ++v) {
                long[] arr_v2 = this.zzbja;
                if(v >= arr_v2.length) {
                    break;
                }
                zzfs0.zzi(5, arr_v2[v]);
            }
        }
        super.zza(zzfs0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    protected final int zzen() {
        long[] arr_v2;
        long[] arr_v1;
        int[] arr_v;
        int v = super.zzen();
        if(this.zzbiw != null && this.zzbiw.length > 0) {
            int v3 = 0;
            int v4 = 0;
            for(int v2 = 0; true; ++v2) {
                String[] arr_s = this.zzbiw;
                if(v2 >= arr_s.length) {
                    break;
                }
                String s = arr_s[v2];
                if(s != null) {
                    ++v4;
                    v3 += zzfs.zzh(s);
                }
            }
            v = v + v3 + v4;
        }
        if(this.zzbix != null && this.zzbix.length > 0) {
            int v6 = 0;
            int v7 = 0;
            for(int v5 = 0; true; ++v5) {
                String[] arr_s1 = this.zzbix;
                if(v5 >= arr_s1.length) {
                    break;
                }
                String s1 = arr_s1[v5];
                if(s1 != null) {
                    ++v7;
                    v6 += zzfs.zzh(s1);
                }
            }
            v = v + v6 + v7;
        }
        if(this.zzbiy != null && this.zzbiy.length > 0) {
            int v9 = 0;
            for(int v8 = 0; true; ++v8) {
                arr_v = this.zzbiy;
                if(v8 >= arr_v.length) {
                    break;
                }
                v9 += zzfs.zzs(arr_v[v8]);
            }
            v = v + v9 + arr_v.length;
        }
        if(this.zzbiz != null && this.zzbiz.length > 0) {
            int v11 = 0;
            for(int v10 = 0; true; ++v10) {
                arr_v1 = this.zzbiz;
                if(v10 >= arr_v1.length) {
                    break;
                }
                v11 += zzfs.zzo(arr_v1[v10]);
            }
            v = v + v11 + arr_v1.length;
        }
        if(this.zzbja != null && this.zzbja.length > 0) {
            int v12 = 0;
            for(int v1 = 0; true; ++v1) {
                arr_v2 = this.zzbja;
                if(v1 >= arr_v2.length) {
                    break;
                }
                v12 += zzfs.zzo(arr_v2[v1]);
            }
            return v + v12 + arr_v2.length;
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final zzfu zzeo() throws CloneNotSupportedException {
        return (zzgy)this.clone();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final zzfz zzep() throws CloneNotSupportedException {
        return (zzgy)this.clone();
    }

    private final zzgy zzgb() {
        String[] arr_s;
        zzgy zzgy0;
        try {
            zzgy0 = (zzgy)super.zzeo();
            arr_s = this.zzbiw;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
        if(arr_s != null && arr_s.length > 0) {
            zzgy0.zzbiw = (String[])arr_s.clone();
        }
        String[] arr_s1 = this.zzbix;
        if(arr_s1 != null && arr_s1.length > 0) {
            zzgy0.zzbix = (String[])arr_s1.clone();
        }
        int[] arr_v = this.zzbiy;
        if(arr_v != null && arr_v.length > 0) {
            zzgy0.zzbiy = (int[])arr_v.clone();
        }
        long[] arr_v1 = this.zzbiz;
        if(arr_v1 != null && arr_v1.length > 0) {
            zzgy0.zzbiz = (long[])arr_v1.clone();
        }
        long[] arr_v2 = this.zzbja;
        if(arr_v2 != null && arr_v2.length > 0) {
            zzgy0.zzbja = (long[])arr_v2.clone();
        }
        return zzgy0;
    }
}

