package com.dcinside.app.write.menu.ai.type;

import O3.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@d
public final class AiSampleList implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public final AiSampleList a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new AiSampleList(parcel0.createStringArrayList(), parcel0.createStringArrayList());
        }

        @l
        public final AiSampleList[] b(int v) {
            return new AiSampleList[v];
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

    @l
    public static final Parcelable.Creator CREATOR;
    @c("ani")
    @l
    private final List a;
    @c("real")
    @l
    private final List b;

    static {
        AiSampleList.CREATOR = new a();
    }

    public AiSampleList() {
        this(null, null, 3, null);
    }

    public AiSampleList(@l List list0, @l List list1) {
        L.p(list0, "ani");
        L.p(list1, "real");
        super();
        this.a = list0;
        this.b = list1;
    }

    public AiSampleList(List list0, List list1, int v, w w0) {
        if((v & 1) != 0) {
            list0 = u.H();
        }
        if((v & 2) != 0) {
            list1 = u.H();
        }
        this(list0, list1);
    }

    @l
    public final List a() {
        return this.a;
    }

    @l
    public final List c() {
        return this.b;
    }

    @l
    public final AiSampleList d(@l List list0, @l List list1) {
        L.p(list0, "ani");
        L.p(list1, "real");
        return new AiSampleList(list0, list1);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static AiSampleList e(AiSampleList aiSampleList0, List list0, List list1, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = aiSampleList0.a;
        }
        if((v & 2) != 0) {
            list1 = aiSampleList0.b;
        }
        return aiSampleList0.d(list0, list1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AiSampleList)) {
            return false;
        }
        return L.g(this.a, ((AiSampleList)object0).a) ? L.g(this.b, ((AiSampleList)object0).b) : false;
    }

    @l
    public final List f() {
        return this.a;
    }

    @l
    public final List g() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "AiSampleList(ani=" + this.a + ", real=" + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "out");
        parcel0.writeStringList(this.a);
        parcel0.writeStringList(this.b);
    }
}

