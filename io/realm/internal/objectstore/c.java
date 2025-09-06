package io.realm.internal.objectstore;

import io.realm.mongodb.sync.SubscriptionSet.a;
import io.realm.mongodb.sync.SubscriptionSet;

class c implements Runnable {
    final a a;
    final OsSubscriptionSet b;

    c(OsSubscriptionSet osSubscriptionSet0, a subscriptionSet$a0) {
        this.b = osSubscriptionSet0;
        this.a = subscriptionSet$a0;
        super();
    }

    @Override
    public void run() {
        class io.realm.internal.objectstore.c.a implements Runnable {
            final SubscriptionSet a;
            final c b;

            io.realm.internal.objectstore.c.a(SubscriptionSet subscriptionSet0) {
                this.a = subscriptionSet0;
                super();
            }

            @Override
            public void run() {
                c.this.a.a(this.a);
            }
        }


        class b implements Runnable {
            final Throwable a;
            final c b;

            b(Throwable throwable0) {
                this.a = throwable0;
                super();
            }

            @Override
            public void run() {
                c.this.a.onError(this.a);
            }
        }

        try {
            SubscriptionSet subscriptionSet0 = this.b.update(this.a);
            OsSubscriptionSet.access$000(this.b).post(new io.realm.internal.objectstore.c.a(this, subscriptionSet0));
        }
        catch(Throwable throwable0) {
            OsSubscriptionSet.access$000(this.b).post(new b(this, throwable0));
        }
    }
}

