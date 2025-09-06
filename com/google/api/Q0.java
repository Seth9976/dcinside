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

public final class q0 extends GeneratedMessageLite implements r0 {
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

    public static final class b extends Builder implements r0 {
        private b() {
            super(q0.DEFAULT_INSTANCE);
        }

        b(a q0$a0) {
        }

        public b Ab(int v, com.google.api.q0.c.a q0$c$a0) {
            this.copyOnWrite();
            ((q0)this.instance).Ja(v, ((c)q0$c$a0.build()));
            return this;
        }

        @Override  // com.google.api.r0
        public c B(int v) {
            return ((q0)this.instance).B(v);
        }

        public b Bb(int v, c q0$c0) {
            this.copyOnWrite();
            ((q0)this.instance).Ja(v, q0$c0);
            return this;
        }

        @Override  // com.google.api.r0
        public List C() {
            return DesugarCollections.unmodifiableList(((q0)this.instance).C());
        }

        public b Cb(com.google.api.q0.c.a q0$c$a0) {
            this.copyOnWrite();
            ((q0)this.instance).La(((c)q0$c$a0.build()));
            return this;
        }

        public b Db(c q0$c0) {
            this.copyOnWrite();
            ((q0)this.instance).La(q0$c0);
            return this;
        }

        public b Eb() {
            this.copyOnWrite();
            ((q0)this.instance).ub();
            return this;
        }

        public b Fb() {
            this.copyOnWrite();
            ((q0)this.instance).vb();
            return this;
        }

        public b Gb(int v) {
            this.copyOnWrite();
            ((q0)this.instance).Rb(v);
            return this;
        }

        public b Hb(int v) {
            this.copyOnWrite();
            ((q0)this.instance).Sb(v);
            return this;
        }

        public b Ib(int v, com.google.api.q0.c.a q0$c$a0) {
            this.copyOnWrite();
            ((q0)this.instance).Tb(v, ((c)q0$c$a0.build()));
            return this;
        }

        public b Jb(int v, c q0$c0) {
            this.copyOnWrite();
            ((q0)this.instance).Tb(v, q0$c0);
            return this;
        }

        public b Kb(int v, com.google.api.q0.c.a q0$c$a0) {
            this.copyOnWrite();
            ((q0)this.instance).Ub(v, ((c)q0$c$a0.build()));
            return this;
        }

        public b Lb(int v, c q0$c0) {
            this.copyOnWrite();
            ((q0)this.instance).Ub(v, q0$c0);
            return this;
        }

        @Override  // com.google.api.r0
        public int M() {
            return ((q0)this.instance).M();
        }

        @Override  // com.google.api.r0
        public c X(int v) {
            return ((q0)this.instance).X(v);
        }

        @Override  // com.google.api.r0
        public int m0() {
            return ((q0)this.instance).m0();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((q0)this.instance).v8(iterable0);
            return this;
        }

        @Override  // com.google.api.r0
        public List v0() {
            return DesugarCollections.unmodifiableList(((q0)this.instance).v0());
        }

        public b vb(Iterable iterable0) {
            this.copyOnWrite();
            ((q0)this.instance).A8(iterable0);
            return this;
        }

        public b wb(int v, com.google.api.q0.c.a q0$c$a0) {
            this.copyOnWrite();
            ((q0)this.instance).j9(v, ((c)q0$c$a0.build()));
            return this;
        }

        public b xb(int v, c q0$c0) {
            this.copyOnWrite();
            ((q0)this.instance).j9(v, q0$c0);
            return this;
        }

        public b yb(com.google.api.q0.c.a q0$c$a0) {
            this.copyOnWrite();
            ((q0)this.instance).ca(((c)q0$c$a0.build()));
            return this;
        }

        public b zb(c q0$c0) {
            this.copyOnWrite();
            ((q0)this.instance).ca(q0$c0);
            return this;
        }
    }

    public static final class c extends GeneratedMessageLite implements d {
        public static final class com.google.api.q0.c.a extends Builder implements d {
            private com.google.api.q0.c.a() {
                super(c.DEFAULT_INSTANCE);
            }

            com.google.api.q0.c.a(a q0$a0) {
            }

            @Override  // com.google.api.q0$d
            public String A() {
                return ((c)this.instance).A();
            }

            @Override  // com.google.api.q0$d
            public List A0() {
                return DesugarCollections.unmodifiableList(((c)this.instance).A0());
            }

            public com.google.api.q0.c.a Ab(String s) {
                this.copyOnWrite();
                ((c)this.instance).Gb(s);
                return this;
            }

            public com.google.api.q0.c.a Bb(ByteString byteString0) {
                this.copyOnWrite();
                ((c)this.instance).Hb(byteString0);
                return this;
            }

            @Override  // com.google.api.q0$d
            public ByteString q6(int v) {
                return ((c)this.instance).q6(v);
            }

            @Override  // com.google.api.q0$d
            public String r0(int v) {
                return ((c)this.instance).r0(v);
            }

            public com.google.api.q0.c.a ub(Iterable iterable0) {
                this.copyOnWrite();
                ((c)this.instance).A6(iterable0);
                return this;
            }

            public com.google.api.q0.c.a vb(String s) {
                this.copyOnWrite();
                ((c)this.instance).B6(s);
                return this;
            }

            public com.google.api.q0.c.a wb(ByteString byteString0) {
                this.copyOnWrite();
                ((c)this.instance).M6(byteString0);
                return this;
            }

            public com.google.api.q0.c.a xb() {
                this.copyOnWrite();
                ((c)this.instance).Z7();
                return this;
            }

            @Override  // com.google.api.q0$d
            public ByteString y() {
                return ((c)this.instance).y();
            }

            @Override  // com.google.api.q0$d
            public int y0() {
                return ((c)this.instance).y0();
            }

            public com.google.api.q0.c.a yb() {
                this.copyOnWrite();
                ((c)this.instance).v8();
                return this;
            }

            public com.google.api.q0.c.a zb(int v, String s) {
                this.copyOnWrite();
                ((c)this.instance).Fb(v, s);
                return this;
            }
        }

        private static final c DEFAULT_INSTANCE = null;
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile Parser PARSER;
        private ProtobufList logs_;
        private String monitoredResource_;

        static {
            c q0$c0 = new c();
            c.DEFAULT_INSTANCE = q0$c0;
            GeneratedMessageLite.registerDefaultInstance(c.class, q0$c0);
        }

        private c() {
            this.monitoredResource_ = "";
            this.logs_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.api.q0$d
        public String A() {
            return this.monitoredResource_;
        }

        @Override  // com.google.api.q0$d
        public List A0() {
            return this.logs_;
        }

        private void A6(Iterable iterable0) {
            this.A8();
            AbstractMessageLite.addAll(iterable0, this.logs_);
        }

        private void A8() {
            ProtobufList internal$ProtobufList0 = this.logs_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.logs_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static c Ab(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        private void B6(String s) {
            s.getClass();
            this.A8();
            this.logs_.add(s);
        }

        public static c Bb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static c Cb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static c Db(byte[] arr_b) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b);
        }

        public static c Eb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        private void Fb(int v, String s) {
            s.getClass();
            this.A8();
            this.logs_.set(v, s);
        }

        private void Gb(String s) {
            s.getClass();
            this.monitoredResource_ = s;
        }

        private void Hb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.monitoredResource_ = byteString0.toStringUtf8();
        }

        public static com.google.api.q0.c.a Ja(c q0$c0) {
            return (com.google.api.q0.c.a)c.DEFAULT_INSTANCE.createBuilder(q0$c0);
        }

        public static c La(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0);
        }

        private void M6(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.A8();
            this.logs_.add(byteString0.toStringUtf8());
        }

        private void Z7() {
            this.logs_ = GeneratedMessageLite.emptyProtobufList();
        }

        public static com.google.api.q0.c.a ca() {
            return (com.google.api.q0.c.a)c.DEFAULT_INSTANCE.createBuilder();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new c();
                }
                case 2: {
                    return new com.google.api.q0.c.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(c.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ț\u0003Ȉ", new Object[]{"logs_", "monitoredResource_"});
                }
                case 4: {
                    return c.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = c.PARSER;
                    if(parser0 == null) {
                        Class class0 = c.class;
                        synchronized(class0) {
                            parser0 = c.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(c.DEFAULT_INSTANCE);
                                c.PARSER = parser0;
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

        public static c j9() {
            return c.DEFAULT_INSTANCE;
        }

        public static Parser parser() {
            return c.DEFAULT_INSTANCE.getParserForType();
        }

        @Override  // com.google.api.q0$d
        public ByteString q6(int v) {
            return ByteString.copyFromUtf8(((String)this.logs_.get(v)));
        }

        @Override  // com.google.api.q0$d
        public String r0(int v) {
            return (String)this.logs_.get(v);
        }

        public static c ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        private void v8() {
            this.monitoredResource_ = c.j9().A();
        }

        public static c vb(ByteString byteString0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0);
        }

        public static c wb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static c xb(CodedInputStream codedInputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0);
        }

        @Override  // com.google.api.q0$d
        public ByteString y() {
            return ByteString.copyFromUtf8(this.monitoredResource_);
        }

        @Override  // com.google.api.q0$d
        public int y0() {
            return this.logs_.size();
        }

        public static c yb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static c zb(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0);
        }
    }

    public interface d extends MessageLiteOrBuilder {
        String A();

        List A0();

        ByteString q6(int arg1);

        String r0(int arg1);

        ByteString y();

        int y0();
    }

    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final q0 DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private ProtobufList consumerDestinations_;
    private ProtobufList producerDestinations_;

    static {
        q0 q00 = new q0();
        q0.DEFAULT_INSTANCE = q00;
        GeneratedMessageLite.registerDefaultInstance(q0.class, q00);
    }

    private q0() {
        this.producerDestinations_ = GeneratedMessageLite.emptyProtobufList();
        this.consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A8(Iterable iterable0) {
        this.xb();
        AbstractMessageLite.addAll(iterable0, this.producerDestinations_);
    }

    public static q0 Ab() {
        return q0.DEFAULT_INSTANCE;
    }

    @Override  // com.google.api.r0
    public c B(int v) {
        return (c)this.consumerDestinations_.get(v);
    }

    public d Bb(int v) {
        return (d)this.producerDestinations_.get(v);
    }

    @Override  // com.google.api.r0
    public List C() {
        return this.consumerDestinations_;
    }

    public List Cb() {
        return this.producerDestinations_;
    }

    public static b Db() {
        return (b)q0.DEFAULT_INSTANCE.createBuilder();
    }

    public static b Eb(q0 q00) {
        return (b)q0.DEFAULT_INSTANCE.createBuilder(q00);
    }

    public static q0 Fb(InputStream inputStream0) throws IOException {
        return (q0)GeneratedMessageLite.parseDelimitedFrom(q0.DEFAULT_INSTANCE, inputStream0);
    }

    public static q0 Gb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (q0)GeneratedMessageLite.parseDelimitedFrom(q0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static q0 Hb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (q0)GeneratedMessageLite.parseFrom(q0.DEFAULT_INSTANCE, byteString0);
    }

    public static q0 Ib(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (q0)GeneratedMessageLite.parseFrom(q0.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void Ja(int v, c q0$c0) {
        q0$c0.getClass();
        this.xb();
        this.producerDestinations_.add(v, q0$c0);
    }

    public static q0 Jb(CodedInputStream codedInputStream0) throws IOException {
        return (q0)GeneratedMessageLite.parseFrom(q0.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static q0 Kb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (q0)GeneratedMessageLite.parseFrom(q0.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    private void La(c q0$c0) {
        q0$c0.getClass();
        this.xb();
        this.producerDestinations_.add(q0$c0);
    }

    public static q0 Lb(InputStream inputStream0) throws IOException {
        return (q0)GeneratedMessageLite.parseFrom(q0.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.api.r0
    public int M() {
        return this.consumerDestinations_.size();
    }

    public static q0 Mb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (q0)GeneratedMessageLite.parseFrom(q0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static q0 Nb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (q0)GeneratedMessageLite.parseFrom(q0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static q0 Ob(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (q0)GeneratedMessageLite.parseFrom(q0.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static q0 Pb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (q0)GeneratedMessageLite.parseFrom(q0.DEFAULT_INSTANCE, arr_b);
    }

    public static q0 Qb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (q0)GeneratedMessageLite.parseFrom(q0.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Rb(int v) {
        this.wb();
        this.consumerDestinations_.remove(v);
    }

    private void Sb(int v) {
        this.xb();
        this.producerDestinations_.remove(v);
    }

    private void Tb(int v, c q0$c0) {
        q0$c0.getClass();
        this.wb();
        this.consumerDestinations_.set(v, q0$c0);
    }

    private void Ub(int v, c q0$c0) {
        q0$c0.getClass();
        this.xb();
        this.producerDestinations_.set(v, q0$c0);
    }

    @Override  // com.google.api.r0
    public c X(int v) {
        return (c)this.producerDestinations_.get(v);
    }

    private void ca(c q0$c0) {
        q0$c0.getClass();
        this.wb();
        this.consumerDestinations_.add(q0$c0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new q0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(q0.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001B", new Object[]{"producerDestinations_", c.class, "consumerDestinations_", c.class});
            }
            case 4: {
                return q0.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = q0.PARSER;
                if(parser0 == null) {
                    Class class0 = q0.class;
                    synchronized(class0) {
                        parser0 = q0.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(q0.DEFAULT_INSTANCE);
                            q0.PARSER = parser0;
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

    private void j9(int v, c q0$c0) {
        q0$c0.getClass();
        this.wb();
        this.consumerDestinations_.add(v, q0$c0);
    }

    @Override  // com.google.api.r0
    public int m0() {
        return this.producerDestinations_.size();
    }

    public static Parser parser() {
        return q0.DEFAULT_INSTANCE.getParserForType();
    }

    private void ub() {
        this.consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // com.google.api.r0
    public List v0() {
        return this.producerDestinations_;
    }

    private void v8(Iterable iterable0) {
        this.wb();
        AbstractMessageLite.addAll(iterable0, this.consumerDestinations_);
    }

    private void vb() {
        this.producerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void wb() {
        ProtobufList internal$ProtobufList0 = this.consumerDestinations_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    private void xb() {
        ProtobufList internal$ProtobufList0 = this.producerDestinations_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.producerDestinations_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public d yb(int v) {
        return (d)this.consumerDestinations_.get(v);
    }

    public List zb() {
        return this.consumerDestinations_;
    }
}

