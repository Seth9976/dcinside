package com.google.android.gms.vision.face;

import android.graphics.PointF;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Arrays;
import java.util.List;

public class Face {
    public static final float UNCOMPUTED_PROBABILITY = -1.0f;
    private int zza;
    private PointF zzb;
    private float zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private List zzh;
    private final List zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private final float zzm;

    public Face(int v, @RecentlyNonNull PointF pointF0, float f, float f1, float f2, float f3, float f4, @RecentlyNonNull Landmark[] arr_landmark, @RecentlyNonNull Contour[] arr_contour, float f5, float f6, float f7, float f8) {
        this.zza = v;
        this.zzb = pointF0;
        this.zzc = f;
        this.zzd = f1;
        this.zze = f2;
        this.zzf = f3;
        this.zzg = f4;
        this.zzh = Arrays.asList(arr_landmark);
        this.zzi = Arrays.asList(arr_contour);
        this.zzj = Face.zza(f5);
        this.zzk = Face.zza(f6);
        this.zzl = Face.zza(f7);
        this.zzm = Face.zza(f8);
    }

    @RecentlyNonNull
    public List getContours() {
        return this.zzi;
    }

    @KeepForSdk
    @ShowFirstParty
    public float getEulerX() {
        return this.zzg;
    }

    public float getEulerY() {
        return this.zze;
    }

    public float getEulerZ() {
        return this.zzf;
    }

    public float getHeight() {
        return this.zzd;
    }

    public int getId() {
        return this.zza;
    }

    public float getIsLeftEyeOpenProbability() {
        return this.zzj;
    }

    public float getIsRightEyeOpenProbability() {
        return this.zzk;
    }

    public float getIsSmilingProbability() {
        return this.zzl;
    }

    @RecentlyNonNull
    public List getLandmarks() {
        return this.zzh;
    }

    @RecentlyNonNull
    public PointF getPosition() {
        return new PointF(this.zzb.x - this.zzc / 2.0f, this.zzb.y - this.zzd / 2.0f);
    }

    public float getWidth() {
        return this.zzc;
    }

    private static float zza(float f) {
        return f < 0.0f || f > 1.0f ? -1.0f : f;
    }
}

