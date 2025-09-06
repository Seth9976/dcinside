package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.trusted.sharing.ShareData;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrustedWebActivityIntentBuilder {
    @NonNull
    private final Uri a;
    @NonNull
    private final Builder b;
    @Nullable
    private List c;
    @Nullable
    private Bundle d;
    @Nullable
    private ShareData e;
    @Nullable
    private ShareTarget f;
    @NonNull
    private TrustedWebActivityDisplayMode g;
    private int h;
    @SuppressLint({"ActionValue"})
    public static final String i = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";
    @SuppressLint({"ActionValue"})
    public static final String j = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";
    public static final String k = "androidx.browser.trusted.extra.SHARE_TARGET";
    public static final String l = "androidx.browser.trusted.extra.SHARE_DATA";
    public static final String m = "androidx.browser.trusted.extra.DISPLAY_MODE";
    public static final String n = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";

    public TrustedWebActivityIntentBuilder(@NonNull Uri uri0) {
        this.b = new Builder();
        this.g = new DefaultMode();
        this.h = 0;
        this.a = uri0;
    }

    @NonNull
    public TrustedWebActivityIntent a(@NonNull CustomTabsSession customTabsSession0) {
        if(customTabsSession0 == null) {
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        this.b.J(customTabsSession0);
        Intent intent0 = this.b.d().a;
        intent0.setData(this.a);
        intent0.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if(this.c != null) {
            intent0.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(this.c));
        }
        Bundle bundle0 = this.d;
        if(bundle0 != null) {
            intent0.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", bundle0);
        }
        List list0 = Collections.emptyList();
        ShareTarget shareTarget0 = this.f;
        if(shareTarget0 != null && this.e != null) {
            intent0.putExtra("androidx.browser.trusted.extra.SHARE_TARGET", shareTarget0.b());
            intent0.putExtra("androidx.browser.trusted.extra.SHARE_DATA", this.e.b());
            List list1 = this.e.c;
            if(list1 != null) {
                list0 = list1;
            }
        }
        intent0.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", this.g.toBundle());
        intent0.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", this.h);
        return new TrustedWebActivityIntent(intent0, list0);
    }

    @NonNull
    public CustomTabsIntent b() {
        return this.b.d();
    }

    @NonNull
    public TrustedWebActivityDisplayMode c() {
        return this.g;
    }

    @NonNull
    public Uri d() {
        return this.a;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder e(@NonNull List list0) {
        this.c = list0;
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder f(int v) {
        this.b.q(v);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder g(int v, @NonNull CustomTabColorSchemeParams customTabColorSchemeParams0) {
        this.b.r(v, customTabColorSchemeParams0);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder h(@NonNull CustomTabColorSchemeParams customTabColorSchemeParams0) {
        this.b.t(customTabColorSchemeParams0);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder i(@NonNull TrustedWebActivityDisplayMode trustedWebActivityDisplayMode0) {
        this.g = trustedWebActivityDisplayMode0;
        return this;
    }

    @NonNull
    @Deprecated
    public TrustedWebActivityIntentBuilder j(@ColorInt int v) {
        this.b.C(v);
        return this;
    }

    @NonNull
    @Deprecated
    public TrustedWebActivityIntentBuilder k(@ColorInt int v) {
        this.b.D(v);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder l(int v) {
        this.h = v;
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder m(@NonNull ShareTarget shareTarget0, @NonNull ShareData shareData0) {
        this.f = shareTarget0;
        this.e = shareData0;
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder n(@NonNull Bundle bundle0) {
        this.d = bundle0;
        return this;
    }

    @NonNull
    @Deprecated
    public TrustedWebActivityIntentBuilder o(@ColorInt int v) {
        this.b.Q(v);
        return this;
    }
}

