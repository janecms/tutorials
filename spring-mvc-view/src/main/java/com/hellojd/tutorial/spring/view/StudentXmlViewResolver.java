package com.hellojd.tutorial.spring.view;

import java.util.Locale;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.xml.MarshallingView;
import com.hellojd.tutorial.spring.model.Student;

public class StudentXmlViewResolver implements ViewResolver {

   @Override
   public View resolveViewName(String viewName, Locale locale) throws Exception {

      Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
      marshaller.setClassesToBeBound(Student.class);
      
      MarshallingView view = new MarshallingView();
      view.setMarshaller(marshaller);
      view.setModelKey("student");
      return view;
   }
}