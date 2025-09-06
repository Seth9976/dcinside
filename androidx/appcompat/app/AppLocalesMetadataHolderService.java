package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class AppLocalesMetadataHolderService extends Service {
    @RequiresApi(24)
    static class Api24Impl {
        @DoNotInline
        static int a() [...] // Inlined contents
    }

    @NonNull
    public static ServiceInfo a(@NonNull Context context0) throws PackageManager.NameNotFoundException {
        return context0.getPackageManager().getServiceInfo(new ComponentName(context0, AppLocalesMetadataHolderService.class), 640);
    }

    @Override  // android.app.Service
    @NonNull
    public IBinder onBind(@NonNull Intent intent0) {
        throw new UnsupportedOperationException();
    }
}

