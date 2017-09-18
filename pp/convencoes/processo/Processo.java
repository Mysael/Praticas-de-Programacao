package pp.convencoes.processo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Processo 
{	
	public static void CriarProcesso(String CMD) 
	{	Process novo = null;
		BufferedReader Buffer;
		String entrada;
		try 
		{	novo = Runtime.getRuntime().exec(CMD);
			Buffer = new BufferedReader(new InputStreamReader(novo.getInputStream()));
			novo.waitFor();
			entrada = Buffer.readLine();
			while(entrada!=null)
			{	System.out.println(entrada);
				entrada = Buffer.readLine();
			}
			Buffer=null;
			novo.destroy();
			System.gc();
		} catch (Exception expection) 
		{	System.out.println("Erro na execucao do comando");
			System.exit(3);
		}
	}
}