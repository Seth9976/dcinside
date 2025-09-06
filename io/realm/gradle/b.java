package io.realm.gradle;

import com.android.build.gradle.AppPlugin;
import com.android.build.gradle.LibraryPlugin;
import io.realm.transformer.f;
import java.util.Iterator;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import org.gradle.api.GradleException;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.plugins.PluginCollection;
import y4.l;

public class b implements Plugin {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final void d() {
            e e0 = e.c.d();
            if(e0.b(new e(7, 4)) < 0) {
                throw new GradleException("Android Gradle Plugin " + e0 + " is not supported. Upgrade to Realm Java `10.15.0` or later.");
            }
            c.a().n("Realm Plugin used with AGP version: " + e0.g() + '.' + e0.h() + '.');
        }

        private final String e(Project project0) {
            try {
                project0.getConfigurations().getByName("api");
                return "api";
            }
            catch(UnknownConfigurationException unused_ex) {
                return "compile";
            }
        }

        private final void f(Project project0, String s, boolean z, boolean z1) {
            Iterator iterator0 = project0.getConfigurations().getByName(s).getDependencies().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Dependency dependency0 = (Dependency)object0;
                if(L.g(dependency0.getGroup(), "io.realm")) {
                    String s1 = dependency0.getName();
                    L.o(s1, "item.name");
                    if(v.v2(s1, "realm-android-library", false, 2, null)) {
                        iterator0.remove();
                    }
                    String s2 = dependency0.getName();
                    L.o(s2, "item.name");
                    if(v.v2(s2, "realm-android-kotlin-extensions", false, 2, null)) {
                        iterator0.remove();
                    }
                }
            }
            String s3 = "";
            project0.getDependencies().add(s, "io.realm:" + ("realm-android-library" + (z ? "-object-server" : "")) + ":10.19.0");
            if(z1) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("realm-android-kotlin-extensions");
                if(z) {
                    s3 = "-object-server";
                }
                stringBuilder0.append(s3);
                project0.getDependencies().add(s, "io.realm:" + stringBuilder0.toString() + ":10.19.0");
            }
        }
    }

    @l
    public static final a a;

    static {
        b.a = new a(null);
    }

    public void b(Object object0) {
        this.c(((Project)object0));
    }

    public void c(@l Project project0) {
        L.p(project0, "project");
        PluginCollection pluginCollection0 = project0.getPlugins().withType(AppPlugin.class);
        L.o(pluginCollection0, "project.plugins.withType(AppPlugin::class.java)");
        PluginCollection pluginCollection1 = project0.getPlugins().withType(LibraryPlugin.class);
        L.o(pluginCollection1, "project.plugins.withType…ibraryPlugin::class.java)");
        if(pluginCollection0.isEmpty() && pluginCollection1.isEmpty()) {
            throw new GradleException("\'com.android.application\' or \'com.android.library\' plugin required.");
        }
        b.a.d();
        boolean z = project0.getPlugins().findPlugin("kotlin-android") != null || project0.getPlugins().findPlugin("kotlin-multiplatform") != null;
        project0.getConfigurations().findByName("annotationProcessor");
        String s = b.a.e(project0);
        d d0 = (d)project0.getExtensions().create("realm", d.class, new Object[0]);
        d0.c(z);
        f.b(project0);
        project0.getDependencies().add(s, "io.realm:realm-annotations:10.19.0");
        if(z) {
            project0.getDependencies().add("kapt", "io.realm:realm-annotations-processor:10.19.0");
            project0.getDependencies().add("kaptAndroidTest", "io.realm:realm-annotations-processor:10.19.0");
        }
        else {
            project0.getDependencies().add("annotationProcessor", "io.realm:realm-annotations-processor:10.19.0");
            project0.getDependencies().add("androidTestAnnotationProcessor", "io.realm:realm-annotations-processor:10.19.0");
        }
        project0.afterEvaluate(new io.realm.gradle.a(s, project0, d0));
    }

    private static final void d(String s, Project project0, d d0, Project project1) {
        L.p(s, "$dependencyConfigurationName");
        L.p(project0, "$project");
        for(Object object0: u.O(new String[]{s, "androidTestImplementation"})) {
            b.a.f(project0, ((String)object0), d0.b(), d0.a());
        }
    }
}

