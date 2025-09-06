package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ResponseInfo {
    @Nullable
    private final zzdy zza;
    private final List zzb;
    @Nullable
    private AdapterResponseInfo zzc;

    private ResponseInfo(@Nullable zzdy zzdy0) {
        zzw zzw0;
        this.zza = zzdy0;
        this.zzb = new ArrayList();
        if(zzdy0 != null) {
            try {
                List list0 = zzdy0.zzj();
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", remoteException0);
                goto label_17;
            }
            if(list0 != null) {
                for(Object object0: list0) {
                    AdapterResponseInfo adapterResponseInfo0 = AdapterResponseInfo.zza(((zzw)object0));
                    if(adapterResponseInfo0 != null) {
                        this.zzb.add(adapterResponseInfo0);
                    }
                }
            }
        }
    label_17:
        zzdy zzdy1 = this.zza;
        if(zzdy1 != null) {
            try {
                zzw0 = zzdy1.zzf();
            }
            catch(RemoteException remoteException1) {
                zzo.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", remoteException1);
                return;
            }
            if(zzw0 != null) {
                this.zzc = AdapterResponseInfo.zza(zzw0);
            }
        }
    }

    @NonNull
    public List getAdapterResponses() {
        return this.zzb;
    }

    @Nullable
    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    @Nullable
    public String getMediationAdapterClassName() {
        zzdy zzdy0 = this.zza;
        if(zzdy0 != null) {
            try {
                return zzdy0.zzg();
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", remoteException0);
            }
        }
        return null;
    }

    @NonNull
    public Bundle getResponseExtras() {
        zzdy zzdy0 = this.zza;
        if(zzdy0 != null) {
            try {
                return zzdy0.zze();
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Could not forward getResponseExtras to ResponseInfo.", remoteException0);
            }
        }
        return new Bundle();
    }

    @Nullable
    public String getResponseId() {
        zzdy zzdy0 = this.zza;
        if(zzdy0 != null) {
            try {
                return zzdy0.zzi();
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Could not forward getResponseId to ResponseInfo.", remoteException0);
            }
        }
        return null;
    }

    @Override
    @NonNull
    public String toString() {
        try {
            return this.zzd().toString(2);
        }
        catch(JSONException unused_ex) {
            return "Error forming toString output.";
        }
    }

    @Nullable
    public static ResponseInfo zza(@Nullable zzdy zzdy0) {
        return zzdy0 == null ? null : new ResponseInfo(zzdy0);
    }

    @NonNull
    public static ResponseInfo zzb(@Nullable zzdy zzdy0) {
        return new ResponseInfo(zzdy0);
    }

    @Nullable
    @VisibleForTesting
    public final zzdy zzc() {
        return this.zza;
    }

    @NonNull
    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        String s = this.getResponseId();
        if(s == null) {
            jSONObject0.put("Response ID", "null");
        }
        else {
            jSONObject0.put("Response ID", s);
        }
        String s1 = this.getMediationAdapterClassName();
        if(s1 == null) {
            jSONObject0.put("Mediation Adapter Class Name", "null");
        }
        else {
            jSONObject0.put("Mediation Adapter Class Name", s1);
        }
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.zzb) {
            jSONArray0.put(((AdapterResponseInfo)object0).zzb());
        }
        jSONObject0.put("Adapter Responses", jSONArray0);
        AdapterResponseInfo adapterResponseInfo0 = this.zzc;
        if(adapterResponseInfo0 != null) {
            jSONObject0.put("Loaded Adapter Response", adapterResponseInfo0.zzb());
        }
        Bundle bundle0 = this.getResponseExtras();
        if(bundle0 != null) {
            jSONObject0.put("Response Extras", zzbc.zzb().zzi(bundle0));
        }
        return jSONObject0;
    }
}

