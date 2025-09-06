package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class MessageSetSchema implements Schema {
    private final MessageLite a;
    private final UnknownFieldSchema b;
    private final boolean c;
    private final ExtensionSchema d;

    private MessageSetSchema(UnknownFieldSchema unknownFieldSchema0, ExtensionSchema extensionSchema0, MessageLite messageLite0) {
        this.b = unknownFieldSchema0;
        this.c = extensionSchema0.e(messageLite0);
        this.d = extensionSchema0;
        this.a = messageLite0;
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public void a(Object object0, Writer writer0) throws IOException {
        Iterator iterator0 = this.d.c(object0).H();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldDescriptorLite)map$Entry0.getKey();
            if(fieldSet$FieldDescriptorLite0.getLiteJavaType() != JavaType.j || fieldSet$FieldDescriptorLite0.isRepeated() || fieldSet$FieldDescriptorLite0.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if(map$Entry0 instanceof LazyEntry) {
                writer0.writeMessageSetItem(fieldSet$FieldDescriptorLite0.getNumber(), ((LazyEntry)map$Entry0).a().n());
            }
            else {
                writer0.writeMessageSetItem(fieldSet$FieldDescriptorLite0.getNumber(), map$Entry0.getValue());
            }
        }
        this.h(this.b, object0, writer0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public void b(Object object0, Reader reader0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.e(this.b, this.d, object0, reader0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public void c(Object object0, byte[] arr_b, int v, int v1, Registers arrayDecoders$Registers0) throws IOException {
        UnknownFieldSetLite unknownFieldSetLite0 = ((GeneratedMessageLite)object0).unknownFields;
        if(unknownFieldSetLite0 == UnknownFieldSetLite.e()) {
            unknownFieldSetLite0 = UnknownFieldSetLite.p();
            ((GeneratedMessageLite)object0).unknownFields = unknownFieldSetLite0;
        }
        FieldSet fieldSet0 = ((ExtendableMessage)object0).S0();
        GeneratedExtension generatedMessageLite$GeneratedExtension0 = null;
        while(v < v1) {
            int v2 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
            int v3 = arrayDecoders$Registers0.a;
            if(v3 == WireFormat.q) {
                int v4 = 0;
                ByteString byteString0 = null;
                while(v2 < v1) {
                    v2 = ArrayDecoders.I(arr_b, v2, arrayDecoders$Registers0);
                    int v5 = arrayDecoders$Registers0.a;
                    int v6 = v5 & 7;
                    switch(v5 >>> 3) {
                        case 2: {
                            if(v6 == 0) {
                                v2 = ArrayDecoders.I(arr_b, v2, arrayDecoders$Registers0);
                                v4 = arrayDecoders$Registers0.a;
                                generatedMessageLite$GeneratedExtension0 = (GeneratedExtension)this.d.b(arrayDecoders$Registers0.d, this.a, v4);
                                continue;
                            }
                            break;
                        }
                        case 3: {
                            if(generatedMessageLite$GeneratedExtension0 != null) {
                                v2 = ArrayDecoders.p(Protobuf.a().i(generatedMessageLite$GeneratedExtension0.c().getClass()), arr_b, v2, v1, arrayDecoders$Registers0);
                                fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, arrayDecoders$Registers0.c);
                                continue;
                            }
                            else if(v6 == 2) {
                                v2 = ArrayDecoders.b(arr_b, v2, arrayDecoders$Registers0);
                                byteString0 = (ByteString)arrayDecoders$Registers0.c;
                                continue;
                            }
                        }
                    }
                    if(v5 == WireFormat.r) {
                        break;
                    }
                    v2 = ArrayDecoders.N(v5, arr_b, v2, v1, arrayDecoders$Registers0);
                }
                if(byteString0 != null) {
                    unknownFieldSetLite0.r(v4 << 3 | 2, byteString0);
                }
                v = v2;
            }
            else if((v3 & 7) == 2) {
                GeneratedExtension generatedMessageLite$GeneratedExtension1 = (GeneratedExtension)this.d.b(arrayDecoders$Registers0.d, this.a, v3 >>> 3);
                if(generatedMessageLite$GeneratedExtension1 == null) {
                    v = ArrayDecoders.G(v3, arr_b, v2, v1, unknownFieldSetLite0, arrayDecoders$Registers0);
                }
                else {
                    v = ArrayDecoders.p(Protobuf.a().i(generatedMessageLite$GeneratedExtension1.c().getClass()), arr_b, v2, v1, arrayDecoders$Registers0);
                    fieldSet0.O(generatedMessageLite$GeneratedExtension1.d, arrayDecoders$Registers0.c);
                }
                generatedMessageLite$GeneratedExtension0 = generatedMessageLite$GeneratedExtension1;
            }
            else {
                v = ArrayDecoders.N(v3, arr_b, v2, v1, arrayDecoders$Registers0);
            }
        }
        if(v != v1) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private int d(UnknownFieldSchema unknownFieldSchema0, Object object0) {
        return unknownFieldSchema0.i(unknownFieldSchema0.g(object0));
    }

    private void e(UnknownFieldSchema unknownFieldSchema0, ExtensionSchema extensionSchema0, Object object0, Reader reader0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        Object object1 = unknownFieldSchema0.f(object0);
        FieldSet fieldSet0 = extensionSchema0.d(object0);
        try {
            do {
                if(reader0.getFieldNumber() == 0x7FFFFFFF) {
                    return;
                }
            }
            while(this.g(reader0, extensionRegistryLite0, extensionSchema0, fieldSet0, unknownFieldSchema0, object1));
        }
        finally {
            unknownFieldSchema0.o(object0, object1);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(Object object0, Object object1) {
        if(!this.b.g(object0).equals(this.b.g(object1))) {
            return false;
        }
        return this.c ? this.d.c(object0).equals(this.d.c(object1)) : true;
    }

    static MessageSetSchema f(UnknownFieldSchema unknownFieldSchema0, ExtensionSchema extensionSchema0, MessageLite messageLite0) {
        return new MessageSetSchema(unknownFieldSchema0, extensionSchema0, messageLite0);
    }

    private boolean g(Reader reader0, ExtensionRegistryLite extensionRegistryLite0, ExtensionSchema extensionSchema0, FieldSet fieldSet0, UnknownFieldSchema unknownFieldSchema0, Object object0) throws IOException {
        int v = reader0.getTag();
        if(v != WireFormat.q) {
            if((v & 7) == 2) {
                Object object1 = extensionSchema0.b(extensionRegistryLite0, this.a, v >>> 3);
                if(object1 != null) {
                    extensionSchema0.h(reader0, object1, extensionRegistryLite0, fieldSet0);
                    return true;
                }
                return unknownFieldSchema0.m(object0, reader0);
            }
            return reader0.skipField();
        }
        Object object2 = null;
        ByteString byteString0 = null;
        int v1 = 0;
        while(reader0.getFieldNumber() != 0x7FFFFFFF) {
            int v2 = reader0.getTag();
            if(v2 == WireFormat.s) {
                v1 = reader0.readUInt32();
                object2 = extensionSchema0.b(extensionRegistryLite0, this.a, v1);
            }
            else if(v2 == WireFormat.t) {
                if(object2 == null) {
                    byteString0 = reader0.readBytes();
                }
                else {
                    extensionSchema0.h(reader0, object2, extensionRegistryLite0, fieldSet0);
                }
            }
            else if(!reader0.skipField()) {
                break;
            }
        }
        if(reader0.getTag() != WireFormat.r) {
            throw InvalidProtocolBufferException.b();
        }
        if(byteString0 != null) {
            if(object2 != null) {
                extensionSchema0.i(byteString0, object2, extensionRegistryLite0, fieldSet0);
                return true;
            }
            unknownFieldSchema0.d(object0, v1, byteString0);
        }
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(Object object0) {
        int v = this.d(this.b, object0);
        return this.c ? v + this.d.c(object0).v() : v;
    }

    private void h(UnknownFieldSchema unknownFieldSchema0, Object object0, Writer writer0) throws IOException {
        unknownFieldSchema0.s(unknownFieldSchema0.g(object0), writer0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(Object object0) {
        int v = this.b.g(object0).hashCode();
        return this.c ? v * 53 + this.d.c(object0).hashCode() : v;
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(Object object0) {
        return this.d.c(object0).E();
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(Object object0) {
        this.b.j(object0);
        this.d.f(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(Object object0, Object object1) {
        SchemaUtil.J(this.b, object0, object1);
        if(this.c) {
            SchemaUtil.H(this.d, object0, object1);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public Object newInstance() {
        return this.a.newBuilderForType().buildPartial();
    }
}

