package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class r extends GeneratedMessageLite implements s {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite implements c {
        public static final class com.google.api.r.b.a extends Builder implements c {
            private com.google.api.r.b.a() {
                super(b.DEFAULT_INSTANCE);
            }

            com.google.api.r.b.a(a r$a0) {
            }

            @Override  // com.google.api.r$c
            public String A() {
                return ((b)this.instance).A();
            }

            public com.google.api.r.b.a Ab(String s) {
                this.copyOnWrite();
                ((b)this.instance).Db(s);
                return this;
            }

            public com.google.api.r.b.a Bb(ByteString byteString0) {
                this.copyOnWrite();
                ((b)this.instance).Eb(byteString0);
                return this;
            }

            @Override  // com.google.api.r$c
            public ByteString V0(int v) {
                return ((b)this.instance).V0(v);
            }

            @Override  // com.google.api.r$c
            public String getMetrics(int v) {
                return ((b)this.instance).getMetrics(v);
            }

            @Override  // com.google.api.r$c
            public int getMetricsCount() {
                return ((b)this.instance).getMetricsCount();
            }

            @Override  // com.google.api.r$c
            public List getMetricsList() {
                return DesugarCollections.unmodifiableList(((b)this.instance).getMetricsList());
            }

            public com.google.api.r.b.a ub(Iterable iterable0) {
                this.copyOnWrite();
                ((b)this.instance).addAllMetrics(iterable0);
                return this;
            }

            public com.google.api.r.b.a vb(String s) {
                this.copyOnWrite();
                ((b)this.instance).A6(s);
                return this;
            }

            public com.google.api.r.b.a wb(ByteString byteString0) {
                this.copyOnWrite();
                ((b)this.instance).B6(byteString0);
                return this;
            }

            public com.google.api.r.b.a xb() {
                this.copyOnWrite();
                ((b)this.instance).clearMetrics();
                return this;
            }

            @Override  // com.google.api.r$c
            public ByteString y() {
                return ((b)this.instance).y();
            }

            public com.google.api.r.b.a yb() {
                this.copyOnWrite();
                ((b)this.instance).M6();
                return this;
            }

            public com.google.api.r.b.a zb(int v, String s) {
                this.copyOnWrite();
                ((b)this.instance).Cb(v, s);
                return this;
            }
        }

        private static final b DEFAULT_INSTANCE = null;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile Parser PARSER;
        private ProtobufList metrics_;
        private String monitoredResource_;

        static {
            b r$b0 = new b();
            b.DEFAULT_INSTANCE = r$b0;
            GeneratedMessageLite.registerDefaultInstance(b.class, r$b0);
        }

        private b() {
            this.monitoredResource_ = "";
            this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.api.r$c
        public String A() {
            return this.monitoredResource_;
        }

        private void A6(String s) {
            s.getClass();
            this.ensureMetricsIsMutable();
            this.metrics_.add(s);
        }

        public static com.google.api.r.b.a A8(b r$b0) {
            return (com.google.api.r.b.a)b.DEFAULT_INSTANCE.createBuilder(r$b0);
        }

        public static b Ab(byte[] arr_b) throws InvalidProtocolBufferException {
            return (b)GeneratedMessageLite.parseFrom(b.DEFAULT_INSTANCE, arr_b);
        }

        private void B6(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.ensureMetricsIsMutable();
            this.metrics_.add(byteString0.toStringUtf8());
        }

        public static b Bb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (b)GeneratedMessageLite.parseFrom(b.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        private void Cb(int v, String s) {
            s.getClass();
            this.ensureMetricsIsMutable();
            this.metrics_.set(v, s);
        }

        private void Db(String s) {
            s.getClass();
            this.monitoredResource_ = s;
        }

        private void Eb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.monitoredResource_ = byteString0.toStringUtf8();
        }

        public static b Ja(ByteString byteString0) throws InvalidProtocolBufferException {
            return (b)GeneratedMessageLite.parseFrom(b.DEFAULT_INSTANCE, byteString0);
        }

        public static b La(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (b)GeneratedMessageLite.parseFrom(b.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        private void M6() {
            this.monitoredResource_ = "";
        }

        @Override  // com.google.api.r$c
        public ByteString V0(int v) {
            return ByteString.copyFromUtf8(((String)this.metrics_.get(v)));
        }

        public static b Z7() {
            return b.DEFAULT_INSTANCE;
        }

        private void addAllMetrics(Iterable iterable0) {
            this.ensureMetricsIsMutable();
            AbstractMessageLite.addAll(iterable0, this.metrics_);
        }

        public static b ca(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (b)GeneratedMessageLite.parseDelimitedFrom(b.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        private void clearMetrics() {
            this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new b();
                }
                case 2: {
                    return new com.google.api.r.b.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(b.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                }
                case 4: {
                    return b.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = b.PARSER;
                    if(parser0 == null) {
                        Class class0 = b.class;
                        synchronized(class0) {
                            parser0 = b.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(b.DEFAULT_INSTANCE);
                                b.PARSER = parser0;
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

        private void ensureMetricsIsMutable() {
            ProtobufList internal$ProtobufList0 = this.metrics_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.metrics_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // com.google.api.r$c
        public String getMetrics(int v) {
            return (String)this.metrics_.get(v);
        }

        @Override  // com.google.api.r$c
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override  // com.google.api.r$c
        public List getMetricsList() {
            return this.metrics_;
        }

        public static b j9(InputStream inputStream0) throws IOException {
            return (b)GeneratedMessageLite.parseDelimitedFrom(b.DEFAULT_INSTANCE, inputStream0);
        }

        public static Parser parser() {
            return b.DEFAULT_INSTANCE.getParserForType();
        }

        public static b ub(CodedInputStream codedInputStream0) throws IOException {
            return (b)GeneratedMessageLite.parseFrom(b.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static com.google.api.r.b.a v8() {
            return (com.google.api.r.b.a)b.DEFAULT_INSTANCE.createBuilder();
        }

        public static b vb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (b)GeneratedMessageLite.parseFrom(b.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static b wb(InputStream inputStream0) throws IOException {
            return (b)GeneratedMessageLite.parseFrom(b.DEFAULT_INSTANCE, inputStream0);
        }

        public static b xb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (b)GeneratedMessageLite.parseFrom(b.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        @Override  // com.google.api.r$c
        public ByteString y() {
            return ByteString.copyFromUtf8(this.monitoredResource_);
        }

        public static b yb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (b)GeneratedMessageLite.parseFrom(b.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static b zb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (b)GeneratedMessageLite.parseFrom(b.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }
    }

    public interface c extends MessageLiteOrBuilder {
        String A();

        ByteString V0(int arg1);

        String getMetrics(int arg1);

        int getMetricsCount();

        List getMetricsList();

        ByteString y();
    }

    public static final class d extends Builder implements s {
        private d() {
            super(r.DEFAULT_INSTANCE);
        }

        d(a r$a0) {
        }

        public d Ab(int v) {
            this.copyOnWrite();
            ((r)this.instance).Eb(v);
            return this;
        }

        @Override  // com.google.api.s
        public b B(int v) {
            return ((r)this.instance).B(v);
        }

        public d Bb(int v, com.google.api.r.b.a r$b$a0) {
            this.copyOnWrite();
            ((r)this.instance).Fb(v, ((b)r$b$a0.build()));
            return this;
        }

        @Override  // com.google.api.s
        public List C() {
            return DesugarCollections.unmodifiableList(((r)this.instance).C());
        }

        public d Cb(int v, b r$b0) {
            this.copyOnWrite();
            ((r)this.instance).Fb(v, r$b0);
            return this;
        }

        @Override  // com.google.api.s
        public int M() {
            return ((r)this.instance).M();
        }

        public d ub(Iterable iterable0) {
            this.copyOnWrite();
            ((r)this.instance).d6(iterable0);
            return this;
        }

        public d vb(int v, com.google.api.r.b.a r$b$a0) {
            this.copyOnWrite();
            ((r)this.instance).z6(v, ((b)r$b$a0.build()));
            return this;
        }

        public d wb(int v, b r$b0) {
            this.copyOnWrite();
            ((r)this.instance).z6(v, r$b0);
            return this;
        }

        public d xb(com.google.api.r.b.a r$b$a0) {
            this.copyOnWrite();
            ((r)this.instance).A6(((b)r$b$a0.build()));
            return this;
        }

        public d yb(b r$b0) {
            this.copyOnWrite();
            ((r)this.instance).A6(r$b0);
            return this;
        }

        public d zb() {
            this.copyOnWrite();
            ((r)this.instance).B6();
            return this;
        }
    }

    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final r DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    private ProtobufList consumerDestinations_;

    static {
        r r0 = new r();
        r.DEFAULT_INSTANCE = r0;
        GeneratedMessageLite.registerDefaultInstance(r.class, r0);
    }

    private r() {
        this.consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A6(b r$b0) {
        r$b0.getClass();
        this.M6();
        this.consumerDestinations_.add(r$b0);
    }

    public static r A8() {
        return r.DEFAULT_INSTANCE;
    }

    public static r Ab(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, byteBuffer0);
    }

    @Override  // com.google.api.s
    public b B(int v) {
        return (b)this.consumerDestinations_.get(v);
    }

    private void B6() {
        this.consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static r Bb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    @Override  // com.google.api.s
    public List C() {
        return this.consumerDestinations_;
    }

    public static r Cb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, arr_b);
    }

    public static r Db(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Eb(int v) {
        this.M6();
        this.consumerDestinations_.remove(v);
    }

    private void Fb(int v, b r$b0) {
        r$b0.getClass();
        this.M6();
        this.consumerDestinations_.set(v, r$b0);
    }

    public static r Ja(InputStream inputStream0) throws IOException {
        return (r)GeneratedMessageLite.parseDelimitedFrom(r.DEFAULT_INSTANCE, inputStream0);
    }

    public static r La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (r)GeneratedMessageLite.parseDelimitedFrom(r.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.api.s
    public int M() {
        return this.consumerDestinations_.size();
    }

    private void M6() {
        ProtobufList internal$ProtobufList0 = this.consumerDestinations_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public c Z7(int v) {
        return (c)this.consumerDestinations_.get(v);
    }

    public static d ca(r r0) {
        return (d)r.DEFAULT_INSTANCE.createBuilder(r0);
    }

    private void d6(Iterable iterable0) {
        this.M6();
        AbstractMessageLite.addAll(iterable0, this.consumerDestinations_);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new r();
            }
            case 2: {
                return new d(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(r.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001B", new Object[]{"consumerDestinations_", b.class});
            }
            case 4: {
                return r.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = r.PARSER;
                if(parser0 == null) {
                    Class class0 = r.class;
                    synchronized(class0) {
                        parser0 = r.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(r.DEFAULT_INSTANCE);
                            r.PARSER = parser0;
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

    public static d j9() {
        return (d)r.DEFAULT_INSTANCE.createBuilder();
    }

    public static Parser parser() {
        return r.DEFAULT_INSTANCE.getParserForType();
    }

    public static r ub(ByteString byteString0) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, byteString0);
    }

    public List v8() {
        return this.consumerDestinations_;
    }

    public static r vb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static r wb(CodedInputStream codedInputStream0) throws IOException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static r xb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static r yb(InputStream inputStream0) throws IOException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, inputStream0);
    }

    private void z6(int v, b r$b0) {
        r$b0.getClass();
        this.M6();
        this.consumerDestinations_.add(v, r$b0);
    }

    public static r zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

