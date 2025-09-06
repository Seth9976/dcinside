package androidx.datastore.core;

import A3.a;
import A3.o;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.D;
import kotlin.J;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import y4.l;
import y4.m;

public final class SingleProcessDataStore implements DataStore {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Set a() {
            return SingleProcessDataStore.l;
        }

        @l
        public final Object b() {
            return SingleProcessDataStore.m;
        }
    }

    static abstract class Message {
        public static final class Read extends Message {
            @m
            private final State a;

            public Read(@m State state0) {
                super(null);
                this.a = state0;
            }

            @Override  // androidx.datastore.core.SingleProcessDataStore$Message
            @m
            public State a() {
                return this.a;
            }
        }

        public static final class Update extends Message {
            @l
            private final o a;
            @l
            private final x b;
            @m
            private final State c;
            @l
            private final g d;

            public Update(@l o o0, @l x x0, @m State state0, @l g g0) {
                L.p(o0, "transform");
                L.p(x0, "ack");
                L.p(g0, "callerContext");
                super(null);
                this.a = o0;
                this.b = x0;
                this.c = state0;
                this.d = g0;
            }

            @Override  // androidx.datastore.core.SingleProcessDataStore$Message
            @m
            public State a() {
                return this.c;
            }

            @l
            public final x b() {
                return this.b;
            }

            @l
            public final g c() {
                return this.d;
            }

            @l
            public final o d() {
                return this.a;
            }
        }

        private Message() {
        }

        public Message(w w0) {
        }

        @m
        public abstract State a();
    }

    static final class UncloseableOutputStream extends OutputStream {
        @l
        private final FileOutputStream a;

        public UncloseableOutputStream(@l FileOutputStream fileOutputStream0) {
            L.p(fileOutputStream0, "fileOutputStream");
            super();
            this.a = fileOutputStream0;
        }

        @l
        public final FileOutputStream a() {
            return this.a;
        }

        @Override
        public void close() {
        }

        @Override
        public void flush() {
            this.a.flush();
        }

        @Override
        public void write(int v) {
            this.a.write(v);
        }

        @Override
        public void write(@l byte[] arr_b) {
            L.p(arr_b, "b");
            this.a.write(arr_b);
        }

        @Override
        public void write(@l byte[] arr_b, int v, int v1) {
            L.p(arr_b, "bytes");
            this.a.write(arr_b, v, v1);
        }
    }

    @l
    private final a a;
    @l
    private final Serializer b;
    @l
    private final CorruptionHandler c;
    @l
    private final O d;
    @l
    private final i e;
    @l
    private final String f;
    @l
    private final D g;
    @l
    private final E h;
    @m
    private List i;
    @l
    private final SimpleActor j;
    @l
    public static final Companion k;
    @GuardedBy("activeFilesLock")
    @l
    private static final Set l;
    @l
    private static final Object m;

    static {
        SingleProcessDataStore.k = new Companion(null);
        SingleProcessDataStore.l = new LinkedHashSet();
        SingleProcessDataStore.m = new Object();
    }

    public SingleProcessDataStore(@l a a0, @l Serializer serializer0, @l List list0, @l CorruptionHandler corruptionHandler0, @l O o0) {
        L.p(a0, "produceFile");
        L.p(serializer0, "serializer");
        L.p(list0, "initTasksList");
        L.p(corruptionHandler0, "corruptionHandler");
        L.p(o0, "scope");
        super();
        this.a = a0;
        this.b = serializer0;
        this.c = corruptionHandler0;
        this.d = o0;
        this.e = k.I0(new o(null) {
            int k;
            private Object l;
            final SingleProcessDataStore m;

            {
                this.m = singleProcessDataStore0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.datastore.core.SingleProcessDataStore.data.1(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l j j0, @m d d0) {
                return ((androidx.datastore.core.SingleProcessDataStore.data.1)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        j j0 = (j)this.l;
                        State state0 = (State)this.m.h.getValue();
                        if(!(state0 instanceof Data)) {
                            this.m.j.e(new Read(state0));
                        }
                        androidx.datastore.core.SingleProcessDataStore.data.1.1 singleProcessDataStore$data$1$10 = new o(null) {
                            int k;
                            Object l;
                            final State m;

                            {
                                this.m = state0;
                                super(2, d0);
                            }

                            @m
                            public final Object a(@l State state0, @m d d0) {
                                return ((androidx.datastore.core.SingleProcessDataStore.data.1.1)this.create(state0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.datastore.core.SingleProcessDataStore.data.1.1(this.m, d0);
                                d1.l = object0;
                                return d1;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.a(((State)object0), ((d)object1));
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.k != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                return kotlin.coroutines.jvm.internal.b.a(!(this.m instanceof Data) && !(this.m instanceof Final) && ((State)this.l) == this.m);
                            }
                        };
                        androidx.datastore.core.SingleProcessDataStore.data.1.invokeSuspend..inlined.map.1 singleProcessDataStore$data$1$invokeSuspend$$inlined$map$10 = new i() {
                            @Override  // kotlinx.coroutines.flow.i
                            @m
                            public Object collect(@l j j0, @l d d0) {
                                androidx.datastore.core.SingleProcessDataStore.data.1.invokeSuspend..inlined.map.1.2 singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$20 = new j() {
                                    @Override  // kotlinx.coroutines.flow.j
                                    @m
                                    public Object emit(Object object0, @l d d0) {
                                        androidx.datastore.core.SingleProcessDataStore.data.1.invokeSuspend..inlined.map.1.2.1 singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$10;
                                        if(d0 instanceof androidx.datastore.core.SingleProcessDataStore.data.1.invokeSuspend..inlined.map.1.2.1) {
                                            singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$10 = (androidx.datastore.core.SingleProcessDataStore.data.1.invokeSuspend..inlined.map.1.2.1)d0;
                                            int v = singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$10.l;
                                            if((v & 0x80000000) == 0) {
                                                singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                                    Object k;
                                                    int l;
                                                    Object m;

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @m
                                                    public final Object invokeSuspend(@l Object object0) {
                                                        this.k = object0;
                                                        this.l |= 0x80000000;
                                                        return d0.emit(null, this);
                                                    }
                                                };
                                            }
                                            else {
                                                singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$10.l = v ^ 0x80000000;
                                            }
                                        }
                                        else {
                                            singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                                Object k;
                                                int l;
                                                Object m;

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @m
                                                public final Object invokeSuspend(@l Object object0) {
                                                    this.k = object0;
                                                    this.l |= 0x80000000;
                                                    return d0.emit(null, this);
                                                }
                                            };
                                        }
                                        Object object1 = singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$10.k;
                                        Object object2 = b.l();
                                        switch(singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$10.l) {
                                            case 0: {
                                                f0.n(object1);
                                                j j0 = this.a;
                                                if(((State)object0) instanceof ReadException) {
                                                    throw ((ReadException)(((State)object0))).a();
                                                }
                                                if(((State)object0) instanceof Final) {
                                                    throw ((Final)(((State)object0))).a();
                                                }
                                                if(((State)object0) instanceof Data) {
                                                    Object object3 = ((Data)(((State)object0))).c();
                                                    singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$10.l = 1;
                                                    return j0.emit(object3, singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$10) == object2 ? object2 : S0.a;
                                                }
                                                if(!(((State)object0) instanceof UnInitialized)) {
                                                    throw new J();
                                                }
                                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                            }
                                            case 1: {
                                                f0.n(object1);
                                                return S0.a;
                                            }
                                            default: {
                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                            }
                                        }
                                    }
                                };
                                Object object0 = this.a.collect(singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$20, d0);
                                return object0 == b.l() ? object0 : S0.a;
                            }
                        };
                        this.k = 1;
                        return k.m0(j0, singleProcessDataStore$data$1$invokeSuspend$$inlined$map$10, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        });
        this.f = ".tmp";
        this.g = kotlin.E.a(new a() {
            final SingleProcessDataStore e;

            {
                this.e = singleProcessDataStore0;
                super(0);
            }

            @l
            public final File invoke() {
                File file0 = (File)this.e.a.invoke();
                String s = file0.getAbsolutePath();
                Companion singleProcessDataStore$Companion0 = SingleProcessDataStore.k;
                synchronized(singleProcessDataStore$Companion0.b()) {
                    if(!singleProcessDataStore$Companion0.a().contains(s)) {
                        Set set0 = singleProcessDataStore$Companion0.a();
                        L.o(s, "it");
                        set0.add(s);
                        return file0;
                    }
                }
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file0 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore\'s active on the same file (by confirming that the scope is cancelled).").toString());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        });
        this.h = W.a(UnInitialized.a);
        this.i = u.V5(list0);
        androidx.datastore.core.SingleProcessDataStore.actor.1 singleProcessDataStore$actor$10 = new Function1() {
            final SingleProcessDataStore e;

            {
                this.e = singleProcessDataStore0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                if(throwable0 != null) {
                    this.e.h.setValue(new Final(throwable0));
                }
                synchronized(SingleProcessDataStore.k.b()) {
                    SingleProcessDataStore.k.a().remove(this.e.r().getAbsolutePath());
                }
            }
        };
        androidx.datastore.core.SingleProcessDataStore.actor.3 singleProcessDataStore$actor$30 = new o(null) {
            int k;
            Object l;
            final SingleProcessDataStore m;

            {
                this.m = singleProcessDataStore0;
                super(2, d0);
            }

            @m
            public final Object a(@l Message singleProcessDataStore$Message0, @m d d0) {
                return ((androidx.datastore.core.SingleProcessDataStore.actor.3)this.create(singleProcessDataStore$Message0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.datastore.core.SingleProcessDataStore.actor.3(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Message)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        Message singleProcessDataStore$Message0 = (Message)this.l;
                        if(singleProcessDataStore$Message0 instanceof Read) {
                            this.k = 1;
                            if(this.m.s(((Read)singleProcessDataStore$Message0), this) == object1) {
                                return object1;
                            }
                        }
                        else if(singleProcessDataStore$Message0 instanceof Update) {
                            this.k = 2;
                            if(this.m.t(((Update)singleProcessDataStore$Message0), this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
                    }
                    case 1: 
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        };
        this.j = new SimpleActor(o0, singleProcessDataStore$actor$10, androidx.datastore.core.SingleProcessDataStore.actor.2.e, singleProcessDataStore$actor$30);

        final class androidx.datastore.core.SingleProcessDataStore.actor.2 extends N implements o {
            public static final androidx.datastore.core.SingleProcessDataStore.actor.2 e;

            static {
                androidx.datastore.core.SingleProcessDataStore.actor.2.e = new androidx.datastore.core.SingleProcessDataStore.actor.2();
            }

            androidx.datastore.core.SingleProcessDataStore.actor.2() {
                super(2);
            }

            public final void a(@l Message singleProcessDataStore$Message0, @m Throwable throwable0) {
                L.p(singleProcessDataStore$Message0, "msg");
                if(singleProcessDataStore$Message0 instanceof Update) {
                    x x0 = ((Update)singleProcessDataStore$Message0).b();
                    if(throwable0 == null) {
                        throwable0 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    x0.f(throwable0);
                }
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Message)object0), ((Throwable)object1));
                return S0.a;
            }
        }

    }

    public SingleProcessDataStore(a a0, Serializer serializer0, List list0, CorruptionHandler corruptionHandler0, O o0, int v, w w0) {
        if((v & 4) != 0) {
            list0 = u.H();
        }
        if((v & 8) != 0) {
            corruptionHandler0 = new NoOpCorruptionHandler();
        }
        if((v & 16) != 0) {
            o0 = P.a(h0.c().plus(j1.c(null, 1, null)));
        }
        this(a0, serializer0, list0, corruptionHandler0, o0);
    }

    @m
    public final Object A(Object object0, @l d d0) {
        S0 s00;
        Throwable throwable1;
        Closeable closeable1;
        SingleProcessDataStore singleProcessDataStore0;
        File file1;
        Closeable closeable0;
        File file0;
        androidx.datastore.core.SingleProcessDataStore.writeData.1 singleProcessDataStore$writeData$10;
        if(d0 instanceof androidx.datastore.core.SingleProcessDataStore.writeData.1) {
            singleProcessDataStore$writeData$10 = (androidx.datastore.core.SingleProcessDataStore.writeData.1)d0;
            int v = singleProcessDataStore$writeData$10.r;
            if((v & 0x80000000) == 0) {
                singleProcessDataStore$writeData$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    Object p;
                    int r;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.p = object0;
                        this.r |= 0x80000000;
                        return d0.A(null, this);
                    }
                };
            }
            else {
                singleProcessDataStore$writeData$10.r = v ^ 0x80000000;
            }
        }
        else {
            singleProcessDataStore$writeData$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                Object p;
                int r;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.p = object0;
                    this.r |= 0x80000000;
                    return d0.A(null, this);
                }
            };
        }
        Object object1 = singleProcessDataStore$writeData$10.p;
        Object object2 = b.l();
        switch(singleProcessDataStore$writeData$10.r) {
            case 0: {
                f0.n(object1);
                this.p(this.r());
                file0 = new File(L.C(this.r().getAbsolutePath(), this.f));
                try {
                    closeable0 = new FileOutputStream(file0);
                }
                catch(IOException iOException0) {
                    goto label_58;
                }
                try {
                    UncloseableOutputStream singleProcessDataStore$UncloseableOutputStream0 = new UncloseableOutputStream(((FileOutputStream)closeable0));
                    singleProcessDataStore$writeData$10.k = this;
                    singleProcessDataStore$writeData$10.l = file0;
                    singleProcessDataStore$writeData$10.m = closeable0;
                    singleProcessDataStore$writeData$10.n = null;
                    singleProcessDataStore$writeData$10.o = closeable0;
                    singleProcessDataStore$writeData$10.r = 1;
                    if(this.b.writeTo(object0, singleProcessDataStore$UncloseableOutputStream0, singleProcessDataStore$writeData$10) == object2) {
                        return object2;
                    }
                }
                catch(Throwable throwable0) {
                    file1 = file0;
                    break;
                }
                singleProcessDataStore0 = this;
                file1 = file0;
                closeable1 = closeable0;
                throwable1 = null;
                goto label_44;
            }
            case 1: {
                closeable1 = (FileOutputStream)singleProcessDataStore$writeData$10.o;
                throwable1 = (Throwable)singleProcessDataStore$writeData$10.n;
                closeable0 = (Closeable)singleProcessDataStore$writeData$10.m;
                file1 = (File)singleProcessDataStore$writeData$10.l;
                singleProcessDataStore0 = (SingleProcessDataStore)singleProcessDataStore$writeData$10.k;
                try {
                    f0.n(object1);
                label_44:
                    ((FileOutputStream)closeable1).getFD().sync();
                    s00 = S0.a;
                    goto label_52;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable2) {
            try {
                c.a(closeable0, throwable0);
                throw throwable2;
            label_52:
                c.a(closeable0, throwable1);
                if(!file1.renameTo(singleProcessDataStore0.r())) {
                    throw new IOException("Unable to rename " + file1 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                }
                return s00;
            }
            catch(IOException iOException0) {
            }
        }
        file0 = file1;
    label_58:
        if(file0.exists()) {
            file0.delete();
        }
        throw iOException0;
    }

    @Override  // androidx.datastore.core.DataStore
    @m
    public Object a(@l o o0, @l d d0) {
        x x0 = z.c(null, 1, null);
        Update singleProcessDataStore$Message$Update0 = new Update(o0, x0, ((State)this.h.getValue()), d0.getContext());
        this.j.e(singleProcessDataStore$Message$Update0);
        return x0.o(d0);
    }

    @Override  // androidx.datastore.core.DataStore
    @l
    public i getData() {
        return this.e;
    }

    private final void p(File file0) {
        File file1 = file0.getCanonicalFile().getParentFile();
        if(file1 != null) {
            file1.mkdirs();
            if(!file1.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file0);
            }
        }
    }

    private static void q() {
    }

    private final File r() {
        return (File)this.g.getValue();
    }

    private final Object s(Read singleProcessDataStore$Message$Read0, d d0) {
        State state0 = (State)this.h.getValue();
        if(!(state0 instanceof Data)) {
            if(!(state0 instanceof ReadException)) {
                if(L.g(state0, UnInitialized.a)) {
                    Object object1 = this.w(d0);
                    return object1 == b.l() ? object1 : S0.a;
                }
                if(state0 instanceof Final) {
                    throw new IllegalStateException("Can\'t read in final state.");
                }
            }
            else if(state0 == singleProcessDataStore$Message$Read0.a()) {
                Object object0 = this.w(d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }
        return S0.a;
    }

    private final Object t(Update singleProcessDataStore$Message$Update0, d d0) {
        Object object3;
        x x1;
        SingleProcessDataStore singleProcessDataStore0;
        Object object2;
        x x0;
        androidx.datastore.core.SingleProcessDataStore.handleUpdate.1 singleProcessDataStore$handleUpdate$10;
        if(d0 instanceof androidx.datastore.core.SingleProcessDataStore.handleUpdate.1) {
            singleProcessDataStore$handleUpdate$10 = (androidx.datastore.core.SingleProcessDataStore.handleUpdate.1)d0;
            int v = singleProcessDataStore$handleUpdate$10.p;
            if((v & 0x80000000) == 0) {
                singleProcessDataStore$handleUpdate$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.p |= 0x80000000;
                        return d0.t(null, this);
                    }
                };
            }
            else {
                singleProcessDataStore$handleUpdate$10.p = v ^ 0x80000000;
            }
        }
        else {
            singleProcessDataStore$handleUpdate$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                Object n;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.p |= 0x80000000;
                    return d0.t(null, this);
                }
            };
        }
        Object object0 = singleProcessDataStore$handleUpdate$10.n;
        Object object1 = b.l();
        boolean z = true;
        switch(singleProcessDataStore$handleUpdate$10.p) {
            case 0: {
                f0.n(object0);
                x0 = singleProcessDataStore$Message$Update0.b();
                try {
                    State state0 = (State)this.h.getValue();
                    if(state0 instanceof Data) {
                        singleProcessDataStore$handleUpdate$10.k = x0;
                        singleProcessDataStore$handleUpdate$10.p = 1;
                        object2 = this.z(singleProcessDataStore$Message$Update0.d(), singleProcessDataStore$Message$Update0.c(), singleProcessDataStore$handleUpdate$10);
                        if(object2 == object1) {
                            return object1;
                        }
                    }
                    else {
                        if(!(state0 instanceof ReadException)) {
                            z = state0 instanceof UnInitialized;
                        }
                        if(!z) {
                            if(!(state0 instanceof Final)) {
                                throw new J();
                            }
                            throw ((Final)state0).a();
                        }
                        if(state0 != singleProcessDataStore$Message$Update0.a()) {
                            throw ((ReadException)state0).a();
                        }
                        singleProcessDataStore$handleUpdate$10.k = singleProcessDataStore$Message$Update0;
                        singleProcessDataStore$handleUpdate$10.l = this;
                        singleProcessDataStore$handleUpdate$10.m = x0;
                        singleProcessDataStore$handleUpdate$10.p = 2;
                        if(this.v(singleProcessDataStore$handleUpdate$10) == object1) {
                            return object1;
                        }
                        singleProcessDataStore0 = this;
                        goto label_47;
                    }
                    goto label_54;
                }
                catch(Throwable throwable0) {
                    goto label_58;
                }
            }
            case 1: {
                x1 = (x)singleProcessDataStore$handleUpdate$10.k;
                goto label_62;
            }
            case 2: {
                x1 = (x)singleProcessDataStore$handleUpdate$10.m;
                singleProcessDataStore0 = (SingleProcessDataStore)singleProcessDataStore$handleUpdate$10.l;
                Update singleProcessDataStore$Message$Update1 = (Update)singleProcessDataStore$handleUpdate$10.k;
                try {
                    f0.n(object0);
                    x0 = x1;
                    singleProcessDataStore$Message$Update0 = singleProcessDataStore$Message$Update1;
                }
                catch(Throwable throwable1) {
                    break;
                }
                try {
                label_47:
                    singleProcessDataStore$handleUpdate$10.k = x0;
                    singleProcessDataStore$handleUpdate$10.l = null;
                    singleProcessDataStore$handleUpdate$10.m = null;
                    singleProcessDataStore$handleUpdate$10.p = 3;
                    object2 = singleProcessDataStore0.z(singleProcessDataStore$Message$Update0.d(), singleProcessDataStore$Message$Update0.c(), singleProcessDataStore$handleUpdate$10);
                    if(object2 == object1) {
                        return object1;
                    }
                label_54:
                    object0 = object2;
                    x1 = x0;
                    goto label_63;
                }
                catch(Throwable throwable0) {
                label_58:
                    throwable1 = throwable0;
                    x1 = x0;
                    break;
                }
            }
            case 3: {
                x1 = (x)singleProcessDataStore$handleUpdate$10.k;
                try {
                label_62:
                    f0.n(object0);
                label_63:
                    object3 = object0;
                    goto label_67;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object3 = e0.b(f0.a(throwable1));
    label_67:
        z.d(x1, object3);
        return S0.a;
    }

    private final Object u(d d0) {
        kotlinx.coroutines.sync.a a2;
        h l0$h3;
        Iterator iterator0;
        kotlin.jvm.internal.l0.a l0$a2;
        kotlinx.coroutines.sync.a a1;
        androidx.datastore.core.SingleProcessDataStore.readAndInit.api.1 singleProcessDataStore$readAndInit$api$11;
        h l0$h2;
        SingleProcessDataStore singleProcessDataStore2;
        SingleProcessDataStore singleProcessDataStore1;
        androidx.datastore.core.SingleProcessDataStore.readAndInit.1 singleProcessDataStore$readAndInit$11;
        kotlin.jvm.internal.l0.a l0$a1;
        h l0$h1;
        SingleProcessDataStore singleProcessDataStore0;
        h l0$h0;
        kotlinx.coroutines.sync.a a0;
        androidx.datastore.core.SingleProcessDataStore.readAndInit.1 singleProcessDataStore$readAndInit$10;
        if(d0 instanceof androidx.datastore.core.SingleProcessDataStore.readAndInit.1) {
            singleProcessDataStore$readAndInit$10 = (androidx.datastore.core.SingleProcessDataStore.readAndInit.1)d0;
            int v = singleProcessDataStore$readAndInit$10.s;
            if((v & 0x80000000) == 0) {
                singleProcessDataStore$readAndInit$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    Object p;
                    Object q;
                    int s;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.q = object0;
                        this.s |= 0x80000000;
                        return d0.u(this);
                    }
                };
            }
            else {
                singleProcessDataStore$readAndInit$10.s = v ^ 0x80000000;
            }
        }
        else {
            singleProcessDataStore$readAndInit$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                Object p;
                Object q;
                int s;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.q = object0;
                    this.s |= 0x80000000;
                    return d0.u(this);
                }
            };
        }
        Object object0 = singleProcessDataStore$readAndInit$10.q;
        Object object1 = b.l();
        int v1 = 0;
        switch(singleProcessDataStore$readAndInit$10.s) {
            case 0: {
                f0.n(object0);
                if(!L.g(this.h.getValue(), UnInitialized.a) && !(this.h.getValue() instanceof ReadException)) {
                    throw new IllegalStateException("Check failed.");
                }
                a0 = kotlinx.coroutines.sync.c.b(false, 1, null);
                l0$h0 = new h();
                singleProcessDataStore$readAndInit$10.k = this;
                singleProcessDataStore$readAndInit$10.l = a0;
                singleProcessDataStore$readAndInit$10.m = l0$h0;
                singleProcessDataStore$readAndInit$10.n = l0$h0;
                singleProcessDataStore$readAndInit$10.s = 1;
                object0 = this.y(singleProcessDataStore$readAndInit$10);
                if(object0 == object1) {
                    return object1;
                }
                singleProcessDataStore0 = this;
                l0$h1 = l0$h0;
                goto label_35;
            }
            case 1: {
                l0$h0 = (h)singleProcessDataStore$readAndInit$10.n;
                l0$h1 = (h)singleProcessDataStore$readAndInit$10.m;
                a0 = (kotlinx.coroutines.sync.a)singleProcessDataStore$readAndInit$10.l;
                singleProcessDataStore0 = (SingleProcessDataStore)singleProcessDataStore$readAndInit$10.k;
                f0.n(object0);
            label_35:
                l0$h0.a = object0;
                kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
                androidx.datastore.core.SingleProcessDataStore.readAndInit.api.1 singleProcessDataStore$readAndInit$api$10 = new InitializerApi() {
                    @Override  // androidx.datastore.core.InitializerApi
                    @m
                    public Object a(@l o o0, @l d d0) {
                        Object object4;
                        SingleProcessDataStore singleProcessDataStore2;
                        kotlinx.coroutines.sync.a a3;
                        kotlinx.coroutines.sync.a a2;
                        Object object2;
                        h l0$h1;
                        kotlin.jvm.internal.l0.a l0$a1;
                        SingleProcessDataStore singleProcessDataStore0;
                        kotlinx.coroutines.sync.a a0;
                        androidx.datastore.core.SingleProcessDataStore.readAndInit.api.1.updateData.1 singleProcessDataStore$readAndInit$api$1$updateData$10;
                        if(d0 instanceof androidx.datastore.core.SingleProcessDataStore.readAndInit.api.1.updateData.1) {
                            singleProcessDataStore$readAndInit$api$1$updateData$10 = (androidx.datastore.core.SingleProcessDataStore.readAndInit.api.1.updateData.1)d0;
                            int v = singleProcessDataStore$readAndInit$api$1$updateData$10.r;
                            if((v & 0x80000000) == 0) {
                                singleProcessDataStore$readAndInit$api$1$updateData$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                    Object k;
                                    Object l;
                                    Object m;
                                    Object n;
                                    Object o;
                                    Object p;
                                    int r;

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        this.p = object0;
                                        this.r |= 0x80000000;
                                        return d0.a(null, this);
                                    }
                                };
                            }
                            else {
                                singleProcessDataStore$readAndInit$api$1$updateData$10.r = v ^ 0x80000000;
                            }
                        }
                        else {
                            singleProcessDataStore$readAndInit$api$1$updateData$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                Object k;
                                Object l;
                                Object m;
                                Object n;
                                Object o;
                                Object p;
                                int r;

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    this.p = object0;
                                    this.r |= 0x80000000;
                                    return d0.a(null, this);
                                }
                            };
                        }
                        Object object0 = singleProcessDataStore$readAndInit$api$1$updateData$10.p;
                        Object object1 = b.l();
                        switch(singleProcessDataStore$readAndInit$api$1$updateData$10.r) {
                            case 0: {
                                f0.n(object0);
                                a0 = l0$a0;
                                kotlin.jvm.internal.l0.a l0$a0 = l0$h1;
                                h l0$h0 = singleProcessDataStore0;
                                singleProcessDataStore0 = this.d;
                                singleProcessDataStore$readAndInit$api$1$updateData$10.k = o0;
                                singleProcessDataStore$readAndInit$api$1$updateData$10.l = a0;
                                singleProcessDataStore$readAndInit$api$1$updateData$10.m = l0$a0;
                                singleProcessDataStore$readAndInit$api$1$updateData$10.n = l0$h0;
                                singleProcessDataStore$readAndInit$api$1$updateData$10.o = singleProcessDataStore0;
                                singleProcessDataStore$readAndInit$api$1$updateData$10.r = 1;
                                if(a0.h(null, singleProcessDataStore$readAndInit$api$1$updateData$10) == object1) {
                                    return object1;
                                }
                                l0$a1 = l0$a0;
                                l0$h1 = l0$h0;
                                goto label_38;
                            }
                            case 1: {
                                SingleProcessDataStore singleProcessDataStore1 = (SingleProcessDataStore)singleProcessDataStore$readAndInit$api$1$updateData$10.o;
                                l0$h1 = (h)singleProcessDataStore$readAndInit$api$1$updateData$10.n;
                                l0$a1 = (kotlin.jvm.internal.l0.a)singleProcessDataStore$readAndInit$api$1$updateData$10.m;
                                kotlinx.coroutines.sync.a a1 = (kotlinx.coroutines.sync.a)singleProcessDataStore$readAndInit$api$1$updateData$10.l;
                                o o1 = (o)singleProcessDataStore$readAndInit$api$1$updateData$10.k;
                                f0.n(object0);
                                a0 = a1;
                                singleProcessDataStore0 = singleProcessDataStore1;
                                o0 = o1;
                                try {
                                label_38:
                                    if(l0$a1.a) {
                                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                                    }
                                    singleProcessDataStore$readAndInit$api$1$updateData$10.k = a0;
                                    singleProcessDataStore$readAndInit$api$1$updateData$10.l = l0$h1;
                                    singleProcessDataStore$readAndInit$api$1$updateData$10.m = singleProcessDataStore0;
                                    singleProcessDataStore$readAndInit$api$1$updateData$10.n = null;
                                    singleProcessDataStore$readAndInit$api$1$updateData$10.o = null;
                                    singleProcessDataStore$readAndInit$api$1$updateData$10.r = 2;
                                    object2 = o0.invoke(l0$h1.a, singleProcessDataStore$readAndInit$api$1$updateData$10);
                                }
                                catch(Throwable throwable0) {
                                    a2 = a0;
                                    break;
                                }
                                if(object2 == object1) {
                                    return object1;
                                }
                                a3 = a0;
                                object0 = object2;
                                singleProcessDataStore2 = singleProcessDataStore0;
                                goto label_61;
                            }
                            case 2: {
                                singleProcessDataStore2 = (SingleProcessDataStore)singleProcessDataStore$readAndInit$api$1$updateData$10.m;
                                l0$h1 = (h)singleProcessDataStore$readAndInit$api$1$updateData$10.l;
                                a3 = (kotlinx.coroutines.sync.a)singleProcessDataStore$readAndInit$api$1$updateData$10.k;
                                try {
                                    f0.n(object0);
                                label_61:
                                    if(L.g(object0, l0$h1.a)) {
                                        a2 = a3;
                                    }
                                    else {
                                        singleProcessDataStore$readAndInit$api$1$updateData$10.k = a3;
                                        singleProcessDataStore$readAndInit$api$1$updateData$10.l = l0$h1;
                                        singleProcessDataStore$readAndInit$api$1$updateData$10.m = object0;
                                        singleProcessDataStore$readAndInit$api$1$updateData$10.r = 3;
                                        if(singleProcessDataStore2.A(object0, singleProcessDataStore$readAndInit$api$1$updateData$10) == object1) {
                                            return object1;
                                        }
                                        a2 = a3;
                                        l0$h1.a = object0;
                                    }
                                    object4 = l0$h1.a;
                                    goto label_88;
                                }
                                catch(Throwable throwable0) {
                                    a2 = a3;
                                    break;
                                }
                                return object1;
                            }
                            case 3: {
                                Object object3 = singleProcessDataStore$readAndInit$api$1$updateData$10.m;
                                h l0$h2 = (h)singleProcessDataStore$readAndInit$api$1$updateData$10.l;
                                a2 = (kotlinx.coroutines.sync.a)singleProcessDataStore$readAndInit$api$1$updateData$10.k;
                                try {
                                    f0.n(object0);
                                    l0$h2.a = object3;
                                    l0$h1 = l0$h2;
                                    object4 = l0$h1.a;
                                    goto label_88;
                                }
                                catch(Throwable throwable0) {
                                }
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        a2.i(null);
                        throw throwable0;
                    label_88:
                        a2.i(null);
                        return object4;
                    }
                };
                List list0 = singleProcessDataStore0.i;
                if(list0 == null) {
                    l0$a1 = l0$a0;
                    singleProcessDataStore$readAndInit$11 = singleProcessDataStore$readAndInit$10;
                    singleProcessDataStore1 = singleProcessDataStore0;
                }
                else {
                    singleProcessDataStore2 = singleProcessDataStore0;
                    l0$h2 = l0$h1;
                    singleProcessDataStore$readAndInit$api$11 = singleProcessDataStore$readAndInit$api$10;
                    a1 = a0;
                    l0$a2 = l0$a0;
                    iterator0 = list0.iterator();
                    goto label_58;
                }
                goto label_75;
            }
            case 2: {
                iterator0 = (Iterator)singleProcessDataStore$readAndInit$10.p;
                singleProcessDataStore$readAndInit$api$11 = (androidx.datastore.core.SingleProcessDataStore.readAndInit.api.1)singleProcessDataStore$readAndInit$10.o;
                l0$a2 = (kotlin.jvm.internal.l0.a)singleProcessDataStore$readAndInit$10.n;
                l0$h2 = (h)singleProcessDataStore$readAndInit$10.m;
                a1 = (kotlinx.coroutines.sync.a)singleProcessDataStore$readAndInit$10.l;
                singleProcessDataStore2 = (SingleProcessDataStore)singleProcessDataStore$readAndInit$10.k;
                f0.n(object0);
            label_58:
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    singleProcessDataStore$readAndInit$10.k = singleProcessDataStore2;
                    singleProcessDataStore$readAndInit$10.l = a1;
                    singleProcessDataStore$readAndInit$10.m = l0$h2;
                    singleProcessDataStore$readAndInit$10.n = l0$a2;
                    singleProcessDataStore$readAndInit$10.o = singleProcessDataStore$readAndInit$api$11;
                    singleProcessDataStore$readAndInit$10.p = iterator0;
                    singleProcessDataStore$readAndInit$10.s = 2;
                    if(((o)object2).invoke(singleProcessDataStore$readAndInit$api$11, singleProcessDataStore$readAndInit$10) == object1) {
                        return object1;
                    }
                    if(false) {
                        break;
                    }
                }
                singleProcessDataStore$readAndInit$11 = singleProcessDataStore$readAndInit$10;
                l0$a1 = l0$a2;
                l0$h1 = l0$h2;
                a0 = a1;
                singleProcessDataStore1 = singleProcessDataStore2;
            label_75:
                singleProcessDataStore1.i = null;
                singleProcessDataStore$readAndInit$11.k = singleProcessDataStore1;
                singleProcessDataStore$readAndInit$11.l = l0$h1;
                singleProcessDataStore$readAndInit$11.m = l0$a1;
                singleProcessDataStore$readAndInit$11.n = a0;
                singleProcessDataStore$readAndInit$11.o = null;
                singleProcessDataStore$readAndInit$11.p = null;
                singleProcessDataStore$readAndInit$11.s = 3;
                if(a0.h(null, singleProcessDataStore$readAndInit$11) == object1) {
                    return object1;
                }
                l0$h3 = l0$h1;
                a2 = a0;
                break;
            }
            case 3: {
                a2 = (kotlinx.coroutines.sync.a)singleProcessDataStore$readAndInit$10.n;
                l0$a1 = (kotlin.jvm.internal.l0.a)singleProcessDataStore$readAndInit$10.m;
                l0$h3 = (h)singleProcessDataStore$readAndInit$10.l;
                singleProcessDataStore1 = (SingleProcessDataStore)singleProcessDataStore$readAndInit$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        l0$a1.a = true;
        S0 s00 = S0.a;
        a2.i(null);
        E e0 = singleProcessDataStore1.h;
        Object object3 = l0$h3.a;
        if(object3 != null) {
            v1 = object3.hashCode();
        }
        e0.setValue(new Data(object3, v1));
        return s00;
    }

    private final Object v(d d0) {
        SingleProcessDataStore singleProcessDataStore0;
        androidx.datastore.core.SingleProcessDataStore.readAndInitOrPropagateAndThrowFailure.1 singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10;
        if(d0 instanceof androidx.datastore.core.SingleProcessDataStore.readAndInitOrPropagateAndThrowFailure.1) {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10 = (androidx.datastore.core.SingleProcessDataStore.readAndInitOrPropagateAndThrowFailure.1)d0;
            int v = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10.n;
            if((v & 0x80000000) == 0) {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.v(this);
                    }
                };
            }
            else {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10.n = v ^ 0x80000000;
            }
        }
        else {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return d0.v(this);
                }
            };
        }
        Object object0 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10.l;
        Object object1 = b.l();
        switch(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10.n) {
            case 0: {
                f0.n(object0);
                try {
                    singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10.k = this;
                    singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10.n = 1;
                    if(this.u(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    singleProcessDataStore0 = this;
                    goto label_27;
                }
                return S0.a;
            }
            case 1: {
                singleProcessDataStore0 = (SingleProcessDataStore)singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$10.k;
                try {
                    f0.n(object0);
                    return S0.a;
                }
                catch(Throwable throwable0) {
                }
            label_27:
                ReadException readException0 = new ReadException(throwable0);
                singleProcessDataStore0.h.setValue(readException0);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final Object w(d d0) {
        SingleProcessDataStore singleProcessDataStore0;
        androidx.datastore.core.SingleProcessDataStore.readAndInitOrPropagateFailure.1 singleProcessDataStore$readAndInitOrPropagateFailure$10;
        if(d0 instanceof androidx.datastore.core.SingleProcessDataStore.readAndInitOrPropagateFailure.1) {
            singleProcessDataStore$readAndInitOrPropagateFailure$10 = (androidx.datastore.core.SingleProcessDataStore.readAndInitOrPropagateFailure.1)d0;
            int v = singleProcessDataStore$readAndInitOrPropagateFailure$10.n;
            if((v & 0x80000000) == 0) {
                singleProcessDataStore$readAndInitOrPropagateFailure$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.w(this);
                    }
                };
            }
            else {
                singleProcessDataStore$readAndInitOrPropagateFailure$10.n = v ^ 0x80000000;
            }
        }
        else {
            singleProcessDataStore$readAndInitOrPropagateFailure$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return d0.w(this);
                }
            };
        }
        Object object0 = singleProcessDataStore$readAndInitOrPropagateFailure$10.l;
        Object object1 = b.l();
        switch(singleProcessDataStore$readAndInitOrPropagateFailure$10.n) {
            case 0: {
                f0.n(object0);
                try {
                    singleProcessDataStore$readAndInitOrPropagateFailure$10.k = this;
                    singleProcessDataStore$readAndInitOrPropagateFailure$10.n = 1;
                    return this.u(singleProcessDataStore$readAndInitOrPropagateFailure$10) == object1 ? object1 : S0.a;
                }
                catch(Throwable throwable0) {
                    singleProcessDataStore0 = this;
                }
            label_25:
                ReadException readException0 = new ReadException(throwable0);
                singleProcessDataStore0.h.setValue(readException0);
                return S0.a;
            }
            case 1: {
                singleProcessDataStore0 = (SingleProcessDataStore)singleProcessDataStore$readAndInitOrPropagateFailure$10.k;
                try {
                    f0.n(object0);
                    return S0.a;
                }
                catch(Throwable throwable0) {
                    goto label_25;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final Object x(d d0) {
        Throwable throwable1;
        SingleProcessDataStore singleProcessDataStore0;
        Closeable closeable0;
        androidx.datastore.core.SingleProcessDataStore.readData.1 singleProcessDataStore$readData$10;
        if(d0 instanceof androidx.datastore.core.SingleProcessDataStore.readData.1) {
            singleProcessDataStore$readData$10 = (androidx.datastore.core.SingleProcessDataStore.readData.1)d0;
            int v = singleProcessDataStore$readData$10.p;
            if((v & 0x80000000) == 0) {
                singleProcessDataStore$readData$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.p |= 0x80000000;
                        return d0.x(this);
                    }
                };
            }
            else {
                singleProcessDataStore$readData$10.p = v ^ 0x80000000;
            }
        }
        else {
            singleProcessDataStore$readData$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                Object n;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.p |= 0x80000000;
                    return d0.x(this);
                }
            };
        }
        Object object0 = singleProcessDataStore$readData$10.n;
        Object object1 = b.l();
        switch(singleProcessDataStore$readData$10.p) {
            case 0: {
                f0.n(object0);
                try {
                    closeable0 = new FileInputStream(this.r());
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    singleProcessDataStore0 = this;
                    break;
                }
                try {
                    singleProcessDataStore$readData$10.k = this;
                    singleProcessDataStore$readData$10.l = closeable0;
                    singleProcessDataStore$readData$10.m = null;
                    singleProcessDataStore$readData$10.p = 1;
                    object0 = this.b.readFrom(((InputStream)closeable0), singleProcessDataStore$readData$10);
                }
                catch(Throwable throwable0) {
                    singleProcessDataStore0 = this;
                    throw throwable0;
                }
                if(object0 == object1) {
                    return object1;
                }
                singleProcessDataStore0 = this;
                throwable1 = null;
                goto label_43;
            }
            case 1: {
                throwable1 = (Throwable)singleProcessDataStore$readData$10.m;
                closeable0 = (Closeable)singleProcessDataStore$readData$10.l;
                singleProcessDataStore0 = (SingleProcessDataStore)singleProcessDataStore$readData$10.k;
                try {
                    f0.n(object0);
                    goto label_43;
                }
                catch(Throwable throwable0) {
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable2) {
                    try {
                        c.a(closeable0, throwable0);
                        throw throwable2;
                    label_43:
                        c.a(closeable0, throwable1);
                        return object0;
                    }
                    catch(FileNotFoundException fileNotFoundException0) {
                        break;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(singleProcessDataStore0.r().exists()) {
            throw fileNotFoundException0;
        }
        return singleProcessDataStore0.b.getDefaultValue();
    }

    private final Object y(d d0) {
        CorruptionException corruptionException2;
        SingleProcessDataStore singleProcessDataStore1;
        CorruptionException corruptionException1;
        SingleProcessDataStore singleProcessDataStore0;
        androidx.datastore.core.SingleProcessDataStore.readDataOrHandleCorruption.1 singleProcessDataStore$readDataOrHandleCorruption$10;
        if(d0 instanceof androidx.datastore.core.SingleProcessDataStore.readDataOrHandleCorruption.1) {
            singleProcessDataStore$readDataOrHandleCorruption$10 = (androidx.datastore.core.SingleProcessDataStore.readDataOrHandleCorruption.1)d0;
            int v = singleProcessDataStore$readDataOrHandleCorruption$10.o;
            if((v & 0x80000000) == 0) {
                singleProcessDataStore$readDataOrHandleCorruption$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.y(this);
                    }
                };
            }
            else {
                singleProcessDataStore$readDataOrHandleCorruption$10.o = v ^ 0x80000000;
            }
        }
        else {
            singleProcessDataStore$readDataOrHandleCorruption$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.o |= 0x80000000;
                    return d0.y(this);
                }
            };
        }
        Object object0 = singleProcessDataStore$readDataOrHandleCorruption$10.m;
        Object object1 = b.l();
        switch(singleProcessDataStore$readDataOrHandleCorruption$10.o) {
            case 0: {
                f0.n(object0);
                try {
                    singleProcessDataStore$readDataOrHandleCorruption$10.k = this;
                    singleProcessDataStore$readDataOrHandleCorruption$10.o = 1;
                    object0 = this.x(singleProcessDataStore$readDataOrHandleCorruption$10);
                    return object0 == object1 ? object1 : object0;
                }
                catch(CorruptionException corruptionException0) {
                    singleProcessDataStore0 = this;
                    goto label_25;
                }
            }
            case 1: {
                singleProcessDataStore0 = (SingleProcessDataStore)singleProcessDataStore$readDataOrHandleCorruption$10.k;
                try {
                    f0.n(object0);
                    return object0;
                }
                catch(CorruptionException corruptionException0) {
                }
            label_25:
                singleProcessDataStore$readDataOrHandleCorruption$10.k = singleProcessDataStore0;
                singleProcessDataStore$readDataOrHandleCorruption$10.l = corruptionException0;
                singleProcessDataStore$readDataOrHandleCorruption$10.o = 2;
                Object object2 = singleProcessDataStore0.c.a(corruptionException0, singleProcessDataStore$readDataOrHandleCorruption$10);
                if(object2 == object1) {
                    return object1;
                }
                corruptionException1 = corruptionException0;
                object0 = object2;
                singleProcessDataStore1 = singleProcessDataStore0;
                singleProcessDataStore$readDataOrHandleCorruption$10.k = corruptionException1;
                singleProcessDataStore$readDataOrHandleCorruption$10.l = object0;
                singleProcessDataStore$readDataOrHandleCorruption$10.o = 3;
                return singleProcessDataStore1.A(object0, singleProcessDataStore$readDataOrHandleCorruption$10) == object1 ? object1 : object0;
            }
            case 2: {
                corruptionException1 = (CorruptionException)singleProcessDataStore$readDataOrHandleCorruption$10.l;
                singleProcessDataStore1 = (SingleProcessDataStore)singleProcessDataStore$readDataOrHandleCorruption$10.k;
                f0.n(object0);
                try {
                    singleProcessDataStore$readDataOrHandleCorruption$10.k = corruptionException1;
                    singleProcessDataStore$readDataOrHandleCorruption$10.l = object0;
                    singleProcessDataStore$readDataOrHandleCorruption$10.o = 3;
                    return singleProcessDataStore1.A(object0, singleProcessDataStore$readDataOrHandleCorruption$10) == object1 ? object1 : object0;
                }
                catch(IOException iOException0) {
                    corruptionException2 = corruptionException1;
                }
                kotlin.o.a(corruptionException2, iOException0);
                throw corruptionException2;
            }
            case 3: {
                Object object3 = singleProcessDataStore$readDataOrHandleCorruption$10.l;
                corruptionException2 = (CorruptionException)singleProcessDataStore$readDataOrHandleCorruption$10.k;
                try {
                    f0.n(object0);
                    return object3;
                }
                catch(IOException iOException0) {
                    kotlin.o.a(corruptionException2, iOException0);
                    throw corruptionException2;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final Object z(o o0, g g0, d d0) {
        SingleProcessDataStore singleProcessDataStore0;
        Object object4;
        Data data1;
        androidx.datastore.core.SingleProcessDataStore.transformAndWrite.1 singleProcessDataStore$transformAndWrite$10;
        if(d0 instanceof androidx.datastore.core.SingleProcessDataStore.transformAndWrite.1) {
            singleProcessDataStore$transformAndWrite$10 = (androidx.datastore.core.SingleProcessDataStore.transformAndWrite.1)d0;
            int v = singleProcessDataStore$transformAndWrite$10.p;
            if((v & 0x80000000) == 0) {
                singleProcessDataStore$transformAndWrite$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.p |= 0x80000000;
                        return d0.z(null, null, this);
                    }
                };
            }
            else {
                singleProcessDataStore$transformAndWrite$10.p = v ^ 0x80000000;
            }
        }
        else {
            singleProcessDataStore$transformAndWrite$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                Object n;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.p |= 0x80000000;
                    return d0.z(null, null, this);
                }
            };
        }
        Object object0 = singleProcessDataStore$transformAndWrite$10.n;
        Object object1 = b.l();
        switch(singleProcessDataStore$transformAndWrite$10.p) {
            case 0: {
                f0.n(object0);
                Data data0 = (Data)this.h.getValue();
                data0.a();
                Object object2 = data0.c();
                androidx.datastore.core.SingleProcessDataStore.transformAndWrite.newData.1 singleProcessDataStore$transformAndWrite$newData$10 = new o(object2, null) {
                    int k;
                    final o l;
                    final Object m;

                    {
                        this.l = o0;
                        this.m = object0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new androidx.datastore.core.SingleProcessDataStore.transformAndWrite.newData.1(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((androidx.datastore.core.SingleProcessDataStore.transformAndWrite.newData.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.k = 1;
                                object0 = this.l.invoke(this.m, this);
                                return object0 == object1 ? object1 : object0;
                            }
                            case 1: {
                                f0.n(object0);
                                return object0;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                singleProcessDataStore$transformAndWrite$10.k = this;
                singleProcessDataStore$transformAndWrite$10.l = data0;
                singleProcessDataStore$transformAndWrite$10.m = object2;
                singleProcessDataStore$transformAndWrite$10.p = 1;
                Object object3 = kotlinx.coroutines.i.h(g0, singleProcessDataStore$transformAndWrite$newData$10, singleProcessDataStore$transformAndWrite$10);
                if(object3 == object1) {
                    return object1;
                }
                data1 = data0;
                object0 = object3;
                object4 = object2;
                singleProcessDataStore0 = this;
                goto label_34;
            }
            case 1: {
                object4 = singleProcessDataStore$transformAndWrite$10.m;
                data1 = (Data)singleProcessDataStore$transformAndWrite$10.l;
                singleProcessDataStore0 = (SingleProcessDataStore)singleProcessDataStore$transformAndWrite$10.k;
                f0.n(object0);
            label_34:
                data1.a();
                if(!L.g(object4, object0)) {
                    singleProcessDataStore$transformAndWrite$10.k = singleProcessDataStore0;
                    singleProcessDataStore$transformAndWrite$10.l = object0;
                    singleProcessDataStore$transformAndWrite$10.m = null;
                    singleProcessDataStore$transformAndWrite$10.p = 2;
                    if(singleProcessDataStore0.A(object0, singleProcessDataStore$transformAndWrite$10) == object1) {
                        return object1;
                    }
                    singleProcessDataStore0.h.setValue(new Data(object0, (object0 == null ? 0 : object0.hashCode())));
                    return object0;
                }
                break;
            }
            case 2: {
                object4 = singleProcessDataStore$transformAndWrite$10.l;
                SingleProcessDataStore singleProcessDataStore1 = (SingleProcessDataStore)singleProcessDataStore$transformAndWrite$10.k;
                f0.n(object0);
                singleProcessDataStore1.h.setValue(new Data(object4, (object4 == null ? 0 : object4.hashCode())));
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object4;
    }
}

