package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;

public final class b implements FragmentOnAttachListener {
    public final DialogFragmentNavigator a;

    public b(DialogFragmentNavigator dialogFragmentNavigator0) {
        this.a = dialogFragmentNavigator0;
    }

    @Override  // androidx.fragment.app.FragmentOnAttachListener
    public final void a(FragmentManager fragmentManager0, Fragment fragment0) {
        DialogFragmentNavigator.q(this.a, fragmentManager0, fragment0);
    }
}

