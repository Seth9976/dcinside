package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CustomTabsCallback {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivityLayoutState {
    }

    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET = 1;
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET_MAXIMIZED = 2;
    public static final int ACTIVITY_LAYOUT_STATE_FULL_SCREEN = 5;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET = 3;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET_MAXIMIZED = 4;
    public static final int ACTIVITY_LAYOUT_STATE_UNKNOWN = 0;
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;
    @RestrictTo({Scope.a})
    public static final String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;

    public void extraCallback(@NonNull String s, @Nullable Bundle bundle0) {
    }

    @Nullable
    public Bundle extraCallbackWithResult(@NonNull String s, @Nullable Bundle bundle0) {
        return null;
    }

    public void onActivityLayout(@Dimension(unit = 1) int v, @Dimension(unit = 1) int v1, @Dimension(unit = 1) int v2, @Dimension(unit = 1) int v3, int v4, @NonNull Bundle bundle0) {
    }

    public void onActivityResized(@Dimension(unit = 1) int v, @Dimension(unit = 1) int v1, @NonNull Bundle bundle0) {
    }

    public void onMessageChannelReady(@Nullable Bundle bundle0) {
    }

    @ExperimentalMinimizationCallback
    public void onMinimized(@NonNull Bundle bundle0) {
    }

    public void onNavigationEvent(int v, @Nullable Bundle bundle0) {
    }

    public void onPostMessage(@NonNull String s, @Nullable Bundle bundle0) {
    }

    public void onRelationshipValidationResult(int v, @NonNull Uri uri0, boolean z, @Nullable Bundle bundle0) {
    }

    @ExperimentalMinimizationCallback
    public void onUnminimized(@NonNull Bundle bundle0) {
    }

    public void onWarmupCompleted(@NonNull Bundle bundle0) {
    }
}

