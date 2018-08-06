package com.hellojd.tutorial.spring.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.hellojd.tutorial.spring.model.Student;
import com.lowagie.text.Document;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class StudentPdfView extends AbstractPdfView {

   @Override
   protected void buildPdfDocument(Map<String, Object> model, Document doc, 
         PdfWriter writer, HttpServletRequest req,
         HttpServletResponse res) throws Exception {

      Student student = (Student) model.get("student");

      //column widths
      float[] columnWidths = { 1.5f, 2f};
      PdfPTable table = new PdfPTable(columnWidths);
      table.setWidthPercentage(90f);
      
      //Table header
      PdfPCell cell = null;
      cell = new PdfPCell(new Phrase("ID"));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase(Integer.toString(student.getId())));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase("NAME"));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase(student.getName()));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase("DOB"));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase(student.getDob().toString()));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase("EMAIL"));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase(student.getEmail()));
      table.addCell(cell);
      
      doc.add(table);
   }

}