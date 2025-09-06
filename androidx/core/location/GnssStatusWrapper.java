package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

@RequiresApi(24)
@RestrictTo({Scope.a})
class GnssStatusWrapper extends GnssStatusCompat {
    @RequiresApi(26)
    static class Api26Impl {
        static float a(GnssStatus gnssStatus0, int v) {
            return gnssStatus0.getCarrierFrequencyHz(v);
        }

        static boolean b(GnssStatus gnssStatus0, int v) {
            return gnssStatus0.hasCarrierFrequencyHz(v);
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        static float a(GnssStatus gnssStatus0, int v) {
            return gnssStatus0.getBasebandCn0DbHz(v);
        }

        static boolean b(GnssStatus gnssStatus0, int v) {
            return gnssStatus0.hasBasebandCn0DbHz(v);
        }
    }

    private final GnssStatus i;

    GnssStatusWrapper(Object object0) {
        this.i = d.a(Preconditions.l(((GnssStatus)object0)));
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float a(int v) {
        return this.i.getAzimuthDegrees(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float b(int v) {
        if(Build.VERSION.SDK_INT < 30) {
            throw new UnsupportedOperationException();
        }
        return Api30Impl.a(this.i, v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float c(int v) {
        if(Build.VERSION.SDK_INT < 26) {
            throw new UnsupportedOperationException();
        }
        return Api26Impl.a(this.i, v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float d(int v) {
        return this.i.getCn0DbHz(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public int e(int v) {
        return this.i.getConstellationType(v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof GnssStatusWrapper ? this.i.equals(((GnssStatusWrapper)object0).i) : false;
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float f(int v) {
        return this.i.getElevationDegrees(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public int g() {
        return this.i.getSatelliteCount();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public int h(int v) {
        return this.i.getSvid(v);
    }

    @Override
    public int hashCode() {
        return this.i.hashCode();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean i(int v) {
        return this.i.hasAlmanacData(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean j(int v) {
        return Build.VERSION.SDK_INT < 30 ? false : Api30Impl.b(this.i, v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean k(int v) {
        return Build.VERSION.SDK_INT < 26 ? false : Api26Impl.b(this.i, v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean l(int v) {
        return this.i.hasEphemerisData(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean m(int v) {
        return this.i.usedInFix(v);
    }
}

