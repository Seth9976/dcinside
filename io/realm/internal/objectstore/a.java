package io.realm.internal.objectstore;

import io.realm.mongodb.sync.SubscriptionSet.b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

class a implements io.realm.internal.objectstore.OsSubscriptionSet.a {
    final AtomicBoolean a;
    final CountDownLatch b;
    final OsSubscriptionSet c;

    a(OsSubscriptionSet osSubscriptionSet0, AtomicBoolean atomicBoolean0, CountDownLatch countDownLatch0) {
        this.c = osSubscriptionSet0;
        this.a = atomicBoolean0;
        this.b = countDownLatch0;
        super();
    }

    @Override  // io.realm.internal.objectstore.OsSubscriptionSet$a
    public void a(byte b) {
        boolean z = b.a(b) == b.e;
        this.a.set(z);
        this.b.countDown();
    }
}

