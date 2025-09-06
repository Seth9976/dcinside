package com.unity3d.services.core.device;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@TargetApi(9)
public class AdvertisingId {
    interface GoogleAdvertisingInfo extends IInterface {
        public static abstract class GoogleAdvertisingInfoBinder extends Binder implements GoogleAdvertisingInfo {
            static class GoogleAdvertisingInfoImplementation implements GoogleAdvertisingInfo {
                private final IBinder _binder;

                GoogleAdvertisingInfoImplementation(IBinder iBinder0) {
                    this._binder = iBinder0;
                }

                @Override  // android.os.IInterface
                public IBinder asBinder() {
                    return this._binder;
                }

                @Override  // com.unity3d.services.core.device.AdvertisingId$GoogleAdvertisingInfo
                public boolean getEnabled(boolean z) throws RemoteException {
                    Parcel parcel0 = Parcel.obtain();
                    Parcel parcel1 = Parcel.obtain();
                    try {
                        parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        boolean z1 = true;
                        parcel0.writeInt(((int)z));
                        this._binder.transact(2, parcel0, parcel1, 0);
                        parcel1.readException();
                        if(parcel1.readInt() == 0) {
                            z1 = false;
                        }
                        return z1;
                    }
                    finally {
                        parcel1.recycle();
                        parcel0.recycle();
                    }
                }

                @Override  // com.unity3d.services.core.device.AdvertisingId$GoogleAdvertisingInfo
                public String getId() throws RemoteException {
                    Parcel parcel0 = Parcel.obtain();
                    Parcel parcel1 = Parcel.obtain();
                    try {
                        parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        this._binder.transact(1, parcel0, parcel1, 0);
                        parcel1.readException();
                        return parcel1.readString();
                    }
                    finally {
                        parcel1.recycle();
                        parcel0.recycle();
                    }
                }
            }

            public static GoogleAdvertisingInfo create(IBinder iBinder0) {
                if(iBinder0 == null) {
                    return null;
                }
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                return iInterface0 != null && iInterface0 instanceof GoogleAdvertisingInfo ? ((GoogleAdvertisingInfo)iInterface0) : new GoogleAdvertisingInfoImplementation(iBinder0);
            }

            @Override  // android.os.Binder
            public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
                switch(v) {
                    case 1: {
                        parcel0.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        String s = this.getId();
                        parcel1.writeNoException();
                        parcel1.writeString(s);
                        return true;
                    }
                    case 2: {
                        parcel0.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        boolean z = this.getEnabled(parcel0.readInt() != 0);
                        parcel1.writeNoException();
                        parcel1.writeInt(((int)z));
                        return true;
                    }
                    default: {
                        return super.onTransact(v, parcel0, parcel1, v1);
                    }
                }
            }
        }

        boolean getEnabled(boolean arg1) throws RemoteException;

        String getId() throws RemoteException;
    }

    class GoogleAdvertisingServiceConnection implements ServiceConnection {
        private final BlockingQueue _binderQueue;
        boolean _consumed;

        private GoogleAdvertisingServiceConnection() {
            this._consumed = false;
            this._binderQueue = new LinkedBlockingQueue();
        }

        GoogleAdvertisingServiceConnection(com.unity3d.services.core.device.AdvertisingId.1 advertisingId$10) {
        }

        public IBinder getBinder() throws InterruptedException {
            if(this._consumed) {
                throw new IllegalStateException();
            }
            this._consumed = true;
            return (IBinder)this._binderQueue.take();
        }

        @Override  // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
            try {
                this._binderQueue.put(iBinder0);
            }
            catch(InterruptedException unused_ex) {
                DeviceLog.debug("Couldn\'t put service to binder que");
                Thread.currentThread().interrupt();
            }
        }

        @Override  // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName0) {
        }
    }

    private static final String ADVERTISING_ID_SERVICE_NAME = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    private String advertisingIdentifier;
    private static AdvertisingId instance;
    private boolean limitedAdvertisingTracking;

    static {
    }

    public AdvertisingId() {
        this.advertisingIdentifier = null;
        this.limitedAdvertisingTracking = false;
    }

    private void fetchAdvertisingId(Context context0) {
        boolean z;
        GoogleAdvertisingServiceConnection advertisingId$GoogleAdvertisingServiceConnection0 = new GoogleAdvertisingServiceConnection(this, null);
        Intent intent0 = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent0.setPackage("com.google.android.gms");
        try {
            z = context0.bindService(intent0, advertisingId$GoogleAdvertisingServiceConnection0, 1);
        }
        catch(Exception exception0) {
            DeviceLog.exception("Couldn\'t bind to identifier service intent", exception0);
            z = false;
        }
        if(z) {
            try {
                try {
                    GoogleAdvertisingInfo advertisingId$GoogleAdvertisingInfo0 = GoogleAdvertisingInfoBinder.create(advertisingId$GoogleAdvertisingServiceConnection0.getBinder());
                    this.advertisingIdentifier = advertisingId$GoogleAdvertisingInfo0.getId();
                    this.limitedAdvertisingTracking = advertisingId$GoogleAdvertisingInfo0.getEnabled(true);
                }
                catch(Exception exception1) {
                    DeviceLog.exception("Couldn\'t get advertising info", exception1);
                    goto label_21;
                }
            }
            catch(Throwable throwable0) {
                context0.unbindService(advertisingId$GoogleAdvertisingServiceConnection0);
                throw throwable0;
            }
        }
        if(!z) {
            return;
        }
    label_21:
        context0.unbindService(advertisingId$GoogleAdvertisingServiceConnection0);
    }

    public static String getAdvertisingTrackingId() {
        return AdvertisingId.getInstance().advertisingIdentifier;
    }

    private static AdvertisingId getInstance() {
        if(AdvertisingId.instance == null) {
            AdvertisingId.instance = new AdvertisingId();
        }
        return AdvertisingId.instance;
    }

    public static boolean getLimitedAdTracking() {
        return AdvertisingId.getInstance().limitedAdvertisingTracking;
    }

    public static void init(Context context0) {
        AdvertisingId.getInstance().fetchAdvertisingId(context0);
    }

    class com.unity3d.services.core.device.AdvertisingId.1 {
    }

}

