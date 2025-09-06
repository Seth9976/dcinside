package com.karumi.dexter.listener;

import androidx.annotation.NonNull;

public final class PermissionRequest {
    private final String name;

    public PermissionRequest(@NonNull String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Permission name: " + this.name;
    }
}

