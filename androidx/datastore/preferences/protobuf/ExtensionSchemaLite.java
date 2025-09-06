package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class ExtensionSchemaLite extends ExtensionSchema {
    @Override  // androidx.datastore.preferences.protobuf.ExtensionSchema
    int a(Map.Entry map$Entry0) {
        return ((ExtensionDescriptor)map$Entry0.getKey()).getNumber();
    }

    @Override  // androidx.datastore.preferences.protobuf.ExtensionSchema
    Object b(ExtensionRegistryLite extensionRegistryLite0, MessageLite messageLite0, int v) {
        return extensionRegistryLite0.c(messageLite0, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ExtensionSchema
    FieldSet c(Object object0) {
        return ((ExtendableMessage)object0).extensions;
    }

    @Override  // androidx.datastore.preferences.protobuf.ExtensionSchema
    FieldSet d(Object object0) {
        return ((ExtendableMessage)object0).S0();
    }

    @Override  // androidx.datastore.preferences.protobuf.ExtensionSchema
    boolean e(MessageLite messageLite0) {
        return messageLite0 instanceof ExtendableMessage;
    }

    @Override  // androidx.datastore.preferences.protobuf.ExtensionSchema
    void f(Object object0) {
        this.c(object0).I();
    }

    @Override  // androidx.datastore.preferences.protobuf.ExtensionSchema
    Object g(Reader reader0, Object object0, ExtensionRegistryLite extensionRegistryLite0, FieldSet fieldSet0, Object object1, UnknownFieldSchema unknownFieldSchema0) throws IOException {
        Object object2;
        ArrayList arrayList0;
        int v = ((GeneratedExtension)object0).d();
        if(((GeneratedExtension)object0).d.isRepeated() && ((GeneratedExtension)object0).d.isPacked()) {
            switch(((GeneratedExtension)object0).b()) {
                case 1: {
                    arrayList0 = new ArrayList();
                    reader0.readDoubleList(arrayList0);
                    break;
                }
                case 2: {
                    arrayList0 = new ArrayList();
                    reader0.readFloatList(arrayList0);
                    break;
                }
                case 3: {
                    arrayList0 = new ArrayList();
                    reader0.readInt64List(arrayList0);
                    break;
                }
                case 4: {
                    arrayList0 = new ArrayList();
                    reader0.readUInt64List(arrayList0);
                    break;
                }
                case 5: {
                    arrayList0 = new ArrayList();
                    reader0.readInt32List(arrayList0);
                    break;
                }
                case 6: {
                    arrayList0 = new ArrayList();
                    reader0.readFixed64List(arrayList0);
                    break;
                }
                case 7: {
                    arrayList0 = new ArrayList();
                    reader0.readFixed32List(arrayList0);
                    break;
                }
                case 8: {
                    arrayList0 = new ArrayList();
                    reader0.readBoolList(arrayList0);
                    break;
                }
                case 9: {
                    arrayList0 = new ArrayList();
                    reader0.readUInt32List(arrayList0);
                    break;
                }
                case 10: {
                    arrayList0 = new ArrayList();
                    reader0.readSFixed32List(arrayList0);
                    break;
                }
                case 11: {
                    arrayList0 = new ArrayList();
                    reader0.readSFixed64List(arrayList0);
                    break;
                }
                case 12: {
                    arrayList0 = new ArrayList();
                    reader0.readSInt32List(arrayList0);
                    break;
                }
                case 13: {
                    arrayList0 = new ArrayList();
                    reader0.readSInt64List(arrayList0);
                    break;
                }
                case 14: {
                    arrayList0 = new ArrayList();
                    reader0.readEnumList(arrayList0);
                    object1 = SchemaUtil.B(v, arrayList0, ((GeneratedExtension)object0).d.getEnumType(), object1, unknownFieldSchema0);
                    break;
                }
                default: {
                    throw new IllegalStateException("Type cannot be packed: " + ((GeneratedExtension)object0).d.getLiteType());
                }
            }
            fieldSet0.O(((GeneratedExtension)object0).d, arrayList0);
            return object1;
        }
        if(((GeneratedExtension)object0).b() == FieldType.p) {
            int v1 = reader0.readInt32();
            if(((GeneratedExtension)object0).d.getEnumType().findValueByNumber(v1) == null) {
                return SchemaUtil.Q(v, v1, object1, unknownFieldSchema0);
            }
            object2 = v1;
        }
        else {
            switch(((GeneratedExtension)object0).b()) {
                case 1: {
                    object2 = reader0.readDouble();
                    break;
                }
                case 2: {
                    object2 = reader0.readFloat();
                    break;
                }
                case 3: {
                    object2 = reader0.readInt64();
                    break;
                }
                case 4: {
                    object2 = reader0.readUInt64();
                    break;
                }
                case 5: {
                    object2 = reader0.readInt32();
                    break;
                }
                case 6: {
                    object2 = reader0.readFixed64();
                    break;
                }
                case 7: {
                    object2 = reader0.readFixed32();
                    break;
                }
                case 8: {
                    object2 = Boolean.valueOf(reader0.readBool());
                    break;
                }
                case 9: {
                    object2 = reader0.readUInt32();
                    break;
                }
                case 10: {
                    object2 = reader0.readSFixed32();
                    break;
                }
                case 11: {
                    object2 = reader0.readSFixed64();
                    break;
                }
                case 12: {
                    object2 = reader0.readSInt32();
                    break;
                }
                case 13: {
                    object2 = reader0.readSInt64();
                    break;
                }
                case 14: {
                    throw new IllegalStateException("Shouldn\'t reach here.");
                }
                case 15: {
                    object2 = reader0.readBytes();
                    break;
                }
                case 16: {
                    object2 = reader0.readString();
                    break;
                }
                case 17: {
                    object2 = reader0.f(((GeneratedExtension)object0).c().getClass(), extensionRegistryLite0);
                    break;
                }
                case 18: {
                    object2 = reader0.b(((GeneratedExtension)object0).c().getClass(), extensionRegistryLite0);
                    break;
                }
                default: {
                    object2 = null;
                    break;
                }
            }
        }
        if(((GeneratedExtension)object0).f()) {
            fieldSet0.h(((GeneratedExtension)object0).d, object2);
            return object1;
        }
        switch(((GeneratedExtension)object0).b()) {
            case 17: 
            case 18: {
                Object object3 = fieldSet0.u(((GeneratedExtension)object0).d);
                if(object3 != null) {
                    object2 = Internal.v(object3, object2);
                }
            }
        }
        fieldSet0.O(((GeneratedExtension)object0).d, object2);
        return object1;
    }

    @Override  // androidx.datastore.preferences.protobuf.ExtensionSchema
    void h(Reader reader0, Object object0, ExtensionRegistryLite extensionRegistryLite0, FieldSet fieldSet0) throws IOException {
        Object object1 = reader0.b(((GeneratedExtension)object0).c().getClass(), extensionRegistryLite0);
        fieldSet0.O(((GeneratedExtension)object0).d, object1);
    }

    @Override  // androidx.datastore.preferences.protobuf.ExtensionSchema
    void i(ByteString byteString0, Object object0, ExtensionRegistryLite extensionRegistryLite0, FieldSet fieldSet0) throws IOException {
        MessageLite messageLite0 = ((GeneratedExtension)object0).c().newBuilderForType().buildPartial();
        BinaryReader binaryReader0 = BinaryReader.k(ByteBuffer.wrap(byteString0.W()), true);
        Protobuf.a().f(messageLite0, binaryReader0, extensionRegistryLite0);
        fieldSet0.O(((GeneratedExtension)object0).d, messageLite0);
        if(binaryReader0.getFieldNumber() != 0x7FFFFFFF) {
            throw InvalidProtocolBufferException.b();
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.ExtensionSchema
    void j(Writer writer0, Map.Entry map$Entry0) throws IOException {
        ExtensionDescriptor generatedMessageLite$ExtensionDescriptor0 = (ExtensionDescriptor)map$Entry0.getKey();
        if(generatedMessageLite$ExtensionDescriptor0.isRepeated()) {
            switch(generatedMessageLite$ExtensionDescriptor0.getLiteType()) {
                case 1: {
                    SchemaUtil.Y(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 2: {
                    SchemaUtil.g0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 3: {
                    SchemaUtil.m0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 4: {
                    SchemaUtil.F0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 5: {
                    SchemaUtil.k0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 6: {
                    SchemaUtil.e0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 7: {
                    SchemaUtil.c0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 8: {
                    SchemaUtil.U(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 9: {
                    SchemaUtil.D0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 10: {
                    SchemaUtil.s0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 11: {
                    SchemaUtil.u0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 12: {
                    SchemaUtil.w0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 13: {
                    SchemaUtil.y0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 14: {
                    SchemaUtil.k0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$ExtensionDescriptor0.isPacked());
                    return;
                }
                case 15: {
                    SchemaUtil.W(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0);
                    return;
                }
                case 16: {
                    SchemaUtil.B0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0);
                    return;
                }
                case 17: {
                    List list0 = (List)map$Entry0.getValue();
                    if(list0 != null && !list0.isEmpty()) {
                        SchemaUtil.i0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, Protobuf.a().i(list0.get(0).getClass()));
                        return;
                    }
                    break;
                }
                case 18: {
                    List list1 = (List)map$Entry0.getValue();
                    if(list1 != null && !list1.isEmpty()) {
                        SchemaUtil.q0(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((List)map$Entry0.getValue()), writer0, Protobuf.a().i(list1.get(0).getClass()));
                        return;
                    }
                    break;
                }
            }
        }
        else {
            switch(generatedMessageLite$ExtensionDescriptor0.getLiteType()) {
                case 1: {
                    writer0.writeDouble(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((double)(((Double)map$Entry0.getValue()))));
                    break;
                }
                case 2: {
                    writer0.writeFloat(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((float)(((Float)map$Entry0.getValue()))));
                    return;
                }
                case 3: {
                    writer0.writeInt64(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 4: {
                    writer0.writeUInt64(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 5: {
                    writer0.writeInt32(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 6: {
                    writer0.writeFixed64(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 7: {
                    writer0.writeFixed32(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 8: {
                    writer0.writeBool(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((Boolean)map$Entry0.getValue()).booleanValue());
                    return;
                }
                case 9: {
                    writer0.writeUInt32(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 10: {
                    writer0.writeSFixed32(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 11: {
                    writer0.writeSFixed64(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 12: {
                    writer0.writeSInt32(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 13: {
                    writer0.writeSInt64(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 14: {
                    writer0.writeInt32(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 15: {
                    writer0.a(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((ByteString)map$Entry0.getValue()));
                    return;
                }
                case 16: {
                    writer0.writeString(generatedMessageLite$ExtensionDescriptor0.getNumber(), ((String)map$Entry0.getValue()));
                    return;
                }
                case 17: {
                    writer0.e(generatedMessageLite$ExtensionDescriptor0.getNumber(), map$Entry0.getValue(), Protobuf.a().i(map$Entry0.getValue().getClass()));
                    return;
                }
                case 18: {
                    writer0.b(generatedMessageLite$ExtensionDescriptor0.getNumber(), map$Entry0.getValue(), Protobuf.a().i(map$Entry0.getValue().getClass()));
                }
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.ExtensionSchema
    void k(Object object0, FieldSet fieldSet0) {
        ((ExtendableMessage)object0).extensions = fieldSet0;
    }
}

