package net.huahuaxia.spring.entity;

/**
 * Created by lizhe on 2016/10/27.
 */
public class Message {

    private final long id;
    private final String content;

    public Message(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
