package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class MetadataItem extends Table {
    public static final class Vector extends BaseVector {
        public Vector f(int v, int v1, ByteBuffer byteBuffer0) {
            this.b(v, v1, byteBuffer0);
            return this;
        }

        public MetadataItem g(int v) {
            return this.h(new MetadataItem(), v);
        }

        public MetadataItem h(MetadataItem metadataItem0, int v) {
            return metadataItem0.v(Table.c(this.a(v), this.d), this.d);
        }
    }

    public static void A(FlatBufferBuilder flatBufferBuilder0, boolean z) {
        flatBufferBuilder0.b(1, z, false);
    }

    public static void B(FlatBufferBuilder flatBufferBuilder0, short v) {
        flatBufferBuilder0.p(5, v, 0);
    }

    public static void C(FlatBufferBuilder flatBufferBuilder0, int v) {
        flatBufferBuilder0.k(0, v, 0);
    }

    public static void D(FlatBufferBuilder flatBufferBuilder0, short v) {
        flatBufferBuilder0.p(2, v, 0);
    }

    public static void E(FlatBufferBuilder flatBufferBuilder0, short v) {
        flatBufferBuilder0.p(4, v, 0);
    }

    public int F(int v) {
        int v1 = this.d(16);
        return v1 == 0 ? 0 : this.b.getInt(this.l(v1) + v * 4);
    }

    public ByteBuffer G() {
        return this.m(16, 4);
    }

    public ByteBuffer H(ByteBuffer byteBuffer0) {
        return this.n(byteBuffer0, 16, 4);
    }

    public int I() {
        int v = this.d(16);
        return v == 0 ? 0 : this.o(v);
    }

    public IntVector J() {
        return this.K(new IntVector());
    }

    public IntVector K(IntVector intVector0) {
        int v = this.d(16);
        return v == 0 ? null : intVector0.f(this.l(v), this.b);
    }

    public short L() {
        int v = this.d(10);
        return v == 0 ? 0 : this.b.getShort(v + this.a);
    }

    public static int M(FlatBufferBuilder flatBufferBuilder0, int[] arr_v) {
        flatBufferBuilder0.h0(4, arr_v.length, 4);
        for(int v = arr_v.length - 1; v >= 0; --v) {
            flatBufferBuilder0.j(arr_v[v]);
        }
        return flatBufferBuilder0.E();
    }

    public static int N(FlatBufferBuilder flatBufferBuilder0, int v, boolean z, short v1, short v2, short v3, short v4, int v5) {
        flatBufferBuilder0.g0(7);
        MetadataItem.y(flatBufferBuilder0, v5);
        MetadataItem.C(flatBufferBuilder0, v);
        MetadataItem.B(flatBufferBuilder0, v4);
        MetadataItem.E(flatBufferBuilder0, v3);
        MetadataItem.z(flatBufferBuilder0, v2);
        MetadataItem.D(flatBufferBuilder0, v1);
        MetadataItem.A(flatBufferBuilder0, z);
        return MetadataItem.P(flatBufferBuilder0);
    }

    public boolean O() {
        int v = this.d(6);
        return v != 0 && this.b.get(v + this.a) != 0;
    }

    public static int P(FlatBufferBuilder flatBufferBuilder0) {
        return flatBufferBuilder0.D();
    }

    public static MetadataItem Q(ByteBuffer byteBuffer0) {
        return MetadataItem.R(byteBuffer0, new MetadataItem());
    }

    public static MetadataItem R(ByteBuffer byteBuffer0, MetadataItem metadataItem0) {
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        return metadataItem0.v(byteBuffer0.getInt(byteBuffer0.position()) + byteBuffer0.position(), byteBuffer0);
    }

    public short S() {
        int v = this.d(14);
        return v == 0 ? 0 : this.b.getShort(v + this.a);
    }

    public int T() {
        int v = this.d(4);
        return v == 0 ? 0 : this.b.getInt(v + this.a);
    }

    public short U() {
        int v = this.d(8);
        return v == 0 ? 0 : this.b.getShort(v + this.a);
    }

    public static void V(FlatBufferBuilder flatBufferBuilder0, int v) {
        flatBufferBuilder0.h0(4, v, 4);
    }

    public static void W(FlatBufferBuilder flatBufferBuilder0) {
        flatBufferBuilder0.g0(7);
    }

    public short X() {
        int v = this.d(12);
        return v == 0 ? 0 : this.b.getShort(v + this.a);
    }

    public static void u() {
    }

    public MetadataItem v(int v, ByteBuffer byteBuffer0) {
        this.w(v, byteBuffer0);
        return this;
    }

    public void w(int v, ByteBuffer byteBuffer0) {
        this.g(v, byteBuffer0);
    }

    public static void y(FlatBufferBuilder flatBufferBuilder0, int v) {
        flatBufferBuilder0.o(6, v, 0);
    }

    public static void z(FlatBufferBuilder flatBufferBuilder0, short v) {
        flatBufferBuilder0.p(3, v, 0);
    }
}

