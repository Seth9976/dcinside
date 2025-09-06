package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@Deprecated
public class BrowserActionItem {
    private final String a;
    @Nullable
    private final PendingIntent b;
    @DrawableRes
    private int c;
    @Nullable
    private Uri d;
    @Nullable
    private Runnable e;

    public BrowserActionItem(@NonNull String s, @NonNull PendingIntent pendingIntent0) {
        this(s, pendingIntent0, 0);
    }

    public BrowserActionItem(@NonNull String s, @NonNull PendingIntent pendingIntent0, @DrawableRes int v) {
        this.a = s;
        this.b = pendingIntent0;
        this.c = v;
    }

    @RestrictTo({Scope.c})
    public BrowserActionItem(@NonNull String s, @NonNull PendingIntent pendingIntent0, @NonNull Uri uri0) {
        this.a = s;
        this.b = pendingIntent0;
        this.d = uri0;
    }

    BrowserActionItem(@NonNull String s, @NonNull Runnable runnable0) {
        this.a = s;
        this.b = null;
        this.e = runnable0;
    }

    @NonNull
    public PendingIntent a() {
        PendingIntent pendingIntent0 = this.b;
        if(pendingIntent0 == null) {
            throw new IllegalStateException("Can\'t call getAction on BrowserActionItem with null action.");
        }
        return pendingIntent0;
    }

    public int b() {
        return this.c;
    }

    @Nullable
    @RestrictTo({Scope.a})
    public Uri c() {
        return this.d;
    }

    @Nullable
    @RestrictTo({Scope.c})
    Runnable d() {
        return this.e;
    }

    @NonNull
    public String e() {
        return this.a;
    }
}

