package com.ncu.ActivityUtil;

/**
 * 访问者模式，将部门作为被访问的资源，活动作为访问者
 *
 */
public class Activity {
    private ActivityStrategy strategy;
    private String name;
    private String intro;
    public ActivityStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ActivityStrategy strategy) {
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getParticipant() {
        strategy.getParticipant();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
