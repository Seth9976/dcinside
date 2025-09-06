package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssMeasurementsEvent.Callback;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus.Callback;
import android.location.GnssStatus;
import android.location.GpsStatus.Listener;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import j..util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class LocationManagerCompat {
    static class Api19Impl {
        private static Class a;
        private static Method b;

        @SuppressLint({"BanUncheckedReflection"})
        static boolean a(LocationManager locationManager0, String s, LocationRequestCompat locationRequestCompat0, LocationListenerCompat locationListenerCompat0, Looper looper0) {
            try {
                if(Api19Impl.a == null) {
                    Api19Impl.a = LocationRequest.class;
                }
                if(Api19Impl.b == null) {
                    Method method0 = LocationManager.class.getDeclaredMethod("requestLocationUpdates", Api19Impl.a, LocationListener.class, Looper.class);
                    Api19Impl.b = method0;
                    method0.setAccessible(true);
                }
                LocationRequest locationRequest0 = locationRequestCompat0.i(s);
                if(locationRequest0 != null) {
                    Api19Impl.b.invoke(locationManager0, locationRequest0, locationListenerCompat0, looper0);
                    return true;
                }
            }
            catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException | UnsupportedOperationException unused_ex) {
            }
            return false;
        }

        @SuppressLint({"BanUncheckedReflection"})
        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static boolean b(LocationManager locationManager0, String s, LocationRequestCompat locationRequestCompat0, LocationListenerTransport locationManagerCompat$LocationListenerTransport0) {
            try {
                if(Api19Impl.a == null) {
                    Api19Impl.a = LocationRequest.class;
                }
                if(Api19Impl.b == null) {
                    Method method0 = LocationManager.class.getDeclaredMethod("requestLocationUpdates", Api19Impl.a, LocationListener.class, Looper.class);
                    Api19Impl.b = method0;
                    method0.setAccessible(true);
                }
                LocationRequest locationRequest0 = locationRequestCompat0.i(s);
                if(locationRequest0 != null) {
                    synchronized(LocationManagerCompat.h) {
                        Api19Impl.b.invoke(locationManager0, locationRequest0, locationManagerCompat$LocationListenerTransport0, Looper.getMainLooper());
                        LocationManagerCompat.q(locationManager0, locationManagerCompat$LocationListenerTransport0);
                        return true;
                    }
                }
            }
            catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException | UnsupportedOperationException unused_ex) {
            }
            return false;
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        static boolean a(LocationManager locationManager0, GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
            return locationManager0.registerGnssMeasurementsCallback(gnssMeasurementsEvent$Callback0);
        }

        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        static boolean b(LocationManager locationManager0, GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0, Handler handler0) {
            return locationManager0.registerGnssMeasurementsCallback(gnssMeasurementsEvent$Callback0, handler0);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static boolean c(LocationManager locationManager0, Handler handler0, Executor executor0, Callback gnssStatusCompat$Callback0) {
            Preconditions.a(handler0 != null);
            SimpleArrayMap simpleArrayMap0 = GnssListenersHolder.a;
            synchronized(simpleArrayMap0) {
                PreRGnssStatusTransport locationManagerCompat$PreRGnssStatusTransport0 = (PreRGnssStatusTransport)simpleArrayMap0.get(gnssStatusCompat$Callback0);
                if(locationManagerCompat$PreRGnssStatusTransport0 == null) {
                    locationManagerCompat$PreRGnssStatusTransport0 = new PreRGnssStatusTransport(gnssStatusCompat$Callback0);
                }
                else {
                    locationManagerCompat$PreRGnssStatusTransport0.j();
                }
                locationManagerCompat$PreRGnssStatusTransport0.i(executor0);
                if(locationManager0.registerGnssStatusCallback(locationManagerCompat$PreRGnssStatusTransport0, handler0)) {
                    simpleArrayMap0.put(gnssStatusCompat$Callback0, locationManagerCompat$PreRGnssStatusTransport0);
                    return true;
                }
                return false;
            }
        }

        static void d(LocationManager locationManager0, GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
            locationManager0.unregisterGnssMeasurementsCallback(gnssMeasurementsEvent$Callback0);
        }

        static void e(LocationManager locationManager0, Object object0) {
            if(object0 instanceof PreRGnssStatusTransport) {
                ((PreRGnssStatusTransport)object0).j();
            }
            locationManager0.unregisterGnssStatusCallback(((GnssStatus.Callback)object0));
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static String a(LocationManager locationManager0) {
            return locationManager0.getGnssHardwareModelName();
        }

        static int b(LocationManager locationManager0) {
            return locationManager0.getGnssYearOfHardware();
        }

        static boolean c(LocationManager locationManager0) {
            return locationManager0.isLocationEnabled();
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        private static Class a;
        private static Method b;

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static void a(LocationManager locationManager0, String s, CancellationSignal cancellationSignal0, Executor executor0, Consumer consumer0) {
            Objects.requireNonNull(consumer0);
            locationManager0.getCurrentLocation(s, cancellationSignal0, executor0, new s(consumer0));
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public static boolean b(LocationManager locationManager0, Handler handler0, Executor executor0, Callback gnssStatusCompat$Callback0) {
            SimpleArrayMap simpleArrayMap0 = GnssListenersHolder.a;
            synchronized(simpleArrayMap0) {
                GnssStatusTransport locationManagerCompat$GnssStatusTransport0 = (GnssStatusTransport)simpleArrayMap0.get(gnssStatusCompat$Callback0);
                if(locationManagerCompat$GnssStatusTransport0 == null) {
                    locationManagerCompat$GnssStatusTransport0 = new GnssStatusTransport(gnssStatusCompat$Callback0);
                }
                if(locationManager0.registerGnssStatusCallback(executor0, locationManagerCompat$GnssStatusTransport0)) {
                    simpleArrayMap0.put(gnssStatusCompat$Callback0, locationManagerCompat$GnssStatusTransport0);
                    return true;
                }
                return false;
            }
        }

        public static boolean c(LocationManager locationManager0, String s, LocationRequestCompat locationRequestCompat0, Executor executor0, LocationListenerCompat locationListenerCompat0) {
            if(Build.VERSION.SDK_INT >= 30) {
                try {
                    if(Api30Impl.a == null) {
                        Api30Impl.a = LocationRequest.class;
                    }
                    if(Api30Impl.b == null) {
                        Method method0 = LocationManager.class.getDeclaredMethod("requestLocationUpdates", Api30Impl.a, Executor.class, LocationListener.class);
                        Api30Impl.b = method0;
                        method0.setAccessible(true);
                    }
                    LocationRequest locationRequest0 = locationRequestCompat0.i(s);
                    if(locationRequest0 != null) {
                        Api30Impl.b.invoke(locationManager0, locationRequest0, executor0, locationListenerCompat0);
                        return true;
                    }
                    return false;
                }
                catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException | UnsupportedOperationException unused_ex) {
                }
            }
            return false;
        }
    }

    @RequiresApi(0x1F)
    static class Api31Impl {
        static boolean a(LocationManager locationManager0, String s) {
            return locationManager0.hasProvider(s);
        }

        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        static boolean b(LocationManager locationManager0, Executor executor0, GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
            return locationManager0.registerGnssMeasurementsCallback(executor0, gnssMeasurementsEvent$Callback0);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static void c(LocationManager locationManager0, String s, LocationRequest locationRequest0, Executor executor0, LocationListener locationListener0) {
            locationManager0.requestLocationUpdates(s, locationRequest0, executor0, locationListener0);
        }
    }

    static final class CancellableLocationListener implements LocationListener {
        private final LocationManager a;
        private final Executor b;
        private final Handler c;
        private Consumer d;
        @GuardedBy("this")
        private boolean e;
        Runnable f;

        CancellableLocationListener(LocationManager locationManager0, Executor executor0, Consumer consumer0) {
            this.a = locationManager0;
            this.b = executor0;
            this.c = new Handler(Looper.getMainLooper());
            this.d = consumer0;
        }

        // 检测为 Lambda 实现
        public static void b(Consumer consumer0, Location location0) [...]

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void c() {
            synchronized(this) {
                if(this.e) {
                    return;
                }
                this.e = true;
            }
            this.d();
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        private void d() {
            this.d = null;
            this.a.removeUpdates(this);
            Runnable runnable0 = this.f;
            if(runnable0 != null) {
                this.c.removeCallbacks(runnable0);
                this.f = null;
            }
        }

        // 检测为 Lambda 实现
        private void f() [...]

        @SuppressLint({"MissingPermission"})
        public void g(long v) {
            synchronized(this) {
                if(this.e) {
                    return;
                }
                t t0 = () -> {
                    this.f = null;
                    this.onLocationChanged(null);
                };
                this.f = t0;
                this.c.postDelayed(t0, v);
            }
        }

        @Override  // android.location.LocationListener
        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(Location location0) {
            synchronized(this) {
                if(this.e) {
                    return;
                }
                this.e = true;
            }
            u u0 = () -> this.d.accept(location0);
            this.b.execute(u0);
            this.d();
        }

        @Override  // android.location.LocationListener
        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(String s) {
            this.onLocationChanged(null);
        }

        @Override  // android.location.LocationListener
        public void onProviderEnabled(String s) {
        }

        @Override  // android.location.LocationListener
        public void onStatusChanged(String s, int v, Bundle bundle0) {
        }
    }

    static class GnssListenersHolder {
        @GuardedBy("sGnssStatusListeners")
        static final SimpleArrayMap a;
        @GuardedBy("sGnssMeasurementListeners")
        static final SimpleArrayMap b;

        static {
            GnssListenersHolder.a = new SimpleArrayMap();
            GnssListenersHolder.b = new SimpleArrayMap();
        }
    }

    @RequiresApi(24)
    static class GnssMeasurementsTransport extends GnssMeasurementsEvent.Callback {
        final GnssMeasurementsEvent.Callback a;
        volatile Executor b;

        GnssMeasurementsTransport(GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0, Executor executor0) {
            this.a = gnssMeasurementsEvent$Callback0;
            this.b = executor0;
        }

        // 检测为 Lambda 实现
        private void c(Executor executor0, GnssMeasurementsEvent gnssMeasurementsEvent0) [...]

        // 检测为 Lambda 实现
        private void d(Executor executor0, int v) [...]

        public void e() {
            this.b = null;
        }

        @Override  // android.location.GnssMeasurementsEvent$Callback
        public void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent0) {
            Executor executor0 = this.b;
            if(executor0 == null) {
                return;
            }
            executor0.execute(() -> {
                if(this.b != executor0) {
                    return;
                }
                this.a.onGnssMeasurementsReceived(gnssMeasurementsEvent0);
            });
        }

        @Override  // android.location.GnssMeasurementsEvent$Callback
        public void onStatusChanged(int v) {
            Executor executor0 = this.b;
            if(executor0 == null) {
                return;
            }
            executor0.execute(() -> {
                if(this.b != executor0) {
                    return;
                }
                this.a.onStatusChanged(v);
            });
        }
    }

    @RequiresApi(30)
    static class GnssStatusTransport extends GnssStatus.Callback {
        final Callback a;

        GnssStatusTransport(Callback gnssStatusCompat$Callback0) {
            Preconditions.b(gnssStatusCompat$Callback0 != null, "invalid null callback");
            this.a = gnssStatusCompat$Callback0;
        }

        @Override  // android.location.GnssStatus$Callback
        public void onFirstFix(int v) {
        }

        @Override  // android.location.GnssStatus$Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus0) {
            GnssStatusCompat.n(gnssStatus0);
        }

        @Override  // android.location.GnssStatus$Callback
        public void onStarted() {
        }

        @Override  // android.location.GnssStatus$Callback
        public void onStopped() {
        }
    }

    static class GpsStatusTransport implements GpsStatus.Listener {
        private final LocationManager a;
        final Callback b;
        volatile Executor c;

        GpsStatusTransport(LocationManager locationManager0, Callback gnssStatusCompat$Callback0) {
            Preconditions.b(gnssStatusCompat$Callback0 != null, "invalid null callback");
            this.a = locationManager0;
            this.b = gnssStatusCompat$Callback0;
        }

        public static void a(GpsStatusTransport locationManagerCompat$GpsStatusTransport0, Executor executor0) {
        }

        public static void b(GpsStatusTransport locationManagerCompat$GpsStatusTransport0, Executor executor0) {
        }

        public static void c(GpsStatusTransport locationManagerCompat$GpsStatusTransport0, Executor executor0, int v) {
        }

        public static void d(GpsStatusTransport locationManagerCompat$GpsStatusTransport0, Executor executor0, GnssStatusCompat gnssStatusCompat0) {
        }

        private void e(Executor executor0) {
            if(this.c != executor0) {
            }
        }

        private void f(Executor executor0) {
            if(this.c != executor0) {
            }
        }

        private void g(Executor executor0, int v) {
            if(this.c != executor0) {
            }
        }

        private void h(Executor executor0, GnssStatusCompat gnssStatusCompat0) {
            if(this.c != executor0) {
            }
        }

        public void i(Executor executor0) {
            Preconditions.n(this.c == null);
            this.c = executor0;
        }

        public void j() {
            this.c = null;
        }

        @Override  // android.location.GpsStatus$Listener
        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int v) {
            Executor executor0 = this.c;
            if(executor0 == null) {
                return;
            }
            switch(v) {
                case 1: {
                    executor0.execute(new z(this, executor0));
                    return;
                }
                case 2: {
                    executor0.execute(new A(this, executor0));
                    return;
                }
                case 3: {
                    GpsStatus gpsStatus0 = this.a.getGpsStatus(null);
                    if(gpsStatus0 != null) {
                        executor0.execute(new B(this, executor0, gpsStatus0.getTimeToFirstFix()));
                        return;
                    }
                    break;
                }
                case 4: {
                    GpsStatus gpsStatus1 = this.a.getGpsStatus(null);
                    if(gpsStatus1 != null) {
                        executor0.execute(new C(this, executor0, GnssStatusCompat.o(gpsStatus1)));
                        return;
                    }
                    break;
                }
            }
        }
    }

    static final class InlineHandlerExecutor implements Executor {
        private final Handler a;

        InlineHandlerExecutor(Handler handler0) {
            this.a = (Handler)Preconditions.l(handler0);
        }

        @Override
        public void execute(Runnable runnable0) {
            if(Looper.myLooper() == this.a.getLooper()) {
                runnable0.run();
                return;
            }
            Runnable runnable1 = (Runnable)Preconditions.l(runnable0);
            if(!this.a.post(runnable1)) {
                throw new RejectedExecutionException(this.a + " is shutting down");
            }
        }
    }

    static class LocationListenerKey {
        final String a;
        final LocationListenerCompat b;

        LocationListenerKey(String s, LocationListenerCompat locationListenerCompat0) {
            this.a = (String)ObjectsCompat.e(s, "invalid null provider");
            this.b = (LocationListenerCompat)ObjectsCompat.e(locationListenerCompat0, "invalid null listener");
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof LocationListenerKey ? this.a.equals(((LocationListenerKey)object0).a) && this.b.equals(((LocationListenerKey)object0).b) : false;
        }

        @Override
        public int hashCode() {
            return ObjectsCompat.b(new Object[]{this.a, this.b});
        }
    }

    static class LocationListenerTransport implements LocationListener {
        volatile LocationListenerKey a;
        final Executor b;

        LocationListenerTransport(LocationListenerKey locationManagerCompat$LocationListenerKey0, Executor executor0) {
            this.a = locationManagerCompat$LocationListenerKey0;
            this.b = executor0;
        }

        public LocationListenerKey g() {
            return (LocationListenerKey)ObjectsCompat.d(this.a);
        }

        // 检测为 Lambda 实现
        private void h(int v) [...]

        // 检测为 Lambda 实现
        private void i(Location location0) [...]

        // 检测为 Lambda 实现
        private void j(List list0) [...]

        // 检测为 Lambda 实现
        private void k(String s) [...]

        // 检测为 Lambda 实现
        private void l(String s) [...]

        // 检测为 Lambda 实现
        private void m(String s, int v, Bundle bundle0) [...]

        public void n() {
            this.a = null;
        }

        @Override  // android.location.LocationListener
        public void onFlushComplete(int v) {
            if(this.a == null) {
                return;
            }
            H h0 = () -> {
                LocationListenerKey locationManagerCompat$LocationListenerKey0 = this.a;
                if(locationManagerCompat$LocationListenerKey0 == null) {
                    return;
                }
                locationManagerCompat$LocationListenerKey0.b.onFlushComplete(v);
            };
            this.b.execute(h0);
        }

        @Override  // android.location.LocationListener
        public void onLocationChanged(Location location0) {
            if(this.a == null) {
                return;
            }
            G g0 = () -> {
                LocationListenerKey locationManagerCompat$LocationListenerKey0 = this.a;
                if(locationManagerCompat$LocationListenerKey0 == null) {
                    return;
                }
                locationManagerCompat$LocationListenerKey0.b.onLocationChanged(location0);
            };
            this.b.execute(g0);
        }

        @Override  // android.location.LocationListener
        public void onLocationChanged(List list0) {
            if(this.a == null) {
                return;
            }
            F f0 = () -> {
                LocationListenerKey locationManagerCompat$LocationListenerKey0 = this.a;
                if(locationManagerCompat$LocationListenerKey0 == null) {
                    return;
                }
                locationManagerCompat$LocationListenerKey0.b.onLocationChanged(list0);
            };
            this.b.execute(f0);
        }

        @Override  // android.location.LocationListener
        public void onProviderDisabled(String s) {
            if(this.a == null) {
                return;
            }
            E e0 = () -> {
                LocationListenerKey locationManagerCompat$LocationListenerKey0 = this.a;
                if(locationManagerCompat$LocationListenerKey0 == null) {
                    return;
                }
                locationManagerCompat$LocationListenerKey0.b.onProviderDisabled(s);
            };
            this.b.execute(e0);
        }

        @Override  // android.location.LocationListener
        public void onProviderEnabled(String s) {
            if(this.a == null) {
                return;
            }
            D d0 = () -> {
                LocationListenerKey locationManagerCompat$LocationListenerKey0 = this.a;
                if(locationManagerCompat$LocationListenerKey0 == null) {
                    return;
                }
                locationManagerCompat$LocationListenerKey0.b.onProviderEnabled(s);
            };
            this.b.execute(d0);
        }

        @Override  // android.location.LocationListener
        public void onStatusChanged(String s, int v, Bundle bundle0) {
            if(this.a == null) {
                return;
            }
            I i0 = () -> {
                LocationListenerKey locationManagerCompat$LocationListenerKey0 = this.a;
                if(locationManagerCompat$LocationListenerKey0 == null) {
                    return;
                }
                locationManagerCompat$LocationListenerKey0.b.onStatusChanged(s, v, bundle0);
            };
            this.b.execute(i0);
        }
    }

    @RequiresApi(24)
    static class PreRGnssStatusTransport extends GnssStatus.Callback {
        final Callback a;
        volatile Executor b;

        PreRGnssStatusTransport(Callback gnssStatusCompat$Callback0) {
            Preconditions.b(gnssStatusCompat$Callback0 != null, "invalid null callback");
            this.a = gnssStatusCompat$Callback0;
        }

        public static void a(PreRGnssStatusTransport locationManagerCompat$PreRGnssStatusTransport0, Executor executor0) {
        }

        public static void b(PreRGnssStatusTransport locationManagerCompat$PreRGnssStatusTransport0, Executor executor0, int v) {
        }

        public static void c(PreRGnssStatusTransport locationManagerCompat$PreRGnssStatusTransport0, Executor executor0) {
        }

        private void e(Executor executor0, int v) {
            if(this.b != executor0) {
            }
        }

        // 检测为 Lambda 实现
        private void f(Executor executor0, GnssStatus gnssStatus0) [...]

        private void g(Executor executor0) {
            if(this.b != executor0) {
            }
        }

        private void h(Executor executor0) {
            if(this.b != executor0) {
            }
        }

        public void i(Executor executor0) {
            boolean z = false;
            Preconditions.b(executor0 != null, "invalid null executor");
            if(this.b == null) {
                z = true;
            }
            Preconditions.n(z);
            this.b = executor0;
        }

        public void j() {
            this.b = null;
        }

        @Override  // android.location.GnssStatus$Callback
        public void onFirstFix(int v) {
            Executor executor0 = this.b;
            if(executor0 == null) {
                return;
            }
            executor0.execute(new J(this, executor0, v));
        }

        @Override  // android.location.GnssStatus$Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus0) {
            Executor executor0 = this.b;
            if(executor0 == null) {
                return;
            }
            executor0.execute(() -> {
                if(this.b != executor0) {
                    return;
                }
                GnssStatusCompat.n(gnssStatus0);
            });
        }

        @Override  // android.location.GnssStatus$Callback
        public void onStarted() {
            Executor executor0 = this.b;
            if(executor0 == null) {
                return;
            }
            executor0.execute(new M(this, executor0));
        }

        @Override  // android.location.GnssStatus$Callback
        public void onStopped() {
            Executor executor0 = this.b;
            if(executor0 == null) {
                return;
            }
            executor0.execute(new L(this, executor0));
        }
    }

    private static final long a = 30000L;
    private static final long b = 10000L;
    private static final long c = 5L;
    private static Field d;
    private static Class e;
    private static Method f;
    private static Method g;
    @GuardedBy("sLocationListeners")
    static final WeakHashMap h;

    static {
        LocationManagerCompat.h = new WeakHashMap();
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void c(LocationManager locationManager0, String s, CancellationSignal cancellationSignal0, Executor executor0, Consumer consumer0) {
        if(Build.VERSION.SDK_INT >= 30) {
            Api30Impl.a(locationManager0, s, cancellationSignal0, executor0, consumer0);
            return;
        }
        if(cancellationSignal0 != null) {
            cancellationSignal0.throwIfCanceled();
        }
        Location location0 = locationManager0.getLastKnownLocation(s);
        if(location0 != null && SystemClock.elapsedRealtime() - LocationCompat.c(location0) < 10000L) {
            executor0.execute(new p(consumer0, location0));
            return;
        }
        CancellableLocationListener locationManagerCompat$CancellableLocationListener0 = new CancellableLocationListener(locationManager0, executor0, consumer0);
        locationManager0.requestLocationUpdates(s, 0L, 0.0f, locationManagerCompat$CancellableLocationListener0, Looper.getMainLooper());
        if(cancellationSignal0 != null) {
            cancellationSignal0.setOnCancelListener(new q(locationManagerCompat$CancellableLocationListener0));
        }
        locationManagerCompat$CancellableLocationListener0.g(30000L);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @Deprecated
    public static void d(LocationManager locationManager0, String s, androidx.core.os.CancellationSignal cancellationSignal0, Executor executor0, Consumer consumer0) {
        LocationManagerCompat.c(locationManager0, s, (cancellationSignal0 == null ? null : ((CancellationSignal)cancellationSignal0.b())), executor0, consumer0);
    }

    public static String e(LocationManager locationManager0) {
        return Build.VERSION.SDK_INT < 28 ? null : Api28Impl.a(locationManager0);
    }

    public static int f(LocationManager locationManager0) {
        return Build.VERSION.SDK_INT < 28 ? 0 : Api28Impl.b(locationManager0);
    }

    public static boolean g(LocationManager locationManager0, String s) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return Api31Impl.a(locationManager0, s);
        }
        if(locationManager0.getAllProviders().contains(s)) {
            return true;
        }
        try {
            return locationManager0.getProvider(s) == null ? false : true;
        }
        catch(SecurityException unused_ex) {
            return false;
        }
    }

    // 去混淆评级： 低(20)
    public static boolean h(LocationManager locationManager0) {
        return Build.VERSION.SDK_INT < 28 ? locationManager0.isProviderEnabled("network") || locationManager0.isProviderEnabled("gps") : Api28Impl.c(locationManager0);
    }

    // 检测为 Lambda 实现
    private static Boolean j(LocationManager locationManager0, GpsStatusTransport locationManagerCompat$GpsStatusTransport0) throws Exception [...]

    @RequiresApi(24)
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean k(LocationManager locationManager0, GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0, Handler handler0) {
        int v = Build.VERSION.SDK_INT;
        if(v > 30) {
            return Api24Impl.b(locationManager0, gnssMeasurementsEvent$Callback0, handler0);
        }
        if(v == 30) {
            return LocationManagerCompat.m(locationManager0, ExecutorCompat.a(handler0), gnssMeasurementsEvent$Callback0);
        }
        SimpleArrayMap simpleArrayMap0 = GnssListenersHolder.b;
        synchronized(simpleArrayMap0) {
            LocationManagerCompat.u(locationManager0, gnssMeasurementsEvent$Callback0);
            if(Api24Impl.b(locationManager0, gnssMeasurementsEvent$Callback0, handler0)) {
                simpleArrayMap0.put(gnssMeasurementsEvent$Callback0, gnssMeasurementsEvent$Callback0);
                return true;
            }
            return false;
        }
    }

    @RequiresApi(24)
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean l(LocationManager locationManager0, Executor executor0, GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
        int v = Build.VERSION.SDK_INT;
        if(v > 30) {
            return Api31Impl.b(locationManager0, executor0, gnssMeasurementsEvent$Callback0);
        }
        if(v == 30) {
            return LocationManagerCompat.m(locationManager0, executor0, gnssMeasurementsEvent$Callback0);
        }
        SimpleArrayMap simpleArrayMap0 = GnssListenersHolder.b;
        synchronized(simpleArrayMap0) {
            GnssMeasurementsTransport locationManagerCompat$GnssMeasurementsTransport0 = new GnssMeasurementsTransport(gnssMeasurementsEvent$Callback0, executor0);
            LocationManagerCompat.u(locationManager0, gnssMeasurementsEvent$Callback0);
            if(Api24Impl.a(locationManager0, locationManagerCompat$GnssMeasurementsTransport0)) {
                simpleArrayMap0.put(gnssMeasurementsEvent$Callback0, locationManagerCompat$GnssMeasurementsTransport0);
                return true;
            }
            return false;
        }
    }

    @RequiresApi(30)
    private static boolean m(LocationManager locationManager0, Executor executor0, GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
        if(Build.VERSION.SDK_INT == 30) {
            try {
                if(LocationManagerCompat.e == null) {
                    LocationManagerCompat.e = Class.forName("android.location.GnssRequest$Builder");
                }
                if(LocationManagerCompat.f == null) {
                    Method method0 = LocationManagerCompat.e.getDeclaredMethod("build", null);
                    LocationManagerCompat.f = method0;
                    method0.setAccessible(true);
                }
                if(LocationManagerCompat.g == null) {
                    Class[] arr_class = {Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class};
                    Method method1 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", arr_class);
                    LocationManagerCompat.g = method1;
                    method1.setAccessible(true);
                }
                Object object0 = LocationManagerCompat.g.invoke(locationManager0, LocationManagerCompat.f.invoke(LocationManagerCompat.e.getDeclaredConstructor(null).newInstance(null), null), executor0, gnssMeasurementsEvent$Callback0);
                return object0 == null || !((Boolean)object0).booleanValue() ? false : true;
            }
            catch(ClassNotFoundException | InvocationTargetException | NoSuchMethodException | IllegalAccessException | InstantiationException unused_ex) {
                return false;
            }
        }
        throw new IllegalStateException();
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    private static boolean n(LocationManager locationManager0, Handler handler0, Executor executor0, Callback gnssStatusCompat$Callback0) {
        int v5;
        long v4;
        long v3;
        int v = 0;
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 30) {
            return Api30Impl.b(locationManager0, handler0, executor0, gnssStatusCompat$Callback0);
        }
        if(v1 >= 24) {
            return Api24Impl.c(locationManager0, handler0, executor0, gnssStatusCompat$Callback0);
        }
        Preconditions.a(handler0 != null);
        SimpleArrayMap simpleArrayMap0 = GnssListenersHolder.a;
        synchronized(simpleArrayMap0) {
            GpsStatusTransport locationManagerCompat$GpsStatusTransport0 = (GpsStatusTransport)simpleArrayMap0.get(gnssStatusCompat$Callback0);
            if(locationManagerCompat$GpsStatusTransport0 == null) {
                locationManagerCompat$GpsStatusTransport0 = new GpsStatusTransport(locationManager0, gnssStatusCompat$Callback0);
            }
            else {
                locationManagerCompat$GpsStatusTransport0.j();
            }
            locationManagerCompat$GpsStatusTransport0.i(executor0);
            FutureTask futureTask0 = new FutureTask(() -> Boolean.valueOf(locationManager0.addGpsStatusListener(locationManagerCompat$GpsStatusTransport0)));
            if(Looper.myLooper() == handler0.getLooper()) {
                futureTask0.run();
                goto label_21;
            }
            if(handler0.post(futureTask0)) {
                try {
                label_21:
                    v3 = TimeUnit.SECONDS.toNanos(5L);
                    v4 = System.nanoTime() + v3;
                    v5 = 0;
                    goto label_29;
                }
                catch(ExecutionException executionException0) {
                    goto label_37;
                }
                catch(TimeoutException timeoutException0) {
                    throw new IllegalStateException(handler0 + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", timeoutException0);
                    while(true) {
                        try {
                        label_29:
                            if(!((Boolean)futureTask0.get(v3, TimeUnit.NANOSECONDS)).booleanValue()) {
                                return false;
                            }
                            GnssListenersHolder.a.put(gnssStatusCompat$Callback0, locationManagerCompat$GpsStatusTransport0);
                            return true;
                        }
                        catch(InterruptedException unused_ex) {
                        }
                        catch(ExecutionException executionException0) {
                            goto label_36;
                        }
                        catch(TimeoutException timeoutException0) {
                            goto label_43;
                        }
                        catch(Throwable throwable0) {
                            break;
                        }
                        v3 = v4 - System.nanoTime();
                        v5 = 1;
                        goto label_29;
                    label_36:
                        v = v5;
                        try {
                        label_37:
                            if(executionException0.getCause() instanceof RuntimeException) {
                                throw (RuntimeException)executionException0.getCause();
                            }
                            if(!(executionException0.getCause() instanceof Error)) {
                                throw new IllegalStateException(executionException0);
                            }
                            throw (Error)executionException0.getCause();
                        label_43:
                            v = v5;
                            throw new IllegalStateException(handler0 + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", timeoutException0);
                        }
                        catch(Throwable throwable0) {
                            goto label_46;
                        }
                    }
                }
                catch(Throwable throwable0) {
                label_46:
                    goto label_49;
                }
                v = v5;
            label_49:
                if(v != 0) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        throw new IllegalStateException(handler0 + " is shutting down");
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean o(LocationManager locationManager0, Callback gnssStatusCompat$Callback0, Handler handler0) {
        return Build.VERSION.SDK_INT < 30 ? LocationManagerCompat.p(locationManager0, new InlineHandlerExecutor(handler0), gnssStatusCompat$Callback0) : LocationManagerCompat.p(locationManager0, ExecutorCompat.a(handler0), gnssStatusCompat$Callback0);
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean p(LocationManager locationManager0, Executor executor0, Callback gnssStatusCompat$Callback0) {
        if(Build.VERSION.SDK_INT >= 30) {
            return LocationManagerCompat.n(locationManager0, null, executor0, gnssStatusCompat$Callback0);
        }
        Looper looper0 = Looper.myLooper();
        if(looper0 == null) {
            looper0 = Looper.getMainLooper();
        }
        return LocationManagerCompat.n(locationManager0, new Handler(looper0), executor0, gnssStatusCompat$Callback0);
    }

    @GuardedBy("sLocationListeners")
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    static void q(LocationManager locationManager0, LocationListenerTransport locationManagerCompat$LocationListenerTransport0) {
        LocationListenerKey locationManagerCompat$LocationListenerKey0 = locationManagerCompat$LocationListenerTransport0.g();
        WeakReference weakReference0 = new WeakReference(locationManagerCompat$LocationListenerTransport0);
        WeakReference weakReference1 = (WeakReference)LocationManagerCompat.h.put(locationManagerCompat$LocationListenerKey0, weakReference0);
        LocationListenerTransport locationManagerCompat$LocationListenerTransport1 = weakReference1 == null ? null : ((LocationListenerTransport)weakReference1.get());
        if(locationManagerCompat$LocationListenerTransport1 != null) {
            locationManagerCompat$LocationListenerTransport1.n();
            locationManager0.removeUpdates(locationManagerCompat$LocationListenerTransport1);
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void r(LocationManager locationManager0, LocationListenerCompat locationListenerCompat0) {
        WeakHashMap weakHashMap0 = LocationManagerCompat.h;
        synchronized(weakHashMap0) {
            ArrayList arrayList0 = null;
            for(Object object0: weakHashMap0.values()) {
                LocationListenerTransport locationManagerCompat$LocationListenerTransport0 = (LocationListenerTransport)((WeakReference)object0).get();
                if(locationManagerCompat$LocationListenerTransport0 != null) {
                    LocationListenerKey locationManagerCompat$LocationListenerKey0 = locationManagerCompat$LocationListenerTransport0.g();
                    if(locationManagerCompat$LocationListenerKey0.b == locationListenerCompat0) {
                        if(arrayList0 == null) {
                            arrayList0 = new ArrayList();
                        }
                        arrayList0.add(locationManagerCompat$LocationListenerKey0);
                        locationManagerCompat$LocationListenerTransport0.n();
                        locationManager0.removeUpdates(locationManagerCompat$LocationListenerTransport0);
                    }
                }
            }
            if(arrayList0 != null) {
                for(Object object1: arrayList0) {
                    LocationManagerCompat.h.remove(((LocationListenerKey)object1));
                }
            }
        }
        locationManager0.removeUpdates(locationListenerCompat0);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void s(LocationManager locationManager0, String s, LocationRequestCompat locationRequestCompat0, LocationListenerCompat locationListenerCompat0, Looper looper0) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            Api31Impl.c(locationManager0, s, locationRequestCompat0.h(), ExecutorCompat.a(new Handler(looper0)), locationListenerCompat0);
            return;
        }
        if(Api19Impl.a(locationManager0, s, locationRequestCompat0, locationListenerCompat0, looper0)) {
            return;
        }
        locationManager0.requestLocationUpdates(s, locationRequestCompat0.b(), locationRequestCompat0.e(), locationListenerCompat0, looper0);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void t(LocationManager locationManager0, String s, LocationRequestCompat locationRequestCompat0, Executor executor0, LocationListenerCompat locationListenerCompat0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 0x1F) {
            Api31Impl.c(locationManager0, s, locationRequestCompat0.h(), executor0, locationListenerCompat0);
            return;
        }
        if(v >= 30 && Api30Impl.c(locationManager0, s, locationRequestCompat0, executor0, locationListenerCompat0)) {
            return;
        }
        LocationListenerTransport locationManagerCompat$LocationListenerTransport0 = new LocationListenerTransport(new LocationListenerKey(s, locationListenerCompat0), executor0);
        if(Api19Impl.b(locationManager0, s, locationRequestCompat0, locationManagerCompat$LocationListenerTransport0)) {
            return;
        }
        synchronized(LocationManagerCompat.h) {
            locationManager0.requestLocationUpdates(s, locationRequestCompat0.b(), locationRequestCompat0.e(), locationManagerCompat$LocationListenerTransport0, Looper.getMainLooper());
            LocationManagerCompat.q(locationManager0, locationManagerCompat$LocationListenerTransport0);
        }
    }

    @RequiresApi(24)
    public static void u(LocationManager locationManager0, GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
        if(Build.VERSION.SDK_INT >= 30) {
            Api24Impl.d(locationManager0, gnssMeasurementsEvent$Callback0);
            return;
        }
        SimpleArrayMap simpleArrayMap0 = GnssListenersHolder.b;
        synchronized(simpleArrayMap0) {
            GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback1 = n.a(simpleArrayMap0.remove(gnssMeasurementsEvent$Callback0));
            if(gnssMeasurementsEvent$Callback1 != null) {
                if(gnssMeasurementsEvent$Callback1 instanceof GnssMeasurementsTransport) {
                    ((GnssMeasurementsTransport)gnssMeasurementsEvent$Callback1).e();
                }
                Api24Impl.d(locationManager0, gnssMeasurementsEvent$Callback1);
            }
        }
    }

    public static void v(LocationManager locationManager0, Callback gnssStatusCompat$Callback0) {
        if(Build.VERSION.SDK_INT >= 24) {
            SimpleArrayMap simpleArrayMap0 = GnssListenersHolder.a;
            synchronized(simpleArrayMap0) {
                Object object0 = simpleArrayMap0.remove(gnssStatusCompat$Callback0);
                if(object0 != null) {
                    Api24Impl.e(locationManager0, object0);
                }
            }
            return;
        }
        SimpleArrayMap simpleArrayMap1 = GnssListenersHolder.a;
        synchronized(simpleArrayMap1) {
            GpsStatusTransport locationManagerCompat$GpsStatusTransport0 = (GpsStatusTransport)simpleArrayMap1.remove(gnssStatusCompat$Callback0);
            if(locationManagerCompat$GpsStatusTransport0 != null) {
                locationManagerCompat$GpsStatusTransport0.j();
                locationManager0.removeGpsStatusListener(locationManagerCompat$GpsStatusTransport0);
            }
        }
    }
}

