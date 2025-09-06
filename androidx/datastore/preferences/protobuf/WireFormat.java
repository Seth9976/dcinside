package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public final class WireFormat {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static class FieldType extends Enum {
        private final JavaType a;
        private final int b;
        public static final enum FieldType c;
        public static final enum FieldType d;
        public static final enum FieldType e;
        public static final enum FieldType f;
        public static final enum FieldType g;
        public static final enum FieldType h;
        public static final enum FieldType i;
        public static final enum FieldType j;
        public static final enum FieldType k;
        public static final enum FieldType l;
        public static final enum FieldType m;
        public static final enum FieldType n;
        public static final enum FieldType o;
        public static final enum FieldType p;
        public static final enum FieldType q;
        public static final enum FieldType r;
        public static final enum FieldType s;
        public static final enum FieldType t;
        private static final FieldType[] u;

        static {
            FieldType.c = new FieldType("DOUBLE", 0, JavaType.e, 1);
            FieldType.d = new FieldType("FLOAT", 1, JavaType.d, 5);
            FieldType.e = new FieldType("INT64", 2, JavaType.c, 0);
            FieldType.f = new FieldType("UINT64", 3, JavaType.c, 0);
            FieldType.g = new FieldType("INT32", 4, JavaType.b, 0);
            FieldType.h = new FieldType("FIXED64", 5, JavaType.c, 1);
            FieldType.i = new FieldType("FIXED32", 6, JavaType.b, 5);
            FieldType.j = new FieldType("BOOL", 7, JavaType.f, 0);
            androidx.datastore.preferences.protobuf.WireFormat.FieldType.1 wireFormat$FieldType$10 = new FieldType("STRING", 8, JavaType.g, 2) {
                @Override  // androidx.datastore.preferences.protobuf.WireFormat$FieldType
                public boolean c() {
                    return false;
                }
            };
            FieldType.k = wireFormat$FieldType$10;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType.2 wireFormat$FieldType$20 = new FieldType("GROUP", 9, JavaType.j, 3) {
                @Override  // androidx.datastore.preferences.protobuf.WireFormat$FieldType
                public boolean c() {
                    return false;
                }
            };
            FieldType.l = wireFormat$FieldType$20;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType.3 wireFormat$FieldType$30 = new FieldType("MESSAGE", 10, JavaType.j, 2) {
                @Override  // androidx.datastore.preferences.protobuf.WireFormat$FieldType
                public boolean c() {
                    return false;
                }
            };
            FieldType.m = wireFormat$FieldType$30;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType.4 wireFormat$FieldType$40 = new FieldType("BYTES", 11, JavaType.h, 2) {
                @Override  // androidx.datastore.preferences.protobuf.WireFormat$FieldType
                public boolean c() {
                    return false;
                }
            };
            FieldType.n = wireFormat$FieldType$40;
            FieldType.o = new FieldType("UINT32", 12, JavaType.b, 0);
            FieldType.p = new FieldType("ENUM", 13, JavaType.i, 0);
            FieldType.q = new FieldType("SFIXED32", 14, JavaType.b, 5);
            FieldType.r = new FieldType("SFIXED64", 15, JavaType.c, 1);
            FieldType.s = new FieldType("SINT32", 16, JavaType.b, 0);
            FieldType.t = new FieldType("SINT64", 17, JavaType.c, 0);
            FieldType.u = new FieldType[]{FieldType.c, FieldType.d, FieldType.e, FieldType.f, FieldType.g, FieldType.h, FieldType.i, FieldType.j, wireFormat$FieldType$10, wireFormat$FieldType$20, wireFormat$FieldType$30, wireFormat$FieldType$40, FieldType.o, FieldType.p, FieldType.q, FieldType.r, FieldType.s, FieldType.t};
        }

        private FieldType(String s, int v, JavaType wireFormat$JavaType0, int v1) {
            super(s, v);
            this.a = wireFormat$JavaType0;
            this.b = v1;
        }

        FieldType(String s, int v, JavaType wireFormat$JavaType0, int v1, androidx.datastore.preferences.protobuf.WireFormat.1 wireFormat$10) {
            this(s, v, wireFormat$JavaType0, v1);
        }

        public JavaType a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public boolean c() {
            return true;
        }

        public static FieldType valueOf(String s) {
            return (FieldType)Enum.valueOf(FieldType.class, s);
        }

        public static FieldType[] values() {
            return (FieldType[])FieldType.u.clone();
        }
    }

    public static enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(0.0f),
        DOUBLE(0.0),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.e),
        ENUM(null),
        MESSAGE(null);

        private final Object a;

        private JavaType(Object object0) {
            this.a = object0;
        }

        Object a() {
            return this.a;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    static abstract class Utf8Validation extends Enum {
        public static final enum Utf8Validation a;
        public static final enum Utf8Validation b;
        public static final enum Utf8Validation c;
        private static final Utf8Validation[] d;

        static {
            androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.1 wireFormat$Utf8Validation$10 = new Utf8Validation("LOOSE", 0) {
                @Override  // androidx.datastore.preferences.protobuf.WireFormat$Utf8Validation
                Object a(CodedInputStream codedInputStream0) throws IOException {
                    return codedInputStream0.W();
                }
            };
            Utf8Validation.a = wireFormat$Utf8Validation$10;
            androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.2 wireFormat$Utf8Validation$20 = new Utf8Validation("STRICT", 1) {
                @Override  // androidx.datastore.preferences.protobuf.WireFormat$Utf8Validation
                Object a(CodedInputStream codedInputStream0) throws IOException {
                    return codedInputStream0.X();
                }
            };
            Utf8Validation.b = wireFormat$Utf8Validation$20;
            androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.3 wireFormat$Utf8Validation$30 = new Utf8Validation("LAZY", 2) {
                @Override  // androidx.datastore.preferences.protobuf.WireFormat$Utf8Validation
                Object a(CodedInputStream codedInputStream0) throws IOException {
                    return codedInputStream0.x();
                }
            };
            Utf8Validation.c = wireFormat$Utf8Validation$30;
            Utf8Validation.d = new Utf8Validation[]{wireFormat$Utf8Validation$10, wireFormat$Utf8Validation$20, wireFormat$Utf8Validation$30};
        }

        private Utf8Validation(String s, int v) {
            super(s, v);
        }

        Utf8Validation(String s, int v, androidx.datastore.preferences.protobuf.WireFormat.1 wireFormat$10) {
            this(s, v);
        }

        abstract Object a(CodedInputStream arg1) throws IOException;

        public static Utf8Validation valueOf(String s) {
            return (Utf8Validation)Enum.valueOf(Utf8Validation.class, s);
        }

        public static Utf8Validation[] values() {
            return (Utf8Validation[])Utf8Validation.d.clone();
        }
    }

    static final int a = 4;
    static final int b = 8;
    static final int c = 5;
    static final int d = 10;
    static final int e = 10;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 5;
    static final int l = 3;
    static final int m = 7;
    static final int n = 1;
    static final int o = 2;
    static final int p = 3;
    static final int q;
    static final int r;
    static final int s;
    static final int t;

    static {
        WireFormat.q = 11;
        WireFormat.r = 12;
        WireFormat.s = 16;
        WireFormat.t = 26;
    }

    public static int a(int v) [...] // Inlined contents

    public static int b(int v) [...] // Inlined contents

    static int c(int v, int v1) [...] // Inlined contents

    static Object d(CodedInputStream codedInputStream0, FieldType wireFormat$FieldType0, Utf8Validation wireFormat$Utf8Validation0) throws IOException {
        switch(wireFormat$FieldType0) {
            case 1: {
                return codedInputStream0.y();
            }
            case 2: {
                return codedInputStream0.C();
            }
            case 3: {
                return codedInputStream0.G();
            }
            case 4: {
                return codedInputStream0.a0();
            }
            case 5: {
                return codedInputStream0.F();
            }
            case 6: {
                return codedInputStream0.B();
            }
            case 7: {
                return codedInputStream0.A();
            }
            case 8: {
                return Boolean.valueOf(codedInputStream0.u());
            }
            case 9: {
                return codedInputStream0.x();
            }
            case 10: {
                return codedInputStream0.Z();
            }
            case 11: {
                return codedInputStream0.S();
            }
            case 12: {
                return codedInputStream0.T();
            }
            case 13: {
                return codedInputStream0.U();
            }
            case 14: {
                return codedInputStream0.V();
            }
            case 15: {
                return wireFormat$Utf8Validation0.a(codedInputStream0);
            }
            case 16: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            }
            case 17: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            }
            case 18: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }
}

