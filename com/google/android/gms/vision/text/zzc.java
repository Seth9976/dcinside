package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzab;

final class zzc {
    static Rect zza(Text text0) {
        Point[] arr_point = text0.getCornerPoints();
        int v = 0x7FFFFFFF;
        int v1 = 0x7FFFFFFF;
        int v2 = 0x80000000;
        int v3 = 0x80000000;
        for(int v4 = 0; v4 < arr_point.length; ++v4) {
            Point point0 = arr_point[v4];
            v = Math.min(v, point0.x);
            v2 = Math.max(v2, point0.x);
            v1 = Math.min(v1, point0.y);
            v3 = Math.max(v3, point0.y);
        }
        return new Rect(v, v1, v2, v3);
    }

    static Point[] zza(zzab zzab0) {
        Point[] arr_point = new Point[4];
        double f = Math.sin(Math.toRadians(zzab0.zze));
        double f1 = Math.cos(Math.toRadians(zzab0.zze));
        arr_point[0] = new Point(zzab0.zza, zzab0.zzb);
        arr_point[1] = new Point(((int)(((double)zzab0.zza) + ((double)zzab0.zzc) * f1)), ((int)(((double)zzab0.zzb) + ((double)zzab0.zzc) * f)));
        arr_point[2] = new Point(((int)(((double)arr_point[1].x) - ((double)zzab0.zzd) * f)), ((int)(((double)arr_point[1].y) + ((double)zzab0.zzd) * f1)));
        Point point0 = arr_point[2];
        arr_point[3] = new Point(arr_point[0].x + (point0.x - arr_point[1].x), arr_point[0].y + (point0.y - arr_point[1].y));
        return arr_point;
    }
}

