package com.squad.squad_be.dto;

public class Traits {
    private Integer extraversion;
    private Integer agreeableness;
    private Integer conscientiousness;
    private Integer neuroticism;
    private Integer openness;

    public Traits() {
    }

    public Traits(Integer extraversion, Integer agreeableness, Integer conscientiousness, Integer neuroticism, Integer openness) {
        this.extraversion = extraversion;
        this.agreeableness = agreeableness;
        this.conscientiousness = conscientiousness;
        this.neuroticism = neuroticism;
        this.openness = openness;
    }

    public Integer getExtraversion() {
        return extraversion;
    }

    public void setExtraversion(Integer extraversion) {
        this.extraversion = extraversion;
    }

    public Integer getAgreeableness() {
        return agreeableness;
    }

    public void setAgreeableness(Integer agreeableness) {
        this.agreeableness = agreeableness;
    }

    public Integer getConscientiousness() {
        return conscientiousness;
    }

    public void setConscientiousness(Integer conscientiousness) {
        this.conscientiousness = conscientiousness;
    }

    public Integer getNeuroticism() {
        return neuroticism;
    }

    public void setNeuroticism(Integer neuroticism) {
        this.neuroticism = neuroticism;
    }

    public Integer getOpenness() {
        return openness;
    }

    public void setOpenness(Integer openness) {
        this.openness = openness;
    }

    @Override
    public String toString() {
        return "Traits{" +
                "extraversion=" + extraversion +
                ", agreeableness=" + agreeableness +
                ", conscientiousness=" + conscientiousness +
                ", neuroticism=" + neuroticism +
                ", openness=" + openness +
                '}';
    }
}
