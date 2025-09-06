package com.fsn.cauly;

import android.os.AsyncTask;

public abstract class BDThreadCommand extends BDBaseCommand {
    class CommandTask extends AsyncTask {
        final BDThreadCommand a;

        protected Void a(Void[] arr_void) {
            if(BDThreadCommand.this.h != -1) {
                Thread.currentThread().setPriority(BDThreadCommand.this.h);
            }
            BDThreadCommand.this.handleCommand();
            return null;
        }

        protected void a(Void void0) {
            super.onPostExecute(void0);
            BDThreadCommand bDThreadCommand0 = BDThreadCommand.this;
            if(!bDThreadCommand0.g) {
                bDThreadCommand0.Fire();
                BDThreadCommand.this.i = null;
            }
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.a(((Void[])arr_object));
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.a(((Void)object0));
        }
    }

    protected boolean g;
    protected int h;
    protected CommandTask i;

    public BDThreadCommand() {
        this.g = false;
        this.h = -1;
        this.i = null;
    }

    @Override  // com.fsn.cauly.BDCommand
    public void cancel() {
        CommandTask bDThreadCommand$CommandTask0 = this.i;
        if(bDThreadCommand$CommandTask0 != null && !this.g) {
            bDThreadCommand$CommandTask0.cancel(false);
            synchronized(this) {
                this.g = true;
            }
            this.i = null;
        }
    }

    @Override  // com.fsn.cauly.BDCommand
    public void execute() {
        CommandTask bDThreadCommand$CommandTask0 = new CommandTask(this);
        this.i = bDThreadCommand$CommandTask0;
        bDThreadCommand$CommandTask0.execute(new Void[0]);
    }

    public abstract void handleCommand();

    public void setThreadPriority(int v) {
        this.h = v;
    }
}

