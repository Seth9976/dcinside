package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.w;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class q implements w, Serializable {
    protected final String a;
    protected byte[] b;
    protected byte[] c;
    protected char[] d;
    protected transient String e;
    private static final long f = 1L;
    private static final j g;

    static {
        q.g = j.k();
    }

    public q(String s) {
        if(s == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.a = s;
    }

    @Override  // com.fasterxml.jackson.core.w
    public int a(OutputStream outputStream0) throws IOException {
        byte[] arr_b = this.b;
        if(arr_b == null) {
            arr_b = q.g.o(this.a);
            this.b = arr_b;
        }
        outputStream0.write(arr_b, 0, arr_b.length);
        return arr_b.length;
    }

    @Override  // com.fasterxml.jackson.core.w
    public final int b() {
        return this.a.length();
    }

    @Override  // com.fasterxml.jackson.core.w
    public final char[] c() {
        char[] arr_c = this.d;
        if(arr_c == null) {
            arr_c = q.g.n(this.a);
            this.d = arr_c;
        }
        return arr_c;
    }

    @Override  // com.fasterxml.jackson.core.w
    public final byte[] d() {
        byte[] arr_b = this.b;
        if(arr_b == null) {
            arr_b = q.g.o(this.a);
            this.b = arr_b;
        }
        return arr_b;
    }

    @Override  // com.fasterxml.jackson.core.w
    public int e(byte[] arr_b, int v) {
        byte[] arr_b1 = this.b;
        if(arr_b1 == null) {
            arr_b1 = q.g.o(this.a);
            this.b = arr_b1;
        }
        if(v + arr_b1.length > arr_b.length) {
            return -1;
        }
        System.arraycopy(arr_b1, 0, arr_b, v, arr_b1.length);
        return arr_b1.length;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 == null || object0.getClass() != this.getClass() ? false : this.a.equals(((q)object0).a);
    }

    @Override  // com.fasterxml.jackson.core.w
    public int f(char[] arr_c, int v) {
        int v1 = this.a.length();
        return v + v1 <= arr_c.length ? v1 : -1;
    }

    @Override  // com.fasterxml.jackson.core.w
    public int g(byte[] arr_b, int v) {
        byte[] arr_b1 = this.c;
        if(arr_b1 == null) {
            arr_b1 = q.g.j(this.a);
            this.c = arr_b1;
        }
        if(v + arr_b1.length > arr_b.length) {
            return -1;
        }
        System.arraycopy(arr_b1, 0, arr_b, v, arr_b1.length);
        return arr_b1.length;
    }

    @Override  // com.fasterxml.jackson.core.w
    public final String getValue() {
        return this.a;
    }

    @Override  // com.fasterxml.jackson.core.w
    public int h(ByteBuffer byteBuffer0) {
        byte[] arr_b = this.c;
        if(arr_b == null) {
            arr_b = q.g.j(this.a);
            this.c = arr_b;
        }
        if(arr_b.length > byteBuffer0.remaining()) {
            return -1;
        }
        byteBuffer0.put(arr_b, 0, arr_b.length);
        return arr_b.length;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.fasterxml.jackson.core.w
    public int i(char[] arr_c, int v) {
        char[] arr_c1 = this.d;
        if(arr_c1 == null) {
            arr_c1 = q.g.n(this.a);
            this.d = arr_c1;
        }
        if(v + arr_c1.length > arr_c.length) {
            return -1;
        }
        System.arraycopy(arr_c1, 0, arr_c, v, arr_c1.length);
        return arr_c1.length;
    }

    @Override  // com.fasterxml.jackson.core.w
    public int j(OutputStream outputStream0) throws IOException {
        byte[] arr_b = this.c;
        if(arr_b == null) {
            arr_b = q.g.j(this.a);
            this.c = arr_b;
        }
        outputStream0.write(arr_b, 0, arr_b.length);
        return arr_b.length;
    }

    @Override  // com.fasterxml.jackson.core.w
    public int k(ByteBuffer byteBuffer0) {
        byte[] arr_b = this.b;
        if(arr_b == null) {
            arr_b = q.g.o(this.a);
            this.b = arr_b;
        }
        if(arr_b.length > byteBuffer0.remaining()) {
            return -1;
        }
        byteBuffer0.put(arr_b, 0, arr_b.length);
        return arr_b.length;
    }

    @Override  // com.fasterxml.jackson.core.w
    public final byte[] l() {
        byte[] arr_b = this.c;
        if(arr_b == null) {
            arr_b = q.g.j(this.a);
            this.c = arr_b;
        }
        return arr_b;
    }

    private void m(ObjectInputStream objectInputStream0) throws IOException {
        this.e = objectInputStream0.readUTF();
    }

    protected Object n() {
        return new q(this.e);
    }

    private void o(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.writeUTF(this.a);
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

