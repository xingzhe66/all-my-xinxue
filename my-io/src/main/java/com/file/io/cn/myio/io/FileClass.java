package com.file.io.cn.myio.io;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class FileClass {

    private final static String S_PATH = "E:"+ File.separator +"file" + File.separator +"1.jpg";
    private final static String T_PATH = "E:"+ File.separator +"file" + File.separator +"2.jpg";
//    public static void main(String[] args) throws Exception {
//
//        // 字节输入流：inPutStream(抽象类)->FileInPutStream(实现类）
//        // 字节输出流：outPutSteam(抽象类)->FileOutPutStream(实现类)
//
//        // 字符输入流：Reader(抽象类)->FileReader(实现类）
//        // 字符输出流：Writer(抽象类)->FileWriter(实现类）
//
//        // 输入转换流： InputStreamReader(将字节输入流（inPutSteam)转换为字符输入流（Reader））意义不大，不建议时使用
//        // 输出转换流： OutPutStreamWriter(将字节输出流(outPutStream)转为字符输出流（Writer)) 意义不大，不建议时使用
//
//
//        // 实现图片的边读边写
//
//        File SFile = new File(S_PATH);
//        File TFile = new File(T_PATH);
//        if(!SFile.getParentFile().exists()){
//            SFile.mkdirs();
//        }
//        if(!TFile.getParentFile().exists()){
//            TFile.mkdirs();
//        }
//        byte b [] = new byte[1024];
//        FileInputStream in = new FileInputStream(SFile);
//
//        FileOutputStream out = new FileOutputStream(TFile);
//
//        // 边读边写
//        while(in.read(b)!=-1){
//            out.write(b);
//        }
//
//        in.close();
//        out.close();
//
//        System.out.println("=========文件读写结束============");
//
//
//    }

    public static void main(String[] args) {

        File file = new File("C:\\Users\\sun\\Desktop\\1742903296.pdf");
        File file2 = new File("C:\\Users\\sun\\Desktop\\123.png");

        try {
            PDDocument doc = PDDocument.load(file);
            PDFRenderer renderer = new PDFRenderer(doc);
            int pageCount = doc.getNumberOfPages();
            for (int i = 0; i < pageCount; i++) {
                BufferedImage image = renderer.renderImageWithDPI(i, 296);
                ImageIO.write(image, "PNG", file2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

}
