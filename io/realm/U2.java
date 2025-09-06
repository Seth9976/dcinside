package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.y;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.c;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.internal.s;
import io.realm.internal.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class u2 extends y implements s, v2 {
    public static final class a {
        public static final String a = "HateWord";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;

        b(OsSchemaInfo osSchemaInfo0) {
            super(4);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("HateWord");
            this.e = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.f = this.b("use", "use", osObjectSchemaInfo0);
            this.g = this.b("warnType", "warnType", osObjectSchemaInfo0);
            this.h = this.b("words", "words", osObjectSchemaInfo0);
        }

        b(c c0, boolean z) {
            super(c0, z);
            this.d(c0, this);
        }

        @Override  // io.realm.internal.c
        protected final c c(boolean z) {
            return new b(this, z);
        }

        @Override  // io.realm.internal.c
        protected final void d(c c0, c c1) {
            ((b)c1).e = ((b)c0).e;
            ((b)c1).f = ((b)c0).f;
            ((b)c1).g = ((b)c0).g;
            ((b)c1).h = ((b)c0).h;
        }
    }

    private b k;
    private A0 l;
    private T0 m;
    private static final String n = "";
    private static final OsObjectSchemaInfo o;

    static {
        u2.o = u2.d6();
    }

    u2() {
        this.l.p();
    }

    @Override  // com.dcinside.app.realm.y, io.realm.v2
    public void D0(boolean z) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            u0.b().m0(this.k.f, u0.F(), z, true);
            return;
        }
        this.l.f().k();
        this.l.g().p(this.k.f, z);
    }

    @Override  // com.dcinside.app.realm.y, io.realm.v2
    public int D3() {
        this.l.f().k();
        return (int)this.l.g().w(this.k.g);
    }

    @Override  // com.dcinside.app.realm.y, io.realm.v2
    public T0 F() {
        this.l.f().k();
        T0 t00 = this.m;
        if(t00 != null) {
            return t00;
        }
        OsList osList0 = this.l.g().l(this.k.h, RealmFieldType.STRING_LIST);
        T0 t01 = new T0(String.class, osList0, this.l.f());
        this.m = t01;
        return t01;
    }

    @Override  // com.dcinside.app.realm.y, io.realm.v2
    public void G(T0 t00) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            if(this.l.e().contains("words")) {
                return;
            }
        }
        this.l.f().k();
        OsList osList0 = this.l.g().l(this.k.h, RealmFieldType.STRING_LIST);
        osList0.Q();
        if(t00 == null) {
            return;
        }
        for(Object object0: t00) {
            String s = (String)object0;
            if(s == null) {
                osList0.j();
            }
            else {
                osList0.n(s);
            }
        }
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.l;
    }

    public static y Z5(F0 f00, b u2$b0, y y0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(y0);
        if(s0 != null) {
            return (y)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(y.class), set0);
        osObjectBuilder0.n4(u2$b0.e, y0.a());
        osObjectBuilder0.a1(u2$b0.f, Boolean.valueOf(y0.g3()));
        osObjectBuilder0.i3(u2$b0.g, y0.D3());
        osObjectBuilder0.o4(u2$b0.h, y0.F());
        y y1 = u2.m6(f00, osObjectBuilder0.v4());
        map0.put(y0, y1);
        return y1;
    }

    @Override  // com.dcinside.app.realm.y, io.realm.v2
    public String a() {
        this.l.f().k();
        return this.l.g().U(this.k.e);
    }

    public static y a6(F0 f00, b u2$b0, y y0, boolean z, Map map0, Set set0) {
        if(y0 instanceof s && !d1.F5(y0) && ((s)y0).R3().f() != null) {
            io.realm.a a0 = ((s)y0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return y0;
            }
        }
        u2 u20 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(y0);
        if(s0 != null) {
            return (y)s0;
        }
        if(z) {
            Table table0 = f00.n4(y.class);
            long v = u2$b0.e;
            String s1 = y0.a();
            long v1 = s1 == null ? table0.u(v) : table0.w(v, s1);
            if(v1 == -1L) {
                return u2.Z5(f00, u2$b0, y0, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v1), u2$b0, false, Collections.emptyList());
                u20 = new u2();
                map0.put(y0, u20);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? u2.n6(f00, u2$b0, u20, y0, map0, set0) : u2.Z5(f00, u2$b0, y0, z, map0, set0);
    }

    @Override  // com.dcinside.app.realm.y, io.realm.v2
    public void b(String s) {
        if(this.l.i()) {
            return;
        }
        this.l.f().k();
        throw new RealmException("Primary key field \'galleryId\' cannot be changed after object was created.");
    }

    public static b b6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static y c6(y y0, int v, int v1, Map map0) {
        y y1;
        if(v <= v1 && y0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(y0);
            if(s$a0 == null) {
                y1 = new y();
                map0.put(y0, new io.realm.internal.s.a(v, y1));
            }
            else {
                if(v >= s$a0.a) {
                    return (y)s$a0.b;
                }
                s$a0.a = v;
                y1 = (y)s$a0.b;
            }
            F0 f00 = (F0)((s)y0).R3().f();
            y1.b(y0.a());
            y1.D0(y0.g3());
            y1.i3(y0.D3());
            y1.G(new T0());
            y1.F().addAll(y0.F());
            return y1;
        }
        return null;
    }

    private static OsObjectSchemaInfo d6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "HateWord", false, 4, 0);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, true, false, false);
        osObjectSchemaInfo$b0.d("", "use", RealmFieldType.BOOLEAN, false, false, true);
        osObjectSchemaInfo$b0.d("", "warnType", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.f("", "words", RealmFieldType.STRING_LIST, false);
        return osObjectSchemaInfo$b0.g();
    }

    public static y e6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        y y0;
        ArrayList arrayList0 = new ArrayList(1);
        Class class0 = y.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("galleryId") ? table0.u(v) : table0.w(v, jSONObject0.getString("galleryId"));
            if(v1 == -1L) {
                y0 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    y0 = new u2();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            y0 = null;
        }
        if(y0 == null) {
            if(jSONObject0.has("words")) {
                arrayList0.add("words");
            }
            if(!jSONObject0.has("galleryId")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'galleryId\'.");
            }
            y0 = jSONObject0.isNull("galleryId") ? ((u2)f00.v3(class0, null, true, arrayList0)) : ((u2)f00.v3(class0, jSONObject0.getString("galleryId"), true, arrayList0));
        }
        if(jSONObject0.has("use")) {
            if(jSONObject0.isNull("use")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'use\' to null.");
            }
            y0.D0(jSONObject0.getBoolean("use"));
        }
        if(jSONObject0.has("warnType")) {
            if(jSONObject0.isNull("warnType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'warnType\' to null.");
            }
            y0.i3(jSONObject0.getInt("warnType"));
        }
        B0.h(f00, y0.F(), jSONObject0, "words", z);
        return y0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.l.f();
            io.realm.a a1 = ((u2)object0).l.f();
            String s = a0.getPath();
            String s1 = a1.getPath();
            if(s != null) {
                if(!s.equals(s1)) {
                    return false;
                }
            }
            else if(s1 != null) {
                return false;
            }
            if(a0.x0() != a1.x0()) {
                return false;
            }
            if(!a0.e.getVersionID().equals(a1.e.getVersionID())) {
                return false;
            }
            String s2 = this.l.g().b().P();
            String s3 = ((u2)object0).l.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.l.g().F() == ((u2)object0).l.g().F() : false;
            }
            return s3 == null ? this.l.g().F() == ((u2)object0).l.g().F() : false;
        }
        return false;
    }

    @TargetApi(11)
    public static y f6(F0 f00, JsonReader jsonReader0) throws IOException {
        y y0 = new y();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("galleryId")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    y0.b(null);
                }
                else {
                    y0.b(jsonReader0.nextString());
                }
                z = true;
            }
            else {
                if(s.equals("use")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        y0.D0(jsonReader0.nextBoolean());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'use\' to null.");
                }
                if(s.equals("warnType")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        y0.i3(jsonReader0.nextInt());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'warnType\' to null.");
                }
                if(s.equals("words")) {
                    y0.G(B0.e(String.class, jsonReader0));
                }
                else {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'galleryId\'.");
        }
        return (y)f00.t2(y0, new W[0]);
    }

    @Override  // com.dcinside.app.realm.y, io.realm.v2
    public boolean g3() {
        this.l.f().k();
        return this.l.g().Q(this.k.f);
    }

    public static OsObjectSchemaInfo g6() {
        return u2.o;
    }

    public static String h6() {
        return "HateWord";
    }

    @Override
    public int hashCode() {
        String s = this.l.f().getPath();
        String s1 = this.l.g().b().P();
        long v = this.l.g().F();
        int v1 = 0;
        int v2 = s == null ? 0 : s.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        return ((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    @Override  // com.dcinside.app.realm.y, io.realm.v2
    public void i3(int v) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            u0.b().u0(this.k.g, u0.F(), ((long)v), true);
            return;
        }
        this.l.f().k();
        this.l.g().e(this.k.g, ((long)v));
    }

    public static long i6(F0 f00, y y0, Map map0) {
        if(y0 instanceof s && !d1.F5(y0) && ((s)y0).R3().f() != null && ((s)y0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)y0).R3().g().F();
        }
        Table table0 = f00.n4(y.class);
        long v = table0.getNativePtr();
        b u2$b0 = (b)f00.e0().j(y.class);
        long v1 = u2$b0.e;
        String s = y0.a();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        else {
            Table.B0(s);
        }
        map0.put(y0, v2);
        Table.nativeSetBoolean(v, u2$b0.f, v2, y0.g3(), false);
        Table.nativeSetLong(v, u2$b0.g, v2, y0.D3(), false);
        T0 t00 = y0.F();
        if(t00 != null) {
            OsList osList0 = new OsList(table0.U(v2), u2$b0.h);
            for(Object object0: t00) {
                String s1 = (String)object0;
                if(s1 == null) {
                    osList0.j();
                }
                else {
                    osList0.n(s1);
                }
            }
        }
        return v2;
    }

    public static void j6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(y.class);
        long v = table0.getNativePtr();
        b u2$b0 = (b)f00.e0().j(y.class);
        long v1 = u2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            y y0 = (y)object0;
            if(map0.containsKey(y0)) {
            }
            else if(y0 instanceof s && !d1.F5(y0) && ((s)y0).R3().f() != null && ((s)y0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(y0, ((s)y0).R3().g().F());
            }
            else {
                String s = y0.a();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                else {
                    Table.B0(s);
                }
                map0.put(y0, v2);
                Table.nativeSetBoolean(v, u2$b0.f, v2, y0.g3(), false);
                Table.nativeSetLong(v, u2$b0.g, v2, y0.D3(), false);
                T0 t00 = y0.F();
                if(t00 != null) {
                    OsList osList0 = new OsList(table0.U(v2), u2$b0.h);
                    for(Object object1: t00) {
                        String s1 = (String)object1;
                        if(s1 == null) {
                            osList0.j();
                        }
                        else {
                            osList0.n(s1);
                        }
                    }
                }
            }
        }
    }

    public static long k6(F0 f00, y y0, Map map0) {
        if(y0 instanceof s && !d1.F5(y0) && ((s)y0).R3().f() != null && ((s)y0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)y0).R3().g().F();
        }
        Table table0 = f00.n4(y.class);
        long v = table0.getNativePtr();
        b u2$b0 = (b)f00.e0().j(y.class);
        long v1 = u2$b0.e;
        String s = y0.a();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        map0.put(y0, v2);
        Table.nativeSetBoolean(v, u2$b0.f, v2, y0.g3(), false);
        Table.nativeSetLong(v, u2$b0.g, v2, y0.D3(), false);
        OsList osList0 = new OsList(table0.U(v2), u2$b0.h);
        osList0.Q();
        T0 t00 = y0.F();
        if(t00 != null) {
            for(Object object0: t00) {
                String s1 = (String)object0;
                if(s1 == null) {
                    osList0.j();
                }
                else {
                    osList0.n(s1);
                }
            }
        }
        return v2;
    }

    public static void l6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(y.class);
        long v = table0.getNativePtr();
        b u2$b0 = (b)f00.e0().j(y.class);
        long v1 = u2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            y y0 = (y)object0;
            if(map0.containsKey(y0)) {
            }
            else if(y0 instanceof s && !d1.F5(y0) && ((s)y0).R3().f() != null && ((s)y0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(y0, ((s)y0).R3().g().F());
            }
            else {
                String s = y0.a();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                map0.put(y0, v2);
                Table.nativeSetBoolean(v, u2$b0.f, v2, y0.g3(), false);
                Table.nativeSetLong(v, u2$b0.g, v2, y0.D3(), false);
                OsList osList0 = new OsList(table0.U(v2), u2$b0.h);
                osList0.Q();
                T0 t00 = y0.F();
                if(t00 != null) {
                    for(Object object1: t00) {
                        String s1 = (String)object1;
                        if(s1 == null) {
                            osList0.j();
                        }
                        else {
                            osList0.n(s1);
                        }
                    }
                }
            }
        }
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.l != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.k = (b)a$h0.c();
        A0 a00 = new A0(this);
        this.l = a00;
        a00.r(a$h0.e());
        this.l.s(a$h0.f());
        this.l.o(a$h0.b());
        this.l.q(a$h0.d());
    }

    static u2 m6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(y.class), false, Collections.emptyList());
        u2 u20 = new u2();
        a$h0.a();
        return u20;
    }

    static y n6(F0 f00, b u2$b0, y y0, y y1, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(y.class), set0);
        osObjectBuilder0.n4(u2$b0.e, y1.a());
        osObjectBuilder0.a1(u2$b0.f, Boolean.valueOf(y1.g3()));
        osObjectBuilder0.i3(u2$b0.g, y1.D3());
        osObjectBuilder0.o4(u2$b0.h, y1.F());
        osObjectBuilder0.x4();
        return y0;
    }

    // 去混淆评级： 低(30)
    @Override
    public String toString() {
        return d1.I5(this) ? "HateWord = proxy[{galleryId:" + (this.a() == null ? "null" : this.a()) + "}" + "," + "{use:" + this.g3() + "}" + "," + "{warnType:" + this.D3() + "}" + "," + "{words:" + "RealmList<String>[" + this.F().size() + "]" + "}" + "]" : "Invalid object";
    }
}

