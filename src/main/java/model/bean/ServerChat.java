package model.bean;


import Base.OtherBaseEntity;

/**
 * <p>
 * 聊天日志
 * </p>
 *
 * @author twg
 * @since 2020-03-26
 */
public class ServerChat extends OtherBaseEntity {


    public String targetId;
    public Integer chatType;
    public String chatContent;

}
