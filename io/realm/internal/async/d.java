package io.realm.internal.async;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public class d extends ThreadPoolExecutor {
    private boolean a;
    private ReentrantLock b;
    private Condition c;
    private static final String d = "/sys/devices/system/cpu/";
    private static final int e = 0;
    private static final int f = 100;

    static {
        d.e = d.a();
    }

    private d(int v, int v1) {
        super(v, v1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock0 = new ReentrantLock();
        this.b = reentrantLock0;
        this.c = reentrantLock0.newCondition();
    }

    @SuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
    private static int a() {
        int v = d.b("/sys/devices/system/cpu/", "cpu[0-9]+");
        if(v <= 0) {
            v = Runtime.getRuntime().availableProcessors();
        }
        return v <= 0 ? 1 : 1 + v * 2;
    }

    private static int b(String s, String s1) {
        class a implements FileFilter {
            final Pattern a;

            a(Pattern pattern0) {
            }

            @Override
            public boolean accept(File file0) {
                String s = file0.getName();
                return this.a.matcher(s).matches();
            }
        }

        Pattern pattern0 = Pattern.compile(s1);
        try {
            File[] arr_file = new File(s).listFiles(new a(pattern0));
            return arr_file == null ? 0 : arr_file.length;
        }
        catch(SecurityException unused_ex) {
        }
        return 0;
    }

    @Override
    protected void beforeExecute(Thread thread0, Runnable runnable0) {
        super.beforeExecute(thread0, runnable0);
        this.b.lock();
        try {
        label_3:
            while(this.a) {
                this.c.await();
            }
        }
        catch(InterruptedException unused_ex) {
            thread0.interrupt();
            if(true) {
                return;
            }
            goto label_3;
        }
        finally {
            this.b.unlock();
        }
    }

    public static d c() {
        return new d(d.e, d.e);
    }

    public static d d() {
        return new d(1, 1);
    }

    public Future e(Runnable runnable0) {
        return super.submit(new b(runnable0));
    }

    public void pause() {
        this.b.lock();
        this.a = true;
        this.b.unlock();
    }

    public void resume() {
        this.b.lock();
        try {
            this.a = false;
            this.c.signalAll();
        }
        finally {
            this.b.unlock();
        }
    }
}

