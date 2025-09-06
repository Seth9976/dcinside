package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

final class j0 {
    private final String a;
    private final String b;
    private final String c;
    @VisibleForTesting
    static final String d = "!";
    private static final String e = "/topics/";
    private static final String f = "[a-zA-Z0-9-_.~%]{1,900}";
    private static final Pattern g;

    static {
        j0.g = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }

    private j0(String s, String s1) {
        this.a = j0.d(s1, s);
        this.b = s;
        this.c = s + "!" + s1;
    }

    @Nullable
    static j0 a(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String[] arr_s = s.split("!", -1);
        return arr_s.length == 2 ? new j0(arr_s[0], arr_s[1]) : null;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    @NonNull
    private static String d(String s, String s1) {
        if(s != null && s.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only \'topic-name\' should be used in %s.", s1));
            s = s.substring(8);
        }
        if(s == null || !j0.g.matcher(s).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", s, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return s;
    }

    public String e() {
        return this.c;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof j0 ? this.a.equals(((j0)object0).a) && this.b.equals(((j0)object0).b) : false;
    }

    public static j0 f(@NonNull String s) {
        return new j0("S", s);
    }

    public static j0 g(@NonNull String s) {
        return new j0("U", s);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.b, this.a});
    }
}

