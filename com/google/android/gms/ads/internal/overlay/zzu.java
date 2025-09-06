package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.impl.R.drawable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;

public final class zzu extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzag zzb;

    public zzu(Context context0, zzt zzt0, @Nullable zzag zzag0) {
        super(context0);
        this.zzb = zzag0;
        this.setOnClickListener(this);
        ImageButton imageButton0 = new ImageButton(context0);
        this.zza = imageButton0;
        this.zzc();
        imageButton0.setBackgroundColor(0);
        imageButton0.setOnClickListener(this);
        imageButton0.setPadding(zzf.zzx(context0, zzt0.zza), zzf.zzx(context0, 0), zzf.zzx(context0, zzt0.zzb), zzf.zzx(context0, zzt0.zzc));
        imageButton0.setContentDescription("Interstitial close button");
        this.addView(imageButton0, new FrameLayout.LayoutParams(zzf.zzx(context0, zzt0.zzd + zzt0.zza + zzt0.zzb), zzf.zzx(context0, zzt0.zzd + zzt0.zzc), 17));
        long v = (long)(((Long)zzbe.zzc().zza(zzbcl.zzbl)));
        if(v <= 0L) {
            return;
        }
        zzs zzs0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzbm)).booleanValue() ? new zzs(this) : null;
        imageButton0.setAlpha(0.0f);
        imageButton0.animate().alpha(1.0f).setDuration(v).setListener(zzs0);
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        zzag zzag0 = this.zzb;
        if(zzag0 != null) {
            zzag0.zzj();
        }
    }

    public final void zzb(boolean z) {
        if(z) {
            this.zza.setVisibility(8);
            if(((long)(((Long)zzbe.zzc().zza(zzbcl.zzbl)))) > 0L) {
                this.zza.animate().cancel();
                this.zza.clearAnimation();
            }
            return;
        }
        this.zza.setVisibility(0);
    }

    private final void zzc() {
        String s = (String)zzbe.zzc().zza(zzbcl.zzbk);
        if(!TextUtils.isEmpty(s) && !"default".equals(s)) {
            Drawable drawable0 = null;
            Resources resources0 = zzv.zzp().zze();
            if(resources0 != null) {
                try {
                    if("white".equals(s)) {
                        drawable0 = resources0.getDrawable(drawable.admob_close_button_white_circle_black_cross);
                    }
                    else if("black".equals(s)) {
                        drawable0 = resources0.getDrawable(drawable.admob_close_button_black_circle_white_cross);
                    }
                }
                catch(Resources.NotFoundException unused_ex) {
                    zzo.zze("Close button resource not found, falling back to default.");
                }
                if(drawable0 == null) {
                    this.zza.setImageResource(0x1080017);
                    return;
                }
                this.zza.setImageDrawable(drawable0);
                this.zza.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            this.zza.setImageResource(0x1080017);
            return;
        }
        this.zza.setImageResource(0x1080017);
    }
}

