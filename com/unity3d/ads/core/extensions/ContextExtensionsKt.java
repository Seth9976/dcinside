package com.unity3d.ads.core.extensions;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.L;
import y4.l;

public final class ContextExtensionsKt {
    @l
    public static final File unityAdsDataStoreFile(@l Context context0, @l String s) {
        L.p(context0, "<this>");
        L.p(s, "fileName");
        return new File(context0.getApplicationContext().getFilesDir(), "unityAdsDatastore/" + s);
    }
}

