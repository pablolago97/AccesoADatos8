
package textodelimitado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Textodelimitado {


    public static void main(String[] args) throws IOException {
        //Variables
        String[]cod={"p1","p2","p3"};
        String[]desc={"parafusos","cravos","tachas"};
        Double[]prezo={3.0,4.0,5.0};
        
        File file = new File("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/textodelimitado/file.txt");
        PrintWriter writer = new PrintWriter(new BufferedWriter( new FileWriter(file)));
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        for(int i = 0;i<2;i++){
        writer.println(cod[i]+"\t");
        writer.println(desc[i]+"\t");
        writer.println(prezo[i]);
        }
        
        writer.close();
        
        String cod1 = reader.readLine() ;
        String desc1 =reader.readLine() ;
        Double prezo1 = Double.parseDouble(reader.readLine());
        
        Product obx = new Product(cod1,desc1,prezo1);
        System.out.println(obx.toString());
        
    }
    
}
