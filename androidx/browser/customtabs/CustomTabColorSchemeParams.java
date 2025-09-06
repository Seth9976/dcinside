package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class CustomTabColorSchemeParams {
    public static final class Builder {
        @ColorInt
        @Nullable
        private Integer a;
        @ColorInt
        @Nullable
        private Integer b;
        @ColorInt
        @Nullable
        private Integer c;
        @ColorInt
        @Nullable
        private Integer d;

        @NonNull
        public CustomTabColorSchemeParams a() {
            return new CustomTabColorSchemeParams(this.a, this.b, this.c, this.d);
        }

        @NonNull
        public Builder b(@ColorInt int v) {
            this.c = (int)(v | 0xFF000000);
            return this;
        }

        @NonNull
        public Builder c(@ColorInt int v) {
            this.d = v;
            return this;
        }

        @NonNull
        public Builder d(@ColorInt int v) {
            this.b = v;
            return this;
        }

        @NonNull
        public Builder e(@ColorInt int v) {
            this.a = (int)(v | 0xFF000000);
            return this;
        }
    }

    @ColorInt
    @Nullable
    public final Integer a;
    @ColorInt
    @Nullable
    public final Integer b;
    @ColorInt
    @Nullable
    public final Integer c;
    @ColorInt
    @Nullable
    public final Integer d;

    CustomTabColorSchemeParams(@ColorInt @Nullable Integer integer0, @ColorInt @Nullable Integer integer1, @ColorInt @Nullable Integer integer2, @ColorInt @Nullable Integer integer3) {
        this.a = integer0;
        this.b = integer1;
        this.c = integer2;
        this.d = integer3;
    }

    @NonNull
    static CustomTabColorSchemeParams a(@Nullable Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle(0);
        }
        return new CustomTabColorSchemeParams(((Integer)bundle0.get("android.support.customtabs.extra.TOOLBAR_COLOR")), ((Integer)bundle0.get("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR")), ((Integer)bundle0.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR")), ((Integer)bundle0.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR")));
    }

    @NonNull
    Bundle b() {
        Bundle bundle0 = new Bundle();
        Integer integer0 = this.a;
        if(integer0 != null) {
            bundle0.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", ((int)integer0));
        }
        Integer integer1 = this.b;
        if(integer1 != null) {
            bundle0.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", ((int)integer1));
        }
        Integer integer2 = this.c;
        if(integer2 != null) {
            bundle0.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", ((int)integer2));
        }
        Integer integer3 = this.d;
        if(integer3 != null) {
            bundle0.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", ((int)integer3));
        }
        return bundle0;
    }

    // 去混淆评级： 低(40)
    @NonNull
    CustomTabColorSchemeParams c(@NonNull CustomTabColorSchemeParams customTabColorSchemeParams0) {
        return new CustomTabColorSchemeParams((this.a == null ? customTabColorSchemeParams0.a : this.a), (this.b == null ? customTabColorSchemeParams0.b : this.b), (this.c == null ? customTabColorSchemeParams0.c : this.c), (this.d == null ? customTabColorSchemeParams0.d : this.d));
    }
}

