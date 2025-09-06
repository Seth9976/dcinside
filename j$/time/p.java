package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

final class p implements Externalizable {
    private byte a;
    private Object b;
    private static final long serialVersionUID = -7683839454370182990L;

    public p() {
    }

    p(byte b, Object object0) {
        this.a = b;
        this.b = object0;
    }

    static Serializable a(ObjectInput objectInput0) {
        return p.b(objectInput0.readByte(), objectInput0);
    }

    private static Serializable b(byte b, ObjectInput objectInput0) {
        switch(b) {
            case 1: {
                return Duration.ofSeconds(objectInput0.readLong(), objectInput0.readInt());
            }
            case 2: {
                return Instant.ofEpochSecond(objectInput0.readLong(), objectInput0.readInt());
            }
            case 3: {
                return LocalDate.c0(objectInput0.readInt(), objectInput0.readByte(), objectInput0.readByte());
            }
            case 4: {
                return LocalTime.g0(objectInput0);
            }
            case 5: {
                return LocalDateTime.Z(LocalDate.c0(objectInput0.readInt(), objectInput0.readByte(), objectInput0.readByte()), LocalTime.g0(objectInput0));
            }
            case 6: {
                return ZonedDateTime.S(objectInput0);
            }
            case 7: {
                return ZoneId.R(objectInput0.readUTF(), false);
            }
            case 8: {
                return ZoneOffset.b0(objectInput0);
            }
            case 9: {
                return n.S(objectInput0);
            }
            case 10: {
                return OffsetDateTime.T(objectInput0);
            }
            case 11: {
                return r.Q(objectInput0.readInt());
            }
            case 12: {
                return t.U(objectInput0);
            }
            case 13: {
                return l.Q(objectInput0);
            }
            case 14: {
                return o.c(objectInput0);
            }
            default: {
                throw new StreamCorruptedException("Unknown serialized type");
            }
        }
    }

    @Override
    public final void readExternal(ObjectInput objectInput0) {
        byte b = objectInput0.readByte();
        this.a = b;
        this.b = p.b(b, objectInput0);
    }

    private Object readResolve() {
        return this.b;
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput0) {
        int v = this.a;
        Object object0 = this.b;
        objectOutput0.writeByte(v);
        switch(v) {
            case 1: {
                ((Duration)object0).writeExternal(objectOutput0);
                return;
            }
            case 2: {
                ((Instant)object0).U(objectOutput0);
                return;
            }
            case 3: {
                ((LocalDate)object0).p0(objectOutput0);
                return;
            }
            case 4: {
                ((LocalTime)object0).l0(objectOutput0);
                return;
            }
            case 5: {
                ((LocalDateTime)object0).j0(objectOutput0);
                return;
            }
            case 6: {
                ((ZonedDateTime)object0).T(objectOutput0);
                return;
            }
            case 7: {
                ((u)object0).W(objectOutput0);
                return;
            }
            case 8: {
                ((ZoneOffset)object0).c0(objectOutput0);
                return;
            }
            case 9: {
                ((n)object0).writeExternal(objectOutput0);
                return;
            }
            case 10: {
                ((OffsetDateTime)object0).writeExternal(objectOutput0);
                return;
            }
            case 11: {
                ((r)object0).U(objectOutput0);
                return;
            }
            case 12: {
                ((t)object0).X(objectOutput0);
                return;
            }
            case 13: {
                ((l)object0).R(objectOutput0);
                return;
            }
            case 14: {
                ((o)object0).writeExternal(objectOutput0);
                return;
            }
            default: {
                throw new InvalidClassException("Unknown serialized type");
            }
        }
    }
}

