package Exercicio1;
import static java.lang.System.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copier {

	public static void main(String[] args) throws IOException{

		if(args.length !=2){
			out.println("Uso: Copier <arq1> <arq2>");
			exit(1);
		}
		copyBytes(args[0],args[1]);

	}

	public static void copyBytes(String arq1, String arq2)throws IOException{
		
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try{
			fin = new FileInputStream(arq1);
			fout = new FileOutputStream(arq2);
			for (int c = fin.read(); c != -1; c=fin.read()) {
				fout.write(c);
			}

		}catch(IOException ioe){ 
			die(ioe);
		}finally{
			if(fin != null){
				fin.close();
			}if(fout != null){
				fout.close();				
			}
			
		}
		
	}
	
	public static void die(Exception e){
		err.print(e.getMessage());
		e.printStackTrace(err);
		
	}
}
