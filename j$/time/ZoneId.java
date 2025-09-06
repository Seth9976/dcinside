package j$.time;

import j..com.android.tools.r8.a;
import j..time.zone.f;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public abstract class ZoneId implements Serializable {
    public static final Map a = null;
    private static final long serialVersionUID = 0x798CAB446E6L;

    static {
        Map.Entry[] arr_map$Entry = {a.j("ACT", "Australia/Darwin"), a.j("AET", "Australia/Sydney"), a.j("AGT", "America/Argentina/Buenos_Aires"), a.j("ART", "Africa/Cairo"), a.j("AST", "America/Anchorage"), a.j("BET", "America/Sao_Paulo"), a.j("BST", "Asia/Dhaka"), a.j("CAT", "Africa/Harare"), a.j("CNT", "America/St_Johns"), a.j("CST", "America/Chicago"), a.j("CTT", "Asia/Shanghai"), a.j("EAT", "Africa/Addis_Ababa"), a.j("ECT", "Europe/Paris"), a.j("IET", "America/Indiana/Indianapolis"), a.j("IST", "Asia/Kolkata"), a.j("JST", "Asia/Tokyo"), a.j("MIT", "Pacific/Apia"), a.j("NET", "Asia/Yerevan"), a.j("NST", "Pacific/Auckland"), a.j("PLT", "Asia/Karachi"), a.j("PNT", "America/Phoenix"), a.j("PRT", "America/Puerto_Rico"), a.j("PST", "America/Los_Angeles"), a.j("SST", "Pacific/Guadalcanal"), a.j("VST", "Asia/Ho_Chi_Minh"), a.j("EST", "-05:00"), a.j("MST", "-07:00"), a.j("HST", "-10:00")};
        HashMap hashMap0 = new HashMap(28);
        for(int v = 0; v < 28; ++v) {
            Map.Entry map$Entry0 = arr_map$Entry[v];
            Object object0 = Objects.requireNonNull(map$Entry0.getKey());
            if(hashMap0.put(object0, Objects.requireNonNull(map$Entry0.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + object0);
            }
        }
        ZoneId.a = Collections.unmodifiableMap(hashMap0);
    }

    ZoneId() {
        if(this.getClass() != ZoneOffset.class && this.getClass() != u.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public abstract f Q();

    static ZoneId R(String s, boolean z) {
        Objects.requireNonNull(s, "zoneId");
        if(s.length() > 1 && !s.startsWith("+") && !s.startsWith("-")) {
            if(!s.startsWith("UTC") && !s.startsWith("GMT")) {
                return s.startsWith("UT") ? ZoneId.T(s, 2, z) : u.V(s, z);
            }
            return ZoneId.T(s, 3, z);
        }
        return ZoneOffset.X(s);
    }

    public static ZoneId S(String s, ZoneOffset zoneOffset0) {
        Objects.requireNonNull(s, "prefix");
        Objects.requireNonNull(zoneOffset0, "offset");
        if(s.isEmpty()) {
            return zoneOffset0;
        }
        if(!s.equals("GMT") && !s.equals("UTC") && !s.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: " + s);
        }
        if(zoneOffset0.W() != 0) {
            s = s + zoneOffset0.k();
        }
        return new u(s, f.i(zoneOffset0));
    }

    private static ZoneId T(String s, int v, boolean z) {
        String s1 = s.substring(0, v);
        if(s.length() == v) {
            return ZoneId.S(s1, ZoneOffset.UTC);
        }
        if(s.charAt(v) != 43 && s.charAt(v) != 45) {
            return u.V(s, z);
        }
        try {
            return ZoneId.S(s1, ZoneOffset.X(s.substring(v)));
        }
        catch(b b0) {
        }
        throw new b("Invalid ID for offset-based ZoneId: " + s, b0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    }

    abstract void U(ObjectOutput arg1);

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ZoneId ? this.k().equals(((ZoneId)object0).k()) : false;
    }

    @Override
    public int hashCode() {
        return this.k().hashCode();
    }

    public abstract String k();

    public static ZoneId of(String s) {
        return ZoneId.R(s, true);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        Objects.requireNonNull("Asia/Shanghai", "zoneId");
        Objects.requireNonNull(ZoneId.a, "aliasMap");
        if(((String)ZoneId.a.get("Asia/Shanghai")) == null) {
            Objects.requireNonNull("Asia/Shanghai", "defaultObj");
        }
        return ZoneId.of("Asia/Shanghai");
    }

    @Override
    public String toString() {
        return this.k();
    }

    private Object writeReplace() {
        return new p(7, this);
    }
}

