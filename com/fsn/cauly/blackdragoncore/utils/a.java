package com.fsn.cauly.blackdragoncore.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

public final class a {
    static class com.fsn.cauly.blackdragoncore.utils.a.a {
    }

    public static final class b {
        private final String a;
        private final boolean b;

        b(String s, boolean z) {
            this.a = s;
            this.b = z;
        }

        public String a() {
            return this.a;
        }
    }

    static final class c implements ServiceConnection {
        boolean a;
        private final LinkedBlockingQueue b;

        private c() {
            this.a = false;
            this.b = new LinkedBlockingQueue(1);
        }

        c(com.fsn.cauly.blackdragoncore.utils.a.a a$a0) {
        }

        public IBinder a() {
            if(this.a) {
                throw new IllegalStateException();
            }
            this.a = true;
            return (IBinder)this.b.take();
        }

        @Override  // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
            try {
                this.b.put(iBinder0);
            }
            catch(InterruptedException unused_ex) {
            }
        }

        @Override  // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName0) {
        }
    }

    static final class d implements IInterface {
        private IBinder a;

        public d(IBinder iBinder0) {
            this.a = iBinder0;
        }

        public String a() {
            Parcel parcel0 = Parcel.obtain();
            Parcel parcel1 = Parcel.obtain();
            try {
                parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, parcel0, parcel1, 0);
                parcel1.readException();
                return parcel1.readString();
            }
            finally {
                parcel1.recycle();
                parcel0.recycle();
            }
        }

        public boolean a(boolean z) {
            Parcel parcel0 = Parcel.obtain();
            Parcel parcel1 = Parcel.obtain();
            try {
                parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcel0.writeInt(((int)z));
                boolean z1 = false;
                this.a.transact(2, parcel0, parcel1, 0);
                parcel1.readException();
                if(parcel1.readInt() != 0) {
                    z1 = true;
                }
                return z1;
            }
            finally {
                parcel1.recycle();
                parcel0.recycle();
            }
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }
    }

    public static b a(Context context0) {
        if(Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context0.getPackageManager().getPackageInfo("com.android.vending", 0);
        c a$c0 = new c(null);
        Intent intent0 = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent0.setPackage("com.google.android.gms");
        if(context0.bindService(intent0, a$c0, 1)) {
            try {
                d a$d0 = new d(a$c0.a());
                return new b(a$d0.a(), a$d0.a(true));
            }
            finally {
                context0.unbindService(a$c0);
            }
        }
        throw new IOException("Google Play connection failed");
    }
}

