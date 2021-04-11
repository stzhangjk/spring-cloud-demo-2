package com.stzhangjk.demo.springcloud.book.controller;

import com.stzhangjk.demo.springcloud.book.entity.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

@RestController
@RequestMapping("/book")
public class BookController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/list")
    public Object list() throws UnknownHostException {
        //实际项目不要这样写，有内部类
        return new ArrayList<Book>() {{
            add(new Book().setId(1)
                    .setName("第一本书")
                    .setAuthor("小A"));
            add(new Book().setId(2)
                    .setName("第二本书")
                    .setAuthor("小B"));
            add(new Book().setId(port)
                    .setName(InetAddress.getLocalHost().getHostAddress()));
        }};
    }

}
