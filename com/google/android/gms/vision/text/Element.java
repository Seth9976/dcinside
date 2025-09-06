package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.zzao;
import java.util.ArrayList;
import java.util.List;

public class Element implements Text {
    private zzao zza;

    Element(zzao zzao0) {
        this.zza = zzao0;
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Rect getBoundingBox() {
        return zzc.zza(this);
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public List getComponents() {
        return new ArrayList();
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Point[] getCornerPoints() {
        return zzc.zza(this.zza.zza);
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getLanguage() {
        return this.zza.zzc;
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getValue() {
        return this.zza.zzb;
    }
}

