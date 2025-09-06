package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({Scope.c})
public class ResultReceiver implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public ResultReceiver a(Parcel parcel0) {
            return new ResultReceiver(parcel0);
        }

        public ResultReceiver[] b(int v) {
            return new ResultReceiver[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    class b extends android.support.v4.os.a.b {
        final ResultReceiver b;

        @Override  // android.support.v4.os.a
        public void a(int v, Bundle bundle0) {
            ResultReceiver resultReceiver0 = ResultReceiver.this;
            Handler handler0 = resultReceiver0.b;
            if(handler0 != null) {
                handler0.post(new c(resultReceiver0, v, bundle0));
                return;
            }
            resultReceiver0.a(v, bundle0);
        }
    }

    class c implements Runnable {
        final int a;
        final Bundle b;
        final ResultReceiver c;

        c(int v, Bundle bundle0) {
            this.a = v;
            this.b = bundle0;
        }

        @Override
        public void run() {
            ResultReceiver.this.a(this.a, this.b);
        }
    }

    public static final Parcelable.Creator CREATOR;
    final boolean a;
    final Handler b;
    android.support.v4.os.a c;

    static {
        ResultReceiver.CREATOR = new a();
    }

    public ResultReceiver(Handler handler0) {
        this.a = true;
        this.b = handler0;
    }

    ResultReceiver(Parcel parcel0) {
        this.a = false;
        this.b = null;
        this.c = android.support.v4.os.a.b.i1(parcel0.readStrongBinder());
    }

    // 检测为 Lambda 实现
    protected void a(int v, Bundle bundle0) [...]

    public void c(int v, Bundle bundle0) {
        if(this.a) {
            Handler handler0 = this.b;
            if(handler0 != null) {
                handler0.post(() -> {
                });
                return;
            }
            this.a(v, bundle0);
            return;
        }
        android.support.v4.os.a a0 = this.c;
        if(a0 != null) {
            try {
                a0.a(v, bundle0);
            }
            catch(RemoteException unused_ex) {
            }
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        synchronized(this) {
            if(this.c == null) {
                this.c = new b(this);
            }
            parcel0.writeStrongBinder(this.c.asBinder());
        }
    }
}

