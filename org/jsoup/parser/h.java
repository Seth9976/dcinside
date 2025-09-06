package org.jsoup.parser;

import j..util.Spliterators;
import j..util.stream.Stream;
import j..util.stream.StreamSupport;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.jsoup.helper.i;
import org.jsoup.nodes.f;
import org.jsoup.nodes.o;
import org.jsoup.nodes.t;
import org.jsoup.select.l;
import org.jsoup.select.m;

public class h implements Closeable {
    final class a implements Iterator, l {
        private final Queue a;
        private o b;
        private o c;
        private o d;
        final h e;

        a() {
            this.a = new LinkedList();
        }

        @Override  // org.jsoup.select.l
        public void a(t t0, int v) {
            if(t0 instanceof o) {
                this.d = (o)t0;
                o o0 = ((o)t0).i2();
                if(o0 != null) {
                    this.a.add(o0);
                }
            }
        }

        @Override  // org.jsoup.select.l
        public void b(t t0, int v) {
            if(t0 instanceof o) {
                o o0 = ((o)t0).y2();
                if(o0 != null) {
                    this.a.add(o0);
                }
            }
        }

        private void c() {
            if(!h.this.e && this.c == null) {
                if(!this.a.isEmpty()) {
                    this.c = (o)this.a.remove();
                    return;
                }
                while(h.this.b.z()) {
                    if(!this.a.isEmpty()) {
                        this.c = (o)this.a.remove();
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
                h.this.x();
                h.this.close();
                o o0 = this.d;
                if(o0 != null) {
                    this.c = o0;
                    this.d = null;
                }
            }
        }

        public o d() {
            this.c();
            o o0 = this.c;
            if(o0 == null) {
                throw new NoSuchElementException();
            }
            this.b = o0;
            this.c = null;
            return o0;
        }

        void e() {
            this.a.clear();
            this.d = null;
            this.c = null;
            this.b = null;
            h.this.e = false;
        }

        @Override
        public boolean hasNext() {
            this.c();
            return this.c != null;
        }

        @Override
        public Object next() {
            return this.d();
        }

        @Override
        public void remove() {
            o o0 = this.b;
            if(o0 == null) {
                throw new NoSuchElementException();
            }
            o0.d0();
        }
    }

    private final g a;
    private final v b;
    private final a c;
    private f d;
    private boolean e;

    public h(g g0) {
        a h$a0 = new a(this);
        this.c = h$a0;
        this.e = false;
        this.a = g0;
        v v0 = g0.c();
        this.b = v0;
        v0.n(h$a0);
    }

    public Stream L() {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(this.c, 273), false);
    }

    @Override
    public void close() {
        this.b.a();
    }

    public f e() throws IOException {
        f f0 = this.i();
        this.b.y();
        return f0;
    }

    public List f() throws IOException {
        this.b.y();
        return this.b.b();
    }

    public f i() {
        f f0 = this.b.d;
        this.d = f0;
        i.p(f0, "Must run parse() before calling.");
        return this.d;
    }

    public Iterator iterator() {
        return this.c;
    }

    public o j(String s) throws IOException {
        return (o)i.c(this.s(s), "No elements matched the query \'%s\' in the document.", new Object[]{s});
    }

    public o k(String s) throws IOException {
        return (o)i.c(this.v(s), "No elements matched the query \'%s\' in the document.", new Object[]{s});
    }

    public h n(Reader reader0, String s) {
        this.close();
        this.c.e();
        this.b.j(reader0, s, this.a);
        this.d = this.b.d;
        return this;
    }

    public h o(String s, String s1) {
        return this.n(new StringReader(s), s1);
    }

    public h p(Reader reader0, o o0, String s) {
        this.n(reader0, s);
        this.b.k(o0);
        return this;
    }

    public h q(String s, o o0, String s1) {
        return this.p(new StringReader(s), o0, s1);
    }

    public o s(String s) throws IOException {
        return this.t(m.t(s));
    }

    public o t(org.jsoup.select.g g0) throws IOException {
        o o0 = this.i().H2(g0);
        return o0 == null ? this.w(g0) : o0;
    }

    public o v(String s) throws IOException {
        return this.w(m.t(s));
    }

    public o w(org.jsoup.select.g g0) throws IOException {
        try {
            f f0 = this.i();
            return (o)this.L().filter(g0.b(f0)).findFirst().orElse(null);
        }
        catch(UncheckedIOException uncheckedIOException0) {
            throw uncheckedIOException0.getCause();
        }
    }

    public h x() {
        this.e = true;
        return this;
    }
}

