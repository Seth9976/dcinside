package com.fsn.cauly.Y;

import android.os.Message;

public class t0 extends r0 {
    int g;
    int s;

    public t0(int v) {
        this.g = v;
    }

    @Override  // com.fsn.cauly.Y.r0
    public void a(Message message0) {
        if(message0.what == this.s) {
            this.a();
            return;
        }
        super.a(message0);
    }

    @Override  // com.fsn.cauly.Y.s0
    public void cancel() {
        r0.b.removeMessages(this.s);
    }

    @Override  // com.fsn.cauly.Y.s0
    public void execute() {
        int v = this.b();
        this.s = v;
        if(this.g > 0) {
            r0.b.sendMessageDelayed(r0.b.obtainMessage(v, this), ((long)this.g));
            return;
        }
        r0.b.sendMessage(r0.b.obtainMessage(v, this));
    }
}

