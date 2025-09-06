package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class PathUtils {
    @RequiresApi(26)
    static class Api26Impl {
        static float[] a(Path path0, float f) {
            return path0.approximate(f);
        }
    }

    @RequiresApi(26)
    public static Collection a(Path path0) {
        return PathUtils.b(path0, 0.5f);
    }

    @RequiresApi(26)
    public static Collection b(Path path0, @FloatRange(from = 0.0) float f) {
        float[] arr_f = Api26Impl.a(path0, f);
        int v = arr_f.length / 3;
        Collection collection0 = new ArrayList(v);
        for(int v1 = 1; v1 < v; ++v1) {
            int v2 = (v1 - 1) * 3;
            float f1 = arr_f[v1 * 3];
            float f2 = arr_f[v1 * 3 + 1];
            float f3 = arr_f[v1 * 3 + 2];
            float f4 = arr_f[v2];
            float f5 = arr_f[v2 + 1];
            float f6 = arr_f[v2 + 2];
            if(f1 != f4 && (f2 != f5 || f3 != f6)) {
                ((List)collection0).add(new PathSegment(new PointF(f5, f6), f4, new PointF(f2, f3), f1));
            }
        }
        return collection0;
    }
}

