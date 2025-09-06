package com.dcinside.app.barcode;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import com.google.common.base.H;
import y4.m;

public final class a implements k {
    @Override  // com.dcinside.app.barcode.k
    public void a(@m Activity activity0, @m String[] arr_s, int v) {
        H.d(Build.VERSION.SDK_INT < 23);
        throw new UnsupportedOperationException("All permissions are already granted");
    }

    @Override  // com.dcinside.app.barcode.k
    public int b(@m Context context0, @m String s) {
        H.d(Build.VERSION.SDK_INT < 23);
        return 0;
    }

    @Override  // com.dcinside.app.barcode.k
    public boolean c(@m Activity activity0, @m String s) {
        H.d(Build.VERSION.SDK_INT < 23);
        return false;
    }
}

