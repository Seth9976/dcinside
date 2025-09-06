package com.google.android.gms.flags;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzc extends IInterface {
    boolean getBooleanFlagValue(String arg1, boolean arg2, int arg3) throws RemoteException;

    int getIntFlagValue(String arg1, int arg2, int arg3) throws RemoteException;

    long getLongFlagValue(String arg1, long arg2, int arg3) throws RemoteException;

    String getStringFlagValue(String arg1, String arg2, int arg3) throws RemoteException;

    void init(IObjectWrapper arg1) throws RemoteException;
}

