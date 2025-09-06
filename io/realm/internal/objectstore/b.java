package io.realm.internal.objectstore;

import io.realm.mongodb.sync.SubscriptionSet.StateChangeCallback;
import io.realm.mongodb.sync.SubscriptionSet;
import java.util.concurrent.TimeUnit;

class b implements Runnable {
    final Long a;
    final TimeUnit b;
    final StateChangeCallback c;
    final OsSubscriptionSet d;

    b(OsSubscriptionSet osSubscriptionSet0, Long long0, TimeUnit timeUnit0, StateChangeCallback subscriptionSet$StateChangeCallback0) {
        this.d = osSubscriptionSet0;
        this.a = long0;
        this.b = timeUnit0;
        this.c = subscriptionSet$StateChangeCallback0;
        super();
    }

    @Override
    public void run() {
        class a implements Runnable {
            final b a;

            @Override
            public void run() {
                b.this.c.onStateChange(((SubscriptionSet)b.this.d));
            }
        }


        class io.realm.internal.objectstore.b.b implements Runnable {
            final Exception a;
            final b b;

            io.realm.internal.objectstore.b.b(Exception exception0) {
                this.a = exception0;
                super();
            }

            @Override
            public void run() {
                b.this.c.onError(this.a);
            }
        }

        try {
            this.d.waitForSynchronization(this.a, this.b);
            OsSubscriptionSet.access$000(this.d).post(new a(this));
        }
        catch(Exception exception0) {
            OsSubscriptionSet.access$000(this.d).post(new io.realm.internal.objectstore.b.b(this, exception0));
        }
    }
}

