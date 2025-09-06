package androidx.core.widget;

import android.os.Build.VERSION;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.c})
public interface AutoSizeableTextView {
    @RestrictTo({Scope.c})
    @Deprecated
    public static final boolean v0;

    static {
        AutoSizeableTextView.v0 = Build.VERSION.SDK_INT >= 27;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int arg1, int arg2, int arg3, int arg4) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] arg1, int arg2) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int arg1);
}

