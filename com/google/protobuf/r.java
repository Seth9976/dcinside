package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

@k
final class r extends q {
    static class a {
        static final int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] arr_v = new int[FieldType.values().length];
            a.$SwitchMap$com$google$protobuf$WireFormat$FieldType = arr_v;
            try {
                arr_v[FieldType.DOUBLE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.FLOAT.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.INT64.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.UINT64.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.INT32.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.FIXED64.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.FIXED32.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.BOOL.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.UINT32.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SFIXED32.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SFIXED64.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SINT32.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SINT64.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.ENUM.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.BYTES.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.STRING.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.GROUP.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.MESSAGE.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    @Override  // com.google.protobuf.q
    int extensionNumber(Map.Entry map$Entry0) {
        return ((b)map$Entry0.getKey()).getNumber();
    }

    @Override  // com.google.protobuf.q
    Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite0, MessageLite messageLite0, int v) {
        return extensionRegistryLite0.findLiteExtensionByNumber(messageLite0, v);
    }

    @Override  // com.google.protobuf.q
    FieldSet getExtensions(Object object0) {
        return ((ExtendableMessage)object0).extensions;
    }

    @Override  // com.google.protobuf.q
    FieldSet getMutableExtensions(Object object0) {
        return ((ExtendableMessage)object0).ensureExtensionsAreMutable();
    }

    @Override  // com.google.protobuf.q
    boolean hasExtensions(MessageLite messageLite0) {
        return messageLite0 instanceof ExtendableMessage;
    }

    @Override  // com.google.protobuf.q
    void makeImmutable(Object object0) {
        this.getExtensions(object0).makeImmutable();
    }

    @Override  // com.google.protobuf.q
    Object parseExtension(Object object0, a0 a00, Object object1, ExtensionRegistryLite extensionRegistryLite0, FieldSet fieldSet0, Object object2, h0 h00) throws IOException {
        Object object3;
        ArrayList arrayList0;
        GeneratedExtension generatedMessageLite$GeneratedExtension0 = (GeneratedExtension)object1;
        int v = generatedMessageLite$GeneratedExtension0.getNumber();
        if(generatedMessageLite$GeneratedExtension0.descriptor.isRepeated() && generatedMessageLite$GeneratedExtension0.descriptor.isPacked()) {
            switch(generatedMessageLite$GeneratedExtension0.getLiteType()) {
                case 1: {
                    arrayList0 = new ArrayList();
                    a00.readDoubleList(arrayList0);
                    break;
                }
                case 2: {
                    arrayList0 = new ArrayList();
                    a00.readFloatList(arrayList0);
                    break;
                }
                case 3: {
                    arrayList0 = new ArrayList();
                    a00.readInt64List(arrayList0);
                    break;
                }
                case 4: {
                    arrayList0 = new ArrayList();
                    a00.readUInt64List(arrayList0);
                    break;
                }
                case 5: {
                    arrayList0 = new ArrayList();
                    a00.readInt32List(arrayList0);
                    break;
                }
                case 6: {
                    arrayList0 = new ArrayList();
                    a00.readFixed64List(arrayList0);
                    break;
                }
                case 7: {
                    arrayList0 = new ArrayList();
                    a00.readFixed32List(arrayList0);
                    break;
                }
                case 8: {
                    arrayList0 = new ArrayList();
                    a00.readBoolList(arrayList0);
                    break;
                }
                case 9: {
                    arrayList0 = new ArrayList();
                    a00.readUInt32List(arrayList0);
                    break;
                }
                case 10: {
                    arrayList0 = new ArrayList();
                    a00.readSFixed32List(arrayList0);
                    break;
                }
                case 11: {
                    arrayList0 = new ArrayList();
                    a00.readSFixed64List(arrayList0);
                    break;
                }
                case 12: {
                    arrayList0 = new ArrayList();
                    a00.readSInt32List(arrayList0);
                    break;
                }
                case 13: {
                    arrayList0 = new ArrayList();
                    a00.readSInt64List(arrayList0);
                    break;
                }
                case 14: {
                    arrayList0 = new ArrayList();
                    a00.readEnumList(arrayList0);
                    object2 = e0.filterUnknownEnumList(object0, v, arrayList0, generatedMessageLite$GeneratedExtension0.descriptor.getEnumType(), object2, h00);
                    break;
                }
                default: {
                    throw new IllegalStateException("Type cannot be packed: " + generatedMessageLite$GeneratedExtension0.descriptor.getLiteType());
                }
            }
            fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, arrayList0);
            return object2;
        }
        if(generatedMessageLite$GeneratedExtension0.getLiteType() == FieldType.ENUM) {
            int v1 = a00.readInt32();
            if(generatedMessageLite$GeneratedExtension0.descriptor.getEnumType().findValueByNumber(v1) == null) {
                return e0.storeUnknownEnum(object0, v, v1, object2, h00);
            }
            object3 = v1;
        }
        else {
            switch(generatedMessageLite$GeneratedExtension0.getLiteType()) {
                case 1: {
                    object3 = a00.readDouble();
                    break;
                }
                case 2: {
                    object3 = a00.readFloat();
                    break;
                }
                case 3: {
                    object3 = a00.readInt64();
                    break;
                }
                case 4: {
                    object3 = a00.readUInt64();
                    break;
                }
                case 5: {
                    object3 = a00.readInt32();
                    break;
                }
                case 6: {
                    object3 = a00.readFixed64();
                    break;
                }
                case 7: {
                    object3 = a00.readFixed32();
                    break;
                }
                case 8: {
                    object3 = Boolean.valueOf(a00.readBool());
                    break;
                }
                case 9: {
                    object3 = a00.readUInt32();
                    break;
                }
                case 10: {
                    object3 = a00.readSFixed32();
                    break;
                }
                case 11: {
                    object3 = a00.readSFixed64();
                    break;
                }
                case 12: {
                    object3 = a00.readSInt32();
                    break;
                }
                case 13: {
                    object3 = a00.readSInt64();
                    break;
                }
                case 14: {
                    throw new IllegalStateException("Shouldn\'t reach here.");
                }
                case 15: {
                    object3 = a00.readBytes();
                    break;
                }
                case 16: {
                    object3 = a00.readString();
                    break;
                }
                case 17: {
                    if(!generatedMessageLite$GeneratedExtension0.isRepeated()) {
                        Object object4 = fieldSet0.getField(generatedMessageLite$GeneratedExtension0.descriptor);
                        if(object4 instanceof GeneratedMessageLite) {
                            c0 c00 = X.getInstance().schemaFor(object4);
                            if(!((GeneratedMessageLite)object4).isMutable()) {
                                Object object5 = c00.newInstance();
                                c00.mergeFrom(object5, object4);
                                fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, object5);
                                object4 = object5;
                            }
                            a00.mergeGroupField(object4, c00, extensionRegistryLite0);
                            return object2;
                        }
                    }
                    object3 = a00.readGroup(generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().getClass(), extensionRegistryLite0);
                    break;
                }
                case 18: {
                    if(!generatedMessageLite$GeneratedExtension0.isRepeated()) {
                        Object object6 = fieldSet0.getField(generatedMessageLite$GeneratedExtension0.descriptor);
                        if(object6 instanceof GeneratedMessageLite) {
                            c0 c01 = X.getInstance().schemaFor(object6);
                            if(!((GeneratedMessageLite)object6).isMutable()) {
                                Object object7 = c01.newInstance();
                                c01.mergeFrom(object7, object6);
                                fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, object7);
                                object6 = object7;
                            }
                            a00.mergeMessageField(object6, c01, extensionRegistryLite0);
                            return object2;
                        }
                    }
                    object3 = a00.readMessage(generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().getClass(), extensionRegistryLite0);
                    break;
                }
                default: {
                    object3 = null;
                    break;
                }
            }
        }
        if(generatedMessageLite$GeneratedExtension0.isRepeated()) {
            fieldSet0.addRepeatedField(generatedMessageLite$GeneratedExtension0.descriptor, object3);
            return object2;
        }
        switch(generatedMessageLite$GeneratedExtension0.getLiteType()) {
            case 17: 
            case 18: {
                Object object8 = fieldSet0.getField(generatedMessageLite$GeneratedExtension0.descriptor);
                if(object8 != null) {
                    object3 = Internal.mergeMessage(object8, object3);
                }
            }
        }
        fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, object3);
        return object2;
    }

    @Override  // com.google.protobuf.q
    void parseLengthPrefixedMessageSetItem(a0 a00, Object object0, ExtensionRegistryLite extensionRegistryLite0, FieldSet fieldSet0) throws IOException {
        Object object1 = a00.readMessage(((GeneratedExtension)object0).getMessageDefaultInstance().getClass(), extensionRegistryLite0);
        fieldSet0.setField(((GeneratedExtension)object0).descriptor, object1);
    }

    @Override  // com.google.protobuf.q
    void parseMessageSetItem(ByteString byteString0, Object object0, ExtensionRegistryLite extensionRegistryLite0, FieldSet fieldSet0) throws IOException {
        Builder messageLite$Builder0 = ((GeneratedExtension)object0).getMessageDefaultInstance().newBuilderForType();
        CodedInputStream codedInputStream0 = byteString0.newCodedInput();
        messageLite$Builder0.mergeFrom(codedInputStream0, extensionRegistryLite0);
        MessageLite messageLite0 = messageLite$Builder0.buildPartial();
        fieldSet0.setField(((GeneratedExtension)object0).descriptor, messageLite0);
        codedInputStream0.checkLastTagWas(0);
    }

    @Override  // com.google.protobuf.q
    void serializeExtension(Writer writer0, Map.Entry map$Entry0) throws IOException {
        b generatedMessageLite$b0 = (b)map$Entry0.getKey();
        if(generatedMessageLite$b0.isRepeated()) {
            switch(generatedMessageLite$b0.getLiteType()) {
                case 1: {
                    e0.writeDoubleList(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 2: {
                    e0.writeFloatList(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 3: {
                    e0.writeInt64List(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 4: {
                    e0.writeUInt64List(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 5: {
                    e0.writeInt32List(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 6: {
                    e0.writeFixed64List(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 7: {
                    e0.writeFixed32List(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 8: {
                    e0.writeBoolList(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 9: {
                    e0.writeUInt32List(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 10: {
                    e0.writeSFixed32List(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 11: {
                    e0.writeSFixed64List(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 12: {
                    e0.writeSInt32List(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 13: {
                    e0.writeSInt64List(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 14: {
                    e0.writeInt32List(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, generatedMessageLite$b0.isPacked());
                    return;
                }
                case 15: {
                    e0.writeBytesList(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0);
                    return;
                }
                case 16: {
                    e0.writeStringList(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0);
                    return;
                }
                case 17: {
                    List list0 = (List)map$Entry0.getValue();
                    if(list0 != null && !list0.isEmpty()) {
                        e0.writeGroupList(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, X.getInstance().schemaFor(list0.get(0).getClass()));
                        return;
                    }
                    break;
                }
                case 18: {
                    List list1 = (List)map$Entry0.getValue();
                    if(list1 != null && !list1.isEmpty()) {
                        e0.writeMessageList(generatedMessageLite$b0.getNumber(), ((List)map$Entry0.getValue()), writer0, X.getInstance().schemaFor(list1.get(0).getClass()));
                        return;
                    }
                    break;
                }
            }
        }
        else {
            switch(generatedMessageLite$b0.getLiteType()) {
                case 1: {
                    writer0.writeDouble(generatedMessageLite$b0.getNumber(), ((double)(((Double)map$Entry0.getValue()))));
                    break;
                }
                case 2: {
                    writer0.writeFloat(generatedMessageLite$b0.getNumber(), ((float)(((Float)map$Entry0.getValue()))));
                    return;
                }
                case 3: {
                    writer0.writeInt64(generatedMessageLite$b0.getNumber(), ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 4: {
                    writer0.writeUInt64(generatedMessageLite$b0.getNumber(), ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 5: {
                    writer0.writeInt32(generatedMessageLite$b0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 6: {
                    writer0.writeFixed64(generatedMessageLite$b0.getNumber(), ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 7: {
                    writer0.writeFixed32(generatedMessageLite$b0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 8: {
                    writer0.writeBool(generatedMessageLite$b0.getNumber(), ((Boolean)map$Entry0.getValue()).booleanValue());
                    return;
                }
                case 9: {
                    writer0.writeUInt32(generatedMessageLite$b0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 10: {
                    writer0.writeSFixed32(generatedMessageLite$b0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 11: {
                    writer0.writeSFixed64(generatedMessageLite$b0.getNumber(), ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 12: {
                    writer0.writeSInt32(generatedMessageLite$b0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 13: {
                    writer0.writeSInt64(generatedMessageLite$b0.getNumber(), ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 14: {
                    writer0.writeInt32(generatedMessageLite$b0.getNumber(), ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 15: {
                    writer0.writeBytes(generatedMessageLite$b0.getNumber(), ((ByteString)map$Entry0.getValue()));
                    return;
                }
                case 16: {
                    writer0.writeString(generatedMessageLite$b0.getNumber(), ((String)map$Entry0.getValue()));
                    return;
                }
                case 17: {
                    writer0.writeGroup(generatedMessageLite$b0.getNumber(), map$Entry0.getValue(), X.getInstance().schemaFor(map$Entry0.getValue().getClass()));
                    return;
                }
                case 18: {
                    writer0.writeMessage(generatedMessageLite$b0.getNumber(), map$Entry0.getValue(), X.getInstance().schemaFor(map$Entry0.getValue().getClass()));
                }
            }
        }
    }

    @Override  // com.google.protobuf.q
    void setExtensions(Object object0, FieldSet fieldSet0) {
        ((ExtendableMessage)object0).extensions = fieldSet0;
    }
}

