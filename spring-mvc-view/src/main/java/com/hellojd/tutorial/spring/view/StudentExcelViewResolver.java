package com.hellojd.tutorial.spring.view;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

public class StudentExcelViewResolver implements ViewResolver {

   @Override
   public View resolveViewName(String viewName, Locale locale) throws Exception {
      StudentExcelView excelView = new StudentExcelView();
      return excelView;
   }
}