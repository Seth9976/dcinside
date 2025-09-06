package com.unity3d.ads.core.data.model;

import y4.l;
import y4.m;

public final class TokenCounters {
    private int seq;
    private int starts;
    private int wins;

    public TokenCounters(int v, int v1, int v2) {
        this.seq = v;
        this.wins = v1;
        this.starts = v2;
    }

    public final int component1() {
        return this.seq;
    }

    public final int component2() {
        return this.wins;
    }

    public final int component3() {
        return this.starts;
    }

    @l
    public final TokenCounters copy(int v, int v1, int v2) {
        return new TokenCounters(v, v1, v2);
    }

    public static TokenCounters copy$default(TokenCounters tokenCounters0, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = tokenCounters0.seq;
        }
        if((v3 & 2) != 0) {
            v1 = tokenCounters0.wins;
        }
        if((v3 & 4) != 0) {
            v2 = tokenCounters0.starts;
        }
        return tokenCounters0.copy(v, v1, v2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TokenCounters)) {
            return false;
        }
        if(this.seq != ((TokenCounters)object0).seq) {
            return false;
        }
        return this.wins == ((TokenCounters)object0).wins ? this.starts == ((TokenCounters)object0).starts : false;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final int getStarts() {
        return this.starts;
    }

    public final int getWins() {
        return this.wins;
    }

    @Override
    public int hashCode() {
        return (this.seq * 0x1F + this.wins) * 0x1F + this.starts;
    }

    public final void setSeq(int v) {
        this.seq = v;
    }

    public final void setStarts(int v) {
        this.starts = v;
    }

    public final void setWins(int v) {
        this.wins = v;
    }

    @Override
    @l
    public String toString() {
        return "TokenCounters(seq=" + this.seq + ", wins=" + this.wins + ", starts=" + this.starts + ')';
    }
}

