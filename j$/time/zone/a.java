package j$.time.zone;

import j..time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

final class a implements Externalizable {
    private byte a;
    private Serializable b;
    private static final long serialVersionUID = 0x84B0FEEB7C1A53BEL;

    public a() {
    }

    a(byte b, Serializable serializable0) {
        this.a = b;
        this.b = serializable0;
    }

    static long a(ObjectInput objectInput0) {
        int v = objectInput0.readByte();
        return (v & 0xFF) == 0xFF ? objectInput0.readLong() : ((long)(((v & 0xFF) << 16) + ((objectInput0.readByte() & 0xFF) << 8) + (objectInput0.readByte() & 0xFF))) * 900L - 0x110BC5000L;
    }

    static ZoneOffset b(ObjectInput objectInput0) {
        int v = objectInput0.readByte();
        return v == 0x7F ? ZoneOffset.Z(objectInput0.readInt()) : ZoneOffset.Z(v * 900);
    }

    static void c(long v, ObjectOutput objectOutput0) {
        if(v >= 0xFFFFFFFEEF43B000L && v < 10413792000L && v % 900L == 0L) {
            int v1 = (int)((v + 0x110BC5000L) / 900L);
            objectOutput0.writeByte(v1 >>> 16 & 0xFF);
            objectOutput0.writeByte(v1 >>> 8 & 0xFF);
            objectOutput0.writeByte(v1 & 0xFF);
            return;
        }
        objectOutput0.writeByte(0xFF);
        objectOutput0.writeLong(v);
    }

    static void d(ZoneOffset zoneOffset0, ObjectOutput objectOutput0) {
        int v = zoneOffset0.W();
        int v1 = v % 900 == 0 ? v / 900 : 0x7F;
        objectOutput0.writeByte(v1);
        if(v1 == 0x7F) {
            objectOutput0.writeInt(v);
        }
    }

    @Override
    public final void readExternal(ObjectInput objectInput0) {
        f f0;
        byte b = objectInput0.readByte();
        this.a = b;
        switch(b) {
            case 1: {
                f0 = f.k(objectInput0);
                break;
            }
            case 2: {
                long v = a.a(objectInput0);
                ZoneOffset zoneOffset0 = a.b(objectInput0);
                ZoneOffset zoneOffset1 = a.b(objectInput0);
                if(zoneOffset0.equals(zoneOffset1)) {
                    throw new IllegalArgumentException("Offsets must not be equal");
                }
                f0 = new b(v, zoneOffset0, zoneOffset1);
                break;
            }
            case 3: {
                f0 = e.b(objectInput0);
                break;
            }
            case 100: {
                f0 = new f(TimeZone.getTimeZone(objectInput0.readUTF()));
                break;
            }
            default: {
                throw new StreamCorruptedException("Unknown serialized type");
            }
        }
        this.b = f0;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput0) {
        int v = this.a;
        Serializable serializable0 = this.b;
        objectOutput0.writeByte(v);
        switch(v) {
            case 1: {
                ((f)serializable0).writeExternal(objectOutput0);
                return;
            }
            case 2: {
                ((b)serializable0).writeExternal(objectOutput0);
                return;
            }
            case 3: {
                ((e)serializable0).writeExternal(objectOutput0);
                return;
            }
            case 100: {
                ((f)serializable0).l(objectOutput0);
                return;
            }
            default: {
                throw new InvalidClassException("Unknown serialized type");
            }
        }
    }
}

