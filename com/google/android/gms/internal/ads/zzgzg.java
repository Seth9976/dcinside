package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzgzg implements zzgzv {
    private final zzgzc zza;
    private final zzhah zzb;
    private final boolean zzc;
    private final zzgxc zzd;

    private zzgzg(zzhah zzhah0, zzgxc zzgxc0, zzgzc zzgzc0) {
        this.zzb = zzhah0;
        this.zzc = zzgzc0 instanceof zzgxn;
        this.zzd = zzgxc0;
        this.zza = zzgzc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final int zza(Object object0) {
        int v = ((zzgxr)object0).zzt.zzb();
        return this.zzc ? v + ((zzgxn)object0).zza.zzd() : v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final int zzb(Object object0) {
        int v = ((zzgxr)object0).zzt.hashCode();
        return this.zzc ? v * 53 + ((zzgxn)object0).zza.zza.hashCode() : v;
    }

    static zzgzg zzc(zzhah zzhah0, zzgxc zzgxc0, zzgzc zzgzc0) {
        return new zzgzg(zzhah0, zzgxc0, zzgzc0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final Object zze() {
        zzgzc zzgzc0 = this.zza;
        return zzgzc0 instanceof zzgxr ? ((zzgxr)zzgzc0).zzbj() : zzgzc0.zzcX().zzbs();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final void zzf(Object object0) {
        this.zzb.zzi(object0);
        this.zzd.zza(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final void zzg(Object object0, Object object1) {
        zzgzx.zzq(this.zzb, object0, object1);
        if(this.zzc) {
            zzgzx.zzp(this.zzd, object0, object1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final void zzh(Object object0, zzgzp zzgzp0, zzgxb zzgxb0) throws IOException {
        this.zzb.zza(object0);
        zzgxn zzgxn0 = (zzgxn)object0;
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final void zzi(Object object0, byte[] arr_b, int v, int v1, zzgvx zzgvx0) throws IOException {
        if(((zzgxr)object0).zzt == zzhai.zzc()) {
            ((zzgxr)object0).zzt = zzhai.zzf();
        }
        zzgxn zzgxn0 = (zzgxn)object0;
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final void zzj(Object object0, zzhaw zzhaw0) throws IOException {
        Iterator iterator0 = ((zzgxn)object0).zza.zzf();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            zzgxf zzgxf0 = (zzgxf)map$Entry0.getKey();
            if(zzgxf0.zzc() != zzhav.zzi || zzgxf0.zze() || zzgxf0.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if(map$Entry0 instanceof zzgyj) {
                zzhaw0.zzw(zzgxf0.zza(), ((zzgyj)map$Entry0).zza().zzb());
            }
            else {
                zzhaw0.zzw(zzgxf0.zza(), map$Entry0.getValue());
            }
        }
        ((zzgxr)object0).zzt.zzk(zzhaw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzk(Object object0, Object object1) {
        if(!((zzgxr)object0).zzt.equals(((zzgxr)object1).zzt)) {
            return false;
        }
        return this.zzc ? ((zzgxn)object0).zza.equals(((zzgxn)object1).zza) : true;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzl(Object object0) {
        return ((zzgxn)object0).zza.zzi();
    }
}

