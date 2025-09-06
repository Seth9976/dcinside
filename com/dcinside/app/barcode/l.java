package com.dcinside.app.barcode;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.common.base.H;
import kotlin.jvm.internal.L;
import y4.m;

public final class l implements k {
    @Override  // com.dcinside.app.barcode.k
    @TargetApi(23)
    public void a(@m Activity activity0, @m String[] arr_s, int v) {
        H.d(Build.VERSION.SDK_INT >= 23);
        L.m(activity0);
        L.m(arr_s);
        ActivityCompat.m(activity0, arr_s, v);
    }

    @Override  // com.dcinside.app.barcode.k
    @TargetApi(23)
    public int b(@m Context context0, @m String s) {
        H.d(Build.VERSION.SDK_INT >= 23);
        L.m(context0);
        L.m(s);
        return ContextCompat.checkSelfPermission(context0, s);
    }

    @Override  // com.dcinside.app.barcode.k
    @TargetApi(23)
    public boolean c(@m Activity activity0, @m String s) {
        H.d(Build.VERSION.SDK_INT >= 23);
        L.m(activity0);
        L.m(s);
        return ActivityCompat.s(activity0, s);
    }
}

