package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.a;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class i {
    private static final String a = "cct";

    public static i a(Context context0, a a0, a a1) {
        return new c(context0, a0, a1, "cct");
    }

    public static i b(Context context0, a a0, a a1, String s) {
        return new c(context0, a0, a1, s);
    }

    public abstract Context c();

    @NonNull
    public abstract String d();

    public abstract a e();

    public abstract a f();
}

