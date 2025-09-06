package io.realm.transformer;

import g3.e;
import io.realm.transformer.build.h;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.List;
import java.util.Set;
import java.util.jar.JarOutputStream;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.FileCollection;
import org.gradle.api.file.RegularFile;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Classpath;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputFiles;
import org.gradle.api.tasks.PathSensitive;
import org.gradle.api.tasks.PathSensitivity;
import org.gradle.api.tasks.TaskAction;
import org.gradle.work.Incremental;
import org.gradle.work.InputChanges;
import r3.a;
import y4.l;
import y4.m;

public abstract class i extends DefaultTask {
    @l
    private final ConfigurableFileCollection a;

    public i() {
        ConfigurableFileCollection configurableFileCollection0 = this.j().fileCollection().from(new Object[]{this.g()});
        L.o(configurableFileCollection0, "objectFactory.fileCollec…inputDirectoriesInternal)");
        this.a = configurableFileCollection0;
    }

    @Input
    @l
    public abstract Property a();

    @Input
    @l
    public abstract Property b();

    @Input
    @l
    public abstract Property c();

    @InputFiles
    @l
    public abstract ConfigurableFileCollection d();

    @Input
    @l
    public abstract Property e();

    @InputFiles
    @PathSensitive(PathSensitivity.RELATIVE)
    @Incremental
    @l
    public final ConfigurableFileCollection f() {
        return this.a;
    }

    @Internal
    @l
    public abstract ListProperty g();

    @InputFiles
    @l
    public abstract ListProperty h();

    @Input
    @l
    public abstract Property i();

    @a
    @l
    public abstract ObjectFactory j();

    @Input
    @l
    public abstract Property k();

    @OutputFiles
    @l
    public abstract RegularFileProperty l();

    @Classpath
    @l
    public abstract ConfigurableFileCollection m();

    @Input
    @l
    public abstract Property n();

    @Input
    @l
    public abstract Property o();

    @Input
    @l
    public abstract Property p();

    @Input
    @l
    public abstract Property q();

    private final void r(RegularFile regularFile0) {
        if(!regularFile0.getAsFile().exists()) {
            new JarOutputStream(new BufferedOutputStream(new FileOutputStream(((RegularFile)this.l().get()).getAsFile()))).close();
        }
    }

    @TaskAction
    public final void s(@l InputChanges inputChanges0) {
        static final class io.realm.transformer.i.a extends N implements A3.a {
            final j e;
            final e f;

            io.realm.transformer.i.a(j j0, e e0) {
                this.e = j0;
                this.f = e0;
                super(0);
            }

            @m
            public final S0 b() {
                this.e.k();
                e e0 = this.f;
                if(e0 != null) {
                    e0.c();
                    return S0.a;
                }
                return null;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        h h0;
        e e0;
        L.p(inputChanges0, "inputChanges");
        Set set0 = this.d().getFiles();
        L.o(set0, "bootClasspath.files");
        Object object0 = this.p().get();
        L.o(object0, "usesKotlin.get()");
        Object object1 = this.o().get();
        L.o(object1, "targetType.get()");
        Object object2 = this.n().get();
        L.o(object2, "targetSdk.get()");
        Object object3 = this.i().get();
        L.o(object3, "minSdk.get()");
        Object object4 = this.a().get();
        L.o(object4, "agpVersion.get()");
        Object object5 = this.b().get();
        L.o(object5, "appId.get()");
        Object object6 = this.e().get();
        L.o(object6, "gradleVersion.get()");
        Object object7 = this.q().get();
        L.o(object7, "usesSync.get()");
        Object object8 = this.k().get();
        L.o(object8, "offline.get()");
        c c0 = new c(set0, ((Boolean)object0).booleanValue(), ((String)object1), ((String)object2), ((String)object3), ((String)object4), ((String)object5), ((String)object6), ((Boolean)object7).booleanValue(), ((Boolean)object8).booleanValue());
        try {
            e0 = new e();
            e0.b(c0);
        }
        catch(Exception exception0) {
            this.getLogger().debug("Could not calculate Realm analytics data:\n" + exception0);
            e0 = null;
        }
        j j0 = new j();
        io.realm.transformer.i.a i$a0 = new io.realm.transformer.i.a(j0, e0);
        j0.j("Realm Transform time");
        RegularFile regularFile0 = (RegularFile)this.l().get();
        L.o(regularFile0, "jarFile");
        this.r(regularFile0);
        FileSystem fileSystem0 = FileSystems.newFileSystem(((RegularFile)this.l().get()).getAsFile().toPath(), null);
        L.o(fileSystem0, "output.get().let { jarFi…toPath(), null)\n        }");
        Object object9 = this.c().get();
        L.o(object9, "areIncrementalBuildsDisabled.get()");
        if(((Boolean)object9).booleanValue() || !inputChanges0.isIncremental()) {
            List list0 = (List)this.h().get();
            L.o(list0, "get()");
            h0 = new h(c0, list0, fileSystem0, this.a);
        }
        else {
            Iterable iterable0 = inputChanges0.getFileChanges(((FileCollection)this.a));
            L.o(iterable0, "inputChanges.getFileChanges(inputDirectories)");
            Object object10 = this.h().get();
            L.o(((List)object10), "get()");
            h0 = new io.realm.transformer.build.j(c0, iterable0, ((List)object10), this.a, fileSystem0);
        }
        h0.r();
        j.i(j0, "Prepare output classes", false, 2, null);
        if(h0.p()) {
            i$a0.invoke();
            return;
        }
        h0.s(this.m());
        j.i(j0, "Prepare referenced classes", false, 2, null);
        h0.q();
        j.i(j0, "Mark mediators as transformed", false, 2, null);
        h0.y();
        j.i(j0, "Transform model classes", false, 2, null);
        h0.x();
        j.i(j0, "Transform references to model fields", false, 2, null);
        h0.f();
        j.i(j0, "Copy processed classes", false, 2, null);
        h0.g();
        j.i(j0, "Copy jar files", false, 2, null);
        fileSystem0.close();
        i$a0.invoke();
    }
}

