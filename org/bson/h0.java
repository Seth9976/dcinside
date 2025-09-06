package org.bson;

import java.util.List;
import org.bson.types.ObjectId;

public class h0 extends f0 {
    private Object a;

    public List C(byte[] arr_b, int v) {
        return new j0(arr_b, v, this);
    }

    public Object D(String s, ObjectId objectId0) {
        return new m("$ns", s).e("$id", objectId0);
    }

    public Object E(byte[] arr_b, int v) {
        return new k0(arr_b, v, this);
    }

    private Object F() {
        return this.a;
    }

    private void G(Object object0) {
        this.a = object0;
    }

    @Override  // org.bson.f0
    public void g(String s, byte b, byte[] arr_b) {
        this.G(this.E(arr_b, 0));
    }

    @Override  // org.bson.f0
    public Object get() {
        return this.F();
    }

    @Override  // org.bson.f0
    public void reset() {
        this.a = null;
    }
}

