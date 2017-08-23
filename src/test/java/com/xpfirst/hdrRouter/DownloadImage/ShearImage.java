package com.xpfirst.hdrRouter.DownloadImage;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/8/21 上午9:24
 **/
public class ShearImage {
    private static final Logger log = LoggerFactory.getLogger(ShearImage.class);

    String rootPath = "/Users/xuexin/Documents/GitHub/MNIST/imageToMNIST/";
    @Test
    public void shearImage(){

        String path = rootPath + "xuexinImage"; // 路径
        File f = new File(path);
        printFile(null,f);

    }


    public void printFile(String folder, File file) {

        if (file.isFile()) {
            System.out.println("您给定的是一个文件"); // 判断给定目录是否是一个合法的目录，如果不是，输出提示
        } else {
            File[] fileLists = file.listFiles(); // 如果是目录，获取该目录下的内容集合

            for (int i = 0; i < fileLists.length; i++) { // 循环遍历这个集合内容
                File tmpFile = fileLists[i];
                //输出元素名称
                // 获取文件名
                String fileName = tmpFile.getName();
                System.out.println("fileName="+fileName);
                //判断元素是不是一个目录
                if (tmpFile.isDirectory()) {
                    //如果是目录，继续调用本方法来输出其子目录
                    printFile(fileName,tmpFile);
                }else{
                    // 如果是文件
                    if (fileName.equals(".DS_Store")){
                        continue;
                    }
                    fileName = fileName.replace("jpg","png");
                    if (folder != null){
                        String tmp0 = folder;
                        String tmp1 = folder;
                        if (folder.length() == 2){
                            // 二位数字
                            tmp0 = folder.substring(0,1);
                            tmp1 = folder.substring(1,2);
                        }
                        // 中处理两个数字的图片
                        String imagePath = tmpFile.getPath();

                        String outhPath1 = rootPath + "training-images/"+tmp0+"/"+tmp0+fileName;
                        String outhPath2 = rootPath + "training-images/"+tmp1+"/"+tmp1+fileName;
                        File sf=new File(outhPath1);
                        if(!sf.exists()){
                            sf.mkdirs();
                        }
                        sf=new File(outhPath2);
                        if(!sf.exists()){
                            sf.mkdirs();
                        }
                        // 切二张图片
                        try {
                            // 剪切图片1
                            cutImage(imagePath,
                                    outhPath1,
                                    17,
                                    22,
                                    60,
                                    90);

                            // 剪切图片2
                            cutImage(imagePath,
                                    outhPath2,
                                    91,
                                    22,
                                    60,
                                    90);


                        } catch (IOException e) {
                            e.printStackTrace();
                            log.info("错误");
                        }
                    }

                }
            }
        }
    }
    /**
     * 剪切图片,没有处理图片后缀名是否正确,还有gif动态图片
     * @param sourcePath 源路径(包含图片)
     * @param targetPath 目标路径 null则默认为源路径
     * @param x 起点x坐标
     * @param y 起点y左边
     * @param width 剪切宽度
     * @param height 剪切高度
     * @return 目标路径
     * @throws IOException if sourcePath image doesn't exist
     */
    public void cutImage(String sourcePath,String targetPath,int x,int y,int width,int height) throws IOException{
        File imageFile = new File(sourcePath);
        if(!imageFile.exists()){
            throw new IOException("Not found the images:"+sourcePath);
        }
        if(targetPath==null || targetPath.isEmpty()) targetPath = sourcePath;
//        String format = sourcePath.substring(sourcePath.lastIndexOf(".")+1,sourcePath.length());
        BufferedImage image = ImageIO.read(imageFile);
        image = image.getSubimage(x, y, width, height);

        //二值化
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
        ColorConvertOp op = new ColorConvertOp(cs, null);
        image = op.filter(image, null);

        int tmpWidth = 28;
        int tmpHeight = 28;
        if (height > width){
            tmpWidth = 28*width/height;
        }
        else if (height < width){
            tmpHeight = 28*height/width;
        }
        //压缩
        image = zoom(image,tmpWidth,tmpHeight);
        ImageIO.write(image, "png", new File(targetPath));
    }

    /**
     * 压缩图片
     * @param sourceImage    待压缩图片
     * @param width          压缩图片高度
     * @param height          压缩图片宽度
     */
    private static BufferedImage zoom(BufferedImage sourceImage , int width , int height){
        BufferedImage zoomImage = new BufferedImage(width, height, sourceImage.getType());
        Image image = sourceImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        Graphics gc = zoomImage.getGraphics();
        gc.setColor(Color.WHITE);
        gc.drawImage( image , 0, 0, null);
        return zoomImage;
    }

}
