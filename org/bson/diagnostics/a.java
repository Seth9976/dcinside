package org.bson.diagnostics;

import java.util.logging.Level;
import java.util.logging.Logger;

class a implements b {
    private final Logger a;

    a(String s) {
        this.a = Logger.getLogger(s);
    }

    @Override  // org.bson.diagnostics.b
    public void a(String s) {
        this.q(Level.SEVERE, s);
    }

    @Override  // org.bson.diagnostics.b
    public boolean b() {
        return this.a.isLoggable(Level.INFO);
    }

    @Override  // org.bson.diagnostics.b
    public void c(String s, Throwable throwable0) {
        this.r(Level.INFO, s, throwable0);
    }

    @Override  // org.bson.diagnostics.b
    public void d(String s, Throwable throwable0) {
        this.r(Level.WARNING, s, throwable0);
    }

    @Override  // org.bson.diagnostics.b
    public void e(String s, Throwable throwable0) {
        this.r(Level.FINER, s, throwable0);
    }

    @Override  // org.bson.diagnostics.b
    public void f(String s, Throwable throwable0) {
        this.r(Level.SEVERE, s, throwable0);
    }

    @Override  // org.bson.diagnostics.b
    public boolean g() {
        return this.a.isLoggable(Level.SEVERE);
    }

    @Override  // org.bson.diagnostics.b
    public String getName() {
        return this.a.getName();
    }

    @Override  // org.bson.diagnostics.b
    public void h(String s, Throwable throwable0) {
        this.r(Level.FINE, s, throwable0);
    }

    @Override  // org.bson.diagnostics.b
    public void i(String s) {
        this.q(Level.INFO, s);
    }

    @Override  // org.bson.diagnostics.b
    public void j(String s) {
        this.q(Level.FINER, s);
    }

    @Override  // org.bson.diagnostics.b
    public boolean k() {
        return this.a.isLoggable(Level.WARNING);
    }

    @Override  // org.bson.diagnostics.b
    public boolean l() {
        return this.p(Level.FINE);
    }

    @Override  // org.bson.diagnostics.b
    public boolean m() {
        return this.p(Level.FINER);
    }

    @Override  // org.bson.diagnostics.b
    public void n(String s) {
        this.q(Level.FINE, s);
    }

    @Override  // org.bson.diagnostics.b
    public void o(String s) {
        this.q(Level.WARNING, s);
    }

    private boolean p(Level level0) {
        return this.a.isLoggable(level0);
    }

    private void q(Level level0, String s) {
        this.a.log(level0, s);
    }

    public void r(Level level0, String s, Throwable throwable0) {
        this.a.log(level0, s, throwable0);
    }
}

