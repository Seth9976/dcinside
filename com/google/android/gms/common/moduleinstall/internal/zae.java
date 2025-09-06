package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

public interface zae extends IInterface {
    void zab(Status arg1) throws RemoteException;

    void zac(Status arg1, @Nullable ModuleInstallIntentResponse arg2) throws RemoteException;

    void zad(Status arg1, @Nullable ModuleInstallResponse arg2) throws RemoteException;

    void zae(Status arg1, @Nullable ModuleAvailabilityResponse arg2) throws RemoteException;
}

