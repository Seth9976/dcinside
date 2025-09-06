package androidx.appcompat.widget;

import android.graphics.Rect;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.c})
public interface FitWindowsViewGroup {
    public interface OnFitSystemWindowsListener {
        void a(Rect arg1);
    }

    void setOnFitSystemWindowsListener(OnFitSystemWindowsListener arg1);
}

