package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import sun.misc.Unsafe;

final class MessageSchema implements Schema {
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final MessageLite e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final NewInstanceSchema m;
    private final ListFieldSchema n;
    private final UnknownFieldSchema o;
    private final ExtensionSchema p;
    private final MapFieldSchema q;
    private static final int r = 3;
    private static final int s = 20;
    private static final int t = 0xFFFFF;
    private static final int u = 0xFF00000;
    private static final int v = 0x10000000;
    private static final int w = 0x20000000;
    private static final int[] x = null;
    static final int y = 51;
    private static final Unsafe z;

    static {
        MessageSchema.x = new int[0];
        MessageSchema.z = UnsafeUtil.R();
    }

    private MessageSchema(int[] arr_v, Object[] arr_object, int v, int v1, MessageLite messageLite0, boolean z, boolean z1, int[] arr_v1, int v2, int v3, NewInstanceSchema newInstanceSchema0, ListFieldSchema listFieldSchema0, UnknownFieldSchema unknownFieldSchema0, ExtensionSchema extensionSchema0, MapFieldSchema mapFieldSchema0) {
        this.a = arr_v;
        this.b = arr_object;
        this.c = v;
        this.d = v1;
        this.g = messageLite0 instanceof GeneratedMessageLite;
        this.h = z;
        this.f = extensionSchema0 != null && extensionSchema0.e(messageLite0);
        this.i = z1;
        this.j = arr_v1;
        this.k = v2;
        this.l = v3;
        this.m = newInstanceSchema0;
        this.n = listFieldSchema0;
        this.o = unknownFieldSchema0;
        this.p = extensionSchema0;
        this.e = messageLite0;
        this.q = mapFieldSchema0;
    }

    private boolean A(Object object0, int v, int v1) {
        Object object1 = UnsafeUtil.O(object0, ((long)(v & 0xFFFFF)));
        Map map0 = this.q.forMapData(object1);
        if(map0.isEmpty()) {
            return true;
        }
        Object object2 = this.n(v1);
        if(this.q.forMapMetadata(object2).c.a() != JavaType.j) {
            return true;
        }
        Schema schema0 = null;
        for(Object object3: map0.values()) {
            if(schema0 == null) {
                schema0 = Protobuf.a().i(object3.getClass());
            }
            if(!schema0.isInitialized(object3)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private boolean B(Object object0, Object object1, int v) {
        int v1 = this.c0(v);
        return UnsafeUtil.I(object0, ((long)(v1 & 0xFFFFF))) == UnsafeUtil.I(object1, ((long)(v1 & 0xFFFFF)));
    }

    private boolean C(Object object0, int v, int v1) {
        return UnsafeUtil.I(object0, ((long)(this.c0(v1) & 0xFFFFF))) == v;
    }

    private static boolean D(int v) {
        return (v & 0x10000000) != 0;
    }

    private static List E(Object object0, long v) {
        return (List)UnsafeUtil.O(object0, v);
    }

    private static long F(Object object0, long v) {
        return UnsafeUtil.L(object0, v);
    }

    private void G(UnknownFieldSchema unknownFieldSchema0, ExtensionSchema extensionSchema0, Object object0, Reader reader0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        int v10;
        int v4;
        int v3;
        int v2;
        int v1;
        int v;
        Object object1 = null;
        FieldSet fieldSet0 = null;
        while(true) {
            while(true) {
            alab1:
                while(true) {
                    try {
                        while(true) {
                            while(true) {
                            label_2:
                                v = reader0.getFieldNumber();
                                v1 = this.a0(v);
                                if(v1 >= 0) {
                                    goto label_34;
                                }
                                if(v == 0x7FFFFFFF) {
                                    goto label_26;
                                }
                                Object object2 = this.f ? extensionSchema0.b(extensionRegistryLite0, this.e, v) : null;
                                if(object2 == null) {
                                    if(unknownFieldSchema0.q(reader0)) {
                                        goto label_17;
                                    }
                                    if(object1 == null) {
                                        object1 = unknownFieldSchema0.f(object0);
                                    }
                                    if(!unknownFieldSchema0.m(object1, reader0)) {
                                        break;
                                    }
                                }
                                else {
                                    if(fieldSet0 == null) {
                                        fieldSet0 = extensionSchema0.d(object0);
                                    }
                                    object1 = extensionSchema0.g(reader0, object2, extensionRegistryLite0, fieldSet0, object1, unknownFieldSchema0);
                                }
                            }
                            break;
                        label_17:
                            if(reader0.skipField()) {
                                goto label_2;
                            }
                            break;
                        }
                        v2 = this.k;
                    }
                    catch(Throwable throwable0) {
                        goto label_268;
                    }
                    while(v2 < this.l) {
                        object1 = this.j(object0, this.j[v2], object1, unknownFieldSchema0);
                        ++v2;
                    }
                    if(object1 != null) {
                        unknownFieldSchema0.o(object0, object1);
                    }
                    return;
                    try {
                    label_26:
                        v3 = this.k;
                    }
                    catch(Throwable throwable0) {
                        goto label_268;
                    }
                    while(v3 < this.l) {
                        object1 = this.j(object0, this.j[v3], object1, unknownFieldSchema0);
                        ++v3;
                    }
                    if(object1 != null) {
                        unknownFieldSchema0.o(object0, object1);
                    }
                    return;
                    try {
                    label_34:
                        v4 = this.n0(v1);
                        try {
                            switch((v4 & 0xFF00000) >>> 20) {
                                case 0: {
                                    goto label_47;
                                }
                                case 1: {
                                    goto label_50;
                                }
                                case 2: {
                                    goto label_53;
                                }
                                case 3: {
                                    goto label_56;
                                }
                                case 4: {
                                    goto label_59;
                                }
                                case 5: {
                                    goto label_62;
                                }
                                case 6: {
                                    goto label_65;
                                }
                                case 7: {
                                    goto label_68;
                                }
                                case 8: {
                                    goto label_71;
                                }
                                case 9: {
                                    goto label_74;
                                }
                                case 10: {
                                    goto label_80;
                                }
                                case 11: {
                                    goto label_83;
                                }
                                case 12: {
                                    goto label_86;
                                }
                                case 13: {
                                    goto label_94;
                                }
                                case 14: {
                                    goto label_97;
                                }
                                case 15: {
                                    goto label_100;
                                }
                                case 16: {
                                    goto label_103;
                                }
                                case 17: {
                                    goto label_106;
                                }
                                case 18: {
                                    goto label_112;
                                }
                                case 19: {
                                    goto label_114;
                                }
                                case 20: {
                                    goto label_116;
                                }
                                case 21: {
                                    goto label_118;
                                }
                                case 22: {
                                    goto label_120;
                                }
                                case 23: {
                                    goto label_122;
                                }
                                case 24: {
                                    goto label_124;
                                }
                                case 25: {
                                    goto label_126;
                                }
                                case 26: {
                                    goto label_128;
                                }
                                case 27: {
                                    goto label_130;
                                }
                                case 28: {
                                    goto label_132;
                                }
                                case 29: {
                                    goto label_134;
                                }
                                case 30: {
                                    goto label_136;
                                }
                                case 0x1F: {
                                    goto label_140;
                                }
                                case 0x20: {
                                    goto label_142;
                                }
                                case 33: {
                                    goto label_144;
                                }
                                case 34: {
                                    goto label_146;
                                }
                                case 35: {
                                    goto label_148;
                                }
                                case 36: {
                                    goto label_150;
                                }
                                case 37: {
                                    goto label_152;
                                }
                                case 38: {
                                    goto label_154;
                                }
                                case 39: {
                                    goto label_156;
                                }
                                case 40: {
                                    goto label_158;
                                }
                                case 41: {
                                    goto label_160;
                                }
                                case 42: {
                                    goto label_162;
                                }
                                case 43: {
                                    goto label_164;
                                }
                                case 44: {
                                    goto label_166;
                                }
                                case 45: {
                                    goto label_170;
                                }
                                case 46: {
                                    goto label_172;
                                }
                                case 0x2F: {
                                    goto label_174;
                                }
                                case 0x30: {
                                    goto label_176;
                                }
                                case 49: {
                                    goto label_178;
                                }
                                case 50: {
                                    goto label_180;
                                }
                                case 51: {
                                    goto label_182;
                                }
                                case 52: {
                                    goto label_185;
                                }
                                case 53: {
                                    goto label_188;
                                }
                                case 54: {
                                    goto label_191;
                                }
                                case 55: {
                                    goto label_194;
                                }
                                case 56: {
                                    goto label_197;
                                }
                                case 57: {
                                    goto label_200;
                                }
                                case 58: {
                                    goto label_203;
                                }
                                case 59: {
                                    goto label_206;
                                }
                                case 60: {
                                    goto label_209;
                                }
                                case 61: {
                                    goto label_216;
                                }
                                case 62: {
                                    goto label_219;
                                }
                                case 0x3F: {
                                    goto label_222;
                                }
                                case 0x40: {
                                    goto label_230;
                                }
                                case 65: {
                                    goto label_233;
                                }
                                case 66: {
                                    goto label_236;
                                }
                                case 67: {
                                    goto label_239;
                                }
                                case 68: {
                                    goto label_242;
                                }
                                default: {
                                    if(object1 == null) {
                                        object1 = unknownFieldSchema0.n();
                                    }
                                    if(unknownFieldSchema0.m(object1, reader0)) {
                                        break;
                                    }
                                    break alab1;
                                }
                            }
                        }
                        catch(InvalidWireTypeException unused_ex) {
                            goto label_245;
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_268;
                    }
                }
                for(int v5 = this.k; v5 < this.l; ++v5) {
                    object1 = this.j(object0, this.j[v5], object1, unknownFieldSchema0);
                }
                if(object1 != null) {
                    unknownFieldSchema0.o(object0, object1);
                }
                return;
                try {
                    try {
                    label_47:
                        UnsafeUtil.g0(object0, ((long)(v4 & 0xFFFFF)), reader0.readDouble());
                        this.i0(object0, v1);
                        goto label_2;
                    label_50:
                        UnsafeUtil.i0(object0, ((long)(v4 & 0xFFFFF)), reader0.readFloat());
                        this.i0(object0, v1);
                        goto label_2;
                    label_53:
                        UnsafeUtil.o0(object0, ((long)(v4 & 0xFFFFF)), reader0.readInt64());
                        this.i0(object0, v1);
                        goto label_2;
                    label_56:
                        UnsafeUtil.o0(object0, ((long)(v4 & 0xFFFFF)), reader0.readUInt64());
                        this.i0(object0, v1);
                        goto label_2;
                    label_59:
                        UnsafeUtil.l0(object0, ((long)(v4 & 0xFFFFF)), reader0.readInt32());
                        this.i0(object0, v1);
                        goto label_2;
                    label_62:
                        UnsafeUtil.o0(object0, ((long)(v4 & 0xFFFFF)), reader0.readFixed64());
                        this.i0(object0, v1);
                        goto label_2;
                    label_65:
                        UnsafeUtil.l0(object0, ((long)(v4 & 0xFFFFF)), reader0.readFixed32());
                        this.i0(object0, v1);
                        goto label_2;
                    label_68:
                        UnsafeUtil.X(object0, ((long)(v4 & 0xFFFFF)), reader0.readBool());
                        this.i0(object0, v1);
                        goto label_2;
                    label_71:
                        this.f0(object0, v4, reader0);
                        this.i0(object0, v1);
                        goto label_2;
                    label_74:
                        if(this.w(object0, v1)) {
                            UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), Internal.v(UnsafeUtil.O(object0, ((long)(v4 & 0xFFFFF))), reader0.d(this.o(v1), extensionRegistryLite0)));
                        }
                        else {
                            UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.d(this.o(v1), extensionRegistryLite0));
                            this.i0(object0, v1);
                        }
                        goto label_2;
                    label_80:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readBytes());
                        this.i0(object0, v1);
                        goto label_2;
                    label_83:
                        UnsafeUtil.l0(object0, ((long)(v4 & 0xFFFFF)), reader0.readUInt32());
                        this.i0(object0, v1);
                        goto label_2;
                    label_86:
                        int v6 = reader0.readEnum();
                        EnumVerifier internal$EnumVerifier0 = this.m(v1);
                        if(internal$EnumVerifier0 == null || internal$EnumVerifier0.isInRange(v6)) {
                            UnsafeUtil.l0(object0, ((long)(v4 & 0xFFFFF)), v6);
                            this.i0(object0, v1);
                        }
                        else {
                            object1 = SchemaUtil.Q(v, v6, object1, unknownFieldSchema0);
                        }
                        goto label_2;
                    label_94:
                        UnsafeUtil.l0(object0, ((long)(v4 & 0xFFFFF)), reader0.readSFixed32());
                        this.i0(object0, v1);
                        goto label_2;
                    label_97:
                        UnsafeUtil.o0(object0, ((long)(v4 & 0xFFFFF)), reader0.readSFixed64());
                        this.i0(object0, v1);
                        goto label_2;
                    label_100:
                        UnsafeUtil.l0(object0, ((long)(v4 & 0xFFFFF)), reader0.readSInt32());
                        this.i0(object0, v1);
                        goto label_2;
                    label_103:
                        UnsafeUtil.o0(object0, ((long)(v4 & 0xFFFFF)), reader0.readSInt64());
                        this.i0(object0, v1);
                        goto label_2;
                    label_106:
                        if(this.w(object0, v1)) {
                            UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), Internal.v(UnsafeUtil.O(object0, ((long)(v4 & 0xFFFFF))), reader0.a(this.o(v1), extensionRegistryLite0)));
                        }
                        else {
                            UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.a(this.o(v1), extensionRegistryLite0));
                            this.i0(object0, v1);
                        }
                        goto label_2;
                    label_112:
                        reader0.readDoubleList(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_114:
                        reader0.readFloatList(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_116:
                        reader0.readInt64List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_118:
                        reader0.readUInt64List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_120:
                        reader0.readInt32List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_122:
                        reader0.readFixed64List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_124:
                        reader0.readFixed32List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_126:
                        reader0.readBoolList(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_128:
                        this.g0(object0, v4, reader0);
                        goto label_2;
                    label_130:
                        this.e0(object0, v4, reader0, this.o(v1), extensionRegistryLite0);
                        goto label_2;
                    label_132:
                        reader0.readBytesList(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_134:
                        reader0.readUInt32List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_136:
                        List list0 = this.n.e(object0, ((long)(v4 & 0xFFFFF)));
                        reader0.readEnumList(list0);
                        object1 = SchemaUtil.C(v, list0, this.m(v1), object1, unknownFieldSchema0);
                        goto label_2;
                    label_140:
                        reader0.readSFixed32List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_142:
                        reader0.readSFixed64List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_144:
                        reader0.readSInt32List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_146:
                        reader0.readSInt64List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_148:
                        reader0.readDoubleList(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_150:
                        reader0.readFloatList(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_152:
                        reader0.readInt64List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_154:
                        reader0.readUInt64List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_156:
                        reader0.readInt32List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_158:
                        reader0.readFixed64List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_160:
                        reader0.readFixed32List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_162:
                        reader0.readBoolList(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_164:
                        reader0.readUInt32List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_166:
                        List list1 = this.n.e(object0, ((long)(v4 & 0xFFFFF)));
                        reader0.readEnumList(list1);
                        object1 = SchemaUtil.C(v, list1, this.m(v1), object1, unknownFieldSchema0);
                        goto label_2;
                    label_170:
                        reader0.readSFixed32List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_172:
                        reader0.readSFixed64List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_174:
                        reader0.readSInt32List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_176:
                        reader0.readSInt64List(this.n.e(object0, ((long)(v4 & 0xFFFFF))));
                        goto label_2;
                    label_178:
                        this.d0(object0, ((long)(v4 & 0xFFFFF)), reader0, this.o(v1), extensionRegistryLite0);
                        goto label_2;
                    label_180:
                        this.H(object0, v1, this.n(v1), extensionRegistryLite0, reader0);
                        goto label_2;
                    label_182:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readDouble());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_185:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readFloat());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_188:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readInt64());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_191:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readUInt64());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_194:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readInt32());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_197:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readFixed64());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_200:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readFixed32());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_203:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), Boolean.valueOf(reader0.readBool()));
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_206:
                        this.f0(object0, v4, reader0);
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_209:
                        if(this.C(object0, v, v1)) {
                            UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), Internal.v(UnsafeUtil.O(object0, ((long)(v4 & 0xFFFFF))), reader0.d(this.o(v1), extensionRegistryLite0)));
                        }
                        else {
                            UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.d(this.o(v1), extensionRegistryLite0));
                            this.i0(object0, v1);
                        }
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_216:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readBytes());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_219:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readUInt32());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_222:
                        int v7 = reader0.readEnum();
                        EnumVerifier internal$EnumVerifier1 = this.m(v1);
                        if(internal$EnumVerifier1 == null || internal$EnumVerifier1.isInRange(v7)) {
                            UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), v7);
                            this.j0(object0, v, v1);
                        }
                        else {
                            object1 = SchemaUtil.Q(v, v7, object1, unknownFieldSchema0);
                        }
                        goto label_2;
                    label_230:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readSFixed32());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_233:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readSFixed64());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_236:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readSInt32());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_239:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.readSInt64());
                        this.j0(object0, v, v1);
                        goto label_2;
                    label_242:
                        UnsafeUtil.q0(object0, ((long)(v4 & 0xFFFFF)), reader0.a(this.o(v1), extensionRegistryLite0));
                        this.j0(object0, v, v1);
                        goto label_2;
                    }
                    catch(InvalidWireTypeException unused_ex) {
                    }
                label_245:
                    if(unknownFieldSchema0.q(reader0)) {
                        break;
                    }
                    else {
                        if(object1 == null) {
                            object1 = unknownFieldSchema0.f(object0);
                        }
                        if(!unknownFieldSchema0.m(object1, reader0)) {
                            goto label_249;
                        }
                        continue;
                    }
                    goto label_260;
                }
                catch(Throwable throwable0) {
                    goto label_268;
                }
            label_249:
                for(int v8 = this.k; v8 < this.l; ++v8) {
                    object1 = this.j(object0, this.j[v8], object1, unknownFieldSchema0);
                }
                if(object1 != null) {
                    unknownFieldSchema0.o(object0, object1);
                }
                return;
            }
            try {
                if(reader0.skipField()) {
                    goto label_2;
                }
                break;
            }
            catch(Throwable throwable0) {
                goto label_268;
            }
        }
        int v9 = this.k;
    label_260:
        while(v9 < this.l) {
            object1 = this.j(object0, this.j[v9], object1, unknownFieldSchema0);
            ++v9;
        }
        if(object1 != null) {
            unknownFieldSchema0.o(object0, object1);
        }
        return;
        try {
        label_268:
            v10 = this.k;
        }
        catch(Throwable throwable0) {
            goto label_268;
        }
        while(v10 < this.l) {
            object1 = this.j(object0, this.j[v10], object1, unknownFieldSchema0);
            ++v10;
        }
        if(object1 != null) {
            unknownFieldSchema0.o(object0, object1);
        }
        throw throwable0;
    }

    private final void H(Object object0, int v, Object object1, ExtensionRegistryLite extensionRegistryLite0, Reader reader0) throws IOException {
        long v1 = MessageSchema.P(this.n0(v));
        Object object2 = UnsafeUtil.O(object0, v1);
        if(object2 == null) {
            object2 = this.q.newMapField(object1);
            UnsafeUtil.q0(object0, v1, object2);
        }
        else if(this.q.isImmutable(object2)) {
            Object object3 = this.q.newMapField(object1);
            this.q.mergeFrom(object3, object2);
            UnsafeUtil.q0(object0, v1, object3);
            object2 = object3;
        }
        reader0.h(this.q.forMutableMapData(object2), this.q.forMapMetadata(object1), extensionRegistryLite0);
    }

    private void I(Object object0, Object object1, int v) {
        long v1 = MessageSchema.P(this.n0(v));
        if(!this.w(object1, v)) {
            return;
        }
        Object object2 = UnsafeUtil.O(object0, v1);
        Object object3 = UnsafeUtil.O(object1, v1);
        if(object2 != null && object3 != null) {
            UnsafeUtil.q0(object0, v1, Internal.v(object2, object3));
            this.i0(object0, v);
            return;
        }
        if(object3 != null) {
            UnsafeUtil.q0(object0, v1, object3);
            this.i0(object0, v);
        }
    }

    private void J(Object object0, Object object1, int v) {
        int v1 = this.n0(v);
        int v2 = this.O(v);
        if(!this.C(object1, v2, v)) {
            return;
        }
        Object object2 = UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)));
        Object object3 = UnsafeUtil.O(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 != null && object3 != null) {
            UnsafeUtil.q0(object0, ((long)(v1 & 0xFFFFF)), Internal.v(object2, object3));
            this.j0(object0, v2, v);
            return;
        }
        if(object3 != null) {
            UnsafeUtil.q0(object0, ((long)(v1 & 0xFFFFF)), object3);
            this.j0(object0, v2, v);
        }
    }

    private void K(Object object0, Object object1, int v) {
        int v1 = this.n0(v);
        long v2 = (long)(v1 & 0xFFFFF);
        int v3 = this.O(v);
        switch((v1 & 0xFF00000) >>> 20) {
            case 0: {
                if(this.w(object1, v)) {
                    UnsafeUtil.g0(object0, v2, UnsafeUtil.D(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 1: {
                if(this.w(object1, v)) {
                    UnsafeUtil.i0(object0, v2, UnsafeUtil.F(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 2: {
                if(this.w(object1, v)) {
                    UnsafeUtil.o0(object0, v2, UnsafeUtil.L(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 3: {
                if(this.w(object1, v)) {
                    UnsafeUtil.o0(object0, v2, UnsafeUtil.L(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 4: {
                if(this.w(object1, v)) {
                    UnsafeUtil.l0(object0, v2, UnsafeUtil.I(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 5: {
                if(this.w(object1, v)) {
                    UnsafeUtil.o0(object0, v2, UnsafeUtil.L(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 6: {
                if(this.w(object1, v)) {
                    UnsafeUtil.l0(object0, v2, UnsafeUtil.I(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 7: {
                if(this.w(object1, v)) {
                    UnsafeUtil.X(object0, v2, UnsafeUtil.u(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 8: {
                if(this.w(object1, v)) {
                    UnsafeUtil.q0(object0, v2, UnsafeUtil.O(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 9: {
                this.I(object0, object1, v);
                return;
            }
            case 10: {
                if(this.w(object1, v)) {
                    UnsafeUtil.q0(object0, v2, UnsafeUtil.O(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 11: {
                if(this.w(object1, v)) {
                    UnsafeUtil.l0(object0, v2, UnsafeUtil.I(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 12: {
                if(this.w(object1, v)) {
                    UnsafeUtil.l0(object0, v2, UnsafeUtil.I(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 13: {
                if(this.w(object1, v)) {
                    UnsafeUtil.l0(object0, v2, UnsafeUtil.I(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 14: {
                if(this.w(object1, v)) {
                    UnsafeUtil.o0(object0, v2, UnsafeUtil.L(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 15: {
                if(this.w(object1, v)) {
                    UnsafeUtil.l0(object0, v2, UnsafeUtil.I(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 16: {
                if(this.w(object1, v)) {
                    UnsafeUtil.o0(object0, v2, UnsafeUtil.L(object1, v2));
                    this.i0(object0, v);
                    return;
                }
                break;
            }
            case 17: {
                this.I(object0, object1, v);
                return;
            }
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 0x2F: 
            case 0x30: 
            case 49: {
                this.n.d(object0, object1, v2);
                return;
            }
            case 50: {
                SchemaUtil.I(this.q, object0, object1, v2);
                return;
            }
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: {
                if(this.C(object1, v3, v)) {
                    UnsafeUtil.q0(object0, v2, UnsafeUtil.O(object1, v2));
                    this.j0(object0, v3, v);
                    return;
                }
                break;
            }
            case 60: {
                this.J(object0, object1, v);
                return;
            }
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 67: {
                if(this.C(object1, v3, v)) {
                    UnsafeUtil.q0(object0, v2, UnsafeUtil.O(object1, v2));
                    this.j0(object0, v3, v);
                    return;
                }
                break;
            }
            case 68: {
                this.J(object0, object1, v);
            }
        }
    }

    // 去混淆评级： 低(20)
    static MessageSchema L(Class class0, MessageInfo messageInfo0, NewInstanceSchema newInstanceSchema0, ListFieldSchema listFieldSchema0, UnknownFieldSchema unknownFieldSchema0, ExtensionSchema extensionSchema0, MapFieldSchema mapFieldSchema0) {
        return messageInfo0 instanceof RawMessageInfo ? MessageSchema.N(((RawMessageInfo)messageInfo0), newInstanceSchema0, listFieldSchema0, unknownFieldSchema0, extensionSchema0, mapFieldSchema0) : MessageSchema.M(((StructuralMessageInfo)messageInfo0), newInstanceSchema0, listFieldSchema0, unknownFieldSchema0, extensionSchema0, mapFieldSchema0);
    }

    static MessageSchema M(StructuralMessageInfo structuralMessageInfo0, NewInstanceSchema newInstanceSchema0, ListFieldSchema listFieldSchema0, UnknownFieldSchema unknownFieldSchema0, ExtensionSchema extensionSchema0, MapFieldSchema mapFieldSchema0) {
        int v10;
        int[] arr_v1;
        int v1;
        int v;
        boolean z = structuralMessageInfo0.getSyntax() == ProtoSyntax.b;
        FieldInfo[] arr_fieldInfo = structuralMessageInfo0.b();
        if(arr_fieldInfo.length == 0) {
            v = 0;
            v1 = 0;
        }
        else {
            v = arr_fieldInfo[0].p();
            v1 = arr_fieldInfo[arr_fieldInfo.length - 1].p();
        }
        int[] arr_v = new int[arr_fieldInfo.length * 3];
        Object[] arr_object = new Object[arr_fieldInfo.length * 2];
        int v3 = 0;
        int v4 = 0;
        for(int v2 = 0; true; ++v2) {
            arr_v1 = null;
            if(v2 >= arr_fieldInfo.length) {
                break;
            }
            FieldInfo fieldInfo0 = arr_fieldInfo[v2];
            if(fieldInfo0.z() == FieldType.V8) {
                ++v3;
            }
            else if(fieldInfo0.z().e() >= 18 && fieldInfo0.z().e() <= 49) {
                ++v4;
            }
        }
        int[] arr_v2 = v3 <= 0 ? null : new int[v3];
        if(v4 > 0) {
            arr_v1 = new int[v4];
        }
        int[] arr_v3 = structuralMessageInfo0.a() == null ? MessageSchema.x : structuralMessageInfo0.a();
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        while(v5 < arr_fieldInfo.length) {
            FieldInfo fieldInfo1 = arr_fieldInfo[v5];
            MessageSchema.l0(fieldInfo1, arr_v, v6, z, arr_object);
            if(v7 < arr_v3.length && arr_v3[v7] == fieldInfo1.p()) {
                arr_v3[v7] = v6;
                ++v7;
            }
            if(fieldInfo1.z() == FieldType.V8) {
                arr_v2[v8] = v6;
                ++v8;
            }
            else if(fieldInfo1.z().e() >= 18 && fieldInfo1.z().e() <= 49) {
                v10 = v6;
                arr_v1[v9] = (int)UnsafeUtil.W(fieldInfo1.n());
                ++v9;
                goto label_48;
            }
            v10 = v6;
        label_48:
            ++v5;
            v6 = v10 + 3;
        }
        if(arr_v2 == null) {
            arr_v2 = MessageSchema.x;
        }
        if(arr_v1 == null) {
            arr_v1 = MessageSchema.x;
        }
        int[] arr_v4 = new int[arr_v3.length + arr_v2.length + arr_v1.length];
        System.arraycopy(arr_v3, 0, arr_v4, 0, arr_v3.length);
        System.arraycopy(arr_v2, 0, arr_v4, arr_v3.length, arr_v2.length);
        System.arraycopy(arr_v1, 0, arr_v4, arr_v3.length + arr_v2.length, arr_v1.length);
        return new MessageSchema(arr_v, arr_object, v, v1, structuralMessageInfo0.getDefaultInstance(), z, true, arr_v4, arr_v3.length, arr_v3.length + arr_v2.length, newInstanceSchema0, listFieldSchema0, unknownFieldSchema0, extensionSchema0, mapFieldSchema0);
    }

    static MessageSchema N(RawMessageInfo rawMessageInfo0, NewInstanceSchema newInstanceSchema0, ListFieldSchema listFieldSchema0, UnknownFieldSchema unknownFieldSchema0, ExtensionSchema extensionSchema0, MapFieldSchema mapFieldSchema0) {
        Field field3;
        int v87;
        int v86;
        Class class1;
        int v85;
        int v84;
        int v83;
        Field field1;
        int v80;
        int[] arr_v2;
        Field field0;
        int v74;
        int v68;
        int v67;
        int v66;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        int[] arr_v;
        int v7;
        int v6;
        int v = 0;
        boolean z = rawMessageInfo0.getSyntax() == ProtoSyntax.b;
        String s = rawMessageInfo0.b();
        int v1 = s.length();
        int v2 = s.charAt(0);
        if(v2 >= 0xD800) {
            int v3 = v2 & 0x1FFF;
            int v5 = 13;
            for(int v4 = 1; true; v4 = v6) {
                v6 = v4 + 1;
                v7 = s.charAt(v4);
                if(v7 < 0xD800) {
                    break;
                }
                v3 |= (v7 & 0x1FFF) << v5;
                v5 += 13;
            }
            v2 = v3 | v7 << v5;
        }
        else {
            v6 = 1;
        }
        int v8 = v6 + 1;
        int v9 = s.charAt(v6);
        if(v9 >= 0xD800) {
            int v10 = v9 & 0x1FFF;
            int v11 = 13;
            int v12;
            while((v12 = s.charAt(v8)) >= 0xD800) {
                v10 |= (v12 & 0x1FFF) << v11;
                v11 += 13;
                ++v8;
            }
            v9 = v10 | v12 << v11;
            ++v8;
        }
        if(v9 == 0) {
            arr_v = MessageSchema.x;
            v13 = 0;
            v14 = 0;
            v15 = 0;
            v16 = 0;
            v17 = 0;
            v18 = 0;
        }
        else {
            int v19 = v8 + 1;
            int v20 = s.charAt(v8);
            if(v20 >= 0xD800) {
                int v21 = v20 & 0x1FFF;
                int v22 = 13;
                int v23;
                while((v23 = s.charAt(v19)) >= 0xD800) {
                    v21 |= (v23 & 0x1FFF) << v22;
                    v22 += 13;
                    ++v19;
                }
                v20 = v21 | v23 << v22;
                ++v19;
            }
            int v24 = v19 + 1;
            int v25 = s.charAt(v19);
            if(v25 >= 0xD800) {
                int v26 = v25 & 0x1FFF;
                int v27 = 13;
                int v28;
                while((v28 = s.charAt(v24)) >= 0xD800) {
                    v26 |= (v28 & 0x1FFF) << v27;
                    v27 += 13;
                    ++v24;
                }
                v25 = v26 | v28 << v27;
                ++v24;
            }
            int v29 = v24 + 1;
            int v30 = s.charAt(v24);
            if(v30 >= 0xD800) {
                int v31 = v30 & 0x1FFF;
                int v32 = 13;
                int v33;
                while((v33 = s.charAt(v29)) >= 0xD800) {
                    v31 |= (v33 & 0x1FFF) << v32;
                    v32 += 13;
                    ++v29;
                }
                v30 = v31 | v33 << v32;
                ++v29;
            }
            int v34 = v29 + 1;
            v15 = s.charAt(v29);
            if(v15 >= 0xD800) {
                int v35 = v15 & 0x1FFF;
                int v36 = 13;
                int v37;
                while((v37 = s.charAt(v34)) >= 0xD800) {
                    v35 |= (v37 & 0x1FFF) << v36;
                    v36 += 13;
                    ++v34;
                }
                v15 = v35 | v37 << v36;
                ++v34;
            }
            int v38 = v34 + 1;
            v16 = s.charAt(v34);
            if(v16 >= 0xD800) {
                int v39 = v16 & 0x1FFF;
                int v40 = 13;
                int v41;
                while((v41 = s.charAt(v38)) >= 0xD800) {
                    v39 |= (v41 & 0x1FFF) << v40;
                    v40 += 13;
                    ++v38;
                }
                v16 = v39 | v41 << v40;
                ++v38;
            }
            int v42 = v38 + 1;
            int v43 = s.charAt(v38);
            if(v43 >= 0xD800) {
                int v44 = v43 & 0x1FFF;
                int v45 = 13;
                int v46;
                while((v46 = s.charAt(v42)) >= 0xD800) {
                    v44 |= (v46 & 0x1FFF) << v45;
                    v45 += 13;
                    ++v42;
                }
                v43 = v44 | v46 << v45;
                ++v42;
            }
            int v47 = v42 + 1;
            int v48 = s.charAt(v42);
            if(v48 >= 0xD800) {
                int v49 = v48 & 0x1FFF;
                int v50 = 13;
                int v51;
                while((v51 = s.charAt(v47)) >= 0xD800) {
                    v49 |= (v51 & 0x1FFF) << v50;
                    v50 += 13;
                    ++v47;
                }
                v48 = v49 | v51 << v50;
                ++v47;
            }
            int v52 = v47 + 1;
            v18 = s.charAt(v47);
            if(v18 >= 0xD800) {
                int v53 = v18 & 0x1FFF;
                int v54 = v52;
                int v55 = 13;
                int v56;
                while((v56 = s.charAt(v54)) >= 0xD800) {
                    v53 |= (v56 & 0x1FFF) << v55;
                    v55 += 13;
                    ++v54;
                }
                v18 = v53 | v56 << v55;
                v52 = v54 + 1;
            }
            v17 = v20 * 2 + v25;
            v13 = v20;
            v8 = v52;
            arr_v = new int[v18 + v43 + v48];
            v = v30;
            v14 = v43;
        }
        Unsafe unsafe0 = MessageSchema.z;
        Object[] arr_object = rawMessageInfo0.a();
        Class class0 = rawMessageInfo0.getDefaultInstance().getClass();
        int[] arr_v1 = new int[v16 * 3];
        Object[] arr_object1 = new Object[v16 * 2];
        int v57 = v18 + v14;
        int v58 = v18;
        int v59 = v57;
        int v60 = 0;
        int v61 = 0;
        while(v8 < v1) {
            int v62 = s.charAt(v8);
            if(v62 >= 0xD800) {
                int v63 = v62 & 0x1FFF;
                int v64 = v8 + 1;
                int v65 = 13;
                while(true) {
                    v66 = s.charAt(v64);
                    v67 = v18;
                    if(v66 < 0xD800) {
                        break;
                    }
                    v63 |= (v66 & 0x1FFF) << v65;
                    v65 += 13;
                    ++v64;
                    v18 = v67;
                }
                v62 = v63 | v66 << v65;
                v68 = v64 + 1;
            }
            else {
                v67 = v18;
                v68 = v8 + 1;
            }
            int v69 = s.charAt(v68);
            if(v69 >= 0xD800) {
                int v70 = v69 & 0x1FFF;
                int v71 = v68 + 1;
                int v72 = 13;
                int v73;
                while((v73 = s.charAt(v71)) >= 0xD800) {
                    v70 |= (v73 & 0x1FFF) << v72;
                    v72 += 13;
                    ++v71;
                }
                v69 = v70 | v73 << v72;
                v74 = v71 + 1;
            }
            else {
                v74 = v68 + 1;
            }
            if((v69 & 0x400) != 0) {
                arr_v[v60] = v61;
                ++v60;
            }
            if((v69 & 0xFF) >= 51) {
                int v75 = v74 + 1;
                int v76 = s.charAt(v74);
                if(v76 >= 0xD800) {
                    int v77 = v76 & 0x1FFF;
                    int v78 = 13;
                    int v79;
                    while((v79 = s.charAt(v75)) >= 0xD800) {
                        v77 |= (v79 & 0x1FFF) << v78;
                        v78 += 13;
                        ++v75;
                    }
                    v76 = v77 | v79 << v78;
                    ++v75;
                }
                switch((v69 & 0xFF) - 51) {
                    case 12: {
                        if((v2 & 1) == 1) {
                            arr_object1[v61 / 3 * 2 + 1] = arr_object[v17];
                            ++v17;
                        }
                        break;
                    }
                    case 9: 
                    case 17: {
                        arr_object1[v61 / 3 * 2 + 1] = arr_object[v17];
                        ++v17;
                    }
                }
                Object object0 = arr_object[v76 * 2];
                if(object0 instanceof Field) {
                    field0 = (Field)object0;
                }
                else {
                    field0 = MessageSchema.h0(class0, ((String)object0));
                    arr_object[v76 * 2] = field0;
                }
                arr_v2 = arr_v1;
                v80 = v62;
                int v81 = (int)unsafe0.objectFieldOffset(field0);
                int v82 = v76 * 2 + 1;
                Object object1 = arr_object[v82];
                if(object1 instanceof Field) {
                    field1 = (Field)object1;
                }
                else {
                    field1 = MessageSchema.h0(class0, ((String)object1));
                    arr_object[v82] = field1;
                }
                v83 = v;
                v84 = v17;
                v74 = v75;
                v85 = 0;
                class1 = class0;
                v86 = (int)unsafe0.objectFieldOffset(field1);
                v87 = v81;
            }
            else {
                arr_v2 = arr_v1;
                v80 = v62;
                v84 = v17 + 1;
                Field field2 = MessageSchema.h0(class0, ((String)arr_object[v17]));
                switch(v69 & 0xFF) {
                    case 9: 
                    case 17: {
                        v83 = v;
                        arr_object1[v61 / 3 * 2 + 1] = field2.getType();
                        class1 = class0;
                        break;
                    }
                    case 12: 
                    case 30: 
                    case 44: {
                        v83 = v;
                        if((v2 & 1) == 1) {
                            arr_object1[v61 / 3 * 2 + 1] = arr_object[v84];
                            class1 = class0;
                            v84 = v17 + 2;
                            break;
                        }
                        class1 = class0;
                        break;
                    }
                    case 27: 
                    case 49: {
                        v83 = v;
                        arr_object1[v61 / 3 * 2 + 1] = arr_object[v84];
                        class1 = class0;
                        v84 = v17 + 2;
                        break;
                    }
                    case 50: {
                        arr_v[v58] = v61;
                        int v88 = v61 / 3 * 2;
                        arr_object1[v88] = arr_object[v84];
                        if((v69 & 0x800) == 0) {
                            ++v58;
                            v84 = v17 + 2;
                            v83 = v;
                        }
                        else {
                            v84 = v17 + 3;
                            arr_object1[v88 + 1] = arr_object[v17 + 2];
                            v83 = v;
                            ++v58;
                        }
                        class1 = class0;
                        break;
                    }
                    default: {
                        v83 = v;
                        class1 = class0;
                        break;
                    }
                }
                v87 = (int)unsafe0.objectFieldOffset(field2);
                if((v2 & 1) != 1 || (v69 & 0xFF) > 17) {
                    v86 = 0;
                    v85 = 0;
                }
                else {
                    int v89 = v74 + 1;
                    int v90 = s.charAt(v74);
                    if(v90 >= 0xD800) {
                        int v91 = v90 & 0x1FFF;
                        int v92 = 13;
                        int v93;
                        while((v93 = s.charAt(v89)) >= 0xD800) {
                            v91 |= (v93 & 0x1FFF) << v92;
                            v92 += 13;
                            ++v89;
                        }
                        v90 = v91 | v93 << v92;
                        ++v89;
                    }
                    int v94 = v13 * 2 + v90 / 0x20;
                    Object object2 = arr_object[v94];
                    if(object2 instanceof Field) {
                        field3 = (Field)object2;
                    }
                    else {
                        field3 = MessageSchema.h0(class1, ((String)object2));
                        arr_object[v94] = field3;
                    }
                    v74 = v89;
                    v86 = (int)unsafe0.objectFieldOffset(field3);
                    v85 = v90 % 0x20;
                }
                if((v69 & 0xFF) >= 18 && (v69 & 0xFF) <= 49) {
                    arr_v[v59] = v87;
                    ++v59;
                }
            }
            arr_v2[v61] = v80;
            int v95 = v61 + 2;
            arr_v2[v61 + 1] = ((v69 & 0x200) == 0 ? 0 : 0x20000000) | ((v69 & 0x100) == 0 ? 0 : 0x10000000) | (v69 & 0xFF) << 20 | v87;
            v61 += 3;
            arr_v2[v95] = v85 << 20 | v86;
            v17 = v84;
            class0 = class1;
            arr_v1 = arr_v2;
            v8 = v74;
            v = v83;
            v18 = v67;
        }
        return new MessageSchema(arr_v1, arr_object1, v, v15, rawMessageInfo0.getDefaultInstance(), z, false, arr_v, v18, v57, newInstanceSchema0, listFieldSchema0, unknownFieldSchema0, extensionSchema0, mapFieldSchema0);
    }

    private int O(int v) {
        return this.a[v];
    }

    private static long P(int v) [...] // Inlined contents

    private static boolean Q(Object object0, long v) {
        return ((Boolean)UnsafeUtil.O(object0, v)).booleanValue();
    }

    private static double R(Object object0, long v) {
        return (double)(((Double)UnsafeUtil.O(object0, v)));
    }

    private static float S(Object object0, long v) {
        return (float)(((Float)UnsafeUtil.O(object0, v)));
    }

    private static int T(Object object0, long v) {
        return (int)(((Integer)UnsafeUtil.O(object0, v)));
    }

    private static long U(Object object0, long v) {
        return (long)(((Long)UnsafeUtil.O(object0, v)));
    }

    private int V(Object object0, byte[] arr_b, int v, int v1, int v2, long v3, Registers arrayDecoders$Registers0) throws IOException {
        Unsafe unsafe0 = MessageSchema.z;
        Object object1 = this.n(v2);
        Object object2 = unsafe0.getObject(object0, v3);
        if(this.q.isImmutable(object2)) {
            Object object3 = this.q.newMapField(object1);
            this.q.mergeFrom(object3, object2);
            unsafe0.putObject(object0, v3, object3);
            object2 = object3;
        }
        return this.f(arr_b, v, v1, this.q.forMapMetadata(object1), this.q.forMutableMapData(object2), arrayDecoders$Registers0);
    }

    private int W(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7, int v8, Registers arrayDecoders$Registers0) throws IOException {
        int v10;
        Unsafe unsafe0 = MessageSchema.z;
        long v9 = (long)(this.a[v8 + 2] & 0xFFFFF);
        switch(v6) {
            case 51: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, ArrayDecoders.d(arr_b, v));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 8;
                }
                break;
            }
            case 52: {
                if(v4 == 5) {
                    unsafe0.putObject(object0, v7, ArrayDecoders.l(arr_b, v));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 4;
                }
                break;
            }
            case 53: 
            case 54: {
                if(v4 == 0) {
                    v10 = ArrayDecoders.L(arr_b, v, arrayDecoders$Registers0);
                    unsafe0.putObject(object0, v7, arrayDecoders$Registers0.b);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 58: {
                if(v4 == 0) {
                    v10 = ArrayDecoders.L(arr_b, v, arrayDecoders$Registers0);
                    unsafe0.putObject(object0, v7, Boolean.valueOf(arrayDecoders$Registers0.b != 0L));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 59: {
                if(v4 == 2) {
                    v10 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
                    int v11 = arrayDecoders$Registers0.a;
                    if(v11 == 0) {
                        unsafe0.putObject(object0, v7, "");
                    }
                    else {
                        if((v5 & 0x20000000) != 0 && !Utf8.u(arr_b, v10, v10 + v11)) {
                            throw InvalidProtocolBufferException.d();
                        }
                        unsafe0.putObject(object0, v7, new String(arr_b, v10, v11, Internal.a));
                        v10 += v11;
                    }
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 60: {
                if(v4 == 2) {
                    v10 = ArrayDecoders.p(this.o(v8), arr_b, v, v1, arrayDecoders$Registers0);
                    Object object1 = unsafe0.getInt(object0, v9) == v3 ? unsafe0.getObject(object0, v7) : null;
                    if(object1 == null) {
                        unsafe0.putObject(object0, v7, arrayDecoders$Registers0.c);
                    }
                    else {
                        unsafe0.putObject(object0, v7, Internal.v(object1, arrayDecoders$Registers0.c));
                    }
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 61: {
                if(v4 == 2) {
                    v10 = ArrayDecoders.b(arr_b, v, arrayDecoders$Registers0);
                    unsafe0.putObject(object0, v7, arrayDecoders$Registers0.c);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 55: 
            case 62: {
                if(v4 == 0) {
                    v10 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
                    unsafe0.putObject(object0, v7, arrayDecoders$Registers0.a);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 0x3F: {
                if(v4 == 0) {
                    int v12 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
                    int v13 = arrayDecoders$Registers0.a;
                    EnumVerifier internal$EnumVerifier0 = this.m(v8);
                    if(internal$EnumVerifier0 != null && !internal$EnumVerifier0.isInRange(v13)) {
                        MessageSchema.p(object0).r(v2, ((long)v13));
                        return v12;
                    }
                    unsafe0.putObject(object0, v7, v13);
                    unsafe0.putInt(object0, v9, v3);
                    return v12;
                }
                break;
            }
            case 57: 
            case 0x40: {
                if(v4 == 5) {
                    unsafe0.putObject(object0, v7, ArrayDecoders.h(arr_b, v));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 4;
                }
                break;
            }
            case 56: 
            case 65: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, ArrayDecoders.j(arr_b, v));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 8;
                }
                break;
            }
            case 66: {
                if(v4 == 0) {
                    v10 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
                    unsafe0.putObject(object0, v7, ((int)(-(arrayDecoders$Registers0.a & 1) ^ arrayDecoders$Registers0.a >>> 1)));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 67: {
                if(v4 == 0) {
                    v10 = ArrayDecoders.L(arr_b, v, arrayDecoders$Registers0);
                    unsafe0.putObject(object0, v7, ((long)(-(arrayDecoders$Registers0.b & 1L) ^ arrayDecoders$Registers0.b >>> 1)));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 68: {
                if(v4 == 3) {
                    v10 = ArrayDecoders.n(this.o(v8), arr_b, v, v1, v2 & -8 | 4, arrayDecoders$Registers0);
                    Object object2 = unsafe0.getInt(object0, v9) == v3 ? unsafe0.getObject(object0, v7) : null;
                    if(object2 == null) {
                        unsafe0.putObject(object0, v7, arrayDecoders$Registers0.c);
                    }
                    else {
                        unsafe0.putObject(object0, v7, Internal.v(object2, arrayDecoders$Registers0.c));
                    }
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            default: {
                return v;
            }
        }
        return v;
    }

    int X(Object object0, byte[] arr_b, int v, int v1, int v2, Registers arrayDecoders$Registers0) throws IOException {
        int v32;
        int v31;
        int v26;
        int v25;
        int v28;
        int v27;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v11;
        int v10;
        Unsafe unsafe0 = MessageSchema.z;
        int v3 = v;
        int v4 = -1;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = -1;
        while(v3 < v1) {
            int v9 = arr_b[v3];
            if(v9 < 0) {
                v10 = ArrayDecoders.H(v9, arr_b, v3 + 1, arrayDecoders$Registers0);
                v11 = arrayDecoders$Registers0.a;
            }
            else {
                v11 = v9;
                v10 = v3 + 1;
            }
            int v12 = v11 >>> 3;
            int v13 = v12 <= v4 ? this.a0(v12) : this.b0(v12, v5 / 3);
            if(v13 == -1) {
                v14 = v10;
                v15 = v12;
                v16 = v11;
                v17 = v7;
                v18 = 0;
            }
            else {
                int v19 = this.a[v13 + 1];
                int v20 = (v19 & 0xFF00000) >>> 20;
                long v21 = (long)(v19 & 0xFFFFF);
                if(v20 <= 17) {
                    int v22 = this.a[v13 + 2];
                    int v23 = 1 << (v22 >>> 20);
                    int v24 = v22 & 0xFFFFF;
                    if(v24 != v8) {
                        if(v8 != -1) {
                            unsafe0.putInt(object0, ((long)v8), v7);
                        }
                        v7 = unsafe0.getInt(object0, ((long)v24));
                        v8 = v24;
                    }
                    switch(v20) {
                        case 0: {
                            v25 = v13;
                            v15 = v12;
                            v26 = v11;
                            if((v11 & 7) == 1) {
                                UnsafeUtil.g0(object0, v21, ArrayDecoders.d(arr_b, v10));
                                v3 = v10 + 8;
                                goto label_86;
                            }
                            break;
                        }
                        case 1: {
                            v25 = v13;
                            v15 = v12;
                            v26 = v11;
                            if((v11 & 7) == 5) {
                                UnsafeUtil.i0(object0, v21, ArrayDecoders.l(arr_b, v10));
                                v3 = v10 + 4;
                                goto label_86;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            v25 = v13;
                            v15 = v12;
                            v26 = v11;
                            if((v11 & 7) == 0) {
                                v27 = ArrayDecoders.L(arr_b, v10, arrayDecoders$Registers0);
                                unsafe0.putLong(object0, v21, arrayDecoders$Registers0.b);
                                v7 |= v23;
                                v6 = v26;
                                v5 = v25;
                                v3 = v27;
                                v4 = v15;
                                continue;
                            }
                            break;
                        }
                        case 7: {
                            v25 = v13;
                            v15 = v12;
                            v26 = v11;
                            if((v11 & 7) == 0) {
                                v3 = ArrayDecoders.L(arr_b, v10, arrayDecoders$Registers0);
                                UnsafeUtil.X(object0, v21, arrayDecoders$Registers0.b != 0L);
                            label_97:
                                v7 |= v23;
                                v6 = v26;
                                v5 = v25;
                                v4 = v15;
                                continue;
                            }
                            break;
                        }
                        case 8: {
                            v25 = v13;
                            v15 = v12;
                            v26 = v11;
                            if((v11 & 7) == 2) {
                                v3 = (0x20000000 & v19) == 0 ? ArrayDecoders.C(arr_b, v10, arrayDecoders$Registers0) : ArrayDecoders.F(arr_b, v10, arrayDecoders$Registers0);
                                unsafe0.putObject(object0, v21, arrayDecoders$Registers0.c);
                                v7 |= v23;
                                v6 = v26;
                                v5 = v25;
                                v4 = v15;
                                continue;
                            }
                            break;
                        }
                        case 9: {
                            v25 = v13;
                            v15 = v12;
                            if((v11 & 7) == 2) {
                                v28 = ArrayDecoders.p(this.o(v25), arr_b, v10, v1, arrayDecoders$Registers0);
                                if((v7 & v23) == 0) {
                                    unsafe0.putObject(object0, v21, arrayDecoders$Registers0.c);
                                }
                                else {
                                    unsafe0.putObject(object0, v21, Internal.v(unsafe0.getObject(object0, v21), arrayDecoders$Registers0.c));
                                }
                                goto label_134;
                            }
                            v26 = v11;
                            break;
                        }
                        case 10: {
                            v25 = v13;
                            v15 = v12;
                            if((v11 & 7) == 2) {
                                v28 = ArrayDecoders.b(arr_b, v10, arrayDecoders$Registers0);
                                unsafe0.putObject(object0, v21, arrayDecoders$Registers0.c);
                                goto label_134;
                            }
                            v26 = v11;
                            break;
                        }
                        case 4: 
                        case 11: {
                            v25 = v13;
                            v15 = v12;
                            v26 = v11;
                            if((v11 & 7) == 0) {
                                v3 = ArrayDecoders.I(arr_b, v10, arrayDecoders$Registers0);
                                unsafe0.putInt(object0, v21, arrayDecoders$Registers0.a);
                                goto label_97;
                            }
                            break;
                        }
                        case 12: {
                            v25 = v13;
                            v15 = v12;
                            if((v11 & 7) == 0) {
                                v28 = ArrayDecoders.I(arr_b, v10, arrayDecoders$Registers0);
                                int v29 = arrayDecoders$Registers0.a;
                                EnumVerifier internal$EnumVerifier0 = this.m(v25);
                                if(internal$EnumVerifier0 == null || internal$EnumVerifier0.isInRange(v29)) {
                                    unsafe0.putInt(object0, v21, v29);
                                }
                                else {
                                    MessageSchema.p(object0).r(v11, ((long)v29));
                                    goto label_135;
                                }
                            label_134:
                                v7 |= v23;
                            label_135:
                                v3 = v28;
                                v6 = v11;
                                v5 = v25;
                                v4 = v15;
                                continue;
                            }
                            v26 = v11;
                            break;
                        }
                        case 6: 
                        case 13: {
                            v25 = v13;
                            v15 = v12;
                            v26 = v11;
                            if((v11 & 7) == 5) {
                                unsafe0.putInt(object0, v21, ArrayDecoders.h(arr_b, v10));
                                v3 = v10 + 4;
                            label_86:
                                v7 |= v23;
                                v6 = v26;
                                v4 = v15;
                                v5 = v25;
                                continue;
                            }
                            break;
                        }
                        case 5: 
                        case 14: {
                            v25 = v13;
                            v15 = v12;
                            v26 = v11;
                            if((v11 & 7) == 1) {
                                unsafe0.putLong(object0, v21, ArrayDecoders.j(arr_b, v10));
                                v3 = v10 + 8;
                                goto label_97;
                            }
                            break;
                        }
                        case 15: {
                            v25 = v13;
                            v15 = v12;
                            if((v11 & 7) == 0) {
                                v28 = ArrayDecoders.I(arr_b, v10, arrayDecoders$Registers0);
                                unsafe0.putInt(object0, v21, -(arrayDecoders$Registers0.a & 1) ^ arrayDecoders$Registers0.a >>> 1);
                                v7 |= v23;
                                v3 = v28;
                                v6 = v11;
                                v5 = v25;
                                v4 = v15;
                                continue;
                            }
                            else {
                                v26 = v11;
                                break;
                            }
                            goto label_154;
                        }
                        case 16: {
                        label_154:
                            v25 = v13;
                            v15 = v12;
                            if((v11 & 7) == 0) {
                                v27 = ArrayDecoders.L(arr_b, v10, arrayDecoders$Registers0);
                                unsafe0.putLong(object0, v21, -(arrayDecoders$Registers0.b & 1L) ^ arrayDecoders$Registers0.b >>> 1);
                                v7 |= v23;
                                v6 = v11;
                                v5 = v25;
                                v3 = v27;
                                v4 = v15;
                                continue;
                            }
                            else {
                                v26 = v11;
                                break;
                            }
                            goto label_167;
                        }
                        case 17: {
                        label_167:
                            if((v11 & 7) == 3) {
                                v3 = ArrayDecoders.n(this.o(v13), arr_b, v10, v1, v12 << 3 | 4, arrayDecoders$Registers0);
                                if((v7 & v23) == 0) {
                                    unsafe0.putObject(object0, v21, arrayDecoders$Registers0.c);
                                }
                                else {
                                    unsafe0.putObject(object0, v21, Internal.v(unsafe0.getObject(object0, v21), arrayDecoders$Registers0.c));
                                }
                                v7 |= v23;
                                v6 = v11;
                                v5 = v13;
                                v4 = v12;
                                continue;
                            }
                            else {
                                v25 = v13;
                                v15 = v12;
                                v26 = v11;
                            }
                            break;
                        }
                        default: {
                            v25 = v13;
                            v15 = v12;
                            v26 = v11;
                        }
                    }
                    v16 = v26;
                    v14 = v10;
                    v17 = v7;
                    v18 = v25;
                }
                else {
                    v15 = v12;
                    if(v20 == 27) {
                        if((v11 & 7) == 2) {
                            ProtobufList internal$ProtobufList0 = (ProtobufList)unsafe0.getObject(object0, v21);
                            if(!internal$ProtobufList0.isModifiable()) {
                                int v30 = internal$ProtobufList0.size();
                                internal$ProtobufList0 = internal$ProtobufList0.mutableCopyWithCapacity((v30 == 0 ? 10 : v30 * 2));
                                unsafe0.putObject(object0, v21, internal$ProtobufList0);
                            }
                            v3 = ArrayDecoders.q(this.o(v13), v11, arr_b, v10, v1, internal$ProtobufList0, arrayDecoders$Registers0);
                            v6 = v11;
                            v5 = v13;
                            v4 = v15;
                            continue;
                        }
                        else {
                            v31 = v11;
                            v17 = v7;
                            v32 = v8;
                            v18 = v13;
                            v14 = v10;
                            goto label_233;
                        }
                        goto label_205;
                    }
                    else {
                    label_205:
                        if(v20 <= 49) {
                            v17 = v7;
                            v32 = v8;
                            v31 = v11;
                            v18 = v13;
                            v3 = this.Z(object0, arr_b, v10, v1, v11, v15, v11 & 7, v13, ((long)v19), v20, v21, arrayDecoders$Registers0);
                            if(v3 != v10) {
                                goto label_226;
                            }
                        }
                        else {
                            v17 = v7;
                            v32 = v8;
                            v31 = v11;
                            v18 = v13;
                            if(v20 != 50) {
                                v3 = this.W(object0, arr_b, v10, v1, v31, v15, v11 & 7, v19, v20, v21, v18, arrayDecoders$Registers0);
                                if(v3 != v10) {
                                label_226:
                                    v6 = v31;
                                    v5 = v18;
                                    v7 = v17;
                                    v4 = v15;
                                    v8 = v32;
                                    continue;
                                }
                            }
                            else if((v11 & 7) == 2) {
                                v3 = this.V(object0, arr_b, v10, v1, v18, v21, arrayDecoders$Registers0);
                                if(v3 != v10) {
                                    goto label_226;
                                }
                            }
                            else {
                                v14 = v10;
                                goto label_233;
                            }
                        }
                        v14 = v3;
                    }
                label_233:
                    v16 = v31;
                    v8 = v32;
                }
            }
            if(v16 == v2 && v2 != 0) {
                v3 = v14;
                v6 = v16;
                v7 = v17;
                break;
            }
            if(this.f) {
                ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.d();
                if(arrayDecoders$Registers0.d != extensionRegistryLite0) {
                    v3 = ArrayDecoders.g(v16, arr_b, v14, v1, object0, this.e, this.o, arrayDecoders$Registers0);
                }
            }
            else {
                v3 = ArrayDecoders.G(v16, arr_b, v14, v1, MessageSchema.p(object0), arrayDecoders$Registers0);
            }
            v6 = v16;
            v5 = v18;
            v7 = v17;
            v4 = v15;
        }
        if(v8 != -1) {
            unsafe0.putInt(object0, ((long)v8), v7);
        }
        int v33 = this.k;
        UnknownFieldSetLite unknownFieldSetLite0 = null;
        while(v33 < this.l) {
            unknownFieldSetLite0 = (UnknownFieldSetLite)this.j(object0, this.j[v33], unknownFieldSetLite0, this.o);
            ++v33;
        }
        if(unknownFieldSetLite0 != null) {
            this.o.o(object0, unknownFieldSetLite0);
        }
        if(v2 == 0) {
            if(v3 != v1) {
                throw InvalidProtocolBufferException.h();
            }
            return v3;
        }
        if(v3 > v1 || v6 != v2) {
            throw InvalidProtocolBufferException.h();
        }
        return v3;
    }

    private int Y(Object object0, byte[] arr_b, int v, int v1, Registers arrayDecoders$Registers0) throws IOException {
        int v17;
        int v15;
        int v14;
        int v10;
        int v9;
        int v7;
        int v6;
        Unsafe unsafe0 = MessageSchema.z;
        int v2 = v;
        int v3 = -1;
        int v4 = 0;
        while(v2 < v1) {
            int v5 = arr_b[v2];
            if(v5 < 0) {
                v6 = ArrayDecoders.H(v5, arr_b, v2 + 1, arrayDecoders$Registers0);
                v7 = arrayDecoders$Registers0.a;
            }
            else {
                v7 = v5;
                v6 = v2 + 1;
            }
            int v8 = v7 >>> 3 <= v3 ? this.a0(v7 >>> 3) : this.b0(v7 >>> 3, v4 / 3);
            if(v8 == -1) {
                v9 = v7 >>> 3;
                v10 = 0;
                v2 = ArrayDecoders.G(v7, arr_b, v6, v1, MessageSchema.p(object0), arrayDecoders$Registers0);
            }
            else {
                int v11 = this.a[v8 + 1];
                int v12 = (v11 & 0xFF00000) >>> 20;
                long v13 = (long)(v11 & 0xFFFFF);
                if(v12 <= 17) {
                    boolean z = true;
                    switch(v12) {
                        case 0: {
                            v14 = v8;
                            if((v7 & 7) == 1) {
                                UnsafeUtil.g0(object0, v13, ArrayDecoders.d(arr_b, v6));
                                v2 = v6 + 8;
                                v3 = v7 >>> 3;
                                v4 = v14;
                                continue;
                            }
                            v9 = v7 >>> 3;
                            v17 = v6;
                            v10 = v14;
                            goto label_136;
                        }
                        case 1: {
                            v14 = v8;
                            if((v7 & 7) == 5) {
                                UnsafeUtil.i0(object0, v13, ArrayDecoders.l(arr_b, v6));
                                v2 = v6 + 4;
                                v3 = v7 >>> 3;
                                v4 = v14;
                                continue;
                            }
                            v9 = v7 >>> 3;
                            v17 = v6;
                            v10 = v14;
                            goto label_136;
                        }
                        case 2: 
                        case 3: {
                            v14 = v8;
                            if((v7 & 7) == 0) {
                                v15 = ArrayDecoders.L(arr_b, v6, arrayDecoders$Registers0);
                                unsafe0.putLong(object0, v13, arrayDecoders$Registers0.b);
                                v2 = v15;
                                v3 = v7 >>> 3;
                                v4 = v14;
                                continue;
                            }
                            v9 = v7 >>> 3;
                            v17 = v6;
                            v10 = v14;
                            goto label_136;
                        }
                        case 7: {
                        label_66:
                            if((v7 & 7) == 0) {
                                int v16 = ArrayDecoders.L(arr_b, v6, arrayDecoders$Registers0);
                                if(arrayDecoders$Registers0.b == 0L) {
                                    z = false;
                                }
                                UnsafeUtil.X(object0, v13, z);
                                v2 = v16;
                                v4 = v8;
                                v3 = v7 >>> 3;
                                continue;
                            }
                            else {
                                goto label_133;
                            }
                            goto label_75;
                        }
                        case 8: {
                        label_75:
                            if((v7 & 7) == 2) {
                                v2 = (0x20000000 & v11) == 0 ? ArrayDecoders.C(arr_b, v6, arrayDecoders$Registers0) : ArrayDecoders.F(arr_b, v6, arrayDecoders$Registers0);
                                unsafe0.putObject(object0, v13, arrayDecoders$Registers0.c);
                                v4 = v8;
                                v3 = v7 >>> 3;
                                continue;
                            }
                            else {
                                goto label_133;
                            }
                            goto label_81;
                        }
                        case 9: {
                        label_81:
                            if((v7 & 7) == 2) {
                                v2 = ArrayDecoders.p(this.o(v8), arr_b, v6, v1, arrayDecoders$Registers0);
                                Object object1 = unsafe0.getObject(object0, v13);
                                if(object1 == null) {
                                    unsafe0.putObject(object0, v13, arrayDecoders$Registers0.c);
                                }
                                else {
                                    unsafe0.putObject(object0, v13, Internal.v(object1, arrayDecoders$Registers0.c));
                                }
                                v4 = v8;
                                v3 = v7 >>> 3;
                                continue;
                            }
                            else {
                                goto label_133;
                            }
                            goto label_91;
                        }
                        case 10: {
                        label_91:
                            if((v7 & 7) == 2) {
                                v2 = ArrayDecoders.b(arr_b, v6, arrayDecoders$Registers0);
                                unsafe0.putObject(object0, v13, arrayDecoders$Registers0.c);
                                v4 = v8;
                                v3 = v7 >>> 3;
                                continue;
                            }
                            else {
                                goto label_133;
                            }
                            goto label_97;
                        }
                        case 4: 
                        case 11: {
                            v14 = v8;
                            if((v7 & 7) == 0) {
                                v2 = ArrayDecoders.I(arr_b, v6, arrayDecoders$Registers0);
                                unsafe0.putInt(object0, v13, arrayDecoders$Registers0.a);
                                v3 = v7 >>> 3;
                                v4 = v14;
                                continue;
                            }
                            v9 = v7 >>> 3;
                            v17 = v6;
                            v10 = v14;
                            goto label_136;
                        }
                        case 12: {
                        label_97:
                            v14 = v8;
                            if((v7 & 7) == 0) {
                                v2 = ArrayDecoders.I(arr_b, v6, arrayDecoders$Registers0);
                                unsafe0.putInt(object0, v13, arrayDecoders$Registers0.a);
                                v3 = v7 >>> 3;
                                v4 = v14;
                                continue;
                            }
                            v9 = v7 >>> 3;
                            v17 = v6;
                            v10 = v14;
                            goto label_136;
                        }
                        case 6: 
                        case 13: {
                        label_60:
                            if((v7 & 7) == 5) {
                                unsafe0.putInt(object0, v13, ArrayDecoders.h(arr_b, v6));
                                v2 = v6 + 4;
                                v4 = v8;
                                v3 = v7 >>> 3;
                                continue;
                            }
                            else {
                                goto label_133;
                            }
                            goto label_66;
                        }
                        case 5: 
                        case 14: {
                            if((v7 & 7) == 1) {
                                unsafe0.putLong(object0, v13, ArrayDecoders.j(arr_b, v6));
                                v2 = v6 + 8;
                                v3 = v7 >>> 3;
                                v4 = v8;
                                continue;
                            }
                            else {
                                goto label_133;
                            }
                            goto label_60;
                        }
                        case 15: {
                            v14 = v8;
                            if((v7 & 7) == 0) {
                                v2 = ArrayDecoders.I(arr_b, v6, arrayDecoders$Registers0);
                                unsafe0.putInt(object0, v13, -(arrayDecoders$Registers0.a & 1) ^ arrayDecoders$Registers0.a >>> 1);
                                v3 = v7 >>> 3;
                                v4 = v14;
                                continue;
                            }
                            v9 = v7 >>> 3;
                            v17 = v6;
                            v10 = v14;
                            goto label_136;
                        }
                        case 16: {
                            if((v7 & 7) == 0) {
                                v15 = ArrayDecoders.L(arr_b, v6, arrayDecoders$Registers0);
                                unsafe0.putLong(object0, v13, -(arrayDecoders$Registers0.b & 1L) ^ arrayDecoders$Registers0.b >>> 1);
                                v2 = v15;
                                v3 = v7 >>> 3;
                                v4 = v8;
                                continue;
                            }
                            else {
                                goto label_133;
                            }
                            goto label_122;
                        }
                        default: {
                            goto label_133;
                        }
                    }
                }
                else {
                label_122:
                    if(v12 == 27) {
                        if((v7 & 7) == 2) {
                            ProtobufList internal$ProtobufList0 = (ProtobufList)unsafe0.getObject(object0, v13);
                            if(!internal$ProtobufList0.isModifiable()) {
                                int v18 = internal$ProtobufList0.size();
                                internal$ProtobufList0 = internal$ProtobufList0.mutableCopyWithCapacity((v18 == 0 ? 10 : v18 * 2));
                                unsafe0.putObject(object0, v13, internal$ProtobufList0);
                            }
                            v2 = ArrayDecoders.q(this.o(v8), v7, arr_b, v6, v1, internal$ProtobufList0, arrayDecoders$Registers0);
                            v3 = v7 >>> 3;
                            v4 = v8;
                            continue;
                        }
                    label_133:
                        v10 = v8;
                        v9 = v7 >>> 3;
                        v17 = v6;
                    label_136:
                        v2 = ArrayDecoders.G(v7, arr_b, v17, v1, MessageSchema.p(object0), arrayDecoders$Registers0);
                    }
                    else {
                        v10 = v8;
                        if(v12 <= 49) {
                            v9 = v7 >>> 3;
                            v2 = this.Z(object0, arr_b, v6, v1, v7, v7 >>> 3, v7 & 7, v10, ((long)v11), v12, v13, arrayDecoders$Registers0);
                            if(v2 == v6) {
                                v2 = ArrayDecoders.G(v7, arr_b, v2, v1, MessageSchema.p(object0), arrayDecoders$Registers0);
                            }
                        }
                        else {
                            v9 = v7 >>> 3;
                            if(v12 != 50) {
                                v2 = this.W(object0, arr_b, v6, v1, v7, v9, v7 & 7, v11, v12, v13, v10, arrayDecoders$Registers0);
                                if(v2 == v6) {
                                    v2 = ArrayDecoders.G(v7, arr_b, v2, v1, MessageSchema.p(object0), arrayDecoders$Registers0);
                                }
                            }
                            else if((v7 & 7) == 2) {
                                v2 = this.V(object0, arr_b, v6, v1, v10, v13, arrayDecoders$Registers0);
                                if(v2 == v6) {
                                    v2 = ArrayDecoders.G(v7, arr_b, v2, v1, MessageSchema.p(object0), arrayDecoders$Registers0);
                                }
                            }
                            else {
                                v2 = ArrayDecoders.G(v7, arr_b, v6, v1, MessageSchema.p(object0), arrayDecoders$Registers0);
                            }
                        }
                    }
                }
            }
            v4 = v10;
            v3 = v9;
        }
        if(v2 != v1) {
            throw InvalidProtocolBufferException.h();
        }
        return v2;
    }

    private int Z(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, long v6, int v7, long v8, Registers arrayDecoders$Registers0) throws IOException {
        int v10;
        Unsafe unsafe0 = MessageSchema.z;
        ProtobufList internal$ProtobufList0 = (ProtobufList)unsafe0.getObject(object0, v8);
        if(!internal$ProtobufList0.isModifiable()) {
            int v9 = internal$ProtobufList0.size();
            internal$ProtobufList0 = internal$ProtobufList0.mutableCopyWithCapacity((v9 == 0 ? 10 : v9 * 2));
            unsafe0.putObject(object0, v8, internal$ProtobufList0);
        }
        switch(v7) {
            case 26: {
                if(v4 == 2) {
                    return (v6 & 0x20000000L) == 0L ? ArrayDecoders.D(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : ArrayDecoders.E(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                break;
            }
            case 27: {
                return v4 == 2 ? ArrayDecoders.q(this.o(v5), v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            case 28: {
                return v4 == 2 ? ArrayDecoders.c(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            case 18: 
            case 35: {
                if(v4 == 2) {
                    return ArrayDecoders.s(arr_b, v, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                return v4 == 1 ? ArrayDecoders.e(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            case 19: 
            case 36: {
                if(v4 == 2) {
                    return ArrayDecoders.v(arr_b, v, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                return v4 == 5 ? ArrayDecoders.m(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            case 20: 
            case 21: 
            case 37: 
            case 38: {
                if(v4 == 2) {
                    return ArrayDecoders.z(arr_b, v, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                return v4 == 0 ? ArrayDecoders.M(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            case 25: 
            case 42: {
                if(v4 == 2) {
                    return ArrayDecoders.r(arr_b, v, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                return v4 == 0 ? ArrayDecoders.a(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            case 22: 
            case 29: 
            case 39: 
            case 43: {
                if(v4 == 2) {
                    return ArrayDecoders.y(arr_b, v, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                return v4 == 0 ? ArrayDecoders.J(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            case 30: 
            case 44: {
                if(v4 == 2) {
                    v10 = ArrayDecoders.y(arr_b, v, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                else if(v4 == 0) {
                    v10 = ArrayDecoders.J(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                else {
                    break;
                }
                UnknownFieldSetLite unknownFieldSetLite0 = ((GeneratedMessageLite)object0).unknownFields;
                if(unknownFieldSetLite0 == UnknownFieldSetLite.e()) {
                    unknownFieldSetLite0 = null;
                }
                UnknownFieldSetLite unknownFieldSetLite1 = (UnknownFieldSetLite)SchemaUtil.C(v3, internal$ProtobufList0, this.m(v5), unknownFieldSetLite0, this.o);
                if(unknownFieldSetLite1 != null) {
                    ((GeneratedMessageLite)object0).unknownFields = unknownFieldSetLite1;
                }
                return v10;
            }
            case 24: 
            case 0x1F: 
            case 41: 
            case 45: {
                if(v4 == 2) {
                    return ArrayDecoders.t(arr_b, v, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                return v4 == 5 ? ArrayDecoders.i(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            case 23: 
            case 0x20: 
            case 40: 
            case 46: {
                if(v4 == 2) {
                    return ArrayDecoders.u(arr_b, v, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                return v4 == 1 ? ArrayDecoders.k(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            case 33: 
            case 0x2F: {
                if(v4 == 2) {
                    return ArrayDecoders.w(arr_b, v, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                return v4 == 0 ? ArrayDecoders.A(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            case 34: 
            case 0x30: {
                if(v4 == 2) {
                    return ArrayDecoders.x(arr_b, v, internal$ProtobufList0, arrayDecoders$Registers0);
                }
                return v4 == 0 ? ArrayDecoders.B(v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            case 49: {
                return v4 == 3 ? ArrayDecoders.o(this.o(v5), v2, arr_b, v, v1, internal$ProtobufList0, arrayDecoders$Registers0) : v;
            }
            default: {
                return v;
            }
        }
        return v;
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public void a(Object object0, Writer writer0) throws IOException {
        if(writer0.fieldOrder() == FieldOrder.b) {
            this.q0(object0, writer0);
            return;
        }
        if(this.h) {
            this.p0(object0, writer0);
            return;
        }
        this.o0(object0, writer0);
    }

    private int a0(int v) {
        return v < this.c || v > this.d ? -1 : this.k0(v, 0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public void b(Object object0, Reader reader0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        extensionRegistryLite0.getClass();
        this.G(this.o, this.p, object0, reader0, extensionRegistryLite0);
    }

    private int b0(int v, int v1) {
        return v < this.c || v > this.d ? -1 : this.k0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public void c(Object object0, byte[] arr_b, int v, int v1, Registers arrayDecoders$Registers0) throws IOException {
        if(this.h) {
            this.Y(object0, arr_b, v, v1, arrayDecoders$Registers0);
            return;
        }
        this.X(object0, arr_b, v, v1, 0, arrayDecoders$Registers0);
    }

    private int c0(int v) {
        return this.a[v + 2];
    }

    private boolean d(Object object0, Object object1, int v) {
        return this.w(object0, v) == this.w(object1, v);
    }

    private void d0(Object object0, long v, Reader reader0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        reader0.i(this.n.e(object0, v), schema0, extensionRegistryLite0);
    }

    private static boolean e(Object object0, long v) {
        return UnsafeUtil.u(object0, v);
    }

    private void e0(Object object0, int v, Reader reader0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        reader0.e(this.n.e(object0, ((long)(v & 0xFFFFF))), schema0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(Object object0, Object object1) {
        for(int v = 0; v < this.a.length; v += 3) {
            if(!this.i(object0, object1, v)) {
                return false;
            }
        }
        if(!this.o.g(object0).equals(this.o.g(object1))) {
            return false;
        }
        return this.f ? this.p.c(object0).equals(this.p.c(object1)) : true;
    }

    private int f(byte[] arr_b, int v, int v1, Metadata mapEntryLite$Metadata0, Map map0, Registers arrayDecoders$Registers0) throws IOException {
        int v6;
        int v2 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
        int v3 = arrayDecoders$Registers0.a;
        if(v3 < 0 || v3 > v1 - v2) {
            throw InvalidProtocolBufferException.l();
        }
        int v4 = v2 + v3;
        Object object0 = mapEntryLite$Metadata0.b;
        Object object1 = mapEntryLite$Metadata0.d;
        while(v2 < v4) {
            int v5 = arr_b[v2];
            if(v5 < 0) {
                v6 = ArrayDecoders.H(v5, arr_b, v2 + 1, arrayDecoders$Registers0);
                v5 = arrayDecoders$Registers0.a;
            }
            else {
                v6 = v2 + 1;
            }
            switch(v5 >>> 3) {
                case 1: {
                    if((v5 & 7) == mapEntryLite$Metadata0.a.b()) {
                        v2 = this.g(arr_b, v6, v1, mapEntryLite$Metadata0.a, null, arrayDecoders$Registers0);
                        object0 = arrayDecoders$Registers0.c;
                        continue;
                    }
                    break;
                }
                case 2: {
                    if((v5 & 7) == mapEntryLite$Metadata0.c.b()) {
                        Class class0 = mapEntryLite$Metadata0.d.getClass();
                        v2 = this.g(arr_b, v6, v1, mapEntryLite$Metadata0.c, class0, arrayDecoders$Registers0);
                        object1 = arrayDecoders$Registers0.c;
                        continue;
                    }
                }
            }
            v2 = ArrayDecoders.N(v5, arr_b, v6, v1, arrayDecoders$Registers0);
        }
        if(v2 != v4) {
            throw InvalidProtocolBufferException.h();
        }
        map0.put(object0, object1);
        return v4;
    }

    private void f0(Object object0, int v, Reader reader0) throws IOException {
        if(MessageSchema.v(v)) {
            UnsafeUtil.q0(object0, ((long)(v & 0xFFFFF)), reader0.readStringRequireUtf8());
            return;
        }
        if(this.g) {
            UnsafeUtil.q0(object0, ((long)(v & 0xFFFFF)), reader0.readString());
            return;
        }
        UnsafeUtil.q0(object0, ((long)(v & 0xFFFFF)), reader0.readBytes());
    }

    private int g(byte[] arr_b, int v, int v1, androidx.datastore.preferences.protobuf.WireFormat.FieldType wireFormat$FieldType0, Class class0, Registers arrayDecoders$Registers0) throws IOException {
        int v2;
        switch(wireFormat$FieldType0) {
            case 1: {
                v2 = ArrayDecoders.L(arr_b, v, arrayDecoders$Registers0);
                arrayDecoders$Registers0.c = Boolean.valueOf(arrayDecoders$Registers0.b != 0L);
                return v2;
            }
            case 2: {
                return ArrayDecoders.b(arr_b, v, arrayDecoders$Registers0);
            }
            case 3: {
                arrayDecoders$Registers0.c = ArrayDecoders.d(arr_b, v);
                return v + 8;
            }
            case 4: 
            case 5: {
                arrayDecoders$Registers0.c = ArrayDecoders.h(arr_b, v);
                return v + 4;
            }
            case 6: 
            case 7: {
                arrayDecoders$Registers0.c = ArrayDecoders.j(arr_b, v);
                return v + 8;
            }
            case 8: {
                arrayDecoders$Registers0.c = ArrayDecoders.l(arr_b, v);
                return v + 4;
            }
            case 9: 
            case 10: 
            case 11: {
                v2 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
                arrayDecoders$Registers0.c = arrayDecoders$Registers0.a;
                return v2;
            }
            case 12: 
            case 13: {
                v2 = ArrayDecoders.L(arr_b, v, arrayDecoders$Registers0);
                arrayDecoders$Registers0.c = arrayDecoders$Registers0.b;
                return v2;
            }
            case 14: {
                return ArrayDecoders.p(Protobuf.a().i(class0), arr_b, v, v1, arrayDecoders$Registers0);
            }
            case 15: {
                v2 = ArrayDecoders.I(arr_b, v, arrayDecoders$Registers0);
                arrayDecoders$Registers0.c = (int)(-(arrayDecoders$Registers0.a & 1) ^ arrayDecoders$Registers0.a >>> 1);
                return v2;
            }
            case 16: {
                v2 = ArrayDecoders.L(arr_b, v, arrayDecoders$Registers0);
                arrayDecoders$Registers0.c = (long)(-(arrayDecoders$Registers0.b & 1L) ^ arrayDecoders$Registers0.b >>> 1);
                return v2;
            }
            case 17: {
                return ArrayDecoders.F(arr_b, v, arrayDecoders$Registers0);
            }
            default: {
                throw new RuntimeException("unsupported field type.");
            }
        }
    }

    private void g0(Object object0, int v, Reader reader0) throws IOException {
        if(MessageSchema.v(v)) {
            reader0.readStringListRequireUtf8(this.n.e(object0, ((long)(v & 0xFFFFF))));
            return;
        }
        reader0.readStringList(this.n.e(object0, ((long)(v & 0xFFFFF))));
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(Object object0) {
        return this.h ? this.s(object0) : this.r(object0);
    }

    private static double h(Object object0, long v) {
        return UnsafeUtil.D(object0, v);
    }

    private static Field h0(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(NoSuchFieldException unused_ex) {
            Field[] arr_field = class0.getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(s.equals(field0.getName())) {
                    return field0;
                }
            }
            throw new RuntimeException("Field " + s + " for " + class0.getName() + " not found. Known fields are " + Arrays.toString(arr_field));
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(Object object0) {
        int v7;
        int v6;
        int v1 = 0;
        for(int v = 0; v < this.a.length; v += 3) {
            int v2 = this.n0(v);
            int v3 = this.O(v);
            long v4 = (long)(v2 & 0xFFFFF);
            int v5 = 37;
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    v6 = v1 * 53;
                    v7 = Internal.s(Double.doubleToLongBits(UnsafeUtil.D(object0, v4)));
                    v1 = v6 + v7;
                    break;
                }
                case 1: {
                    v6 = v1 * 53;
                    v7 = Float.floatToIntBits(UnsafeUtil.F(object0, v4));
                    v1 = v6 + v7;
                    break;
                }
                case 2: {
                    v1 = v1 * 53 + Internal.s(UnsafeUtil.L(object0, v4));
                    break;
                }
                case 3: {
                    v1 = v1 * 53 + Internal.s(UnsafeUtil.L(object0, v4));
                    break;
                }
                case 4: {
                    v1 = v1 * 53 + UnsafeUtil.I(object0, v4);
                    break;
                }
                case 5: {
                    v1 = v1 * 53 + Internal.s(UnsafeUtil.L(object0, v4));
                    break;
                }
                case 6: {
                    v1 = v1 * 53 + UnsafeUtil.I(object0, v4);
                    break;
                }
                case 7: {
                    v1 = v1 * 53 + Internal.k(UnsafeUtil.u(object0, v4));
                    break;
                }
                case 8: {
                    v1 = v1 * 53 + ((String)UnsafeUtil.O(object0, v4)).hashCode();
                    break;
                }
                case 9: {
                    Object object1 = UnsafeUtil.O(object0, v4);
                    if(object1 != null) {
                        v5 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 10: {
                    v1 = v1 * 53 + UnsafeUtil.O(object0, v4).hashCode();
                    break;
                }
                case 11: {
                    v1 = v1 * 53 + UnsafeUtil.I(object0, v4);
                    break;
                }
                case 12: {
                    v1 = v1 * 53 + UnsafeUtil.I(object0, v4);
                    break;
                }
                case 13: {
                    v1 = v1 * 53 + UnsafeUtil.I(object0, v4);
                    break;
                }
                case 14: {
                    v1 = v1 * 53 + Internal.s(UnsafeUtil.L(object0, v4));
                    break;
                }
                case 15: {
                    v1 = v1 * 53 + UnsafeUtil.I(object0, v4);
                    break;
                }
                case 16: {
                    v1 = v1 * 53 + Internal.s(UnsafeUtil.L(object0, v4));
                    break;
                }
                case 17: {
                    Object object2 = UnsafeUtil.O(object0, v4);
                    if(object2 != null) {
                        v5 = object2.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    v1 = v1 * 53 + UnsafeUtil.O(object0, v4).hashCode();
                    break;
                }
                case 50: {
                    v1 = v1 * 53 + UnsafeUtil.O(object0, v4).hashCode();
                    break;
                }
                case 51: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + Internal.s(Double.doubleToLongBits(MessageSchema.R(object0, v4)));
                    }
                    break;
                }
                case 52: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + Float.floatToIntBits(MessageSchema.S(object0, v4));
                    }
                    break;
                }
                case 53: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + Internal.s(MessageSchema.U(object0, v4));
                    }
                    break;
                }
                case 54: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + Internal.s(MessageSchema.U(object0, v4));
                    }
                    break;
                }
                case 55: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + MessageSchema.T(object0, v4);
                    }
                    break;
                }
                case 56: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + Internal.s(MessageSchema.U(object0, v4));
                    }
                    break;
                }
                case 57: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + MessageSchema.T(object0, v4);
                    }
                    break;
                }
                case 58: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + Internal.k(MessageSchema.Q(object0, v4));
                    }
                    break;
                }
                case 59: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + ((String)UnsafeUtil.O(object0, v4)).hashCode();
                    }
                    break;
                }
                case 60: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + UnsafeUtil.O(object0, v4).hashCode();
                    }
                    break;
                }
                case 61: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + UnsafeUtil.O(object0, v4).hashCode();
                    }
                    break;
                }
                case 62: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + MessageSchema.T(object0, v4);
                    }
                    break;
                }
                case 0x3F: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + MessageSchema.T(object0, v4);
                    }
                    break;
                }
                case 0x40: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + MessageSchema.T(object0, v4);
                    }
                    break;
                }
                case 65: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + Internal.s(MessageSchema.U(object0, v4));
                    }
                    break;
                }
                case 66: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + MessageSchema.T(object0, v4);
                    }
                    break;
                }
                case 67: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + Internal.s(MessageSchema.U(object0, v4));
                    }
                    break;
                }
                case 68: {
                    if(this.C(object0, v3, v)) {
                        v1 = v1 * 53 + UnsafeUtil.O(object0, v4).hashCode();
                    }
                }
            }
        }
        int v8 = v1 * 53 + this.o.g(object0).hashCode();
        return this.f ? v8 * 53 + this.p.c(object0).hashCode() : v8;
    }

    private boolean i(Object object0, Object object1, int v) {
        int v1 = this.n0(v);
        long v2 = (long)(v1 & 0xFFFFF);
        switch((v1 & 0xFF00000) >>> 20) {
            case 0: {
                return this.d(object0, object1, v) && Double.doubleToLongBits(UnsafeUtil.D(object0, v2)) == Double.doubleToLongBits(UnsafeUtil.D(object1, v2));
            }
            case 1: {
                return this.d(object0, object1, v) && Float.floatToIntBits(UnsafeUtil.F(object0, v2)) == Float.floatToIntBits(UnsafeUtil.F(object1, v2));
            }
            case 2: {
                return this.d(object0, object1, v) && UnsafeUtil.L(object0, v2) == UnsafeUtil.L(object1, v2);
            }
            case 3: {
                return this.d(object0, object1, v) && UnsafeUtil.L(object0, v2) == UnsafeUtil.L(object1, v2);
            }
            case 4: {
                return this.d(object0, object1, v) && UnsafeUtil.I(object0, v2) == UnsafeUtil.I(object1, v2);
            }
            case 5: {
                return this.d(object0, object1, v) && UnsafeUtil.L(object0, v2) == UnsafeUtil.L(object1, v2);
            }
            case 6: {
                return this.d(object0, object1, v) && UnsafeUtil.I(object0, v2) == UnsafeUtil.I(object1, v2);
            }
            case 7: {
                return this.d(object0, object1, v) && UnsafeUtil.u(object0, v2) == UnsafeUtil.u(object1, v2);
            }
            case 8: {
                return this.d(object0, object1, v) && SchemaUtil.N(UnsafeUtil.O(object0, v2), UnsafeUtil.O(object1, v2));
            }
            case 9: {
                return this.d(object0, object1, v) && SchemaUtil.N(UnsafeUtil.O(object0, v2), UnsafeUtil.O(object1, v2));
            }
            case 10: {
                return this.d(object0, object1, v) && SchemaUtil.N(UnsafeUtil.O(object0, v2), UnsafeUtil.O(object1, v2));
            }
            case 11: {
                return this.d(object0, object1, v) && UnsafeUtil.I(object0, v2) == UnsafeUtil.I(object1, v2);
            }
            case 12: {
                return this.d(object0, object1, v) && UnsafeUtil.I(object0, v2) == UnsafeUtil.I(object1, v2);
            }
            case 13: {
                return this.d(object0, object1, v) && UnsafeUtil.I(object0, v2) == UnsafeUtil.I(object1, v2);
            }
            case 14: {
                return this.d(object0, object1, v) && UnsafeUtil.L(object0, v2) == UnsafeUtil.L(object1, v2);
            }
            case 15: {
                return this.d(object0, object1, v) && UnsafeUtil.I(object0, v2) == UnsafeUtil.I(object1, v2);
            }
            case 16: {
                return this.d(object0, object1, v) && UnsafeUtil.L(object0, v2) == UnsafeUtil.L(object1, v2);
            }
            case 17: {
                return this.d(object0, object1, v) && SchemaUtil.N(UnsafeUtil.O(object0, v2), UnsafeUtil.O(object1, v2));
            }
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 0x2F: 
            case 0x30: 
            case 49: {
                return SchemaUtil.N(UnsafeUtil.O(object0, v2), UnsafeUtil.O(object1, v2));
            }
            case 50: {
                return SchemaUtil.N(UnsafeUtil.O(object0, v2), UnsafeUtil.O(object1, v2));
            }
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 67: 
            case 68: {
                return this.B(object0, object1, v) && SchemaUtil.N(UnsafeUtil.O(object0, v2), UnsafeUtil.O(object1, v2));
            }
            default: {
                return true;
            }
        }
    }

    private void i0(Object object0, int v) {
        if(this.h) {
            return;
        }
        int v1 = this.c0(v);
        UnsafeUtil.l0(object0, ((long)(v1 & 0xFFFFF)), UnsafeUtil.I(object0, ((long)(v1 & 0xFFFFF))) | 1 << (v1 >>> 20));
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(Object object0) {
        int v8;
        int v = -1;
        int v2 = 0;
        for(int v1 = 0; v1 < this.k; ++v1) {
            int v3 = this.j[v1];
            int v4 = this.O(v3);
            int v5 = this.n0(v3);
            if(this.h) {
                v8 = 0;
            }
            else {
                int v6 = this.a[v3 + 2];
                int v7 = 0xFFFFF & v6;
                v8 = 1 << (v6 >>> 20);
                if(v7 != v) {
                    v2 = MessageSchema.z.getInt(object0, ((long)v7));
                    v = v7;
                }
            }
            if(MessageSchema.D(v5) && !this.x(object0, v3, v2, v8)) {
                return false;
            }
            switch((v5 & 0xFF00000) >>> 20) {
                case 9: 
                case 17: {
                    if(this.x(object0, v3, v2, v8) && !MessageSchema.y(object0, v5, this.o(v3))) {
                        return false;
                    }
                    break;
                }
                case 27: 
                case 49: {
                    if(!this.z(object0, v5, v3)) {
                        return false;
                    }
                    break;
                }
                case 50: {
                    if(!this.A(object0, v5, v3)) {
                        return false;
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.C(object0, v4, v3) && !MessageSchema.y(object0, v5, this.o(v3))) {
                        return false;
                    }
                }
            }
        }
        return !this.f || this.p.c(object0).E();
    }

    private final Object j(Object object0, int v, Object object1, UnknownFieldSchema unknownFieldSchema0) {
        int v1 = this.O(v);
        Object object2 = UnsafeUtil.O(object0, MessageSchema.P(this.n0(v)));
        if(object2 == null) {
            return object1;
        }
        EnumVerifier internal$EnumVerifier0 = this.m(v);
        return internal$EnumVerifier0 == null ? object1 : this.k(v, v1, this.q.forMutableMapData(object2), internal$EnumVerifier0, object1, unknownFieldSchema0);
    }

    private void j0(Object object0, int v, int v1) {
        UnsafeUtil.l0(object0, ((long)(this.c0(v1) & 0xFFFFF)), v);
    }

    private final Object k(int v, int v1, Map map0, EnumVerifier internal$EnumVerifier0, Object object0, UnknownFieldSchema unknownFieldSchema0) {
        Object object1 = this.n(v);
        Metadata mapEntryLite$Metadata0 = this.q.forMapMetadata(object1);
        Iterator iterator0 = map0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object2;
            if(!internal$EnumVerifier0.isInRange(((int)(((Integer)map$Entry0.getValue()))))) {
                if(object0 == null) {
                    object0 = unknownFieldSchema0.n();
                }
                CodedBuilder byteString$CodedBuilder0 = ByteString.G(MapEntryLite.b(mapEntryLite$Metadata0, map$Entry0.getKey(), map$Entry0.getValue()));
                CodedOutputStream codedOutputStream0 = byteString$CodedBuilder0.b();
                try {
                    MapEntryLite.l(codedOutputStream0, mapEntryLite$Metadata0, map$Entry0.getKey(), map$Entry0.getValue());
                }
                catch(IOException iOException0) {
                    throw new RuntimeException(iOException0);
                }
                unknownFieldSchema0.d(object0, v1, byteString$CodedBuilder0.a());
                iterator0.remove();
            }
        }
        return object0;
    }

    private int k0(int v, int v1) {
        int v2 = this.a.length / 3 - 1;
        while(v1 <= v2) {
            int v3 = v2 + v1 >>> 1;
            int v4 = v3 * 3;
            int v5 = this.O(v4);
            if(v == v5) {
                return v4;
            }
            if(v < v5) {
                v2 = v3 - 1;
            }
            else {
                v1 = v3 + 1;
            }
        }
        return -1;
    }

    private static float l(Object object0, long v) {
        return UnsafeUtil.F(object0, v);
    }

    private static void l0(FieldInfo fieldInfo0, int[] arr_v, int v, boolean z, Object[] arr_object) {
        int v5;
        int v4;
        int v3;
        int v2;
        OneofInfo oneofInfo0 = fieldInfo0.u();
        int v1 = 0;
        if(oneofInfo0 == null) {
            FieldType fieldType0 = fieldInfo0.z();
            v3 = (int)UnsafeUtil.W(fieldInfo0.n());
            int v6 = fieldType0.e();
            if(!z && !fieldType0.f() && !fieldType0.g()) {
                v5 = Integer.numberOfTrailingZeros(fieldInfo0.y());
                v2 = v6;
                v4 = (int)UnsafeUtil.W(fieldInfo0.w());
            }
            else if(fieldInfo0.l() == null) {
                v2 = v6;
                v5 = 0;
                v4 = 0;
            }
            else {
                v2 = v6;
                v4 = (int)UnsafeUtil.W(fieldInfo0.l());
                v5 = 0;
            }
        }
        else {
            v2 = fieldInfo0.z().e() + 51;
            v3 = (int)UnsafeUtil.W(oneofInfo0.c());
            v4 = (int)UnsafeUtil.W(oneofInfo0.a());
            v5 = 0;
        }
        arr_v[v] = fieldInfo0.p();
        int v7 = fieldInfo0.A() ? 0x20000000 : 0;
        if(fieldInfo0.C()) {
            v1 = 0x10000000;
        }
        arr_v[v + 1] = v2 << 20 | (v1 | v7) | v3;
        arr_v[v + 2] = v5 << 20 | v4;
        Class class0 = fieldInfo0.t();
        if(fieldInfo0.s() == null) {
            if(class0 != null) {
                arr_object[v / 3 * 2 + 1] = class0;
                return;
            }
            if(fieldInfo0.m() != null) {
                arr_object[v / 3 * 2 + 1] = fieldInfo0.m();
            }
        }
        else {
            int v8 = v / 3 * 2;
            arr_object[v8] = fieldInfo0.s();
            if(class0 != null) {
                arr_object[v8 + 1] = class0;
                return;
            }
            if(fieldInfo0.m() != null) {
                arr_object[v8 + 1] = fieldInfo0.m();
            }
        }
    }

    private EnumVerifier m(int v) {
        return (EnumVerifier)this.b[v / 3 * 2 + 1];
    }

    private static int m0(int v) [...] // Inlined contents

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(Object object0) {
        int v1;
        for(int v = this.k; true; ++v) {
            v1 = this.l;
            if(v >= v1) {
                break;
            }
            long v2 = MessageSchema.P(this.n0(this.j[v]));
            Object object1 = UnsafeUtil.O(object0, v2);
            if(object1 != null) {
                UnsafeUtil.q0(object0, v2, this.q.toImmutable(object1));
            }
        }
        while(v1 < this.j.length) {
            this.n.c(object0, ((long)this.j[v1]));
            ++v1;
        }
        this.o.j(object0);
        if(this.f) {
            this.p.f(object0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(Object object0, Object object1) {
        object1.getClass();
        for(int v = 0; v < this.a.length; v += 3) {
            this.K(object0, object1, v);
        }
        if(!this.h) {
            SchemaUtil.J(this.o, object0, object1);
            if(this.f) {
                SchemaUtil.H(this.p, object0, object1);
            }
        }
    }

    private Object n(int v) {
        return this.b[v / 3 * 2];
    }

    private int n0(int v) {
        return this.a[v + 1];
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public Object newInstance() {
        return this.m.newInstance(this.e);
    }

    private Schema o(int v) {
        int v1 = v / 3 * 2;
        Schema schema0 = (Schema)this.b[v1];
        if(schema0 != null) {
            return schema0;
        }
        Schema schema1 = Protobuf.a().i(((Class)this.b[v1 + 1]));
        this.b[v1] = schema1;
        return schema1;
    }

    private void o0(Object object0, Writer writer0) throws IOException {
        Map.Entry map$Entry1;
        int v8;
        Map.Entry map$Entry0;
        Iterator iterator0;
        if(this.f) {
            FieldSet fieldSet0 = this.p.c(object0);
            if(fieldSet0.C()) {
                iterator0 = null;
                map$Entry0 = null;
            }
            else {
                iterator0 = fieldSet0.H();
                Object object1 = iterator0.next();
                map$Entry0 = (Map.Entry)object1;
            }
        }
        else {
            iterator0 = null;
            map$Entry0 = null;
        }
        Unsafe unsafe0 = MessageSchema.z;
        int v = -1;
        int v1 = 0;
        int v2 = 0;
        while(v1 < this.a.length) {
            int v3 = this.n0(v1);
            int v4 = this.O(v1);
            int v5 = (v3 & 0xFF00000) >>> 20;
            if(this.h || v5 > 17) {
                map$Entry1 = map$Entry0;
                v8 = 0;
            }
            else {
                int v6 = this.a[v1 + 2];
                int v7 = v6 & 0xFFFFF;
                if(v7 != v) {
                    v2 = unsafe0.getInt(object0, ((long)v7));
                    v = v7;
                }
                v8 = 1 << (v6 >>> 20);
                map$Entry1 = map$Entry0;
            }
            while(map$Entry1 != null && this.p.a(map$Entry1) <= v4) {
                this.p.j(writer0, map$Entry1);
                if(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    map$Entry1 = (Map.Entry)object2;
                }
                else {
                    map$Entry1 = null;
                }
            }
            long v9 = (long)(v3 & 0xFFFFF);
            switch(v5) {
                case 0: {
                    if((v8 & v2) != 0) {
                        writer0.writeDouble(v4, MessageSchema.h(object0, v9));
                    }
                    break;
                }
                case 1: {
                    if((v8 & v2) != 0) {
                        writer0.writeFloat(v4, MessageSchema.l(object0, v9));
                    }
                    break;
                }
                case 2: {
                    if((v8 & v2) != 0) {
                        writer0.writeInt64(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 3: {
                    if((v8 & v2) != 0) {
                        writer0.writeUInt64(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 4: {
                    if((v8 & v2) != 0) {
                        writer0.writeInt32(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 5: {
                    if((v8 & v2) != 0) {
                        writer0.writeFixed64(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 6: {
                    if((v8 & v2) != 0) {
                        writer0.writeFixed32(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 7: {
                    if((v8 & v2) != 0) {
                        writer0.writeBool(v4, MessageSchema.e(object0, v9));
                    }
                    break;
                }
                case 8: {
                    if((v8 & v2) != 0) {
                        this.s0(v4, unsafe0.getObject(object0, v9), writer0);
                    }
                    break;
                }
                case 9: {
                    if((v8 & v2) != 0) {
                        writer0.b(v4, unsafe0.getObject(object0, v9), this.o(v1));
                    }
                    break;
                }
                case 10: {
                    if((v8 & v2) != 0) {
                        writer0.a(v4, ((ByteString)unsafe0.getObject(object0, v9)));
                    }
                    break;
                }
                case 11: {
                    if((v8 & v2) != 0) {
                        writer0.writeUInt32(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 12: {
                    if((v8 & v2) != 0) {
                        writer0.writeEnum(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 13: {
                    if((v8 & v2) != 0) {
                        writer0.writeSFixed32(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 14: {
                    if((v8 & v2) != 0) {
                        writer0.writeSFixed64(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 15: {
                    if((v8 & v2) != 0) {
                        writer0.writeSInt32(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 16: {
                    if((v8 & v2) != 0) {
                        writer0.writeSInt64(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 17: {
                    if((v8 & v2) != 0) {
                        writer0.e(v4, unsafe0.getObject(object0, v9), this.o(v1));
                    }
                    break;
                }
                case 18: {
                    SchemaUtil.Y(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 19: {
                    SchemaUtil.g0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 20: {
                    SchemaUtil.m0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 21: {
                    SchemaUtil.F0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 22: {
                    SchemaUtil.k0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 23: {
                    SchemaUtil.e0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 24: {
                    SchemaUtil.c0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 25: {
                    SchemaUtil.U(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 26: {
                    SchemaUtil.B0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0);
                    break;
                }
                case 27: {
                    SchemaUtil.q0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, this.o(v1));
                    break;
                }
                case 28: {
                    SchemaUtil.W(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0);
                    break;
                }
                case 29: {
                    SchemaUtil.D0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 30: {
                    SchemaUtil.a0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 0x1F: {
                    SchemaUtil.s0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 0x20: {
                    SchemaUtil.u0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 33: {
                    SchemaUtil.w0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 34: {
                    SchemaUtil.y0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 35: {
                    SchemaUtil.Y(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 36: {
                    SchemaUtil.g0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 37: {
                    SchemaUtil.m0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 38: {
                    SchemaUtil.F0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 39: {
                    SchemaUtil.k0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 40: {
                    SchemaUtil.e0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 41: {
                    SchemaUtil.c0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 42: {
                    SchemaUtil.U(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 43: {
                    SchemaUtil.D0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 44: {
                    SchemaUtil.a0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 45: {
                    SchemaUtil.s0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 46: {
                    SchemaUtil.u0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 0x2F: {
                    SchemaUtil.w0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 0x30: {
                    SchemaUtil.y0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 49: {
                    SchemaUtil.i0(this.O(v1), ((List)unsafe0.getObject(object0, v9)), writer0, this.o(v1));
                    break;
                }
                case 50: {
                    this.r0(writer0, v4, unsafe0.getObject(object0, v9), v1);
                    break;
                }
                case 51: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeDouble(v4, MessageSchema.R(object0, v9));
                    }
                    break;
                }
                case 52: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeFloat(v4, MessageSchema.S(object0, v9));
                    }
                    break;
                }
                case 53: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeInt64(v4, MessageSchema.U(object0, v9));
                    }
                    break;
                }
                case 54: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeUInt64(v4, MessageSchema.U(object0, v9));
                    }
                    break;
                }
                case 55: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeInt32(v4, MessageSchema.T(object0, v9));
                    }
                    break;
                }
                case 56: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeFixed64(v4, MessageSchema.U(object0, v9));
                    }
                    break;
                }
                case 57: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeFixed32(v4, MessageSchema.T(object0, v9));
                    }
                    break;
                }
                case 58: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeBool(v4, MessageSchema.Q(object0, v9));
                    }
                    break;
                }
                case 59: {
                    if(this.C(object0, v4, v1)) {
                        this.s0(v4, unsafe0.getObject(object0, v9), writer0);
                    }
                    break;
                }
                case 60: {
                    if(this.C(object0, v4, v1)) {
                        writer0.b(v4, unsafe0.getObject(object0, v9), this.o(v1));
                    }
                    break;
                }
                case 61: {
                    if(this.C(object0, v4, v1)) {
                        writer0.a(v4, ((ByteString)unsafe0.getObject(object0, v9)));
                    }
                    break;
                }
                case 62: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeUInt32(v4, MessageSchema.T(object0, v9));
                    }
                    break;
                }
                case 0x3F: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeEnum(v4, MessageSchema.T(object0, v9));
                    }
                    break;
                }
                case 0x40: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeSFixed32(v4, MessageSchema.T(object0, v9));
                    }
                    break;
                }
                case 65: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeSFixed64(v4, MessageSchema.U(object0, v9));
                    }
                    break;
                }
                case 66: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeSInt32(v4, MessageSchema.T(object0, v9));
                    }
                    break;
                }
                case 67: {
                    if(this.C(object0, v4, v1)) {
                        writer0.writeSInt64(v4, MessageSchema.U(object0, v9));
                    }
                    break;
                }
                case 68: {
                    if(this.C(object0, v4, v1)) {
                        writer0.e(v4, unsafe0.getObject(object0, v9), this.o(v1));
                    }
                }
            }
            v1 += 3;
            map$Entry0 = map$Entry1;
        }
        while(map$Entry0 != null) {
            this.p.j(writer0, map$Entry0);
            if(iterator0.hasNext()) {
                Object object3 = iterator0.next();
                map$Entry0 = (Map.Entry)object3;
            }
            else {
                map$Entry0 = null;
            }
        }
        this.t0(this.o, object0, writer0);
    }

    static UnknownFieldSetLite p(Object object0) {
        UnknownFieldSetLite unknownFieldSetLite0 = ((GeneratedMessageLite)object0).unknownFields;
        if(unknownFieldSetLite0 == UnknownFieldSetLite.e()) {
            unknownFieldSetLite0 = UnknownFieldSetLite.p();
            ((GeneratedMessageLite)object0).unknownFields = unknownFieldSetLite0;
        }
        return unknownFieldSetLite0;
    }

    private void p0(Object object0, Writer writer0) throws IOException {
        Map.Entry map$Entry0;
        Iterator iterator0;
        if(this.f) {
            FieldSet fieldSet0 = this.p.c(object0);
            if(fieldSet0.C()) {
                iterator0 = null;
                map$Entry0 = null;
            }
            else {
                iterator0 = fieldSet0.H();
                Object object1 = iterator0.next();
                map$Entry0 = (Map.Entry)object1;
            }
        }
        else {
            iterator0 = null;
            map$Entry0 = null;
        }
        for(int v = 0; v < this.a.length; v += 3) {
            int v1 = this.n0(v);
            int v2 = this.O(v);
            while(map$Entry0 != null && this.p.a(map$Entry0) <= v2) {
                this.p.j(writer0, map$Entry0);
                if(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    map$Entry0 = (Map.Entry)object2;
                }
                else {
                    map$Entry0 = null;
                }
            }
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(this.w(object0, v)) {
                        writer0.writeDouble(v2, MessageSchema.h(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 1: {
                    if(this.w(object0, v)) {
                        writer0.writeFloat(v2, MessageSchema.l(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 2: {
                    if(this.w(object0, v)) {
                        writer0.writeInt64(v2, MessageSchema.F(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 3: {
                    if(this.w(object0, v)) {
                        writer0.writeUInt64(v2, MessageSchema.F(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 4: {
                    if(this.w(object0, v)) {
                        writer0.writeInt32(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 5: {
                    if(this.w(object0, v)) {
                        writer0.writeFixed64(v2, MessageSchema.F(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 6: {
                    if(this.w(object0, v)) {
                        writer0.writeFixed32(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 7: {
                    if(this.w(object0, v)) {
                        writer0.writeBool(v2, MessageSchema.e(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 8: {
                    if(this.w(object0, v)) {
                        this.s0(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), writer0);
                    }
                    break;
                }
                case 9: {
                    if(this.w(object0, v)) {
                        writer0.b(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), this.o(v));
                    }
                    break;
                }
                case 10: {
                    if(this.w(object0, v)) {
                        writer0.a(v2, ((ByteString)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))));
                    }
                    break;
                }
                case 11: {
                    if(this.w(object0, v)) {
                        writer0.writeUInt32(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 12: {
                    if(this.w(object0, v)) {
                        writer0.writeEnum(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 13: {
                    if(this.w(object0, v)) {
                        writer0.writeSFixed32(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 14: {
                    if(this.w(object0, v)) {
                        writer0.writeSFixed64(v2, MessageSchema.F(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 15: {
                    if(this.w(object0, v)) {
                        writer0.writeSInt32(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 16: {
                    if(this.w(object0, v)) {
                        writer0.writeSInt64(v2, MessageSchema.F(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 17: {
                    if(this.w(object0, v)) {
                        writer0.e(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), this.o(v));
                    }
                    break;
                }
                case 18: {
                    SchemaUtil.Y(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 19: {
                    SchemaUtil.g0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 20: {
                    SchemaUtil.m0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 21: {
                    SchemaUtil.F0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 22: {
                    SchemaUtil.k0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 23: {
                    SchemaUtil.e0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 24: {
                    SchemaUtil.c0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 25: {
                    SchemaUtil.U(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 26: {
                    SchemaUtil.B0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0);
                    break;
                }
                case 27: {
                    SchemaUtil.q0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, this.o(v));
                    break;
                }
                case 28: {
                    SchemaUtil.W(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0);
                    break;
                }
                case 29: {
                    SchemaUtil.D0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 30: {
                    SchemaUtil.a0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 0x1F: {
                    SchemaUtil.s0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 0x20: {
                    SchemaUtil.u0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 33: {
                    SchemaUtil.w0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 34: {
                    SchemaUtil.y0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 35: {
                    SchemaUtil.Y(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 36: {
                    SchemaUtil.g0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 37: {
                    SchemaUtil.m0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 38: {
                    SchemaUtil.F0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 39: {
                    SchemaUtil.k0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 40: {
                    SchemaUtil.e0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 41: {
                    SchemaUtil.c0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 42: {
                    SchemaUtil.U(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 43: {
                    SchemaUtil.D0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 44: {
                    SchemaUtil.a0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 45: {
                    SchemaUtil.s0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 46: {
                    SchemaUtil.u0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 0x2F: {
                    SchemaUtil.w0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 0x30: {
                    SchemaUtil.y0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 49: {
                    SchemaUtil.i0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, this.o(v));
                    break;
                }
                case 50: {
                    this.r0(writer0, v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), v);
                    break;
                }
                case 51: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeDouble(v2, MessageSchema.R(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 52: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeFloat(v2, MessageSchema.S(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 53: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeInt64(v2, MessageSchema.U(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 54: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeUInt64(v2, MessageSchema.U(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 55: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeInt32(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 56: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeFixed64(v2, MessageSchema.U(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 57: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeFixed32(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 58: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeBool(v2, MessageSchema.Q(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 59: {
                    if(this.C(object0, v2, v)) {
                        this.s0(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), writer0);
                    }
                    break;
                }
                case 60: {
                    if(this.C(object0, v2, v)) {
                        writer0.b(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), this.o(v));
                    }
                    break;
                }
                case 61: {
                    if(this.C(object0, v2, v)) {
                        writer0.a(v2, ((ByteString)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))));
                    }
                    break;
                }
                case 62: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeUInt32(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 0x3F: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeEnum(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 0x40: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeSFixed32(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 65: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeSFixed64(v2, MessageSchema.U(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 66: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeSInt32(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 67: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeSInt64(v2, MessageSchema.U(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 68: {
                    if(this.C(object0, v2, v)) {
                        writer0.e(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), this.o(v));
                    }
                }
            }
        }
        while(map$Entry0 != null) {
            this.p.j(writer0, map$Entry0);
            if(iterator0.hasNext()) {
                Object object3 = iterator0.next();
                map$Entry0 = (Map.Entry)object3;
            }
            else {
                map$Entry0 = null;
            }
        }
        this.t0(this.o, object0, writer0);
    }

    int q() {
        return this.a.length * 3;
    }

    private void q0(Object object0, Writer writer0) throws IOException {
        Map.Entry map$Entry0;
        Iterator iterator0;
        this.t0(this.o, object0, writer0);
        if(this.f) {
            FieldSet fieldSet0 = this.p.c(object0);
            if(fieldSet0.C()) {
                iterator0 = null;
                map$Entry0 = null;
            }
            else {
                iterator0 = fieldSet0.r();
                Object object1 = iterator0.next();
                map$Entry0 = (Map.Entry)object1;
            }
        }
        else {
            iterator0 = null;
            map$Entry0 = null;
        }
        for(int v = this.a.length - 3; v >= 0; v -= 3) {
            int v1 = this.n0(v);
            int v2 = this.O(v);
            while(map$Entry0 != null && this.p.a(map$Entry0) > v2) {
                this.p.j(writer0, map$Entry0);
                if(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    map$Entry0 = (Map.Entry)object2;
                }
                else {
                    map$Entry0 = null;
                }
            }
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(this.w(object0, v)) {
                        writer0.writeDouble(v2, MessageSchema.h(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 1: {
                    if(this.w(object0, v)) {
                        writer0.writeFloat(v2, MessageSchema.l(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 2: {
                    if(this.w(object0, v)) {
                        writer0.writeInt64(v2, MessageSchema.F(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 3: {
                    if(this.w(object0, v)) {
                        writer0.writeUInt64(v2, MessageSchema.F(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 4: {
                    if(this.w(object0, v)) {
                        writer0.writeInt32(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 5: {
                    if(this.w(object0, v)) {
                        writer0.writeFixed64(v2, MessageSchema.F(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 6: {
                    if(this.w(object0, v)) {
                        writer0.writeFixed32(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 7: {
                    if(this.w(object0, v)) {
                        writer0.writeBool(v2, MessageSchema.e(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 8: {
                    if(this.w(object0, v)) {
                        this.s0(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), writer0);
                    }
                    break;
                }
                case 9: {
                    if(this.w(object0, v)) {
                        writer0.b(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), this.o(v));
                    }
                    break;
                }
                case 10: {
                    if(this.w(object0, v)) {
                        writer0.a(v2, ((ByteString)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))));
                    }
                    break;
                }
                case 11: {
                    if(this.w(object0, v)) {
                        writer0.writeUInt32(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 12: {
                    if(this.w(object0, v)) {
                        writer0.writeEnum(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 13: {
                    if(this.w(object0, v)) {
                        writer0.writeSFixed32(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 14: {
                    if(this.w(object0, v)) {
                        writer0.writeSFixed64(v2, MessageSchema.F(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 15: {
                    if(this.w(object0, v)) {
                        writer0.writeSInt32(v2, MessageSchema.u(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 16: {
                    if(this.w(object0, v)) {
                        writer0.writeSInt64(v2, MessageSchema.F(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 17: {
                    if(this.w(object0, v)) {
                        writer0.e(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), this.o(v));
                    }
                    break;
                }
                case 18: {
                    SchemaUtil.Y(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 19: {
                    SchemaUtil.g0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 20: {
                    SchemaUtil.m0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 21: {
                    SchemaUtil.F0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 22: {
                    SchemaUtil.k0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 23: {
                    SchemaUtil.e0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 24: {
                    SchemaUtil.c0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 25: {
                    SchemaUtil.U(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 26: {
                    SchemaUtil.B0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0);
                    break;
                }
                case 27: {
                    SchemaUtil.q0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, this.o(v));
                    break;
                }
                case 28: {
                    SchemaUtil.W(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0);
                    break;
                }
                case 29: {
                    SchemaUtil.D0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 30: {
                    SchemaUtil.a0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 0x1F: {
                    SchemaUtil.s0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 0x20: {
                    SchemaUtil.u0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 33: {
                    SchemaUtil.w0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 34: {
                    SchemaUtil.y0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                    break;
                }
                case 35: {
                    SchemaUtil.Y(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 36: {
                    SchemaUtil.g0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 37: {
                    SchemaUtil.m0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 38: {
                    SchemaUtil.F0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 39: {
                    SchemaUtil.k0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 40: {
                    SchemaUtil.e0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 41: {
                    SchemaUtil.c0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 42: {
                    SchemaUtil.U(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 43: {
                    SchemaUtil.D0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 44: {
                    SchemaUtil.a0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 45: {
                    SchemaUtil.s0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 46: {
                    SchemaUtil.u0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 0x2F: {
                    SchemaUtil.w0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 0x30: {
                    SchemaUtil.y0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                    break;
                }
                case 49: {
                    SchemaUtil.i0(this.O(v), ((List)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))), writer0, this.o(v));
                    break;
                }
                case 50: {
                    this.r0(writer0, v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), v);
                    break;
                }
                case 51: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeDouble(v2, MessageSchema.R(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 52: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeFloat(v2, MessageSchema.S(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 53: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeInt64(v2, MessageSchema.U(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 54: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeUInt64(v2, MessageSchema.U(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 55: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeInt32(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 56: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeFixed64(v2, MessageSchema.U(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 57: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeFixed32(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 58: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeBool(v2, MessageSchema.Q(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 59: {
                    if(this.C(object0, v2, v)) {
                        this.s0(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), writer0);
                    }
                    break;
                }
                case 60: {
                    if(this.C(object0, v2, v)) {
                        writer0.b(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), this.o(v));
                    }
                    break;
                }
                case 61: {
                    if(this.C(object0, v2, v)) {
                        writer0.a(v2, ((ByteString)UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)))));
                    }
                    break;
                }
                case 62: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeUInt32(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 0x3F: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeEnum(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 0x40: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeSFixed32(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 65: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeSFixed64(v2, MessageSchema.U(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 66: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeSInt32(v2, MessageSchema.T(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 67: {
                    if(this.C(object0, v2, v)) {
                        writer0.writeSInt64(v2, MessageSchema.U(object0, ((long)(v1 & 0xFFFFF))));
                    }
                    break;
                }
                case 68: {
                    if(this.C(object0, v2, v)) {
                        writer0.e(v2, UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))), this.o(v));
                    }
                }
            }
        }
        while(map$Entry0 != null) {
            this.p.j(writer0, map$Entry0);
            if(iterator0.hasNext()) {
                Object object3 = iterator0.next();
                map$Entry0 = (Map.Entry)object3;
            }
            else {
                map$Entry0 = null;
            }
        }
    }

    private int r(Object object0) {
        int v16;
        int v15;
        int v14;
        int v13;
        int v12;
        int v11;
        int v9;
        int v7;
        Unsafe unsafe0 = MessageSchema.z;
        int v = -1;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; v1 < this.a.length; v1 += 3) {
            int v4 = this.n0(v1);
            int v5 = this.O(v1);
            int v6 = (v4 & 0xFF00000) >>> 20;
            if(v6 <= 17) {
                v7 = this.a[v1 + 2];
                int v8 = 0xFFFFF & v7;
                if(v8 != v) {
                    v3 = unsafe0.getInt(object0, ((long)v8));
                    v = v8;
                }
                v9 = 1 << (v7 >>> 20);
            }
            else {
                v7 = !this.i || v6 < FieldType.O.e() || v6 > FieldType.T8.e() ? 0 : this.a[v1 + 2] & 0xFFFFF;
                v9 = 0;
            }
            long v10 = (long)(v4 & 0xFFFFF);
            switch(v6) {
                case 0: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.v(v5, 0.0);
                        v2 += v11;
                        break;
                    }
                    break;
                }
                case 1: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.D(v5, 0.0f);
                        v2 += v11;
                        break;
                    }
                    break;
                }
                case 2: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.L(v5, unsafe0.getLong(object0, v10));
                        v2 += v11;
                        break;
                    }
                    break;
                }
                case 3: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.n0(v5, unsafe0.getLong(object0, v10));
                        v2 += v11;
                        break;
                    }
                    break;
                }
                case 4: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.J(v5, unsafe0.getInt(object0, v10));
                        v2 += v11;
                        break;
                    }
                    break;
                }
                case 5: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.B(v5, 0L);
                        v2 += v11;
                    }
                    break;
                }
                case 6: {
                    if((v3 & v9) != 0) {
                        v2 += CodedOutputStream.z(v5, 0);
                    }
                    break;
                }
                case 7: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.n(v5, true);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 8: {
                    if((v3 & v9) != 0) {
                        Object object1 = unsafe0.getObject(object0, v10);
                        v12 = object1 instanceof ByteString ? CodedOutputStream.t(v5, ((ByteString)object1)) : CodedOutputStream.i0(v5, ((String)object1));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 9: {
                    if((v3 & v9) != 0) {
                        v12 = SchemaUtil.p(v5, unsafe0.getObject(object0, v10), this.o(v1));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 10: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.t(v5, ((ByteString)unsafe0.getObject(object0, v10)));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 11: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.l0(v5, unsafe0.getInt(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 12: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.x(v5, unsafe0.getInt(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 13: {
                    if((v3 & v9) != 0) {
                        v13 = CodedOutputStream.a0(v5, 0);
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 14: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.c0(v5, 0L);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 15: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.e0(v5, unsafe0.getInt(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 16: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.g0(v5, unsafe0.getLong(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 17: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.G(v5, ((MessageLite)unsafe0.getObject(object0, v10)), this.o(v1));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 18: {
                    v12 = SchemaUtil.h(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 19: {
                    v12 = SchemaUtil.f(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 20: {
                    v12 = SchemaUtil.n(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 21: {
                    v12 = SchemaUtil.z(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 22: {
                    v12 = SchemaUtil.l(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 23: {
                    v12 = SchemaUtil.h(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 24: {
                    v12 = SchemaUtil.f(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 25: {
                    v12 = SchemaUtil.a(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 26: {
                    v12 = SchemaUtil.w(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 27: {
                    v12 = SchemaUtil.r(v5, ((List)unsafe0.getObject(object0, v10)), this.o(v1));
                    v2 += v12;
                    break;
                }
                case 28: {
                    v12 = SchemaUtil.c(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 29: {
                    v12 = SchemaUtil.x(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 30: {
                    v12 = SchemaUtil.d(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 0x1F: {
                    v12 = SchemaUtil.f(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 0x20: {
                    v12 = SchemaUtil.h(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 33: {
                    v12 = SchemaUtil.s(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 34: {
                    v12 = SchemaUtil.u(v5, ((List)unsafe0.getObject(object0, v10)), false);
                    v2 += v12;
                    break;
                }
                case 35: {
                    v14 = SchemaUtil.i(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 36: {
                    v14 = SchemaUtil.g(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 37: {
                    v14 = SchemaUtil.o(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 38: {
                    v14 = SchemaUtil.A(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 39: {
                    v14 = SchemaUtil.m(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 40: {
                    v14 = SchemaUtil.i(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 41: {
                    v14 = SchemaUtil.g(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 42: {
                    v14 = SchemaUtil.b(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 43: {
                    v14 = SchemaUtil.y(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 44: {
                    v14 = SchemaUtil.e(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 45: {
                    v14 = SchemaUtil.g(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 46: {
                    v14 = SchemaUtil.i(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 0x2F: {
                    v14 = SchemaUtil.t(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v15 = CodedOutputStream.k0(v5);
                        v16 = CodedOutputStream.m0(v14);
                        v13 = v15 + v16 + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 0x30: {
                    v14 = SchemaUtil.v(((List)unsafe0.getObject(object0, v10)));
                    if(v14 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v7), v14);
                        }
                        v13 = CodedOutputStream.k0(v5) + CodedOutputStream.m0(v14) + v14;
                        v2 += v13;
                        break;
                    }
                    break;
                }
                case 49: {
                    v12 = SchemaUtil.k(v5, ((List)unsafe0.getObject(object0, v10)), this.o(v1));
                    v2 += v12;
                    break;
                }
                case 50: {
                    Object object2 = unsafe0.getObject(object0, v10);
                    Object object3 = this.n(v1);
                    v12 = this.q.getSerializedSize(v5, object2, object3);
                    v2 += v12;
                    break;
                }
                case 51: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.v(v5, 0.0);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 52: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.D(v5, 0.0f);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 53: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.L(v5, MessageSchema.U(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 54: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.n0(v5, MessageSchema.U(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 55: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.J(v5, MessageSchema.T(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 56: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.B(v5, 0L);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 57: {
                    if(this.C(object0, v5, v1)) {
                        v13 = CodedOutputStream.z(v5, 0);
                        v2 += v13;
                    }
                    break;
                }
                case 58: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.n(v5, true);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 59: {
                    if(this.C(object0, v5, v1)) {
                        Object object4 = unsafe0.getObject(object0, v10);
                        v12 = object4 instanceof ByteString ? CodedOutputStream.t(v5, ((ByteString)object4)) : CodedOutputStream.i0(v5, ((String)object4));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 60: {
                    if(this.C(object0, v5, v1)) {
                        v12 = SchemaUtil.p(v5, unsafe0.getObject(object0, v10), this.o(v1));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 61: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.t(v5, ((ByteString)unsafe0.getObject(object0, v10)));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 62: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.l0(v5, MessageSchema.T(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.x(v5, MessageSchema.T(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 0x40: {
                    if(this.C(object0, v5, v1)) {
                        v2 += CodedOutputStream.a0(v5, 0);
                    }
                    break;
                }
                case 65: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.c0(v5, 0L);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 66: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.e0(v5, MessageSchema.T(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 67: {
                    if(this.C(object0, v5, v1)) {
                        v12 = CodedOutputStream.g0(v5, MessageSchema.U(object0, v10));
                        v2 += v12;
                    }
                    break;
                }
                case 68: {
                    if(this.C(object0, v5, v1)) {
                        v2 += CodedOutputStream.G(v5, ((MessageLite)unsafe0.getObject(object0, v10)), this.o(v1));
                    }
                }
            }
        }
        int v17 = v2 + this.t(this.o, object0);
        return this.f ? v17 + this.p.c(object0).z() : v17;
    }

    private void r0(Writer writer0, int v, Object object0, int v1) throws IOException {
        if(object0 != null) {
            Object object1 = this.n(v1);
            writer0.c(v, this.q.forMapMetadata(object1), this.q.forMapData(object0));
        }
    }

    private int s(Object object0) {
        int v10;
        int v9;
        int v8;
        int v7;
        Unsafe unsafe0 = MessageSchema.z;
        int v1 = 0;
        for(int v = 0; v < this.a.length; v += 3) {
            int v2 = this.n0(v);
            int v3 = (v2 & 0xFF00000) >>> 20;
            int v4 = this.O(v);
            long v5 = (long)(v2 & 0xFFFFF);
            int v6 = v3 < FieldType.O.e() || v3 > FieldType.T8.e() ? 0 : this.a[v + 2] & 0xFFFFF;
            switch(v3) {
                case 0: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.v(v4, 0.0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 1: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.D(v4, 0.0f);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 2: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.L(v4, UnsafeUtil.L(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 3: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.n0(v4, UnsafeUtil.L(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 4: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.J(v4, UnsafeUtil.I(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 5: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.B(v4, 0L);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 6: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.z(v4, 0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 7: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.n(v4, true);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 8: {
                    if(this.w(object0, v)) {
                        Object object1 = UnsafeUtil.O(object0, v5);
                        v7 = object1 instanceof ByteString ? CodedOutputStream.t(v4, ((ByteString)object1)) : CodedOutputStream.i0(v4, ((String)object1));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 9: {
                    if(this.w(object0, v)) {
                        v7 = SchemaUtil.p(v4, UnsafeUtil.O(object0, v5), this.o(v));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 10: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.t(v4, ((ByteString)UnsafeUtil.O(object0, v5)));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 11: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.l0(v4, UnsafeUtil.I(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 12: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.x(v4, UnsafeUtil.I(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 13: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.a0(v4, 0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 14: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.c0(v4, 0L);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 15: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.e0(v4, UnsafeUtil.I(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 16: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.g0(v4, UnsafeUtil.L(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 17: {
                    if(this.w(object0, v)) {
                        v7 = CodedOutputStream.G(v4, ((MessageLite)UnsafeUtil.O(object0, v5)), this.o(v));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 18: {
                    v7 = SchemaUtil.h(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 19: {
                    v7 = SchemaUtil.f(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 20: {
                    v7 = SchemaUtil.n(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 21: {
                    v7 = SchemaUtil.z(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 22: {
                    v7 = SchemaUtil.l(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 23: {
                    v7 = SchemaUtil.h(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 24: {
                    v7 = SchemaUtil.f(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 25: {
                    v7 = SchemaUtil.a(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 26: {
                    v7 = SchemaUtil.w(v4, MessageSchema.E(object0, v5));
                    v1 += v7;
                    break;
                }
                case 27: {
                    v7 = SchemaUtil.r(v4, MessageSchema.E(object0, v5), this.o(v));
                    v1 += v7;
                    break;
                }
                case 28: {
                    v7 = SchemaUtil.c(v4, MessageSchema.E(object0, v5));
                    v1 += v7;
                    break;
                }
                case 29: {
                    v7 = SchemaUtil.x(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 30: {
                    v7 = SchemaUtil.d(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 0x1F: {
                    v7 = SchemaUtil.f(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 0x20: {
                    v7 = SchemaUtil.h(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 33: {
                    v7 = SchemaUtil.s(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 34: {
                    v7 = SchemaUtil.u(v4, MessageSchema.E(object0, v5), false);
                    v1 += v7;
                    break;
                }
                case 35: {
                    v8 = SchemaUtil.i(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 36: {
                    v8 = SchemaUtil.g(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 37: {
                    v8 = SchemaUtil.o(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 38: {
                    v8 = SchemaUtil.A(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 39: {
                    v8 = SchemaUtil.m(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 40: {
                    v8 = SchemaUtil.i(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 41: {
                    v8 = SchemaUtil.g(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 42: {
                    v8 = SchemaUtil.b(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 43: {
                    v8 = SchemaUtil.y(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 44: {
                    v8 = SchemaUtil.e(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 45: {
                    v8 = SchemaUtil.g(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 46: {
                    v8 = SchemaUtil.i(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 0x2F: {
                    v8 = SchemaUtil.t(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v9 = CodedOutputStream.k0(v4);
                        v10 = CodedOutputStream.m0(v8);
                        v7 = v9 + v10 + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 0x30: {
                    v8 = SchemaUtil.v(((List)unsafe0.getObject(object0, v5)));
                    if(v8 > 0) {
                        if(this.i) {
                            unsafe0.putInt(object0, ((long)v6), v8);
                        }
                        v7 = CodedOutputStream.k0(v4) + CodedOutputStream.m0(v8) + v8;
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 49: {
                    v7 = SchemaUtil.k(v4, MessageSchema.E(object0, v5), this.o(v));
                    v1 += v7;
                    break;
                }
                case 50: {
                    Object object2 = UnsafeUtil.O(object0, v5);
                    Object object3 = this.n(v);
                    v7 = this.q.getSerializedSize(v4, object2, object3);
                    v1 += v7;
                    break;
                }
                case 51: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.v(v4, 0.0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 52: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.D(v4, 0.0f);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 53: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.L(v4, MessageSchema.U(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 54: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.n0(v4, MessageSchema.U(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 55: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.J(v4, MessageSchema.T(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 56: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.B(v4, 0L);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 57: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.z(v4, 0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 58: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.n(v4, true);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 59: {
                    if(this.C(object0, v4, v)) {
                        Object object4 = UnsafeUtil.O(object0, v5);
                        v7 = object4 instanceof ByteString ? CodedOutputStream.t(v4, ((ByteString)object4)) : CodedOutputStream.i0(v4, ((String)object4));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 60: {
                    if(this.C(object0, v4, v)) {
                        v7 = SchemaUtil.p(v4, UnsafeUtil.O(object0, v5), this.o(v));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 61: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.t(v4, ((ByteString)UnsafeUtil.O(object0, v5)));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 62: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.l0(v4, MessageSchema.T(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.x(v4, MessageSchema.T(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 0x40: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.a0(v4, 0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 65: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.c0(v4, 0L);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 66: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.e0(v4, MessageSchema.T(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 67: {
                    if(this.C(object0, v4, v)) {
                        v7 = CodedOutputStream.g0(v4, MessageSchema.U(object0, v5));
                        v1 += v7;
                    }
                    break;
                }
                case 68: {
                    if(this.C(object0, v4, v)) {
                        v1 += CodedOutputStream.G(v4, ((MessageLite)UnsafeUtil.O(object0, v5)), this.o(v));
                    }
                }
            }
        }
        return v1 + this.t(this.o, object0);
    }

    private void s0(int v, Object object0, Writer writer0) throws IOException {
        if(object0 instanceof String) {
            writer0.writeString(v, ((String)object0));
            return;
        }
        writer0.a(v, ((ByteString)object0));
    }

    private int t(UnknownFieldSchema unknownFieldSchema0, Object object0) {
        return unknownFieldSchema0.h(unknownFieldSchema0.g(object0));
    }

    private void t0(UnknownFieldSchema unknownFieldSchema0, Object object0, Writer writer0) throws IOException {
        unknownFieldSchema0.t(unknownFieldSchema0.g(object0), writer0);
    }

    private static int u(Object object0, long v) {
        return UnsafeUtil.I(object0, v);
    }

    private static boolean v(int v) {
        return (v & 0x20000000) != 0;
    }

    private boolean w(Object object0, int v) {
        if(this.h) {
            int v1 = this.n0(v);
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    return UnsafeUtil.D(object0, ((long)(v1 & 0xFFFFF))) != 0.0;
                }
                case 1: {
                    return UnsafeUtil.F(object0, ((long)(v1 & 0xFFFFF))) != 0.0f;
                }
                case 2: {
                    return UnsafeUtil.L(object0, ((long)(v1 & 0xFFFFF))) != 0L;
                }
                case 3: {
                    return UnsafeUtil.L(object0, ((long)(v1 & 0xFFFFF))) != 0L;
                }
                case 4: {
                    return UnsafeUtil.I(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 5: {
                    return UnsafeUtil.L(object0, ((long)(v1 & 0xFFFFF))) != 0L;
                }
                case 6: {
                    return UnsafeUtil.I(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 7: {
                    return UnsafeUtil.u(object0, ((long)(v1 & 0xFFFFF)));
                }
                case 8: {
                    Object object1 = UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)));
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    return !ByteString.e.equals(object1);
                }
                case 9: {
                    return UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))) != null;
                }
                case 10: {
                    Object object2 = UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF)));
                    return !ByteString.e.equals(object2);
                }
                case 11: {
                    return UnsafeUtil.I(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 12: {
                    return UnsafeUtil.I(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 13: {
                    return UnsafeUtil.I(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 14: {
                    return UnsafeUtil.L(object0, ((long)(v1 & 0xFFFFF))) != 0L;
                }
                case 15: {
                    return UnsafeUtil.I(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 16: {
                    return UnsafeUtil.L(object0, ((long)(v1 & 0xFFFFF))) != 0L;
                }
                case 17: {
                    return UnsafeUtil.O(object0, ((long)(v1 & 0xFFFFF))) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        int v2 = this.c0(v);
        return (UnsafeUtil.I(object0, ((long)(v2 & 0xFFFFF))) & 1 << (v2 >>> 20)) != 0;
    }

    // 去混淆评级： 低(20)
    private boolean x(Object object0, int v, int v1, int v2) {
        return this.h ? this.w(object0, v) : (v1 & v2) != 0;
    }

    private static boolean y(Object object0, int v, Schema schema0) {
        return schema0.isInitialized(UnsafeUtil.O(object0, ((long)(v & 0xFFFFF))));
    }

    private boolean z(Object object0, int v, int v1) {
        List list0 = (List)UnsafeUtil.O(object0, ((long)(v & 0xFFFFF)));
        if(list0.isEmpty()) {
            return true;
        }
        Schema schema0 = this.o(v1);
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            if(!schema0.isInitialized(list0.get(v2))) {
                return false;
            }
        }
        return true;
    }
}

