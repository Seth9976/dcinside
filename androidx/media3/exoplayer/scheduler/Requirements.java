package androidx.media3.exoplayer.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class Requirements implements Parcelable {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface RequirementFlags {
    }

    public static final Parcelable.Creator CREATOR = null;
    private final int a;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 16;

    static {
        Requirements.CREATOR = new Parcelable.Creator() {
            public Requirements a(Parcel parcel0) {
                return new Requirements(parcel0.readInt());
            }

            public Requirements[] b(int v) {
                return new Requirements[v];
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

    public Requirements(int v) {
        if((v & 2) != 0) {
            v |= 1;
        }
        this.a = v;
    }

    public boolean a(Context context0) {
        return this.e(context0) == 0;
    }

    public Requirements c(int v) {
        int v1 = v & this.a;
        return v1 == this.a ? this : new Requirements(v1);
    }

    private int d(Context context0) {
        if(!this.o()) {
            return 0;
        }
        ConnectivityManager connectivityManager0 = (ConnectivityManager)Assertions.g(context0.getSystemService("connectivity"));
        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        if(networkInfo0 != null && networkInfo0.isConnected() && Requirements.m(connectivityManager0)) {
            return !this.s() || !connectivityManager0.isActiveNetworkMetered() ? 0 : 2;
        }
        return this.a & 3;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e(Context context0) {
        int v = this.d(context0);
        if(this.g() && !this.h(context0)) {
            v |= 8;
        }
        if(this.l() && !this.i(context0)) {
            v |= 4;
        }
        return !this.r() || this.q(context0) ? v : v | 16;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return Requirements.class == class0 && this.a == ((Requirements)object0).a;
        }
        return false;
    }

    public int f() {
        return this.a;
    }

    public boolean g() {
        return (this.a & 8) != 0;
    }

    private boolean h(Context context0) {
        Intent intent0 = context0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if(intent0 == null) {
            return false;
        }
        switch(intent0.getIntExtra("status", -1)) {
            case 2: 
            case 5: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    private boolean i(Context context0) {
        PowerManager powerManager0 = (PowerManager)Assertions.g(context0.getSystemService("power"));
        int v = Util.a;
        if(v >= 23) {
            return powerManager0.isDeviceIdleMode();
        }
        return v < 20 ? !powerManager0.isScreenOn() : !powerManager0.isInteractive();
    }

    public boolean l() {
        return (this.a & 4) != 0;
    }

    private static boolean m(ConnectivityManager connectivityManager0) {
        if(Util.a < 24) {
            return true;
        }
        Network network0 = connectivityManager0.getActiveNetwork();
        if(network0 == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(network0);
            if(networkCapabilities0 == null || !networkCapabilities0.hasCapability(16)) {
                return false;
            }
        }
        catch(SecurityException unused_ex) {
        }
        return true;
    }

    public boolean o() {
        return (this.a & 1) != 0;
    }

    private boolean q(Context context0) {
        return context0.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    public boolean r() {
        return (this.a & 16) != 0;
    }

    public boolean s() {
        return (this.a & 2) != 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
    }
}

