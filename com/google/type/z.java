package com.google.type;

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

public final class z extends GeneratedMessageLite implements A {
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

    public static final class b extends Builder implements A {
        private b() {
            super(z.DEFAULT_INSTANCE);
        }

        b(a z$a0) {
        }

        @Override  // com.google.type.A
        public int A1() {
            return ((z)this.instance).A1();
        }

        @Override  // com.google.type.A
        public ByteString A2() {
            return ((z)this.instance).A2();
        }

        public b Ab() {
            this.copyOnWrite();
            ((z)this.instance).Sb();
            return this;
        }

        public b Bb() {
            this.copyOnWrite();
            ((z)this.instance).Tb();
            return this;
        }

        public b Cb() {
            this.copyOnWrite();
            ((z)this.instance).Ub();
            return this;
        }

        public b Db() {
            this.copyOnWrite();
            ((z)this.instance).Vb();
            return this;
        }

        public b Eb() {
            this.copyOnWrite();
            ((z)this.instance).Wb();
            return this;
        }

        public b Fb() {
            this.copyOnWrite();
            ((z)this.instance).Xb();
            return this;
        }

        public b Gb() {
            this.copyOnWrite();
            ((z)this.instance).Yb();
            return this;
        }

        public b Hb() {
            this.copyOnWrite();
            ((z)this.instance).Zb();
            return this;
        }

        @Override  // com.google.type.A
        public ByteString I6(int v) {
            return ((z)this.instance).I6(v);
        }

        public b Ib() {
            this.copyOnWrite();
            ((z)this.instance).ac();
            return this;
        }

        @Override  // com.google.type.A
        public String J1() {
            return ((z)this.instance).J1();
        }

        public b Jb() {
            this.copyOnWrite();
            ((z)this.instance).bc();
            return this;
        }

        public b Kb() {
            this.copyOnWrite();
            ((z)this.instance).cc();
            return this;
        }

        public b Lb(int v, String s) {
            this.copyOnWrite();
            ((z)this.instance).uc(v, s);
            return this;
        }

        public b Mb(String s) {
            this.copyOnWrite();
            ((z)this.instance).vc(s);
            return this;
        }

        public b Nb(ByteString byteString0) {
            this.copyOnWrite();
            ((z)this.instance).wc(byteString0);
            return this;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.type.A
        public String O7() {
            return "";
        }

        public b Ob(String s) {
            this.copyOnWrite();
            ((z)this.instance).xc(s);
            return this;
        }

        public b Pb(ByteString byteString0) {
            this.copyOnWrite();
            ((z)this.instance).yc(byteString0);
            return this;
        }

        public b Qb(String s) {
            this.copyOnWrite();
            ((z)this.instance).zc(s);
            return this;
        }

        public b Rb(ByteString byteString0) {
            this.copyOnWrite();
            ((z)this.instance).Ac(byteString0);
            return this;
        }

        public b Sb(String s) {
            this.copyOnWrite();
            ((z)this.instance).Bc(s);
            return this;
        }

        @Override  // com.google.type.A
        public ByteString T() {
            return ((z)this.instance).T();
        }

        public b Tb(ByteString byteString0) {
            this.copyOnWrite();
            ((z)this.instance).Cc(byteString0);
            return this;
        }

        @Override  // com.google.type.A
        public String U8(int v) {
            return ((z)this.instance).U8(v);
        }

        public b Ub(String s) {
            this.copyOnWrite();
            ((z)this.instance).Dc(s);
            return this;
        }

        public b Vb(ByteString byteString0) {
            this.copyOnWrite();
            ((z)this.instance).Ec(byteString0);
            return this;
        }

        @Override  // com.google.type.A
        public ByteString W2(int v) {
            return ((z)this.instance).W2(v);
        }

        @Override  // com.google.type.A
        public String W9(int v) {
            return ((z)this.instance).W9(v);
        }

        public b Wb(int v, String s) {
            this.copyOnWrite();
            ((z)this.instance).Fc(v, s);
            return this;
        }

        @Override  // com.google.type.A
        public ByteString X2() {
            return ((z)this.instance).X2();
        }

        public b Xb(String s) {
            this.copyOnWrite();
            ((z)this.instance).Gc(s);
            return this;
        }

        @Override  // com.google.type.A
        public ByteString Ya() {
            return ((z)this.instance).Ya();
        }

        public b Yb(ByteString byteString0) {
            this.copyOnWrite();
            ((z)this.instance).Hc(byteString0);
            return this;
        }

        @Override  // com.google.type.A
        public ByteString Z9() {
            return ((z)this.instance).Z9();
        }

        public b Zb(int v) {
            this.copyOnWrite();
            ((z)this.instance).Ic(v);
            return this;
        }

        public b ac(String s) {
            this.copyOnWrite();
            ((z)this.instance).Jc(s);
            return this;
        }

        public b bc(ByteString byteString0) {
            this.copyOnWrite();
            ((z)this.instance).Kc(byteString0);
            return this;
        }

        public b cc(String s) {
            this.copyOnWrite();
            ((z)this.instance).Lc(s);
            return this;
        }

        public b dc(ByteString byteString0) {
            this.copyOnWrite();
            ((z)this.instance).Mc(byteString0);
            return this;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.type.A
        public String eb() {
            return "";
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.type.A
        public String f4() {
            return "";
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.type.A
        public String i5() {
            return "";
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.type.A
        public String j6() {
            return "";
        }

        @Override  // com.google.type.A
        public String k4() {
            return ((z)this.instance).k4();
        }

        @Override  // com.google.type.A
        public List p1() {
            return DesugarCollections.unmodifiableList(((z)this.instance).p1());
        }

        @Override  // com.google.type.A
        public ByteString p7() {
            return ((z)this.instance).p7();
        }

        @Override  // com.google.type.A
        public int p8() {
            return ((z)this.instance).p8();
        }

        @Override  // com.google.type.A
        public String s0() {
            return ((z)this.instance).s0();
        }

        @Override  // com.google.type.A
        public List s9() {
            return DesugarCollections.unmodifiableList(((z)this.instance).s9());
        }

        public b ub(String s) {
            this.copyOnWrite();
            ((z)this.instance).Mb(s);
            return this;
        }

        @Override  // com.google.type.A
        public ByteString v2() {
            return ((z)this.instance).v2();
        }

        @Override  // com.google.type.A
        public int v7() {
            return ((z)this.instance).v7();
        }

        public b vb(ByteString byteString0) {
            this.copyOnWrite();
            ((z)this.instance).Nb(byteString0);
            return this;
        }

        public b wb(Iterable iterable0) {
            this.copyOnWrite();
            ((z)this.instance).Ob(iterable0);
            return this;
        }

        public b xb(Iterable iterable0) {
            this.copyOnWrite();
            ((z)this.instance).Pb(iterable0);
            return this;
        }

        @Override  // com.google.type.A
        public ByteString y4() {
            return ((z)this.instance).y4();
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((z)this.instance).Qb(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((z)this.instance).Rb(byteString0);
            return this;
        }
    }

    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    private static final z DEFAULT_INSTANCE = null;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile Parser PARSER = null;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private ProtobufList addressLines_;
    private String administrativeArea_;
    private String languageCode_;
    private String locality_;
    private String organization_;
    private String postalCode_;
    private ProtobufList recipients_;
    private String regionCode_;
    private int revision_;
    private String sortingCode_;
    private String sublocality_;

    static {
        z z0 = new z();
        z.DEFAULT_INSTANCE = z0;
        GeneratedMessageLite.registerDefaultInstance(z.class, z0);
    }

    private z() {
        this.regionCode_ = "";
        this.languageCode_ = "";
        this.postalCode_ = "";
        this.sortingCode_ = "";
        this.administrativeArea_ = "";
        this.locality_ = "";
        this.sublocality_ = "";
        this.addressLines_ = GeneratedMessageLite.emptyProtobufList();
        this.recipients_ = GeneratedMessageLite.emptyProtobufList();
        this.organization_ = "";
    }

    @Override  // com.google.type.A
    public int A1() {
        return this.recipients_.size();
    }

    @Override  // com.google.type.A
    public ByteString A2() {
        return ByteString.copyFromUtf8(this.postalCode_);
    }

    private void Ac(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.locality_ = byteString0.toStringUtf8();
    }

    private void Bc(String s) {
        s.getClass();
        this.organization_ = s;
    }

    private void Cc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.organization_ = byteString0.toStringUtf8();
    }

    private void Dc(String s) {
        s.getClass();
        this.postalCode_ = s;
    }

    private void Ec(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.postalCode_ = byteString0.toStringUtf8();
    }

    private void Fc(int v, String s) {
        s.getClass();
        this.ec();
        this.recipients_.set(v, s);
    }

    private void Gc(String s) {
        s.getClass();
        this.regionCode_ = s;
    }

    private void Hc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.regionCode_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.type.A
    public ByteString I6(int v) {
        return ByteString.copyFromUtf8(((String)this.recipients_.get(v)));
    }

    private void Ic(int v) {
        this.revision_ = v;
    }

    @Override  // com.google.type.A
    public String J1() {
        return this.postalCode_;
    }

    private void Jc(String s) {
        s.getClass();
        this.sortingCode_ = s;
    }

    private void Kc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.sortingCode_ = byteString0.toStringUtf8();
    }

    private void Lc(String s) {
        s.getClass();
        this.sublocality_ = s;
    }

    private void Mb(String s) {
        s.getClass();
        this.dc();
        this.addressLines_.add(s);
    }

    private void Mc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.sublocality_ = byteString0.toStringUtf8();
    }

    private void Nb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.dc();
        this.addressLines_.add(byteString0.toStringUtf8());
    }

    @Override  // com.google.type.A
    public String O7() [...] // 潜在的解密器

    private void Ob(Iterable iterable0) {
        this.dc();
        AbstractMessageLite.addAll(iterable0, this.addressLines_);
    }

    private void Pb(Iterable iterable0) {
        this.ec();
        AbstractMessageLite.addAll(iterable0, this.recipients_);
    }

    private void Qb(String s) {
        s.getClass();
        this.ec();
        this.recipients_.add(s);
    }

    private void Rb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.ec();
        this.recipients_.add(byteString0.toStringUtf8());
    }

    private void Sb() {
        this.addressLines_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // com.google.type.A
    public ByteString T() {
        return ByteString.copyFromUtf8(this.regionCode_);
    }

    private void Tb() {
        this.administrativeArea_ = "";
    }

    @Override  // com.google.type.A
    public String U8(int v) {
        return (String)this.addressLines_.get(v);
    }

    private void Ub() {
        this.languageCode_ = z.fc().i5();
    }

    private void Vb() {
        this.locality_ = "";
    }

    @Override  // com.google.type.A
    public ByteString W2(int v) {
        return ByteString.copyFromUtf8(((String)this.addressLines_.get(v)));
    }

    @Override  // com.google.type.A
    public String W9(int v) {
        return (String)this.recipients_.get(v);
    }

    private void Wb() {
        this.organization_ = "";
    }

    @Override  // com.google.type.A
    public ByteString X2() {
        return ByteString.copyFromUtf8(this.locality_);
    }

    private void Xb() {
        this.postalCode_ = z.fc().J1();
    }

    @Override  // com.google.type.A
    public ByteString Ya() {
        return ByteString.copyFromUtf8(this.organization_);
    }

    private void Yb() {
        this.recipients_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // com.google.type.A
    public ByteString Z9() {
        return ByteString.copyFromUtf8(this.administrativeArea_);
    }

    private void Zb() {
        this.regionCode_ = "";
    }

    private void ac() {
        this.revision_ = 0;
    }

    private void bc() {
        this.sortingCode_ = "";
    }

    private void cc() {
        this.sublocality_ = z.fc().j6();
    }

    private void dc() {
        ProtobufList internal$ProtobufList0 = this.addressLines_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.addressLines_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new z();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(z.DEFAULT_INSTANCE, "\u0000\u000B\u0000\u0000\u0001\u000B\u000B\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000BȈ", new Object[]{"revision_", "regionCode_", "languageCode_", "postalCode_", "sortingCode_", "administrativeArea_", "locality_", "sublocality_", "addressLines_", "recipients_", "organization_"});
            }
            case 4: {
                return z.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = z.PARSER;
                if(parser0 == null) {
                    Class class0 = z.class;
                    synchronized(class0) {
                        parser0 = z.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(z.DEFAULT_INSTANCE);
                            z.PARSER = parser0;
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

    @Override  // com.google.type.A
    public String eb() [...] // 潜在的解密器

    private void ec() {
        ProtobufList internal$ProtobufList0 = this.recipients_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.recipients_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.type.A
    public String f4() [...] // 潜在的解密器

    public static z fc() {
        return z.DEFAULT_INSTANCE;
    }

    public static b gc() {
        return (b)z.DEFAULT_INSTANCE.createBuilder();
    }

    public static b hc(z z0) {
        return (b)z.DEFAULT_INSTANCE.createBuilder(z0);
    }

    @Override  // com.google.type.A
    public String i5() [...] // 潜在的解密器

    public static z ic(InputStream inputStream0) throws IOException {
        return (z)GeneratedMessageLite.parseDelimitedFrom(z.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.type.A
    public String j6() [...] // 潜在的解密器

    public static z jc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (z)GeneratedMessageLite.parseDelimitedFrom(z.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.type.A
    public String k4() {
        return this.sortingCode_;
    }

    public static z kc(ByteString byteString0) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, byteString0);
    }

    public static z lc(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static z mc(CodedInputStream codedInputStream0) throws IOException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static z nc(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static z oc(InputStream inputStream0) throws IOException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.type.A
    public List p1() {
        return this.recipients_;
    }

    @Override  // com.google.type.A
    public ByteString p7() {
        return ByteString.copyFromUtf8(this.sortingCode_);
    }

    @Override  // com.google.type.A
    public int p8() {
        return this.addressLines_.size();
    }

    public static Parser parser() {
        return z.DEFAULT_INSTANCE.getParserForType();
    }

    public static z pc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static z qc(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static z rc(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    @Override  // com.google.type.A
    public String s0() {
        return this.regionCode_;
    }

    @Override  // com.google.type.A
    public List s9() {
        return this.addressLines_;
    }

    public static z sc(byte[] arr_b) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, arr_b);
    }

    public static z tc(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void uc(int v, String s) {
        s.getClass();
        this.dc();
        this.addressLines_.set(v, s);
    }

    @Override  // com.google.type.A
    public ByteString v2() {
        return ByteString.copyFromUtf8(this.languageCode_);
    }

    @Override  // com.google.type.A
    public int v7() {
        return this.revision_;
    }

    private void vc(String s) {
        s.getClass();
        this.administrativeArea_ = s;
    }

    private void wc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.administrativeArea_ = byteString0.toStringUtf8();
    }

    private void xc(String s) {
        s.getClass();
        this.languageCode_ = s;
    }

    @Override  // com.google.type.A
    public ByteString y4() {
        return ByteString.copyFromUtf8(this.sublocality_);
    }

    private void yc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.languageCode_ = byteString0.toStringUtf8();
    }

    private void zc(String s) {
        s.getClass();
        this.locality_ = s;
    }
}

