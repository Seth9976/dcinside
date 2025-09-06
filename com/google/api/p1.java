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
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class p1 extends GeneratedMessageLite implements q1 {
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

    public static final class b extends Builder implements q1 {
        private b() {
            super(p1.DEFAULT_INSTANCE);
        }

        b(a p1$a0) {
        }

        public b Ab(com.google.api.s1.b s1$b0) {
            this.copyOnWrite();
            ((p1)this.instance).vb(((s1)s1$b0.build()));
            return this;
        }

        public b Bb(s1 s10) {
            this.copyOnWrite();
            ((p1)this.instance).vb(s10);
            return this;
        }

        public b Cb() {
            this.copyOnWrite();
            ((p1)this.instance).wb();
            return this;
        }

        public b Db() {
            this.copyOnWrite();
            ((p1)this.instance).xb();
            return this;
        }

        public b Eb() {
            this.copyOnWrite();
            ((p1)this.instance).yb();
            return this;
        }

        public b Fb(int v) {
            this.copyOnWrite();
            ((p1)this.instance).Sb(v);
            return this;
        }

        public b Gb(String s) {
            this.copyOnWrite();
            ((p1)this.instance).Tb(s);
            return this;
        }

        @Override  // com.google.api.q1
        public List H0() {
            return DesugarCollections.unmodifiableList(((p1)this.instance).H0());
        }

        public b Hb(ByteString byteString0) {
            this.copyOnWrite();
            ((p1)this.instance).Ub(byteString0);
            return this;
        }

        @Override  // com.google.api.q1
        public String I0(int v) {
            return ((p1)this.instance).I0(v);
        }

        public b Ib(int v, String s) {
            this.copyOnWrite();
            ((p1)this.instance).Vb(v, s);
            return this;
        }

        public b Jb(int v, com.google.api.s1.b s1$b0) {
            this.copyOnWrite();
            ((p1)this.instance).Wb(v, ((s1)s1$b0.build()));
            return this;
        }

        public b Kb(int v, s1 s10) {
            this.copyOnWrite();
            ((p1)this.instance).Wb(v, s10);
            return this;
        }

        @Override  // com.google.api.q1
        public int Y() {
            return ((p1)this.instance).Y();
        }

        @Override  // com.google.api.q1
        public ByteString Y4() {
            return ((p1)this.instance).Y4();
        }

        @Override  // com.google.api.q1
        public s1 e(int v) {
            return ((p1)this.instance).e(v);
        }

        @Override  // com.google.api.q1
        public int f() {
            return ((p1)this.instance).f();
        }

        @Override  // com.google.api.q1
        public ByteString f6(int v) {
            return ((p1)this.instance).f6(v);
        }

        @Override  // com.google.api.q1
        public List g() {
            return DesugarCollections.unmodifiableList(((p1)this.instance).g());
        }

        @Override  // com.google.api.q1
        public String r1() {
            return ((p1)this.instance).r1();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((p1)this.instance).j9(iterable0);
            return this;
        }

        public b vb(Iterable iterable0) {
            this.copyOnWrite();
            ((p1)this.instance).ca(iterable0);
            return this;
        }

        public b wb(String s) {
            this.copyOnWrite();
            ((p1)this.instance).Ja(s);
            return this;
        }

        public b xb(ByteString byteString0) {
            this.copyOnWrite();
            ((p1)this.instance).La(byteString0);
            return this;
        }

        public b yb(int v, com.google.api.s1.b s1$b0) {
            this.copyOnWrite();
            ((p1)this.instance).ub(v, ((s1)s1$b0.build()));
            return this;
        }

        public b zb(int v, s1 s10) {
            this.copyOnWrite();
            ((p1)this.instance).ub(v, s10);
            return this;
        }
    }

    private static final p1 DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private String producerNotificationChannel_;
    private ProtobufList requirements_;
    private ProtobufList rules_;

    static {
        p1 p10 = new p1();
        p1.DEFAULT_INSTANCE = p10;
        GeneratedMessageLite.registerDefaultInstance(p1.class, p10);
    }

    private p1() {
        this.requirements_ = GeneratedMessageLite.emptyProtobufList();
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
        this.producerNotificationChannel_ = "";
    }

    private void Ab() {
        ProtobufList internal$ProtobufList0 = this.rules_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static p1 Bb() {
        return p1.DEFAULT_INSTANCE;
    }

    public t1 Cb(int v) {
        return (t1)this.rules_.get(v);
    }

    public List Db() {
        return this.rules_;
    }

    public static b Eb() {
        return (b)p1.DEFAULT_INSTANCE.createBuilder();
    }

    public static b Fb(p1 p10) {
        return (b)p1.DEFAULT_INSTANCE.createBuilder(p10);
    }

    public static p1 Gb(InputStream inputStream0) throws IOException {
        return (p1)GeneratedMessageLite.parseDelimitedFrom(p1.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.api.q1
    public List H0() {
        return this.requirements_;
    }

    public static p1 Hb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p1)GeneratedMessageLite.parseDelimitedFrom(p1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.api.q1
    public String I0(int v) {
        return (String)this.requirements_.get(v);
    }

    public static p1 Ib(ByteString byteString0) throws InvalidProtocolBufferException {
        return (p1)GeneratedMessageLite.parseFrom(p1.DEFAULT_INSTANCE, byteString0);
    }

    private void Ja(String s) {
        s.getClass();
        this.zb();
        this.requirements_.add(s);
    }

    public static p1 Jb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p1)GeneratedMessageLite.parseFrom(p1.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static p1 Kb(CodedInputStream codedInputStream0) throws IOException {
        return (p1)GeneratedMessageLite.parseFrom(p1.DEFAULT_INSTANCE, codedInputStream0);
    }

    private void La(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.zb();
        this.requirements_.add(byteString0.toStringUtf8());
    }

    public static p1 Lb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p1)GeneratedMessageLite.parseFrom(p1.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static p1 Mb(InputStream inputStream0) throws IOException {
        return (p1)GeneratedMessageLite.parseFrom(p1.DEFAULT_INSTANCE, inputStream0);
    }

    public static p1 Nb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p1)GeneratedMessageLite.parseFrom(p1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static p1 Ob(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (p1)GeneratedMessageLite.parseFrom(p1.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static p1 Pb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p1)GeneratedMessageLite.parseFrom(p1.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static p1 Qb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (p1)GeneratedMessageLite.parseFrom(p1.DEFAULT_INSTANCE, arr_b);
    }

    public static p1 Rb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p1)GeneratedMessageLite.parseFrom(p1.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Sb(int v) {
        this.Ab();
        this.rules_.remove(v);
    }

    private void Tb(String s) {
        s.getClass();
        this.producerNotificationChannel_ = s;
    }

    private void Ub(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.producerNotificationChannel_ = byteString0.toStringUtf8();
    }

    private void Vb(int v, String s) {
        s.getClass();
        this.zb();
        this.requirements_.set(v, s);
    }

    private void Wb(int v, s1 s10) {
        s10.getClass();
        this.Ab();
        this.rules_.set(v, s10);
    }

    @Override  // com.google.api.q1
    public int Y() {
        return this.requirements_.size();
    }

    @Override  // com.google.api.q1
    public ByteString Y4() {
        return ByteString.copyFromUtf8(this.producerNotificationChannel_);
    }

    private void ca(Iterable iterable0) {
        this.Ab();
        AbstractMessageLite.addAll(iterable0, this.rules_);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new p1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(p1.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001Ț\u0006\u001B\u0007Ȉ", new Object[]{"requirements_", "rules_", s1.class, "producerNotificationChannel_"});
            }
            case 4: {
                return p1.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = p1.PARSER;
                if(parser0 == null) {
                    Class class0 = p1.class;
                    synchronized(class0) {
                        parser0 = p1.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(p1.DEFAULT_INSTANCE);
                            p1.PARSER = parser0;
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

    @Override  // com.google.api.q1
    public s1 e(int v) {
        return (s1)this.rules_.get(v);
    }

    @Override  // com.google.api.q1
    public int f() {
        return this.rules_.size();
    }

    @Override  // com.google.api.q1
    public ByteString f6(int v) {
        return ByteString.copyFromUtf8(((String)this.requirements_.get(v)));
    }

    @Override  // com.google.api.q1
    public List g() {
        return this.rules_;
    }

    private void j9(Iterable iterable0) {
        this.zb();
        AbstractMessageLite.addAll(iterable0, this.requirements_);
    }

    public static Parser parser() {
        return p1.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.api.q1
    public String r1() {
        return this.producerNotificationChannel_;
    }

    private void ub(int v, s1 s10) {
        s10.getClass();
        this.Ab();
        this.rules_.add(v, s10);
    }

    private void vb(s1 s10) {
        s10.getClass();
        this.Ab();
        this.rules_.add(s10);
    }

    private void wb() {
        this.producerNotificationChannel_ = p1.Bb().r1();
    }

    private void xb() {
        this.requirements_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void yb() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void zb() {
        ProtobufList internal$ProtobufList0 = this.requirements_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.requirements_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }
}

