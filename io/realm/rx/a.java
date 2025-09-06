package io.realm.rx;

import io.realm.OrderedRealmCollection;
import io.realm.v0;
import o3.h;

public class a {
    private final OrderedRealmCollection a;
    private final v0 b;

    public a(OrderedRealmCollection orderedRealmCollection0, @h v0 v00) {
        this.a = orderedRealmCollection0;
        this.b = v00;
    }

    @h
    public v0 a() {
        return this.b;
    }

    public OrderedRealmCollection b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || !this.a.equals(((a)object0).a)) {
            return false;
        }
        v0 v00 = ((a)object0).b;
        return this.b == null ? v00 == null : this.b.equals(v00);
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }
}

