package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzgcd;
import com.google.common.util.concurrent.t0;
import org.json.JSONException;
import org.json.JSONObject;

final class zzaq implements zzgcd {
    final t0 zza;
    final zzbyy zzb;
    final zzbyr zzc;
    final zzfgw zzd;
    final zzau zze;

    zzaq(zzau zzau0, t0 t00, zzbyy zzbyy0, zzbyr zzbyr0, zzfgw zzfgw0) {
        this.zza = t00;
        this.zzb = zzbyy0;
        this.zzc = zzbyr0;
        this.zzd = zzfgw0;
        this.zze = zzau0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        String s = throwable0.getMessage();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhC)).booleanValue()) {
            zzv.zzp().zzv(throwable0, "SignalGeneratorImpl.generateSignals");
        }
        else {
            zzv.zzp().zzw(throwable0, "SignalGeneratorImpl.generateSignals");
        }
        zzfhh zzfhh0 = zzau.zzr(this.zza, this.zzb);
        if(((Boolean)zzbee.zze.zze()).booleanValue() && zzfhh0 != null) {
            this.zzd.zzh(throwable0);
            this.zzd.zzg(false);
            zzfhh0.zza(this.zzd);
            zzfhh0.zzh();
        }
        if(this.zzc == null) {
            return;
        }
        try {
            if(!"Unknown format is no longer supported.".equals(s)) {
                s = "Internal error. " + s;
            }
            this.zzc.zzb(s);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(@Nullable Object object0) {
        zzbk zzbk0 = (zzbk)object0;
        zzfhh zzfhh0 = zzau.zzr(this.zza, this.zzb);
        this.zze.zzG.set(true);
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            zzbyr zzbyr0 = this.zzc;
            if(zzbyr0 != null) {
                try {
                    zzbyr0.zzb("QueryInfo generation has been disabled.");
                }
                catch(RemoteException remoteException0) {
                    zzo.zzg(("QueryInfo generation has been disabled." + remoteException0.toString()));
                }
            }
            if(((Boolean)zzbee.zze.zze()).booleanValue() && zzfhh0 != null) {
                this.zzd.zzc("QueryInfo generation has been disabled.");
                this.zzd.zzg(false);
                zzfhh0.zza(this.zzd);
                zzfhh0.zzh();
            }
        }
        else if(zzbk0 == null) {
            try {
                zzbyr zzbyr1 = this.zzc;
                if(zzbyr1 != null) {
                    zzbyr1.zzc(null, null, null);
                }
                this.zzd.zzg(true);
            }
            catch(RemoteException remoteException1) {
                goto label_71;
            }
            catch(Throwable throwable0) {
                goto label_79;
            }
            if(((Boolean)zzbee.zze.zze()).booleanValue() && zzfhh0 != null) {
                zzfhh0.zza(this.zzd);
                zzfhh0.zzh();
            }
        }
        else {
            try {
                try {
                    JSONObject jSONObject0 = TextUtils.isEmpty(zzbk0.zzc) ? new JSONObject(zzbk0.zzb) : new JSONObject(zzbk0.zzc);
                    goto label_42;
                }
                catch(JSONException jSONException0) {
                }
                zzo.zzj("Failed to create JSON object from the request string.");
                zzbyr zzbyr2 = this.zzc;
                if(zzbyr2 != null) {
                    zzbyr2.zzb("Internal error for request JSON: " + jSONException0.toString());
                }
                this.zzd.zzh(jSONException0);
                this.zzd.zzg(false);
                zzv.zzp().zzw(jSONException0, "SignalGeneratorImpl.generateSignals.onSuccess");
            }
            catch(RemoteException remoteException1) {
                goto label_71;
            }
            catch(Throwable throwable0) {
                goto label_79;
            }
            if(((Boolean)zzbee.zze.zze()).booleanValue() && zzfhh0 != null) {
                zzfhh0.zza(this.zzd);
                zzfhh0.zzh();
                return;
                try {
                label_42:
                    if(TextUtils.isEmpty(jSONObject0.optString("request_id", ""))) {
                        goto label_61;
                    }
                    else {
                        Bundle bundle0 = zzbk0.zzf;
                        if(this.zze.zzu && bundle0 != null && bundle0.getInt(this.zze.zzw, -1) == -1) {
                            bundle0.putInt(this.zze.zzw, this.zze.zzx.get());
                        }
                        if(this.zze.zzt && bundle0 != null && TextUtils.isEmpty(bundle0.getString(this.zze.zzv))) {
                            if(TextUtils.isEmpty(this.zze.zzz)) {
                                String s = zzv.zzq().zzc(this.zze.zzg, this.zze.zzy.afmaVersion);
                                this.zze.zzz = s;
                            }
                            bundle0.putString(this.zze.zzv, this.zze.zzz);
                        }
                        if(this.zzc != null) {
                            if(TextUtils.isEmpty(zzbk0.zzc)) {
                                this.zzc.zzc(zzbk0.zza, zzbk0.zzb, bundle0);
                            }
                            else {
                                this.zzc.zzc(zzbk0.zza, zzbk0.zzc, bundle0);
                            }
                        }
                        this.zzd.zzg(true);
                        goto label_57;
                    }
                    return;
                }
                catch(RemoteException remoteException1) {
                    goto label_71;
                }
                catch(Throwable throwable0) {
                    goto label_79;
                }
            label_57:
                if(((Boolean)zzbee.zze.zze()).booleanValue() && zzfhh0 != null) {
                    zzfhh0.zza(this.zzd);
                    zzfhh0.zzh();
                    return;
                    try {
                        try {
                        label_61:
                            zzo.zzj("The request ID is empty in request JSON.");
                            zzbyr zzbyr3 = this.zzc;
                            if(zzbyr3 != null) {
                                zzbyr3.zzb("Internal error: request ID is empty in request JSON.");
                            }
                            this.zzd.zzc("Request ID empty");
                            this.zzd.zzg(false);
                            goto label_83;
                        }
                        catch(RemoteException remoteException1) {
                        }
                    label_71:
                        this.zzd.zzh(remoteException1);
                        this.zzd.zzg(false);
                        zzo.zzh("", remoteException1);
                        zzv.zzp().zzw(remoteException1, "SignalGeneratorImpl.generateSignals.onSuccess");
                    }
                    catch(Throwable throwable0) {
                        goto label_79;
                    }
                    if(((Boolean)zzbee.zze.zze()).booleanValue() && zzfhh0 != null) {
                        zzfhh0.zza(this.zzd);
                        zzfhh0.zzh();
                        return;
                    label_79:
                        if(((Boolean)zzbee.zze.zze()).booleanValue() && zzfhh0 != null) {
                            zzfhh0.zza(this.zzd);
                            zzfhh0.zzh();
                        }
                        throw throwable0;
                    label_83:
                        if(((Boolean)zzbee.zze.zze()).booleanValue() && zzfhh0 != null) {
                            zzfhh0.zza(this.zzd);
                            zzfhh0.zzh();
                        }
                    }
                }
            }
        }
    }
}

