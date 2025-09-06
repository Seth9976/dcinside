package org.bson.json;

import j..util.DesugarTimeZone;
import java.io.Reader;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.bson.G;
import org.bson.Q;
import org.bson.S;
import org.bson.W;
import org.bson.X;
import org.bson.Y;
import org.bson.a.d;
import org.bson.a;
import org.bson.h;
import org.bson.o;
import org.bson.q;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.bson.types.g;
import org.bson.u;

public class w extends a {
    static class org.bson.json.w.a {
        static final int[] a;
        static final int[] b;
        static final int[] c;

        static {
            int[] arr_v = new int[X.values().length];
            org.bson.json.w.a.c = arr_v;
            try {
                arr_v[X.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.j.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.k.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.c.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.r.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.t.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.u.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.o.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.q.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.w.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.v.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.l.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.i.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.m.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.d.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.p.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.s.ordinal()] = 19;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.c[X.h.ordinal()] = 20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[u.values().length];
            org.bson.json.w.a.b = arr_v1;
            try {
                arr_v1[u.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.b[u.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.b[u.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.b[u.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.b[u.a.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v2 = new int[D.values().length];
            org.bson.json.w.a.a = arr_v2;
            try {
                arr_v2[D.n.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.a[D.o.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.a[D.g.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.a[D.b.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.a[D.c.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.a[D.j.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.a[D.p.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.a[D.k.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.a[D.l.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.a[D.m.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.json.w.a.a[D.i.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public class b extends org.bson.a.b {
        final w d;

        protected b(org.bson.a.b a$b0, u u0) {
            super(a$b0, u0);
        }

        @Override  // org.bson.a$b
        protected u c() {
            return super.c();
        }

        @Override  // org.bson.a$b
        protected org.bson.a.b d() {
            return this.e();
        }

        protected b e() {
            return (b)super.d();
        }
    }

    public class c extends org.bson.a.c {
        private final C g;
        private final Object h;
        private final int i;
        final w j;

        protected c() {
            this.g = w0.g;
            this.h = w0.h;
            this.i = w0.f.b();
        }

        public void c() {
            w.this.f.a(this.i);
        }

        @Override  // org.bson.a$c
        public void reset() {
            super.reset();
            w.this.g = this.g;
            w.this.h = this.h;
            w.this.f.d(this.i);
            b w$b0 = new b(w.this, this.b(), this.a());
            w.this.i1(w$b0);
        }
    }

    private final x f;
    private C g;
    private Object h;
    private c i;

    public w(Reader reader0) {
        this(new x(reader0));
    }

    public w(String s) {
        this(new x(s));
    }

    private w(x x0) {
        this.f = x0;
        this.i1(new b(this, null, u.a));
    }

    protected b A2() {
        return (b)super.c1();
    }

    @Override  // org.bson.P
    @Deprecated
    public void B() {
        if(this.i != null) {
            throw new h("A mark already exists; it needs to be reset before creating a new one");
        }
        this.i = new c(this);
    }

    private org.bson.w B3() {
        ObjectId objectId0;
        String s1;
        D d0 = D.h;
        this.e3(d0);
        this.e3(D.c);
        String s = this.Y2();
        if(s.equals("$ref")) {
            this.e3(d0);
            s1 = this.Y2();
            this.e3(D.i);
            this.b3("$id");
            objectId0 = this.P2();
            this.e3(D.g);
        }
        else if(s.equals("$id")) {
            objectId0 = this.P2();
            this.e3(D.i);
            this.b3("$ref");
            this.e3(d0);
            s1 = this.Y2();
        }
        else {
            throw new v("Expected $ref and $id fields in $dbPointer document but found " + s);
        }
        this.e3(D.g);
        return new org.bson.w(s1, objectId0);
    }

    private C C2() {
        C c0 = this.g;
        if(c0 != null) {
            this.g = null;
            return c0;
        }
        return this.f.c();
    }

    private void C3() {
        C c0 = this.C2();
        if(c0.a() == D.e) {
            this.e3(D.f);
            return;
        }
        this.I2(c0);
    }

    @Override  // org.bson.a
    protected String E0() {
        return (String)this.h;
    }

    private void E3() {
        C c0 = this.C2();
        String s = (String)c0.c(String.class);
        D d0 = c0.a();
        if(d0 == D.n || d0 == D.o) {
            if("$binary".equals(s) || "$type".equals(s)) {
                o o0 = this.p3(s);
                this.h = o0;
                if(o0 != null) {
                    this.j1(X.g);
                    return;
                }
            }
            else if(!"$regex".equals(s) && !"$options".equals(s)) {
                if("$code".equals(s)) {
                    this.S3();
                    return;
                }
                if("$date".equals(s)) {
                    this.h = this.y3();
                    this.j1(X.k);
                    return;
                }
                if("$maxKey".equals(s)) {
                    this.h = this.Y3();
                    this.j1(X.w);
                    return;
                }
                if("$minKey".equals(s)) {
                    this.h = this.Z3();
                    this.j1(X.v);
                    return;
                }
                if("$oid".equals(s)) {
                    this.h = this.k4();
                    this.j1(X.i);
                    return;
                }
                if("$regularExpression".equals(s)) {
                    this.h = this.b4();
                    this.j1(X.m);
                    return;
                }
                if("$symbol".equals(s)) {
                    this.h = this.n4();
                    this.j1(X.p);
                    return;
                }
                if("$timestamp".equals(s)) {
                    this.h = this.p4();
                    this.j1(X.s);
                    return;
                }
                if("$undefined".equals(s)) {
                    this.h = this.r4();
                    this.j1(X.h);
                    return;
                }
                if("$numberLong".equals(s)) {
                    this.h = this.i4();
                    this.j1(X.t);
                    return;
                }
                if("$numberInt".equals(s)) {
                    this.h = this.g4();
                    this.j1(X.r);
                    return;
                }
                if("$numberDouble".equals(s)) {
                    this.h = this.e4();
                    this.j1(X.c);
                    return;
                }
                if("$numberDecimal".equals(s)) {
                    this.h = this.d4();
                    this.j1(X.u);
                    return;
                }
                if("$dbPointer".equals(s)) {
                    this.h = this.B3();
                    this.j1(X.n);
                    return;
                }
            }
            else {
                S s1 = this.m4(s);
                this.h = s1;
                if(s1 != null) {
                    this.j1(X.m);
                    return;
                }
            }
        }
        this.I2(c0);
        this.j1(X.e);
    }

    private o F3() {
        this.e3(D.e);
        C c0 = this.C2();
        if(c0.a() != D.k) {
            throw new v("JSON reader expected a binary subtype but found \'%s\'.", new Object[]{c0.b()});
        }
        this.e3(D.i);
        String s = this.Y2();
        this.e3(D.f);
        if((s.length() & 1) != 0) {
            s = "0" + s;
        }
        q[] arr_q = q.values();
        for(int v = 0; v < arr_q.length; ++v) {
            q q0 = arr_q[v];
            if(q0.a() == ((int)(((Integer)c0.c(Integer.class))))) {
                return new o(q0, w.t2(s));
            }
        }
        return new o(w.t2(s));
    }

    private void I2(C c0) {
        if(this.g != null) {
            throw new G("There is already a pending token.");
        }
        this.g = c0;
    }

    @Override  // org.bson.a
    protected void L() {
        this.i1(this.A2().e());
        if(this.A2() != null && this.A2().c() == u.e) {
            this.i1(this.A2().e());
            this.e3(D.g);
        }
        if(this.A2() == null) {
            throw new v("Unexpected end of document.");
        }
        if(this.A2().c() == u.c || this.A2().c() == u.b) {
            C c0 = this.C2();
            if(c0.a() != D.i) {
                this.I2(c0);
            }
        }
    }

    @Override  // org.bson.a
    protected String L0() {
        return (String)this.h;
    }

    private byte L2() {
        C c0 = this.C2();
        D d0 = D.n;
        if(c0.a() != d0 && c0.a() != D.k) {
            throw new v("JSON reader expected a string or number but found \'%s\'.", new Object[]{c0.b()});
        }
        return c0.a() == d0 ? ((byte)Integer.parseInt(((String)c0.c(String.class)), 16)) : ((Integer)c0.c(Integer.class)).byteValue();
    }

    private long N3() {
        this.e3(D.e);
        C c0 = this.C2();
        D d0 = D.f;
        if(c0.a() == d0) {
            return new Date().getTime();
        }
        if(c0.a() != D.n) {
            throw new v("JSON reader expected a string but found \'%s\'.", new Object[]{c0.b()});
        }
        this.e3(d0);
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        ParsePosition parsePosition0 = new ParsePosition(0);
        String s = (String)c0.c(String.class);
        if(s.endsWith("Z")) {
            s = s.substring(0, s.length() - 1) + "GMT-00:00";
        }
        for(int v = 0; v < 3; ++v) {
            simpleDateFormat0.applyPattern(new String[]{"yyyy-MM-dd", "yyyy-MM-dd\'T\'HH:mm:ssz", "yyyy-MM-dd\'T\'HH:mm:ss.SSSz"}[v]);
            simpleDateFormat0.setLenient(true);
            parsePosition0.setIndex(0);
            Date date0 = simpleDateFormat0.parse(s, parsePosition0);
            if(date0 != null && parsePosition0.getIndex() == s.length()) {
                return date0.getTime();
            }
        }
        throw new v("Invalid date format.");
    }

    @Override  // org.bson.P
    public Q P1() {
        return new c(this);
    }

    private ObjectId P2() {
        this.e3(D.h);
        this.e3(D.c);
        this.i3(D.n, "$oid");
        return this.k4();
    }

    @Override  // org.bson.a
    protected int Q() {
        return (int)(((Integer)this.h));
    }

    @Override  // org.bson.a
    protected long R() {
        return (long)(((Long)this.h));
    }

    private int R2() {
        C c0 = this.C2();
        if(c0.a() == D.k) {
            return (int)(((Integer)c0.c(Integer.class)));
        }
        if(c0.a() != D.l) {
            throw new v("JSON reader expected an integer but found \'%s\'.", new Object[]{c0.b()});
        }
        return ((Long)c0.c(Long.class)).intValue();
    }

    private void S3() {
        D d0 = D.h;
        this.e3(d0);
        String s = this.Y2();
        C c0 = this.C2();
        switch(c0.a()) {
            case 3: {
                this.h = s;
                this.j1(X.o);
                return;
            }
            case 11: {
                this.b3("$scope");
                this.e3(d0);
                this.t1(d.d);
                this.h = s;
                this.j1(X.q);
                this.i1(new b(this, this.A2(), u.e));
                return;
            }
            default: {
                throw new v("JSON reader expected \',\' or \'}\' but found \'%s\'.", new Object[]{c0});
            }
        }
    }

    @Override  // org.bson.a
    protected String T() {
        return (String)this.h;
    }

    @Override  // org.bson.a
    protected W T0() {
        return (W)this.h;
    }

    @Override  // org.bson.a
    public X T2() {
        if(!this.isClosed()) {
            if(this.h1() == d.a || this.h1() == d.h || this.h1() == d.e) {
                this.t1(d.b);
            }
            d a$d0 = d.b;
            if(this.h1() != a$d0) {
                this.N1("readBSONType", new d[]{a$d0});
            }
            u u0 = this.A2().c();
            u u1 = u.b;
            Class class0 = String.class;
            if(u0 == u1) {
                C c0 = this.C2();
                int v = org.bson.json.w.a.a[c0.a().ordinal()];
                if(v != 1) {
                    switch(v) {
                        case 2: {
                            break;
                        }
                        case 3: {
                            this.t1(d.f);
                            return X.b;
                        }
                        default: {
                            throw new v("JSON reader was expecting a name but found \'%s\'.", new Object[]{c0.b()});
                        }
                    }
                }
                this.l1(((String)c0.c(class0)));
                C c1 = this.C2();
                if(c1.a() != D.h) {
                    throw new v("JSON reader was expecting \':\' but found \'%s\'.", new Object[]{c1.b()});
                }
            }
            C c2 = this.C2();
            u u2 = this.A2().c();
            u u3 = u.c;
            if(u2 == u3 && c2.a() == D.d) {
                this.t1(d.g);
                return X.b;
            }
            switch(c2.a()) {
                case 1: {
                    this.j1(X.d);
                    this.h = c2.b();
                    break;
                }
                case 2: {
                    String s = (String)c2.c(class0);
                    if("false".equals(s) || "true".equals(s)) {
                        this.j1(X.j);
                        this.h = Boolean.valueOf(Boolean.parseBoolean(s));
                    }
                    else if("Infinity".equals(s)) {
                        this.j1(X.c);
                        this.h = Infinity;
                    }
                    else if("NaN".equals(s)) {
                        this.j1(X.c);
                        this.h = NaN;
                    }
                    else if("null".equals(s)) {
                        this.j1(X.l);
                    }
                    else if("undefined".equals(s)) {
                        this.j1(X.h);
                    }
                    else if("MinKey".equals(s)) {
                        this.C3();
                        this.j1(X.v);
                        this.h = new org.bson.types.h();
                    }
                    else if("MaxKey".equals(s)) {
                        this.C3();
                        this.j1(X.w);
                        this.h = new g();
                    }
                    else if("BinData".equals(s)) {
                        this.j1(X.g);
                        this.h = this.n3();
                    }
                    else if("Date".equals(s)) {
                        this.h = this.v3();
                        this.j1(X.d);
                    }
                    else if("HexData".equals(s)) {
                        this.j1(X.g);
                        this.h = this.F3();
                    }
                    else if("ISODate".equals(s)) {
                        this.j1(X.k);
                        this.h = this.N3();
                    }
                    else if("NumberInt".equals(s)) {
                        this.j1(X.r);
                        this.h = this.f4();
                    }
                    else if("NumberLong".equals(s)) {
                        this.j1(X.t);
                        this.h = this.h4();
                    }
                    else if("NumberDecimal".equals(s)) {
                        this.j1(X.u);
                        this.h = this.c4();
                    }
                    else if("ObjectId".equals(s)) {
                        this.j1(X.i);
                        this.h = this.j4();
                    }
                    else if("Timestamp".equals(s)) {
                        this.j1(X.s);
                        this.h = this.o4();
                    }
                    else if("RegExp".equals(s)) {
                        this.j1(X.m);
                        this.h = this.l4();
                    }
                    else if("DBPointer".equals(s)) {
                        this.j1(X.n);
                        this.h = this.r3();
                    }
                    else if("UUID".equals(s) || "GUID".equals(s) || "CSUUID".equals(s) || "CSGUID".equals(s) || "JUUID".equals(s) || "JGUID".equals(s) || "PYUUID".equals(s) || "PYGUID".equals(s)) {
                        this.j1(X.g);
                        this.h = this.q4(s);
                    }
                    else {
                        if(!"new".equals(s)) {
                            throw new v("JSON reader was expecting a value but found \'%s\'.", new Object[]{c2.b()});
                        }
                        this.a4();
                        break;
                    }
                    break;
                }
                case 4: {
                    this.j1(X.f);
                    break;
                }
                case 5: {
                    this.E3();
                    break;
                }
                case 6: {
                    this.j1(X.c);
                    this.h = c2.b();
                    break;
                }
                case 7: {
                    this.j1(X.b);
                    break;
                }
                case 8: {
                    this.j1(X.r);
                    this.h = c2.b();
                    break;
                }
                case 9: {
                    this.j1(X.t);
                    this.h = c2.b();
                    break;
                }
                case 10: {
                    this.j1(X.m);
                    this.h = c2.b();
                    break;
                }
                default: {
                    throw new v("JSON reader was expecting a value but found \'%s\'.", new Object[]{c2.b()});
                }
            }
            if(this.A2().c() == u3 || this.A2().c() == u1) {
                C c3 = this.C2();
                if(c3.a() != D.i) {
                    this.I2(c3);
                }
            }
            switch(this.A2().c()) {
                case 3: 
                case 4: 
                case 5: {
                    this.t1(d.d);
                    return this.z0();
                }
                default: {
                    this.t1(d.c);
                    return this.z0();
                }
            }
        }
        throw new IllegalStateException("This instance has been closed");
    }

    private o T3(String s) {
        o o0;
        int v;
        byte[] arr_b;
        c w$c0 = new c(this);
        try {
            try {
                D d0 = D.h;
                this.e3(d0);
                if(s.equals("$binary")) {
                    arr_b = org.bson.internal.a.b(this.Y2());
                    this.e3(D.i);
                    this.b3("$type");
                    this.e3(d0);
                    v = this.L2();
                }
                else {
                    int v1 = this.L2();
                    this.e3(D.i);
                    this.b3("$binary");
                    this.e3(d0);
                    v = v1;
                    arr_b = org.bson.internal.a.b(this.Y2());
                }
                this.e3(D.g);
                o0 = new o(((byte)v), arr_b);
                goto label_29;
            }
            catch(v unused_ex) {
            }
            catch(NumberFormatException unused_ex) {
                goto label_24;
            }
            w$c0.reset();
        }
        catch(Throwable throwable0) {
            w$c0.c();
            throw throwable0;
        }
        w$c0.c();
        return null;
        try {
        label_24:
            w$c0.reset();
        }
        catch(Throwable throwable0) {
            w$c0.c();
            throw throwable0;
        }
        w$c0.c();
        return null;
    label_29:
        w$c0.c();
        return o0;
    }

    @Override  // org.bson.a
    protected String Y() {
        return (String)this.h;
    }

    @Override  // org.bson.a
    protected void Y0() {
    }

    private String Y2() {
        C c0 = this.C2();
        if(c0.a() != D.n) {
            throw new v("JSON reader expected a string but found \'%s\'.", new Object[]{c0.b()});
        }
        return (String)c0.c(String.class);
    }

    private g Y3() {
        this.e3(D.h);
        this.i3(D.k, 1);
        this.e3(D.g);
        return new g();
    }

    private org.bson.types.h Z3() {
        this.e3(D.h);
        this.i3(D.k, 1);
        this.e3(D.g);
        return new org.bson.types.h();
    }

    @Override  // org.bson.a
    protected void a1() {
    }

    private void a4() {
        C c0 = this.C2();
        if(c0.a() != D.o) {
            throw new v("JSON reader expected a type name but found \'%s\'.", new Object[]{c0.b()});
        }
        String s = (String)c0.c(String.class);
        if("MinKey".equals(s)) {
            this.C3();
            this.j1(X.v);
            this.h = new org.bson.types.h();
            return;
        }
        if("MaxKey".equals(s)) {
            this.C3();
            this.j1(X.w);
            this.h = new g();
            return;
        }
        if("BinData".equals(s)) {
            this.h = this.n3();
            this.j1(X.g);
            return;
        }
        if("Date".equals(s)) {
            this.h = this.s3();
            this.j1(X.k);
            return;
        }
        if("HexData".equals(s)) {
            this.h = this.F3();
            this.j1(X.g);
            return;
        }
        if("ISODate".equals(s)) {
            this.h = this.N3();
            this.j1(X.k);
            return;
        }
        if("NumberInt".equals(s)) {
            this.h = this.f4();
            this.j1(X.r);
            return;
        }
        if("NumberLong".equals(s)) {
            this.h = this.h4();
            this.j1(X.t);
            return;
        }
        if("NumberDecimal".equals(s)) {
            this.h = this.c4();
            this.j1(X.u);
            return;
        }
        if("ObjectId".equals(s)) {
            this.h = this.j4();
            this.j1(X.i);
            return;
        }
        if("RegExp".equals(s)) {
            this.h = this.l4();
            this.j1(X.m);
            return;
        }
        if("DBPointer".equals(s)) {
            this.h = this.r3();
            this.j1(X.n);
            return;
        }
        if(!"UUID".equals(s) && !"GUID".equals(s) && !"CSUUID".equals(s) && !"CSGUID".equals(s) && !"JUUID".equals(s) && !"JGUID".equals(s) && !"PYUUID".equals(s) && !"PYGUID".equals(s)) {
            throw new v("JSON reader expected a type name but found \'%s\'.", new Object[]{s});
        }
        this.h = this.q4(s);
        this.j1(X.g);
    }

    @Override  // org.bson.a
    protected void b1() {
        switch(this.z0()) {
            case 1: {
                this.q3();
                while(this.T2() != X.b) {
                    this.Y1();
                }
                this.v1();
                return;
            }
            case 2: {
                this.B0();
                return;
            }
            case 3: {
                this.readBoolean();
                return;
            }
            case 4: {
                this.m3();
                return;
            }
            case 5: {
                this.g0();
                while(this.T2() != X.b) {
                    this.g1();
                    this.Y1();
                }
                this.E1();
                return;
            }
            case 6: {
                this.readDouble();
                return;
            }
            case 7: {
                this.readInt32();
                return;
            }
            case 8: {
                this.readInt64();
                return;
            }
            case 9: {
                this.U1();
                return;
            }
            case 10: {
                this.C1();
                return;
            }
            case 11: {
                this.y2();
                this.g0();
                while(this.T2() != X.b) {
                    this.g1();
                    this.Y1();
                }
                this.E1();
                return;
            }
            case 12: {
                this.s1();
                return;
            }
            case 13: {
                this.V0();
                return;
            }
            case 14: {
                this.o0();
                return;
            }
            case 15: {
                this.H();
                return;
            }
            case 16: {
                this.m0();
                return;
            }
            case 17: {
                this.readString();
                return;
            }
            case 18: {
                this.c2();
                return;
            }
            case 19: {
                this.U0();
                return;
            }
            case 20: {
                this.G1();
            }
        }
    }

    private void b3(String s) {
        if(s == null) {
            throw new IllegalArgumentException("Can\'t be null");
        }
        C c0 = this.C2();
        D d0 = c0.a();
        if(d0 != D.n && d0 != D.o || !s.equals(c0.b())) {
            throw new v("JSON reader expected \'%s\' but found \'%s\'.", new Object[]{s, c0.b()});
        }
    }

    private S b4() {
        String s2;
        String s1;
        D d0 = D.h;
        this.e3(d0);
        this.e3(D.c);
        String s = this.Y2();
        if(s.equals("pattern")) {
            this.e3(d0);
            s1 = this.Y2();
            this.e3(D.i);
            this.b3("options");
            this.e3(d0);
            s2 = this.Y2();
        }
        else if(s.equals("options")) {
            this.e3(d0);
            String s3 = this.Y2();
            this.e3(D.i);
            this.b3("pattern");
            this.e3(d0);
            s1 = this.Y2();
            s2 = s3;
        }
        else {
            throw new v("Expected \'t\' and \'i\' fields in $timestamp document but found " + s);
        }
        this.e3(D.g);
        this.e3(D.g);
        return new S(s1, s2);
    }

    @Override  // org.bson.a
    protected org.bson.a.b c1() {
        return this.A2();
    }

    private Decimal128 c4() {
        Decimal128 decimal1280;
        this.e3(D.e);
        C c0 = this.C2();
        if(c0.a() == D.k || c0.a() == D.l || c0.a() == D.j) {
            decimal1280 = (Decimal128)c0.c(Decimal128.class);
        }
        else {
            if(c0.a() != D.n) {
                throw new v("JSON reader expected a number or a string but found \'%s\'.", new Object[]{c0.b()});
            }
            decimal1280 = Decimal128.r(((String)c0.c(String.class)));
        }
        this.e3(D.f);
        return decimal1280;
    }

    @Override  // org.bson.a
    protected void d0() {
    }

    private Decimal128 d4() {
        Decimal128 decimal1280;
        this.e3(D.h);
        String s = this.Y2();
        try {
            decimal1280 = Decimal128.r(s);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new v(String.format("Exception converting value \'%s\' to type %s", s, "org.bson.types.Decimal128"), new Object[]{numberFormatException0});
        }
        this.e3(D.g);
        return decimal1280;
    }

    @Override  // org.bson.a
    protected void e0() {
    }

    private void e3(D d0) {
        C c0 = this.C2();
        if(d0 != c0.a()) {
            throw new v("JSON reader expected token type \'%s\' but found \'%s\'.", new Object[]{d0, c0.b()});
        }
    }

    private Double e4() {
        Double double0;
        this.e3(D.h);
        String s = this.Y2();
        try {
            double0 = Double.valueOf(s);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new v(String.format("Exception converting value \'%s\' to type %s", s, "java.lang.Double"), new Object[]{numberFormatException0});
        }
        this.e3(D.g);
        return double0;
    }

    @Override  // org.bson.a
    protected void f0() {
    }

    private int f4() {
        int v;
        this.e3(D.e);
        C c0 = this.C2();
        if(c0.a() == D.k) {
            v = (int)(((Integer)c0.c(Integer.class)));
        }
        else if(c0.a() == D.n) {
            v = Integer.parseInt(((String)c0.c(String.class)));
        }
        else {
            throw new v("JSON reader expected an integer or a string but found \'%s\'.", new Object[]{c0.b()});
        }
        this.e3(D.f);
        return v;
    }

    private Integer g4() {
        Integer integer0;
        this.e3(D.h);
        String s = this.Y2();
        try {
            integer0 = Integer.valueOf(s);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new v(String.format("Exception converting value \'%s\' to type %s", s, "java.lang.Integer"), new Object[]{numberFormatException0});
        }
        this.e3(D.g);
        return integer0;
    }

    @Override  // org.bson.a
    protected ObjectId h0() {
        return (ObjectId)this.h;
    }

    private long h4() {
        long v;
        this.e3(D.e);
        C c0 = this.C2();
        if(c0.a() == D.k || c0.a() == D.l) {
            v = (long)(((Long)c0.c(Long.class)));
        }
        else {
            if(c0.a() != D.n) {
                throw new v("JSON reader expected an integer or a string but found \'%s\'.", new Object[]{c0.b()});
            }
            v = Long.parseLong(((String)c0.c(String.class)));
        }
        this.e3(D.f);
        return v;
    }

    private void i3(D d0, Object object0) {
        C c0 = this.C2();
        if(d0 != c0.a()) {
            throw new v("JSON reader expected token type \'%s\' but found \'%s\'.", new Object[]{d0, c0.b()});
        }
        if(!object0.equals(c0.b())) {
            throw new v("JSON reader expected \'%s\' but found \'%s\'.", new Object[]{object0, c0.b()});
        }
    }

    private Long i4() {
        Long long0;
        this.e3(D.h);
        String s = this.Y2();
        try {
            long0 = Long.valueOf(s);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new v(String.format("Exception converting value \'%s\' to type %s", s, "java.lang.Long"), new Object[]{numberFormatException0});
        }
        this.e3(D.g);
        return long0;
    }

    private ObjectId j4() {
        this.e3(D.e);
        ObjectId objectId0 = new ObjectId(this.Y2());
        this.e3(D.f);
        return objectId0;
    }

    private ObjectId k4() {
        this.e3(D.h);
        ObjectId objectId0 = new ObjectId(this.Y2());
        this.e3(D.g);
        return objectId0;
    }

    @Override  // org.bson.a
    protected S l0() {
        return (S)this.h;
    }

    private S l4() {
        String s1;
        this.e3(D.e);
        String s = this.Y2();
        C c0 = this.C2();
        if(c0.a() == D.i) {
            s1 = this.Y2();
        }
        else {
            this.I2(c0);
            s1 = "";
        }
        this.e3(D.f);
        return new S(s, s1);
    }

    private S m4(String s) {
        S s4;
        String s2;
        String s1;
        c w$c0 = new c(this);
        try {
            try {
                D d0 = D.h;
                this.e3(d0);
                if(s.equals("$regex")) {
                    s1 = this.Y2();
                    this.e3(D.i);
                    this.b3("$options");
                    this.e3(d0);
                    s2 = this.Y2();
                }
                else {
                    String s3 = this.Y2();
                    this.e3(D.i);
                    this.b3("$regex");
                    this.e3(d0);
                    s2 = s3;
                    s1 = this.Y2();
                }
                this.e3(D.g);
                s4 = new S(s1, s2);
                goto label_26;
            }
            catch(v unused_ex) {
            }
            w$c0.reset();
        }
        catch(Throwable throwable0) {
            w$c0.c();
            throw throwable0;
        }
        w$c0.c();
        return null;
    label_26:
        w$c0.c();
        return s4;
    }

    @Override  // org.bson.a
    protected int n() {
        return this.p().n0().length;
    }

    private o n3() {
        this.e3(D.e);
        C c0 = this.C2();
        if(c0.a() != D.k) {
            throw new v("JSON reader expected a binary subtype but found \'%s\'.", new Object[]{c0.b()});
        }
        this.e3(D.i);
        C c1 = this.C2();
        if(c1.a() != D.o && c1.a() != D.n) {
            throw new v("JSON reader expected a string but found \'%s\'.", new Object[]{c1.b()});
        }
        this.e3(D.f);
        byte[] arr_b = org.bson.internal.a.b(((String)c1.c(String.class)));
        return new o(((Integer)c0.c(Integer.class)).byteValue(), arr_b);
    }

    private String n4() {
        this.e3(D.h);
        String s = this.Y2();
        this.e3(D.g);
        return s;
    }

    @Override  // org.bson.a
    protected byte o() {
        return this.p().o0();
    }

    private W o4() {
        this.e3(D.e);
        C c0 = this.C2();
        D d0 = D.k;
        if(c0.a() != d0) {
            throw new v("JSON reader expected an integer but found \'%s\'.", new Object[]{c0.b()});
        }
        Class class0 = Integer.class;
        int v = (int)(((Integer)c0.c(class0)));
        this.e3(D.i);
        C c1 = this.C2();
        if(c1.a() != d0) {
            throw new v("JSON reader expected an integer but found \'%s\'.", new Object[]{c0.b()});
        }
        int v1 = (int)(((Integer)c1.c(class0)));
        this.e3(D.f);
        return new W(v, v1);
    }

    @Override  // org.bson.a
    protected o p() {
        return (o)this.h;
    }

    private o p3(String s) {
        o o2;
        o o1;
        o o0;
        byte[] arr_b;
        int v1;
        c w$c0 = new c(this);
        try {
            D d0 = D.h;
            this.e3(d0);
            if(s.equals("$binary")) {
                if(this.C2().a() == D.c) {
                    String s1 = (String)this.C2().c(String.class);
                    if(s1.equals("base64")) {
                        this.e3(d0);
                        arr_b = org.bson.internal.a.b(this.Y2());
                        this.e3(D.i);
                        this.b3("subType");
                        this.e3(d0);
                        v1 = this.L2();
                    }
                    else {
                        if(!s1.equals("subType")) {
                            throw new v("Unexpected key for $binary: " + s1);
                        }
                        this.e3(d0);
                        int v = this.L2();
                        this.e3(D.i);
                        this.b3("base64");
                        this.e3(d0);
                        v1 = v;
                        arr_b = org.bson.internal.a.b(this.Y2());
                    }
                    this.e3(D.g);
                    this.e3(D.g);
                    o0 = new o(((byte)v1), arr_b);
                    goto label_26;
                }
                goto label_28;
            }
            goto label_32;
        }
        catch(Throwable throwable0) {
            w$c0.c();
            throw throwable0;
        }
    label_26:
        w$c0.c();
        return o0;
        try {
        label_28:
            w$c0.reset();
            o1 = this.T3(s);
        }
        catch(Throwable throwable0) {
            w$c0.c();
            throw throwable0;
        }
        w$c0.c();
        return o1;
        try {
        label_32:
            w$c0.reset();
            o2 = this.T3(s);
        }
        catch(Throwable throwable0) {
            w$c0.c();
            throw throwable0;
        }
        w$c0.c();
        return o2;
    }

    private W p4() {
        int v1;
        int v;
        D d0 = D.h;
        this.e3(d0);
        this.e3(D.c);
        String s = this.Y2();
        if(s.equals("t")) {
            this.e3(d0);
            v = this.R2();
            this.e3(D.i);
            this.b3("i");
            this.e3(d0);
            v1 = this.R2();
        }
        else if(s.equals("i")) {
            this.e3(d0);
            int v2 = this.R2();
            this.e3(D.i);
            this.b3("t");
            this.e3(d0);
            v = this.R2();
            v1 = v2;
        }
        else {
            throw new v("Expected \'t\' and \'i\' fields in $timestamp document but found " + s);
        }
        this.e3(D.g);
        this.e3(D.g);
        return new W(v, v1);
    }

    @Override  // org.bson.a
    protected boolean q() {
        return ((Boolean)this.h).booleanValue();
    }

    private o q4(String s) {
        this.e3(D.e);
        String s1 = this.Y2().replaceAll("\\{", "").replaceAll("}", "").replaceAll("-", "");
        this.e3(D.f);
        byte[] arr_b = w.t2(s1);
        return new o(("UUID".equals(s) && "GUID".equals(s) ? q.f : q.e), arr_b);
    }

    private org.bson.w r3() {
        this.e3(D.e);
        String s = this.Y2();
        this.e3(D.i);
        ObjectId objectId0 = new ObjectId(this.Y2());
        this.e3(D.f);
        return new org.bson.w(s, objectId0);
    }

    private Y r4() {
        this.e3(D.h);
        C c0 = this.C2();
        if(!((String)c0.c(String.class)).equals("true")) {
            throw new v("JSON reader requires $undefined to have the value of true but found \'%s\'.", new Object[]{c0.b()});
        }
        this.e3(D.g);
        return new Y();
    }

    @Override  // org.bson.P
    @Deprecated
    public void reset() {
        c w$c0 = this.i;
        if(w$c0 == null) {
            throw new h("trying to reset a mark before creating it");
        }
        w$c0.reset();
        this.i = null;
    }

    @Override  // org.bson.a
    protected org.bson.w s() {
        return (org.bson.w)this.h;
    }

    private long s3() {
        C c1;
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss z", Locale.ENGLISH);
        this.e3(D.e);
        C c0 = this.C2();
        D d0 = D.f;
        if(c0.a() == d0) {
            return new Date().getTime();
        }
        if(c0.a() == D.n) {
            this.e3(d0);
            String s = (String)c0.c(String.class);
            ParsePosition parsePosition0 = new ParsePosition(0);
            Date date0 = simpleDateFormat0.parse(s, parsePosition0);
            if(date0 == null || parsePosition0.getIndex() != s.length()) {
                throw new v("JSON reader expected a date in \'EEE MMM dd yyyy HH:mm:ss z\' format but found \'%s\'.", new Object[]{s});
            }
            return date0.getTime();
        }
        if(c0.a() != D.k && c0.a() != D.l) {
            throw new v("JSON reader expected an integer or a string but found \'%s\'.", new Object[]{c0.b()});
        }
        long[] arr_v = new long[7];
        int v = 0;
        while(true) {
            if(v < 7) {
                arr_v[v] = (long)(((Long)c0.c(Long.class)));
                ++v;
            }
            c1 = this.C2();
            if(c1.a() == D.f) {
                if(v == 1) {
                    return arr_v[0];
                }
                if(v < 3 || v > 7) {
                    throw new v("JSON reader expected 1 or 3-7 integers but found %d.", new Object[]{v});
                }
                Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                calendar0.set(1, ((int)arr_v[0]));
                calendar0.set(2, ((int)arr_v[1]));
                calendar0.set(5, ((int)arr_v[2]));
                calendar0.set(11, ((int)arr_v[3]));
                calendar0.set(12, ((int)arr_v[4]));
                calendar0.set(13, ((int)arr_v[5]));
                calendar0.set(14, ((int)arr_v[6]));
                return calendar0.getTimeInMillis();
            }
            if(c1.a() != D.i) {
                break;
            }
            c0 = this.C2();
            if(c0.a() != D.k && c0.a() != D.l) {
                throw new v("JSON reader expected an integer but found \'%s\'.", new Object[]{c0.b()});
            }
        }
        throw new v("JSON reader expected a \',\' or a \')\' but found \'%s\'.", new Object[]{c1.b()});
    }

    @Override  // org.bson.a
    protected long t() {
        return (long)(((Long)this.h));
    }

    private static byte[] t2(String s) {
        if(s.length() % 2 != 0) {
            throw new IllegalArgumentException("A hex string must contain an even number of characters: " + s);
        }
        byte[] arr_b = new byte[s.length() / 2];
        for(int v = 0; v < s.length(); v += 2) {
            int v1 = Character.digit(s.charAt(v), 16);
            int v2 = Character.digit(s.charAt(v + 1), 16);
            if(v1 == -1 || v2 == -1) {
                throw new IllegalArgumentException("A hex string can only contain the characters 0-9, A-F, a-f: " + s);
            }
            arr_b[v / 2] = (byte)(v1 * 16 + v2);
        }
        return arr_b;
    }

    @Override  // org.bson.a
    protected void u0() {
        this.i1(new b(this, this.A2(), u.c));
    }

    @Override  // org.bson.a
    public Decimal128 v() {
        return (Decimal128)this.h;
    }

    private String v3() {
        this.e3(D.e);
        C c0 = this.C2();
        if(c0.a() != D.f) {
            while(c0.a() != D.p) {
                c0 = this.C2();
                if(c0.a() == D.f) {
                    break;
                }
            }
            if(c0.a() != D.f) {
                throw new v("JSON reader expected a \')\' but found \'%s\'.", new Object[]{c0.b()});
            }
        }
        return "Sat Sep 06 2025 02:02:20 CST";
    }

    @Override  // org.bson.a
    protected double w() {
        return (double)(((Double)this.h));
    }

    @Override  // org.bson.a
    protected void x() {
        this.i1(this.A2().e());
        if(this.A2().c() == u.c || this.A2().c() == u.b) {
            C c0 = this.C2();
            if(c0.a() != D.i) {
                this.I2(c0);
            }
        }
    }

    @Override  // org.bson.a
    protected void x0() {
        this.i1(new b(this, this.A2(), u.b));
    }

    private long y3() {
        long v;
        this.e3(D.h);
        C c0 = this.C2();
        Class class0 = String.class;
        if(c0.a() == D.c) {
            String s = (String)this.C2().c(class0);
            if(!s.equals("$numberLong")) {
                throw new v(String.format("JSON reader expected $numberLong within $date, but found %s", s));
            }
            v = (long)this.i4();
            this.e3(D.g);
            return v;
        }
        if(c0.a() == D.k || c0.a() == D.l) {
            v = (long)(((Long)c0.c(Long.class)));
        }
        else {
            if(c0.a() == D.n) {
                String s1 = (String)c0.c(class0);
                try {
                    v = org.bson.json.b.c(s1);
                    goto label_19;
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    throw new v("Failed to parse string as a date", new Object[]{illegalArgumentException0});
                }
            }
            throw new v("JSON reader expected an integer or string but found \'%s\'.", new Object[]{c0.b()});
        }
    label_19:
        this.e3(D.g);
        return v;
    }
}

