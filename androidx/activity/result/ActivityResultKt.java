package androidx.activity.result;

import android.content.Intent;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ActivityResultKt {
    public static final int a(@l ActivityResult activityResult0) {
        L.p(activityResult0, "<this>");
        return activityResult0.c();
    }

    @m
    public static final Intent b(@l ActivityResult activityResult0) {
        L.p(activityResult0, "<this>");
        return activityResult0.a();
    }
}

