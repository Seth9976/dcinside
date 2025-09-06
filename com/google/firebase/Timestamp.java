package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import j..time.Instant;
import java.util.Date;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public final class Timestamp implements Parcelable, Comparable {
    public static final class a implements Parcelable.Creator {
        @l
        public Timestamp a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new Timestamp(parcel0.readLong(), parcel0.readInt());
        }

        @l
        public Timestamp[] b(int v) {
            return new Timestamp[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @l
        @n
        public final Timestamp c() {
            return new Timestamp(new Date());
        }

        private final V d(Date date0) {
            long v = date0.getTime();
            int v1 = (int)(date0.getTime() % 1000L * 1000000L);
            return v1 >= 0 ? r0.a(((long)(v / 1000L)), v1) : r0.a(((long)(v / 1000L - 1L)), ((int)(v1 + 1000000000)));
        }

        private final void e(long v, int v1) {
            if(v1 < 0 || v1 >= 1000000000) {
                throw new IllegalArgumentException(("Timestamp nanoseconds out of range: " + v1).toString());
            }
            if(0xFFFFFFF1886E0900L > v || v >= 253402300800L) {
                throw new IllegalArgumentException(("Timestamp seconds out of range: " + v).toString());
            }
        }
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    private final long a;
    private final int b;
    @l
    public static final b c;

    static {
        Timestamp.c = new b(null);
        Timestamp.CREATOR = new a();
    }

    public Timestamp(long v, int v1) {
        Timestamp.c.e(v, v1);
        this.a = v;
        this.b = v1;
    }

    @RequiresApi(26)
    public Timestamp(@l Instant instant0) {
        L.p(instant0, "time");
        this(instant0.getEpochSecond(), instant0.getNano());
    }

    public Timestamp(@l Date date0) {
        L.p(date0, "date");
        super();
        V v0 = Timestamp.c.d(date0);
        long v1 = ((Number)v0.a()).longValue();
        int v2 = ((Number)v0.b()).intValue();
        Timestamp.c.e(v1, v2);
        this.a = v1;
        this.b = v2;
    }

    public int a(@l Timestamp timestamp0) {
        final class c extends h0 {
            public static final c a;

            static {
                c.a = new c();
            }

            c() {
                super(Timestamp.class, "seconds", "getSeconds()J", 0);
            }

            @Override  // kotlin.jvm.internal.h0
            @m
            public Object get(@m Object object0) {
                return ((Timestamp)object0).d();
            }
        }


        final class d extends h0 {
            public static final d a;

            static {
                d.a = new d();
            }

            d() {
                super(Timestamp.class, "nanoseconds", "getNanoseconds()I", 0);
            }

            @Override  // kotlin.jvm.internal.h0
            @m
            public Object get(@m Object object0) {
                return ((Timestamp)object0).c();
            }
        }

        L.p(timestamp0, "other");
        return kotlin.comparisons.a.o(this, timestamp0, new Function1[]{c.a, d.a});
    }

    public final int c() {
        return this.b;
    }

    @Override
    public int compareTo(Object object0) {
        return this.a(((Timestamp)object0));
    }

    public final long d() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    @n
    public static final Timestamp e() {
        return Timestamp.c.c();
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 == this || object0 instanceof Timestamp && this.a(((Timestamp)object0)) == 0;
    }

    @l
    public final Date f() {
        return new Date(this.a * 1000L + ((long)(this.b / 1000000)));
    }

    @RequiresApi(26)
    @l
    public final Instant g() {
        Instant instant0 = Instant.ofEpochSecond(this.a, this.b);
        L.o(instant0, "ofEpochSecond(seconds, nanoseconds.toLong())");
        return instant0;
    }

    @Override
    public int hashCode() {
        return (((int)this.a) * 0x559 + ((int)(this.a >> 0x20))) * 37 + this.b;
    }

    @Override
    @l
    public String toString() {
        return "Timestamp(seconds=" + this.a + ", nanoseconds=" + this.b + ')';
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeLong(this.a);
        parcel0.writeInt(this.b);
    }
}

