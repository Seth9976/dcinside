package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ActivityOptionsCompat {
    static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {
        private final ActivityOptions c;

        ActivityOptionsCompatImpl(ActivityOptions activityOptions0) {
            this.c = activityOptions0;
        }

        @Override  // androidx.core.app.ActivityOptionsCompat
        public Rect a() {
            return Build.VERSION.SDK_INT >= 24 ? this.c.getLaunchBounds() : null;
        }

        @Override  // androidx.core.app.ActivityOptionsCompat
        public int b() {
            return Build.VERSION.SDK_INT < 26 ? -1 : this.c.getLaunchDisplayId();
        }

        @Override  // androidx.core.app.ActivityOptionsCompat
        public void k(PendingIntent pendingIntent0) {
            if(Build.VERSION.SDK_INT >= 23) {
                this.c.requestUsageTimeReport(pendingIntent0);
            }
        }

        @Override  // androidx.core.app.ActivityOptionsCompat
        public ActivityOptionsCompat l(Rect rect0) {
            return Build.VERSION.SDK_INT >= 24 ? new ActivityOptionsCompatImpl(this.c.setLaunchBounds(rect0)) : this;
        }

        @Override  // androidx.core.app.ActivityOptionsCompat
        public ActivityOptionsCompat m(int v) {
            if(Build.VERSION.SDK_INT >= 26) {
                this.c.setLaunchDisplayId(v);
            }
            return this;
        }

        @Override  // androidx.core.app.ActivityOptionsCompat
        @SuppressLint({"WrongConstant"})
        public ActivityOptionsCompat n(int v) {
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= 34) {
                this.c.setPendingIntentBackgroundActivityStartMode(v);
                return this;
            }
            if(v1 >= 33) {
                this.c.setPendingIntentBackgroundActivityLaunchAllowed(v != 2);
            }
            return this;
        }

        @Override  // androidx.core.app.ActivityOptionsCompat
        public ActivityOptionsCompat o(boolean z) {
            return Build.VERSION.SDK_INT >= 34 ? new ActivityOptionsCompatImpl(this.c.setShareIdentityEnabled(z)) : this;
        }

        @Override  // androidx.core.app.ActivityOptionsCompat
        public Bundle p() {
            return this.c.toBundle();
        }

        @Override  // androidx.core.app.ActivityOptionsCompat
        public void q(ActivityOptionsCompat activityOptionsCompat0) {
            if(activityOptionsCompat0 instanceof ActivityOptionsCompatImpl) {
                this.c.update(((ActivityOptionsCompatImpl)activityOptionsCompat0).c);
            }
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BackgroundActivityStartMode {
    }

    public static final String a = "android.activity.usage_time";
    public static final String b = "android.usage_time_packages";

    public Rect a() {
        return null;
    }

    public int b() {
        return -1;
    }

    public static ActivityOptionsCompat c() {
        return Build.VERSION.SDK_INT >= 23 ? new ActivityOptionsCompatImpl(ActivityOptions.makeBasic()) : new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat d(View view0, int v, int v1, int v2, int v3) {
        return Build.VERSION.SDK_INT >= 23 ? new ActivityOptionsCompatImpl(ActivityOptions.makeClipRevealAnimation(view0, v, v1, v2, v3)) : new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat e(Context context0, int v, int v1) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(context0, v, v1));
    }

    public static ActivityOptionsCompat f(View view0, int v, int v1, int v2, int v3) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeScaleUpAnimation(view0, v, v1, v2, v3));
    }

    public static ActivityOptionsCompat g(Activity activity0, View view0, String s) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity0, view0, s));
    }

    public static ActivityOptionsCompat h(Activity activity0, Pair[] arr_pair) {
        if(arr_pair != null) {
            android.util.Pair[] arr_pair1 = new android.util.Pair[arr_pair.length];
            for(int v = 0; v < arr_pair.length; ++v) {
                Pair pair0 = arr_pair[v];
                arr_pair1[v] = android.util.Pair.create(((View)pair0.a), ((String)pair0.b));
            }
            return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity0, arr_pair1));
        }
        return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity0, null));
    }

    public static ActivityOptionsCompat i() {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeTaskLaunchBehind());
    }

    public static ActivityOptionsCompat j(View view0, Bitmap bitmap0, int v, int v1) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeThumbnailScaleUpAnimation(view0, bitmap0, v, v1));
    }

    public void k(PendingIntent pendingIntent0) {
    }

    public ActivityOptionsCompat l(Rect rect0) {
        return this;
    }

    public ActivityOptionsCompat m(int v) {
        return this;
    }

    public ActivityOptionsCompat n(int v) {
        return this;
    }

    public ActivityOptionsCompat o(boolean z) {
        return this;
    }

    public Bundle p() {
        return null;
    }

    public void q(ActivityOptionsCompat activityOptionsCompat0) {
    }
}

