package org.bson;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

public class d0 implements c0 {
    private ByteBuffer a;
    private final AtomicInteger b;

    public d0(ByteBuffer byteBuffer0) {
        this.b = new AtomicInteger(1);
        this.a = byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override  // org.bson.c0
    public boolean C() {
        return this.a.hasRemaining();
    }

    @Override  // org.bson.c0
    public c0 D() {
        return new d0(this.a.duplicate());
    }

    @Override  // org.bson.c0
    public c0 E() {
        return new d0(this.a.asReadOnlyBuffer());
    }

    @Override  // org.bson.c0
    public c0 F(int v, byte b) {
        this.a.put(v, b);
        return this;
    }

    @Override  // org.bson.c0
    public int G() {
        return this.a.remaining();
    }

    @Override  // org.bson.c0
    public int H() {
        return this.b.get();
    }

    @Override  // org.bson.c0
    public c0 I(int v, byte[] arr_b, int v1, int v2) {
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_b[v1 + v3] = this.a.get(v + v3);
        }
        return this;
    }

    @Override  // org.bson.c0
    public c0 J() {
        return this.c();
    }

    @Override  // org.bson.c0
    public c0 K(byte[] arr_b) {
        this.a.get(arr_b);
        return this;
    }

    @Override  // org.bson.c0
    public c0 L(ByteOrder byteOrder0) {
        this.a.order(byteOrder0);
        return this;
    }

    @Override  // org.bson.c0
    public c0 M() {
        this.a.flip();
        return this;
    }

    @Override  // org.bson.c0
    public byte[] N() {
        return this.a.array();
    }

    @Override  // org.bson.c0
    public c0 O(int v, byte[] arr_b) {
        return this.I(v, arr_b, 0, arr_b.length);
    }

    @Override  // org.bson.c0
    public ByteBuffer P() {
        return this.a;
    }

    @Override  // org.bson.c0
    public c0 Q(byte[] arr_b, int v, int v1) {
        this.a.get(arr_b, v, v1);
        return this;
    }

    @Override  // org.bson.c0
    public c0 R(int v) {
        this.a.position(v);
        return this;
    }

    @Override  // org.bson.c0
    public int S() {
        return this.a.capacity();
    }

    @Override  // org.bson.c0
    public c0 T(int v) {
        this.a.limit(v);
        return this;
    }

    @Override  // org.bson.c0
    public int U() {
        return this.a.getInt();
    }

    @Override  // org.bson.c0
    public long a() {
        return this.a.getLong();
    }

    @Override  // org.bson.c0
    public double b() {
        return this.a.getDouble();
    }

    public d0 c() {
        if(this.b.incrementAndGet() != 1) {
            return this;
        }
        this.b.decrementAndGet();
        throw new IllegalStateException("Attempted to increment the reference count when it is already 0");
    }

    @Override  // org.bson.c0
    public c0 clear() {
        this.a.clear();
        return this;
    }

    @Override  // org.bson.c0
    public byte get() {
        return this.a.get();
    }

    @Override  // org.bson.c0
    public byte get(int v) {
        return this.a.get(v);
    }

    @Override  // org.bson.c0
    public double getDouble(int v) {
        return this.a.getDouble(v);
    }

    @Override  // org.bson.c0
    public int getInt(int v) {
        return this.a.getInt(v);
    }

    @Override  // org.bson.c0
    public long getLong(int v) {
        return this.a.getLong(v);
    }

    @Override  // org.bson.c0
    public c0 h(byte b) {
        this.a.put(b);
        return this;
    }

    @Override  // org.bson.c0
    public c0 i(byte[] arr_b, int v, int v1) {
        this.a.put(arr_b, v, v1);
        return this;
    }

    @Override  // org.bson.c0
    public int limit() {
        return this.a.limit();
    }

    @Override  // org.bson.c0
    public int position() {
        return this.a.position();
    }

    @Override  // org.bson.c0
    public void release() {
        if(this.b.decrementAndGet() >= 0) {
            if(this.b.get() == 0) {
                this.a = null;
            }
            return;
        }
        this.b.incrementAndGet();
        throw new IllegalStateException("Attempted to decrement the reference count below 0");
    }
}

