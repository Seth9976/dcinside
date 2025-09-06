package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.Owx;

public class DWo extends XX {
    private long PjT;
    private long Zh;

    public DWo(@NonNull Context context0) {
        super(context0);
        this.setVisibility(8);
        this.setClickable(true);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.widget.XX
    protected boolean PjT() {
        return false;
    }

    public void ReZ() {
        this.setVisibility(8);
        if(this.PjT != 0L) {
            this.Zh = SystemClock.elapsedRealtime();
        }
    }

    public void Zh(Owx owx0, int v) {
        if(this.isShown()) {
            return;
        }
        this.Zh();
        this.setVisibility(0);
        this.PjT = SystemClock.elapsedRealtime();
        this.PjT(owx0, v);
    }

    public boolean cr() {
        return this.PjT > 0L && this.Zh > 0L;
    }

    public long getDisplayDuration() {
        if(this.PjT == 0L) {
            return 0L;
        }
        if(this.Zh == 0L) {
            this.Zh = SystemClock.elapsedRealtime();
        }
        return this.Zh - this.PjT;
    }
}

