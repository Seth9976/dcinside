package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzham extends zzhan {
    zzham(Unsafe unsafe0) {
        super(unsafe0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhan
    public final byte zza(long v) {
        return Memory.peekByte(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzhan
    public final double zzb(Object object0, long v) {
        return Double.longBitsToDouble(this.zza.getLong(object0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzhan
    public final float zzc(Object object0, long v) {
        return Float.intBitsToFloat(this.zza.getInt(object0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzhan
    public final void zzd(long v, byte[] arr_b, long v1, long v2) {
        Memory.peekByteArray(v, arr_b, ((int)v1), ((int)v2));
    }

    @Override  // com.google.android.gms.internal.ads.zzhan
    public final void zze(Object object0, long v, boolean z) {
        if(zzhao.zzb) {
            zzhao.zzk(object0, v, z);
            return;
        }
        zzhao.zzl(object0, v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzhan
    public final void zzf(Object object0, long v, byte b) {
        if(zzhao.zzb) {
            zzhao.zzG(object0, v, b);
            return;
        }
        zzhao.zzH(object0, v, b);
    }

    @Override  // com.google.android.gms.internal.ads.zzhan
    public final void zzg(Object object0, long v, double f) {
        this.zza.putLong(object0, v, Double.doubleToLongBits(f));
    }

    @Override  // com.google.android.gms.internal.ads.zzhan
    public final void zzh(Object object0, long v, float f) {
        this.zza.putInt(object0, v, Float.floatToIntBits(f));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzhan
    public final boolean zzi(Object object0, long v) {
        return zzhao.zzb ? zzhao.zzw(object0, v) : zzhao.zzx(object0, v);
    }
}

