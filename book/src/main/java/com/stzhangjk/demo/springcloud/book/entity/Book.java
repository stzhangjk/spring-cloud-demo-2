package com.stzhangjk.demo.springcloud.book.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Book {

    private Integer id;

    private String name;

    private String author;
}
