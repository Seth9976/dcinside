package com.google.api;

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

public final class t0 extends GeneratedMessageLite implements w0 {
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

    public static final class b extends Builder implements w0 {
        private b() {
            super(t0.DEFAULT_INSTANCE);
        }

        b(a t0$a0) {
        }

        public b Ab(ByteString byteString0) {
            this.copyOnWrite();
            ((t0)this.instance).setTypeBytes(byteString0);
            return this;
        }

        @Override  // com.google.api.w0
        public int d() {
            return ((t0)this.instance).n().size();
        }

        @Override  // com.google.api.w0
        public String getType() {
            return ((t0)this.instance).getType();
        }

        @Override  // com.google.api.w0
        public ByteString getTypeBytes() {
            return ((t0)this.instance).getTypeBytes();
        }

        @Override  // com.google.api.w0
        public String k(String s) {
            s.getClass();
            Map map0 = ((t0)this.instance).n();
            if(!map0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (String)map0.get(s);
        }

        @Override  // com.google.api.w0
        public Map n() {
            return DesugarCollections.unmodifiableMap(((t0)this.instance).n());
        }

        @Override  // com.google.api.w0
        public boolean o(String s) {
            s.getClass();
            return ((t0)this.instance).n().containsKey(s);
        }

        @Override  // com.google.api.w0
        @Deprecated
        public Map p() {
            return this.n();
        }

        @Override  // com.google.api.w0
        public String q(String s, String s1) {
            s.getClass();
            Map map0 = ((t0)this.instance).n();
            return map0.containsKey(s) ? ((String)map0.get(s)) : s1;
        }

        public b ub() {
            this.copyOnWrite();
            ((t0)this.instance).P4().clear();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((t0)this.instance).clearType();
            return this;
        }

        public b wb(Map map0) {
            this.copyOnWrite();
            ((t0)this.instance).P4().putAll(map0);
            return this;
        }

        public b xb(String s, String s1) {
            s.getClass();
            s1.getClass();
            this.copyOnWrite();
            ((t0)this.instance).P4().put(s, s1);
            return this;
        }

        public b yb(String s) {
            s.getClass();
            this.copyOnWrite();
            ((t0)this.instance).P4().remove(s);
            return this;
        }

        public b zb(String s) {
            this.copyOnWrite();
            ((t0)this.instance).setType(s);
            return this;
        }
    }

    static final class c {
        static final MapEntryLite a;

        static {
            c.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.STRING, "");
        }
    }

    private static final t0 DEFAULT_INSTANCE = null;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private MapFieldLite labels_;
    private String type_;

    static {
        t0 t00 = new t0();
        t0.DEFAULT_INSTANCE = t00;
        GeneratedMessageLite.registerDefaultInstance(t0.class, t00);
    }

    private t0() {
        this.labels_ = MapFieldLite.emptyMapField();
        this.type_ = "";
    }

    public static b A6() {
        return (b)t0.DEFAULT_INSTANCE.createBuilder();
    }

    public static t0 A8(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (t0)GeneratedMessageLite.parseFrom(t0.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static b B6(t0 t00) {
        return (b)t0.DEFAULT_INSTANCE.createBuilder(t00);
    }

    public static t0 Ja(InputStream inputStream0) throws IOException {
        return (t0)GeneratedMessageLite.parseFrom(t0.DEFAULT_INSTANCE, inputStream0);
    }

    public static t0 La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (t0)GeneratedMessageLite.parseFrom(t0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static t0 M4() {
        return t0.DEFAULT_INSTANCE;
    }

    public static t0 M6(InputStream inputStream0) throws IOException {
        return (t0)GeneratedMessageLite.parseDelimitedFrom(t0.DEFAULT_INSTANCE, inputStream0);
    }

    private Map P4() {
        return this.z6();
    }

    public static t0 Z7(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (t0)GeneratedMessageLite.parseDelimitedFrom(t0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static t0 ca(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (t0)GeneratedMessageLite.parseFrom(t0.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    private void clearType() {
        this.type_ = "";
    }

    @Override  // com.google.api.w0
    public int d() {
        return this.d6().size();
    }

    private MapFieldLite d6() {
        return this.labels_;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new t0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(t0.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003Ȉ", new Object[]{"labels_", c.a, "type_"});
            }
            case 4: {
                return t0.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = t0.PARSER;
                if(parser0 == null) {
                    Class class0 = t0.class;
                    synchronized(class0) {
                        parser0 = t0.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(t0.DEFAULT_INSTANCE);
                            t0.PARSER = parser0;
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

    @Override  // com.google.api.w0
    public String getType() {
        return this.type_;
    }

    @Override  // com.google.api.w0
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public static t0 j9(CodedInputStream codedInputStream0) throws IOException {
        return (t0)GeneratedMessageLite.parseFrom(t0.DEFAULT_INSTANCE, codedInputStream0);
    }

    @Override  // com.google.api.w0
    public String k(String s) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.d6();
        if(!mapFieldLite0.containsKey(s)) {
            throw new IllegalArgumentException();
        }
        return (String)mapFieldLite0.get(s);
    }

    @Override  // com.google.api.w0
    public Map n() {
        return DesugarCollections.unmodifiableMap(this.d6());
    }

    @Override  // com.google.api.w0
    public boolean o(String s) {
        s.getClass();
        return this.d6().containsKey(s);
    }

    @Override  // com.google.api.w0
    @Deprecated
    public Map p() {
        return this.n();
    }

    public static Parser parser() {
        return t0.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.api.w0
    public String q(String s, String s1) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.d6();
        return mapFieldLite0.containsKey(s) ? ((String)mapFieldLite0.get(s)) : s1;
    }

    private void setType(String s) {
        s.getClass();
        this.type_ = s;
    }

    private void setTypeBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.type_ = byteString0.toStringUtf8();
    }

    public static t0 ub(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (t0)GeneratedMessageLite.parseFrom(t0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static t0 v8(ByteString byteString0) throws InvalidProtocolBufferException {
        return (t0)GeneratedMessageLite.parseFrom(t0.DEFAULT_INSTANCE, byteString0);
    }

    public static t0 vb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (t0)GeneratedMessageLite.parseFrom(t0.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static t0 wb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (t0)GeneratedMessageLite.parseFrom(t0.DEFAULT_INSTANCE, arr_b);
    }

    public static t0 xb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (t0)GeneratedMessageLite.parseFrom(t0.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private MapFieldLite z6() {
        if(!this.labels_.isMutable()) {
            this.labels_ = this.labels_.mutableCopy();
        }
        return this.labels_;
    }
}

