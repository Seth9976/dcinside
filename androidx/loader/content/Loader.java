package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Loader {
    public final class ForceLoadContentObserver extends ContentObserver {
        final Loader a;

        public ForceLoadContentObserver() {
            super(new Handler());
        }

        @Override  // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override  // android.database.ContentObserver
        public void onChange(boolean z) {
            Loader.this.p();
        }
    }

    public interface OnLoadCanceledListener {
        void a(@NonNull Loader arg1);
    }

    public interface OnLoadCompleteListener {
        void a(@NonNull Loader arg1, @Nullable Object arg2);
    }

    int a;
    OnLoadCompleteListener b;
    OnLoadCanceledListener c;
    Context d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;

    public Loader(@NonNull Context context0) {
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = false;
        this.i = false;
        this.d = context0.getApplicationContext();
    }

    public boolean A() {
        boolean z = this.h;
        this.h = false;
        this.i |= z;
        return z;
    }

    @MainThread
    public void B(@NonNull OnLoadCompleteListener loader$OnLoadCompleteListener0) {
        OnLoadCompleteListener loader$OnLoadCompleteListener1 = this.b;
        if(loader$OnLoadCompleteListener1 == null) {
            throw new IllegalStateException("No listener register");
        }
        if(loader$OnLoadCompleteListener1 != loader$OnLoadCompleteListener0) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }

    @MainThread
    public void C(@NonNull OnLoadCanceledListener loader$OnLoadCanceledListener0) {
        OnLoadCanceledListener loader$OnLoadCanceledListener1 = this.c;
        if(loader$OnLoadCanceledListener1 == null) {
            throw new IllegalStateException("No listener register");
        }
        if(loader$OnLoadCanceledListener1 != loader$OnLoadCanceledListener0) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.c = null;
    }

    @MainThread
    public void a() {
        this.f = true;
    }

    @MainThread
    public boolean b() {
        return this.o();
    }

    public void c() {
        this.i = false;
    }

    @NonNull
    public String d(@Nullable Object object0) {
        StringBuilder stringBuilder0 = new StringBuilder(0x40);
        DebugUtils.a(object0, stringBuilder0);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    @MainThread
    public void e() {
        OnLoadCanceledListener loader$OnLoadCanceledListener0 = this.c;
        if(loader$OnLoadCanceledListener0 != null) {
            loader$OnLoadCanceledListener0.a(this);
        }
    }

    @MainThread
    public void f(@Nullable Object object0) {
        OnLoadCompleteListener loader$OnLoadCompleteListener0 = this.b;
        if(loader$OnLoadCompleteListener0 != null) {
            loader$OnLoadCompleteListener0.a(this, object0);
        }
    }

    @Deprecated
    public void g(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print(s);
        printWriter0.print("mId=");
        printWriter0.print(this.a);
        printWriter0.print(" mListener=");
        printWriter0.println(this.b);
        if(this.e || this.h || this.i) {
            printWriter0.print(s);
            printWriter0.print("mStarted=");
            printWriter0.print(this.e);
            printWriter0.print(" mContentChanged=");
            printWriter0.print(this.h);
            printWriter0.print(" mProcessingChange=");
            printWriter0.println(this.i);
        }
        if(this.f || this.g) {
            printWriter0.print(s);
            printWriter0.print("mAbandoned=");
            printWriter0.print(this.f);
            printWriter0.print(" mReset=");
            printWriter0.println(this.g);
        }
    }

    @MainThread
    public void h() {
        this.q();
    }

    @NonNull
    public Context i() {
        return this.d;
    }

    public int j() {
        return this.a;
    }

    public boolean k() {
        return this.f;
    }

    public boolean l() {
        return this.g;
    }

    public boolean m() {
        return this.e;
    }

    @MainThread
    protected void n() {
    }

    @MainThread
    protected boolean o() {
        return false;
    }

    @MainThread
    public void p() {
        if(this.e) {
            this.h();
            return;
        }
        this.h = true;
    }

    @MainThread
    protected void q() {
    }

    @MainThread
    protected void r() {
    }

    @MainThread
    protected void s() {
    }

    @MainThread
    protected void t() {
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x40);
        DebugUtils.a(this, stringBuilder0);
        stringBuilder0.append(" id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    @MainThread
    public void u(int v, @NonNull OnLoadCompleteListener loader$OnLoadCompleteListener0) {
        if(this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = loader$OnLoadCompleteListener0;
        this.a = v;
    }

    @MainThread
    public void v(@NonNull OnLoadCanceledListener loader$OnLoadCanceledListener0) {
        if(this.c != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.c = loader$OnLoadCanceledListener0;
    }

    @MainThread
    public void w() {
        this.r();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }

    public void x() {
        if(this.i) {
            this.p();
        }
    }

    @MainThread
    public final void y() {
        this.e = true;
        this.g = false;
        this.f = false;
        this.s();
    }

    @MainThread
    public void z() {
        this.e = false;
        this.t();
    }
}

