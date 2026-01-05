package com.back.domain.post.post.document;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.OffsetDateTime;

import static org.springframework.data.elasticsearch.annotations.DateFormat.date_time;
import static org.springframework.data.elasticsearch.annotations.FieldType.*;

@Getter
@Document(indexName = "posts")
public class Post {
    @Id
    private String id;
    @Field(type = Text)
    private String title;
    @Field(type = Text)
    private String content;
    @Field(type = Keyword)
    private String author;
    @Field(
            type = Date,
            format = date_time
    )
    private OffsetDateTime createdAt;
    @Field(
            type = Date,
            format = date_time
    )
    private OffsetDateTime lastModifiedAt;

    public Post(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = OffsetDateTime.now();
        this.lastModifiedAt = OffsetDateTime.now();
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", createdAt=" + createdAt +
                ", lastModifiedAt=" + lastModifiedAt +
                '}';
    }
}
