package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzao;
import java.util.ArrayList;
import java.util.List;

public class Line implements Text {
    private zzah zza;
    private List zzb;

    Line(zzah zzah0) {
        this.zza = zzah0;
    }

    public float getAngle() {
        return this.zza.zzb.zze;
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Rect getBoundingBox() {
        return zzc.zza(this);
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public List getComponents() {
        if(this.zza.zza.length == 0) {
            return new ArrayList(0);
        }
        if(this.zzb == null) {
            this.zzb = new ArrayList(this.zza.zza.length);
            zzao[] arr_zzao = this.zza.zza;
            for(int v = 0; v < arr_zzao.length; ++v) {
                this.zzb.add(new Element(arr_zzao[v]));
            }
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Point[] getCornerPoints() {
        return zzc.zza(this.zza.zzb);
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getLanguage() {
        return this.zza.zzd;
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getValue() {
        return this.zza.zzc;
    }

    public boolean isVertical() {
        return this.zza.zze;
    }
}

