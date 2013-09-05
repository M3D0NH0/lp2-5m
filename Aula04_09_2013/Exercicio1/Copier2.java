package Exercicio1;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Copier2 {

	public static void main(String[] args) throws IOException {
		if(args.length != 2){
			out.println("Uso: Copier <arq1> <arq2>");
			exit(1);

		}
		copyBytes(args[0], args[1]);
		copyChars(args[0], args[1]);
		copyLines(args[0], args[1]);


	}

	private static void copyLines(String arq1, String arq2)throws IOException {
		BufferedReader bufIn=null;
		PrintWriter prnOut=null;
		try{
			bufIn = new BufferedReader(new FileReader(arq1));
			prnOut = new PrintWriter(new FileWriter(arq2));
			String linha = bufIn.readLine();
			while(linha != null){
				prnOut.println(linha);
				linha=bufIn.readLine();	
			}
		}catch(IOException ioe){ 
			die(ioe);
		}finally{
			if(bufIn != null){
				bufIn.close();
			}if(prnOut != null){
				prnOut.close();				
			}
		}



	}

	private static void copyChars(String arq1, String arq2)throws IOException {
		FileReader fin=null;
		FileWriter fout=null;
		try{
			fin=new FileReader(arq1);
			fout=new FileWriter(arq2);
			for(int c=fin.read();c!=-1;c=fin.read()){
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

	private static void copyBytes(String arq1, String arq2)throws IOException {
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
