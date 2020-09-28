package com.my.readxml.demo.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

/**
 * @author sunlonglong
 * 23:16
 * 境由心生,事在人为
 */
public class MainXml {
    public static void main(String[] args) throws Exception {

        // dom4j最好的读取方式
        File f= new File("D:\\programe\\alltechnology\\my-readxml\\src\\main\\resources\\myxml.xml");
        if(!f.exists()){
            System.out.println("配置文件不存在");
            return;
        }

        SAXReader reader = new SAXReader();

        Document doc = reader.read(f);

        Element rootElement = doc.getRootElement();

        Element foo;

        for(Iterator i = rootElement.elementIterator("BOOK"); i.hasNext();){

            foo = (Element)i.next();
            System.out.println("NAME的值："+foo.elementText("NAME"));
            System.out.println("PRICE的值："+foo.elementText("PRICE"));
            System.out.println("NUM的值："+foo.elementText("NUM"));
        }
    }
}
