package androidx.browser.trusted.sharing;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public final class ShareData {
    @Nullable
    public final String a;
    @Nullable
    public final String b;
    @Nullable
    public final List c;
    public static final String d = "androidx.browser.trusted.sharing.KEY_TITLE";
    public static final String e = "androidx.browser.trusted.sharing.KEY_TEXT";
    public static final String f = "androidx.browser.trusted.sharing.KEY_URIS";

    public ShareData(@Nullable String s, @Nullable String s1, @Nullable List list0) {
        this.a = s;
        this.b = s1;
        this.c = list0;
    }

    @NonNull
    public static ShareData a(@NonNull Bundle bundle0) {
        return new ShareData(bundle0.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle0.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle0.getParcelableArrayList("androidx.browser.trusted.sharing.KEY_URIS"));
    }

    @NonNull
    public Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.a);
        bundle0.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.b);
        if(this.c != null) {
            bundle0.putParcelableArrayList("androidx.browser.trusted.sharing.KEY_URIS", new ArrayList(this.c));
        }
        return bundle0;
    }
}

