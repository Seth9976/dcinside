package com.fsn.cauly;

import android.os.Message;

public class BDDelayedCommand extends BDBaseCommand {
    int p;
    int q;

    public BDDelayedCommand(int v) {
        this.p = v;
    }

    @Override  // com.fsn.cauly.BDCommand
    public void cancel() {
        BDBaseCommand.b.removeMessages(this.q);
    }

    @Override  // com.fsn.cauly.BDCommand
    public void execute() {
        int v = this.a();
        this.q = v;
        if(this.p > 0) {
            BDBaseCommand.b.sendMessageDelayed(BDBaseCommand.b.obtainMessage(v, this), ((long)this.p));
            return;
        }
        BDBaseCommand.b.sendMessage(BDBaseCommand.b.obtainMessage(v, this));
    }

    @Override  // com.fsn.cauly.BDBaseCommand
    public void handleMessage(Message message0) {
        if(message0.what == this.q) {
            this.Fire();
            return;
        }
        super.handleMessage(message0);
    }
}

