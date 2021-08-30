package com.example;

import java.io.*;
import com.itextpdf.html2pdf.*;

public class HTMLtoPDFConverter {

    public static void main() throws IOException {
        // IO
        File htmlSource = new File("input.html");
        File pdfDest = new File("output.pdf");
        // pdfHTML specific code
        ConverterProperties converterProperties = new ConverterProperties();
        HtmlConverter.convertToPdf(new FileInputStream(htmlSource),
                new FileOutputStream(pdfDest), converterProperties);
    }

}
