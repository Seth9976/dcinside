package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.B;
import com.google.common.collect.p1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@UnstableApi
public final class SlowMotionData implements Entry {
    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        public final long a;
        public final long b;
        public final int c;
        public static final Comparator d;

        static {
            Segment.d = (Segment slowMotionData$Segment0, Segment slowMotionData$Segment1) -> Segment.c(slowMotionData$Segment0, slowMotionData$Segment1);
            Segment.CREATOR = new Parcelable.Creator() {
                public Segment a(Parcel parcel0) {
                    return new Segment(parcel0.readLong(), parcel0.readLong(), parcel0.readInt());
                }

                public Segment[] b(int v) {
                    return new Segment[v];
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

        public Segment(long v, long v1, int v2) {
            Assertions.a(v < v1);
            this.a = v;
            this.b = v1;
            this.c = v2;
        }

        // 检测为 Lambda 实现
        public static int a(Segment slowMotionData$Segment0, Segment slowMotionData$Segment1) [...]

        private static int c(Segment slowMotionData$Segment0, Segment slowMotionData$Segment1) {
            return p1.n().g(slowMotionData$Segment0.a, slowMotionData$Segment1.a).g(slowMotionData$Segment0.b, slowMotionData$Segment1.b).f(slowMotionData$Segment0.c, slowMotionData$Segment1.c).m();
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return Segment.class == class0 && (this.a == ((Segment)object0).a && this.b == ((Segment)object0).b && this.c == ((Segment)object0).c);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return B.b(new Object[]{this.a, this.b, this.c});
        }

        @Override
        public String toString() {
            return Util.S("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", new Object[]{this.a, this.b, this.c});
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeLong(this.a);
            parcel0.writeLong(this.b);
            parcel0.writeInt(this.c);
        }
    }

    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        SlowMotionData.CREATOR = new Parcelable.Creator() {
            public SlowMotionData a(Parcel parcel0) {
                ArrayList arrayList0 = new ArrayList();
                parcel0.readList(arrayList0, Segment.class.getClassLoader());
                return new SlowMotionData(arrayList0);
            }

            public SlowMotionData[] b(int v) {
                return new SlowMotionData[v];
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

    public SlowMotionData(List list0) {
        this.a = list0;
        Assertions.a(!SlowMotionData.a(list0));
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public byte[] E0() {
        return null;
    }

    private static boolean a(List list0) {
        if(list0.isEmpty()) {
            return false;
        }
        long v = ((Segment)list0.get(0)).b;
        for(int v1 = 1; v1 < list0.size(); ++v1) {
            if(((Segment)list0.get(v1)).a < v) {
                return true;
            }
            v = ((Segment)list0.get(v1)).b;
        }
        return false;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return SlowMotionData.class == class0 ? this.a.equals(((SlowMotionData)object0).a) : false;
        }
        return false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
    }

    @Override
    public String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeList(this.a);
    }
}

