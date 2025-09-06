package com.google.gson;

import com.google.gson.internal.n;
import com.google.gson.stream.d;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class j {
    public abstract j a();

    public BigDecimal b() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public BigInteger c() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public boolean d() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public byte g() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    @Deprecated
    public char h() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public double i() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public float j() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public int k() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public g l() {
        if(!this.u()) {
            throw new IllegalStateException("Not a JSON Array: " + this);
        }
        return (g)this;
    }

    // 去混淆评级： 低(30)
    public l m() {
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public m n() {
        if(!this.x()) {
            throw new IllegalStateException("Not a JSON Object: " + this);
        }
        return (m)this;
    }

    public p o() {
        if(!this.y()) {
            throw new IllegalStateException("Not a JSON Primitive: " + this);
        }
        return (p)this;
    }

    public long p() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public Number q() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public short r() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String t() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        try {
            StringWriter stringWriter0 = new StringWriter();
            d d0 = new d(stringWriter0);
            d0.Y(true);
            n.b(this, d0);
            return stringWriter0.toString();
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    public boolean u() {
        return this instanceof g;
    }

    public boolean v() [...] // 潜在的解密器

    public boolean x() {
        return this instanceof m;
    }

    public boolean y() {
        return this instanceof p;
    }
}

