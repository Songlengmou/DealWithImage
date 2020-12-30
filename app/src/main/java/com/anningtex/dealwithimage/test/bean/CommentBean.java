package com.anningtex.dealwithimage.test.bean;

/**
 * @author Administrator
 */
public class CommentBean {
    private String commentName;
    private String commentTime;
    private String commentContent;
    private float score;

    public CommentBean() {
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public CommentBean(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}
