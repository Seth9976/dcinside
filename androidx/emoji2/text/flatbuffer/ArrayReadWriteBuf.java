package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;

public class ArrayReadWriteBuf implements ReadWriteBuf {
    private byte[] a;
    private int b;

    public ArrayReadWriteBuf() {
        this(10);
    }

    public ArrayReadWriteBuf(int v) {
        this(new byte[v]);
    }

    public ArrayReadWriteBuf(byte[] arr_b) {
        this.a = arr_b;
        this.b = 0;
    }

    public ArrayReadWriteBuf(byte[] arr_b, int v) {
        this.a = arr_b;
        this.b = v;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void a(float f) {
        this.setFloat(this.b, f);
        this.b += 4;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void b(int v) {
        this.setInt(this.b, v);
        this.b += 4;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void c(long v) {
        this.setLong(this.b, v);
        this.b += 8;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void d(double f) {
        this.setDouble(this.b, f);
        this.b += 8;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void e(short v) {
        this.o(this.b, v);
        this.b += 2;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void f(boolean z) {
        this.setBoolean(this.b, z);
        ++this.b;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] g() {
        return this.a;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int v) {
        return this.a[v];
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int v) {
        return this.a[v] != 0;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int v) {
        return Double.longBitsToDouble(this.getLong(v));
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int v) {
        return Float.intBitsToFloat(this.getInt(v));
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int v) {
        return this.a[v] & 0xFF | (this.a[v + 3] << 24 | (this.a[v + 2] & 0xFF) << 16 | (this.a[v + 1] & 0xFF) << 8);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int v) {
        return ((long)this.a[v]) & 0xFFL | (((long)this.a[v + 1]) & 0xFFL) << 8 | (((long)this.a[v + 2]) & 0xFFL) << 16 | (((long)this.a[v + 3]) & 0xFFL) << 24 | (((long)this.a[v + 4]) & 0xFFL) << 0x20 | (((long)this.a[v + 5]) & 0xFFL) << 40 | (((long)this.a[v + 6]) & 0xFFL) << 0x30 | ((long)this.a[v + 7]) << 56;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int v) {
        return (short)(this.a[v] & 0xFF | this.a[v + 1] << 8);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void h(byte b) {
        this.k(this.b, b);
        ++this.b;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void i(byte[] arr_b, int v, int v1) {
        this.m(this.b, arr_b, v, v1);
        this.b += v1;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean j(int v) {
        byte[] arr_b = this.a;
        if(arr_b.length > v) {
            return true;
        }
        this.a = Arrays.copyOf(arr_b, arr_b.length + (arr_b.length >> 1));
        return true;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void k(int v, byte b) {
        this.j(v + 1);
        this.a[v] = b;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int l() {
        return this.b;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int limit() {
        return this.b;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void m(int v, byte[] arr_b, int v1, int v2) {
        this.j(v2 - v1 + v);
        System.arraycopy(arr_b, v1, this.a, v, v2);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public String n(int v, int v1) {
        return Utf8Safe.g(this.a, v, v1);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void o(int v, short v1) {
        this.j(v + 2);
        byte[] arr_b = this.a;
        arr_b[v] = (byte)(v1 & 0xFF);
        arr_b[v + 1] = (byte)(v1 >> 8 & 0xFF);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int v, boolean z) {
        this.k(v, ((byte)z));
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int v, double f) {
        this.j(v + 8);
        long v1 = Double.doubleToRawLongBits(f);
        byte[] arr_b = this.a;
        arr_b[v] = (byte)(((int)v1) & 0xFF);
        arr_b[v + 1] = (byte)(((int)v1) >> 8 & 0xFF);
        arr_b[v + 2] = (byte)(((int)v1) >> 16 & 0xFF);
        arr_b[v + 3] = (byte)(((int)v1) >> 24 & 0xFF);
        arr_b[v + 4] = (byte)(((int)(v1 >> 0x20)) & 0xFF);
        arr_b[v + 5] = (byte)(((int)(v1 >> 0x20)) >> 8 & 0xFF);
        arr_b[v + 6] = (byte)(((int)(v1 >> 0x20)) >> 16 & 0xFF);
        arr_b[v + 7] = (byte)(((int)(v1 >> 0x20)) >> 24 & 0xFF);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int v, float f) {
        this.j(v + 4);
        int v1 = Float.floatToRawIntBits(f);
        byte[] arr_b = this.a;
        arr_b[v] = (byte)(v1 & 0xFF);
        arr_b[v + 1] = (byte)(v1 >> 8 & 0xFF);
        arr_b[v + 2] = (byte)(v1 >> 16 & 0xFF);
        arr_b[v + 3] = (byte)(v1 >> 24 & 0xFF);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int v, int v1) {
        this.j(v + 4);
        byte[] arr_b = this.a;
        arr_b[v] = (byte)(v1 & 0xFF);
        arr_b[v + 1] = (byte)(v1 >> 8 & 0xFF);
        arr_b[v + 2] = (byte)(v1 >> 16 & 0xFF);
        arr_b[v + 3] = (byte)(v1 >> 24 & 0xFF);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int v, long v1) {
        this.j(v + 8);
        byte[] arr_b = this.a;
        arr_b[v] = (byte)(((int)v1) & 0xFF);
        arr_b[v + 1] = (byte)(((int)v1) >> 8 & 0xFF);
        arr_b[v + 2] = (byte)(((int)v1) >> 16 & 0xFF);
        arr_b[v + 3] = (byte)(((int)v1) >> 24 & 0xFF);
        arr_b[v + 4] = (byte)(((int)(v1 >> 0x20)) & 0xFF);
        arr_b[v + 5] = (byte)(((int)(v1 >> 0x20)) >> 8 & 0xFF);
        arr_b[v + 6] = (byte)(((int)(v1 >> 0x20)) >> 16 & 0xFF);
        arr_b[v + 7] = (byte)(((int)(v1 >> 0x20)) >> 24 & 0xFF);
    }
}

