package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContentResolverCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class CursorLoader extends AsyncTaskLoader {
    final ForceLoadContentObserver r;
    Uri s;
    String[] t;
    String u;
    String[] v;
    String w;
    Cursor x;
    CancellationSignal y;

    public CursorLoader(@NonNull Context context0) {
        super(context0);
        this.r = new ForceLoadContentObserver(this);
    }

    public CursorLoader(@NonNull Context context0, @NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1) {
        super(context0);
        this.r = new ForceLoadContentObserver(this);
        this.s = uri0;
        this.t = arr_s;
        this.u = s;
        this.v = arr_s1;
        this.w = s1;
    }

    @Override  // androidx.loader.content.AsyncTaskLoader
    public void D() {
        super.D();
        synchronized(this) {
            CancellationSignal cancellationSignal0 = this.y;
            if(cancellationSignal0 != null) {
                cancellationSignal0.a();
            }
        }
    }

    @Override  // androidx.loader.content.AsyncTaskLoader
    public Object I() {
        return this.T();
    }

    @Override  // androidx.loader.content.AsyncTaskLoader
    public void J(Object object0) {
        this.U(((Cursor)object0));
    }

    public void N(Cursor cursor0) {
        if(this.l()) {
            if(cursor0 != null) {
                cursor0.close();
            }
            return;
        }
        Cursor cursor1 = this.x;
        this.x = cursor0;
        if(this.m()) {
            super.f(cursor0);
        }
        if(cursor1 != null && cursor1 != cursor0 && !cursor1.isClosed()) {
            cursor1.close();
        }
    }

    @Nullable
    public String[] O() {
        return this.t;
    }

    @Nullable
    public String P() {
        return this.u;
    }

    @Nullable
    public String[] Q() {
        return this.v;
    }

    @Nullable
    public String R() {
        return this.w;
    }

    @NonNull
    public Uri S() {
        return this.s;
    }

    public Cursor T() {
        synchronized(this) {
            if(!this.H()) {
                this.y = new CancellationSignal();
                try {
                    Cursor cursor0 = ContentResolverCompat.b(this.i().getContentResolver(), this.s, this.t, this.u, this.v, this.w, this.y);
                    if(cursor0 != null) {
                        try {
                            cursor0.getCount();
                            cursor0.registerContentObserver(this.r);
                        }
                        catch(RuntimeException runtimeException0) {
                            cursor0.close();
                            throw runtimeException0;
                        }
                    }
                    return cursor0;
                }
                finally {
                    synchronized(this) {
                        this.y = null;
                    }
                }
            }
        }
        throw new OperationCanceledException();
    }

    public void U(Cursor cursor0) {
        if(cursor0 != null && !cursor0.isClosed()) {
            cursor0.close();
        }
    }

    public void V(@Nullable String[] arr_s) {
        this.t = arr_s;
    }

    public void W(@Nullable String s) {
        this.u = s;
    }

    public void X(@Nullable String[] arr_s) {
        this.v = arr_s;
    }

    public void Y(@Nullable String s) {
        this.w = s;
    }

    public void Z(@NonNull Uri uri0) {
        this.s = uri0;
    }

    @Override  // androidx.loader.content.Loader
    public void f(Object object0) {
        this.N(((Cursor)object0));
    }

    @Override  // androidx.loader.content.AsyncTaskLoader
    @Deprecated
    public void g(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        super.g(s, fileDescriptor0, printWriter0, arr_s);
        printWriter0.print(s);
        printWriter0.print("mUri=");
        printWriter0.println(this.s);
        printWriter0.print(s);
        printWriter0.print("mProjection=");
        printWriter0.println(Arrays.toString(this.t));
        printWriter0.print(s);
        printWriter0.print("mSelection=");
        printWriter0.println(this.u);
        printWriter0.print(s);
        printWriter0.print("mSelectionArgs=");
        printWriter0.println(Arrays.toString(this.v));
        printWriter0.print(s);
        printWriter0.print("mSortOrder=");
        printWriter0.println(this.w);
        printWriter0.print(s);
        printWriter0.print("mCursor=");
        printWriter0.println(this.x);
        printWriter0.print(s);
        printWriter0.print("mContentChanged=");
        printWriter0.println(this.h);
    }

    @Override  // androidx.loader.content.Loader
    protected void r() {
        super.r();
        this.t();
        if(this.x != null && !this.x.isClosed()) {
            this.x.close();
        }
        this.x = null;
    }

    @Override  // androidx.loader.content.Loader
    protected void s() {
        Cursor cursor0 = this.x;
        if(cursor0 != null) {
            this.N(cursor0);
        }
        if(this.A() || this.x == null) {
            this.h();
        }
    }

    @Override  // androidx.loader.content.Loader
    protected void t() {
        this.b();
    }
}

