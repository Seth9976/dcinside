package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class ListValue extends GeneratedMessageLite implements ListValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements ListValueOrBuilder {
        private Builder() {
            super(ListValue.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.ListValue.1 listValue$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public Value getValues(int v) {
            return ((ListValue)this.b).getValues(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public int getValuesCount() {
            return ((ListValue)this.b).getValuesCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public List getValuesList() {
            return DesugarCollections.unmodifiableList(((ListValue)this.b).getValuesList());
        }

        public Builder k0(Iterable iterable0) {
            this.c0();
            ((ListValue)this.b).b1(iterable0);
            return this;
        }

        public Builder l0(int v, androidx.datastore.preferences.protobuf.Value.Builder value$Builder0) {
            this.c0();
            ((ListValue)this.b).c1(v, value$Builder0);
            return this;
        }

        public Builder m0(int v, Value value0) {
            this.c0();
            ((ListValue)this.b).d1(v, value0);
            return this;
        }

        public Builder n0(androidx.datastore.preferences.protobuf.Value.Builder value$Builder0) {
            this.c0();
            ((ListValue)this.b).e1(value$Builder0);
            return this;
        }

        public Builder o0(Value value0) {
            this.c0();
            ((ListValue)this.b).f1(value0);
            return this;
        }

        public Builder p0() {
            this.c0();
            ((ListValue)this.b).g1();
            return this;
        }

        public Builder q0(int v) {
            this.c0();
            ((ListValue)this.b).B1(v);
            return this;
        }

        public Builder r0(int v, androidx.datastore.preferences.protobuf.Value.Builder value$Builder0) {
            this.c0();
            ((ListValue)this.b).C1(v, value$Builder0);
            return this;
        }

        public Builder s0(int v, Value value0) {
            this.c0();
            ((ListValue)this.b).D1(v, value0);
            return this;
        }
    }

    private static final ListValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private ProtobufList values_;

    static {
        ListValue listValue0 = new ListValue();
        ListValue.DEFAULT_INSTANCE = listValue0;
        GeneratedMessageLite.P0(ListValue.class, listValue0);
    }

    private ListValue() {
        this.values_ = GeneratedMessageLite.b0();
    }

    public static Parser A1() {
        return ListValue.DEFAULT_INSTANCE.getParserForType();
    }

    private void B1(int v) {
        this.h1();
        this.values_.remove(v);
    }

    private void C1(int v, androidx.datastore.preferences.protobuf.Value.Builder value$Builder0) {
        this.h1();
        this.values_.set(v, value$Builder0.Y());
    }

    private void D1(int v, Value value0) {
        value0.getClass();
        this.h1();
        this.values_.set(v, value0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new ListValue();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(ListValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"values_", Value.class});
            }
            case 4: {
                return ListValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = ListValue.PARSER;
                if(parser0 == null) {
                    Class class0 = ListValue.class;
                    synchronized(class0) {
                        parser0 = ListValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(ListValue.DEFAULT_INSTANCE);
                            ListValue.PARSER = parser0;
                        }
                    }
                }
                return parser0;
            }
            case 6: {
                return (byte)1;
            }
            case 7: {
                return null;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    private void b1(Iterable iterable0) {
        this.h1();
        AbstractMessageLite.G(iterable0, this.values_);
    }

    private void c1(int v, androidx.datastore.preferences.protobuf.Value.Builder value$Builder0) {
        this.h1();
        this.values_.add(v, value$Builder0.Y());
    }

    private void d1(int v, Value value0) {
        value0.getClass();
        this.h1();
        this.values_.add(v, value0);
    }

    private void e1(androidx.datastore.preferences.protobuf.Value.Builder value$Builder0) {
        this.h1();
        this.values_.add(value$Builder0.Y());
    }

    private void f1(Value value0) {
        value0.getClass();
        this.h1();
        this.values_.add(value0);
    }

    private void g1() {
        this.values_ = GeneratedMessageLite.b0();
    }

    @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public Value getValues(int v) {
        return (Value)this.values_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public List getValuesList() {
        return this.values_;
    }

    private void h1() {
        if(!this.values_.isModifiable()) {
            this.values_ = GeneratedMessageLite.r0(this.values_);
        }
    }

    public static ListValue i1() {
        return ListValue.DEFAULT_INSTANCE;
    }

    public ValueOrBuilder j1(int v) {
        return (ValueOrBuilder)this.values_.get(v);
    }

    public List k1() {
        return this.values_;
    }

    public static Builder m1() {
        return (Builder)ListValue.DEFAULT_INSTANCE.R();
    }

    public static Builder n1(ListValue listValue0) {
        return (Builder)ListValue.DEFAULT_INSTANCE.S(listValue0);
    }

    public static ListValue o1(InputStream inputStream0) throws IOException {
        return (ListValue)GeneratedMessageLite.w0(ListValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static ListValue p1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (ListValue)GeneratedMessageLite.x0(ListValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static ListValue q1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.y0(ListValue.DEFAULT_INSTANCE, byteString0);
    }

    public static ListValue r1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.z0(ListValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static ListValue s1(CodedInputStream codedInputStream0) throws IOException {
        return (ListValue)GeneratedMessageLite.A0(ListValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static ListValue t1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (ListValue)GeneratedMessageLite.B0(ListValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static ListValue u1(InputStream inputStream0) throws IOException {
        return (ListValue)GeneratedMessageLite.C0(ListValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static ListValue v1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (ListValue)GeneratedMessageLite.D0(ListValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static ListValue w1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.E0(ListValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static ListValue x1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.F0(ListValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static ListValue y1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.G0(ListValue.DEFAULT_INSTANCE, arr_b);
    }

    public static ListValue z1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.H0(ListValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }
}

