package com.unity3d.ads.core.domain;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class CommonValidateGameId implements ValidateGameId {
    @l
    private final GetGameId getGameId;
    @l
    private final SetGameId setGameId;

    public CommonValidateGameId(@l GetGameId getGameId0, @l SetGameId setGameId0) {
        L.p(getGameId0, "getGameId");
        L.p(setGameId0, "setGameId");
        super();
        this.getGameId = getGameId0;
        this.setGameId = setGameId0;
    }

    @Override  // com.unity3d.ads.core.domain.ValidateGameId
    public boolean invoke(@m String s) {
        if(this.getGameId.invoke() != null) {
            return true;
        }
        if(s == null) {
            return false;
        }
        this.setGameId.invoke(s);
        return true;
    }
}

