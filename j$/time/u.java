package j$.time;

import j..time.zone.f;
import j..time.zone.g;
import j..time.zone.j;
import j..util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

final class u extends ZoneId {
    private final String b;
    private final transient f c;
    public static final int d = 0;
    private static final long serialVersionUID = 0x746262147BB70E18L;

    u(String s, f f0) {
        this.b = s;
        this.c = f0;
    }

    @Override  // j$.time.ZoneId
    public final f Q() {
        return this.c == null ? j.b(this.b, false) : this.c;
    }

    @Override  // j$.time.ZoneId
    final void U(ObjectOutput objectOutput0) {
        objectOutput0.writeByte(7);
        objectOutput0.writeUTF(this.b);
    }

    static u V(String s, boolean z) {
        Objects.requireNonNull(s, "zoneId");
        int v = s.length();
        if(v >= 2) {
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = s.charAt(v1);
                if((v2 < 97 || v2 > 0x7A) && (v2 < 65 || v2 > 90) && (v2 != 0x2F || v1 == 0) && (v2 < 0x30 || v2 > 57 || v1 == 0) && (v2 != 0x7E || v1 == 0) && (v2 != 46 || v1 == 0) && (v2 != 0x5F || v1 == 0) && (v2 != 43 || v1 == 0) && (v2 != 45 || v1 == 0)) {
                    throw new b("Invalid ID for region-based ZoneId, invalid format: " + s);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
            try {
                return new u(s, j.b(s, true));
            }
            catch(g g0) {
                if(z) {
                    throw g0;
                }
                return new u(s, null);
            }
        }
        throw new b("Invalid ID for region-based ZoneId, invalid format: " + s);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    }

    final void W(DataOutput dataOutput0) {
        dataOutput0.writeUTF(this.b);
    }

    @Override  // j$.time.ZoneId
    public final String k() {
        return this.b;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new p(7, this);
    }
}

