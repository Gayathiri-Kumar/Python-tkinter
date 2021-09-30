import java.net.*;
import java.io.*;
public class client
{
public static void main(String[] args) throws Exception
{
Socket sk = new Socket("192.168.43.31",2000);
BufferedReader sin= new BufferedReader(new InputStreamReader(sk.getInputStream()));
PrintStream sout= new PrintStream(sk.getOutputStream());
BufferedReader stdin= new BufferedReader(new InputStreamReader(System. in));
String s;
while (true)
{
System.out.println("client:");
s=stdin.readLine();
sout.println(s);
s=sin.readLine();
System.out.println("server:"+s+"\n");
if(s.equalsIgnoreCase("BYE"))
break;
}
sk.close();
sin.close();
sout.close();
stdin.close();
}
}
