package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.annotation.UiThread;
import androidx.core.view.WindowCompat;
import com.google.android.ump.b.a;
import com.google.android.ump.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@UiThread
public final class zzbb implements b {
    boolean zza;
    private final Application zzb;
    private final zzbw zzc;
    private final zzap zzd;
    private final zzbp zze;
    private final zzds zzf;
    private Dialog zzg;
    private zzbu zzh;
    private final AtomicBoolean zzi;
    private final AtomicReference zzj;
    private final AtomicReference zzk;
    private final AtomicReference zzl;

    public zzbb(Application application0, zzab zzab0, zzbw zzbw0, zzap zzap0, zzbp zzbp0, zzds zzds0) {
        this.zzi = new AtomicBoolean();
        this.zzj = new AtomicReference();
        this.zzk = new AtomicReference();
        this.zzl = new AtomicReference();
        this.zza = false;
        this.zzb = application0;
        this.zzc = zzbw0;
        this.zzd = zzap0;
        this.zze = zzbp0;
        this.zzf = zzds0;
    }

    @Override  // com.google.android.ump.b
    public final void show(Activity activity0, a b$a0) {
        zzcr.zza();
        if(!this.zzi.compareAndSet(false, true)) {
            b$a0.a(new zzg(3, (this.zza ? "Privacy options form is being loading. Please try again later." : "ConsentForm#show can only be invoked once.")).zza());
            return;
        }
        this.zzh.zzc();
        zzay zzay0 = new zzay(this, activity0);
        this.zzb.registerActivityLifecycleCallbacks(zzay0);
        this.zzl.set(zzay0);
        this.zzc.zza(activity0);
        Dialog dialog0 = new Dialog(activity0, 0x1030010);
        dialog0.setContentView(this.zzh);
        dialog0.setCancelable(false);
        Window window0 = dialog0.getWindow();
        if(window0 == null) {
            b$a0.a(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window0.setLayout(-1, -1);
        window0.setBackgroundDrawable(new ColorDrawable(0));
        window0.setFlags(0x1000000, 0x1000000);
        WindowCompat.c(window0, false);
        this.zzk.set(b$a0);
        dialog0.show();
        this.zzg = dialog0;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    final zzbu zzc() {
        return this.zzh;
    }

    final void zzf(com.google.android.ump.f.b f$b0, com.google.android.ump.f.a f$a0) {
        zzbu zzbu0 = ((zzbv)this.zzf).zzb();
        this.zzh = zzbu0;
        zzbu0.setBackgroundColor(0);
        zzbu0.getSettings().setJavaScriptEnabled(true);
        zzbu0.setWebViewClient(new zzbt(zzbu0, null));
        zzba zzba0 = new zzba(f$b0, f$a0, null);
        this.zzj.set(zzba0);
        this.zzh.loadDataWithBaseURL(this.zze.zza(), this.zze.zzb(), "text/html", "UTF-8", null);
        zzax zzax0 = new zzax(this);
        zzcr.zza.postDelayed(zzax0, 10000L);
    }

    final void zzg(int v) {
        this.zzk();
        a b$a0 = (a)this.zzk.getAndSet(null);
        if(b$a0 == null) {
            return;
        }
        this.zzd.zzg(3);
        b$a0.a(null);
    }

    final void zzh(zzg zzg0) {
        this.zzk();
        a b$a0 = (a)this.zzk.getAndSet(null);
        if(b$a0 == null) {
            return;
        }
        b$a0.a(zzg0.zza());
    }

    final void zzi() {
        zzba zzba0 = (zzba)this.zzj.getAndSet(null);
        if(zzba0 == null) {
            return;
        }
        zzba0.onConsentFormLoadSuccess(this);
    }

    final void zzj(zzg zzg0) {
        zzba zzba0 = (zzba)this.zzj.getAndSet(null);
        if(zzba0 == null) {
            return;
        }
        zzba0.onConsentFormLoadFailure(zzg0.zza());
    }

    private final void zzk() {
        Dialog dialog0 = this.zzg;
        if(dialog0 != null) {
            dialog0.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzay zzay0 = (zzay)this.zzl.getAndSet(null);
        if(zzay0 != null) {
            zzay0.zzb();
        }
    }
}

