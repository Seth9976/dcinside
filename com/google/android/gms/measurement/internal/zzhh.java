package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzov;

final class zzhh implements Runnable {
    private final zzbz zza;
    private final ServiceConnection zzb;
    private final zzhi zzc;

    zzhh(zzhi zzhi0, zzbz zzbz0, ServiceConnection serviceConnection0) {
        this.zza = zzbz0;
        this.zzb = serviceConnection0;
        this.zzc = zzhi0;
        super();
    }

    @Override
    public final void run() {
        zzhf zzhf0 = this.zzc.zza;
        String s = this.zzc.zzb;
        ServiceConnection serviceConnection0 = this.zzb;
        Bundle bundle0 = zzhf0.zza(s, this.zza);
        zzhf0.zza.zzl().zzt();
        zzhf0.zza.zzy();
        if(bundle0 != null) {
            long v = bundle0.getLong("install_begin_timestamp_seconds", 0L);
            if(v * 1000L == 0L) {
                zzhf0.zza.zzj().zzu().zza("Service response is missing Install Referrer install timestamp");
            }
            else {
                String s1 = bundle0.getString("install_referrer");
                if(s1 == null || s1.isEmpty()) {
                    zzhf0.zza.zzj().zzg().zza("No referrer defined in Install Referrer response");
                }
                else {
                    zzhf0.zza.zzj().zzp().zza("InstallReferrer API result", s1);
                    boolean z = zzov.zza() && zzhf0.zza.zzf().zza(zzbh.zzcu);
                    Bundle bundle1 = zzhf0.zza.zzt().zza(Uri.parse(("?" + s1)), z);
                    if(bundle1 == null) {
                        zzhf0.zza.zzj().zzg().zza("No campaign params defined in Install Referrer result");
                    }
                    else if(!z) {
                        String s2 = bundle1.getString("medium");
                        if(s2 == null || "(not set)".equalsIgnoreCase(s2) || "organic".equalsIgnoreCase(s2)) {
                        label_32:
                            if(v * 1000L == zzhf0.zza.zzn().zzd.zza()) {
                                zzhf0.zza.zzj().zzp().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                            }
                            if(zzhf0.zza.zzac()) {
                                zzhf0.zza.zzn().zzd.zza(v * 1000L);
                                zzhf0.zza.zzj().zzp().zza("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                bundle1.putString("_cis", "referrer API v2");
                                zzhf0.zza.zzp().zza("auto", "_cmp", bundle1, s);
                            }
                        }
                        else {
                            long v2 = bundle0.getLong("referrer_click_timestamp_seconds", 0L);
                            if(v2 * 1000L == 0L) {
                                zzhf0.zza.zzj().zzg().zza("Install Referrer is missing click timestamp for ad campaign");
                            }
                            else {
                                bundle1.putLong("click_timestamp", v2 * 1000L);
                                goto label_32;
                            }
                        }
                    }
                    else if(bundle1.containsKey("gclid") || bundle1.containsKey("gbraid")) {
                        long v1 = bundle0.getLong("referrer_click_timestamp_server_seconds", 0L);
                        if(v1 * 1000L > 0L) {
                            bundle1.putLong("click_timestamp", v1 * 1000L);
                        }
                        goto label_32;
                    }
                    else {
                        goto label_32;
                    }
                }
            }
        }
        if(serviceConnection0 != null) {
            ConnectionTracker.getInstance().unbindService(zzhf0.zza.zza(), serviceConnection0);
        }
    }
}

