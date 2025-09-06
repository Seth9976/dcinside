package com.google.common.io;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

@c
@d
@q
public final class z {
    class a extends x {
        final z c;

        @Override  // com.google.common.io.x
        protected void d(String s, String s1) {
            z.this.e.add(s);
        }
    }

    private final Readable a;
    @o3.a
    private final Reader b;
    private final CharBuffer c;
    private final char[] d;
    private final Queue e;
    private final x f;

    public z(Readable readable0) {
        CharBuffer charBuffer0 = l.e();
        this.c = charBuffer0;
        this.d = charBuffer0.array();
        this.e = new ArrayDeque();
        this.f = new a(this);
        this.a = (Readable)H.E(readable0);
        this.b = readable0 instanceof Reader ? ((Reader)readable0) : null;
    }

    @O1.a
    @o3.a
    public String b() throws IOException {
        while(this.e.peek() == null) {
            w.a(this.c);
            int v = this.b == null ? this.a.read(this.c) : this.b.read(this.d, 0, this.d.length);
            if(v == -1) {
                this.f.b();
                return (String)this.e.poll();
            }
            this.f.a(this.d, 0, v);
        }
        return (String)this.e.poll();
    }
}

