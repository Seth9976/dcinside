package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.b.b;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public abstract class CustomTabsServiceConnection implements ServiceConnection {
    @Nullable
    private Context mApplicationContext;

    @Nullable
    @RestrictTo({Scope.a})
    Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(@NonNull ComponentName arg1, @NonNull CustomTabsClient arg2);

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName0, @NonNull IBinder iBinder0) {
        if(this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        this.onCustomTabsServiceConnected(componentName0, new CustomTabsClient(b.i1(iBinder0), componentName0, this.mApplicationContext) {
            final CustomTabsServiceConnection e;

        });
    }

    @RestrictTo({Scope.a})
    void setApplicationContext(@NonNull Context context0) {
        this.mApplicationContext = context0;
    }
}

