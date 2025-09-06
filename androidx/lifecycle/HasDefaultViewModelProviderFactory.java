package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import y4.l;

public interface HasDefaultViewModelProviderFactory {
    @l
    CreationExtras getDefaultViewModelCreationExtras();

    @l
    Factory getDefaultViewModelProviderFactory();
}

