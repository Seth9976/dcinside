package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

public final class zzbsf extends zzbsi {
    private final Map zza;
    private final Context zzb;

    public zzbsf(zzcex zzcex0, Map map0) {
        super(zzcex0, "storePicture");
        this.zza = map0;
        this.zzb = zzcex0.zzi();
    }

    public final void zzb() {
        if(this.zzb == null) {
            this.zzh("Activity context is not available");
            return;
        }
        if(!new zzbbt(this.zzb).zzc()) {
            this.zzh("Feature is not supported by the device.");
            return;
        }
        String s = (String)this.zza.get("iurl");
        if(TextUtils.isEmpty(s)) {
            this.zzh("Image url cannot be empty.");
            return;
        }
        if(URLUtil.isValidUrl(s)) {
            String s1 = Uri.parse(s).getLastPathSegment();
            if(!TextUtils.isEmpty(s1) && s1.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources resources0 = zzv.zzp().zze();
                AlertDialog.Builder alertDialog$Builder0 = zzs.zzL(this.zzb);
                alertDialog$Builder0.setTitle((resources0 == null ? "Save image" : resources0.getString(string.s1)));
                alertDialog$Builder0.setMessage((resources0 == null ? "Allow Ad to store image in Picture gallery?" : resources0.getString(string.s2)));
                alertDialog$Builder0.setPositiveButton((resources0 == null ? "Accept" : resources0.getString(string.s3)), new zzbsd(this, s, s1));
                alertDialog$Builder0.setNegativeButton((resources0 == null ? "Decline" : resources0.getString(string.s4)), new zzbse(this));
                alertDialog$Builder0.create().show();
                return;
            }
            this.zzh("Image type not recognized: " + s1);
            return;
        }
        this.zzh("Invalid image url: " + s);
    }
}

