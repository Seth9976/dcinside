package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

public final class zzbbs implements Callable {
    @Override
    public final Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}

