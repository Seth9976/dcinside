package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.k;
import com.fasterxml.jackson.databind.ser.std.M;
import com.fasterxml.jackson.databind.ser.std.Q;
import com.fasterxml.jackson.databind.ser.std.h;
import com.fasterxml.jackson.databind.ser.t.a;
import java.io.IOException;
import java.util.Calendar;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class b extends a {
    public static class com.fasterxml.jackson.databind.ext.b.a extends M implements k {
        final r d;
        static final com.fasterxml.jackson.databind.ext.b.a e;

        static {
            com.fasterxml.jackson.databind.ext.b.a.e = new com.fasterxml.jackson.databind.ext.b.a();
        }

        public com.fasterxml.jackson.databind.ext.b.a() {
            this(h.g);
        }

        protected com.fasterxml.jackson.databind.ext.b.a(r r0) {
            super(XMLGregorianCalendar.class);
            this.d = r0;
        }

        protected Calendar P(XMLGregorianCalendar xMLGregorianCalendar0) {
            return xMLGregorianCalendar0 == null ? null : xMLGregorianCalendar0.toGregorianCalendar();
        }

        public boolean Q(I i0, XMLGregorianCalendar xMLGregorianCalendar0) {
            Calendar calendar0 = this.P(xMLGregorianCalendar0);
            return this.d.h(i0, calendar0);
        }

        public void R(XMLGregorianCalendar xMLGregorianCalendar0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
            Calendar calendar0 = this.P(xMLGregorianCalendar0);
            this.d.m(calendar0, k0, i0);
        }

        public void S(XMLGregorianCalendar xMLGregorianCalendar0, com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
            c c0 = j0.o(k0, j0.h(xMLGregorianCalendar0, XMLGregorianCalendar.class, com.fasterxml.jackson.core.r.q));
            this.R(xMLGregorianCalendar0, k0, i0);
            j0.v(k0, c0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.k
        public r c(I i0, d d0) throws o {
            r r0 = i0.y0(this.d, d0);
            return r0 == this.d ? this : new com.fasterxml.jackson.databind.ext.b.a(r0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.M
        public void e(g g0, m m0) throws o {
            this.d.e(g0, null);
        }

        @Override  // com.fasterxml.jackson.databind.r
        public r f() {
            return this.d;
        }

        @Override  // com.fasterxml.jackson.databind.r
        public boolean h(I i0, Object object0) {
            return this.Q(i0, ((XMLGregorianCalendar)object0));
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.M
        public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
            this.R(((XMLGregorianCalendar)object0), k0, i0);
        }

        @Override  // com.fasterxml.jackson.databind.r
        public void n(Object object0, com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
            this.S(((XMLGregorianCalendar)object0), k0, i0, j0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.t$a
    public r b(G g0, m m0, com.fasterxml.jackson.databind.c c0) {
        Class class0 = m0.g();
        if(!Duration.class.isAssignableFrom(class0) && !QName.class.isAssignableFrom(class0)) {
            return XMLGregorianCalendar.class.isAssignableFrom(class0) ? com.fasterxml.jackson.databind.ext.b.a.e : null;
        }
        return Q.d;
    }
}

