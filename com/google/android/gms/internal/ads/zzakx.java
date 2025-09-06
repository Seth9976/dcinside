package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zzakx {
    public final int zza;
    @Nullable
    public final PointF zzb;
    private static final Pattern zzc;
    private static final Pattern zzd;
    private static final Pattern zze;
    private static final Pattern zzf;

    static {
        zzakx.zzc = Pattern.compile("\\{([^}]*)\\}");
        zzakx.zzd = Pattern.compile("\\\\pos\\((\\s*\\d+(?:\\.\\d+)?\\s*),(\\s*\\d+(?:\\.\\d+)?\\s*)\\)");
        zzakx.zze = Pattern.compile("\\\\move\\(\\s*\\d+(?:\\.\\d+)?\\s*,\\s*\\d+(?:\\.\\d+)?\\s*,(\\s*\\d+(?:\\.\\d+)?\\s*),(\\s*\\d+(?:\\.\\d+)?\\s*)(?:,\\s*\\d+(?:\\.\\d+)?\\s*,\\s*\\d+(?:\\.\\d+)?\\s*)?\\)");
        zzakx.zzf = Pattern.compile("\\\\an(\\d+)");
    }

    private zzakx(int v, @Nullable PointF pointF0) {
        this.zza = v;
        this.zzb = pointF0;
    }

    public static zzakx zza(String s) {
        int v1;
        PointF pointF1;
        String s3;
        String s2;
        Matcher matcher0 = zzakx.zzc.matcher(s);
        PointF pointF0 = null;
        int v = -1;
        while(matcher0.find()) {
            String s1 = matcher0.group(1);
            s1.getClass();
            try {
                Matcher matcher1 = zzakx.zzd.matcher(s1);
                Matcher matcher2 = zzakx.zze.matcher(s1);
                boolean z = matcher1.find();
                boolean z1 = matcher2.find();
                if(z) {
                    if(z1) {
                        zzdo.zze("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override=\'" + s1 + "\'");
                    }
                    s2 = matcher1.group(1);
                    s3 = matcher1.group(2);
                    goto label_19;
                }
                else if(z1) {
                    s2 = matcher2.group(1);
                    s3 = matcher2.group(2);
                label_19:
                    if(s2 == null) {
                        throw null;
                    }
                    float f = Float.parseFloat(s2.trim());
                    if(s3 == null) {
                        throw null;
                    }
                    pointF1 = new PointF(f, Float.parseFloat(s3.trim()));
                }
                else {
                    pointF1 = null;
                }
                if(pointF1 != null) {
                    pointF0 = pointF1;
                }
            }
            catch(RuntimeException unused_ex) {
            }
            try {
                Matcher matcher3 = zzakx.zzf.matcher(s1);
                if(matcher3.find()) {
                    String s4 = matcher3.group(1);
                    if(s4 == null) {
                        throw null;
                    }
                    v1 = zzaky.zzd(s4);
                    goto label_38;
                }
            }
            catch(RuntimeException unused_ex) {
                continue;
            }
            v1 = -1;
        label_38:
            if(v1 != -1) {
                v = v1;
            }
        }
        return new zzakx(v, pointF0);
    }

    public static String zzb(String s) {
        return zzakx.zzc.matcher(s).replaceAll("");
    }
}

