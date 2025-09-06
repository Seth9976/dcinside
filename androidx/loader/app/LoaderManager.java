package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class LoaderManager {
    public interface LoaderCallbacks {
        @MainThread
        @NonNull
        Loader a(int arg1, @Nullable Bundle arg2);

        @MainThread
        void b(@NonNull Loader arg1, Object arg2);

        @MainThread
        void c(@NonNull Loader arg1);
    }

    @MainThread
    public abstract void a(int arg1);

    @Deprecated
    public abstract void b(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    public static void c(boolean z) {
        LoaderManagerImpl.d = z;
    }

    @NonNull
    public static LoaderManager d(@NonNull LifecycleOwner lifecycleOwner0) {
        return new LoaderManagerImpl(lifecycleOwner0, ((ViewModelStoreOwner)lifecycleOwner0).getViewModelStore());
    }

    @Nullable
    public abstract Loader e(int arg1);

    public boolean f() {
        return false;
    }

    @MainThread
    @NonNull
    public abstract Loader g(int arg1, @Nullable Bundle arg2, @NonNull LoaderCallbacks arg3);

    public abstract void h();

    @MainThread
    @NonNull
    public abstract Loader i(int arg1, @Nullable Bundle arg2, @NonNull LoaderCallbacks arg3);
}

