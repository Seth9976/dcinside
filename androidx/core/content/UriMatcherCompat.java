package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.Predicate;

public class UriMatcherCompat {
    public static Predicate b(UriMatcher uriMatcher0) {
        return new y(uriMatcher0);
    }

    private static boolean c(UriMatcher uriMatcher0, Uri uri0) {
        return uriMatcher0.match(uri0) != -1;
    }
}

