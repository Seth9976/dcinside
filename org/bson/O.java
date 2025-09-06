package org.bson;

import R3.a;
import java.util.Arrays;
import java.util.UUID;
import org.bson.internal.k;

public class o extends Z {
    private final byte a;
    private final byte[] b;

    public o(byte b, byte[] arr_b) {
        if(arr_b == null) {
            throw new IllegalArgumentException("data may not be null");
        }
        this.a = b;
        this.b = arr_b;
    }

    public o(UUID uUID0) {
        this(uUID0, r0.b);
    }

    public o(UUID uUID0, r0 r00) {
        if(uUID0 == null) {
            throw new IllegalArgumentException("uuid may not be null");
        }
        if(r00 == null) {
            throw new IllegalArgumentException("uuidRepresentation may not be null");
        }
        this.b = k.b(uUID0, r00);
        this.a = r00 == r0.b ? q.f.a() : q.e.a();
    }

    public o(q q0, byte[] arr_b) {
        if(q0 == null) {
            throw new IllegalArgumentException("type may not be null");
        }
        if(arr_b == null) {
            throw new IllegalArgumentException("data may not be null");
        }
        this.a = q0.a();
        this.b = arr_b;
    }

    public o(byte[] arr_b) {
        this(q.b, arr_b);
    }

    @Override  // org.bson.Z
    public X G() {
        return X.g;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 != null && this.getClass() == object0.getClass() && Arrays.equals(this.b, ((o)object0).b) ? this.a == ((o)object0).a : false;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.b);
        return this.a * 0x1F + v;
    }

    public UUID j0() {
        if(!q.b(this.a)) {
            throw new G("type must be a UUID subtype.");
        }
        if(this.a != q.f.a()) {
            throw new G("uuidRepresentation must be set to return the correct UUID.");
        }
        return k.a(((byte[])this.b.clone()), this.a, r0.b);
    }

    public UUID k0(r0 r00) {
        a.e("uuidRepresentation", r00);
        if(this.a != (r00 == r0.b ? q.f.a() : q.e.a())) {
            throw new G("uuidRepresentation does not match current uuidRepresentation.");
        }
        return k.a(((byte[])this.b.clone()), this.a, r00);
    }

    static o m0(o o0) {
        byte[] arr_b = (byte[])o0.b.clone();
        return new o(o0.a, arr_b);
    }

    public byte[] n0() {
        return this.b;
    }

    public byte o0() {
        return this.a;
    }

    @Override
    public String toString() {
        return "BsonBinary{type=" + ((int)this.a) + ", data=" + Arrays.toString(this.b) + '}';
    }
}

