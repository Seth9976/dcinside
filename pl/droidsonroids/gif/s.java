package pl.droidsonroids.gif;

abstract class s implements Runnable {
    final e a;

    s(e e0) {
        this.a = e0;
    }

    abstract void a();

    @Override
    public final void run() {
        try {
            if(!this.a.y()) {
                this.a();
            }
        }
        catch(Throwable throwable0) {
            Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = Thread.getDefaultUncaughtExceptionHandler();
            if(thread$UncaughtExceptionHandler0 != null) {
                thread$UncaughtExceptionHandler0.uncaughtException(Thread.currentThread(), throwable0);
            }
            throw throwable0;
        }
    }
}

