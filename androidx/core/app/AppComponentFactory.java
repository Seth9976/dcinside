package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

@RequiresApi(28)
public class AppComponentFactory extends android.app.AppComponentFactory {
    public Activity a(ClassLoader classLoader0, String s, Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Activity)Class.forName(s, false, classLoader0).asSubclass(Activity.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(InvocationTargetException | NoSuchMethodException invocationTargetException0) {
            throw new RuntimeException("Couldn\'t call constructor", invocationTargetException0);
        }
    }

    public Application b(ClassLoader classLoader0, String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Application)Class.forName(s, false, classLoader0).asSubclass(Application.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(InvocationTargetException | NoSuchMethodException invocationTargetException0) {
            throw new RuntimeException("Couldn\'t call constructor", invocationTargetException0);
        }
    }

    public ContentProvider c(ClassLoader classLoader0, String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (ContentProvider)Class.forName(s, false, classLoader0).asSubclass(ContentProvider.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(InvocationTargetException | NoSuchMethodException invocationTargetException0) {
            throw new RuntimeException("Couldn\'t call constructor", invocationTargetException0);
        }
    }

    public BroadcastReceiver d(ClassLoader classLoader0, String s, Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (BroadcastReceiver)Class.forName(s, false, classLoader0).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(InvocationTargetException | NoSuchMethodException invocationTargetException0) {
            throw new RuntimeException("Couldn\'t call constructor", invocationTargetException0);
        }
    }

    public Service e(ClassLoader classLoader0, String s, Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Service)Class.forName(s, false, classLoader0).asSubclass(Service.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(InvocationTargetException | NoSuchMethodException invocationTargetException0) {
            throw new RuntimeException("Couldn\'t call constructor", invocationTargetException0);
        }
    }

    @Override  // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader0, String s, Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity)CoreComponentFactory.a(this.a(classLoader0, s, intent0));
    }

    @Override  // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader0, String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application)CoreComponentFactory.a(this.b(classLoader0, s));
    }

    @Override  // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader0, String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider)CoreComponentFactory.a(this.c(classLoader0, s));
    }

    @Override  // android.app.AppComponentFactory
    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader0, String s, Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver)CoreComponentFactory.a(this.d(classLoader0, s, intent0));
    }

    @Override  // android.app.AppComponentFactory
    public final Service instantiateService(ClassLoader classLoader0, String s, Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service)CoreComponentFactory.a(this.e(classLoader0, s, intent0));
    }
}

