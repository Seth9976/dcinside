package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR;

    static {
        SpliceNullCommand.CREATOR = new Parcelable.Creator() {
            public SpliceNullCommand a(Parcel parcel0) {
                return new SpliceNullCommand();
            }

            public SpliceNullCommand[] b(int v) {
                return new SpliceNullCommand[v];
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

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
    }
}

