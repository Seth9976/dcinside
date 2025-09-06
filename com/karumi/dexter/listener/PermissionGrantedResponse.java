package com.karumi.dexter.listener;

import androidx.annotation.NonNull;

public final class PermissionGrantedResponse {
    private final PermissionRequest requestedPermission;

    public PermissionGrantedResponse(@NonNull PermissionRequest permissionRequest0) {
        this.requestedPermission = permissionRequest0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return PermissionGrantedResponse.class == class0 ? this.requestedPermission.getName().equals(((PermissionGrantedResponse)object0).requestedPermission.getName()) : false;
        }
        return false;
    }

    public static PermissionGrantedResponse from(@NonNull String s) {
        return new PermissionGrantedResponse(new PermissionRequest(s));
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
}

