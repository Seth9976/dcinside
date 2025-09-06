package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

final class zzaan implements DisplayManager.DisplayListener {
    final zzaap zza;
    private final DisplayManager zzb;

    public zzaan(zzaap zzaap0, DisplayManager displayManager0) {
        this.zza = zzaap0;
        super();
        this.zzb = displayManager0;
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayAdded(int v) {
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayChanged(int v) {
        if(v == 0) {
            Display display0 = this.zzc();
            zzaap.zzb(this.zza, display0);
        }
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayRemoved(int v) {
    }

    public final void zza() {
        Handler handler0 = zzei.zzy(null);
        this.zzb.registerDisplayListener(this, handler0);
        Display display0 = this.zzc();
        zzaap.zzb(this.zza, display0);
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
    }

    private final Display zzc() {
        return this.zzb.getDisplay(0);
    }
}

