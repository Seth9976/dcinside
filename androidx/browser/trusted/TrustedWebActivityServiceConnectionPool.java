package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class TrustedWebActivityServiceConnectionPool {
    static class BindToServiceAsyncTask extends AsyncTask {
        private final Context a;
        private final Intent b;
        private final ConnectionHolder c;

        BindToServiceAsyncTask(Context context0, Intent intent0, ConnectionHolder connectionHolder0) {
            this.a = context0.getApplicationContext();
            this.b = intent0;
            this.c = connectionHolder0;
        }

        @Nullable
        protected Exception a(Void[] arr_void) {
            try {
                if(this.a.bindService(this.b, this.c, 0x1001)) {
                    return null;
                }
                this.a.unbindService(this.c);
                return new IllegalStateException("Could not bind to the service");
            }
            catch(SecurityException exception0) {
                Log.w("TWAConnectionPool", "SecurityException while binding.", exception0);
                return exception0;
            }
        }

        protected void b(Exception exception0) {
            if(exception0 != null) {
                this.c.b(exception0);
            }
        }

        @Override  // android.os.AsyncTask
        @Nullable
        protected Object doInBackground(Object[] arr_object) {
            return this.a(((Void[])arr_object));
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.b(((Exception)object0));
        }
    }

    private final Context a;
    private final Map b;
    private static final String c = "TWAConnectionPool";

    private TrustedWebActivityServiceConnectionPool(@NonNull Context context0) {
        this.b = new HashMap();
        this.a = context0.getApplicationContext();
    }

    @MainThread
    @NonNull
    public t0 b(@NonNull Uri uri0, @NonNull Set set0, @NonNull Executor executor0) {
        ConnectionHolder connectionHolder0 = (ConnectionHolder)this.b.get(uri0);
        if(connectionHolder0 != null) {
            return connectionHolder0.c();
        }
        Intent intent0 = this.d(this.a, uri0, set0, true);
        if(intent0 == null) {
            return FutureUtils.a(new IllegalArgumentException("No service exists for scope"));
        }
        ConnectionHolder connectionHolder1 = new ConnectionHolder(() -> this.b.remove(uri0));
        this.b.put(uri0, connectionHolder1);
        new BindToServiceAsyncTask(this.a, intent0, connectionHolder1).executeOnExecutor(executor0, new Void[0]);
        return connectionHolder1.c();
    }

    @NonNull
    public static TrustedWebActivityServiceConnectionPool c(@NonNull Context context0) {
        return new TrustedWebActivityServiceConnectionPool(context0);
    }

    @Nullable
    private Intent d(Context context0, Uri uri0, Set set0, boolean z) {
        if(set0 != null && set0.size() != 0) {
            Intent intent0 = new Intent();
            intent0.setData(uri0);
            intent0.setAction("android.intent.action.VIEW");
            String s = null;
            Iterator iterator0 = context0.getPackageManager().queryIntentActivities(intent0, 0x10000).iterator();
        label_6:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s1 = ((ResolveInfo)object0).activityInfo.packageName;
                Iterator iterator1 = set0.iterator();
                do {
                    if(!iterator1.hasNext()) {
                        continue label_6;
                    }
                    Object object1 = iterator1.next();
                }
                while(!((Token)object1).c(s1, context0.getPackageManager()));
                s = s1;
            }
            if(s == null) {
                if(z) {
                    Log.w("TWAConnectionPool", "No TWA candidates for " + uri0 + " have been registered.");
                }
                return null;
            }
            Intent intent1 = new Intent();
            intent1.setPackage(s);
            intent1.setAction("android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE");
            ResolveInfo resolveInfo0 = context0.getPackageManager().resolveService(intent1, 0x20000);
            if(resolveInfo0 == null) {
                if(z) {
                    Log.w("TWAConnectionPool", "Could not find TWAService for " + s);
                }
                return null;
            }
            if(z) {
                Log.i("TWAConnectionPool", "Found " + resolveInfo0.serviceInfo.name + " to handle request for " + uri0);
            }
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(s, resolveInfo0.serviceInfo.name));
            return intent2;
        }
        return null;
    }

    // 检测为 Lambda 实现
    private void e(Uri uri0) [...]

    @MainThread
    public boolean f(@NonNull Uri uri0, @NonNull Set set0) {
        return this.b.get(uri0) == null ? this.d(this.a, uri0, set0, false) != null : true;
    }

    void g() {
        for(Object object0: this.b.values()) {
            this.a.unbindService(((ConnectionHolder)object0));
        }
        this.b.clear();
    }
}

