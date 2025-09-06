package androidx.datastore.preferences.protobuf;

import java.io.IOException;

final class ArrayDecoders {
    static final class Registers {
        public int a;
        public long b;
        public Object c;
        public final ExtensionRegistryLite d;

        Registers() {
            this.d = ExtensionRegistryLite.d();
        }

        Registers(ExtensionRegistryLite extensionRegistryLite0) {
            extensionRegistryLite0.getClass();
            this.d = extensionRegistryLite0;
        }
    }

    static int A(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) {
        int v3 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
        ((IntArrayList)internal$ProtobufList0).addInt(-(arrayDecoders$Registers0.a & 1) ^ arrayDecoders$Registers0.a >>> 1);
        while(v3 < v2) {
            int v4 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
            if(v != arrayDecoders$Registers0.a) {
                break;
            }
            v3 = ArrayDecoders.I(arr_b, v4, arrayDecoders$Registers0);
            ((IntArrayList)internal$ProtobufList0).addInt(-(arrayDecoders$Registers0.a & 1) ^ arrayDecoders$Registers0.a >>> 1);
        }
        return v3;
    }

    static int B(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) {
        int v3 = ArrayDecoders.L(arr_b, v1, arrayDecoders$Registers0);
        ((LongArrayList)internal$ProtobufList0).addLong(-(arrayDecoders$Registers0.b & 1L) ^ arrayDecoders$Registers0.b >>> 1);
        while(v3 < v2) {
            int v4 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
            if(v != arrayDecoders$Registers0.a) {
                break;
            }
            v3 = ArrayDecoders.L(arr_b, v4, arrayDecoders$Registers0);
            ((LongArrayList)internal$ProtobufList0).addLong(-(arrayDecoders$Registers0.b & 1L) ^ arrayDecoders$Registers0.b >>> 1);
        }
        return v3;
    }

    static int C(byte[] arr_b, int v, Registers arrayDecoders$Registers0) throws InvalidProtocolBufferException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a;
        if(v2 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if(v2 == 0) {
            arrayDecoders$Registers0.c = "";
            return v1;
        }
        arrayDecoders$Registers0.c = new String(arr_b, v1, v2, Internal.a);
        return v1 + v2;
    }

    static int D(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws InvalidProtocolBufferException {
        int v3 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
        int v4 = arrayDecoders$Registers0.a;
        if(v4 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if(v4 == 0) {
            internal$ProtobufList0.add("");
            goto label_8;
        }
        else {
            internal$ProtobufList0.add(new String(arr_b, v3, v4, Internal.a));
        }
    alab1:
        while(true) {
            v3 += v4;
            while(true) {
            label_8:
                if(v3 >= v2) {
                    break alab1;
                }
                int v5 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
                if(v != arrayDecoders$Registers0.a) {
                    break alab1;
                }
                v3 = ArrayDecoders.I(arr_b, v5, arrayDecoders$Registers0);
                v4 = arrayDecoders$Registers0.a;
                if(v4 < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                if(v4 != 0) {
                    internal$ProtobufList0.add(new String(arr_b, v3, v4, Internal.a));
                    break;
                }
                internal$ProtobufList0.add("");
            }
        }
        return v3;
    }

    static int E(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws InvalidProtocolBufferException {
        int v3 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
        int v4 = arrayDecoders$Registers0.a;
        if(v4 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if(v4 == 0) {
            internal$ProtobufList0.add("");
            goto label_10;
        }
        int v5 = v3 + v4;
        if(!Utf8.u(arr_b, v3, v5)) {
            throw InvalidProtocolBufferException.d();
        }
        internal$ProtobufList0.add(new String(arr_b, v3, v4, Internal.a));
    alab1:
        while(true) {
            v3 = v5;
            while(true) {
            label_10:
                if(v3 >= v2) {
                    return v3;
                }
                int v6 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
                if(v != arrayDecoders$Registers0.a) {
                    return v3;
                }
                v3 = ArrayDecoders.I(arr_b, v6, arrayDecoders$Registers0);
                int v7 = arrayDecoders$Registers0.a;
                if(v7 < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                if(v7 != 0) {
                    v5 = v3 + v7;
                    if(!Utf8.u(arr_b, v3, v5)) {
                        break alab1;
                    }
                    internal$ProtobufList0.add(new String(arr_b, v3, v7, Internal.a));
                    break;
                }
                internal$ProtobufList0.add("");
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    static int F(byte[] arr_b, int v, Registers arrayDecoders$Registers0) throws InvalidProtocolBufferException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a;
        if(v2 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if(v2 == 0) {
            arrayDecoders$Registers0.c = "";
            return v1;
        }
        arrayDecoders$Registers0.c = Utf8.h(arr_b, v1, v2);
        return v1 + v2;
    }

    static int G(int v, byte[] arr_b, int v1, int v2, UnknownFieldSetLite unknownFieldSetLite0, Registers arrayDecoders$Registers0) throws InvalidProtocolBufferException {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v9 = ArrayDecoders.L(arr_b, v1, arrayDecoders$Registers0);
                    unknownFieldSetLite0.r(v, arrayDecoders$Registers0.b);
                    return v9;
                }
                case 1: {
                    unknownFieldSetLite0.r(v, ArrayDecoders.j(arr_b, v1));
                    return v1 + 8;
                }
                case 2: {
                    int v7 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
                    int v8 = arrayDecoders$Registers0.a;
                    if(v8 < 0) {
                        throw InvalidProtocolBufferException.g();
                    }
                    if(v8 > arr_b.length - v7) {
                        throw InvalidProtocolBufferException.l();
                    }
                    if(v8 == 0) {
                        unknownFieldSetLite0.r(v, ByteString.e);
                        return v7;
                    }
                    unknownFieldSetLite0.r(v, ByteString.q(arr_b, v7, v8));
                    return v7 + v8;
                }
                case 3: {
                    UnknownFieldSetLite unknownFieldSetLite1 = UnknownFieldSetLite.p();
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        int v5 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
                        int v6 = arrayDecoders$Registers0.a;
                        if(v6 == v3) {
                            v4 = v6;
                            v1 = v5;
                            break;
                        }
                        v4 = v6;
                        v1 = ArrayDecoders.G(v6, arr_b, v5, v2, unknownFieldSetLite1, arrayDecoders$Registers0);
                    }
                    if(v1 > v2 || v4 != v3) {
                        throw InvalidProtocolBufferException.h();
                    }
                    unknownFieldSetLite0.r(v, unknownFieldSetLite1);
                    return v1;
                }
                case 5: {
                    unknownFieldSetLite0.r(v, ArrayDecoders.h(arr_b, v1));
                    return v1 + 4;
                }
                default: {
                    throw InvalidProtocolBufferException.c();
                }
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    static int H(int v, byte[] arr_b, int v1, Registers arrayDecoders$Registers0) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            arrayDecoders$Registers0.a = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            arrayDecoders$Registers0.a = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            arrayDecoders$Registers0.a = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            arrayDecoders$Registers0.a = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        arrayDecoders$Registers0.a = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    static int I(byte[] arr_b, int v, Registers arrayDecoders$Registers0) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            arrayDecoders$Registers0.a = v1;
            return v + 1;
        }
        return ArrayDecoders.H(v1, arr_b, v + 1, arrayDecoders$Registers0);
    }

    static int J(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) {
        int v3 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
        ((IntArrayList)internal$ProtobufList0).addInt(arrayDecoders$Registers0.a);
        while(v3 < v2) {
            int v4 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
            if(v != arrayDecoders$Registers0.a) {
                break;
            }
            v3 = ArrayDecoders.I(arr_b, v4, arrayDecoders$Registers0);
            ((IntArrayList)internal$ProtobufList0).addInt(arrayDecoders$Registers0.a);
        }
        return v3;
    }

    static int K(long v, byte[] arr_b, int v1, Registers arrayDecoders$Registers0) {
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
        arrayDecoders$Registers0.b = v4;
        return v2;
    }

    static int L(byte[] arr_b, int v, Registers arrayDecoders$Registers0) {
        long v1 = (long)arr_b[v];
        if(v1 >= 0L) {
            arrayDecoders$Registers0.b = v1;
            return v + 1;
        }
        return ArrayDecoders.K(v1, arr_b, v + 1, arrayDecoders$Registers0);
    }

    static int M(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) {
        int v3 = ArrayDecoders.L(arr_b, v1, arrayDecoders$Registers0);
        ((LongArrayList)internal$ProtobufList0).addLong(arrayDecoders$Registers0.b);
        while(v3 < v2) {
            int v4 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
            if(v != arrayDecoders$Registers0.a) {
                break;
            }
            v3 = ArrayDecoders.L(arr_b, v4, arrayDecoders$Registers0);
            ((LongArrayList)internal$ProtobufList0).addLong(arrayDecoders$Registers0.b);
        }
        return v3;
    }

    static int N(int v, byte[] arr_b, int v1, int v2, Registers arrayDecoders$Registers0) throws InvalidProtocolBufferException {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    return ArrayDecoders.L(arr_b, v1, arrayDecoders$Registers0);
                }
                case 1: {
                    return v1 + 8;
                }
                case 2: {
                    return ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0) + arrayDecoders$Registers0.a;
                }
                case 3: {
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        v1 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
                        v4 = arrayDecoders$Registers0.a;
                        if(v4 == v3) {
                            break;
                        }
                        v1 = ArrayDecoders.N(v4, arr_b, v1, v2, arrayDecoders$Registers0);
                    }
                    if(v1 > v2 || v4 != v3) {
                        throw InvalidProtocolBufferException.h();
                    }
                    return v1;
                }
                case 5: {
                    return v1 + 4;
                }
                default: {
                    throw InvalidProtocolBufferException.c();
                }
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    static int a(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) {
        int v3 = ArrayDecoders.L(arr_b, v1, arrayDecoders$Registers0);
        ((BooleanArrayList)internal$ProtobufList0).addBoolean(arrayDecoders$Registers0.b != 0L);
        while(v3 < v2) {
            int v4 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
            if(v != arrayDecoders$Registers0.a) {
                break;
            }
            v3 = ArrayDecoders.L(arr_b, v4, arrayDecoders$Registers0);
            ((BooleanArrayList)internal$ProtobufList0).addBoolean(arrayDecoders$Registers0.b != 0L);
        }
        return v3;
    }

    static int b(byte[] arr_b, int v, Registers arrayDecoders$Registers0) throws InvalidProtocolBufferException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a;
        if(v2 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if(v2 > arr_b.length - v1) {
            throw InvalidProtocolBufferException.l();
        }
        if(v2 == 0) {
            arrayDecoders$Registers0.c = ByteString.e;
            return v1;
        }
        arrayDecoders$Registers0.c = ByteString.q(arr_b, v1, v2);
        return v1 + v2;
    }

    static int c(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws InvalidProtocolBufferException {
        int v3 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
        int v4 = arrayDecoders$Registers0.a;
        if(v4 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if(v4 > arr_b.length - v3) {
            throw InvalidProtocolBufferException.l();
        }
        if(v4 == 0) {
            internal$ProtobufList0.add(ByteString.e);
            goto label_9;
        }
        else {
            internal$ProtobufList0.add(ByteString.q(arr_b, v3, v4));
        }
    alab1:
        while(true) {
            v3 += v4;
            while(true) {
            label_9:
                if(v3 >= v2) {
                    return v3;
                }
                int v5 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
                if(v != arrayDecoders$Registers0.a) {
                    return v3;
                }
                v3 = ArrayDecoders.I(arr_b, v5, arrayDecoders$Registers0);
                v4 = arrayDecoders$Registers0.a;
                if(v4 < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                if(v4 > arr_b.length - v3) {
                    break alab1;
                }
                if(v4 != 0) {
                    internal$ProtobufList0.add(ByteString.q(arr_b, v3, v4));
                    break;
                }
                internal$ProtobufList0.add(ByteString.e);
            }
        }
        throw InvalidProtocolBufferException.l();
    }

    static double d(byte[] arr_b, int v) {
        return Double.longBitsToDouble(ArrayDecoders.j(arr_b, v));
    }

    static int e(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) {
        ((DoubleArrayList)internal$ProtobufList0).addDouble(ArrayDecoders.d(arr_b, v1));
        int v3;
        for(v3 = v1 + 8; v3 < v2; v3 = v4 + 8) {
            int v4 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
            if(v != arrayDecoders$Registers0.a) {
                break;
            }
            ((DoubleArrayList)internal$ProtobufList0).addDouble(ArrayDecoders.d(arr_b, v4));
        }
        return v3;
    }

    static int f(int v, byte[] arr_b, int v1, int v2, ExtendableMessage generatedMessageLite$ExtendableMessage0, GeneratedExtension generatedMessageLite$GeneratedExtension0, UnknownFieldSchema unknownFieldSchema0, Registers arrayDecoders$Registers0) throws IOException {
        int v3;
        FieldSet fieldSet0 = generatedMessageLite$ExtendableMessage0.extensions;
        Object object0 = null;
        if(generatedMessageLite$GeneratedExtension0.d.isRepeated() && generatedMessageLite$GeneratedExtension0.d.isPacked()) {
            switch(generatedMessageLite$GeneratedExtension0.b()) {
                case 1: {
                    DoubleArrayList doubleArrayList0 = new DoubleArrayList();
                    v3 = ArrayDecoders.s(arr_b, v1, doubleArrayList0, arrayDecoders$Registers0);
                    fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, doubleArrayList0);
                    return v3;
                }
                case 2: {
                    FloatArrayList floatArrayList0 = new FloatArrayList();
                    v3 = ArrayDecoders.v(arr_b, v1, floatArrayList0, arrayDecoders$Registers0);
                    fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, floatArrayList0);
                    return v3;
                }
                case 3: 
                case 4: {
                    LongArrayList longArrayList0 = new LongArrayList();
                    v3 = ArrayDecoders.z(arr_b, v1, longArrayList0, arrayDecoders$Registers0);
                    fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, longArrayList0);
                    return v3;
                }
                case 5: 
                case 6: {
                    IntArrayList intArrayList0 = new IntArrayList();
                    v3 = ArrayDecoders.y(arr_b, v1, intArrayList0, arrayDecoders$Registers0);
                    fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, intArrayList0);
                    return v3;
                }
                case 7: 
                case 8: {
                    LongArrayList longArrayList1 = new LongArrayList();
                    v3 = ArrayDecoders.u(arr_b, v1, longArrayList1, arrayDecoders$Registers0);
                    fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, longArrayList1);
                    return v3;
                }
                case 9: 
                case 10: {
                    IntArrayList intArrayList1 = new IntArrayList();
                    v3 = ArrayDecoders.t(arr_b, v1, intArrayList1, arrayDecoders$Registers0);
                    fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, intArrayList1);
                    return v3;
                }
                case 11: {
                    BooleanArrayList booleanArrayList0 = new BooleanArrayList();
                    v3 = ArrayDecoders.r(arr_b, v1, booleanArrayList0, arrayDecoders$Registers0);
                    fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, booleanArrayList0);
                    return v3;
                }
                case 12: {
                    IntArrayList intArrayList2 = new IntArrayList();
                    v3 = ArrayDecoders.w(arr_b, v1, intArrayList2, arrayDecoders$Registers0);
                    fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, intArrayList2);
                    return v3;
                }
                case 13: {
                    LongArrayList longArrayList2 = new LongArrayList();
                    v3 = ArrayDecoders.x(arr_b, v1, longArrayList2, arrayDecoders$Registers0);
                    fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, longArrayList2);
                    return v3;
                }
                case 14: {
                    IntArrayList intArrayList3 = new IntArrayList();
                    v3 = ArrayDecoders.y(arr_b, v1, intArrayList3, arrayDecoders$Registers0);
                    UnknownFieldSetLite unknownFieldSetLite0 = generatedMessageLite$ExtendableMessage0.unknownFields;
                    if(unknownFieldSetLite0 != UnknownFieldSetLite.e()) {
                        object0 = unknownFieldSetLite0;
                    }
                    UnknownFieldSetLite unknownFieldSetLite1 = (UnknownFieldSetLite)SchemaUtil.B(v >>> 3, intArrayList3, generatedMessageLite$GeneratedExtension0.d.getEnumType(), object0, unknownFieldSchema0);
                    if(unknownFieldSetLite1 != null) {
                        generatedMessageLite$ExtendableMessage0.unknownFields = unknownFieldSetLite1;
                    }
                    fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, intArrayList3);
                    return v3;
                }
                default: {
                    throw new IllegalStateException("Type cannot be packed: " + generatedMessageLite$GeneratedExtension0.d.getLiteType());
                }
            }
        }
        if(generatedMessageLite$GeneratedExtension0.b() == FieldType.p) {
            v1 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
            if(generatedMessageLite$GeneratedExtension0.d.getEnumType().findValueByNumber(arrayDecoders$Registers0.a) == null) {
                UnknownFieldSetLite unknownFieldSetLite2 = generatedMessageLite$ExtendableMessage0.unknownFields;
                if(unknownFieldSetLite2 == UnknownFieldSetLite.e()) {
                    unknownFieldSetLite2 = UnknownFieldSetLite.p();
                    generatedMessageLite$ExtendableMessage0.unknownFields = unknownFieldSetLite2;
                }
                SchemaUtil.Q(v >>> 3, arrayDecoders$Registers0.a, unknownFieldSetLite2, unknownFieldSchema0);
                return v1;
            }
            object0 = arrayDecoders$Registers0.a;
        }
        else {
            switch(generatedMessageLite$GeneratedExtension0.b()) {
                case 1: {
                    object0 = ArrayDecoders.d(arr_b, v1);
                    v1 += 8;
                    break;
                }
                case 2: {
                    object0 = ArrayDecoders.l(arr_b, v1);
                    v1 += 4;
                    break;
                }
                case 3: 
                case 4: {
                    v1 = ArrayDecoders.L(arr_b, v1, arrayDecoders$Registers0);
                    object0 = arrayDecoders$Registers0.b;
                    break;
                }
                case 5: 
                case 6: {
                    v1 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
                    object0 = arrayDecoders$Registers0.a;
                    break;
                }
                case 7: 
                case 8: {
                    object0 = ArrayDecoders.j(arr_b, v1);
                    v1 += 8;
                    break;
                }
                case 9: 
                case 10: {
                    object0 = ArrayDecoders.h(arr_b, v1);
                    v1 += 4;
                    break;
                }
                case 11: {
                    v1 = ArrayDecoders.L(arr_b, v1, arrayDecoders$Registers0);
                    object0 = Boolean.valueOf(arrayDecoders$Registers0.b != 0L);
                    break;
                }
                case 12: {
                    v1 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
                    object0 = (int)(-(arrayDecoders$Registers0.a & 1) ^ arrayDecoders$Registers0.a >>> 1);
                    break;
                }
                case 13: {
                    v1 = ArrayDecoders.L(arr_b, v1, arrayDecoders$Registers0);
                    object0 = (long)(-(arrayDecoders$Registers0.b & 1L) ^ arrayDecoders$Registers0.b >>> 1);
                    break;
                }
                case 14: {
                    throw new IllegalStateException("Shouldn\'t reach here.");
                }
                case 15: {
                    v1 = ArrayDecoders.b(arr_b, v1, arrayDecoders$Registers0);
                    object0 = arrayDecoders$Registers0.c;
                    break;
                }
                case 16: {
                    v1 = ArrayDecoders.C(arr_b, v1, arrayDecoders$Registers0);
                    object0 = arrayDecoders$Registers0.c;
                    break;
                }
                case 17: {
                    v1 = ArrayDecoders.n(Protobuf.a().i(generatedMessageLite$GeneratedExtension0.c().getClass()), arr_b, v1, v2, v >>> 3 << 3 | 4, arrayDecoders$Registers0);
                    object0 = arrayDecoders$Registers0.c;
                    break;
                }
                case 18: {
                    v1 = ArrayDecoders.p(Protobuf.a().i(generatedMessageLite$GeneratedExtension0.c().getClass()), arr_b, v1, v2, arrayDecoders$Registers0);
                    object0 = arrayDecoders$Registers0.c;
                }
            }
        }
        if(generatedMessageLite$GeneratedExtension0.f()) {
            fieldSet0.h(generatedMessageLite$GeneratedExtension0.d, object0);
            return v1;
        }
        switch(generatedMessageLite$GeneratedExtension0.b()) {
            case 17: 
            case 18: {
                Object object1 = fieldSet0.u(generatedMessageLite$GeneratedExtension0.d);
                if(object1 != null) {
                    object0 = Internal.v(object1, object0);
                }
            }
        }
        fieldSet0.O(generatedMessageLite$GeneratedExtension0.d, object0);
        return v1;
    }

    static int g(int v, byte[] arr_b, int v1, int v2, Object object0, MessageLite messageLite0, UnknownFieldSchema unknownFieldSchema0, Registers arrayDecoders$Registers0) throws IOException {
        GeneratedExtension generatedMessageLite$GeneratedExtension0 = arrayDecoders$Registers0.d.c(messageLite0, v >>> 3);
        if(generatedMessageLite$GeneratedExtension0 == null) {
            return ArrayDecoders.G(v, arr_b, v1, v2, MessageSchema.p(object0), arrayDecoders$Registers0);
        }
        ((ExtendableMessage)object0).S0();
        return ArrayDecoders.f(v, arr_b, v1, v2, ((ExtendableMessage)object0), generatedMessageLite$GeneratedExtension0, unknownFieldSchema0, arrayDecoders$Registers0);
    }

    static int h(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    static int i(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) {
        ((IntArrayList)internal$ProtobufList0).addInt(ArrayDecoders.h(arr_b, v1));
        int v3;
        for(v3 = v1 + 4; v3 < v2; v3 = v4 + 4) {
            int v4 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
            if(v != arrayDecoders$Registers0.a) {
                break;
            }
            ((IntArrayList)internal$ProtobufList0).addInt(ArrayDecoders.h(arr_b, v4));
        }
        return v3;
    }

    static long j(byte[] arr_b, int v) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }

    static int k(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) {
        ((LongArrayList)internal$ProtobufList0).addLong(ArrayDecoders.j(arr_b, v1));
        int v3;
        for(v3 = v1 + 8; v3 < v2; v3 = v4 + 8) {
            int v4 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
            if(v != arrayDecoders$Registers0.a) {
                break;
            }
            ((LongArrayList)internal$ProtobufList0).addLong(ArrayDecoders.j(arr_b, v4));
        }
        return v3;
    }

    static float l(byte[] arr_b, int v) {
        return Float.intBitsToFloat(ArrayDecoders.h(arr_b, v));
    }

    static int m(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) {
        ((FloatArrayList)internal$ProtobufList0).addFloat(ArrayDecoders.l(arr_b, v1));
        int v3;
        for(v3 = v1 + 4; v3 < v2; v3 = v4 + 4) {
            int v4 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
            if(v != arrayDecoders$Registers0.a) {
                break;
            }
            ((FloatArrayList)internal$ProtobufList0).addFloat(ArrayDecoders.l(arr_b, v4));
        }
        return v3;
    }

    static int n(Schema schema0, byte[] arr_b, int v, int v1, int v2, Registers arrayDecoders$Registers0) throws IOException {
        Object object0 = ((MessageSchema)schema0).newInstance();
        int v3 = ((MessageSchema)schema0).X(object0, arr_b, v, v1, v2, arrayDecoders$Registers0);
        ((MessageSchema)schema0).makeImmutable(object0);
        arrayDecoders$Registers0.c = object0;
        return v3;
    }

    static int o(Schema schema0, int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws IOException {
        int v3 = v & -8 | 4;
        int v4 = ArrayDecoders.n(schema0, arr_b, v1, v2, v3, arrayDecoders$Registers0);
        internal$ProtobufList0.add(arrayDecoders$Registers0.c);
        while(v4 < v2) {
            int v5 = ArrayDecoders.I(arr_b, v4, arrayDecoders$Registers0);
            if(v != arrayDecoders$Registers0.a) {
                break;
            }
            v4 = ArrayDecoders.n(schema0, arr_b, v5, v2, v3, arrayDecoders$Registers0);
            internal$ProtobufList0.add(arrayDecoders$Registers0.c);
        }
        return v4;
    }

    static int p(Schema schema0, byte[] arr_b, int v, int v1, Registers arrayDecoders$Registers0) throws IOException {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = ArrayDecoders.H(v3, arr_b, v2, arrayDecoders$Registers0);
            v3 = arrayDecoders$Registers0.a;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw InvalidProtocolBufferException.l();
        }
        Object object0 = schema0.newInstance();
        int v4 = v3 + v2;
        schema0.c(object0, arr_b, v2, v4, arrayDecoders$Registers0);
        schema0.makeImmutable(object0);
        arrayDecoders$Registers0.c = object0;
        return v4;
    }

    static int q(Schema schema0, int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws IOException {
        int v3 = ArrayDecoders.p(schema0, arr_b, v1, v2, arrayDecoders$Registers0);
        internal$ProtobufList0.add(arrayDecoders$Registers0.c);
        while(v3 < v2) {
            int v4 = ArrayDecoders.I(arr_b, v3, arrayDecoders$Registers0);
            if(v != arrayDecoders$Registers0.a) {
                break;
            }
            v3 = ArrayDecoders.p(schema0, arr_b, v4, v2, arrayDecoders$Registers0);
            internal$ProtobufList0.add(arrayDecoders$Registers0.c);
        }
        return v3;
    }

    static int r(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws IOException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a + v1;
        while(v1 < v2) {
            v1 = ArrayDecoders.L(arr_b, v1, arrayDecoders$Registers0);
            ((BooleanArrayList)internal$ProtobufList0).addBoolean(arrayDecoders$Registers0.b != 0L);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.l();
        }
        return v1;
    }

    static int s(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws IOException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a + v1;
        while(v1 < v2) {
            ((DoubleArrayList)internal$ProtobufList0).addDouble(ArrayDecoders.d(arr_b, v1));
            v1 += 8;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.l();
        }
        return v1;
    }

    static int t(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws IOException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a + v1;
        while(v1 < v2) {
            ((IntArrayList)internal$ProtobufList0).addInt(ArrayDecoders.h(arr_b, v1));
            v1 += 4;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.l();
        }
        return v1;
    }

    static int u(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws IOException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a + v1;
        while(v1 < v2) {
            ((LongArrayList)internal$ProtobufList0).addLong(ArrayDecoders.j(arr_b, v1));
            v1 += 8;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.l();
        }
        return v1;
    }

    static int v(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws IOException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a + v1;
        while(v1 < v2) {
            ((FloatArrayList)internal$ProtobufList0).addFloat(ArrayDecoders.l(arr_b, v1));
            v1 += 4;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.l();
        }
        return v1;
    }

    static int w(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws IOException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a + v1;
        while(v1 < v2) {
            v1 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
            ((IntArrayList)internal$ProtobufList0).addInt(-(arrayDecoders$Registers0.a & 1) ^ arrayDecoders$Registers0.a >>> 1);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.l();
        }
        return v1;
    }

    static int x(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws IOException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a + v1;
        while(v1 < v2) {
            v1 = ArrayDecoders.L(arr_b, v1, arrayDecoders$Registers0);
            ((LongArrayList)internal$ProtobufList0).addLong(-(arrayDecoders$Registers0.b & 1L) ^ arrayDecoders$Registers0.b >>> 1);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.l();
        }
        return v1;
    }

    static int y(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws IOException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a + v1;
        while(v1 < v2) {
            v1 = ArrayDecoders.I(arr_b, v1, arrayDecoders$Registers0);
            ((IntArrayList)internal$ProtobufList0).addInt(arrayDecoders$Registers0.a);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.l();
        }
        return v1;
    }

    static int z(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, Registers arrayDecoders$Registers0) throws IOException {
        int v1 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v2 = arrayDecoders$Registers0.a + v1;
        while(v1 < v2) {
            v1 = ArrayDecoders.L(arr_b, v1, arrayDecoders$Registers0);
            ((LongArrayList)internal$ProtobufList0).addLong(arrayDecoders$Registers0.b);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.l();
        }
        return v1;
    }
}

