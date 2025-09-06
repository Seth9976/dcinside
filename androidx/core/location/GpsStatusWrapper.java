package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build.VERSION;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.util.Iterator;

@RestrictTo({Scope.a})
class GpsStatusWrapper extends GnssStatusCompat {
    private final GpsStatus i;
    @GuardedBy("mWrapped")
    private int j;
    @GuardedBy("mWrapped")
    private Iterator k;
    @GuardedBy("mWrapped")
    private int l;
    @GuardedBy("mWrapped")
    private GpsSatellite m;
    private static final int n = 0;
    private static final int o = 0x20;
    private static final int p = 33;
    private static final int q = 0x40;
    private static final int r = -87;
    private static final int s = 0x40;
    private static final int t = 24;
    private static final int u = 0xC1;
    private static final int v = 200;
    private static final int w = 200;
    private static final int x = 35;

    GpsStatusWrapper(GpsStatus gpsStatus0) {
        GpsStatus gpsStatus1 = (GpsStatus)Preconditions.l(gpsStatus0);
        this.i = gpsStatus1;
        this.j = -1;
        this.k = gpsStatus1.getSatellites().iterator();
        this.l = -1;
        this.m = null;
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float a(int v) {
        return this.q(v).getAzimuth();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float b(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float c(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float d(int v) {
        return this.q(v).getSnr();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public int e(int v) {
        return Build.VERSION.SDK_INT >= 24 ? GpsStatusWrapper.p(this.q(v).getPrn()) : 1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof GpsStatusWrapper ? this.i.equals(((GpsStatusWrapper)object0).i) : false;
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float f(int v) {
        return this.q(v).getElevation();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public int g() {
        synchronized(this.i) {
            if(this.j == -1) {
                for(Object object0: this.i.getSatellites()) {
                    GpsSatellite gpsSatellite0 = (GpsSatellite)object0;
                    ++this.j;
                }
                ++this.j;
            }
            return this.j;
        }
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public int h(int v) {
        return Build.VERSION.SDK_INT >= 24 ? GpsStatusWrapper.r(this.q(v).getPrn()) : this.q(v).getPrn();
    }

    @Override
    public int hashCode() {
        return this.i.hashCode();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean i(int v) {
        return this.q(v).hasAlmanac();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean j(int v) {
        return false;
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean k(int v) {
        return false;
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean l(int v) {
        return this.q(v).hasEphemeris();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean m(int v) {
        return this.q(v).usedInFix();
    }

    private static int p(int v) {
        if(v > 0 && v <= 0x20) {
            return 1;
        }
        if(v >= 33 && v <= 0x40) {
            return 2;
        }
        if(v > 0x40 && v <= 88) {
            return 3;
        }
        if(v > 200 && v <= 0xEB) {
            return 5;
        }
        return v < 0xC1 || v > 200 ? 0 : 4;
    }

    private GpsSatellite q(int v) {
        synchronized(this.i) {
            if(v < this.l) {
                this.k = this.i.getSatellites().iterator();
                this.l = -1;
            }
            int v2;
            while((v2 = this.l) < v) {
                this.l = v2 + 1;
                if(!this.k.hasNext()) {
                    this.m = null;
                    break;
                }
                Object object0 = this.k.next();
                this.m = (GpsSatellite)object0;
            }
        }
        return (GpsSatellite)Preconditions.l(this.m);
    }

    private static int r(int v) {
        switch(GpsStatusWrapper.p(v)) {
            case 2: {
                return v + 87;
            }
            case 3: {
                return v - 0x40;
            }
            case 5: {
                return v - 200;
            }
            default: {
                return v;
            }
        }
    }
}

