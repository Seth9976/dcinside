package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

final class i implements Externalizable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private Map a;
    @l
    public static final a b;
    private static final long c;

    static {
        i.b = new a(null);
    }

    public i() {
        this(Y.z());
    }

    public i(@l Map map0) {
        L.p(map0, "map");
        super();
        this.a = map0;
    }

    private final Object a() {
        return this.a;
    }

    @Override
    public void readExternal(@l ObjectInput objectInput0) {
        L.p(objectInput0, "input");
        int v = objectInput0.readByte();
        if(v != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + v);
        }
        int v1 = objectInput0.readInt();
        if(v1 < 0) {
            throw new InvalidObjectException("Illegal size value: " + v1 + '.');
        }
        Map map0 = Y.h(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            map0.put(objectInput0.readObject(), objectInput0.readObject());
        }
        this.a = Y.d(map0);
    }

    @Override
    public void writeExternal(@l ObjectOutput objectOutput0) {
        L.p(objectOutput0, "output");
        objectOutput0.writeByte(0);
        objectOutput0.writeInt(this.a.size());
        for(Object object0: this.a.entrySet()) {
            objectOutput0.writeObject(((Map.Entry)object0).getKey());
            objectOutput0.writeObject(((Map.Entry)object0).getValue());
        }
    }
}

