class JogadorAutomatico
{
    private Marca marca = null;
    private Tabuleiro tabDoJogo;

    public JogadorAutomatico (Tabuleiro tab) throws Exception
    {


        if ( tab != null )
		{
		this.tabDoJogo = tab;



						if ( ( (int)(Math.random()*2) == 0 ) )
						{
						this.marca = new Marca('O');
						}
						else
						{
						this.marca = new Marca('X');
						}




		}
		else
			throw new Exception ("Tabuleiro não pode ser nulo");

        // inicia tabDoJogo com tab e sorteia uma marca (X ou O) para o jogador,
        // iniciando marca; lanca excecao caso tab seja nulo
    }

    public JogadorAutomatico (Tabuleiro tab, Marca mrc) throws Exception
    {

        if ( ( tab != null ) || ( mrc != null ) )
					{
					this.tabDoJogo = tab;
					this.marca = mrc;
					}
				else
			throw new Exception ("Tabuleiro ou Marca não pode ser nulo");

        // inicia tabDoJogo com tab e marca com mrc; lanca excecao caso tab ou mrc sejam nulos
    }

    public Marca getMarca ()
    {
        Marca ret = this.marca;
        return ret;
        // retorna a marca do jogador
    }

    public String facaSuaJogada ()
    {

		boolean Jogada = true;

 try {

       for (int i = 1;i<=3;i++) {
			for (int j=1;j<=3;j++) { //FOR J

				// DIAGONAL

				if ( ( tabDoJogo.haMarcaNaPosicao(1,1) && tabDoJogo.getMarcaNaPosicao(1,1) != this.marca ) &&
							( tabDoJogo.haMarcaNaPosicao(3,3) &&  tabDoJogo.getMarcaNaPosicao(3,3) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(2,2)) && Jogada )
								{ System.out.println("diagonal");
						Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,2,2); return "2,2";  }

				if ( ( tabDoJogo.haMarcaNaPosicao(3,3) && tabDoJogo.getMarcaNaPosicao(3,3) != this.marca ) &&
									( tabDoJogo.haMarcaNaPosicao(1,1) &&  tabDoJogo.getMarcaNaPosicao(1,1) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(2,2)) && Jogada )
										{ System.out.println("diagonal");
						Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,2,2); return "2,2"; }



				if ( ( tabDoJogo.haMarcaNaPosicao(1,3) && tabDoJogo.getMarcaNaPosicao(1,3) != this.marca ) &&
							( tabDoJogo.haMarcaNaPosicao(3,1) &&  tabDoJogo.getMarcaNaPosicao(3,1) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(2,2)) && Jogada )
								{ System.out.println("diagonal");
						Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,2,2); return "2,2";  }

				if ( ( tabDoJogo.haMarcaNaPosicao(3,1) && tabDoJogo.getMarcaNaPosicao(3,1) != this.marca ) &&
									( tabDoJogo.haMarcaNaPosicao(1,3) &&  tabDoJogo.getMarcaNaPosicao(1,3) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(2,2)) && Jogada )
										{ System.out.println("diagonal");
						Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,2,2);   return "2,2"; }
				
				if ( ( tabDoJogo.haMarcaNaPosicao(3,1) && tabDoJogo.getMarcaNaPosicao(3,1) != this.marca ) &&
						( tabDoJogo.haMarcaNaPosicao(2,2) &&  tabDoJogo.getMarcaNaPosicao(2,2) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(1,3)) && Jogada )
							{ System.out.println("diagonal");
			      Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,1,3);   return "1,3"; }
				
				if ( ( tabDoJogo.haMarcaNaPosicao(1,3) && tabDoJogo.getMarcaNaPosicao(1,3) != this.marca ) &&
						( tabDoJogo.haMarcaNaPosicao(2,2) &&  tabDoJogo.getMarcaNaPosicao(2,2) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(3,1)) && Jogada )
							{ System.out.println("diagonal");
			     Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,3,1);   return "3,1"; }
				
				if ( ( tabDoJogo.haMarcaNaPosicao(3,3) && tabDoJogo.getMarcaNaPosicao(3,3) != this.marca ) &&
						( tabDoJogo.haMarcaNaPosicao(2,2) &&  tabDoJogo.getMarcaNaPosicao(2,2) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(1,1)) && Jogada )
							{ System.out.println("diagonal");
			      Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,1,1);   return "1,1"; }
				
				if ( ( tabDoJogo.haMarcaNaPosicao(1,1) && tabDoJogo.getMarcaNaPosicao(1,1) != this.marca ) &&
						( tabDoJogo.haMarcaNaPosicao(2,2) &&  tabDoJogo.getMarcaNaPosicao(2,2) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(3,3)) && Jogada )
							{ System.out.println("diagonal");
			     Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,3,3);   return "3,3"; }
		
				
				
				
		// HORIZONTAL

		if ( ( tabDoJogo.haMarcaNaPosicao(j,1) && tabDoJogo.getMarcaNaPosicao(j,1) != this.marca ) &&
			( tabDoJogo.haMarcaNaPosicao(j,3) &&  tabDoJogo.getMarcaNaPosicao(j,3) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(j,2)) && Jogada )
				{ System.out.println("horizontal");
				Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,j,2);  return  j + ",2"; }

		if ( ( tabDoJogo.haMarcaNaPosicao(j,1) && tabDoJogo.getMarcaNaPosicao(j,1) != this.marca ) &&
					( tabDoJogo.haMarcaNaPosicao(j,2) &&  tabDoJogo.getMarcaNaPosicao(j,2) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(j,3)) && Jogada )
						{ System.out.println("horizontal");
				Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,j,3); return j + ",3"; }

		if ( ( tabDoJogo.haMarcaNaPosicao(j,3) && tabDoJogo.getMarcaNaPosicao(j,3) != this.marca ) &&
							( tabDoJogo.haMarcaNaPosicao(j,2) &&  tabDoJogo.getMarcaNaPosicao(j,2) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(j,1)) && Jogada )
								{ System.out.println("horizontal");
			Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,j,1);  return "" + j + ",1"; }



		 // VERTICAL

		if ( ( tabDoJogo.haMarcaNaPosicao(1,j) && tabDoJogo.getMarcaNaPosicao(1,j) != this.marca ) &&
		( tabDoJogo.haMarcaNaPosicao(3,j) &&  tabDoJogo.getMarcaNaPosicao(3,j) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(2,j)) && Jogada )
			{ System.out.println("entrei la");
			Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,2,j); return  "2," + j + ""; }

		if ( ( tabDoJogo.haMarcaNaPosicao(1,j) && tabDoJogo.getMarcaNaPosicao(1,j) != this.marca ) &&
				( tabDoJogo.haMarcaNaPosicao(2,j) &&  tabDoJogo.getMarcaNaPosicao(2,j) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(3,j)) && Jogada )
					{ System.out.println("entrei la");
			Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,3,j); return  "3," + j + "";  }

		if ( ( tabDoJogo.haMarcaNaPosicao(3,j) && tabDoJogo.getMarcaNaPosicao(3,j) != this.marca ) &&
						( tabDoJogo.haMarcaNaPosicao(2,j) &&  tabDoJogo.getMarcaNaPosicao(2,j) != this.marca ) && !(tabDoJogo.haMarcaNaPosicao(1,j)) && Jogada )
							{ System.out.println("entrei la");
			Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,1,j);  return  "1," + j + ""; }

		// AGORA PARA MIM GANHAR


		if ( ( tabDoJogo.haMarcaNaPosicao(1,j) && tabDoJogo.getMarcaNaPosicao(1,j) == this.marca ) &&
		( tabDoJogo.haMarcaNaPosicao(3,j) &&  tabDoJogo.getMarcaNaPosicao(3,j) == this.marca ) && !(tabDoJogo.haMarcaNaPosicao(2,j)) && Jogada )
			{ System.out.println("entrei la");
			Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,2,j);  return  "2," + j + "";  }

		if ( ( tabDoJogo.haMarcaNaPosicao(1,j) && tabDoJogo.getMarcaNaPosicao(1,j) == this.marca ) &&
				( tabDoJogo.haMarcaNaPosicao(2,j) &&  tabDoJogo.getMarcaNaPosicao(2,j) == this.marca ) && !(tabDoJogo.haMarcaNaPosicao(3,j)) && Jogada )
					{ System.out.println("entrei la");
			Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,3,j);  return  "3," + j + ""; }

		if ( ( tabDoJogo.haMarcaNaPosicao(3,j) && tabDoJogo.getMarcaNaPosicao(3,j) == this.marca ) &&
						( tabDoJogo.haMarcaNaPosicao(2,j) &&  tabDoJogo.getMarcaNaPosicao(2,j) == this.marca ) && !(tabDoJogo.haMarcaNaPosicao(1,j)) && Jogada )
							{ System.out.println("entrei la");
			Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,1,j);    return  "1," + j + ""; }

		// HORIZONTAL

				if ( ( tabDoJogo.haMarcaNaPosicao(j,1) && tabDoJogo.getMarcaNaPosicao(j,1) ==  this.marca ) &&
					( tabDoJogo.haMarcaNaPosicao(j,3) &&  tabDoJogo.getMarcaNaPosicao(j,3) ==  this.marca ) && !(tabDoJogo.haMarcaNaPosicao(j,2)) && Jogada )
						{ System.out.println("horizontal");
						Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,j,2); return "" + j + ",2";  }

				if ( ( tabDoJogo.haMarcaNaPosicao(j,1) && tabDoJogo.getMarcaNaPosicao(j,1) ==  this.marca ) &&
							( tabDoJogo.haMarcaNaPosicao(j,2) &&  tabDoJogo.getMarcaNaPosicao(j,2) ==  this.marca ) && !(tabDoJogo.haMarcaNaPosicao(j,3)) && Jogada )
								{ System.out.println("horizontal");
						Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,j,3); return "" + j + ",3"; }

				if ( ( tabDoJogo.haMarcaNaPosicao(j,3) && tabDoJogo.getMarcaNaPosicao(j,3) ==  this.marca ) &&
									( tabDoJogo.haMarcaNaPosicao(j,2) &&  tabDoJogo.getMarcaNaPosicao(j,2) ==  this.marca ) && !(tabDoJogo.haMarcaNaPosicao(j,1)) && Jogada )
										{ System.out.println("horizontal");
			Jogada = false; tabDoJogo.setMarcaNaPosicao(this.marca,j,1); return "" + j + ",1"; }






					} //FOR J
					} //FOR I




		if ( Jogada ) {
							boolean Foi = false ;
							int a = 1		    ;
							int b = 1           ;

							do { a = (int) ( Math.random() * 3 + 1)  ;
								 b = (int) ( Math.random() * 3 + 1)  ;

								 if ( !(tabDoJogo.haMarcaNaPosicao(a,b)) )
								 {
								tabDoJogo.setMarcaNaPosicao(this.marca,a,b);
								 Foi = true; Jogada = false ;
								 return "" + a + "," + b + "";
								 }

								} while ( !(Foi) );
		}


	} catch (Exception erro) {}
        // faz o jogador fazer uma jogada INTELIGENTE
 		return "erro";
    }

    public String toString ()
    {
        return "Jogador Automatico";
    }

    public boolean equals (Object obj)
    {

         boolean ret = false;

			if (this==obj) // vendo se this e obj representam a mesma intancia
					ret = true;

			if (obj==null) // tenho certeza de que this!=null
					ret = false;

								      //if (this.getClass()==obj.getClass())
			if (!(obj instanceof JogadorAutomatico))
					ret = false;


			JogadorAutomatico jog = (JogadorAutomatico)obj; // convencendo Java de que obj é um Deposito e dando a ele um nome de Deposito (que é dep)



			if ( this.marca == jog.marca )
				ret = true;

			if ( this.tabDoJogo == jog.tabDoJogo )
				ret = true;

		return ret;
        // verifica se this é igual a obj, retornando true em caso afirmativo,
        // ou false em caso negativo
    }

    public int hashCode ()
    {
        // retorna o hashcode do jogador automatico
         int ret = 666;

					ret = ret * 7 + new Integer ( (this.tabDoJogo).hashCode() );
					ret = ret * 7 + new Integer ( (this.marca).hashCode() );

		  return ret;
    }
}