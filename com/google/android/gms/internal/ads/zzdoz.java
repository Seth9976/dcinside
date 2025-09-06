package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.zzau;
import java.util.ArrayList;

public final class zzdoz extends FrameLayout {
    private final zzau zza;

    public zzdoz(Context context0, @NonNull View view0, @NonNull zzau zzau0) {
        super(context0);
        this.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.addView(view0);
        this.zza = zzau0;
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        this.zza.zzm(motionEvent0);
        return false;
    }

    @Override  // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < this.getChildCount(); ++v1) {
            View view0 = this.getChildAt(v1);
            if(view0 != null && view0 instanceof zzcex) {
                arrayList0.add(((zzcex)view0));
            }
        }
        super.removeAllViews();
        int v2 = arrayList0.size();
        for(int v = 0; v < v2; ++v) {
            ((zzcex)arrayList0.get(v)).destroy();
        }
    }
}

