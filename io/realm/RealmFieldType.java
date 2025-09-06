package io.realm;

import io.realm.internal.Keep;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

@Keep
public enum RealmFieldType {
    INTEGER(0),
    BOOLEAN(1),
    STRING(2),
    BINARY(4),
    DATE(8),
    FLOAT(9),
    DOUBLE(10),
    OBJECT(12),
    DECIMAL128(11),
    OBJECT_ID(15),
    UUID(17),
    MIXED(6),
    TYPED_LINK(16),
    LIST(13),
    LINKING_OBJECTS(14),
    INTEGER_LIST(0x80),
    BOOLEAN_LIST(0x81),
    STRING_LIST(130),
    BINARY_LIST(0x84),
    DATE_LIST(0x88),
    FLOAT_LIST(0x89),
    DOUBLE_LIST(0x8A),
    DECIMAL128_LIST(0x8B),
    OBJECT_ID_LIST(0x8F),
    UUID_LIST(0x91),
    MIXED_LIST(0x86),
    STRING_TO_INTEGER_MAP(0x200),
    STRING_TO_BOOLEAN_MAP(0x201),
    STRING_TO_STRING_MAP(0x202),
    STRING_TO_BINARY_MAP(0x204),
    STRING_TO_DATE_MAP(520),
    STRING_TO_FLOAT_MAP(0x209),
    STRING_TO_DOUBLE_MAP(0x20A),
    STRING_TO_DECIMAL128_MAP(0x20B),
    STRING_TO_OBJECT_ID_MAP(0x20F),
    STRING_TO_UUID_MAP(529),
    STRING_TO_MIXED_MAP(0x206),
    STRING_TO_LINK_MAP(0x20C),
    INTEGER_SET(0x100),
    BOOLEAN_SET(0x101),
    STRING_SET(0x102),
    BINARY_SET(260),
    DATE_SET(0x108),
    FLOAT_SET(0x109),
    DOUBLE_SET(0x10A),
    DECIMAL128_SET(0x10B),
    OBJECT_ID_SET(0x10F),
    UUID_SET(273),
    LINK_SET(0x10C),
    MIXED_SET(0x106);

    private static final RealmFieldType[] basicTypes;
    private static final RealmFieldType[] listTypes;
    private static final RealmFieldType[] mapTypes;
    private final int nativeValue;
    private static final RealmFieldType[] setTypes;

    static {
        RealmFieldType.basicTypes = new RealmFieldType[18];
        RealmFieldType.listTypes = new RealmFieldType[18];
        RealmFieldType.mapTypes = new RealmFieldType[18];
        RealmFieldType.setTypes = new RealmFieldType[18];
        RealmFieldType[] arr_realmFieldType = (RealmFieldType[])RealmFieldType.$VALUES.clone();
        for(int v = 0; v < arr_realmFieldType.length; ++v) {
            RealmFieldType realmFieldType0 = arr_realmFieldType[v];
            int v1 = realmFieldType0.nativeValue;
            if(v1 < 0x80) {
                RealmFieldType.basicTypes[v1] = realmFieldType0;
            }
            else if(v1 < 0x100) {
                RealmFieldType.listTypes[v1 - 0x80] = realmFieldType0;
            }
            else if(v1 < 0x200) {
                RealmFieldType.setTypes[v1 - 0x100] = realmFieldType0;
            }
            else {
                RealmFieldType.mapTypes[v1 - 0x200] = realmFieldType0;
            }
        }
    }

    private RealmFieldType(int v1) {
        this.nativeValue = v1;
    }

    public static RealmFieldType fromNativeValue(int v) {
        if(v >= 0) {
            RealmFieldType[] arr_realmFieldType = RealmFieldType.basicTypes;
            if(v < arr_realmFieldType.length) {
                RealmFieldType realmFieldType0 = arr_realmFieldType[v];
                if(realmFieldType0 != null) {
                    return realmFieldType0;
                }
            }
        }
        if(0x80 <= v && v < 0x100) {
            RealmFieldType[] arr_realmFieldType1 = RealmFieldType.listTypes;
            if(v - 0x80 < arr_realmFieldType1.length) {
                RealmFieldType realmFieldType1 = arr_realmFieldType1[v - 0x80];
                if(realmFieldType1 != null) {
                    return realmFieldType1;
                }
            }
        }
        if(0x100 <= v && v < 0x200) {
            RealmFieldType[] arr_realmFieldType2 = RealmFieldType.setTypes;
            if(v - 0x100 < arr_realmFieldType2.length) {
                RealmFieldType realmFieldType2 = arr_realmFieldType2[v - 0x100];
                if(realmFieldType2 != null) {
                    return realmFieldType2;
                }
            }
        }
        if(0x200 <= v) {
            RealmFieldType[] arr_realmFieldType3 = RealmFieldType.mapTypes;
            if(v - 0x200 < arr_realmFieldType3.length) {
                RealmFieldType realmFieldType3 = arr_realmFieldType3[v - 0x200];
                if(realmFieldType3 != null) {
                    return realmFieldType3;
                }
            }
        }
        throw new IllegalArgumentException("Invalid native Realm type: " + v);
    }

    public int getNativeValue() {
        return this.nativeValue;
    }

    public boolean isValid(Object object0) {
        int v = this.nativeValue;
        switch(v) {
            case 0: {
                return object0 instanceof Long || object0 instanceof Integer || object0 instanceof Short || object0 instanceof Byte;
            }
            case 1: {
                return object0 instanceof Boolean;
            }
            case 2: {
                return object0 instanceof String;
            }
            case 4: {
                return object0 instanceof byte[] || object0 instanceof ByteBuffer;
            }
            case 6: {
                return object0 instanceof G0;
            }
            case 8: {
                return object0 instanceof Date;
            }
            case 9: {
                return object0 instanceof Float;
            }
            case 10: {
                return object0 instanceof Double;
            }
            case 11: {
                return object0 instanceof Decimal128;
            }
            case 15: {
                return object0 instanceof ObjectId;
            }
            case 17: {
                return object0 instanceof UUID;
            label_14:
                if(v != 0x80 && v != 0x81 && v != 130 && (v != 0x88 && v != 0x89 && v != 0x8A && v != 0x8B) && (v != 0x100 && v != 0x101 && v != 0x102) && (v != 0x108 && v != 0x109 && v != 0x10A && v != 0x10B && v != 0x10C) && (v != 0x200 && v != 0x201 && v != 0x202) && (v != 520 && v != 0x209 && v != 0x20A && v != 0x20B && v != 0x20C)) {
                    throw new RuntimeException("Unsupported Realm type:  " + this);
                }
                break;
            }
            case 12: 
            case 13: 
            case 14: 
            case 0x84: 
            case 0x86: 
            case 0x8F: 
            case 0x91: 
            case 260: 
            case 0x106: 
            case 0x10F: 
            case 273: 
            case 0x204: 
            case 0x206: 
            case 0x20F: 
            case 529: {
                break;
            }
            default: {
                goto label_14;
            }
        }
        return false;
    }
}

