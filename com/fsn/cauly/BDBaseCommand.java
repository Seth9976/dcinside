package com.fsn.cauly;

import android.os.Handler;
import android.os.Message;

public abstract class BDBaseCommand implements BDCommand {
    static int a = 1;
    static Handler b;
    protected int c;
    protected OnCommandCompletedListener d;
    protected Object e;
    protected int f;

    static {
        BDBaseCommand.b = new Handler() {
            @Override  // android.os.Handler
            public void handleMessage(Message message0) {
                ((BDBaseCommand)message0.obj).handleMessage(message0);
            }
        };
    }

    public BDBaseCommand() {
        this.c = 0;
        this.e = null;
        this.f = 0;
    }

    public void Fire() {
        OnCommandCompletedListener bDCommand$OnCommandCompletedListener0 = this.d;
        if(bDCommand$OnCommandCompletedListener0 != null) {
            bDCommand$OnCommandCompletedListener0.onCommandCompleted(this);
        }
    }

    protected int a() {
        int v;
        synchronized(BDBaseCommand.class) {
            v = BDBaseCommand.a;
            BDBaseCommand.a = v + 1;
        }
        return v;
    }

    @Override  // com.fsn.cauly.BDCommand
    public Object getData() {
        return this.e;
    }

    @Override  // com.fsn.cauly.BDCommand
    public int getErrorCode() {
        return this.c;
    }

    @Override  // com.fsn.cauly.BDCommand
    public int getTag() {
        return this.f;
    }

    protected void handleMessage(Message message0) {
    }

    @Override  // com.fsn.cauly.BDCommand
    public void setData(Object object0) {
        this.e = object0;
    }

    @Override  // com.fsn.cauly.BDCommand
    public void setOnCommandResult(OnCommandCompletedListener bDCommand$OnCommandCompletedListener0) {
        this.d = bDCommand$OnCommandCompletedListener0;
    }

    @Override  // com.fsn.cauly.BDCommand
    public void setTag(int v) {
        this.f = v;
    }
}

