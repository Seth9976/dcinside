package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;

public final class e implements AccessibilityViewCommand {
    public final BottomSheetDragHandleView a;

    public e(BottomSheetDragHandleView bottomSheetDragHandleView0) {
        this.a = bottomSheetDragHandleView0;
    }

    @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean a(View view0, CommandArguments accessibilityViewCommand$CommandArguments0) {
        return this.a.j(view0, accessibilityViewCommand$CommandArguments0);
    }
}

