package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {
    final class CommandProcessor extends AsyncTask {
        final JobIntentService a;

        protected Void a(Void[] arr_void) {
            GenericWorkItem jobIntentService$GenericWorkItem0;
            while((jobIntentService$GenericWorkItem0 = JobIntentService.this.a()) != null) {
                Intent intent0 = jobIntentService$GenericWorkItem0.getIntent();
                JobIntentService.this.h(intent0);
                jobIntentService$GenericWorkItem0.a();
            }
            return null;
        }

        protected void b(Void void0) {
            JobIntentService.this.j();
        }

        protected void c(Void void0) {
            JobIntentService.this.j();
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.a(((Void[])arr_object));
        }

        @Override  // android.os.AsyncTask
        protected void onCancelled(Object object0) {
            this.b(((Void)object0));
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.c(((Void)object0));
        }
    }

    interface CompatJobEngine {
        IBinder a();

        GenericWorkItem b();
    }

    static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context d;
        private final PowerManager.WakeLock e;
        private final PowerManager.WakeLock f;
        boolean g;
        boolean h;

        CompatWorkEnqueuer(Context context0, ComponentName componentName0) {
            super(componentName0);
            this.d = context0.getApplicationContext();
            PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
            PowerManager.WakeLock powerManager$WakeLock0 = powerManager0.newWakeLock(1, componentName0.getClassName() + ":launch");
            this.e = powerManager$WakeLock0;
            powerManager$WakeLock0.setReferenceCounted(false);
            PowerManager.WakeLock powerManager$WakeLock1 = powerManager0.newWakeLock(1, componentName0.getClassName() + ":run");
            this.f = powerManager$WakeLock1;
            powerManager$WakeLock1.setReferenceCounted(false);
        }

        @Override  // androidx.core.app.JobIntentService$WorkEnqueuer
        void a(Intent intent0) {
            Intent intent1 = new Intent(intent0);
            intent1.setComponent(this.a);
            if(this.d.startService(intent1) != null) {
                synchronized(this) {
                    if(!this.g) {
                        this.g = true;
                        if(!this.h) {
                            this.e.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override  // androidx.core.app.JobIntentService$WorkEnqueuer
        public void c() {
            synchronized(this) {
                if(this.h) {
                    if(this.g) {
                        this.e.acquire(60000L);
                    }
                    this.h = false;
                    this.f.release();
                }
            }
        }

        @Override  // androidx.core.app.JobIntentService$WorkEnqueuer
        public void d() {
            synchronized(this) {
                if(!this.h) {
                    this.h = true;
                    this.f.acquire(600000L);
                    this.e.release();
                }
            }
        }

        @Override  // androidx.core.app.JobIntentService$WorkEnqueuer
        public void e() {
            synchronized(this) {
                this.g = false;
            }
        }
    }

    final class CompatWorkItem implements GenericWorkItem {
        final Intent a;
        final int b;
        final JobIntentService c;

        CompatWorkItem(Intent intent0, int v) {
            this.a = intent0;
            this.b = v;
        }

        @Override  // androidx.core.app.JobIntentService$GenericWorkItem
        public void a() {
            JobIntentService.this.stopSelf(this.b);
        }

        @Override  // androidx.core.app.JobIntentService$GenericWorkItem
        public Intent getIntent() {
            return this.a;
        }
    }

    interface GenericWorkItem {
        void a();

        Intent getIntent();
    }

    @RequiresApi(26)
    static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        final class WrapperWorkItem implements GenericWorkItem {
            final JobWorkItem a;
            final JobServiceEngineImpl b;

            WrapperWorkItem(JobWorkItem jobWorkItem0) {
                this.a = jobWorkItem0;
            }

            @Override  // androidx.core.app.JobIntentService$GenericWorkItem
            public void a() {
                synchronized(JobServiceEngineImpl.this.b) {
                    JobParameters jobParameters0 = JobServiceEngineImpl.this.c;
                    if(jobParameters0 != null) {
                        jobParameters0.completeWork(this.a);
                    }
                }
            }

            @Override  // androidx.core.app.JobIntentService$GenericWorkItem
            public Intent getIntent() {
                return this.a.getIntent();
            }
        }

        final JobIntentService a;
        final Object b;
        JobParameters c;
        static final String d = "JobServiceEngineImpl";
        static final boolean e = false;

        JobServiceEngineImpl(JobIntentService jobIntentService0) {
            super(jobIntentService0);
            this.b = new Object();
            this.a = jobIntentService0;
        }

        @Override  // androidx.core.app.JobIntentService$CompatJobEngine
        public IBinder a() {
            return this.getBinder();
        }

        @Override  // androidx.core.app.JobIntentService$CompatJobEngine
        public GenericWorkItem b() {
            JobWorkItem jobWorkItem0;
            synchronized(this.b) {
                JobParameters jobParameters0 = this.c;
                if(jobParameters0 == null) {
                    return null;
                }
                jobWorkItem0 = jobParameters0.dequeueWork();
            }
            if(jobWorkItem0 != null) {
                jobWorkItem0.getIntent().setExtrasClassLoader(this.a.getClassLoader());
                return new WrapperWorkItem(this, jobWorkItem0);
            }
            return null;
        }

        @Override  // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters0) {
            this.c = jobParameters0;
            this.a.e(false);
            return true;
        }

        @Override  // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters0) {
            boolean z = this.a.b();
            synchronized(this.b) {
                this.c = null;
            }
            return z;
        }
    }

    @RequiresApi(26)
    static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo d;
        private final JobScheduler e;

        JobWorkEnqueuer(Context context0, ComponentName componentName0, int v) {
            super(componentName0);
            this.b(v);
            this.d = new JobInfo.Builder(v, this.a).setOverrideDeadline(0L).build();
            this.e = (JobScheduler)context0.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override  // androidx.core.app.JobIntentService$WorkEnqueuer
        void a(Intent intent0) {
            JobWorkItem jobWorkItem0 = r.a(intent0);
            this.e.enqueue(this.d, jobWorkItem0);
        }
    }

    static abstract class WorkEnqueuer {
        final ComponentName a;
        boolean b;
        int c;

        WorkEnqueuer(ComponentName componentName0) {
            this.a = componentName0;
        }

        abstract void a(Intent arg1);

        void b(int v) {
            if(!this.b) {
                this.b = true;
                this.c = v;
                return;
            }
            if(this.c != v) {
                throw new IllegalArgumentException("Given job ID " + v + " is different than previous " + this.c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    CompatJobEngine a;
    WorkEnqueuer b;
    CommandProcessor c;
    boolean d;
    boolean e;
    boolean f;
    final ArrayList g;
    static final String h = "JobIntentService";
    static final boolean i = false;
    static final Object j;
    static final HashMap k;

    static {
        JobIntentService.j = new Object();
        JobIntentService.k = new HashMap();
    }

    public JobIntentService() {
        this.d = false;
        this.e = false;
        this.f = false;
        if(Build.VERSION.SDK_INT >= 26) {
            this.g = null;
            return;
        }
        this.g = new ArrayList();
    }

    GenericWorkItem a() {
        CompatJobEngine jobIntentService$CompatJobEngine0 = this.a;
        if(jobIntentService$CompatJobEngine0 != null) {
            return jobIntentService$CompatJobEngine0.b();
        }
        synchronized(this.g) {
            return this.g.size() > 0 ? ((GenericWorkItem)this.g.remove(0)) : null;
        }
    }

    boolean b() {
        CommandProcessor jobIntentService$CommandProcessor0 = this.c;
        if(jobIntentService$CommandProcessor0 != null) {
            jobIntentService$CommandProcessor0.cancel(this.d);
        }
        this.e = true;
        return true;
    }

    public static void c(Context context0, ComponentName componentName0, int v, Intent intent0) {
        if(intent0 == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized(JobIntentService.j) {
            WorkEnqueuer jobIntentService$WorkEnqueuer0 = JobIntentService.f(context0, componentName0, true, v);
            jobIntentService$WorkEnqueuer0.b(v);
            jobIntentService$WorkEnqueuer0.a(intent0);
        }
    }

    public static void d(Context context0, Class class0, int v, Intent intent0) {
        JobIntentService.c(context0, new ComponentName(context0, class0), v, intent0);
    }

    void e(boolean z) {
        if(this.c == null) {
            this.c = new CommandProcessor(this);
            WorkEnqueuer jobIntentService$WorkEnqueuer0 = this.b;
            if(jobIntentService$WorkEnqueuer0 != null && z) {
                jobIntentService$WorkEnqueuer0.d();
            }
            this.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    static WorkEnqueuer f(Context context0, ComponentName componentName0, boolean z, int v) {
        CompatWorkEnqueuer jobIntentService$CompatWorkEnqueuer0;
        HashMap hashMap0 = JobIntentService.k;
        WorkEnqueuer jobIntentService$WorkEnqueuer0 = (WorkEnqueuer)hashMap0.get(componentName0);
        if(jobIntentService$WorkEnqueuer0 == null) {
            if(Build.VERSION.SDK_INT >= 26) {
                if(!z) {
                    throw new IllegalArgumentException("Can\'t be here without a job id");
                }
                jobIntentService$CompatWorkEnqueuer0 = new JobWorkEnqueuer(context0, componentName0, v);
            }
            else {
                jobIntentService$CompatWorkEnqueuer0 = new CompatWorkEnqueuer(context0, componentName0);
            }
            jobIntentService$WorkEnqueuer0 = jobIntentService$CompatWorkEnqueuer0;
            hashMap0.put(componentName0, jobIntentService$WorkEnqueuer0);
        }
        return jobIntentService$WorkEnqueuer0;
    }

    public boolean g() {
        return this.e;
    }

    protected abstract void h(Intent arg1);

    public boolean i() [...] // Inlined contents

    void j() {
        ArrayList arrayList0 = this.g;
        if(arrayList0 != null) {
            synchronized(arrayList0) {
                this.c = null;
                if(this.g != null && this.g.size() > 0) {
                    this.e(false);
                }
                else if(!this.f) {
                    this.b.c();
                }
            }
        }
    }

    public void k(boolean z) {
        this.d = z;
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        return this.a == null ? null : this.a.a();
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        if(Build.VERSION.SDK_INT >= 26) {
            this.a = new JobServiceEngineImpl(this);
            this.b = null;
            return;
        }
        this.a = null;
        this.b = JobIntentService.f(this, new ComponentName(this, this.getClass()), false, 0);
    }

    @Override  // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList0 = this.g;
        if(arrayList0 != null) {
            synchronized(arrayList0) {
                this.f = true;
                this.b.c();
            }
        }
    }

    @Override  // android.app.Service
    public int onStartCommand(Intent intent0, int v, int v1) {
        if(this.g != null) {
            this.b.e();
            ArrayList arrayList0 = this.g;
            synchronized(arrayList0) {
                ArrayList arrayList1 = this.g;
                if(intent0 == null) {
                    intent0 = new Intent();
                }
                arrayList1.add(new CompatWorkItem(this, intent0, v1));
                this.e(true);
                return 3;
            }
        }
        return 2;
    }
}

