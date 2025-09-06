package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.deser.std.q;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class a extends com.fasterxml.jackson.databind.deser.s.a {
    public static class com.fasterxml.jackson.databind.ext.a.a extends q {
        protected final int g;
        private static final long h = 1L;

        public com.fasterxml.jackson.databind.ext.a.a(Class class0, int v) {
            super(class0);
            this.g = v;
        }

        protected XMLGregorianCalendar A1(h h0, Date date0) {
            if(date0 == null) {
                return null;
            }
            GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
            gregorianCalendar0.setTime(date0);
            TimeZone timeZone0 = h0.w();
            if(timeZone0 != null) {
                gregorianCalendar0.setTimeZone(timeZone0);
            }
            return a.a.newXMLGregorianCalendar(gregorianCalendar0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.q
        public Object g(n n0, h h0) throws IOException {
            return this.g == 2 && n0.Y3(r.r) ? this.A1(h0, this.x0(n0, h0)) : super.g(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.q
        protected Object r1(String s, h h0) throws IOException {
            switch(this.g) {
                case 1: {
                    return a.a.newDuration(s);
                }
                case 2: {
                    try {
                        return this.A1(h0, this.y0(s, h0));
                    }
                    catch(o unused_ex) {
                        return a.a.newXMLGregorianCalendar(s);
                    }
                }
                case 3: {
                    return QName.valueOf(s);
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
    }

    static final DatatypeFactory a = null;
    protected static final int b = 1;
    protected static final int c = 2;
    protected static final int d = 3;

    static {
        try {
            a.a = DatatypeFactory.newInstance();
        }
        catch(DatatypeConfigurationException datatypeConfigurationException0) {
            throw new RuntimeException(datatypeConfigurationException0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public boolean a(g g0, Class class0) {
        return class0 == QName.class || class0 == XMLGregorianCalendar.class || class0 == Duration.class;
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public com.fasterxml.jackson.databind.n b(m m0, g g0, c c0) {
        Class class0 = m0.g();
        if(class0 == QName.class) {
            return new com.fasterxml.jackson.databind.ext.a.a(class0, 3);
        }
        if(class0 == XMLGregorianCalendar.class) {
            return new com.fasterxml.jackson.databind.ext.a.a(class0, 2);
        }
        return class0 == Duration.class ? new com.fasterxml.jackson.databind.ext.a.a(class0, 1) : null;
    }
}

