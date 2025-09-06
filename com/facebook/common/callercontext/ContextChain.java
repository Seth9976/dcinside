package com.facebook.common.callercontext;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import o3.h;

public class ContextChain implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public ContextChain a(Parcel parcel0) {
            return new ContextChain(parcel0);
        }

        public ContextChain[] b(int v) {
            return new ContextChain[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static final Parcelable.Creator CREATOR = null;
    private final String a;
    private final String b;
    @h
    private final ContextChain c;
    @h
    private Map d;
    @h
    private String e;
    private String f;
    public static final String g = "p";
    public static final String h = "i";
    public static final String i = "pi";
    private static final char j = '/';
    private static boolean k = false;

    static {
        ContextChain.CREATOR = new a();
    }

    protected ContextChain(Parcel parcel0) {
        this.a = parcel0.readString();
        this.b = parcel0.readString();
        this.f = parcel0.readString();
        this.c = (ContextChain)parcel0.readParcelable(ContextChain.class.getClassLoader());
    }

    public ContextChain(String s, @h ContextChain contextChain0) {
        this(s, null, contextChain0);
    }

    public ContextChain(String s, String s1, @h ContextChain contextChain0) {
        this(s, s1, null, contextChain0);
    }

    public ContextChain(String s, String s1, @h Map map0, @h ContextChain contextChain0) {
        this.a = s;
        this.b = s1;
        this.f = s + ":" + s1;
        this.c = contextChain0;
        this.i(contextChain0, map0);
    }

    public ContextChain(String s, @h Map map0, @h ContextChain contextChain0) {
        this.a = "serialized_tag";
        this.b = "serialized_name";
        this.f = s;
        this.c = contextChain0;
        this.i(contextChain0, map0);
    }

    @h
    public Map a() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    protected String d() {
        return this.f;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @h
    public ContextChain e() {
        return this.c;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@h Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && (Objects.equals(this.d(), ((ContextChain)object0).d()) && Objects.equals(this.c, ((ContextChain)object0).c));
    }

    public ContextChain f() {
        return this.c == null ? this : this.c.f();
    }

    @h
    public String g(String s) {
        Map map0 = this.d;
        if(map0 == null) {
            return null;
        }
        if(ContextChain.k && s == null) {
            return null;
        }
        Object object0 = map0.get(s);
        return object0 == null ? null : String.valueOf(object0);
    }

    public String h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.c, this.d()});
    }

    private void i(@h ContextChain contextChain0, @h Map map0) {
        Map map1 = contextChain0 == null ? null : contextChain0.a();
        if(map1 != null) {
            this.d = ContextChain.k ? new ConcurrentHashMap(map1) : new HashMap(map1);
        }
        if(map0 != null) {
            if(this.d == null) {
                this.d = ContextChain.k ? new ConcurrentHashMap() : new HashMap();
            }
            this.d.putAll(map0);
        }
    }

    public void l(String s, Object object0) {
        boolean z = ContextChain.k;
        if(z && (s == null || object0 == null)) {
            return;
        }
        if(this.d == null) {
            this.d = z ? new ConcurrentHashMap() : new HashMap();
        }
        this.d.put(s, object0);
    }

    public static void m(boolean z) {
        ContextChain.k = z;
    }

    public String[] o() {
        return this.toString().split("/");
    }

    @Override
    public String toString() {
        if(this.e == null) {
            this.e = this.d();
            if(this.c != null) {
                this.e = this.c.toString() + '/' + this.e;
            }
        }
        return this.e;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.d());
        parcel0.writeParcelable(this.c, v);
    }
}

