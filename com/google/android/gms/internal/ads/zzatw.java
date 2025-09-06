package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

final class zzatw implements Runnable {
    private zzatw() {
        throw null;
    }

    zzatw(zzatx zzatx0) {
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch0;
        try {
            zzaty.zzd = MessageDigest.getInstance("MD5");
            countDownLatch0 = zzaty.zzb;
        }
        catch(NoSuchAlgorithmException unused_ex) {
            countDownLatch0 = zzaty.zzb;
        }
        catch(Throwable throwable0) {
            zzaty.zzb.countDown();
            throw throwable0;
        }
        countDownLatch0.countDown();
    }
}

