package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class FieldMask extends GeneratedMessageLite implements FieldMaskOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements FieldMaskOrBuilder {
        private Builder() {
            super(FieldMask.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.FieldMask.1 fieldMask$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public String getPaths(int v) {
            return ((FieldMask)this.b).getPaths(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public ByteString getPathsBytes(int v) {
            return ((FieldMask)this.b).getPathsBytes(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public int getPathsCount() {
            return ((FieldMask)this.b).getPathsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public List getPathsList() {
            return DesugarCollections.unmodifiableList(((FieldMask)this.b).getPathsList());
        }

        public Builder k0(Iterable iterable0) {
            this.c0();
            ((FieldMask)this.b).X0(iterable0);
            return this;
        }

        public Builder l0(String s) {
            this.c0();
            ((FieldMask)this.b).Y0(s);
            return this;
        }

        public Builder m0(ByteString byteString0) {
            this.c0();
            ((FieldMask)this.b).Z0(byteString0);
            return this;
        }

        public Builder n0() {
            this.c0();
            ((FieldMask)this.b).a1();
            return this;
        }

        public Builder o0(int v, String s) {
            this.c0();
            ((FieldMask)this.b).t1(v, s);
            return this;
        }
    }

    private static final FieldMask DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private ProtobufList paths_;

    static {
        FieldMask fieldMask0 = new FieldMask();
        FieldMask.DEFAULT_INSTANCE = fieldMask0;
        GeneratedMessageLite.P0(FieldMask.class, fieldMask0);
    }

    private FieldMask() {
        this.paths_ = GeneratedMessageLite.b0();
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new FieldMask();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(FieldMask.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            }
            case 4: {
                return FieldMask.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = FieldMask.PARSER;
                if(parser0 == null) {
                    Class class0 = FieldMask.class;
                    synchronized(class0) {
                        parser0 = FieldMask.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(FieldMask.DEFAULT_INSTANCE);
                            FieldMask.PARSER = parser0;
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

    private void X0(Iterable iterable0) {
        this.b1();
        AbstractMessageLite.G(iterable0, this.paths_);
    }

    private void Y0(String s) {
        s.getClass();
        this.b1();
        this.paths_.add(s);
    }

    private void Z0(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.b1();
        this.paths_.add(byteString0.b0());
    }

    private void a1() {
        this.paths_ = GeneratedMessageLite.b0();
    }

    private void b1() {
        if(!this.paths_.isModifiable()) {
            this.paths_ = GeneratedMessageLite.r0(this.paths_);
        }
    }

    public static FieldMask c1() {
        return FieldMask.DEFAULT_INSTANCE;
    }

    public static Builder d1() {
        return (Builder)FieldMask.DEFAULT_INSTANCE.R();
    }

    public static Builder e1(FieldMask fieldMask0) {
        return (Builder)FieldMask.DEFAULT_INSTANCE.S(fieldMask0);
    }

    public static FieldMask f1(InputStream inputStream0) throws IOException {
        return (FieldMask)GeneratedMessageLite.w0(FieldMask.DEFAULT_INSTANCE, inputStream0);
    }

    public static FieldMask g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (FieldMask)GeneratedMessageLite.x0(FieldMask.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public String getPaths(int v) {
        return (String)this.paths_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public ByteString getPathsBytes(int v) {
        return ByteString.r(((String)this.paths_.get(v)));
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public List getPathsList() {
        return this.paths_;
    }

    public static FieldMask h1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.y0(FieldMask.DEFAULT_INSTANCE, byteString0);
    }

    public static FieldMask i1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.z0(FieldMask.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static FieldMask j1(CodedInputStream codedInputStream0) throws IOException {
        return (FieldMask)GeneratedMessageLite.A0(FieldMask.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static FieldMask k1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (FieldMask)GeneratedMessageLite.B0(FieldMask.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static FieldMask m1(InputStream inputStream0) throws IOException {
        return (FieldMask)GeneratedMessageLite.C0(FieldMask.DEFAULT_INSTANCE, inputStream0);
    }

    public static FieldMask n1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (FieldMask)GeneratedMessageLite.D0(FieldMask.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static FieldMask o1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.E0(FieldMask.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static FieldMask p1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.F0(FieldMask.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static FieldMask q1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.G0(FieldMask.DEFAULT_INSTANCE, arr_b);
    }

    public static FieldMask r1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.H0(FieldMask.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser s1() {
        return FieldMask.DEFAULT_INSTANCE.getParserForType();
    }

    private void t1(int v, String s) {
        s.getClass();
        this.b1();
        this.paths_.set(v, s);
    }
}

