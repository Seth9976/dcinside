package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final class ComponentSplice {
        public final int a;
        public final long b;

        private ComponentSplice(int v, long v1) {
            this.a = v;
            this.b = v1;
        }

        ComponentSplice(int v, long v1, androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.1 spliceScheduleCommand$10) {
            this(v, v1);
        }

        private static ComponentSplice c(Parcel parcel0) {
            return new ComponentSplice(parcel0.readInt(), parcel0.readLong());
        }

        private void d(Parcel parcel0) {
            parcel0.writeInt(this.a);
            parcel0.writeLong(this.b);
        }
    }

    public static final class Event {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private Event(long v, boolean z, boolean z1, boolean z2, List list0, long v1, boolean z3, long v2, int v3, int v4, int v5) {
            this.a = v;
            this.b = z;
            this.c = z1;
            this.d = z2;
            this.f = DesugarCollections.unmodifiableList(list0);
            this.e = v1;
            this.g = z3;
            this.h = v2;
            this.i = v3;
            this.j = v4;
            this.k = v5;
        }

        private Event(Parcel parcel0) {
            this.a = parcel0.readLong();
            boolean z = false;
            this.b = parcel0.readByte() == 1;
            this.c = parcel0.readByte() == 1;
            this.d = parcel0.readByte() == 1;
            int v = parcel0.readInt();
            ArrayList arrayList0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList0.add(ComponentSplice.c(parcel0));
            }
            this.f = DesugarCollections.unmodifiableList(arrayList0);
            this.e = parcel0.readLong();
            if(parcel0.readByte() == 1) {
                z = true;
            }
            this.g = z;
            this.h = parcel0.readLong();
            this.i = parcel0.readInt();
            this.j = parcel0.readInt();
            this.k = parcel0.readInt();
        }

        private static Event d(Parcel parcel0) {
            return new Event(parcel0);
        }

        private static Event e(ParsableByteArray parsableByteArray0) {
            long v = parsableByteArray0.N();
            boolean z = (parsableByteArray0.L() & 0x80) != 0;
            ArrayList arrayList0 = new ArrayList();
            if(!z) {
                int v1 = parsableByteArray0.L();
                boolean z1 = (v1 & 0x80) != 0;
                boolean z2 = (v1 & 0x40) != 0;
                long v2 = z2 ? parsableByteArray0.N() : 0x8000000000000001L;
                if(!z2) {
                    int v3 = parsableByteArray0.L();
                    ArrayList arrayList1 = new ArrayList(v3);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        arrayList1.add(new ComponentSplice(parsableByteArray0.L(), parsableByteArray0.N(), null));
                    }
                    arrayList0 = arrayList1;
                }
                if((v1 & 0x20) != 0) {
                    long v5 = (long)parsableByteArray0.L();
                    return (0x80L & v5) == 0L ? new Event(v, false, z1, z2, arrayList0, v2, false, ((v5 & 1L) << 0x20 | parsableByteArray0.N()) * 1000L / 90L, parsableByteArray0.R(), parsableByteArray0.L(), parsableByteArray0.L()) : new Event(v, false, z1, z2, arrayList0, v2, true, ((v5 & 1L) << 0x20 | parsableByteArray0.N()) * 1000L / 90L, parsableByteArray0.R(), parsableByteArray0.L(), parsableByteArray0.L());
                }
                return new Event(v, false, z1, z2, arrayList0, v2, false, 0x8000000000000001L, parsableByteArray0.R(), parsableByteArray0.L(), parsableByteArray0.L());
            }
            return new Event(v, true, false, false, arrayList0, 0x8000000000000001L, false, 0x8000000000000001L, 0, 0, 0);
        }

        private void f(Parcel parcel0) {
            parcel0.writeLong(this.a);
            parcel0.writeByte(((byte)this.b));
            parcel0.writeByte(((byte)this.c));
            parcel0.writeByte(((byte)this.d));
            int v = this.f.size();
            parcel0.writeInt(v);
            for(int v1 = 0; v1 < v; ++v1) {
                ((ComponentSplice)this.f.get(v1)).d(parcel0);
            }
            parcel0.writeLong(this.e);
            parcel0.writeByte(((byte)this.g));
            parcel0.writeLong(this.h);
            parcel0.writeInt(this.i);
            parcel0.writeInt(this.j);
            parcel0.writeInt(this.k);
        }
    }

    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        SpliceScheduleCommand.CREATOR = new Parcelable.Creator() {
            public SpliceScheduleCommand a(Parcel parcel0) {
                return new SpliceScheduleCommand(parcel0, null);
            }

            public SpliceScheduleCommand[] b(int v) {
                return new SpliceScheduleCommand[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        };
    }

    private SpliceScheduleCommand(Parcel parcel0) {
        int v = parcel0.readInt();
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(Event.d(parcel0));
        }
        this.a = DesugarCollections.unmodifiableList(arrayList0);
    }

    SpliceScheduleCommand(Parcel parcel0, androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.1 spliceScheduleCommand$10) {
        this(parcel0);
    }

    private SpliceScheduleCommand(List list0) {
        this.a = DesugarCollections.unmodifiableList(list0);
    }

    static SpliceScheduleCommand a(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.L();
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(Event.e(parsableByteArray0));
        }
        return new SpliceScheduleCommand(arrayList0);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = this.a.size();
        parcel0.writeInt(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            ((Event)this.a.get(v2)).f(parcel0);
        }
    }
}

