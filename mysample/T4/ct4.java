import java.io.*;
import java.net.*;

class ct4{
	public static void main(String[] args) throws Exception{
		cct4 c4 = new cct4();
		c4.ccct4();
	}
}

class cct4{
	public void ccct4() throws Exception{

		while(true){
			Socket s = new Socket("192.168.11.114",1999);

			// InputStream is = s.getInputStream();
			// InputStreamReader iis = new InputStreamReader(is);
			// BufferedReader iiis = new BufferedReader(iis);
			BufferedReader iiis = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// OutputStream out = System.out;
			// OutputStreamWriter oout = new OutputStreamWriter(out);
			// BufferedWriter ooout = new BufferedWriter(oout);
			BufferedWriter ooout = new BufferedWriter(new OutputStreamWriter(System.out));

			System.out.println("sss");
			String temp = iiis.readLine();
			ooout.write(temp);
			ooout.newLine();
			ooout.flush();
			s.close();
			System.out.println("s.close()");
		}

	}
}
