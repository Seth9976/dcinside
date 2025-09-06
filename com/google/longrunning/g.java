package com.google.longrunning;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class g extends GeneratedMessageLite implements h {
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

    public static final class b extends Builder implements h {
        private b() {
            super(g.DEFAULT_INSTANCE);
        }

        b(a g$a0) {
        }

        public b Ab(String s) {
            this.copyOnWrite();
            ((g)this.instance).setName(s);
            return this;
        }

        public b Bb(ByteString byteString0) {
            this.copyOnWrite();
            ((g)this.instance).setNameBytes(byteString0);
            return this;
        }

        public b Cb(int v) {
            this.copyOnWrite();
            ((g)this.instance).Hb(v);
            return this;
        }

        public b Db(String s) {
            this.copyOnWrite();
            ((g)this.instance).Ib(s);
            return this;
        }

        public b Eb(ByteString byteString0) {
            this.copyOnWrite();
            ((g)this.instance).Jb(byteString0);
            return this;
        }

        @Override  // com.google.longrunning.h
        public int G0() {
            return ((g)this.instance).G0();
        }

        @Override  // com.google.longrunning.h
        public String R6() {
            return ((g)this.instance).R6();
        }

        @Override  // com.google.longrunning.h
        public ByteString c8() {
            return ((g)this.instance).c8();
        }

        @Override  // com.google.longrunning.h
        public ByteString e3() {
            return ((g)this.instance).e3();
        }

        @Override  // com.google.longrunning.h
        public String getFilter() {
            return ((g)this.instance).getFilter();
        }

        @Override  // com.google.longrunning.h
        public String getName() {
            return ((g)this.instance).getName();
        }

        @Override  // com.google.longrunning.h
        public ByteString getNameBytes() {
            return ((g)this.instance).getNameBytes();
        }

        public b ub() {
            this.copyOnWrite();
            ((g)this.instance).Z7();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((g)this.instance).clearName();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((g)this.instance).v8();
            return this;
        }

        public b xb() {
            this.copyOnWrite();
            ((g)this.instance).A8();
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((g)this.instance).Fb(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((g)this.instance).Gb(byteString0);
            return this;
        }
    }

    private static final g DEFAULT_INSTANCE = null;
    public static final int FILTER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    private String filter_;
    private String name_;
    private int pageSize_;
    private String pageToken_;

    static {
        g g0 = new g();
        g.DEFAULT_INSTANCE = g0;
        GeneratedMessageLite.registerDefaultInstance(g.class, g0);
    }

    private g() {
        this.name_ = "";
        this.filter_ = "";
        this.pageToken_ = "";
    }

    private void A8() {
        this.pageToken_ = "";
    }

    public static g Ab(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static g Bb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static g Cb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static g Db(byte[] arr_b) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, arr_b);
    }

    public static g Eb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Fb(String s) {
        s.getClass();
        this.filter_ = s;
    }

    @Override  // com.google.longrunning.h
    public int G0() {
        return this.pageSize_;
    }

    private void Gb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.filter_ = byteString0.toStringUtf8();
    }

    private void Hb(int v) {
        this.pageSize_ = v;
    }

    private void Ib(String s) {
        s.getClass();
        this.pageToken_ = s;
    }

    public static b Ja(g g0) {
        return (b)g.DEFAULT_INSTANCE.createBuilder(g0);
    }

    private void Jb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.pageToken_ = byteString0.toStringUtf8();
    }

    public static g La(InputStream inputStream0) throws IOException {
        return (g)GeneratedMessageLite.parseDelimitedFrom(g.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.longrunning.h
    public String R6() {
        return this.pageToken_;
    }

    private void Z7() {
        this.filter_ = g.j9().getFilter();
    }

    @Override  // com.google.longrunning.h
    public ByteString c8() {
        return ByteString.copyFromUtf8(this.pageToken_);
    }

    public static b ca() {
        return (b)g.DEFAULT_INSTANCE.createBuilder();
    }

    private void clearName() {
        this.name_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new g();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(g.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ", new Object[]{"filter_", "pageSize_", "pageToken_", "name_"});
            }
            case 4: {
                return g.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = g.PARSER;
                if(parser0 == null) {
                    Class class0 = g.class;
                    synchronized(class0) {
                        parser0 = g.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(g.DEFAULT_INSTANCE);
                            g.PARSER = parser0;
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

    @Override  // com.google.longrunning.h
    public ByteString e3() {
        return ByteString.copyFromUtf8(this.filter_);
    }

    @Override  // com.google.longrunning.h
    public String getFilter() {
        return this.filter_;
    }

    @Override  // com.google.longrunning.h
    public String getName() {
        return this.name_;
    }

    @Override  // com.google.longrunning.h
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static g j9() {
        return g.DEFAULT_INSTANCE;
    }

    public static Parser parser() {
        return g.DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void setNameBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.name_ = byteString0.toStringUtf8();
    }

    public static g ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (g)GeneratedMessageLite.parseDelimitedFrom(g.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void v8() {
        this.pageSize_ = 0;
    }

    public static g vb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteString0);
    }

    public static g wb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static g xb(CodedInputStream codedInputStream0) throws IOException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static g yb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static g zb(InputStream inputStream0) throws IOException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, inputStream0);
    }
}

