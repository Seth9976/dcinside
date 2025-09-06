package io.realm.rx;

import io.realm.X0;
import io.realm.q0;
import o3.h;

public class b {
    private final X0 a;
    private final q0 b;

    public b(X0 x00, @h q0 q00) {
        this.a = x00;
        this.b = q00;
    }

    @h
    public q0 a() {
        return this.b;
    }

    public X0 b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || !this.a.equals(((b)object0).a)) {
            return false;
        }
        q0 q00 = ((b)object0).b;
        return this.b == null ? q00 == null : this.b.equals(q00);
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public String toString() {
        return "ObjectChange{object=" + this.a + ", changeset=" + this.b + '}';
    }
}

