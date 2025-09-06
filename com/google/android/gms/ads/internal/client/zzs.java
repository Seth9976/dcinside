package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "AdSizeParcelCreator")
@Reserved({1})
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final String zza;
    @Field(id = 3)
    public final int zzb;
    @Field(id = 4)
    public final int zzc;
    @Field(id = 5)
    public final boolean zzd;
    @Field(id = 6)
    public final int zze;
    @Field(id = 7)
    public final int zzf;
    @Field(id = 8)
    public final zzs[] zzg;
    @Field(id = 9)
    public final boolean zzh;
    @Field(id = 10)
    public final boolean zzi;
    @Field(id = 11)
    public boolean zzj;
    @Field(id = 12)
    public boolean zzk;
    @Field(id = 13)
    public boolean zzl;
    @Field(id = 14)
    public boolean zzm;
    @Field(id = 15)
    public boolean zzn;
    @Field(id = 16)
    public boolean zzo;

    static {
        zzs.CREATOR = new zzt();
    }

    public zzs() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zzs(Context context0, AdSize adSize0) {
        this(context0, new AdSize[]{adSize0});
    }

    public zzs(Context context0, AdSize[] arr_adSize) {
        int v6;
        int v5;
        int v;
        AdSize adSize0 = arr_adSize[0];
        this.zzd = false;
        boolean z = adSize0.isFluid();
        this.zzi = z;
        this.zzm = zzc.zzf(adSize0);
        this.zzn = zzc.zzg(adSize0);
        boolean z1 = zzc.zzh(adSize0);
        this.zzo = z1;
        if(z) {
            this.zze = AdSize.BANNER.getWidth();
            v = AdSize.BANNER.getHeight();
        }
        else if(this.zzn) {
            this.zze = adSize0.getWidth();
            v = zzc.zza(adSize0);
        }
        else if(z1) {
            this.zze = adSize0.getWidth();
            v = zzc.zzb(adSize0);
        }
        else {
            this.zze = adSize0.getWidth();
            v = adSize0.getHeight();
        }
        this.zzb = v;
        boolean z2 = this.zze == -1;
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        if(z2) {
            if(context0.getResources().getConfiguration().orientation == 2) {
                DisplayMetrics displayMetrics1 = context0.getResources().getDisplayMetrics();
                if(((int)(((float)displayMetrics1.heightPixels) / displayMetrics1.density)) < 600) {
                    DisplayMetrics displayMetrics2 = context0.getResources().getDisplayMetrics();
                    WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
                    if(windowManager0 == null) {
                        v5 = displayMetrics0.widthPixels;
                    }
                    else {
                        Display display0 = windowManager0.getDefaultDisplay();
                        display0.getRealMetrics(displayMetrics2);
                        int v1 = displayMetrics2.heightPixels;
                        int v2 = displayMetrics2.widthPixels;
                        display0.getMetrics(displayMetrics2);
                        if(displayMetrics2.heightPixels != v1 || displayMetrics2.widthPixels != v2) {
                            v5 = displayMetrics0.widthPixels;
                        }
                        else {
                            int v3 = displayMetrics0.widthPixels;
                            int v4 = context0.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            v5 = v3 - (v4 <= 0 ? 0 : context0.getResources().getDimensionPixelSize(v4));
                        }
                    }
                }
                else {
                    v5 = displayMetrics0.widthPixels;
                }
            }
            else {
                v5 = displayMetrics0.widthPixels;
            }
            this.zzf = v5;
            double f = (double)(((float)v5) / displayMetrics0.density);
            v6 = (int)f;
            if(f - ((double)v6) >= 0.01) {
                ++v6;
            }
        }
        else {
            v6 = this.zze;
            this.zzf = zzf.zzp(displayMetrics0, this.zze);
        }
        int v7 = v == -2 ? this.zzb : zzs.zze(displayMetrics0);
        this.zzc = zzf.zzp(displayMetrics0, v7);
        if(z2 || v == -2) {
            this.zza = v6 + "x" + v7 + "_as";
        }
        else if(this.zzn || this.zzo) {
            this.zza = this.zze + "x" + this.zzb + "_as";
        }
        else if(z) {
            this.zza = "320x50_mb";
        }
        else {
            this.zza = adSize0.toString();
        }
        if(arr_adSize.length > 1) {
            this.zzg = new zzs[arr_adSize.length];
            for(int v8 = 0; v8 < arr_adSize.length; ++v8) {
                this.zzg[v8] = new zzs(context0, arr_adSize[v8]);
            }
        }
        else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    @Constructor
    zzs(@Param(id = 2) String s, @Param(id = 3) int v, @Param(id = 4) int v1, @Param(id = 5) boolean z, @Param(id = 6) int v2, @Param(id = 7) int v3, @Param(id = 8) zzs[] arr_zzs, @Param(id = 9) boolean z1, @Param(id = 10) boolean z2, @Param(id = 11) boolean z3, @Param(id = 12) boolean z4, @Param(id = 13) boolean z5, @Param(id = 14) boolean z6, @Param(id = 15) boolean z7, @Param(id = 16) boolean z8) {
        this.zza = s;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = z;
        this.zze = v2;
        this.zzf = v3;
        this.zzg = arr_zzs;
        this.zzh = z1;
        this.zzi = z2;
        this.zzj = z3;
        this.zzk = z4;
        this.zzl = z5;
        this.zzm = z6;
        this.zzn = z7;
        this.zzo = z8;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel0, 6, this.zze);
        SafeParcelWriter.writeInt(parcel0, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel0, 8, this.zzg, v, false);
        SafeParcelWriter.writeBoolean(parcel0, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel0, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel0, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel0, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel0, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel0, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel0, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel0, 16, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static int zza(DisplayMetrics displayMetrics0) {
        return (int)(((float)zzs.zze(displayMetrics0)) * displayMetrics0.density);
    }

    public static zzs zzb() {
        return new zzs("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzs zzc() {
        return new zzs("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzs zzd() {
        return new zzs("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    private static int zze(DisplayMetrics displayMetrics0) {
        int v = (int)(((float)displayMetrics0.heightPixels) / displayMetrics0.density);
        if(v <= 400) {
            return 0x20;
        }
        return v > 720 ? 90 : 50;
    }
}

