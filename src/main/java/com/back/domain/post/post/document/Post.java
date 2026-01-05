package com.back.domain.post.post.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.OffsetDateTime;

import static org.springframework.data.elasticsearch.annotations.DateFormat.date_time;
import static org.springframework.data.elasticsearch.annotations.FieldType.*;

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
}
