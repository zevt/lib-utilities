package com.zeroexception.jsoupdemo.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author Viet Quoc Tran
 * on 3/24/18.
 * www.zeroexception.com
 */

@RestController
@RequestMapping("/jsoup")
public class JsoupController {


    @PostMapping("/get-body")
    public String getBody(@RequestBody String url) throws IOException {
        url = url.trim();
        Document doc = Jsoup.connect(url).get();



        return "";
    }

}
