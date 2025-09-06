package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

public final class UnknownFieldSetLite {
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;
    private static final int f = 8;
    private static final UnknownFieldSetLite g;

    static {
        UnknownFieldSetLite.g = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    }

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    private UnknownFieldSetLite(int v, int[] arr_v, Object[] arr_object, boolean z) {
        this.d = -1;
        this.a = v;
        this.b = arr_v;
        this.c = arr_object;
        this.e = z;
    }

    void a() {
        if(!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    private void b() {
        int v = this.a;
        int[] arr_v = this.b;
        if(v == arr_v.length) {
            int v1 = v + (v >= 4 ? v >> 1 : 8);
            this.b = Arrays.copyOf(arr_v, v1);
            this.c = Arrays.copyOf(this.c, v1);
        }
    }

    private static boolean c(int[] arr_v, int[] arr_v1, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(arr_v[v1] != arr_v1[v1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] arr_object, Object[] arr_object1, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(!arr_object[v1].equals(arr_object1[v1])) {
                return false;
            }
        }
        return true;
    }

    public static UnknownFieldSetLite e() {
        return UnknownFieldSetLite.g;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof UnknownFieldSetLite ? this.a == ((UnknownFieldSetLite)object0).a && UnknownFieldSetLite.c(this.b, ((UnknownFieldSetLite)object0).b, this.a) && UnknownFieldSetLite.d(this.c, ((UnknownFieldSetLite)object0).c, this.a) : false;
    }

    public int f() {
        int v5;
        int v = this.d;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.a; ++v1) {
            int v3 = this.b[v1];
            int v4 = v3 >>> 3;
            switch(v3 & 7) {
                case 0: {
                    v5 = CodedOutputStream.n0(v4, ((long)(((Long)this.c[v1]))));
                    break;
                }
                case 1: {
                    v5 = CodedOutputStream.B(v4, ((long)(((Long)this.c[v1]))));
                    break;
                }
                case 2: {
                    v5 = CodedOutputStream.t(v4, ((ByteString)this.c[v1]));
                    break;
                }
                case 3: {
                    v5 = CodedOutputStream.k0(v4) * 2 + ((UnknownFieldSetLite)this.c[v1]).f();
                    break;
                }
                case 5: {
                    v5 = CodedOutputStream.z(v4, ((int)(((Integer)this.c[v1]))));
                    break;
                }
                default: {
                    throw new IllegalStateException(InvalidProtocolBufferException.e());
                }
            }
            v2 += v5;
        }
        this.d = v2;
        return v2;
    }

    public int g() {
        int v = this.d;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.a; ++v1) {
            v2 += CodedOutputStream.X(WireFormat.a(this.b[v1]), ((ByteString)this.c[v1]));
        }
        this.d = v2;
        return v2;
    }

    private static int h(int[] arr_v, int v) {
        int v1 = 17;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 = v1 * 0x1F + arr_v[v2];
        }
        return v1;
    }

    @Override
    public int hashCode() {
        return ((this.a + 0x20F) * 0x1F + UnknownFieldSetLite.h(this.b, this.a)) * 0x1F + UnknownFieldSetLite.i(this.c, this.a);
    }

    private static int i(Object[] arr_object, int v) {
        int v1 = 17;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 = v1 * 0x1F + arr_object[v2].hashCode();
        }
        return v1;
    }

    public void j() {
        this.e = false;
    }

    boolean k(int v, CodedInputStream codedInputStream0) throws IOException {
        this.a();
        switch(v & 7) {
            case 0: {
                this.r(v, codedInputStream0.G());
                return true;
            }
            case 1: {
                this.r(v, codedInputStream0.B());
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            UnknownFieldSetLite unknownFieldSetLite0 = new UnknownFieldSetLite();
                            unknownFieldSetLite0.l(codedInputStream0);
                            codedInputStream0.a(v >>> 3 << 3 | 4);
                            this.r(v, unknownFieldSetLite0);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw InvalidProtocolBufferException.e();
                            }
                            this.r(v, codedInputStream0.A());
                            return true;
                        }
                    }
                }
                this.r(v, codedInputStream0.x());
                return true;
            }
        }
    }

    private UnknownFieldSetLite l(CodedInputStream codedInputStream0) throws IOException {
        do {
            int v = codedInputStream0.Y();
        }
        while(v != 0 && this.k(v, codedInputStream0));
        return this;
    }

    UnknownFieldSetLite m(int v, ByteString byteString0) {
        this.a();
        if(v == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        this.r(v << 3 | 2, byteString0);
        return this;
    }

    UnknownFieldSetLite n(int v, int v1) {
        this.a();
        if(v == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        this.r(v << 3, ((long)v1));
        return this;
    }

    static UnknownFieldSetLite o(UnknownFieldSetLite unknownFieldSetLite0, UnknownFieldSetLite unknownFieldSetLite1) {
        int v = unknownFieldSetLite0.a + unknownFieldSetLite1.a;
        int[] arr_v = Arrays.copyOf(unknownFieldSetLite0.b, v);
        System.arraycopy(unknownFieldSetLite1.b, 0, arr_v, unknownFieldSetLite0.a, unknownFieldSetLite1.a);
        Object[] arr_object = Arrays.copyOf(unknownFieldSetLite0.c, v);
        System.arraycopy(unknownFieldSetLite1.c, 0, arr_object, unknownFieldSetLite0.a, unknownFieldSetLite1.a);
        return new UnknownFieldSetLite(v, arr_v, arr_object, true);
    }

    static UnknownFieldSetLite p() {
        return new UnknownFieldSetLite();
    }

    final void q(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < this.a; ++v1) {
            MessageLiteToString.c(stringBuilder0, v, String.valueOf(WireFormat.a(this.b[v1])), this.c[v1]);
        }
    }

    void r(int v, Object object0) {
        this.a();
        this.b();
        int v1 = this.a;
        this.b[v1] = v;
        this.c[v1] = object0;
        this.a = v1 + 1;
    }

    public void s(CodedOutputStream codedOutputStream0) throws IOException {
        for(int v = 0; v < this.a; ++v) {
            codedOutputStream0.l1(WireFormat.a(this.b[v]), ((ByteString)this.c[v]));
        }
    }

    void t(Writer writer0) throws IOException {
        if(writer0.fieldOrder() == FieldOrder.b) {
            for(int v = this.a - 1; v >= 0; --v) {
                writer0.writeMessageSetItem(WireFormat.a(this.b[v]), this.c[v]);
            }
            return;
        }
        for(int v1 = 0; v1 < this.a; ++v1) {
            writer0.writeMessageSetItem(WireFormat.a(this.b[v1]), this.c[v1]);
        }
    }

    private static void u(int v, Object object0, Writer writer0) throws IOException {
        switch(v & 7) {
            case 0: {
                writer0.writeInt64(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 1: {
                writer0.writeFixed64(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 2: {
                writer0.a(v >>> 3, ((ByteString)object0));
                return;
            }
            case 3: {
                if(writer0.fieldOrder() == FieldOrder.a) {
                    writer0.writeStartGroup(v >>> 3);
                    ((UnknownFieldSetLite)object0).w(writer0);
                    writer0.writeEndGroup(v >>> 3);
                    return;
                }
                writer0.writeEndGroup(v >>> 3);
                ((UnknownFieldSetLite)object0).w(writer0);
                writer0.writeStartGroup(v >>> 3);
                return;
            }
            case 5: {
                writer0.writeFixed32(v >>> 3, ((int)(((Integer)object0))));
                return;
            }
            default: {
                throw new RuntimeException(InvalidProtocolBufferException.e());
            }
        }
    }

    public void v(CodedOutputStream codedOutputStream0) throws IOException {
        for(int v = 0; v < this.a; ++v) {
            int v1 = this.b[v];
            int v2 = v1 >>> 3;
            switch(v1 & 7) {
                case 0: {
                    codedOutputStream0.writeUInt64(v2, ((long)(((Long)this.c[v]))));
                    break;
                }
                case 1: {
                    codedOutputStream0.writeFixed64(v2, ((long)(((Long)this.c[v]))));
                    break;
                }
                case 2: {
                    codedOutputStream0.a(v2, ((ByteString)this.c[v]));
                    break;
                }
                case 3: {
                    codedOutputStream0.t1(v2, 3);
                    ((UnknownFieldSetLite)this.c[v]).v(codedOutputStream0);
                    codedOutputStream0.t1(v2, 4);
                    break;
                }
                case 5: {
                    codedOutputStream0.writeFixed32(v2, ((int)(((Integer)this.c[v]))));
                    break;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
    }

    public void w(Writer writer0) throws IOException {
        if(this.a == 0) {
            return;
        }
        if(writer0.fieldOrder() == FieldOrder.a) {
            for(int v = 0; v < this.a; ++v) {
                UnknownFieldSetLite.u(this.b[v], this.c[v], writer0);
            }
            return;
        }
        for(int v1 = this.a - 1; v1 >= 0; --v1) {
            UnknownFieldSetLite.u(this.b[v1], this.c[v1], writer0);
        }
    }
}

