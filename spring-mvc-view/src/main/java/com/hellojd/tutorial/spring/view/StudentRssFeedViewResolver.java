package com.hellojd.tutorial.spring.view;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

public class StudentRssFeedViewResolver implements ViewResolver {

   @Override
   public View resolveViewName(String viewName, Locale locale) throws Exception {
      StudentRssFeedView view = new StudentRssFeedView();
      return view;
   }
}