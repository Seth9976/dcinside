package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzqu extends zzci {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private byte[] zzi;
    private int zzj;
    private int zzk;
    private byte[] zzl;

    public zzqu() {
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
        this.zzi = zzei.zzf;
        this.zzl = zzei.zzf;
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzch
    public final void zze(ByteBuffer byteBuffer0) {
        int v13;
        int v8;
        int v2;
        while(byteBuffer0.hasRemaining() && !this.zzn()) {
            if(this.zzf == 0) {
                int v11 = byteBuffer0.limit();
                byteBuffer0.limit(Math.min(v11, byteBuffer0.position() + this.zzi.length));
                int v12 = byteBuffer0.limit() - 1;
                while(true) {
                    if(v12 >= byteBuffer0.position()) {
                        if(zzqu.zzv(byteBuffer0.get(v12), byteBuffer0.get(v12 - 1))) {
                            v13 = v12 / this.zzd * this.zzd + this.zzd;
                            break;
                        }
                        else {
                            v12 -= 2;
                            continue;
                        }
                    }
                    v13 = byteBuffer0.position();
                    break;
                }
                if(v13 == byteBuffer0.position()) {
                    this.zzf = 1;
                }
                else {
                    byteBuffer0.limit(Math.min(v13, byteBuffer0.capacity()));
                    this.zzj(byteBuffer0.remaining()).put(byteBuffer0).flip();
                }
                byteBuffer0.limit(v11);
            }
            else {
                zzcw.zzf(this.zzj < this.zzi.length);
                int v = byteBuffer0.limit();
                int v1 = byteBuffer0.position() + 1;
                while(true) {
                    if(v1 < byteBuffer0.limit()) {
                        if(zzqu.zzv(byteBuffer0.get(v1), byteBuffer0.get(v1 - 1))) {
                            v2 = this.zzd * (v1 / this.zzd);
                            break;
                        }
                        else {
                            v1 += 2;
                            continue;
                        }
                    }
                    v2 = byteBuffer0.limit();
                    break;
                }
                int v3 = v2 - byteBuffer0.position();
                int v4 = this.zzj;
                int v5 = this.zzk;
                int v6 = v4 + v5;
                int v7 = this.zzi.length;
                if(v6 < v7) {
                    v8 = v7 - v6;
                }
                else {
                    v6 = v5 - (v7 - v4);
                    v8 = v4 - v6;
                }
                int v9 = Math.min(v3, v8);
                byteBuffer0.limit(byteBuffer0.position() + v9);
                byteBuffer0.get(this.zzi, v6, v9);
                int v10 = this.zzk + v9;
                this.zzk = v10;
                zzcw.zzf(v10 <= this.zzi.length);
                if(v2 < v && v3 < v8) {
                    this.zzt(true);
                    this.zzf = 0;
                    this.zzh = 0;
                }
                else {
                    this.zzt(false);
                }
                byteBuffer0.limit(v);
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzci
    public final boolean zzg() {
        return super.zzg() && this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    protected final zzcf zzi(zzcf zzcf0) throws zzcg {
        if(zzcf0.zzd != 2) {
            throw new zzcg("Unhandled input format:", zzcf0);
        }
        return zzcf0.zzb == -1 ? zzcf.zza : zzcf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final void zzk() {
        if(this.zzg()) {
            int v = this.zzb.zzc;
            this.zzd = v + v;
            int v1 = this.zzr(100000L) / 2 / this.zzd * this.zzd;
            int v2 = v1 + v1;
            if(this.zzi.length != v2) {
                this.zzi = new byte[v2];
                this.zzl = new byte[v2];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final void zzl() {
        if(this.zzk > 0) {
            this.zzt(true);
            this.zzh = 0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final void zzm() {
        this.zze = false;
        this.zzi = zzei.zzf;
        this.zzl = zzei.zzf;
    }

    public final long zzo() {
        return this.zzg;
    }

    public final void zzp(boolean z) {
        this.zze = z;
    }

    private final int zzq(int v) {
        boolean z = true;
        int v1 = (this.zzr(2000000L) - this.zzh) * this.zzd - (this.zzi.length >> 1);
        if(v1 < 0) {
            z = false;
        }
        zzcw.zzf(z);
        return ((int)Math.min(((float)v) * 0.2f + 0.5f, v1)) / this.zzd * this.zzd;
    }

    private final int zzr(long v) {
        return (int)(v * ((long)this.zzb.zzb) / 1000000L);
    }

    private static int zzs(byte b, byte b1) [...] // Inlined contents

    private final void zzt(boolean z) {
        int v3;
        int v2;
        int v = this.zzk;
        int v1 = this.zzi.length;
        boolean z1 = true;
        if(v != v1) {
            if(z) {
                z = true;
                goto label_8;
            }
            return;
        }
    label_8:
        if(this.zzh == 0) {
            if(z) {
                this.zzu(v, 3);
                v2 = v;
            }
            else {
                zzcw.zzf(v >= v1 >> 1);
                v2 = this.zzi.length >> 1;
                this.zzu(v2, 0);
            }
            v3 = v2;
        }
        else {
            int v4 = v - (v1 >> 1);
            if(z) {
                int v5 = this.zzq(v4) + (this.zzi.length >> 1);
                this.zzu(v5, 2);
                v3 = v5;
                v2 = (v1 >> 1) + v4;
            }
            else {
                int v6 = this.zzq(v4);
                this.zzu(v6, 1);
                v3 = v6;
                v2 = v4;
            }
        }
        zzcw.zzg(v2 % this.zzd == 0, "bytesConsumed is not aligned to frame size: %s" + v2);
        if(v < v3) {
            z1 = false;
        }
        zzcw.zzf(z1);
        this.zzk -= v2;
        this.zzj = (this.zzj + v2) % this.zzi.length;
        int v7 = this.zzd;
        this.zzh += v3 / v7;
        this.zzg += (long)((v2 - v3) / v7);
    }

    private final void zzu(int v, int v1) {
        boolean z = true;
        if(v == 0) {
            return;
        }
        zzcw.zzd(this.zzk >= v);
        if(v1 == 2) {
            int v2 = this.zzj;
            int v3 = this.zzk;
            int v4 = v2 + v3;
            byte[] arr_b = this.zzi;
            if(v4 <= arr_b.length) {
                System.arraycopy(arr_b, v4 - v, this.zzl, 0, v);
            }
            else {
                int v5 = v3 - (arr_b.length - v2);
                if(v5 >= v) {
                    System.arraycopy(arr_b, v5 - v, this.zzl, 0, v);
                }
                else {
                    int v6 = v - v5;
                    System.arraycopy(arr_b, arr_b.length - v6, this.zzl, 0, v6);
                    System.arraycopy(this.zzi, 0, this.zzl, v6, v5);
                }
            }
        }
        else {
            int v7 = this.zzj;
            byte[] arr_b1 = this.zzi;
            if(v7 + v <= arr_b1.length) {
                System.arraycopy(arr_b1, v7, this.zzl, 0, v);
            }
            else {
                int v8 = arr_b1.length - v7;
                System.arraycopy(arr_b1, v7, this.zzl, 0, v8);
                System.arraycopy(this.zzi, 0, this.zzl, v8, v - v8);
            }
        }
        zzcw.zze(v % this.zzd == 0, "sizeToOutput is not aligned to frame size: " + v);
        zzcw.zzf(this.zzj < this.zzi.length);
        byte[] arr_b2 = this.zzl;
        if(v % this.zzd != 0) {
            z = false;
        }
        zzcw.zze(z, "byteOutput size is not aligned to frame size " + v);
        if(v1 != 3) {
            for(int v9 = 0; v9 < v; v9 += 2) {
                int v10 = 10;
                int v11 = zzqu.zzs(arr_b2[v9 + 1], arr_b2[v9]);
                if(v1 == 0) {
                    v10 = v9 * 1000 / (v - 1) * -90 / 1000 + 100;
                }
                else if(v1 == 2) {
                    v10 = 10 + 90000 * v9 / (v - 1) / 1000;
                }
                int v12 = v11 * v10 / 100;
                if(v12 >= 0x7FFF) {
                    arr_b2[v9] = -1;
                    arr_b2[v9 + 1] = 0x7F;
                }
                else if(v12 <= 0xFFFF8000) {
                    arr_b2[v9] = 0;
                    arr_b2[v9 + 1] = (byte)0x80;
                }
                else {
                    arr_b2[v9] = (byte)(v12 & 0xFF);
                    arr_b2[v9 + 1] = (byte)(v12 >> 8);
                }
            }
        }
        this.zzj(v).put(arr_b2, 0, v).flip();
    }

    private static final boolean zzv(byte b, byte b1) {
        return Math.abs(b << 8 | b1 & 0xFF) > 0x400;
    }
}

