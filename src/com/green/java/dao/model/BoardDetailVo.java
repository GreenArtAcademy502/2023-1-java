package com.green.java.dao.model;

public class BoardDetailVo {
    private int iboard;
    private String title;
    private String ctnt;
    private String createdAt;
    private String writer;
    private String writerMainPic;

    public BoardDetailVo(int iboard, String title, String ctnt
            , String createdAt, String writer, String writerMainPic) {
        this.iboard = iboard;
        this.title = title;
        this.ctnt = ctnt;
        this.createdAt = createdAt;
        this.writer = writer;
        this.writerMainPic = writerMainPic;
    }

    public int getIboard() {
        return iboard;
    }

    public String getTitle() {
        return title;
    }

    public String getCtnt() {
        return ctnt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getWriter() {
        return writer;
    }

    public String getWriterMainPic() {
        return writerMainPic;
    }

    @Override
    public String toString() {
        return String.format("iboard: %d, title: %s, ctnt: %s" +
                ", createdAt: %s, writer: %s, writerMainPic: %s"
                , iboard, title, ctnt, createdAt, writer, writerMainPic);
    }
}
