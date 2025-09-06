package androidx.navigation;

import androidx.core.app.ActivityOptionsCompat;
import y4.l;
import y4.m;

public final class ActivityNavigatorExtrasKt {
    @l
    public static final Extras a(@m ActivityOptionsCompat activityOptionsCompat0, int v) {
        Builder activityNavigator$Extras$Builder0 = new Builder();
        if(activityOptionsCompat0 != null) {
            activityNavigator$Extras$Builder0.c(activityOptionsCompat0);
        }
        activityNavigator$Extras$Builder0.a(v);
        return activityNavigator$Extras$Builder0.b();
    }

    public static Extras b(ActivityOptionsCompat activityOptionsCompat0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            activityOptionsCompat0 = null;
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        return ActivityNavigatorExtrasKt.a(activityOptionsCompat0, v);
    }
}

