package com.gentech.parameters;

class Article {
    int articleId;
    String articleTitle;
    String articleContent;
    int articleAuthorId;
    String articleCreateAt;

    Article(int articleId, String articleTitle, String articleContent, int articleAuthorId, String articleCreateAt) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleAuthorId = articleAuthorId;
        this.articleCreateAt = articleCreateAt;
        System.out.println("Article Id:"+articleId);
        System.out.println("Article Title:"+articleTitle);
        System.out.println("Article Content:"+articleContent);
        System.out.println("Article AuthorId:"+articleAuthorId);
        System.out.println("Article CreatedAt:"+articleCreateAt);
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}

class Comments {
    int commentId;
    String commentText;
    int commentArticleId;
    String commentAuthorName;
    String commentCreateAt;

    Comments(int commentId, String commentText, int commentArticleId, String commentAuthorName, String commentCreateAt) {
        this.commentId = commentId;
        this.commentText = commentText;
        this.commentArticleId = commentArticleId;
        this.commentAuthorName = commentAuthorName;
        this.commentCreateAt = commentCreateAt;
        System.out.println("Comment Id:"+commentId);
        System.out.println("Comment Text:"+commentText);
        System.out.println("Comment ArticleId:"+commentArticleId);
        System.out.println("Comment Author Name:"+commentAuthorName);
        System.out.println("Comment CreatedAt:"+commentCreateAt);
    }
}

public class ArticleMainDemo {
    public static void main(String[] args) {
        Article article = new Article(34, "The Environment", "The Fate of Earth by Elizabeth Kolbert State of the Species by Charles The Real Reason Humans are the Dominant Species by Justin Rowlatt and Laurence Knight", 23, "12-12-2024");

        Comments comments = new Comments(12, "The environment article is too good and many people gets motivates by the representation of the topic thanks to the author", 34, "Bagath", "13-12-2024");

    }
}
