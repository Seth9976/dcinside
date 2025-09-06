package H0;

import android.text.Layout;
import androidx.annotation.Nullable;

public class a {
    public static int a(Layout layout0) {
        if(layout0 != null && layout0.getLineCount() != 0) {
            int v1 = 0x7FFFFFFF;
            for(int v = 0; v < layout0.getLineCount(); ++v) {
                v1 = Math.min(v1, ((int)layout0.getLineLeft(v)));
            }
            return v1;
        }
        return 0;
    }

    public static int b(@Nullable Layout layout0) {
        return layout0 == null ? 0 : layout0.getHeight();
    }

    public static int c(Layout layout0) {
        if(layout0 == null) {
            return 0;
        }
        int v1 = layout0.getLineCount();
        int v2 = 0;
        for(int v = 0; v < v1; ++v) {
            v2 = Math.max(v2, ((int)layout0.getLineRight(v)));
        }
        return v2;
    }
}

