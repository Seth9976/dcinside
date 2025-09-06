package com.google.android.gms.internal.ads;

import o3.a;

final class zzgax.zzg extends zzgax.zza {
    private zzgax.zzg() {
        throw null;
    }

    zzgax.zzg(zzgba zzgba0) {
        super(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final zzgax.zzd zza(zzgax zzgax0, zzgax.zzd zzgax$zzd0) {
        synchronized(zzgax0) {
            zzgax.zzd zzgax$zzd1 = zzgax0.listeners;
            if(zzgax$zzd1 != zzgax$zzd0) {
                zzgax0.listeners = zzgax$zzd0;
            }
            return zzgax$zzd1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final zzgax.zzk zzb(zzgax zzgax0, zzgax.zzk zzgax$zzk0) {
        synchronized(zzgax0) {
            zzgax.zzk zzgax$zzk1 = zzgax0.waiters;
            if(zzgax$zzk1 != zzgax$zzk0) {
                zzgax0.waiters = zzgax$zzk0;
            }
            return zzgax$zzk1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final void zzc(zzgax.zzk zzgax$zzk0, @a zzgax.zzk zzgax$zzk1) {
        zzgax$zzk0.next = zzgax$zzk1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final void zzd(zzgax.zzk zzgax$zzk0, Thread thread0) {
        zzgax$zzk0.thread = thread0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final boolean zze(zzgax zzgax0, @a zzgax.zzd zzgax$zzd0, zzgax.zzd zzgax$zzd1) {
        synchronized(zzgax0) {
            if(zzgax0.listeners == zzgax$zzd0) {
                zzgax0.listeners = zzgax$zzd1;
                return true;
            }
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final boolean zzf(zzgax zzgax0, @a Object object0, Object object1) {
        synchronized(zzgax0) {
            if(zzgax0.value == object0) {
                zzgax0.value = object1;
                return true;
            }
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final boolean zzg(zzgax zzgax0, @a zzgax.zzk zzgax$zzk0, @a zzgax.zzk zzgax$zzk1) {
        synchronized(zzgax0) {
            if(zzgax0.waiters == zzgax$zzk0) {
                zzgax0.waiters = zzgax$zzk1;
                return true;
            }
            return false;
        }
    }
}

