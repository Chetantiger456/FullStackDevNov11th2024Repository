package com.gentech.defaultconstructor;

class Article {
    int articleId;
    String articleTitle;
    String articleContent;
    int articleAuthorId;
    String articleCreateAt;
}

class Comments {
    int commentId;
    String commentText;
    int commentArticleId;
    String commentAuthorName;
    String commentCreateAt;
}

public class ArticleMainDemo {
    public static void main(String[] args) {
        Article article = new Article();
        article.articleId = 34;
        article.articleTitle = "The Environment";
        article.articleContent = "The Fate of Earth by Elizabeth Kolbert State of the Species by Charles The Real Reason Humans are the Dominant Species by Justin Rowlatt and Laurence Knight";
        article.articleAuthorId = 23;
        article.articleCreateAt = "12-12-2024";
        System.out.println("Article Id:"+article.articleId);
        System.out.println("Article Title:"+article.articleTitle);
        System.out.println("Article Content:"+article.articleContent);
        System.out.println("Article AuthorId:"+article.articleAuthorId);
        System.out.println("Article CreatedAt:"+article.articleCreateAt);
        System.out.println("++++++++++++++++++++++++++++++++++");

        Comments comments = new Comments();
        comments.commentId = 12;
        comments.commentText = "The environment article is too good and many people gets motivates by the representation of the topic thanks to the author";
        comments.commentArticleId = 34;
        comments.commentAuthorName = "Bagath";
        comments.commentCreateAt = "13-12-2024";
        System.out.println("Comment Id:"+comments.commentId);
        System.out.println("Comment Text:"+comments.commentText);
        System.out.println("Comment ArticleId:"+comments.commentArticleId);
        System.out.println("Comment Author Name:"+comments.commentAuthorName);
        System.out.println("Comment CreatedAt:"+comments.commentCreateAt);
    }
}
