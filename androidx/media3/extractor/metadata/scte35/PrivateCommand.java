package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;
    public final byte[] c;

    static {
        PrivateCommand.CREATOR = new Parcelable.Creator() {
            public PrivateCommand a(Parcel parcel0) {
                return new PrivateCommand(parcel0, null);
            }

            public PrivateCommand[] b(int v) {
                return new PrivateCommand[v];
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

    private PrivateCommand(long v, byte[] arr_b, long v1) {
        this.a = v1;
        this.b = v;
        this.c = arr_b;
    }

    private PrivateCommand(Parcel parcel0) {
        this.a = parcel0.readLong();
        this.b = parcel0.readLong();
        this.c = (byte[])Util.o(parcel0.createByteArray());
    }

    PrivateCommand(Parcel parcel0, androidx.media3.extractor.metadata.scte35.PrivateCommand.1 privateCommand$10) {
        this(parcel0);
    }

    static PrivateCommand a(ParsableByteArray parsableByteArray0, int v, long v1) {
        long v2 = parsableByteArray0.N();
        byte[] arr_b = new byte[v - 4];
        parsableByteArray0.n(arr_b, 0, v - 4);
        return new PrivateCommand(v2, arr_b, v1);
    }

    @Override  // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.a + ", identifier= " + this.b + " }";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.a);
        parcel0.writeLong(this.b);
        parcel0.writeByteArray(this.c);
    }
}

