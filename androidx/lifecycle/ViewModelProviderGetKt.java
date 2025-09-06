package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@i(name = "ViewModelProviderGetKt")
public final class ViewModelProviderGetKt {
    @l
    public static final CreationExtras a(@l ViewModelStoreOwner viewModelStoreOwner0) {
        L.p(viewModelStoreOwner0, "owner");
        return viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.b;
    }

    @MainThread
    public static final ViewModel b(ViewModelProvider viewModelProvider0) {
        L.p(viewModelProvider0, "<this>");
        L.y(4, "VM");
        return viewModelProvider0.a(ViewModel.class);
    }
}

