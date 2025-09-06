package com.dcinside.app.barcode;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import com.dcinside.app.Application;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import kotlin.jvm.internal.L;
import y4.l;

public final class i {
    @l
    public static final i a;

    static {
        i.a = new i();
    }

    public final boolean a(@l Activity activity0) {
        L.p(activity0, "activity");
        Context context0 = activity0.getApplicationContext();
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.Application");
        BarcodeDetector barcodeDetector0 = ((Application)context0).g();
        return barcodeDetector0 != null && barcodeDetector0.isOperational();
    }

    public final boolean b(@l Activity activity0) {
        L.p(activity0, "activity");
        return activity0.getPackageManager().hasSystemFeature("android.hardware.camera") || activity0.getPackageManager().hasSystemFeature("android.hardware.camera.front");
    }

    public final boolean c(@l Activity activity0) {
        L.p(activity0, "activity");
        return GoogleApiAvailability.getInstance().getApkVersion(activity0) >= 9200000;
    }

    public final boolean d(@l Activity activity0) {
        L.p(activity0, "activity");
        return activity0.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null;
    }
}

