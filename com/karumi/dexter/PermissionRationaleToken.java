package com.karumi.dexter;

final class PermissionRationaleToken implements PermissionToken {
    private final DexterInstance dexterInstance;
    private boolean isTokenResolved;

    PermissionRationaleToken(DexterInstance dexterInstance0) {
        this.isTokenResolved = false;
        this.dexterInstance = dexterInstance0;
    }

    @Override  // com.karumi.dexter.PermissionToken
    public void cancelPermissionRequest() {
        if(!this.isTokenResolved) {
            this.dexterInstance.onCancelPermissionRequest();
            this.isTokenResolved = true;
        }
    }

    @Override  // com.karumi.dexter.PermissionToken
    public void continuePermissionRequest() {
        if(!this.isTokenResolved) {
            this.dexterInstance.onContinuePermissionRequest();
            this.isTokenResolved = true;
        }
    }
}

