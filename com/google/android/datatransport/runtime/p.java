package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;

class p implements Executor {
    static class a implements Runnable {
        private final Runnable a;

        a(Runnable runnable0) {
            this.a = runnable0;
        }

        @Override
        public void run() {
            try {
                this.a.run();
            }
            catch(Exception exception0) {
                z1.a.f("Executor", "Background execution failure.", exception0);
            }
        }
    }

    private final Executor a;

    p(Executor executor0) {
        this.a = executor0;
    }

    @Override
    public void execute(Runnable runnable0) {
        a p$a0 = new a(runnable0);
        this.a.execute(p$a0);
    }
}

