package com.karumi.dexter.listener.single;

import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import java.util.Arrays;
import java.util.Collection;

public class CompositePermissionListener implements PermissionListener {
    private final Collection listeners;

    public CompositePermissionListener(Collection collection0) {
        this.listeners = collection0;
    }

    public CompositePermissionListener(PermissionListener[] arr_permissionListener) {
        this(Arrays.asList(arr_permissionListener));
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse0) {
        for(Object object0: this.listeners) {
            ((PermissionListener)object0).onPermissionDenied(permissionDeniedResponse0);
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse0) {
        for(Object object0: this.listeners) {
            ((PermissionListener)object0).onPermissionGranted(permissionGrantedResponse0);
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest0, PermissionToken permissionToken0) {
        for(Object object0: this.listeners) {
            ((PermissionListener)object0).onPermissionRationaleShouldBeShown(permissionRequest0, permissionToken0);
        }
    }
}

