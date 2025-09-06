package androidx.work;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.c;
import androidx.room.ColumnInfo;
import androidx.room.Ignore;
import androidx.work.impl.utils.DurationApi26Impl;
import androidx.work.impl.utils.NetworkRequest30;
import androidx.work.impl.utils.NetworkRequestCompat;
import j..time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class Constraints {
    public static final class Builder {
        private boolean a;
        private boolean b;
        @l
        private NetworkRequestCompat c;
        @l
        private NetworkType d;
        private boolean e;
        private boolean f;
        private long g;
        private long h;
        @l
        private Set i;

        public Builder() {
            this.c = new NetworkRequestCompat(null, 1, null);
            this.d = NetworkType.a;
            this.g = -1L;
            this.h = -1L;
            this.i = new LinkedHashSet();
        }

        @RestrictTo({Scope.b})
        public Builder(@l Constraints constraints0) {
            L.p(constraints0, "constraints");
            super();
            boolean z = true;
            this.c = new NetworkRequestCompat(null, 1, null);
            this.d = NetworkType.a;
            this.g = -1L;
            this.h = -1L;
            this.i = new LinkedHashSet();
            this.a = constraints0.i();
            int v = Build.VERSION.SDK_INT;
            if(v < 23 || !constraints0.j()) {
                z = false;
            }
            this.b = z;
            this.d = constraints0.f();
            this.e = constraints0.h();
            this.f = constraints0.k();
            if(v >= 24) {
                this.g = constraints0.b();
                this.h = constraints0.a();
                this.i = u.Z5(constraints0.c());
            }
        }

        @RequiresApi(24)
        @l
        public final Builder a(@l Uri uri0, boolean z) {
            L.p(uri0, "uri");
            this.i.add(new ContentUriTrigger(uri0, z));
            return this;
        }

        @l
        public final Constraints b() {
            long v2;
            long v1;
            Set set0;
            int v = Build.VERSION.SDK_INT;
            if(v >= 24) {
                set0 = u.a6(this.i);
                v1 = this.g;
                v2 = this.h;
            }
            else {
                set0 = k0.k();
                v1 = -1L;
                v2 = -1L;
            }
            NetworkRequestCompat networkRequestCompat0 = this.c;
            NetworkType networkType0 = this.d;
            boolean z = this.a;
            return v < 23 || !this.b ? new Constraints(networkRequestCompat0, networkType0, z, false, this.e, this.f, v1, v2, set0) : new Constraints(networkRequestCompat0, networkType0, z, true, this.e, this.f, v1, v2, set0);
        }

        @RequiresApi(21)
        @l
        public final Builder c(@l NetworkRequest networkRequest0, @l NetworkType networkType0) {
            L.p(networkRequest0, "networkRequest");
            L.p(networkType0, "networkType");
            int v = Build.VERSION.SDK_INT;
            if(v >= 28) {
                if(v >= 0x1F && NetworkRequest30.a.a(networkRequest0) != null) {
                    throw new IllegalArgumentException("NetworkRequests with NetworkSpecifiers set aren\'t supported.");
                }
                this.c = new NetworkRequestCompat(networkRequest0);
                this.d = NetworkType.a;
                return this;
            }
            this.d = networkType0;
            return this;
        }

        @l
        public final Builder d(@l NetworkType networkType0) {
            L.p(networkType0, "networkType");
            this.d = networkType0;
            this.c = new NetworkRequestCompat(null, 1, null);
            return this;
        }

        @l
        public final Builder e(boolean z) {
            this.e = z;
            return this;
        }

        @l
        public final Builder f(boolean z) {
            this.a = z;
            return this;
        }

        @RequiresApi(23)
        @l
        public final Builder g(boolean z) {
            this.b = z;
            return this;
        }

        @l
        public final Builder h(boolean z) {
            this.f = z;
            return this;
        }

        @RequiresApi(24)
        @l
        public final Builder i(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "timeUnit");
            this.h = timeUnit0.toMillis(v);
            return this;
        }

        @RequiresApi(26)
        @l
        public final Builder j(@l Duration duration0) {
            L.p(duration0, "duration");
            this.h = DurationApi26Impl.a(duration0);
            return this;
        }

        @RequiresApi(24)
        @l
        public final Builder k(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "timeUnit");
            this.g = timeUnit0.toMillis(v);
            return this;
        }

        @RequiresApi(26)
        @l
        public final Builder l(@l Duration duration0) {
            L.p(duration0, "duration");
            this.g = DurationApi26Impl.a(duration0);
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public static final class ContentUriTrigger {
        @l
        private final Uri a;
        private final boolean b;

        public ContentUriTrigger(@l Uri uri0, boolean z) {
            L.p(uri0, "uri");
            super();
            this.a = uri0;
            this.b = z;
        }

        @l
        public final Uri a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            Class class0 = object0 == null ? null : object0.getClass();
            if(!L.g(ContentUriTrigger.class, class0)) {
                return false;
            }
            L.n(object0, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            return L.g(this.a, ((ContentUriTrigger)object0).a) ? this.b == ((ContentUriTrigger)object0).b : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + c.a(this.b);
        }
    }

    @ColumnInfo(name = "required_network_type")
    @l
    private final NetworkType a;
    @ColumnInfo(defaultValue = "x\'\'", name = "required_network_request")
    @l
    private final NetworkRequestCompat b;
    @ColumnInfo(name = "requires_charging")
    private final boolean c;
    @ColumnInfo(name = "requires_device_idle")
    private final boolean d;
    @ColumnInfo(name = "requires_battery_not_low")
    private final boolean e;
    @ColumnInfo(name = "requires_storage_not_low")
    private final boolean f;
    @ColumnInfo(name = "trigger_content_update_delay")
    private final long g;
    @ColumnInfo(name = "trigger_max_content_delay")
    private final long h;
    @ColumnInfo(name = "content_uri_triggers")
    @l
    private final Set i;
    @l
    public static final Companion j;
    @l
    @f
    public static final Constraints k;

    static {
        Constraints.j = new Companion(null);
        Constraints.k = new Constraints(null, false, false, false, 15, null);
    }

    @SuppressLint({"NewApi"})
    public Constraints(@l Constraints constraints0) {
        L.p(constraints0, "other");
        super();
        this.c = constraints0.c;
        this.d = constraints0.d;
        this.b = constraints0.b;
        this.a = constraints0.a;
        this.e = constraints0.e;
        this.f = constraints0.f;
        this.i = constraints0.i;
        this.g = constraints0.g;
        this.h = constraints0.h;
    }

    @SuppressLint({"NewApi"})
    @Ignore
    public Constraints(@l NetworkType networkType0, boolean z, boolean z1, boolean z2) {
        L.p(networkType0, "requiredNetworkType");
        this(networkType0, z, false, z1, z2);
    }

    public Constraints(NetworkType networkType0, boolean z, boolean z1, boolean z2, int v, w w0) {
        if((v & 1) != 0) {
            networkType0 = NetworkType.a;
        }
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        if((v & 8) != 0) {
            z2 = false;
        }
        this(networkType0, z, z1, z2);
    }

    @SuppressLint({"NewApi"})
    @RequiresApi(23)
    @Ignore
    public Constraints(@l NetworkType networkType0, boolean z, boolean z1, boolean z2, boolean z3) {
        L.p(networkType0, "requiredNetworkType");
        this(networkType0, z, z1, z2, z3, -1L, 0L, null, 0xC0, null);
    }

    public Constraints(NetworkType networkType0, boolean z, boolean z1, boolean z2, boolean z3, int v, w w0) {
        if((v & 1) != 0) {
            networkType0 = NetworkType.a;
        }
        this(networkType0, ((v & 2) == 0 ? z : false), ((v & 4) == 0 ? z1 : false), ((v & 8) == 0 ? z2 : false), ((v & 16) == 0 ? z3 : false));
    }

    @RequiresApi(24)
    @Ignore
    public Constraints(@l NetworkType networkType0, boolean z, boolean z1, boolean z2, boolean z3, long v, long v1, @l Set set0) {
        L.p(networkType0, "requiredNetworkType");
        L.p(set0, "contentUriTriggers");
        super();
        this.b = new NetworkRequestCompat(null, 1, null);
        this.a = networkType0;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = z3;
        this.g = v;
        this.h = v1;
        this.i = set0;
    }

    public Constraints(NetworkType networkType0, boolean z, boolean z1, boolean z2, boolean z3, long v, long v1, Set set0, int v2, w w0) {
        this(((v2 & 1) == 0 ? networkType0 : NetworkType.a), ((v2 & 2) == 0 ? z : false), ((v2 & 4) == 0 ? z1 : false), ((v2 & 8) == 0 ? z2 : false), ((v2 & 16) == 0 ? z3 : false), ((v2 & 0x20) == 0 ? v : -1L), ((v2 & 0x40) == 0 ? v1 : -1L), ((v2 & 0x80) == 0 ? set0 : k0.k()));
    }

    public Constraints(@l NetworkRequestCompat networkRequestCompat0, @l NetworkType networkType0, boolean z, boolean z1, boolean z2, boolean z3, long v, long v1, @l Set set0) {
        L.p(networkRequestCompat0, "requiredNetworkRequestCompat");
        L.p(networkType0, "requiredNetworkType");
        L.p(set0, "contentUriTriggers");
        super();
        this.b = networkRequestCompat0;
        this.a = networkType0;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = z3;
        this.g = v;
        this.h = v1;
        this.i = set0;
    }

    public Constraints(NetworkRequestCompat networkRequestCompat0, NetworkType networkType0, boolean z, boolean z1, boolean z2, boolean z3, long v, long v1, Set set0, int v2, w w0) {
        this(networkRequestCompat0, ((v2 & 2) == 0 ? networkType0 : NetworkType.a), ((v2 & 4) == 0 ? z : false), ((v2 & 8) == 0 ? z1 : false), ((v2 & 16) == 0 ? z2 : false), ((v2 & 0x20) == 0 ? z3 : false), ((v2 & 0x40) == 0 ? v : -1L), ((v2 & 0x80) == 0 ? v1 : -1L), ((v2 & 0x100) == 0 ? set0 : k0.k()));
    }

    @RequiresApi(24)
    public final long a() {
        return this.h;
    }

    @RequiresApi(24)
    public final long b() {
        return this.g;
    }

    @RequiresApi(24)
    @l
    public final Set c() {
        return this.i;
    }

    @RequiresApi(21)
    @m
    public final NetworkRequest d() {
        return this.b.e();
    }

    @l
    public final NetworkRequestCompat e() {
        return this.b;
    }

    @Override
    @SuppressLint({"NewApi"})
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(!L.g(Constraints.class, class0) || this.c != ((Constraints)object0).c) {
                return false;
            }
            if(this.d != ((Constraints)object0).d) {
                return false;
            }
            if(this.e != ((Constraints)object0).e) {
                return false;
            }
            if(this.f != ((Constraints)object0).f) {
                return false;
            }
            if(this.g != ((Constraints)object0).g) {
                return false;
            }
            if(this.h != ((Constraints)object0).h) {
                return false;
            }
            if(!L.g(this.d(), ((Constraints)object0).d())) {
                return false;
            }
            return this.a == ((Constraints)object0).a ? L.g(this.i, ((Constraints)object0).i) : false;
        }
        return false;
    }

    @l
    public final NetworkType f() {
        return this.a;
    }

    @RestrictTo({Scope.b})
    public final boolean g() {
        return Build.VERSION.SDK_INT < 24 || !this.i.isEmpty();
    }

    public final boolean h() {
        return this.e;
    }

    @Override
    @SuppressLint({"NewApi"})
    public int hashCode() {
        int v = (((((((this.a.hashCode() * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + ((int)(this.g ^ this.g >>> 0x20))) * 0x1F + ((int)(this.h ^ this.h >>> 0x20))) * 0x1F + this.i.hashCode()) * 0x1F;
        NetworkRequest networkRequest0 = this.d();
        return networkRequest0 == null ? v : v + networkRequest0.hashCode();
    }

    public final boolean i() {
        return this.c;
    }

    @RequiresApi(23)
    public final boolean j() {
        return this.d;
    }

    public final boolean k() {
        return this.f;
    }

    @Override
    @SuppressLint({"NewApi"})
    @l
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }
}

