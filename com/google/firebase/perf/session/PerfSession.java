package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.u.c;
import com.google.firebase.perf.v1.u;
import com.google.firebase.perf.v1.w;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PerfSession implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public PerfSession a(@NonNull Parcel parcel0) {
            return new PerfSession(parcel0, null);
        }

        public PerfSession[] b(int v) {
            return new PerfSession[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(@NonNull Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final String a;
    private final Timer b;
    private boolean c;

    static {
        PerfSession.CREATOR = new a();
    }

    private PerfSession(@NonNull Parcel parcel0) {
        boolean z = false;
        this.c = false;
        this.a = parcel0.readString();
        if(parcel0.readByte() != 0) {
            z = true;
        }
        this.c = z;
        this.b = (Timer)parcel0.readParcelable(Timer.class.getClassLoader());
    }

    PerfSession(Parcel parcel0, a perfSession$a0) {
        this(parcel0);
    }

    @VisibleForTesting(otherwise = 3)
    public PerfSession(String s, com.google.firebase.perf.util.a a0) {
        this.c = false;
        this.a = s;
        this.b = a0.a();
    }

    public u a() {
        c u$c0 = u.v8().yb(this.a);
        if(this.c) {
            u$c0.vb(w.c);
        }
        return (u)u$c0.build();
    }

    @Nullable
    public static u[] c(@NonNull List list0) {
        if(list0.isEmpty()) {
            return null;
        }
        u[] arr_u = new u[list0.size()];
        u u0 = ((PerfSession)list0.get(0)).a();
        boolean z = false;
        for(int v = 1; v < list0.size(); ++v) {
            u u1 = ((PerfSession)list0.get(v)).a();
            if(z || !((PerfSession)list0.get(v)).h()) {
                arr_u[v] = u1;
            }
            else {
                arr_u[0] = u1;
                arr_u[v] = u0;
                z = true;
            }
        }
        if(!z) {
            arr_u[0] = u0;
        }
        return arr_u;
    }

    public static PerfSession d(@NonNull String s) {
        PerfSession perfSession0 = new PerfSession(s.replace("-", ""), new com.google.firebase.perf.util.a());
        perfSession0.m(PerfSession.o());
        return perfSession0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Timer e() {
        return this.b;
    }

    public boolean f() {
        return this.c;
    }

    public boolean g() {
        return TimeUnit.MICROSECONDS.toMinutes(this.b.d()) > com.google.firebase.perf.config.a.h().C();
    }

    public boolean h() {
        return this.c;
    }

    @VisibleForTesting
    static boolean i(@NonNull u u0) {
        for(Object object0: u0.G8()) {
            if(((w)object0) == w.c) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public String l() {
        return this.a;
    }

    public void m(boolean z) {
        this.c = z;
    }

    public static boolean o() {
        com.google.firebase.perf.config.a a0 = com.google.firebase.perf.config.a.h();
        return a0.N() && Math.random() < a0.F();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeByte(((byte)this.c));
        parcel0.writeParcelable(this.b, 0);
    }
}

