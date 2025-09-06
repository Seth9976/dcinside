package androidx.core.view;

import android.os.Build.VERSION;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class HapticFeedbackConstantsCompat {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HapticFeedbackFlags {
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HapticFeedbackType {
    }

    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 6;
    public static final int g = 3;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 12;
    public static final int l = 13;
    public static final int m = 16;
    public static final int n = 17;
    public static final int o = 21;
    public static final int p = 22;
    public static final int q = 23;
    public static final int r = 24;
    public static final int s = 25;
    public static final int t = 26;
    public static final int u = 27;
    @VisibleForTesting
    static final int v = 0;
    @VisibleForTesting
    static final int w = 27;
    public static final int x = 1;

    static int a(int v) {
        int v1 = -1;
        if(v == -1) {
            return -1;
        }
        int v2 = Build.VERSION.SDK_INT;
        int v3 = 0;
        if(v2 < 34) {
            switch(v) {
                case 25: {
                    v = 0;
                    break;
                }
                case 21: 
                case 23: 
                case 26: {
                    v = 6;
                    break;
                }
                case 22: 
                case 24: 
                case 27: {
                    v = 4;
                }
            }
        }
        if(v2 < 30) {
            switch(v) {
                case 13: {
                    v3 = 6;
                    break;
                }
                case 12: 
                case 16: {
                    v3 = 1;
                    break;
                }
                case 17: {
                    break;
                }
                default: {
                    v3 = v;
                }
            }
        }
        else {
            v3 = v;
        }
        if(v2 >= 27 || v3 != 7 && v3 != 8 && v3 != 9) {
            v1 = v3;
        }
        return v2 < 23 && v1 == 6 ? 4 : v1;
    }
}

