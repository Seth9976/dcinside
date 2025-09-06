package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.k;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.loader.content.Loader.OnLoadCompleteListener;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl extends LoaderManager {
    public static class LoaderInfo extends MutableLiveData implements OnLoadCompleteListener {
        private final int m;
        @Nullable
        private final Bundle n;
        @NonNull
        private final Loader o;
        private LifecycleOwner p;
        private LoaderObserver q;
        private Loader r;

        LoaderInfo(int v, @Nullable Bundle bundle0, @NonNull Loader loader0, @Nullable Loader loader1) {
            this.m = v;
            this.n = bundle0;
            this.o = loader0;
            this.r = loader1;
            loader0.u(v, this);
        }

        @Override  // androidx.loader.content.Loader$OnLoadCompleteListener
        public void a(@NonNull Loader loader0, @Nullable Object object0) {
            if(LoaderManagerImpl.d) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if(Looper.myLooper() == Looper.getMainLooper()) {
                this.r(object0);
                return;
            }
            if(LoaderManagerImpl.d) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            this.o(object0);
        }

        @Override  // androidx.lifecycle.LiveData
        protected void m() {
            if(LoaderManagerImpl.d) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.o.y();
        }

        @Override  // androidx.lifecycle.LiveData
        protected void n() {
            if(LoaderManagerImpl.d) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.o.z();
        }

        @Override  // androidx.lifecycle.LiveData
        public void p(@NonNull Observer observer0) {
            super.p(observer0);
            this.p = null;
            this.q = null;
        }

        @Override  // androidx.lifecycle.MutableLiveData
        public void r(Object object0) {
            super.r(object0);
            Loader loader0 = this.r;
            if(loader0 != null) {
                loader0.w();
                this.r = null;
            }
        }

        @MainThread
        Loader s(boolean z) {
            if(LoaderManagerImpl.d) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.o.b();
            this.o.a();
            LoaderObserver loaderManagerImpl$LoaderObserver0 = this.q;
            if(loaderManagerImpl$LoaderObserver0 != null) {
                this.p(loaderManagerImpl$LoaderObserver0);
                if(z) {
                    loaderManagerImpl$LoaderObserver0.c();
                }
            }
            this.o.B(this);
            if(loaderManagerImpl$LoaderObserver0 != null && !loaderManagerImpl$LoaderObserver0.b() || z) {
                this.o.w();
                return this.r;
            }
            return this.o;
        }

        public void t(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
            printWriter0.print(s);
            printWriter0.print("mId=");
            printWriter0.print(this.m);
            printWriter0.print(" mArgs=");
            printWriter0.println(this.n);
            printWriter0.print(s);
            printWriter0.print("mLoader=");
            printWriter0.println(this.o);
            this.o.g(s + "  ", fileDescriptor0, printWriter0, arr_s);
            if(this.q != null) {
                printWriter0.print(s);
                printWriter0.print("mCallbacks=");
                printWriter0.println(this.q);
                this.q.a(s + "  ", printWriter0);
            }
            printWriter0.print(s);
            printWriter0.print("mData=");
            printWriter0.println(this.u().d(this.f()));
            printWriter0.print(s);
            printWriter0.print("mStarted=");
            printWriter0.println(this.h());
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder(0x40);
            stringBuilder0.append("LoaderInfo{");
            stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder0.append(" #");
            stringBuilder0.append(this.m);
            stringBuilder0.append(" : ");
            DebugUtils.a(this.o, stringBuilder0);
            stringBuilder0.append("}}");
            return stringBuilder0.toString();
        }

        @NonNull
        Loader u() {
            return this.o;
        }

        // 去混淆评级： 低(20)
        boolean v() {
            return this.h() ? this.q != null && !this.q.b() : false;
        }

        void w() {
            LifecycleOwner lifecycleOwner0 = this.p;
            LoaderObserver loaderManagerImpl$LoaderObserver0 = this.q;
            if(lifecycleOwner0 != null && loaderManagerImpl$LoaderObserver0 != null) {
                super.p(loaderManagerImpl$LoaderObserver0);
                this.k(lifecycleOwner0, loaderManagerImpl$LoaderObserver0);
            }
        }

        @MainThread
        @NonNull
        Loader x(@NonNull LifecycleOwner lifecycleOwner0, @NonNull LoaderCallbacks loaderManager$LoaderCallbacks0) {
            LoaderObserver loaderManagerImpl$LoaderObserver0 = new LoaderObserver(this.o, loaderManager$LoaderCallbacks0);
            this.k(lifecycleOwner0, loaderManagerImpl$LoaderObserver0);
            LoaderObserver loaderManagerImpl$LoaderObserver1 = this.q;
            if(loaderManagerImpl$LoaderObserver1 != null) {
                this.p(loaderManagerImpl$LoaderObserver1);
            }
            this.p = lifecycleOwner0;
            this.q = loaderManagerImpl$LoaderObserver0;
            return this.o;
        }
    }

    static class LoaderObserver implements Observer {
        @NonNull
        private final Loader a;
        @NonNull
        private final LoaderCallbacks b;
        private boolean c;

        LoaderObserver(@NonNull Loader loader0, @NonNull LoaderCallbacks loaderManager$LoaderCallbacks0) {
            this.c = false;
            this.a = loader0;
            this.b = loaderManager$LoaderCallbacks0;
        }

        public void a(String s, PrintWriter printWriter0) {
            printWriter0.print(s);
            printWriter0.print("mDeliveredData=");
            printWriter0.println(this.c);
        }

        boolean b() {
            return this.c;
        }

        @MainThread
        void c() {
            if(this.c) {
                if(LoaderManagerImpl.d) {
                    Log.v("LoaderManager", "  Resetting: " + this.a);
                }
                this.b.c(this.a);
            }
        }

        @Override  // androidx.lifecycle.Observer
        public void onChanged(@Nullable Object object0) {
            if(LoaderManagerImpl.d) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + this.a.d(object0));
            }
            this.b.b(this.a, object0);
            this.c = true;
        }

        @Override
        public String toString() {
            return this.b.toString();
        }
    }

    static class LoaderViewModel extends ViewModel {
        private SparseArrayCompat a;
        private boolean b;
        private static final Factory c;

        static {
            LoaderViewModel.c = new Factory() {
                @Override  // androidx.lifecycle.ViewModelProvider$Factory
                public ViewModel a(Class class0, CreationExtras creationExtras0) {
                    return k.b(this, class0, creationExtras0);
                }

                @Override  // androidx.lifecycle.ViewModelProvider$Factory
                @NonNull
                public ViewModel b(@NonNull Class class0) {
                    return new LoaderViewModel();
                }
            };
        }

        LoaderViewModel() {
            this.a = new SparseArrayCompat();
            this.b = false;
        }

        public void c(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
            if(this.a.y() > 0) {
                printWriter0.print(s);
                printWriter0.println("Loaders:");
                for(int v = 0; v < this.a.y(); ++v) {
                    LoaderInfo loaderManagerImpl$LoaderInfo0 = (LoaderInfo)this.a.z(v);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(this.a.n(v));
                    printWriter0.print(": ");
                    printWriter0.println(loaderManagerImpl$LoaderInfo0.toString());
                    loaderManagerImpl$LoaderInfo0.t(s + "    ", fileDescriptor0, printWriter0, arr_s);
                }
            }
        }

        void d() {
            this.b = false;
        }

        @NonNull
        static LoaderViewModel e(ViewModelStore viewModelStore0) {
            return (LoaderViewModel)new ViewModelProvider(viewModelStore0, LoaderViewModel.c).a(LoaderViewModel.class);
        }

        LoaderInfo f(int v) {
            return (LoaderInfo)this.a.g(v);
        }

        boolean g() {
            int v = this.a.y();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((LoaderInfo)this.a.z(v1)).v()) {
                    return true;
                }
            }
            return false;
        }

        boolean h() {
            return this.b;
        }

        void i() {
            int v = this.a.y();
            for(int v1 = 0; v1 < v; ++v1) {
                ((LoaderInfo)this.a.z(v1)).w();
            }
        }

        void j(int v, @NonNull LoaderInfo loaderManagerImpl$LoaderInfo0) {
            this.a.o(v, loaderManagerImpl$LoaderInfo0);
        }

        void k(int v) {
            this.a.r(v);
        }

        void l() {
            this.b = true;
        }

        @Override  // androidx.lifecycle.ViewModel
        protected void onCleared() {
            super.onCleared();
            int v = this.a.y();
            for(int v1 = 0; v1 < v; ++v1) {
                ((LoaderInfo)this.a.z(v1)).s(true);
            }
            this.a.b();
        }
    }

    @NonNull
    private final LifecycleOwner a;
    @NonNull
    private final LoaderViewModel b;
    static final String c = "LoaderManager";
    static boolean d = false;

    static {
    }

    LoaderManagerImpl(@NonNull LifecycleOwner lifecycleOwner0, @NonNull ViewModelStore viewModelStore0) {
        this.a = lifecycleOwner0;
        this.b = LoaderViewModel.e(viewModelStore0);
    }

    @Override  // androidx.loader.app.LoaderManager
    @MainThread
    public void a(int v) {
        if(this.b.h()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if(Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if(LoaderManagerImpl.d) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + v);
        }
        LoaderInfo loaderManagerImpl$LoaderInfo0 = this.b.f(v);
        if(loaderManagerImpl$LoaderInfo0 != null) {
            loaderManagerImpl$LoaderInfo0.s(true);
            this.b.k(v);
        }
    }

    @Override  // androidx.loader.app.LoaderManager
    @Deprecated
    public void b(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        this.b.c(s, fileDescriptor0, printWriter0, arr_s);
    }

    @Override  // androidx.loader.app.LoaderManager
    @Nullable
    public Loader e(int v) {
        if(this.b.h()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderManagerImpl$LoaderInfo0 = this.b.f(v);
        return loaderManagerImpl$LoaderInfo0 == null ? null : loaderManagerImpl$LoaderInfo0.u();
    }

    @Override  // androidx.loader.app.LoaderManager
    public boolean f() {
        return this.b.g();
    }

    @Override  // androidx.loader.app.LoaderManager
    @MainThread
    @NonNull
    public Loader g(int v, @Nullable Bundle bundle0, @NonNull LoaderCallbacks loaderManager$LoaderCallbacks0) {
        if(this.b.h()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if(Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        LoaderInfo loaderManagerImpl$LoaderInfo0 = this.b.f(v);
        if(LoaderManagerImpl.d) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle0);
        }
        if(loaderManagerImpl$LoaderInfo0 == null) {
            return this.j(v, bundle0, loaderManager$LoaderCallbacks0, null);
        }
        if(LoaderManagerImpl.d) {
            Log.v("LoaderManager", "  Re-using existing loader " + loaderManagerImpl$LoaderInfo0);
        }
        return loaderManagerImpl$LoaderInfo0.x(this.a, loaderManager$LoaderCallbacks0);
    }

    @Override  // androidx.loader.app.LoaderManager
    public void h() {
        this.b.i();
    }

    @Override  // androidx.loader.app.LoaderManager
    @MainThread
    @NonNull
    public Loader i(int v, @Nullable Bundle bundle0, @NonNull LoaderCallbacks loaderManager$LoaderCallbacks0) {
        if(this.b.h()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if(Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if(LoaderManagerImpl.d) {
            Log.v("LoaderManager", "restartLoader in " + this + ": args=" + bundle0);
        }
        LoaderInfo loaderManagerImpl$LoaderInfo0 = this.b.f(v);
        return loaderManagerImpl$LoaderInfo0 == null ? this.j(v, bundle0, loaderManager$LoaderCallbacks0, null) : this.j(v, bundle0, loaderManager$LoaderCallbacks0, loaderManagerImpl$LoaderInfo0.s(false));
    }

    @MainThread
    @NonNull
    private Loader j(int v, @Nullable Bundle bundle0, @NonNull LoaderCallbacks loaderManager$LoaderCallbacks0, @Nullable Loader loader0) {
        try {
            this.b.l();
            Loader loader1 = loaderManager$LoaderCallbacks0.a(v, bundle0);
            if(loader1 != null) {
                if(loader1.getClass().isMemberClass() && !Modifier.isStatic(loader1.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + loader1);
                }
                LoaderInfo loaderManagerImpl$LoaderInfo0 = new LoaderInfo(v, bundle0, loader1, loader0);
                if(LoaderManagerImpl.d) {
                    Log.v("LoaderManager", "  Created new loader " + loaderManagerImpl$LoaderInfo0);
                }
                this.b.j(v, loaderManagerImpl$LoaderInfo0);
                return loaderManagerImpl$LoaderInfo0.x(this.a, loaderManager$LoaderCallbacks0);
            }
        }
        finally {
            this.b.d();
        }
        throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("LoaderManager{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" in ");
        DebugUtils.a(this.a, stringBuilder0);
        stringBuilder0.append("}}");
        return stringBuilder0.toString();
    }
}

