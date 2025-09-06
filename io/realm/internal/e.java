package io.realm.internal;

import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

class e implements Runnable {
    private final ReferenceQueue a;

    e(ReferenceQueue referenceQueue0) {
        this.a = referenceQueue0;
    }

    @Override
    public void run() {
        try {
            while(true) {
                ((NativeObjectReference)this.a.remove()).e();
            }
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            RealmLog.i("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
        }
    }
}

