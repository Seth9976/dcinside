package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbsh extends zzbsi implements zzbjp {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcex zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbt zzk;
    private float zzl;
    private int zzm;

    public zzbsh(zzcex zzcex0, Context context0, zzbbt zzbbt0) {
        super(zzcex0, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcex0;
        this.zzi = context0;
        this.zzk = zzbbt0;
        this.zzj = (WindowManager)context0.getSystemService("window");
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        JSONObject jSONObject0;
        zzcex zzcex0 = (zzcex)object0;
        this.zza = new DisplayMetrics();
        Display display0 = this.zzj.getDefaultDisplay();
        display0.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = display0.getRotation();
        this.zzb = zzf.zzv(this.zza, this.zza.widthPixels);
        this.zzc = zzf.zzv(this.zza, this.zza.heightPixels);
        Activity activity0 = this.zzh.zzi();
        if(activity0 == null || activity0.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        }
        else {
            int[] arr_v = zzs.zzQ(activity0);
            this.zzd = zzf.zzv(this.zza, arr_v[0]);
            this.zze = zzf.zzv(this.zza, arr_v[1]);
        }
        if(this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        }
        else {
            this.zzh.measure(0, 0);
        }
        this.zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbsg zzbsg0 = new zzbsg();
        Intent intent0 = new Intent("android.intent.action.DIAL");
        intent0.setData(Uri.parse("tel:"));
        zzbsg0.zze(this.zzk.zza(intent0));
        Intent intent1 = new Intent("android.intent.action.VIEW");
        intent1.setData(Uri.parse("sms:"));
        zzbsg0.zzc(this.zzk.zza(intent1));
        zzbsg0.zza(this.zzk.zzb());
        zzbsg0.zzd(this.zzk.zzc());
        zzbsg0.zzb(true);
        zzcex zzcex1 = this.zzh;
        try {
            jSONObject0 = new JSONObject().put("sms", zzbsg0.zza).put("tel", zzbsg0.zzb).put("calendar", zzbsg0.zzc).put("storePicture", zzbsg0.zzd).put("inlineVideo", zzbsg0.zze);
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Error occurred while obtaining the MRAID capabilities.", jSONException0);
            jSONObject0 = null;
        }
        zzcex1.zze("onDeviceFeaturesReceived", jSONObject0);
        int[] arr_v1 = new int[2];
        this.zzh.getLocationOnScreen(arr_v1);
        this.zzb(zzbc.zzb().zzb(this.zzi, arr_v1[0]), zzbc.zzb().zzb(this.zzi, arr_v1[1]));
        if(zzo.zzm(2)) {
            zzo.zzi("Dispatching Ready Event.");
        }
        this.zzi(this.zzh.zzn().afmaVersion);
    }

    public final void zzb(int v, int v1) {
        int v2 = 0;
        int v3 = this.zzi instanceof Activity ? zzs.zzR(((Activity)this.zzi))[0] : 0;
        if(this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            int v4 = this.zzh.getWidth();
            int v5 = this.zzh.getHeight();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzad)).booleanValue()) {
                if(v4 == 0) {
                    v4 = this.zzh.zzO() == null ? 0 : this.zzh.zzO().zzb;
                }
                if(v5 != 0) {
                    v2 = v5;
                }
                else if(this.zzh.zzO() != null) {
                    v2 = this.zzh.zzO().zza;
                }
            }
            else {
                v2 = v5;
            }
            this.zzf = zzbc.zzb().zzb(this.zzi, v4);
            this.zzg = zzbc.zzb().zzb(this.zzi, v2);
        }
        this.zzg(v, v1 - v3, this.zzf, this.zzg);
        this.zzh.zzN().zzD(v, v1);
    }
}

