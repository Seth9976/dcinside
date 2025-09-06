package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public final class Struct extends GeneratedMessageLite implements StructOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements StructOrBuilder {
        private Builder() {
            super(Struct.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Struct.1 struct$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        public boolean containsFields(String s) {
            s.getClass();
            return ((Struct)this.b).getFieldsMap().containsKey(s);
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        @Deprecated
        public Map getFields() {
            return this.getFieldsMap();
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        public int getFieldsCount() {
            return ((Struct)this.b).getFieldsMap().size();
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Map getFieldsMap() {
            return DesugarCollections.unmodifiableMap(((Struct)this.b).getFieldsMap());
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value getFieldsOrThrow(String s) {
            s.getClass();
            Map map0 = ((Struct)this.b).getFieldsMap();
            if(!map0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (Value)map0.get(s);
        }

        public Builder k0() {
            this.c0();
            ((Struct)this.b).U0().clear();
            return this;
        }

        public Builder l0(Map map0) {
            this.c0();
            ((Struct)this.b).U0().putAll(map0);
            return this;
        }

        public Builder m0(String s, Value value0) {
            s.getClass();
            value0.getClass();
            this.c0();
            ((Struct)this.b).U0().put(s, value0);
            return this;
        }

        public Builder n0(String s) {
            s.getClass();
            this.c0();
            ((Struct)this.b).U0().remove(s);
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value t(String s, Value value0) {
            s.getClass();
            Map map0 = ((Struct)this.b).getFieldsMap();
            return map0.containsKey(s) ? ((Value)map0.get(s)) : value0;
        }
    }

    static final class FieldsDefaultEntryHolder {
        static final MapEntryLite a;

        static {
            Value value0 = Value.t1();
            FieldsDefaultEntryHolder.a = MapEntryLite.f(FieldType.k, "", FieldType.m, value0);
        }
    }

    private static final Struct DEFAULT_INSTANCE = null;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private MapFieldLite fields_;

    static {
        Struct struct0 = new Struct();
        Struct.DEFAULT_INSTANCE = struct0;
        GeneratedMessageLite.P0(Struct.class, struct0);
    }

    private Struct() {
        this.fields_ = MapFieldLite.f();
    }

    public static Struct T0() {
        return Struct.DEFAULT_INSTANCE;
    }

    private Map U0() {
        return this.W0();
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Struct();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Struct.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", FieldsDefaultEntryHolder.a});
            }
            case 4: {
                return Struct.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Struct.PARSER;
                if(parser0 == null) {
                    Class class0 = Struct.class;
                    synchronized(class0) {
                        parser0 = Struct.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Struct.DEFAULT_INSTANCE);
                            Struct.PARSER = parser0;
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

    private MapFieldLite V0() {
        return this.fields_;
    }

    private MapFieldLite W0() {
        if(!this.fields_.l()) {
            this.fields_ = this.fields_.q();
        }
        return this.fields_;
    }

    public static Builder X0() {
        return (Builder)Struct.DEFAULT_INSTANCE.R();
    }

    public static Builder Y0(Struct struct0) {
        return (Builder)Struct.DEFAULT_INSTANCE.S(struct0);
    }

    public static Struct Z0(InputStream inputStream0) throws IOException {
        return (Struct)GeneratedMessageLite.w0(Struct.DEFAULT_INSTANCE, inputStream0);
    }

    public static Struct a1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Struct)GeneratedMessageLite.x0(Struct.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Struct b1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.y0(Struct.DEFAULT_INSTANCE, byteString0);
    }

    public static Struct c1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.z0(Struct.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    public boolean containsFields(String s) {
        s.getClass();
        return this.V0().containsKey(s);
    }

    public static Struct d1(CodedInputStream codedInputStream0) throws IOException {
        return (Struct)GeneratedMessageLite.A0(Struct.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Struct e1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Struct)GeneratedMessageLite.B0(Struct.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Struct f1(InputStream inputStream0) throws IOException {
        return (Struct)GeneratedMessageLite.C0(Struct.DEFAULT_INSTANCE, inputStream0);
    }

    public static Struct g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Struct)GeneratedMessageLite.D0(Struct.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    @Deprecated
    public Map getFields() {
        return this.getFieldsMap();
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    public int getFieldsCount() {
        return this.V0().size();
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Map getFieldsMap() {
        return DesugarCollections.unmodifiableMap(this.V0());
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value getFieldsOrThrow(String s) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.V0();
        if(!mapFieldLite0.containsKey(s)) {
            throw new IllegalArgumentException();
        }
        return (Value)mapFieldLite0.get(s);
    }

    public static Struct h1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.E0(Struct.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Struct i1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.F0(Struct.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Struct j1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.G0(Struct.DEFAULT_INSTANCE, arr_b);
    }

    public static Struct k1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.H0(Struct.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser m1() {
        return Struct.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value t(String s, Value value0) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.V0();
        return mapFieldLite0.containsKey(s) ? ((Value)mapFieldLite0.get(s)) : value0;
    }
}

