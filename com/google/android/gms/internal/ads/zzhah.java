package com.google.android.gms.internal.ads;

import java.io.IOException;

abstract class zzhah {
    private static volatile int zza = 100;

    static {
    }

    abstract Object zza(Object arg1);

    abstract Object zzb();

    abstract Object zzc(Object arg1);

    abstract void zzd(Object arg1, int arg2, int arg3);

    abstract void zze(Object arg1, int arg2, long arg3);

    abstract void zzf(Object arg1, int arg2, Object arg3);

    abstract void zzg(Object arg1, int arg2, zzgwj arg3);

    abstract void zzh(Object arg1, int arg2, long arg3);

    abstract void zzi(Object arg1);

    abstract void zzj(Object arg1, Object arg2);

    final boolean zzk(Object object0, zzgzp zzgzp0, int v) throws IOException {
        int v1 = zzgzp0.zzd();
        switch(v1 & 7) {
            case 0: {
                this.zzh(object0, v1 >>> 3, zzgzp0.zzl());
                return true;
            }
            case 1: {
                this.zze(object0, v1 >>> 3, zzgzp0.zzk());
                return true;
            }
            default: {
                if((v1 & 7) != 2) {
                    switch(v1 & 7) {
                        case 3: {
                            Object object1 = this.zzb();
                            if(v + 1 >= zzhah.zza) {
                                throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                            }
                            while(zzgzp0.zzc() != 0x7FFFFFFF && this.zzk(object1, zzgzp0, v + 1)) {
                            }
                            if((v1 >>> 3 << 3 | 4) != zzgzp0.zzd()) {
                                throw new zzgyg("Protocol message end-group tag did not match expected tag.");
                            }
                            this.zzf(object0, v1 >>> 3, this.zzc(object1));
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v1 & 7) != 5) {
                                throw new zzgyf("Protocol message tag had invalid wire type.");
                            }
                            this.zzd(object0, v1 >>> 3, zzgzp0.zzf());
                            return true;
                        }
                    }
                }
                this.zzg(object0, v1 >>> 3, zzgzp0.zzp());
                return true;
            }
        }
    }
}

