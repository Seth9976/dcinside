package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class FilterWord {
    private String PjT;
    private boolean ReZ;
    private String Zh;
    private List cr;

    public FilterWord() {
    }

    public FilterWord(String s, String s1) {
        this.PjT = s;
        this.Zh = s1;
    }

    public void addOption(FilterWord filterWord0) {
        if(filterWord0 == null) {
            return;
        }
        if(this.cr == null) {
            this.cr = new ArrayList();
        }
        this.cr.add(filterWord0);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof FilterWord && ((FilterWord)object0).getId().equals(this.getId()) && ((FilterWord)object0).getName().equals(this.getName());
    }

    public String getId() {
        return this.PjT;
    }

    public boolean getIsSelected() {
        return this.ReZ;
    }

    public String getName() {
        return this.Zh;
    }

    public List getOptions() {
        return this.cr;
    }

    public boolean hasSecondOptions() {
        return this.cr != null && !this.cr.isEmpty();
    }

    // 去混淆评级： 低(20)
    public boolean isValid() {
        return !TextUtils.isEmpty(this.PjT) && !TextUtils.isEmpty(this.Zh);
    }

    public void setId(String s) {
        this.PjT = s;
    }

    public void setIsSelected(boolean z) {
        this.ReZ = z;
    }

    public void setName(String s) {
        this.Zh = s;
    }
}

