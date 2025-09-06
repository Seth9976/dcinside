package com.google.android.material.sidesheet;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;

public final class j implements AccessibilityViewCommand {
    public final SideSheetBehavior a;
    public final int b;

    public j(SideSheetBehavior sideSheetBehavior0, int v) {
        this.a = sideSheetBehavior0;
        this.b = v;
    }

    @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean a(View view0, CommandArguments accessibilityViewCommand$CommandArguments0) {
        return this.a.K0(this.b, view0, accessibilityViewCommand$CommandArguments0);
    }
}

