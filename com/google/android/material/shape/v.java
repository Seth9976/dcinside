package com.google.android.material.shape;

import android.view.View;
import androidx.annotation.NonNull;

class v extends u {
    @Override  // com.google.android.material.shape.u
    void b(@NonNull View view0) {
        if(this.c != null && !this.d.isEmpty()) {
            view0.invalidate();
        }
    }

    @Override  // com.google.android.material.shape.u
    boolean j() [...] // Inlined contents
}

