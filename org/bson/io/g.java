package org.bson.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import org.bson.T;
import org.bson.types.ObjectId;

public abstract class g extends OutputStream implements e {
    @Override  // org.bson.io.e
    public void B2(String s) {
        this.f(s, true);
    }

    public abstract List a();

    public abstract int b(OutputStream arg1) throws IOException;

    public byte[] c() {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(this.size());
            this.b(byteArrayOutputStream0);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("should be impossible", iOException0);
        }
    }

    @Override  // org.bson.io.e
    public void close() {
    }

    @Override  // org.bson.io.e
    public void d(String s) {
        this.i(0);
        int v = this.f(s, false);
        this.writeInt32(this.getPosition() - v - 4, v);
    }

    protected abstract void e(int arg1, int arg2);

    @Override  // org.bson.io.e
    public abstract void e1(int arg1);

    private int f(String s, boolean z) {
        int v = s.length();
        int v2 = 0;
        for(int v1 = 0; v1 < v; v1 += Character.charCount(v3)) {
            int v3 = Character.codePointAt(s, v1);
            if(z && v3 == 0) {
                throw new T(String.format("BSON cstring \'%s\' is not valid because it contains a null character at index %d", s, v1));
            }
            if(v3 < 0x80) {
                this.write(((int)(((byte)v3))));
                ++v2;
            }
            else if(v3 < 0x800) {
                this.write(((int)(((byte)((v3 >> 6) + 0xC0)))));
                this.write(((int)(((byte)((v3 & 0x3F) + 0x80)))));
                v2 += 2;
            }
            else if(v3 < 0x10000) {
                this.write(((int)(((byte)((v3 >> 12) + 0xE0)))));
                this.write(((int)(((byte)((v3 >> 6 & 0x3F) + 0x80)))));
                this.write(((int)(((byte)((v3 & 0x3F) + 0x80)))));
                v2 += 3;
            }
            else {
                this.write(((int)(((byte)((v3 >> 18) + 0xF0)))));
                this.write(((int)(((byte)((v3 >> 12 & 0x3F) + 0x80)))));
                this.write(((int)(((byte)((v3 >> 6 & 0x3F) + 0x80)))));
                this.write(((int)(((byte)((v3 & 0x3F) + 0x80)))));
                v2 += 4;
            }
        }
        this.write(0);
        return v2 + 1;
    }

    @Override  // org.bson.io.e
    public void h(int v) {
        this.write(v);
        this.write(v >> 8);
        this.write(v >> 16);
        this.write(v >> 24);
    }

    public void i(int v) {
        this.h(v);
    }

    public void j(long v) {
        this.r(v);
    }

    @Override  // org.bson.io.e
    public void l(ObjectId objectId0) {
        this.write(new byte[]{104, -69, 37, -105, 0x7B, -54, 0x70, 86, -42, -73, 86, 88});
    }

    @Override  // org.bson.io.e
    public void r(long v) {
        this.write(((int)(((byte)(((int)(v & 0xFFL)))))));
        this.write(((int)(((byte)(((int)(v >> 8 & 0xFFL)))))));
        this.write(((int)(((byte)(((int)(v >> 16 & 0xFFL)))))));
        this.write(((int)(((byte)(((int)(v >> 24 & 0xFFL)))))));
        this.write(((int)(((byte)(((int)(v >> 0x20 & 0xFFL)))))));
        this.write(((int)(((byte)(((int)(v >> 40 & 0xFFL)))))));
        this.write(((int)(((byte)(((int)(v >> 0x30 & 0xFFL)))))));
        this.write(((int)(((byte)(((int)(v >> 56 & 0xFFL)))))));
    }

    public int size() {
        return this.getSize();
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " size: " + this.size() + " pos: " + this.getPosition();
    }

    @Override
    public void write(int v) {
        this.writeByte(v);
    }

    @Override
    public void write(byte[] arr_b) {
        this.write(arr_b, 0, arr_b.length);
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) {
        this.h3(arr_b, v, v1);
    }

    @Override  // org.bson.io.e
    public void writeBytes(byte[] arr_b) {
        this.h3(arr_b, 0, arr_b.length);
    }

    @Override  // org.bson.io.e
    public void writeDouble(double f) {
        this.j(Double.doubleToRawLongBits(f));
    }

    @Override  // org.bson.io.e
    public void writeInt32(int v, int v1) {
        this.e(v, v1);
        this.e(v + 1, v1 >> 8);
        this.e(v + 2, v1 >> 16);
        this.e(v + 3, v1 >> 24);
    }
}

