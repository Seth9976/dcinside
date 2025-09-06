package androidx.compose.ui.text.android;

import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(33)
class BoringLayoutConstructor33 {
    @NonNull
    public static BoringLayout a(@NonNull CharSequence charSequence0, @NonNull TextPaint textPaint0, @IntRange(from = 0L) int v, @NonNull Layout.Alignment layout$Alignment0, float f, float f1, @NonNull BoringLayout.Metrics boringLayout$Metrics0, boolean z, @Nullable TextUtils.TruncateAt textUtils$TruncateAt0, @IntRange(from = 0L) int v1, boolean z1) {
        return a.a(charSequence0, textPaint0, v, layout$Alignment0, f, f1, boringLayout$Metrics0, z, textUtils$TruncateAt0, v1, z1);
    }
}

