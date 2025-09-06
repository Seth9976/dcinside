package androidx.webkit.internal;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(27)
public class ApiHelperForOMR1 {
    @DoNotInline
    public static void a(@NonNull SafeBrowsingResponse safeBrowsingResponse0, boolean z) {
        safeBrowsingResponse0.backToSafety(z);
    }

    @DoNotInline
    @NonNull
    public static Uri b() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    @DoNotInline
    public static void c(@NonNull SafeBrowsingResponse safeBrowsingResponse0, boolean z) {
        safeBrowsingResponse0.proceed(z);
    }

    @DoNotInline
    public static void d(@NonNull List list0, @Nullable ValueCallback valueCallback0) {
        WebView.setSafeBrowsingWhitelist(list0, valueCallback0);
    }

    @DoNotInline
    public static void e(@NonNull SafeBrowsingResponse safeBrowsingResponse0, boolean z) {
        safeBrowsingResponse0.showInterstitial(z);
    }

    @DoNotInline
    public static void f(@NonNull Context context0, @Nullable ValueCallback valueCallback0) {
        WebView.startSafeBrowsing(context0, valueCallback0);
    }
}

