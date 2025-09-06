package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class InitializationException extends Exception {
    @l
    private final Configuration config;
    @l
    private final ErrorState errorState;
    @l
    private final Exception originalException;

    public InitializationException(@l ErrorState errorState0, @l Exception exception0, @l Configuration configuration0) {
        L.p(errorState0, "errorState");
        L.p(exception0, "originalException");
        L.p(configuration0, "config");
        super(exception0);
        this.errorState = errorState0;
        this.originalException = exception0;
        this.config = configuration0;
    }

    @l
    public final ErrorState component1() {
        return this.errorState;
    }

    @l
    public final Exception component2() {
        return this.originalException;
    }

    @l
    public final Configuration component3() {
        return this.config;
    }

    @l
    public final InitializationException copy(@l ErrorState errorState0, @l Exception exception0, @l Configuration configuration0) {
        L.p(errorState0, "errorState");
        L.p(exception0, "originalException");
        L.p(configuration0, "config");
        return new InitializationException(errorState0, exception0, configuration0);
    }

    public static InitializationException copy$default(InitializationException initializationException0, ErrorState errorState0, Exception exception0, Configuration configuration0, int v, Object object0) {
        if((v & 1) != 0) {
            errorState0 = initializationException0.errorState;
        }
        if((v & 2) != 0) {
            exception0 = initializationException0.originalException;
        }
        if((v & 4) != 0) {
            configuration0 = initializationException0.config;
        }
        return initializationException0.copy(errorState0, exception0, configuration0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof InitializationException)) {
            return false;
        }
        if(this.errorState != ((InitializationException)object0).errorState) {
            return false;
        }
        return L.g(this.originalException, ((InitializationException)object0).originalException) ? L.g(this.config, ((InitializationException)object0).config) : false;
    }

    @l
    public final Configuration getConfig() {
        return this.config;
    }

    @l
    public final ErrorState getErrorState() {
        return this.errorState;
    }

    @l
    public final Exception getOriginalException() {
        return this.originalException;
    }

    @Override
    public int hashCode() {
        return (this.errorState.hashCode() * 0x1F + this.originalException.hashCode()) * 0x1F + this.config.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "InitializationException(errorState=" + this.errorState + ", originalException=" + this.originalException + ", config=" + this.config + ')';
    }
}

