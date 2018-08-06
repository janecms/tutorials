package com.hellojd.tutorial.spring.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import com.hellojd.tutorial.spring.model.Student;
import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Content;
import com.rometools.rome.feed.rss.Item;

public class StudentRssFeedView extends AbstractRssFeedView {

   @Override
   protected void buildFeedMetadata(Map<String, Object> model, Channel feed, HttpServletRequest req) {
      feed.setTitle("BORAJI.COM");
      feed.setLink("https://www.boraji.com/");
      feed.setDescription("This feed has been created using ROME.");
   }

   @Override
   protected List<Item> buildFeedItems(Map<String, Object> model, HttpServletRequest request,
         HttpServletResponse response) throws Exception {
      Student student = (Student) model.get("student");

      List<Item> items = new ArrayList<>();
      Item item = new Item();
      item.setTitle("BORAJI.COM");
      item.setLink("https://www.boraji.com/");
      item.setPubDate(new Date());
      Content content = new Content();
      content.setType("text/html");
      content.setValue("<table>" + 
            "<tr><th>ID</th><td>" + student.getId() + "</td></tr>" + 
            "<tr><th>NAME</th><td>" + student.getName() + "</td></tr>" + 
            "<tr><th>DOB</th><td>" + student.getDob() + "</td></tr>"+ 
            "<tr><th>EMAIL</th><td>" + student.getEmail() + "</td></tr>" + 
            "</table>");

      item.setContent(content);
      items.add(item);
      return items;
   }
}