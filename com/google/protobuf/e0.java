package com.google.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

@k
final class e0 {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class GENERATED_MESSAGE_CLASS;
    private static final h0 UNKNOWN_FIELD_SET_FULL_SCHEMA;
    private static final h0 UNKNOWN_FIELD_SET_LITE_SCHEMA;

    static {
        e0.GENERATED_MESSAGE_CLASS = e0.getGeneratedMessageClass();
        e0.UNKNOWN_FIELD_SET_FULL_SCHEMA = e0.getUnknownFieldSetSchema();
        e0.UNKNOWN_FIELD_SET_LITE_SCHEMA = new i0();
    }

    static int computeSizeBoolList(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? CodedOutputStream.computeTagSize(v) + CodedOutputStream.computeLengthDelimitedFieldSize(v1) : v1 * CodedOutputStream.computeBoolSize(v, true);
    }

    static int computeSizeBoolListNoTag(List list0) {
        return list0.size();
    }

    static int computeSizeByteStringList(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = v1 * CodedOutputStream.computeTagSize(v);
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            v3 += CodedOutputStream.computeBytesSizeNoTag(((ByteString)list0.get(v2)));
        }
        return v3;
    }

    static int computeSizeEnumList(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = e0.computeSizeEnumListNoTag(list0);
        return z ? CodedOutputStream.computeTagSize(v) + CodedOutputStream.computeLengthDelimitedFieldSize(v2) : v2 + v1 * CodedOutputStream.computeTagSize(v);
    }

    static int computeSizeEnumListNoTag(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof w) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeEnumSizeNoTag(((w)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeEnumSizeNoTag(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    static int computeSizeFixed32List(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? CodedOutputStream.computeTagSize(v) + CodedOutputStream.computeLengthDelimitedFieldSize(v1 * 4) : v1 * CodedOutputStream.computeFixed32Size(v, 0);
    }

    static int computeSizeFixed32ListNoTag(List list0) {
        return list0.size() * 4;
    }

    static int computeSizeFixed64List(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? CodedOutputStream.computeTagSize(v) + CodedOutputStream.computeLengthDelimitedFieldSize(v1 * 8) : v1 * CodedOutputStream.computeFixed64Size(v, 0L);
    }

    static int computeSizeFixed64ListNoTag(List list0) {
        return list0.size() * 8;
    }

    static int computeSizeGroupList(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += CodedOutputStream.computeGroupSize(v, ((MessageLite)list0.get(v2)));
        }
        return v3;
    }

    static int computeSizeGroupList(int v, List list0, c0 c00) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += CodedOutputStream.computeGroupSize(v, ((MessageLite)list0.get(v2)), c00);
        }
        return v3;
    }

    static int computeSizeInt32List(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = e0.computeSizeInt32ListNoTag(list0);
        return z ? CodedOutputStream.computeTagSize(v) + CodedOutputStream.computeLengthDelimitedFieldSize(v2) : v2 + v1 * CodedOutputStream.computeTagSize(v);
    }

    static int computeSizeInt32ListNoTag(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof w) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeInt32SizeNoTag(((w)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    static int computeSizeInt64List(int v, List list0, boolean z) {
        if(list0.size() == 0) {
            return 0;
        }
        int v1 = e0.computeSizeInt64ListNoTag(list0);
        return z ? CodedOutputStream.computeTagSize(v) + CodedOutputStream.computeLengthDelimitedFieldSize(v1) : v1 + list0.size() * CodedOutputStream.computeTagSize(v);
    }

    static int computeSizeInt64ListNoTag(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof F) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeInt64SizeNoTag(((F)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeInt64SizeNoTag(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    // 去混淆评级： 低(20)
    static int computeSizeMessage(int v, Object object0, c0 c00) {
        return object0 instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(v, ((LazyFieldLite)object0)) : CodedOutputStream.computeMessageSize(v, ((MessageLite)object0), c00);
    }

    static int computeSizeMessageList(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = CodedOutputStream.computeTagSize(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            v3 += (object0 instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag(((LazyFieldLite)object0)) : CodedOutputStream.computeMessageSizeNoTag(((MessageLite)object0)));
        }
        return v3;
    }

    static int computeSizeMessageList(int v, List list0, c0 c00) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = CodedOutputStream.computeTagSize(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            v3 += (object0 instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag(((LazyFieldLite)object0)) : CodedOutputStream.computeMessageSizeNoTag(((MessageLite)object0), c00));
        }
        return v3;
    }

    static int computeSizeSInt32List(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = e0.computeSizeSInt32ListNoTag(list0);
        return z ? CodedOutputStream.computeTagSize(v) + CodedOutputStream.computeLengthDelimitedFieldSize(v2) : v2 + v1 * CodedOutputStream.computeTagSize(v);
    }

    static int computeSizeSInt32ListNoTag(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof w) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeSInt32SizeNoTag(((w)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeSInt32SizeNoTag(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    static int computeSizeSInt64List(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = e0.computeSizeSInt64ListNoTag(list0);
        return z ? CodedOutputStream.computeTagSize(v) + CodedOutputStream.computeLengthDelimitedFieldSize(v2) : v2 + v1 * CodedOutputStream.computeTagSize(v);
    }

    static int computeSizeSInt64ListNoTag(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof F) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeSInt64SizeNoTag(((F)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeSInt64SizeNoTag(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    static int computeSizeStringList(int v, List list0) {
        int v1 = list0.size();
        int v2 = 0;
        if(v1 == 0) {
            return 0;
        }
        int v3 = CodedOutputStream.computeTagSize(v) * v1;
        if(list0 instanceof LazyStringList) {
            while(v2 < v1) {
                Object object0 = ((LazyStringList)list0).getRaw(v2);
                v3 += (object0 instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag(((ByteString)object0)) : CodedOutputStream.computeStringSizeNoTag(((String)object0)));
                ++v2;
            }
            return v3;
        }
        while(v2 < v1) {
            Object object1 = list0.get(v2);
            v3 += (object1 instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag(((ByteString)object1)) : CodedOutputStream.computeStringSizeNoTag(((String)object1)));
            ++v2;
        }
        return v3;
    }

    static int computeSizeUInt32List(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = e0.computeSizeUInt32ListNoTag(list0);
        return z ? CodedOutputStream.computeTagSize(v) + CodedOutputStream.computeLengthDelimitedFieldSize(v2) : v2 + v1 * CodedOutputStream.computeTagSize(v);
    }

    static int computeSizeUInt32ListNoTag(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof w) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeUInt32SizeNoTag(((w)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeUInt32SizeNoTag(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    static int computeSizeUInt64List(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = e0.computeSizeUInt64ListNoTag(list0);
        return z ? CodedOutputStream.computeTagSize(v) + CodedOutputStream.computeLengthDelimitedFieldSize(v2) : v2 + v1 * CodedOutputStream.computeTagSize(v);
    }

    static int computeSizeUInt64ListNoTag(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof F) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeUInt64SizeNoTag(((F)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeUInt64SizeNoTag(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    @j
    static Object filterUnknownEnumList(Object object0, int v, List list0, EnumLiteMap internal$EnumLiteMap0, Object object1, h0 h00) {
        if(internal$EnumLiteMap0 == null) {
            return object1;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(internal$EnumLiteMap0.findValueByNumber(v4) == null) {
                    object1 = e0.storeUnknownEnum(object0, v, v4, object1, h00);
                }
                else {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
            }
            if(v3 != v1) {
                list0.subList(v3, v1).clear();
                return object1;
            }
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                int v5 = (int)(((Integer)object2));
                if(internal$EnumLiteMap0.findValueByNumber(v5) == null) {
                    object1 = e0.storeUnknownEnum(object0, v, v5, object1, h00);
                    iterator0.remove();
                }
            }
        }
        return object1;
    }

    @j
    static Object filterUnknownEnumList(Object object0, int v, List list0, EnumVerifier internal$EnumVerifier0, Object object1, h0 h00) {
        if(internal$EnumVerifier0 == null) {
            return object1;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(internal$EnumVerifier0.isInRange(v4)) {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
                else {
                    object1 = e0.storeUnknownEnum(object0, v, v4, object1, h00);
                }
            }
            if(v3 != v1) {
                list0.subList(v3, v1).clear();
                return object1;
            }
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                int v5 = (int)(((Integer)object2));
                if(!internal$EnumVerifier0.isInRange(v5)) {
                    object1 = e0.storeUnknownEnum(object0, v, v5, object1, h00);
                    iterator0.remove();
                }
            }
        }
        return object1;
    }

    private static Class getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static Object getMapDefaultEntry(Class class0, String s) {
        try {
            Field[] arr_field = Class.forName((class0.getName() + "$" + e0.toCamelCase(s, true) + "DefaultEntryHolder")).getDeclaredFields();
            if(arr_field.length != 1) {
                throw new IllegalStateException("Unable to look up map field default entry holder class for " + s + " in " + class0.getName());
            }
            return j0.getStaticObject(arr_field[0]);
        }
        catch(Throwable throwable0) {
        }
        throw new RuntimeException(throwable0);
    }

    private static h0 getUnknownFieldSetSchema() {
        try {
            Class class0 = e0.getUnknownFieldSetSchemaClass();
            return class0 == null ? null : ((h0)class0.getConstructor(null).newInstance(null));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static Class getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static void mergeExtensions(q q0, Object object0, Object object1) {
        FieldSet fieldSet0 = q0.getExtensions(object1);
        if(!fieldSet0.isEmpty()) {
            q0.getMutableExtensions(object0).mergeFrom(fieldSet0);
        }
    }

    static void mergeMap(H h0, Object object0, Object object1, long v) {
        j0.putObject(object0, v, h0.mergeFrom(j0.getObject(object0, v), j0.getObject(object1, v)));
    }

    static void mergeUnknownFields(h0 h00, Object object0, Object object1) {
        h00.setToMessage(object0, h00.merge(h00.getFromMessage(object0), h00.getFromMessage(object1)));
    }

    public static void requireGeneratedMessage(Class class0) {
        if(!GeneratedMessageLite.class.isAssignableFrom(class0) && (e0.GENERATED_MESSAGE_CLASS != null && !e0.GENERATED_MESSAGE_CLASS.isAssignableFrom(class0))) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    // 去混淆评级： 低(20)
    static boolean safeEquals(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    public static boolean shouldUseTableSwitch(int v, int v1, int v2) {
        return v1 >= 40 ? ((long)v1) - ((long)v) + 10L <= 2L * ((long)v2) + 3L + (((long)v2) + 3L) * 3L : true;
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] arr_fieldInfo) {
        return arr_fieldInfo.length == 0 ? false : e0.shouldUseTableSwitch(arr_fieldInfo[0].getFieldNumber(), arr_fieldInfo[arr_fieldInfo.length - 1].getFieldNumber(), arr_fieldInfo.length);
    }

    @j
    static Object storeUnknownEnum(Object object0, int v, int v1, Object object1, h0 h00) {
        if(object1 == null) {
            object1 = h00.getBuilderFromMessage(object0);
        }
        h00.addVarint(object1, v, ((long)v1));
        return object1;
    }

    static String toCamelCase(String s, boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = 0;
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if(97 <= v1 && v1 <= 0x7A) {
                if(z) {
                    stringBuilder0.append(((char)(v1 - 0x20)));
                }
                else {
                    stringBuilder0.append(((char)v1));
                }
                goto label_15;
            }
            else if(65 > v1 || v1 > 90) {
                if(0x30 <= v1 && v1 <= 57) {
                    stringBuilder0.append(((char)v1));
                }
                z = true;
            }
            else {
                if(v != 0 || z) {
                    stringBuilder0.append(((char)v1));
                }
                else {
                    stringBuilder0.append(((char)(v1 + 0x20)));
                }
            label_15:
                z = false;
            }
            ++v;
        }
        return stringBuilder0.toString();
    }

    public static h0 unknownFieldSetFullSchema() {
        return e0.UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static h0 unknownFieldSetLiteSchema() {
        return e0.UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int v, boolean z, Writer writer0) throws IOException {
        if(z) {
            writer0.writeBool(v, true);
        }
    }

    public static void writeBoolList(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeBoolList(v, list0, z);
        }
    }

    public static void writeBytes(int v, ByteString byteString0, Writer writer0) throws IOException {
        if(byteString0 != null && !byteString0.isEmpty()) {
            writer0.writeBytes(v, byteString0);
        }
    }

    public static void writeBytesList(int v, List list0, Writer writer0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeBytesList(v, list0);
        }
    }

    public static void writeDouble(int v, double f, Writer writer0) throws IOException {
        if(Double.doubleToRawLongBits(f) != 0L) {
            writer0.writeDouble(v, f);
        }
    }

    public static void writeDoubleList(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeDoubleList(v, list0, z);
        }
    }

    public static void writeEnum(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeEnum(v, v1);
        }
    }

    public static void writeEnumList(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeEnumList(v, list0, z);
        }
    }

    public static void writeFixed32(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeFixed32(v, v1);
        }
    }

    public static void writeFixed32List(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeFixed32List(v, list0, z);
        }
    }

    public static void writeFixed64(int v, long v1, Writer writer0) throws IOException {
        if(v1 != 0L) {
            writer0.writeFixed64(v, v1);
        }
    }

    public static void writeFixed64List(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeFixed64List(v, list0, z);
        }
    }

    public static void writeFloat(int v, float f, Writer writer0) throws IOException {
        if(Float.floatToRawIntBits(f) != 0) {
            writer0.writeFloat(v, f);
        }
    }

    public static void writeFloatList(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeFloatList(v, list0, z);
        }
    }

    public static void writeGroupList(int v, List list0, Writer writer0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeGroupList(v, list0);
        }
    }

    public static void writeGroupList(int v, List list0, Writer writer0, c0 c00) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeGroupList(v, list0, c00);
        }
    }

    public static void writeInt32(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeInt32(v, v1);
        }
    }

    public static void writeInt32List(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeInt32List(v, list0, z);
        }
    }

    public static void writeInt64(int v, long v1, Writer writer0) throws IOException {
        if(v1 != 0L) {
            writer0.writeInt64(v, v1);
        }
    }

    public static void writeInt64List(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeInt64List(v, list0, z);
        }
    }

    public static void writeLazyFieldList(int v, List list0, Writer writer0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                ((LazyFieldLite)object0).writeTo(writer0, v);
            }
        }
    }

    public static void writeMessage(int v, Object object0, Writer writer0) throws IOException {
        if(object0 != null) {
            writer0.writeMessage(v, object0);
        }
    }

    public static void writeMessageList(int v, List list0, Writer writer0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeMessageList(v, list0);
        }
    }

    public static void writeMessageList(int v, List list0, Writer writer0, c0 c00) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeMessageList(v, list0, c00);
        }
    }

    public static void writeSFixed32(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeSFixed32(v, v1);
        }
    }

    public static void writeSFixed32List(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSFixed32List(v, list0, z);
        }
    }

    public static void writeSFixed64(int v, long v1, Writer writer0) throws IOException {
        if(v1 != 0L) {
            writer0.writeSFixed64(v, v1);
        }
    }

    public static void writeSFixed64List(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSFixed64List(v, list0, z);
        }
    }

    public static void writeSInt32(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeSInt32(v, v1);
        }
    }

    public static void writeSInt32List(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSInt32List(v, list0, z);
        }
    }

    public static void writeSInt64(int v, long v1, Writer writer0) throws IOException {
        if(v1 != 0L) {
            writer0.writeSInt64(v, v1);
        }
    }

    public static void writeSInt64List(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSInt64List(v, list0, z);
        }
    }

    public static void writeString(int v, Object object0, Writer writer0) throws IOException {
        if(object0 instanceof String) {
            e0.writeStringInternal(v, ((String)object0), writer0);
            return;
        }
        e0.writeBytes(v, ((ByteString)object0), writer0);
    }

    private static void writeStringInternal(int v, String s, Writer writer0) throws IOException {
        if(s != null && !s.isEmpty()) {
            writer0.writeString(v, s);
        }
    }

    public static void writeStringList(int v, List list0, Writer writer0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeStringList(v, list0);
        }
    }

    public static void writeUInt32(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeUInt32(v, v1);
        }
    }

    public static void writeUInt32List(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeUInt32List(v, list0, z);
        }
    }

    public static void writeUInt64(int v, long v1, Writer writer0) throws IOException {
        if(v1 != 0L) {
            writer0.writeUInt64(v, v1);
        }
    }

    public static void writeUInt64List(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeUInt64List(v, list0, z);
        }
    }
}

