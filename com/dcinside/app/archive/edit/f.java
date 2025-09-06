package com.dcinside.app.archive.edit;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class f implements CompoundButton.OnCheckedChangeListener {
    public final ArchiveEditActivity a;

    public f(ArchiveEditActivity archiveEditActivity0) {
        this.a = archiveEditActivity0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        ArchiveEditActivity.a2(this.a, compoundButton0, z);
    }
}

