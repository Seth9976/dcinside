package com.bytedance.sdk.component.cz.PjT;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

public interface cz extends IInterface {
    public static abstract class PjT extends Binder implements cz {
        static class com.bytedance.sdk.component.cz.PjT.cz.PjT.PjT implements cz {
            public static cz PjT;
            private IBinder Zh;

            com.bytedance.sdk.component.cz.PjT.cz.PjT.PjT(IBinder iBinder0) {
                this.Zh = iBinder0;
            }

            @Override  // com.bytedance.sdk.component.cz.PjT.cz
            public int PjT(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) throws RemoteException {
                int v1;
                int v;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    if(contentValues0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        contentValues0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    parcel0.writeStringArray(arr_s);
                    if(!this.Zh.transact(5, parcel0, parcel1, 0) && PjT.PjT() != null) {
                        v = PjT.PjT().PjT(uri0, contentValues0, s, arr_s);
                        goto label_17;
                    }
                    goto label_20;
                }
                catch(Throwable throwable0) {
                    parcel1.recycle();
                    parcel0.recycle();
                    throw throwable0;
                }
            label_17:
                parcel1.recycle();
                parcel0.recycle();
                return v;
                try {
                label_20:
                    parcel1.readException();
                    v1 = parcel1.readInt();
                }
                catch(Throwable throwable0) {
                    parcel1.recycle();
                    parcel0.recycle();
                    throw throwable0;
                }
                parcel1.recycle();
                parcel0.recycle();
                return v1;
            }

            @Override  // com.bytedance.sdk.component.cz.PjT.cz
            public int PjT(Uri uri0, String s, String[] arr_s) throws RemoteException {
                int v1;
                int v;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    parcel0.writeStringArray(arr_s);
                    if(!this.Zh.transact(4, parcel0, parcel1, 0) && PjT.PjT() != null) {
                        v = PjT.PjT().PjT(uri0, s, arr_s);
                        goto label_12;
                    }
                    goto label_15;
                }
                catch(Throwable throwable0) {
                    parcel1.recycle();
                    parcel0.recycle();
                    throw throwable0;
                }
            label_12:
                parcel1.recycle();
                parcel0.recycle();
                return v;
                try {
                label_15:
                    parcel1.readException();
                    v1 = parcel1.readInt();
                }
                catch(Throwable throwable0) {
                    parcel1.recycle();
                    parcel0.recycle();
                    throw throwable0;
                }
                parcel1.recycle();
                parcel0.recycle();
                return v1;
            }

            @Override  // com.bytedance.sdk.component.cz.PjT.cz
            public String PjT(Uri uri0) throws RemoteException {
                String s1;
                String s;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    if(!this.Zh.transact(2, parcel0, parcel1, 0) && PjT.PjT() != null) {
                        s = PjT.PjT().PjT(uri0);
                        goto label_10;
                    }
                    goto label_13;
                }
                catch(Throwable throwable0) {
                    parcel1.recycle();
                    parcel0.recycle();
                    throw throwable0;
                }
            label_10:
                parcel1.recycle();
                parcel0.recycle();
                return s;
                try {
                label_13:
                    parcel1.readException();
                    s1 = parcel1.readString();
                }
                catch(Throwable throwable0) {
                    parcel1.recycle();
                    parcel0.recycle();
                    throw throwable0;
                }
                parcel1.recycle();
                parcel0.recycle();
                return s1;
            }

            @Override  // com.bytedance.sdk.component.cz.PjT.cz
            public String PjT(Uri uri0, ContentValues contentValues0) throws RemoteException {
                String s1;
                String s;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    if(contentValues0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        contentValues0.writeToParcel(parcel0, 0);
                    }
                    if(!this.Zh.transact(3, parcel0, parcel1, 0) && PjT.PjT() != null) {
                        s = PjT.PjT().PjT(uri0, contentValues0);
                        goto label_15;
                    }
                    goto label_18;
                }
                catch(Throwable throwable0) {
                    parcel1.recycle();
                    parcel0.recycle();
                    throw throwable0;
                }
            label_15:
                parcel1.recycle();
                parcel0.recycle();
                return s;
                try {
                label_18:
                    parcel1.readException();
                    s1 = parcel1.readString();
                }
                catch(Throwable throwable0) {
                    parcel1.recycle();
                    parcel0.recycle();
                    throw throwable0;
                }
                parcel1.recycle();
                parcel0.recycle();
                return s1;
            }

            @Override  // com.bytedance.sdk.component.cz.PjT.cz
            public Map PjT(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) throws RemoteException {
                Map map1;
                Map map0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStringArray(arr_s);
                    parcel0.writeString(s);
                    parcel0.writeStringArray(arr_s1);
                    parcel0.writeString(s1);
                    if(!this.Zh.transact(1, parcel0, parcel1, 0) && PjT.PjT() != null) {
                        map0 = PjT.PjT().PjT(uri0, arr_s, s, arr_s1, s1);
                        goto label_14;
                    }
                    goto label_17;
                }
                catch(Throwable throwable0) {
                    parcel1.recycle();
                    parcel0.recycle();
                    throw throwable0;
                }
            label_14:
                parcel1.recycle();
                parcel0.recycle();
                return map0;
                try {
                label_17:
                    parcel1.readException();
                    map1 = parcel1.readHashMap(this.getClass().getClassLoader());
                }
                catch(Throwable throwable0) {
                    parcel1.recycle();
                    parcel0.recycle();
                    throw throwable0;
                }
                parcel1.recycle();
                parcel0.recycle();
                return map1;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.Zh;
            }
        }

        public PjT() {
            this.attachInterface(this, "com.bytedance.sdk.component.log.impl.IListenerEventManager");
        }

        public static cz PjT() {
            return com.bytedance.sdk.component.cz.PjT.cz.PjT.PjT.PjT;
        }

        public static cz PjT(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            return iInterface0 != null && iInterface0 instanceof cz ? ((cz)iInterface0) : new com.bytedance.sdk.component.cz.PjT.cz.PjT.PjT(iBinder0);
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            Uri uri0 = null;
            switch(v) {
                case 1: {
                    parcel0.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if(parcel0.readInt() != 0) {
                        uri0 = (Uri)Uri.CREATOR.createFromParcel(parcel0);
                    }
                    Map map0 = this.PjT(uri0, parcel0.createStringArray(), parcel0.readString(), parcel0.createStringArray(), parcel0.readString());
                    parcel1.writeNoException();
                    parcel1.writeMap(map0);
                    return true;
                }
                case 2: {
                    parcel0.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if(parcel0.readInt() != 0) {
                        uri0 = (Uri)Uri.CREATOR.createFromParcel(parcel0);
                    }
                    String s1 = this.PjT(uri0);
                    parcel1.writeNoException();
                    parcel1.writeString(s1);
                    return true;
                }
                case 3: {
                    parcel0.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    Uri uri2 = parcel0.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(parcel0));
                    if(parcel0.readInt() != 0) {
                        uri0 = (ContentValues)ContentValues.CREATOR.createFromParcel(parcel0);
                    }
                    String s = this.PjT(uri2, ((ContentValues)uri0));
                    parcel1.writeNoException();
                    parcel1.writeString(s);
                    return true;
                }
                case 4: {
                    parcel0.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if(parcel0.readInt() != 0) {
                        uri0 = (Uri)Uri.CREATOR.createFromParcel(parcel0);
                    }
                    int v3 = this.PjT(uri0, parcel0.readString(), parcel0.createStringArray());
                    parcel1.writeNoException();
                    parcel1.writeInt(v3);
                    return true;
                }
                case 5: {
                    parcel0.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    Uri uri1 = parcel0.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(parcel0));
                    if(parcel0.readInt() != 0) {
                        uri0 = (ContentValues)ContentValues.CREATOR.createFromParcel(parcel0);
                    }
                    int v2 = this.PjT(uri1, ((ContentValues)uri0), parcel0.readString(), parcel0.createStringArray());
                    parcel1.writeNoException();
                    parcel1.writeInt(v2);
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    int PjT(Uri arg1, ContentValues arg2, String arg3, String[] arg4) throws RemoteException;

    int PjT(Uri arg1, String arg2, String[] arg3) throws RemoteException;

    String PjT(Uri arg1) throws RemoteException;

    String PjT(Uri arg1, ContentValues arg2) throws RemoteException;

    Map PjT(Uri arg1, String[] arg2, String arg3, String[] arg4, String arg5) throws RemoteException;
}

