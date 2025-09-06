package m3;

import com.android.build.gradle.BaseExtension;
import com.android.builder.model.ApiVersion;
import java.util.List;
import kotlin.jvm.internal.L;
import org.gradle.api.Project;
import org.gradle.api.plugins.PluginContainer;
import y4.l;

public final class b {
    public static final boolean a(@l Project project0) {
        L.p(project0, "<this>");
        return project0.getExtensions().getExtraProperties().has("io.realm.disableIncrementalBuilds") ? L.g(project0.getExtensions().getExtraProperties().get("io.realm.disableIncrementalBuilds"), "true") : false;
    }

    @l
    public static final String b(@l Project project0) {
        L.p(project0, "<this>");
        try {
            Object object0 = project0.getExtensions().getByName("androidComponents");
            if(object0 != null) {
                Object object1 = object0.getClass().getMethod("getPluginVersion", null).invoke(object0, null);
                return object1 == null ? "unknown" : object1.toString();
            }
        }
        catch(Exception unused_ex) {
        }
        return "unknown";
    }

    private static final BaseExtension c(Project project0) {
        Object object0 = project0.getExtensions().getByName("android");
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.android.build.gradle.BaseExtension");
        }
        return (BaseExtension)object0;
    }

    @l
    public static final String d(@l Project project0) {
        L.p(project0, "<this>");
        String s = project0.getRootProject().getName();
        L.o(s, "this.rootProject.name");
        return s;
    }

    @l
    public static final List e(@l Project project0) {
        L.p(project0, "<this>");
        return b.c(project0).getBootClasspath();
    }

    @l
    public static final String f(@l Project project0) {
        L.p(project0, "<this>");
        ApiVersion apiVersion0 = b.c(project0).getDefaultConfig().getMinSdkVersion();
        String s = apiVersion0 == null ? null : apiVersion0.getApiString();
        return s == null ? "unknown" : s;
    }

    @l
    public static final String g(@l Project project0) {
        L.p(project0, "<this>");
        ApiVersion apiVersion0 = b.c(project0).getDefaultConfig().getTargetSdkVersion();
        String s = apiVersion0 == null ? null : apiVersion0.getApiString();
        return s == null ? "unknown" : s;
    }

    @l
    public static final String h(@l Project project0) {
        L.p(project0, "<this>");
        PluginContainer pluginContainer0 = project0.getProject().getPlugins();
        if(pluginContainer0.findPlugin("com.android.application") != null) {
            return "app";
        }
        return pluginContainer0.findPlugin("com.android.library") == null ? "unknown" : "library";
    }

    public static final boolean i(@l Project project0) {
        L.p(project0, "<this>");
        return project0.getProject().getPluginManager().hasPlugin("kotlin-kapt");
    }
}

