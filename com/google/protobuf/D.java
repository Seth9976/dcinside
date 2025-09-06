package com.google.protobuf;

import java.io.IOException;

@k
final class d {
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
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.UINT32.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.FIXED64.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SFIXED64.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.FIXED32.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SFIXED32.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.BOOL.ordinal()] = 11;
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

    static final class b {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;
        public int recursionDepth;

        b() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        b(ExtensionRegistryLite extensionRegistryLite0) {
            extensionRegistryLite0.getClass();
            this.extensionRegistry = extensionRegistryLite0;
        }
    }

    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    static {
    }

    private static void checkRecursionLimit(int v) throws InvalidProtocolBufferException {
        if(v >= d.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    static int decodeBoolList(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) {
        int v3 = d.decodeVarint64(arr_b, v1, d$b0);
        ((g)internal$ProtobufList0).addBoolean(d$b0.long1 != 0L);
        while(v3 < v2) {
            int v4 = d.decodeVarint32(arr_b, v3, d$b0);
            if(v != d$b0.int1) {
                break;
            }
            v3 = d.decodeVarint64(arr_b, v4, d$b0);
            ((g)internal$ProtobufList0).addBoolean(d$b0.long1 != 0L);
        }
        return v3;
    }

    static int decodeBytes(byte[] arr_b, int v, b d$b0) throws InvalidProtocolBufferException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1;
        if(v2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if(v2 > arr_b.length - v1) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if(v2 == 0) {
            d$b0.object1 = ByteString.EMPTY;
            return v1;
        }
        d$b0.object1 = ByteString.copyFrom(arr_b, v1, v2);
        return v1 + v2;
    }

    static int decodeBytesList(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) throws InvalidProtocolBufferException {
        int v3 = d.decodeVarint32(arr_b, v1, d$b0);
        int v4 = d$b0.int1;
        if(v4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if(v4 > arr_b.length - v3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if(v4 == 0) {
            internal$ProtobufList0.add(ByteString.EMPTY);
            goto label_9;
        }
        else {
            internal$ProtobufList0.add(ByteString.copyFrom(arr_b, v3, v4));
        }
    alab1:
        while(true) {
            v3 += v4;
            while(true) {
            label_9:
                if(v3 >= v2) {
                    return v3;
                }
                int v5 = d.decodeVarint32(arr_b, v3, d$b0);
                if(v != d$b0.int1) {
                    return v3;
                }
                v3 = d.decodeVarint32(arr_b, v5, d$b0);
                v4 = d$b0.int1;
                if(v4 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if(v4 > arr_b.length - v3) {
                    break alab1;
                }
                if(v4 != 0) {
                    internal$ProtobufList0.add(ByteString.copyFrom(arr_b, v3, v4));
                    break;
                }
                internal$ProtobufList0.add(ByteString.EMPTY);
            }
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static double decodeDouble(byte[] arr_b, int v) {
        return Double.longBitsToDouble(d.decodeFixed64(arr_b, v));
    }

    static int decodeDoubleList(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) {
        ((o)internal$ProtobufList0).addDouble(d.decodeDouble(arr_b, v1));
        int v3;
        for(v3 = v1 + 8; v3 < v2; v3 = v4 + 8) {
            int v4 = d.decodeVarint32(arr_b, v3, d$b0);
            if(v != d$b0.int1) {
                break;
            }
            ((o)internal$ProtobufList0).addDouble(d.decodeDouble(arr_b, v4));
        }
        return v3;
    }

    static int decodeExtension(int v, byte[] arr_b, int v1, int v2, ExtendableMessage generatedMessageLite$ExtendableMessage0, GeneratedExtension generatedMessageLite$GeneratedExtension0, h0 h00, b d$b0) throws IOException {
        int v3;
        Object object0 = null;
        FieldSet fieldSet0 = generatedMessageLite$ExtendableMessage0.extensions;
        if(generatedMessageLite$GeneratedExtension0.descriptor.isRepeated() && generatedMessageLite$GeneratedExtension0.descriptor.isPacked()) {
            switch(generatedMessageLite$GeneratedExtension0.getLiteType()) {
                case 1: {
                    o o0 = new o();
                    v3 = d.decodePackedDoubleList(arr_b, v1, o0, d$b0);
                    fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, o0);
                    return v3;
                }
                case 2: {
                    t t0 = new t();
                    v3 = d.decodePackedFloatList(arr_b, v1, t0, d$b0);
                    fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, t0);
                    return v3;
                }
                case 3: 
                case 4: {
                    F f0 = new F();
                    v3 = d.decodePackedVarint64List(arr_b, v1, f0, d$b0);
                    fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, f0);
                    return v3;
                }
                case 5: 
                case 6: {
                    w w0 = new w();
                    v3 = d.decodePackedVarint32List(arr_b, v1, w0, d$b0);
                    fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, w0);
                    return v3;
                }
                case 7: 
                case 8: {
                    F f1 = new F();
                    v3 = d.decodePackedFixed64List(arr_b, v1, f1, d$b0);
                    fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, f1);
                    return v3;
                }
                case 9: 
                case 10: {
                    w w1 = new w();
                    v3 = d.decodePackedFixed32List(arr_b, v1, w1, d$b0);
                    fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, w1);
                    return v3;
                }
                case 11: {
                    g g0 = new g();
                    v3 = d.decodePackedBoolList(arr_b, v1, g0, d$b0);
                    fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, g0);
                    return v3;
                }
                case 12: {
                    w w2 = new w();
                    v3 = d.decodePackedSInt32List(arr_b, v1, w2, d$b0);
                    fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, w2);
                    return v3;
                }
                case 13: {
                    F f2 = new F();
                    v3 = d.decodePackedSInt64List(arr_b, v1, f2, d$b0);
                    fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, f2);
                    return v3;
                }
                case 14: {
                    w w3 = new w();
                    v3 = d.decodePackedVarint32List(arr_b, v1, w3, d$b0);
                    e0.filterUnknownEnumList(generatedMessageLite$ExtendableMessage0, v >>> 3, w3, generatedMessageLite$GeneratedExtension0.descriptor.getEnumType(), null, h00);
                    fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, w3);
                    return v3;
                }
                default: {
                    throw new IllegalStateException("Type cannot be packed: " + generatedMessageLite$GeneratedExtension0.descriptor.getLiteType());
                }
            }
        }
        if(generatedMessageLite$GeneratedExtension0.getLiteType() == FieldType.ENUM) {
            v1 = d.decodeVarint32(arr_b, v1, d$b0);
            if(generatedMessageLite$GeneratedExtension0.descriptor.getEnumType().findValueByNumber(d$b0.int1) == null) {
                e0.storeUnknownEnum(generatedMessageLite$ExtendableMessage0, v >>> 3, d$b0.int1, null, h00);
                return v1;
            }
            object0 = d$b0.int1;
        }
        else {
            switch(generatedMessageLite$GeneratedExtension0.getLiteType()) {
                case 1: {
                    object0 = d.decodeDouble(arr_b, v1);
                    v1 += 8;
                    break;
                }
                case 2: {
                    object0 = d.decodeFloat(arr_b, v1);
                    v1 += 4;
                    break;
                }
                case 3: 
                case 4: {
                    v1 = d.decodeVarint64(arr_b, v1, d$b0);
                    object0 = d$b0.long1;
                    break;
                }
                case 5: 
                case 6: {
                    v1 = d.decodeVarint32(arr_b, v1, d$b0);
                    object0 = d$b0.int1;
                    break;
                }
                case 7: 
                case 8: {
                    object0 = d.decodeFixed64(arr_b, v1);
                    v1 += 8;
                    break;
                }
                case 9: 
                case 10: {
                    object0 = d.decodeFixed32(arr_b, v1);
                    v1 += 4;
                    break;
                }
                case 11: {
                    v1 = d.decodeVarint64(arr_b, v1, d$b0);
                    object0 = Boolean.valueOf(d$b0.long1 != 0L);
                    break;
                }
                case 12: {
                    v1 = d.decodeVarint32(arr_b, v1, d$b0);
                    object0 = (int)(-(d$b0.int1 & 1) ^ d$b0.int1 >>> 1);
                    break;
                }
                case 13: {
                    v1 = d.decodeVarint64(arr_b, v1, d$b0);
                    object0 = (long)(-(d$b0.long1 & 1L) ^ d$b0.long1 >>> 1);
                    break;
                }
                case 14: {
                    throw new IllegalStateException("Shouldn\'t reach here.");
                }
                case 15: {
                    v1 = d.decodeBytes(arr_b, v1, d$b0);
                    object0 = d$b0.object1;
                    break;
                }
                case 16: {
                    v1 = d.decodeString(arr_b, v1, d$b0);
                    object0 = d$b0.object1;
                    break;
                }
                case 17: {
                    int v4 = v >>> 3 << 3 | 4;
                    c0 c00 = X.getInstance().schemaFor(generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().getClass());
                    if(generatedMessageLite$GeneratedExtension0.isRepeated()) {
                        int v5 = d.decodeGroupField(c00, arr_b, v1, v2, v4, d$b0);
                        fieldSet0.addRepeatedField(generatedMessageLite$GeneratedExtension0.descriptor, d$b0.object1);
                        return v5;
                    }
                    Object object1 = fieldSet0.getField(generatedMessageLite$GeneratedExtension0.descriptor);
                    if(object1 == null) {
                        object1 = c00.newInstance();
                        fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, object1);
                    }
                    return d.mergeGroupField(object1, c00, arr_b, v1, v2, v4, d$b0);
                }
                case 18: {
                    c0 c01 = X.getInstance().schemaFor(generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().getClass());
                    if(generatedMessageLite$GeneratedExtension0.isRepeated()) {
                        int v6 = d.decodeMessageField(c01, arr_b, v1, v2, d$b0);
                        fieldSet0.addRepeatedField(generatedMessageLite$GeneratedExtension0.descriptor, d$b0.object1);
                        return v6;
                    }
                    Object object2 = fieldSet0.getField(generatedMessageLite$GeneratedExtension0.descriptor);
                    if(object2 == null) {
                        object2 = c01.newInstance();
                        fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, object2);
                    }
                    return d.mergeMessageField(object2, c01, arr_b, v1, v2, d$b0);
                }
            }
        }
        if(generatedMessageLite$GeneratedExtension0.isRepeated()) {
            fieldSet0.addRepeatedField(generatedMessageLite$GeneratedExtension0.descriptor, object0);
            return v1;
        }
        fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, object0);
        return v1;
    }

    static int decodeExtensionOrUnknownField(int v, byte[] arr_b, int v1, int v2, Object object0, MessageLite messageLite0, h0 h00, b d$b0) throws IOException {
        GeneratedExtension generatedMessageLite$GeneratedExtension0 = d$b0.extensionRegistry.findLiteExtensionByNumber(messageLite0, v >>> 3);
        if(generatedMessageLite$GeneratedExtension0 == null) {
            return d.decodeUnknownField(v, arr_b, v1, v2, N.getMutableUnknownFields(object0), d$b0);
        }
        ((ExtendableMessage)object0).ensureExtensionsAreMutable();
        return d.decodeExtension(v, arr_b, v1, v2, ((ExtendableMessage)object0), generatedMessageLite$GeneratedExtension0, h00, d$b0);
    }

    static int decodeFixed32(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    static int decodeFixed32List(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) {
        ((w)internal$ProtobufList0).addInt(d.decodeFixed32(arr_b, v1));
        int v3;
        for(v3 = v1 + 4; v3 < v2; v3 = v4 + 4) {
            int v4 = d.decodeVarint32(arr_b, v3, d$b0);
            if(v != d$b0.int1) {
                break;
            }
            ((w)internal$ProtobufList0).addInt(d.decodeFixed32(arr_b, v4));
        }
        return v3;
    }

    static long decodeFixed64(byte[] arr_b, int v) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }

    static int decodeFixed64List(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) {
        ((F)internal$ProtobufList0).addLong(d.decodeFixed64(arr_b, v1));
        int v3;
        for(v3 = v1 + 8; v3 < v2; v3 = v4 + 8) {
            int v4 = d.decodeVarint32(arr_b, v3, d$b0);
            if(v != d$b0.int1) {
                break;
            }
            ((F)internal$ProtobufList0).addLong(d.decodeFixed64(arr_b, v4));
        }
        return v3;
    }

    static float decodeFloat(byte[] arr_b, int v) {
        return Float.intBitsToFloat(d.decodeFixed32(arr_b, v));
    }

    static int decodeFloatList(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) {
        ((t)internal$ProtobufList0).addFloat(d.decodeFloat(arr_b, v1));
        int v3;
        for(v3 = v1 + 4; v3 < v2; v3 = v4 + 4) {
            int v4 = d.decodeVarint32(arr_b, v3, d$b0);
            if(v != d$b0.int1) {
                break;
            }
            ((t)internal$ProtobufList0).addFloat(d.decodeFloat(arr_b, v4));
        }
        return v3;
    }

    static int decodeGroupField(c0 c00, byte[] arr_b, int v, int v1, int v2, b d$b0) throws IOException {
        Object object0 = c00.newInstance();
        int v3 = d.mergeGroupField(object0, c00, arr_b, v, v1, v2, d$b0);
        c00.makeImmutable(object0);
        d$b0.object1 = object0;
        return v3;
    }

    static int decodeGroupList(c0 c00, int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) throws IOException {
        int v3 = v & -8 | 4;
        int v4 = d.decodeGroupField(c00, arr_b, v1, v2, v3, d$b0);
        internal$ProtobufList0.add(d$b0.object1);
        while(v4 < v2) {
            int v5 = d.decodeVarint32(arr_b, v4, d$b0);
            if(v != d$b0.int1) {
                break;
            }
            v4 = d.decodeGroupField(c00, arr_b, v5, v2, v3, d$b0);
            internal$ProtobufList0.add(d$b0.object1);
        }
        return v4;
    }

    static int decodeMessageField(c0 c00, byte[] arr_b, int v, int v1, b d$b0) throws IOException {
        Object object0 = c00.newInstance();
        int v2 = d.mergeMessageField(object0, c00, arr_b, v, v1, d$b0);
        c00.makeImmutable(object0);
        d$b0.object1 = object0;
        return v2;
    }

    static int decodeMessageList(c0 c00, int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) throws IOException {
        int v3 = d.decodeMessageField(c00, arr_b, v1, v2, d$b0);
        internal$ProtobufList0.add(d$b0.object1);
        while(v3 < v2) {
            int v4 = d.decodeVarint32(arr_b, v3, d$b0);
            if(v != d$b0.int1) {
                break;
            }
            v3 = d.decodeMessageField(c00, arr_b, v4, v2, d$b0);
            internal$ProtobufList0.add(d$b0.object1);
        }
        return v3;
    }

    static int decodePackedBoolList(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, b d$b0) throws IOException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1 + v1;
        while(v1 < v2) {
            v1 = d.decodeVarint64(arr_b, v1, d$b0);
            ((g)internal$ProtobufList0).addBoolean(d$b0.long1 != 0L);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        return v1;
    }

    static int decodePackedDoubleList(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, b d$b0) throws IOException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1 + v1;
        while(v1 < v2) {
            ((o)internal$ProtobufList0).addDouble(d.decodeDouble(arr_b, v1));
            v1 += 8;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        return v1;
    }

    static int decodePackedFixed32List(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, b d$b0) throws IOException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1 + v1;
        while(v1 < v2) {
            ((w)internal$ProtobufList0).addInt(d.decodeFixed32(arr_b, v1));
            v1 += 4;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        return v1;
    }

    static int decodePackedFixed64List(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, b d$b0) throws IOException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1 + v1;
        while(v1 < v2) {
            ((F)internal$ProtobufList0).addLong(d.decodeFixed64(arr_b, v1));
            v1 += 8;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        return v1;
    }

    static int decodePackedFloatList(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, b d$b0) throws IOException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1 + v1;
        while(v1 < v2) {
            ((t)internal$ProtobufList0).addFloat(d.decodeFloat(arr_b, v1));
            v1 += 4;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        return v1;
    }

    static int decodePackedSInt32List(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, b d$b0) throws IOException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1 + v1;
        while(v1 < v2) {
            v1 = d.decodeVarint32(arr_b, v1, d$b0);
            ((w)internal$ProtobufList0).addInt(-(d$b0.int1 & 1) ^ d$b0.int1 >>> 1);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        return v1;
    }

    static int decodePackedSInt64List(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, b d$b0) throws IOException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1 + v1;
        while(v1 < v2) {
            v1 = d.decodeVarint64(arr_b, v1, d$b0);
            ((F)internal$ProtobufList0).addLong(-(d$b0.long1 & 1L) ^ d$b0.long1 >>> 1);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        return v1;
    }

    static int decodePackedVarint32List(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, b d$b0) throws IOException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1 + v1;
        while(v1 < v2) {
            v1 = d.decodeVarint32(arr_b, v1, d$b0);
            ((w)internal$ProtobufList0).addInt(d$b0.int1);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        return v1;
    }

    static int decodePackedVarint64List(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, b d$b0) throws IOException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1 + v1;
        while(v1 < v2) {
            v1 = d.decodeVarint64(arr_b, v1, d$b0);
            ((F)internal$ProtobufList0).addLong(d$b0.long1);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        return v1;
    }

    static int decodeSInt32List(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) {
        int v3 = d.decodeVarint32(arr_b, v1, d$b0);
        ((w)internal$ProtobufList0).addInt(-(d$b0.int1 & 1) ^ d$b0.int1 >>> 1);
        while(v3 < v2) {
            int v4 = d.decodeVarint32(arr_b, v3, d$b0);
            if(v != d$b0.int1) {
                break;
            }
            v3 = d.decodeVarint32(arr_b, v4, d$b0);
            ((w)internal$ProtobufList0).addInt(-(d$b0.int1 & 1) ^ d$b0.int1 >>> 1);
        }
        return v3;
    }

    static int decodeSInt64List(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) {
        int v3 = d.decodeVarint64(arr_b, v1, d$b0);
        ((F)internal$ProtobufList0).addLong(-(d$b0.long1 & 1L) ^ d$b0.long1 >>> 1);
        while(v3 < v2) {
            int v4 = d.decodeVarint32(arr_b, v3, d$b0);
            if(v != d$b0.int1) {
                break;
            }
            v3 = d.decodeVarint64(arr_b, v4, d$b0);
            ((F)internal$ProtobufList0).addLong(-(d$b0.long1 & 1L) ^ d$b0.long1 >>> 1);
        }
        return v3;
    }

    static int decodeString(byte[] arr_b, int v, b d$b0) throws InvalidProtocolBufferException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1;
        if(v2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if(v2 == 0) {
            d$b0.object1 = "";
            return v1;
        }
        d$b0.object1 = new String(arr_b, v1, v2, Internal.UTF_8);
        return v1 + v2;
    }

    static int decodeStringList(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) throws InvalidProtocolBufferException {
        int v3 = d.decodeVarint32(arr_b, v1, d$b0);
        int v4 = d$b0.int1;
        if(v4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if(v4 == 0) {
            internal$ProtobufList0.add("");
            goto label_8;
        }
        else {
            internal$ProtobufList0.add(new String(arr_b, v3, v4, Internal.UTF_8));
        }
    alab1:
        while(true) {
            v3 += v4;
            while(true) {
            label_8:
                if(v3 >= v2) {
                    break alab1;
                }
                int v5 = d.decodeVarint32(arr_b, v3, d$b0);
                if(v != d$b0.int1) {
                    break alab1;
                }
                v3 = d.decodeVarint32(arr_b, v5, d$b0);
                v4 = d$b0.int1;
                if(v4 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if(v4 != 0) {
                    internal$ProtobufList0.add(new String(arr_b, v3, v4, Internal.UTF_8));
                    break;
                }
                internal$ProtobufList0.add("");
            }
        }
        return v3;
    }

    static int decodeStringListRequireUtf8(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) throws InvalidProtocolBufferException {
        int v3 = d.decodeVarint32(arr_b, v1, d$b0);
        int v4 = d$b0.int1;
        if(v4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if(v4 == 0) {
            internal$ProtobufList0.add("");
            goto label_10;
        }
        int v5 = v3 + v4;
        if(!k0.isValidUtf8(arr_b, v3, v5)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        internal$ProtobufList0.add(new String(arr_b, v3, v4, Internal.UTF_8));
    alab1:
        while(true) {
            v3 = v5;
            while(true) {
            label_10:
                if(v3 >= v2) {
                    return v3;
                }
                int v6 = d.decodeVarint32(arr_b, v3, d$b0);
                if(v != d$b0.int1) {
                    return v3;
                }
                v3 = d.decodeVarint32(arr_b, v6, d$b0);
                int v7 = d$b0.int1;
                if(v7 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if(v7 != 0) {
                    v5 = v3 + v7;
                    if(!k0.isValidUtf8(arr_b, v3, v5)) {
                        break alab1;
                    }
                    internal$ProtobufList0.add(new String(arr_b, v3, v7, Internal.UTF_8));
                    break;
                }
                internal$ProtobufList0.add("");
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    static int decodeStringRequireUtf8(byte[] arr_b, int v, b d$b0) throws InvalidProtocolBufferException {
        int v1 = d.decodeVarint32(arr_b, v, d$b0);
        int v2 = d$b0.int1;
        if(v2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if(v2 == 0) {
            d$b0.object1 = "";
            return v1;
        }
        d$b0.object1 = k0.decodeUtf8(arr_b, v1, v2);
        return v1 + v2;
    }

    static int decodeUnknownField(int v, byte[] arr_b, int v1, int v2, UnknownFieldSetLite unknownFieldSetLite0, b d$b0) throws InvalidProtocolBufferException {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v10 = d.decodeVarint64(arr_b, v1, d$b0);
                    unknownFieldSetLite0.storeField(v, d$b0.long1);
                    return v10;
                }
                case 1: {
                    unknownFieldSetLite0.storeField(v, d.decodeFixed64(arr_b, v1));
                    return v1 + 8;
                }
                case 2: {
                    int v8 = d.decodeVarint32(arr_b, v1, d$b0);
                    int v9 = d$b0.int1;
                    if(v9 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if(v9 > arr_b.length - v8) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    if(v9 == 0) {
                        unknownFieldSetLite0.storeField(v, ByteString.EMPTY);
                        return v8;
                    }
                    unknownFieldSetLite0.storeField(v, ByteString.copyFrom(arr_b, v8, v9));
                    return v8 + v9;
                }
                case 3: {
                    UnknownFieldSetLite unknownFieldSetLite1 = UnknownFieldSetLite.newInstance();
                    int v3 = v & -8 | 4;
                    int v4 = d$b0.recursionDepth + 1;
                    d$b0.recursionDepth = v4;
                    d.checkRecursionLimit(v4);
                    int v5 = 0;
                    while(v1 < v2) {
                        int v6 = d.decodeVarint32(arr_b, v1, d$b0);
                        int v7 = d$b0.int1;
                        if(v7 == v3) {
                            v5 = v7;
                            v1 = v6;
                            break;
                        }
                        v5 = v7;
                        v1 = d.decodeUnknownField(v7, arr_b, v6, v2, unknownFieldSetLite1, d$b0);
                    }
                    --d$b0.recursionDepth;
                    if(v1 > v2 || v5 != v3) {
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    unknownFieldSetLite0.storeField(v, unknownFieldSetLite1);
                    return v1;
                }
                case 5: {
                    unknownFieldSetLite0.storeField(v, d.decodeFixed32(arr_b, v1));
                    return v1 + 4;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidTag();
                }
            }
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    static int decodeVarint32(int v, byte[] arr_b, int v1, b d$b0) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            d$b0.int1 = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            d$b0.int1 = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            d$b0.int1 = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            d$b0.int1 = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        d$b0.int1 = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    static int decodeVarint32(byte[] arr_b, int v, b d$b0) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            d$b0.int1 = v1;
            return v + 1;
        }
        return d.decodeVarint32(v1, arr_b, v + 1, d$b0);
    }

    static int decodeVarint32List(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) {
        int v3 = d.decodeVarint32(arr_b, v1, d$b0);
        ((w)internal$ProtobufList0).addInt(d$b0.int1);
        while(v3 < v2) {
            int v4 = d.decodeVarint32(arr_b, v3, d$b0);
            if(v != d$b0.int1) {
                break;
            }
            v3 = d.decodeVarint32(arr_b, v4, d$b0);
            ((w)internal$ProtobufList0).addInt(d$b0.int1);
        }
        return v3;
    }

    static int decodeVarint64(long v, byte[] arr_b, int v1, b d$b0) {
        int v2 = v1 + 1;
        int v3 = arr_b[v1];
        long v4 = v & 0x7FL | ((long)(v3 & 0x7F)) << 7;
        int v5 = 7;
        while(v3 < 0) {
            int v6 = arr_b[v2];
            v5 += 7;
            v4 |= ((long)(v6 & 0x7F)) << v5;
            ++v2;
            v3 = v6;
        }
        d$b0.long1 = v4;
        return v2;
    }

    static int decodeVarint64(byte[] arr_b, int v, b d$b0) {
        long v1 = (long)arr_b[v];
        if(v1 >= 0L) {
            d$b0.long1 = v1;
            return v + 1;
        }
        return d.decodeVarint64(v1, arr_b, v + 1, d$b0);
    }

    static int decodeVarint64List(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, b d$b0) {
        int v3 = d.decodeVarint64(arr_b, v1, d$b0);
        ((F)internal$ProtobufList0).addLong(d$b0.long1);
        while(v3 < v2) {
            int v4 = d.decodeVarint32(arr_b, v3, d$b0);
            if(v != d$b0.int1) {
                break;
            }
            v3 = d.decodeVarint64(arr_b, v4, d$b0);
            ((F)internal$ProtobufList0).addLong(d$b0.long1);
        }
        return v3;
    }

    static int mergeGroupField(Object object0, c0 c00, byte[] arr_b, int v, int v1, int v2, b d$b0) throws IOException {
        int v3 = d$b0.recursionDepth + 1;
        d$b0.recursionDepth = v3;
        d.checkRecursionLimit(v3);
        int v4 = ((N)c00).parseMessage(object0, arr_b, v, v1, v2, d$b0);
        --d$b0.recursionDepth;
        d$b0.object1 = object0;
        return v4;
    }

    static int mergeMessageField(Object object0, c0 c00, byte[] arr_b, int v, int v1, b d$b0) throws IOException {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = d.decodeVarint32(v3, arr_b, v2, d$b0);
            v3 = d$b0.int1;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int v4 = d$b0.recursionDepth + 1;
        d$b0.recursionDepth = v4;
        d.checkRecursionLimit(v4);
        int v5 = v3 + v2;
        c00.mergeFrom(object0, arr_b, v2, v5, d$b0);
        --d$b0.recursionDepth;
        d$b0.object1 = object0;
        return v5;
    }

    public static void setRecursionLimit(int v) {
        d.recursionLimit = v;
    }

    static int skipField(int v, byte[] arr_b, int v1, int v2, b d$b0) throws InvalidProtocolBufferException {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    return d.decodeVarint64(arr_b, v1, d$b0);
                }
                case 1: {
                    return v1 + 8;
                }
                case 2: {
                    return d.decodeVarint32(arr_b, v1, d$b0) + d$b0.int1;
                }
                case 3: {
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        v1 = d.decodeVarint32(arr_b, v1, d$b0);
                        v4 = d$b0.int1;
                        if(v4 == v3) {
                            break;
                        }
                        v1 = d.skipField(v4, arr_b, v1, v2, d$b0);
                    }
                    if(v1 > v2 || v4 != v3) {
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    return v1;
                }
                case 5: {
                    return v1 + 4;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidTag();
                }
            }
        }
        throw InvalidProtocolBufferException.invalidTag();
    }
}

