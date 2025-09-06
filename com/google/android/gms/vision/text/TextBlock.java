package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzah;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class TextBlock implements Text {
    private zzah[] zza;
    private Point[] zzb;
    private List zzc;
    private String zzd;
    private Rect zze;

    TextBlock(SparseArray sparseArray0) {
        this.zza = new zzah[sparseArray0.size()];
        for(int v = 0; true; ++v) {
            zzah[] arr_zzah = this.zza;
            if(v >= arr_zzah.length) {
                break;
            }
            arr_zzah[v] = (zzah)sparseArray0.valueAt(v);
        }
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Rect getBoundingBox() {
        if(this.zze == null) {
            this.zze = zzc.zza(this);
        }
        return this.zze;
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public List getComponents() {
        if(this.zza.length == 0) {
            return new ArrayList(0);
        }
        if(this.zzc == null) {
            this.zzc = new ArrayList(this.zza.length);
            zzah[] arr_zzah = this.zza;
            for(int v = 0; v < arr_zzah.length; ++v) {
                this.zzc.add(new Line(arr_zzah[v]));
            }
        }
        return this.zzc;
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Point[] getCornerPoints() {
        zzah[] arr_zzah;
        if(this.zzb == null) {
            if(this.zza.length == 0) {
                this.zzb = new Point[0];
                return this.zzb;
            }
            int v = 0x80000000;
            int v1 = 0x80000000;
            int v2 = 0x7FFFFFFF;
            int v3 = 0x7FFFFFFF;
            for(int v4 = 0; true; ++v4) {
                arr_zzah = this.zza;
                if(v4 >= arr_zzah.length) {
                    break;
                }
                zzab zzab0 = arr_zzah[v4].zzb;
                int v5 = -arr_zzah[0].zzb.zza;
                int v6 = -arr_zzah[0].zzb.zzb;
                double f = Math.sin(Math.toRadians(arr_zzah[0].zzb.zze));
                double f1 = Math.cos(Math.toRadians(arr_zzah[0].zzb.zze));
                Point[] arr_point = new Point[4];
                Point point0 = new Point(zzab0.zza, zzab0.zzb);
                arr_point[0] = point0;
                point0.offset(v5, v6);
                int v7 = (int)(((double)arr_point[0].x) * f1 + ((double)arr_point[0].y) * f);
                int v8 = (int)(((double)(-arr_point[0].x)) * f + ((double)arr_point[0].y) * f1);
                arr_point[0].x = v7;
                arr_point[0].y = v8;
                arr_point[1] = new Point(zzab0.zzc + v7, v8);
                arr_point[2] = new Point(zzab0.zzc + v7, zzab0.zzd + v8);
                arr_point[3] = new Point(v7, v8 + zzab0.zzd);
                for(int v9 = 0; v9 < 4; ++v9) {
                    Point point1 = arr_point[v9];
                    v2 = Math.min(v2, point1.x);
                    v = Math.max(v, point1.x);
                    v3 = Math.min(v3, point1.y);
                    v1 = Math.max(v1, point1.y);
                }
            }
            int v10 = arr_zzah[0].zzb.zza;
            int v11 = arr_zzah[0].zzb.zzb;
            double f2 = Math.sin(Math.toRadians(arr_zzah[0].zzb.zze));
            double f3 = Math.cos(Math.toRadians(arr_zzah[0].zzb.zze));
            Point[] arr_point1 = {new Point(v2, v3), new Point(v, v3), new Point(v, v1), new Point(v2, v1)};
            for(int v12 = 0; v12 < 4; ++v12) {
                Point point2 = arr_point1[v12];
                int v13 = (int)(((double)point2.x) * f2 + ((double)point2.y) * f3);
                point2.x = (int)(((double)point2.x) * f3 - ((double)point2.y) * f2);
                point2.y = v13;
                point2.offset(v10, v11);
            }
            this.zzb = arr_point1;
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getLanguage() {
        String s = this.zzd;
        if(s != null) {
            return s;
        }
        HashMap hashMap0 = new HashMap();
        zzah[] arr_zzah = this.zza;
        for(int v = 0; v < arr_zzah.length; ++v) {
            zzah zzah0 = arr_zzah[v];
            int v1 = hashMap0.containsKey(zzah0.zzd) ? ((int)(((Integer)hashMap0.get(zzah0.zzd)))) : 0;
            hashMap0.put(zzah0.zzd, ((int)(v1 + 1)));
        }
        String s1 = (String)((Map.Entry)Collections.max(hashMap0.entrySet(), new zza(this))).getKey();
        this.zzd = s1;
        if(s1 == null || s1.isEmpty()) {
            this.zzd = "und";
        }
        return this.zzd;
    }

    @Override  // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getValue() {
        zzah[] arr_zzah = this.zza;
        if(arr_zzah.length == 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_zzah[0].zzc);
        for(int v = 1; v < this.zza.length; ++v) {
            stringBuilder0.append("\n");
            stringBuilder0.append(this.zza[v].zzc);
        }
        return stringBuilder0.toString();
    }
}

