public class Marca
{
    private char simbolo;

    public Marca (char smb) throws Exception
    {

        if (  ( smb == 'X')  ||  (smb == 'O')   )
        	this.simbolo = smb;
        else
        	throw new Exception ("Simbolo invalido");
         //verifica se smb é um simbolo valido (X ou O), iniciando simbolo com smb
        // em caso afirmativo, ou lancando excecao, caso contrario
    }

    public char getSimbolo()
    {
        return this.simbolo;
        // retorna o simbolo associado a marca (X ou O)
    }

    public String toString()
    {
        String ret = "";
        ret += this.getSimbolo();
        return ret;
    }

    public boolean equals (Object obj)
    {

        boolean ret = false;

        if (this==obj) // vendo se this e obj representam a mesma intancia
		ret = true;

		if (obj==null) // tenho certeza de que this!=null
		ret = false;

		      //if (this.getClass()==obj.getClass())
		        if (!(obj instanceof Marca))
		            ret = false;


		Marca mrc = (Marca)obj; // convencendo Java de que obj é um Deposito e dando a ele um nome de Deposito (que é dep)


        if ( this.getSimbolo() == mrc.getSimbolo() )
        ret = true;

        // verifica se this é igual a obj, retornando true em caso afirmativo,
        // ou false em caso negativo
		return ret;
    }

    public int hashCode ()
    {

        int ret = 666;
        ret = ret * 7 + new Integer  (this.simbolo).hashCode();
        return ret;

    }
}