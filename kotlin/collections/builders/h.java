package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
public final class h implements Externalizable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private Collection a;
    private final int b;
    @l
    public static final a c = null;
    private static final long d = 0L;
    public static final int e = 0;
    public static final int f = 1;

    static {
        h.c = new a(null);
    }

    public h() {
        this(u.H(), 0);
    }

    public h(@l Collection collection0, int v) {
        L.p(collection0, "collection");
        super();
        this.a = collection0;
        this.b = v;
    }

    private final Object a() {
        return this.a;
    }

    @Override
    public void readExternal(@l ObjectInput objectInput0) {
        Collection collection0;
        L.p(objectInput0, "input");
        int v = objectInput0.readByte();
        if((v & -2) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + v + '.');
        }
        int v1 = 0;
        int v2 = objectInput0.readInt();
        if(v2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + v2 + '.');
        }
        switch(v & 1) {
            case 0: {
                List list0 = u.j(v2);
                while(v1 < v2) {
                    list0.add(objectInput0.readObject());
                    ++v1;
                }
                collection0 = u.a(list0);
                break;
            }
            case 1: {
                Set set0 = k0.e(v2);
                while(v1 < v2) {
                    set0.add(objectInput0.readObject());
                    ++v1;
                }
                collection0 = k0.a(set0);
                break;
            }
            default: {
                throw new InvalidObjectException("Unsupported collection type tag: " + (v & 1) + '.');
            }
        }
        this.a = collection0;
    }

    @Override
    public void writeExternal(@l ObjectOutput objectOutput0) {
        L.p(objectOutput0, "output");
        objectOutput0.writeByte(this.b);
        objectOutput0.writeInt(this.a.size());
        for(Object object0: this.a) {
            objectOutput0.writeObject(object0);
        }
    }
}

