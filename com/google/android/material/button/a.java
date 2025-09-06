package com.google.android.material.button;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.e;
import com.google.android.material.R.attr;

@RequiresApi(29)
@RestrictTo({Scope.a})
public final class a implements InspectionCompanion {
    private boolean a;
    private int b;

    public a() {
        this.a = false;
    }

    public void a(@NonNull MaterialButton materialButton0, @NonNull PropertyReader propertyReader0) {
        if(!this.a) {
            throw e.a();
        }
        propertyReader0.readInt(this.b, materialButton0.getIconPadding());
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper0) {
        this.b = propertyMapper0.mapInt("iconPadding", attr.iconPadding);
        this.a = true;
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void readProperties(@NonNull Object object0, @NonNull PropertyReader propertyReader0) {
        this.a(((MaterialButton)object0), propertyReader0);
    }
}

