package io.realm.gradle;

import org.gradle.api.tasks.Input;

public class d {
    private boolean a;
    private boolean b;

    @Input
    public boolean a() {
        return this.b;
    }

    @Input
    public boolean b() {
        return this.a;
    }

    public void c(boolean z) {
        this.b = z;
    }

    public void d(boolean z) {
        this.a = z;
    }
}

