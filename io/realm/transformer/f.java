package io.realm.transformer;

import com.android.build.api.artifact.ScopedArtifact.CLASSES;
import com.android.build.api.artifact.ScopedArtifact;
import com.android.build.api.variant.AndroidComponentsExtension;
import com.android.build.api.variant.Component;
import com.android.build.api.variant.ScopedArtifacts.Scope;
import com.android.build.api.variant.ScopedArtifacts;
import com.android.build.api.variant.UnitTest;
import com.android.build.api.variant.Variant;
import com.android.build.gradle.internal.publishing.AndroidArtifacts.ArtifactType;
import com.android.build.gradle.internal.publishing.AndroidArtifacts;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import org.gradle.api.Project;
import org.gradle.api.artifacts.ArtifactView.ViewConfiguration;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.TaskProvider;
import org.slf4j.a;
import org.slf4j.b;
import y4.l;
import y4.m;

public final class f {
    @l
    private static final a a = null;
    public static final long b = 4000L;
    public static final long c = 2000L;

    static {
        a a0 = b.j("realm-logger");
        L.o(a0, "getLogger(\"realm-logger\")");
        f.a = a0;
    }

    @l
    public static final a a() {
        return f.a;
    }

    public static final void b(@l Project project0) {
        static final class io.realm.transformer.f.a extends N implements Function1 {
            final Project e;

            io.realm.transformer.f.a(Project project0) {
                this.e = project0;
                super(1);
            }

            public final void c(@l Variant variant0) {
                final class io.realm.transformer.f.a.a extends h0 {
                    public static final io.realm.transformer.f.a.a a;

                    static {
                        io.realm.transformer.f.a.a.a = new io.realm.transformer.f.a.a();
                    }

                    io.realm.transformer.f.a.a() {
                        super(i.class, "inputJars", "getInputJars()Lorg/gradle/api/provider/ListProperty;", 0);
                    }

                    @Override  // kotlin.jvm.internal.h0
                    @m
                    public Object get(@m Object object0) {
                        return ((i)object0).h();
                    }
                }


                final class io.realm.transformer.f.a.b extends h0 {
                    public static final io.realm.transformer.f.a.b a;

                    static {
                        io.realm.transformer.f.a.b.a = new io.realm.transformer.f.a.b();
                    }

                    io.realm.transformer.f.a.b() {
                        super(i.class, "inputDirectoriesInternal", "getInputDirectoriesInternal()Lorg/gradle/api/provider/ListProperty;", 0);
                    }

                    @Override  // kotlin.jvm.internal.h0
                    @m
                    public Object get(@m Object object0) {
                        return ((i)object0).g();
                    }
                }


                final class c extends h0 {
                    public static final c a;

                    static {
                        c.a = new c();
                    }

                    c() {
                        super(i.class, "output", "getOutput()Lorg/gradle/api/file/RegularFileProperty;", 0);
                    }

                    @Override  // kotlin.jvm.internal.h0
                    @m
                    public Object get(@m Object object0) {
                        return ((i)object0).l();
                    }
                }

                L.p(variant0, "variant");
                Iterable iterable0 = variant0.getComponents();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    if(!(((Component)object0) instanceof UnitTest)) {
                        arrayList0.add(object0);
                    }
                }
                Project project0 = this.e;
                for(Object object1: arrayList0) {
                    TaskContainer taskContainer0 = project0.getTasks();
                    String s = ((Component)object1).getName();
                    e e0 = new e(((Component)object1), project0);
                    TaskProvider taskProvider0 = taskContainer0.register(s + "RealmAccessorsTransformer", i.class, e0);
                    ScopedArtifacts scopedArtifacts0 = ((Component)object1).getArtifacts().forScope(ScopedArtifacts.Scope.PROJECT);
                    L.o(taskProvider0, "taskProvider");
                    scopedArtifacts0.use(taskProvider0).toTransform(((ScopedArtifact)ScopedArtifact.CLASSES.INSTANCE), io.realm.transformer.f.a.a.a, io.realm.transformer.f.a.b.a, c.a);
                }
            }

            private static final void d(Component component0, Project project0, i i0) {
                L.p(component0, "$component");
                L.p(project0, "$project");
                i0.m().setFrom(((Iterable)component0.getRuntimeConfiguration().getIncoming().artifactView(new d()).getFiles()));
                i0.d().setFrom(m3.b.e(project0));
                i0.k().set(Boolean.valueOf(project0.getGradle().getStartParameter().isOffline()));
                i0.o().set(m3.b.h(project0));
                i0.p().set(Boolean.valueOf(m3.b.i(project0)));
                i0.i().set(m3.b.f(project0));
                i0.n().set(m3.b.g(project0));
                i0.a().set(m3.b.b(project0));
                i0.q().set(Boolean.valueOf(k.c(project0)));
                i0.e().set(project0.getGradle().getGradleVersion());
                i0.b().set(m3.b.d(project0));
                i0.c().set(Boolean.valueOf(m3.b.a(project0)));
            }

            private static final void e(ArtifactView.ViewConfiguration artifactView$ViewConfiguration0) {
                artifactView$ViewConfiguration0.getAttributes().attribute(AndroidArtifacts.ARTIFACT_TYPE, AndroidArtifacts.ArtifactType.CLASSES_JAR.getType());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.c(((Variant)object0));
                return S0.a;
            }
        }

        L.p(project0, "project");
        AndroidComponentsExtension androidComponentsExtension0 = (AndroidComponentsExtension)project0.getExtensions().getByType(AndroidComponentsExtension.class);
        L.o(androidComponentsExtension0, "androidComponents");
        AndroidComponentsExtension.onVariants$default(androidComponentsExtension0, null, new io.realm.transformer.f.a(project0), 1, null);
    }
}

