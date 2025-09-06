package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzkq implements zzlc {
    private final zzkk zza;
    private final zzlu zzb;
    private final boolean zzc;
    private final zziq zzd;

    private zzkq(zzlu zzlu0, zziq zziq0, zzkk zzkk0) {
        this.zzb = zzlu0;
        this.zzc = zziq0.zza(zzkk0);
        this.zzd = zziq0;
        this.zza = zzkk0;
    }

    static zzkq zza(zzlu zzlu0, zziq zziq0, zzkk zzkk0) {
        return new zzkq(zzlu0, zziq0, zzkk0);
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final int zza(Object object0) {
        int v = this.zzb.zzb(object0).hashCode();
        return this.zzc ? v * 53 + this.zzd.zza(object0).hashCode() : v;
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final Object zza() {
        return this.zza.zzq().zze();
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final void zza(Object object0, zzld zzld0, zzio zzio0) throws IOException {
        boolean z;
        zzlu zzlu0 = this.zzb;
        zziq zziq0 = this.zzd;
        Object object1 = zzlu0.zzc(object0);
        zziu zziu0 = zziq0.zzb(object0);
        while(true) {
            try {
                if(zzld0.zza() == 0x7FFFFFFF) {
                    break;
                }
                int v = zzld0.zzb();
                if(v == 11) {
                    Object object2 = null;
                    zzht zzht0 = null;
                    int v1 = 0;
                    while(zzld0.zza() != 0x7FFFFFFF) {
                        int v2 = zzld0.zzb();
                        if(v2 == 16) {
                            v1 = zzld0.zzo();
                            object2 = zziq0.zza(zzio0, this.zza, v1);
                        }
                        else if(v2 == 26) {
                            if(object2 == null) {
                                zzht0 = zzld0.zzn();
                            }
                            else {
                                zziq0.zza(zzld0, object2, zzio0, zziu0);
                            }
                        }
                        else if(!zzld0.zzc()) {
                            break;
                        }
                    }
                    if(zzld0.zzb() != 12) {
                        throw zzjk.zze();
                    }
                    if(zzht0 == null) {
                    }
                    else if(object2 != null) {
                        zziq0.zza(zzht0, object2, zzio0, zziu0);
                    }
                    else {
                        zzlu0.zza(object1, v1, zzht0);
                    }
                    z = true;
                }
                else if((v & 7) == 2) {
                    Object object3 = zziq0.zza(zzio0, this.zza, v >>> 3);
                    if(object3 == null) {
                        z = zzlu0.zza(object1, zzld0);
                    }
                    else {
                        zziq0.zza(zzld0, object3, zzio0, zziu0);
                        z = true;
                    }
                }
                else {
                    z = zzld0.zzc();
                }
            }
            catch(Throwable throwable0) {
                zzlu0.zzb(object0, object1);
                throw throwable0;
            }
            if(!z) {
                zzlu0.zzb(object0, object1);
                return;
            }
        }
        zzlu0.zzb(object0, object1);
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final void zza(Object object0, zzmr zzmr0) throws IOException {
        Iterator iterator0 = this.zzd.zza(object0).zzd();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            zziw zziw0 = (zziw)map$Entry0.getKey();
            if(zziw0.zzc() != zzmo.zzi || zziw0.zzd() || zziw0.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if(map$Entry0 instanceof zzjr) {
                zzmr0.zza(zziw0.zza(), ((zzjr)map$Entry0).zza().zzc());
            }
            else {
                zzmr0.zza(zziw0.zza(), map$Entry0.getValue());
            }
        }
        Object object2 = this.zzb.zzb(object0);
        this.zzb.zzb(object2, zzmr0);
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final void zza(Object object0, byte[] arr_b, int v, int v1, zzhn zzhn0) throws IOException {
        zzlx zzlx0 = ((zzjb)object0).zzb;
        if(zzlx0 == zzlx.zza()) {
            zzlx0 = zzlx.zzb();
            ((zzjb)object0).zzb = zzlx0;
        }
        zziu zziu0 = ((zzc)object0).zza();
        zze zzjb$zze0 = null;
        while(v < v1) {
            int v2 = zzhl.zza(arr_b, v, zzhn0);
            int v3 = zzhn0.zza;
            if(v3 == 11) {
                int v4 = 0;
                zzht zzht0 = null;
                while(v2 < v1) {
                    v2 = zzhl.zza(arr_b, v2, zzhn0);
                    int v5 = zzhn0.zza;
                    int v6 = v5 & 7;
                    switch(v5 >>> 3) {
                        case 2: {
                            if(v6 == 0) {
                                v2 = zzhl.zza(arr_b, v2, zzhn0);
                                v4 = zzhn0.zza;
                                zzjb$zze0 = (zze)this.zzd.zza(zzhn0.zzd, this.zza, v4);
                                continue;
                            }
                            break;
                        }
                        case 3: {
                            if(zzjb$zze0 != null) {
                                v2 = zzhl.zza(zzky.zza().zza(zzjb$zze0.zzc.getClass()), arr_b, v2, v1, zzhn0);
                                zziu0.zza(zzjb$zze0.zzd, zzhn0.zzc);
                                continue;
                            }
                            else if(v6 == 2) {
                                v2 = zzhl.zze(arr_b, v2, zzhn0);
                                zzht0 = (zzht)zzhn0.zzc;
                                continue;
                            }
                        }
                    }
                    if(v5 == 12) {
                        break;
                    }
                    v2 = zzhl.zza(v5, arr_b, v2, v1, zzhn0);
                }
                if(zzht0 != null) {
                    zzlx0.zza(v4 << 3 | 2, zzht0);
                }
                v = v2;
            }
            else if((v3 & 7) == 2) {
                zze zzjb$zze1 = (zze)this.zzd.zza(zzhn0.zzd, this.zza, v3 >>> 3);
                if(zzjb$zze1 == null) {
                    v = zzhl.zza(v3, arr_b, v2, v1, zzlx0, zzhn0);
                }
                else {
                    v = zzhl.zza(zzky.zza().zza(zzjb$zze1.zzc.getClass()), arr_b, v2, v1, zzhn0);
                    zziu0.zza(zzjb$zze1.zzd, zzhn0.zzc);
                }
                zzjb$zze0 = zzjb$zze1;
            }
            else {
                v = zzhl.zza(v3, arr_b, v2, v1, zzhn0);
            }
        }
        if(v != v1) {
            throw zzjk.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final boolean zza(Object object0, Object object1) {
        if(!this.zzb.zzb(object0).equals(this.zzb.zzb(object1))) {
            return false;
        }
        return this.zzc ? this.zzd.zza(object0).equals(this.zzd.zza(object1)) : true;
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final int zzb(Object object0) {
        Object object1 = this.zzb.zzb(object0);
        int v = this.zzb.zze(object1);
        return this.zzc ? v + this.zzd.zza(object0).zzg() : v;
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final void zzb(Object object0, Object object1) {
        zzle.zza(this.zzb, object0, object1);
        if(this.zzc) {
            zzle.zza(this.zzd, object0, object1);
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final void zzc(Object object0) {
        this.zzb.zzd(object0);
        this.zzd.zzc(object0);
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final boolean zzd(Object object0) {
        return this.zzd.zza(object0).zzf();
    }
}

