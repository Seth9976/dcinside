package com.google.gson;

import com.google.gson.internal.n;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import com.google.gson.stream.e;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class o {
    @Deprecated
    public j a(a a0) throws k, t {
        return o.d(a0);
    }

    @Deprecated
    public j b(Reader reader0) throws k, t {
        return o.e(reader0);
    }

    @Deprecated
    public j c(String s) throws t {
        return o.f(s);
    }

    public static j d(a a0) throws k, t {
        boolean z = a0.q();
        a0.E0(true);
        try {
            return n.a(a0);
        }
        catch(StackOverflowError stackOverflowError0) {
            throw new com.google.gson.n("Failed parsing JSON source: " + a0 + " to Json", stackOverflowError0);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            throw new com.google.gson.n("Failed parsing JSON source: " + a0 + " to Json", outOfMemoryError0);
        }
        finally {
            a0.E0(z);
        }
    }

    public static j e(Reader reader0) throws k, t {
        try {
            a a0 = new a(reader0);
            j j0 = o.d(a0);
            if(a0.f0() != c.j) {
                throw new t("Did not consume the entire document.");
            }
            return j0;
        }
        catch(e e0) {
            throw new t(e0);
        }
        catch(IOException iOException0) {
            throw new k(iOException0);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new t(numberFormatException0);
        }
    }

    public static j f(String s) throws t {
        return o.e(new StringReader(s));
    }
}

