public class Tabuleiro
{
    private Marca[][] matriz = new Marca [4][4];

    public boolean haMarcaNaPosicao (int lin, int col) throws Exception
    {

        if ( ( lin > 3 || lin < 1 ) || ( col > 3 || col < 1 ) )
        	throw new Exception("Parametros inválidos");
        else
        {
        	if ( matriz[lin][col] != null )
        		return true;
       		else
        		return false;
		}

        // verifica se ha marca na posicao indicada por seus parametros, retornando
        // true em caso afirmativo, ou false em caso negativo; lanca excecao se seus
        // parametros forem invalidos
    }

    public Marca getMarcaNaPosicao (int lin, int col) throws Exception
    {

       	if (( lin < 4 && lin > 0 ) || ( col < 4 && col > 0 ) )
       		if ( matriz[lin][col] != null )
       			return matriz[lin][col];
       	else
       		throw new Exception("Parametros invalidos");

       	return null;
       	// resulta a marca que ha na posicao indicada por seus parametros, retornando-a;
        // retorna null, caso ali nao haja nenhuma marca; lanca excecao se seus
        // parametros forem invalidos
    }

    public void setMarcaNaPosicao (Marca mrc, int lin, int col) throws Exception
    {
       if ( ( lin > 3 || lin < 1 ) || ( col > 3 || col < 1 ) || ( mrc == null ) )
        	throw new Exception("Parametros inválidos");
       else
        	this.matriz[lin][col] = mrc;

        // coloca mrc na posicao indicada por seus parametros; lanca excecao se seus
        // parametros forem invalidos
    }

    public String toString ()
    {
        String ret = "";

		int i = 1;
        for (i = 1;i<=3;i++) {
			ret += "_______________\n";
			for (int j=1;j<=3;j++) {

			if (matriz[i][j] != null) { ret += "| " +  this.matriz[i][j]; ret += " |";}
			if (matriz [i][j] == null) { ret+= "|   |"; }
			if (j == 3) {ret+="\n";}

		}


		}


		ret += "_______________\n";

        return ret;

        // retorna o tabuleiro em um String, devidamente formatado para apresentacao
    }



    public boolean equals (Object obj)
    {
        boolean ret = false;

		        if (this==obj) // vendo se this e obj representam a mesma intancia
				ret = true;

				if (obj==null) // tenho certeza de que this!=null
				ret = false;

				      //if (this.getClass()==obj.getClass())
				        if (!(obj instanceof Tabuleiro))
				            ret = false;


				Tabuleiro tab = (Tabuleiro)obj; // convencendo Java de que obj é um Deposito e dando a ele um nome de Deposito (que é dep)


		       for (int i = 1;i<=3;i++)
					for (int j=1;j<=3;j++) {

						if ( this.matriz[i][j] == tab.matriz[i][j] )
						ret = true; }




		        // verifica se this é igual a obj, retornando true em caso afirmativo,
		        // ou false em caso negativo
		return ret;
    }

    public int hashCode ()
    {
          		int ret = 666;

		        for (int i = 1;i<=3;i++)
					for (int j=1;j<=3;j++)
						if ( this.matriz[i][j] != null )
						ret = ret * 7 + new Integer (this.matriz[i][j].getSimbolo()).hashCode();



		        return ret;

    }
}