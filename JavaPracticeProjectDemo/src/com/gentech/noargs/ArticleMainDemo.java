package com.gentech.noargs;

class Article {
    int articleId;
    String articleTitle;
    String articleContent;
    int articleAuthorId;
    String articleCreateAt;

    Article() {
        articleId = 34;
        articleTitle = "The Environment";
        articleContent = "The Fate of Earth by Elizabeth Kolbert State of the Species by Charles The Real Reason Humans are the Dominant Species by Justin Rowlatt and Laurence Knight";
        articleAuthorId = 23;
        articleCreateAt = "12-12-2024";
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
    Comments() {
        commentId = 12;
        commentText = "The environment article is too good and many people gets motivates by the representation of the topic thanks to the author";
        commentArticleId = 34;
        commentAuthorName = "Bagath";
        commentCreateAt = "13-12-2024";
        System.out.println("Comment Id:"+commentId);
        System.out.println("Comment Text:"+commentText);
        System.out.println("Comment ArticleId:"+commentArticleId);
        System.out.println("Comment Author Name:"+commentAuthorName);
        System.out.println("Comment CreatedAt:"+commentCreateAt);
    }
}

public class ArticleMainDemo {
    public static void main(String[] args) {
        Article article = new Article();

        Comments comments = new Comments();

    }
}
