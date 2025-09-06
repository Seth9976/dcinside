package androidx.webkit.internal;

import android.os.Build.VERSION;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.a;

public class WebViewGlueCommunicator {
    static class LAZY_COMPAT_CONVERTER_HOLDER {
        static final WebkitToCompatConverter a;

        static {
            LAZY_COMPAT_CONVERTER_HOLDER.a = new WebkitToCompatConverter(WebViewGlueCommunicator.d().getWebkitToCompatConverter());
        }
    }

    static class LAZY_FACTORY_HOLDER {
        static final WebViewProviderFactory a;

        static {
            LAZY_FACTORY_HOLDER.a = WebViewGlueCommunicator.a();
        }
    }

    private static final String a = "org.chromium.support_lib_glue.SupportLibReflectionUtil";
    private static final String b = "createWebViewProviderFactory";

    @NonNull
    static WebViewProviderFactory a() {
        try {
            InvocationHandler invocationHandler0 = WebViewGlueCommunicator.b();
            return new WebViewProviderFactoryAdapter(((WebViewProviderFactoryBoundaryInterface)a.a(WebViewProviderFactoryBoundaryInterface.class, invocationHandler0)));
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
        catch(ClassNotFoundException unused_ex) {
            return new IncompatibleApkWebViewProviderFactory();
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException(noSuchMethodException0);
        }
    }

    private static InvocationHandler b() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler)Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebViewGlueCommunicator.e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    @NonNull
    public static WebkitToCompatConverter c() {
        return LAZY_COMPAT_CONVERTER_HOLDER.a;
    }

    @NonNull
    public static WebViewProviderFactory d() {
        return LAZY_FACTORY_HOLDER.a;
    }

    @NonNull
    public static ClassLoader e() {
        return Build.VERSION.SDK_INT < 28 ? WebViewGlueCommunicator.f().getClass().getClassLoader() : ApiHelperForP.b();
    }

    private static Object f() {
        try {
            Method method0 = WebView.class.getDeclaredMethod("getFactory", null);
            method0.setAccessible(true);
            return method0.invoke(null, null);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException(noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }
}

