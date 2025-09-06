package com.google.android.gms.internal.vision;

import java.io.IOException;

abstract class zzlu {
    abstract Object zza();

    abstract Object zza(Object arg1);

    abstract void zza(Object arg1, int arg2, int arg3);

    abstract void zza(Object arg1, int arg2, long arg3);

    abstract void zza(Object arg1, int arg2, zzht arg3);

    abstract void zza(Object arg1, int arg2, Object arg3);

    abstract void zza(Object arg1, zzmr arg2) throws IOException;

    abstract void zza(Object arg1, Object arg2);

    abstract boolean zza(zzld arg1);

    final boolean zza(Object object0, zzld zzld0) throws IOException {
        int v = zzld0.zzb();
        switch(v & 7) {
            case 0: {
                this.zza(object0, v >>> 3, zzld0.zzg());
                return true;
            }
            case 1: {
                this.zzb(object0, v >>> 3, zzld0.zzi());
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            Object object1 = this.zza();
                            while(zzld0.zza() != 0x7FFFFFFF && this.zza(object1, zzld0)) {
                            }
                            if((4 | v >>> 3 << 3) != zzld0.zzb()) {
                                throw zzjk.zze();
                            }
                            this.zza(object0, v >>> 3, this.zza(object1));
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw zzjk.zzf();
                            }
                            this.zza(object0, v >>> 3, zzld0.zzj());
                            return true;
                        }
                    }
                }
                this.zza(object0, v >>> 3, zzld0.zzn());
                return true;
            }
        }
    }

    abstract Object zzb(Object arg1);

    abstract void zzb(Object arg1, int arg2, long arg3);

    abstract void zzb(Object arg1, zzmr arg2) throws IOException;

    abstract void zzb(Object arg1, Object arg2);

    abstract Object zzc(Object arg1);

    abstract Object zzc(Object arg1, Object arg2);

    abstract void zzd(Object arg1);

    abstract int zze(Object arg1);

    abstract int zzf(Object arg1);
}

