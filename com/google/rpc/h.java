package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat.FieldType;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public final class h extends GeneratedMessageLite implements i {
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

    public static final class b extends Builder implements i {
        private b() {
            super(h.DEFAULT_INSTANCE);
        }

        b(a h$a0) {
        }

        @Override  // com.google.rpc.i
        public String A7(String s) {
            s.getClass();
            Map map0 = ((h)this.instance).b2();
            if(!map0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (String)map0.get(s);
        }

        public b Ab(String s) {
            this.copyOnWrite();
            ((h)this.instance).Cb(s);
            return this;
        }

        public b Bb(ByteString byteString0) {
            this.copyOnWrite();
            ((h)this.instance).Db(byteString0);
            return this;
        }

        public b Cb(String s) {
            this.copyOnWrite();
            ((h)this.instance).Eb(s);
            return this;
        }

        @Override  // com.google.rpc.i
        public int D9() {
            return ((h)this.instance).b2().size();
        }

        public b Db(ByteString byteString0) {
            this.copyOnWrite();
            ((h)this.instance).Fb(byteString0);
            return this;
        }

        @Override  // com.google.rpc.i
        public ByteString Pa() {
            return ((h)this.instance).Pa();
        }

        @Override  // com.google.rpc.i
        public boolean T4(String s) {
            s.getClass();
            return ((h)this.instance).b2().containsKey(s);
        }

        @Override  // com.google.rpc.i
        public ByteString U0() {
            return ((h)this.instance).U0();
        }

        @Override  // com.google.rpc.i
        public String U6(String s, String s1) {
            s.getClass();
            Map map0 = ((h)this.instance).b2();
            return map0.containsKey(s) ? ((String)map0.get(s)) : s1;
        }

        @Override  // com.google.rpc.i
        public Map b2() {
            return DesugarCollections.unmodifiableMap(((h)this.instance).b2());
        }

        @Override  // com.google.rpc.i
        public String getDomain() {
            return ((h)this.instance).getDomain();
        }

        @Override  // com.google.rpc.i
        @Deprecated
        public Map getMetadata() {
            return this.b2();
        }

        @Override  // com.google.rpc.i
        public String getReason() {
            return ((h)this.instance).getReason();
        }

        public b ub() {
            this.copyOnWrite();
            ((h)this.instance).z6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((h)this.instance).B6().clear();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((h)this.instance).clearReason();
            return this;
        }

        public b xb(Map map0) {
            this.copyOnWrite();
            ((h)this.instance).B6().putAll(map0);
            return this;
        }

        public b yb(String s, String s1) {
            s.getClass();
            s1.getClass();
            this.copyOnWrite();
            ((h)this.instance).B6().put(s, s1);
            return this;
        }

        public b zb(String s) {
            s.getClass();
            this.copyOnWrite();
            ((h)this.instance).B6().remove(s);
            return this;
        }
    }

    static final class c {
        static final MapEntryLite a;

        static {
            c.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.STRING, "");
        }
    }

    private static final h DEFAULT_INSTANCE = null;
    public static final int DOMAIN_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private String domain_;
    private MapFieldLite metadata_;
    private String reason_;

    static {
        h h0 = new h();
        h.DEFAULT_INSTANCE = h0;
        GeneratedMessageLite.registerDefaultInstance(h.class, h0);
    }

    private h() {
        this.metadata_ = MapFieldLite.emptyMapField();
        this.reason_ = "";
        this.domain_ = "";
    }

    public static h A6() {
        return h.DEFAULT_INSTANCE;
    }

    @Override  // com.google.rpc.i
    public String A7(String s) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.M6();
        if(!mapFieldLite0.containsKey(s)) {
            throw new IllegalArgumentException();
        }
        return (String)mapFieldLite0.get(s);
    }

    public static b A8(h h0) {
        return (b)h.DEFAULT_INSTANCE.createBuilder(h0);
    }

    public static h Ab(byte[] arr_b) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, arr_b);
    }

    private Map B6() {
        return this.Z7();
    }

    public static h Bb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Cb(String s) {
        s.getClass();
        this.domain_ = s;
    }

    @Override  // com.google.rpc.i
    public int D9() {
        return this.M6().size();
    }

    private void Db(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.domain_ = byteString0.toStringUtf8();
    }

    private void Eb(String s) {
        s.getClass();
        this.reason_ = s;
    }

    private void Fb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.reason_ = byteString0.toStringUtf8();
    }

    public static h Ja(ByteString byteString0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteString0);
    }

    public static h La(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private MapFieldLite M6() {
        return this.metadata_;
    }

    @Override  // com.google.rpc.i
    public ByteString Pa() {
        return ByteString.copyFromUtf8(this.domain_);
    }

    @Override  // com.google.rpc.i
    public boolean T4(String s) {
        s.getClass();
        return this.M6().containsKey(s);
    }

    @Override  // com.google.rpc.i
    public ByteString U0() {
        return ByteString.copyFromUtf8(this.reason_);
    }

    @Override  // com.google.rpc.i
    public String U6(String s, String s1) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.M6();
        return mapFieldLite0.containsKey(s) ? ((String)mapFieldLite0.get(s)) : s1;
    }

    private MapFieldLite Z7() {
        if(!this.metadata_.isMutable()) {
            this.metadata_ = this.metadata_.mutableCopy();
        }
        return this.metadata_;
    }

    @Override  // com.google.rpc.i
    public Map b2() {
        return DesugarCollections.unmodifiableMap(this.M6());
    }

    public static h ca(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (h)GeneratedMessageLite.parseDelimitedFrom(h.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void clearReason() {
        this.reason_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new h();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(h.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"reason_", "domain_", "metadata_", c.a});
            }
            case 4: {
                return h.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = h.PARSER;
                if(parser0 == null) {
                    Class class0 = h.class;
                    synchronized(class0) {
                        parser0 = h.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(h.DEFAULT_INSTANCE);
                            h.PARSER = parser0;
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

    @Override  // com.google.rpc.i
    public String getDomain() {
        return this.domain_;
    }

    @Override  // com.google.rpc.i
    @Deprecated
    public Map getMetadata() {
        return this.b2();
    }

    @Override  // com.google.rpc.i
    public String getReason() {
        return this.reason_;
    }

    public static h j9(InputStream inputStream0) throws IOException {
        return (h)GeneratedMessageLite.parseDelimitedFrom(h.DEFAULT_INSTANCE, inputStream0);
    }

    public static Parser parser() {
        return h.DEFAULT_INSTANCE.getParserForType();
    }

    public static h ub(CodedInputStream codedInputStream0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static b v8() {
        return (b)h.DEFAULT_INSTANCE.createBuilder();
    }

    public static h vb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static h wb(InputStream inputStream0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, inputStream0);
    }

    public static h xb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static h yb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void z6() {
        this.domain_ = h.A6().getDomain();
    }

    public static h zb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }
}

