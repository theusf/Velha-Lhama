class AnalistaSituacional
{
    private Tabuleiro tabDoJogo;

    public AnalistaSituacional (Tabuleiro tab) throws Exception
    {

        if ( tab != null )
        {
			this.tabDoJogo = tab;
		}
		else
			throw new Exception ("Tabuleiro Nulo") ;

        // inicia tabDoJogo com tab; lanca excecao caso tab seja nulo
    }

    public Marca getMarcaDoVencedor ()
    {
		Marca ret = null;
        // retorna a marca do vencedor ou null se nao houver vencedor

       for (int i = 1;i<=3;i++) {

      try {
	   		  if ( ( tabDoJogo.getMarcaNaPosicao(i,1) == tabDoJogo.getMarcaNaPosicao(i,2) ) && ( tabDoJogo.getMarcaNaPosicao(i,2) == tabDoJogo.getMarcaNaPosicao(i,3) ) )
        	ret = tabDoJogo.getMarcaNaPosicao(i,2);
		} catch (Exception erro) {}

       try {
		  if ( ( tabDoJogo.getMarcaNaPosicao(1,i) == tabDoJogo.getMarcaNaPosicao(2,i) ) && ( tabDoJogo.getMarcaNaPosicao(2,i) == tabDoJogo.getMarcaNaPosicao(3,i) ) )
			ret = tabDoJogo.getMarcaNaPosicao(2,i);
		} catch (Exception erro) {}

		}

		try {
		if ( ( tabDoJogo.getMarcaNaPosicao(1,1) == tabDoJogo.getMarcaNaPosicao(2,2) ) && ( tabDoJogo.getMarcaNaPosicao(2,2) == tabDoJogo.getMarcaNaPosicao(3,3) ) )
					ret = tabDoJogo.getMarcaNaPosicao(2,2);
		} catch (Exception erro) {}

		try {
				if ( ( tabDoJogo.getMarcaNaPosicao(1,3) == tabDoJogo.getMarcaNaPosicao(2,2) ) && ( tabDoJogo.getMarcaNaPosicao(2,2) == tabDoJogo.getMarcaNaPosicao(3,1) ) )
							ret = tabDoJogo.getMarcaNaPosicao(2,2);
		} catch (Exception erro) {}


		return ret;

    }

    private boolean tabuleiroCheio ()
    {


        for (int i = 1;i<=3;i++) {
			for (int j=1;j<=3;j++) {

			try {

			if ( !(tabDoJogo.haMarcaNaPosicao(i,j))  )
					return false;

				} catch (Exception erro) {}

		}}

		return true;
        // verifica se o tabuleiro esta totalmente preenchido com marcas
    }

    public boolean fimDeJogo ()
    {

        if ( this.getMarcaDoVencedor() != null || this.tabuleiroCheio() )
        	return true;
        else
        	return false;


        // verifica se o jogo acabou, retornando true se sim ou false se nao
    }

    public String toString ()
    {
        return "ANALISTA";
    }

    public boolean equals (Object obj)
    {

        boolean ret = false;

		if (this==obj) // vendo se this e obj representam a mesma intancia
			ret = true;

		if (obj==null) // tenho certeza de que this!=null
			ret = false;

		//if (this.getClass()==obj.getClass())
		if (!(obj instanceof AnalistaSituacional))
			ret = false;


		AnalistaSituacional anal = (AnalistaSituacional)obj; // convencendo Java de que obj é um ANALISTA



		if ( this.getMarcaDoVencedor() ==	anal.getMarcaDoVencedor() )
			ret = true;

		/*if ( this.tabDoJogo == anal.tabDoJogo )
			ret = true;*/


						        // verifica se this é igual a obj, retornando true em caso afirmativo,
						        // ou false em caso negativo
		return ret;



        // verifica se this é igual a obj, retornando true em caso afirmativo,
        // ou false em caso negativo
    }

    public int hashCode ()
    {

		int ret = 666;

			ret = ret * 7 + new Integer ( (this.tabDoJogo).hashCode() );
			ret = ret * 7 + new Integer ( (getMarcaDoVencedor()).hashCode() );

		return ret;

        // retorna o hashcode do analista situacional
    }
}