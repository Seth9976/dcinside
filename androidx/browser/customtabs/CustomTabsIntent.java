package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.AnimRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Locale;

public final class CustomTabsIntent {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivityHeightResizeBehavior {
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetDecorationType {
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetPosition {
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetRoundedCornersPosition {
    }

    @RequiresApi(api = 21)
    static class Api21Impl {
        @DoNotInline
        @Nullable
        static Locale a(Intent intent0) {
            String s = intent0.getStringExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG");
            return s == null ? null : Locale.forLanguageTag(s);
        }

        @DoNotInline
        static void b(Intent intent0, Locale locale0) {
            intent0.putExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG", locale0.toLanguageTag());
        }
    }

    @RequiresApi(api = 23)
    static class Api23Impl {
        @DoNotInline
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    @RequiresApi(api = 24)
    static class Api24Impl {
        @DoNotInline
        @Nullable
        static String a() {
            LocaleList localeList0 = LocaleList.getAdjustedDefault();
            return localeList0.size() <= 0 ? null : localeList0.get(0).toLanguageTag();
        }
    }

    @RequiresApi(api = 34)
    static class Api34Impl {
        @DoNotInline
        static void a(ActivityOptions activityOptions0, boolean z) {
            activityOptions0.setShareIdentityEnabled(z);
        }
    }

    public static final class Builder {
        private final Intent a;
        private final androidx.browser.customtabs.CustomTabColorSchemeParams.Builder b;
        @Nullable
        private ArrayList c;
        @Nullable
        private ActivityOptions d;
        @Nullable
        private ArrayList e;
        @Nullable
        private SparseArray f;
        @Nullable
        private Bundle g;
        private int h;
        private boolean i;
        private boolean j;

        public Builder() {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = new androidx.browser.customtabs.CustomTabColorSchemeParams.Builder();
            this.h = 0;
            this.i = true;
        }

        public Builder(@Nullable CustomTabsSession customTabsSession0) {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = new androidx.browser.customtabs.CustomTabColorSchemeParams.Builder();
            this.h = 0;
            this.i = true;
            if(customTabsSession0 != null) {
                this.J(customTabsSession0);
            }
        }

        @NonNull
        public Builder A(boolean z) {
            this.i = z;
            return this;
        }

        @RequiresApi(api = 24)
        private void B(@NonNull Locale locale0) {
            Api21Impl.b(this.a, locale0);
        }

        @NonNull
        @Deprecated
        public Builder C(@ColorInt int v) {
            this.b.b(v);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder D(@ColorInt int v) {
            this.b.c(v);
            return this;
        }

        @NonNull
        @RestrictTo({Scope.a})
        public Builder E(@NonNull PendingSession customTabsSession$PendingSession0) {
            this.K(null, customTabsSession$PendingSession0.b());
            return this;
        }

        @NonNull
        @Deprecated
        public Builder F(@ColorInt int v) {
            this.b.d(v);
            return this;
        }

        @NonNull
        public Builder G(@Nullable PendingIntent pendingIntent0) {
            this.a.putExtra("androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE", pendingIntent0);
            return this;
        }

        @NonNull
        public Builder H(@NonNull RemoteViews remoteViews0, @Nullable int[] arr_v, @Nullable PendingIntent pendingIntent0) {
            this.a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews0);
            this.a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", arr_v);
            this.a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent0);
            return this;
        }

        @NonNull
        public Builder I(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER", z);
            return this;
        }

        @NonNull
        public Builder J(@NonNull CustomTabsSession customTabsSession0) {
            String s = customTabsSession0.h().getPackageName();
            this.a.setPackage(s);
            this.K(customTabsSession0.g(), customTabsSession0.i());
            return this;
        }

        private void K(@Nullable IBinder iBinder0, @Nullable PendingIntent pendingIntent0) {
            Bundle bundle0 = new Bundle();
            bundle0.putBinder("android.support.customtabs.extra.SESSION", iBinder0);
            if(pendingIntent0 != null) {
                bundle0.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent0);
            }
            this.a.putExtras(bundle0);
        }

        @NonNull
        public Builder L(boolean z) {
            this.j = z;
            return this;
        }

        @RequiresApi(api = 34)
        private void M() {
            if(this.d == null) {
                this.d = Api23Impl.a();
            }
            Api34Impl.a(this.d, this.j);
        }

        @NonNull
        public Builder N(int v) {
            if(v < 0 || v > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.h = v;
            if(v == 1) {
                this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                return this;
            }
            if(v == 2) {
                this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                return this;
            }
            this.a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            return this;
        }

        @NonNull
        public Builder O(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", ((int)z));
            return this;
        }

        @NonNull
        public Builder P(@NonNull Context context0, @AnimRes int v, @AnimRes int v1) {
            this.d = ActivityOptions.makeCustomAnimation(context0, v, v1);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder Q(@ColorInt int v) {
            this.b.e(v);
            return this;
        }

        @NonNull
        public Builder R(@Dimension(unit = 0) int v) {
            if(v < 0 || v > 16) {
                throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
            }
            this.a.putExtra("androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP", v);
            return this;
        }

        @NonNull
        public Builder S(@NonNull Locale locale0) {
            if(Build.VERSION.SDK_INT >= 24) {
                this.B(locale0);
            }
            return this;
        }

        @NonNull
        public Builder T(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder a() {
            this.N(1);
            return this;
        }

        @NonNull
        public Builder b(@NonNull String s, @NonNull PendingIntent pendingIntent0) {
            if(this.c == null) {
                this.c = new ArrayList();
            }
            Bundle bundle0 = new Bundle();
            bundle0.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", s);
            bundle0.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent0);
            this.c.add(bundle0);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder c(int v, @NonNull Bitmap bitmap0, @NonNull String s, @NonNull PendingIntent pendingIntent0) throws IllegalStateException {
            if(this.e == null) {
                this.e = new ArrayList();
            }
            if(this.e.size() >= 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            Bundle bundle0 = new Bundle();
            bundle0.putInt("android.support.customtabs.customaction.ID", v);
            bundle0.putParcelable("android.support.customtabs.customaction.ICON", bitmap0);
            bundle0.putString("android.support.customtabs.customaction.DESCRIPTION", s);
            bundle0.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent0);
            this.e.add(bundle0);
            return this;
        }

        @NonNull
        public CustomTabsIntent d() {
            Bundle bundle0 = null;
            if(!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                this.K(null, null);
            }
            ArrayList arrayList0 = this.c;
            if(arrayList0 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList0);
            }
            ArrayList arrayList1 = this.e;
            if(arrayList1 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList1);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            Bundle bundle1 = this.b.a().b();
            this.a.putExtras(bundle1);
            Bundle bundle2 = this.g;
            if(bundle2 != null) {
                this.a.putExtras(bundle2);
            }
            if(this.f != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras(bundle3);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            int v = Build.VERSION.SDK_INT;
            if(v >= 24) {
                this.s();
            }
            if(v >= 34) {
                this.M();
            }
            ActivityOptions activityOptions0 = this.d;
            if(activityOptions0 != null) {
                bundle0 = activityOptions0.toBundle();
            }
            return new CustomTabsIntent(this.a, bundle0);
        }

        @NonNull
        @Deprecated
        public Builder e() {
            this.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            return this;
        }

        @NonNull
        public Builder f(@NonNull Bitmap bitmap0, @NonNull String s, @NonNull PendingIntent pendingIntent0) {
            return this.g(bitmap0, s, pendingIntent0, false);
        }

        @NonNull
        public Builder g(@NonNull Bitmap bitmap0, @NonNull String s, @NonNull PendingIntent pendingIntent0, boolean z) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("android.support.customtabs.customaction.ID", 0);
            bundle0.putParcelable("android.support.customtabs.customaction.ICON", bitmap0);
            bundle0.putString("android.support.customtabs.customaction.DESCRIPTION", s);
            bundle0.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent0);
            this.a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle0);
            this.a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z);
            return this;
        }

        @NonNull
        public Builder h(@Dimension(unit = 0) int v) {
            if(v <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", v);
            return this;
        }

        @NonNull
        public Builder i(int v) {
            if(v < 0 || v > 3) {
                throw new IllegalArgumentException("Invalid value for the decorationType argument");
            }
            this.a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE", v);
            return this;
        }

        @NonNull
        public Builder j(boolean z) {
            this.a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION", z);
            return this;
        }

        @NonNull
        public Builder k(int v) {
            if(v < 0 || v > 2) {
                throw new IllegalArgumentException("Invalid value for the sideSheetPosition argument");
            }
            this.a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION", v);
            return this;
        }

        @NonNull
        public Builder l(int v) {
            if(v < 0 || v > 2) {
                throw new IllegalArgumentException("Invalid value for the roundedCornersPosition./ argument");
            }
            this.a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION", v);
            return this;
        }

        @NonNull
        public Builder m(boolean z) {
            this.a.putExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", !z);
            return this;
        }

        @NonNull
        public Builder n(boolean z) {
            this.a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", !z);
            return this;
        }

        @NonNull
        public Builder o(@NonNull Bitmap bitmap0) {
            this.a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap0);
            return this;
        }

        @NonNull
        public Builder p(int v) {
            if(v < 0 || v > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", v);
            return this;
        }

        @NonNull
        public Builder q(int v) {
            if(v < 0 || v > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.a.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", v);
            return this;
        }

        @NonNull
        public Builder r(int v, @NonNull CustomTabColorSchemeParams customTabColorSchemeParams0) {
            if(v < 0 || v > 2 || v == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + v);
            }
            if(this.f == null) {
                this.f = new SparseArray();
            }
            this.f.put(v, customTabColorSchemeParams0.b());
            return this;
        }

        @RequiresApi(api = 24)
        private void s() {
            String s = Api24Impl.a();
            if(!TextUtils.isEmpty(s)) {
                Bundle bundle0 = this.a.hasExtra("com.android.browser.headers") ? this.a.getBundleExtra("com.android.browser.headers") : new Bundle();
                if(!bundle0.containsKey("Accept-Language")) {
                    bundle0.putString("Accept-Language", s);
                    this.a.putExtra("com.android.browser.headers", bundle0);
                }
            }
        }

        @NonNull
        public Builder t(@NonNull CustomTabColorSchemeParams customTabColorSchemeParams0) {
            this.g = customTabColorSchemeParams0.b();
            return this;
        }

        @NonNull
        @Deprecated
        public Builder u(boolean z) {
            if(z) {
                this.N(1);
                return this;
            }
            this.N(2);
            return this;
        }

        @NonNull
        public Builder v(boolean z) {
            this.a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", !z);
            return this;
        }

        @NonNull
        public Builder w(@NonNull Context context0, @AnimRes int v, @AnimRes int v1) {
            Bundle bundle0 = ActivityOptionsCompat.e(context0, v, v1).p();
            this.a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", bundle0);
            return this;
        }

        @NonNull
        public Builder x(@Dimension(unit = 1) int v) {
            return this.y(v, 0);
        }

        @NonNull
        public Builder y(@Dimension(unit = 1) int v, int v1) {
            if(v <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if(v1 < 0 || v1 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", v);
            this.a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", v1);
            return this;
        }

        @NonNull
        public Builder z(@Dimension(unit = 1) int v) {
            if(v <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", v);
            return this;
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CloseButtonPosition {
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShareState {
    }

    public static final String A = "android.support.customtabs.customaction.DESCRIPTION";
    public static final int A0 = 0;
    public static final String B = "android.support.customtabs.customaction.PENDING_INTENT";
    private static final int B0 = 5;
    public static final String C = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    private static final int C0 = 16;
    public static final String D = "android.support.customtabs.extra.MENU_ITEMS";
    private static final String D0 = "Accept-Language";
    public static final String E = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String F = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    private static final int J = 2;
    public static final String K = "androidx.browser.customtabs.extra.SHARE_STATE";
    @Deprecated
    public static final String L = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String M = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String N = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String O = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String P = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String Q = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String R = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";
    public static final String S = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String T = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;
    private static final int X = 2;
    public static final String Y = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final String Z = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX";
    @NonNull
    public final Intent a;
    public static final String a0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION";
    @Nullable
    public final Bundle b;
    public static final String b0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP";
    private static final String c = "android.support.customtabs.extra.user_opt_out";
    public static final int c0 = 0;
    public static final String d = "android.support.customtabs.extra.SESSION";
    public static final int d0 = 1;
    @RestrictTo({Scope.a})
    public static final String e = "android.support.customtabs.extra.SESSION_ID";
    public static final int e0 = 2;
    public static final int f = 0;
    private static final int f0 = 2;
    public static final int g = 1;
    public static final String g0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION";
    public static final int h = 2;
    public static final int h0 = 0;
    private static final int i = 2;
    public static final int i0 = 1;
    public static final String j = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final int j0 = 2;
    public static final String k = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final int k0 = 3;
    public static final String l = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    private static final int l0 = 3;
    public static final String m = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final int m0 = 0;
    public static final String n = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final int n0 = 1;
    public static final String o = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON";
    public static final int o0 = 2;
    public static final String p = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON";
    private static final int p0 = 2;
    public static final String q = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER";
    public static final String q0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE";
    public static final String r = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";
    public static final String r0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION";
    public static final String s = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION";
    public static final String s0 = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";
    public static final String t = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE";
    public static final int t0 = 0;
    public static final int u = 0;
    public static final int u0 = 1;
    public static final int v = 1;
    public static final int v0 = 2;
    public static final String w = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    private static final int w0 = 2;
    public static final String x = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final String x0 = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";
    public static final String y = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final String y0 = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final String z = "android.support.customtabs.customaction.ICON";
    public static final String z0 = "android.support.customtabs.customaction.ID";

    CustomTabsIntent(@NonNull Intent intent0, @Nullable Bundle bundle0) {
        this.a = intent0;
        this.b = bundle0;
    }

    public static int a(@NonNull Intent intent0) {
        return intent0.getIntExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
    }

    @Dimension(unit = 0)
    public static int b(@NonNull Intent intent0) {
        return intent0.getIntExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", 0);
    }

    public static int c(@NonNull Intent intent0) {
        return intent0.getIntExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE", 0);
    }

    public static int d(@NonNull Intent intent0) {
        return intent0.getIntExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION", 0);
    }

    public static int e(@NonNull Intent intent0) {
        return intent0.getIntExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION", 0);
    }

    public static int f(@NonNull Intent intent0) {
        return intent0.getIntExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", 0);
    }

    @NonNull
    public static CustomTabColorSchemeParams g(@NonNull Intent intent0, int v) {
        if(v < 0 || v > 2 || v == 0) {
            throw new IllegalArgumentException("Invalid colorScheme: " + v);
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            return CustomTabColorSchemeParams.a(null);
        }
        CustomTabColorSchemeParams customTabColorSchemeParams0 = CustomTabColorSchemeParams.a(bundle0);
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS");
        if(sparseArray0 != null) {
            Bundle bundle1 = (Bundle)sparseArray0.get(v);
            return bundle1 == null ? customTabColorSchemeParams0 : CustomTabColorSchemeParams.a(bundle1).c(customTabColorSchemeParams0);
        }
        return customTabColorSchemeParams0;
    }

    @Dimension(unit = 1)
    public static int h(@NonNull Intent intent0) {
        return intent0.getIntExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", 0);
    }

    @Dimension(unit = 1)
    public static int i(@NonNull Intent intent0) {
        return intent0.getIntExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", 0);
    }

    @Nullable
    @RequiresApi(api = 24)
    private static Locale j(Intent intent0) {
        return Api21Impl.a(intent0);
    }

    public static int k() {
        return 5;
    }

    @Nullable
    public static PendingIntent l(@NonNull Intent intent0) {
        return (PendingIntent)intent0.getParcelableExtra("androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE");
    }

    @Dimension(unit = 0)
    public static int m(@NonNull Intent intent0) {
        return intent0.getIntExtra("androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP", 16);
    }

    @Nullable
    public static Locale n(@NonNull Intent intent0) {
        return Build.VERSION.SDK_INT < 24 ? null : CustomTabsIntent.j(intent0);
    }

    public static boolean o(@NonNull Intent intent0) {
        return intent0.getBooleanExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION", false);
    }

    public static boolean p(@NonNull Intent intent0) {
        return !intent0.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false);
    }

    public static boolean q(@NonNull Intent intent0) {
        return !intent0.getBooleanExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", false);
    }

    public static boolean r(@NonNull Intent intent0) {
        return !intent0.getBooleanExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", false);
    }

    public static boolean s(@NonNull Intent intent0) {
        return intent0.getBooleanExtra("android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER", false);
    }

    public void t(@NonNull Context context0, @NonNull Uri uri0) {
        this.a.setData(uri0);
        ContextCompat.startActivity(context0, this.a, this.b);
    }

    @NonNull
    public static Intent u(@Nullable Intent intent0) {
        if(intent0 == null) {
            intent0 = new Intent("android.intent.action.VIEW");
        }
        intent0.addFlags(0x10000000);
        intent0.putExtra("android.support.customtabs.extra.user_opt_out", true);
        return intent0;
    }

    public static boolean v(@NonNull Intent intent0) {
        return intent0.getBooleanExtra("android.support.customtabs.extra.user_opt_out", false) && (intent0.getFlags() & 0x10000000) != 0;
    }
}

