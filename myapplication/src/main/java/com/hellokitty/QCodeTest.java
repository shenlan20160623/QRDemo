package com.hellokitty;

import java.awt.image.BufferedImage;   
import java.io.File;   
import java.io.IOException;   
import java.util.Hashtable;   
  
import javax.imageio.ImageIO;   
  
import com.google.zxing.BarcodeFormat;   
import com.google.zxing.BinaryBitmap;   
import com.google.zxing.DecodeHintType;   
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;   
import com.google.zxing.MultiFormatReader;   
import com.google.zxing.MultiFormatWriter;   
import com.google.zxing.Reader;   
import com.google.zxing.ReaderException;   
import com.google.zxing.Result;   
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;   
import com.google.zxing.common.ByteMatrix;
import com.google.zxing.common.HybridBinarizer;  

public class QCodeTest {
	private static final int BLACK = 0xff000000;   
    private static final int WHITE = 0xFFFFFFFF;   
    
    /**  
     * @param args  
     */  
//    public static void main(String[] args)   
//    {   
//    	QCodeTest test = new QCodeTest();   
//           
//        //编码    
//        test.encode();   
//           
//        //解码   
//        test.decode();   
//    }   
  
       
    /**  
     * 编码  
     * 在编码时需要将com.google.zxing.qrcode.encoder.Encoder.java中的 static final String  
     * DEFAULT_BYTE_MODE_ENCODING = "ISO8859-1";修改为UTF-8，否则中文编译后解析不了  
     */  
    public void encode(String str,String path)   
    {   
        try  
        {   
        	Hashtable hints= new Hashtable(); 
     	    hints.put(EncodeHintType.CHARACTER_SET, "UTF-8"); 
            ByteMatrix byteMatrix;   
            byteMatrix = new MultiFormatWriter().encode(str,   
                    BarcodeFormat.QR_CODE, 200, 200,hints);   
            File file = new File(path);   
            writeToFile(byteMatrix, "png", file);   
        }   
        catch (Exception e)   
        {   
            e.printStackTrace();   
        }   
    }   
  
    public static void writeToFile(ByteMatrix matrix, String format, File file)   
            throws IOException   
    {   
        BufferedImage image = toBufferedImage(matrix);   
        ImageIO.write(image, format, file);   
    }   
  
    public static BufferedImage toBufferedImage(ByteMatrix matrix)   
    {   
        int width = matrix.getWidth();   
        int height = matrix.getHeight();   
        BufferedImage image = new BufferedImage(width, height,   
                BufferedImage.TYPE_INT_ARGB);   
        for (int x = 0; x < width; x++)   
        {   
            for (int y = 0; y < height; y++)   
            {   
                image.setRGB(x, y, matrix.get(x, y) == 0 ? BLACK : WHITE);   
            }   
        }   
        return image;   
    }   
  
    /**  
     * 解码 各类型条码  
     */  
    public String decode(String imgPath)   
    {   
        try  
        {   
            //String imgPath = "E:\\test.png";   
            File file = new File(imgPath);   
            BufferedImage image;   
            try  
            {   
                image = ImageIO.read(file);   
                if (image == null)   
                {   
                    System.out.println("Could not decode image");   
                }   
                LuminanceSource source = new BufferedImageLuminanceSource(image);   
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(   
                        source));   
                   
                Result result;   
                   
                // 解码设置编码方式为：utf-8，
            	Hashtable hints= new Hashtable(); 
         	   	hints.put(EncodeHintType.CHARACTER_SET, "UTF-8"); 
                result = new MultiFormatReader().decode(bitmap,hints);   
                String resultStr = result.getText();   
                System.out.println("解析后内容：" + resultStr);   
                return resultStr;
            }   
            catch (IOException ioe)   
            {   
                System.out.println(ioe.toString());   
            }   
            catch (ReaderException re)   
            {   
                System.out.println(re.toString());   
            }   
  
        }   
        catch (Exception ex)   
        {   
            System.out.println(ex.toString());   
        }
        return null;
    }   
  

}
