package com.google.common.io;

import J1.c;
import J1.d;
import com.google.common.base.C;
import com.google.common.base.H;
import com.google.common.base.M;
import com.google.common.collect.O2;
import com.google.common.collect.z3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import jeb.synthetic.TWR;

@c
@d
@q
public abstract class k {
    final class a extends g {
        final Charset a;
        final k b;

        a(Charset charset0) {
            this.a = (Charset)H.E(charset0);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.io.g
        public k a(Charset charset0) {
            return charset0.equals(this.a) ? k.this : super.a(charset0);
        }

        @Override  // com.google.common.io.g
        public InputStream m() throws IOException {
            return new G(k.this.m(), this.a, 0x2000);
        }

        @Override
        public String toString() {
            return k.this.toString() + ".asByteSource(" + this.a + ")";
        }
    }

    static class b extends k {
        protected final CharSequence a;
        private static final M b;

        static {
            b.b = M.l("\r\n|\n|\r");
        }

        protected b(CharSequence charSequence0) {
            this.a = (CharSequence)H.E(charSequence0);
        }

        @Override  // com.google.common.io.k
        public boolean i() {
            return this.a.length() == 0;
        }

        @Override  // com.google.common.io.k
        public long j() {
            return (long)this.a.length();
        }

        @Override  // com.google.common.io.k
        public C k() {
            return C.f(((long)this.a.length()));
        }

        @Override  // com.google.common.io.k
        public Reader m() {
            return new i(this.a);
        }

        @Override  // com.google.common.io.k
        public String n() {
            return this.a.toString();
        }

        @Override  // com.google.common.io.k
        @o3.a
        public String o() {
            Iterator iterator0 = this.t();
            return iterator0.hasNext() ? iterator0.next() : null;
        }

        @Override  // com.google.common.io.k
        public O2 p() {
            return O2.u(this.t());
        }

        @Override  // com.google.common.io.k
        @E
        public Object q(y y0) throws IOException {
            Iterator iterator0 = this.t();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(!y0.a(((String)object0))) {
                    break;
                }
            }
            return y0.getResult();
        }

        private Iterator t() {
            class com.google.common.io.k.b.a extends com.google.common.collect.c {
                Iterator c;
                final b d;

                com.google.common.io.k.b.a() {
                    this.c = b.b.n(k$b0.a).iterator();
                }

                @Override  // com.google.common.collect.c
                @o3.a
                protected Object a() {
                    return this.d();
                }

                @o3.a
                protected String d() {
                    if(this.c.hasNext()) {
                        Object object0 = this.c.next();
                        return !this.c.hasNext() && ((String)object0).isEmpty() ? ((String)this.b()) : ((String)object0);
                    }
                    return (String)this.b();
                }
            }

            return new com.google.common.io.k.b.a(this);
        }

        @Override
        public String toString() {
            return "CharSource.wrap(" + com.google.common.base.c.k(this.a, 30, "...") + ")";
        }
    }

    static final class com.google.common.io.k.c extends k {
        private final Iterable a;

        com.google.common.io.k.c(Iterable iterable0) {
            this.a = (Iterable)H.E(iterable0);
        }

        @Override  // com.google.common.io.k
        public boolean i() throws IOException {
            for(Object object0: this.a) {
                if(!((k)object0).i()) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override  // com.google.common.io.k
        public long j() throws IOException {
            long v = 0L;
            for(Object object0: this.a) {
                v += ((k)object0).j();
            }
            return v;
        }

        @Override  // com.google.common.io.k
        public C k() {
            long v = 0L;
            for(Object object0: this.a) {
                C c0 = ((k)object0).k();
                if(!c0.e()) {
                    return C.a();
                }
                v += (long)(((Long)c0.d()));
            }
            return C.f(v);
        }

        @Override  // com.google.common.io.k
        public Reader m() throws IOException {
            return new D(this.a.iterator());
        }

        @Override
        public String toString() {
            return "CharSource.concat(" + this.a + ")";
        }
    }

    static final class com.google.common.io.k.d extends e {
        private static final com.google.common.io.k.d c;

        static {
            com.google.common.io.k.d.c = new com.google.common.io.k.d();
        }

        private com.google.common.io.k.d() {
            super("");
        }

        @Override  // com.google.common.io.k$b
        public String toString() {
            return "CharSource.empty()";
        }
    }

    static class e extends b {
        protected e(String s) {
            super(s);
        }

        @Override  // com.google.common.io.k
        public long e(j j0) throws IOException {
            int v;
            H.E(j0);
            n n0 = n.a();
            try {
                ((Writer)n0.b(j0.b())).write(((String)this.a));
                v = this.a.length();
            }
            catch(Throwable throwable0) {
                try {
                    throw n0.c(throwable0);
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(n0, throwable1);
                    throw throwable1;
                }
            }
            n0.close();
            return (long)v;
        }

        @Override  // com.google.common.io.k
        public long f(Appendable appendable0) throws IOException {
            appendable0.append(this.a);
            return (long)this.a.length();
        }

        @Override  // com.google.common.io.k$b
        public Reader m() {
            return new StringReader(((String)this.a));
        }
    }

    public g a(Charset charset0) {
        return new a(this, charset0);
    }

    public static k b(Iterable iterable0) {
        return new com.google.common.io.k.c(iterable0);
    }

    public static k c(Iterator iterator0) {
        return k.b(O2.u(iterator0));
    }

    public static k d(k[] arr_k) {
        return k.b(O2.x(arr_k));
    }

    @O1.a
    public long e(j j0) throws IOException {
        long v;
        H.E(j0);
        n n0 = n.a();
        try {
            v = l.b(((Reader)n0.b(this.m())), ((Writer)n0.b(j0.b())));
        }
        catch(Throwable throwable0) {
            try {
                throw n0.c(throwable0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(n0, throwable1);
                throw throwable1;
            }
        }
        n0.close();
        return v;
    }

    @O1.a
    public long f(Appendable appendable0) throws IOException {
        long v;
        H.E(appendable0);
        n n0 = n.a();
        try {
            v = l.b(((Reader)n0.b(this.m())), appendable0);
        }
        catch(Throwable throwable0) {
            try {
                throw n0.c(throwable0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(n0, throwable1);
                throw throwable1;
            }
        }
        n0.close();
        return v;
    }

    private long g(Reader reader0) throws IOException {
        long v = 0L;
        long v1;
        while((v1 = reader0.skip(0x7FFFFFFFFFFFFFFFL)) != 0L) {
            v += v1;
        }
        return v;
    }

    public static k h() {
        return com.google.common.io.k.d.c;
    }

    public boolean i() throws IOException {
        C c0 = this.k();
        boolean z = false;
        if(c0.e()) {
            return ((long)(((Long)c0.d()))) == 0L;
        }
        n n0 = n.a();
        try {
            if(((Reader)n0.b(this.m())).read() == -1) {
                z = true;
            }
        }
        catch(Throwable throwable0) {
            try {
                throw n0.c(throwable0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(n0, throwable1);
                throw throwable1;
            }
        }
        n0.close();
        return z;
    }

    public long j() throws IOException {
        long v;
        C c0 = this.k();
        if(c0.e()) {
            return (long)(((Long)c0.d()));
        }
        n n0 = n.a();
        try {
            v = this.g(((Reader)n0.b(this.m())));
        }
        catch(Throwable throwable0) {
            try {
                throw n0.c(throwable0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(n0, throwable1);
                throw throwable1;
            }
        }
        n0.close();
        return v;
    }

    public C k() {
        return C.a();
    }

    public BufferedReader l() throws IOException {
        Reader reader0 = this.m();
        return reader0 instanceof BufferedReader ? ((BufferedReader)reader0) : new BufferedReader(reader0);
    }

    public abstract Reader m() throws IOException;

    public String n() throws IOException {
        String s;
        n n0 = n.a();
        try {
            s = l.k(((Reader)n0.b(this.m())));
        }
        catch(Throwable throwable0) {
            try {
                throw n0.c(throwable0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(n0, throwable1);
                throw throwable1;
            }
        }
        n0.close();
        return s;
    }

    @o3.a
    public String o() throws IOException {
        String s;
        n n0 = n.a();
        try {
            s = ((BufferedReader)n0.b(this.l())).readLine();
        }
        catch(Throwable throwable0) {
            try {
                throw n0.c(throwable0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(n0, throwable1);
                throw throwable1;
            }
        }
        n0.close();
        return s;
    }

    public O2 p() throws IOException {
        O2 o20;
        n n0 = n.a();
        try {
            BufferedReader bufferedReader0 = (BufferedReader)n0.b(this.l());
            ArrayList arrayList0 = z3.q();
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                arrayList0.add(s);
            }
            o20 = O2.r(arrayList0);
            goto label_14;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw n0.c(throwable0);
        }
        catch(Throwable throwable1) {
            TWR.safeClose$NT(n0, throwable1);
            throw throwable1;
        }
    label_14:
        n0.close();
        return o20;
    }

    @O1.a
    @E
    public Object q(y y0) throws IOException {
        Object object0;
        H.E(y0);
        n n0 = n.a();
        try {
            object0 = l.h(((Reader)n0.b(this.m())), y0);
        }
        catch(Throwable throwable0) {
            try {
                throw n0.c(throwable0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(n0, throwable1);
                throw throwable1;
            }
        }
        n0.close();
        return object0;
    }

    public static k r(CharSequence charSequence0) {
        return charSequence0 instanceof String ? new e(((String)charSequence0)) : new b(charSequence0);
    }
}

