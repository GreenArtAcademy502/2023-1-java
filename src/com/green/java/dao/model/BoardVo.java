package com.green.java.dao.model;

public class BoardVo {
    private int iboard;
    private String title;
    private String createdAt;
    private String writer;
    private String writerMainPic;

    public BoardVo(int iboard, String title, String createdAt, String writer, String writerMainPic) {
        this.iboard = iboard;
        this.title = title;
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
        return String.format("iboard: %d, title: %s" +
                        ", createdAt: %s, writer: %s, writerMainPic: %s"
                , iboard, title, createdAt, writer, writerMainPic);
    }
}
