package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

public interface EngagementSignalsCallback {
    void onGreatestScrollPercentageIncreased(@IntRange(from = 1L, to = 100L) int arg1, @NonNull Bundle arg2);

    void onSessionEnded(boolean arg1, @NonNull Bundle arg2);

    void onVerticalScrollEvent(boolean arg1, @NonNull Bundle arg2);
}

