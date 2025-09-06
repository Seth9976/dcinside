package com.igaworks.ssp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import jeb.synthetic.FIN;

public abstract class d {
    static abstract class a {
    }

    public interface b {
        void a(c arg1);
    }

    public static final class c {
        private final String a;
        private final boolean b;

        c(String s, boolean z) {
            this.a = s;
            this.b = z;
        }

        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    static final class com.igaworks.ssp.d.d implements ServiceConnection {
        boolean a;
        private final LinkedBlockingQueue b;

        private com.igaworks.ssp.d.d() {
            this.a = false;
            this.b = new LinkedBlockingQueue(1);
        }

        com.igaworks.ssp.d.d(a d$a0) {
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

    static final class e implements IInterface {
        private IBinder a;

        public e(IBinder iBinder0) {
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

    private static boolean a = false;
    private static c b;
    private static List c;

    static {
    }

    public static c a(Context context0, b d$b0) {
        c d$c0 = d.b(context0, d$b0);
        return d$c0 == null ? d.c(context0, d$b0) : d$c0;
    }

    public static void a(b d$b0) {
        if(d.c == null) {
            d.c = new ArrayList();
        }
        if(!d.c.contains(d$b0)) {
            d.c.add(d$b0);
        }
    }

    public static c b(Context context0, b d$b0) {
        c d$c1;
        com.igaworks.ssp.d.d d$d0;
        int v;
        try {
            c d$c0 = d.b;
            if(d$c0 != null) {
                if(d$b0 != null) {
                    d$b0.a(d$c0);
                    return d.b;
                }
                return d.b;
            }
            if(Looper.myLooper() == Looper.getMainLooper()) {
                if(d$b0 != null) {
                    d$b0.a(null);
                }
                throw new IllegalStateException("Cannot be called from the main thread");
            }
        }
        catch(Exception exception0) {
            goto label_66;
        }
        try {
            context0.getPackageManager().getPackageInfo("com.android.vending", 0);
            goto label_15;
        }
        catch(Exception unused_ex) {
            try {
                if(d$b0 != null) {
                    d$b0.a(null);
                }
                return null;
            label_15:
                if(d.a) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "onBind > com.google.android.gms");
                    if(d$b0 != null) {
                        com.igaworks.ssp.b.c(Thread.currentThread(), "onBind > add to adidListener.");
                        d.a(d$b0);
                    }
                    return null;
                }
                d.a = true;
                v = FIN.finallyOpen$NT();
                d$d0 = new com.igaworks.ssp.d.d(null);
                Intent intent0 = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent0.setPackage("com.google.android.gms");
                if(context0.bindService(intent0, d$d0, 1)) {
                    goto label_27;
                }
                goto label_35;
            }
            catch(Exception exception0) {
                goto label_66;
            }
        }
        try {
            try {
            label_27:
                e d$e0 = new e(d$d0.a());
                d$c1 = new c(d$e0.a(), d$e0.a(true));
                d.b = d$c1;
                goto label_42;
            }
            catch(Exception exception1) {
            }
            exception1.printStackTrace();
        }
        catch(Throwable throwable0) {
            goto label_38;
        }
        try {
            context0.unbindService(d$d0);
            d.a = false;
        label_35:
            FIN.finallyExec$NT(v);
            throw new IOException("Google Play connection failed");
        label_38:
            context0.unbindService(d$d0);
            d.a = false;
            FIN.finallyExec$NT(v);
            throw throwable0;
        label_42:
            context0.unbindService(d$d0);
            FIN.finallyCodeBegin$NT(v);
            d.a = false;
            com.igaworks.ssp.b.c(Thread.currentThread(), "onBind > adid request complete, send callback request to listeners.");
            if(d$b0 != null) {
                goto label_47;
            }
            goto label_48;
        }
        catch(Exception exception0) {
            goto label_66;
        }
        try {
        label_47:
            d$b0.a(d.b);
        label_48:
            if(d.c != null && d.c.size() > 0) {
                ArrayList arrayList0 = new ArrayList(d.c);
                com.igaworks.ssp.b.c(Thread.currentThread(), "onBind > adidListeners size : " + d.c.size());
                d.c.clear();
                com.igaworks.ssp.b.c(Thread.currentThread(), "onBind > adidListeners size(after clear) : " + d.c.size());
                com.igaworks.ssp.b.c(Thread.currentThread(), "onBind > tList size : " + arrayList0.size());
                for(Object object0: arrayList0) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "onBind > send adInfo to adidListeners");
                    ((b)object0).a(d.b);
                }
                arrayList0.clear();
                return d$c1;
            }
            goto label_68;
        }
        catch(Exception exception2) {
        }
        try {
            exception2.printStackTrace();
            goto label_68;
        }
        catch(Exception exception0) {
        }
    label_66:
        com.igaworks.ssp.b.c(Thread.currentThread(), exception0.toString());
        return null;
    label_68:
        FIN.finallyCodeEnd$NT(v);
        return d$c1;
    }

    public static c c(Context context0, b d$b0) {
        try {
            try {
                if(Looper.myLooper() == Looper.getMainLooper()) {
                    if(d$b0 != null) {
                        d$b0.a(null);
                    }
                    throw new IllegalStateException("Cannot be called from the main thread");
                }
                com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 start");
                Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(context0);
                if(advertisingIdClient$Info0 != null) {
                    d.b = new c(advertisingIdClient$Info0.getId(), advertisingIdClient$Info0.isLimitAdTrackingEnabled());
                    com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 adidInfo : " + d.b.a() + ", opt_out : " + d.b.b());
                }
                goto label_89;
            }
            catch(NoClassDefFoundError noClassDefFoundError0) {
            }
            catch(NoSuchMethodError noSuchMethodError0) {
                goto label_36;
            }
            catch(Exception exception0) {
                goto label_52;
            }
            com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 noClassDefFoundError : " + noClassDefFoundError0.toString());
        }
        catch(Throwable throwable0) {
            goto label_71;
        }
        com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 send callback request to listeners.");
        try {
            if(d$b0 != null) {
                d$b0.a(d.b);
            }
            if(d.c != null && d.c.size() > 0) {
                ArrayList arrayList0 = new ArrayList(d.c);
                com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 adidListeners size : " + d.c.size());
                d.c.clear();
                for(Object object0: arrayList0) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 send adInfo to adidListeners");
                    ((b)object0).a(d.b);
                }
                arrayList0.clear();
                return d.b;
            }
            return d.b;
        }
        catch(Exception exception1) {
        }
        exception1.printStackTrace();
        return d.b;
        try {
        label_36:
            com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 noSuchMethodError : " + noSuchMethodError0.toString());
        }
        catch(Throwable throwable0) {
            goto label_71;
        }
        com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 send callback request to listeners.");
        try {
            if(d$b0 != null) {
                d$b0.a(d.b);
            }
            if(d.c != null && d.c.size() > 0) {
                ArrayList arrayList1 = new ArrayList(d.c);
                com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 adidListeners size : " + d.c.size());
                d.c.clear();
                for(Object object1: arrayList1) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 send adInfo to adidListeners");
                    ((b)object1).a(d.b);
                }
                arrayList1.clear();
                return d.b;
            }
        }
        catch(Exception exception2) {
            exception2.printStackTrace();
        }
        return d.b;
        try {
        label_52:
            com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 exception : " + exception0.toString());
        }
        catch(Throwable throwable0) {
            goto label_71;
        }
        com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 send callback request to listeners.");
        try {
            if(d$b0 != null) {
                d$b0.a(d.b);
            }
            if(d.c != null && d.c.size() > 0) {
                ArrayList arrayList2 = new ArrayList(d.c);
                com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 adidListeners size : " + d.c.size());
                d.c.clear();
                for(Object object2: arrayList2) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 send adInfo to adidListeners");
                    ((b)object2).a(d.b);
                }
                arrayList2.clear();
                return d.b;
            }
            return d.b;
        }
        catch(Exception exception3) {
        }
        exception3.printStackTrace();
        return d.b;
    label_71:
        com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 send callback request to listeners.");
        try {
            if(d$b0 != null) {
                d$b0.a(d.b);
            }
            if(d.c != null && d.c.size() > 0) {
                ArrayList arrayList3 = new ArrayList(d.c);
                com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 adidListeners size : " + d.c.size());
                d.c.clear();
                for(Object object3: arrayList3) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 send adInfo to adidListeners");
                    ((b)object3).a(d.b);
                }
                arrayList3.clear();
            }
        }
        catch(Exception exception4) {
            exception4.printStackTrace();
        }
        throw throwable0;
    label_89:
        com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 send callback request to listeners.");
        try {
            if(d$b0 != null) {
                d$b0.a(d.b);
            }
            if(d.c != null && d.c.size() > 0) {
                ArrayList arrayList4 = new ArrayList(d.c);
                com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 adidListeners size : " + d.c.size());
                d.c.clear();
                for(Object object4: arrayList4) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "getAndroidADID step2 send adInfo to adidListeners");
                    ((b)object4).a(d.b);
                }
                arrayList4.clear();
                return d.b;
            }
            return d.b;
        }
        catch(Exception exception5) {
        }
        exception5.printStackTrace();
        return d.b;
    }
}

