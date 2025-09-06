package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.j;
import z3.n;

@s0({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
public class ViewModelProvider {
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        public static final class Companion {
            static final class ApplicationKeyImpl implements Key {
                @l
                public static final ApplicationKeyImpl a;

                static {
                    ApplicationKeyImpl.a = new ApplicationKeyImpl();
                }
            }

            private Companion() {
            }

            public Companion(w w0) {
            }

            @l
            public final Factory a(@l ViewModelStoreOwner viewModelStoreOwner0) {
                L.p(viewModelStoreOwner0, "owner");
                return viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelProviderFactory() : NewInstanceFactory.b.a();
            }

            @l
            @n
            public final AndroidViewModelFactory b(@l Application application0) {
                L.p(application0, "application");
                if(AndroidViewModelFactory.h == null) {
                    AndroidViewModelFactory.h = new AndroidViewModelFactory(application0);
                }
                AndroidViewModelFactory viewModelProvider$AndroidViewModelFactory0 = AndroidViewModelFactory.h;
                L.m(viewModelProvider$AndroidViewModelFactory0);
                return viewModelProvider$AndroidViewModelFactory0;
            }
        }

        @m
        private final Application e;
        @l
        public static final Companion f = null;
        @l
        public static final String g = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        @m
        private static AndroidViewModelFactory h;
        @l
        @f
        public static final Key i;

        static {
            AndroidViewModelFactory.f = new Companion(null);
            AndroidViewModelFactory.i = ApplicationKeyImpl.a;
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        public AndroidViewModelFactory(@l Application application0) {
            L.p(application0, "application");
            this(application0, 0);
        }

        private AndroidViewModelFactory(Application application0, int v) {
            this.e = application0;
        }

        @Override  // androidx.lifecycle.ViewModelProvider$NewInstanceFactory
        @l
        public ViewModel a(@l Class class0, @l CreationExtras creationExtras0) {
            L.p(class0, "modelClass");
            L.p(creationExtras0, "extras");
            if(this.e != null) {
                return this.b(class0);
            }
            Application application0 = (Application)creationExtras0.a(AndroidViewModelFactory.i);
            if(application0 != null) {
                return this.h(class0, application0);
            }
            if(AndroidViewModel.class.isAssignableFrom(class0)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.b(class0);
        }

        @Override  // androidx.lifecycle.ViewModelProvider$NewInstanceFactory
        @l
        public ViewModel b(@l Class class0) {
            L.p(class0, "modelClass");
            Application application0 = this.e;
            if(application0 == null) {
                throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            }
            return this.h(class0, application0);
        }

        private final ViewModel h(Class class0, Application application0) {
            ViewModel viewModel0;
            if(AndroidViewModel.class.isAssignableFrom(class0)) {
                try {
                    viewModel0 = (ViewModel)class0.getConstructor(Application.class).newInstance(application0);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, noSuchMethodException0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, illegalAccessException0);
                }
                catch(InstantiationException instantiationException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, instantiationException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, invocationTargetException0);
                }
                L.o(viewModel0, "{\n                try {\n…          }\n            }");
                return viewModel0;
            }
            return super.b(class0);
        }

        @l
        @n
        public static final AndroidViewModelFactory i(@l Application application0) {
            return AndroidViewModelFactory.f.b(application0);
        }
    }

    public interface Factory {
        public static final class androidx.lifecycle.ViewModelProvider.Factory.Companion {
            static final androidx.lifecycle.ViewModelProvider.Factory.Companion a;

            static {
                androidx.lifecycle.ViewModelProvider.Factory.Companion.a = new androidx.lifecycle.ViewModelProvider.Factory.Companion();
            }

            @l
            @n
            public final Factory a(@l ViewModelInitializer[] arr_viewModelInitializer) {
                L.p(arr_viewModelInitializer, "initializers");
                return new InitializerViewModelFactory(((ViewModelInitializer[])Arrays.copyOf(arr_viewModelInitializer, arr_viewModelInitializer.length)));
            }
        }

        @l
        public static final androidx.lifecycle.ViewModelProvider.Factory.Companion a;

        static {
            Factory.a = androidx.lifecycle.ViewModelProvider.Factory.Companion.a;
        }

        @l
        ViewModel a(@l Class arg1, @l CreationExtras arg2);

        @l
        ViewModel b(@l Class arg1);
    }

    public static class NewInstanceFactory implements Factory {
        public static final class androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion {
            static final class ViewModelKeyImpl implements Key {
                @l
                public static final ViewModelKeyImpl a;

                static {
                    ViewModelKeyImpl.a = new ViewModelKeyImpl();
                }
            }

            private androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion() {
            }

            public androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion(w w0) {
            }

            @RestrictTo({Scope.b})
            @l
            public final NewInstanceFactory a() {
                if(NewInstanceFactory.c == null) {
                    NewInstanceFactory.c = new NewInstanceFactory();
                }
                NewInstanceFactory viewModelProvider$NewInstanceFactory0 = NewInstanceFactory.c;
                L.m(viewModelProvider$NewInstanceFactory0);
                return viewModelProvider$NewInstanceFactory0;
            }

            @n
            public static void b() {
            }
        }

        @l
        public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion b;
        @m
        private static NewInstanceFactory c;
        @l
        @f
        public static final Key d;

        static {
            NewInstanceFactory.b = new androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion(null);
            NewInstanceFactory.d = ViewModelKeyImpl.a;
        }

        @Override  // androidx.lifecycle.ViewModelProvider$Factory
        public ViewModel a(Class class0, CreationExtras creationExtras0) {
            return k.b(this, class0, creationExtras0);
        }

        @Override  // androidx.lifecycle.ViewModelProvider$Factory
        @l
        public ViewModel b(@l Class class0) {
            L.p(class0, "modelClass");
            try {
                Object object0 = class0.getDeclaredConstructor(null).newInstance(null);
                L.o(object0, "{\n                modelC…wInstance()\n            }");
                return (ViewModel)object0;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new RuntimeException("Cannot create an instance of " + class0, noSuchMethodException0);
            }
            catch(InstantiationException instantiationException0) {
                throw new RuntimeException("Cannot create an instance of " + class0, instantiationException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException("Cannot create an instance of " + class0, illegalAccessException0);
            }
        }

        @RestrictTo({Scope.b})
        @l
        public static final NewInstanceFactory e() {
            return NewInstanceFactory.b.a();
        }
    }

    @RestrictTo({Scope.b})
    public static class OnRequeryFactory {
        public void c(@l ViewModel viewModel0) {
            L.p(viewModel0, "viewModel");
        }
    }

    @l
    private final ViewModelStore a;
    @l
    private final Factory b;
    @l
    private final CreationExtras c;

    @j
    public ViewModelProvider(@l ViewModelStore viewModelStore0, @l Factory viewModelProvider$Factory0) {
        L.p(viewModelStore0, "store");
        L.p(viewModelProvider$Factory0, "factory");
        this(viewModelStore0, viewModelProvider$Factory0, null, 4, null);
    }

    @j
    public ViewModelProvider(@l ViewModelStore viewModelStore0, @l Factory viewModelProvider$Factory0, @l CreationExtras creationExtras0) {
        L.p(viewModelStore0, "store");
        L.p(viewModelProvider$Factory0, "factory");
        L.p(creationExtras0, "defaultCreationExtras");
        super();
        this.a = viewModelStore0;
        this.b = viewModelProvider$Factory0;
        this.c = creationExtras0;
    }

    public ViewModelProvider(ViewModelStore viewModelStore0, Factory viewModelProvider$Factory0, CreationExtras creationExtras0, int v, w w0) {
        if((v & 4) != 0) {
            creationExtras0 = Empty.b;
        }
        this(viewModelStore0, viewModelProvider$Factory0, creationExtras0);
    }

    public ViewModelProvider(@l ViewModelStoreOwner viewModelStoreOwner0) {
        L.p(viewModelStoreOwner0, "owner");
        this(viewModelStoreOwner0.getViewModelStore(), AndroidViewModelFactory.f.a(viewModelStoreOwner0), ViewModelProviderGetKt.a(viewModelStoreOwner0));
    }

    public ViewModelProvider(@l ViewModelStoreOwner viewModelStoreOwner0, @l Factory viewModelProvider$Factory0) {
        L.p(viewModelStoreOwner0, "owner");
        L.p(viewModelProvider$Factory0, "factory");
        this(viewModelStoreOwner0.getViewModelStore(), viewModelProvider$Factory0, ViewModelProviderGetKt.a(viewModelStoreOwner0));
    }

    @MainThread
    @l
    public ViewModel a(@l Class class0) {
        L.p(class0, "modelClass");
        String s = class0.getCanonicalName();
        if(s == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + s, class0);
    }

    @MainThread
    @l
    public ViewModel b(@l String s, @l Class class0) {
        ViewModel viewModel1;
        L.p(s, "key");
        L.p(class0, "modelClass");
        ViewModel viewModel0 = this.a.b(s);
        if(class0.isInstance(viewModel0)) {
            OnRequeryFactory viewModelProvider$OnRequeryFactory0 = this.b instanceof OnRequeryFactory ? ((OnRequeryFactory)this.b) : null;
            if(viewModelProvider$OnRequeryFactory0 != null) {
                L.m(viewModel0);
                viewModelProvider$OnRequeryFactory0.c(viewModel0);
            }
            L.n(viewModel0, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return viewModel0;
        }
        MutableCreationExtras mutableCreationExtras0 = new MutableCreationExtras(this.c);
        mutableCreationExtras0.c(NewInstanceFactory.d, s);
        try {
            viewModel1 = this.b.a(class0, mutableCreationExtras0);
        }
        catch(AbstractMethodError unused_ex) {
            viewModel1 = this.b.b(class0);
        }
        this.a.d(s, viewModel1);
        return viewModel1;
    }
}

