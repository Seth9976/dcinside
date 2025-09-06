package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.b.b;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.List;

class ConnectionHolder implements ServiceConnection {
    static class WrapperFactory {
        @NonNull
        TrustedWebActivityServiceConnection a(ComponentName componentName0, IBinder iBinder0) {
            return new TrustedWebActivityServiceConnection(b.i1(iBinder0), componentName0);
        }
    }

    @NonNull
    private final Runnable a;
    @NonNull
    private final WrapperFactory b;
    private int c;
    @Nullable
    private TrustedWebActivityServiceConnection d;
    @NonNull
    private List e;
    @Nullable
    private Exception f;
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;

    @MainThread
    ConnectionHolder(@NonNull Runnable runnable0) {
        this(runnable0, new WrapperFactory());
    }

    @MainThread
    ConnectionHolder(@NonNull Runnable runnable0, @NonNull WrapperFactory connectionHolder$WrapperFactory0) {
        this.c = 0;
        this.e = new ArrayList();
        this.a = runnable0;
        this.b = connectionHolder$WrapperFactory0;
    }

    @MainThread
    public void b(@NonNull Exception exception0) {
        for(Object object0: this.e) {
            ((Completer)object0).f(exception0);
        }
        this.e.clear();
        this.a.run();
        this.c = 3;
        this.f = exception0;
    }

    @MainThread
    @NonNull
    public t0 c() {
        return CallbackToFutureAdapter.a((Completer callbackToFutureAdapter$Completer0) -> switch(this.c) {
            case 0: {
                this.e.add(callbackToFutureAdapter$Completer0);
                return "ConnectionHolder, state = " + this.c;
            }
            case 1: {
                TrustedWebActivityServiceConnection trustedWebActivityServiceConnection0 = this.d;
                if(trustedWebActivityServiceConnection0 == null) {
                    throw new IllegalStateException("ConnectionHolder state is incorrect.");
                }
                callbackToFutureAdapter$Completer0.c(trustedWebActivityServiceConnection0);
                return "ConnectionHolder, state = " + this.c;
            }
            case 2: {
                throw new IllegalStateException("Service has been disconnected.");
            }
            case 3: {
                throw this.f;
            }
            default: {
                throw new IllegalStateException("Connection state is invalid");
            }
        });
    }

    // 检测为 Lambda 实现
    private Object d(Completer callbackToFutureAdapter$Completer0) throws Exception [...]

    @Override  // android.content.ServiceConnection
    @MainThread
    public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        this.d = this.b.a(componentName0, iBinder0);
        for(Object object0: this.e) {
            ((Completer)object0).c(this.d);
        }
        this.e.clear();
        this.c = 1;
    }

    @Override  // android.content.ServiceConnection
    @MainThread
    public void onServiceDisconnected(ComponentName componentName0) {
        this.d = null;
        this.a.run();
        this.c = 2;
    }
}

