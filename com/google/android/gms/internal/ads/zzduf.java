package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzduf {
    private final Context zza;
    private final ApplicationInfo zzb;
    private final int zzc;
    private final int zzd;
    private String zze;

    public zzduf(Context context0) {
        this.zze = "";
        this.zza = context0;
        this.zzb = context0.getApplicationInfo();
        this.zzc = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzja)));
        this.zzd = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzjb)));
    }

    public final JSONObject zza() throws JSONException {
        String s2;
        String s1;
        JSONObject jSONObject0 = new JSONObject();
        try {
            String s = this.zzb.packageName;
            jSONObject0.put("name", Wrappers.packageManager(this.zza).getApplicationLabel(s));
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        jSONObject0.put("packageName", this.zzb.packageName);
        Drawable drawable0 = null;
        try {
            s1 = null;
            s1 = zzs.zzq(this.zza);
        }
        catch(RemoteException unused_ex) {
        }
        jSONObject0.put("adMobAppId", s1);
        if(this.zze.isEmpty()) {
            try {
                drawable0 = (Drawable)Wrappers.packageManager(this.zza).getApplicationLabelAndIcon(this.zzb.packageName).b;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            if(drawable0 == null) {
                s2 = "";
            }
            else {
                drawable0.setBounds(0, 0, this.zzc, this.zzd);
                Bitmap bitmap0 = Bitmap.createBitmap(this.zzc, this.zzd, Bitmap.Config.ARGB_8888);
                drawable0.draw(new Canvas(bitmap0));
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                bitmap0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
                s2 = Base64.encodeToString(byteArrayOutputStream0.toByteArray(), 2);
            }
            this.zze = s2;
        }
        if(!this.zze.isEmpty()) {
            jSONObject0.put("icon", this.zze);
            jSONObject0.put("iconWidthPx", this.zzc);
            jSONObject0.put("iconHeightPx", this.zzd);
        }
        return jSONObject0;
    }
}

