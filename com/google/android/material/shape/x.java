package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(33)
class x extends u {
    x(@NonNull View view0) {
        this.l(view0);
    }

    @Override  // com.google.android.material.shape.u
    void b(@NonNull View view0) {
        view0.setClipToOutline(!this.j());
        if(this.j()) {
            view0.invalidate();
            return;
        }
        view0.invalidateOutline();
    }

    @Override  // com.google.android.material.shape.u
    boolean j() {
        return this.a;
    }

    @DoNotInline
    private void l(View view0) {
        class a extends ViewOutlineProvider {
            final x a;

            @Override  // android.view.ViewOutlineProvider
            public void getOutline(View view0, Outline outline0) {
                if(!x.this.e.isEmpty()) {
                    outline0.setPath(x.this.e);
                }
            }
        }

        view0.setOutlineProvider(new a(this));
    }
}

