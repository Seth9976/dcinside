package com.unity3d.services.core.device;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@TargetApi(9)
public class OpenAdvertisingId {
    interface HWAdvertisingInfo extends IInterface {
        public static abstract class HWAdvertisingInfoBinder extends Binder implements HWAdvertisingInfo {
            static class HWAdvertisingInfoImplementation implements HWAdvertisingInfo {
                private final IBinder _binder;

                HWAdvertisingInfoImplementation(IBinder iBinder0) {
                    this._binder = iBinder0;
                }

                @Override  // android.os.IInterface
                public IBinder asBinder() {
                    return this._binder;
                }

                @Override  // com.unity3d.services.core.device.OpenAdvertisingId$HWAdvertisingInfo
                public boolean getEnabled(boolean z) throws RemoteException {
                    Parcel parcel0 = Parcel.obtain();
                    Parcel parcel1 = Parcel.obtain();
                    try {
                        parcel0.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
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

                @Override  // com.unity3d.services.core.device.OpenAdvertisingId$HWAdvertisingInfo
                public String getId() throws RemoteException {
                    Parcel parcel0 = Parcel.obtain();
                    Parcel parcel1 = Parcel.obtain();
                    try {
                        parcel0.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
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

            public static HWAdvertisingInfo create(IBinder iBinder0) {
                if(iBinder0 == null) {
                    return null;
                }
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                return iInterface0 != null && iInterface0 instanceof HWAdvertisingInfo ? ((HWAdvertisingInfo)iInterface0) : new HWAdvertisingInfoImplementation(iBinder0);
            }

            @Override  // android.os.Binder
            public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
                switch(v) {
                    case 1: {
                        parcel0.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                        String s = this.getId();
                        parcel1.writeNoException();
                        parcel1.writeString(s);
                        return true;
                    }
                    case 2: {
                        parcel0.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
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

    class HWAdvertisingServiceConnection implements ServiceConnection {
        private final BlockingQueue _binderQueue;
        boolean _consumed;

        private HWAdvertisingServiceConnection() {
            this._consumed = false;
            this._binderQueue = new LinkedBlockingQueue();
        }

        HWAdvertisingServiceConnection(com.unity3d.services.core.device.OpenAdvertisingId.1 openAdvertisingId$10) {
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

    private static final String HW_DEVICE_NAME = "HUAWEI";
    private static final String HW_OPEN_ADVERTISING_ID_SERVICE_NAME = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
    private static OpenAdvertisingId instance;
    private boolean limitedOpenAdTracking;
    private String openAdvertisingIdentifier;

    static {
    }

    public OpenAdvertisingId() {
        this.openAdvertisingIdentifier = null;
        this.limitedOpenAdTracking = false;
    }

    private void fetchOAId(Context context0) {
        HWAdvertisingServiceConnection openAdvertisingId$HWAdvertisingServiceConnection0 = new HWAdvertisingServiceConnection(this, null);
        Intent intent0 = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent0.setPackage("com.huawei.hwid");
        try {
            if(!context0.bindService(intent0, openAdvertisingId$HWAdvertisingServiceConnection0, 1)) {
                return;
            }
        }
        catch(Exception exception0) {
            DeviceLog.exception("Couldn\'t bind to identifier service intent", exception0);
            return;
        }
        try {
            HWAdvertisingInfo openAdvertisingId$HWAdvertisingInfo0 = HWAdvertisingInfoBinder.create(openAdvertisingId$HWAdvertisingServiceConnection0.getBinder());
            this.openAdvertisingIdentifier = openAdvertisingId$HWAdvertisingInfo0.getId();
            this.limitedOpenAdTracking = openAdvertisingId$HWAdvertisingInfo0.getEnabled(true);
        }
        catch(Exception exception1) {
            DeviceLog.exception("Couldn\'t get openAdvertising info", exception1);
        }
        finally {
            context0.unbindService(openAdvertisingId$HWAdvertisingServiceConnection0);
        }
    }

    private static OpenAdvertisingId getInstance() {
        if(OpenAdvertisingId.instance == null) {
            OpenAdvertisingId.instance = new OpenAdvertisingId();
        }
        return OpenAdvertisingId.instance;
    }

    public static boolean getLimitedOpenAdTracking() {
        return OpenAdvertisingId.getInstance().limitedOpenAdTracking;
    }

    public static String getOpenAdvertisingTrackingId() {
        return OpenAdvertisingId.getInstance().openAdvertisingIdentifier;
    }

    public static void init(Context context0) {
        if(Build.MANUFACTURER.toUpperCase().equals("HUAWEI")) {
            OpenAdvertisingId.getInstance().fetchOAId(context0);
        }
    }

    class com.unity3d.services.core.device.OpenAdvertisingId.1 {
    }

}

