/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generatepdf;

/**
 *
 * @author Erwin
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.util.Date;

public class CreatePdf {

    /**
     *
     */
    public void create() {

        Document document;
        document = new Document(PageSize.getRectangle(Window.getSizePdf()));

        try {
            Date date = new Date();
  
            PdfWriter.getInstance(document,
                    new FileOutputStream(date.getYear()+1900+"-"+date.getMonth()+"-"+ date.getDay()+"-"+ Window.getjTextField1().getText() + Window.getjTextField2().getText() + ".pdf"));

            document.open();

            document.add(new Paragraph("Imie:" + Window.getjTextField1().getText()));
            document.add(new Paragraph("Nazwisko:" + Window.getjTextField2().getText()));
            document.add(new Paragraph("Plec:" + Window.getjComboBox1().getSelectedItem()));
            document.add(new Paragraph("Adres:" + Window.getjTextField4().getText()));
            document.add(new Paragraph("Miasto:" + Window.getjTextField5().getText()));
            document.add(new Paragraph("Telefon:" + Window.getjTextField6().getText()));
        } catch (DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }

        document.close();
    }
}