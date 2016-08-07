import java.io.*;
import java.net.*;

class t4{
	public static void main(String[] args) throws Exception{
		key k = new key();
		k.in();
	}
}


class key{
	public void in() throws Exception{
		System.out.println("start");

		ServerSocket s = new ServerSocket(1999);

		while(true){
			Socket ss = s.accept();			
			// OutputStream snet = ss.getOutputStream();
			// OutputStreamWriter ssent = new OutputStreamWriter(snet);
			// BufferedWriter sssent =new BufferedWriter(ssent);
			BufferedWriter sssent = new BufferedWriter(new OutputStreamWriter(ss.getOutputStream()));


			// InputStream key = System.in;
			// InputStreamReader kkey = new InputStreamReader(key);
			// BufferedReader kkkey = new BufferedReader(kkey);
			BufferedReader kkkey = new BufferedReader(new InputStreamReader(System.in));

			// OutputStream out = System.out;
			// OutputStreamWriter oout = new OutputStreamWriter(out);
			// BufferedReader oooout = new BufferedReader(oout);
			BufferedWriter oooout = new BufferedWriter(new OutputStreamWriter(System.out));

			String temp = kkkey.readLine();
			sssent.write(temp);
			sssent.newLine();
			sssent.flush();
			oooout.flush();
		}
	}
}
