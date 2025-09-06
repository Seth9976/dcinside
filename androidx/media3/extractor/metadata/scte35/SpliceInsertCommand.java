package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UnstableApi
public final class SpliceInsertCommand extends SpliceCommand {
    public static final class ComponentSplice {
        public final int a;
        public final long b;
        public final long c;

        private ComponentSplice(int v, long v1, long v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }

        ComponentSplice(int v, long v1, long v2, androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.1 spliceInsertCommand$10) {
            this(v, v1, v2);
        }

        public static ComponentSplice a(Parcel parcel0) {
            return new ComponentSplice(parcel0.readInt(), parcel0.readLong(), parcel0.readLong());
        }

        public void b(Parcel parcel0) {
            parcel0.writeInt(this.a);
            parcel0.writeLong(this.b);
            parcel0.writeLong(this.c);
        }
    }

    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    static {
        SpliceInsertCommand.CREATOR = new Parcelable.Creator() {
            public SpliceInsertCommand a(Parcel parcel0) {
                return new SpliceInsertCommand(parcel0, null);
            }

            public SpliceInsertCommand[] b(int v) {
                return new SpliceInsertCommand[v];
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

    private SpliceInsertCommand(long v, boolean z, boolean z1, boolean z2, boolean z3, long v1, long v2, List list0, boolean z4, long v3, int v4, int v5, int v6) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = z3;
        this.f = v1;
        this.g = v2;
        this.h = DesugarCollections.unmodifiableList(list0);
        this.i = z4;
        this.j = v3;
        this.k = v4;
        this.l = v5;
        this.m = v6;
    }

    private SpliceInsertCommand(Parcel parcel0) {
        this.a = parcel0.readLong();
        boolean z = false;
        this.b = parcel0.readByte() == 1;
        this.c = parcel0.readByte() == 1;
        this.d = parcel0.readByte() == 1;
        this.e = parcel0.readByte() == 1;
        this.f = parcel0.readLong();
        this.g = parcel0.readLong();
        int v = parcel0.readInt();
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(ComponentSplice.a(parcel0));
        }
        this.h = DesugarCollections.unmodifiableList(arrayList0);
        if(parcel0.readByte() == 1) {
            z = true;
        }
        this.i = z;
        this.j = parcel0.readLong();
        this.k = parcel0.readInt();
        this.l = parcel0.readInt();
        this.m = parcel0.readInt();
    }

    SpliceInsertCommand(Parcel parcel0, androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.1 spliceInsertCommand$10) {
        this(parcel0);
    }

    static SpliceInsertCommand a(ParsableByteArray parsableByteArray0, long v, TimestampAdjuster timestampAdjuster0) {
        boolean z3;
        long v9;
        long v1 = parsableByteArray0.N();
        boolean z = (parsableByteArray0.L() & 0x80) != 0;
        List list0 = Collections.emptyList();
        if(!z) {
            int v2 = parsableByteArray0.L();
            boolean z1 = (v2 & 0x40) != 0;
            boolean z2 = (v2 & 16) != 0;
            long v3 = !z1 || z2 ? 0x8000000000000001L : TimeSignalCommand.c(parsableByteArray0, v);
            if(!z1) {
                int v4 = parsableByteArray0.L();
                ArrayList arrayList0 = new ArrayList(v4);
                for(int v5 = 0; v5 < v4; ++v5) {
                    int v6 = parsableByteArray0.L();
                    long v7 = z2 ? 0x8000000000000001L : TimeSignalCommand.c(parsableByteArray0, v);
                    arrayList0.add(new ComponentSplice(v6, v7, timestampAdjuster0.b(v7), null));
                }
                list0 = arrayList0;
            }
            if((v2 & 0x20) == 0) {
                z3 = false;
                v9 = 0x8000000000000001L;
            }
            else {
                long v8 = (long)parsableByteArray0.L();
                v9 = ((v8 & 1L) << 0x20 | parsableByteArray0.N()) * 1000L / 90L;
                z3 = (0x80L & v8) != 0L;
            }
            int v10 = parsableByteArray0.R();
            int v11 = parsableByteArray0.L();
            int v12 = parsableByteArray0.L();
            return new SpliceInsertCommand(v1, false, (v2 & 0x80) != 0, z1, z2, v3, timestampAdjuster0.b(v3), list0, z3, v9, v10, v11, v12);
        }
        return new SpliceInsertCommand(v1, true, false, false, false, 0x8000000000000001L, timestampAdjuster0.b(0x8000000000000001L), list0, false, 0x8000000000000001L, 0, 0, 0);
    }

    @Override  // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f + ", programSplicePlaybackPositionUs= " + this.g + " }";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.a);
        parcel0.writeByte(((byte)this.b));
        parcel0.writeByte(((byte)this.c));
        parcel0.writeByte(((byte)this.d));
        parcel0.writeByte(((byte)this.e));
        parcel0.writeLong(this.f);
        parcel0.writeLong(this.g);
        int v1 = this.h.size();
        parcel0.writeInt(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            ((ComponentSplice)this.h.get(v2)).b(parcel0);
        }
        parcel0.writeByte(((byte)this.i));
        parcel0.writeLong(this.j);
        parcel0.writeInt(this.k);
        parcel0.writeInt(this.l);
        parcel0.writeInt(this.m);
    }
}

