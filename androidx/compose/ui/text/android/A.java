package androidx.compose.ui.text.android;

import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;

public final class a {
    public static BoringLayout a(CharSequence charSequence0, TextPaint textPaint0, int v, Layout.Alignment layout$Alignment0, float f, float f1, BoringLayout.Metrics boringLayout$Metrics0, boolean z, TextUtils.TruncateAt textUtils$TruncateAt0, int v1, boolean z1) {
        return new BoringLayout(charSequence0, textPaint0, v, layout$Alignment0, f, f1, boringLayout$Metrics0, z, textUtils$TruncateAt0, v1, z1);
    }
}

