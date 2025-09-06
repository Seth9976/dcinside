package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.std.k;
import com.fasterxml.jackson.databind.ser.t;
import com.fasterxml.jackson.databind.util.h;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class s implements Serializable {
    private final Map a;
    private final Map b;
    private static final long c = 1L;
    private static final String d = "javax.xml.";
    private static final String e = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers";
    private static final String f = "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers";
    private static final String g = "com.fasterxml.jackson.databind.ext.DOMSerializer";
    private static final String h = "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer";
    private static final String i = "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer";
    private static final Class j = null;
    private static final Class k = null;
    private static final e l = null;
    public static final s m = null;
    private static final String n = "java.sql.Timestamp";
    private static final String o = "java.sql.Date";
    private static final String p = "java.sql.Time";
    private static final String q = "java.sql.Blob";
    private static final String r = "javax.sql.rowset.serial.SerialBlob";

    static {
        s.j = Node.class;
        s.k = Document.class;
        s.l = e.d();
        s.m = new s();
    }

    protected s() {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        hashMap0.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        hashMap0.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap hashMap1 = new HashMap();
        this.b = hashMap1;
        hashMap1.put("java.sql.Timestamp", k.g);
        hashMap1.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        hashMap1.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        hashMap1.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        hashMap1.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    private boolean a(Class class0, Class class1) {
        return class1 != null && class1.isAssignableFrom(class0);
    }

    public n b(m m0, g g0, c c0) throws o {
        Class class0 = m0.g();
        e e0 = s.l;
        if(e0 != null) {
            n n0 = e0.b(class0);
            if(n0 != null) {
                return n0;
            }
        }
        if(this.a(class0, s.j)) {
            return (n)this.g("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer", m0);
        }
        if(this.a(class0, s.k)) {
            return (n)this.g("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer", m0);
        }
        String s = class0.getName();
        String s1 = (String)this.a.get(s);
        if(s1 != null) {
            return (n)this.g(s1, m0);
        }
        if(!s.startsWith("javax.xml.") && !this.e(class0, "javax.xml.")) {
            return null;
        }
        Object object0 = this.g("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers", m0);
        return object0 == null ? null : ((com.fasterxml.jackson.databind.deser.s)object0).b(m0, g0, c0);
    }

    public r c(G g0, m m0, c c0) {
        Class class0 = m0.g();
        if(this.a(class0, s.j)) {
            return (r)this.g("com.fasterxml.jackson.databind.ext.DOMSerializer", m0);
        }
        e e0 = s.l;
        if(e0 != null) {
            r r0 = e0.c(class0);
            if(r0 != null) {
                return r0;
            }
        }
        String s = class0.getName();
        Object object0 = this.b.get(s);
        if(object0 != null) {
            return object0 instanceof r ? ((r)object0) : ((r)this.g(((String)object0), m0));
        }
        if(!s.startsWith("javax.xml.") && !this.e(class0, "javax.xml.")) {
            return null;
        }
        Object object1 = this.g("com.fasterxml.jackson.databind.ext.CoreXMLSerializers", m0);
        return object1 == null ? null : ((t)object1).b(g0, m0, c0);
    }

    public boolean d(Class class0) {
        if(this.a(class0, s.j)) {
            return true;
        }
        if(this.a(class0, s.k)) {
            return true;
        }
        String s = class0.getName();
        return s.startsWith("javax.xml.") || this.e(class0, "javax.xml.") ? true : this.a.containsKey(s);
    }

    private boolean e(Class class0, String s) {
        do {
            class0 = class0.getSuperclass();
            if(class0 == null || class0 == Object.class) {
                return false;
            }
        }
        while(!class0.getName().startsWith(s));
        return true;
    }

    private Object f(Class class0, m m0) {
        try {
            return h.n(class0, false);
        }
        catch(Throwable throwable0) {
            com.fasterxml.jackson.databind.util.n.c(throwable0);
            throw new IllegalStateException("Failed to create instance of `" + class0.getName() + "` for handling values of type " + h.Q(m0) + ", problem: (" + throwable0.getClass().getName() + ") " + throwable0.getMessage());
        }
    }

    private Object g(String s, m m0) {
        try {
            return this.f(Class.forName(s), m0);
        }
        catch(Throwable throwable0) {
            com.fasterxml.jackson.databind.util.n.c(throwable0);
            throw new IllegalStateException("Failed to find class `" + s + "` for handling values of type " + h.Q(m0) + ", problem: (" + throwable0.getClass().getName() + ") " + throwable0.getMessage());
        }
    }
}

