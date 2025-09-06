package androidx.core.location;

import android.location.LocationManager;
import java.util.concurrent.Callable;

public final class r implements Callable {
    public final LocationManager a;
    public final GpsStatusTransport b;

    public r(LocationManager locationManager0, GpsStatusTransport locationManagerCompat$GpsStatusTransport0) {
        this.a = locationManager0;
        this.b = locationManagerCompat$GpsStatusTransport0;
    }

    @Override
    public final Object call() {
        return LocationManagerCompat.j(this.a, this.b);
    }
}

