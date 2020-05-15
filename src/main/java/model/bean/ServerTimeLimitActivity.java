package model.bean;

import Base.OtherBaseEntity;

/**
 * 活动日志
 */
public class ServerTimeLimitActivity extends OtherBaseEntity {
    public Long curValue;
    public Long targetValue;
    public Long rewardId;
    public Integer rewardNum;
    public Integer activityType;

}
