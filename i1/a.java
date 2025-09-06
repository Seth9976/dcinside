package I1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.R.attr;

public class a {
    private static final int[] a;
    private static final int[] b;

    static {
        a.a = new int[]{0x1010000, attr.theme};
        a.b = new int[]{attr.materialThemeOverlay};
    }

    @StyleRes
    private static int a(@NonNull Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.a);
        int v = typedArray0.getResourceId(0, 0);
        int v1 = typedArray0.getResourceId(1, 0);
        typedArray0.recycle();
        return v == 0 ? v1 : v;
    }

    @StyleRes
    private static int b(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.b, v, v1);
        int v2 = typedArray0.getResourceId(0, 0);
        typedArray0.recycle();
        return v2;
    }

    @NonNull
    public static Context c(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        int v2 = a.b(context0, attributeSet0, v, v1);
        if(v2 != 0 && (!(context0 instanceof ContextThemeWrapper) || ((ContextThemeWrapper)context0).c() != v2)) {
            Context context1 = new ContextThemeWrapper(context0, v2);
            int v3 = a.a(context0, attributeSet0);
            if(v3 != 0) {
                context1.getTheme().applyStyle(v3, true);
            }
            return context1;
        }
        return context0;
    }
}

