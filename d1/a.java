package D1;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public class a {
    public interface D1.a.a {
        void a(@NonNull Canvas arg1);
    }

    public static int a(@NonNull Canvas canvas0, float f, float f1, float f2, float f3, int v) {
        return Build.VERSION.SDK_INT <= 21 ? canvas0.saveLayerAlpha(f, f1, f2, f3, v, 0x1F) : canvas0.saveLayerAlpha(f, f1, f2, f3, v);
    }

    public static int b(@NonNull Canvas canvas0, @Nullable RectF rectF0, int v) {
        return Build.VERSION.SDK_INT <= 21 ? canvas0.saveLayerAlpha(rectF0, v, 0x1F) : canvas0.saveLayerAlpha(rectF0, v);
    }
}

