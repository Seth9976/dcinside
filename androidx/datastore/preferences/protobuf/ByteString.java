package androidx.datastore.preferences.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class ByteString implements Serializable, Iterable {
    static abstract class AbstractByteIterator implements ByteIterator {
        public final Byte a() {
            return this.nextByte();
        }

        @Override
        public Object next() {
            return this.a();
        }

        @Override
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static final class ArraysByteArrayCopier implements ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        ArraysByteArrayCopier(androidx.datastore.preferences.protobuf.ByteString.1 byteString$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString$ByteArrayCopier
        public byte[] copyFrom(byte[] arr_b, int v, int v1) {
            return Arrays.copyOfRange(arr_b, v, v1 + v);
        }
    }

    static final class BoundedByteString extends LiteralByteString {
        private final int k;
        private final int l;
        private static final long m = 1L;

        BoundedByteString(byte[] arr_b, int v, int v1) {
            super(arr_b);
            ByteString.i(v, v + v1, arr_b.length);
            this.k = v;
            this.l = v1;
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString$LiteralByteString
        byte C(int v) {
            return this.i[this.k + v];
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString$LiteralByteString
        public byte g(int v) {
            ByteString.h(v, this.size());
            return this.i[this.k + v];
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString$LiteralByteString
        protected int q0() {
            return this.k;
        }

        private void r0(ObjectInputStream objectInputStream0) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        Object s0() {
            return ByteString.h0(this.W());
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString$LiteralByteString
        public int size() {
            return this.l;
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString$LiteralByteString
        protected void z(byte[] arr_b, int v, int v1, int v2) {
            System.arraycopy(this.i, this.q0() + v, arr_b, v1, v2);
        }
    }

    interface ByteArrayCopier {
        byte[] copyFrom(byte[] arg1, int arg2, int arg3);
    }

    public interface ByteIterator extends Iterator {
        byte nextByte();
    }

    static final class CodedBuilder {
        private final CodedOutputStream a;
        private final byte[] b;

        private CodedBuilder(int v) {
            byte[] arr_b = new byte[v];
            this.b = arr_b;
            this.a = CodedOutputStream.A0(arr_b);
        }

        CodedBuilder(int v, androidx.datastore.preferences.protobuf.ByteString.1 byteString$10) {
            this(v);
        }

        public ByteString a() {
            this.a.m();
            return new LiteralByteString(this.b);
        }

        public CodedOutputStream b() {
            return this.a;
        }
    }

    static abstract class LeafByteString extends ByteString {
        @Override  // androidx.datastore.preferences.protobuf.ByteString
        protected final int B() {
            return 0;
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        protected final boolean D() {
            return true;
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public Iterator iterator() {
            return super.F();
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        void o0(ByteOutput byteOutput0) throws IOException {
            this.j0(byteOutput0);
        }

        abstract boolean p0(ByteString arg1, int arg2, int arg3);
    }

    static class LiteralByteString extends LeafByteString {
        protected final byte[] i;
        private static final long j = 1L;

        LiteralByteString(byte[] arr_b) {
            arr_b.getClass();
            this.i = arr_b;
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        byte C(int v) {
            return this.i[v];
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public final boolean E() {
            int v = this.q0();
            return Utf8.u(this.i, v, this.size() + v);
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public final CodedInputStream H() {
            return CodedInputStream.r(this.i, this.q0(), this.size(), true);
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public final InputStream I() {
            return new ByteArrayInputStream(this.i, this.q0(), this.size());
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        protected final int M(int v, int v1, int v2) {
            return Internal.w(v, this.i, this.q0() + v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        protected final int N(int v, int v1, int v2) {
            int v3 = this.q0();
            return Utf8.w(v, this.i, v3 + v1, v2 + (v3 + v1));
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString V(int v, int v1) {
            int v2 = ByteString.i(v, v1, this.size());
            return v2 == 0 ? ByteString.e : new BoundedByteString(this.i, this.q0() + v, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        protected final String a0(Charset charset0) {
            return new String(this.i, this.q0(), this.size(), charset0);
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer b() {
            return ByteBuffer.wrap(this.i, this.q0(), this.size()).asReadOnlyBuffer();
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public final List c() {
            return Collections.singletonList(this.b());
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof ByteString)) {
                return false;
            }
            if(this.size() != ((ByteString)object0).size()) {
                return false;
            }
            if(this.size() == 0) {
                return true;
            }
            if(object0 instanceof LiteralByteString) {
                int v = this.O();
                int v1 = ((LiteralByteString)object0).O();
                return v == 0 || v1 == 0 || v == v1 ? this.p0(((LiteralByteString)object0), 0, this.size()) : false;
            }
            return object0.equals(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public byte g(int v) {
            return this.i[v];
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        final void j0(ByteOutput byteOutput0) throws IOException {
            byteOutput0.k(this.i, this.q0(), this.size());
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public final void k0(OutputStream outputStream0) throws IOException {
            outputStream0.write(this.W());
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        final void n0(OutputStream outputStream0, int v, int v1) throws IOException {
            outputStream0.write(this.i, this.q0() + v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString$LeafByteString
        final boolean p0(ByteString byteString0, int v, int v1) {
            if(v1 > byteString0.size()) {
                throw new IllegalArgumentException("Length too large: " + v1 + this.size());
            }
            int v2 = v + v1;
            if(v2 > byteString0.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + v + ", " + v1 + ", " + byteString0.size());
            }
            if(byteString0 instanceof LiteralByteString) {
                byte[] arr_b = this.i;
                byte[] arr_b1 = ((LiteralByteString)byteString0).i;
                int v3 = this.q0();
                int v4 = this.q0();
                for(int v5 = ((LiteralByteString)byteString0).q0() + v; v4 < v3 + v1; ++v5) {
                    if(arr_b[v4] != arr_b1[v5]) {
                        return false;
                    }
                    ++v4;
                }
                return true;
            }
            return byteString0.V(v, v2).equals(this.V(0, v1));
        }

        protected int q0() {
            return 0;
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.i.length;
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        public final void u(ByteBuffer byteBuffer0) {
            byteBuffer0.put(this.i, this.q0(), this.size());
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString
        protected void z(byte[] arr_b, int v, int v1, int v2) {
            System.arraycopy(this.i, v, arr_b, v1, v2);
        }
    }

    public static final class Output extends OutputStream {
        private final int a;
        private final ArrayList b;
        private int c;
        private byte[] d;
        private int e;
        private static final byte[] f;

        static {
            Output.f = new byte[0];
        }

        Output(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.a = v;
            this.b = new ArrayList();
            this.d = new byte[v];
        }

        private byte[] a(byte[] arr_b, int v) {
            byte[] arr_b1 = new byte[v];
            System.arraycopy(arr_b, 0, arr_b1, 0, Math.min(arr_b.length, v));
            return arr_b1;
        }

        private void b(int v) {
            LiteralByteString byteString$LiteralByteString0 = new LiteralByteString(this.d);
            this.b.add(byteString$LiteralByteString0);
            int v1 = this.c + this.d.length;
            this.c = v1;
            this.d = new byte[Math.max(this.a, Math.max(v, v1 >>> 1))];
            this.e = 0;
        }

        private void c() {
            int v = this.e;
            byte[] arr_b = this.d;
            if(v >= arr_b.length) {
                LiteralByteString byteString$LiteralByteString1 = new LiteralByteString(this.d);
                this.b.add(byteString$LiteralByteString1);
                this.d = Output.f;
            }
            else if(v > 0) {
                LiteralByteString byteString$LiteralByteString0 = new LiteralByteString(this.a(arr_b, v));
                this.b.add(byteString$LiteralByteString0);
            }
            this.c += this.e;
            this.e = 0;
        }

        public ByteString e() {
            synchronized(this) {
                this.c();
                return ByteString.k(this.b);
            }
        }

        public void f(OutputStream outputStream0) throws IOException {
            int v1;
            byte[] arr_b;
            ByteString[] arr_byteString;
            synchronized(this) {
                arr_byteString = (ByteString[])this.b.toArray(new ByteString[this.b.size()]);
                arr_b = this.d;
                v1 = this.e;
            }
            for(int v2 = 0; v2 < arr_byteString.length; ++v2) {
                arr_byteString[v2].k0(outputStream0);
            }
            outputStream0.write(this.a(arr_b, v1));
        }

        public void reset() {
            synchronized(this) {
                this.b.clear();
                this.c = 0;
                this.e = 0;
            }
        }

        public int size() {
            synchronized(this) {
            }
            return this.c + this.e;
        }

        @Override
        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
        }

        @Override
        public void write(int v) {
            synchronized(this) {
                if(this.e == this.d.length) {
                    this.b(1);
                }
                int v2 = this.e;
                this.e = v2 + 1;
                this.d[v2] = (byte)v;
            }
        }

        @Override
        public void write(byte[] arr_b, int v, int v1) {
            synchronized(this) {
                byte[] arr_b1 = this.d;
                int v3 = this.e;
                if(v1 <= arr_b1.length - v3) {
                    System.arraycopy(arr_b, v, arr_b1, v3, v1);
                    this.e += v1;
                }
                else {
                    int v4 = arr_b1.length - v3;
                    System.arraycopy(arr_b, v, arr_b1, v3, v4);
                    int v5 = v1 - v4;
                    this.b(v5);
                    System.arraycopy(arr_b, v + v4, this.d, 0, v5);
                    this.e = v5;
                }
            }
        }
    }

    static final class SystemByteArrayCopier implements ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        SystemByteArrayCopier(androidx.datastore.preferences.protobuf.ByteString.1 byteString$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.ByteString$ByteArrayCopier
        public byte[] copyFrom(byte[] arr_b, int v, int v1) {
            byte[] arr_b1 = new byte[v1];
            System.arraycopy(arr_b, v, arr_b1, 0, v1);
            return arr_b1;
        }
    }

    private int a;
    static final int b = 0x80;
    static final int c = 0x100;
    static final int d = 0x2000;
    public static final ByteString e = null;
    private static final ByteArrayCopier f = null;
    private static final int g = 0xFF;
    private static final Comparator h;

    static {
        ByteString.e = new LiteralByteString(Internal.d);
        ByteString.f = new ArraysByteArrayCopier(null);
        ByteString.h = new Comparator() {
            public int b(ByteString byteString0, ByteString byteString1) {
                ByteIterator byteString$ByteIterator0 = byteString0.F();
                ByteIterator byteString$ByteIterator1 = byteString1.F();
                while(byteString$ByteIterator0.hasNext() && byteString$ByteIterator1.hasNext()) {
                    int v = Integer.compare(ByteString.a(byteString$ByteIterator0.nextByte()), ByteString.a(byteString$ByteIterator1.nextByte()));
                    if(v != 0) {
                        return v;
                    }
                    if(false) {
                        break;
                    }
                }
                return Integer.compare(byteString0.size(), byteString1.size());
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((ByteString)object0), ((ByteString)object1));
            }
        };
    }

    ByteString() {
        this.a = 0;
    }

    public final boolean A(ByteString byteString0) {
        return this.size() >= byteString0.size() && this.U(this.size() - byteString0.size()).equals(byteString0);
    }

    protected abstract int B();

    abstract byte C(int arg1);

    protected abstract boolean D();

    public abstract boolean E();

    public ByteIterator F() {
        return new AbstractByteIterator() {
            private int a;
            private final int b;
            final ByteString c;

            {
                this.a = 0;
                this.b = byteString0.size();
            }

            @Override
            public boolean hasNext() {
                return this.a < this.b;
            }

            @Override  // androidx.datastore.preferences.protobuf.ByteString$ByteIterator
            public byte nextByte() {
                int v = this.a;
                if(v >= this.b) {
                    throw new NoSuchElementException();
                }
                this.a = v + 1;
                return ByteString.this.C(v);
            }
        };
    }

    static CodedBuilder G(int v) {
        return new CodedBuilder(v, null);
    }

    public abstract CodedInputStream H();

    public abstract InputStream I();

    public static Output J() {
        return new Output(0x80);
    }

    public static Output K(int v) {
        return new Output(v);
    }

    protected abstract int M(int arg1, int arg2, int arg3);

    protected abstract int N(int arg1, int arg2, int arg3);

    protected final int O() {
        return this.a;
    }

    private static ByteString P(InputStream inputStream0, int v) throws IOException {
        byte[] arr_b = new byte[v];
        int v1;
        for(v1 = 0; v1 < v; v1 += v2) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 == -1) {
                break;
            }
        }
        return v1 == 0 ? null : ByteString.q(arr_b, 0, v1);
    }

    public static ByteString Q(InputStream inputStream0) throws IOException {
        return ByteString.S(inputStream0, 0x100, 0x2000);
    }

    public static ByteString R(InputStream inputStream0, int v) throws IOException {
        return ByteString.S(inputStream0, v, v);
    }

    public static ByteString S(InputStream inputStream0, int v, int v1) throws IOException {
        ArrayList arrayList0 = new ArrayList();
        ByteString byteString0;
        while((byteString0 = ByteString.P(inputStream0, v)) != null) {
            arrayList0.add(byteString0);
            v = Math.min(v * 2, v1);
        }
        return ByteString.k(arrayList0);
    }

    public final boolean T(ByteString byteString0) {
        return this.size() >= byteString0.size() && this.V(0, byteString0.size()).equals(byteString0);
    }

    public final ByteString U(int v) {
        return this.V(v, this.size());
    }

    public abstract ByteString V(int arg1, int arg2);

    public final byte[] W() {
        int v = this.size();
        if(v == 0) {
            return Internal.d;
        }
        byte[] arr_b = new byte[v];
        this.z(arr_b, 0, 0, v);
        return arr_b;
    }

    private static int X(byte b) [...] // Inlined contents

    public final String Y(String s) throws UnsupportedEncodingException {
        try {
            return this.Z(Charset.forName(s));
        }
        catch(UnsupportedCharsetException unsupportedCharsetException0) {
            UnsupportedEncodingException unsupportedEncodingException0 = new UnsupportedEncodingException(s);
            unsupportedEncodingException0.initCause(unsupportedCharsetException0);
            throw unsupportedEncodingException0;
        }
    }

    public final String Z(Charset charset0) {
        return this.size() == 0 ? "" : this.a0(charset0);
    }

    static int a(byte b) {
        return b & 0xFF;
    }

    protected abstract String a0(Charset arg1);

    public abstract ByteBuffer b();

    public final String b0() {
        return this.Z(Internal.a);
    }

    public abstract List c();

    public static Comparator c0() {
        return ByteString.h;
    }

    private static ByteString d(Iterator iterator0, int v) {
        if(v < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", v));
        }
        return v == 1 ? iterator0.next() : ByteString.d(iterator0, v >>> 1).j(ByteString.d(iterator0, v - (v >>> 1)));
    }

    @Override
    public abstract boolean equals(Object arg1);

    public abstract byte g(int arg1);

    static ByteString g0(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasArray()) {
            int v = byteBuffer0.arrayOffset();
            return ByteString.i0(byteBuffer0.array(), v + byteBuffer0.position(), byteBuffer0.remaining());
        }
        return new NioByteString(byteBuffer0);
    }

    static void h(int v, int v1) {
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
    }

    static ByteString h0(byte[] arr_b) {
        return new LiteralByteString(arr_b);
    }

    @Override
    public final int hashCode() {
        int v = this.a;
        if(v == 0) {
            int v1 = this.size();
            v = this.M(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.a = v;
        }
        return v;
    }

    static int i(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + v + " < 0");
            }
            throw v1 >= v ? new IndexOutOfBoundsException("End index: " + v1 + " >= " + v2) : new IndexOutOfBoundsException("Beginning index larger than ending index: " + v + ", " + v1);
        }
        return v3;
    }

    static ByteString i0(byte[] arr_b, int v, int v1) {
        return new BoundedByteString(arr_b, v, v1);
    }

    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Iterator iterator() {
        return this.F();
    }

    public final ByteString j(ByteString byteString0) {
        if(0x7FFFFFFF - this.size() < byteString0.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + this.size() + "+" + byteString0.size());
        }
        return RopeByteString.r0(this, byteString0);
    }

    abstract void j0(ByteOutput arg1) throws IOException;

    public static ByteString k(Iterable iterable0) {
        int v;
        if(!(iterable0 instanceof Collection)) {
            v = 0;
            Iterator iterator0 = iterable0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                ++v;
            }
            return v == 0 ? ByteString.e : ByteString.d(iterable0.iterator(), v);
        }
        v = ((Collection)iterable0).size();
        return v == 0 ? ByteString.e : ByteString.d(iterable0.iterator(), v);
    }

    public abstract void k0(OutputStream arg1) throws IOException;

    public static ByteString l(String s, String s1) throws UnsupportedEncodingException {
        return new LiteralByteString(s.getBytes(s1));
    }

    public static ByteString m(String s, Charset charset0) {
        return new LiteralByteString(s.getBytes(charset0));
    }

    final void m0(OutputStream outputStream0, int v, int v1) throws IOException {
        ByteString.i(v, v + v1, this.size());
        if(v1 > 0) {
            this.n0(outputStream0, v, v1);
        }
    }

    public static ByteString n(ByteBuffer byteBuffer0) {
        return ByteString.o(byteBuffer0, byteBuffer0.remaining());
    }

    abstract void n0(OutputStream arg1, int arg2, int arg3) throws IOException;

    public static ByteString o(ByteBuffer byteBuffer0, int v) {
        ByteString.i(0, v, byteBuffer0.remaining());
        byte[] arr_b = new byte[v];
        byteBuffer0.get(arr_b);
        return new LiteralByteString(arr_b);
    }

    abstract void o0(ByteOutput arg1) throws IOException;

    public static ByteString p(byte[] arr_b) {
        return ByteString.q(arr_b, 0, arr_b.length);
    }

    public static ByteString q(byte[] arr_b, int v, int v1) {
        ByteString.i(v, v + v1, arr_b.length);
        return new LiteralByteString(ByteString.f.copyFrom(arr_b, v, v1));
    }

    public static ByteString r(String s) {
        return new LiteralByteString(s.getBytes(Internal.a));
    }

    public abstract int size();

    @Override
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
    }

    public abstract void u(ByteBuffer arg1);

    public void x(byte[] arr_b, int v) {
        this.y(arr_b, 0, v, this.size());
    }

    @Deprecated
    public final void y(byte[] arr_b, int v, int v1, int v2) {
        ByteString.i(v, v + v2, this.size());
        ByteString.i(v1, v1 + v2, arr_b.length);
        if(v2 > 0) {
            this.z(arr_b, v, v1, v2);
        }
    }

    protected abstract void z(byte[] arg1, int arg2, int arg3, int arg4);
}

