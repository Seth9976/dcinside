package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;

    static {
        TimeSignalCommand.CREATOR = new Parcelable.Creator() {
            public TimeSignalCommand a(Parcel parcel0) {
                return new TimeSignalCommand(parcel0.readLong(), parcel0.readLong(), null);
            }

            public TimeSignalCommand[] b(int v) {
                return new TimeSignalCommand[v];
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

    private TimeSignalCommand(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    TimeSignalCommand(long v, long v1, androidx.media3.extractor.metadata.scte35.TimeSignalCommand.1 timeSignalCommand$10) {
        this(v, v1);
    }

    static TimeSignalCommand a(ParsableByteArray parsableByteArray0, long v, TimestampAdjuster timestampAdjuster0) {
        long v1 = TimeSignalCommand.c(parsableByteArray0, v);
        return new TimeSignalCommand(v1, timestampAdjuster0.b(v1));
    }

    static long c(ParsableByteArray parsableByteArray0, long v) {
        long v1 = (long)parsableByteArray0.L();
        return (0x80L & v1) == 0L ? 0x8000000000000001L : 0x1FFFFFFFFL & ((v1 & 1L) << 0x20 | parsableByteArray0.N()) + v;
    }

    @Override  // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.a + ", playbackPositionUs= " + this.b + " }";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.a);
        parcel0.writeLong(this.b);
    }
}

