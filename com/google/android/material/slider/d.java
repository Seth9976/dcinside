package com.google.android.material.slider;

import androidx.annotation.NonNull;
import java.util.Locale;

public final class d implements e {
    private static final long e = 1000000000000L;
    private static final int f = 1000000000;
    private static final int g = 1000000;
    private static final int h = 1000;

    @Override  // com.google.android.material.slider.e
    @NonNull
    public String a(float f) {
        if(f >= 999999995904.0f) {
            return String.format(Locale.US, "%.1fT", ((float)(f / 999999995904.0f)));
        }
        if(f >= 1000000000.0f) {
            return String.format(Locale.US, "%.1fB", ((float)(f / 1000000000.0f)));
        }
        if(f >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", ((float)(f / 1000000.0f)));
        }
        return f >= 1000.0f ? String.format(Locale.US, "%.1fK", ((float)(f / 1000.0f))) : String.format(Locale.US, "%.0f", f);
    }
}

