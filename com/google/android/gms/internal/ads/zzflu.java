package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

public final class zzflu {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzflu zza;
    private WeakReference zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zzflu.zza = new zzflu();
    }

    public zzflu() {
        this.zzc = false;
        this.zzd = false;
    }

    public static zzflu zza() {
        return zzflu.zza;
    }

    public final void zzc() {
        Context context0 = (Context)this.zzb.get();
        if(context0 == null) {
            return;
        }
        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
        boolean z = Build.VERSION.SDK_INT < 22 ? keyguardManager0.inKeyguardRestrictedInputMode() : keyguardManager0.isDeviceLocked();
        this.zzd(this.zzc, z);
        this.zzd = z;
    }

    public final void zzd(boolean z, boolean z1) {
        if((!z1 && !z ? 0 : 1) != (!this.zzd && !this.zzc ? 0 : 1)) {
            for(Object object0: zzflk.zza().zzc()) {
                ((zzfkt)object0).zzg().zzm(z1 || z);
            }
        }
    }

    public final void zze(Context context0) {
        if(context0 == null) {
            return;
        }
        this.zzb = new WeakReference(context0);
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter0.addAction("android.intent.action.SCREEN_ON");
        context0.registerReceiver(new zzflt(this), intentFilter0);
    }
}

