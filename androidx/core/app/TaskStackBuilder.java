package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;

public final class TaskStackBuilder implements Iterable {
    public interface SupportParentable {
        Intent g();
    }

    private final ArrayList a;
    private final Context b;
    private static final String c = "TaskStackBuilder";

    private TaskStackBuilder(Context context0) {
        this.a = new ArrayList();
        this.b = context0;
    }

    public TaskStackBuilder a(Intent intent0) {
        this.a.add(intent0);
        return this;
    }

    public TaskStackBuilder b(Intent intent0) {
        ComponentName componentName0 = intent0.getComponent();
        if(componentName0 == null) {
            componentName0 = intent0.resolveActivity(this.b.getPackageManager());
        }
        if(componentName0 != null) {
            this.d(componentName0);
        }
        this.a(intent0);
        return this;
    }

    public TaskStackBuilder c(Activity activity0) {
        Intent intent0 = activity0 instanceof SupportParentable ? ((SupportParentable)activity0).g() : null;
        if(intent0 == null) {
            intent0 = NavUtils.a(activity0);
        }
        if(intent0 != null) {
            ComponentName componentName0 = intent0.getComponent();
            if(componentName0 == null) {
                componentName0 = intent0.resolveActivity(this.b.getPackageManager());
            }
            this.d(componentName0);
            this.a(intent0);
        }
        return this;
    }

    public TaskStackBuilder d(ComponentName componentName0) {
        int v = this.a.size();
        try {
            for(Intent intent0 = NavUtils.b(this.b, componentName0); intent0 != null; intent0 = NavUtils.b(this.b, componentName1)) {
                this.a.add(v, intent0);
                ComponentName componentName1 = intent0.getComponent();
            }
            return this;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(packageManager$NameNotFoundException0);
        }
    }

    public TaskStackBuilder g(Class class0) {
        return this.d(new ComponentName(this.b, class0));
    }

    public static TaskStackBuilder h(Context context0) {
        return new TaskStackBuilder(context0);
    }

    public Intent i(int v) {
        return (Intent)this.a.get(v);
    }

    @Override
    @Deprecated
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Deprecated
    public static TaskStackBuilder j(Context context0) {
        return TaskStackBuilder.h(context0);
    }

    @Deprecated
    public Intent k(int v) {
        return this.i(v);
    }

    public int l() {
        return this.a.size();
    }

    public Intent[] m() {
        int v = this.a.size();
        Intent[] arr_intent = new Intent[v];
        if(v == 0) {
            return arr_intent;
        }
        arr_intent[0] = new Intent(((Intent)this.a.get(0))).addFlags(0x1000C000);
        for(int v1 = 1; v1 < v; ++v1) {
            arr_intent[v1] = new Intent(((Intent)this.a.get(v1)));
        }
        return arr_intent;
    }

    public PendingIntent n(int v, int v1) {
        return this.o(v, v1, null);
    }

    public PendingIntent o(int v, int v1, Bundle bundle0) {
        if(this.a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] arr_intent = (Intent[])this.a.toArray(new Intent[0]);
        arr_intent[0] = new Intent(arr_intent[0]).addFlags(0x1000C000);
        return PendingIntent.getActivities(this.b, v, arr_intent, v1, bundle0);
    }

    public PendingIntent p(int v, int v1, Bundle bundle0, boolean z) {
        return this.o(v, PendingIntentCompat.a(z, v1), bundle0);
    }

    public PendingIntent q(int v, int v1, boolean z) {
        return this.n(v, PendingIntentCompat.a(z, v1));
    }

    public void r() {
        this.t(null);
    }

    public void t(Bundle bundle0) {
        if(this.a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] arr_intent = (Intent[])this.a.toArray(new Intent[0]);
        arr_intent[0] = new Intent(arr_intent[0]).addFlags(0x1000C000);
        if(!ContextCompat.startActivities(this.b, arr_intent, bundle0)) {
            Intent intent0 = new Intent(arr_intent[arr_intent.length - 1]);
            intent0.addFlags(0x10000000);
            this.b.startActivity(intent0);
        }
    }
}

