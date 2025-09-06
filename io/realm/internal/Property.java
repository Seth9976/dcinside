package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Locale;

public class Property implements l {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[RealmFieldType.values().length];
            a.a = arr_v;
            try {
                arr_v[RealmFieldType.OBJECT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.LIST.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.LINKING_OBJECTS.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.INTEGER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BOOLEAN.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BINARY.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DATE.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.FLOAT.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DECIMAL128.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.OBJECT_ID.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.UUID.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.MIXED.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DOUBLE.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.INTEGER_LIST.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_LIST.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BINARY_LIST.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DATE_LIST.ordinal()] = 19;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.FLOAT_LIST.ordinal()] = 20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 21;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 22;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.UUID_LIST.ordinal()] = 23;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DOUBLE_LIST.ordinal()] = 24;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.MIXED_LIST.ordinal()] = 25;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 26;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 27;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 28;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 29;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 30;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 0x1F;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 0x20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 33;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 34;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 35;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 36;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 37;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BOOLEAN_SET.ordinal()] = 38;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_SET.ordinal()] = 39;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.INTEGER_SET.ordinal()] = 40;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.FLOAT_SET.ordinal()] = 41;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DOUBLE_SET.ordinal()] = 42;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BINARY_SET.ordinal()] = 43;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DATE_SET.ordinal()] = 44;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DECIMAL128_SET.ordinal()] = 45;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.OBJECT_ID_SET.ordinal()] = 46;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.UUID_SET.ordinal()] = 0x2F;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.LINK_SET.ordinal()] = 0x30;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.MIXED_SET.ordinal()] = 49;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private long a;
    public static final boolean b = true;
    public static final boolean c = true;
    public static final boolean d = true;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 7;
    public static final int m = 8;
    public static final int n = 11;
    public static final int o = 10;
    public static final int p = 12;
    public static final int q = 9;
    public static final int r = 0;
    public static final int s = 0x40;
    public static final int t = 0x80;
    public static final int u = 0x100;
    public static final int v = 0x200;
    private static final long w;

    static {
        Property.w = Property.nativeGetFinalizerPtr();
    }

    Property(long v) {
        this.a = v;
        k.c.a(this);
    }

    static int a(RealmFieldType realmFieldType0, boolean z) {
        int v = 1;
        int v1 = 0;
        switch(realmFieldType0) {
            case 1: {
                return 71;
            }
            case 2: {
                return 0x87;
            }
            case 3: {
                return 0x88;
            }
            case 4: {
                v = 0;
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                v = 2;
                break;
            }
            case 7: {
                v = 3;
                break;
            }
            case 8: {
                v = 4;
                break;
            }
            case 9: {
                v = 5;
                break;
            }
            case 10: {
                v = 11;
                break;
            }
            case 11: {
                v = 10;
                break;
            }
            case 12: {
                v = 12;
                break;
            }
            case 13: {
                v = 9;
                break;
            }
            case 14: {
                v = 6;
                break;
            }
            case 15: {
                v = 0x80;
                break;
            }
            case 16: {
                v = 0x81;
                break;
            }
            case 17: {
                v = 130;
                break;
            }
            case 18: {
                v = 0x83;
                break;
            }
            case 19: {
                v = 0x84;
                break;
            }
            case 20: {
                v = 0x85;
                break;
            }
            case 21: {
                v = 0x8B;
                break;
            }
            case 22: {
                v = 0x8A;
                break;
            }
            case 23: {
                v = 140;
                break;
            }
            case 24: {
                v = 0x86;
                break;
            }
            case 25: {
                v = 0x89;
                break;
            }
            case 26: {
                v = 0x209;
                break;
            }
            case 27: {
                v = 0x201;
                break;
            }
            case 28: {
                v = 0x202;
                break;
            }
            case 29: {
                v = 0x200;
                break;
            }
            case 30: {
                v = 0x205;
                break;
            }
            case 0x1F: {
                v = 0x206;
                break;
            }
            case 0x20: {
                v = 0x203;
                break;
            }
            case 33: {
                v = 0x204;
                break;
            }
            case 34: {
                v = 0x20B;
                break;
            }
            case 35: {
                v = 0x20A;
                break;
            }
            case 36: {
                v = 0x20C;
                break;
            }
            case 37: {
                v = 0x207;
                break;
            }
            case 38: {
                v = 0x101;
                break;
            }
            case 39: {
                v = 0x102;
                break;
            }
            case 40: {
                v = 0x100;
                break;
            }
            case 41: {
                v = 0x105;
                break;
            }
            case 42: {
                v = 0x106;
                break;
            }
            case 43: {
                v = 0x103;
                break;
            }
            case 44: {
                v = 260;
                break;
            }
            case 45: {
                v = 0x10B;
                break;
            }
            case 46: {
                v = 0x10A;
                break;
            }
            case 0x2F: {
                v = 0x10C;
                break;
            }
            case 0x30: {
                return 0x107;
            }
            case 49: {
                v = 0x109;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported filed type: \'%s\'.", realmFieldType0.name()));
            }
        }
        if(!z) {
            v1 = 0x40;
        }
        return v | v1;
    }

    private static RealmFieldType b(int v) {
        switch(v & -65) {
            case 0: {
                return RealmFieldType.INTEGER;
            }
            case 1: {
                return RealmFieldType.BOOLEAN;
            }
            case 2: {
                return RealmFieldType.STRING;
            }
            case 3: {
                return RealmFieldType.BINARY;
            }
            case 4: {
                return RealmFieldType.DATE;
            }
            case 5: {
                return RealmFieldType.FLOAT;
            }
            case 6: {
                return RealmFieldType.DOUBLE;
            }
            case 7: {
                return RealmFieldType.OBJECT;
            }
            default: {
                switch(v & -65) {
                    case 9: {
                        return RealmFieldType.MIXED;
                    }
                    case 10: {
                        return RealmFieldType.OBJECT_ID;
                    }
                    case 11: {
                        return RealmFieldType.DECIMAL128;
                    }
                    case 12: {
                        return RealmFieldType.UUID;
                    }
                    default: {
                        switch(v & -65) {
                            case 0x80: {
                                return RealmFieldType.INTEGER_LIST;
                            }
                            case 0x81: {
                                return RealmFieldType.BOOLEAN_LIST;
                            }
                            case 130: {
                                return RealmFieldType.STRING_LIST;
                            }
                            case 0x83: {
                                return RealmFieldType.BINARY_LIST;
                            }
                            case 0x84: {
                                return RealmFieldType.DATE_LIST;
                            }
                            case 0x85: {
                                return RealmFieldType.FLOAT_LIST;
                            }
                            case 0x86: {
                                return RealmFieldType.DOUBLE_LIST;
                            }
                            case 0x87: {
                                return RealmFieldType.LIST;
                            }
                            case 0x88: {
                                return RealmFieldType.LINKING_OBJECTS;
                            }
                            case 0x89: {
                                return RealmFieldType.MIXED_LIST;
                            }
                            case 0x8A: {
                                return RealmFieldType.OBJECT_ID_LIST;
                            }
                            case 0x8B: {
                                return RealmFieldType.DECIMAL128_LIST;
                            }
                            case 140: {
                                return RealmFieldType.UUID_LIST;
                            }
                            default: {
                                switch(v & -65) {
                                    case 0x100: {
                                        return RealmFieldType.INTEGER_SET;
                                    }
                                    case 0x101: {
                                        return RealmFieldType.BOOLEAN_SET;
                                    }
                                    case 0x102: {
                                        return RealmFieldType.STRING_SET;
                                    }
                                    case 0x103: {
                                        return RealmFieldType.BINARY_SET;
                                    }
                                    case 260: {
                                        return RealmFieldType.DATE_SET;
                                    }
                                    case 0x105: {
                                        return RealmFieldType.FLOAT_SET;
                                    }
                                    case 0x106: {
                                        return RealmFieldType.DOUBLE_SET;
                                    }
                                    case 0x107: {
                                        return RealmFieldType.LINK_SET;
                                    }
                                    default: {
                                        switch(v & -65) {
                                            case 0x109: {
                                                return RealmFieldType.MIXED_SET;
                                            }
                                            case 0x10A: {
                                                return RealmFieldType.OBJECT_ID_SET;
                                            }
                                            case 0x10B: {
                                                return RealmFieldType.DECIMAL128_SET;
                                            }
                                            case 0x10C: {
                                                return RealmFieldType.UUID_SET;
                                            }
                                            default: {
                                                switch(v & -65) {
                                                    case 0x200: {
                                                        return RealmFieldType.STRING_TO_INTEGER_MAP;
                                                    }
                                                    case 0x201: {
                                                        return RealmFieldType.STRING_TO_BOOLEAN_MAP;
                                                    }
                                                    case 0x202: {
                                                        return RealmFieldType.STRING_TO_STRING_MAP;
                                                    }
                                                    case 0x203: {
                                                        return RealmFieldType.STRING_TO_BINARY_MAP;
                                                    }
                                                    case 0x204: {
                                                        return RealmFieldType.STRING_TO_DATE_MAP;
                                                    }
                                                    case 0x205: {
                                                        return RealmFieldType.STRING_TO_FLOAT_MAP;
                                                    }
                                                    case 0x206: {
                                                        return RealmFieldType.STRING_TO_DOUBLE_MAP;
                                                    }
                                                    case 0x207: {
                                                        return RealmFieldType.STRING_TO_LINK_MAP;
                                                    }
                                                    default: {
                                                        switch(v & -65) {
                                                            case 0x209: {
                                                                return RealmFieldType.STRING_TO_MIXED_MAP;
                                                            }
                                                            case 0x20A: {
                                                                return RealmFieldType.STRING_TO_OBJECT_ID_MAP;
                                                            }
                                                            case 0x20B: {
                                                                return RealmFieldType.STRING_TO_DECIMAL128_MAP;
                                                            }
                                                            case 0x20C: {
                                                                return RealmFieldType.STRING_TO_UUID_MAP;
                                                            }
                                                            default: {
                                                                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported property type: \'%d\'", v));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public long c() {
        return Property.nativeGetColumnKey(this.a);
    }

    public String d() {
        return Property.nativeGetLinkedObjectName(this.a);
    }

    public RealmFieldType e() {
        return Property.b(Property.nativeGetType(this.a));
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return Property.w;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    static native long nativeCreateComputedLinkProperty(String arg0, String arg1, String arg2) {
    }

    static native long nativeCreatePersistedLinkProperty(String arg0, String arg1, int arg2, String arg3) {
    }

    static native long nativeCreatePersistedProperty(String arg0, String arg1, int arg2, boolean arg3, boolean arg4) {
    }

    private static native long nativeGetColumnKey(long arg0) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native String nativeGetLinkedObjectName(long arg0) {
    }

    private static native int nativeGetType(long arg0) {
    }
}

