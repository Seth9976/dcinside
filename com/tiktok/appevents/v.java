package com.tiktok.appevents;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.tiktok.util.f;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class v {
    static class a {
    }

    static class b implements ServiceConnection {
        private final BlockingQueue a;

        private b() {
            this.a = new ArrayBlockingQueue(1);
        }

        b(a v$a0) {
        }

        public IBinder a() throws IllegalStateException {
            try {
                return (IBinder)this.a.take();
            }
            catch(InterruptedException unused_ex) {
                throw new IllegalStateException("Exception trying to retrieve GMS connection");
            }
        }

        @Override  // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) throws IllegalStateException {
            try {
                this.a.put(iBinder0);
            }
            catch(InterruptedException unused_ex) {
                throw new IllegalStateException("Exception trying to parse GMS connection");
            }
        }

        @Override  // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static class c {
        private final String a;
        private final boolean b;

        private c(String s, boolean z) {
            this.a = s;
            this.b = z;
        }

        c(String s, boolean z, a v$a0) {
            this(s, z);
        }

        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    static class d implements IInterface {
        private final IBinder a;
        private static final String b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
        private static final int c = 1;
        private static final int d = 2;

        private d(IBinder iBinder0) {
            this.a = iBinder0;
        }

        d(IBinder iBinder0, a v$a0) {
            this(iBinder0);
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        private String k1() throws RemoteException {
            Parcel parcel0 = Parcel.obtain();
            Parcel parcel1 = Parcel.obtain();
            try {
                parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, parcel0, parcel1, 0);
                parcel1.readException();
                return parcel1.readString();
            }
            finally {
                parcel0.recycle();
                parcel1.recycle();
            }
        }

        private boolean l1() throws RemoteException {
            Parcel parcel0 = Parcel.obtain();
            Parcel parcel1 = Parcel.obtain();
            try {
                parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                parcel0.writeInt(1);
                this.a.transact(2, parcel0, parcel1, 0);
                parcel1.readException();
                if(parcel1.readInt() == 0) {
                    z = false;
                }
                return z;
            }
            finally {
                parcel0.recycle();
                parcel1.recycle();
            }
        }
    }

    private static final String a = "com.tiktok.appevents.v";
    private static final f b;

    static {
        v.b = new f(v.class.getCanonicalName(), com.tiktok.b.o());
    }

    public static c a(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            packageManager0.getPackageInfo("com.android.vending", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            v.b.c("Google play service not installed", new Object[0]);
        }
        Intent intent0 = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent0.setPackage("com.google.android.gms");
        b v$b0 = new b(null);
        try {
            if(context0.bindService(intent0, v$b0, 1)) {
                d v$d0 = new d(v$b0.a(), null);
                String s = v$d0.k1();
                boolean z = v$d0.l1();
                return TextUtils.isEmpty(s) ? new c("", z, null) : new c(s, z, null);
            }
            v.b.c("Failed to detect google play identifier service on this phone", new Object[0]);
            return new c("", true, null);
        }
        catch(Exception exception0) {
            v.b.b(exception0, "remote exception", new Object[0]);
            return new c("", true, null);
        }
        finally {
            context0.unbindService(v$b0);
        }
    }
}

