package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

@UnstableApi
public final class DrmInitData implements Parcelable, Comparator {
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        private int a;
        public final UUID b;
        @Nullable
        public final String c;
        public final String d;
        @Nullable
        public final byte[] e;

        static {
            SchemeData.CREATOR = new Parcelable.Creator() {
                public SchemeData a(Parcel parcel0) {
                    return new SchemeData(parcel0);
                }

                public SchemeData[] b(int v) {
                    return new SchemeData[v];
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

        SchemeData(Parcel parcel0) {
            this.b = new UUID(parcel0.readLong(), parcel0.readLong());
            this.c = parcel0.readString();
            this.d = (String)Util.o(parcel0.readString());
            this.e = parcel0.createByteArray();
        }

        public SchemeData(UUID uUID0, @Nullable String s, String s1, @Nullable byte[] arr_b) {
            this.b = (UUID)Assertions.g(uUID0);
            this.c = s;
            this.d = MimeTypes.v(((String)Assertions.g(s1)));
            this.e = arr_b;
        }

        public SchemeData(UUID uUID0, String s, @Nullable byte[] arr_b) {
            this(uUID0, null, s, arr_b);
        }

        // 去混淆评级： 低(30)
        public boolean a(SchemeData drmInitData$SchemeData0) {
            return this.d() && !drmInitData$SchemeData0.d() && this.e(drmInitData$SchemeData0.b);
        }

        @CheckResult
        public SchemeData c(@Nullable byte[] arr_b) {
            return new SchemeData(this.b, this.c, this.d, arr_b);
        }

        public boolean d() {
            return this.e != null;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        // 去混淆评级： 低(20)
        public boolean e(UUID uUID0) {
            return C.g2.equals(this.b) || uUID0.equals(this.b);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            if(!(object0 instanceof SchemeData)) {
                return false;
            }
            return object0 == this ? true : Util.g(this.c, ((SchemeData)object0).c) && Util.g(this.d, ((SchemeData)object0).d) && Util.g(this.b, ((SchemeData)object0).b) && Arrays.equals(this.e, ((SchemeData)object0).e);
        }

        @Override
        public int hashCode() {
            if(this.a == 0) {
                int v = Arrays.hashCode(this.e);
                this.a = ((this.b.hashCode() * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + this.d.hashCode()) * 0x1F + v;
            }
            return this.a;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeLong(this.b.getMostSignificantBits());
            parcel0.writeLong(this.b.getLeastSignificantBits());
            parcel0.writeString(this.c);
            parcel0.writeString(this.d);
            parcel0.writeByteArray(this.e);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final SchemeData[] a;
    private int b;
    @Nullable
    public final String c;
    public final int d;

    static {
        DrmInitData.CREATOR = new Parcelable.Creator() {
            public DrmInitData a(Parcel parcel0) {
                return new DrmInitData(parcel0);
            }

            public DrmInitData[] b(int v) {
                return new DrmInitData[v];
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

    DrmInitData(Parcel parcel0) {
        this.c = parcel0.readString();
        SchemeData[] arr_drmInitData$SchemeData = (SchemeData[])Util.o(((SchemeData[])parcel0.createTypedArray(SchemeData.CREATOR)));
        this.a = arr_drmInitData$SchemeData;
        this.d = arr_drmInitData$SchemeData.length;
    }

    public DrmInitData(@Nullable String s, List list0) {
        this(s, false, ((SchemeData[])list0.toArray(new SchemeData[0])));
    }

    private DrmInitData(@Nullable String s, boolean z, SchemeData[] arr_drmInitData$SchemeData) {
        this.c = s;
        if(z) {
            arr_drmInitData$SchemeData = (SchemeData[])arr_drmInitData$SchemeData.clone();
        }
        this.a = arr_drmInitData$SchemeData;
        this.d = arr_drmInitData$SchemeData.length;
        Arrays.sort(arr_drmInitData$SchemeData, this);
    }

    public DrmInitData(@Nullable String s, SchemeData[] arr_drmInitData$SchemeData) {
        this(s, true, arr_drmInitData$SchemeData);
    }

    public DrmInitData(List list0) {
        this(null, false, ((SchemeData[])list0.toArray(new SchemeData[0])));
    }

    public DrmInitData(SchemeData[] arr_drmInitData$SchemeData) {
        this(null, arr_drmInitData$SchemeData);
    }

    @Override
    public int compare(Object object0, Object object1) {
        return this.g(((SchemeData)object0), ((SchemeData)object1));
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
            return DrmInitData.class == class0 && (Util.g(this.c, ((DrmInitData)object0).c) && Arrays.equals(this.a, ((DrmInitData)object0).a));
        }
        return false;
    }

    public int g(SchemeData drmInitData$SchemeData0, SchemeData drmInitData$SchemeData1) {
        UUID uUID0 = C.g2;
        if(uUID0.equals(drmInitData$SchemeData0.b)) {
            return uUID0.equals(drmInitData$SchemeData1.b) ? 0 : 1;
        }
        return drmInitData$SchemeData0.b.compareTo(drmInitData$SchemeData1.b);
    }

    @Override
    public int hashCode() {
        if(this.b == 0) {
            this.b = (this.c == null ? 0 : this.c.hashCode()) * 0x1F + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    private static boolean i(ArrayList arrayList0, int v, UUID uUID0) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(((SchemeData)arrayList0.get(v1)).b.equals(uUID0)) {
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @CheckResult
    public DrmInitData o(@Nullable String s) {
        return Util.g(this.c, s) ? this : new DrmInitData(s, false, this.a);
    }

    @Nullable
    public static DrmInitData q(@Nullable DrmInitData drmInitData0, @Nullable DrmInitData drmInitData1) {
        String s;
        ArrayList arrayList0 = new ArrayList();
        if(drmInitData0 == null) {
            s = null;
        }
        else {
            s = drmInitData0.c;
            SchemeData[] arr_drmInitData$SchemeData = drmInitData0.a;
            for(int v1 = 0; v1 < arr_drmInitData$SchemeData.length; ++v1) {
                SchemeData drmInitData$SchemeData0 = arr_drmInitData$SchemeData[v1];
                if(drmInitData$SchemeData0.d()) {
                    arrayList0.add(drmInitData$SchemeData0);
                }
            }
        }
        if(drmInitData1 != null) {
            if(s == null) {
                s = drmInitData1.c;
            }
            int v2 = arrayList0.size();
            SchemeData[] arr_drmInitData$SchemeData1 = drmInitData1.a;
            for(int v = 0; v < arr_drmInitData$SchemeData1.length; ++v) {
                SchemeData drmInitData$SchemeData1 = arr_drmInitData$SchemeData1[v];
                if(drmInitData$SchemeData1.d() && !DrmInitData.i(arrayList0, v2, drmInitData$SchemeData1.b)) {
                    arrayList0.add(drmInitData$SchemeData1);
                }
            }
        }
        return arrayList0.isEmpty() ? null : new DrmInitData(s, arrayList0);
    }

    public SchemeData s(int v) {
        return this.a[v];
    }

    public DrmInitData t(DrmInitData drmInitData0) {
        Assertions.i(this.c == null || (drmInitData0.c == null || TextUtils.equals(this.c, drmInitData0.c)));
        return new DrmInitData((this.c == null ? drmInitData0.c : this.c), ((SchemeData[])Util.K1(this.a, drmInitData0.a)));
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.c);
        parcel0.writeTypedArray(this.a, 0);
    }
}

