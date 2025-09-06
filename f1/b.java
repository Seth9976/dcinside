package F1;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.color.v;

public enum b {
    SURFACE_0(dimen.m3_sys_elevation_level0),
    SURFACE_1(dimen.m3_sys_elevation_level1),
    SURFACE_2(dimen.m3_sys_elevation_level2),
    SURFACE_3(dimen.m3_sys_elevation_level3),
    SURFACE_4(dimen.m3_sys_elevation_level4),
    SURFACE_5(dimen.m3_sys_elevation_level5);

    private final int a;

    private b(@DimenRes int v1) {
        this.a = v1;
    }

    @ColorInt
    public int a(@NonNull Context context0) {
        return b.b(context0, context0.getResources().getDimension(this.a));
    }

    @ColorInt
    public static int b(@NonNull Context context0, @Dimension float f) {
        return new a(context0).c(v.b(context0, attr.colorSurface, 0), f);
    }
}

