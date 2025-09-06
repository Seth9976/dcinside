package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build.VERSION;
import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import y4.l;

public final class AdServicesInfo {
    @RequiresApi(30)
    static final class Extensions30Impl {
        @l
        public static final Extensions30Impl a;

        static {
            Extensions30Impl.a = new Extensions30Impl();
        }

        @DoNotInline
        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    @l
    public static final AdServicesInfo a;

    static {
        AdServicesInfo.a = new AdServicesInfo();
    }

    public final int a() {
        return Build.VERSION.SDK_INT < 30 ? 0 : Extensions30Impl.a.a();
    }
}

