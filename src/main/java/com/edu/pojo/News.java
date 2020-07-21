package com.edu.pojo;

public class News {
    private Integer newid;
    private String title;
    private String author;
    private String source;
    private String content;
    private String time;

    public News(Integer newid,String title,String author,String source,String content, String time){
        this.newid=newid;
        this.title=title;
        this.author=author;
        this.source=source;
        this.content=content;
        this.time=time;
    }

    public Integer getNewid() {
        return newid;
    }

    public void setNewid(Integer newid) {
        this.newid = newid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "News{" +
                "newid=" + newid +
                ", title='" + title + '\'' +
                ", author=" + author + '\'' +
                ", source='" + source + '\'' +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
