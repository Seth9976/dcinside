package io.realm.transformer;

import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javassist.e;
import javassist.g;
import kotlin.io.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.sequences.p;
import org.gradle.api.file.ConfigurableFileCollection;
import y4.l;

public final class b extends g implements Closeable {
    @l
    private final ArrayList m;

    public b(@l ConfigurableFileCollection configurableFileCollection0, @l ConfigurableFileCollection configurableFileCollection1) {
        final class a extends H implements Function1 {
            public static final a a;

            static {
                a.a = new a();
            }

            a() {
                super(1, File.class, "isDirectory", "isDirectory()Z", 0);
            }

            @l
            public final Boolean invoke(@l File file0) {
                L.p(file0, "p0");
                return Boolean.valueOf(file0.isDirectory());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((File)object0));
            }
        }

        L.p(configurableFileCollection0, "inputs");
        L.p(configurableFileCollection1, "referencedInputs");
        super();
        this.m = new ArrayList();
        this.e();
        for(Object object0: ((Iterable)configurableFileCollection0)) {
            for(Object object1: p.p0(m.N(((File)object0), null, 1, null), a.a)) {
                e e0 = this.a(((File)object1).getAbsolutePath());
                this.m.add(e0);
            }
        }
        for(Object object2: ((Iterable)configurableFileCollection1)) {
            e e1 = this.a(((File)object2).getAbsolutePath());
            this.m.add(e1);
        }
    }

    @Override
    public void close() {
        Iterator iterator0 = this.m.iterator();
        L.o(iterator0, "pathElements.iterator()");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            this.N1(((e)object0));
            iterator0.remove();
        }
    }
}

