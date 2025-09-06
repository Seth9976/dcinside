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

public final class y0 extends GeneratedMessageLite implements z0 {
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

    public static final class b extends Builder implements z0 {
        private b() {
            super(y0.DEFAULT_INSTANCE);
        }

        b(a y0$a0) {
        }

        public b Ab(ByteString byteString0) {
            this.copyOnWrite();
            ((y0)this.instance).Ab(byteString0);
            return this;
        }

        @Override  // com.google.api.z0
        @Deprecated
        public Map E4() {
            return this.J5();
        }

        @Override  // com.google.api.z0
        public Map J5() {
            return DesugarCollections.unmodifiableMap(((y0)this.instance).J5());
        }

        @Override  // com.google.api.z0
        public long O3(String s, long v) {
            s.getClass();
            Map map0 = ((y0)this.instance).J5();
            return map0.containsKey(s) ? ((long)(((Long)map0.get(s)))) : v;
        }

        @Override  // com.google.api.z0
        public long X3(String s) {
            s.getClass();
            Map map0 = ((y0)this.instance).J5();
            if(!map0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (long)(((Long)map0.get(s)));
        }

        @Override  // com.google.api.z0
        public String b() {
            return ((y0)this.instance).b();
        }

        @Override  // com.google.api.z0
        public ByteString c() {
            return ((y0)this.instance).c();
        }

        @Override  // com.google.api.z0
        public int oa() {
            return ((y0)this.instance).J5().size();
        }

        @Override  // com.google.api.z0
        public boolean r6(String s) {
            s.getClass();
            return ((y0)this.instance).J5().containsKey(s);
        }

        public b ub() {
            this.copyOnWrite();
            ((y0)this.instance).d6().clear();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((y0)this.instance).M4();
            return this;
        }

        public b wb(Map map0) {
            this.copyOnWrite();
            ((y0)this.instance).d6().putAll(map0);
            return this;
        }

        public b xb(String s, long v) {
            s.getClass();
            this.copyOnWrite();
            ((y0)this.instance).d6().put(s, v);
            return this;
        }

        public b yb(String s) {
            s.getClass();
            this.copyOnWrite();
            ((y0)this.instance).d6().remove(s);
            return this;
        }

        public b zb(String s) {
            this.copyOnWrite();
            ((y0)this.instance).zb(s);
            return this;
        }
    }

    static final class c {
        static final MapEntryLite a;

        static {
            c.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.INT64, 0L);
        }
    }

    private static final y0 DEFAULT_INSTANCE = null;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private MapFieldLite metricCosts_;
    private String selector_;

    static {
        y0 y00 = new y0();
        y0.DEFAULT_INSTANCE = y00;
        GeneratedMessageLite.registerDefaultInstance(y0.class, y00);
    }

    private y0() {
        this.metricCosts_ = MapFieldLite.emptyMapField();
        this.selector_ = "";
    }

    private MapFieldLite A6() {
        if(!this.metricCosts_.isMutable()) {
            this.metricCosts_ = this.metricCosts_.mutableCopy();
        }
        return this.metricCosts_;
    }

    public static y0 A8(ByteString byteString0) throws InvalidProtocolBufferException {
        return (y0)GeneratedMessageLite.parseFrom(y0.DEFAULT_INSTANCE, byteString0);
    }

    private void Ab(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.selector_ = byteString0.toStringUtf8();
    }

    public static b B6() {
        return (b)y0.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.api.z0
    @Deprecated
    public Map E4() {
        return this.J5();
    }

    @Override  // com.google.api.z0
    public Map J5() {
        return DesugarCollections.unmodifiableMap(this.z6());
    }

    public static y0 Ja(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (y0)GeneratedMessageLite.parseFrom(y0.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static y0 La(InputStream inputStream0) throws IOException {
        return (y0)GeneratedMessageLite.parseFrom(y0.DEFAULT_INSTANCE, inputStream0);
    }

    private void M4() {
        this.selector_ = "";
    }

    public static b M6(y0 y00) {
        return (b)y0.DEFAULT_INSTANCE.createBuilder(y00);
    }

    @Override  // com.google.api.z0
    public long O3(String s, long v) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.z6();
        return mapFieldLite0.containsKey(s) ? ((long)(((Long)mapFieldLite0.get(s)))) : v;
    }

    public static y0 P4() {
        return y0.DEFAULT_INSTANCE;
    }

    @Override  // com.google.api.z0
    public long X3(String s) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.z6();
        if(!mapFieldLite0.containsKey(s)) {
            throw new IllegalArgumentException();
        }
        return (long)(((Long)mapFieldLite0.get(s)));
    }

    public static y0 Z7(InputStream inputStream0) throws IOException {
        return (y0)GeneratedMessageLite.parseDelimitedFrom(y0.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.api.z0
    public String b() {
        return this.selector_;
    }

    @Override  // com.google.api.z0
    public ByteString c() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    public static y0 ca(CodedInputStream codedInputStream0) throws IOException {
        return (y0)GeneratedMessageLite.parseFrom(y0.DEFAULT_INSTANCE, codedInputStream0);
    }

    private Map d6() {
        return this.A6();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new y0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(y0.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"selector_", "metricCosts_", c.a});
            }
            case 4: {
                return y0.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = y0.PARSER;
                if(parser0 == null) {
                    Class class0 = y0.class;
                    synchronized(class0) {
                        parser0 = y0.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(y0.DEFAULT_INSTANCE);
                            y0.PARSER = parser0;
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

    public static y0 j9(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (y0)GeneratedMessageLite.parseFrom(y0.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // com.google.api.z0
    public int oa() {
        return this.z6().size();
    }

    public static Parser parser() {
        return y0.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.api.z0
    public boolean r6(String s) {
        s.getClass();
        return this.z6().containsKey(s);
    }

    public static y0 ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (y0)GeneratedMessageLite.parseFrom(y0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static y0 v8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (y0)GeneratedMessageLite.parseDelimitedFrom(y0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static y0 vb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (y0)GeneratedMessageLite.parseFrom(y0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static y0 wb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (y0)GeneratedMessageLite.parseFrom(y0.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static y0 xb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (y0)GeneratedMessageLite.parseFrom(y0.DEFAULT_INSTANCE, arr_b);
    }

    public static y0 yb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (y0)GeneratedMessageLite.parseFrom(y0.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private MapFieldLite z6() {
        return this.metricCosts_;
    }

    private void zb(String s) {
        s.getClass();
        this.selector_ = s;
    }
}

