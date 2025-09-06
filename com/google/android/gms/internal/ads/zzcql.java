package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.zzf;
import org.json.JSONObject;

public final class zzcql extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private final Context zza;
    private View zzb;

    private zzcql(Context context0) {
        super(context0);
        this.zza = context0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] arr_v = new int[2];
        this.getLocationInWindow(arr_v);
        this.zzb.setY(((float)(-arr_v[1])));
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        int[] arr_v = new int[2];
        this.getLocationInWindow(arr_v);
        this.zzb.setY(((float)(-arr_v[1])));
    }

    public static zzcql zza(Context context0, View view0, zzfbo zzfbo0) {
        zzcql zzcql0 = new zzcql(context0);
        if(!zzfbo0.zzu.isEmpty()) {
            Resources resources0 = zzcql0.zza.getResources();
            if(resources0 != null) {
                DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
                if(displayMetrics0 != null) {
                    zzfbp zzfbp0 = (zzfbp)zzfbo0.zzu.get(0);
                    zzcql0.setLayoutParams(new FrameLayout.LayoutParams(((int)(((float)zzfbp0.zza) * displayMetrics0.density)), ((int)(((float)zzfbp0.zzb) * displayMetrics0.density))));
                }
            }
        }
        zzcql0.zzb = view0;
        zzcql0.addView(view0);
        zzcaj.zzb(zzcql0, zzcql0);
        zzcaj.zza(zzcql0, zzcql0);
        JSONObject jSONObject0 = zzfbo0.zzah;
        RelativeLayout relativeLayout0 = new RelativeLayout(zzcql0.zza);
        JSONObject jSONObject1 = jSONObject0.optJSONObject("header");
        if(jSONObject1 != null) {
            zzcql0.zzc(jSONObject1, relativeLayout0, 10);
        }
        JSONObject jSONObject2 = jSONObject0.optJSONObject("footer");
        if(jSONObject2 != null) {
            zzcql0.zzc(jSONObject2, relativeLayout0, 12);
        }
        zzcql0.addView(relativeLayout0);
        return zzcql0;
    }

    private final int zzb(double f) {
        return zzf.zzx(this.zza, ((int)f));
    }

    private final void zzc(JSONObject jSONObject0, RelativeLayout relativeLayout0, int v) {
        TextView textView0 = new TextView(this.zza);
        textView0.setTextColor(-1);
        textView0.setBackgroundColor(0xFF000000);
        textView0.setGravity(17);
        textView0.setText(jSONObject0.optString("text", ""));
        textView0.setTextSize(((float)jSONObject0.optDouble("text_size", 11.0)));
        int v1 = this.zzb(jSONObject0.optDouble("padding", 0.0));
        textView0.setPadding(0, v1, 0, v1);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, this.zzb(jSONObject0.optDouble("height", 15.0)));
        relativeLayout$LayoutParams0.addRule(v);
        relativeLayout0.addView(textView0, relativeLayout$LayoutParams0);
    }
}

