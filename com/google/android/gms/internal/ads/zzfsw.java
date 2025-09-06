package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import j..util.Collection.-EL;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@SuppressLint({"RestrictedApi"})
final class zzfsw {
    @VisibleForTesting
    final zzftn zza;
    public static final int zzb;
    private static final zzfto zzc;
    private static final Intent zzd;
    private final String zze;

    static {
        zzfsw.zzc = new zzfto("OverlayDisplayService");
        zzfsw.zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    }

    zzfsw(Context context0) {
        if(zzftq.zza(context0)) {
            Context context1 = context0.getApplicationContext();
            zzfss zzfss0 = new zzfss();
            this.zza = new zzftn(context1, zzfsw.zzc, "OverlayDisplayService", zzfsw.zzd, zzfss0);
        }
        else {
            this.zza = null;
        }
        this.zze = "com.dcinside.app.android";
    }

    final void zza() {
        if(this.zza == null) {
            return;
        }
        zzfsw.zzc.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzn();
    }

    final void zzb(zzfsd zzfsd0, zzftb zzftb0) {
        if(this.zza == null) {
            zzfsw.zzc.zza("error: %s", new Object[]{"Play Store not found."});
            return;
        }
        if(!zzfsw.zzj(zzftb0, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(new String[]{zzfsd0.zzb(), zzfsd0.zza()}))) {
            return;
        }
        zzfsm zzfsm0 = () -> {
            try {
                zzftn zzftn0 = this.zza;
                if(zzftn0 == null) {
                    throw null;
                }
                zzfrn zzfrn0 = (zzfrn)zzftn0.zzc();
                if(zzfrn0 == null) {
                    return;
                }
                Bundle bundle0 = new Bundle();
                bundle0.putString("callerPackage", this.zze);
                zzfsw.zzi(zzfsd0.zzb(), new zzfsp(bundle0));
                zzfsw.zzi(zzfsd0.zza(), new zzfsq(bundle0));
                zzfrn0.zze(bundle0, new zzfsv(this, zzftb0));
                return;
            }
            catch(RemoteException remoteException0) {
            }
            zzfsw.zzc.zzb(remoteException0, "dismiss overlay display from: %s", new Object[]{this.zze});
        };
        this.zza.zzi(zzfsm0);
    }

    // 检测为 Lambda 实现
    final void zzc(zzfsd zzfsd0, zzftb zzftb0) [...]

    // 检测为 Lambda 实现
    final void zzd(zzfsy zzfsy0, zzftb zzftb0) [...]

    // 检测为 Lambda 实现
    final void zze(zzftd zzftd0, int v, zzftb zzftb0) [...]

    final void zzf(zzfsy zzfsy0, zzftb zzftb0) {
        if(this.zza == null) {
            zzfsw.zzc.zza("error: %s", new Object[]{"Play Store not found."});
            return;
        }
        if(!zzfsw.zzj(zzftb0, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(new String[]{0, zzfsy0.zzh()}))) {
            return;
        }
        zzfsr zzfsr0 = () -> {
            try {
                zzftn zzftn0 = this.zza;
                if(zzftn0 == null) {
                    throw null;
                }
                zzfrn zzfrn0 = (zzfrn)zzftn0.zzc();
                if(zzfrn0 == null) {
                    return;
                }
                Bundle bundle0 = new Bundle();
                bundle0.putString("callerPackage", this.zze);
                bundle0.putBinder("windowToken", zzfsy0.zzf());
                zzfsw.zzi(zzfsy0.zzg(), new zzfsu(bundle0));
                bundle0.putInt("layoutGravity", zzfsy0.zzc());
                bundle0.putFloat("layoutVerticalMargin", zzfsy0.zza());
                bundle0.putInt("displayMode", 0);
                bundle0.putInt("triggerMode", 0);
                bundle0.putInt("windowWidthPx", zzfsy0.zze());
                zzfsw.zzi(null, new zzfsi(bundle0));
                zzfsw.zzi(null, new zzfsj(bundle0));
                zzfsw.zzi(zzfsy0.zzh(), new zzfsk(bundle0));
                zzfsw.zzi(null, new zzfsl(bundle0));
                bundle0.putBoolean("stableSessionToken", true);
                zzfsv zzfsv0 = new zzfsv(this, zzftb0);
                zzfrn0.zzf(this.zze, bundle0, zzfsv0);
                return;
            }
            catch(RemoteException remoteException0) {
            }
            zzfsw.zzc.zzb(remoteException0, "show overlay display from: %s", new Object[]{this.zze});
        };
        this.zza.zzi(zzfsr0);
    }

    final void zzg(zzftd zzftd0, zzftb zzftb0, int v) {
        if(this.zza == null) {
            zzfsw.zzc.zza("error: %s", new Object[]{"Play Store not found."});
            return;
        }
        if(!zzfsw.zzj(zzftb0, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(new String[]{zzftd0.zzb(), zzftd0.zza()}))) {
            return;
        }
        zzfso zzfso0 = () -> {
            try {
                zzftn zzftn0 = this.zza;
                if(zzftn0 == null) {
                    throw null;
                }
                zzfrn zzfrn0 = (zzfrn)zzftn0.zzc();
                if(zzfrn0 == null) {
                    return;
                }
                Bundle bundle0 = new Bundle();
                bundle0.putString("callerPackage", this.zze);
                bundle0.putInt("displayMode", v);
                zzfsw.zzi(zzftd0.zzb(), new zzfsh(bundle0));
                zzfsw.zzi(zzftd0.zza(), new zzfsn(bundle0));
                zzfrn0.zzg(bundle0, new zzfsv(this, zzftb0));
                return;
            }
            catch(RemoteException remoteException0) {
            }
            zzfsw.zzc.zzb(remoteException0, "switchDisplayMode overlay display to %d from: %s", new Object[]{v, this.zze});
        };
        this.zza.zzi(zzfso0);
    }

    // 检测为 Lambda 实现
    static boolean zzh(String s) [...]

    private static void zzi(String s, Consumer consumer0) {
        if(!zzfsw.zzk(s)) {
            s.getClass();
            consumer0.accept(s.trim());
        }
    }

    private static boolean zzj(zzftb zzftb0, String s, List list0) {
        if(Collection.-EL.stream(list0).anyMatch((String s) -> !zzfsw.zzk(s))) {
            return true;
        }
        zzfsw.zzc.zza(s, new Object[0]);
        zzfsz zzfsz0 = zzfta.zzc();
        zzfsz0.zzb(0x1FE0);
        zzftb0.zza(zzfsz0.zzc());
        return false;
    }

    private static boolean zzk(String s) {
        return zzfve.zzc(s).trim().isEmpty();
    }
}

