package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

final class zzk extends zzb {
    final zzm zza;

    zzk(zzm zzm0, zzl zzl0) {
        this.zza = zzm0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        BitmapDrawable bitmapDrawable0;
        Bitmap bitmap0 = zzv.zzv().zza(this.zza.zzc.zzo.zzf);
        if(bitmap0 != null) {
            float f = this.zza.zzc.zzo.zze;
            Activity activity0 = this.zza.zzb;
            if(!this.zza.zzc.zzo.zzd || f <= 0.0f || f > 25.0f) {
                bitmapDrawable0 = new BitmapDrawable(activity0.getResources(), bitmap0);
            }
            else {
                try {
                    Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, bitmap0.getWidth(), bitmap0.getHeight(), false);
                    Bitmap bitmap2 = Bitmap.createBitmap(bitmap1);
                    RenderScript renderScript0 = RenderScript.create(activity0);
                    ScriptIntrinsicBlur scriptIntrinsicBlur0 = ScriptIntrinsicBlur.create(renderScript0, Element.U8_4(renderScript0));
                    Allocation allocation0 = Allocation.createFromBitmap(renderScript0, bitmap1);
                    Allocation allocation1 = Allocation.createFromBitmap(renderScript0, bitmap2);
                    scriptIntrinsicBlur0.setRadius(f);
                    scriptIntrinsicBlur0.setInput(allocation0);
                    scriptIntrinsicBlur0.forEach(allocation1);
                    allocation1.copyTo(bitmap2);
                    bitmapDrawable0 = new BitmapDrawable(activity0.getResources(), bitmap2);
                }
                catch(RuntimeException unused_ex) {
                    bitmapDrawable0 = new BitmapDrawable(activity0.getResources(), bitmap0);
                }
            }
            zzj zzj0 = new zzj(this, bitmapDrawable0);
            zzs.zza.post(zzj0);
        }
    }
}

