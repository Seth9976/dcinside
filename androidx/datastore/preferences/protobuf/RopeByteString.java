package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class RopeByteString extends ByteString {
    static class Balancer {
        private final ArrayDeque a;

        private Balancer() {
            this.a = new ArrayDeque();
        }

        Balancer(androidx.datastore.preferences.protobuf.RopeByteString.1 ropeByteString$10) {
        }

        private ByteString b(ByteString byteString0, ByteString byteString1) {
            this.c(byteString0);
            this.c(byteString1);
            ByteString byteString2;
            for(byteString2 = (ByteString)this.a.pop(); !this.a.isEmpty(); byteString2 = new RopeByteString(((ByteString)this.a.pop()), byteString2, null)) {
            }
            return byteString2;
        }

        private void c(ByteString byteString0) {
            if(byteString0.D()) {
                this.e(byteString0);
                return;
            }
            if(!(byteString0 instanceof RopeByteString)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString0.getClass());
            }
            this.c(((RopeByteString)byteString0).j);
            this.c(((RopeByteString)byteString0).k);
        }

        private int d(int v) {
            int v1 = Arrays.binarySearch(RopeByteString.n, v);
            return v1 >= 0 ? v1 : -(v1 + 1) - 1;
        }

        private void e(ByteString byteString0) {
            int v = this.d(byteString0.size());
            int[] arr_v = RopeByteString.n;
            int v1 = arr_v[v + 1];
            if(!this.a.isEmpty() && ((ByteString)this.a.peek()).size() < v1) {
                int v2 = arr_v[v];
                ByteString byteString1;
                for(byteString1 = (ByteString)this.a.pop(); !this.a.isEmpty() && ((ByteString)this.a.peek()).size() < v2; byteString1 = new RopeByteString(((ByteString)this.a.pop()), byteString1, null)) {
                }
                RopeByteString ropeByteString0;
                for(ropeByteString0 = new RopeByteString(byteString1, byteString0, null); !this.a.isEmpty(); ropeByteString0 = new RopeByteString(((ByteString)this.a.pop()), ropeByteString0, null)) {
                    int v3 = RopeByteString.n[this.d(ropeByteString0.size()) + 1];
                    if(((ByteString)this.a.peek()).size() >= v3) {
                        break;
                    }
                }
                this.a.push(ropeByteString0);
                return;
            }
            this.a.push(byteString0);
        }
    }

    static final class PieceIterator implements Iterator {
        private final ArrayDeque a;
        private LeafByteString b;

        private PieceIterator(ByteString byteString0) {
            if(byteString0 instanceof RopeByteString) {
                ArrayDeque arrayDeque0 = new ArrayDeque(((RopeByteString)byteString0).B());
                this.a = arrayDeque0;
                arrayDeque0.push(((RopeByteString)byteString0));
                this.b = this.a(((RopeByteString)byteString0).j);
                return;
            }
            this.a = null;
            this.b = (LeafByteString)byteString0;
        }

        PieceIterator(ByteString byteString0, androidx.datastore.preferences.protobuf.RopeByteString.1 ropeByteString$10) {
            this(byteString0);
        }

        private LeafByteString a(ByteString byteString0) {
            while(byteString0 instanceof RopeByteString) {
                this.a.push(((RopeByteString)byteString0));
                byteString0 = ((RopeByteString)byteString0).j;
            }
            return (LeafByteString)byteString0;
        }

        private LeafByteString b() {
            while(this.a != null && !this.a.isEmpty()) {
                LeafByteString byteString$LeafByteString0 = this.a(((RopeByteString)this.a.pop()).k);
                if(!byteString$LeafByteString0.isEmpty()) {
                    return byteString$LeafByteString0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }

        public LeafByteString c() {
            LeafByteString byteString$LeafByteString0 = this.b;
            if(byteString$LeafByteString0 == null) {
                throw new NoSuchElementException();
            }
            this.b = this.b();
            return byteString$LeafByteString0;
        }

        @Override
        public boolean hasNext() {
            return this.b != null;
        }

        @Override
        public Object next() {
            return this.c();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class RopeInputStream extends InputStream {
        private PieceIterator a;
        private LeafByteString b;
        private int c;
        private int d;
        private int e;
        private int f;
        final RopeByteString g;

        public RopeInputStream() {
            this.b();
        }

        private void a() {
            if(this.b != null) {
                int v = this.c;
                if(this.d == v) {
                    this.e += v;
                    this.d = 0;
                    if(this.a.hasNext()) {
                        LeafByteString byteString$LeafByteString0 = this.a.c();
                        this.b = byteString$LeafByteString0;
                        this.c = byteString$LeafByteString0.size();
                        return;
                    }
                    this.b = null;
                    this.c = 0;
                }
            }
        }

        @Override
        public int available() throws IOException {
            return RopeByteString.this.size() - (this.e + this.d);
        }

        private void b() {
            PieceIterator ropeByteString$PieceIterator0 = new PieceIterator(RopeByteString.this, null);
            this.a = ropeByteString$PieceIterator0;
            LeafByteString byteString$LeafByteString0 = ropeByteString$PieceIterator0.c();
            this.b = byteString$LeafByteString0;
            this.c = byteString$LeafByteString0.size();
            this.d = 0;
            this.e = 0;
        }

        private int c(byte[] arr_b, int v, int v1) {
            int v2;
            for(v2 = v1; v2 > 0; v2 -= v3) {
                this.a();
                if(this.b == null) {
                    return v2 == v1 ? -1 : v1 - v2;
                }
                int v3 = Math.min(this.c - this.d, v2);
                if(arr_b != null) {
                    this.b.y(arr_b, this.d, v, v3);
                    v += v3;
                }
                this.d += v3;
            }
            return v1 - v2;
        }

        @Override
        public void mark(int v) {
            this.f = this.e + this.d;
        }

        @Override
        public boolean markSupported() {
            return true;
        }

        @Override
        public int read() throws IOException {
            this.a();
            LeafByteString byteString$LeafByteString0 = this.b;
            if(byteString$LeafByteString0 == null) {
                return -1;
            }
            int v = this.d;
            this.d = v + 1;
            return byteString$LeafByteString0.g(v) & 0xFF;
        }

        @Override
        public int read(byte[] arr_b, int v, int v1) {
            arr_b.getClass();
            if(v < 0 || v1 < 0 || v1 > arr_b.length - v) {
                throw new IndexOutOfBoundsException();
            }
            return this.c(arr_b, v, v1);
        }

        @Override
        public void reset() {
            synchronized(this) {
                this.b();
                this.c(null, 0, this.f);
            }
        }

        @Override
        public long skip(long v) {
            if(v < 0L) {
                throw new IndexOutOfBoundsException();
            }
            if(v > 0x7FFFFFFFL) {
                v = 0x7FFFFFFFL;
            }
            return (long)this.c(null, 0, ((int)v));
        }
    }

    private final int i;
    private final ByteString j;
    private final ByteString k;
    private final int l;
    private final int m;
    static final int[] n = null;
    private static final long o = 1L;

    static {
        RopeByteString.n = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 0x90, 0xE9, 377, 610, 987, 0x63D, 0xA18, 0x1055, 6765, 10946, 0x452F, 0x6FF1, 0xB520, 75025, 0x1DA31, 0x2FF42, 0x4D973, 0x7D8B5, 832040, 0x148ADD, 0x213D05, 0x35C7E2, 0x5704E7, 0x8CCCC9, 0xE3D1B0, 0x1709E79, 0x2547029, 0x3C50EA2, 102334155, 165580141, 0xFF80C38, 0x19D699A5, 701408733, 1134903170, 0x6D73E55F, 0x7FFFFFFF};
    }

    private RopeByteString(ByteString byteString0, ByteString byteString1) {
        this.j = byteString0;
        this.k = byteString1;
        int v = byteString0.size();
        this.l = v;
        this.i = v + byteString1.size();
        this.m = Math.max(byteString0.B(), byteString1.B()) + 1;
    }

    RopeByteString(ByteString byteString0, ByteString byteString1, androidx.datastore.preferences.protobuf.RopeByteString.1 ropeByteString$10) {
        this(byteString0, byteString1);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    protected int B() {
        return this.m;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    byte C(int v) {
        return v >= this.l ? this.k.C(v - this.l) : this.j.C(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    protected boolean D() {
        return this.i >= RopeByteString.n[this.m];
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public boolean E() {
        int v = this.j.N(0, 0, this.l);
        return this.k.N(v, 0, this.k.size()) == 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public ByteIterator F() {
        return new AbstractByteIterator() {
            final PieceIterator a;
            ByteIterator b;
            final RopeByteString c;

            {
                this.a = new PieceIterator(ropeByteString0, null);
                this.b = this.b();
            }

            // 去混淆评级： 低(20)
            private ByteIterator b() {
                return this.a.hasNext() ? this.a.c().F() : null;
            }

            @Override
            public boolean hasNext() {
                return this.b != null;
            }

            @Override  // androidx.datastore.preferences.protobuf.ByteString$ByteIterator
            public byte nextByte() {
                ByteIterator byteString$ByteIterator0 = this.b;
                if(byteString$ByteIterator0 == null) {
                    throw new NoSuchElementException();
                }
                byte b = byteString$ByteIterator0.nextByte();
                if(!this.b.hasNext()) {
                    this.b = this.b();
                }
                return b;
            }
        };
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public CodedInputStream H() {
        return CodedInputStream.j(new RopeInputStream(this));
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public InputStream I() {
        return new RopeInputStream(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    protected int M(int v, int v1, int v2) {
        int v3 = this.l;
        if(v1 + v2 <= v3) {
            return this.j.M(v, v1, v2);
        }
        if(v1 >= v3) {
            return this.k.M(v, v1 - v3, v2);
        }
        int v4 = v3 - v1;
        int v5 = this.j.M(v, v1, v4);
        return this.k.M(v5, 0, v2 - v4);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    protected int N(int v, int v1, int v2) {
        int v3 = this.l;
        if(v1 + v2 <= v3) {
            return this.j.N(v, v1, v2);
        }
        if(v1 >= v3) {
            return this.k.N(v, v1 - v3, v2);
        }
        int v4 = v3 - v1;
        int v5 = this.j.N(v, v1, v4);
        return this.k.N(v5, 0, v2 - v4);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public ByteString V(int v, int v1) {
        int v2 = ByteString.i(v, v1, this.i);
        if(v2 == 0) {
            return ByteString.e;
        }
        if(v2 == this.i) {
            return this;
        }
        int v3 = this.l;
        if(v1 <= v3) {
            return this.j.V(v, v1);
        }
        return v >= v3 ? this.k.V(v - v3, v1 - v3) : new RopeByteString(this.j.U(v), this.k.V(0, v1 - this.l));
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    protected String a0(Charset charset0) {
        return new String(this.W(), charset0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public ByteBuffer b() {
        return ByteBuffer.wrap(this.W()).asReadOnlyBuffer();
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public List c() {
        List list0 = new ArrayList();
        PieceIterator ropeByteString$PieceIterator0 = new PieceIterator(this, null);
        while(ropeByteString$PieceIterator0.hasNext()) {
            list0.add(ropeByteString$PieceIterator0.c().b());
        }
        return list0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ByteString)) {
            return false;
        }
        if(this.i != ((ByteString)object0).size()) {
            return false;
        }
        if(this.i == 0) {
            return true;
        }
        int v = this.O();
        int v1 = ((ByteString)object0).O();
        return v == 0 || v1 == 0 || v == v1 ? this.t0(((ByteString)object0)) : false;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public byte g(int v) {
        ByteString.h(v, this.i);
        return this.C(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public Iterator iterator() {
        return this.F();
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    void j0(ByteOutput byteOutput0) throws IOException {
        this.j.j0(byteOutput0);
        this.k.j0(byteOutput0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public void k0(OutputStream outputStream0) throws IOException {
        this.j.k0(outputStream0);
        this.k.k0(outputStream0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    void n0(OutputStream outputStream0, int v, int v1) throws IOException {
        int v2 = this.l;
        if(v + v1 <= v2) {
            this.j.n0(outputStream0, v, v1);
            return;
        }
        if(v >= v2) {
            this.k.n0(outputStream0, v - v2, v1);
            return;
        }
        int v3 = v2 - v;
        this.j.n0(outputStream0, v, v3);
        this.k.n0(outputStream0, 0, v1 - v3);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    void o0(ByteOutput byteOutput0) throws IOException {
        this.k.o0(byteOutput0);
        this.j.o0(byteOutput0);
    }

    static ByteString r0(ByteString byteString0, ByteString byteString1) {
        if(byteString1.size() == 0) {
            return byteString0;
        }
        if(byteString0.size() == 0) {
            return byteString1;
        }
        int v = byteString0.size() + byteString1.size();
        if(v < 0x80) {
            return RopeByteString.s0(byteString0, byteString1);
        }
        if(byteString0 instanceof RopeByteString) {
            if(((RopeByteString)byteString0).k.size() + byteString1.size() < 0x80) {
                ByteString byteString2 = RopeByteString.s0(((RopeByteString)byteString0).k, byteString1);
                return new RopeByteString(((RopeByteString)byteString0).j, byteString2);
            }
            if(((RopeByteString)byteString0).j.B() > ((RopeByteString)byteString0).k.B() && ((RopeByteString)byteString0).B() > byteString1.B()) {
                RopeByteString ropeByteString0 = new RopeByteString(((RopeByteString)byteString0).k, byteString1);
                return new RopeByteString(((RopeByteString)byteString0).j, ropeByteString0);
            }
        }
        return v >= RopeByteString.n[Math.max(byteString0.B(), byteString1.B()) + 1] ? new RopeByteString(byteString0, byteString1) : new Balancer(null).b(byteString0, byteString1);
    }

    private static ByteString s0(ByteString byteString0, ByteString byteString1) {
        int v = byteString0.size();
        int v1 = byteString1.size();
        byte[] arr_b = new byte[v + v1];
        byteString0.y(arr_b, 0, 0, v);
        byteString1.y(arr_b, 0, v, v1);
        return ByteString.h0(arr_b);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.i;
    }

    private boolean t0(ByteString byteString0) {
        PieceIterator ropeByteString$PieceIterator0 = new PieceIterator(this, null);
        Object object0 = ropeByteString$PieceIterator0.next();
        LeafByteString byteString$LeafByteString0 = (LeafByteString)object0;
        PieceIterator ropeByteString$PieceIterator1 = new PieceIterator(byteString0, null);
        Object object1 = ropeByteString$PieceIterator1.next();
        LeafByteString byteString$LeafByteString1 = (LeafByteString)object1;
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        while(true) {
            int v3 = byteString$LeafByteString0.size() - v;
            int v4 = byteString$LeafByteString1.size() - v1;
            int v5 = Math.min(v3, v4);
            if(!(v == 0 ? byteString$LeafByteString0.p0(byteString$LeafByteString1, v1, v5) : byteString$LeafByteString1.p0(byteString$LeafByteString0, v, v5))) {
                return false;
            }
            v2 += v5;
            int v6 = this.i;
            if(v2 >= v6) {
                if(v2 != v6) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if(v5 == v3) {
                Object object2 = ropeByteString$PieceIterator0.next();
                byteString$LeafByteString0 = (LeafByteString)object2;
                v = 0;
            }
            else {
                v += v5;
            }
            if(v5 == v4) {
                Object object3 = ropeByteString$PieceIterator1.next();
                byteString$LeafByteString1 = (LeafByteString)object3;
                v1 = 0;
            }
            else {
                v1 += v5;
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public void u(ByteBuffer byteBuffer0) {
        this.j.u(byteBuffer0);
        this.k.u(byteBuffer0);
    }

    static RopeByteString u0(ByteString byteString0, ByteString byteString1) {
        return new RopeByteString(byteString0, byteString1);
    }

    private void v0(ObjectInputStream objectInputStream0) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    Object w0() {
        return ByteString.h0(this.W());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    protected void z(byte[] arr_b, int v, int v1, int v2) {
        int v3 = this.l;
        if(v + v2 <= v3) {
            this.j.z(arr_b, v, v1, v2);
            return;
        }
        if(v >= v3) {
            this.k.z(arr_b, v - v3, v1, v2);
            return;
        }
        int v4 = v3 - v;
        this.j.z(arr_b, v, v1, v4);
        this.k.z(arr_b, 0, v1 + v4, v2 - v4);
    }
}

