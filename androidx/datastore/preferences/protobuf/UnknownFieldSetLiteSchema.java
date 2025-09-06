package androidx.datastore.preferences.protobuf;

import java.io.IOException;

class UnknownFieldSetLiteSchema extends UnknownFieldSchema {
    UnknownFieldSetLite A(Object object0) {
        return ((GeneratedMessageLite)object0).unknownFields;
    }

    int B(UnknownFieldSetLite unknownFieldSetLite0) {
        return unknownFieldSetLite0.f();
    }

    int C(UnknownFieldSetLite unknownFieldSetLite0) {
        return unknownFieldSetLite0.g();
    }

    UnknownFieldSetLite D(UnknownFieldSetLite unknownFieldSetLite0, UnknownFieldSetLite unknownFieldSetLite1) {
        return unknownFieldSetLite1.equals(UnknownFieldSetLite.e()) ? unknownFieldSetLite0 : UnknownFieldSetLite.o(unknownFieldSetLite0, unknownFieldSetLite1);
    }

    UnknownFieldSetLite E() {
        return UnknownFieldSetLite.p();
    }

    void F(Object object0, UnknownFieldSetLite unknownFieldSetLite0) {
        this.G(object0, unknownFieldSetLite0);
    }

    void G(Object object0, UnknownFieldSetLite unknownFieldSetLite0) {
        ((GeneratedMessageLite)object0).unknownFields = unknownFieldSetLite0;
    }

    UnknownFieldSetLite H(UnknownFieldSetLite unknownFieldSetLite0) {
        unknownFieldSetLite0.j();
        return unknownFieldSetLite0;
    }

    void I(UnknownFieldSetLite unknownFieldSetLite0, Writer writer0) throws IOException {
        unknownFieldSetLite0.t(writer0);
    }

    void J(UnknownFieldSetLite unknownFieldSetLite0, Writer writer0) throws IOException {
        unknownFieldSetLite0.w(writer0);
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void a(Object object0, int v, int v1) {
        this.u(((UnknownFieldSetLite)object0), v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void b(Object object0, int v, long v1) {
        this.v(((UnknownFieldSetLite)object0), v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void c(Object object0, int v, Object object1) {
        this.w(((UnknownFieldSetLite)object0), v, ((UnknownFieldSetLite)object1));
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void d(Object object0, int v, ByteString byteString0) {
        this.x(((UnknownFieldSetLite)object0), v, byteString0);
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void e(Object object0, int v, long v1) {
        this.y(((UnknownFieldSetLite)object0), v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    Object f(Object object0) {
        return this.z(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    Object g(Object object0) {
        return this.A(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    int h(Object object0) {
        return this.B(((UnknownFieldSetLite)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    int i(Object object0) {
        return this.C(((UnknownFieldSetLite)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void j(Object object0) {
        this.A(object0).j();
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    Object k(Object object0, Object object1) {
        return this.D(((UnknownFieldSetLite)object0), ((UnknownFieldSetLite)object1));
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    Object n() {
        return this.E();
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void o(Object object0, Object object1) {
        this.F(object0, ((UnknownFieldSetLite)object1));
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void p(Object object0, Object object1) {
        this.G(object0, ((UnknownFieldSetLite)object1));
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    boolean q(Reader reader0) {
        return false;
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    Object r(Object object0) {
        return this.H(((UnknownFieldSetLite)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void s(Object object0, Writer writer0) throws IOException {
        this.I(((UnknownFieldSetLite)object0), writer0);
    }

    @Override  // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void t(Object object0, Writer writer0) throws IOException {
        this.J(((UnknownFieldSetLite)object0), writer0);
    }

    void u(UnknownFieldSetLite unknownFieldSetLite0, int v, int v1) {
        unknownFieldSetLite0.r(v << 3 | 5, v1);
    }

    void v(UnknownFieldSetLite unknownFieldSetLite0, int v, long v1) {
        unknownFieldSetLite0.r(v << 3 | 1, v1);
    }

    void w(UnknownFieldSetLite unknownFieldSetLite0, int v, UnknownFieldSetLite unknownFieldSetLite1) {
        unknownFieldSetLite0.r(WireFormat.c(v, 3), unknownFieldSetLite1);
    }

    void x(UnknownFieldSetLite unknownFieldSetLite0, int v, ByteString byteString0) {
        unknownFieldSetLite0.r(v << 3 | 2, byteString0);
    }

    void y(UnknownFieldSetLite unknownFieldSetLite0, int v, long v1) {
        unknownFieldSetLite0.r(v << 3, v1);
    }

    UnknownFieldSetLite z(Object object0) {
        UnknownFieldSetLite unknownFieldSetLite0 = this.A(object0);
        if(unknownFieldSetLite0 == UnknownFieldSetLite.e()) {
            unknownFieldSetLite0 = UnknownFieldSetLite.p();
            this.G(object0, unknownFieldSetLite0);
        }
        return unknownFieldSetLite0;
    }
}

