package androidx.datastore.preferences.protobuf;

import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public abstract class GeneratedMessageLite extends AbstractMessageLite {
    public static abstract class Builder extends androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder {
        private final GeneratedMessageLite a;
        protected GeneratedMessageLite b;
        protected boolean c;

        protected Builder(GeneratedMessageLite generatedMessageLite0) {
            this.a = generatedMessageLite0;
            this.b = (GeneratedMessageLite)generatedMessageLite0.T(MethodToInvoke.d);
            this.c = false;
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder J() {
            return this.b0();
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        protected androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder L(AbstractMessageLite abstractMessageLite0) {
            return this.e0(((GeneratedMessageLite)abstractMessageLite0));
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder M6(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.i0(arr_b, v, v1, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder P(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return this.f0(codedInputStream0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder U(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            return this.h0(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder V(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.i0(arr_b, v, v1, extensionRegistryLite0);
        }

        public final GeneratedMessageLite Y() {
            GeneratedMessageLite generatedMessageLite0 = this.Z();
            if(!generatedMessageLite0.isInitialized()) {
                throw androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.X(generatedMessageLite0);
            }
            return generatedMessageLite0;
        }

        public GeneratedMessageLite Z() {
            if(this.c) {
                return this.b;
            }
            this.b.i0();
            this.c = true;
            return this.b;
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder Z7(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return this.f0(codedInputStream0, extensionRegistryLite0);
        }

        public final Builder a0() {
            this.b = (GeneratedMessageLite)this.b.T(MethodToInvoke.d);
            return this;
        }

        public Builder b0() {
            Builder generatedMessageLite$Builder0 = this.d0().s0();
            generatedMessageLite$Builder0.g0(this.Z());
            return generatedMessageLite$Builder0;
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public MessageLite build() {
            return this.Y();
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public MessageLite buildPartial() {
            return this.Z();
        }

        protected void c0() {
            if(this.c) {
                GeneratedMessageLite generatedMessageLite0 = (GeneratedMessageLite)this.b.T(MethodToInvoke.d);
                this.j0(generatedMessageLite0, this.b);
                this.b = generatedMessageLite0;
                this.c = false;
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder clear() {
            return this.a0();
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder clone() {
            return this.b0();
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public Object clone() throws CloneNotSupportedException {
            return this.b0();
        }

        public GeneratedMessageLite d0() {
            return this.a;
        }

        protected Builder e0(GeneratedMessageLite generatedMessageLite0) {
            return this.g0(generatedMessageLite0);
        }

        public Builder f0(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            this.c0();
            try {
                Protobuf.a().j(this.b).b(this.b, CodedInputStreamReader.j(codedInputStream0), extensionRegistryLite0);
                return this;
            }
            catch(RuntimeException runtimeException0) {
                if(runtimeException0.getCause() instanceof IOException) {
                    throw (IOException)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
        }

        public Builder g0(GeneratedMessageLite generatedMessageLite0) {
            this.c0();
            this.j0(this.b, generatedMessageLite0);
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.d0();
        }

        public Builder h0(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            return this.i0(arr_b, v, v1, ExtensionRegistryLite.d());
        }

        public Builder i0(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            this.c0();
            try {
                Protobuf.a().j(this.b).c(this.b, arr_b, v, v + v1, new Registers(extensionRegistryLite0));
                return this;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw invalidProtocolBufferException0;
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw InvalidProtocolBufferException.l();
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.h0(this.b, false);
        }

        private void j0(GeneratedMessageLite generatedMessageLite0, GeneratedMessageLite generatedMessageLite1) {
            Protobuf.a().j(generatedMessageLite0).mergeFrom(generatedMessageLite0, generatedMessageLite1);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            return this.h0(arr_b, v, v1);
        }
    }

    public static class DefaultInstanceBasedParser extends AbstractParser {
        private final GeneratedMessageLite b;

        public DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite0) {
            this.b = generatedMessageLite0;
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractParser
        public MessageLite Q(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.T(arr_b, v, v1, extensionRegistryLite0);
        }

        public GeneratedMessageLite S(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.L0(this.b, codedInputStream0, extensionRegistryLite0);
        }

        public GeneratedMessageLite T(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.M0(this.b, arr_b, v, v1, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractParser
        public Object e(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.T(arr_b, v, v1, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.Parser
        public Object i(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.S(codedInputStream0, extensionRegistryLite0);
        }
    }

    public static abstract class ExtendableBuilder extends Builder implements ExtendableMessageOrBuilder {
        protected ExtendableBuilder(ExtendableMessage generatedMessageLite$ExtendableMessage0) {
            super(generatedMessageLite$ExtendableMessage0);
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final int A(ExtensionLite extensionLite0) {
            return ((ExtendableMessage)this.b).A(extensionLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder
        public GeneratedMessageLite Z() {
            return this.l0();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder
        public MessageLite buildPartial() {
            return this.l0();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder
        protected void c0() {
            if(!this.c) {
                return;
            }
            super.c0();
            GeneratedMessageLite generatedMessageLite0 = this.b;
            ((ExtendableMessage)generatedMessageLite0).extensions = ((ExtendableMessage)generatedMessageLite0).extensions.k();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object g(ExtensionLite extensionLite0, int v) {
            return ((ExtendableMessage)this.b).g(extensionLite0, v);
        }

        public final ExtendableBuilder k0(ExtensionLite extensionLite0, Object object0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.P(extensionLite0);
            this.r0(generatedMessageLite$GeneratedExtension0);
            this.c0();
            FieldSet fieldSet0 = this.n0();
            Object object1 = generatedMessageLite$GeneratedExtension0.j(object0);
            fieldSet0.h(generatedMessageLite$GeneratedExtension0.d, object1);
            return this;
        }

        public final ExtendableMessage l0() {
            if(this.c) {
                return (ExtendableMessage)this.b;
            }
            ((ExtendableMessage)this.b).extensions.I();
            return (ExtendableMessage)super.Z();
        }

        public final ExtendableBuilder m0(ExtensionLite extensionLite0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.P(extensionLite0);
            this.r0(generatedMessageLite$GeneratedExtension0);
            this.c0();
            this.n0().j(generatedMessageLite$GeneratedExtension0.d);
            return this;
        }

        private FieldSet n0() {
            FieldSet fieldSet0 = ((ExtendableMessage)this.b).extensions;
            if(fieldSet0.D()) {
                fieldSet0 = fieldSet0.k();
                ((ExtendableMessage)this.b).extensions = fieldSet0;
            }
            return fieldSet0;
        }

        void o0(FieldSet fieldSet0) {
            this.c0();
            ((ExtendableMessage)this.b).extensions = fieldSet0;
        }

        public final ExtendableBuilder p0(ExtensionLite extensionLite0, int v, Object object0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.P(extensionLite0);
            this.r0(generatedMessageLite$GeneratedExtension0);
            this.c0();
            FieldSet fieldSet0 = this.n0();
            Object object1 = generatedMessageLite$GeneratedExtension0.j(object0);
            fieldSet0.P(generatedMessageLite$GeneratedExtension0.d, v, object1);
            return this;
        }

        public final ExtendableBuilder q0(ExtensionLite extensionLite0, Object object0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.P(extensionLite0);
            this.r0(generatedMessageLite$GeneratedExtension0);
            this.c0();
            FieldSet fieldSet0 = this.n0();
            Object object1 = generatedMessageLite$GeneratedExtension0.k(object0);
            fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, object1);
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object r(ExtensionLite extensionLite0) {
            return ((ExtendableMessage)this.b).r(extensionLite0);
        }

        private void r0(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
            if(generatedMessageLite$GeneratedExtension0.h() != this.d0()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final boolean w(ExtensionLite extensionLite0) {
            return ((ExtendableMessage)this.b).w(extensionLite0);
        }
    }

    public static abstract class ExtendableMessage extends GeneratedMessageLite implements ExtendableMessageOrBuilder {
        public class ExtensionWriter {
            private final Iterator a;
            private Map.Entry b;
            private final boolean c;
            final ExtendableMessage d;

            private ExtensionWriter(boolean z) {
                Iterator iterator0 = generatedMessageLite$ExtendableMessage0.extensions.H();
                this.a = iterator0;
                if(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    this.b = (Map.Entry)object0;
                }
                this.c = z;
            }

            ExtensionWriter(boolean z, androidx.datastore.preferences.protobuf.GeneratedMessageLite.1 generatedMessageLite$10) {
                this(z);
            }

            public void a(int v, CodedOutputStream codedOutputStream0) throws IOException {
                while(this.b != null && ((ExtensionDescriptor)this.b.getKey()).getNumber() < v) {
                    ExtensionDescriptor generatedMessageLite$ExtensionDescriptor0 = (ExtensionDescriptor)this.b.getKey();
                    if(!this.c || generatedMessageLite$ExtensionDescriptor0.getLiteJavaType() != JavaType.j || generatedMessageLite$ExtensionDescriptor0.isRepeated()) {
                        FieldSet.T(generatedMessageLite$ExtensionDescriptor0, this.b.getValue(), codedOutputStream0);
                    }
                    else {
                        codedOutputStream0.c1(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((MessageLite)this.b.getValue()));
                    }
                    if(this.a.hasNext()) {
                        Object object0 = this.a.next();
                        this.b = (Map.Entry)object0;
                    }
                    else {
                        this.b = null;
                    }
                }
            }
        }

        protected FieldSet extensions;

        public ExtendableMessage() {
            this.extensions = FieldSet.s();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final int A(ExtensionLite extensionLite0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.P(extensionLite0);
            this.e1(generatedMessageLite$GeneratedExtension0);
            return this.extensions.y(generatedMessageLite$GeneratedExtension0.d);
        }

        private void R0(CodedInputStream codedInputStream0, GeneratedExtension generatedMessageLite$GeneratedExtension0, ExtensionRegistryLite extensionRegistryLite0, int v) throws IOException {
            this.b1(codedInputStream0, extensionRegistryLite0, generatedMessageLite$GeneratedExtension0, v << 3 | 2, v);
        }

        FieldSet S0() {
            if(this.extensions.D()) {
                this.extensions = this.extensions.k();
            }
            return this.extensions;
        }

        protected boolean T0() {
            return this.extensions.E();
        }

        protected int U0() {
            return this.extensions.z();
        }

        protected int V0() {
            return this.extensions.v();
        }

        protected final void W0(ExtendableMessage generatedMessageLite$ExtendableMessage0) {
            if(this.extensions.D()) {
                this.extensions = this.extensions.k();
            }
            this.extensions.J(generatedMessageLite$ExtendableMessage0.extensions);
        }

        private void X0(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0, GeneratedExtension generatedMessageLite$GeneratedExtension0) throws IOException {
            MessageLite messageLite0 = (MessageLite)this.extensions.u(generatedMessageLite$GeneratedExtension0.d);
            androidx.datastore.preferences.protobuf.MessageLite.Builder messageLite$Builder0 = messageLite0 == null ? null : messageLite0.toBuilder();
            if(messageLite$Builder0 == null) {
                messageLite$Builder0 = generatedMessageLite$GeneratedExtension0.c().newBuilderForType();
            }
            messageLite$Builder0.A8(byteString0, extensionRegistryLite0);
            MessageLite messageLite1 = messageLite$Builder0.build();
            FieldSet fieldSet0 = this.S0();
            Object object0 = generatedMessageLite$GeneratedExtension0.j(messageLite1);
            fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, object0);
        }

        private void Y0(MessageLite messageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = 0;
            ByteString byteString0 = null;
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = null;
        alab1:
            while(true) {
                do {
                label_3:
                    int v1 = codedInputStream0.Y();
                    if(v1 == 0) {
                        break alab1;
                    }
                    if(v1 != WireFormat.s) {
                        goto label_10;
                    }
                    v = codedInputStream0.Z();
                }
                while(v == 0);
                generatedMessageLite$GeneratedExtension0 = extensionRegistryLite0.c(messageLite0, v);
                goto label_3;
            label_10:
                if(v1 == WireFormat.t) {
                    if(v == 0 || generatedMessageLite$GeneratedExtension0 == null) {
                        byteString0 = codedInputStream0.x();
                    }
                    else {
                        this.R0(codedInputStream0, generatedMessageLite$GeneratedExtension0, extensionRegistryLite0, v);
                        byteString0 = null;
                    }
                    goto label_3;
                }
                if(codedInputStream0.g0(v1)) {
                    goto label_3;
                }
                break;
            }
            codedInputStream0.a(WireFormat.r);
            if(byteString0 != null && v != 0) {
                if(generatedMessageLite$GeneratedExtension0 != null) {
                    this.X0(byteString0, extensionRegistryLite0, generatedMessageLite$GeneratedExtension0);
                    return;
                }
                this.j0(v, byteString0);
            }
        }

        protected ExtensionWriter Z0() {
            return new ExtensionWriter(this, false, null);
        }

        protected ExtensionWriter a1() {
            return new ExtensionWriter(this, true, null);
        }

        private boolean b1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0, GeneratedExtension generatedMessageLite$GeneratedExtension0, int v, int v1) throws IOException {
            Object object2;
            androidx.datastore.preferences.protobuf.MessageLite.Builder messageLite$Builder0;
            boolean z1;
            boolean z;
            if(generatedMessageLite$GeneratedExtension0 == null) {
                z = true;
                z1 = false;
            }
            else if((v & 7) == FieldSet.A(generatedMessageLite$GeneratedExtension0.d.getLiteType(), false)) {
                z = false;
                z1 = false;
            }
            else if(!generatedMessageLite$GeneratedExtension0.d.d || !generatedMessageLite$GeneratedExtension0.d.c.c() || (v & 7) != FieldSet.A(generatedMessageLite$GeneratedExtension0.d.getLiteType(), true)) {
                z = true;
                z1 = false;
            }
            else {
                z1 = true;
                z = false;
            }
            if(z) {
                return this.O0(v, codedInputStream0);
            }
            this.S0();
            if(z1) {
                int v2 = codedInputStream0.t(codedInputStream0.N());
                if(generatedMessageLite$GeneratedExtension0.d.getLiteType() == FieldType.p) {
                    while(codedInputStream0.f() > 0) {
                        int v3 = codedInputStream0.z();
                        EnumLite internal$EnumLite0 = generatedMessageLite$GeneratedExtension0.d.getEnumType().findValueByNumber(v3);
                        if(internal$EnumLite0 == null) {
                            return true;
                        }
                        FieldSet fieldSet0 = this.extensions;
                        Object object0 = generatedMessageLite$GeneratedExtension0.j(internal$EnumLite0);
                        fieldSet0.h(generatedMessageLite$GeneratedExtension0.d, object0);
                    }
                }
                else {
                    while(codedInputStream0.f() > 0) {
                        Object object1 = FieldSet.N(codedInputStream0, generatedMessageLite$GeneratedExtension0.d.getLiteType(), false);
                        this.extensions.h(generatedMessageLite$GeneratedExtension0.d, object1);
                    }
                }
                codedInputStream0.s(v2);
                return true;
            }
            switch(generatedMessageLite$GeneratedExtension0.d.getLiteJavaType()) {
                case 1: {
                    if(generatedMessageLite$GeneratedExtension0.d.isRepeated()) {
                        messageLite$Builder0 = null;
                    }
                    else {
                        MessageLite messageLite0 = (MessageLite)this.extensions.u(generatedMessageLite$GeneratedExtension0.d);
                        messageLite$Builder0 = messageLite0 == null ? null : messageLite0.toBuilder();
                    }
                    if(messageLite$Builder0 == null) {
                        messageLite$Builder0 = generatedMessageLite$GeneratedExtension0.c().newBuilderForType();
                    }
                    if(generatedMessageLite$GeneratedExtension0.d.getLiteType() == FieldType.l) {
                        codedInputStream0.E(generatedMessageLite$GeneratedExtension0.d(), messageLite$Builder0, extensionRegistryLite0);
                    }
                    else {
                        codedInputStream0.I(messageLite$Builder0, extensionRegistryLite0);
                    }
                    object2 = messageLite$Builder0.build();
                    break;
                }
                case 2: {
                    int v4 = codedInputStream0.z();
                    EnumLite internal$EnumLite1 = generatedMessageLite$GeneratedExtension0.d.getEnumType().findValueByNumber(v4);
                    if(internal$EnumLite1 == null) {
                        this.l0(v1, v4);
                        return true;
                    }
                    object2 = internal$EnumLite1;
                    break;
                }
                default: {
                    object2 = FieldSet.N(codedInputStream0, generatedMessageLite$GeneratedExtension0.d.getLiteType(), false);
                }
            }
            if(generatedMessageLite$GeneratedExtension0.d.isRepeated()) {
                FieldSet fieldSet1 = this.extensions;
                Object object3 = generatedMessageLite$GeneratedExtension0.j(object2);
                fieldSet1.h(generatedMessageLite$GeneratedExtension0.d, object3);
                return true;
            }
            FieldSet fieldSet2 = this.extensions;
            Object object4 = generatedMessageLite$GeneratedExtension0.j(object2);
            fieldSet2.O(generatedMessageLite$GeneratedExtension0.d, object4);
            return true;
        }

        protected boolean c1(MessageLite messageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0, int v) throws IOException {
            return this.b1(codedInputStream0, extensionRegistryLite0, extensionRegistryLite0.c(messageLite0, v >>> 3), v, v >>> 3);
        }

        protected boolean d1(MessageLite messageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0, int v) throws IOException {
            if(v == WireFormat.q) {
                this.Y0(messageLite0, codedInputStream0, extensionRegistryLite0);
                return true;
            }
            return (v & 7) == 2 ? this.c1(messageLite0, codedInputStream0, extensionRegistryLite0, v) : codedInputStream0.g0(v);
        }

        private void e1(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
            if(generatedMessageLite$GeneratedExtension0.h() != this.e0()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object g(ExtensionLite extensionLite0, int v) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.P(extensionLite0);
            this.e1(generatedMessageLite$GeneratedExtension0);
            return generatedMessageLite$GeneratedExtension0.i(this.extensions.x(generatedMessageLite$GeneratedExtension0.d, v));
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return super.e0();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public androidx.datastore.preferences.protobuf.MessageLite.Builder newBuilderForType() {
            return super.s0();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object r(ExtensionLite extensionLite0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.P(extensionLite0);
            this.e1(generatedMessageLite$GeneratedExtension0);
            Object object0 = this.extensions.u(generatedMessageLite$GeneratedExtension0.d);
            return object0 == null ? generatedMessageLite$GeneratedExtension0.b : generatedMessageLite$GeneratedExtension0.g(object0);
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public androidx.datastore.preferences.protobuf.MessageLite.Builder toBuilder() {
            return super.Q0();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final boolean w(ExtensionLite extensionLite0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.P(extensionLite0);
            this.e1(generatedMessageLite$GeneratedExtension0);
            return this.extensions.B(generatedMessageLite$GeneratedExtension0.d);
        }
    }

    public interface ExtendableMessageOrBuilder extends MessageLiteOrBuilder {
        int A(ExtensionLite arg1);

        Object g(ExtensionLite arg1, int arg2);

        Object r(ExtensionLite arg1);

        boolean w(ExtensionLite arg1);
    }

    static final class ExtensionDescriptor implements FieldDescriptorLite {
        final EnumLiteMap a;
        final int b;
        final FieldType c;
        final boolean d;
        final boolean e;

        ExtensionDescriptor(EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, boolean z, boolean z1) {
            this.a = internal$EnumLiteMap0;
            this.b = v;
            this.c = wireFormat$FieldType0;
            this.d = z;
            this.e = z1;
        }

        public int a(ExtensionDescriptor generatedMessageLite$ExtensionDescriptor0) {
            return this.b - generatedMessageLite$ExtensionDescriptor0.b;
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((ExtensionDescriptor)object0));
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
        public EnumLiteMap getEnumType() {
            return this.a;
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
        public JavaType getLiteJavaType() {
            return this.c.a();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
        public FieldType getLiteType() {
            return this.c;
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
        public int getNumber() {
            return this.b;
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
        public boolean isPacked() {
            return this.e;
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
        public boolean isRepeated() {
            return this.d;
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
        public androidx.datastore.preferences.protobuf.MessageLite.Builder u0(androidx.datastore.preferences.protobuf.MessageLite.Builder messageLite$Builder0, MessageLite messageLite0) {
            return ((Builder)messageLite$Builder0).g0(((GeneratedMessageLite)messageLite0));
        }
    }

    public static class GeneratedExtension extends ExtensionLite {
        final MessageLite a;
        final Object b;
        final MessageLite c;
        final ExtensionDescriptor d;

        GeneratedExtension(MessageLite messageLite0, Object object0, MessageLite messageLite1, ExtensionDescriptor generatedMessageLite$ExtensionDescriptor0, Class class0) {
            if(messageLite0 == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if(generatedMessageLite$ExtensionDescriptor0.getLiteType() == FieldType.m && messageLite1 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.a = messageLite0;
            this.b = object0;
            this.c = messageLite1;
            this.d = generatedMessageLite$ExtensionDescriptor0;
        }

        @Override  // androidx.datastore.preferences.protobuf.ExtensionLite
        public Object a() {
            return this.b;
        }

        @Override  // androidx.datastore.preferences.protobuf.ExtensionLite
        public FieldType b() {
            return this.d.getLiteType();
        }

        @Override  // androidx.datastore.preferences.protobuf.ExtensionLite
        public MessageLite c() {
            return this.c;
        }

        @Override  // androidx.datastore.preferences.protobuf.ExtensionLite
        public int d() {
            return this.d.getNumber();
        }

        @Override  // androidx.datastore.preferences.protobuf.ExtensionLite
        public boolean f() {
            return this.d.d;
        }

        Object g(Object object0) {
            if(this.d.isRepeated()) {
                if(this.d.getLiteJavaType() == JavaType.i) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object1: ((List)object0)) {
                        arrayList0.add(this.i(object1));
                    }
                    return arrayList0;
                }
                return object0;
            }
            return this.i(object0);
        }

        public MessageLite h() {
            return this.a;
        }

        Object i(Object object0) {
            return this.d.getLiteJavaType() == JavaType.i ? this.d.a.findValueByNumber(((int)(((Integer)object0)))) : object0;
        }

        Object j(Object object0) {
            return this.d.getLiteJavaType() == JavaType.i ? ((EnumLite)object0).getNumber() : object0;
        }

        Object k(Object object0) {
            if(this.d.isRepeated()) {
                if(this.d.getLiteJavaType() == JavaType.i) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object1: ((List)object0)) {
                        arrayList0.add(this.j(object1));
                    }
                    return arrayList0;
                }
                return object0;
            }
            return this.j(object0);
        }
    }

    public static enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER;

    }

    public static final class SerializedForm implements Serializable {
        private final Class a;
        private final String b;
        private final byte[] c;
        private static final long d;

        SerializedForm(MessageLite messageLite0) {
            Class class0 = messageLite0.getClass();
            this.a = class0;
            this.b = class0.getName();
            this.c = messageLite0.toByteArray();
        }

        public static SerializedForm a(MessageLite messageLite0) {
            return new SerializedForm(messageLite0);
        }

        protected Object b() throws ObjectStreamException {
            try {
                Field field0 = this.d().getDeclaredField("DEFAULT_INSTANCE");
                field0.setAccessible(true);
                return ((MessageLite)field0.get(null)).newBuilderForType().mergeFrom(this.c).buildPartial();
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.b, classNotFoundException0);
            }
            catch(NoSuchFieldException unused_ex) {
                return this.c();
            }
            catch(SecurityException securityException0) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.b, securityException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException("Unable to call parsePartialFrom", illegalAccessException0);
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw new RuntimeException("Unable to understand proto buffer", invalidProtocolBufferException0);
            }
        }

        @Deprecated
        private Object c() throws ObjectStreamException {
            try {
                Field field0 = this.d().getDeclaredField("defaultInstance");
                field0.setAccessible(true);
                return ((MessageLite)field0.get(null)).newBuilderForType().mergeFrom(this.c).buildPartial();
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.b, classNotFoundException0);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.b, noSuchFieldException0);
            }
            catch(SecurityException securityException0) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.b, securityException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException("Unable to call parsePartialFrom", illegalAccessException0);
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw new RuntimeException("Unable to understand proto buffer", invalidProtocolBufferException0);
            }
        }

        private Class d() throws ClassNotFoundException {
            return this.a == null ? Class.forName(this.b) : this.a;
        }
    }

    private static Map defaultInstanceMap;
    protected int memoizedSerializedSize;
    protected UnknownFieldSetLite unknownFields;

    static {
        GeneratedMessageLite.defaultInstanceMap = new ConcurrentHashMap();
    }

    public GeneratedMessageLite() {
        this.unknownFields = UnknownFieldSetLite.e();
        this.memoizedSerializedSize = -1;
    }

    protected static GeneratedMessageLite A0(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.B0(generatedMessageLite0, codedInputStream0, ExtensionRegistryLite.d());
    }

    protected static GeneratedMessageLite B0(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.Q(GeneratedMessageLite.L0(generatedMessageLite0, codedInputStream0, extensionRegistryLite0));
    }

    protected static GeneratedMessageLite C0(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.Q(GeneratedMessageLite.L0(generatedMessageLite0, CodedInputStream.j(inputStream0), ExtensionRegistryLite.d()));
    }

    protected static GeneratedMessageLite D0(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.Q(GeneratedMessageLite.L0(generatedMessageLite0, CodedInputStream.j(inputStream0), extensionRegistryLite0));
    }

    protected static GeneratedMessageLite E0(GeneratedMessageLite generatedMessageLite0, ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.F0(generatedMessageLite0, byteBuffer0, ExtensionRegistryLite.d());
    }

    protected static GeneratedMessageLite F0(GeneratedMessageLite generatedMessageLite0, ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.Q(GeneratedMessageLite.B0(generatedMessageLite0, CodedInputStream.n(byteBuffer0), extensionRegistryLite0));
    }

    protected static GeneratedMessageLite G0(GeneratedMessageLite generatedMessageLite0, byte[] arr_b) throws InvalidProtocolBufferException {
        ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.d();
        return GeneratedMessageLite.Q(GeneratedMessageLite.M0(generatedMessageLite0, arr_b, 0, arr_b.length, extensionRegistryLite0));
    }

    protected static GeneratedMessageLite H0(GeneratedMessageLite generatedMessageLite0, byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.Q(GeneratedMessageLite.M0(generatedMessageLite0, arr_b, 0, arr_b.length, extensionRegistryLite0));
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite
    int I() {
        return this.memoizedSerializedSize;
    }

    private static GeneratedMessageLite I0(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        int v1;
        try {
            int v = inputStream0.read();
            if(v == -1) {
                return null;
            }
            v1 = CodedInputStream.O(v, inputStream0);
        }
        catch(IOException iOException0) {
            throw new InvalidProtocolBufferException(iOException0.getMessage());
        }
        CodedInputStream codedInputStream0 = CodedInputStream.j(new LimitedInputStream(inputStream0, v1));
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.L0(generatedMessageLite0, codedInputStream0, extensionRegistryLite0);
        try {
            codedInputStream0.a(0);
            return generatedMessageLite1;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw invalidProtocolBufferException0.j(generatedMessageLite1);
        }
    }

    private static GeneratedMessageLite J0(GeneratedMessageLite generatedMessageLite0, ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream0 = byteString0.H();
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.L0(generatedMessageLite0, codedInputStream0, extensionRegistryLite0);
        try {
            codedInputStream0.a(0);
            return generatedMessageLite1;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw invalidProtocolBufferException0.j(generatedMessageLite1);
        }
    }

    protected static GeneratedMessageLite K0(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.L0(generatedMessageLite0, codedInputStream0, ExtensionRegistryLite.d());
    }

    static GeneratedMessageLite L0(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = (GeneratedMessageLite)generatedMessageLite0.T(MethodToInvoke.d);
        try {
            Schema schema0 = Protobuf.a().j(generatedMessageLite1);
            schema0.b(generatedMessageLite1, CodedInputStreamReader.j(codedInputStream0), extensionRegistryLite0);
            schema0.makeImmutable(generatedMessageLite1);
            return generatedMessageLite1;
        }
        catch(IOException iOException0) {
            throw iOException0.getCause() instanceof InvalidProtocolBufferException ? ((InvalidProtocolBufferException)iOException0.getCause()) : new InvalidProtocolBufferException(iOException0.getMessage()).j(generatedMessageLite1);
        }
        catch(RuntimeException runtimeException0) {
            if(runtimeException0.getCause() instanceof InvalidProtocolBufferException) {
                throw (InvalidProtocolBufferException)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite
    void M(int v) {
        this.memoizedSerializedSize = v;
    }

    static GeneratedMessageLite M0(GeneratedMessageLite generatedMessageLite0, byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = (GeneratedMessageLite)generatedMessageLite0.T(MethodToInvoke.d);
        try {
            Schema schema0 = Protobuf.a().j(generatedMessageLite1);
            schema0.c(generatedMessageLite1, arr_b, v, v + v1, new Registers(extensionRegistryLite0));
            schema0.makeImmutable(generatedMessageLite1);
            if(generatedMessageLite1.memoizedHashCode != 0) {
                throw new RuntimeException();
            }
            return generatedMessageLite1;
        }
        catch(IOException iOException0) {
            throw iOException0.getCause() instanceof InvalidProtocolBufferException ? ((InvalidProtocolBufferException)iOException0.getCause()) : new InvalidProtocolBufferException(iOException0.getMessage()).j(generatedMessageLite1);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw InvalidProtocolBufferException.l().j(generatedMessageLite1);
        }
    }

    private static GeneratedMessageLite N0(GeneratedMessageLite generatedMessageLite0, byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.Q(GeneratedMessageLite.M0(generatedMessageLite0, arr_b, 0, arr_b.length, extensionRegistryLite0));
    }

    Object O() throws Exception {
        return this.T(MethodToInvoke.c);
    }

    protected boolean O0(int v, CodedInputStream codedInputStream0) throws IOException {
        if((v & 7) == 4) {
            return false;
        }
        this.c0();
        return this.unknownFields.k(v, codedInputStream0);
    }

    private static GeneratedExtension P(ExtensionLite extensionLite0) {
        return (GeneratedExtension)extensionLite0;
    }

    protected static void P0(Class class0, GeneratedMessageLite generatedMessageLite0) {
        GeneratedMessageLite.defaultInstanceMap.put(class0, generatedMessageLite0);
    }

    private static GeneratedMessageLite Q(GeneratedMessageLite generatedMessageLite0) throws InvalidProtocolBufferException {
        if(generatedMessageLite0 != null && !generatedMessageLite0.isInitialized()) {
            throw generatedMessageLite0.L().a().j(generatedMessageLite0);
        }
        return generatedMessageLite0;
    }

    public final Builder Q0() {
        Builder generatedMessageLite$Builder0 = (Builder)this.T(MethodToInvoke.e);
        generatedMessageLite$Builder0.g0(this);
        return generatedMessageLite$Builder0;
    }

    protected final Builder R() {
        return (Builder)this.T(MethodToInvoke.e);
    }

    protected final Builder S(GeneratedMessageLite generatedMessageLite0) {
        return this.R().g0(generatedMessageLite0);
    }

    protected Object T(MethodToInvoke generatedMessageLite$MethodToInvoke0) {
        return this.V(generatedMessageLite$MethodToInvoke0, null, null);
    }

    protected Object U(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0) {
        return this.V(generatedMessageLite$MethodToInvoke0, object0, null);
    }

    protected abstract Object V(MethodToInvoke arg1, Object arg2, Object arg3);

    protected static BooleanList W() {
        return BooleanArrayList.g();
    }

    protected static DoubleList X() {
        return DoubleArrayList.g();
    }

    protected static FloatList Y() {
        return FloatArrayList.g();
    }

    protected static IntList Z() {
        return IntArrayList.g();
    }

    protected static LongList a0() {
        return LongArrayList.g();
    }

    protected static ProtobufList b0() {
        return ProtobufArrayList.c();
    }

    private final void c0() {
        if(this.unknownFields == UnknownFieldSetLite.e()) {
            this.unknownFields = UnknownFieldSetLite.p();
        }
    }

    static GeneratedMessageLite d0(Class class0) {
        GeneratedMessageLite generatedMessageLite0 = (GeneratedMessageLite)GeneratedMessageLite.defaultInstanceMap.get(class0);
        if(generatedMessageLite0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            generatedMessageLite0 = (GeneratedMessageLite)GeneratedMessageLite.defaultInstanceMap.get(class0);
        }
        if(generatedMessageLite0 == null) {
            generatedMessageLite0 = ((GeneratedMessageLite)UnsafeUtil.j(class0)).e0();
            if(generatedMessageLite0 == null) {
                throw new IllegalStateException();
            }
            GeneratedMessageLite.defaultInstanceMap.put(class0, generatedMessageLite0);
            return generatedMessageLite0;
        }
        return generatedMessageLite0;
    }

    public final GeneratedMessageLite e0() {
        return (GeneratedMessageLite)this.T(MethodToInvoke.f);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return this.e0().getClass().isInstance(object0) ? Protobuf.a().j(this).equals(this, ((GeneratedMessageLite)object0)) : false;
    }

    static Method f0(Class class0, String s, Class[] arr_class) {
        try {
            return class0.getMethod(s, arr_class);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException("Generated message class \"" + class0.getName() + "\" missing method \"" + s + "\".", noSuchMethodException0);
        }
    }

    static Object g0(Method method0, Object object0, Object[] arr_object) {
        try {
            return method0.invoke(object0, arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            if(throwable0 instanceof Error) {
                throw (Error)throwable0;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public MessageLite getDefaultInstanceForType() {
        return this.e0();
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public final Parser getParserForType() {
        return (Parser)this.T(MethodToInvoke.g);
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public int getSerializedSize() {
        if(this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = Protobuf.a().j(this).getSerializedSize(this);
        }
        return this.memoizedSerializedSize;
    }

    protected static final boolean h0(GeneratedMessageLite generatedMessageLite0, boolean z) {
        int v = (byte)(((Byte)generatedMessageLite0.T(MethodToInvoke.a)));
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        boolean z1 = Protobuf.a().j(generatedMessageLite0).isInitialized(generatedMessageLite0);
        if(z) {
            generatedMessageLite0.U(MethodToInvoke.b, (z1 ? generatedMessageLite0 : null));
        }
        return z1;
    }

    @Override
    public int hashCode() {
        int v = this.memoizedHashCode;
        if(v != 0) {
            return v;
        }
        int v1 = Protobuf.a().j(this).hashCode(this);
        this.memoizedHashCode = v1;
        return v1;
    }

    protected void i0() {
        Protobuf.a().j(this).makeImmutable(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return GeneratedMessageLite.h0(this, true);
    }

    protected void j0(int v, ByteString byteString0) {
        this.c0();
        this.unknownFields.m(v, byteString0);
    }

    protected final void k0(UnknownFieldSetLite unknownFieldSetLite0) {
        this.unknownFields = UnknownFieldSetLite.o(this.unknownFields, unknownFieldSetLite0);
    }

    protected void l0(int v, int v1) {
        this.c0();
        this.unknownFields.n(v, v1);
    }

    protected static BooleanList m0(BooleanList internal$BooleanList0) {
        int v = internal$BooleanList0.size();
        return v == 0 ? internal$BooleanList0.mutableCopyWithCapacity(10) : internal$BooleanList0.mutableCopyWithCapacity(v * 2);
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public void n(CodedOutputStream codedOutputStream0) throws IOException {
        Protobuf.a().j(this).a(this, CodedOutputStreamWriter.g(codedOutputStream0));
    }

    protected static DoubleList n0(DoubleList internal$DoubleList0) {
        int v = internal$DoubleList0.size();
        return v == 0 ? internal$DoubleList0.mutableCopyWithCapacity(10) : internal$DoubleList0.mutableCopyWithCapacity(v * 2);
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public androidx.datastore.preferences.protobuf.MessageLite.Builder newBuilderForType() {
        return this.s0();
    }

    protected static FloatList o0(FloatList internal$FloatList0) {
        int v = internal$FloatList0.size();
        return v == 0 ? internal$FloatList0.mutableCopyWithCapacity(10) : internal$FloatList0.mutableCopyWithCapacity(v * 2);
    }

    protected static IntList p0(IntList internal$IntList0) {
        int v = internal$IntList0.size();
        return v == 0 ? internal$IntList0.mutableCopyWithCapacity(10) : internal$IntList0.mutableCopyWithCapacity(v * 2);
    }

    protected static LongList q0(LongList internal$LongList0) {
        int v = internal$LongList0.size();
        return v == 0 ? internal$LongList0.mutableCopyWithCapacity(10) : internal$LongList0.mutableCopyWithCapacity(v * 2);
    }

    protected static ProtobufList r0(ProtobufList internal$ProtobufList0) {
        int v = internal$ProtobufList0.size();
        return v == 0 ? internal$ProtobufList0.mutableCopyWithCapacity(10) : internal$ProtobufList0.mutableCopyWithCapacity(v * 2);
    }

    public final Builder s0() {
        return (Builder)this.T(MethodToInvoke.e);
    }

    protected static Object t0(MessageLite messageLite0, String s, Object[] arr_object) {
        return new RawMessageInfo(messageLite0, s, arr_object);
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public androidx.datastore.preferences.protobuf.MessageLite.Builder toBuilder() {
        return this.Q0();
    }

    @Override
    public String toString() {
        return MessageLiteToString.e(this, super.toString());
    }

    public static GeneratedExtension u0(MessageLite messageLite0, MessageLite messageLite1, EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, boolean z, Class class0) {
        return new GeneratedExtension(messageLite0, Collections.emptyList(), messageLite1, new ExtensionDescriptor(internal$EnumLiteMap0, v, wireFormat$FieldType0, true, z), class0);
    }

    public static GeneratedExtension v0(MessageLite messageLite0, Object object0, MessageLite messageLite1, EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, Class class0) {
        return new GeneratedExtension(messageLite0, object0, messageLite1, new ExtensionDescriptor(internal$EnumLiteMap0, v, wireFormat$FieldType0, false, false), class0);
    }

    protected static GeneratedMessageLite w0(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.Q(GeneratedMessageLite.I0(generatedMessageLite0, inputStream0, ExtensionRegistryLite.d()));
    }

    protected static GeneratedMessageLite x0(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.Q(GeneratedMessageLite.I0(generatedMessageLite0, inputStream0, extensionRegistryLite0));
    }

    protected static GeneratedMessageLite y0(GeneratedMessageLite generatedMessageLite0, ByteString byteString0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.Q(GeneratedMessageLite.z0(generatedMessageLite0, byteString0, ExtensionRegistryLite.d()));
    }

    protected static GeneratedMessageLite z0(GeneratedMessageLite generatedMessageLite0, ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.Q(GeneratedMessageLite.J0(generatedMessageLite0, byteString0, extensionRegistryLite0));
    }
}

