package com.karumi.dexter.listener;

import androidx.annotation.NonNull;

public final class PermissionDeniedResponse {
    private final boolean permanentlyDenied;
    private final PermissionRequest requestedPermission;

    public PermissionDeniedResponse(@NonNull PermissionRequest permissionRequest0, boolean z) {
        this.requestedPermission = permissionRequest0;
        this.permanentlyDenied = z;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return PermissionDeniedResponse.class == class0 ? this.requestedPermission.getName().equals(((PermissionDeniedResponse)object0).requestedPermission.getName()) : false;
        }
        return false;
    }

    public static PermissionDeniedResponse from(@NonNull String s, boolean z) {
        return new PermissionDeniedResponse(new PermissionRequest(s), z);
    }

    public String getPermissionName() {
        return this.requestedPermission.getName();
    }

    public PermissionRequest getRequestedPermission() {
        return this.requestedPermission;
    }

    @Override
    public int hashCode() {
        return this.requestedPermission.getName().hashCode();
    }

    public boolean isPermanentlyDenied() {
        return this.permanentlyDenied;
    }
}

