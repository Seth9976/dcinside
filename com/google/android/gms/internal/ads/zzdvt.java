package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;

public final class zzdvt {
    public static final void zza(Context context0, ViewGroup viewGroup0, AdView adView0) {
        LinearLayout linearLayout0 = new LinearLayout(context0);
        linearLayout0.setTag("layout");
        zzdvt.zzf(linearLayout0, -1, -1);
        linearLayout0.setGravity(17);
        linearLayout0.addView(adView0);
        adView0.setTag("ad_view");
        viewGroup0.addView(linearLayout0);
    }

    public static final void zzb(Context context0, ViewGroup viewGroup0, NativeAd nativeAd0) {
        NativeAdView nativeAdView0 = new NativeAdView(context0);
        nativeAdView0.setTag("ad_view_tag");
        zzdvt.zzf(nativeAdView0, -1, -1);
        viewGroup0.addView(nativeAdView0);
        LinearLayout linearLayout0 = new LinearLayout(context0);
        linearLayout0.setTag("layout_tag");
        linearLayout0.setOrientation(1);
        zzdvt.zzf(linearLayout0, -1, -1);
        linearLayout0.setBackgroundColor(-1);
        nativeAdView0.addView(linearLayout0);
        Resources resources0 = zzv.zzp().zze();
        linearLayout0.addView(zzdvt.zzc(context0, (resources0 == null ? "Headline" : resources0.getString(string.native_headline)), "headline_header_tag"));
        TextView textView0 = zzdvt.zzd(context0, zzfve.zzc(nativeAd0.getHeadline()), "headline_tag");
        nativeAdView0.setHeadlineView(textView0);
        linearLayout0.addView(textView0);
        linearLayout0.addView(zzdvt.zzc(context0, (resources0 == null ? "Body" : resources0.getString(string.native_body)), "body_header_tag"));
        TextView textView1 = zzdvt.zzd(context0, zzfve.zzc(nativeAd0.getBody()), "body_tag");
        nativeAdView0.setBodyView(textView1);
        linearLayout0.addView(textView1);
        linearLayout0.addView(zzdvt.zzc(context0, (resources0 == null ? "Media View" : resources0.getString(string.native_media_view)), "media_view_header_tag"));
        MediaView mediaView0 = new MediaView(context0);
        mediaView0.setTag("media_view_tag");
        nativeAdView0.setMediaView(mediaView0);
        linearLayout0.addView(mediaView0);
        nativeAdView0.setNativeAd(nativeAd0);
    }

    private static TextView zzc(Context context0, String s, String s1) {
        return zzdvt.zze(context0, s, 0x1030046, -9210245, 0.0f, s1);
    }

    private static TextView zzd(Context context0, String s, String s1) {
        return zzdvt.zze(context0, s, 0x1030044, 0xFF000000, 12.0f, s1);
    }

    private static TextView zze(Context context0, String s, int v, int v1, float f, String s1) {
        TextView textView0 = new TextView(context0);
        textView0.setTag(s1);
        zzdvt.zzf(textView0, -2, -2);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = textView0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            viewGroup$LayoutParams0 = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = new ViewGroup.MarginLayoutParams(viewGroup$LayoutParams0);
        viewGroup$MarginLayoutParams0.bottomMargin = (int)TypedValue.applyDimension(1, f, textView0.getResources().getDisplayMetrics());
        textView0.setLayoutParams(viewGroup$MarginLayoutParams0);
        textView0.setTextAppearance(context0, v);
        textView0.setTextColor(v1);
        textView0.setText(s);
        return textView0;
    }

    private static void zzf(View view0, int v, int v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            viewGroup$LayoutParams0 = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(viewGroup$LayoutParams0);
        linearLayout$LayoutParams0.height = v;
        linearLayout$LayoutParams0.width = v1;
        view0.setLayoutParams(linearLayout$LayoutParams0);
    }
}

