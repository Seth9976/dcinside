package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzli implements zzlu {
    private final zzlc zza;
    private final zzmk zzb;
    private final boolean zzc;
    private final zzji zzd;

    private zzli(zzmk zzmk0, zzji zzji0, zzlc zzlc0) {
        this.zzb = zzmk0;
        this.zzc = zzji0.zza(zzlc0);
        this.zzd = zzji0;
        this.zza = zzlc0;
    }

    static zzli zza(zzmk zzmk0, zzji zzji0, zzlc zzlc0) {
        return new zzli(zzmk0, zzji0, zzlc0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object object0) {
        Object object1 = this.zzb.zzd(object0);
        int v = this.zzb.zzb(object1);
        return this.zzc ? v + this.zzd.zza(object0).zza() : v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final Object zza() {
        zzlc zzlc0 = this.zza;
        return zzlc0 instanceof zzjt ? ((zzjt)zzlc0).zzce() : zzlc0.zzci().zzaj();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final void zza(Object object0, zzlr zzlr0, zzjg zzjg0) throws IOException {
        boolean z;
        zzmk zzmk0 = this.zzb;
        zzji zzji0 = this.zzd;
        Object object1 = zzmk0.zzc(object0);
        zzjm zzjm0 = zzji0.zzb(object0);
        while(true) {
            try {
                if(zzlr0.zzc() == 0x7FFFFFFF) {
                    break;
                }
                int v = zzlr0.zzd();
                int v1 = 0;
                if(v == 11) {
                    Object object2 = null;
                    zzik zzik0 = null;
                    while(zzlr0.zzc() != 0x7FFFFFFF) {
                        int v2 = zzlr0.zzd();
                        if(v2 == 16) {
                            v1 = zzlr0.zzj();
                            object2 = zzji0.zza(zzjg0, this.zza, v1);
                        }
                        else if(v2 == 26) {
                            if(object2 == null) {
                                zzik0 = zzlr0.zzp();
                            }
                            else {
                                zzji0.zza(zzlr0, object2, zzjg0, zzjm0);
                            }
                        }
                        else if(!zzlr0.zzt()) {
                            break;
                        }
                    }
                    if(zzlr0.zzd() != 12) {
                        throw zzkb.zzb();
                    }
                    if(zzik0 == null) {
                    }
                    else if(object2 != null) {
                        zzji0.zza(zzik0, object2, zzjg0, zzjm0);
                    }
                    else {
                        zzmk0.zza(object1, v1, zzik0);
                    }
                    z = true;
                }
                else if((v & 7) == 2) {
                    Object object3 = zzji0.zza(zzjg0, this.zza, v >>> 3);
                    if(object3 == null) {
                        z = zzmk0.zza(object1, zzlr0, 0);
                    }
                    else {
                        zzji0.zza(zzlr0, object3, zzjg0, zzjm0);
                        z = true;
                    }
                }
                else {
                    z = zzlr0.zzt();
                }
            }
            catch(Throwable throwable0) {
                zzmk0.zzb(object0, object1);
                throw throwable0;
            }
            if(!z) {
                zzmk0.zzb(object0, object1);
                return;
            }
        }
        zzmk0.zzb(object0, object1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final void zza(Object object0, zznb zznb0) throws IOException {
        Iterator iterator0 = this.zzd.zza(object0).zzd();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            zzjo zzjo0 = (zzjo)map$Entry0.getKey();
            if(zzjo0.zzc() != zzmz.zzi || zzjo0.zze() || zzjo0.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if(map$Entry0 instanceof zzkf) {
                zznb0.zza(zzjo0.zza(), ((zzkf)map$Entry0).zza().zzb());
            }
            else {
                zznb0.zza(zzjo0.zza(), map$Entry0.getValue());
            }
        }
        Object object2 = this.zzb.zzd(object0);
        this.zzb.zza(object2, zznb0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final void zza(Object object0, Object object1) {
        zzlw.zza(this.zzb, object0, object1);
        if(this.zzc) {
            zzlw.zza(this.zzd, object0, object1);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final void zza(Object object0, byte[] arr_b, int v, int v1, zzij zzij0) throws IOException {
        zzmj zzmj0 = ((zzjt)object0).zzb;
        if(zzmj0 == zzmj.zzc()) {
            zzmj0 = zzmj.zzd();
            ((zzjt)object0).zzb = zzmj0;
        }
        ((zzd)object0).zza();
        zzf zzjt$zzf0 = null;
        while(v < v1) {
            int v2 = zzig.zzc(arr_b, v, zzij0);
            int v3 = zzij0.zza;
            if(v3 == 11) {
                int v4 = 0;
                zzik zzik0 = null;
                while(v2 < v1) {
                    v2 = zzig.zzc(arr_b, v2, zzij0);
                    int v5 = zzij0.zza;
                    int v6 = v5 & 7;
                    switch(v5 >>> 3) {
                        case 2: {
                            if(v6 == 0) {
                                v2 = zzig.zzc(arr_b, v2, zzij0);
                                v4 = zzij0.zza;
                                zzjt$zzf0 = (zzf)this.zzd.zza(zzij0.zzd, this.zza, v4);
                                continue;
                            }
                            break;
                        }
                        case 3: {
                            if(zzjt$zzf0 != null) {
                                throw new NoSuchMethodError();
                            }
                            if(v6 == 2) {
                                v2 = zzig.zza(arr_b, v2, zzij0);
                                zzik0 = (zzik)zzij0.zzc;
                                continue;
                            }
                        }
                    }
                    if(v5 == 12) {
                        break;
                    }
                    v2 = zzig.zza(v5, arr_b, v2, v1, zzij0);
                }
                if(zzik0 != null) {
                    zzmj0.zza(v4 << 3 | 2, zzik0);
                }
                v = v2;
            }
            else if((v3 & 7) == 2) {
                zzjt$zzf0 = (zzf)this.zzd.zza(zzij0.zzd, this.zza, v3 >>> 3);
                if(zzjt$zzf0 != null) {
                    throw new NoSuchMethodError();
                }
                v = zzig.zza(v3, arr_b, v2, v1, zzmj0, zzij0);
            }
            else {
                v = zzig.zza(v3, arr_b, v2, v1, zzij0);
            }
        }
        if(v != v1) {
            throw zzkb.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object object0) {
        int v = this.zzb.zzd(object0).hashCode();
        return this.zzc ? v * 53 + this.zzd.zza(object0).hashCode() : v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzb(Object object0, Object object1) {
        if(!this.zzb.zzd(object0).equals(this.zzb.zzd(object1))) {
            return false;
        }
        return this.zzc ? this.zzd.zza(object0).equals(this.zzd.zza(object1)) : true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final void zzd(Object object0) {
        this.zzb.zzf(object0);
        this.zzd.zzc(object0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final boolean zze(Object object0) {
        return this.zzd.zza(object0).zzg();
    }
}

