package com.google.android.gms.internal.measurement;

import java.io.IOException;

abstract class zzmk {
    private static volatile int zza = 100;

    static {
    }

    abstract int zza(Object arg1);

    abstract Object zza();

    abstract Object zza(Object arg1, Object arg2);

    abstract void zza(Object arg1, int arg2, int arg3);

    abstract void zza(Object arg1, int arg2, long arg3);

    abstract void zza(Object arg1, int arg2, zzik arg3);

    abstract void zza(Object arg1, int arg2, Object arg3);

    abstract void zza(Object arg1, zznb arg2) throws IOException;

    abstract boolean zza(zzlr arg1);

    final boolean zza(Object object0, zzlr zzlr0, int v) throws IOException {
        int v1 = zzlr0.zzd();
        switch(v1 & 7) {
            case 0: {
                this.zzb(object0, v1 >>> 3, zzlr0.zzl());
                return true;
            }
            case 1: {
                this.zza(object0, v1 >>> 3, zzlr0.zzk());
                return true;
            }
            default: {
                if((v1 & 7) != 2) {
                    switch(v1 & 7) {
                        case 3: {
                            Object object1 = this.zza();
                            if(v + 1 >= zzmk.zza) {
                                throw zzkb.zzh();
                            }
                            while(zzlr0.zzc() != 0x7FFFFFFF && this.zza(object1, zzlr0, v + 1)) {
                            }
                            if((4 | v1 >>> 3 << 3) != zzlr0.zzd()) {
                                throw zzkb.zzb();
                            }
                            this.zza(object0, v1 >>> 3, this.zze(object1));
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v1 & 7) != 5) {
                                throw zzkb.zza();
                            }
                            this.zza(object0, v1 >>> 3, zzlr0.zzf());
                            return true;
                        }
                    }
                }
                this.zza(object0, v1 >>> 3, zzlr0.zzp());
                return true;
            }
        }
    }

    abstract int zzb(Object arg1);

    abstract void zzb(Object arg1, int arg2, long arg3);

    abstract void zzb(Object arg1, zznb arg2) throws IOException;

    abstract void zzb(Object arg1, Object arg2);

    abstract Object zzc(Object arg1);

    abstract void zzc(Object arg1, Object arg2);

    abstract Object zzd(Object arg1);

    abstract Object zze(Object arg1);

    abstract void zzf(Object arg1);
}

