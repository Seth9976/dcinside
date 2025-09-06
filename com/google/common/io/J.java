package com.google.common.io;

import J1.c;
import J1.d;
import O1.a;
import com.google.common.base.H;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import jeb.synthetic.TWR;

@c
@d
@q
public abstract class j {
    public Writer a() throws IOException {
        Writer writer0 = this.b();
        return writer0 instanceof BufferedWriter ? ((BufferedWriter)writer0) : new BufferedWriter(writer0);
    }

    public abstract Writer b() throws IOException;

    public void c(CharSequence charSequence0) throws IOException {
        H.E(charSequence0);
        n n0 = n.a();
        try {
            Writer writer0 = (Writer)n0.b(this.b());
            writer0.append(charSequence0);
            writer0.flush();
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
    }

    @a
    public long d(Readable readable0) throws IOException {
        long v;
        H.E(readable0);
        n n0 = n.a();
        try {
            Writer writer0 = (Writer)n0.b(this.b());
            v = l.b(readable0, writer0);
            writer0.flush();
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

    public void e(Iterable iterable0) throws IOException {
        this.f(iterable0, "\n");
    }

    public void f(Iterable iterable0, String s) throws IOException {
        H.E(iterable0);
        H.E(s);
        n n0 = n.a();
        try {
            Writer writer0 = (Writer)n0.b(this.a());
            for(Object object0: iterable0) {
                writer0.append(((CharSequence)object0)).append(s);
            }
            writer0.flush();
            goto label_16;
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
    label_16:
        n0.close();
    }
}

