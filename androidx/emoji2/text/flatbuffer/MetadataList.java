package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class MetadataList extends Table {
    public static final class Vector extends BaseVector {
        public Vector f(int v, int v1, ByteBuffer byteBuffer0) {
            this.b(v, v1, byteBuffer0);
            return this;
        }

        public MetadataList g(int v) {
            return this.h(new MetadataList(), v);
        }

        public MetadataList h(MetadataList metadataList0, int v) {
            return metadataList0.v(Table.c(this.a(v), this.d), this.d);
        }
    }

    public static void A(FlatBufferBuilder flatBufferBuilder0, int v) {
        flatBufferBuilder0.k(0, v, 0);
    }

    public static int B(FlatBufferBuilder flatBufferBuilder0, int[] arr_v) {
        flatBufferBuilder0.h0(4, arr_v.length, 4);
        for(int v = arr_v.length - 1; v >= 0; --v) {
            flatBufferBuilder0.n(arr_v[v]);
        }
        return flatBufferBuilder0.E();
    }

    public static int C(FlatBufferBuilder flatBufferBuilder0, int v, int v1, int v2) {
        flatBufferBuilder0.g0(3);
        MetadataList.z(flatBufferBuilder0, v2);
        MetadataList.y(flatBufferBuilder0, v1);
        MetadataList.A(flatBufferBuilder0, v);
        return MetadataList.D(flatBufferBuilder0);
    }

    public static int D(FlatBufferBuilder flatBufferBuilder0) {
        return flatBufferBuilder0.D();
    }

    public static void E(FlatBufferBuilder flatBufferBuilder0, int v) {
        flatBufferBuilder0.F(v);
    }

    public static void F(FlatBufferBuilder flatBufferBuilder0, int v) {
        flatBufferBuilder0.J(v);
    }

    public static MetadataList G(ByteBuffer byteBuffer0) {
        return MetadataList.H(byteBuffer0, new MetadataList());
    }

    public static MetadataList H(ByteBuffer byteBuffer0, MetadataList metadataList0) {
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        return metadataList0.v(byteBuffer0.getInt(byteBuffer0.position()) + byteBuffer0.position(), byteBuffer0);
    }

    public MetadataItem I(int v) {
        return this.J(new MetadataItem(), v);
    }

    public MetadataItem J(MetadataItem metadataItem0, int v) {
        int v1 = this.d(6);
        return v1 == 0 ? null : metadataItem0.v(this.b(this.l(v1) + v * 4), this.b);
    }

    public int K() {
        int v = this.d(6);
        return v == 0 ? 0 : this.o(v);
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem.Vector L() {
        return this.M(new androidx.emoji2.text.flatbuffer.MetadataItem.Vector());
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem.Vector M(androidx.emoji2.text.flatbuffer.MetadataItem.Vector metadataItem$Vector0) {
        int v = this.d(6);
        return v == 0 ? null : metadataItem$Vector0.f(this.l(v), 4, this.b);
    }

    public String N() {
        int v = this.d(8);
        return v == 0 ? null : this.h(v + this.a);
    }

    public ByteBuffer O() {
        return this.m(8, 1);
    }

    public ByteBuffer P(ByteBuffer byteBuffer0) {
        return this.n(byteBuffer0, 8, 1);
    }

    public static void Q(FlatBufferBuilder flatBufferBuilder0, int v) {
        flatBufferBuilder0.h0(4, v, 4);
    }

    public static void R(FlatBufferBuilder flatBufferBuilder0) {
        flatBufferBuilder0.g0(3);
    }

    public int S() {
        int v = this.d(4);
        return v == 0 ? 0 : this.b.getInt(v + this.a);
    }

    public static void u() {
    }

    public MetadataList v(int v, ByteBuffer byteBuffer0) {
        this.w(v, byteBuffer0);
        return this;
    }

    public void w(int v, ByteBuffer byteBuffer0) {
        this.g(v, byteBuffer0);
    }

    public static void y(FlatBufferBuilder flatBufferBuilder0, int v) {
        flatBufferBuilder0.o(1, v, 0);
    }

    public static void z(FlatBufferBuilder flatBufferBuilder0, int v) {
        flatBufferBuilder0.o(2, v, 0);
    }
}

