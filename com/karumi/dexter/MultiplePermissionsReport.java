package com.karumi.dexter;

import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class MultiplePermissionsReport {
    private final Set deniedPermissionResponses;
    private final Set grantedPermissionResponses;

    MultiplePermissionsReport() {
        this.grantedPermissionResponses = new LinkedHashSet();
        this.deniedPermissionResponses = new LinkedHashSet();
    }

    boolean addDeniedPermissionResponse(PermissionDeniedResponse permissionDeniedResponse0) {
        return this.deniedPermissionResponses.add(permissionDeniedResponse0);
    }

    boolean addGrantedPermissionResponse(PermissionGrantedResponse permissionGrantedResponse0) {
        return this.grantedPermissionResponses.add(permissionGrantedResponse0);
    }

    public boolean areAllPermissionsGranted() {
        return this.deniedPermissionResponses.isEmpty();
    }

    void clear() {
        this.grantedPermissionResponses.clear();
        this.deniedPermissionResponses.clear();
    }

    public List getDeniedPermissionResponses() {
        return new LinkedList(this.deniedPermissionResponses);
    }

    public List getGrantedPermissionResponses() {
        return new LinkedList(this.grantedPermissionResponses);
    }

    public boolean isAnyPermissionPermanentlyDenied() {
        for(Object object0: this.deniedPermissionResponses) {
            if(((PermissionDeniedResponse)object0).isPermanentlyDenied()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

