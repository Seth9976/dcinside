package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;

public class BlendModeColorFilterCompat {
    @RequiresApi(29)
    static class Api29Impl {
        static ColorFilter a(int v, Object object0) {
            return new BlendModeColorFilter(v, ((BlendMode)object0));
        }
    }

    public static ColorFilter a(int v, BlendModeCompat blendModeCompat0) {
        if(Build.VERSION.SDK_INT >= 29) {
            Object object0 = androidx.core.graphics.BlendModeUtils.Api29Impl.a(blendModeCompat0);
            return object0 == null ? null : Api29Impl.a(v, object0);
        }
        PorterDuff.Mode porterDuff$Mode0 = BlendModeUtils.a(blendModeCompat0);
        return porterDuff$Mode0 != null ? new PorterDuffColorFilter(v, porterDuff$Mode0) : null;
    }
}

