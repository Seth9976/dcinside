package io.realm.internal.objectstore;

import io.realm.mongodb.sync.Subscription;
import java.util.Iterator;
import java.util.NoSuchElementException;

class d implements Iterator {
    private int a;
    private final int b;
    final OsSubscriptionSet c;

    d(OsSubscriptionSet osSubscriptionSet0) {
        this.c = osSubscriptionSet0;
        super();
        this.a = 0;
        this.b = osSubscriptionSet0.size();
    }

    public Subscription a() {
        if(this.a >= this.b) {
            throw new NoSuchElementException("Iterator has no more elements. Tried index " + this.a + ". Size is " + this.b + ".");
        }
        long v = OsSubscriptionSet.access$200(OsSubscriptionSet.access$100(this.c), this.a);
        ++this.a;
        return new OsSubscription(v);
    }

    @Override
    public boolean hasNext() {
        return this.a < this.b;
    }

    @Override
    public Object next() {
        return this.a();
    }
}

